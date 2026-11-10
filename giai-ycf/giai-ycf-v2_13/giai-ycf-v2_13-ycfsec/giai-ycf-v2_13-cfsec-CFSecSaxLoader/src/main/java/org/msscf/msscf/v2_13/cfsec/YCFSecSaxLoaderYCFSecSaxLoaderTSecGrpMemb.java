
// Description: Java 11 XML SAX Element Handler for TSecGrpMemb

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
 *	YCFSecSaxLoaderTSecGrpMembParse XML SAX Element Handler implementation
 *	for TSecGrpMemb.
 */
public class YCFSecSaxLoaderTSecGrpMemb
	extends YCFLibXmlCoreElementHandler
{
	public YCFSecSaxLoaderTSecGrpMemb( YCFSecSaxLoader saxLoader ) {
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
		IYCFSecTSecGrpMembObj origBuff = null;
		IYCFSecTSecGrpMembEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// TSecGrpMemb Attributes
		String attrUser = null;
		// TSecGrpMemb References
		IYCFSecTenantObj refTenant = null;
		IYCFSecTSecGroupObj refGroup = null;
		IYCFSecSecUserObj refUser = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "TSecGrpMemb" );

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
			origBuff = (IYCFSecTSecGrpMembObj)schemaObj.getTSecGrpMembTableObj().newInstance();
			editBuff = (IYCFSecTSecGrpMembEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "User" ) ) {
					if( attrUser != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrUser = attrs.getValue( idxAttr );
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
			if( ( attrUser == null ) || ( attrUser.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"User" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "User", attrUser );

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
			else if( scopeObj instanceof IYCFSecTSecGroupObj ) {
				refGroup = (IYCFSecTSecGroupObj) scopeObj;
				editBuff.setRequiredContainerGroup( refGroup );
				refTenant = (IYCFSecTenantObj)editBuff.getRequiredOwnerTenant();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFSecTSecGroupObj" );
			}

			// Resolve and apply Owner reference

			if( refTenant == null ) {
				if( scopeObj instanceof IYCFSecTenantObj ) {
					refTenant = (IYCFSecTenantObj) scopeObj;
					editBuff.setRequiredOwnerTenant( refTenant );
				}
				else {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Owner<Tenant>" );
				}
			}

			// Lookup refUser by key name value attr
			if( ( attrUser != null ) && ( attrUser.length() > 0 ) ) {
				refUser = (IYCFSecSecUserObj)schemaObj.getSecUserTableObj().readSecUserByULoginIdx( attrUser );
				if( refUser == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve User reference named \"" + attrUser + "\" to table SecUser" );
				}
			}
			else {
				refUser = null;
			}
			editBuff.setRequiredParentUser( refUser );

			YCFSecSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getTSecGrpMembLoaderBehaviour();
			IYCFSecTSecGrpMembEditObj editTSecGrpMemb = null;
			IYCFSecTSecGrpMembObj origTSecGrpMemb = (IYCFSecTSecGrpMembObj)schemaObj.getTSecGrpMembTableObj().readTSecGrpMembByUUserIdx( refTenant.getRequiredId(),
			refGroup.getRequiredTSecGroupId(),
			refUser.getRequiredSecUserId() );
			if( origTSecGrpMemb == null ) {
				editTSecGrpMemb = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editTSecGrpMemb = (IYCFSecTSecGrpMembEditObj)origTSecGrpMemb.beginEdit();
						editTSecGrpMemb.setRequiredParentUser( editBuff.getRequiredParentUser() );
						break;
					case Replace:
						editTSecGrpMemb = (IYCFSecTSecGrpMembEditObj)origTSecGrpMemb.beginEdit();
						editTSecGrpMemb.deleteInstance();
						editTSecGrpMemb = null;
						origTSecGrpMemb = null;
						editTSecGrpMemb = editBuff;
						break;
				}
			}

			if( editTSecGrpMemb != null ) {
				if( origTSecGrpMemb != null ) {
					editTSecGrpMemb.update();
				}
				else {
					origTSecGrpMemb = (IYCFSecTSecGrpMembObj)editTSecGrpMemb.create();
				}
				editTSecGrpMemb = null;
			}

			curContext.putNamedValue( "Object", origTSecGrpMemb );
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
