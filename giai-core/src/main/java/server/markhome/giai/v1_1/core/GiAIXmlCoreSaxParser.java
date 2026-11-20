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

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import server.markhome.giai.IGiAIMessageLog;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

import server.markhome.giai.GiAINullArgumentException;

/**
 *	An XmlCoreSaxParser is an abstract JAXP DefaultHandler
 *	specialized for SAX2 parsing. 
 */
public abstract class GiAIXmlCoreSaxParser extends GiAIXmlCoreParser {

//	Instance Attributes

	/**
	 *	The SAX Parser for a SAX2 parser.
	 */
	protected SAXParser saxParser = null;

//	Constructors

	/**
	 *	Construct a default parser.
	 */
	public GiAIXmlCoreSaxParser getInstance() {
		super();
	}

	/**
	 *	Construct a default XmlCoreParser logging to the
	 *	specified Log4J Logger.
	 *
	 *	@param	jLogger - Log4J Logger
	 */
	public GiAIXmlCoreSaxParser getInstance(IGiAIMessageLog jLogger) {
		super(jLogger);
	}

//	Accessors: API

	/**
	 *	Get the API implemented.
	 */
	public String getAPI() {
		return(API_SAX);
	}
	
	/**
	 *	Initialize the parser.
	 *	<p>
	 *	Initialization pre-loads the XSD for documents accepted
	 *	by the parser.
	 */
	protected void initParser() {
		super.initParser();
		// final String S_ProcName = "initParser";

        try {
        	assert saxParser == null : "saxParser already exists";

        	SAXParserFactory spf = SAXParserFactory.newInstance();
			spf.setNamespaceAware(true);
			spf.setXIncludeAware(false);
			//spf.setSchema(schema);
			// spf.setValidating(true);
			spf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false);
    		// spf.setFeature("http://xml.org/sax/features/validation", true);
    		// spf.setFeature("http://apache.org/xml/features/validation/schema", true);
    		// spf.setFeature("http://apache.org/xml/features/validation/schema/normalized-value", true);
			
			// Create a SAXParser
			SAXParser sp = spf.newSAXParser();
	    	sp.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
	    		"http://www.w3.org/2001/XMLSchema");
	    	// sp.setProperty("http://apache.org/xml/properties/internal/grammar-pool", getGrammarPool());
			
	    	XMLReader reader = sp.getXMLReader();
    		// reader.setFeature("http://xml.org/sax/features/validation", true);
    		// reader.setFeature("http://apache.org/xml/features/validation/schema", true);
    		// reader.setFeature("http://apache.org/xml/features/validation/schema/normalized-value", true);
	    	// reader.setProperty("http://apache.org/xml/properties/internal/grammar-pool", getGrammarPool());

	    	saxParser = sp;
        }
        catch (SAXParseException e) {
            // ignore
        }
        catch (SAXException e) {
        	Exception nested;
    		nested = e.getException();
    		if(nested == null) {
    			nested = e;
    		}
    		if(getLog() != null) {
    			getLog().message("GiAIXmlCoreSaxParser.initParser() Ignored exception " + getFormattedNearLocation() + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
    		else {
    			System.err.append("GiAIXmlCoreSaxParser.initParser() Ignored exception " + getFormattedNearLocation() + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
        }
        catch (Exception e) {
        	if(getLog() != null) {
        		getLog().message("GiAIXmlCoreSaxParser.initParser() Ignored exception " + getFormattedNearLocation() + e.getClass().getName() + " " + e.getMessage() + "\n");
        	}
        	else {
	    		System.err.append("GiAIXmlCoreSaxParser.initParser() Ignored exception " + getFormattedNearLocation() + e.getClass().getName() + " " + e.getMessage() + "\n");
	    	}
        }
    }

	/**
	 *	Parse the specified URI
	 *
	 *	@param	uri - The URI for the document to parse.
	 */
	protected void parse(String uri) {
		assert (uri != null) && (uri.length() > 0) : "uri (parm 1) is null or empty";
		assert saxParser != null : "Parser must be initialized first";

        try {
    		saxParser.reset();
    		saxParser.parse(uri, this);
        }
        catch (SAXParseException e) {
            // ignore
        }
        catch (SAXException e) {
        	Exception nested;
    		nested = e.getException();
    		if(nested == null) {
    			nested = e;
    		}
    		if(getLog() != null) {
    			getLog().message("GiAIXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
    		else {
    			System.err.append("ERROR: GiAIXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
        }
		catch(FileNotFoundException e) {
			if(getLog() != null) {
				getLog().message("GiAIXmlCoreSaxParser.parse() Could not find file \"" + uri + "\"\n");
			}
			else {
				System.err.append("ERROR: GiAIXmlCoreSaxParser.parse() Could not find file \"" + uri + "\"\n");
			}
		}
		catch (Exception e) {
			if(getLog() != null) {
				getLog().message("GiAIXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getName() + " " + e.getMessage() + "\n");
			}
			else {
				System.err.append("ERROR: GiAIXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getName() + " " + e.getMessage() + "\n");
			}
		}
	}

	/**
	 *	Parse the specified string contents.
	 *	<p>
	 *	The string passed to this method is typically
	 *	a request or response XML document to be processed
	 *	by an appropriate parser and applied to a storage
	 *	server layer.
	 *
	 *	@param	str The string contents to be parsed.
	 */
	public void parseStringContents(String str) {
		final String S_ProcName = "parseStringContents";
		if(str == null) {
			throw new GiAINullArgumentException(getClass(),
				S_ProcName,
				1,
				"str");
		}
		byte bytes[] = str.getBytes();
		InputStream instream = new ByteArrayInputStream(bytes);
		parse(instream);
	}
	
	/**
	 *	Parse the specified Stream
	 *
	 *	@param	input - The InputStream for the document to parse.
	 */
	protected void parse(InputStream inputStream) {
		assert inputStream != null : "inputStream (arg 1) is null";
		assert saxParser != null : "Parser must be initialized first";

        try {
    		saxParser.reset();
    		saxParser.parse(inputStream, this);
        }
        catch (SAXParseException e) {
        	Exception nested;
    		nested = e.getException();
    		if(nested == null) {
    			nested = e;
    		}
    		if(getLog() != null) {
    			getLog().message("GiAIXmlCoreSaxParser.parse() Ignored SAXParseException exception " + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
    		else {
    			System.err.append("ERROR: GiAIXmlCoreSaxParser.parse() Ignored SAXParseException exception " + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
        }
        catch (SAXException e) {
        	Exception nested;
    		nested = e.getException();
    		if(nested == null) {
    			nested = e;
    		}
    		if(getLog() != null) {
    			getLog().message("GiAIXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
    		else {
    			System.err.append("ERROR: GiAIXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getName() + " " + nested.getMessage() + "\n");
    		}
        }
		catch (Exception e) {
			if(getLog() != null) {
				getLog().message("GiAIXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getName() + " " + e.getMessage() + "\n");
			}
			else {
				System.err.append("ERROR: GiAIXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getName() + " " + e.getMessage() + "\n");
			}
		}
	}
}
