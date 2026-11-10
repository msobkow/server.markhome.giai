
// Description: Java 11 XML SAX Element Handler for ISOCtryCcy

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
 *	YCFSecSaxLoaderISOCtryCcyParse XML SAX Element Handler implementation
 *	for ISOCtryCcy.
 */
public class YCFSecSaxLoaderISOCtryCcy
	extends YCFLibXmlCoreElementHandler
{
	public YCFSecSaxLoaderISOCtryCcy( YCFSecSaxLoader saxLoader ) {
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
		IYCFSecISOCtryCcyObj origBuff = null;
		IYCFSecISOCtryCcyEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// ISOCtryCcy Attributes
		String attrCcy = null;
		// ISOCtryCcy References
		IYCFSecISOCtryObj refCtry = null;
		IYCFSecISOCcyObj refCcy = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "ISOCtryCcy" );

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
			origBuff = (IYCFSecISOCtryCcyObj)schemaObj.getISOCtryCcyTableObj().newInstance();
			editBuff = (IYCFSecISOCtryCcyEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "Ccy" ) ) {
					if( attrCcy != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCcy = attrs.getValue( idxAttr );
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
			if( ( attrCcy == null ) || ( attrCcy.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Ccy" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "Ccy", attrCcy );

			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			Integer natId;
			if( ( attrId != null ) && ( attrId.length() > 0 ) ) {
				natId = Integer.valueOf( Integer.parseInt( attrId ) );
			}
			else {
				natId = null;
			}
			// Get the scope/container object

			YCFLibXmlCoreContext parentContext = curContext.getPrevContext();
			Object scopeObj;
			if( parentContext != null ) {
				scopeObj = parentContext.getNamedValue( "Object" );
			}
			else {
				scopeObj = null;
			}

			// Resolve and apply required Container reference

			if( scopeObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"scopeObj" );
			}
			else if( scopeObj instanceof IYCFSecISOCtryObj ) {
				refCtry = (IYCFSecISOCtryObj) scopeObj;
				editBuff.setRequiredContainerCtry( refCtry );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFSecISOCtryObj" );
			}

			// Lookup refCcy by key name value attr
			if( ( attrCcy != null ) && ( attrCcy.length() > 0 ) ) {
				refCcy = (IYCFSecISOCcyObj)schemaObj.getISOCcyTableObj().readISOCcyByCcyCdIdx( attrCcy );
				if( refCcy == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve Ccy reference named \"" + attrCcy + "\" to table ISOCcy" );
				}
			}
			else {
				refCcy = null;
			}
			editBuff.setRequiredParentCcy( refCcy );

			YCFSecSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getISOCtryCcyLoaderBehaviour();
			IYCFSecISOCtryCcyEditObj editISOCtryCcy = null;
			IYCFSecISOCtryCcyObj origISOCtryCcy = (IYCFSecISOCtryCcyObj)schemaObj.getISOCtryCcyTableObj().readISOCtryCcyByIdIdx( refCtry.getRequiredISOCtryId(),
			refCcy.getRequiredISOCcyId() );
			if( origISOCtryCcy == null ) {
				editISOCtryCcy = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editISOCtryCcy = (IYCFSecISOCtryCcyEditObj)origISOCtryCcy.beginEdit();
						editISOCtryCcy.setRequiredParentCcy( editBuff.getRequiredParentCcy() );
						break;
					case Replace:
						editISOCtryCcy = (IYCFSecISOCtryCcyEditObj)origISOCtryCcy.beginEdit();
						editISOCtryCcy.deleteInstance();
						editISOCtryCcy = null;
						origISOCtryCcy = null;
						editISOCtryCcy = editBuff;
						break;
				}
			}

			if( editISOCtryCcy != null ) {
				if( origISOCtryCcy != null ) {
					editISOCtryCcy.update();
				}
				else {
					origISOCtryCcy = (IYCFSecISOCtryCcyObj)editISOCtryCcy.create();
				}
				editISOCtryCcy = null;
			}

			curContext.putNamedValue( "Object", origISOCtryCcy );
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
