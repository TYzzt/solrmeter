/**
 * Copyright Plugtree LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.plugtree.solrmeter.mock;

import java.net.MalformedURLException;
import java.util.LinkedList;

import org.apache.solr.client.solrj.SolrClient;

import com.plugtree.solrmeter.model.OptimizeStatistic;
import com.plugtree.solrmeter.model.executor.OnDemandOptimizeExecutor;

public class OptimizeExecutorSpy extends OnDemandOptimizeExecutor {
	
	public OptimizeExecutorSpy() throws MalformedURLException {
		super(new SolrServerMock());
		optimizeObservers = new LinkedList<OptimizeStatistic>();
	}
	
	public SolrClient getServer() {
		return server;
	}
	public void setServer(SolrClient server) {
		this.server = server;
	}
	
	
}
