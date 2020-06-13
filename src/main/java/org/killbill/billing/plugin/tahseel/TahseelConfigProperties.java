/*
 * Copyright 2016 The Billing Project, LLC
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

import java.util.Properties;

public class TahseelConfigProperties {

    private static final String PROPERTY_PREFIX = "org.killbill.billing.plugin.tahseel.";
    private final String region;
    private final String scid;
    private final String serviceid;
    private final String funcid;

    public TahseelConfigProperties(final Properties properties,final String region) {
        this.scid = properties.getProperty(PROPERTY_PREFIX + "scid","API");
        this.serviceid = properties.getProperty(PROPERTY_PREFIX + "serviceid","BillManage");
        this.funcid = properties.getProperty(PROPERTY_PREFIX + "funcid","25000000");
        this.region=region;

    }



    public String getScId() {
        return scid;
    }

    public String getServiceId() {
        return serviceid;
    }

    public String getFuncId() {
        return funcid;
    }

}
