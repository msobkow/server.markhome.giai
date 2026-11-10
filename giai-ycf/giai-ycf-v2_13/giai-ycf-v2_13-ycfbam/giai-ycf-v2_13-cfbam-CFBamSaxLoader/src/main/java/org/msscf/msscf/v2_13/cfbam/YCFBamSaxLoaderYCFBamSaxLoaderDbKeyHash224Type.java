
// Description: Java 11 XML SAX Element Handler for DbKeyHash224Type

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
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
 *	YCFBamSaxLoaderDbKeyHash224TypeParse XML SAX Element Handler implementation
 *	for DbKeyHash224Type.
 */
public class YCFBamSaxLoaderDbKeyHash224Type
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamSaxLoaderDbKeyHash224Type( YCFBamSaxLoader saxLoader ) {
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
		IYCFBamDbKeyHash224TypeObj origBuff = null;
		IYCFBamDbKeyHash224TypeEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// Value Attributes
		String attrName = null;
		String attrShortName = null;
		String attrLabel = null;
		String attrShortDescription = null;
		String attrDescription = null;
		String attrDefaultXmlValue = null;
		String attrIsNullable = null;
		String attrGenerateId = null;
		String attrImplementsPolymorph = null;
		String attrCodeVis = null;
		String attrDefSchema = null;
		// Value References
		IYCFBamTenantObj refTenant = null;
		IYCFBamScopeObj refScope = null;
		IYCFBamSchemaDefObj refDefSchema = null;
		// Atom Attributes
		String attrDbName = null;
		// Atom References
		// DbKeyHash224Def Attributes
		String attrInitValue = null;
		// DbKeyHash224Def References
		// DbKeyHash224Type Attributes
		// DbKeyHash224Type References
		IYCFBamSchemaDefObj refSchemaDef = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "DbKeyHash224Type" );

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
			origBuff = (IYCFBamDbKeyHash224TypeObj)schemaObj.getDbKeyHash224TypeTableObj().newInstance();
			editBuff = (IYCFBamDbKeyHash224TypeEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "ShortName" ) ) {
					if( attrShortName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrShortName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Label" ) ) {
					if( attrLabel != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLabel = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ShortDescription" ) ) {
					if( attrShortDescription != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrShortDescription = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "DefaultXmlValue" ) ) {
					if( attrDefaultXmlValue != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDefaultXmlValue = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsNullable" ) ) {
					if( attrIsNullable != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsNullable = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "GenerateId" ) ) {
					if( attrGenerateId != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrGenerateId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ImplementsPolymorph" ) ) {
					if( attrImplementsPolymorph != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrImplementsPolymorph = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CodeVis" ) ) {
					if( attrCodeVis != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCodeVis = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DefSchema" ) ) {
					if( attrDefSchema != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDefSchema = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DbName" ) ) {
					if( attrDbName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDbName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "InitValue" ) ) {
					if( attrInitValue != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrInitValue = attrs.getValue( idxAttr );
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
			if( ( attrIsNullable == null ) || ( attrIsNullable.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsNullable" );
			}
			if( ( attrImplementsPolymorph == null ) || ( attrImplementsPolymorph.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"ImplementsPolymorph" );
			}
			if( ( attrCodeVis == null ) || ( attrCodeVis.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"CodeVis" );
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "Name", attrName );
			curContext.putNamedValue( "ShortName", attrShortName );
			curContext.putNamedValue( "Label", attrLabel );
			curContext.putNamedValue( "ShortDescription", attrShortDescription );
			curContext.putNamedValue( "Description", attrDescription );
			curContext.putNamedValue( "DefaultXmlValue", attrDefaultXmlValue );
			curContext.putNamedValue( "IsNullable", attrIsNullable );
			curContext.putNamedValue( "GenerateId", attrGenerateId );
			curContext.putNamedValue( "ImplementsPolymorph", attrImplementsPolymorph );
			curContext.putNamedValue( "CodeVis", attrCodeVis );
			curContext.putNamedValue( "DefSchema", attrDefSchema );
			curContext.putNamedValue( "DbName", attrDbName );
			curContext.putNamedValue( "InitValue", attrInitValue );

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

			String natShortName = attrShortName;
			editBuff.setOptionalShortName( natShortName );

			String natLabel = attrLabel;
			editBuff.setOptionalLabel( natLabel );

			String natShortDescription = attrShortDescription;
			editBuff.setOptionalShortDescription( natShortDescription );

			String natDescription = attrDescription;
			editBuff.setOptionalDescription( natDescription );

			String natDefaultXmlValue = attrDefaultXmlValue;
			editBuff.setOptionalDefaultXmlValue( natDefaultXmlValue );

			boolean natIsNullable;
			if( attrIsNullable.equals( "true" ) || attrIsNullable.equals( "yes" ) || attrIsNullable.equals( "1" ) ) {
				natIsNullable = true;
			}
			else if( attrIsNullable.equals( "false" ) || attrIsNullable.equals( "no" ) || attrIsNullable.equals( "0" ) ) {
				natIsNullable = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsNullable value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsNullable + "\"" );
			}
			editBuff.setRequiredIsNullable( natIsNullable );

			Boolean natGenerateId;
			if( ( attrGenerateId == null ) || ( attrGenerateId.length() <= 0 ) ) {
				natGenerateId = null;
			}
			else if( attrGenerateId.equals( "true" ) || attrGenerateId.equals( "yes" ) || attrGenerateId.equals( "1" ) ) {
				natGenerateId = true;
			}
			else if( attrGenerateId.equals( "false" ) || attrGenerateId.equals( "no" ) || attrGenerateId.equals( "0" ) ) {
				natGenerateId = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected GenerateId value, must be one of true, false, yes, no, 1, or 0, not \"" + attrGenerateId + "\"" );
			}
			editBuff.setOptionalGenerateId( natGenerateId );

			boolean natImplementsPolymorph;
			if( attrImplementsPolymorph.equals( "true" ) || attrImplementsPolymorph.equals( "yes" ) || attrImplementsPolymorph.equals( "1" ) ) {
				natImplementsPolymorph = true;
			}
			else if( attrImplementsPolymorph.equals( "false" ) || attrImplementsPolymorph.equals( "no" ) || attrImplementsPolymorph.equals( "0" ) ) {
				natImplementsPolymorph = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected ImplementsPolymorph value, must be one of true, false, yes, no, 1, or 0, not \"" + attrImplementsPolymorph + "\"" );
			}
			editBuff.setRequiredImplementsPolymorph( natImplementsPolymorph );

			IYCFBamSchema.CodeVisibilityEnum natCodeVis = YCFBamSchema.parseCodeVisibilityEnum( attrCodeVis );
			editBuff.setRequiredCodeVis( natCodeVis );

			String natDbName = attrDbName;
			editBuff.setOptionalDbName( natDbName );

			String natInitValue = attrInitValue;
			editBuff.setOptionalInitValue( natInitValue );

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
			else if( scopeObj instanceof IYCFBamSchemaDefObj ) {
				refSchemaDef = (IYCFBamSchemaDefObj) scopeObj;
				editBuff.setRequiredContainerSchemaDef( refSchemaDef );
				refTenant = (IYCFBamTenantObj)editBuff.getRequiredOwnerTenant();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFBamSchemaDefObj" );
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

			refScope = refSchemaDef;
			// Lookup refDefSchema by qualified name
			if( ( attrDefSchema != null ) && ( attrDefSchema.length() > 0 ) ) {
				refDefSchema = (IYCFBamSchemaDefObj)(editBuff.getNamedObject( schemaObj.getSchemaDefTableObj().getObjQualifyingClass(),
					attrDefSchema ) );
				if( refDefSchema == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve DefSchema reference qualified name \"" + attrDefSchema + "\" to table SchemaDef" );
				}
			}
			else {
				refDefSchema = null;
			}
			editBuff.setOptionalLookupDefSchema( refDefSchema );

			YCFBamSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getDbKeyHash224TypeLoaderBehaviour();
			IYCFBamDbKeyHash224TypeEditObj editDbKeyHash224Type = null;
			IYCFBamDbKeyHash224TypeObj origDbKeyHash224Type = (IYCFBamDbKeyHash224TypeObj)schemaObj.getDbKeyHash224TypeTableObj().readDbKeyHash224TypeByUNameIdx( refTenant.getRequiredId(),
			refScope.getRequiredId(),
			editBuff.getRequiredName() );
			if( origDbKeyHash224Type == null ) {
				editDbKeyHash224Type = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editDbKeyHash224Type = (IYCFBamDbKeyHash224TypeEditObj)origDbKeyHash224Type.beginEdit();
						editDbKeyHash224Type.setRequiredName( editBuff.getRequiredName() );
						editDbKeyHash224Type.setOptionalShortName( editBuff.getOptionalShortName() );
						editDbKeyHash224Type.setOptionalLabel( editBuff.getOptionalLabel() );
						editDbKeyHash224Type.setOptionalShortDescription( editBuff.getOptionalShortDescription() );
						editDbKeyHash224Type.setOptionalDescription( editBuff.getOptionalDescription() );
						editDbKeyHash224Type.setOptionalDefaultXmlValue( editBuff.getOptionalDefaultXmlValue() );
						editDbKeyHash224Type.setRequiredIsNullable( editBuff.getRequiredIsNullable() );
						editDbKeyHash224Type.setOptionalGenerateId( editBuff.getOptionalGenerateId() );
						editDbKeyHash224Type.setRequiredImplementsPolymorph( editBuff.getRequiredImplementsPolymorph() );
						editDbKeyHash224Type.setRequiredCodeVis( editBuff.getRequiredCodeVis() );
						editDbKeyHash224Type.setOptionalDbName( editBuff.getOptionalDbName() );
						editDbKeyHash224Type.setOptionalInitValue( editBuff.getOptionalInitValue() );
						editDbKeyHash224Type.setOptionalLookupDefSchema( editBuff.getOptionalLookupDefSchema() );
						break;
					case Replace:
						editDbKeyHash224Type = (IYCFBamDbKeyHash224TypeEditObj)origDbKeyHash224Type.beginEdit();
						editDbKeyHash224Type.deleteInstance();
						editDbKeyHash224Type = null;
						origDbKeyHash224Type = null;
						editDbKeyHash224Type = editBuff;
						break;
				}
			}

			if( editDbKeyHash224Type != null ) {
				if( origDbKeyHash224Type != null ) {
					editDbKeyHash224Type.update();
				}
				else {
					origDbKeyHash224Type = (IYCFBamDbKeyHash224TypeObj)editDbKeyHash224Type.create();
				}
				editDbKeyHash224Type = null;
			}

			curContext.putNamedValue( "Object", origDbKeyHash224Type );
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
