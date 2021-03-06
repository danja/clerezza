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
package org.apache.clerezza.uima.utils;

import java.util.Dictionary;
import java.util.Properties;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.junit.Before;
import org.junit.Test;
import org.osgi.service.component.ComponentContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Testcase for {@link AEProvider}
 */
public class AEProviderTest {

  private AEProvider aeProvider;

  @Before
  public void setUp() throws Exception {
    aeProvider = new AEProvider();
    ComponentContext componentContext = mock(ComponentContext.class);
    Dictionary dictionary = new Properties();
    when(componentContext.getProperties()).thenReturn(dictionary);
    aeProvider.activate(componentContext);
  }

  @Test
  public void testGetDefaultAENotNull() throws Exception {
    AnalysisEngine ae = this.aeProvider.getDefaultAE();
    assertNotNull(ae);
  }

  @Test
  public void testGetAEWithPathNotNull() throws Exception {
    AnalysisEngine ae = this.aeProvider.getAE("/META-INF/ExtServicesAE.xml");
    assertNotNull(ae);
  }

  @Test
  public void testGetAEWithWrongPath() {
    try {
      aeProvider.getAE("thisIsSomethingWeird");
      fail();
    } catch (Throwable e) {
    }
  }

}
