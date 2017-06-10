/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package org.ow2.proactive.catalog.rest.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.slf4j.LoggerFactory;

import com.google.common.io.ByteStreams;


/**
 * @author ActiveEon Team
 */
public class IntegrationTestUtil {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(IntegrationTestUtil.class);

    public static byte[] getWorkflowAsByteArray(String filename) throws IOException {
        logger.debug("The file path of loading file: " + getWorkflowFile(filename).getPath());
        return ByteStreams.toByteArray(new FileInputStream(getWorkflowFile(filename)));
    }

    public static File getWorkflowFile(String filename) {
        return new File(IntegrationTestUtil.class.getResource("/workflows/" + filename).getFile());
    }

    public static File getArchiveFile(String filename) {
        return new File(IntegrationTestUtil.class.getResource("/archives/" + filename).getFile());
    }

}