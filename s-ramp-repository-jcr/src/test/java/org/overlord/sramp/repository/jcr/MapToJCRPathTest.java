/*
 * Copyright 2013 JBoss Inc
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
package org.overlord.sramp.repository.jcr;

import javax.jcr.RepositoryException;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author eric.wittmann@redhat.com
 */
public class MapToJCRPathTest {

    /**
     * Test method for {@link org.overlord.sramp.repository.jcr.MapToJCRPath#getTrashPath(java.lang.String)}.
     * @throws RepositoryException
     */
    @Test
    public void testGetTrashPath() throws RepositoryException {
        String path = MapToJCRPath.getTrashPath("/s-ramp/artifacts/12/e5/12342873"); //$NON-NLS-1$
        Assert.assertEquals("/s-ramp-trash/artifacts/12/e5/12342873", path); //$NON-NLS-1$
    }

    /**
     * Test method for {@link org.overlord.sramp.repository.jcr.MapToJCRPath#getArtifactPath(java.lang.String)}.
     */
    @Test
    public void testGetArtifactPath() {
        String path = MapToJCRPath.getArtifactPath("0123456789"); //$NON-NLS-1$
        Assert.assertEquals("/s-ramp/artifacts/01/23/45/6789", path); //$NON-NLS-1$
        path = MapToJCRPath.getArtifactPath("abcdefghijklmnopqrstuvwxyz"); //$NON-NLS-1$
        Assert.assertEquals("/s-ramp/artifacts/ab/cd/ef/ghijklmnopqrstuvwxyz", path); //$NON-NLS-1$
        path = MapToJCRPath.getArtifactPath("12345"); //$NON-NLS-1$
        Assert.assertEquals("/s-ramp/artifacts/12/34/5", path); //$NON-NLS-1$
        path = MapToJCRPath.getArtifactPath("1"); //$NON-NLS-1$
        Assert.assertEquals("/s-ramp/artifacts/1", path); //$NON-NLS-1$
    }

    /**
     * Test method for {@link org.overlord.sramp.repository.jcr.MapToJCRPath#getOntologyPath(java.lang.String)}.
     */
    @Test
    public void testGetOntologyPath() {
        String path = MapToJCRPath.getOntologyPath("0123456789"); //$NON-NLS-1$
        Assert.assertEquals("/s-ramp/ontologies/0123456789", path); //$NON-NLS-1$
    }

    /**
     * Test method for {@link org.overlord.sramp.repository.jcr.MapToJCRPath#getStoredQueryPath(java.lang.String)}.
     */
    @Test
    public void testGetStoredQueryPath() {
        String path = MapToJCRPath.getStoredQueryPath("0123456789"); //$NON-NLS-1$
        Assert.assertEquals("/s-ramp/queries/0123456789", path); //$NON-NLS-1$
    }

}
