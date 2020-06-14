/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2017 Groupon, Inc
 * Copyright 2014-2017 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.tahseel;

import java.util.Hashtable;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

import org.killbill.billing.osgi.api.Healthcheck;
import org.killbill.billing.osgi.api.OSGIPluginProperties;
import org.killbill.billing.osgi.libs.killbill.KillbillActivatorBase;
import org.killbill.billing.payment.plugin.api.PaymentPluginApi;
import org.killbill.billing.plugin.api.notification.PluginConfigurationEventHandler;
import org.killbill.billing.plugin.core.config.PluginEnvironmentConfig;
import org.killbill.billing.plugin.core.resources.jooby.PluginApp;
import org.killbill.billing.plugin.core.resources.jooby.PluginAppBuilder;
import org.killbill.billing.plugin.tahseel.dao.TahseelDao;
import org.osgi.framework.BundleContext;

public class TahseelActivator extends KillbillActivatorBase {

    //
    // Ideally that string should match the pluginName on the filesystem, but there is no enforcement
    //
    public static final String PLUGIN_NAME = "tahseel-plugin";

    private TahseelConfigurationHandler tahseelConfigurationHandler;
   // private OSGIKillbillEventDispatcher.OSGIKillbillEventHandler killbillEventHandler;

    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        //final Clock clock = new DefaultClock();
        final TahseelDao tahseelDao = new TahseelDao(dataSource.getDataSource());

        final String region = PluginEnvironmentConfig.getRegion(configProperties.getProperties());

        // Register an event listener for plugin configuration (optional)
        tahseelConfigurationHandler = new TahseelConfigurationHandler(region, PLUGIN_NAME, killbillAPI, logService);
        final TahseelConfigProperties tahseelConfigProperties = tahseelConfigurationHandler.createConfigurable(configProperties.getProperties());
        tahseelConfigurationHandler.setDefaultConfigurable(tahseelConfigProperties);

        // Register an event listener (optional)
        //killbillEventHandler = new TahseelListener(killbillAPI);

        // As an example, this plugin registers a PaymentPluginApi (this could be changed to any other plugin api)
        final PaymentPluginApi paymentPluginApi = new TahseelPaymentPluginApi(tahseelConfigurationHandler,killbillAPI, configProperties,logService,  clock.getClock(),tahseelDao);
        registerPaymentPluginApi(context, paymentPluginApi);

        // Expose a healthcheck (optional), so other plugins can check on the plugin status
        final TahseelHealthcheck tahseelhealthcheck = new TahseelHealthcheck(tahseelConfigurationHandler);
        registerHealthcheck(context, tahseelhealthcheck);

        // Register a servlet (optional)
        final PluginApp pluginApp = new PluginAppBuilder(PLUGIN_NAME,
                                                         killbillAPI,
                                                         logService,
                                                         dataSource,
                                                         super.clock,
                                                         configProperties).withRouteClass(TahseelServlet.class)
                                                                          .withRouteClass(TahseelHealthcheckServlet.class)
                                                                          .withService(tahseelhealthcheck)
                                                                          .build();
        final HttpServlet tahseelservlet = PluginApp.createServlet(pluginApp);
        registerServlet(context, tahseelservlet);

        registerHandlers();
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        super.stop(context);
        // Do additional work on shutdown (optional)
    }

    private void registerHandlers() {
        final PluginConfigurationEventHandler configHandler = new PluginConfigurationEventHandler(tahseelConfigurationHandler);

        dispatcher.registerEventHandlers(configHandler);
    }

    private void registerServlet(final BundleContext context, final Servlet servlet) {
        final Hashtable<String, String> props = new Hashtable<String, String>();
        props.put(OSGIPluginProperties.PLUGIN_NAME_PROP, PLUGIN_NAME);
        registrar.registerService(context, Servlet.class, servlet, props);
    }

    private void registerPaymentPluginApi(final BundleContext context, final PaymentPluginApi api) {
        final Hashtable<String, String> props = new Hashtable<String, String>();
        props.put(OSGIPluginProperties.PLUGIN_NAME_PROP, PLUGIN_NAME);
        registrar.registerService(context, PaymentPluginApi.class, api, props);
    }

    private void registerHealthcheck(final BundleContext context, final Healthcheck healthcheck) {
        final Hashtable<String, String> props = new Hashtable<String, String>();
        props.put(OSGIPluginProperties.PLUGIN_NAME_PROP, PLUGIN_NAME);
        registrar.registerService(context, Healthcheck.class, healthcheck, props);
    }
}
