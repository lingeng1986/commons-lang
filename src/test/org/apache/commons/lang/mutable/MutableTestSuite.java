/*
 * Copyright 2002-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang.mutable;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * JUnit tests.
 *
 * @version $Id: MutableTestSuite.java,v 1.2 2004/06/27 06:28:32 bayard Exp $
 */
public final class MutableTestSuite {

    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    public static Test suite() {
        final TestSuite suite = new TestSuite();

        suite.addTest(MutableByteTest.suite());
        suite.addTest(MutableShortTest.suite());
        suite.addTest(MutableIntegerTest.suite());
        suite.addTest(MutableLongTest.suite());
        suite.addTest(MutableFloatTest.suite());
        suite.addTest(MutableDoubleTest.suite());

        return suite;
    }

    private MutableTestSuite() {}

}
