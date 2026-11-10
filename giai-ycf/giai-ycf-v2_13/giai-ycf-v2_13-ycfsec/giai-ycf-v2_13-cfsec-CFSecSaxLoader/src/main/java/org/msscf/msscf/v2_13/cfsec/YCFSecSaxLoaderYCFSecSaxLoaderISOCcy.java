
// Description: Java 11 XML SAX Element Handler for ISOCcy

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecSaxLoader;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

/*
 *	YCFSecSaxLoaderISOCcyParse XML SAX Element Handler implementation
 *	for ISOCcy.
 */
public class YCFSecSaxLoaderISOCcy
	extends YCFLibXmlCoreElementHandler
{
	public YCFSecSaxLoaderISOCcy( YCFSecSaxLoader saxLoader ) {
		super( saxLoader );
	}

	public void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs )
	throws SAXException
	{
		final String S_ProcName = "startElement";
		IYCFSecISOCcyObj origBuff = null;
		IYCFSecISOCcyEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// ISOCcy Attributes
		String attrISOCode = null;
		String attrName = null;
		String attrUnitSymbol = null;
		String attrPrecis = null;
		// ISOCcy References
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "ISOCcy" );

			YCFSecSaxLoader saxLoader = (YCFSecSaxLoader)getParser();
			if( saxLoader == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			IYCFSecSchemaObj schemaObj = saxLoader.getSchemaObj();
			if( schemaObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Instantiate an edit buffer for the parsed information
			origBuff = (IYCFSecISOCcyObj)schemaObj.getISOCcyTableObj().newInstance();
			editBuff = (IYCFSecISOCcyEditObj)origBuff.beginEdit();

			// Extract Attributes
			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Id" ) ) {
					if( attrId != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ISOCode" ) ) {
					if( attrISOCode != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrISOCode = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Name" ) ) {
					if( attrName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "UnitSymbol" ) ) {
					if( attrUnitSymbol != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrUnitSymbol = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Precis" ) ) {
					if( attrPrecis != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPrecis = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					throw new YCFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( attrISOCode == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"ISOCode" );
			}
			if( attrName == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( ( attrPrecis == null ) || ( attrPrecis.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Precis" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "ISOCode", attrISOCode );
			curContext.putNamedValue( "Name", attrName );
			curContext.putNamedValue( "UnitSymbol", attrUnitSymbol );
			curContext.putNamedValue( "Precis", attrPrecis );

			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			Integer natId;
			if( ( attrId != null ) && ( attrId.length() > 0 ) ) {
				natId = Integer.valueOf( Integer.parseInt( attrId ) );
			}
			else {
				natId = null;
			}
			String natISOCode = attrISOCode;
			editBuff.setRequiredISOCode( natISOCode );

			String natName = attrName;
			editBuff.setRequiredName( natName );

			String natUnitSymbol = attrUnitSymbol;
			editBuff.setOptionalUnitSymbol( natUnitSymbol );

			short natPrecis = Short.parseShort( attrPrecis );
			editBuff.setRequiredPrecis( natPrecis );

			// Get the scope/container object

			YCFLibXmlCoreContext parentContext = curContext.getPrevContext();
			Object scopeObj;
			if( parentContext != null ) {
				scopeObj = parentContext.getNamedValue( "Object" );
			}
			else {
				scopeObj = null;
			}

			YCFSecSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getISOCcyLoaderBehaviour();
			IYCFSecISOCcyEditObj editISOCcy = null;
			IYCFSecISOCcyObj origISOCcy = (IYCFSecISOCcyObj)schemaObj.getISOCcyTableObj().readISOCcyByCcyCdIdx( editBuff.getRequiredISOCode() );
			if( origISOCcy == null ) {
				editISOCcy = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editISOCcy = (IYCFSecISOCcyEditObj)origISOCcy.beginEdit();
						editISOCcy.setRequiredISOCode( editBuff.getRequiredISOCode() );
						editISOCcy.setRequiredName( editBuff.getRequiredName() );
						editISOCcy.setOptionalUnitSymbol( editBuff.getOptionalUnitSymbol() );
						editISOCcy.setRequiredPrecis( editBuff.getRequiredPrecis() );
						break;
					case Replace:
						editISOCcy = (IYCFSecISOCcyEditObj)origISOCcy.beginEdit();
						editISOCcy.deleteInstance();
						editISOCcy = null;
						origISOCcy = null;
						editISOCcy = editBuff;
						break;
				}
			}

			if( editISOCcy != null ) {
				if( origISOCcy != null ) {
					editISOCcy.update();
				}
				else {
					origISOCcy = (IYCFSecISOCcyObj)editISOCcy.create();
				}
				editISOCcy = null;
			}

			curContext.putNamedValue( "Object", origISOCcy );
		}
		catch( RuntimeException e ) {
			throw new SAXException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage(),
				e );
		}
		catch( Error e ) {
			throw new SAXException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage() );
		}
	}

	public void endElement(
		String		uri,
		String		localName,
		String		qName )
	throws SAXException
	{
	}
}
