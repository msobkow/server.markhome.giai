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

import java.util.HashMap;
import java.util.Map;

import server.markhome.giai.IGiAIMessageLog;

/**
 *	An XML Core Context is a processing stack entry pushed
 *	at the start of each element or document and popped
 *	at the end of their processing.
 *
 *	@since 2016
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIXmlCoreContext extends IGiAIAnyObj {

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
	public static IGiAIXmlCoreContext getService() {
		IGiAIXmlCoreContext ref = ((IGiAIXmlCoreContext)(singleton.get()));
		if (ref == null) {
			ref = new GiAIXmlCoreContext();
			singleton.set(null, ref);
			ref = ((IGiAIXmlCoreContext)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	Copy and link an XML Core Context.
	 *	<p>
	 *	The specified source element becomes the PrevContext.
	 *
	 *	@param	src	The context to copy.
	 *	@param	qName	The QName of the element about to be processed.
	 *	@param	handler	The XmlCoreElementHandler which will be used for processing.
	 */
	@JSExport
	public IGiAIXmlCoreContext getInstance(
		IGiAIXmlCoreContext src,
		String qName,
		IGiAIXmlCoreElementHandler handler);

	/**
	 *	Construct a "root" XML Core Context instance.
	 *
	 *	@param	coreParser	The parser which owns this instance.
	 *	@param	jlog	Log4J log to use, if null, use parser's log.
	 *	@param	handler	The XmlCoreElementHandler which will be processing the doc root.
	 */
	@JSExport
	public IGiAIXmlCoreContext getInstance(
		IGiAIXmlCoreParser coreParser,
		IGiAIMessageLog jlog,
		IGiAIXmlCoreElementHandler elementHandler);

	/**
	 *	Get the previous context in the stack.
	 *
	 *	@return	The previous context or null if this is
	 *			the bottom of the stack.
	 */
	@JSExpot
	public IGiAIXmlCoreContext getPrevContext();

	/**
	 *	Is there a mapping for the named value slot?
	 *
	 *	@param	name	The name of the object
	 *
	 *	@return	True if there is a mapping for the name.
	 */
	@JSExport
	public boolean hasNamedValue(String key);

	/**
	 *	Get the object for the named value slot.
	 *
	 *	@param	name	The name of the object
	 *	@return	The object associated with the name or null.
	 */
	@JSExport
	public Object getNamedValue(String key);

	/**
	 *	Put a named value.
	 *
	 *	@param	name	The name of the object
	 *	@param	value	The object to store for the name
	 *
	 *	@return	The object previously associated with the name or null
	 */
	@JSExport
	public Object putNamedValue(String key, Object value);

	/**
	 *	Get the XML Core Parser which owns this element handler.
	 *
	 *	@return	The XML Core Parser which owns this element handler.
	 */
	@JSExport
	public IGiAIXmlCoreParser getParser();

	/**
	 *	Get the runtime processing log.
	 *
	 *	@return	Log4J log
	 */
	@JSExport
	public IGiAIMessageLog getLog();

	/**
	 *	Set the runtime processing log.
	 *
	 *	@param	jlog	The log to use for runtime processing messages
	 */
	@JSExport
	public void setLog(IGiAIMessageLog jlog);

	/**
	 *	Get the ElementText for the current context.
	 *
	 * 	@return	The element text collected so far.
	 */
	@JSExport
	public String getElementText();

	/**
	 *	Append a character segment to the element text.
	 */
	@JSExport
	public void appendElementText(char ch[], int start, int length);

	/**
	 *	Retrieve the element handler for this processing context.
	 *
	 *	@return	The element handler selected for processing the current element.
	 */
	@JSExport
	public IGiAIXmlCoreElementHandler getElementHandler();

	/**
	 *	Set the element handler and QName for this processing context.
	 *
	 *	@param	qName	The QName of the element or document being processed.
	 *	@param	handler	The XmlCoreElementHandler selected to process the element.
	 */
	@JSExport
	public void setQNameElementHandler(String qName, IGiAIXmlCoreElementHandler handler);
}
