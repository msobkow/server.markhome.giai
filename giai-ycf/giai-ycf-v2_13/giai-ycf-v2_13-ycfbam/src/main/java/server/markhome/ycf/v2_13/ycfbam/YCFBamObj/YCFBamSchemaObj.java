// Description: Java 11 Schema Object implementation for YCFBam.

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
public class YCFBamSchemaObj
	implements IYCFBamSchemaObj
{
	public static String SCHEMA_NAME = "YCFBam";
	public static String SCHEMA_DBNAME = "ycfbam213";
	protected YCFSecAuthorization authorization = null;
	protected IYCFSecSchema backingStore = null;
	protected String secClusterName = "system";
	protected String secTenantName = "system";
	protected String secUserName = "system";
	protected IYCFSecClusterObj secCluster = null;
	protected long secClusterId = 0L;
	protected IYCFSecTenantObj secTenant = null;
	protected long secTenantId = 0L;
	protected IYCFSecSecUserObj secUser = null;
	protected UUID secSessionUserId = null;
	protected IYCFSecSecSessionObj secSession = null;
	protected UUID secSessionSessionId = null;
	protected String schemaDbName = SCHEMA_DBNAME;
	protected String lowerDbSchemaName = SCHEMA_DBNAME.toLowerCase();
	protected IYCFBamAtomTableObj atomTableObj;
	protected IYCFBamBlobColTableObj blobColTableObj;
	protected IYCFBamBlobDefTableObj blobDefTableObj;
	protected IYCFBamBlobTypeTableObj blobTypeTableObj;
	protected IYCFBamBoolColTableObj boolColTableObj;
	protected IYCFBamBoolDefTableObj boolDefTableObj;
	protected IYCFBamBoolTypeTableObj boolTypeTableObj;
	protected IYCFBamChainTableObj chainTableObj;
	protected IYCFBamClearDepTableObj clearDepTableObj;
	protected IYCFBamClearSubDep1TableObj clearSubDep1TableObj;
	protected IYCFBamClearSubDep2TableObj clearSubDep2TableObj;
	protected IYCFBamClearSubDep3TableObj clearSubDep3TableObj;
	protected IYCFBamClearTopDepTableObj clearTopDepTableObj;
	protected IYCFBamClusterTableObj clusterTableObj;
	protected IYCFBamDateColTableObj dateColTableObj;
	protected IYCFBamDateDefTableObj dateDefTableObj;
	protected IYCFBamDateTypeTableObj dateTypeTableObj;
	protected IYCFBamDbKeyHash128ColTableObj dbKeyHash128ColTableObj;
	protected IYCFBamDbKeyHash128DefTableObj dbKeyHash128DefTableObj;
	protected IYCFBamDbKeyHash128GenTableObj dbKeyHash128GenTableObj;
	protected IYCFBamDbKeyHash128TypeTableObj dbKeyHash128TypeTableObj;
	protected IYCFBamDbKeyHash160ColTableObj dbKeyHash160ColTableObj;
	protected IYCFBamDbKeyHash160DefTableObj dbKeyHash160DefTableObj;
	protected IYCFBamDbKeyHash160GenTableObj dbKeyHash160GenTableObj;
	protected IYCFBamDbKeyHash160TypeTableObj dbKeyHash160TypeTableObj;
	protected IYCFBamDbKeyHash224ColTableObj dbKeyHash224ColTableObj;
	protected IYCFBamDbKeyHash224DefTableObj dbKeyHash224DefTableObj;
	protected IYCFBamDbKeyHash224GenTableObj dbKeyHash224GenTableObj;
	protected IYCFBamDbKeyHash224TypeTableObj dbKeyHash224TypeTableObj;
	protected IYCFBamDbKeyHash256ColTableObj dbKeyHash256ColTableObj;
	protected IYCFBamDbKeyHash256DefTableObj dbKeyHash256DefTableObj;
	protected IYCFBamDbKeyHash256GenTableObj dbKeyHash256GenTableObj;
	protected IYCFBamDbKeyHash256TypeTableObj dbKeyHash256TypeTableObj;
	protected IYCFBamDbKeyHash384ColTableObj dbKeyHash384ColTableObj;
	protected IYCFBamDbKeyHash384DefTableObj dbKeyHash384DefTableObj;
	protected IYCFBamDbKeyHash384GenTableObj dbKeyHash384GenTableObj;
	protected IYCFBamDbKeyHash384TypeTableObj dbKeyHash384TypeTableObj;
	protected IYCFBamDbKeyHash512ColTableObj dbKeyHash512ColTableObj;
	protected IYCFBamDbKeyHash512DefTableObj dbKeyHash512DefTableObj;
	protected IYCFBamDbKeyHash512GenTableObj dbKeyHash512GenTableObj;
	protected IYCFBamDbKeyHash512TypeTableObj dbKeyHash512TypeTableObj;
	protected IYCFBamDelDepTableObj delDepTableObj;
	protected IYCFBamDelSubDep1TableObj delSubDep1TableObj;
	protected IYCFBamDelSubDep2TableObj delSubDep2TableObj;
	protected IYCFBamDelSubDep3TableObj delSubDep3TableObj;
	protected IYCFBamDelTopDepTableObj delTopDepTableObj;
	protected IYCFBamDoubleColTableObj doubleColTableObj;
	protected IYCFBamDoubleDefTableObj doubleDefTableObj;
	protected IYCFBamDoubleTypeTableObj doubleTypeTableObj;
	protected IYCFBamEnumDefTableObj enumDefTableObj;
	protected IYCFBamEnumTagTableObj enumTagTableObj;
	protected IYCFBamEnumTypeTableObj enumTypeTableObj;
	protected IYCFBamFloatColTableObj floatColTableObj;
	protected IYCFBamFloatDefTableObj floatDefTableObj;
	protected IYCFBamFloatTypeTableObj floatTypeTableObj;
	protected IYCFBamHostNodeTableObj hostNodeTableObj;
	protected IYCFBamISOCcyTableObj iSOCcyTableObj;
	protected IYCFBamISOCtryTableObj iSOCtryTableObj;
	protected IYCFBamISOCtryCcyTableObj iSOCtryCcyTableObj;
	protected IYCFBamISOCtryLangTableObj iSOCtryLangTableObj;
	protected IYCFBamISOLangTableObj iSOLangTableObj;
	protected IYCFBamISOTZoneTableObj iSOTZoneTableObj;
	protected IYCFBamId16GenTableObj id16GenTableObj;
	protected IYCFBamId32GenTableObj id32GenTableObj;
	protected IYCFBamId64GenTableObj id64GenTableObj;
	protected IYCFBamIndexTableObj indexTableObj;
	protected IYCFBamIndexColTableObj indexColTableObj;
	protected IYCFBamIndexTweakTableObj indexTweakTableObj;
	protected IYCFBamInt16ColTableObj int16ColTableObj;
	protected IYCFBamInt16DefTableObj int16DefTableObj;
	protected IYCFBamInt16TypeTableObj int16TypeTableObj;
	protected IYCFBamInt32ColTableObj int32ColTableObj;
	protected IYCFBamInt32DefTableObj int32DefTableObj;
	protected IYCFBamInt32TypeTableObj int32TypeTableObj;
	protected IYCFBamInt64ColTableObj int64ColTableObj;
	protected IYCFBamInt64DefTableObj int64DefTableObj;
	protected IYCFBamInt64TypeTableObj int64TypeTableObj;
	protected IYCFBamLicenseTableObj licenseTableObj;
	protected IYCFBamMajorVersionTableObj majorVersionTableObj;
	protected IYCFBamMimeTypeTableObj mimeTypeTableObj;
	protected IYCFBamMinorVersionTableObj minorVersionTableObj;
	protected IYCFBamNmTokenColTableObj nmTokenColTableObj;
	protected IYCFBamNmTokenDefTableObj nmTokenDefTableObj;
	protected IYCFBamNmTokenTypeTableObj nmTokenTypeTableObj;
	protected IYCFBamNmTokensColTableObj nmTokensColTableObj;
	protected IYCFBamNmTokensDefTableObj nmTokensDefTableObj;
	protected IYCFBamNmTokensTypeTableObj nmTokensTypeTableObj;
	protected IYCFBamNumberColTableObj numberColTableObj;
	protected IYCFBamNumberDefTableObj numberDefTableObj;
	protected IYCFBamNumberTypeTableObj numberTypeTableObj;
	protected IYCFBamParamTableObj paramTableObj;
	protected IYCFBamPopDepTableObj popDepTableObj;
	protected IYCFBamPopSubDep1TableObj popSubDep1TableObj;
	protected IYCFBamPopSubDep2TableObj popSubDep2TableObj;
	protected IYCFBamPopSubDep3TableObj popSubDep3TableObj;
	protected IYCFBamPopTopDepTableObj popTopDepTableObj;
	protected IYCFBamRelationTableObj relationTableObj;
	protected IYCFBamRelationColTableObj relationColTableObj;
	protected IYCFBamRoleDefTableObj roleDefTableObj;
	protected IYCFBamSchemaDefTableObj schemaDefTableObj;
	protected IYCFBamSchemaRefTableObj schemaRefTableObj;
	protected IYCFBamSchemaRoleTableObj schemaRoleTableObj;
	protected IYCFBamSchemaTweakTableObj schemaTweakTableObj;
	protected IYCFBamScopeTableObj scopeTableObj;
	protected IYCFBamSecAppTableObj secAppTableObj;
	protected IYCFBamSecDeviceTableObj secDeviceTableObj;
	protected IYCFBamSecFormTableObj secFormTableObj;
	protected IYCFBamSecGroupTableObj secGroupTableObj;
	protected IYCFBamSecGroupFormTableObj secGroupFormTableObj;
	protected IYCFBamSecGrpIncTableObj secGrpIncTableObj;
	protected IYCFBamSecGrpMembTableObj secGrpMembTableObj;
	protected IYCFBamSecSessionTableObj secSessionTableObj;
	protected IYCFBamSecUserTableObj secUserTableObj;
	protected IYCFBamServerListFuncTableObj serverListFuncTableObj;
	protected IYCFBamServerMethodTableObj serverMethodTableObj;
	protected IYCFBamServerObjFuncTableObj serverObjFuncTableObj;
	protected IYCFBamServerProcTableObj serverProcTableObj;
	protected IYCFBamServiceTableObj serviceTableObj;
	protected IYCFBamServiceTypeTableObj serviceTypeTableObj;
	protected IYCFBamStringColTableObj stringColTableObj;
	protected IYCFBamStringDefTableObj stringDefTableObj;
	protected IYCFBamStringTypeTableObj stringTypeTableObj;
	protected IYCFBamSubProjectTableObj subProjectTableObj;
	protected IYCFBamSysClusterTableObj sysClusterTableObj;
	protected IYCFBamTSecGroupTableObj tSecGroupTableObj;
	protected IYCFBamTSecGrpIncTableObj tSecGrpIncTableObj;
	protected IYCFBamTSecGrpMembTableObj tSecGrpMembTableObj;
	protected IYCFBamTZDateColTableObj tZDateColTableObj;
	protected IYCFBamTZDateDefTableObj tZDateDefTableObj;
	protected IYCFBamTZDateTypeTableObj tZDateTypeTableObj;
	protected IYCFBamTZTimeColTableObj tZTimeColTableObj;
	protected IYCFBamTZTimeDefTableObj tZTimeDefTableObj;
	protected IYCFBamTZTimeTypeTableObj tZTimeTypeTableObj;
	protected IYCFBamTZTimestampColTableObj tZTimestampColTableObj;
	protected IYCFBamTZTimestampDefTableObj tZTimestampDefTableObj;
	protected IYCFBamTZTimestampTypeTableObj tZTimestampTypeTableObj;
	protected IYCFBamTableTableObj tableTableObj;
	protected IYCFBamTableColTableObj tableColTableObj;
	protected IYCFBamTableTweakTableObj tableTweakTableObj;
	protected IYCFBamTenantTableObj tenantTableObj;
	protected IYCFBamTextColTableObj textColTableObj;
	protected IYCFBamTextDefTableObj textDefTableObj;
	protected IYCFBamTextTypeTableObj textTypeTableObj;
	protected IYCFBamTimeColTableObj timeColTableObj;
	protected IYCFBamTimeDefTableObj timeDefTableObj;
	protected IYCFBamTimeTypeTableObj timeTypeTableObj;
	protected IYCFBamTimestampColTableObj timestampColTableObj;
	protected IYCFBamTimestampDefTableObj timestampDefTableObj;
	protected IYCFBamTimestampTypeTableObj timestampTypeTableObj;
	protected IYCFBamTldTableObj tldTableObj;
	protected IYCFBamTokenColTableObj tokenColTableObj;
	protected IYCFBamTokenDefTableObj tokenDefTableObj;
	protected IYCFBamTokenTypeTableObj tokenTypeTableObj;
	protected IYCFBamTopDomainTableObj topDomainTableObj;
	protected IYCFBamTopProjectTableObj topProjectTableObj;
	protected IYCFBamTweakTableObj tweakTableObj;
	protected IYCFBamUInt16ColTableObj uInt16ColTableObj;
	protected IYCFBamUInt16DefTableObj uInt16DefTableObj;
	protected IYCFBamUInt16TypeTableObj uInt16TypeTableObj;
	protected IYCFBamUInt32ColTableObj uInt32ColTableObj;
	protected IYCFBamUInt32DefTableObj uInt32DefTableObj;
	protected IYCFBamUInt32TypeTableObj uInt32TypeTableObj;
	protected IYCFBamUInt64ColTableObj uInt64ColTableObj;
	protected IYCFBamUInt64DefTableObj uInt64DefTableObj;
	protected IYCFBamUInt64TypeTableObj uInt64TypeTableObj;
	protected IYCFBamURLProtocolTableObj uRLProtocolTableObj;
	protected IYCFBamUuid6ColTableObj uuid6ColTableObj;
	protected IYCFBamUuid6DefTableObj uuid6DefTableObj;
	protected IYCFBamUuid6GenTableObj uuid6GenTableObj;
	protected IYCFBamUuid6TypeTableObj uuid6TypeTableObj;
	protected IYCFBamUuidColTableObj uuidColTableObj;
	protected IYCFBamUuidDefTableObj uuidDefTableObj;
	protected IYCFBamUuidGenTableObj uuidGenTableObj;
	protected IYCFBamUuidTypeTableObj uuidTypeTableObj;
	protected IYCFBamValueTableObj valueTableObj;

	public YCFBamSchemaObj() {
		atomTableObj = new YCFBamAtomTableObj( this );
		blobColTableObj = new YCFBamBlobColTableObj( this );
		blobDefTableObj = new YCFBamBlobDefTableObj( this );
		blobTypeTableObj = new YCFBamBlobTypeTableObj( this );
		boolColTableObj = new YCFBamBoolColTableObj( this );
		boolDefTableObj = new YCFBamBoolDefTableObj( this );
		boolTypeTableObj = new YCFBamBoolTypeTableObj( this );
		chainTableObj = new YCFBamChainTableObj( this );
		clearDepTableObj = new YCFBamClearDepTableObj( this );
		clearSubDep1TableObj = new YCFBamClearSubDep1TableObj( this );
		clearSubDep2TableObj = new YCFBamClearSubDep2TableObj( this );
		clearSubDep3TableObj = new YCFBamClearSubDep3TableObj( this );
		clearTopDepTableObj = new YCFBamClearTopDepTableObj( this );
		clusterTableObj = new YCFBamClusterTableObj( this );
		dateColTableObj = new YCFBamDateColTableObj( this );
		dateDefTableObj = new YCFBamDateDefTableObj( this );
		dateTypeTableObj = new YCFBamDateTypeTableObj( this );
		dbKeyHash128ColTableObj = new YCFBamDbKeyHash128ColTableObj( this );
		dbKeyHash128DefTableObj = new YCFBamDbKeyHash128DefTableObj( this );
		dbKeyHash128GenTableObj = new YCFBamDbKeyHash128GenTableObj( this );
		dbKeyHash128TypeTableObj = new YCFBamDbKeyHash128TypeTableObj( this );
		dbKeyHash160ColTableObj = new YCFBamDbKeyHash160ColTableObj( this );
		dbKeyHash160DefTableObj = new YCFBamDbKeyHash160DefTableObj( this );
		dbKeyHash160GenTableObj = new YCFBamDbKeyHash160GenTableObj( this );
		dbKeyHash160TypeTableObj = new YCFBamDbKeyHash160TypeTableObj( this );
		dbKeyHash224ColTableObj = new YCFBamDbKeyHash224ColTableObj( this );
		dbKeyHash224DefTableObj = new YCFBamDbKeyHash224DefTableObj( this );
		dbKeyHash224GenTableObj = new YCFBamDbKeyHash224GenTableObj( this );
		dbKeyHash224TypeTableObj = new YCFBamDbKeyHash224TypeTableObj( this );
		dbKeyHash256ColTableObj = new YCFBamDbKeyHash256ColTableObj( this );
		dbKeyHash256DefTableObj = new YCFBamDbKeyHash256DefTableObj( this );
		dbKeyHash256GenTableObj = new YCFBamDbKeyHash256GenTableObj( this );
		dbKeyHash256TypeTableObj = new YCFBamDbKeyHash256TypeTableObj( this );
		dbKeyHash384ColTableObj = new YCFBamDbKeyHash384ColTableObj( this );
		dbKeyHash384DefTableObj = new YCFBamDbKeyHash384DefTableObj( this );
		dbKeyHash384GenTableObj = new YCFBamDbKeyHash384GenTableObj( this );
		dbKeyHash384TypeTableObj = new YCFBamDbKeyHash384TypeTableObj( this );
		dbKeyHash512ColTableObj = new YCFBamDbKeyHash512ColTableObj( this );
		dbKeyHash512DefTableObj = new YCFBamDbKeyHash512DefTableObj( this );
		dbKeyHash512GenTableObj = new YCFBamDbKeyHash512GenTableObj( this );
		dbKeyHash512TypeTableObj = new YCFBamDbKeyHash512TypeTableObj( this );
		delDepTableObj = new YCFBamDelDepTableObj( this );
		delSubDep1TableObj = new YCFBamDelSubDep1TableObj( this );
		delSubDep2TableObj = new YCFBamDelSubDep2TableObj( this );
		delSubDep3TableObj = new YCFBamDelSubDep3TableObj( this );
		delTopDepTableObj = new YCFBamDelTopDepTableObj( this );
		doubleColTableObj = new YCFBamDoubleColTableObj( this );
		doubleDefTableObj = new YCFBamDoubleDefTableObj( this );
		doubleTypeTableObj = new YCFBamDoubleTypeTableObj( this );
		enumDefTableObj = new YCFBamEnumDefTableObj( this );
		enumTagTableObj = new YCFBamEnumTagTableObj( this );
		enumTypeTableObj = new YCFBamEnumTypeTableObj( this );
		floatColTableObj = new YCFBamFloatColTableObj( this );
		floatDefTableObj = new YCFBamFloatDefTableObj( this );
		floatTypeTableObj = new YCFBamFloatTypeTableObj( this );
		hostNodeTableObj = new YCFBamHostNodeTableObj( this );
		iSOCcyTableObj = new YCFBamISOCcyTableObj( this );
		iSOCtryTableObj = new YCFBamISOCtryTableObj( this );
		iSOCtryCcyTableObj = new YCFBamISOCtryCcyTableObj( this );
		iSOCtryLangTableObj = new YCFBamISOCtryLangTableObj( this );
		iSOLangTableObj = new YCFBamISOLangTableObj( this );
		iSOTZoneTableObj = new YCFBamISOTZoneTableObj( this );
		id16GenTableObj = new YCFBamId16GenTableObj( this );
		id32GenTableObj = new YCFBamId32GenTableObj( this );
		id64GenTableObj = new YCFBamId64GenTableObj( this );
		indexTableObj = new YCFBamIndexTableObj( this );
		indexColTableObj = new YCFBamIndexColTableObj( this );
		indexTweakTableObj = new YCFBamIndexTweakTableObj( this );
		int16ColTableObj = new YCFBamInt16ColTableObj( this );
		int16DefTableObj = new YCFBamInt16DefTableObj( this );
		int16TypeTableObj = new YCFBamInt16TypeTableObj( this );
		int32ColTableObj = new YCFBamInt32ColTableObj( this );
		int32DefTableObj = new YCFBamInt32DefTableObj( this );
		int32TypeTableObj = new YCFBamInt32TypeTableObj( this );
		int64ColTableObj = new YCFBamInt64ColTableObj( this );
		int64DefTableObj = new YCFBamInt64DefTableObj( this );
		int64TypeTableObj = new YCFBamInt64TypeTableObj( this );
		licenseTableObj = new YCFBamLicenseTableObj( this );
		majorVersionTableObj = new YCFBamMajorVersionTableObj( this );
		mimeTypeTableObj = new YCFBamMimeTypeTableObj( this );
		minorVersionTableObj = new YCFBamMinorVersionTableObj( this );
		nmTokenColTableObj = new YCFBamNmTokenColTableObj( this );
		nmTokenDefTableObj = new YCFBamNmTokenDefTableObj( this );
		nmTokenTypeTableObj = new YCFBamNmTokenTypeTableObj( this );
		nmTokensColTableObj = new YCFBamNmTokensColTableObj( this );
		nmTokensDefTableObj = new YCFBamNmTokensDefTableObj( this );
		nmTokensTypeTableObj = new YCFBamNmTokensTypeTableObj( this );
		numberColTableObj = new YCFBamNumberColTableObj( this );
		numberDefTableObj = new YCFBamNumberDefTableObj( this );
		numberTypeTableObj = new YCFBamNumberTypeTableObj( this );
		paramTableObj = new YCFBamParamTableObj( this );
		popDepTableObj = new YCFBamPopDepTableObj( this );
		popSubDep1TableObj = new YCFBamPopSubDep1TableObj( this );
		popSubDep2TableObj = new YCFBamPopSubDep2TableObj( this );
		popSubDep3TableObj = new YCFBamPopSubDep3TableObj( this );
		popTopDepTableObj = new YCFBamPopTopDepTableObj( this );
		relationTableObj = new YCFBamRelationTableObj( this );
		relationColTableObj = new YCFBamRelationColTableObj( this );
		roleDefTableObj = new YCFBamRoleDefTableObj( this );
		schemaDefTableObj = new YCFBamSchemaDefTableObj( this );
		schemaRefTableObj = new YCFBamSchemaRefTableObj( this );
		schemaRoleTableObj = new YCFBamSchemaRoleTableObj( this );
		schemaTweakTableObj = new YCFBamSchemaTweakTableObj( this );
		scopeTableObj = new YCFBamScopeTableObj( this );
		secAppTableObj = new YCFBamSecAppTableObj( this );
		secDeviceTableObj = new YCFBamSecDeviceTableObj( this );
		secFormTableObj = new YCFBamSecFormTableObj( this );
		secGroupTableObj = new YCFBamSecGroupTableObj( this );
		secGroupFormTableObj = new YCFBamSecGroupFormTableObj( this );
		secGrpIncTableObj = new YCFBamSecGrpIncTableObj( this );
		secGrpMembTableObj = new YCFBamSecGrpMembTableObj( this );
		secSessionTableObj = new YCFBamSecSessionTableObj( this );
		secUserTableObj = new YCFBamSecUserTableObj( this );
		serverListFuncTableObj = new YCFBamServerListFuncTableObj( this );
		serverMethodTableObj = new YCFBamServerMethodTableObj( this );
		serverObjFuncTableObj = new YCFBamServerObjFuncTableObj( this );
		serverProcTableObj = new YCFBamServerProcTableObj( this );
		serviceTableObj = new YCFBamServiceTableObj( this );
		serviceTypeTableObj = new YCFBamServiceTypeTableObj( this );
		stringColTableObj = new YCFBamStringColTableObj( this );
		stringDefTableObj = new YCFBamStringDefTableObj( this );
		stringTypeTableObj = new YCFBamStringTypeTableObj( this );
		subProjectTableObj = new YCFBamSubProjectTableObj( this );
		sysClusterTableObj = new YCFBamSysClusterTableObj( this );
		tSecGroupTableObj = new YCFBamTSecGroupTableObj( this );
		tSecGrpIncTableObj = new YCFBamTSecGrpIncTableObj( this );
		tSecGrpMembTableObj = new YCFBamTSecGrpMembTableObj( this );
		tZDateColTableObj = new YCFBamTZDateColTableObj( this );
		tZDateDefTableObj = new YCFBamTZDateDefTableObj( this );
		tZDateTypeTableObj = new YCFBamTZDateTypeTableObj( this );
		tZTimeColTableObj = new YCFBamTZTimeColTableObj( this );
		tZTimeDefTableObj = new YCFBamTZTimeDefTableObj( this );
		tZTimeTypeTableObj = new YCFBamTZTimeTypeTableObj( this );
		tZTimestampColTableObj = new YCFBamTZTimestampColTableObj( this );
		tZTimestampDefTableObj = new YCFBamTZTimestampDefTableObj( this );
		tZTimestampTypeTableObj = new YCFBamTZTimestampTypeTableObj( this );
		tableTableObj = new YCFBamTableTableObj( this );
		tableColTableObj = new YCFBamTableColTableObj( this );
		tableTweakTableObj = new YCFBamTableTweakTableObj( this );
		tenantTableObj = new YCFBamTenantTableObj( this );
		textColTableObj = new YCFBamTextColTableObj( this );
		textDefTableObj = new YCFBamTextDefTableObj( this );
		textTypeTableObj = new YCFBamTextTypeTableObj( this );
		timeColTableObj = new YCFBamTimeColTableObj( this );
		timeDefTableObj = new YCFBamTimeDefTableObj( this );
		timeTypeTableObj = new YCFBamTimeTypeTableObj( this );
		timestampColTableObj = new YCFBamTimestampColTableObj( this );
		timestampDefTableObj = new YCFBamTimestampDefTableObj( this );
		timestampTypeTableObj = new YCFBamTimestampTypeTableObj( this );
		tldTableObj = new YCFBamTldTableObj( this );
		tokenColTableObj = new YCFBamTokenColTableObj( this );
		tokenDefTableObj = new YCFBamTokenDefTableObj( this );
		tokenTypeTableObj = new YCFBamTokenTypeTableObj( this );
		topDomainTableObj = new YCFBamTopDomainTableObj( this );
		topProjectTableObj = new YCFBamTopProjectTableObj( this );
		tweakTableObj = new YCFBamTweakTableObj( this );
		uInt16ColTableObj = new YCFBamUInt16ColTableObj( this );
		uInt16DefTableObj = new YCFBamUInt16DefTableObj( this );
		uInt16TypeTableObj = new YCFBamUInt16TypeTableObj( this );
		uInt32ColTableObj = new YCFBamUInt32ColTableObj( this );
		uInt32DefTableObj = new YCFBamUInt32DefTableObj( this );
		uInt32TypeTableObj = new YCFBamUInt32TypeTableObj( this );
		uInt64ColTableObj = new YCFBamUInt64ColTableObj( this );
		uInt64DefTableObj = new YCFBamUInt64DefTableObj( this );
		uInt64TypeTableObj = new YCFBamUInt64TypeTableObj( this );
		uRLProtocolTableObj = new YCFBamURLProtocolTableObj( this );
		uuid6ColTableObj = new YCFBamUuid6ColTableObj( this );
		uuid6DefTableObj = new YCFBamUuid6DefTableObj( this );
		uuid6GenTableObj = new YCFBamUuid6GenTableObj( this );
		uuid6TypeTableObj = new YCFBamUuid6TypeTableObj( this );
		uuidColTableObj = new YCFBamUuidColTableObj( this );
		uuidDefTableObj = new YCFBamUuidDefTableObj( this );
		uuidGenTableObj = new YCFBamUuidGenTableObj( this );
		uuidTypeTableObj = new YCFBamUuidTypeTableObj( this );
		valueTableObj = new YCFBamValueTableObj( this );
		}

	public void setSecClusterName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setClusterName",
				1,
				"value" );
		}
		secClusterName = value;
		secCluster = null;
	}

	public String getSecClusterName() {
		return( secClusterName );
	}

	public IYCFSecClusterObj getSecCluster() {
		if( secCluster == null ) {
			if( authorization != null ) {
				secCluster = getClusterTableObj().readClusterByIdIdx( authorization.getSecClusterId() );
			}
			else {
				secCluster = getClusterTableObj().readClusterByUDomNameIdx( secClusterName );
				if( ( secCluster == null ) && ( secClusterId > 0 ) ) {
					secCluster = getClusterTableObj().readClusterByIdIdx( secClusterId );
				}
			}
			if( secCluster != null ) {
				secClusterName = secCluster.getRequiredFullDomName();
				secClusterId = secCluster.getRequiredId();
				if( authorization != null ) {
					authorization.setSecCluster( secCluster );
				}
			}
		}
		return( secCluster );
	}

	public void setSecCluster( IYCFSecClusterObj value ) {
		secCluster = value;
		if( secCluster == null ) {
			return;
		}
		secClusterId = secCluster.getRequiredId();
		secClusterName = secCluster.getRequiredFullDomName();
		if( authorization != null ) {
			authorization.setSecCluster( secCluster );
		}
	}

	public long getSecClusterId() {
		return( secClusterId );
	}

	public void setSecTenantName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setTenantName",
				1,
				"value" );
		}
		secTenantName = value;
		secTenant = null;
	}

	public String getSecTenantName() {
		return( secTenantName );
	}

	public IYCFSecTenantObj getSecTenant() {
		if( secTenant == null ) {
			if( authorization != null ) {
				secTenant = getTenantTableObj().readTenantByIdIdx( authorization.getSecTenantId() );
			}
			else {
				secTenant = getTenantTableObj().readTenantByUNameIdx( getSecCluster().getRequiredId(), secTenantName );
				if( ( secTenant == null ) && ( secTenantId > 0 ) ) {
					secTenant = getTenantTableObj().readTenantByIdIdx( secTenantId );
				}
			}
			if( secTenant != null ) {
				secTenantName = secTenant.getRequiredTenantName();
				secTenantId = secTenant.getRequiredId();
				if( authorization != null ) {
					authorization.setSecTenant( secTenant );
				}
			}
		}
		return( secTenant );
	}

	public void setSecTenant( IYCFSecTenantObj value ) {
		secTenant = value;
		if( secTenant == null ) {
			return;
		}
		secTenantId = secTenant.getRequiredId();
		secTenantName = secTenant.getRequiredTenantName();
		if( authorization != null ) {
			authorization.setSecTenant( secTenant );
		}
	}

	public long getSecTenantId() {
		return( secTenantId );
	}

	public void setSecUserName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setUserName",
				1,
				"value" );
		}
		secUserName = value;
		secUser = null;
	}

	public String getSecUserName() {
		return( secUserName );
	}

	public IYCFSecSecUserObj getSecUser() {
		if( secUser == null ) {
			if( authorization != null ) {
				secUser = getSecUserTableObj().readSecUserByIdIdx( authorization.getSecUserId() );
			}
			else {
				secUser = getSecUserTableObj().readSecUserByULoginIdx( secUserName );
				if( ( secUser == null ) && ( secSessionUserId != null ) ) {
					secUser = getSecUserTableObj().readSecUserByIdIdx( secSessionUserId );
				}
			}
			if( secUser != null ) {
				secUserName = secUser.getRequiredLoginId();
				secSessionUserId = secUser.getRequiredSecUserId();
			}
		}
		return( secUser );
	}

	public void setSecUser( IYCFSecSecUserObj value ) {
		secUser = value;
		if( secUser != null ) {
			secUserName = secUser.getRequiredLoginId();
			secSessionUserId = secUser.getRequiredSecUserId();
		}
	}
	public IYCFSecSecSessionObj getSecSession() {
		if( secSession == null ) {
			if( authorization != null ) {
				secSession = getSecSessionTableObj().readSecSessionByIdIdx( authorization.getSecSessionId() );
			}
			else if( secSessionSessionId != null ) {
				secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionSessionId );
			}
			if( secSession != null ) {
				secSessionSessionId = secSession.getRequiredSecSessionId();
				secSessionUserId = secSession.getRequiredSecUserId();
			}
		}
		return( secSession );
	}

	public void setSecSession( IYCFSecSecSessionObj value ) {
		secSession = value;
		if( secSession == null ) {
			return;
		}
		secSessionSessionId = secSession.getRequiredSecSessionId();
		secSessionUserId = secSession.getRequiredSecUserId();
		if( authorization != null ) {
			authorization.setSecSession( secSession );
		}
	}

	public void setSecSessionId( UUID value ) {
		secSessionSessionId = value;
	}

	public UUID getSecSessionSessionId() {
		return( secSessionSessionId );
	}

	public UUID getSecSessionUserId() {
		return( secSessionUserId );
	}

	/**
	 *	When you first connect to a database, you can opt to specify a database
	 *	schema name to be used by the session.  The implementation code must always
	 *	be dynamically based on the invocation of <tt>String getDbSchemaName()</tt>
	 *	at runtime.
	 *	<p>
	 *	The initial value is defined by the implementing schema model which has inherited
	 *	the expression of the current schema model being expanded.  That is, it is specified
	 *	in the DbSchemaName attribute of a SchemaDef instance.
	 */
	public String getDbSchemaName() {
		return( schemaDbName );
	}

	/**
	 *	PostgreSQL coerces database schema names to lowercase for consistency.
	 */
	public String getLowerDbSchemaName() {
		return( lowerDbSchemaName );
	}

	/**
	 *	The database is expected to override this implementation and invoke the
	 *	<tt>super.setDbSchemaName( String argDbSchemaName )</tt> early
	 *	on in the implementation of the cust body.  You should let the exceptions
	 *	which can be thrown by this implementation pass unimpeded.
	 *	<pg>
	 *	When you set the database schema name, the database-specific implementation
	 *	of this method does a "commit; use database"-type sequence to change
	 *	to the target database.  This should be specified globally for all
	 *	database connections in a given cluster, so that all of
	 *	the application implementation clients are using the same database instance
	 *	regardless of what's been provided by the cust client implementation,
	 *	be it as a Java application or a web interface written using JEE.
	 */
	public void setDbSchemaName( String argDbSchemaName ) {
		final String S_ProcName = "setDbSchemaName";

		rollback();

		if( ( argDbSchemaName == null ) || ( argDbSchemaName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"argDbSchemaName" );
		}

		if( backingStore != null ) {
			backingStore.setDbSchemaName( argDbSchemaName );
		}

		schemaDbName = argDbSchemaName;
		lowerDbSchemaName = schemaDbName.toLowerCase();

		releasePreparedStatements();
	}

	public String fileImport( String fileName, String fileContent ) {
		String logContent = backingStore.fileImport( getAuthorization(), fileName, fileContent );
		return( logContent );
	}

	/**
	 *	Release any prepared statements acquired by this connection.
	 *	<p>
	 *	Resets the prepared statements so they can acquire the new value of
	 *	<tt>setDbSchemaName()</tt>.
	 */
	public void releasePreparedStatements() {
	}
	public YCFSecAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( YCFSecAuthorization value ) {
		authorization = value;
	}

	public IYCFSecSchema getBackingStore() {
		return( backingStore );
	}

	public void setBackingStore( IYCFSecSchema value ) {
		backingStore = value;
	}

	public String getSchemaName() {
		return( SCHEMA_NAME );
	}

	public boolean isConnected() {
		if( backingStore == null ) {
			return( false );
		}
		else {
			return( backingStore.isConnected() );
		}
	}

	public boolean connect() {
		return( backingStore.connect() );
	}

	public boolean connect( String username, String password ) {
		return( backingStore.connect( username, password ) );
	}

	public boolean connect( String clusterName, String tenantName, String secUserName, String password ) {
		final String S_ProcName = "connect-full";
		if( ( clusterName == null ) || ( clusterName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"clusterName" );
		}
		if( ( tenantName == null ) || ( tenantName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"tenantName" );
		}
		if( ( secUserName == null ) || ( secUserName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				3,
				"secUserName" );
		}
		if( ( password == null ) || ( password.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				5,
				"password" );
		}
		if( ! backingStore.connect( secUserName, password, clusterName, tenantName ) ) {
			authorization = null;
			return( false );
		}
		if( authorization != null ) {
			// The login was established as an XMsg client, which automatically sets the Authorization
			// information based on the return message.  You only need to do the remaining SecSession
			// and authorization creation if you're using a direct client-server model instead of
			// an XMsg client-server model.
			setSecClusterName( clusterName );
			setSecTenantName( tenantName );
			setSecUserName( secUserName );
			return( true );
		}

		if( clusterName.equals( "system" )
		 && tenantName.equals( "system" )
		 && secUserName.equals( "system" ) )
		{
			if( secCluster == null ) {
				secCluster = getClusterTableObj().newInstance();
				IYCFSecClusterEditObj editCluster = secCluster.getEdit();
				if( editCluster == null ) {
					editCluster = secCluster.beginEdit();
					editCluster.setRequiredDescription( "system" );
					editCluster.setRequiredFullDomName( "system" );
					secCluster = editCluster.create();
					editCluster = null;
				}
			}
			if( secTenant == null ) {
				secTenant = getTenantTableObj().newInstance();
				IYCFSecTenantEditObj editTenant = secTenant.getEdit();
				if( editTenant == null ) {
					editTenant = secTenant.beginEdit();
					editTenant.setRequiredContainerCluster( secCluster);
					editTenant.setRequiredTenantName( "system" );
					secTenant = editTenant.create();
					editTenant = null;
				}
			}
			if( secUser == null ) {
				secUser = getSecUserTableObj().newInstance();
				IYCFSecSecUserEditObj editSecUser = secUser.getEdit();
				if( editSecUser == null ) {
					editSecUser = secUser.beginEdit();
					editSecUser.setRequiredEMailAddress( "system" );
					editSecUser.setRequiredLoginId( "system" );
					secUser = editSecUser.create();
					editSecUser = null;
				}
			}
			setSecClusterName( clusterName );
			setSecTenantName( tenantName );
			setSecUserName( secUserName );
			secCluster = null;
			secTenant = null;
			secUser = null;
			secSession = null;
			IYCFSecClusterObj cluster = getSecCluster();
			IYCFSecTenantObj tenant = getSecTenant();
			IYCFSecSecUserObj user = getSecUser();
			IYCFSecSecSessionObj session;
			if( ( cluster != null ) && ( tenant != null ) && ( user != null ) ) {
				session = getSecSessionTableObj().newInstance();
				IYCFSecSecSessionEditObj sessionEdit = session.beginEdit();
				sessionEdit.setRequiredContainerSecUser( user );
				sessionEdit.setRequiredStart( Calendar.getInstance() );
				sessionEdit.setOptionalFinish( null );
				session = sessionEdit.create();
				sessionEdit = null;
				setSecSession( session );
			}
			else {
				session = null;
			}
			if( ( cluster == null ) || ( tenant == null ) || ( user == null ) || ( session == null ) ) {
				disconnect( false );
				authorization = null;
				throw new YCFLibRuntimeException( getClass(),
					S_ProcName,
					"Could not resolve cluster name, tenant name, user name, or session.  Login cancelled" );
			}
			if( authorization == null ) {
				authorization = new YCFSecAuthorization();
			}
			authorization.setSecCluster( cluster );
			authorization.setSecTenant( tenant );
			authorization.setSecSession( session );
			return( true );
		}
		setSecClusterName( clusterName );
		setSecTenantName( tenantName );
		setSecUserName( secUserName );
		boolean transactionStarted = beginTransaction();
		secCluster = null;
		secTenant = null;
		secUser = null;
		secSession = null;
		IYCFSecClusterObj cluster = getSecCluster();
		IYCFSecTenantObj tenant = getSecTenant();
		IYCFSecSecUserObj user = getSecUser();
		IYCFSecSecSessionObj session;
		if( ( cluster != null ) && ( tenant != null ) && ( user != null ) ) {
			session = getSecSessionTableObj().newInstance();
			IYCFSecSecSessionEditObj sessionEdit = session.beginEdit();
			sessionEdit.setRequiredContainerSecUser( user );
			sessionEdit.setRequiredStart( Calendar.getInstance() );
			sessionEdit.setOptionalFinish( null );
			session = sessionEdit.create();
			sessionEdit = null;
			setSecSession( session );
		}
		else {
			session = null;
		}
		if( transactionStarted ) {
			commit();
		}
		if( ( cluster == null ) || ( tenant == null ) || ( user == null ) || ( session == null ) ) {
			disconnect( false );
			authorization = null;
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Could not resolve cluster name, tenant name, user name, or session.  Login cancelled" );
		}
		if( authorization == null ) {
			authorization = new YCFSecAuthorization();
		}
		authorization.setSecCluster( cluster );
		authorization.setSecTenant( tenant );
		authorization.setSecSession( session );
		return( true );
	}

	public void disconnect( boolean doCommit ) {
		backingStore.disconnect( doCommit );
	}

	public void logout() {
		if( authorization == null ) {
			if( isConnected() ) {
				disconnect( false );
			}
			return;
		}
		if( isConnected() ) {
			try {
				boolean transactionStarted = beginTransaction();
				if( ! transactionStarted ) {
					rollback();
					transactionStarted = beginTransaction();
					if( ! transactionStarted ) {
						setAuthorization( null );
						return;
					}
				}
				UUID secSessionId = authorization.getSecSessionId();
				if( secSessionId != null ) {
					IYCFSecSecSessionObj secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionId );
					if( secSession != null ) {
						if( secSession.getOptionalFinish() == null ) {
							IYCFSecSecSessionEditObj editSecSession = secSession.beginEdit();
							editSecSession.setOptionalFinish( Calendar.getInstance() );
							editSecSession.update();
							editSecSession = null;
						}
					}
				}
				commit();
			}
			finally {
				setAuthorization( null );
				try {
					disconnect( false );
				}
				catch( RuntimeException e ) {
				}
			}
		}
	}

	public void minimizeMemory() {
		if( atomTableObj != null ) {
			atomTableObj.minimizeMemory();
		}
		if( blobColTableObj != null ) {
			blobColTableObj.minimizeMemory();
		}
		if( blobDefTableObj != null ) {
			blobDefTableObj.minimizeMemory();
		}
		if( blobTypeTableObj != null ) {
			blobTypeTableObj.minimizeMemory();
		}
		if( boolColTableObj != null ) {
			boolColTableObj.minimizeMemory();
		}
		if( boolDefTableObj != null ) {
			boolDefTableObj.minimizeMemory();
		}
		if( boolTypeTableObj != null ) {
			boolTypeTableObj.minimizeMemory();
		}
		if( chainTableObj != null ) {
			chainTableObj.minimizeMemory();
		}
		if( clearDepTableObj != null ) {
			clearDepTableObj.minimizeMemory();
		}
		if( clearSubDep1TableObj != null ) {
			clearSubDep1TableObj.minimizeMemory();
		}
		if( clearSubDep2TableObj != null ) {
			clearSubDep2TableObj.minimizeMemory();
		}
		if( clearSubDep3TableObj != null ) {
			clearSubDep3TableObj.minimizeMemory();
		}
		if( clearTopDepTableObj != null ) {
			clearTopDepTableObj.minimizeMemory();
		}
		if( clusterTableObj != null ) {
			clusterTableObj.minimizeMemory();
		}
		if( dateColTableObj != null ) {
			dateColTableObj.minimizeMemory();
		}
		if( dateDefTableObj != null ) {
			dateDefTableObj.minimizeMemory();
		}
		if( dateTypeTableObj != null ) {
			dateTypeTableObj.minimizeMemory();
		}
		if( dbKeyHash128ColTableObj != null ) {
			dbKeyHash128ColTableObj.minimizeMemory();
		}
		if( dbKeyHash128DefTableObj != null ) {
			dbKeyHash128DefTableObj.minimizeMemory();
		}
		if( dbKeyHash128GenTableObj != null ) {
			dbKeyHash128GenTableObj.minimizeMemory();
		}
		if( dbKeyHash128TypeTableObj != null ) {
			dbKeyHash128TypeTableObj.minimizeMemory();
		}
		if( dbKeyHash160ColTableObj != null ) {
			dbKeyHash160ColTableObj.minimizeMemory();
		}
		if( dbKeyHash160DefTableObj != null ) {
			dbKeyHash160DefTableObj.minimizeMemory();
		}
		if( dbKeyHash160GenTableObj != null ) {
			dbKeyHash160GenTableObj.minimizeMemory();
		}
		if( dbKeyHash160TypeTableObj != null ) {
			dbKeyHash160TypeTableObj.minimizeMemory();
		}
		if( dbKeyHash224ColTableObj != null ) {
			dbKeyHash224ColTableObj.minimizeMemory();
		}
		if( dbKeyHash224DefTableObj != null ) {
			dbKeyHash224DefTableObj.minimizeMemory();
		}
		if( dbKeyHash224GenTableObj != null ) {
			dbKeyHash224GenTableObj.minimizeMemory();
		}
		if( dbKeyHash224TypeTableObj != null ) {
			dbKeyHash224TypeTableObj.minimizeMemory();
		}
		if( dbKeyHash256ColTableObj != null ) {
			dbKeyHash256ColTableObj.minimizeMemory();
		}
		if( dbKeyHash256DefTableObj != null ) {
			dbKeyHash256DefTableObj.minimizeMemory();
		}
		if( dbKeyHash256GenTableObj != null ) {
			dbKeyHash256GenTableObj.minimizeMemory();
		}
		if( dbKeyHash256TypeTableObj != null ) {
			dbKeyHash256TypeTableObj.minimizeMemory();
		}
		if( dbKeyHash384ColTableObj != null ) {
			dbKeyHash384ColTableObj.minimizeMemory();
		}
		if( dbKeyHash384DefTableObj != null ) {
			dbKeyHash384DefTableObj.minimizeMemory();
		}
		if( dbKeyHash384GenTableObj != null ) {
			dbKeyHash384GenTableObj.minimizeMemory();
		}
		if( dbKeyHash384TypeTableObj != null ) {
			dbKeyHash384TypeTableObj.minimizeMemory();
		}
		if( dbKeyHash512ColTableObj != null ) {
			dbKeyHash512ColTableObj.minimizeMemory();
		}
		if( dbKeyHash512DefTableObj != null ) {
			dbKeyHash512DefTableObj.minimizeMemory();
		}
		if( dbKeyHash512GenTableObj != null ) {
			dbKeyHash512GenTableObj.minimizeMemory();
		}
		if( dbKeyHash512TypeTableObj != null ) {
			dbKeyHash512TypeTableObj.minimizeMemory();
		}
		if( delDepTableObj != null ) {
			delDepTableObj.minimizeMemory();
		}
		if( delSubDep1TableObj != null ) {
			delSubDep1TableObj.minimizeMemory();
		}
		if( delSubDep2TableObj != null ) {
			delSubDep2TableObj.minimizeMemory();
		}
		if( delSubDep3TableObj != null ) {
			delSubDep3TableObj.minimizeMemory();
		}
		if( delTopDepTableObj != null ) {
			delTopDepTableObj.minimizeMemory();
		}
		if( doubleColTableObj != null ) {
			doubleColTableObj.minimizeMemory();
		}
		if( doubleDefTableObj != null ) {
			doubleDefTableObj.minimizeMemory();
		}
		if( doubleTypeTableObj != null ) {
			doubleTypeTableObj.minimizeMemory();
		}
		if( enumDefTableObj != null ) {
			enumDefTableObj.minimizeMemory();
		}
		if( enumTagTableObj != null ) {
			enumTagTableObj.minimizeMemory();
		}
		if( enumTypeTableObj != null ) {
			enumTypeTableObj.minimizeMemory();
		}
		if( floatColTableObj != null ) {
			floatColTableObj.minimizeMemory();
		}
		if( floatDefTableObj != null ) {
			floatDefTableObj.minimizeMemory();
		}
		if( floatTypeTableObj != null ) {
			floatTypeTableObj.minimizeMemory();
		}
		if( hostNodeTableObj != null ) {
			hostNodeTableObj.minimizeMemory();
		}
		if( iSOCcyTableObj != null ) {
			iSOCcyTableObj.minimizeMemory();
		}
		if( iSOCtryTableObj != null ) {
			iSOCtryTableObj.minimizeMemory();
		}
		if( iSOCtryCcyTableObj != null ) {
			iSOCtryCcyTableObj.minimizeMemory();
		}
		if( iSOCtryLangTableObj != null ) {
			iSOCtryLangTableObj.minimizeMemory();
		}
		if( iSOLangTableObj != null ) {
			iSOLangTableObj.minimizeMemory();
		}
		if( iSOTZoneTableObj != null ) {
			iSOTZoneTableObj.minimizeMemory();
		}
		if( id16GenTableObj != null ) {
			id16GenTableObj.minimizeMemory();
		}
		if( id32GenTableObj != null ) {
			id32GenTableObj.minimizeMemory();
		}
		if( id64GenTableObj != null ) {
			id64GenTableObj.minimizeMemory();
		}
		if( indexTableObj != null ) {
			indexTableObj.minimizeMemory();
		}
		if( indexColTableObj != null ) {
			indexColTableObj.minimizeMemory();
		}
		if( indexTweakTableObj != null ) {
			indexTweakTableObj.minimizeMemory();
		}
		if( int16ColTableObj != null ) {
			int16ColTableObj.minimizeMemory();
		}
		if( int16DefTableObj != null ) {
			int16DefTableObj.minimizeMemory();
		}
		if( int16TypeTableObj != null ) {
			int16TypeTableObj.minimizeMemory();
		}
		if( int32ColTableObj != null ) {
			int32ColTableObj.minimizeMemory();
		}
		if( int32DefTableObj != null ) {
			int32DefTableObj.minimizeMemory();
		}
		if( int32TypeTableObj != null ) {
			int32TypeTableObj.minimizeMemory();
		}
		if( int64ColTableObj != null ) {
			int64ColTableObj.minimizeMemory();
		}
		if( int64DefTableObj != null ) {
			int64DefTableObj.minimizeMemory();
		}
		if( int64TypeTableObj != null ) {
			int64TypeTableObj.minimizeMemory();
		}
		if( licenseTableObj != null ) {
			licenseTableObj.minimizeMemory();
		}
		if( majorVersionTableObj != null ) {
			majorVersionTableObj.minimizeMemory();
		}
		if( mimeTypeTableObj != null ) {
			mimeTypeTableObj.minimizeMemory();
		}
		if( minorVersionTableObj != null ) {
			minorVersionTableObj.minimizeMemory();
		}
		if( nmTokenColTableObj != null ) {
			nmTokenColTableObj.minimizeMemory();
		}
		if( nmTokenDefTableObj != null ) {
			nmTokenDefTableObj.minimizeMemory();
		}
		if( nmTokenTypeTableObj != null ) {
			nmTokenTypeTableObj.minimizeMemory();
		}
		if( nmTokensColTableObj != null ) {
			nmTokensColTableObj.minimizeMemory();
		}
		if( nmTokensDefTableObj != null ) {
			nmTokensDefTableObj.minimizeMemory();
		}
		if( nmTokensTypeTableObj != null ) {
			nmTokensTypeTableObj.minimizeMemory();
		}
		if( numberColTableObj != null ) {
			numberColTableObj.minimizeMemory();
		}
		if( numberDefTableObj != null ) {
			numberDefTableObj.minimizeMemory();
		}
		if( numberTypeTableObj != null ) {
			numberTypeTableObj.minimizeMemory();
		}
		if( paramTableObj != null ) {
			paramTableObj.minimizeMemory();
		}
		if( popDepTableObj != null ) {
			popDepTableObj.minimizeMemory();
		}
		if( popSubDep1TableObj != null ) {
			popSubDep1TableObj.minimizeMemory();
		}
		if( popSubDep2TableObj != null ) {
			popSubDep2TableObj.minimizeMemory();
		}
		if( popSubDep3TableObj != null ) {
			popSubDep3TableObj.minimizeMemory();
		}
		if( popTopDepTableObj != null ) {
			popTopDepTableObj.minimizeMemory();
		}
		if( relationTableObj != null ) {
			relationTableObj.minimizeMemory();
		}
		if( relationColTableObj != null ) {
			relationColTableObj.minimizeMemory();
		}
		if( roleDefTableObj != null ) {
			roleDefTableObj.minimizeMemory();
		}
		if( schemaDefTableObj != null ) {
			schemaDefTableObj.minimizeMemory();
		}
		if( schemaRefTableObj != null ) {
			schemaRefTableObj.minimizeMemory();
		}
		if( schemaRoleTableObj != null ) {
			schemaRoleTableObj.minimizeMemory();
		}
		if( schemaTweakTableObj != null ) {
			schemaTweakTableObj.minimizeMemory();
		}
		if( scopeTableObj != null ) {
			scopeTableObj.minimizeMemory();
		}
		if( secAppTableObj != null ) {
			secAppTableObj.minimizeMemory();
		}
		if( secDeviceTableObj != null ) {
			secDeviceTableObj.minimizeMemory();
		}
		if( secFormTableObj != null ) {
			secFormTableObj.minimizeMemory();
		}
		if( secGroupTableObj != null ) {
			secGroupTableObj.minimizeMemory();
		}
		if( secGroupFormTableObj != null ) {
			secGroupFormTableObj.minimizeMemory();
		}
		if( secGrpIncTableObj != null ) {
			secGrpIncTableObj.minimizeMemory();
		}
		if( secGrpMembTableObj != null ) {
			secGrpMembTableObj.minimizeMemory();
		}
		if( secSessionTableObj != null ) {
			secSessionTableObj.minimizeMemory();
		}
		if( secUserTableObj != null ) {
			secUserTableObj.minimizeMemory();
		}
		if( serverListFuncTableObj != null ) {
			serverListFuncTableObj.minimizeMemory();
		}
		if( serverMethodTableObj != null ) {
			serverMethodTableObj.minimizeMemory();
		}
		if( serverObjFuncTableObj != null ) {
			serverObjFuncTableObj.minimizeMemory();
		}
		if( serverProcTableObj != null ) {
			serverProcTableObj.minimizeMemory();
		}
		if( serviceTableObj != null ) {
			serviceTableObj.minimizeMemory();
		}
		if( serviceTypeTableObj != null ) {
			serviceTypeTableObj.minimizeMemory();
		}
		if( stringColTableObj != null ) {
			stringColTableObj.minimizeMemory();
		}
		if( stringDefTableObj != null ) {
			stringDefTableObj.minimizeMemory();
		}
		if( stringTypeTableObj != null ) {
			stringTypeTableObj.minimizeMemory();
		}
		if( subProjectTableObj != null ) {
			subProjectTableObj.minimizeMemory();
		}
		if( sysClusterTableObj != null ) {
			sysClusterTableObj.minimizeMemory();
		}
		if( tSecGroupTableObj != null ) {
			tSecGroupTableObj.minimizeMemory();
		}
		if( tSecGrpIncTableObj != null ) {
			tSecGrpIncTableObj.minimizeMemory();
		}
		if( tSecGrpMembTableObj != null ) {
			tSecGrpMembTableObj.minimizeMemory();
		}
		if( tZDateColTableObj != null ) {
			tZDateColTableObj.minimizeMemory();
		}
		if( tZDateDefTableObj != null ) {
			tZDateDefTableObj.minimizeMemory();
		}
		if( tZDateTypeTableObj != null ) {
			tZDateTypeTableObj.minimizeMemory();
		}
		if( tZTimeColTableObj != null ) {
			tZTimeColTableObj.minimizeMemory();
		}
		if( tZTimeDefTableObj != null ) {
			tZTimeDefTableObj.minimizeMemory();
		}
		if( tZTimeTypeTableObj != null ) {
			tZTimeTypeTableObj.minimizeMemory();
		}
		if( tZTimestampColTableObj != null ) {
			tZTimestampColTableObj.minimizeMemory();
		}
		if( tZTimestampDefTableObj != null ) {
			tZTimestampDefTableObj.minimizeMemory();
		}
		if( tZTimestampTypeTableObj != null ) {
			tZTimestampTypeTableObj.minimizeMemory();
		}
		if( tableTableObj != null ) {
			tableTableObj.minimizeMemory();
		}
		if( tableColTableObj != null ) {
			tableColTableObj.minimizeMemory();
		}
		if( tableTweakTableObj != null ) {
			tableTweakTableObj.minimizeMemory();
		}
		if( tenantTableObj != null ) {
			tenantTableObj.minimizeMemory();
		}
		if( textColTableObj != null ) {
			textColTableObj.minimizeMemory();
		}
		if( textDefTableObj != null ) {
			textDefTableObj.minimizeMemory();
		}
		if( textTypeTableObj != null ) {
			textTypeTableObj.minimizeMemory();
		}
		if( timeColTableObj != null ) {
			timeColTableObj.minimizeMemory();
		}
		if( timeDefTableObj != null ) {
			timeDefTableObj.minimizeMemory();
		}
		if( timeTypeTableObj != null ) {
			timeTypeTableObj.minimizeMemory();
		}
		if( timestampColTableObj != null ) {
			timestampColTableObj.minimizeMemory();
		}
		if( timestampDefTableObj != null ) {
			timestampDefTableObj.minimizeMemory();
		}
		if( timestampTypeTableObj != null ) {
			timestampTypeTableObj.minimizeMemory();
		}
		if( tldTableObj != null ) {
			tldTableObj.minimizeMemory();
		}
		if( tokenColTableObj != null ) {
			tokenColTableObj.minimizeMemory();
		}
		if( tokenDefTableObj != null ) {
			tokenDefTableObj.minimizeMemory();
		}
		if( tokenTypeTableObj != null ) {
			tokenTypeTableObj.minimizeMemory();
		}
		if( topDomainTableObj != null ) {
			topDomainTableObj.minimizeMemory();
		}
		if( topProjectTableObj != null ) {
			topProjectTableObj.minimizeMemory();
		}
		if( tweakTableObj != null ) {
			tweakTableObj.minimizeMemory();
		}
		if( uInt16ColTableObj != null ) {
			uInt16ColTableObj.minimizeMemory();
		}
		if( uInt16DefTableObj != null ) {
			uInt16DefTableObj.minimizeMemory();
		}
		if( uInt16TypeTableObj != null ) {
			uInt16TypeTableObj.minimizeMemory();
		}
		if( uInt32ColTableObj != null ) {
			uInt32ColTableObj.minimizeMemory();
		}
		if( uInt32DefTableObj != null ) {
			uInt32DefTableObj.minimizeMemory();
		}
		if( uInt32TypeTableObj != null ) {
			uInt32TypeTableObj.minimizeMemory();
		}
		if( uInt64ColTableObj != null ) {
			uInt64ColTableObj.minimizeMemory();
		}
		if( uInt64DefTableObj != null ) {
			uInt64DefTableObj.minimizeMemory();
		}
		if( uInt64TypeTableObj != null ) {
			uInt64TypeTableObj.minimizeMemory();
		}
		if( uRLProtocolTableObj != null ) {
			uRLProtocolTableObj.minimizeMemory();
		}
		if( uuid6ColTableObj != null ) {
			uuid6ColTableObj.minimizeMemory();
		}
		if( uuid6DefTableObj != null ) {
			uuid6DefTableObj.minimizeMemory();
		}
		if( uuid6GenTableObj != null ) {
			uuid6GenTableObj.minimizeMemory();
		}
		if( uuid6TypeTableObj != null ) {
			uuid6TypeTableObj.minimizeMemory();
		}
		if( uuidColTableObj != null ) {
			uuidColTableObj.minimizeMemory();
		}
		if( uuidDefTableObj != null ) {
			uuidDefTableObj.minimizeMemory();
		}
		if( uuidGenTableObj != null ) {
			uuidGenTableObj.minimizeMemory();
		}
		if( uuidTypeTableObj != null ) {
			uuidTypeTableObj.minimizeMemory();
		}
		if( valueTableObj != null ) {
			valueTableObj.minimizeMemory();
		}
	}

	public boolean isTransactionOpen() {
		boolean txnOpen = backingStore.isTransactionOpen();
		return( txnOpen );
	}

	public boolean beginTransaction() {
		boolean txnInitiated = backingStore.beginTransaction();
		return( txnInitiated );
	}

	public void commit() {
		backingStore.commit();
	}

	public void rollback() {
		backingStore.rollback();
	}
	public IYCFBamAtomTableObj getAtomTableObj() {
		return( atomTableObj );
	}

	public IYCFBamBlobColTableObj getBlobColTableObj() {
		return( blobColTableObj );
	}

	public IYCFBamBlobDefTableObj getBlobDefTableObj() {
		return( blobDefTableObj );
	}

	public IYCFBamBlobTypeTableObj getBlobTypeTableObj() {
		return( blobTypeTableObj );
	}

	public IYCFBamBoolColTableObj getBoolColTableObj() {
		return( boolColTableObj );
	}

	public IYCFBamBoolDefTableObj getBoolDefTableObj() {
		return( boolDefTableObj );
	}

	public IYCFBamBoolTypeTableObj getBoolTypeTableObj() {
		return( boolTypeTableObj );
	}

	public IYCFBamChainTableObj getChainTableObj() {
		return( chainTableObj );
	}

	public IYCFBamClearDepTableObj getClearDepTableObj() {
		return( clearDepTableObj );
	}

	public IYCFBamClearSubDep1TableObj getClearSubDep1TableObj() {
		return( clearSubDep1TableObj );
	}

	public IYCFBamClearSubDep2TableObj getClearSubDep2TableObj() {
		return( clearSubDep2TableObj );
	}

	public IYCFBamClearSubDep3TableObj getClearSubDep3TableObj() {
		return( clearSubDep3TableObj );
	}

	public IYCFBamClearTopDepTableObj getClearTopDepTableObj() {
		return( clearTopDepTableObj );
	}

	public IYCFBamClusterTableObj getClusterTableObj() {
		return( clusterTableObj );
	}

	public IYCFBamDateColTableObj getDateColTableObj() {
		return( dateColTableObj );
	}

	public IYCFBamDateDefTableObj getDateDefTableObj() {
		return( dateDefTableObj );
	}

	public IYCFBamDateTypeTableObj getDateTypeTableObj() {
		return( dateTypeTableObj );
	}

	public IYCFBamDbKeyHash128ColTableObj getDbKeyHash128ColTableObj() {
		return( dbKeyHash128ColTableObj );
	}

	public IYCFBamDbKeyHash128DefTableObj getDbKeyHash128DefTableObj() {
		return( dbKeyHash128DefTableObj );
	}

	public IYCFBamDbKeyHash128GenTableObj getDbKeyHash128GenTableObj() {
		return( dbKeyHash128GenTableObj );
	}

	public IYCFBamDbKeyHash128TypeTableObj getDbKeyHash128TypeTableObj() {
		return( dbKeyHash128TypeTableObj );
	}

	public IYCFBamDbKeyHash160ColTableObj getDbKeyHash160ColTableObj() {
		return( dbKeyHash160ColTableObj );
	}

	public IYCFBamDbKeyHash160DefTableObj getDbKeyHash160DefTableObj() {
		return( dbKeyHash160DefTableObj );
	}

	public IYCFBamDbKeyHash160GenTableObj getDbKeyHash160GenTableObj() {
		return( dbKeyHash160GenTableObj );
	}

	public IYCFBamDbKeyHash160TypeTableObj getDbKeyHash160TypeTableObj() {
		return( dbKeyHash160TypeTableObj );
	}

	public IYCFBamDbKeyHash224ColTableObj getDbKeyHash224ColTableObj() {
		return( dbKeyHash224ColTableObj );
	}

	public IYCFBamDbKeyHash224DefTableObj getDbKeyHash224DefTableObj() {
		return( dbKeyHash224DefTableObj );
	}

	public IYCFBamDbKeyHash224GenTableObj getDbKeyHash224GenTableObj() {
		return( dbKeyHash224GenTableObj );
	}

	public IYCFBamDbKeyHash224TypeTableObj getDbKeyHash224TypeTableObj() {
		return( dbKeyHash224TypeTableObj );
	}

	public IYCFBamDbKeyHash256ColTableObj getDbKeyHash256ColTableObj() {
		return( dbKeyHash256ColTableObj );
	}

	public IYCFBamDbKeyHash256DefTableObj getDbKeyHash256DefTableObj() {
		return( dbKeyHash256DefTableObj );
	}

	public IYCFBamDbKeyHash256GenTableObj getDbKeyHash256GenTableObj() {
		return( dbKeyHash256GenTableObj );
	}

	public IYCFBamDbKeyHash256TypeTableObj getDbKeyHash256TypeTableObj() {
		return( dbKeyHash256TypeTableObj );
	}

	public IYCFBamDbKeyHash384ColTableObj getDbKeyHash384ColTableObj() {
		return( dbKeyHash384ColTableObj );
	}

	public IYCFBamDbKeyHash384DefTableObj getDbKeyHash384DefTableObj() {
		return( dbKeyHash384DefTableObj );
	}

	public IYCFBamDbKeyHash384GenTableObj getDbKeyHash384GenTableObj() {
		return( dbKeyHash384GenTableObj );
	}

	public IYCFBamDbKeyHash384TypeTableObj getDbKeyHash384TypeTableObj() {
		return( dbKeyHash384TypeTableObj );
	}

	public IYCFBamDbKeyHash512ColTableObj getDbKeyHash512ColTableObj() {
		return( dbKeyHash512ColTableObj );
	}

	public IYCFBamDbKeyHash512DefTableObj getDbKeyHash512DefTableObj() {
		return( dbKeyHash512DefTableObj );
	}

	public IYCFBamDbKeyHash512GenTableObj getDbKeyHash512GenTableObj() {
		return( dbKeyHash512GenTableObj );
	}

	public IYCFBamDbKeyHash512TypeTableObj getDbKeyHash512TypeTableObj() {
		return( dbKeyHash512TypeTableObj );
	}

	public IYCFBamDelDepTableObj getDelDepTableObj() {
		return( delDepTableObj );
	}

	public IYCFBamDelSubDep1TableObj getDelSubDep1TableObj() {
		return( delSubDep1TableObj );
	}

	public IYCFBamDelSubDep2TableObj getDelSubDep2TableObj() {
		return( delSubDep2TableObj );
	}

	public IYCFBamDelSubDep3TableObj getDelSubDep3TableObj() {
		return( delSubDep3TableObj );
	}

	public IYCFBamDelTopDepTableObj getDelTopDepTableObj() {
		return( delTopDepTableObj );
	}

	public IYCFBamDoubleColTableObj getDoubleColTableObj() {
		return( doubleColTableObj );
	}

	public IYCFBamDoubleDefTableObj getDoubleDefTableObj() {
		return( doubleDefTableObj );
	}

	public IYCFBamDoubleTypeTableObj getDoubleTypeTableObj() {
		return( doubleTypeTableObj );
	}

	public IYCFBamEnumDefTableObj getEnumDefTableObj() {
		return( enumDefTableObj );
	}

	public IYCFBamEnumTagTableObj getEnumTagTableObj() {
		return( enumTagTableObj );
	}

	public IYCFBamEnumTypeTableObj getEnumTypeTableObj() {
		return( enumTypeTableObj );
	}

	public IYCFBamFloatColTableObj getFloatColTableObj() {
		return( floatColTableObj );
	}

	public IYCFBamFloatDefTableObj getFloatDefTableObj() {
		return( floatDefTableObj );
	}

	public IYCFBamFloatTypeTableObj getFloatTypeTableObj() {
		return( floatTypeTableObj );
	}

	public IYCFBamHostNodeTableObj getHostNodeTableObj() {
		return( hostNodeTableObj );
	}

	public IYCFBamISOCcyTableObj getISOCcyTableObj() {
		return( iSOCcyTableObj );
	}

	public IYCFBamISOCtryTableObj getISOCtryTableObj() {
		return( iSOCtryTableObj );
	}

	public IYCFBamISOCtryCcyTableObj getISOCtryCcyTableObj() {
		return( iSOCtryCcyTableObj );
	}

	public IYCFBamISOCtryLangTableObj getISOCtryLangTableObj() {
		return( iSOCtryLangTableObj );
	}

	public IYCFBamISOLangTableObj getISOLangTableObj() {
		return( iSOLangTableObj );
	}

	public IYCFBamISOTZoneTableObj getISOTZoneTableObj() {
		return( iSOTZoneTableObj );
	}

	public IYCFBamId16GenTableObj getId16GenTableObj() {
		return( id16GenTableObj );
	}

	public IYCFBamId32GenTableObj getId32GenTableObj() {
		return( id32GenTableObj );
	}

	public IYCFBamId64GenTableObj getId64GenTableObj() {
		return( id64GenTableObj );
	}

	public IYCFBamIndexTableObj getIndexTableObj() {
		return( indexTableObj );
	}

	public IYCFBamIndexColTableObj getIndexColTableObj() {
		return( indexColTableObj );
	}

	public IYCFBamIndexTweakTableObj getIndexTweakTableObj() {
		return( indexTweakTableObj );
	}

	public IYCFBamInt16ColTableObj getInt16ColTableObj() {
		return( int16ColTableObj );
	}

	public IYCFBamInt16DefTableObj getInt16DefTableObj() {
		return( int16DefTableObj );
	}

	public IYCFBamInt16TypeTableObj getInt16TypeTableObj() {
		return( int16TypeTableObj );
	}

	public IYCFBamInt32ColTableObj getInt32ColTableObj() {
		return( int32ColTableObj );
	}

	public IYCFBamInt32DefTableObj getInt32DefTableObj() {
		return( int32DefTableObj );
	}

	public IYCFBamInt32TypeTableObj getInt32TypeTableObj() {
		return( int32TypeTableObj );
	}

	public IYCFBamInt64ColTableObj getInt64ColTableObj() {
		return( int64ColTableObj );
	}

	public IYCFBamInt64DefTableObj getInt64DefTableObj() {
		return( int64DefTableObj );
	}

	public IYCFBamInt64TypeTableObj getInt64TypeTableObj() {
		return( int64TypeTableObj );
	}

	public IYCFBamLicenseTableObj getLicenseTableObj() {
		return( licenseTableObj );
	}

	public IYCFBamMajorVersionTableObj getMajorVersionTableObj() {
		return( majorVersionTableObj );
	}

	public IYCFBamMimeTypeTableObj getMimeTypeTableObj() {
		return( mimeTypeTableObj );
	}

	public IYCFBamMinorVersionTableObj getMinorVersionTableObj() {
		return( minorVersionTableObj );
	}

	public IYCFBamNmTokenColTableObj getNmTokenColTableObj() {
		return( nmTokenColTableObj );
	}

	public IYCFBamNmTokenDefTableObj getNmTokenDefTableObj() {
		return( nmTokenDefTableObj );
	}

	public IYCFBamNmTokenTypeTableObj getNmTokenTypeTableObj() {
		return( nmTokenTypeTableObj );
	}

	public IYCFBamNmTokensColTableObj getNmTokensColTableObj() {
		return( nmTokensColTableObj );
	}

	public IYCFBamNmTokensDefTableObj getNmTokensDefTableObj() {
		return( nmTokensDefTableObj );
	}

	public IYCFBamNmTokensTypeTableObj getNmTokensTypeTableObj() {
		return( nmTokensTypeTableObj );
	}

	public IYCFBamNumberColTableObj getNumberColTableObj() {
		return( numberColTableObj );
	}

	public IYCFBamNumberDefTableObj getNumberDefTableObj() {
		return( numberDefTableObj );
	}

	public IYCFBamNumberTypeTableObj getNumberTypeTableObj() {
		return( numberTypeTableObj );
	}

	public IYCFBamParamTableObj getParamTableObj() {
		return( paramTableObj );
	}

	public IYCFBamPopDepTableObj getPopDepTableObj() {
		return( popDepTableObj );
	}

	public IYCFBamPopSubDep1TableObj getPopSubDep1TableObj() {
		return( popSubDep1TableObj );
	}

	public IYCFBamPopSubDep2TableObj getPopSubDep2TableObj() {
		return( popSubDep2TableObj );
	}

	public IYCFBamPopSubDep3TableObj getPopSubDep3TableObj() {
		return( popSubDep3TableObj );
	}

	public IYCFBamPopTopDepTableObj getPopTopDepTableObj() {
		return( popTopDepTableObj );
	}

	public IYCFBamRelationTableObj getRelationTableObj() {
		return( relationTableObj );
	}

	public IYCFBamRelationColTableObj getRelationColTableObj() {
		return( relationColTableObj );
	}

	public IYCFBamRoleDefTableObj getRoleDefTableObj() {
		return( roleDefTableObj );
	}

	public IYCFBamSchemaDefTableObj getSchemaDefTableObj() {
		return( schemaDefTableObj );
	}

	public IYCFBamSchemaRefTableObj getSchemaRefTableObj() {
		return( schemaRefTableObj );
	}

	public IYCFBamSchemaRoleTableObj getSchemaRoleTableObj() {
		return( schemaRoleTableObj );
	}

	public IYCFBamSchemaTweakTableObj getSchemaTweakTableObj() {
		return( schemaTweakTableObj );
	}

	public IYCFBamScopeTableObj getScopeTableObj() {
		return( scopeTableObj );
	}

	public IYCFBamSecAppTableObj getSecAppTableObj() {
		return( secAppTableObj );
	}

	public IYCFBamSecDeviceTableObj getSecDeviceTableObj() {
		return( secDeviceTableObj );
	}

	public IYCFBamSecFormTableObj getSecFormTableObj() {
		return( secFormTableObj );
	}

	public IYCFBamSecGroupTableObj getSecGroupTableObj() {
		return( secGroupTableObj );
	}

	public IYCFBamSecGroupFormTableObj getSecGroupFormTableObj() {
		return( secGroupFormTableObj );
	}

	public IYCFBamSecGrpIncTableObj getSecGrpIncTableObj() {
		return( secGrpIncTableObj );
	}

	public IYCFBamSecGrpMembTableObj getSecGrpMembTableObj() {
		return( secGrpMembTableObj );
	}

	public IYCFBamSecSessionTableObj getSecSessionTableObj() {
		return( secSessionTableObj );
	}

	public IYCFBamSecUserTableObj getSecUserTableObj() {
		return( secUserTableObj );
	}

	public IYCFBamServerListFuncTableObj getServerListFuncTableObj() {
		return( serverListFuncTableObj );
	}

	public IYCFBamServerMethodTableObj getServerMethodTableObj() {
		return( serverMethodTableObj );
	}

	public IYCFBamServerObjFuncTableObj getServerObjFuncTableObj() {
		return( serverObjFuncTableObj );
	}

	public IYCFBamServerProcTableObj getServerProcTableObj() {
		return( serverProcTableObj );
	}

	public IYCFBamServiceTableObj getServiceTableObj() {
		return( serviceTableObj );
	}

	public IYCFBamServiceTypeTableObj getServiceTypeTableObj() {
		return( serviceTypeTableObj );
	}

	public IYCFBamStringColTableObj getStringColTableObj() {
		return( stringColTableObj );
	}

	public IYCFBamStringDefTableObj getStringDefTableObj() {
		return( stringDefTableObj );
	}

	public IYCFBamStringTypeTableObj getStringTypeTableObj() {
		return( stringTypeTableObj );
	}

	public IYCFBamSubProjectTableObj getSubProjectTableObj() {
		return( subProjectTableObj );
	}

	public IYCFBamSysClusterTableObj getSysClusterTableObj() {
		return( sysClusterTableObj );
	}

	public IYCFBamTSecGroupTableObj getTSecGroupTableObj() {
		return( tSecGroupTableObj );
	}

	public IYCFBamTSecGrpIncTableObj getTSecGrpIncTableObj() {
		return( tSecGrpIncTableObj );
	}

	public IYCFBamTSecGrpMembTableObj getTSecGrpMembTableObj() {
		return( tSecGrpMembTableObj );
	}

	public IYCFBamTZDateColTableObj getTZDateColTableObj() {
		return( tZDateColTableObj );
	}

	public IYCFBamTZDateDefTableObj getTZDateDefTableObj() {
		return( tZDateDefTableObj );
	}

	public IYCFBamTZDateTypeTableObj getTZDateTypeTableObj() {
		return( tZDateTypeTableObj );
	}

	public IYCFBamTZTimeColTableObj getTZTimeColTableObj() {
		return( tZTimeColTableObj );
	}

	public IYCFBamTZTimeDefTableObj getTZTimeDefTableObj() {
		return( tZTimeDefTableObj );
	}

	public IYCFBamTZTimeTypeTableObj getTZTimeTypeTableObj() {
		return( tZTimeTypeTableObj );
	}

	public IYCFBamTZTimestampColTableObj getTZTimestampColTableObj() {
		return( tZTimestampColTableObj );
	}

	public IYCFBamTZTimestampDefTableObj getTZTimestampDefTableObj() {
		return( tZTimestampDefTableObj );
	}

	public IYCFBamTZTimestampTypeTableObj getTZTimestampTypeTableObj() {
		return( tZTimestampTypeTableObj );
	}

	public IYCFBamTableTableObj getTableTableObj() {
		return( tableTableObj );
	}

	public IYCFBamTableColTableObj getTableColTableObj() {
		return( tableColTableObj );
	}

	public IYCFBamTableTweakTableObj getTableTweakTableObj() {
		return( tableTweakTableObj );
	}

	public IYCFBamTenantTableObj getTenantTableObj() {
		return( tenantTableObj );
	}

	public IYCFBamTextColTableObj getTextColTableObj() {
		return( textColTableObj );
	}

	public IYCFBamTextDefTableObj getTextDefTableObj() {
		return( textDefTableObj );
	}

	public IYCFBamTextTypeTableObj getTextTypeTableObj() {
		return( textTypeTableObj );
	}

	public IYCFBamTimeColTableObj getTimeColTableObj() {
		return( timeColTableObj );
	}

	public IYCFBamTimeDefTableObj getTimeDefTableObj() {
		return( timeDefTableObj );
	}

	public IYCFBamTimeTypeTableObj getTimeTypeTableObj() {
		return( timeTypeTableObj );
	}

	public IYCFBamTimestampColTableObj getTimestampColTableObj() {
		return( timestampColTableObj );
	}

	public IYCFBamTimestampDefTableObj getTimestampDefTableObj() {
		return( timestampDefTableObj );
	}

	public IYCFBamTimestampTypeTableObj getTimestampTypeTableObj() {
		return( timestampTypeTableObj );
	}

	public IYCFBamTldTableObj getTldTableObj() {
		return( tldTableObj );
	}

	public IYCFBamTokenColTableObj getTokenColTableObj() {
		return( tokenColTableObj );
	}

	public IYCFBamTokenDefTableObj getTokenDefTableObj() {
		return( tokenDefTableObj );
	}

	public IYCFBamTokenTypeTableObj getTokenTypeTableObj() {
		return( tokenTypeTableObj );
	}

	public IYCFBamTopDomainTableObj getTopDomainTableObj() {
		return( topDomainTableObj );
	}

	public IYCFBamTopProjectTableObj getTopProjectTableObj() {
		return( topProjectTableObj );
	}

	public IYCFBamTweakTableObj getTweakTableObj() {
		return( tweakTableObj );
	}

	public IYCFBamUInt16ColTableObj getUInt16ColTableObj() {
		return( uInt16ColTableObj );
	}

	public IYCFBamUInt16DefTableObj getUInt16DefTableObj() {
		return( uInt16DefTableObj );
	}

	public IYCFBamUInt16TypeTableObj getUInt16TypeTableObj() {
		return( uInt16TypeTableObj );
	}

	public IYCFBamUInt32ColTableObj getUInt32ColTableObj() {
		return( uInt32ColTableObj );
	}

	public IYCFBamUInt32DefTableObj getUInt32DefTableObj() {
		return( uInt32DefTableObj );
	}

	public IYCFBamUInt32TypeTableObj getUInt32TypeTableObj() {
		return( uInt32TypeTableObj );
	}

	public IYCFBamUInt64ColTableObj getUInt64ColTableObj() {
		return( uInt64ColTableObj );
	}

	public IYCFBamUInt64DefTableObj getUInt64DefTableObj() {
		return( uInt64DefTableObj );
	}

	public IYCFBamUInt64TypeTableObj getUInt64TypeTableObj() {
		return( uInt64TypeTableObj );
	}

	public IYCFBamURLProtocolTableObj getURLProtocolTableObj() {
		return( uRLProtocolTableObj );
	}

	public IYCFBamUuid6ColTableObj getUuid6ColTableObj() {
		return( uuid6ColTableObj );
	}

	public IYCFBamUuid6DefTableObj getUuid6DefTableObj() {
		return( uuid6DefTableObj );
	}

	public IYCFBamUuid6GenTableObj getUuid6GenTableObj() {
		return( uuid6GenTableObj );
	}

	public IYCFBamUuid6TypeTableObj getUuid6TypeTableObj() {
		return( uuid6TypeTableObj );
	}

	public IYCFBamUuidColTableObj getUuidColTableObj() {
		return( uuidColTableObj );
	}

	public IYCFBamUuidDefTableObj getUuidDefTableObj() {
		return( uuidDefTableObj );
	}

	public IYCFBamUuidGenTableObj getUuidGenTableObj() {
		return( uuidGenTableObj );
	}

	public IYCFBamUuidTypeTableObj getUuidTypeTableObj() {
		return( uuidTypeTableObj );
	}

	public IYCFBamValueTableObj getValueTableObj() {
		return( valueTableObj );
	}
}
