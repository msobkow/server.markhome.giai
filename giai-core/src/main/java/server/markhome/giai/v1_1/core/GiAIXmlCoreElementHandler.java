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

import server.markhome.giai.IGiAIMessageLog;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *	An XML Core Element Handler is a named evaluator for the JAXP
 *	callback events <tt>beginElement()</tt> and <tt>endElement()</tt>.
 *	<p>
 *	Each element parse context has a map by QName, resolving to
 *	XmlCoreElementParser instances.
 */
public abstract class GiAIXmlCoreElementHandler {

	/**
	 *	The XML Core Parser which owns this Element Handler.
	 */
	private GiAIXmlCoreParser parser = null;

	/**
	 *	The Map by QName for resolving sub-element handlers.
	 */
	private Map<String,GiAIXmlCoreElementHandler> elementHandler = new HashMap<String,GiAIXmlCoreElementHandler>();

//	Constructors

	/**
	 *	Construct an XML Core Element Handler owned by the
	 *	specified parser.
	 *	<p>
	 *	The logger associated with the parser is used for
	 *	processing messages.
	 *
	 *	@param	coreParser	The parser which owns this instance.
	 */
	public GiAIXmlCoreElementHandler getInstance(GiAIXmlCoreParser coreParser) {
		assert coreParser != null : "coreParser (arg 1) is null";
		// Deprecated by Log4J 2 debugLogger.setLevel(Level.INFO);
		setParser(coreParser);
	}

//	Accessors: Logger
	
	/**
	 *	Get the Log4J Logger for processing messages.
	 *
	 *	@return	Logger
	 */
	public IGiAIMessageLog getLog() {
		GiAIXmlCoreContext context = (parser != null) ? parser.getCurContext() : null;
		IGiAIMessageLog retval = (context != null) ? context.getLog() : null;
		if(retval == null) {
			if(parser != null) {
				retval = parser.getLog();
			}
		}
		return(retval);
	}

//	Accessors: Parser

	/**
	 *	Get the XML Core Parser which owns this element handler.
	 *
	 *	@return	The XML Core Parser which owns this element handler.
	 */
	public GiAIXmlCoreParser getParser getInstance() {
		return(parser);
	}

	/**
	 *	Set the XML Core Parser which owns this element handler.
	 *
	 *	@param	coreParser	The parser which owns this instance.
	 */
	protected void setParser(GiAIXmlCoreParser coreParser) {
		assert coreParser != null : "coreParser (arg 1) is null";
		parser = coreParser;
	}

//	Accessors: ElementHandler

	/**
	 *	Add an element handler to be invoked when the named sub-element QName
	 *	is encountered.
	 *
	 *	@param	qName	The QName to map to the handler
	 *	@param	handler	The XmlCoreElementHandler to process the element events.
	 */
	public void addElementHandler(String qName, GiAIXmlCoreElementHandler handler) {
		assert qName != null && qName.length() > 0 : "qName (arg 1) is null or empty";
		assert handler != null : "handler (arg 2) is null";
		assert ! elementHandler.containsKey(qName) : "Duplicate qName=\"" + qName + "\" in elementHandler map";
		elementHandler.put(new String(qName), handler);
	}

	/**
	 *	Locate the named element handler.
	 *
	 *	@param	qName	The QName used to locate the handler.
	 *	@return	The XmlCoreElementHandler mapped to the specified name or null.
	 */
	public GiAIXmlCoreElementHandler getElementHandler getInstance(String qName) {
		GiAIXmlCoreElementHandler retval = (GiAIXmlCoreElementHandler)elementHandler.get(qName);
		return(retval);
	}

//	Element Event Handlers

	/**
	 *	Receive notification of the beginning of an element.
	 *	<p>
	 *	@see org.xml.sax.ContentHandler
	 *
	 *	@param	uri	the Namespace URI, or the empty string if the
	 *				element has no Namespace URI or if Namespace
	 *				processing is not being performed
	 *	@param	localName	the local name (without prefix), or the
	 *						empty string if Namespace processing
	 *						is not being performed
	 *	@param	qName	the qualified name (with prefix), or the
	 *					empty string if qualified names are not available
	 *	@param	attrs	the attributes attached to the element.  If
	 *					there are no attributes, it shall be an empty
	 *					Attributes object.  The value of this object after
	 *					startElement returns is undefined.
	 *
	 *	@throws	org.xml.sax.SAXException any SAX exception, possibly
	 *			wrapping another exception
	 */
	public abstract void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs)
	throws SAXException;


	/**
	 *	Receive notification of the end of an element.
	 *	<p>
	 *	@see org.xml.sax.ContentHandler
	 *
	 *	@param	uri	the Namespace URI, or the empty string if the
	 *				element has no Namespace URI or if Namespace
	 *				processing is not being performed
	 *	@param	localName	the local name (without prefix), or the
	 *						empty string if Namespace processing
	 *						is not being performed
	 *	@param	qName	the qualified name (with prefix), or the
	 *					empty string if qualified names are not available
	 *
	 *	@throws	org.xml.sax.SAXException any SAX exception, possibly
	 *			wrapping another exception
	 */
	public abstract void endElement(
		String	uri,
		String	localName,
		String	qName)
	throws SAXException;

}
