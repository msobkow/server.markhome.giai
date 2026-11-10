// Description: Java 11 base object instance implementation for YCFBam Table.

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

public class YCFBamTableObj
	extends YCFBamScopeObj
	implements IYCFBamTableObj
{
	public final static String CLASS_CODE = "a807";
	protected IYCFBamSchemaDefObj requiredContainerSchemaDef;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamIndexObj optionalLookupLookupIndex;
	protected IYCFBamIndexObj optionalLookupAltIndex;
	protected IYCFBamTableObj optionalLookupQualTable;
	protected IYCFBamIndexObj optionalLookupPrimaryIndex;

	public YCFBamTableObj() {
		super();
		requiredContainerSchemaDef = null;
		optionalLookupDefSchema = null;
		optionalLookupLookupIndex = null;
		optionalLookupAltIndex = null;
		optionalLookupQualTable = null;
		optionalLookupPrimaryIndex = null;
	}

	public YCFBamTableObj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerSchemaDef = null;
		optionalLookupDefSchema = null;
		optionalLookupLookupIndex = null;
		optionalLookupAltIndex = null;
		optionalLookupQualTable = null;
		optionalLookupPrimaryIndex = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Table" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getRelationTableObj().readRelationByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getIndexTableObj().readIndexByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getValueTableObj().readValueByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getChainTableObj().readChainByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getServerMethodTableObj().readServerMethodByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTweakTableObj().readTweakByUNameIdx( getRequiredTenantId(),
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
			else if( container instanceof IYCFBamSchemaDefObj ) {
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
		IYCFBamTableObj retobj = ((IYCFBamSchemaObj)schema).getTableTableObj().realiseTable(
			(IYCFBamTableObj)this );
		return( (IYCFBamScopeObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getTableTableObj().reallyDeepDisposeTable( (IYCFBamTableObj)this );
	}

	public IYCFBamScopeObj read() {
		IYCFBamTableObj retobj = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamScopeObj read( boolean forceRead ) {
		IYCFBamTableObj retobj = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamTableTableObj getTableTable() {
		return( ((IYCFBamSchemaObj)schema).getTableTableObj() );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFBamTableBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamTableBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerSchemaDef = null;
		optionalLookupDefSchema = null;
		optionalLookupLookupIndex = null;
		optionalLookupAltIndex = null;
		optionalLookupQualTable = null;
		optionalLookupPrimaryIndex = null;
	}

	public YCFBamTableBuff getTableBuff() {
		return( (YCFBamTableBuff)getBuff() );
	}

	public IYCFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamTableObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamTableObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getTableTableObj().lockTable( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getTableTableObj().newEditInstance( lockobj );
		return( (IYCFBamScopeEditObj)edit );
	}

	public IYCFBamTableEditObj getEditAsTable() {
		return( (IYCFBamTableEditObj)edit );
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

	public long getRequiredSchemaDefId() {
		return( getTableBuff().getRequiredSchemaDefId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getTableBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getTableBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getTableBuff().getRequiredName() );
	}

	public String getOptionalDbName() {
		return( getTableBuff().getOptionalDbName() );
	}

	public String getOptionalShortName() {
		return( getTableBuff().getOptionalShortName() );
	}

	public String getOptionalLabel() {
		return( getTableBuff().getOptionalLabel() );
	}

	public String getOptionalShortDescription() {
		return( getTableBuff().getOptionalShortDescription() );
	}

	public String getOptionalDescription() {
		return( getTableBuff().getOptionalDescription() );
	}

	public boolean getRequiredPageData() {
		return( getTableBuff().getRequiredPageData() );
	}

	public Long getOptionalPrimaryIndexTenantId() {
		return( getTableBuff().getOptionalPrimaryIndexTenantId() );
	}

	public Long getOptionalPrimaryIndexId() {
		return( getTableBuff().getOptionalPrimaryIndexId() );
	}

	public String getRequiredTableClassCode() {
		return( getTableBuff().getRequiredTableClassCode() );
	}

	public Long getOptionalLookupIndexTenantId() {
		return( getTableBuff().getOptionalLookupIndexTenantId() );
	}

	public Long getOptionalLookupIndexId() {
		return( getTableBuff().getOptionalLookupIndexId() );
	}

	public Long getOptionalAltIndexTenantId() {
		return( getTableBuff().getOptionalAltIndexTenantId() );
	}

	public Long getOptionalAltIndexId() {
		return( getTableBuff().getOptionalAltIndexId() );
	}

	public Long getOptionalQualifyingTenantId() {
		return( getTableBuff().getOptionalQualifyingTenantId() );
	}

	public Long getOptionalQualifyingTableId() {
		return( getTableBuff().getOptionalQualifyingTableId() );
	}

	public boolean getRequiredIsInstantiable() {
		return( getTableBuff().getRequiredIsInstantiable() );
	}

	public boolean getRequiredHasHistory() {
		return( getTableBuff().getRequiredHasHistory() );
	}

	public boolean getRequiredHasAuditColumns() {
		return( getTableBuff().getRequiredHasAuditColumns() );
	}

	public boolean getRequiredIsMutable() {
		return( getTableBuff().getRequiredIsMutable() );
	}

	public boolean getRequiredIsServerOnly() {
		return( getTableBuff().getRequiredIsServerOnly() );
	}

	public IYCFBamSchema.LoaderBehaviourEnum getRequiredLoaderBehaviour() {
		return( getTableBuff().getRequiredLoaderBehaviour() );
	}

	public IYCFBamSchema.SecScopeEnum getRequiredSecScope() {
		return( getTableBuff().getRequiredSecScope() );
	}

	public IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return( getTableBuff().getRequiredCodeVis() );
	}

	public String getOptionalJObjMembers() {
		return( getTableBuff().getOptionalJObjMembers() );
	}

	public String getOptionalJObjInterface() {
		return( getTableBuff().getOptionalJObjInterface() );
	}

	public String getOptionalJObjImport() {
		return( getTableBuff().getOptionalJObjImport() );
	}

	public String getOptionalJObjImplementation() {
		return( getTableBuff().getOptionalJObjImplementation() );
	}

	public String getOptionalJEditObjMembers() {
		return( getTableBuff().getOptionalJEditObjMembers() );
	}

	public String getOptionalJEditObjInterface() {
		return( getTableBuff().getOptionalJEditObjInterface() );
	}

	public String getOptionalJEditObjImport() {
		return( getTableBuff().getOptionalJEditObjImport() );
	}

	public String getOptionalJEditObjImplementation() {
		return( getTableBuff().getOptionalJEditObjImplementation() );
	}

	public String getOptionalJTableImport() {
		return( getTableBuff().getOptionalJTableImport() );
	}

	public String getOptionalJTableMembers() {
		return( getTableBuff().getOptionalJTableMembers() );
	}

	public String getOptionalJTableInterface() {
		return( getTableBuff().getOptionalJTableInterface() );
	}

	public String getOptionalJTableImplementation() {
		return( getTableBuff().getOptionalJTableImplementation() );
	}

	public String getOptionalJTableObjImport() {
		return( getTableBuff().getOptionalJTableObjImport() );
	}

	public String getOptionalJTableObjMembers() {
		return( getTableBuff().getOptionalJTableObjMembers() );
	}

	public String getOptionalJTableObjInterface() {
		return( getTableBuff().getOptionalJTableObjInterface() );
	}

	public String getOptionalJTableObjImplementation() {
		return( getTableBuff().getOptionalJTableObjImplementation() );
	}

	public String getOptionalJDb2LUWTableImport() {
		return( getTableBuff().getOptionalJDb2LUWTableImport() );
	}

	public String getOptionalJDb2LUWTableMembers() {
		return( getTableBuff().getOptionalJDb2LUWTableMembers() );
	}

	public String getOptionalJDb2LUWTableImplementation() {
		return( getTableBuff().getOptionalJDb2LUWTableImplementation() );
	}

	public String getOptionalJMSSqlTableImport() {
		return( getTableBuff().getOptionalJMSSqlTableImport() );
	}

	public String getOptionalJMSSqlTableMembers() {
		return( getTableBuff().getOptionalJMSSqlTableMembers() );
	}

	public String getOptionalJMSSqlTableImplementation() {
		return( getTableBuff().getOptionalJMSSqlTableImplementation() );
	}

	public String getOptionalJMySqlTableImport() {
		return( getTableBuff().getOptionalJMySqlTableImport() );
	}

	public String getOptionalJMySqlTableMembers() {
		return( getTableBuff().getOptionalJMySqlTableMembers() );
	}

	public String getOptionalJMySqlTableImplementation() {
		return( getTableBuff().getOptionalJMySqlTableImplementation() );
	}

	public String getOptionalJOracleTableImport() {
		return( getTableBuff().getOptionalJOracleTableImport() );
	}

	public String getOptionalJOracleTableMembers() {
		return( getTableBuff().getOptionalJOracleTableMembers() );
	}

	public String getOptionalJOracleTableImplementation() {
		return( getTableBuff().getOptionalJOracleTableImplementation() );
	}

	public String getOptionalJPgSqlTableImport() {
		return( getTableBuff().getOptionalJPgSqlTableImport() );
	}

	public String getOptionalJPgSqlTableMembers() {
		return( getTableBuff().getOptionalJPgSqlTableMembers() );
	}

	public String getOptionalJPgSqlTableImplementation() {
		return( getTableBuff().getOptionalJPgSqlTableImplementation() );
	}

	public String getOptionalJRamTableImport() {
		return( getTableBuff().getOptionalJRamTableImport() );
	}

	public String getOptionalJRamTableMembers() {
		return( getTableBuff().getOptionalJRamTableMembers() );
	}

	public String getOptionalJRamTableImplementation() {
		return( getTableBuff().getOptionalJRamTableImplementation() );
	}

	public String getOptionalJSaxLoaderImport() {
		return( getTableBuff().getOptionalJSaxLoaderImport() );
	}

	public String getOptionalJSaxLoaderStartElement() {
		return( getTableBuff().getOptionalJSaxLoaderStartElement() );
	}

	public String getOptionalJSaxLoaderEndElement() {
		return( getTableBuff().getOptionalJSaxLoaderEndElement() );
	}

	public String getOptionalJXMsgTableImport() {
		return( getTableBuff().getOptionalJXMsgTableImport() );
	}

	public String getOptionalJXMsgTableFormatters() {
		return( getTableBuff().getOptionalJXMsgTableFormatters() );
	}

	public String getOptionalJXMsgRqstTableImport() {
		return( getTableBuff().getOptionalJXMsgRqstTableImport() );
	}

	public String getOptionalJXMsgRspnTableImport() {
		return( getTableBuff().getOptionalJXMsgRspnTableImport() );
	}

	public String getOptionalJXMsgClientTableImport() {
		return( getTableBuff().getOptionalJXMsgClientTableImport() );
	}

	public String getOptionalJXMsgRqstTableBody() {
		return( getTableBuff().getOptionalJXMsgRqstTableBody() );
	}

	public String getOptionalJXMsgRspnTableBody() {
		return( getTableBuff().getOptionalJXMsgRspnTableBody() );
	}

	public String getOptionalJXMsgClientTableBody() {
		return( getTableBuff().getOptionalJXMsgClientTableBody() );
	}

	public String getOptionalCppObjMembers() {
		return( getTableBuff().getOptionalCppObjMembers() );
	}

	public String getOptionalCppObjInterface() {
		return( getTableBuff().getOptionalCppObjInterface() );
	}

	public String getOptionalCppObjInclude() {
		return( getTableBuff().getOptionalCppObjInclude() );
	}

	public String getOptionalCppObjImplementation() {
		return( getTableBuff().getOptionalCppObjImplementation() );
	}

	public String getOptionalCppEditObjMembers() {
		return( getTableBuff().getOptionalCppEditObjMembers() );
	}

	public String getOptionalCppEditObjInterface() {
		return( getTableBuff().getOptionalCppEditObjInterface() );
	}

	public String getOptionalCppEditObjInclude() {
		return( getTableBuff().getOptionalCppEditObjInclude() );
	}

	public String getOptionalCppEditObjImplementation() {
		return( getTableBuff().getOptionalCppEditObjImplementation() );
	}

	public String getOptionalCppTableInclude() {
		return( getTableBuff().getOptionalCppTableInclude() );
	}

	public String getOptionalCppTableMembers() {
		return( getTableBuff().getOptionalCppTableMembers() );
	}

	public String getOptionalCppTableInterface() {
		return( getTableBuff().getOptionalCppTableInterface() );
	}

	public String getOptionalCppTableImplementation() {
		return( getTableBuff().getOptionalCppTableImplementation() );
	}

	public String getOptionalCppTableObjInclude() {
		return( getTableBuff().getOptionalCppTableObjInclude() );
	}

	public String getOptionalCppTableObjMembers() {
		return( getTableBuff().getOptionalCppTableObjMembers() );
	}

	public String getOptionalCppTableObjInterface() {
		return( getTableBuff().getOptionalCppTableObjInterface() );
	}

	public String getOptionalCppTableObjImplementation() {
		return( getTableBuff().getOptionalCppTableObjImplementation() );
	}

	public String getOptionalCppDb2LUWTableInclude() {
		return( getTableBuff().getOptionalCppDb2LUWTableInclude() );
	}

	public String getOptionalCppDb2LUWTableMembers() {
		return( getTableBuff().getOptionalCppDb2LUWTableMembers() );
	}

	public String getOptionalCppDb2LUWTableImplementation() {
		return( getTableBuff().getOptionalCppDb2LUWTableImplementation() );
	}

	public String getOptionalCppMSSqlTableInclude() {
		return( getTableBuff().getOptionalCppMSSqlTableInclude() );
	}

	public String getOptionalCppMSSqlTableMembers() {
		return( getTableBuff().getOptionalCppMSSqlTableMembers() );
	}

	public String getOptionalCppMSSqlTableImplementation() {
		return( getTableBuff().getOptionalCppMSSqlTableImplementation() );
	}

	public String getOptionalCppMySqlTableInclude() {
		return( getTableBuff().getOptionalCppMySqlTableInclude() );
	}

	public String getOptionalCppMySqlTableMembers() {
		return( getTableBuff().getOptionalCppMySqlTableMembers() );
	}

	public String getOptionalCppMySqlTableImplementation() {
		return( getTableBuff().getOptionalCppMySqlTableImplementation() );
	}

	public String getOptionalCppOracleTableInclude() {
		return( getTableBuff().getOptionalCppOracleTableInclude() );
	}

	public String getOptionalCppOracleTableMembers() {
		return( getTableBuff().getOptionalCppOracleTableMembers() );
	}

	public String getOptionalCppOracleTableImplementation() {
		return( getTableBuff().getOptionalCppOracleTableImplementation() );
	}

	public String getOptionalCppPgSqlTableInclude() {
		return( getTableBuff().getOptionalCppPgSqlTableInclude() );
	}

	public String getOptionalCppPgSqlTableMembers() {
		return( getTableBuff().getOptionalCppPgSqlTableMembers() );
	}

	public String getOptionalCppPgSqlTableImplementation() {
		return( getTableBuff().getOptionalCppPgSqlTableImplementation() );
	}

	public String getOptionalCppRamTableInclude() {
		return( getTableBuff().getOptionalCppRamTableInclude() );
	}

	public String getOptionalCppRamTableMembers() {
		return( getTableBuff().getOptionalCppRamTableMembers() );
	}

	public String getOptionalCppRamTableImplementation() {
		return( getTableBuff().getOptionalCppRamTableImplementation() );
	}

	public String getOptionalCppSaxLoaderInclude() {
		return( getTableBuff().getOptionalCppSaxLoaderInclude() );
	}

	public String getOptionalCppSaxLoaderStartElement() {
		return( getTableBuff().getOptionalCppSaxLoaderStartElement() );
	}

	public String getOptionalCppSaxLoaderEndElement() {
		return( getTableBuff().getOptionalCppSaxLoaderEndElement() );
	}

	public String getOptionalCppXMsgTableInclude() {
		return( getTableBuff().getOptionalCppXMsgTableInclude() );
	}

	public String getOptionalCppXMsgTableFormatters() {
		return( getTableBuff().getOptionalCppXMsgTableFormatters() );
	}

	public String getOptionalCppXMsgRqstTableInclude() {
		return( getTableBuff().getOptionalCppXMsgRqstTableInclude() );
	}

	public String getOptionalCppXMsgRspnTableInclude() {
		return( getTableBuff().getOptionalCppXMsgRspnTableInclude() );
	}

	public String getOptionalCppXMsgClientTableInclude() {
		return( getTableBuff().getOptionalCppXMsgClientTableInclude() );
	}

	public String getOptionalCppXMsgRqstTableBody() {
		return( getTableBuff().getOptionalCppXMsgRqstTableBody() );
	}

	public String getOptionalCppXMsgRspnTableBody() {
		return( getTableBuff().getOptionalCppXMsgRspnTableBody() );
	}

	public String getOptionalCppXMsgClientTableBody() {
		return( getTableBuff().getOptionalCppXMsgClientTableBody() );
	}

	public String getOptionalHppObjMembers() {
		return( getTableBuff().getOptionalHppObjMembers() );
	}

	public String getOptionalHppObjInterface() {
		return( getTableBuff().getOptionalHppObjInterface() );
	}

	public String getOptionalHppObjInclude() {
		return( getTableBuff().getOptionalHppObjInclude() );
	}

	public String getOptionalHppObjImplementation() {
		return( getTableBuff().getOptionalHppObjImplementation() );
	}

	public String getOptionalHppEditObjMembers() {
		return( getTableBuff().getOptionalHppEditObjMembers() );
	}

	public String getOptionalHppEditObjInterface() {
		return( getTableBuff().getOptionalHppEditObjInterface() );
	}

	public String getOptionalHppEditObjInclude() {
		return( getTableBuff().getOptionalHppEditObjInclude() );
	}

	public String getOptionalHppEditObjImplementation() {
		return( getTableBuff().getOptionalHppEditObjImplementation() );
	}

	public String getOptionalHppTableInclude() {
		return( getTableBuff().getOptionalHppTableInclude() );
	}

	public String getOptionalHppTableMembers() {
		return( getTableBuff().getOptionalHppTableMembers() );
	}

	public String getOptionalHppTableInterface() {
		return( getTableBuff().getOptionalHppTableInterface() );
	}

	public String getOptionalHppTableImplementation() {
		return( getTableBuff().getOptionalHppTableImplementation() );
	}

	public String getOptionalHppTableObjInclude() {
		return( getTableBuff().getOptionalHppTableObjInclude() );
	}

	public String getOptionalHppTableObjMembers() {
		return( getTableBuff().getOptionalHppTableObjMembers() );
	}

	public String getOptionalHppTableObjInterface() {
		return( getTableBuff().getOptionalHppTableObjInterface() );
	}

	public String getOptionalHppTableObjImplementation() {
		return( getTableBuff().getOptionalHppTableObjImplementation() );
	}

	public String getOptionalHppDb2LUWTableInclude() {
		return( getTableBuff().getOptionalHppDb2LUWTableInclude() );
	}

	public String getOptionalHppDb2LUWTableMembers() {
		return( getTableBuff().getOptionalHppDb2LUWTableMembers() );
	}

	public String getOptionalHppDb2LUWTableImplementation() {
		return( getTableBuff().getOptionalHppDb2LUWTableImplementation() );
	}

	public String getOptionalHppMSSqlTableInclude() {
		return( getTableBuff().getOptionalHppMSSqlTableInclude() );
	}

	public String getOptionalHppMSSqlTableMembers() {
		return( getTableBuff().getOptionalHppMSSqlTableMembers() );
	}

	public String getOptionalHppMSSqlTableImplementation() {
		return( getTableBuff().getOptionalHppMSSqlTableImplementation() );
	}

	public String getOptionalHppMySqlTableInclude() {
		return( getTableBuff().getOptionalHppMySqlTableInclude() );
	}

	public String getOptionalHppMySqlTableMembers() {
		return( getTableBuff().getOptionalHppMySqlTableMembers() );
	}

	public String getOptionalHppMySqlTableImplementation() {
		return( getTableBuff().getOptionalHppMySqlTableImplementation() );
	}

	public String getOptionalHppOracleTableInclude() {
		return( getTableBuff().getOptionalHppOracleTableInclude() );
	}

	public String getOptionalHppOracleTableMembers() {
		return( getTableBuff().getOptionalHppOracleTableMembers() );
	}

	public String getOptionalHppOracleTableImplementation() {
		return( getTableBuff().getOptionalHppOracleTableImplementation() );
	}

	public String getOptionalHppPgSqlTableInclude() {
		return( getTableBuff().getOptionalHppPgSqlTableInclude() );
	}

	public String getOptionalHppPgSqlTableMembers() {
		return( getTableBuff().getOptionalHppPgSqlTableMembers() );
	}

	public String getOptionalHppPgSqlTableImplementation() {
		return( getTableBuff().getOptionalHppPgSqlTableImplementation() );
	}

	public String getOptionalHppRamTableInclude() {
		return( getTableBuff().getOptionalHppRamTableInclude() );
	}

	public String getOptionalHppRamTableMembers() {
		return( getTableBuff().getOptionalHppRamTableMembers() );
	}

	public String getOptionalHppRamTableImplementation() {
		return( getTableBuff().getOptionalHppRamTableImplementation() );
	}

	public String getOptionalHppSaxLoaderInclude() {
		return( getTableBuff().getOptionalHppSaxLoaderInclude() );
	}

	public String getOptionalHppSaxLoaderStartElement() {
		return( getTableBuff().getOptionalHppSaxLoaderStartElement() );
	}

	public String getOptionalHppSaxLoaderEndElement() {
		return( getTableBuff().getOptionalHppSaxLoaderEndElement() );
	}

	public String getOptionalHppXMsgTableInclude() {
		return( getTableBuff().getOptionalHppXMsgTableInclude() );
	}

	public String getOptionalHppXMsgTableFormatters() {
		return( getTableBuff().getOptionalHppXMsgTableFormatters() );
	}

	public String getOptionalHppXMsgRqstTableInclude() {
		return( getTableBuff().getOptionalHppXMsgRqstTableInclude() );
	}

	public String getOptionalHppXMsgRspnTableInclude() {
		return( getTableBuff().getOptionalHppXMsgRspnTableInclude() );
	}

	public String getOptionalHppXMsgClientTableInclude() {
		return( getTableBuff().getOptionalHppXMsgClientTableInclude() );
	}

	public String getOptionalHppXMsgRqstTableBody() {
		return( getTableBuff().getOptionalHppXMsgRqstTableBody() );
	}

	public String getOptionalHppXMsgRspnTableBody() {
		return( getTableBuff().getOptionalHppXMsgRspnTableBody() );
	}

	public String getOptionalHppXMsgClientTableBody() {
		return( getTableBuff().getOptionalHppXMsgClientTableBody() );
	}

	public String getOptionalCsObjMembers() {
		return( getTableBuff().getOptionalCsObjMembers() );
	}

	public String getOptionalCsObjInterface() {
		return( getTableBuff().getOptionalCsObjInterface() );
	}

	public String getOptionalCsObjUsing() {
		return( getTableBuff().getOptionalCsObjUsing() );
	}

	public String getOptionalCsObjImplementation() {
		return( getTableBuff().getOptionalCsObjImplementation() );
	}

	public String getOptionalCsEditObjMembers() {
		return( getTableBuff().getOptionalCsEditObjMembers() );
	}

	public String getOptionalCsEditObjInterface() {
		return( getTableBuff().getOptionalCsEditObjInterface() );
	}

	public String getOptionalCsEditObjUsing() {
		return( getTableBuff().getOptionalCsEditObjUsing() );
	}

	public String getOptionalCsEditObjImplementation() {
		return( getTableBuff().getOptionalCsEditObjImplementation() );
	}

	public String getOptionalCsTableUsing() {
		return( getTableBuff().getOptionalCsTableUsing() );
	}

	public String getOptionalCsTableMembers() {
		return( getTableBuff().getOptionalCsTableMembers() );
	}

	public String getOptionalCsTableInterface() {
		return( getTableBuff().getOptionalCsTableInterface() );
	}

	public String getOptionalCsTableImplementation() {
		return( getTableBuff().getOptionalCsTableImplementation() );
	}

	public String getOptionalCsTableObjUsing() {
		return( getTableBuff().getOptionalCsTableObjUsing() );
	}

	public String getOptionalCsTableObjMembers() {
		return( getTableBuff().getOptionalCsTableObjMembers() );
	}

	public String getOptionalCsTableObjInterface() {
		return( getTableBuff().getOptionalCsTableObjInterface() );
	}

	public String getOptionalCsTableObjImplementation() {
		return( getTableBuff().getOptionalCsTableObjImplementation() );
	}

	public String getOptionalCsDb2LUWTableUsing() {
		return( getTableBuff().getOptionalCsDb2LUWTableUsing() );
	}

	public String getOptionalCsDb2LUWTableMembers() {
		return( getTableBuff().getOptionalCsDb2LUWTableMembers() );
	}

	public String getOptionalCsDb2LUWTableImplementation() {
		return( getTableBuff().getOptionalCsDb2LUWTableImplementation() );
	}

	public String getOptionalCsMSSqlTableUsing() {
		return( getTableBuff().getOptionalCsMSSqlTableUsing() );
	}

	public String getOptionalCsMSSqlTableMembers() {
		return( getTableBuff().getOptionalCsMSSqlTableMembers() );
	}

	public String getOptionalCsMSSqlTableImplementation() {
		return( getTableBuff().getOptionalCsMSSqlTableImplementation() );
	}

	public String getOptionalCsMySqlTableUsing() {
		return( getTableBuff().getOptionalCsMySqlTableUsing() );
	}

	public String getOptionalCsMySqlTableMembers() {
		return( getTableBuff().getOptionalCsMySqlTableMembers() );
	}

	public String getOptionalCsMySqlTableImplementation() {
		return( getTableBuff().getOptionalCsMySqlTableImplementation() );
	}

	public String getOptionalCsOracleTableUsing() {
		return( getTableBuff().getOptionalCsOracleTableUsing() );
	}

	public String getOptionalCsOracleTableMembers() {
		return( getTableBuff().getOptionalCsOracleTableMembers() );
	}

	public String getOptionalCsOracleTableImplementation() {
		return( getTableBuff().getOptionalCsOracleTableImplementation() );
	}

	public String getOptionalCsPgSqlTableUsing() {
		return( getTableBuff().getOptionalCsPgSqlTableUsing() );
	}

	public String getOptionalCsPgSqlTableMembers() {
		return( getTableBuff().getOptionalCsPgSqlTableMembers() );
	}

	public String getOptionalCsPgSqlTableImplementation() {
		return( getTableBuff().getOptionalCsPgSqlTableImplementation() );
	}

	public String getOptionalCsRamTableUsing() {
		return( getTableBuff().getOptionalCsRamTableUsing() );
	}

	public String getOptionalCsRamTableMembers() {
		return( getTableBuff().getOptionalCsRamTableMembers() );
	}

	public String getOptionalCsRamTableImplementation() {
		return( getTableBuff().getOptionalCsRamTableImplementation() );
	}

	public String getOptionalCsSaxLoaderUsing() {
		return( getTableBuff().getOptionalCsSaxLoaderUsing() );
	}

	public String getOptionalCsSaxLoaderStartElement() {
		return( getTableBuff().getOptionalCsSaxLoaderStartElement() );
	}

	public String getOptionalCsSaxLoaderEndElement() {
		return( getTableBuff().getOptionalCsSaxLoaderEndElement() );
	}

	public String getOptionalCsXMsgTableUsing() {
		return( getTableBuff().getOptionalCsXMsgTableUsing() );
	}

	public String getOptionalCsXMsgTableFormatters() {
		return( getTableBuff().getOptionalCsXMsgTableFormatters() );
	}

	public String getOptionalCsXMsgRqstTableUsing() {
		return( getTableBuff().getOptionalCsXMsgRqstTableUsing() );
	}

	public String getOptionalCsXMsgRspnTableUsing() {
		return( getTableBuff().getOptionalCsXMsgRspnTableUsing() );
	}

	public String getOptionalCsXMsgClientTableUsing() {
		return( getTableBuff().getOptionalCsXMsgClientTableUsing() );
	}

	public String getOptionalCsXMsgRqstTableBody() {
		return( getTableBuff().getOptionalCsXMsgRqstTableBody() );
	}

	public String getOptionalCsXMsgRspnTableBody() {
		return( getTableBuff().getOptionalCsXMsgRspnTableBody() );
	}

	public String getOptionalCsXMsgClientTableBody() {
		return( getTableBuff().getOptionalCsXMsgClientTableBody() );
	}

	public IYCFBamSchemaDefObj getRequiredContainerSchemaDef() {
		return( getRequiredContainerSchemaDef( false ) );
	}

	public IYCFBamSchemaDefObj getRequiredContainerSchemaDef( boolean forceRead ) {
		if( ( requiredContainerSchemaDef == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerSchemaDef = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
					getTableBuff().getRequiredSchemaDefId(), forceRead );
			}
		}
		return( requiredContainerSchemaDef );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getTableBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getTableBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getTableBuff().getOptionalDefSchemaTenantId(),
					getTableBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public List<IYCFBamRelationObj> getOptionalComponentsRelation() {
		List<IYCFBamRelationObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationTableObj().readRelationByRelTableIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamRelationObj> getOptionalComponentsRelation( boolean forceRead ) {
		List<IYCFBamRelationObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationTableObj().readRelationByRelTableIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamIndexObj getOptionalLookupLookupIndex() {
		return( getOptionalLookupLookupIndex( false ) );
	}

	public IYCFBamIndexObj getOptionalLookupLookupIndex( boolean forceRead ) {
		if( ( optionalLookupLookupIndex == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getTableBuff().getOptionalLookupIndexTenantId() == null ) {
				anyMissing = true;
			}
			if( getTableBuff().getOptionalLookupIndexId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupLookupIndex = ((IYCFBamSchemaObj)schema).getIndexTableObj().readIndexByIdIdx( getTableBuff().getOptionalLookupIndexTenantId(),
					getTableBuff().getOptionalLookupIndexId(), forceRead );
			}
		}
		return( optionalLookupLookupIndex );
	}

	public IYCFBamIndexObj getOptionalLookupAltIndex() {
		return( getOptionalLookupAltIndex( false ) );
	}

	public IYCFBamIndexObj getOptionalLookupAltIndex( boolean forceRead ) {
		if( ( optionalLookupAltIndex == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getTableBuff().getOptionalAltIndexTenantId() == null ) {
				anyMissing = true;
			}
			if( getTableBuff().getOptionalAltIndexId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupAltIndex = ((IYCFBamSchemaObj)schema).getIndexTableObj().readIndexByIdIdx( getTableBuff().getOptionalAltIndexTenantId(),
					getTableBuff().getOptionalAltIndexId(), forceRead );
			}
		}
		return( optionalLookupAltIndex );
	}

	public IYCFBamTableObj getOptionalLookupQualTable() {
		return( getOptionalLookupQualTable( false ) );
	}

	public IYCFBamTableObj getOptionalLookupQualTable( boolean forceRead ) {
		if( ( optionalLookupQualTable == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getTableBuff().getOptionalQualifyingTenantId() == null ) {
				anyMissing = true;
			}
			if( getTableBuff().getOptionalQualifyingTableId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupQualTable = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getTableBuff().getOptionalQualifyingTenantId(),
					getTableBuff().getOptionalQualifyingTableId(), forceRead );
			}
		}
		return( optionalLookupQualTable );
	}

	public List<IYCFBamIndexObj> getOptionalComponentsIndex() {
		List<IYCFBamIndexObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getIndexTableObj().readIndexByIdxTableIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamIndexObj> getOptionalComponentsIndex( boolean forceRead ) {
		List<IYCFBamIndexObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getIndexTableObj().readIndexByIdxTableIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamIndexObj getOptionalLookupPrimaryIndex() {
		return( getOptionalLookupPrimaryIndex( false ) );
	}

	public IYCFBamIndexObj getOptionalLookupPrimaryIndex( boolean forceRead ) {
		if( ( optionalLookupPrimaryIndex == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getTableBuff().getOptionalPrimaryIndexTenantId() == null ) {
				anyMissing = true;
			}
			if( getTableBuff().getOptionalPrimaryIndexId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrimaryIndex = ((IYCFBamSchemaObj)schema).getIndexTableObj().readIndexByIdIdx( getTableBuff().getOptionalPrimaryIndexTenantId(),
					getTableBuff().getOptionalPrimaryIndexId(), forceRead );
			}
		}
		return( optionalLookupPrimaryIndex );
	}

	public List<IYCFBamValueObj> getOptionalComponentsColumns() {
		List<IYCFBamValueObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamValueObj> getOptionalComponentsColumns( boolean forceRead ) {
		List<IYCFBamValueObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamRelationObj> getOptionalChildrenReverseRelations() {
		List<IYCFBamRelationObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationTableObj().readRelationByToTblIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamRelationObj> getOptionalChildrenReverseRelations( boolean forceRead ) {
		List<IYCFBamRelationObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationTableObj().readRelationByToTblIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamChainObj> getOptionalComponentsChains() {
		List<IYCFBamChainObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getChainTableObj().readChainByChainTableIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamChainObj> getOptionalComponentsChains( boolean forceRead ) {
		List<IYCFBamChainObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getChainTableObj().readChainByChainTableIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamDelTopDepObj> getOptionalComponentsDelDep() {
		List<IYCFBamDelTopDepObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getDelTopDepTableObj().readDelTopDepByDelTopDepTblIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamDelTopDepObj> getOptionalComponentsDelDep( boolean forceRead ) {
		List<IYCFBamDelTopDepObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getDelTopDepTableObj().readDelTopDepByDelTopDepTblIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamClearTopDepObj> getOptionalComponentsClearDep() {
		List<IYCFBamClearTopDepObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().readClearTopDepByClrTopDepTblIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamClearTopDepObj> getOptionalComponentsClearDep( boolean forceRead ) {
		List<IYCFBamClearTopDepObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().readClearTopDepByClrTopDepTblIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamId16GenObj> getOptionalChildrenDispId16Gen() {
		List<IYCFBamId16GenObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getId16GenTableObj().readId16GenByDispIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamId16GenObj> getOptionalChildrenDispId16Gen( boolean forceRead ) {
		List<IYCFBamId16GenObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getId16GenTableObj().readId16GenByDispIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamId32GenObj> getOptionalChildrenDispId32Gen() {
		List<IYCFBamId32GenObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getId32GenTableObj().readId32GenByDispIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamId32GenObj> getOptionalChildrenDispId32Gen( boolean forceRead ) {
		List<IYCFBamId32GenObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getId32GenTableObj().readId32GenByDispIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamId64GenObj> getOptionalChildrenDispId64Gen() {
		List<IYCFBamId64GenObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getId64GenTableObj().readId64GenByDispIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamId64GenObj> getOptionalChildrenDispId64Gen( boolean forceRead ) {
		List<IYCFBamId64GenObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getId64GenTableObj().readId64GenByDispIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamServerMethodObj> getOptionalComponentsServerMethods() {
		List<IYCFBamServerMethodObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getServerMethodTableObj().readServerMethodByMethTableIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamServerMethodObj> getOptionalComponentsServerMethods( boolean forceRead ) {
		List<IYCFBamServerMethodObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getServerMethodTableObj().readServerMethodByMethTableIdx( getPKey().getRequiredTenantId(),
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

	public List<IYCFBamRelationObj> getOnlyOwnerRelations() {
		IYCFBamTableObj tableDef;
		IYCFBamRelationObj relationDef = null;
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		Iterator<IYCFBamRelationObj> childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext()) {
			relationDef = childrenRelations.next();
			if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
				list.add(relationDef);
			}
		}

		IYCFBamRelationObj superClass = getSuperClassRelation();
		while( superClass != null ) {
			tableDef = superClass.getRequiredLookupToTable();
			childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
			while (childrenRelations.hasNext()) {
				relationDef = childrenRelations.next();
				if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
					list.add(relationDef);
				}
			}
			superClass = tableDef.getSuperClassRelation();
		}

		childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext()) {
			relationDef = childrenRelations.next();
			if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
				list.add(relationDef);
			}
		}

		superClass = getSuperClassRelation();
		while( superClass != null ) {
			tableDef = superClass.getRequiredLookupToTable();
			childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
			while (childrenRelations.hasNext()) {
				relationDef = childrenRelations.next();
				if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
					list.add(relationDef);
				}
			}
			superClass = tableDef.getSuperClassRelation();
		}

		return( list );
	}

	public List<IYCFBamRelationObj> getContainerOwnerRelations() {
		IYCFBamTableObj tableDef;
		IYCFBamRelationObj relationDef = null;
		IYCFBamSchema.RelationTypeEnum relType;
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		Iterator<IYCFBamRelationObj> childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext()) {
			relationDef = childrenRelations.next();
			relType = relationDef.getRequiredRelationType();
			if( ( relType == IYCFBamSchema.RelationTypeEnum.Owner )
			 || ( relType == IYCFBamSchema.RelationTypeEnum.Parent )
			 || ( relType == IYCFBamSchema.RelationTypeEnum.Container ) )
			{
				list.add(relationDef);
			}
		}

		IYCFBamRelationObj superClass = getSuperClassRelation();
		while( superClass != null ) {
			tableDef = superClass.getRequiredLookupToTable();
			childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
			while (childrenRelations.hasNext()) {
				relationDef = childrenRelations.next();
				relType = relationDef.getRequiredRelationType();
				if( ( relType == IYCFBamSchema.RelationTypeEnum.Owner )
				 || ( relType == IYCFBamSchema.RelationTypeEnum.Parent )
				 || ( relType == IYCFBamSchema.RelationTypeEnum.Container ) )
				{
					list.add(relationDef);
				}
			}
			superClass = tableDef.getSuperClassRelation();
		}

		return( list );
	}

	public IYCFBamRelationObj getContainerRelation() {
		IYCFBamRelationObj relationDef;
		Iterator<IYCFBamRelationObj> childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext()) {
			relationDef = childrenRelations.next();
			if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
				return( relationDef );
			}
		}
		return( null );
	}

	public IYCFBamRelationObj getInheritedContainerRelation() {
		IYCFBamRelationObj inheritedContainerRelation = null;
		IYCFBamRelationObj relationDef;
		Iterator<IYCFBamRelationObj> childrenRelations;
		IYCFBamTableObj tableDef = this;
		while( ( inheritedContainerRelation == null ) && ( tableDef != null ) ) {
			childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
			while (childrenRelations.hasNext()) {
				relationDef = childrenRelations.next();
				if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
					return( relationDef );
				}
			}
			relationDef = tableDef.getSuperClassRelation();
			if( relationDef == null ) {
				tableDef = null;
			}
			else {
				tableDef = relationDef.getRequiredLookupToTable();
			}
		}
		return( null );
	}

	public IYCFBamRelationObj getOwnerRelation() {
		IYCFBamRelationObj relationDef;
		Iterator<IYCFBamRelationObj> childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext()) {
			relationDef = childrenRelations.next();
			if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
				return( relationDef );
			}
		}
		return( null );
	}

	public IYCFBamRelationObj getInheritedOwnerRelation() {
		IYCFBamTableObj tableDef = this;
		IYCFBamRelationObj inheritedOwnerRelation = null;
		IYCFBamRelationObj relationDef;
		Iterator<IYCFBamRelationObj> childrenRelations;
		while( ( inheritedOwnerRelation == null ) && ( tableDef != null ) ) {
			childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
			while (childrenRelations.hasNext()) {
				relationDef = childrenRelations.next();
				if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
					return( relationDef );
				}
			}
			relationDef = tableDef.getSuperClassRelation();
			if( relationDef == null ) {
				tableDef = null;
			}
			else {
				tableDef = relationDef.getRequiredLookupToTable();
			}
		}
		return( null );
	}

	public List<IYCFBamRelationObj> getOwnerLookupRelations() {
		IYCFBamSchema.RelationTypeEnum relType;
		IYCFBamRelationObj relationDef;
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		Iterator<IYCFBamRelationObj> childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext())
		{
			relationDef = childrenRelations.next();
			relType = relationDef.getRequiredRelationType();
			if( ( relType == IYCFBamSchema.RelationTypeEnum.Parent )
			 || ( relType == IYCFBamSchema.RelationTypeEnum.Container )
			 || ( relType == IYCFBamSchema.RelationTypeEnum.Lookup )
			 || ( relType == IYCFBamSchema.RelationTypeEnum.Owner ) )
			{
				list.add(relationDef);
			}
		}
		return( list );
	}

	public List<IYCFBamRelationObj> getOwnerContainerNamedLookupChainRelations() {
		IYCFBamSchema.RelationTypeEnum relType;
		IYCFBamRelationObj relationDef;
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		List<IYCFBamChainObj> componentChains = getOptionalComponentsChains();
		Iterator<IYCFBamRelationObj> childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext()) {
			relationDef = childrenRelations.next();
			relType = relationDef.getRequiredRelationType();
			if( relType == IYCFBamSchema.RelationTypeEnum.Superclass ) {
				;
			}
			else if( ( relType == IYCFBamSchema.RelationTypeEnum.Container )
				|| ( relType == IYCFBamSchema.RelationTypeEnum.Owner ) )
			{
				list.add(relationDef);
			}
			else {
				if( ! relationDef.getRequiredIsXsdContainer() ) {
					IYCFBamIndexObj toIndex = relationDef.getRequiredLookupToIndex();
					if( toIndex.getRequiredIsUnique() ) {
						boolean referencedByChain = false;
						Iterator<IYCFBamChainObj> iterChain = componentChains.iterator();
						while( ( ! referencedByChain ) && iterChain.hasNext() ) {
							IYCFBamChainObj chain = iterChain.next();
							if( chain.getRequiredLookupPrevRel() == relationDef ) {
								referencedByChain = true;
							}
							else if( chain.getRequiredLookupNextRel() == relationDef ) {
								referencedByChain = true;
							}
						}
						if( referencedByChain ) {
							list.add( relationDef );
						}
						else {
							IYCFBamTableObj toTable = relationDef.getRequiredLookupToTable();
							IYCFBamIndexObj lookupIndex = toTable.getOptionalLookupLookupIndex();
							while( ( lookupIndex == null ) && ( toTable != null ) ) {
								IYCFBamRelationObj superRelation = toTable.getSuperClassRelation();
								if( superRelation != null ) {
									toTable = superRelation.getRequiredLookupToTable();
									if( toTable != null ) {
										lookupIndex = toTable.getOptionalLookupLookupIndex();
									}
								}
								else {
									toTable = null;
								}
							}
							if( lookupIndex != null ) {
								list.add( relationDef );
							}
						}
					}
				}
			}
		}
		return( list );
	}

	public List<IYCFBamAtomObj> getChildrenAtoms() {
		List<IYCFBamAtomObj> list = new LinkedList<IYCFBamAtomObj>();
		Iterator<IYCFBamValueObj> childrenColumns = getOptionalComponentsColumns().iterator();
		while (childrenColumns.hasNext())
		{
			IYCFBamValueObj colDef = childrenColumns.next();
			if( colDef instanceof IYCFBamAtomObj)
			{
				list.add( (IYCFBamAtomObj)colDef);
			}
		}
		return( list );
	}

	public IYCFBamRelationObj getSuperClassRelation() {
		Iterator<IYCFBamRelationObj> childrenRelations = getOptionalComponentsRelation().iterator();
		while (childrenRelations.hasNext())
		{
			IYCFBamRelationObj relationDef = childrenRelations.next();
			if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
				return( relationDef );
			}
		}
		return( null );
	}

	public List<IYCFBamRelationObj> getSubClassRelations() {
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		Iterator<IYCFBamRelationObj> reverseRelations = getOptionalChildrenReverseRelations().iterator();
		while (reverseRelations.hasNext())
		{
			IYCFBamRelationObj reverseRelation = reverseRelations.next();
			if( reverseRelation.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
				list.add(reverseRelation);
			}
		}
		return( list );
	}

	public IYCFBamIndexObj getPrimaryKeyIndex() {
		IYCFBamIndexObj primaryIndex = getOptionalLookupPrimaryIndex();
		return( primaryIndex );
	}

	public List<IYCFBamRelationObj> getFactoryOwnerRelations() {
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		Iterator<IYCFBamRelationObj> ownerRelations = getContainerOwnerRelations().iterator();
		while (ownerRelations.hasNext())
		{
			// throw new NotImplementedException();
			IYCFBamRelationObj ownerRelation = ownerRelations.next();
			if( ownerRelation.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
				list.add(ownerRelation);
			}
		}
		return( list );
	}

	public List<IYCFBamIndexObj> getInheritedIndexes() {
		List<IYCFBamIndexObj> list = new LinkedList<IYCFBamIndexObj>();
		IYCFBamRelationObj superClassRelation = getSuperClassRelation();
		if( superClassRelation != null)
		{
			Iterator<IYCFBamIndexObj> superClassInheritedIndexes
				= superClassRelation.getRequiredLookupToTable().getInheritedIndexes().iterator();
			while (superClassInheritedIndexes.hasNext())
			{
				list.add(superClassInheritedIndexes.next());
			}
			Iterator<IYCFBamIndexObj> myIndexes = getChildrenIndexes().iterator();
			while( myIndexes.hasNext() )
			{
				list.add( myIndexes.next() );
			}
		}
		return( list );
	}

	public List<IYCFBamIndexObj> getChildrenIndexes() {
		Iterator<IYCFBamIndexObj> iter = getOptionalComponentsIndex().iterator();
		List<IYCFBamIndexObj> list = new LinkedList<IYCFBamIndexObj>();
		while( iter.hasNext() ) {
			list.add( iter.next() );
		}
		return( list );
	}

	public List<IYCFBamRelationObj> getInheritedRelations() {
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		IYCFBamRelationObj superClassRelation = getSuperClassRelation();
		if( superClassRelation != null)
		{
			Iterator<IYCFBamRelationObj> superClassInheritedRelations
				= superClassRelation.getRequiredLookupToTable().getInheritedRelations().iterator();
			while (superClassInheritedRelations.hasNext())
			{
				list.add(superClassInheritedRelations.next());
			}
			Iterator<IYCFBamRelationObj> myRelations = getChildrenRelations().iterator();
			while (myRelations.hasNext())
			{
				list.add(myRelations.next());
			}
		}
		return( list );
	}

	public List<IYCFBamRelationObj> getChildrenRelations() {
		List<IYCFBamRelationObj> childrenRelations = new LinkedList<IYCFBamRelationObj>();
		Collection<IYCFBamRelationObj> cltn = getOptionalComponentsRelation();
		Iterator<IYCFBamRelationObj> iter = cltn.iterator();
		while( iter.hasNext() ) {
			childrenRelations.add( iter.next() );
		}
		return( childrenRelations );
	}
}
