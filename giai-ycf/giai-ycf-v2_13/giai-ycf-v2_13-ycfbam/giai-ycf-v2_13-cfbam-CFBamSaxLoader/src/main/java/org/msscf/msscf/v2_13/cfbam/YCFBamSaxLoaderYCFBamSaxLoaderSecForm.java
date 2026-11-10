
// Description: Java 11 XML SAX Element Handler for SecForm

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamSaxLoader;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamSaxLoaderSecFormParse XML SAX Element Handler implementation
 *	for SecForm.
 */
public class YCFBamSaxLoaderSecForm
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamSaxLoaderSecForm( YCFBamSaxLoader saxLoader ) {
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
		IYCFBamSecFormObj origBuff = null;
		IYCFBamSecFormEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// SecForm Attributes
		String attrJEEServletMapName = null;
		// SecForm References
		IYCFBamClusterObj refCluster = null;
		IYCFBamSecAppObj refApplication = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "SecForm" );

			YCFBamSaxLoader saxLoader = (YCFBamSaxLoader)getParser();
			if( saxLoader == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			IYCFBamSchemaObj schemaObj = saxLoader.getSchemaObj();
			if( schemaObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Instantiate an edit buffer for the parsed information
			origBuff = (IYCFBamSecFormObj)schemaObj.getSecFormTableObj().newInstance();
			editBuff = (IYCFBamSecFormEditObj)origBuff.beginEdit();

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
			else if( scopeObj instanceof IYCFBamSecAppObj ) {
				refApplication = (IYCFBamSecAppObj) scopeObj;
				editBuff.setRequiredContainerApplication( refApplication );
				refCluster = (IYCFBamClusterObj)editBuff.getRequiredOwnerCluster();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFBamSecAppObj" );
			}

			// Resolve and apply Owner reference

			if( refCluster == null ) {
				if( scopeObj instanceof IYCFBamClusterObj ) {
					refCluster = (IYCFBamClusterObj) scopeObj;
					editBuff.setRequiredOwnerCluster( refCluster );
				}
				else {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Owner<Cluster>" );
				}
			}

			YCFBamSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getSecFormLoaderBehaviour();
			IYCFBamSecFormEditObj editSecForm = null;
			IYCFBamSecFormObj origSecForm = (IYCFBamSecFormObj)schemaObj.getSecFormTableObj().readSecFormByUJEEServletIdx( refCluster.getRequiredId(),
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
						editSecForm = (IYCFBamSecFormEditObj)origSecForm.beginEdit();
						editSecForm.setRequiredJEEServletMapName( editBuff.getRequiredJEEServletMapName() );
						break;
					case Replace:
						editSecForm = (IYCFBamSecFormEditObj)origSecForm.beginEdit();
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
					origSecForm = (IYCFBamSecFormObj)editSecForm.create();
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
