
// Description: Java 11 XML SAX Element Handler for SecForm

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
 *	YCFSecSaxLoaderSecFormParse XML SAX Element Handler implementation
 *	for SecForm.
 */
public class YCFSecSaxLoaderSecForm
	extends YCFLibXmlCoreElementHandler
{
	public YCFSecSaxLoaderSecForm( YCFSecSaxLoader saxLoader ) {
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
		IYCFSecSecFormObj origBuff = null;
		IYCFSecSecFormEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// SecForm Attributes
		String attrJEEServletMapName = null;
		// SecForm References
		IYCFSecClusterObj refCluster = null;
		IYCFSecSecAppObj refApplication = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "SecForm" );

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
			origBuff = (IYCFSecSecFormObj)schemaObj.getSecFormTableObj().newInstance();
			editBuff = (IYCFSecSecFormEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "JEEServletMapName" ) ) {
					if( attrJEEServletMapName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJEEServletMapName = attrs.getValue( idxAttr );
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
			if( attrJEEServletMapName == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"JEEServletMapName" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "JEEServletMapName", attrJEEServletMapName );

			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			Integer natId;
			if( ( attrId != null ) && ( attrId.length() > 0 ) ) {
				natId = Integer.valueOf( Integer.parseInt( attrId ) );
			}
			else {
				natId = null;
			}
			String natJEEServletMapName = attrJEEServletMapName;
			editBuff.setRequiredJEEServletMapName( natJEEServletMapName );

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
			else if( scopeObj instanceof IYCFSecSecAppObj ) {
				refApplication = (IYCFSecSecAppObj) scopeObj;
				editBuff.setRequiredContainerApplication( refApplication );
				refCluster = (IYCFSecClusterObj)editBuff.getRequiredOwnerCluster();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFSecSecAppObj" );
			}

			// Resolve and apply Owner reference

			if( refCluster == null ) {
				if( scopeObj instanceof IYCFSecClusterObj ) {
					refCluster = (IYCFSecClusterObj) scopeObj;
					editBuff.setRequiredOwnerCluster( refCluster );
				}
				else {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Owner<Cluster>" );
				}
			}

			YCFSecSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getSecFormLoaderBehaviour();
			IYCFSecSecFormEditObj editSecForm = null;
			IYCFSecSecFormObj origSecForm = (IYCFSecSecFormObj)schemaObj.getSecFormTableObj().readSecFormByUJEEServletIdx( refCluster.getRequiredId(),
			refApplication.getRequiredSecAppId(),
			editBuff.getRequiredJEEServletMapName() );
			if( origSecForm == null ) {
				editSecForm = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editSecForm = (IYCFSecSecFormEditObj)origSecForm.beginEdit();
						editSecForm.setRequiredJEEServletMapName( editBuff.getRequiredJEEServletMapName() );
						break;
					case Replace:
						editSecForm = (IYCFSecSecFormEditObj)origSecForm.beginEdit();
						editSecForm.deleteInstance();
						editSecForm = null;
						origSecForm = null;
						editSecForm = editBuff;
						break;
				}
			}

			if( editSecForm != null ) {
				if( origSecForm != null ) {
					editSecForm.update();
				}
				else {
					origSecForm = (IYCFSecSecFormObj)editSecForm.create();
				}
				editSecForm = null;
			}

			curContext.putNamedValue( "Object", origSecForm );
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
