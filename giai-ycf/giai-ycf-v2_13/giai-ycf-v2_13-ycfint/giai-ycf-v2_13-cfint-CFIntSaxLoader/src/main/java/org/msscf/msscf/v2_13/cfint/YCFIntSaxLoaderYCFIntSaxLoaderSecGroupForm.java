
// Description: Java 11 XML SAX Element Handler for SecGroupForm

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntSaxLoader;

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
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

/*
 *	YCFIntSaxLoaderSecGroupFormParse XML SAX Element Handler implementation
 *	for SecGroupForm.
 */
public class YCFIntSaxLoaderSecGroupForm
	extends YCFLibXmlCoreElementHandler
{
	public YCFIntSaxLoaderSecGroupForm( YCFIntSaxLoader saxLoader ) {
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
		IYCFIntSecGroupFormObj origBuff = null;
		IYCFIntSecGroupFormEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// SecGroupForm Attributes
		String attrApp = null;
		String attrForm = null;
		// SecGroupForm References
		IYCFIntClusterObj refCluster = null;
		IYCFIntSecGroupObj refGroup = null;
		IYCFIntSecAppObj refApp = null;
		IYCFIntSecFormObj refForm = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "SecGroupForm" );

			YCFIntSaxLoader saxLoader = (YCFIntSaxLoader)getParser();
			if( saxLoader == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			IYCFIntSchemaObj schemaObj = saxLoader.getSchemaObj();
			if( schemaObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Instantiate an edit buffer for the parsed information
			origBuff = (IYCFIntSecGroupFormObj)schemaObj.getSecGroupFormTableObj().newInstance();
			editBuff = (IYCFIntSecGroupFormEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "App" ) ) {
					if( attrApp != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrApp = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Form" ) ) {
					if( attrForm != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrForm = attrs.getValue( idxAttr );
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
			if( ( attrApp == null ) || ( attrApp.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"App" );
			}
			if( ( attrForm == null ) || ( attrForm.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Form" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "App", attrApp );
			curContext.putNamedValue( "Form", attrForm );

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
			else if( scopeObj instanceof IYCFIntSecGroupObj ) {
				refGroup = (IYCFIntSecGroupObj) scopeObj;
				editBuff.setRequiredContainerGroup( refGroup );
				refCluster = (IYCFIntClusterObj)editBuff.getRequiredOwnerCluster();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFIntSecGroupObj" );
			}

			// Resolve and apply Owner reference

			if( refCluster == null ) {
				if( scopeObj instanceof IYCFIntClusterObj ) {
					refCluster = (IYCFIntClusterObj) scopeObj;
					editBuff.setRequiredOwnerCluster( refCluster );
				}
				else {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Owner<Cluster>" );
				}
			}

			// Lookup refApp by key name value attr
			if( ( attrApp != null ) && ( attrApp.length() > 0 ) ) {
				refApp = (IYCFIntSecAppObj)schemaObj.getSecAppTableObj().readSecAppByUJEEMountIdx( editBuff.getRequiredClusterId(),
				attrApp );
				if( refApp == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve App reference named \"" + attrApp + "\" to table SecApp" );
				}
			}
			else {
				refApp = null;
			}
			editBuff.setRequiredParentApp( refApp );

			// Lookup refForm by key name value attr
			if( ( attrForm != null ) && ( attrForm.length() > 0 ) ) {
				refForm = (IYCFIntSecFormObj)schemaObj.getSecFormTableObj().readSecFormByUJEEServletIdx( editBuff.getRequiredClusterId(),
				editBuff.getRequiredSecAppId(),
				attrForm );
				if( refForm == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve Form reference named \"" + attrForm + "\" to table SecForm" );
				}
			}
			else {
				refForm = null;
			}
			editBuff.setRequiredParentForm( refForm );

			IYCFIntSecGroupFormObj origSecGroupForm;
			IYCFIntSecGroupFormEditObj editSecGroupForm = editBuff;
			origSecGroupForm = (IYCFIntSecGroupFormObj)editSecGroupForm.create();
			editSecGroupForm = null;

			curContext.putNamedValue( "Object", origSecGroupForm );
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
