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

import javax.inject.Singleton;

import org.jooby.mvc.GET;
import org.jooby.mvc.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
@Path("/")
public class TahseelServlet {

    private static final Logger logger = LoggerFactory.getLogger(TahseelServlet.class);

    public TahseelServlet() {
    }

    @GET
    public void hello() {
        // Find me on http://127.0.0.1:8080/plugins/tahseel-plugin
        logger.info("Logging  from  Tahseel Plugin");
    }
}
