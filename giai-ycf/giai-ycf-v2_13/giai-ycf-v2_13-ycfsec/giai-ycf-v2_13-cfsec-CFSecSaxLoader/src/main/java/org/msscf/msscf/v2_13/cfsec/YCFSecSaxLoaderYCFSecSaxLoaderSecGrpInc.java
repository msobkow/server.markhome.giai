
// Description: Java 11 XML SAX Element Handler for SecGrpInc

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
 *	YCFSecSaxLoaderSecGrpIncParse XML SAX Element Handler implementation
 *	for SecGrpInc.
 */
public class YCFSecSaxLoaderSecGrpInc
	extends YCFLibXmlCoreElementHandler
{
	public YCFSecSaxLoaderSecGrpInc( YCFSecSaxLoader saxLoader ) {
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
		IYCFSecSecGrpIncObj origBuff = null;
		IYCFSecSecGrpIncEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// SecGrpInc Attributes
		String attrSubGroup = null;
		// SecGrpInc References
		IYCFSecClusterObj refCluster = null;
		IYCFSecSecGroupObj refGroup = null;
		IYCFSecSecGroupObj refSubGroup = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "SecGrpInc" );

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
			origBuff = (IYCFSecSecGrpIncObj)schemaObj.getSecGrpIncTableObj().newInstance();
			editBuff = (IYCFSecSecGrpIncEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "SubGroup" ) ) {
					if( attrSubGroup != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSubGroup = attrs.getValue( idxAttr );
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
			if( ( attrSubGroup == null ) || ( attrSubGroup.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SubGroup" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "SubGroup", attrSubGroup );

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
			else if( scopeObj instanceof IYCFSecSecGroupObj ) {
				refGroup = (IYCFSecSecGroupObj) scopeObj;
				editBuff.setRequiredContainerGroup( refGroup );
				refCluster = (IYCFSecClusterObj)editBuff.getRequiredOwnerCluster();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFSecSecGroupObj" );
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

			// Lookup refSubGroup by key name value attr
			if( ( attrSubGroup != null ) && ( attrSubGroup.length() > 0 ) ) {
				refSubGroup = (IYCFSecSecGroupObj)schemaObj.getSecGroupTableObj().readSecGroupByUNameIdx( editBuff.getRequiredClusterId(),
				attrSubGroup );
				if( refSubGroup == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve SubGroup reference named \"" + attrSubGroup + "\" to table SecGroup" );
				}
			}
			else {
				refSubGroup = null;
			}
			editBuff.setRequiredParentSubGroup( refSubGroup );

			YCFSecSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getSecGrpIncLoaderBehaviour();
			IYCFSecSecGrpIncEditObj editSecGrpInc = null;
			IYCFSecSecGrpIncObj origSecGrpInc = (IYCFSecSecGrpIncObj)schemaObj.getSecGrpIncTableObj().readSecGrpIncByUIncludeIdx( refCluster.getRequiredId(),
			refGroup.getRequiredSecGroupId(),
			refSubGroup.getRequiredSecGroupId() );
			if( origSecGrpInc == null ) {
				editSecGrpInc = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editSecGrpInc = (IYCFSecSecGrpIncEditObj)origSecGrpInc.beginEdit();
						editSecGrpInc.setRequiredParentSubGroup( editBuff.getRequiredParentSubGroup() );
						break;
					case Replace:
						editSecGrpInc = (IYCFSecSecGrpIncEditObj)origSecGrpInc.beginEdit();
						editSecGrpInc.deleteInstance();
						editSecGrpInc = null;
						origSecGrpInc = null;
						editSecGrpInc = editBuff;
						break;
				}
			}

			if( editSecGrpInc != null ) {
				if( origSecGrpInc != null ) {
					editSecGrpInc.update();
				}
				else {
					origSecGrpInc = (IYCFSecSecGrpIncObj)editSecGrpInc.create();
				}
				editSecGrpInc = null;
			}

			curContext.putNamedValue( "Object", origSecGrpInc );
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
