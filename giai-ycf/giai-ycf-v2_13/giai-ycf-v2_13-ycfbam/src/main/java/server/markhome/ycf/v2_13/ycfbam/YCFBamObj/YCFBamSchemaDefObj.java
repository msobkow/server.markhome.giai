// Description: Java 11 base object instance implementation for YCFBam SchemaDef.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamSchemaDefObj
	extends YCFBamScopeObj
	implements IYCFBamSchemaDefObj
{
	public final static String CLASS_CODE = "a802";
	protected IYCFIntMinorVersionObj requiredContainerMinorVersion;
	protected IYCFSecTenantObj requiredOwnerCTenant;

	public YCFBamSchemaDefObj() {
		super();
		requiredContainerMinorVersion = null;
		requiredOwnerCTenant = null;
	}

	public YCFBamSchemaDefObj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerMinorVersion = null;
		requiredOwnerCTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SchemaDef" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntMinorVersionObj scope = getRequiredContainerMinorVersion();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntMinorVersionObj scope = getRequiredContainerMinorVersion();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public IYCFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		IYCFLibAnyObj subObj = null;
		IYCFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTableTableObj().readTableByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getValueTableObj().readValueByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTweakTableObj().readTweakByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getSchemaRoleTableObj().readSchemaRoleByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof IYCFBamSubProjectObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public IYCFBamScopeObj realise() {
		IYCFBamSchemaDefObj retobj = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().realiseSchemaDef(
			(IYCFBamSchemaDefObj)this );
		return( (IYCFBamScopeObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getSchemaDefTableObj().reallyDeepDisposeSchemaDef( (IYCFBamSchemaDefObj)this );
	}

	public IYCFBamScopeObj read() {
		IYCFBamSchemaDefObj retobj = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamScopeObj read( boolean forceRead ) {
		IYCFBamSchemaDefObj retobj = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamSchemaDefTableObj getSchemaDefTable() {
		return( ((IYCFBamSchemaObj)schema).getSchemaDefTableObj() );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaDef().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaDef().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamSchemaDefBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamSchemaDefBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerMinorVersion = null;
		requiredOwnerCTenant = null;
	}

	public YCFBamSchemaDefBuff getSchemaDefBuff() {
		return( (YCFBamSchemaDefBuff)getBuff() );
	}

	public IYCFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamSchemaDefObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamSchemaDefObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().lockSchemaDef( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().newEditInstance( lockobj );
		return( (IYCFBamScopeEditObj)edit );
	}

	public IYCFBamSchemaDefEditObj getEditAsSchemaDef() {
		return( (IYCFBamSchemaDefEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamScopeBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamScopeBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredMinorVersionId() {
		return( getSchemaDefBuff().getRequiredMinorVersionId() );
	}

	public String getRequiredName() {
		return( getSchemaDefBuff().getRequiredName() );
	}

	public String getOptionalDbName() {
		return( getSchemaDefBuff().getOptionalDbName() );
	}

	public String getOptionalShortName() {
		return( getSchemaDefBuff().getOptionalShortName() );
	}

	public String getOptionalLabel() {
		return( getSchemaDefBuff().getOptionalLabel() );
	}

	public String getOptionalShortDescription() {
		return( getSchemaDefBuff().getOptionalShortDescription() );
	}

	public String getOptionalDescription() {
		return( getSchemaDefBuff().getOptionalDescription() );
	}

	public String getRequiredCopyrightPeriod() {
		return( getSchemaDefBuff().getRequiredCopyrightPeriod() );
	}

	public String getRequiredCopyrightHolder() {
		return( getSchemaDefBuff().getRequiredCopyrightHolder() );
	}

	public String getRequiredAuthorEMail() {
		return( getSchemaDefBuff().getRequiredAuthorEMail() );
	}

	public String getRequiredProjectURL() {
		return( getSchemaDefBuff().getRequiredProjectURL() );
	}

	public String getRequiredPublishURI() {
		return( getSchemaDefBuff().getRequiredPublishURI() );
	}

	public String getRequiredCommonLicenseCode() {
		return( getSchemaDefBuff().getRequiredCommonLicenseCode() );
	}

	public String getRequiredCommonLicenseName() {
		return( getSchemaDefBuff().getRequiredCommonLicenseName() );
	}

	public String getRequiredCommonLicenseText() {
		return( getSchemaDefBuff().getRequiredCommonLicenseText() );
	}

	public String getOptionalClientXFaceLicenseCode() {
		return( getSchemaDefBuff().getOptionalClientXFaceLicenseCode() );
	}

	public String getOptionalClientXFaceLicenseName() {
		return( getSchemaDefBuff().getOptionalClientXFaceLicenseName() );
	}

	public String getOptionalClientXFaceLicenseText() {
		return( getSchemaDefBuff().getOptionalClientXFaceLicenseText() );
	}

	public String getOptionalClientImplLicenseCode() {
		return( getSchemaDefBuff().getOptionalClientImplLicenseCode() );
	}

	public String getOptionalClientImplLicenseName() {
		return( getSchemaDefBuff().getOptionalClientImplLicenseName() );
	}

	public String getOptionalClientImplLicenseText() {
		return( getSchemaDefBuff().getOptionalClientImplLicenseText() );
	}

	public String getOptionalServerXFaceLicenseCode() {
		return( getSchemaDefBuff().getOptionalServerXFaceLicenseCode() );
	}

	public String getOptionalServerXFaceLicenseName() {
		return( getSchemaDefBuff().getOptionalServerXFaceLicenseName() );
	}

	public String getOptionalServerXFaceLicenseText() {
		return( getSchemaDefBuff().getOptionalServerXFaceLicenseText() );
	}

	public String getOptionalServerImplLicenseCode() {
		return( getSchemaDefBuff().getOptionalServerImplLicenseCode() );
	}

	public String getOptionalServerImplLicenseName() {
		return( getSchemaDefBuff().getOptionalServerImplLicenseName() );
	}

	public String getOptionalServerImplLicenseText() {
		return( getSchemaDefBuff().getOptionalServerImplLicenseText() );
	}

	public String getOptionalJSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJSchemaObjImport() );
	}

	public String getOptionalJSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalJSchemaObjInterface() );
	}

	public String getOptionalJSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJSchemaObjMembers() );
	}

	public String getOptionalJSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalJSchemaObjImplementation() );
	}

	public String getOptionalJDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjMembers() );
	}

	public String getOptionalJDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjImpl() );
	}

	public String getOptionalJDb2LUWSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjImport() );
	}

	public String getOptionalJMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJMSSqlSchemaObjMembers() );
	}

	public String getOptionalJMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJMSSqlSchemaObjImpl() );
	}

	public String getOptionalJMSSqlSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJMSSqlSchemaObjImport() );
	}

	public String getOptionalJMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJMySqlSchemaObjMembers() );
	}

	public String getOptionalJMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJMySqlSchemaObjImpl() );
	}

	public String getOptionalJMySqlSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJMySqlSchemaObjImport() );
	}

	public String getOptionalJOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJOracleSchemaObjMembers() );
	}

	public String getOptionalJOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJOracleSchemaObjImpl() );
	}

	public String getOptionalJOracleSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJOracleSchemaObjImport() );
	}

	public String getOptionalJPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJPgSqlSchemaObjMembers() );
	}

	public String getOptionalJPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJPgSqlSchemaObjImpl() );
	}

	public String getOptionalJPgSqlSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJPgSqlSchemaObjImport() );
	}

	public String getOptionalJRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJRamSchemaObjMembers() );
	}

	public String getOptionalJRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJRamSchemaObjImpl() );
	}

	public String getOptionalJRamSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJRamSchemaObjImport() );
	}

	public String getOptionalJXMsgSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgSchemaImport() );
	}

	public String getOptionalJXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalJXMsgSchemaFormatters() );
	}

	public String getOptionalJXMsgClientSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgClientSchemaImport() );
	}

	public String getOptionalJXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalJXMsgClientSchemaBody() );
	}

	public String getOptionalJXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaBody() );
	}

	public String getOptionalJXMsgRqstSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaImport() );
	}

	public String getOptionalJXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaWireParsers() );
	}

	public String getOptionalJXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaXsdSpec() );
	}

	public String getOptionalJXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaXsdElementList() );
	}

	public String getOptionalJXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaBody() );
	}

	public String getOptionalJXMsgRspnSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaImport() );
	}

	public String getOptionalJXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaWireParsers() );
	}

	public String getOptionalJXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaXsdElementList() );
	}

	public String getOptionalJXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaXsdSpec() );
	}

	public String getOptionalCppSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjInclude() );
	}

	public String getOptionalCppSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjInterface() );
	}

	public String getOptionalCppSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjMembers() );
	}

	public String getOptionalCppSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjImplementation() );
	}

	public String getOptionalCppDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjMembers() );
	}

	public String getOptionalCppDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjImpl() );
	}

	public String getOptionalCppDb2LUWSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjInclude() );
	}

	public String getOptionalCppMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjMembers() );
	}

	public String getOptionalCppMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjImpl() );
	}

	public String getOptionalCppMSSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjInclude() );
	}

	public String getOptionalCppMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppMySqlSchemaObjMembers() );
	}

	public String getOptionalCppMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppMySqlSchemaObjImpl() );
	}

	public String getOptionalCppMySqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppMySqlSchemaObjInclude() );
	}

	public String getOptionalCppOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppOracleSchemaObjMembers() );
	}

	public String getOptionalCppOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppOracleSchemaObjImpl() );
	}

	public String getOptionalCppOracleSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppOracleSchemaObjInclude() );
	}

	public String getOptionalCppPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjMembers() );
	}

	public String getOptionalCppPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjImpl() );
	}

	public String getOptionalCppPgSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjInclude() );
	}

	public String getOptionalCppRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppRamSchemaObjMembers() );
	}

	public String getOptionalCppRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppRamSchemaObjImpl() );
	}

	public String getOptionalCppRamSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppRamSchemaObjInclude() );
	}

	public String getOptionalCppXMsgSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgSchemaInclude() );
	}

	public String getOptionalCppXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalCppXMsgSchemaFormatters() );
	}

	public String getOptionalCppXMsgClientSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgClientSchemaInclude() );
	}

	public String getOptionalCppXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalCppXMsgClientSchemaBody() );
	}

	public String getOptionalCppXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaBody() );
	}

	public String getOptionalCppXMsgRqstSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaInclude() );
	}

	public String getOptionalCppXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaWireParsers() );
	}

	public String getOptionalCppXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaXsdSpec() );
	}

	public String getOptionalCppXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaXsdElementList() );
	}

	public String getOptionalCppXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaBody() );
	}

	public String getOptionalCppXMsgRspnSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaInclude() );
	}

	public String getOptionalCppXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaWireParsers() );
	}

	public String getOptionalCppXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaXsdElementList() );
	}

	public String getOptionalCppXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaXsdSpec() );
	}

	public String getOptionalHppSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjInclude() );
	}

	public String getOptionalHppSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjInterface() );
	}

	public String getOptionalHppSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjMembers() );
	}

	public String getOptionalHppSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjImplementation() );
	}

	public String getOptionalHppDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjMembers() );
	}

	public String getOptionalHppDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjImpl() );
	}

	public String getOptionalHppDb2LUWSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjInclude() );
	}

	public String getOptionalHppMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjMembers() );
	}

	public String getOptionalHppMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjImpl() );
	}

	public String getOptionalHppMSSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjInclude() );
	}

	public String getOptionalHppMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppMySqlSchemaObjMembers() );
	}

	public String getOptionalHppMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppMySqlSchemaObjImpl() );
	}

	public String getOptionalHppMySqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppMySqlSchemaObjInclude() );
	}

	public String getOptionalHppOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppOracleSchemaObjMembers() );
	}

	public String getOptionalHppOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppOracleSchemaObjImpl() );
	}

	public String getOptionalHppOracleSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppOracleSchemaObjInclude() );
	}

	public String getOptionalHppPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjMembers() );
	}

	public String getOptionalHppPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjImpl() );
	}

	public String getOptionalHppPgSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjInclude() );
	}

	public String getOptionalHppRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppRamSchemaObjMembers() );
	}

	public String getOptionalHppRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppRamSchemaObjImpl() );
	}

	public String getOptionalHppRamSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppRamSchemaObjInclude() );
	}

	public String getOptionalHppXMsgSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgSchemaInclude() );
	}

	public String getOptionalHppXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalHppXMsgSchemaFormatters() );
	}

	public String getOptionalHppXMsgClientSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgClientSchemaInclude() );
	}

	public String getOptionalHppXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalHppXMsgClientSchemaBody() );
	}

	public String getOptionalHppXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaBody() );
	}

	public String getOptionalHppXMsgRqstSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaInclude() );
	}

	public String getOptionalHppXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaWireParsers() );
	}

	public String getOptionalHppXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaXsdSpec() );
	}

	public String getOptionalHppXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaXsdElementList() );
	}

	public String getOptionalHppXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaBody() );
	}

	public String getOptionalHppXMsgRspnSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaInclude() );
	}

	public String getOptionalHppXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaWireParsers() );
	}

	public String getOptionalHppXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaXsdElementList() );
	}

	public String getOptionalHppXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaXsdSpec() );
	}

	public String getOptionalCsSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjUsing() );
	}

	public String getOptionalCsSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjInterface() );
	}

	public String getOptionalCsSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjMembers() );
	}

	public String getOptionalCsSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjImplementation() );
	}

	public String getOptionalCsDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjMembers() );
	}

	public String getOptionalCsDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjImpl() );
	}

	public String getOptionalCsDb2LUWSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjUsing() );
	}

	public String getOptionalCsMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjMembers() );
	}

	public String getOptionalCsMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjImpl() );
	}

	public String getOptionalCsMSSqlSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjUsing() );
	}

	public String getOptionalCsMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsMySqlSchemaObjMembers() );
	}

	public String getOptionalCsMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsMySqlSchemaObjImpl() );
	}

	public String getOptionalCsMySqlSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsMySqlSchemaObjUsing() );
	}

	public String getOptionalCsOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsOracleSchemaObjMembers() );
	}

	public String getOptionalCsOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsOracleSchemaObjImpl() );
	}

	public String getOptionalCsOracleSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsOracleSchemaObjUsing() );
	}

	public String getOptionalCsPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjMembers() );
	}

	public String getOptionalCsPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjImpl() );
	}

	public String getOptionalCsPgSqlSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjUsing() );
	}

	public String getOptionalCsRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsRamSchemaObjMembers() );
	}

	public String getOptionalCsRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsRamSchemaObjImpl() );
	}

	public String getOptionalCsRamSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsRamSchemaObjUsing() );
	}

	public String getOptionalCsXMsgSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgSchemaUsing() );
	}

	public String getOptionalCsXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalCsXMsgSchemaFormatters() );
	}

	public String getOptionalCsXMsgClientSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgClientSchemaUsing() );
	}

	public String getOptionalCsXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalCsXMsgClientSchemaBody() );
	}

	public String getOptionalCsXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaBody() );
	}

	public String getOptionalCsXMsgRqstSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaUsing() );
	}

	public String getOptionalCsXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaWireParsers() );
	}

	public String getOptionalCsXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaXsdSpec() );
	}

	public String getOptionalCsXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaXsdElementList() );
	}

	public String getOptionalCsXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaBody() );
	}

	public String getOptionalCsXMsgRspnSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaUsing() );
	}

	public String getOptionalCsXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaWireParsers() );
	}

	public String getOptionalCsXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaXsdElementList() );
	}

	public String getOptionalCsXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaXsdSpec() );
	}

	public IYCFIntMinorVersionObj getRequiredContainerMinorVersion() {
		return( getRequiredContainerMinorVersion( false ) );
	}

	public IYCFIntMinorVersionObj getRequiredContainerMinorVersion( boolean forceRead ) {
		if( ( requiredContainerMinorVersion == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerMinorVersion = ((IYCFBamSchemaObj)schema).getMinorVersionTableObj().readMinorVersionByIdIdx( getPKey().getRequiredTenantId(),
					getSchemaDefBuff().getRequiredMinorVersionId(), forceRead );
			}
		}
		return( requiredContainerMinorVersion );
	}

	public List<IYCFBamTableObj> getOptionalComponentsTables() {
		List<IYCFBamTableObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableBySchemaDefIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamTableObj> getOptionalComponentsTables( boolean forceRead ) {
		List<IYCFBamTableObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableBySchemaDefIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamValueObj> getOptionalComponentsTypes() {
		List<IYCFBamValueObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamValueObj> getOptionalComponentsTypes( boolean forceRead ) {
		List<IYCFBamValueObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamSchemaRefObj> getOptionalComponentsSchemaRefs() {
		List<IYCFBamSchemaRefObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSchemaRefTableObj().readSchemaRefBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamSchemaRefObj> getOptionalComponentsSchemaRefs( boolean forceRead ) {
		List<IYCFBamSchemaRefObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSchemaRefTableObj().readSchemaRefBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamTweakObj> getOptionalComponentsTweaks() {
		List<IYCFBamTweakObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTweakTableObj().readTweakByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamTweakObj> getOptionalComponentsTweaks( boolean forceRead ) {
		List<IYCFBamTweakObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTweakTableObj().readTweakByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamSchemaRoleObj> getOptionalComponentsRoles() {
		List<IYCFBamSchemaRoleObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSchemaRoleTableObj().readSchemaRoleBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamSchemaRoleObj> getOptionalComponentsRoles( boolean forceRead ) {
		List<IYCFBamSchemaRoleObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSchemaRoleTableObj().readSchemaRoleBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFSecTenantObj getRequiredOwnerCTenant() {
		return( getRequiredOwnerCTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerCTenant( boolean forceRead ) {
		if( ( requiredOwnerCTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerCTenant = ((IYCFBamSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerCTenant );
	}
}
