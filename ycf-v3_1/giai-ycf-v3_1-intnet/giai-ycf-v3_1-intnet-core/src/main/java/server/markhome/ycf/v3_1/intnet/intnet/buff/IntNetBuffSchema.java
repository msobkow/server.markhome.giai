// Description: Java 25 buffer implementation of a IntNet schema.

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

package server.markhome.ycf.v3_1.intnet.intnet.buff;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffHooksSchema;

public class IntNetBuffSchema
	implements IIntNetSchema,
		ISecureSchema
{
	private static IntNetBuffHooksSchema intnetBuffHooksSchema = null;


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
					IIntNetLicense ret = new IntNetBuffLicense();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetLicense.CLASS_CODE)[" + IIntNetLicense.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetMajorVersion.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetMajorVersion ret = new IntNetBuffMajorVersion();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetMajorVersion.CLASS_CODE)[" + IIntNetMajorVersion.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetMimeType.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetMimeType ret = new IntNetBuffMimeType();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetMimeType.CLASS_CODE)[" + IIntNetMimeType.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetMinorVersion.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetMinorVersion ret = new IntNetBuffMinorVersion();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetMinorVersion.CLASS_CODE)[" + IIntNetMinorVersion.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetSubProject.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetSubProject ret = new IntNetBuffSubProject();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetSubProject.CLASS_CODE)[" + IIntNetSubProject.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetTld.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetTld ret = new IntNetBuffTld();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetTld.CLASS_CODE)[" + IIntNetTld.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopDomain.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetTopDomain ret = new IntNetBuffTopDomain();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopDomain.CLASS_CODE)[" + IIntNetTopDomain.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopProject.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetTopProject ret = new IntNetBuffTopProject();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetTopProject.CLASS_CODE)[" + IIntNetTopProject.CLASS_CODE + "]");
		}
	
		entry = IIntNetSchema.getClassMapByBackingClassCode(IIntNetURLProtocol.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					IIntNetURLProtocol ret = new IntNetBuffURLProtocol();
					return(ret);
				}
			});
		}
		else {
			throw new CFNullArgumentException(IntNetBuffSchema.class, "wireRecConstructors", 0, "IIntNetSchema.getClassMapByBackingClassCode(IIntNetURLProtocol.CLASS_CODE)[" + IIntNetURLProtocol.CLASS_CODE + "]");
		}
	
	}

	@Override
	public void wireTableTableInstances() {
		throw new CFMustOverrideException(getClass(), "wireTableTableInstances");
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

	public static IntNetBuffHooksSchema getBuffHooksSchema() {
		return( intnetBuffHooksSchema );
	}

	public static void setBuffHooksSchema(IntNetBuffHooksSchema buffHooksSchema) {
		intnetBuffHooksSchema = buffHooksSchema;
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
		ISecureSchema sch = ISecureSchema.getBackingSecure();
		if (sch == null) {
			return null;
		}
		else {
			return((SecureBuffFactoryService)(sch.getSecureBuffFactory()));
		}
	}

	@Override
	public IIntNetFactory getIntNetFactory() {
		return(IntNetBuffSchema.getBuffHooksSchema().getFactoryService());
	}

	@Override
	public IntNetBuffFactoryService getIntNetBuffFactory() {
		return((IntNetBuffFactoryService)(IntNetBuffSchema.getBuffHooksSchema().getFactoryService()));
	}

	public BusModelBuffSchema() {

	tableAtom = null; // new BusModelBuffAtomTable();
	tableBlobCol = null; // new BusModelBuffBlobColTable();
	tableBlobDef = null; // new BusModelBuffBlobDefTable();
	tableBlobType = null; // new BusModelBuffBlobTypeTable();
	tableBoolCol = null; // new BusModelBuffBoolColTable();
	tableBoolDef = null; // new BusModelBuffBoolDefTable();
	tableBoolType = null; // new BusModelBuffBoolTypeTable();
	tableChain = null; // new BusModelBuffChainTable();
	tableClearDep = null; // new BusModelBuffClearDepTable();
	tableClearSubDep1 = null; // new BusModelBuffClearSubDep1Table();
	tableClearSubDep2 = null; // new BusModelBuffClearSubDep2Table();
	tableClearSubDep3 = null; // new BusModelBuffClearSubDep3Table();
	tableClearTopDep = null; // new BusModelBuffClearTopDepTable();
	tableDateCol = null; // new BusModelBuffDateColTable();
	tableDateDef = null; // new BusModelBuffDateDefTable();
	tableDateType = null; // new BusModelBuffDateTypeTable();
	tableDbKeyHash128Col = null; // new BusModelBuffDbKeyHash128ColTable();
	tableDbKeyHash128Def = null; // new BusModelBuffDbKeyHash128DefTable();
	tableDbKeyHash128Gen = null; // new BusModelBuffDbKeyHash128GenTable();
	tableDbKeyHash128Type = null; // new BusModelBuffDbKeyHash128TypeTable();
	tableDbKeyHash160Col = null; // new BusModelBuffDbKeyHash160ColTable();
	tableDbKeyHash160Def = null; // new BusModelBuffDbKeyHash160DefTable();
	tableDbKeyHash160Gen = null; // new BusModelBuffDbKeyHash160GenTable();
	tableDbKeyHash160Type = null; // new BusModelBuffDbKeyHash160TypeTable();
	tableDbKeyHash224Col = null; // new BusModelBuffDbKeyHash224ColTable();
	tableDbKeyHash224Def = null; // new BusModelBuffDbKeyHash224DefTable();
	tableDbKeyHash224Gen = null; // new BusModelBuffDbKeyHash224GenTable();
	tableDbKeyHash224Type = null; // new BusModelBuffDbKeyHash224TypeTable();
	tableDbKeyHash256Col = null; // new BusModelBuffDbKeyHash256ColTable();
	tableDbKeyHash256Def = null; // new BusModelBuffDbKeyHash256DefTable();
	tableDbKeyHash256Gen = null; // new BusModelBuffDbKeyHash256GenTable();
	tableDbKeyHash256Type = null; // new BusModelBuffDbKeyHash256TypeTable();
	tableDbKeyHash384Col = null; // new BusModelBuffDbKeyHash384ColTable();
	tableDbKeyHash384Def = null; // new BusModelBuffDbKeyHash384DefTable();
	tableDbKeyHash384Gen = null; // new BusModelBuffDbKeyHash384GenTable();
	tableDbKeyHash384Type = null; // new BusModelBuffDbKeyHash384TypeTable();
	tableDbKeyHash512Col = null; // new BusModelBuffDbKeyHash512ColTable();
	tableDbKeyHash512Def = null; // new BusModelBuffDbKeyHash512DefTable();
	tableDbKeyHash512Gen = null; // new BusModelBuffDbKeyHash512GenTable();
	tableDbKeyHash512Type = null; // new BusModelBuffDbKeyHash512TypeTable();
	tableDelDep = null; // new BusModelBuffDelDepTable();
	tableDelSubDep1 = null; // new BusModelBuffDelSubDep1Table();
	tableDelSubDep2 = null; // new BusModelBuffDelSubDep2Table();
	tableDelSubDep3 = null; // new BusModelBuffDelSubDep3Table();
	tableDelTopDep = null; // new BusModelBuffDelTopDepTable();
	tableDoubleCol = null; // new BusModelBuffDoubleColTable();
	tableDoubleDef = null; // new BusModelBuffDoubleDefTable();
	tableDoubleType = null; // new BusModelBuffDoubleTypeTable();
	tableEnumDef = null; // new BusModelBuffEnumDefTable();
	tableEnumTag = null; // new BusModelBuffEnumTagTable();
	tableEnumType = null; // new BusModelBuffEnumTypeTable();
	tableFloatCol = null; // new BusModelBuffFloatColTable();
	tableFloatDef = null; // new BusModelBuffFloatDefTable();
	tableFloatType = null; // new BusModelBuffFloatTypeTable();
	tableId16Gen = null; // new BusModelBuffId16GenTable();
	tableId32Gen = null; // new BusModelBuffId32GenTable();
	tableId64Gen = null; // new BusModelBuffId64GenTable();
	tableIndex = null; // new BusModelBuffIndexTable();
	tableIndexCol = null; // new BusModelBuffIndexColTable();
	tableIndexTweak = null; // new BusModelBuffIndexTweakTable();
	tableInt16Col = null; // new BusModelBuffInt16ColTable();
	tableInt16Def = null; // new BusModelBuffInt16DefTable();
	tableInt16Type = null; // new BusModelBuffInt16TypeTable();
	tableInt32Col = null; // new BusModelBuffInt32ColTable();
	tableInt32Def = null; // new BusModelBuffInt32DefTable();
	tableInt32Type = null; // new BusModelBuffInt32TypeTable();
	tableInt64Col = null; // new BusModelBuffInt64ColTable();
	tableInt64Def = null; // new BusModelBuffInt64DefTable();
	tableInt64Type = null; // new BusModelBuffInt64TypeTable();
	tableNmTokenCol = null; // new BusModelBuffNmTokenColTable();
	tableNmTokenDef = null; // new BusModelBuffNmTokenDefTable();
	tableNmTokenType = null; // new BusModelBuffNmTokenTypeTable();
	tableNmTokensCol = null; // new BusModelBuffNmTokensColTable();
	tableNmTokensDef = null; // new BusModelBuffNmTokensDefTable();
	tableNmTokensType = null; // new BusModelBuffNmTokensTypeTable();
	tableNumberCol = null; // new BusModelBuffNumberColTable();
	tableNumberDef = null; // new BusModelBuffNumberDefTable();
	tableNumberType = null; // new BusModelBuffNumberTypeTable();
	tableParam = null; // new BusModelBuffParamTable();
	tablePopDep = null; // new BusModelBuffPopDepTable();
	tablePopSubDep1 = null; // new BusModelBuffPopSubDep1Table();
	tablePopSubDep2 = null; // new BusModelBuffPopSubDep2Table();
	tablePopSubDep3 = null; // new BusModelBuffPopSubDep3Table();
	tablePopTopDep = null; // new BusModelBuffPopTopDepTable();
	tableRelation = null; // new BusModelBuffRelationTable();
	tableRelationCol = null; // new BusModelBuffRelationColTable();
	tableRoleDef = null; // new BusModelBuffRoleDefTable();
	tableSchemaDef = null; // new BusModelBuffSchemaDefTable();
	tableSchemaRef = null; // new BusModelBuffSchemaRefTable();
	tableSchemaRole = null; // new BusModelBuffSchemaRoleTable();
	tableSchemaTweak = null; // new BusModelBuffSchemaTweakTable();
	tableScope = null; // new BusModelBuffScopeTable();
	tableServerListFunc = null; // new BusModelBuffServerListFuncTable();
	tableServerMethod = null; // new BusModelBuffServerMethodTable();
	tableServerObjFunc = null; // new BusModelBuffServerObjFuncTable();
	tableServerProc = null; // new BusModelBuffServerProcTable();
	tableStringCol = null; // new BusModelBuffStringColTable();
	tableStringDef = null; // new BusModelBuffStringDefTable();
	tableStringType = null; // new BusModelBuffStringTypeTable();
	tableTZDateCol = null; // new BusModelBuffTZDateColTable();
	tableTZDateDef = null; // new BusModelBuffTZDateDefTable();
	tableTZDateType = null; // new BusModelBuffTZDateTypeTable();
	tableTZTimeCol = null; // new BusModelBuffTZTimeColTable();
	tableTZTimeDef = null; // new BusModelBuffTZTimeDefTable();
	tableTZTimeType = null; // new BusModelBuffTZTimeTypeTable();
	tableTZTimestampCol = null; // new BusModelBuffTZTimestampColTable();
	tableTZTimestampDef = null; // new BusModelBuffTZTimestampDefTable();
	tableTZTimestampType = null; // new BusModelBuffTZTimestampTypeTable();
	tableTable = null; // new BusModelBuffTableTable();
	tableTableCol = null; // new BusModelBuffTableColTable();
	tableTableTweak = null; // new BusModelBuffTableTweakTable();
	tableTextCol = null; // new BusModelBuffTextColTable();
	tableTextDef = null; // new BusModelBuffTextDefTable();
	tableTextType = null; // new BusModelBuffTextTypeTable();
	tableTimeCol = null; // new BusModelBuffTimeColTable();
	tableTimeDef = null; // new BusModelBuffTimeDefTable();
	tableTimeType = null; // new BusModelBuffTimeTypeTable();
	tableTimestampCol = null; // new BusModelBuffTimestampColTable();
	tableTimestampDef = null; // new BusModelBuffTimestampDefTable();
	tableTimestampType = null; // new BusModelBuffTimestampTypeTable();
	tableTokenCol = null; // new BusModelBuffTokenColTable();
	tableTokenDef = null; // new BusModelBuffTokenDefTable();
	tableTokenType = null; // new BusModelBuffTokenTypeTable();
	tableTweak = null; // new BusModelBuffTweakTable();
	tableUInt16Col = null; // new BusModelBuffUInt16ColTable();
	tableUInt16Def = null; // new BusModelBuffUInt16DefTable();
	tableUInt16Type = null; // new BusModelBuffUInt16TypeTable();
	tableUInt32Col = null; // new BusModelBuffUInt32ColTable();
	tableUInt32Def = null; // new BusModelBuffUInt32DefTable();
	tableUInt32Type = null; // new BusModelBuffUInt32TypeTable();
	tableUInt64Col = null; // new BusModelBuffUInt64ColTable();
	tableUInt64Def = null; // new BusModelBuffUInt64DefTable();
	tableUInt64Type = null; // new BusModelBuffUInt64TypeTable();
	tableUuid6Col = null; // new BusModelBuffUuid6ColTable();
	tableUuid6Def = null; // new BusModelBuffUuid6DefTable();
	tableUuid6Gen = null; // new BusModelBuffUuid6GenTable();
	tableUuid6Type = null; // new BusModelBuffUuid6TypeTable();
	tableUuidCol = null; // new BusModelBuffUuidColTable();
	tableUuidDef = null; // new BusModelBuffUuidDefTable();
	tableUuidGen = null; // new BusModelBuffUuidGenTable();
	tableUuidType = null; // new BusModelBuffUuidTypeTable();
	tableValue = null; // new BusModelBuffValueTable();
	}

	public IBusModelSchema newSchema() {
		throw new CFMustOverrideException( getClass(), "newSchema" );
	}

	/**
	 *	Get the next ISOCcyIdGen identifier.
	 *
	 *	@return	The next ISOCcyIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOCcyIdGen() {
		throw new CFMustOverrideException(getClass(), "nextISOCcyIdGen");
	}

	/**
	 *	Get the next ISOCtryIdGen identifier.
	 *
	 *	@return	The next ISOCtryIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOCtryIdGen() {
		throw new CFMustOverrideException(getClass(), "nextISOCtryIdGen");
	}

	/**
	 *	Get the next ISOLangIdGen identifier.
	 *
	 *	@return	The next ISOLangIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOLangIdGen() {
		throw new CFMustOverrideException(getClass(), "nextISOLangIdGen");
	}

	/**
	 *	Get the next ISOTZoneIdGen identifier.
	 *
	 *	@return	The next ISOTZoneIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOTZoneIdGen() {
		throw new CFMustOverrideException(getClass(), "nextISOTZoneIdGen");
	}

	/**
	 *	Get the next TableInfoIdGen identifier.
	 *
	 *	@return	The next TableInfoIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public int nextTableInfoIdGen() {
		throw new CFMustOverrideException(getClass(), "nextTableInfoIdGen");
	}

	/**
	 *	Get the next MimeTypeIdGen identifier.
	 *
	 *	@return	The next MimeTypeIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public int nextMimeTypeIdGen() {
		throw new CFMustOverrideException(getClass(), "nextMimeTypeIdGen");
	}

	/**
	 *	Get the next URLProtocolIdGen identifier.
	 *
	 *	@return	The next URLProtocolIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public int nextURLProtocolIdGen() {
		throw new CFMustOverrideException(getClass(), "nextURLProtocolIdGen");
	}

	/**
	 *	Get the next ClusterIdGen identifier.
	 *
	 *	@return	The next ClusterIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextClusterIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SecSessionIdGen identifier.
	 *
	 *	@return	The next SecSessionIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecSessionIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SecUserIdGen identifier.
	 *
	 *	@return	The next SecUserIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecUserIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next TenantIdGen identifier.
	 *
	 *	@return	The next TenantIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTenantIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SecSysGrpIdGen identifier.
	 *
	 *	@return	The next SecSysGrpIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecSysGrpIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SecClusGrpIdGen identifier.
	 *
	 *	@return	The next SecClusGrpIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecClusGrpIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SecClusRoleIdGen identifier.
	 *
	 *	@return	The next SecClusRoleIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecClusRoleIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SecTentGrpIdGen identifier.
	 *
	 *	@return	The next SecTentGrpIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecTentGrpIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SecTentRoleIdGen identifier.
	 *
	 *	@return	The next SecTentRoleIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecTentRoleIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next MajorVersionIdGen identifier.
	 *
	 *	@return	The next MajorVersionIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextMajorVersionIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next MinorVersionIdGen identifier.
	 *
	 *	@return	The next MinorVersionIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextMinorVersionIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next SubProjectIdGen identifier.
	 *
	 *	@return	The next SubProjectIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSubProjectIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next TldIdGen identifier.
	 *
	 *	@return	The next TldIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTldIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next TopDomainIdGen identifier.
	 *
	 *	@return	The next TopDomainIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTopDomainIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next TopProjectIdGen identifier.
	 *
	 *	@return	The next TopProjectIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTopProjectIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Get the next LicenseIdGen identifier.
	 *
	 *	@return	The next LicenseIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextLicenseIdGen() {
		return( new CFDbKeyHash256(0) );
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

	public static String xmlEncodeString( String val ) {
		StringBuffer buff = new StringBuffer();
		int len = val.length();
		for( int idx = 0; idx < len; idx ++ ) {
			char c = val.charAt( idx );
			switch( c ) {
				case '&':
					buff.append( "&amp;" );
					break;
				case '<':
					buff.append( "&lt;" );
					break;
				case '>':
					buff.append( "&gt;" );
					break;
				case '"':
					buff.append( "&quot;" );
					break;
				case '\'':
					buff.append( "&apos;" );
					break;
				default:
					buff.append( c );
					break;
			}
		}
		return( buff.toString() );
	}

	public void bootstrapSchema(SecurePubTableData tableData[]) {
		ISecureSchema.getBackingSecure().bootstrapSchema(tableData);
	}
	
	public void bootstrapAllTablesSecurity(CFDbKeyHash256 clusterId, CFDbKeyHash256 tenantId, SecurePubTableData tableData[]) {
		ISecureSchema.getBackingSecure().bootstrapAllTablesSecurity(clusterId, tenantId, tableData);
	}
}
