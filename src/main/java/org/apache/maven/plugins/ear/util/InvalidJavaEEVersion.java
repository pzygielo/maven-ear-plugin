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
package org.apache.maven.plugins.ear.util;

import org.apache.maven.plugin.MojoExecutionException;

/**
 * @author Stephane Nicoll
 */
public class InvalidJavaEEVersion extends MojoExecutionException {

    /**
     *
     */
    private static final long serialVersionUID = 3189028517550801372L;

    /**
     * The invalid version
     */
    private final String invalidVersion;

    /**
     * @param message The message for the error
     * @param invalidVersion The invalid version.
     */
    public InvalidJavaEEVersion(String message, String invalidVersion) {
        super(message);
        this.invalidVersion = invalidVersion;
    }

    /**
     * @return The invalid version.
     */
    public String getInvalidVersion() {
        return invalidVersion;
    }
}
