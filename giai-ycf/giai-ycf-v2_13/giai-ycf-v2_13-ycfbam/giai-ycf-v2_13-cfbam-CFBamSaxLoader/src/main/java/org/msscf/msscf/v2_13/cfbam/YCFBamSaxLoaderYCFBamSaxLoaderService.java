
// Description: Java 11 XML SAX Element Handler for Service

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
 *	YCFBamSaxLoaderServiceParse XML SAX Element Handler implementation
 *	for Service.
 */
public class YCFBamSaxLoaderService
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamSaxLoaderService( YCFBamSaxLoader saxLoader ) {
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
		IYCFBamServiceObj origBuff = null;
		IYCFBamServiceEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// Service Attributes
		String attrHostPort = null;
		String attrServiceType = null;
		// Service References
		IYCFBamClusterObj refCluster = null;
		IYCFBamHostNodeObj refHost = null;
		IYCFBamServiceTypeObj refServiceType = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "Service" );

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
			origBuff = (IYCFBamServiceObj)schemaObj.getServiceTableObj().newInstance();
			editBuff = (IYCFBamServiceEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "HostPort" ) ) {
					if( attrHostPort != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHostPort = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ServiceType" ) ) {
					if( attrServiceType != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrServiceType = attrs.getValue( idxAttr );
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
			if( ( attrHostPort == null ) || ( attrHostPort.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"HostPort" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "HostPort", attrHostPort );
			curContext.putNamedValue( "ServiceType", attrServiceType );

			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			Integer natId;
			if( ( attrId != null ) && ( attrId.length() > 0 ) ) {
				natId = Integer.valueOf( Integer.parseInt( attrId ) );
			}
			else {
				natId = null;
			}
			short natHostPort = Short.parseShort( attrHostPort );
			editBuff.setRequiredHostPort( natHostPort );

			// Get the scope/container object

			YCFLibXmlCoreContext parentContext = curContext.getPrevContext();
			Object scopeObj;
			if( parentContext != null ) {
				scopeObj = parentContext.getNamedValue( "Object" );
			}
			else {
				scopeObj = null;
			}

			// Resolve and apply optional Container reference

			if( scopeObj == null ) {
				refHost = null;
				editBuff.setOptionalContainerHost( refHost );
				refCluster = (IYCFBamClusterObj)editBuff.getRequiredOwnerCluster();
			}
			else if( scopeObj instanceof IYCFBamHostNodeObj ) {
				refHost = (IYCFBamHostNodeObj) scopeObj;
				editBuff.setOptionalContainerHost( refHost );
				refCluster = (IYCFBamClusterObj)editBuff.getRequiredOwnerCluster();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFBamHostNodeObj" );
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

			// Lookup refServiceType by key name value attr
			if( ( attrServiceType != null ) && ( attrServiceType.length() > 0 ) ) {
				refServiceType = (IYCFBamServiceTypeObj)schemaObj.getServiceTypeTableObj().readServiceTypeByUDescrIdx( attrServiceType );
				if( refServiceType == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve ServiceType reference named \"" + attrServiceType + "\" to table ServiceType" );
				}
			}
			else {
				refServiceType = null;
			}
			editBuff.setOptionalParentServiceType( refServiceType );

			IYCFBamServiceObj origService;
			IYCFBamServiceEditObj editService = editBuff;
			origService = (IYCFBamServiceObj)editService.create();
			editService = null;

			curContext.putNamedValue( "Object", origService );
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
