/**
 *	server.markhome.ycf-core - Mark's Code Fractal Core Services
 *
 *	Copyright 2026 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://apache.org
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	SPDX-License-Identifier: Apache-2.0
**/

package server.markhome.ycf;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import java.util.*;

import java.io.File;
import java.io.InputStream;

/**
 * An InzPathEntry can represent either a resource path, in which case it needs to specify a class for resource loading, and use a path
 * that starts with "resource:", or a file system path, in which case it accesses files directly from the file system.
 */
public final class InzPathEntry implements IInzPathEntry {

    private String path;
    private Class<?> clazz;

    /**
     * Constructs an InzPathEntry with the specified file system path.
     *
     * @param path the path for this entry
     */
    public InzPathEntry(String path) {
        this.path = path;
    }

    /**
     * Constructs an InzPathEntry with the specified class and file system path.
     *
     * @param clazz the class associated with this entry
     * @param path  the path for this entry
     */
    public InzPathEntry(Class<?> clazz, String path) {
        this.clazz = clazz;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    /**
     * Returns the resource associated with this path entry.
     * This method should be overridden by subclasses that represent resource paths.
     */
    public InputStream getInputStream(String resourceName) {
        if (resourceName == null || resourceName.isEmpty()) {
            return null;
        }
        if (path == null || path.isEmpty()) {
            throw new IllegalStateException("Path is not set for this InzPathEntry.");
        }

        if (path.startsWith("resource:")) {
            if (clazz != null) {
                InputStream input = clazz.getResourceAsStream(path.substring(9) + "/" + resourceName);
                if (input == null) {
                    throw new IllegalStateException("Resource not found: " + path);
                }
                return input;
            }
            else {
                throw new IllegalStateException("Class is not set for this resource-based InzPathEntry.");
            }
        }
        else {
            String fullName = path + File.separator + resourceName;
            File f = new File(fullName);
            if (!f.exists()) {
                return null;
            }
            if (!f.isFile()) {
                throw new IllegalStateException("Path does not point to a file: " + fullName);
            }
            if (!f.canRead()) {
                throw new IllegalStateException("Cannot read file: " + fullName);
            }
            try {
                return new java.io.FileInputStream(f);
            } catch (java.io.FileNotFoundException e) {
                throw new IllegalStateException("File not found: " + fullName, e);
            }
        }
    }
}
