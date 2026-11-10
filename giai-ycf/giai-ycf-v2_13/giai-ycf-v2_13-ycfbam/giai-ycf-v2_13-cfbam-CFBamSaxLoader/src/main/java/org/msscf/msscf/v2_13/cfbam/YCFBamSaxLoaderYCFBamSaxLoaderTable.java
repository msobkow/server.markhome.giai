
// Description: Java 11 XML SAX Element Handler for Table

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
 *	YCFBamSaxLoaderTableParse XML SAX Element Handler implementation
 *	for Table.
 */
public class YCFBamSaxLoaderTable
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamSaxLoaderTable( YCFBamSaxLoader saxLoader ) {
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
		IYCFBamTableObj origBuff = null;
		IYCFBamTableEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// Scope Attributes
		// Scope References
		IYCFBamTenantObj refTenant = null;
		// Table Attributes
		String attrName = null;
		String attrDbName = null;
		String attrShortName = null;
		String attrLabel = null;
		String attrShortDescription = null;
		String attrDescription = null;
		String attrPageData = null;
		String attrTableClassCode = null;
		String attrIsInstantiable = null;
		String attrHasHistory = null;
		String attrHasAuditColumns = null;
		String attrIsMutable = null;
		String attrIsServerOnly = null;
		String attrLoaderBehaviour = null;
		String attrSecScope = null;
		String attrCodeVis = null;
		String attrCppPgSqlTableInclude = null;
		String attrDefSchema = null;
		String attrLookupIndex = null;
		String attrAltIndex = null;
		String attrQualTable = null;
		String attrPrimaryIndex = null;
		// Table References
		IYCFBamSchemaDefObj refSchemaDef = null;
		IYCFBamSchemaDefObj refDefSchema = null;
		IYCFBamIndexObj refLookupIndex = null;
		IYCFBamIndexObj refAltIndex = null;
		IYCFBamTableObj refQualTable = null;
		IYCFBamIndexObj refPrimaryIndex = null;
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "Table" );

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
			origBuff = (IYCFBamTableObj)schemaObj.getTableTableObj().newInstance();
			editBuff = (IYCFBamTableEditObj)origBuff.beginEdit();

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
				else if( attrLocalName.equals( "DbName" ) ) {
					if( attrDbName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDbName = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "PageData" ) ) {
					if( attrPageData != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPageData = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "TableClassCode" ) ) {
					if( attrTableClassCode != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrTableClassCode = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsInstantiable" ) ) {
					if( attrIsInstantiable != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsInstantiable = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HasHistory" ) ) {
					if( attrHasHistory != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHasHistory = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HasAuditColumns" ) ) {
					if( attrHasAuditColumns != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHasAuditColumns = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsMutable" ) ) {
					if( attrIsMutable != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsMutable = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsServerOnly" ) ) {
					if( attrIsServerOnly != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsServerOnly = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "LoaderBehaviour" ) ) {
					if( attrLoaderBehaviour != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLoaderBehaviour = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecScope" ) ) {
					if( attrSecScope != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecScope = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "CppPgSqlTableInclude" ) ) {
					if( attrCppPgSqlTableInclude != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppPgSqlTableInclude = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "LookupIndex" ) ) {
					if( attrLookupIndex != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLookupIndex = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "AltIndex" ) ) {
					if( attrAltIndex != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrAltIndex = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "QualTable" ) ) {
					if( attrQualTable != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrQualTable = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PrimaryIndex" ) ) {
					if( attrPrimaryIndex != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPrimaryIndex = attrs.getValue( idxAttr );
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
			if( ( attrPageData == null ) || ( attrPageData.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"PageData" );
			}
			if( attrTableClassCode == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"TableClassCode" );
			}
			if( ( attrIsInstantiable == null ) || ( attrIsInstantiable.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsInstantiable" );
			}
			if( ( attrHasHistory == null ) || ( attrHasHistory.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"HasHistory" );
			}
			if( ( attrHasAuditColumns == null ) || ( attrHasAuditColumns.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"HasAuditColumns" );
			}
			if( ( attrIsMutable == null ) || ( attrIsMutable.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsMutable" );
			}
			if( ( attrIsServerOnly == null ) || ( attrIsServerOnly.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsServerOnly" );
			}
			if( ( attrLoaderBehaviour == null ) || ( attrLoaderBehaviour.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"LoaderBehaviour" );
			}
			if( ( attrSecScope == null ) || ( attrSecScope.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecScope" );
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
			curContext.putNamedValue( "DbName", attrDbName );
			curContext.putNamedValue( "ShortName", attrShortName );
			curContext.putNamedValue( "Label", attrLabel );
			curContext.putNamedValue( "ShortDescription", attrShortDescription );
			curContext.putNamedValue( "Description", attrDescription );
			curContext.putNamedValue( "PageData", attrPageData );
			curContext.putNamedValue( "TableClassCode", attrTableClassCode );
			curContext.putNamedValue( "IsInstantiable", attrIsInstantiable );
			curContext.putNamedValue( "HasHistory", attrHasHistory );
			curContext.putNamedValue( "HasAuditColumns", attrHasAuditColumns );
			curContext.putNamedValue( "IsMutable", attrIsMutable );
			curContext.putNamedValue( "IsServerOnly", attrIsServerOnly );
			curContext.putNamedValue( "LoaderBehaviour", attrLoaderBehaviour );
			curContext.putNamedValue( "SecScope", attrSecScope );
			curContext.putNamedValue( "CodeVis", attrCodeVis );
			curContext.putNamedValue( "CppPgSqlTableInclude", attrCppPgSqlTableInclude );
			curContext.putNamedValue( "DefSchema", attrDefSchema );
			curContext.putNamedValue( "LookupIndex", attrLookupIndex );
			curContext.putNamedValue( "AltIndex", attrAltIndex );
			curContext.putNamedValue( "QualTable", attrQualTable );
			curContext.putNamedValue( "PrimaryIndex", attrPrimaryIndex );

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

			String natDbName = attrDbName;
			editBuff.setOptionalDbName( natDbName );

			String natShortName = attrShortName;
			editBuff.setOptionalShortName( natShortName );

			String natLabel = attrLabel;
			editBuff.setOptionalLabel( natLabel );

			String natShortDescription = attrShortDescription;
			editBuff.setOptionalShortDescription( natShortDescription );

			String natDescription = attrDescription;
			editBuff.setOptionalDescription( natDescription );

			boolean natPageData;
			if( attrPageData.equals( "true" ) || attrPageData.equals( "yes" ) || attrPageData.equals( "1" ) ) {
				natPageData = true;
			}
			else if( attrPageData.equals( "false" ) || attrPageData.equals( "no" ) || attrPageData.equals( "0" ) ) {
				natPageData = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected PageData value, must be one of true, false, yes, no, 1, or 0, not \"" + attrPageData + "\"" );
			}
			editBuff.setRequiredPageData( natPageData );

			String natTableClassCode = attrTableClassCode;
			editBuff.setRequiredTableClassCode( natTableClassCode );

			boolean natIsInstantiable;
			if( attrIsInstantiable.equals( "true" ) || attrIsInstantiable.equals( "yes" ) || attrIsInstantiable.equals( "1" ) ) {
				natIsInstantiable = true;
			}
			else if( attrIsInstantiable.equals( "false" ) || attrIsInstantiable.equals( "no" ) || attrIsInstantiable.equals( "0" ) ) {
				natIsInstantiable = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsInstantiable value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsInstantiable + "\"" );
			}
			editBuff.setRequiredIsInstantiable( natIsInstantiable );

			boolean natHasHistory;
			if( attrHasHistory.equals( "true" ) || attrHasHistory.equals( "yes" ) || attrHasHistory.equals( "1" ) ) {
				natHasHistory = true;
			}
			else if( attrHasHistory.equals( "false" ) || attrHasHistory.equals( "no" ) || attrHasHistory.equals( "0" ) ) {
				natHasHistory = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected HasHistory value, must be one of true, false, yes, no, 1, or 0, not \"" + attrHasHistory + "\"" );
			}
			editBuff.setRequiredHasHistory( natHasHistory );

			boolean natHasAuditColumns;
			if( attrHasAuditColumns.equals( "true" ) || attrHasAuditColumns.equals( "yes" ) || attrHasAuditColumns.equals( "1" ) ) {
				natHasAuditColumns = true;
			}
			else if( attrHasAuditColumns.equals( "false" ) || attrHasAuditColumns.equals( "no" ) || attrHasAuditColumns.equals( "0" ) ) {
				natHasAuditColumns = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected HasAuditColumns value, must be one of true, false, yes, no, 1, or 0, not \"" + attrHasAuditColumns + "\"" );
			}
			editBuff.setRequiredHasAuditColumns( natHasAuditColumns );

			boolean natIsMutable;
			if( attrIsMutable.equals( "true" ) || attrIsMutable.equals( "yes" ) || attrIsMutable.equals( "1" ) ) {
				natIsMutable = true;
			}
			else if( attrIsMutable.equals( "false" ) || attrIsMutable.equals( "no" ) || attrIsMutable.equals( "0" ) ) {
				natIsMutable = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsMutable value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsMutable + "\"" );
			}
			editBuff.setRequiredIsMutable( natIsMutable );

			boolean natIsServerOnly;
			if( attrIsServerOnly.equals( "true" ) || attrIsServerOnly.equals( "yes" ) || attrIsServerOnly.equals( "1" ) ) {
				natIsServerOnly = true;
			}
			else if( attrIsServerOnly.equals( "false" ) || attrIsServerOnly.equals( "no" ) || attrIsServerOnly.equals( "0" ) ) {
				natIsServerOnly = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsServerOnly value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsServerOnly + "\"" );
			}
			editBuff.setRequiredIsServerOnly( natIsServerOnly );

			IYCFBamSchema.LoaderBehaviourEnum natLoaderBehaviour = YCFBamSchema.parseLoaderBehaviourEnum( attrLoaderBehaviour );
			editBuff.setRequiredLoaderBehaviour( natLoaderBehaviour );

			IYCFBamSchema.SecScopeEnum natSecScope = YCFBamSchema.parseSecScopeEnum( attrSecScope );
			editBuff.setRequiredSecScope( natSecScope );

			IYCFBamSchema.CodeVisibilityEnum natCodeVis = YCFBamSchema.parseCodeVisibilityEnum( attrCodeVis );
			editBuff.setRequiredCodeVis( natCodeVis );

			String natCppPgSqlTableInclude = attrCppPgSqlTableInclude;
			editBuff.setOptionalCppPgSqlTableInclude( natCppPgSqlTableInclude );

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

			// Lookup refQualTable by qualified name
			if( ( attrQualTable != null ) && ( attrQualTable.length() > 0 ) ) {
				refQualTable = (IYCFBamTableObj)(editBuff.getNamedObject( schemaObj.getTableTableObj().getObjQualifyingClass(),
					attrQualTable ) );
				if( refQualTable == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve QualTable reference qualified name \"" + attrQualTable + "\" to table Table" );
				}
			}
			else {
				refQualTable = null;
			}
			editBuff.setOptionalLookupQualTable( refQualTable );

			YCFBamSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getTableLoaderBehaviour();
			IYCFBamTableEditObj editTable = null;
			IYCFBamTableObj origTable = (IYCFBamTableObj)schemaObj.getTableTableObj().readTableByUNameIdx( refSchemaDef.getRequiredTenantId(),
			refSchemaDef.getRequiredId(),
			editBuff.getRequiredName() );
			if( origTable == null ) {
				editTable = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editTable = (IYCFBamTableEditObj)origTable.beginEdit();
						editTable.setRequiredName( editBuff.getRequiredName() );
						editTable.setOptionalDbName( editBuff.getOptionalDbName() );
						editTable.setOptionalShortName( editBuff.getOptionalShortName() );
						editTable.setOptionalLabel( editBuff.getOptionalLabel() );
						editTable.setOptionalShortDescription( editBuff.getOptionalShortDescription() );
						editTable.setOptionalDescription( editBuff.getOptionalDescription() );
						editTable.setRequiredPageData( editBuff.getRequiredPageData() );
						editTable.setRequiredTableClassCode( editBuff.getRequiredTableClassCode() );
						editTable.setRequiredIsInstantiable( editBuff.getRequiredIsInstantiable() );
						editTable.setRequiredHasHistory( editBuff.getRequiredHasHistory() );
						editTable.setRequiredHasAuditColumns( editBuff.getRequiredHasAuditColumns() );
						editTable.setRequiredIsMutable( editBuff.getRequiredIsMutable() );
						editTable.setRequiredIsServerOnly( editBuff.getRequiredIsServerOnly() );
						editTable.setRequiredLoaderBehaviour( editBuff.getRequiredLoaderBehaviour() );
						editTable.setRequiredSecScope( editBuff.getRequiredSecScope() );
						editTable.setRequiredCodeVis( editBuff.getRequiredCodeVis() );
						editTable.setOptionalJObjMembers( editBuff.getOptionalJObjMembers() );
						editTable.setOptionalJObjInterface( editBuff.getOptionalJObjInterface() );
						editTable.setOptionalJObjImport( editBuff.getOptionalJObjImport() );
						editTable.setOptionalJObjImplementation( editBuff.getOptionalJObjImplementation() );
						editTable.setOptionalJEditObjMembers( editBuff.getOptionalJEditObjMembers() );
						editTable.setOptionalJEditObjInterface( editBuff.getOptionalJEditObjInterface() );
						editTable.setOptionalJEditObjImport( editBuff.getOptionalJEditObjImport() );
						editTable.setOptionalJEditObjImplementation( editBuff.getOptionalJEditObjImplementation() );
						editTable.setOptionalJTableImport( editBuff.getOptionalJTableImport() );
						editTable.setOptionalJTableMembers( editBuff.getOptionalJTableMembers() );
						editTable.setOptionalJTableInterface( editBuff.getOptionalJTableInterface() );
						editTable.setOptionalJTableImplementation( editBuff.getOptionalJTableImplementation() );
						editTable.setOptionalJTableObjImport( editBuff.getOptionalJTableObjImport() );
						editTable.setOptionalJTableObjMembers( editBuff.getOptionalJTableObjMembers() );
						editTable.setOptionalJTableObjInterface( editBuff.getOptionalJTableObjInterface() );
						editTable.setOptionalJTableObjImplementation( editBuff.getOptionalJTableObjImplementation() );
						editTable.setOptionalJDb2LUWTableImport( editBuff.getOptionalJDb2LUWTableImport() );
						editTable.setOptionalJDb2LUWTableMembers( editBuff.getOptionalJDb2LUWTableMembers() );
						editTable.setOptionalJDb2LUWTableImplementation( editBuff.getOptionalJDb2LUWTableImplementation() );
						editTable.setOptionalJMSSqlTableImport( editBuff.getOptionalJMSSqlTableImport() );
						editTable.setOptionalJMSSqlTableMembers( editBuff.getOptionalJMSSqlTableMembers() );
						editTable.setOptionalJMSSqlTableImplementation( editBuff.getOptionalJMSSqlTableImplementation() );
						editTable.setOptionalJMySqlTableImport( editBuff.getOptionalJMySqlTableImport() );
						editTable.setOptionalJMySqlTableMembers( editBuff.getOptionalJMySqlTableMembers() );
						editTable.setOptionalJMySqlTableImplementation( editBuff.getOptionalJMySqlTableImplementation() );
						editTable.setOptionalJOracleTableImport( editBuff.getOptionalJOracleTableImport() );
						editTable.setOptionalJOracleTableMembers( editBuff.getOptionalJOracleTableMembers() );
						editTable.setOptionalJOracleTableImplementation( editBuff.getOptionalJOracleTableImplementation() );
						editTable.setOptionalJPgSqlTableImport( editBuff.getOptionalJPgSqlTableImport() );
						editTable.setOptionalJPgSqlTableMembers( editBuff.getOptionalJPgSqlTableMembers() );
						editTable.setOptionalJPgSqlTableImplementation( editBuff.getOptionalJPgSqlTableImplementation() );
						editTable.setOptionalJRamTableImport( editBuff.getOptionalJRamTableImport() );
						editTable.setOptionalJRamTableMembers( editBuff.getOptionalJRamTableMembers() );
						editTable.setOptionalJRamTableImplementation( editBuff.getOptionalJRamTableImplementation() );
						editTable.setOptionalJSaxLoaderImport( editBuff.getOptionalJSaxLoaderImport() );
						editTable.setOptionalJSaxLoaderStartElement( editBuff.getOptionalJSaxLoaderStartElement() );
						editTable.setOptionalJSaxLoaderEndElement( editBuff.getOptionalJSaxLoaderEndElement() );
						editTable.setOptionalJXMsgTableImport( editBuff.getOptionalJXMsgTableImport() );
						editTable.setOptionalJXMsgTableFormatters( editBuff.getOptionalJXMsgTableFormatters() );
						editTable.setOptionalJXMsgRqstTableImport( editBuff.getOptionalJXMsgRqstTableImport() );
						editTable.setOptionalJXMsgRspnTableImport( editBuff.getOptionalJXMsgRspnTableImport() );
						editTable.setOptionalJXMsgClientTableImport( editBuff.getOptionalJXMsgClientTableImport() );
						editTable.setOptionalJXMsgRqstTableBody( editBuff.getOptionalJXMsgRqstTableBody() );
						editTable.setOptionalJXMsgRspnTableBody( editBuff.getOptionalJXMsgRspnTableBody() );
						editTable.setOptionalJXMsgClientTableBody( editBuff.getOptionalJXMsgClientTableBody() );
						editTable.setOptionalCppObjMembers( editBuff.getOptionalCppObjMembers() );
						editTable.setOptionalCppObjInterface( editBuff.getOptionalCppObjInterface() );
						editTable.setOptionalCppObjInclude( editBuff.getOptionalCppObjInclude() );
						editTable.setOptionalCppObjImplementation( editBuff.getOptionalCppObjImplementation() );
						editTable.setOptionalCppEditObjMembers( editBuff.getOptionalCppEditObjMembers() );
						editTable.setOptionalCppEditObjInterface( editBuff.getOptionalCppEditObjInterface() );
						editTable.setOptionalCppEditObjInclude( editBuff.getOptionalCppEditObjInclude() );
						editTable.setOptionalCppEditObjImplementation( editBuff.getOptionalCppEditObjImplementation() );
						editTable.setOptionalCppTableInclude( editBuff.getOptionalCppTableInclude() );
						editTable.setOptionalCppTableMembers( editBuff.getOptionalCppTableMembers() );
						editTable.setOptionalCppTableInterface( editBuff.getOptionalCppTableInterface() );
						editTable.setOptionalCppTableImplementation( editBuff.getOptionalCppTableImplementation() );
						editTable.setOptionalCppTableObjInclude( editBuff.getOptionalCppTableObjInclude() );
						editTable.setOptionalCppTableObjMembers( editBuff.getOptionalCppTableObjMembers() );
						editTable.setOptionalCppTableObjInterface( editBuff.getOptionalCppTableObjInterface() );
						editTable.setOptionalCppTableObjImplementation( editBuff.getOptionalCppTableObjImplementation() );
						editTable.setOptionalCppDb2LUWTableInclude( editBuff.getOptionalCppDb2LUWTableInclude() );
						editTable.setOptionalCppDb2LUWTableMembers( editBuff.getOptionalCppDb2LUWTableMembers() );
						editTable.setOptionalCppDb2LUWTableImplementation( editBuff.getOptionalCppDb2LUWTableImplementation() );
						editTable.setOptionalCppMSSqlTableInclude( editBuff.getOptionalCppMSSqlTableInclude() );
						editTable.setOptionalCppMSSqlTableMembers( editBuff.getOptionalCppMSSqlTableMembers() );
						editTable.setOptionalCppMSSqlTableImplementation( editBuff.getOptionalCppMSSqlTableImplementation() );
						editTable.setOptionalCppMySqlTableInclude( editBuff.getOptionalCppMySqlTableInclude() );
						editTable.setOptionalCppMySqlTableMembers( editBuff.getOptionalCppMySqlTableMembers() );
						editTable.setOptionalCppMySqlTableImplementation( editBuff.getOptionalCppMySqlTableImplementation() );
						editTable.setOptionalCppOracleTableInclude( editBuff.getOptionalCppOracleTableInclude() );
						editTable.setOptionalCppOracleTableMembers( editBuff.getOptionalCppOracleTableMembers() );
						editTable.setOptionalCppOracleTableImplementation( editBuff.getOptionalCppOracleTableImplementation() );
						editTable.setOptionalCppPgSqlTableInclude( editBuff.getOptionalCppPgSqlTableInclude() );
						editTable.setOptionalCppPgSqlTableMembers( editBuff.getOptionalCppPgSqlTableMembers() );
						editTable.setOptionalCppPgSqlTableImplementation( editBuff.getOptionalCppPgSqlTableImplementation() );
						editTable.setOptionalCppRamTableInclude( editBuff.getOptionalCppRamTableInclude() );
						editTable.setOptionalCppRamTableMembers( editBuff.getOptionalCppRamTableMembers() );
						editTable.setOptionalCppRamTableImplementation( editBuff.getOptionalCppRamTableImplementation() );
						editTable.setOptionalCppSaxLoaderInclude( editBuff.getOptionalCppSaxLoaderInclude() );
						editTable.setOptionalCppSaxLoaderStartElement( editBuff.getOptionalCppSaxLoaderStartElement() );
						editTable.setOptionalCppSaxLoaderEndElement( editBuff.getOptionalCppSaxLoaderEndElement() );
						editTable.setOptionalCppXMsgTableInclude( editBuff.getOptionalCppXMsgTableInclude() );
						editTable.setOptionalCppXMsgTableFormatters( editBuff.getOptionalCppXMsgTableFormatters() );
						editTable.setOptionalCppXMsgRqstTableInclude( editBuff.getOptionalCppXMsgRqstTableInclude() );
						editTable.setOptionalCppXMsgRspnTableInclude( editBuff.getOptionalCppXMsgRspnTableInclude() );
						editTable.setOptionalCppXMsgClientTableInclude( editBuff.getOptionalCppXMsgClientTableInclude() );
						editTable.setOptionalCppXMsgRqstTableBody( editBuff.getOptionalCppXMsgRqstTableBody() );
						editTable.setOptionalCppXMsgRspnTableBody( editBuff.getOptionalCppXMsgRspnTableBody() );
						editTable.setOptionalCppXMsgClientTableBody( editBuff.getOptionalCppXMsgClientTableBody() );
						editTable.setOptionalHppObjMembers( editBuff.getOptionalHppObjMembers() );
						editTable.setOptionalHppObjInterface( editBuff.getOptionalHppObjInterface() );
						editTable.setOptionalHppObjInclude( editBuff.getOptionalHppObjInclude() );
						editTable.setOptionalHppObjImplementation( editBuff.getOptionalHppObjImplementation() );
						editTable.setOptionalHppEditObjMembers( editBuff.getOptionalHppEditObjMembers() );
						editTable.setOptionalHppEditObjInterface( editBuff.getOptionalHppEditObjInterface() );
						editTable.setOptionalHppEditObjInclude( editBuff.getOptionalHppEditObjInclude() );
						editTable.setOptionalHppEditObjImplementation( editBuff.getOptionalHppEditObjImplementation() );
						editTable.setOptionalHppTableInclude( editBuff.getOptionalHppTableInclude() );
						editTable.setOptionalHppTableMembers( editBuff.getOptionalHppTableMembers() );
						editTable.setOptionalHppTableInterface( editBuff.getOptionalHppTableInterface() );
						editTable.setOptionalHppTableImplementation( editBuff.getOptionalHppTableImplementation() );
						editTable.setOptionalHppTableObjInclude( editBuff.getOptionalHppTableObjInclude() );
						editTable.setOptionalHppTableObjMembers( editBuff.getOptionalHppTableObjMembers() );
						editTable.setOptionalHppTableObjInterface( editBuff.getOptionalHppTableObjInterface() );
						editTable.setOptionalHppTableObjImplementation( editBuff.getOptionalHppTableObjImplementation() );
						editTable.setOptionalHppDb2LUWTableInclude( editBuff.getOptionalHppDb2LUWTableInclude() );
						editTable.setOptionalHppDb2LUWTableMembers( editBuff.getOptionalHppDb2LUWTableMembers() );
						editTable.setOptionalHppDb2LUWTableImplementation( editBuff.getOptionalHppDb2LUWTableImplementation() );
						editTable.setOptionalHppMSSqlTableInclude( editBuff.getOptionalHppMSSqlTableInclude() );
						editTable.setOptionalHppMSSqlTableMembers( editBuff.getOptionalHppMSSqlTableMembers() );
						editTable.setOptionalHppMSSqlTableImplementation( editBuff.getOptionalHppMSSqlTableImplementation() );
						editTable.setOptionalHppMySqlTableInclude( editBuff.getOptionalHppMySqlTableInclude() );
						editTable.setOptionalHppMySqlTableMembers( editBuff.getOptionalHppMySqlTableMembers() );
						editTable.setOptionalHppMySqlTableImplementation( editBuff.getOptionalHppMySqlTableImplementation() );
						editTable.setOptionalHppOracleTableInclude( editBuff.getOptionalHppOracleTableInclude() );
						editTable.setOptionalHppOracleTableMembers( editBuff.getOptionalHppOracleTableMembers() );
						editTable.setOptionalHppOracleTableImplementation( editBuff.getOptionalHppOracleTableImplementation() );
						editTable.setOptionalHppPgSqlTableInclude( editBuff.getOptionalHppPgSqlTableInclude() );
						editTable.setOptionalHppPgSqlTableMembers( editBuff.getOptionalHppPgSqlTableMembers() );
						editTable.setOptionalHppPgSqlTableImplementation( editBuff.getOptionalHppPgSqlTableImplementation() );
						editTable.setOptionalHppRamTableInclude( editBuff.getOptionalHppRamTableInclude() );
						editTable.setOptionalHppRamTableMembers( editBuff.getOptionalHppRamTableMembers() );
						editTable.setOptionalHppRamTableImplementation( editBuff.getOptionalHppRamTableImplementation() );
						editTable.setOptionalHppSaxLoaderInclude( editBuff.getOptionalHppSaxLoaderInclude() );
						editTable.setOptionalHppSaxLoaderStartElement( editBuff.getOptionalHppSaxLoaderStartElement() );
						editTable.setOptionalHppSaxLoaderEndElement( editBuff.getOptionalHppSaxLoaderEndElement() );
						editTable.setOptionalHppXMsgTableInclude( editBuff.getOptionalHppXMsgTableInclude() );
						editTable.setOptionalHppXMsgTableFormatters( editBuff.getOptionalHppXMsgTableFormatters() );
						editTable.setOptionalHppXMsgRqstTableInclude( editBuff.getOptionalHppXMsgRqstTableInclude() );
						editTable.setOptionalHppXMsgRspnTableInclude( editBuff.getOptionalHppXMsgRspnTableInclude() );
						editTable.setOptionalHppXMsgClientTableInclude( editBuff.getOptionalHppXMsgClientTableInclude() );
						editTable.setOptionalHppXMsgRqstTableBody( editBuff.getOptionalHppXMsgRqstTableBody() );
						editTable.setOptionalHppXMsgRspnTableBody( editBuff.getOptionalHppXMsgRspnTableBody() );
						editTable.setOptionalHppXMsgClientTableBody( editBuff.getOptionalHppXMsgClientTableBody() );
						editTable.setOptionalCsObjMembers( editBuff.getOptionalCsObjMembers() );
						editTable.setOptionalCsObjInterface( editBuff.getOptionalCsObjInterface() );
						editTable.setOptionalCsObjUsing( editBuff.getOptionalCsObjUsing() );
						editTable.setOptionalCsObjImplementation( editBuff.getOptionalCsObjImplementation() );
						editTable.setOptionalCsEditObjMembers( editBuff.getOptionalCsEditObjMembers() );
						editTable.setOptionalCsEditObjInterface( editBuff.getOptionalCsEditObjInterface() );
						editTable.setOptionalCsEditObjUsing( editBuff.getOptionalCsEditObjUsing() );
						editTable.setOptionalCsEditObjImplementation( editBuff.getOptionalCsEditObjImplementation() );
						editTable.setOptionalCsTableUsing( editBuff.getOptionalCsTableUsing() );
						editTable.setOptionalCsTableMembers( editBuff.getOptionalCsTableMembers() );
						editTable.setOptionalCsTableInterface( editBuff.getOptionalCsTableInterface() );
						editTable.setOptionalCsTableImplementation( editBuff.getOptionalCsTableImplementation() );
						editTable.setOptionalCsTableObjUsing( editBuff.getOptionalCsTableObjUsing() );
						editTable.setOptionalCsTableObjMembers( editBuff.getOptionalCsTableObjMembers() );
						editTable.setOptionalCsTableObjInterface( editBuff.getOptionalCsTableObjInterface() );
						editTable.setOptionalCsTableObjImplementation( editBuff.getOptionalCsTableObjImplementation() );
						editTable.setOptionalCsDb2LUWTableUsing( editBuff.getOptionalCsDb2LUWTableUsing() );
						editTable.setOptionalCsDb2LUWTableMembers( editBuff.getOptionalCsDb2LUWTableMembers() );
						editTable.setOptionalCsDb2LUWTableImplementation( editBuff.getOptionalCsDb2LUWTableImplementation() );
						editTable.setOptionalCsMSSqlTableUsing( editBuff.getOptionalCsMSSqlTableUsing() );
						editTable.setOptionalCsMSSqlTableMembers( editBuff.getOptionalCsMSSqlTableMembers() );
						editTable.setOptionalCsMSSqlTableImplementation( editBuff.getOptionalCsMSSqlTableImplementation() );
						editTable.setOptionalCsMySqlTableUsing( editBuff.getOptionalCsMySqlTableUsing() );
						editTable.setOptionalCsMySqlTableMembers( editBuff.getOptionalCsMySqlTableMembers() );
						editTable.setOptionalCsMySqlTableImplementation( editBuff.getOptionalCsMySqlTableImplementation() );
						editTable.setOptionalCsOracleTableUsing( editBuff.getOptionalCsOracleTableUsing() );
						editTable.setOptionalCsOracleTableMembers( editBuff.getOptionalCsOracleTableMembers() );
						editTable.setOptionalCsOracleTableImplementation( editBuff.getOptionalCsOracleTableImplementation() );
						editTable.setOptionalCsPgSqlTableUsing( editBuff.getOptionalCsPgSqlTableUsing() );
						editTable.setOptionalCsPgSqlTableMembers( editBuff.getOptionalCsPgSqlTableMembers() );
						editTable.setOptionalCsPgSqlTableImplementation( editBuff.getOptionalCsPgSqlTableImplementation() );
						editTable.setOptionalCsRamTableUsing( editBuff.getOptionalCsRamTableUsing() );
						editTable.setOptionalCsRamTableMembers( editBuff.getOptionalCsRamTableMembers() );
						editTable.setOptionalCsRamTableImplementation( editBuff.getOptionalCsRamTableImplementation() );
						editTable.setOptionalCsSaxLoaderUsing( editBuff.getOptionalCsSaxLoaderUsing() );
						editTable.setOptionalCsSaxLoaderStartElement( editBuff.getOptionalCsSaxLoaderStartElement() );
						editTable.setOptionalCsSaxLoaderEndElement( editBuff.getOptionalCsSaxLoaderEndElement() );
						editTable.setOptionalCsXMsgTableUsing( editBuff.getOptionalCsXMsgTableUsing() );
						editTable.setOptionalCsXMsgTableFormatters( editBuff.getOptionalCsXMsgTableFormatters() );
						editTable.setOptionalCsXMsgRqstTableUsing( editBuff.getOptionalCsXMsgRqstTableUsing() );
						editTable.setOptionalCsXMsgRspnTableUsing( editBuff.getOptionalCsXMsgRspnTableUsing() );
						editTable.setOptionalCsXMsgClientTableUsing( editBuff.getOptionalCsXMsgClientTableUsing() );
						editTable.setOptionalCsXMsgRqstTableBody( editBuff.getOptionalCsXMsgRqstTableBody() );
						editTable.setOptionalCsXMsgRspnTableBody( editBuff.getOptionalCsXMsgRspnTableBody() );
						editTable.setOptionalCsXMsgClientTableBody( editBuff.getOptionalCsXMsgClientTableBody() );
						editTable.setOptionalLookupDefSchema( editBuff.getOptionalLookupDefSchema() );
						editTable.setOptionalLookupLookupIndex( editBuff.getOptionalLookupLookupIndex() );
						editTable.setOptionalLookupAltIndex( editBuff.getOptionalLookupAltIndex() );
						editTable.setOptionalLookupQualTable( editBuff.getOptionalLookupQualTable() );
						editTable.setOptionalLookupPrimaryIndex( editBuff.getOptionalLookupPrimaryIndex() );
						break;
					case Replace:
						editTable = (IYCFBamTableEditObj)origTable.beginEdit();
						editTable.deleteInstance();
						editTable = null;
						origTable = null;
						editTable = editBuff;
						break;
				}
			}

			if( editTable != null ) {
				if( origTable != null ) {
					editTable.update();
				}
				else {
					origTable = (IYCFBamTableObj)editTable.create();
				}
				editTable = null;
			}

			curContext.putNamedValue( "Object", origTable );
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
		final String S_ProcName = "endElement";
		IYCFBamTableObj origBuff = null;
		IYCFBamTableEditObj editBuff = null;
		String attrLookupIndex = null;
		String attrAltIndex = null;
		String attrPrimaryIndex = null;
		IYCFBamIndexObj refLookupIndex = null;
		IYCFBamIndexObj refAltIndex = null;
		IYCFBamIndexObj refPrimaryIndex = null;
		try {
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

			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			if( curContext == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"curContext" );
			}

			Object obj = curContext.getNamedValue( "Object" );
			if( obj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"obj" );
			}
			else if( obj instanceof IYCFBamTableObj ) {
				origBuff = (IYCFBamTableObj)obj;
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"obj",
					obj,
					"IYCFBamTableObj" );
			}

			attrLookupIndex = (String)curContext.getNamedValue( "LookupIndex" );
			attrAltIndex = (String)curContext.getNamedValue( "AltIndex" );
			attrPrimaryIndex = (String)curContext.getNamedValue( "PrimaryIndex" );

			// Lookup refLookupIndex by qualified name
			if( ( attrLookupIndex != null ) && ( attrLookupIndex.length() > 0 ) ) {
				refLookupIndex = (IYCFBamIndexObj)( origBuff.getNamedObject( schemaObj.getIndexTableObj().getObjQualifyingClass(),
					attrLookupIndex ) );
				if( refLookupIndex == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve LookupIndex reference qualified name \"" + attrLookupIndex + "\" to table Index" );
				}
			}
			else {
				refLookupIndex = null;
			}
			if( origBuff.getOptionalLookupLookupIndex() != refLookupIndex ) {
				if( editBuff == null ) {
					editBuff = (IYCFBamTableEditObj)( origBuff.getEdit() );
					if( editBuff == null ) {
						editBuff = (IYCFBamTableEditObj)( origBuff.beginEdit() );
					}
				}
				editBuff.setOptionalLookupLookupIndex( refLookupIndex );
			}

			// Lookup refAltIndex by qualified name
			if( ( attrAltIndex != null ) && ( attrAltIndex.length() > 0 ) ) {
				refAltIndex = (IYCFBamIndexObj)( origBuff.getNamedObject( schemaObj.getIndexTableObj().getObjQualifyingClass(),
					attrAltIndex ) );
				if( refAltIndex == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve AltIndex reference qualified name \"" + attrAltIndex + "\" to table Index" );
				}
			}
			else {
				refAltIndex = null;
			}
			if( origBuff.getOptionalLookupAltIndex() != refAltIndex ) {
				if( editBuff == null ) {
					editBuff = (IYCFBamTableEditObj)( origBuff.getEdit() );
					if( editBuff == null ) {
						editBuff = (IYCFBamTableEditObj)( origBuff.beginEdit() );
					}
				}
				editBuff.setOptionalLookupAltIndex( refAltIndex );
			}

			// Lookup refPrimaryIndex by qualified name
			if( ( attrPrimaryIndex != null ) && ( attrPrimaryIndex.length() > 0 ) ) {
				refPrimaryIndex = (IYCFBamIndexObj)( origBuff.getNamedObject( schemaObj.getIndexTableObj().getObjQualifyingClass(),
					attrPrimaryIndex ) );
				if( refPrimaryIndex == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve PrimaryIndex reference qualified name \"" + attrPrimaryIndex + "\" to table Index" );
				}
			}
			else {
				refPrimaryIndex = null;
			}
			if( origBuff.getOptionalLookupPrimaryIndex() != refPrimaryIndex ) {
				if( editBuff == null ) {
					editBuff = (IYCFBamTableEditObj)( origBuff.getEdit() );
					if( editBuff == null ) {
						editBuff = (IYCFBamTableEditObj)( origBuff.beginEdit() );
					}
				}
				editBuff.setOptionalLookupPrimaryIndex( refPrimaryIndex );
			}

			if( editBuff != null ) {
				editBuff.update();
				editBuff = null;
			}
		}
		catch( RuntimeException e ) {
			if( editBuff != null ) {
				editBuff.endEdit();
				editBuff = null;
			}
			throw new SAXException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage(),
				e );
		}
		catch( Error e ) {
			if( editBuff != null ) {
				editBuff.endEdit();
				editBuff = null;
			}
			throw new SAXException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage() );
		}
		if( editBuff != null ) {
			editBuff.endEdit();
			editBuff = null;
		}
	}
}
