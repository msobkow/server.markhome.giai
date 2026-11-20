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

import java.io.*;

/**
 *	The IGiAICachedMessageLog gets a copy of a message log with a cache between the log service and the application code.  If constructed with an IGiAIMessageLog argument, it is over the specified log. If by default constructor, it is for the system message log and output stream.
 *
 *	@since 2016
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAICachedMessageLog extends IGiAIMessageLog {

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
	public static IGiAICachedMessageLog getService() {
		IGiAICachedMessageLog ref = ((IGiAICachedMessageLog)(singleton.get()));
		if (ref == null) {
			ref = new GiAICachedMessageLog();
			singleton.set(null, ref);
			ref = ((IGiAICachedMessageLog)(singleton.get()));
		}
		return(ref);
	}

	private IGiAIMessageLog log = null;
	private StringBuilder cacheContents = new StringBuilder();
	private int indent = 0;
	
	/**
	 *	public IGiAICachedMessageLog getInstance()
	 *		@return default instance.
	 */
	@JSExport
	public IGiAICachedMessageLog getInstance() {
		return(new GiAICachedMessageLog());
	}

	/**
	 *	Get the log being cached.
	 *
	 *	@return The log being cached.
	 */
	@JSExport
	public IGiAIMessageLog getLog() {
		return(this.log.get());
	}

	/**
	 *	Set the log to be cached.
	 *
	 *	@param value The log to be cached.
	 *
	 *	@return The log now being cached.
	 */
	@JSExport
	public IGiAIMessageLog setLog(IGiAIMessageLog expected, IGiAIMessageLog value) {
		if(this.log.get() == expected) {
			this.log.get().set(expected,value);
		}
	}

	/**
	 *	Clear the log's cache.
	 */
	@JSExport
	public void clearCache() {
		IGiAIMessageLog lg = log.get();
		if(lg != null) {
			lg.getLog().setLength(0);
		}
	}

	/**
	 *	Get the contents of the cache.
	 *
	 *	@return String Contents of the cache.
	 */
	@JSExport
	public String getCacheContents() {
		return(this.cacheContents.toString());
	}

	/**
	 *	Get the message log indent level.
	 *
	 *	@return int The message log indent level.
	 */
	@JSExport
	public int getMessageLogIndent() {
		return(this.log.get().getMessageLogIndent());
	}

	/**
	 *	Set the message log indent level to the value specified.
	 *
	 *	@param value The message log indent level to set
	 *
	 *	@return The new message log indent level
	 */
	@JSExport
	public int setMessageLogIndent(int expected, int value) {
		this.log.get().getMessageLogIndent().set(expected, value);
		return(this.log.get().getMessageLogIndent());
	}

	/**
	 *	Reduce the message log indent level.
	 *
	 *	@return int The new message log indent level.
	 */
	@JSExport
	public int dedent() {
		int indent = this.indent.get();
		if(indent > 0) {
			indent --;
		}
		else {
			indent = 0;
		}
		this.indent.set(this.indent.get(), indent);
		return(this.indent.get());
	}

	/**
	 *	Increase the message log indent level.
	 *
	 *	@return int The new message log indent level.
	 */
	@JSExport
	public void indent() {
		int indent = this.indent.get();
		indent ++;
		this.indent.set(this.indent.get(), indent);
		return(this.indent.get());
	}

	/**
	 *	Log an abort, specifying the optional message and return value to be logged.
	 *
	 *	@param retval The optional value to be logged for return.
	 *	@param msg The optional message to be logged.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String abort(int retval, String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
			msg = "";
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append(String.format(IInz.x("abort"), (retval == null) ? "void" : retval, msg)); // "ABORT: returning retval - msg"
		this.cacheContents.get().append(msg);
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log a graceful exit, specifying an optional message and return value to be logged.
	 *
	 *	@param retval The optional value to be logged for return.
	 *	@param msg The optional message to be logged.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String exit(Integer retval, String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
			msg = "";
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append((msg == null || msg.isEmpty()) ? String.format(IInz.x("normalExit"), (retval == null) ? "void" : retval) : // "NORMAL EXIT: returning %1$d"
			String.format(IInz.x("normalExitWithMessage"), (retval == null) ? "void" : retval, msg)); // "NORMAL EXIT: returning %1$d - %2$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log a graceful exit, specifying an optional message to be logged and a return value of 0.
	 *
	 *	@param msg The optional message to be logged.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String exit(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
			msg = "";
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append((msg == null || msg.isEmpty()) ? String.format(IInz.x("normalExitZero")) : // "NORMAL EXIT: returning 0"
			String.format(IInz.x("normalExitZeroWithMessage"), msg)); // "NORMAL EXIT: returning 0 - %2$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log a graceful exit, specifying an optional message to be logged and a return value of -1.
	 *
	 *	@param msg The optional message to be logged.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String exitMinusOne(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
			msg = "";
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append((msg == null || msg.isEmpty()) ? String.format(IInz.x("normalExitMinusOne")) : // "NORMAL EXIT: returning -1"
			String.format(IInz.x("normalExitMinusOneWithMessage"), msg)); // "NORMAL EXIT: returning -1 - %2$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log a graceful exit, specifying an optional message to be logged and a return value of 1.
	 *
	 *	@param msg The optional message to be logged.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String exitPlusOne(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
			msg = "";
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append((msg == null || msg.isEmpty()) ? String.format(IInz.x("normalExitPlusOne")) : // "NORMAL EXIT: returning 1"
			String.format(IInz.x("normalExitPlusOneWithMessage"), msg)); // "NORMAL EXIT: returning 1 - %2$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log the specified message as an error.
	 *
	 *	@param msg The message to be logged as an error may be null, in which case nothing gets written as requested.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String error(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append(String.format(IInz.x("error"), msg)); // "ERROR: %1$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log the specified message as informational.
	 *
	 *	@param msg The message to be logged as null may be null, in which case nothing gets written as requested.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String info(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append(String.format(IInz.x("info"), msg)); // "INFO: %1$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log the specified message as fatal.
	 *
	 *	@param msg The message to be logged as fatal, may be null, in which case nothing gets written as requested.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String fatal(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append(String.format(IInz.x("fatal"), msg)); // "FATAL: %1$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log the specified message.
	 *
	 *	@param msg The message to be logged, may be null, in which case nothing gets written as requested.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String message(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append(msg);
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

	/**
	 *	Log the specified message as a warning.
	 *
	 *	@param msg The message to be logged as a warning, may be null, in which case nothing gets written as requested.
	 *
	 *	@return String The new contents of the cache.
	 */
	@JSExport
	public String warning(String msg) {
		if(msg == null || msg.isEmpty()) {
			return;
		}
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = ((this.cacheContents.get().length() <= 0) ? 1 : 0); i < this.indent; i ++) {
			sb.append("\t");
		}
		this.cacheContents.get().append(IInz.x("warning"), msg); // "WARN: %1$s"
		if(! msg.endsWith("\n")) {
			this.cacheContents.get().append("\n");
		}
		return(this.cacheContents.get());
	}

//	OLD API's that need to go away

	public PrintStream getPrintStream() {
		return(null);
	}

	public void openLogFile(String fileName)
		throws FileNotFoundException
	{
		// Do-nothing stub; cached message logs don't write to files
	}
	
	public void closeLogFile() {
		// Do-nothing stub; cached message logs don't write to files
	}
}
