/*
 *	server.markhome.giai - Guided Intelligence Architecture Implementation v1.1 Core Services
 *	
 *	Copyright (c) 2016-2027 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *	
 *	The core foundation library CFLib is Licensed under the GNU Library General Public License, Version 3.0 or later; all other modules are Licensed under
 *	the GNU General Public License, Version 3.0 or later, or under a Commercial License purchased from Mark Stephen Sobkow by contacting him at mark.sobkow@gmail.com
 *	and negotiating terms to cover your legal requirements for your product and tool development plans, arrange payment using Canadian legal currency transfer
 *	facilities, and receive your customized Commercial License granting permission to extend and enhance the GNU GPL 3.0 or later licensed code base.
 *	
 *	In the event that you purchase a Commercial Development License, your License will be terminated if your organization distributes the application source
 *	code externally, allows external users to access the resulting applications, or the organization is rebranded, merged, or restructured, or if you violate
 *	International or Canadian Legal Restrictions on Software Development and Deployment.
 *	
 *	In the event that you purchase a Commercial Distribution License, your License will be terminated if your oganization is rebranded, merged, or restructured.
 *	
 *	In the event that you purchase a Transferrable Commercial License, your License is only terminated if your organization develops or produces illegal software
 *	tools and technologies according to International Treaty Law, or Laws of the Country of Canada, in accordance with the legal restrictions on Canadian Application
 *	Source Code Development, Deployment, and Distribution.
 *	
 *	Any one of these Licenses comprises your organization's "License". You may not use these files nor derive variations of them except in compliance with the
 *	License or Commercial License applicable to the source code files in question.
 *	
 *	Samples of the Commercial License permission grants are available at the following URL.  You should also have received samples of the commercial licenses with
 *	this module of application code or configuration and driver data.
 *	
 *		https://msobkow.github.io/mark-stephen-sobkows-licenses/
 *		file:sample-giai-v1_1-ethical-development-license.txt
 *		file:sample-giai-v1_1-ethical-deployment-license.txt
 *		file:sample-giai-v1_1-ethical-distribution-license.txt
 *		file:sample-giai-v1_1-transferrable-ethical-license.txt
 *	
 *	but do not actually grant any permissions to your organization as they have not yet been negotiated for, paid for, or delivered to your organization; they are
 *	only examples of what permissions the Commercial Licenses grant.
 *	
 *	You may obtain a copy of the Open Source Licenses supported at:
 *	
 *	    http://gnu.org/
 *	
 *	Unless required by applicable law or agreed to in writing, software distributed under the Licenses is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *	either express or implied, unless required by International Law and Treaty Agreements with Canada as a Signatory as interpreted by the International Criminal Court, the Canadian
 *	Constition, the Canadian Charter of Rights, or Canadian Federal Law as interpreted by our Supreme Court of Canada.  See the Licenses for the specific language governing permissions
 *	and limitations under the Licenses.
 *	
 *	If you wish to modify and use this code without publishing your changes, or integrate it with proprietary code, please contact Mark Stephen
 *	Sobkow for a commercial license at mark.sobkow@gmail.com.
 *	
 *	SPDX-License-Identifier: LGPL-3.0-or-later
 *	SPDX-License-Identifier: GPL-3.0-or-later
 */

package server.markhome.giai.v1_1.core;

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
