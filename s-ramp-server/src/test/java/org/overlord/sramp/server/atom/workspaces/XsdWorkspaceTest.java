/*
 * Copyright 2011 JBoss Inc
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
package org.overlord.sramp.server.atom.workspaces;

import org.custommonkey.xmlunit.XMLAssert;
import org.jboss.resteasy.plugins.providers.atom.app.AppService;
import org.junit.Test;
import org.overlord.sramp.server.atom.workspaces.XsdWorkspace;

/**
 * Unit test for the XSD workspace.
 *
 * @author eric.wittmann@redhat.com
 */
public class XsdWorkspaceTest extends AbstractWorkspaceTest {

    /**
     * @throws Exception
     */
    @Test
    public void testWorkspace() throws Exception {
        AppService appService = new AppService();
        appService.getWorkspace().add(new XsdWorkspace("http://example.org")); //$NON-NLS-1$
        String actual = marshall(appService);
        String expected = getExpectedWorkspaceXML("xsd"); //$NON-NLS-1$

        XMLAssert.assertXMLEqual(expected, actual);
    }
}
