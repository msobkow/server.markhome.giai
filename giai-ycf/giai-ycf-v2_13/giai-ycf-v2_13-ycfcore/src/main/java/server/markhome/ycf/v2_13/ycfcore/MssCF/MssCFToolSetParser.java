/*
 *  MSS Code Factory YCFCore 2.13 MssYCF
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycfcore.MssYCF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

/**
 *	A ToolSetParser is a JAXP 1.3 Validating XML parser
 *	for documents conforming to the MSS Generator Knowledge Base
 *	ToolSet schema.
 *
 *	@see	http://generator.msobkow.com/xsd/genkb-1.0.6-toolset.
 */
public class MssYCFToolSetParser extends MssYCFSaxParser implements ContentHandler {

	/**
	 *	The namespace URI of the supported schema
	 */
	public final static String	SCHEMA_XMLNS = "https://msobkow.github.io/mssycf/2.0.13/ycfgenkb-2.13-toolset";

	/**
	 *	The source for loading the supported schema
	 */
	public final static String	SCHEMA_URI = "https://msobkow.github.io/mssycf/2.0.13/xsd/ycfgenkb-2.13-toolset.xsd";
	public final static String	SCHEMA_HTTPS_URI = "https://msobkow.github.io/mssycf/2.0.13/xsd/ycfgenkb-2.13-toolset.xsd";
	public final static String	SCHEMA_ROOT_URI = "/xsd/ycfgenkb-2.13-toolset.xsd";

	/**
	 *	The RuleSetParser is reused.
	 */
	private MssYCFRuleSetParser ruleSetParser = null;

	/**
	 *	The name of the ToolSet being processed.
	 */
	private String curToolSet = null;

//	Constructors

	/**
	 *	Construct a default XmlCoreParser logging to the
	 *	specified Log4J Logger.
	 *
	 *	@param	jLogger - Log4J Logger
	 */
	public MssYCFToolSetParser( MssYCFEngine engine, IYCFLibMessageLog jLogger ) {
		super( engine, jLogger );
		setRootElementHandler( new RootHandler( this ) );
		initParser();
		ruleSetParser = new MssYCFRuleSetParser( engine, jLogger );
	}

//	Accessors: CurToolSet

	/**
	 *	Get the current ToolSet name.
	 *
	 *	@return	The current ToolSet name.
	 */
	public String getCurToolSet() {
		return( curToolSet );
	}

	/**
	 *	Set the current ToolSet name.
	 *
	 *	@param	toolSet	The new current ToolSet name.
	 */
	protected void setCurToolSet( String toolSet ) {
		curToolSet = getInternalToolSetName( toolSet );
	}


	class RootHandler extends YCFLibXmlCoreElementHandler {

		/**
		 *	Construct an XML Core Element Handler owned by the
		 *	specified parser.
		 *	<p>
		 *	The logger associated with the parser is used for
		 *	processing messages.
		 *
		 *	@param	coreParser	The parser which owns this instance.
		 */
		public RootHandler( MssYCFToolSetParser coreParser ) {
			super( coreParser );
			addElementHandler( "ToolSet", new ToolSetHandler( coreParser ) );
		}

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
		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}


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
		public void endElement(
			String	uri,
			String	localName,
			String	qName)
		throws SAXException
		{
		}
	}


	class ToolSetHandler extends YCFLibXmlCoreElementHandler {

		/**
		 *	Construct an XML Core Element Handler owned by the
		 *	specified parser.
		 *	<p>
		 *	The logger associated with the parser is used for
		 *	processing messages.
		 *
		 *	@param	coreParser	The parser which owns this instance.
		 */
		public ToolSetHandler( MssYCFToolSetParser coreParser ) {
			super( coreParser );
			addElementHandler( "RuleSet", new RuleSetHandler( coreParser ) );
		}

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
		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
			String	attrName = null;
			String	attrRevision = null;
			String	attrDescr = null;

			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;

			assert qName.equals( "ToolSet" );

			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Name" ) ) {
					assert attrName == null : "Duplicate attribute \"Name\" detected";
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Revision" ) ) {
					assert attrRevision == null : "Duplicate attribute \"Revision\" detected";
					attrRevision = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Descr" ) ) {
					assert attrDescr == null : "Duplicate attribute \"Descr\" detected";
					attrDescr = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					assert false : "Unrecognized attribute \"" + attrLocalName + "\"";
				}
			}

			assert ( attrName != null ) && ( attrName.length() > 0 ) : "Missing attribute \"Name\"";
			assert ( attrRevision != null ) && ( attrRevision.length() > 0 ) : "Missing attribute \"Revision\"";
			assert ( attrDescr != null ) && ( attrDescr.length() > 0 ) : "Missing attribute \"Descr\"";

			getLog().message( "\tLoading ToolSet \"" + attrName
					+ "\", Revision = \"" + attrRevision
					+ "\", Descr=\"" + attrDescr + "\"\n" );

			String useToolSet = getInternalToolSetName( attrName );

			((MssYCFToolSetParser)getParser()).setCurToolSet( useToolSet );


			StringBuffer buff;

			IYCFGenKbToolSetObj toolset = getEngine().getToolSetTableObj().readToolSetByNameIdx( useToolSet );
			if( toolset != null ) {
//				toolset.setToolSetIsSupportedValue( true );
				buff = new StringBuffer( "\tEnabled ToolSet \"" );
			}
			else {
				toolset = getEngine().defineToolSet( useToolSet );
				buff = new StringBuffer( "\tDefined ToolSet \"" );
			}

			buff.append( useToolSet );
			buff.append( "\"\n" );

			getLog().message( buff.toString() ); 

		}


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
		public void endElement(
			String	uri,
			String	localName,
			String	qName)
		throws SAXException
		{
		}
	}

	class RuleSetHandler extends YCFLibXmlCoreElementHandler {

		/**
		 *	Construct an XML Core Element Handler owned by the
		 *	specified parser.
		 *	<p>
		 *	The logger associated with the parser is used for
		 *	processing messages.
		 *
		 *	@param	coreParser	The parser which owns this instance.
		 */
		public RuleSetHandler( MssYCFToolSetParser coreParser ) {
			super( coreParser );
		}

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
		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
			String	attrName = null;

			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;

			assert qName.equals( "RuleSet" );

			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Name" ) ) {
					assert attrName == null : "Duplicate attribute \"Name\" detected";
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					assert false : "Unrecognized attribute \"" + attrLocalName + "\"";
				}
			}

			assert ( attrName != null ) && ( attrName.length() > 0 ) : "Missing attribute \"Name\"";

			String ruleSetDocRoot = getDocumentRootDir();
			String ruleSetName = ruleSetDocRoot + attrName + ".xml";
			InputStream ruleSetManifestXml = null;

			if( ruleSetDocRoot.startsWith( "jar:" ) ) {
				try {
					URL url = new URL( ruleSetName );
					if( url != null ) {
						ruleSetManifestXml = url.openStream();
						if( ruleSetManifestXml == null ) {
							ruleSetName = null;
							ruleSetDocRoot = null;
						}
					}
				}
				catch( MalformedURLException e ) {
					ruleSetManifestXml = null;
					ruleSetName = null;
					ruleSetDocRoot = null;
				}
				catch( IOException e ) {
					ruleSetManifestXml = null;
					ruleSetName = null;
					ruleSetDocRoot = null;
				}
			}
			else {
				try {
					ruleSetManifestXml = new FileInputStream( ruleSetName );
				}
				catch( FileNotFoundException e ) {
					ruleSetManifestXml = null;
					getLog().message( "ERROR: \tCould not find RuleSet \"" + ruleSetName + "\"\n" );
					YCFLib.beep();
					return;
				}
			}

			try {
				ruleSetParser.setLog( getLog() );
				ruleSetParser.setDefaultToolSet( ((MssYCFToolSetParser)getParser()).getCurToolSet() );
				ruleSetParser.parse( ruleSetManifestXml, ruleSetDocRoot );
			}
			catch( Exception e ) {
				getLog().message( "ERROR: " + getLocationInfo() + "\tCould not load ToolSet \"" + attrName + "\"\n" );
				YCFLib.beep();
			}
			finally {
				if( ruleSetManifestXml != null ) {
					try {
						ruleSetManifestXml.close();
					}
					catch( Exception e ) {
					}

					ruleSetManifestXml = null;
				}
			}
		}


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
		public void endElement(
			String	uri,
			String	localName,
			String	qName)
		throws SAXException
		{
		}
	}

	protected void parse( String uri ) {
		assert ( uri != null ) && ( uri.length() > 0 ) : "uri (parm 1) is null or empty";
		assert saxParser != null : "Parser must be initialized first";

        try {
    		saxParser.reset();
    		saxParser.parse( uri, this );
        }
        catch (SAXParseException e) {
            // ignore
        }
        catch (SAXException e) {
        	Exception nested;
    		nested = e.getException();
    		if( nested == null ) {
    			nested = e;
    		}
    		if( getLog() != null ) {
    			getLog().message( "YCFLibXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getSimpleName() + " " + nested.getMessage() + "\n" );
    		}
    		else {
    			System.err.append( "ERROR: YCFLibXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getSimpleName() + " " + nested.getMessage() + "\n" );
    		}
    		YCFLib.beep();
        }
		catch( FileNotFoundException e ) {
			if( getLog() != null ) {
				getLog().message( "YCFLibXmlCoreSaxParser.parse() Could not find file \"" + uri + "\"\n" );
			}
			else {
				System.err.append( "ERROR: YCFLibXmlCoreSaxParser.parse() Could not find file \"" + uri + "\"\n" );
			}
    		YCFLib.beep();
		}
		catch (Exception e) {
			if( getLog() != null ) {
				getLog().message( "YCFLibXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getSimpleName() + " " + e.getMessage() + "\n" );
			}
			else {
				System.err.append( "ERROR: YCFLibXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getSimpleName() + " " + e.getMessage() + "\n" );
			}
    		YCFLib.beep();
		}
	}

	protected void parse( InputStream inputStream ) {
		assert inputStream != null : "inputStream (arg 1) is null";
		assert saxParser != null : "Parser must be initialized first";

        try {
    		saxParser.reset();
    		saxParser.parse( inputStream, this );
        }
        catch (SAXParseException e) {
        	Exception nested;
    		nested = e.getException();
    		if( nested == null ) {
    			nested = e;
    		}
    		if( getLog() != null ) {
    			getLog().message( "YCFLibXmlCoreSaxParser.parse() Ignored SAXParseException exception " + nested.getClass().getSimpleName() + " " + nested.getMessage() + "\n" );
    		}
    		else {
    			System.err.append( "ERROR: YCFLibXmlCoreSaxParser.parse() Ignored SAXParseException exception " + nested.getClass().getSimpleName() + " " + nested.getMessage() + "\n" );
    		}
    		YCFLib.beep();
        }
        catch (SAXException e) {
        	Exception nested;
    		nested = e.getException();
    		if( nested == null ) {
    			nested = e;
    		}
    		if( getLog() != null ) {
    			getLog().message( "YCFLibXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getSimpleName() + " " + nested.getMessage() + "\n" );
    		}
    		else {
    			System.err.append( "ERROR: YCFLibXmlCoreSaxParser.parse() Ignored exception " + getFormattedNearLocation() + nested.getClass().getSimpleName() + " " + nested.getMessage() + "\n" );
    		}
    		YCFLib.beep();
        }
		catch (Exception e) {
			if( getLog() != null ) {
				getLog().message( "YCFLibXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getSimpleName() + " " + e.getMessage() + "\n" );
			}
			else {
				System.err.append( "ERROR: YCFLibXmlCoreSaxParser.parser() Ignored exception " + getFormattedNearLocation() + e.getClass().getSimpleName() + " " + e.getMessage() + "\n" );
			}
    		YCFLib.beep();
		}
	}
}
