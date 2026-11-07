// Description: Java 25 JPA implementation of a IntNet schema.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.intnet.intnet.jpa;
//package server.markhome.ycf.v3_1.intnet.intnet.jpa;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.net.InetAddress;
import java.util.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.atomic.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.Inz;
import server.markhome.cf.CFXmlUtil;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.IntNetJpaHooksSchema;

import server.markhome.ycf.v3_1.secure.secure.buff.SecureBuffSchema;
import server.markhome.ycf.v3_1.secure.secure.buff.SecureBuffFactoryService;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffSchema;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffFactoryService;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffSchema;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffFactoryService;

public class IntNetJpaSchema
	implements IIntNetSchema,
		ISecureSchema
{
	private static IntNetJpaHooksSchema intnetJpaHooksSchema = null;

	protected ISecureClusterTable tableCluster;
	protected ISecureISOCcyTable tableISOCcy;
	protected ISecureISOCtryTable tableISOCtry;
	protected ISecureISOCtryCcyTable tableISOCtryCcy;
	protected ISecureISOCtryLangTable tableISOCtryLang;
	protected ISecureISOLangTable tableISOLang;
	protected ISecureISOTZoneTable tableISOTZone;
	protected IIntNetLicenseTable tableLicense;
	protected IIntNetMajorVersionTable tableMajorVersion;
	protected IIntNetMimeTypeTable tableMimeType;
	protected IIntNetMinorVersionTable tableMinorVersion;
	protected ISecureSecClusGrpTable tableSecClusGrp;
	protected ISecureSecClusGrpMembTable tableSecClusGrpMemb;
	protected ISecureSecClusRoleTable tableSecClusRole;
	protected ISecureSecClusRoleMembTable tableSecClusRoleMemb;
	protected ISecureSecSessionTable tableSecSession;
	protected ISecureSecSysGrpTable tableSecSysGrp;
	protected ISecureSecSysGrpIncTable tableSecSysGrpInc;
	protected ISecureSecSysGrpMembTable tableSecSysGrpMemb;
	protected ISecureSecSysRoleTable tableSecSysRole;
	protected ISecureSecSysRoleEnablesTable tableSecSysRoleEnables;
	protected ISecureSecSysRoleMembTable tableSecSysRoleMemb;
	protected ISecureSecTentGrpTable tableSecTentGrp;
	protected ISecureSecTentGrpMembTable tableSecTentGrpMemb;
	protected ISecureSecTentRoleTable tableSecTentRole;
	protected ISecureSecTentRoleMembTable tableSecTentRoleMemb;
	protected ISecureSecUserTable tableSecUser;
	protected ISecureSecUserEMConfTable tableSecUserEMConf;
	protected ISecureSecUserPWHistoryTable tableSecUserPWHistory;
	protected ISecureSecUserPWResetTable tableSecUserPWReset;
	protected ISecureSecUserPasswordTable tableSecUserPassword;
	protected IIntNetSubProjectTable tableSubProject;
	protected ISecureSysClusterTable tableSysCluster;
	protected ISecureTableInfoTable tableTableInfo;
	protected ISecureTenantTable tableTenant;
	protected IIntNetTldTable tableTld;
	protected IIntNetTopDomainTable tableTopDomain;
	protected IIntNetTopProjectTable tableTopProject;
	protected IIntNetURLProtocolTable tableURLProtocol;


	@Override
	public int initClassMapEntries(int value) {
		return( IIntNetSchema.doInitClassMapEntries(value) );
	}

	@Override
	public void wireRecConstructors() {
		ISecureSchema.ClassMapEntry entry;
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetLicense.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetLicense ret = new IntNetJpaLicense();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetLicense.CLASS_CODE)[" + IIntNetLicense.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetMajorVersion.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetMajorVersion ret = new IntNetJpaMajorVersion();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetMajorVersion.CLASS_CODE)[" + IIntNetMajorVersion.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetMimeType.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetMimeType ret = new IntNetJpaMimeType();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetMimeType.CLASS_CODE)[" + IIntNetMimeType.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetMinorVersion.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetMinorVersion ret = new IntNetJpaMinorVersion();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetMinorVersion.CLASS_CODE)[" + IIntNetMinorVersion.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetSubProject.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetSubProject ret = new IntNetJpaSubProject();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetSubProject.CLASS_CODE)[" + IIntNetSubProject.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetTld.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetTld ret = new IntNetJpaTld();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetTld.CLASS_CODE)[" + IIntNetTld.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopDomain.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetTopDomain ret = new IntNetJpaTopDomain();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopDomain.CLASS_CODE)[" + IIntNetTopDomain.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopProject.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetTopProject ret = new IntNetJpaTopProject();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopProject.CLASS_CODE)[" + IIntNetTopProject.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetURLProtocol.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetURLProtocol ret = new IntNetJpaURLProtocol();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetJpaSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetURLProtocol.CLASS_CODE)[" + IIntNetURLProtocol.CLASS_CODE + "]");
		}
	
	}

	@Override
	public void wireTableTableInstances() {
		if (tableLicense == null || !(tableLicense instanceof IntNetJpaLicenseTable)) {
			tableLicense = new IntNetJpaLicenseTable(this);
		}
		if (tableMajorVersion == null || !(tableMajorVersion instanceof IntNetJpaMajorVersionTable)) {
			tableMajorVersion = new IntNetJpaMajorVersionTable(this);
		}
		if (tableMimeType == null || !(tableMimeType instanceof IntNetJpaMimeTypeTable)) {
			tableMimeType = new IntNetJpaMimeTypeTable(this);
		}
		if (tableMinorVersion == null || !(tableMinorVersion instanceof IntNetJpaMinorVersionTable)) {
			tableMinorVersion = new IntNetJpaMinorVersionTable(this);
		}
		if (tableSubProject == null || !(tableSubProject instanceof IntNetJpaSubProjectTable)) {
			tableSubProject = new IntNetJpaSubProjectTable(this);
		}
		if (tableTld == null || !(tableTld instanceof IntNetJpaTldTable)) {
			tableTld = new IntNetJpaTldTable(this);
		}
		if (tableTopDomain == null || !(tableTopDomain instanceof IntNetJpaTopDomainTable)) {
			tableTopDomain = new IntNetJpaTopDomainTable(this);
		}
		if (tableTopProject == null || !(tableTopProject instanceof IntNetJpaTopProjectTable)) {
			tableTopProject = new IntNetJpaTopProjectTable(this);
		}
		if (tableURLProtocol == null || !(tableURLProtocol instanceof IntNetJpaURLProtocolTable)) {
			tableURLProtocol = new IntNetJpaURLProtocolTable(this);
		}
	}

	@Override		
	public ISecureSchema getSecureSchema() {
		return( ISecureSchema.getBackingSecure() );
	}

	@Override
	public void setSecureSchema(ISecureSchema schema) {
		ISecureSchema.setBackingSecure(schema);
		schema.wireRecConstructors();
	}

	@Override		
	public IIntNetSchema getIntNetSchema() {
		return( IIntNetSchema.getBackingIntNet() );
	}

	@Override
	public void setIntNetSchema(IIntNetSchema schema) {
		IIntNetSchema.setBackingIntNet(schema);
		schema.wireRecConstructors();
	}

	public static IntNetJpaHooksSchema getJpaHooksSchema() {
		return( intnetJpaHooksSchema );
	}

	public static void setJpaHooksSchema(IntNetJpaHooksSchema jpaHooksSchema) {
		intnetJpaHooksSchema = jpaHooksSchema;
	}

	@Override
	public ISecureFactory getSecureFactory() {
		ISecureSchema sch = ISecureSchema.getBackingSecure();
		if (sch == null) {
			return null;
		}
		else {
			return(sch.getSecureFactory());
		}
	}
	
	@Override
	public SecureBuffFactoryService getSecureBuffFactory() {
		return(SecureBuffSchema.getBuffHooksSchema().getFactoryService());
	}

	@Override
	public IIntNetFactory getIntNetFactory() {
		return(IntNetJpaSchema.getJpaHooksSchema().getFactoryService());
	}

	@Override
	public IntNetBuffFactoryService getIntNetBuffFactory() {
		return((IntNetBuffFactoryService)(IntNetBuffSchema.getBuffHooksSchema().getFactoryService()));
	}

	public IntNetJpaSchemaService getSchemaService() {
		return( IntNetJpaSchema.getJpaHooksSchema().getSchemaService() );
	}

	public BusModelJpaSchema() {

		tableAtom = null;
		tableBlobCol = null;
		tableBlobDef = null;
		tableBlobType = null;
		tableBoolCol = null;
		tableBoolDef = null;
		tableBoolType = null;
		tableChain = null;
		tableClearDep = null;
		tableClearSubDep1 = null;
		tableClearSubDep2 = null;
		tableClearSubDep3 = null;
		tableClearTopDep = null;
		tableCluster = null;
		tableDateCol = null;
		tableDateDef = null;
		tableDateType = null;
		tableDbKeyHash128Col = null;
		tableDbKeyHash128Def = null;
		tableDbKeyHash128Gen = null;
		tableDbKeyHash128Type = null;
		tableDbKeyHash160Col = null;
		tableDbKeyHash160Def = null;
		tableDbKeyHash160Gen = null;
		tableDbKeyHash160Type = null;
		tableDbKeyHash224Col = null;
		tableDbKeyHash224Def = null;
		tableDbKeyHash224Gen = null;
		tableDbKeyHash224Type = null;
		tableDbKeyHash256Col = null;
		tableDbKeyHash256Def = null;
		tableDbKeyHash256Gen = null;
		tableDbKeyHash256Type = null;
		tableDbKeyHash384Col = null;
		tableDbKeyHash384Def = null;
		tableDbKeyHash384Gen = null;
		tableDbKeyHash384Type = null;
		tableDbKeyHash512Col = null;
		tableDbKeyHash512Def = null;
		tableDbKeyHash512Gen = null;
		tableDbKeyHash512Type = null;
		tableDelDep = null;
		tableDelSubDep1 = null;
		tableDelSubDep2 = null;
		tableDelSubDep3 = null;
		tableDelTopDep = null;
		tableDoubleCol = null;
		tableDoubleDef = null;
		tableDoubleType = null;
		tableEnumDef = null;
		tableEnumTag = null;
		tableEnumType = null;
		tableFloatCol = null;
		tableFloatDef = null;
		tableFloatType = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableId16Gen = null;
		tableId32Gen = null;
		tableId64Gen = null;
		tableIndex = null;
		tableIndexCol = null;
		tableIndexTweak = null;
		tableInt16Col = null;
		tableInt16Def = null;
		tableInt16Type = null;
		tableInt32Col = null;
		tableInt32Def = null;
		tableInt32Type = null;
		tableInt64Col = null;
		tableInt64Def = null;
		tableInt64Type = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableNmTokenCol = null;
		tableNmTokenDef = null;
		tableNmTokenType = null;
		tableNmTokensCol = null;
		tableNmTokensDef = null;
		tableNmTokensType = null;
		tableNumberCol = null;
		tableNumberDef = null;
		tableNumberType = null;
		tableParam = null;
		tablePopDep = null;
		tablePopSubDep1 = null;
		tablePopSubDep2 = null;
		tablePopSubDep3 = null;
		tablePopTopDep = null;
		tableRelation = null;
		tableRelationCol = null;
		tableRoleDef = null;
		tableSchemaDef = null;
		tableSchemaRef = null;
		tableSchemaRole = null;
		tableSchemaTweak = null;
		tableScope = null;
		tableSecClusGrp = null;
		tableSecClusGrpMemb = null;
		tableSecClusRole = null;
		tableSecClusRoleMemb = null;
		tableSecSession = null;
		tableSecSysGrp = null;
		tableSecSysGrpInc = null;
		tableSecSysGrpMemb = null;
		tableSecSysRole = null;
		tableSecSysRoleEnables = null;
		tableSecSysRoleMemb = null;
		tableSecTentGrp = null;
		tableSecTentGrpMemb = null;
		tableSecTentRole = null;
		tableSecTentRoleMemb = null;
		tableSecUser = null;
		tableSecUserEMConf = null;
		tableSecUserPWHistory = null;
		tableSecUserPWReset = null;
		tableSecUserPassword = null;
		tableServerListFunc = null;
		tableServerMethod = null;
		tableServerObjFunc = null;
		tableServerProc = null;
		tableStringCol = null;
		tableStringDef = null;
		tableStringType = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTZDateCol = null;
		tableTZDateDef = null;
		tableTZDateType = null;
		tableTZTimeCol = null;
		tableTZTimeDef = null;
		tableTZTimeType = null;
		tableTZTimestampCol = null;
		tableTZTimestampDef = null;
		tableTZTimestampType = null;
		tableTable = null;
		tableTableCol = null;
		tableTableInfo = null;
		tableTableTweak = null;
		tableTenant = null;
		tableTextCol = null;
		tableTextDef = null;
		tableTextType = null;
		tableTimeCol = null;
		tableTimeDef = null;
		tableTimeType = null;
		tableTimestampCol = null;
		tableTimestampDef = null;
		tableTimestampType = null;
		tableTld = null;
		tableTokenCol = null;
		tableTokenDef = null;
		tableTokenType = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableTweak = null;
		tableUInt16Col = null;
		tableUInt16Def = null;
		tableUInt16Type = null;
		tableUInt32Col = null;
		tableUInt32Def = null;
		tableUInt32Type = null;
		tableUInt64Col = null;
		tableUInt64Def = null;
		tableUInt64Type = null;
		tableURLProtocol = null;
		tableUuid6Col = null;
		tableUuid6Def = null;
		tableUuid6Gen = null;
		tableUuid6Type = null;
		tableUuidCol = null;
		tableUuidDef = null;
		tableUuidGen = null;
		tableUuidType = null;
		tableValue = null;
	}

	@Override
	public IBusModelSchema newSchema() {
		throw new CFMustOverrideException( getClass(), "newSchema" );
	}

	@Override
	public short nextISOCcyIdGen() {
		throw new CFNotImplementedYetException( getClass(), "nextISOCcyIdGen" );
	}

	@Override
	public short nextISOCtryIdGen() {
		throw new CFNotImplementedYetException( getClass(), "nextISOCtryIdGen" );
	}

	@Override
	public short nextISOLangIdGen() {
		throw new CFNotImplementedYetException( getClass(), "nextISOLangIdGen" );
	}

	@Override
	public short nextISOTZoneIdGen() {
		throw new CFNotImplementedYetException( getClass(), "nextISOTZoneIdGen" );
	}

	@Override
	public int nextTableInfoIdGen() {
		throw new CFNotImplementedYetException( getClass(), "nextTableInfoIdGen" );
	}

	@Override
	public int nextMimeTypeIdGen() {
		throw new CFNotImplementedYetException( getClass(), "nextMimeTypeIdGen" );
	}

	@Override
	public int nextURLProtocolIdGen() {
		throw new CFNotImplementedYetException( getClass(), "nextURLProtocolIdGen" );
	}

	@Override
	public CFDbKeyHash256 nextClusterIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecSessionIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecUserIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextTenantIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecSysGrpIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecClusGrpIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecClusRoleIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecTentGrpIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecTentRoleIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextMajorVersionIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextMinorVersionIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSubProjectIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextTldIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextTopDomainIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextTopProjectIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextLicenseIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	public ISecureClusterTable getTableCluster() {
		return( tableCluster );
	}

	public void setTableCluster( ISecureClusterTable value ) {
		tableCluster = value;
	}

	public ISecureISOCcyTable getTableISOCcy() {
		return( tableISOCcy );
	}

	public void setTableISOCcy( ISecureISOCcyTable value ) {
		tableISOCcy = value;
	}

	public ISecureISOCtryTable getTableISOCtry() {
		return( tableISOCtry );
	}

	public void setTableISOCtry( ISecureISOCtryTable value ) {
		tableISOCtry = value;
	}

	public ISecureISOCtryCcyTable getTableISOCtryCcy() {
		return( tableISOCtryCcy );
	}

	public void setTableISOCtryCcy( ISecureISOCtryCcyTable value ) {
		tableISOCtryCcy = value;
	}

	public ISecureISOCtryLangTable getTableISOCtryLang() {
		return( tableISOCtryLang );
	}

	public void setTableISOCtryLang( ISecureISOCtryLangTable value ) {
		tableISOCtryLang = value;
	}

	public ISecureISOLangTable getTableISOLang() {
		return( tableISOLang );
	}

	public void setTableISOLang( ISecureISOLangTable value ) {
		tableISOLang = value;
	}

	public ISecureISOTZoneTable getTableISOTZone() {
		return( tableISOTZone );
	}

	public void setTableISOTZone( ISecureISOTZoneTable value ) {
		tableISOTZone = value;
	}

	public IIntNetLicenseTable getTableLicense() {
		return( tableLicense );
	}

	public void setTableLicense( IIntNetLicenseTable value ) {
		tableLicense = value;
	}

	public IIntNetMajorVersionTable getTableMajorVersion() {
		return( tableMajorVersion );
	}

	public void setTableMajorVersion( IIntNetMajorVersionTable value ) {
		tableMajorVersion = value;
	}

	public IIntNetMimeTypeTable getTableMimeType() {
		return( tableMimeType );
	}

	public void setTableMimeType( IIntNetMimeTypeTable value ) {
		tableMimeType = value;
	}

	public IIntNetMinorVersionTable getTableMinorVersion() {
		return( tableMinorVersion );
	}

	public void setTableMinorVersion( IIntNetMinorVersionTable value ) {
		tableMinorVersion = value;
	}

	public ISecureSecClusGrpTable getTableSecClusGrp() {
		return( tableSecClusGrp );
	}

	public void setTableSecClusGrp( ISecureSecClusGrpTable value ) {
		tableSecClusGrp = value;
	}

	public ISecureSecClusGrpMembTable getTableSecClusGrpMemb() {
		return( tableSecClusGrpMemb );
	}

	public void setTableSecClusGrpMemb( ISecureSecClusGrpMembTable value ) {
		tableSecClusGrpMemb = value;
	}

	public ISecureSecClusRoleTable getTableSecClusRole() {
		return( tableSecClusRole );
	}

	public void setTableSecClusRole( ISecureSecClusRoleTable value ) {
		tableSecClusRole = value;
	}

	public ISecureSecClusRoleMembTable getTableSecClusRoleMemb() {
		return( tableSecClusRoleMemb );
	}

	public void setTableSecClusRoleMemb( ISecureSecClusRoleMembTable value ) {
		tableSecClusRoleMemb = value;
	}

	public ISecureSecSessionTable getTableSecSession() {
		return( tableSecSession );
	}

	public void setTableSecSession( ISecureSecSessionTable value ) {
		tableSecSession = value;
	}

	public ISecureSecSysGrpTable getTableSecSysGrp() {
		return( tableSecSysGrp );
	}

	public void setTableSecSysGrp( ISecureSecSysGrpTable value ) {
		tableSecSysGrp = value;
	}

	public ISecureSecSysGrpIncTable getTableSecSysGrpInc() {
		return( tableSecSysGrpInc );
	}

	public void setTableSecSysGrpInc( ISecureSecSysGrpIncTable value ) {
		tableSecSysGrpInc = value;
	}

	public ISecureSecSysGrpMembTable getTableSecSysGrpMemb() {
		return( tableSecSysGrpMemb );
	}

	public void setTableSecSysGrpMemb( ISecureSecSysGrpMembTable value ) {
		tableSecSysGrpMemb = value;
	}

	public ISecureSecSysRoleTable getTableSecSysRole() {
		return( tableSecSysRole );
	}

	public void setTableSecSysRole( ISecureSecSysRoleTable value ) {
		tableSecSysRole = value;
	}

	public ISecureSecSysRoleEnablesTable getTableSecSysRoleEnables() {
		return( tableSecSysRoleEnables );
	}

	public void setTableSecSysRoleEnables( ISecureSecSysRoleEnablesTable value ) {
		tableSecSysRoleEnables = value;
	}

	public ISecureSecSysRoleMembTable getTableSecSysRoleMemb() {
		return( tableSecSysRoleMemb );
	}

	public void setTableSecSysRoleMemb( ISecureSecSysRoleMembTable value ) {
		tableSecSysRoleMemb = value;
	}

	public ISecureSecTentGrpTable getTableSecTentGrp() {
		return( tableSecTentGrp );
	}

	public void setTableSecTentGrp( ISecureSecTentGrpTable value ) {
		tableSecTentGrp = value;
	}

	public ISecureSecTentGrpMembTable getTableSecTentGrpMemb() {
		return( tableSecTentGrpMemb );
	}

	public void setTableSecTentGrpMemb( ISecureSecTentGrpMembTable value ) {
		tableSecTentGrpMemb = value;
	}

	public ISecureSecTentRoleTable getTableSecTentRole() {
		return( tableSecTentRole );
	}

	public void setTableSecTentRole( ISecureSecTentRoleTable value ) {
		tableSecTentRole = value;
	}

	public ISecureSecTentRoleMembTable getTableSecTentRoleMemb() {
		return( tableSecTentRoleMemb );
	}

	public void setTableSecTentRoleMemb( ISecureSecTentRoleMembTable value ) {
		tableSecTentRoleMemb = value;
	}

	public ISecureSecUserTable getTableSecUser() {
		return( tableSecUser );
	}

	public void setTableSecUser( ISecureSecUserTable value ) {
		tableSecUser = value;
	}

	public ISecureSecUserEMConfTable getTableSecUserEMConf() {
		return( tableSecUserEMConf );
	}

	public void setTableSecUserEMConf( ISecureSecUserEMConfTable value ) {
		tableSecUserEMConf = value;
	}

	public ISecureSecUserPWHistoryTable getTableSecUserPWHistory() {
		return( tableSecUserPWHistory );
	}

	public void setTableSecUserPWHistory( ISecureSecUserPWHistoryTable value ) {
		tableSecUserPWHistory = value;
	}

	public ISecureSecUserPWResetTable getTableSecUserPWReset() {
		return( tableSecUserPWReset );
	}

	public void setTableSecUserPWReset( ISecureSecUserPWResetTable value ) {
		tableSecUserPWReset = value;
	}

	public ISecureSecUserPasswordTable getTableSecUserPassword() {
		return( tableSecUserPassword );
	}

	public void setTableSecUserPassword( ISecureSecUserPasswordTable value ) {
		tableSecUserPassword = value;
	}

	public IIntNetSubProjectTable getTableSubProject() {
		return( tableSubProject );
	}

	public void setTableSubProject( IIntNetSubProjectTable value ) {
		tableSubProject = value;
	}

	public ISecureSysClusterTable getTableSysCluster() {
		return( tableSysCluster );
	}

	public void setTableSysCluster( ISecureSysClusterTable value ) {
		tableSysCluster = value;
	}

	public ISecureTableInfoTable getTableTableInfo() {
		return( tableTableInfo );
	}

	public void setTableTableInfo( ISecureTableInfoTable value ) {
		tableTableInfo = value;
	}

	public ISecureTenantTable getTableTenant() {
		return( tableTenant );
	}

	public void setTableTenant( ISecureTenantTable value ) {
		tableTenant = value;
	}

	public IIntNetTldTable getTableTld() {
		return( tableTld );
	}

	public void setTableTld( IIntNetTldTable value ) {
		tableTld = value;
	}

	public IIntNetTopDomainTable getTableTopDomain() {
		return( tableTopDomain );
	}

	public void setTableTopDomain( IIntNetTopDomainTable value ) {
		tableTopDomain = value;
	}

	public IIntNetTopProjectTable getTableTopProject() {
		return( tableTopProject );
	}

	public void setTableTopProject( IIntNetTopProjectTable value ) {
		tableTopProject = value;
	}

	public IIntNetURLProtocolTable getTableURLProtocol() {
		return( tableURLProtocol );
	}

	public void setTableURLProtocol( IIntNetURLProtocolTable value ) {
		tableURLProtocol = value;
	}

	public void bootstrapSchema(SecurePubTableData tableData[]) {
		ISecureSchema.getBackingSecure().bootstrapSchema(tableData);
	}

	public void bootstrapAllTablesSecurity(CFDbKeyHash256 clusterId, CFDbKeyHash256 tenantId, SecurePubTableData tableData[]) {
		ISecureSchema.getBackingSecure().bootstrapAllTablesSecurity(clusterId, tenantId, tableData);
	}
}
