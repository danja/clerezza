/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.clerezza.rdf.core.sparql.update.impl;

import java.util.Set;
import org.apache.clerezza.rdf.core.UriRef;
import org.apache.clerezza.rdf.core.access.TcProvider;
import org.apache.clerezza.rdf.core.sparql.update.UpdateOperation;

/**
 *
 * @author hasan
 */
public class ClearOrDropOperation extends BaseUpdateOperation {
    private boolean silent;

    public ClearOrDropOperation() {
        this.silent = false;
        destinationGraphSpec = UpdateOperation.GraphSpec.DEFAULT;
    }

    public void setSilent(boolean silent) {
        this.silent = silent;
    }

    public boolean isSilent() {
        return silent;
    }

    public void setDestinationGraph(UriRef destination) {
        destinationGraphSpec = UpdateOperation.GraphSpec.GRAPH;
        destinationGraphs.clear();
        destinationGraphs.add(destination);
    }

    public UriRef getDestinationGraph(UriRef defaultGraph, TcProvider tcProvider) {
        Set<UriRef> result = getDestinationGraphs(defaultGraph, tcProvider);
        if (result.isEmpty()) {
            return null;
        } else {
            return result.iterator().next();
        }
    }
}
