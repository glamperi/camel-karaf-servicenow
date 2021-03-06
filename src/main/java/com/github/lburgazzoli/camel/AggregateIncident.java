/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.lburgazzoli.camel;

import java.util.List;

import com.github.lburgazzoli.camel.servicenow.model.ServiceNowIncident;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class AggregateIncident implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange exchange, Exchange data) {
        List<ServiceNowIncident> values = data.getIn().getBody(List.class);
        if (values.size() == 1) {
            exchange.getIn().setHeader("ServiceNowOldIncident", values.get(0));
            exchange.getIn().setHeader("ServiceNowSysId", values.get(0).getSysId());
        }

        return exchange;
    }
}
