
// Description: Java 11 XML SAX Element Handler for TopDomain

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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
 *	YCFBamSaxLoaderTopDomainParse XML SAX Element Handler implementation
 *	for TopDomain.
 */
public class YCFBamSaxLoaderTopDomain
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamSaxLoaderTopDomain( YCFBamSaxLoader saxLoader ) {
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
		IYCFBamTopDomainObj origBuff = null;
		IYCFBamTopDomainEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// TopDomain Attributes
		String attrName = null;
		String attrDescription = null;
		// TopDomain References
		IYCFBamTenantObj refTenant = null;
		IYCFBamTldObj refParentTld = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "TopDomain" );

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
			origBuff = (IYCFBamTopDomainObj)schemaObj.getTopDomainTableObj().newInstance();
			editBuff = (IYCFBamTopDomainEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "Name" ) ) {
					if( attrName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Description" ) ) {
					if( attrDescription != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDescription = attrs.getValue( idxAttr );
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
			if( attrName == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "Name", attrName );
			curContext.putNamedValue( "Description", attrDescription );

			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			Integer natId;
			if( ( attrId != null ) && ( attrId.length() > 0 ) ) {
				natId = Integer.valueOf( Integer.parseInt( attrId ) );
			}
			else {
				natId = null;
			}
			String natName = attrName;
			editBuff.setRequiredName( natName );

			String natDescription = attrDescription;
			editBuff.setOptionalDescription( natDescription );

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
			else if( scopeObj instanceof IYCFBamTldObj ) {
				refParentTld = (IYCFBamTldObj) scopeObj;
				editBuff.setRequiredContainerParentTld( refParentTld );
				refTenant = (IYCFBamTenantObj)editBuff.getRequiredOwnerTenant();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFBamTldObj" );
			}

			// Resolve and apply Owner reference

			if( refTenant == null ) {
				if( scopeObj instanceof IYCFBamTenantObj ) {
					refTenant = (IYCFBamTenantObj) scopeObj;
					editBuff.setRequiredOwnerTenant( refTenant );
				}
				else {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Owner<Tenant>" );
				}
			}

			YCFBamSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getTopDomainLoaderBehaviour();
			IYCFBamTopDomainEditObj editTopDomain = null;
			IYCFBamTopDomainObj origTopDomain = (IYCFBamTopDomainObj)schemaObj.getTopDomainTableObj().readTopDomainByNameIdx( refTenant.getRequiredId(),
			refParentTld.getRequiredId(),
			editBuff.getRequiredName() );
			if( origTopDomain == null ) {
				editTopDomain = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editTopDomain = (IYCFBamTopDomainEditObj)origTopDomain.beginEdit();
						editTopDomain.setRequiredName( editBuff.getRequiredName() );
						editTopDomain.setOptionalDescription( editBuff.getOptionalDescription() );
						break;
					case Replace:
						editTopDomain = (IYCFBamTopDomainEditObj)origTopDomain.beginEdit();
						editTopDomain.deleteInstance();
						editTopDomain = null;
						origTopDomain = null;
						editTopDomain = editBuff;
						break;
				}
			}

			if( editTopDomain != null ) {
				if( origTopDomain != null ) {
					editTopDomain.update();
				}
				else {
					origTopDomain = (IYCFBamTopDomainObj)editTopDomain.create();
				}
				editTopDomain = null;
			}

			curContext.putNamedValue( "Object", origTopDomain );
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
