/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.river.mongodb.simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@Test
public class RiverMongoDropCollectionDisabledTest extends RiverMongoDropCollectionTest {

    @Factory(dataProvider = "allMongoExecutableTypes")
    public RiverMongoDropCollectionDisabledTest(ExecutableType type) {
        super(type);
        dropCollectionOption = false;
    }

    @Override
    @BeforeClass
    public void createDatabase() {
        super.createDatabase();
    }

    @Override
    @AfterClass
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    @Test
    public void testDropCollection() throws Throwable {
        super.testDropCollection();
    }
}
