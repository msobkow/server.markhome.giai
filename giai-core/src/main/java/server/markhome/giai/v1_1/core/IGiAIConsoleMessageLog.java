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

import java.io.*;
import java.util.*;

/**
 *	The IGiAIConsoleMessageLog interface typicially is constructed over a message log instance, providing a console display of the log in question.  If the default constructor is used or a null log is specified, the system message log is used.
 *
 *	@since 2016
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIConsoleMessageLog extends IGiAIMessageLog {

	/**
	 *	The service singleton has to be thread-safe.
	 */
	@JSProperty
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance(null);

	/**
	 *	Get the service singleton.
	 *
	 *	@return The service singleton.
	 */
	@JSExport
	public static IGiAIConsoleMessageLog getService() {
		IGiAIConsoleMessageLog ref = ((IGiAIConsoleMessageLog)(singleton.get()));
		if (ref == null) {
			ref = new GiAIConsoleMessageLog();
			singleton.set(null, ref);
			ref = ((IGiAIConsoleMessageLog)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIConsoleMessageLog getInstance()
	 *		Get a default instance that provides the getInstance() and service method implementations.
	 *
	 *	@return IGiAIConsoleMessageLog A default instance.
	 */
	@JSExport
	public IGiAIConsoleMessageLog getInstance();

	/**
	 *	Get the current log indent level.
	 */
	public int getMessageLogIndent() {
		return(indent);
	}
	
	/**
	 *	Indent the logging messages another level
	 */
	public synchronized void dedent() {
		if(indent > 0) {
			indent --;
		}
		else {
			indent = 0;
		}
	}
	
	/**
	 *	Indent the logging messages another level
	 */
	public synchronized void indent() {
		indent ++;
	}

	/**
	 *	Get an PrintStream that wraps this log
	 */
	public PrintStream getPrintStream() {
		return(logFile);
	}
	
	/**
	 *	Log a message
	 *
	 *	@param		msg		String
	 */
	public synchronized void message(String msg) {

		if(msg == null) {
			return;
		}

		StringBuilder buff = new StringBuilder();

		Calendar cal = Calendar.getInstance();
		String stamp = String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL ", cal);
		buff.append(stamp);

		int			i;
		for(i = 0; i < indent; i ++) {
			buff.append("\t");
		}
		buff.append(msg);
		if(! msg.endsWith("\n")) {
			buff.append("\n");
		}

		boolean wroteSomewhere = false;

		if(logFile != null) {
			logFile.append(buff.toString());
			logFile.flush();
		}

		if(! wroteSomewhere) {
			System.out.append(buff.toString());
			System.out.flush();
		}
	}

//	OLD API's that need to go away

	/**
	 *	Open the specified file for logging
	 *
	 *	@param	fileName	The name of the file to open as a log.
	 */
	public void openLogFile(String fileName)
		throws FileNotFoundException
	{
		assert (fileName != null) && (fileName.length() > 0) : "File name must be specified";
		assert logFile == null : "Log file is already open";
		logFile = new PrintStream(fileName);
	}
	
	/**
	 *	Close the log file.
	 */
	public void closeLogFile() {
		if(logFile != null) {
			PrintStream old = logFile;
			logFile = null;
			
			old.flush();
			old.close();
		}
	}

}
