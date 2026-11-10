// Description: Java 11 XML SAX Parser for YCFBam.

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

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.*;
import java.math.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.naming.*;
import javax.sql.*;
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

public class YCFBamSaxLoader
	extends YCFLibXmlCoreSaxParser
	implements ContentHandler
{

	// The namespace URI of the supported schema
	public final static String	SCHEMA_XMLNS = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfbam-structured.xsd";

	// The source for loading the supported schema
	public final static String	SCHEMA_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfbam-structured.xsd";
	public final static String	SCHEMA_ROOT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfbam-structured.xsd";

	public final static String	YCFSEC_XMLNS = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";
	public final static String	YCFSEC_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";
	public final static String	YCFSEC_ROOT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfsec-structured.xsd";

	public final static String	YCFINT_XMLNS = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfint-structured.xsd";
	public final static String	YCFINT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfint-structured.xsd";
	public final static String	YCFINT_ROOT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/ycfint-structured.xsd";

	// The schema instance to load in to

	private IYCFBamSchemaObj schemaObj = null;

	// The cluster to use for loading

	private IYCFSecClusterObj useCluster = null;

	public IYCFSecClusterObj getUseCluster() {
		return( useCluster );
	}

	public void setUseCluster( IYCFSecClusterObj value ) {
		useCluster = value;
	}

	// The tenant to use for loading

	private IYCFSecTenantObj useTenant = null;

	public IYCFSecTenantObj getUseTenant() {
		return( useTenant );
	}

	public void setUseTenant( IYCFSecTenantObj value ) {
		useTenant = value;
	}

	// Loader behaviour configuration attributes

	public enum LoaderBehaviourEnum {
		Insert,
		Update,
		Replace
	};
	private LoaderBehaviourEnum atomLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum blobColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum blobDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum blobTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum boolColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum boolDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum boolTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum chainLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum clearDepLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum clearSubDep1LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum clearSubDep2LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum clearSubDep3LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum clearTopDepLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum clusterLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum dateColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dateDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dateTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash128ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash128DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash128GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash128TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash160ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash160DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash160GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash160TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash224ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash224DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash224GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash224TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash256ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash256DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash256GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash256TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash384ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash384DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash384GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash384TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash512ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash512DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash512GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum dbKeyHash512TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum delDepLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum delSubDep1LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum delSubDep2LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum delSubDep3LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum delTopDepLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum doubleColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum doubleDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum doubleTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum enumDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum enumTagLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum enumTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum floatColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum floatDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum floatTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum hostNodeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOCcyLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOCtryLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOCtryCcyLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum iSOCtryLangLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum iSOLangLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum iSOTZoneLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum id16GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum id32GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum id64GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum indexLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum indexColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum indexTweakLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int16ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int16DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int16TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int32ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int32DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int32TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int64ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int64DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum int64TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum licenseLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum majorVersionLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum mimeTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum minorVersionLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum nmTokenColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum nmTokenDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum nmTokenTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum nmTokensColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum nmTokensDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum nmTokensTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum numberColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum numberDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum numberTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum paramLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum popDepLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum popSubDep1LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum popSubDep2LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum popSubDep3LoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum popTopDepLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum relationLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum relationColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum roleDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum schemaDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum schemaRefLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum schemaRoleLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum schemaTweakLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum scopeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum secAppLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum secDeviceLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secFormLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum secGroupLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secGroupFormLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secGrpIncLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secGrpMembLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secSessionLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum secUserLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum serverListFuncLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum serverMethodLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum serverObjFuncLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum serverProcLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum serviceLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum serviceTypeLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum stringColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum stringDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum stringTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum subProjectLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum sysClusterLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGroupLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGrpIncLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tSecGrpMembLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum tZDateColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZDateDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZDateTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZTimeColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZTimeDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZTimeTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZTimestampColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZTimestampDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tZTimestampTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tableLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tableColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tableTweakLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tenantLoaderBehaviour = LoaderBehaviourEnum.Insert;
	private LoaderBehaviourEnum textColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum textDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum textTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum timeColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum timeDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum timeTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum timestampColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum timestampDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum timestampTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tldLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tokenColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tokenDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tokenTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum topDomainLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum topProjectLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum tweakLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt16ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt16DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt16TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt32ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt32DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt32TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt64ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt64DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uInt64TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uRLProtocolLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuid6ColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuid6DefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuid6GenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuid6TypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuidColLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuidDefLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuidGenLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum uuidTypeLoaderBehaviour = LoaderBehaviourEnum.Update;
	private LoaderBehaviourEnum valueLoaderBehaviour = LoaderBehaviourEnum.Update;


	// Constructors

	public YCFBamSaxLoader() {
		super();
		setRootElementHandler( getSaxRootHandler() );
		initParser();
	}

	public YCFBamSaxLoader( IYCFLibMessageLog logger ) {
		super( logger );
		setRootElementHandler( getSaxRootHandler() );
		initParser();
	}

	// Element Handler instances

	private YCFBamSaxLoaderAtom atomHandler = null;
	private YCFBamSaxLoaderBlobCol blobColHandler = null;
	private YCFBamSaxLoaderBlobDef blobDefHandler = null;
	private YCFBamSaxLoaderBlobType blobTypeHandler = null;
	private YCFBamSaxLoaderBoolCol boolColHandler = null;
	private YCFBamSaxLoaderBoolDef boolDefHandler = null;
	private YCFBamSaxLoaderBoolType boolTypeHandler = null;
	private YCFBamSaxLoaderChain chainHandler = null;
	private YCFBamSaxLoaderClearDep clearDepHandler = null;
	private YCFBamSaxLoaderClearSubDep1 clearSubDep1Handler = null;
	private YCFBamSaxLoaderClearSubDep2 clearSubDep2Handler = null;
	private YCFBamSaxLoaderClearSubDep3 clearSubDep3Handler = null;
	private YCFBamSaxLoaderClearTopDep clearTopDepHandler = null;
	private YCFBamSaxLoaderCluster clusterHandler = null;
	private YCFBamSaxLoaderDateCol dateColHandler = null;
	private YCFBamSaxLoaderDateDef dateDefHandler = null;
	private YCFBamSaxLoaderDateType dateTypeHandler = null;
	private YCFBamSaxLoaderDbKeyHash128Col dbKeyHash128ColHandler = null;
	private YCFBamSaxLoaderDbKeyHash128Def dbKeyHash128DefHandler = null;
	private YCFBamSaxLoaderDbKeyHash128Gen dbKeyHash128GenHandler = null;
	private YCFBamSaxLoaderDbKeyHash128Type dbKeyHash128TypeHandler = null;
	private YCFBamSaxLoaderDbKeyHash160Col dbKeyHash160ColHandler = null;
	private YCFBamSaxLoaderDbKeyHash160Def dbKeyHash160DefHandler = null;
	private YCFBamSaxLoaderDbKeyHash160Gen dbKeyHash160GenHandler = null;
	private YCFBamSaxLoaderDbKeyHash160Type dbKeyHash160TypeHandler = null;
	private YCFBamSaxLoaderDbKeyHash224Col dbKeyHash224ColHandler = null;
	private YCFBamSaxLoaderDbKeyHash224Def dbKeyHash224DefHandler = null;
	private YCFBamSaxLoaderDbKeyHash224Gen dbKeyHash224GenHandler = null;
	private YCFBamSaxLoaderDbKeyHash224Type dbKeyHash224TypeHandler = null;
	private YCFBamSaxLoaderDbKeyHash256Col dbKeyHash256ColHandler = null;
	private YCFBamSaxLoaderDbKeyHash256Def dbKeyHash256DefHandler = null;
	private YCFBamSaxLoaderDbKeyHash256Gen dbKeyHash256GenHandler = null;
	private YCFBamSaxLoaderDbKeyHash256Type dbKeyHash256TypeHandler = null;
	private YCFBamSaxLoaderDbKeyHash384Col dbKeyHash384ColHandler = null;
	private YCFBamSaxLoaderDbKeyHash384Def dbKeyHash384DefHandler = null;
	private YCFBamSaxLoaderDbKeyHash384Gen dbKeyHash384GenHandler = null;
	private YCFBamSaxLoaderDbKeyHash384Type dbKeyHash384TypeHandler = null;
	private YCFBamSaxLoaderDbKeyHash512Col dbKeyHash512ColHandler = null;
	private YCFBamSaxLoaderDbKeyHash512Def dbKeyHash512DefHandler = null;
	private YCFBamSaxLoaderDbKeyHash512Gen dbKeyHash512GenHandler = null;
	private YCFBamSaxLoaderDbKeyHash512Type dbKeyHash512TypeHandler = null;
	private YCFBamSaxLoaderDelDep delDepHandler = null;
	private YCFBamSaxLoaderDelSubDep1 delSubDep1Handler = null;
	private YCFBamSaxLoaderDelSubDep2 delSubDep2Handler = null;
	private YCFBamSaxLoaderDelSubDep3 delSubDep3Handler = null;
	private YCFBamSaxLoaderDelTopDep delTopDepHandler = null;
	private YCFBamSaxLoaderDoubleCol doubleColHandler = null;
	private YCFBamSaxLoaderDoubleDef doubleDefHandler = null;
	private YCFBamSaxLoaderDoubleType doubleTypeHandler = null;
	private YCFBamSaxLoaderEnumDef enumDefHandler = null;
	private YCFBamSaxLoaderEnumTag enumTagHandler = null;
	private YCFBamSaxLoaderEnumType enumTypeHandler = null;
	private YCFBamSaxLoaderFloatCol floatColHandler = null;
	private YCFBamSaxLoaderFloatDef floatDefHandler = null;
	private YCFBamSaxLoaderFloatType floatTypeHandler = null;
	private YCFBamSaxLoaderHostNode hostNodeHandler = null;
	private YCFBamSaxLoaderISOCcy iSOCcyHandler = null;
	private YCFBamSaxLoaderISOCtry iSOCtryHandler = null;
	private YCFBamSaxLoaderISOCtryCcy iSOCtryCcyHandler = null;
	private YCFBamSaxLoaderISOCtryLang iSOCtryLangHandler = null;
	private YCFBamSaxLoaderISOLang iSOLangHandler = null;
	private YCFBamSaxLoaderISOTZone iSOTZoneHandler = null;
	private YCFBamSaxLoaderId16Gen id16GenHandler = null;
	private YCFBamSaxLoaderId32Gen id32GenHandler = null;
	private YCFBamSaxLoaderId64Gen id64GenHandler = null;
	private YCFBamSaxLoaderIndex indexHandler = null;
	private YCFBamSaxLoaderIndexCol indexColHandler = null;
	private YCFBamSaxLoaderIndexTweak indexTweakHandler = null;
	private YCFBamSaxLoaderInt16Col int16ColHandler = null;
	private YCFBamSaxLoaderInt16Def int16DefHandler = null;
	private YCFBamSaxLoaderInt16Type int16TypeHandler = null;
	private YCFBamSaxLoaderInt32Col int32ColHandler = null;
	private YCFBamSaxLoaderInt32Def int32DefHandler = null;
	private YCFBamSaxLoaderInt32Type int32TypeHandler = null;
	private YCFBamSaxLoaderInt64Col int64ColHandler = null;
	private YCFBamSaxLoaderInt64Def int64DefHandler = null;
	private YCFBamSaxLoaderInt64Type int64TypeHandler = null;
	private YCFBamSaxLoaderLicense licenseHandler = null;
	private YCFBamSaxLoaderMajorVersion majorVersionHandler = null;
	private YCFBamSaxLoaderMimeType mimeTypeHandler = null;
	private YCFBamSaxLoaderMinorVersion minorVersionHandler = null;
	private YCFBamSaxLoaderNmTokenCol nmTokenColHandler = null;
	private YCFBamSaxLoaderNmTokenDef nmTokenDefHandler = null;
	private YCFBamSaxLoaderNmTokenType nmTokenTypeHandler = null;
	private YCFBamSaxLoaderNmTokensCol nmTokensColHandler = null;
	private YCFBamSaxLoaderNmTokensDef nmTokensDefHandler = null;
	private YCFBamSaxLoaderNmTokensType nmTokensTypeHandler = null;
	private YCFBamSaxLoaderNumberCol numberColHandler = null;
	private YCFBamSaxLoaderNumberDef numberDefHandler = null;
	private YCFBamSaxLoaderNumberType numberTypeHandler = null;
	private YCFBamSaxLoaderParam paramHandler = null;
	private YCFBamSaxLoaderPopDep popDepHandler = null;
	private YCFBamSaxLoaderPopSubDep1 popSubDep1Handler = null;
	private YCFBamSaxLoaderPopSubDep2 popSubDep2Handler = null;
	private YCFBamSaxLoaderPopSubDep3 popSubDep3Handler = null;
	private YCFBamSaxLoaderPopTopDep popTopDepHandler = null;
	private YCFBamSaxLoaderRelation relationHandler = null;
	private YCFBamSaxLoaderRelationCol relationColHandler = null;
	private YCFBamSaxLoaderRoleDef roleDefHandler = null;
	private YCFBamSaxLoaderSchemaDef schemaDefHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeSchemaObjImport schemaDefCafeSchemaObjImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeSchemaObjInterface schemaDefCafeSchemaObjInterfaceHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeSchemaObjMembers schemaDefCafeSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeSchemaObjImplementation schemaDefCafeSchemaObjImplementationHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjMembers schemaDefCafeDb2LUWSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjImpl schemaDefCafeDb2LUWSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjImport schemaDefCafeDb2LUWSchemaObjImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjMembers schemaDefCafeMSSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjImpl schemaDefCafeMSSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjImport schemaDefCafeMSSqlSchemaObjImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjMembers schemaDefCafeMySqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjImpl schemaDefCafeMySqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjImport schemaDefCafeMySqlSchemaObjImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjMembers schemaDefCafeOracleSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjImpl schemaDefCafeOracleSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjImport schemaDefCafeOracleSchemaObjImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjMembers schemaDefCafePgSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjImpl schemaDefCafePgSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjImport schemaDefCafePgSqlSchemaObjImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeRamSchemaObjMembers schemaDefCafeRamSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeRamSchemaObjImpl schemaDefCafeRamSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeRamSchemaObjImport schemaDefCafeRamSchemaObjImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgSchemaImport schemaDefCafeXMsgSchemaImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgSchemaFormatters schemaDefCafeXMsgSchemaFormattersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgClientSchemaImport schemaDefCafeXMsgClientSchemaImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgClientSchemaBody schemaDefCafeXMsgClientSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaBody schemaDefCafeXMsgRqstSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaImport schemaDefCafeXMsgRqstSchemaImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaWireParsers schemaDefCafeXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaXsdSpec schemaDefCafeXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeSchemaXsdElementList schemaDefCafeSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaBody schemaDefCafeXMsgRspnSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaImport schemaDefCafeXMsgRspnSchemaImportHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaWireParsers schemaDefCafeXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaXsdElementList schemaDefCafeXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaXsdSpec schemaDefCafeXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusSchemaObjInclude schemaDefCPlusSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusSchemaObjInterface schemaDefCPlusSchemaObjInterfaceHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusSchemaObjMembers schemaDefCPlusSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusSchemaObjImplementation schemaDefCPlusSchemaObjImplementationHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjMembers schemaDefCPlusDb2LUWSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjImpl schemaDefCPlusDb2LUWSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjInclude schemaDefCPlusDb2LUWSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjMembers schemaDefCPlusMSSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjImpl schemaDefCPlusMSSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjInclude schemaDefCPlusMSSqlSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjMembers schemaDefCPlusMySqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjImpl schemaDefCPlusMySqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjInclude schemaDefCPlusMySqlSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjMembers schemaDefCPlusOracleSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjImpl schemaDefCPlusOracleSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjInclude schemaDefCPlusOracleSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjMembers schemaDefCPlusPgSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjImpl schemaDefCPlusPgSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjInclude schemaDefCPlusPgSqlSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjMembers schemaDefCPlusRamSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjImpl schemaDefCPlusRamSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjInclude schemaDefCPlusRamSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgSchemaInclude schemaDefCPlusXMsgSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgSchemaFormatters schemaDefCPlusXMsgSchemaFormattersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgClientSchemaInclude schemaDefCPlusXMsgClientSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgClientSchemaBody schemaDefCPlusXMsgClientSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaBody schemaDefCPlusXMsgRqstSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaInclude schemaDefCPlusXMsgRqstSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaWireParsers schemaDefCPlusXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaXsdSpec schemaDefCPlusXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaXsdElementList schemaDefCPlusXMsgRqstSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXmsgRspnSchemaBody schemaDefCPlusXmsgRspnSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaInclude schemaDefCPlusXMsgRspnSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaWireParsers schemaDefCPlusXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaXsdElementList schemaDefCPlusXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaXsdSpec schemaDefCPlusXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusSchemaObjInclude schemaDefHPlusSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusSchemaObjInterface schemaDefHPlusSchemaObjInterfaceHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusSchemaObjMembers schemaDefHPlusSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusSchemaObjImplementation schemaDefHPlusSchemaObjImplementationHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjMembers schemaDefHPlusDb2LUWSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjImpl schemaDefHPlusDb2LUWSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjInclude schemaDefHPlusDb2LUWSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjMembers schemaDefHPlusMSSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjImpl schemaDefHPlusMSSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjInclude schemaDefHPlusMSSqlSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjMembers schemaDefHPlusMySqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjImpl schemaDefHPlusMySqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjInclude schemaDefHPlusMySqlSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjMembers schemaDefHPlusOracleSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjImpl schemaDefHPlusOracleSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjInclude schemaDefHPlusOracleSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjMembers schemaDefHPlusPgSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjImpl schemaDefHPlusPgSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjInclude schemaDefHPlusPgSqlSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjMembers schemaDefHPlusRamSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjImpl schemaDefHPlusRamSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjInclude schemaDefHPlusRamSchemaObjIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgSchemaInclude schemaDefHPlusXMsgSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgSchemaFormatters schemaDefHPlusXMsgSchemaFormattersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgClientSchemaInclude schemaDefHPlusXMsgClientSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgClientSchemaBody schemaDefHPlusXMsgClientSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaBody schemaDefHPlusXMsgRqstSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaInclude schemaDefHPlusXMsgRqstSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaWireParsers schemaDefHPlusXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaXsdSpec schemaDefHPlusXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaXsdElementList schemaDefHPlusXMsgRqstSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaBody schemaDefHPlusXMsgRspnSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaInclude schemaDefHPlusXMsgRspnSchemaIncludeHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaWireParsers schemaDefHPlusXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaXsdElementList schemaDefHPlusXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaXsdSpec schemaDefHPlusXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpSchemaObjUsing schemaDefCSharpSchemaObjUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpSchemaObjInterface schemaDefCSharpSchemaObjInterfaceHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpSchemaObjMembers schemaDefCSharpSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpSchemaObjImplementation schemaDefCSharpSchemaObjImplementationHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjMembers schemaDefCSharpDb2LUWSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjImpl schemaDefCSharpDb2LUWSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjUsing schemaDefCSharpDb2LUWSchemaObjUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjMembers schemaDefCSharpMSSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjImpl schemaDefCSharpMSSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjUsing schemaDefCSharpMSSqlSchemaObjUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjMembers schemaDefCSharpMySqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjImpl schemaDefCSharpMySqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjUsing schemaDefCSharpMySqlSchemaObjUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjMembers schemaDefCSharpOracleSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjImpl schemaDefCSharpOracleSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjUsing schemaDefCSharpOracleSchemaObjUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjMembers schemaDefCSharpPgSqlSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjImpl schemaDefCSharpPgSqlSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjUsing schemaDefCSharpPgSqlSchemaObjUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjMembers schemaDefCSharpRamSchemaObjMembersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjImpl schemaDefCSharpRamSchemaObjImplHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjUsing schemaDefCSharpRamSchemaObjUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgSchemaUsing schemaDefCSharpXMsgSchemaUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgSchemaFormatters schemaDefCSharpXMsgSchemaFormattersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgClientSchemaUsing schemaDefCSharpXMsgClientSchemaUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgClientSchemaBody schemaDefCSharpXMsgClientSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaBody schemaDefCSharpXMsgRqstSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaUsing schemaDefCSharpXMsgRqstSchemaUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaWireParsers schemaDefCSharpXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaXsdSpec schemaDefCSharpXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaXsdElementList schemaDefCSharpXMsgRqstSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaBody schemaDefCSharpXMsgRspnSchemaBodyHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaUsing schemaDefCSharpXMsgRspnSchemaUsingHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaWireParsers schemaDefCSharpXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaXsdElementList schemaDefCSharpXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaXsdSpec schemaDefCSharpXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamSaxLoaderSchemaRef schemaRefHandler = null;
	private YCFBamSaxLoaderSchemaRole schemaRoleHandler = null;
	private YCFBamSaxLoaderSchemaTweak schemaTweakHandler = null;
	private YCFBamSaxLoaderScope scopeHandler = null;
	private YCFBamSaxLoaderSecApp secAppHandler = null;
	private YCFBamSaxLoaderSecDevice secDeviceHandler = null;
	private YCFBamSaxLoaderSecForm secFormHandler = null;
	private YCFBamSaxLoaderSecGroup secGroupHandler = null;
	private YCFBamSaxLoaderSecGroupForm secGroupFormHandler = null;
	private YCFBamSaxLoaderSecGrpInc secGrpIncHandler = null;
	private YCFBamSaxLoaderSecGrpMemb secGrpMembHandler = null;
	private YCFBamSaxLoaderSecSession secSessionHandler = null;
	private YCFBamSaxLoaderSecUser secUserHandler = null;
	private YCFBamSaxLoaderServerListFunc serverListFuncHandler = null;
	private YCFBamSaxLoaderServerMethod serverMethodHandler = null;
	private YCFBamSaxLoaderServerObjFunc serverObjFuncHandler = null;
	private YCFBamSaxLoaderServerProc serverProcHandler = null;
	private YCFBamSaxLoaderService serviceHandler = null;
	private YCFBamSaxLoaderServiceType serviceTypeHandler = null;
	private YCFBamSaxLoaderStringCol stringColHandler = null;
	private YCFBamSaxLoaderStringDef stringDefHandler = null;
	private YCFBamSaxLoaderStringType stringTypeHandler = null;
	private YCFBamSaxLoaderSubProject subProjectHandler = null;
	private YCFBamSaxLoaderSysCluster sysClusterHandler = null;
	private YCFBamSaxLoaderTSecGroup tSecGroupHandler = null;
	private YCFBamSaxLoaderTSecGrpInc tSecGrpIncHandler = null;
	private YCFBamSaxLoaderTSecGrpMemb tSecGrpMembHandler = null;
	private YCFBamSaxLoaderTZDateCol tZDateColHandler = null;
	private YCFBamSaxLoaderTZDateDef tZDateDefHandler = null;
	private YCFBamSaxLoaderTZDateType tZDateTypeHandler = null;
	private YCFBamSaxLoaderTZTimeCol tZTimeColHandler = null;
	private YCFBamSaxLoaderTZTimeDef tZTimeDefHandler = null;
	private YCFBamSaxLoaderTZTimeType tZTimeTypeHandler = null;
	private YCFBamSaxLoaderTZTimestampCol tZTimestampColHandler = null;
	private YCFBamSaxLoaderTZTimestampDef tZTimestampDefHandler = null;
	private YCFBamSaxLoaderTZTimestampType tZTimestampTypeHandler = null;
	private YCFBamSaxLoaderTable tableHandler = null;
	private YCFBamSaxLoaderTableCafeObjMembers tableCafeObjMembersHandler = null;
	private YCFBamSaxLoaderTableCafeObjInterface tableCafeObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCafeObjImport tableCafeObjImportHandler = null;
	private YCFBamSaxLoaderTableCafeObjImplementation tableCafeObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeEditObjMembers tableCafeEditObjMembersHandler = null;
	private YCFBamSaxLoaderTableCafeEditObjInterface tableCafeEditObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCafeEditObjImport tableCafeEditObjImportHandler = null;
	private YCFBamSaxLoaderTableCafeEditObjImplementation tableCafeEditObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeTableImport tableCafeTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeTableMembers tableCafeTableMembersHandler = null;
	private YCFBamSaxLoaderTableCafeTableInterface tableCafeTableInterfaceHandler = null;
	private YCFBamSaxLoaderTableCafeTableImplementation tableCafeTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeTableObjImport tableCafeTableObjImportHandler = null;
	private YCFBamSaxLoaderTableCafeTableObjMembers tableCafeTableObjMembersHandler = null;
	private YCFBamSaxLoaderTableCafeTableObjInterface tableCafeTableObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCafeTableObjImplementation tableCafeTableObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeDb2LUWTableImport tableCafeDb2LUWTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeDb2LUWTableMembers tableCafeDb2LUWTableMembersHandler = null;
	private YCFBamSaxLoaderTableCafeDb2LUWTableImplementation tableCafeDb2LUWTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeMSSqlTableImport tableCafeMSSqlTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeMSSqlTableMembers tableCafeMSSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCafeMSSqlTableImplementation tableCafeMSSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeMySqlTableImport tableCafeMySqlTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeMySqlTableMembers tableCafeMySqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCafeMySqlTableImplementation tableCafeMySqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeOracleTableImport tableCafeOracleTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeOracleTableMembers tableCafeOracleTableMembersHandler = null;
	private YCFBamSaxLoaderTableCafeOracleTableImplementation tableCafeOracleTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCafePgSqlTableImport tableCafePgSqlTableImportHandler = null;
	private YCFBamSaxLoaderTableCafePgSqlTableMembers tableCafePgSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCafePgSqlTableImplementation tableCafePgSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeRamTableImport tableCafeRamTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeRamTableMembers tableCafeRamTableMembersHandler = null;
	private YCFBamSaxLoaderTableCafeRamTableImplementation tableCafeRamTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCafeSaxLoaderImport tableCafeSaxLoaderImportHandler = null;
	private YCFBamSaxLoaderTableCafeSaxLoaderStartElement tableCafeSaxLoaderStartElementHandler = null;
	private YCFBamSaxLoaderTableCafeSaxLoaderEndElement tableCafeSaxLoaderEndElementHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgTableImport tableCafeXMsgTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgTableformatters tableCafeXMsgTableformattersHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgRqstTableImport tableCafeXMsgRqstTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgRspnTableImport tableCafeXMsgRspnTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgClientTableImport tableCafeXMsgClientTableImportHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgRqstTableBody tableCafeXMsgRqstTableBodyHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgRspnTableBody tableCafeXMsgRspnTableBodyHandler = null;
	private YCFBamSaxLoaderTableCafeXMsgClientTableBody tableCafeXMsgClientTableBodyHandler = null;
	private YCFBamSaxLoaderTableCPlusObjMembers tableCPlusObjMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusObjInterface tableCPlusObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCPlusObjInclude tableCPlusObjIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusObjImplementation tableCPlusObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusEditObjMembers tableCPlusEditObjMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusEditObjInterace tableCPlusEditObjInteraceHandler = null;
	private YCFBamSaxLoaderTableCPlusEditObjInclude tableCPlusEditObjIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusEditObjImplementation tableCPlusEditObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusTableInclude tableCPlusTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusTableMembers tableCPlusTableMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusTableInterface tableCPlusTableInterfaceHandler = null;
	private YCFBamSaxLoaderTableCPlusTableImplementation tableCPlusTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusTableObjInclude tableCPlusTableObjIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusTableObjMembers tableCPlusTableObjMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusTableObjInterface tableCPlusTableObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCPlusTableObjImplementation tableCPlusTableObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusDb2LUWTableInclude tableCPlusDb2LUWTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusDb2LUWTableMembers tableCPlusDb2LUWTableMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusDb2LUWTableImplementation tableCPlusDb2LUWTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusMSSqlTableInclude tableCPlusMSSqlTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusMSSqlTableMembers tableCPlusMSSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusMSSqlTableImplementation tableCPlusMSSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusMySqlTableInclude tableCPlusMySqlTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusMySqlTableMembers tableCPlusMySqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusMySqlTableImplementation tableCPlusMySqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusOracleTableInclude tableCPlusOracleTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusOracleTableMembers tableCPlusOracleTableMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusOracleTableImplementation tableCPlusOracleTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusPgSqlTableMembers tableCPlusPgSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusPgSqlTableImplementation tableCPlusPgSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusRamTableInclude tableCPlusRamTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusRamTableMembers tableCPlusRamTableMembersHandler = null;
	private YCFBamSaxLoaderTableCPlusRamTableImplementation tableCPlusRamTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCPlusSaxLoaderInclude tableCPlusSaxLoaderIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusSaxLoaderStartElement tableCPlusSaxLoaderStartElementHandler = null;
	private YCFBamSaxLoaderTableCPlusSaxLoaderEndElement tableCPlusSaxLoaderEndElementHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgTableInclude tableCPlusXMsgTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgTableFormatters tableCPlusXMsgTableFormattersHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgRqstTableInclude tableCPlusXMsgRqstTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgRspnTableInclude tableCPlusXMsgRspnTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgClientTableInclude tableCPlusXMsgClientTableIncludeHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgRqstTableBody tableCPlusXMsgRqstTableBodyHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgRspnTableBody tableCPlusXMsgRspnTableBodyHandler = null;
	private YCFBamSaxLoaderTableCPlusXMsgClientTableBody tableCPlusXMsgClientTableBodyHandler = null;
	private YCFBamSaxLoaderTableHPlusObjMembers tableHPlusObjMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusObjInterface tableHPlusObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableHPlusObjInclude tableHPlusObjIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusObjImplemntation tableHPlusObjImplemntationHandler = null;
	private YCFBamSaxLoaderTableHPlusEditObjMembers tableHPlusEditObjMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusEditObjInterface tableHPlusEditObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableHPlusEditObjInclude tableHPlusEditObjIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusEditObjImplementation tableHPlusEditObjImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusTableInclude tableHPlusTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusTableMembers tableHPlusTableMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusTableInterface tableHPlusTableInterfaceHandler = null;
	private YCFBamSaxLoaderTableHPlusTableImplementation tableHPlusTableImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusTableObjInclude tableHPlusTableObjIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusTableObjMembers tableHPlusTableObjMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusTableObjInterface tableHPlusTableObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableHPlusTableObjImplementation tableHPlusTableObjImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusDb2LUWTableInclude tableHPlusDb2LUWTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusDb2LUWTableMembers tableHPlusDb2LUWTableMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusDb2LUWTableImplementation tableHPlusDb2LUWTableImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusMSSqlTableInclude tableHPlusMSSqlTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusMSSqlTableMembers tableHPlusMSSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusMSSqlTableImplementation tableHPlusMSSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusMySqlTableInclude tableHPlusMySqlTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusMySqlTableMembers tableHPlusMySqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusMySqlTableImplementation tableHPlusMySqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusOracleTableInclude tableHPlusOracleTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusOracleTableMembers tableHPlusOracleTableMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusOracleTableImplementation tableHPlusOracleTableImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusPgSqlTableInclude tableHPlusPgSqlTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusPgSqlTableMembers tableHPlusPgSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusPgSqlTableImplementation tableHPlusPgSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusRamTableInclude tableHPlusRamTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusRamTableMembers tableHPlusRamTableMembersHandler = null;
	private YCFBamSaxLoaderTableHPlusRamTableImplementation tableHPlusRamTableImplementationHandler = null;
	private YCFBamSaxLoaderTableHPlusSaxLoaderInclude tableHPlusSaxLoaderIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusSaxLoaderStartElement tableHPlusSaxLoaderStartElementHandler = null;
	private YCFBamSaxLoaderTableHPlusSaxLoaderEndElement tableHPlusSaxLoaderEndElementHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgTableInclude tableHPlusXMsgTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgTableFormatters tableHPlusXMsgTableFormattersHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgRqstTableInclude tableHPlusXMsgRqstTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgRspnTableInclude tableHPlusXMsgRspnTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgClientTableInclude tableHPlusXMsgClientTableIncludeHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgRqstTableBody tableHPlusXMsgRqstTableBodyHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgRspnTableBody tableHPlusXMsgRspnTableBodyHandler = null;
	private YCFBamSaxLoaderTableHPlusXMsgClientTableBody tableHPlusXMsgClientTableBodyHandler = null;
	private YCFBamSaxLoaderTableCSharpObjMembers tableCSharpObjMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpObjInterface tableCSharpObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCSharpObjUsing tableCSharpObjUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpObjImplementation tableCSharpObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpEditObjMembers tableCSharpEditObjMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpEditObjInterface tableCSharpEditObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCSharpEditObjUsing tableCSharpEditObjUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpEditObjImplementation tableCSharpEditObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpTableUsing tableCSharpTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpTableMembers tableCSharpTableMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpTableInterface tableCSharpTableInterfaceHandler = null;
	private YCFBamSaxLoaderTableCSharpTableImplementation tableCSharpTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpTableObjUsing tableCSharpTableObjUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpTableObjMembers tableCSharpTableObjMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpTableObjInterface tableCSharpTableObjInterfaceHandler = null;
	private YCFBamSaxLoaderTableCSharpTableObjImplementation tableCSharpTableObjImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpDb2LUWTableUsing tableCSharpDb2LUWTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpDb2LUWTableMembers tableCSharpDb2LUWTableMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpDb2LUWTableImplementation tableCSharpDb2LUWTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpMSSqlTableUsing tableCSharpMSSqlTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpMSSqlTableMembers tableCSharpMSSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpMSSqlTableImplementation tableCSharpMSSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpMySqlTableUsing tableCSharpMySqlTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpMySqlTableMembers tableCSharpMySqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpMySqlTableImplementation tableCSharpMySqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpOracleTableUsing tableCSharpOracleTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpOracleTableMembers tableCSharpOracleTableMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpOracleTableImplementation tableCSharpOracleTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpPgSqlTableUsing tableCSharpPgSqlTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpPgSqlTableMembers tableCSharpPgSqlTableMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpPgSqlTableImplementation tableCSharpPgSqlTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpRamTableUsing tableCSharpRamTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpRamTableMembers tableCSharpRamTableMembersHandler = null;
	private YCFBamSaxLoaderTableCSharpRamTableImplementation tableCSharpRamTableImplementationHandler = null;
	private YCFBamSaxLoaderTableCSharpSaxLoaderUsing tableCSharpSaxLoaderUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpSaxLoaderStartElement tableCSharpSaxLoaderStartElementHandler = null;
	private YCFBamSaxLoaderTableCSharpSaxLoaderEndElement tableCSharpSaxLoaderEndElementHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgTableUsing tableCSharpXMsgTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgTableFormatters tableCSharpXMsgTableFormattersHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgRqstTableUsing tableCSharpXMsgRqstTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgRspnTableUsing tableCSharpXMsgRspnTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgClientTableUsing tableCSharpXMsgClientTableUsingHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgRqstTableBody tableCSharpXMsgRqstTableBodyHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgRspnTableBody tableCSharpXMsgRspnTableBodyHandler = null;
	private YCFBamSaxLoaderTableCSharpXMsgClientTableBody tableCSharpXMsgClientTableBodyHandler = null;
	private YCFBamSaxLoaderTableCol tableColHandler = null;
	private YCFBamSaxLoaderTableTweak tableTweakHandler = null;
	private YCFBamSaxLoaderTenant tenantHandler = null;
	private YCFBamSaxLoaderTextCol textColHandler = null;
	private YCFBamSaxLoaderTextDef textDefHandler = null;
	private YCFBamSaxLoaderTextType textTypeHandler = null;
	private YCFBamSaxLoaderTimeCol timeColHandler = null;
	private YCFBamSaxLoaderTimeDef timeDefHandler = null;
	private YCFBamSaxLoaderTimeType timeTypeHandler = null;
	private YCFBamSaxLoaderTimestampCol timestampColHandler = null;
	private YCFBamSaxLoaderTimestampDef timestampDefHandler = null;
	private YCFBamSaxLoaderTimestampType timestampTypeHandler = null;
	private YCFBamSaxLoaderTld tldHandler = null;
	private YCFBamSaxLoaderTokenCol tokenColHandler = null;
	private YCFBamSaxLoaderTokenDef tokenDefHandler = null;
	private YCFBamSaxLoaderTokenType tokenTypeHandler = null;
	private YCFBamSaxLoaderTopDomain topDomainHandler = null;
	private YCFBamSaxLoaderTopProject topProjectHandler = null;
	private YCFBamSaxLoaderTweak tweakHandler = null;
	private YCFBamSaxLoaderUInt16Col uInt16ColHandler = null;
	private YCFBamSaxLoaderUInt16Def uInt16DefHandler = null;
	private YCFBamSaxLoaderUInt16Type uInt16TypeHandler = null;
	private YCFBamSaxLoaderUInt32Col uInt32ColHandler = null;
	private YCFBamSaxLoaderUInt32Def uInt32DefHandler = null;
	private YCFBamSaxLoaderUInt32Type uInt32TypeHandler = null;
	private YCFBamSaxLoaderUInt64Col uInt64ColHandler = null;
	private YCFBamSaxLoaderUInt64Def uInt64DefHandler = null;
	private YCFBamSaxLoaderUInt64Type uInt64TypeHandler = null;
	private YCFBamSaxLoaderURLProtocol uRLProtocolHandler = null;
	private YCFBamSaxLoaderUuid6Col uuid6ColHandler = null;
	private YCFBamSaxLoaderUuid6Def uuid6DefHandler = null;
	private YCFBamSaxLoaderUuid6Gen uuid6GenHandler = null;
	private YCFBamSaxLoaderUuid6Type uuid6TypeHandler = null;
	private YCFBamSaxLoaderUuidCol uuidColHandler = null;
	private YCFBamSaxLoaderUuidDef uuidDefHandler = null;
	private YCFBamSaxLoaderUuidGen uuidGenHandler = null;
	private YCFBamSaxLoaderUuidType uuidTypeHandler = null;
	private YCFBamSaxLoaderValue valueHandler = null;
	private YCFBamSaxRootHandler saxRootHandler = null;

	private YCFBamSaxDocHandler saxDocHandler = null;

	// Schema object accessors

	// SchemaObj accessors

	public IYCFBamSchemaObj getSchemaObj() {
		return( schemaObj );
	}

	public void setSchemaObj( IYCFBamSchemaObj value ) {
		schemaObj = value;
	}

	// Element Handler Resolver Factories

	protected YCFBamSaxLoaderAtom getAtomHandler() {
		if( atomHandler == null ) {
			atomHandler = new YCFBamSaxLoaderAtom( this );
		}
		return( atomHandler );
	}
	protected YCFBamSaxLoaderBlobCol getBlobColHandler() {
		if( blobColHandler == null ) {
			blobColHandler = new YCFBamSaxLoaderBlobCol( this );
		}
		return( blobColHandler );
	}
	protected YCFBamSaxLoaderBlobDef getBlobDefHandler() {
		if( blobDefHandler == null ) {
			blobDefHandler = new YCFBamSaxLoaderBlobDef( this );
		}
		return( blobDefHandler );
	}
	protected YCFBamSaxLoaderBlobType getBlobTypeHandler() {
		if( blobTypeHandler == null ) {
			blobTypeHandler = new YCFBamSaxLoaderBlobType( this );
		}
		return( blobTypeHandler );
	}
	protected YCFBamSaxLoaderBoolCol getBoolColHandler() {
		if( boolColHandler == null ) {
			boolColHandler = new YCFBamSaxLoaderBoolCol( this );
		}
		return( boolColHandler );
	}
	protected YCFBamSaxLoaderBoolDef getBoolDefHandler() {
		if( boolDefHandler == null ) {
			boolDefHandler = new YCFBamSaxLoaderBoolDef( this );
		}
		return( boolDefHandler );
	}
	protected YCFBamSaxLoaderBoolType getBoolTypeHandler() {
		if( boolTypeHandler == null ) {
			boolTypeHandler = new YCFBamSaxLoaderBoolType( this );
		}
		return( boolTypeHandler );
	}
	protected YCFBamSaxLoaderChain getChainHandler() {
		if( chainHandler == null ) {
			chainHandler = new YCFBamSaxLoaderChain( this );
		}
		return( chainHandler );
	}
	protected YCFBamSaxLoaderClearDep getClearDepHandler() {
		if( clearDepHandler == null ) {
			clearDepHandler = new YCFBamSaxLoaderClearDep( this );
		}
		return( clearDepHandler );
	}
	protected YCFBamSaxLoaderClearSubDep1 getClearSubDep1Handler() {
		if( clearSubDep1Handler == null ) {
			clearSubDep1Handler = new YCFBamSaxLoaderClearSubDep1( this );
			clearSubDep1Handler.addElementHandler( "ClearSubDep2", getClearSubDep2Handler() );
		}
		return( clearSubDep1Handler );
	}
	protected YCFBamSaxLoaderClearSubDep2 getClearSubDep2Handler() {
		if( clearSubDep2Handler == null ) {
			clearSubDep2Handler = new YCFBamSaxLoaderClearSubDep2( this );
			clearSubDep2Handler.addElementHandler( "ClearSubDep3", getClearSubDep3Handler() );
		}
		return( clearSubDep2Handler );
	}
	protected YCFBamSaxLoaderClearSubDep3 getClearSubDep3Handler() {
		if( clearSubDep3Handler == null ) {
			clearSubDep3Handler = new YCFBamSaxLoaderClearSubDep3( this );
		}
		return( clearSubDep3Handler );
	}
	protected YCFBamSaxLoaderClearTopDep getClearTopDepHandler() {
		if( clearTopDepHandler == null ) {
			clearTopDepHandler = new YCFBamSaxLoaderClearTopDep( this );
			clearTopDepHandler.addElementHandler( "ClearSubDep1", getClearSubDep1Handler() );
		}
		return( clearTopDepHandler );
	}
	protected YCFBamSaxLoaderCluster getClusterHandler() {
		if( clusterHandler == null ) {
			clusterHandler = new YCFBamSaxLoaderCluster( this );
			clusterHandler.addElementHandler( "HostNode", getHostNodeHandler() );
			clusterHandler.addElementHandler( "Tenant", getTenantHandler() );
			clusterHandler.addElementHandler( "SecApp", getSecAppHandler() );
			clusterHandler.addElementHandler( "SecGroup", getSecGroupHandler() );
			clusterHandler.addElementHandler( "SysCluster", getSysClusterHandler() );
		}
		return( clusterHandler );
	}
	protected YCFBamSaxLoaderDateCol getDateColHandler() {
		if( dateColHandler == null ) {
			dateColHandler = new YCFBamSaxLoaderDateCol( this );
		}
		return( dateColHandler );
	}
	protected YCFBamSaxLoaderDateDef getDateDefHandler() {
		if( dateDefHandler == null ) {
			dateDefHandler = new YCFBamSaxLoaderDateDef( this );
		}
		return( dateDefHandler );
	}
	protected YCFBamSaxLoaderDateType getDateTypeHandler() {
		if( dateTypeHandler == null ) {
			dateTypeHandler = new YCFBamSaxLoaderDateType( this );
		}
		return( dateTypeHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash128Col getDbKeyHash128ColHandler() {
		if( dbKeyHash128ColHandler == null ) {
			dbKeyHash128ColHandler = new YCFBamSaxLoaderDbKeyHash128Col( this );
		}
		return( dbKeyHash128ColHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash128Def getDbKeyHash128DefHandler() {
		if( dbKeyHash128DefHandler == null ) {
			dbKeyHash128DefHandler = new YCFBamSaxLoaderDbKeyHash128Def( this );
		}
		return( dbKeyHash128DefHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash128Gen getDbKeyHash128GenHandler() {
		if( dbKeyHash128GenHandler == null ) {
			dbKeyHash128GenHandler = new YCFBamSaxLoaderDbKeyHash128Gen( this );
		}
		return( dbKeyHash128GenHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash128Type getDbKeyHash128TypeHandler() {
		if( dbKeyHash128TypeHandler == null ) {
			dbKeyHash128TypeHandler = new YCFBamSaxLoaderDbKeyHash128Type( this );
		}
		return( dbKeyHash128TypeHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash160Col getDbKeyHash160ColHandler() {
		if( dbKeyHash160ColHandler == null ) {
			dbKeyHash160ColHandler = new YCFBamSaxLoaderDbKeyHash160Col( this );
		}
		return( dbKeyHash160ColHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash160Def getDbKeyHash160DefHandler() {
		if( dbKeyHash160DefHandler == null ) {
			dbKeyHash160DefHandler = new YCFBamSaxLoaderDbKeyHash160Def( this );
		}
		return( dbKeyHash160DefHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash160Gen getDbKeyHash160GenHandler() {
		if( dbKeyHash160GenHandler == null ) {
			dbKeyHash160GenHandler = new YCFBamSaxLoaderDbKeyHash160Gen( this );
		}
		return( dbKeyHash160GenHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash160Type getDbKeyHash160TypeHandler() {
		if( dbKeyHash160TypeHandler == null ) {
			dbKeyHash160TypeHandler = new YCFBamSaxLoaderDbKeyHash160Type( this );
		}
		return( dbKeyHash160TypeHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash224Col getDbKeyHash224ColHandler() {
		if( dbKeyHash224ColHandler == null ) {
			dbKeyHash224ColHandler = new YCFBamSaxLoaderDbKeyHash224Col( this );
		}
		return( dbKeyHash224ColHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash224Def getDbKeyHash224DefHandler() {
		if( dbKeyHash224DefHandler == null ) {
			dbKeyHash224DefHandler = new YCFBamSaxLoaderDbKeyHash224Def( this );
		}
		return( dbKeyHash224DefHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash224Gen getDbKeyHash224GenHandler() {
		if( dbKeyHash224GenHandler == null ) {
			dbKeyHash224GenHandler = new YCFBamSaxLoaderDbKeyHash224Gen( this );
		}
		return( dbKeyHash224GenHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash224Type getDbKeyHash224TypeHandler() {
		if( dbKeyHash224TypeHandler == null ) {
			dbKeyHash224TypeHandler = new YCFBamSaxLoaderDbKeyHash224Type( this );
		}
		return( dbKeyHash224TypeHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash256Col getDbKeyHash256ColHandler() {
		if( dbKeyHash256ColHandler == null ) {
			dbKeyHash256ColHandler = new YCFBamSaxLoaderDbKeyHash256Col( this );
		}
		return( dbKeyHash256ColHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash256Def getDbKeyHash256DefHandler() {
		if( dbKeyHash256DefHandler == null ) {
			dbKeyHash256DefHandler = new YCFBamSaxLoaderDbKeyHash256Def( this );
		}
		return( dbKeyHash256DefHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash256Gen getDbKeyHash256GenHandler() {
		if( dbKeyHash256GenHandler == null ) {
			dbKeyHash256GenHandler = new YCFBamSaxLoaderDbKeyHash256Gen( this );
		}
		return( dbKeyHash256GenHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash256Type getDbKeyHash256TypeHandler() {
		if( dbKeyHash256TypeHandler == null ) {
			dbKeyHash256TypeHandler = new YCFBamSaxLoaderDbKeyHash256Type( this );
		}
		return( dbKeyHash256TypeHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash384Col getDbKeyHash384ColHandler() {
		if( dbKeyHash384ColHandler == null ) {
			dbKeyHash384ColHandler = new YCFBamSaxLoaderDbKeyHash384Col( this );
		}
		return( dbKeyHash384ColHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash384Def getDbKeyHash384DefHandler() {
		if( dbKeyHash384DefHandler == null ) {
			dbKeyHash384DefHandler = new YCFBamSaxLoaderDbKeyHash384Def( this );
		}
		return( dbKeyHash384DefHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash384Gen getDbKeyHash384GenHandler() {
		if( dbKeyHash384GenHandler == null ) {
			dbKeyHash384GenHandler = new YCFBamSaxLoaderDbKeyHash384Gen( this );
		}
		return( dbKeyHash384GenHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash384Type getDbKeyHash384TypeHandler() {
		if( dbKeyHash384TypeHandler == null ) {
			dbKeyHash384TypeHandler = new YCFBamSaxLoaderDbKeyHash384Type( this );
		}
		return( dbKeyHash384TypeHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash512Col getDbKeyHash512ColHandler() {
		if( dbKeyHash512ColHandler == null ) {
			dbKeyHash512ColHandler = new YCFBamSaxLoaderDbKeyHash512Col( this );
		}
		return( dbKeyHash512ColHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash512Def getDbKeyHash512DefHandler() {
		if( dbKeyHash512DefHandler == null ) {
			dbKeyHash512DefHandler = new YCFBamSaxLoaderDbKeyHash512Def( this );
		}
		return( dbKeyHash512DefHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash512Gen getDbKeyHash512GenHandler() {
		if( dbKeyHash512GenHandler == null ) {
			dbKeyHash512GenHandler = new YCFBamSaxLoaderDbKeyHash512Gen( this );
		}
		return( dbKeyHash512GenHandler );
	}
	protected YCFBamSaxLoaderDbKeyHash512Type getDbKeyHash512TypeHandler() {
		if( dbKeyHash512TypeHandler == null ) {
			dbKeyHash512TypeHandler = new YCFBamSaxLoaderDbKeyHash512Type( this );
		}
		return( dbKeyHash512TypeHandler );
	}
	protected YCFBamSaxLoaderDelDep getDelDepHandler() {
		if( delDepHandler == null ) {
			delDepHandler = new YCFBamSaxLoaderDelDep( this );
		}
		return( delDepHandler );
	}
	protected YCFBamSaxLoaderDelSubDep1 getDelSubDep1Handler() {
		if( delSubDep1Handler == null ) {
			delSubDep1Handler = new YCFBamSaxLoaderDelSubDep1( this );
			delSubDep1Handler.addElementHandler( "DelSubDep2", getDelSubDep2Handler() );
		}
		return( delSubDep1Handler );
	}
	protected YCFBamSaxLoaderDelSubDep2 getDelSubDep2Handler() {
		if( delSubDep2Handler == null ) {
			delSubDep2Handler = new YCFBamSaxLoaderDelSubDep2( this );
			delSubDep2Handler.addElementHandler( "DelSubDep3", getDelSubDep3Handler() );
		}
		return( delSubDep2Handler );
	}
	protected YCFBamSaxLoaderDelSubDep3 getDelSubDep3Handler() {
		if( delSubDep3Handler == null ) {
			delSubDep3Handler = new YCFBamSaxLoaderDelSubDep3( this );
		}
		return( delSubDep3Handler );
	}
	protected YCFBamSaxLoaderDelTopDep getDelTopDepHandler() {
		if( delTopDepHandler == null ) {
			delTopDepHandler = new YCFBamSaxLoaderDelTopDep( this );
			delTopDepHandler.addElementHandler( "DelSubDep1", getDelSubDep1Handler() );
		}
		return( delTopDepHandler );
	}
	protected YCFBamSaxLoaderDoubleCol getDoubleColHandler() {
		if( doubleColHandler == null ) {
			doubleColHandler = new YCFBamSaxLoaderDoubleCol( this );
		}
		return( doubleColHandler );
	}
	protected YCFBamSaxLoaderDoubleDef getDoubleDefHandler() {
		if( doubleDefHandler == null ) {
			doubleDefHandler = new YCFBamSaxLoaderDoubleDef( this );
		}
		return( doubleDefHandler );
	}
	protected YCFBamSaxLoaderDoubleType getDoubleTypeHandler() {
		if( doubleTypeHandler == null ) {
			doubleTypeHandler = new YCFBamSaxLoaderDoubleType( this );
		}
		return( doubleTypeHandler );
	}
	protected YCFBamSaxLoaderEnumDef getEnumDefHandler() {
		if( enumDefHandler == null ) {
			enumDefHandler = new YCFBamSaxLoaderEnumDef( this );
			enumDefHandler.addElementHandler( "EnumTag", getEnumTagHandler() );
		}
		return( enumDefHandler );
	}
	protected YCFBamSaxLoaderEnumTag getEnumTagHandler() {
		if( enumTagHandler == null ) {
			enumTagHandler = new YCFBamSaxLoaderEnumTag( this );
		}
		return( enumTagHandler );
	}
	protected YCFBamSaxLoaderEnumType getEnumTypeHandler() {
		if( enumTypeHandler == null ) {
			enumTypeHandler = new YCFBamSaxLoaderEnumType( this );
			enumTypeHandler.addElementHandler( "EnumTag", getEnumTagHandler() );
		}
		return( enumTypeHandler );
	}
	protected YCFBamSaxLoaderFloatCol getFloatColHandler() {
		if( floatColHandler == null ) {
			floatColHandler = new YCFBamSaxLoaderFloatCol( this );
		}
		return( floatColHandler );
	}
	protected YCFBamSaxLoaderFloatDef getFloatDefHandler() {
		if( floatDefHandler == null ) {
			floatDefHandler = new YCFBamSaxLoaderFloatDef( this );
		}
		return( floatDefHandler );
	}
	protected YCFBamSaxLoaderFloatType getFloatTypeHandler() {
		if( floatTypeHandler == null ) {
			floatTypeHandler = new YCFBamSaxLoaderFloatType( this );
		}
		return( floatTypeHandler );
	}
	protected YCFBamSaxLoaderHostNode getHostNodeHandler() {
		if( hostNodeHandler == null ) {
			hostNodeHandler = new YCFBamSaxLoaderHostNode( this );
			hostNodeHandler.addElementHandler( "Service", getServiceHandler() );
		}
		return( hostNodeHandler );
	}
	protected YCFBamSaxLoaderISOCcy getISOCcyHandler() {
		if( iSOCcyHandler == null ) {
			iSOCcyHandler = new YCFBamSaxLoaderISOCcy( this );
		}
		return( iSOCcyHandler );
	}
	protected YCFBamSaxLoaderISOCtry getISOCtryHandler() {
		if( iSOCtryHandler == null ) {
			iSOCtryHandler = new YCFBamSaxLoaderISOCtry( this );
			iSOCtryHandler.addElementHandler( "ISOCtryCcy", getISOCtryCcyHandler() );
			iSOCtryHandler.addElementHandler( "ISOCtryLang", getISOCtryLangHandler() );
		}
		return( iSOCtryHandler );
	}
	protected YCFBamSaxLoaderISOCtryCcy getISOCtryCcyHandler() {
		if( iSOCtryCcyHandler == null ) {
			iSOCtryCcyHandler = new YCFBamSaxLoaderISOCtryCcy( this );
		}
		return( iSOCtryCcyHandler );
	}
	protected YCFBamSaxLoaderISOCtryLang getISOCtryLangHandler() {
		if( iSOCtryLangHandler == null ) {
			iSOCtryLangHandler = new YCFBamSaxLoaderISOCtryLang( this );
		}
		return( iSOCtryLangHandler );
	}
	protected YCFBamSaxLoaderISOLang getISOLangHandler() {
		if( iSOLangHandler == null ) {
			iSOLangHandler = new YCFBamSaxLoaderISOLang( this );
		}
		return( iSOLangHandler );
	}
	protected YCFBamSaxLoaderISOTZone getISOTZoneHandler() {
		if( iSOTZoneHandler == null ) {
			iSOTZoneHandler = new YCFBamSaxLoaderISOTZone( this );
		}
		return( iSOTZoneHandler );
	}
	protected YCFBamSaxLoaderId16Gen getId16GenHandler() {
		if( id16GenHandler == null ) {
			id16GenHandler = new YCFBamSaxLoaderId16Gen( this );
		}
		return( id16GenHandler );
	}
	protected YCFBamSaxLoaderId32Gen getId32GenHandler() {
		if( id32GenHandler == null ) {
			id32GenHandler = new YCFBamSaxLoaderId32Gen( this );
		}
		return( id32GenHandler );
	}
	protected YCFBamSaxLoaderId64Gen getId64GenHandler() {
		if( id64GenHandler == null ) {
			id64GenHandler = new YCFBamSaxLoaderId64Gen( this );
		}
		return( id64GenHandler );
	}
	protected YCFBamSaxLoaderIndex getIndexHandler() {
		if( indexHandler == null ) {
			indexHandler = new YCFBamSaxLoaderIndex( this );
			indexHandler.addElementHandler( "IndexCol", getIndexColHandler() );
			indexHandler.addElementHandler( "IndexTweak", getIndexTweakHandler() );
		}
		return( indexHandler );
	}
	protected YCFBamSaxLoaderIndexCol getIndexColHandler() {
		if( indexColHandler == null ) {
			indexColHandler = new YCFBamSaxLoaderIndexCol( this );
		}
		return( indexColHandler );
	}
	protected YCFBamSaxLoaderIndexTweak getIndexTweakHandler() {
		if( indexTweakHandler == null ) {
			indexTweakHandler = new YCFBamSaxLoaderIndexTweak( this );
		}
		return( indexTweakHandler );
	}
	protected YCFBamSaxLoaderInt16Col getInt16ColHandler() {
		if( int16ColHandler == null ) {
			int16ColHandler = new YCFBamSaxLoaderInt16Col( this );
		}
		return( int16ColHandler );
	}
	protected YCFBamSaxLoaderInt16Def getInt16DefHandler() {
		if( int16DefHandler == null ) {
			int16DefHandler = new YCFBamSaxLoaderInt16Def( this );
		}
		return( int16DefHandler );
	}
	protected YCFBamSaxLoaderInt16Type getInt16TypeHandler() {
		if( int16TypeHandler == null ) {
			int16TypeHandler = new YCFBamSaxLoaderInt16Type( this );
		}
		return( int16TypeHandler );
	}
	protected YCFBamSaxLoaderInt32Col getInt32ColHandler() {
		if( int32ColHandler == null ) {
			int32ColHandler = new YCFBamSaxLoaderInt32Col( this );
		}
		return( int32ColHandler );
	}
	protected YCFBamSaxLoaderInt32Def getInt32DefHandler() {
		if( int32DefHandler == null ) {
			int32DefHandler = new YCFBamSaxLoaderInt32Def( this );
		}
		return( int32DefHandler );
	}
	protected YCFBamSaxLoaderInt32Type getInt32TypeHandler() {
		if( int32TypeHandler == null ) {
			int32TypeHandler = new YCFBamSaxLoaderInt32Type( this );
		}
		return( int32TypeHandler );
	}
	protected YCFBamSaxLoaderInt64Col getInt64ColHandler() {
		if( int64ColHandler == null ) {
			int64ColHandler = new YCFBamSaxLoaderInt64Col( this );
		}
		return( int64ColHandler );
	}
	protected YCFBamSaxLoaderInt64Def getInt64DefHandler() {
		if( int64DefHandler == null ) {
			int64DefHandler = new YCFBamSaxLoaderInt64Def( this );
		}
		return( int64DefHandler );
	}
	protected YCFBamSaxLoaderInt64Type getInt64TypeHandler() {
		if( int64TypeHandler == null ) {
			int64TypeHandler = new YCFBamSaxLoaderInt64Type( this );
		}
		return( int64TypeHandler );
	}
	protected YCFBamSaxLoaderLicense getLicenseHandler() {
		if( licenseHandler == null ) {
			licenseHandler = new YCFBamSaxLoaderLicense( this );
		}
		return( licenseHandler );
	}
	protected YCFBamSaxLoaderMajorVersion getMajorVersionHandler() {
		if( majorVersionHandler == null ) {
			majorVersionHandler = new YCFBamSaxLoaderMajorVersion( this );
			majorVersionHandler.addElementHandler( "MinorVersion", getMinorVersionHandler() );
		}
		return( majorVersionHandler );
	}
	protected YCFBamSaxLoaderMimeType getMimeTypeHandler() {
		if( mimeTypeHandler == null ) {
			mimeTypeHandler = new YCFBamSaxLoaderMimeType( this );
		}
		return( mimeTypeHandler );
	}
	protected YCFBamSaxLoaderMinorVersion getMinorVersionHandler() {
		if( minorVersionHandler == null ) {
			minorVersionHandler = new YCFBamSaxLoaderMinorVersion( this );
			minorVersionHandler.addElementHandler( "SchemaDef", getSchemaDefHandler() );
		}
		return( minorVersionHandler );
	}
	protected YCFBamSaxLoaderNmTokenCol getNmTokenColHandler() {
		if( nmTokenColHandler == null ) {
			nmTokenColHandler = new YCFBamSaxLoaderNmTokenCol( this );
		}
		return( nmTokenColHandler );
	}
	protected YCFBamSaxLoaderNmTokenDef getNmTokenDefHandler() {
		if( nmTokenDefHandler == null ) {
			nmTokenDefHandler = new YCFBamSaxLoaderNmTokenDef( this );
		}
		return( nmTokenDefHandler );
	}
	protected YCFBamSaxLoaderNmTokenType getNmTokenTypeHandler() {
		if( nmTokenTypeHandler == null ) {
			nmTokenTypeHandler = new YCFBamSaxLoaderNmTokenType( this );
		}
		return( nmTokenTypeHandler );
	}
	protected YCFBamSaxLoaderNmTokensCol getNmTokensColHandler() {
		if( nmTokensColHandler == null ) {
			nmTokensColHandler = new YCFBamSaxLoaderNmTokensCol( this );
		}
		return( nmTokensColHandler );
	}
	protected YCFBamSaxLoaderNmTokensDef getNmTokensDefHandler() {
		if( nmTokensDefHandler == null ) {
			nmTokensDefHandler = new YCFBamSaxLoaderNmTokensDef( this );
		}
		return( nmTokensDefHandler );
	}
	protected YCFBamSaxLoaderNmTokensType getNmTokensTypeHandler() {
		if( nmTokensTypeHandler == null ) {
			nmTokensTypeHandler = new YCFBamSaxLoaderNmTokensType( this );
		}
		return( nmTokensTypeHandler );
	}
	protected YCFBamSaxLoaderNumberCol getNumberColHandler() {
		if( numberColHandler == null ) {
			numberColHandler = new YCFBamSaxLoaderNumberCol( this );
		}
		return( numberColHandler );
	}
	protected YCFBamSaxLoaderNumberDef getNumberDefHandler() {
		if( numberDefHandler == null ) {
			numberDefHandler = new YCFBamSaxLoaderNumberDef( this );
		}
		return( numberDefHandler );
	}
	protected YCFBamSaxLoaderNumberType getNumberTypeHandler() {
		if( numberTypeHandler == null ) {
			numberTypeHandler = new YCFBamSaxLoaderNumberType( this );
		}
		return( numberTypeHandler );
	}
	protected YCFBamSaxLoaderParam getParamHandler() {
		if( paramHandler == null ) {
			paramHandler = new YCFBamSaxLoaderParam( this );
		}
		return( paramHandler );
	}
	protected YCFBamSaxLoaderPopDep getPopDepHandler() {
		if( popDepHandler == null ) {
			popDepHandler = new YCFBamSaxLoaderPopDep( this );
		}
		return( popDepHandler );
	}
	protected YCFBamSaxLoaderPopSubDep1 getPopSubDep1Handler() {
		if( popSubDep1Handler == null ) {
			popSubDep1Handler = new YCFBamSaxLoaderPopSubDep1( this );
			popSubDep1Handler.addElementHandler( "PopSubDep2", getPopSubDep2Handler() );
		}
		return( popSubDep1Handler );
	}
	protected YCFBamSaxLoaderPopSubDep2 getPopSubDep2Handler() {
		if( popSubDep2Handler == null ) {
			popSubDep2Handler = new YCFBamSaxLoaderPopSubDep2( this );
			popSubDep2Handler.addElementHandler( "PopSubDep3", getPopSubDep3Handler() );
		}
		return( popSubDep2Handler );
	}
	protected YCFBamSaxLoaderPopSubDep3 getPopSubDep3Handler() {
		if( popSubDep3Handler == null ) {
			popSubDep3Handler = new YCFBamSaxLoaderPopSubDep3( this );
		}
		return( popSubDep3Handler );
	}
	protected YCFBamSaxLoaderPopTopDep getPopTopDepHandler() {
		if( popTopDepHandler == null ) {
			popTopDepHandler = new YCFBamSaxLoaderPopTopDep( this );
			popTopDepHandler.addElementHandler( "PopSubDep1", getPopSubDep1Handler() );
		}
		return( popTopDepHandler );
	}
	protected YCFBamSaxLoaderRelation getRelationHandler() {
		if( relationHandler == null ) {
			relationHandler = new YCFBamSaxLoaderRelation( this );
			relationHandler.addElementHandler( "RelationCol", getRelationColHandler() );
			relationHandler.addElementHandler( "PopTopDep", getPopTopDepHandler() );
		}
		return( relationHandler );
	}
	protected YCFBamSaxLoaderRelationCol getRelationColHandler() {
		if( relationColHandler == null ) {
			relationColHandler = new YCFBamSaxLoaderRelationCol( this );
		}
		return( relationColHandler );
	}
	protected YCFBamSaxLoaderRoleDef getRoleDefHandler() {
		if( roleDefHandler == null ) {
			roleDefHandler = new YCFBamSaxLoaderRoleDef( this );
		}
		return( roleDefHandler );
	}
	protected YCFBamSaxLoaderSchemaDef getSchemaDefHandler() {
		if( schemaDefHandler == null ) {
			schemaDefHandler = new YCFBamSaxLoaderSchemaDef( this );
			schemaDefHandler.addElementHandler( "Table", getTableHandler() );
			schemaDefHandler.addElementHandler( "BlobType", getBlobTypeHandler() );
			schemaDefHandler.addElementHandler( "BoolType", getBoolTypeHandler() );
			schemaDefHandler.addElementHandler( "DateType", getDateTypeHandler() );
			schemaDefHandler.addElementHandler( "DoubleType", getDoubleTypeHandler() );
			schemaDefHandler.addElementHandler( "FloatType", getFloatTypeHandler() );
			schemaDefHandler.addElementHandler( "Int16Type", getInt16TypeHandler() );
			schemaDefHandler.addElementHandler( "Id16Gen", getId16GenHandler() );
			schemaDefHandler.addElementHandler( "EnumType", getEnumTypeHandler() );
			schemaDefHandler.addElementHandler( "Int32Type", getInt32TypeHandler() );
			schemaDefHandler.addElementHandler( "Id32Gen", getId32GenHandler() );
			schemaDefHandler.addElementHandler( "Int64Type", getInt64TypeHandler() );
			schemaDefHandler.addElementHandler( "Id64Gen", getId64GenHandler() );
			schemaDefHandler.addElementHandler( "NmTokenType", getNmTokenTypeHandler() );
			schemaDefHandler.addElementHandler( "NmTokensType", getNmTokensTypeHandler() );
			schemaDefHandler.addElementHandler( "NumberType", getNumberTypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash128Type", getDbKeyHash128TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash128Gen", getDbKeyHash128GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash160Type", getDbKeyHash160TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash160Gen", getDbKeyHash160GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash224Type", getDbKeyHash224TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash224Gen", getDbKeyHash224GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash256Type", getDbKeyHash256TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash256Gen", getDbKeyHash256GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash384Type", getDbKeyHash384TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash384Gen", getDbKeyHash384GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash512Type", getDbKeyHash512TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash512Gen", getDbKeyHash512GenHandler() );
			schemaDefHandler.addElementHandler( "StringType", getStringTypeHandler() );
			schemaDefHandler.addElementHandler( "TZDateType", getTZDateTypeHandler() );
			schemaDefHandler.addElementHandler( "TZTimeType", getTZTimeTypeHandler() );
			schemaDefHandler.addElementHandler( "TZTimestampType", getTZTimestampTypeHandler() );
			schemaDefHandler.addElementHandler( "TextType", getTextTypeHandler() );
			schemaDefHandler.addElementHandler( "TimeType", getTimeTypeHandler() );
			schemaDefHandler.addElementHandler( "TimestampType", getTimestampTypeHandler() );
			schemaDefHandler.addElementHandler( "TokenType", getTokenTypeHandler() );
			schemaDefHandler.addElementHandler( "UInt16Type", getUInt16TypeHandler() );
			schemaDefHandler.addElementHandler( "UInt32Type", getUInt32TypeHandler() );
			schemaDefHandler.addElementHandler( "UInt64Type", getUInt64TypeHandler() );
			schemaDefHandler.addElementHandler( "UuidType", getUuidTypeHandler() );
			schemaDefHandler.addElementHandler( "UuidGen", getUuidGenHandler() );
			schemaDefHandler.addElementHandler( "Uuid6Type", getUuid6TypeHandler() );
			schemaDefHandler.addElementHandler( "Uuid6Gen", getUuid6GenHandler() );
			schemaDefHandler.addElementHandler( "SchemaRef", getSchemaRefHandler() );
			schemaDefHandler.addElementHandler( "SchemaTweak", getSchemaTweakHandler() );
			schemaDefHandler.addElementHandler( "SchemaRole", getSchemaRoleHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjImport", getSchemaDefCafeSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjInterface", getSchemaDefCafeSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjMembers", getSchemaDefCafeSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjImplementation", getSchemaDefCafeSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "CafeDb2LUWSchemaObjMembers", getSchemaDefCafeDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeDb2LUWSchemaObjImpl", getSchemaDefCafeDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeDb2LUWSchemaObjImport", getSchemaDefCafeDb2LUWSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeMSSqlSchemaObjMembers", getSchemaDefCafeMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeMSSqlSchemaObjImpl", getSchemaDefCafeMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeMSSqlSchemaObjImport", getSchemaDefCafeMSSqlSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeMySqlSchemaObjMembers", getSchemaDefCafeMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeMySqlSchemaObjImpl", getSchemaDefCafeMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeMySqlSchemaObjImport", getSchemaDefCafeMySqlSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeOracleSchemaObjMembers", getSchemaDefCafeOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeOracleSchemaObjImpl", getSchemaDefCafeOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeOracleSchemaObjImport", getSchemaDefCafeOracleSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafePgSqlSchemaObjMembers", getSchemaDefCafePgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafePgSqlSchemaObjImpl", getSchemaDefCafePgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafePgSqlSchemaObjImport", getSchemaDefCafePgSqlSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeRamSchemaObjMembers", getSchemaDefCafeRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeRamSchemaObjImpl", getSchemaDefCafeRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeRamSchemaObjImport", getSchemaDefCafeRamSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgSchemaImport", getSchemaDefCafeXMsgSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgSchemaFormatters", getSchemaDefCafeXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgClientSchemaImport", getSchemaDefCafeXMsgClientSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgClientSchemaBody", getSchemaDefCafeXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaBody", getSchemaDefCafeXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaImport", getSchemaDefCafeXMsgRqstSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaWireParsers", getSchemaDefCafeXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaXsdSpec", getSchemaDefCafeXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaXsdElementList", getSchemaDefCafeSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaBody", getSchemaDefCafeXMsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaImport", getSchemaDefCafeXMsgRspnSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaWireParsers", getSchemaDefCafeXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaXsdElementList", getSchemaDefCafeXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaXsdSpec", getSchemaDefCafeXMsgRspnSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjInclude", getSchemaDefCPlusSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjInterface", getSchemaDefCPlusSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjMembers", getSchemaDefCPlusSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjImplementation", getSchemaDefCPlusSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "CPlusDb2LUWSchemaObjMembers", getSchemaDefCPlusDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusDb2LUWSchemaObjImpl", getSchemaDefCPlusDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusDb2LUWSchemaObjInclude", getSchemaDefCPlusDb2LUWSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusMSSqlSchemaObjMembers", getSchemaDefCPlusMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusMSSqlSchemaObjImpl", getSchemaDefCPlusMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusMSSqlSchemaObjInclude", getSchemaDefCPlusMSSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusMySqlSchemaObjMembers", getSchemaDefCPlusMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusMySqlSchemaObjImpl", getSchemaDefCPlusMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusMySqlSchemaObjInclude", getSchemaDefCPlusMySqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusOracleSchemaObjMembers", getSchemaDefCPlusOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusOracleSchemaObjImpl", getSchemaDefCPlusOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusOracleSchemaObjInclude", getSchemaDefCPlusOracleSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusPgSqlSchemaObjMembers", getSchemaDefCPlusPgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusPgSqlSchemaObjImpl", getSchemaDefCPlusPgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusPgSqlSchemaObjInclude", getSchemaDefCPlusPgSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusRamSchemaObjMembers", getSchemaDefCPlusRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusRamSchemaObjImpl", getSchemaDefCPlusRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusRamSchemaObjInclude", getSchemaDefCPlusRamSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgSchemaInclude", getSchemaDefCPlusXMsgSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgSchemaFormatters", getSchemaDefCPlusXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgClientSchemaInclude", getSchemaDefCPlusXMsgClientSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgClientSchemaBody", getSchemaDefCPlusXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaBody", getSchemaDefCPlusXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaInclude", getSchemaDefCPlusXMsgRqstSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaWireParsers", getSchemaDefCPlusXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaXsdSpec", getSchemaDefCPlusXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaXsdElementList", getSchemaDefCPlusXMsgRqstSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CPlusXmsgRspnSchemaBody", getSchemaDefCPlusXmsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaInclude", getSchemaDefCPlusXMsgRspnSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaWireParsers", getSchemaDefCPlusXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaXsdElementList", getSchemaDefCPlusXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaXsdSpec", getSchemaDefCPlusXMsgRspnSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjInclude", getSchemaDefHPlusSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjInterface", getSchemaDefHPlusSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjMembers", getSchemaDefHPlusSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjImplementation", getSchemaDefHPlusSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "HPlusDb2LUWSchemaObjMembers", getSchemaDefHPlusDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusDb2LUWSchemaObjImpl", getSchemaDefHPlusDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusDb2LUWSchemaObjInclude", getSchemaDefHPlusDb2LUWSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusMSSqlSchemaObjMembers", getSchemaDefHPlusMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusMSSqlSchemaObjImpl", getSchemaDefHPlusMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusMSSqlSchemaObjInclude", getSchemaDefHPlusMSSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusMySqlSchemaObjMembers", getSchemaDefHPlusMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusMySqlSchemaObjImpl", getSchemaDefHPlusMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusMySqlSchemaObjInclude", getSchemaDefHPlusMySqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusOracleSchemaObjMembers", getSchemaDefHPlusOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusOracleSchemaObjImpl", getSchemaDefHPlusOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusOracleSchemaObjInclude", getSchemaDefHPlusOracleSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusPgSqlSchemaObjMembers", getSchemaDefHPlusPgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusPgSqlSchemaObjImpl", getSchemaDefHPlusPgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusPgSqlSchemaObjInclude", getSchemaDefHPlusPgSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusRamSchemaObjMembers", getSchemaDefHPlusRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusRamSchemaObjImpl", getSchemaDefHPlusRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusRamSchemaObjInclude", getSchemaDefHPlusRamSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgSchemaInclude", getSchemaDefHPlusXMsgSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgSchemaFormatters", getSchemaDefHPlusXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgClientSchemaInclude", getSchemaDefHPlusXMsgClientSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgClientSchemaBody", getSchemaDefHPlusXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaBody", getSchemaDefHPlusXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaInclude", getSchemaDefHPlusXMsgRqstSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaWireParsers", getSchemaDefHPlusXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaXsdSpec", getSchemaDefHPlusXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaXsdElementList", getSchemaDefHPlusXMsgRqstSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaBody", getSchemaDefHPlusXMsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaInclude", getSchemaDefHPlusXMsgRspnSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaWireParsers", getSchemaDefHPlusXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaXsdElementList", getSchemaDefHPlusXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaXsdSpec", getSchemaDefHPlusXMsgRspnSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjUsing", getSchemaDefCSharpSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjInterface", getSchemaDefCSharpSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjMembers", getSchemaDefCSharpSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjImplementation", getSchemaDefCSharpSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "CSharpDb2LUWSchemaObjMembers", getSchemaDefCSharpDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpDb2LUWSchemaObjImpl", getSchemaDefCSharpDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpDb2LUWSchemaObjUsing", getSchemaDefCSharpDb2LUWSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpMSSqlSchemaObjMembers", getSchemaDefCSharpMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpMSSqlSchemaObjImpl", getSchemaDefCSharpMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpMSSqlSchemaObjUsing", getSchemaDefCSharpMSSqlSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpMySqlSchemaObjMembers", getSchemaDefCSharpMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpMySqlSchemaObjImpl", getSchemaDefCSharpMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpMySqlSchemaObjUsing", getSchemaDefCSharpMySqlSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpOracleSchemaObjMembers", getSchemaDefCSharpOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpOracleSchemaObjImpl", getSchemaDefCSharpOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpOracleSchemaObjUsing", getSchemaDefCSharpOracleSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpPgSqlSchemaObjMembers", getSchemaDefCSharpPgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpPgSqlSchemaObjImpl", getSchemaDefCSharpPgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpPgSqlSchemaObjUsing", getSchemaDefCSharpPgSqlSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpRamSchemaObjMembers", getSchemaDefCSharpRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpRamSchemaObjImpl", getSchemaDefCSharpRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpRamSchemaObjUsing", getSchemaDefCSharpRamSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgSchemaUsing", getSchemaDefCSharpXMsgSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgSchemaFormatters", getSchemaDefCSharpXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgClientSchemaUsing", getSchemaDefCSharpXMsgClientSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgClientSchemaBody", getSchemaDefCSharpXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaBody", getSchemaDefCSharpXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaUsing", getSchemaDefCSharpXMsgRqstSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaWireParsers", getSchemaDefCSharpXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaXsdSpec", getSchemaDefCSharpXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaXsdElementList", getSchemaDefCSharpXMsgRqstSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaBody", getSchemaDefCSharpXMsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaUsing", getSchemaDefCSharpXMsgRspnSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaWireParsers", getSchemaDefCSharpXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaXsdElementList", getSchemaDefCSharpXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaXsdSpec", getSchemaDefCSharpXMsgRspnSchemaXsdSpecHandler() );
		}
		return( schemaDefHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeSchemaObjImport getSchemaDefCafeSchemaObjImportHandler() {
		if( schemaDefCafeSchemaObjImportHandler == null ) {
			schemaDefCafeSchemaObjImportHandler = new YCFBamSaxLoaderSchemaDefCafeSchemaObjImport( this );
		}
		return( schemaDefCafeSchemaObjImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeSchemaObjInterface getSchemaDefCafeSchemaObjInterfaceHandler() {
		if( schemaDefCafeSchemaObjInterfaceHandler == null ) {
			schemaDefCafeSchemaObjInterfaceHandler = new YCFBamSaxLoaderSchemaDefCafeSchemaObjInterface( this );
		}
		return( schemaDefCafeSchemaObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeSchemaObjMembers getSchemaDefCafeSchemaObjMembersHandler() {
		if( schemaDefCafeSchemaObjMembersHandler == null ) {
			schemaDefCafeSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCafeSchemaObjMembers( this );
		}
		return( schemaDefCafeSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeSchemaObjImplementation getSchemaDefCafeSchemaObjImplementationHandler() {
		if( schemaDefCafeSchemaObjImplementationHandler == null ) {
			schemaDefCafeSchemaObjImplementationHandler = new YCFBamSaxLoaderSchemaDefCafeSchemaObjImplementation( this );
		}
		return( schemaDefCafeSchemaObjImplementationHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjMembers getSchemaDefCafeDb2LUWSchemaObjMembersHandler() {
		if( schemaDefCafeDb2LUWSchemaObjMembersHandler == null ) {
			schemaDefCafeDb2LUWSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjMembers( this );
		}
		return( schemaDefCafeDb2LUWSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjImpl getSchemaDefCafeDb2LUWSchemaObjImplHandler() {
		if( schemaDefCafeDb2LUWSchemaObjImplHandler == null ) {
			schemaDefCafeDb2LUWSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjImpl( this );
		}
		return( schemaDefCafeDb2LUWSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjImport getSchemaDefCafeDb2LUWSchemaObjImportHandler() {
		if( schemaDefCafeDb2LUWSchemaObjImportHandler == null ) {
			schemaDefCafeDb2LUWSchemaObjImportHandler = new YCFBamSaxLoaderSchemaDefCafeDb2LUWSchemaObjImport( this );
		}
		return( schemaDefCafeDb2LUWSchemaObjImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjMembers getSchemaDefCafeMSSqlSchemaObjMembersHandler() {
		if( schemaDefCafeMSSqlSchemaObjMembersHandler == null ) {
			schemaDefCafeMSSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjMembers( this );
		}
		return( schemaDefCafeMSSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjImpl getSchemaDefCafeMSSqlSchemaObjImplHandler() {
		if( schemaDefCafeMSSqlSchemaObjImplHandler == null ) {
			schemaDefCafeMSSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjImpl( this );
		}
		return( schemaDefCafeMSSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjImport getSchemaDefCafeMSSqlSchemaObjImportHandler() {
		if( schemaDefCafeMSSqlSchemaObjImportHandler == null ) {
			schemaDefCafeMSSqlSchemaObjImportHandler = new YCFBamSaxLoaderSchemaDefCafeMSSqlSchemaObjImport( this );
		}
		return( schemaDefCafeMSSqlSchemaObjImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjMembers getSchemaDefCafeMySqlSchemaObjMembersHandler() {
		if( schemaDefCafeMySqlSchemaObjMembersHandler == null ) {
			schemaDefCafeMySqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjMembers( this );
		}
		return( schemaDefCafeMySqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjImpl getSchemaDefCafeMySqlSchemaObjImplHandler() {
		if( schemaDefCafeMySqlSchemaObjImplHandler == null ) {
			schemaDefCafeMySqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjImpl( this );
		}
		return( schemaDefCafeMySqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjImport getSchemaDefCafeMySqlSchemaObjImportHandler() {
		if( schemaDefCafeMySqlSchemaObjImportHandler == null ) {
			schemaDefCafeMySqlSchemaObjImportHandler = new YCFBamSaxLoaderSchemaDefCafeMySqlSchemaObjImport( this );
		}
		return( schemaDefCafeMySqlSchemaObjImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjMembers getSchemaDefCafeOracleSchemaObjMembersHandler() {
		if( schemaDefCafeOracleSchemaObjMembersHandler == null ) {
			schemaDefCafeOracleSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjMembers( this );
		}
		return( schemaDefCafeOracleSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjImpl getSchemaDefCafeOracleSchemaObjImplHandler() {
		if( schemaDefCafeOracleSchemaObjImplHandler == null ) {
			schemaDefCafeOracleSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjImpl( this );
		}
		return( schemaDefCafeOracleSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjImport getSchemaDefCafeOracleSchemaObjImportHandler() {
		if( schemaDefCafeOracleSchemaObjImportHandler == null ) {
			schemaDefCafeOracleSchemaObjImportHandler = new YCFBamSaxLoaderSchemaDefCafeOracleSchemaObjImport( this );
		}
		return( schemaDefCafeOracleSchemaObjImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjMembers getSchemaDefCafePgSqlSchemaObjMembersHandler() {
		if( schemaDefCafePgSqlSchemaObjMembersHandler == null ) {
			schemaDefCafePgSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjMembers( this );
		}
		return( schemaDefCafePgSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjImpl getSchemaDefCafePgSqlSchemaObjImplHandler() {
		if( schemaDefCafePgSqlSchemaObjImplHandler == null ) {
			schemaDefCafePgSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjImpl( this );
		}
		return( schemaDefCafePgSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjImport getSchemaDefCafePgSqlSchemaObjImportHandler() {
		if( schemaDefCafePgSqlSchemaObjImportHandler == null ) {
			schemaDefCafePgSqlSchemaObjImportHandler = new YCFBamSaxLoaderSchemaDefCafePgSqlSchemaObjImport( this );
		}
		return( schemaDefCafePgSqlSchemaObjImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeRamSchemaObjMembers getSchemaDefCafeRamSchemaObjMembersHandler() {
		if( schemaDefCafeRamSchemaObjMembersHandler == null ) {
			schemaDefCafeRamSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCafeRamSchemaObjMembers( this );
		}
		return( schemaDefCafeRamSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeRamSchemaObjImpl getSchemaDefCafeRamSchemaObjImplHandler() {
		if( schemaDefCafeRamSchemaObjImplHandler == null ) {
			schemaDefCafeRamSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCafeRamSchemaObjImpl( this );
		}
		return( schemaDefCafeRamSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeRamSchemaObjImport getSchemaDefCafeRamSchemaObjImportHandler() {
		if( schemaDefCafeRamSchemaObjImportHandler == null ) {
			schemaDefCafeRamSchemaObjImportHandler = new YCFBamSaxLoaderSchemaDefCafeRamSchemaObjImport( this );
		}
		return( schemaDefCafeRamSchemaObjImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgSchemaImport getSchemaDefCafeXMsgSchemaImportHandler() {
		if( schemaDefCafeXMsgSchemaImportHandler == null ) {
			schemaDefCafeXMsgSchemaImportHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgSchemaImport( this );
		}
		return( schemaDefCafeXMsgSchemaImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgSchemaFormatters getSchemaDefCafeXMsgSchemaFormattersHandler() {
		if( schemaDefCafeXMsgSchemaFormattersHandler == null ) {
			schemaDefCafeXMsgSchemaFormattersHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgSchemaFormatters( this );
		}
		return( schemaDefCafeXMsgSchemaFormattersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgClientSchemaImport getSchemaDefCafeXMsgClientSchemaImportHandler() {
		if( schemaDefCafeXMsgClientSchemaImportHandler == null ) {
			schemaDefCafeXMsgClientSchemaImportHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgClientSchemaImport( this );
		}
		return( schemaDefCafeXMsgClientSchemaImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgClientSchemaBody getSchemaDefCafeXMsgClientSchemaBodyHandler() {
		if( schemaDefCafeXMsgClientSchemaBodyHandler == null ) {
			schemaDefCafeXMsgClientSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgClientSchemaBody( this );
		}
		return( schemaDefCafeXMsgClientSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaBody getSchemaDefCafeXMsgRqstSchemaBodyHandler() {
		if( schemaDefCafeXMsgRqstSchemaBodyHandler == null ) {
			schemaDefCafeXMsgRqstSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaBody( this );
		}
		return( schemaDefCafeXMsgRqstSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaImport getSchemaDefCafeXMsgRqstSchemaImportHandler() {
		if( schemaDefCafeXMsgRqstSchemaImportHandler == null ) {
			schemaDefCafeXMsgRqstSchemaImportHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaImport( this );
		}
		return( schemaDefCafeXMsgRqstSchemaImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaWireParsers getSchemaDefCafeXMsgRqstSchemaWireParsersHandler() {
		if( schemaDefCafeXMsgRqstSchemaWireParsersHandler == null ) {
			schemaDefCafeXMsgRqstSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaWireParsers( this );
		}
		return( schemaDefCafeXMsgRqstSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaXsdSpec getSchemaDefCafeXMsgRqstSchemaXsdSpecHandler() {
		if( schemaDefCafeXMsgRqstSchemaXsdSpecHandler == null ) {
			schemaDefCafeXMsgRqstSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRqstSchemaXsdSpec( this );
		}
		return( schemaDefCafeXMsgRqstSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeSchemaXsdElementList getSchemaDefCafeSchemaXsdElementListHandler() {
		if( schemaDefCafeSchemaXsdElementListHandler == null ) {
			schemaDefCafeSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefCafeSchemaXsdElementList( this );
		}
		return( schemaDefCafeSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaBody getSchemaDefCafeXMsgRspnSchemaBodyHandler() {
		if( schemaDefCafeXMsgRspnSchemaBodyHandler == null ) {
			schemaDefCafeXMsgRspnSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaBody( this );
		}
		return( schemaDefCafeXMsgRspnSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaImport getSchemaDefCafeXMsgRspnSchemaImportHandler() {
		if( schemaDefCafeXMsgRspnSchemaImportHandler == null ) {
			schemaDefCafeXMsgRspnSchemaImportHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaImport( this );
		}
		return( schemaDefCafeXMsgRspnSchemaImportHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaWireParsers getSchemaDefCafeXMsgRspnSchemaWireParsersHandler() {
		if( schemaDefCafeXMsgRspnSchemaWireParsersHandler == null ) {
			schemaDefCafeXMsgRspnSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaWireParsers( this );
		}
		return( schemaDefCafeXMsgRspnSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaXsdElementList getSchemaDefCafeXMsgRspnSchemaXsdElementListHandler() {
		if( schemaDefCafeXMsgRspnSchemaXsdElementListHandler == null ) {
			schemaDefCafeXMsgRspnSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaXsdElementList( this );
		}
		return( schemaDefCafeXMsgRspnSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaXsdSpec getSchemaDefCafeXMsgRspnSchemaXsdSpecHandler() {
		if( schemaDefCafeXMsgRspnSchemaXsdSpecHandler == null ) {
			schemaDefCafeXMsgRspnSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefCafeXMsgRspnSchemaXsdSpec( this );
		}
		return( schemaDefCafeXMsgRspnSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusSchemaObjInclude getSchemaDefCPlusSchemaObjIncludeHandler() {
		if( schemaDefCPlusSchemaObjIncludeHandler == null ) {
			schemaDefCPlusSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusSchemaObjInclude( this );
		}
		return( schemaDefCPlusSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusSchemaObjInterface getSchemaDefCPlusSchemaObjInterfaceHandler() {
		if( schemaDefCPlusSchemaObjInterfaceHandler == null ) {
			schemaDefCPlusSchemaObjInterfaceHandler = new YCFBamSaxLoaderSchemaDefCPlusSchemaObjInterface( this );
		}
		return( schemaDefCPlusSchemaObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusSchemaObjMembers getSchemaDefCPlusSchemaObjMembersHandler() {
		if( schemaDefCPlusSchemaObjMembersHandler == null ) {
			schemaDefCPlusSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCPlusSchemaObjMembers( this );
		}
		return( schemaDefCPlusSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusSchemaObjImplementation getSchemaDefCPlusSchemaObjImplementationHandler() {
		if( schemaDefCPlusSchemaObjImplementationHandler == null ) {
			schemaDefCPlusSchemaObjImplementationHandler = new YCFBamSaxLoaderSchemaDefCPlusSchemaObjImplementation( this );
		}
		return( schemaDefCPlusSchemaObjImplementationHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjMembers getSchemaDefCPlusDb2LUWSchemaObjMembersHandler() {
		if( schemaDefCPlusDb2LUWSchemaObjMembersHandler == null ) {
			schemaDefCPlusDb2LUWSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjMembers( this );
		}
		return( schemaDefCPlusDb2LUWSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjImpl getSchemaDefCPlusDb2LUWSchemaObjImplHandler() {
		if( schemaDefCPlusDb2LUWSchemaObjImplHandler == null ) {
			schemaDefCPlusDb2LUWSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjImpl( this );
		}
		return( schemaDefCPlusDb2LUWSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjInclude getSchemaDefCPlusDb2LUWSchemaObjIncludeHandler() {
		if( schemaDefCPlusDb2LUWSchemaObjIncludeHandler == null ) {
			schemaDefCPlusDb2LUWSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusDb2LUWSchemaObjInclude( this );
		}
		return( schemaDefCPlusDb2LUWSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjMembers getSchemaDefCPlusMSSqlSchemaObjMembersHandler() {
		if( schemaDefCPlusMSSqlSchemaObjMembersHandler == null ) {
			schemaDefCPlusMSSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjMembers( this );
		}
		return( schemaDefCPlusMSSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjImpl getSchemaDefCPlusMSSqlSchemaObjImplHandler() {
		if( schemaDefCPlusMSSqlSchemaObjImplHandler == null ) {
			schemaDefCPlusMSSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjImpl( this );
		}
		return( schemaDefCPlusMSSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjInclude getSchemaDefCPlusMSSqlSchemaObjIncludeHandler() {
		if( schemaDefCPlusMSSqlSchemaObjIncludeHandler == null ) {
			schemaDefCPlusMSSqlSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusMSSqlSchemaObjInclude( this );
		}
		return( schemaDefCPlusMSSqlSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjMembers getSchemaDefCPlusMySqlSchemaObjMembersHandler() {
		if( schemaDefCPlusMySqlSchemaObjMembersHandler == null ) {
			schemaDefCPlusMySqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjMembers( this );
		}
		return( schemaDefCPlusMySqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjImpl getSchemaDefCPlusMySqlSchemaObjImplHandler() {
		if( schemaDefCPlusMySqlSchemaObjImplHandler == null ) {
			schemaDefCPlusMySqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjImpl( this );
		}
		return( schemaDefCPlusMySqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjInclude getSchemaDefCPlusMySqlSchemaObjIncludeHandler() {
		if( schemaDefCPlusMySqlSchemaObjIncludeHandler == null ) {
			schemaDefCPlusMySqlSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusMySqlSchemaObjInclude( this );
		}
		return( schemaDefCPlusMySqlSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjMembers getSchemaDefCPlusOracleSchemaObjMembersHandler() {
		if( schemaDefCPlusOracleSchemaObjMembersHandler == null ) {
			schemaDefCPlusOracleSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjMembers( this );
		}
		return( schemaDefCPlusOracleSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjImpl getSchemaDefCPlusOracleSchemaObjImplHandler() {
		if( schemaDefCPlusOracleSchemaObjImplHandler == null ) {
			schemaDefCPlusOracleSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjImpl( this );
		}
		return( schemaDefCPlusOracleSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjInclude getSchemaDefCPlusOracleSchemaObjIncludeHandler() {
		if( schemaDefCPlusOracleSchemaObjIncludeHandler == null ) {
			schemaDefCPlusOracleSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusOracleSchemaObjInclude( this );
		}
		return( schemaDefCPlusOracleSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjMembers getSchemaDefCPlusPgSqlSchemaObjMembersHandler() {
		if( schemaDefCPlusPgSqlSchemaObjMembersHandler == null ) {
			schemaDefCPlusPgSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjMembers( this );
		}
		return( schemaDefCPlusPgSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjImpl getSchemaDefCPlusPgSqlSchemaObjImplHandler() {
		if( schemaDefCPlusPgSqlSchemaObjImplHandler == null ) {
			schemaDefCPlusPgSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjImpl( this );
		}
		return( schemaDefCPlusPgSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjInclude getSchemaDefCPlusPgSqlSchemaObjIncludeHandler() {
		if( schemaDefCPlusPgSqlSchemaObjIncludeHandler == null ) {
			schemaDefCPlusPgSqlSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusPgSqlSchemaObjInclude( this );
		}
		return( schemaDefCPlusPgSqlSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjMembers getSchemaDefCPlusRamSchemaObjMembersHandler() {
		if( schemaDefCPlusRamSchemaObjMembersHandler == null ) {
			schemaDefCPlusRamSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjMembers( this );
		}
		return( schemaDefCPlusRamSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjImpl getSchemaDefCPlusRamSchemaObjImplHandler() {
		if( schemaDefCPlusRamSchemaObjImplHandler == null ) {
			schemaDefCPlusRamSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjImpl( this );
		}
		return( schemaDefCPlusRamSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjInclude getSchemaDefCPlusRamSchemaObjIncludeHandler() {
		if( schemaDefCPlusRamSchemaObjIncludeHandler == null ) {
			schemaDefCPlusRamSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusRamSchemaObjInclude( this );
		}
		return( schemaDefCPlusRamSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgSchemaInclude getSchemaDefCPlusXMsgSchemaIncludeHandler() {
		if( schemaDefCPlusXMsgSchemaIncludeHandler == null ) {
			schemaDefCPlusXMsgSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgSchemaInclude( this );
		}
		return( schemaDefCPlusXMsgSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgSchemaFormatters getSchemaDefCPlusXMsgSchemaFormattersHandler() {
		if( schemaDefCPlusXMsgSchemaFormattersHandler == null ) {
			schemaDefCPlusXMsgSchemaFormattersHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgSchemaFormatters( this );
		}
		return( schemaDefCPlusXMsgSchemaFormattersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgClientSchemaInclude getSchemaDefCPlusXMsgClientSchemaIncludeHandler() {
		if( schemaDefCPlusXMsgClientSchemaIncludeHandler == null ) {
			schemaDefCPlusXMsgClientSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgClientSchemaInclude( this );
		}
		return( schemaDefCPlusXMsgClientSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgClientSchemaBody getSchemaDefCPlusXMsgClientSchemaBodyHandler() {
		if( schemaDefCPlusXMsgClientSchemaBodyHandler == null ) {
			schemaDefCPlusXMsgClientSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgClientSchemaBody( this );
		}
		return( schemaDefCPlusXMsgClientSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaBody getSchemaDefCPlusXMsgRqstSchemaBodyHandler() {
		if( schemaDefCPlusXMsgRqstSchemaBodyHandler == null ) {
			schemaDefCPlusXMsgRqstSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaBody( this );
		}
		return( schemaDefCPlusXMsgRqstSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaInclude getSchemaDefCPlusXMsgRqstSchemaIncludeHandler() {
		if( schemaDefCPlusXMsgRqstSchemaIncludeHandler == null ) {
			schemaDefCPlusXMsgRqstSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaInclude( this );
		}
		return( schemaDefCPlusXMsgRqstSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaWireParsers getSchemaDefCPlusXMsgRqstSchemaWireParsersHandler() {
		if( schemaDefCPlusXMsgRqstSchemaWireParsersHandler == null ) {
			schemaDefCPlusXMsgRqstSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaWireParsers( this );
		}
		return( schemaDefCPlusXMsgRqstSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaXsdSpec getSchemaDefCPlusXMsgRqstSchemaXsdSpecHandler() {
		if( schemaDefCPlusXMsgRqstSchemaXsdSpecHandler == null ) {
			schemaDefCPlusXMsgRqstSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaXsdSpec( this );
		}
		return( schemaDefCPlusXMsgRqstSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaXsdElementList getSchemaDefCPlusXMsgRqstSchemaXsdElementListHandler() {
		if( schemaDefCPlusXMsgRqstSchemaXsdElementListHandler == null ) {
			schemaDefCPlusXMsgRqstSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRqstSchemaXsdElementList( this );
		}
		return( schemaDefCPlusXMsgRqstSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXmsgRspnSchemaBody getSchemaDefCPlusXmsgRspnSchemaBodyHandler() {
		if( schemaDefCPlusXmsgRspnSchemaBodyHandler == null ) {
			schemaDefCPlusXmsgRspnSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCPlusXmsgRspnSchemaBody( this );
		}
		return( schemaDefCPlusXmsgRspnSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaInclude getSchemaDefCPlusXMsgRspnSchemaIncludeHandler() {
		if( schemaDefCPlusXMsgRspnSchemaIncludeHandler == null ) {
			schemaDefCPlusXMsgRspnSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaInclude( this );
		}
		return( schemaDefCPlusXMsgRspnSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaWireParsers getSchemaDefCPlusXMsgRspnSchemaWireParsersHandler() {
		if( schemaDefCPlusXMsgRspnSchemaWireParsersHandler == null ) {
			schemaDefCPlusXMsgRspnSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaWireParsers( this );
		}
		return( schemaDefCPlusXMsgRspnSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaXsdElementList getSchemaDefCPlusXMsgRspnSchemaXsdElementListHandler() {
		if( schemaDefCPlusXMsgRspnSchemaXsdElementListHandler == null ) {
			schemaDefCPlusXMsgRspnSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaXsdElementList( this );
		}
		return( schemaDefCPlusXMsgRspnSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaXsdSpec getSchemaDefCPlusXMsgRspnSchemaXsdSpecHandler() {
		if( schemaDefCPlusXMsgRspnSchemaXsdSpecHandler == null ) {
			schemaDefCPlusXMsgRspnSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefCPlusXMsgRspnSchemaXsdSpec( this );
		}
		return( schemaDefCPlusXMsgRspnSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusSchemaObjInclude getSchemaDefHPlusSchemaObjIncludeHandler() {
		if( schemaDefHPlusSchemaObjIncludeHandler == null ) {
			schemaDefHPlusSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusSchemaObjInclude( this );
		}
		return( schemaDefHPlusSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusSchemaObjInterface getSchemaDefHPlusSchemaObjInterfaceHandler() {
		if( schemaDefHPlusSchemaObjInterfaceHandler == null ) {
			schemaDefHPlusSchemaObjInterfaceHandler = new YCFBamSaxLoaderSchemaDefHPlusSchemaObjInterface( this );
		}
		return( schemaDefHPlusSchemaObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusSchemaObjMembers getSchemaDefHPlusSchemaObjMembersHandler() {
		if( schemaDefHPlusSchemaObjMembersHandler == null ) {
			schemaDefHPlusSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefHPlusSchemaObjMembers( this );
		}
		return( schemaDefHPlusSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusSchemaObjImplementation getSchemaDefHPlusSchemaObjImplementationHandler() {
		if( schemaDefHPlusSchemaObjImplementationHandler == null ) {
			schemaDefHPlusSchemaObjImplementationHandler = new YCFBamSaxLoaderSchemaDefHPlusSchemaObjImplementation( this );
		}
		return( schemaDefHPlusSchemaObjImplementationHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjMembers getSchemaDefHPlusDb2LUWSchemaObjMembersHandler() {
		if( schemaDefHPlusDb2LUWSchemaObjMembersHandler == null ) {
			schemaDefHPlusDb2LUWSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjMembers( this );
		}
		return( schemaDefHPlusDb2LUWSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjImpl getSchemaDefHPlusDb2LUWSchemaObjImplHandler() {
		if( schemaDefHPlusDb2LUWSchemaObjImplHandler == null ) {
			schemaDefHPlusDb2LUWSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjImpl( this );
		}
		return( schemaDefHPlusDb2LUWSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjInclude getSchemaDefHPlusDb2LUWSchemaObjIncludeHandler() {
		if( schemaDefHPlusDb2LUWSchemaObjIncludeHandler == null ) {
			schemaDefHPlusDb2LUWSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusDb2LUWSchemaObjInclude( this );
		}
		return( schemaDefHPlusDb2LUWSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjMembers getSchemaDefHPlusMSSqlSchemaObjMembersHandler() {
		if( schemaDefHPlusMSSqlSchemaObjMembersHandler == null ) {
			schemaDefHPlusMSSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjMembers( this );
		}
		return( schemaDefHPlusMSSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjImpl getSchemaDefHPlusMSSqlSchemaObjImplHandler() {
		if( schemaDefHPlusMSSqlSchemaObjImplHandler == null ) {
			schemaDefHPlusMSSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjImpl( this );
		}
		return( schemaDefHPlusMSSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjInclude getSchemaDefHPlusMSSqlSchemaObjIncludeHandler() {
		if( schemaDefHPlusMSSqlSchemaObjIncludeHandler == null ) {
			schemaDefHPlusMSSqlSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusMSSqlSchemaObjInclude( this );
		}
		return( schemaDefHPlusMSSqlSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjMembers getSchemaDefHPlusMySqlSchemaObjMembersHandler() {
		if( schemaDefHPlusMySqlSchemaObjMembersHandler == null ) {
			schemaDefHPlusMySqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjMembers( this );
		}
		return( schemaDefHPlusMySqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjImpl getSchemaDefHPlusMySqlSchemaObjImplHandler() {
		if( schemaDefHPlusMySqlSchemaObjImplHandler == null ) {
			schemaDefHPlusMySqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjImpl( this );
		}
		return( schemaDefHPlusMySqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjInclude getSchemaDefHPlusMySqlSchemaObjIncludeHandler() {
		if( schemaDefHPlusMySqlSchemaObjIncludeHandler == null ) {
			schemaDefHPlusMySqlSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusMySqlSchemaObjInclude( this );
		}
		return( schemaDefHPlusMySqlSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjMembers getSchemaDefHPlusOracleSchemaObjMembersHandler() {
		if( schemaDefHPlusOracleSchemaObjMembersHandler == null ) {
			schemaDefHPlusOracleSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjMembers( this );
		}
		return( schemaDefHPlusOracleSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjImpl getSchemaDefHPlusOracleSchemaObjImplHandler() {
		if( schemaDefHPlusOracleSchemaObjImplHandler == null ) {
			schemaDefHPlusOracleSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjImpl( this );
		}
		return( schemaDefHPlusOracleSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjInclude getSchemaDefHPlusOracleSchemaObjIncludeHandler() {
		if( schemaDefHPlusOracleSchemaObjIncludeHandler == null ) {
			schemaDefHPlusOracleSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusOracleSchemaObjInclude( this );
		}
		return( schemaDefHPlusOracleSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjMembers getSchemaDefHPlusPgSqlSchemaObjMembersHandler() {
		if( schemaDefHPlusPgSqlSchemaObjMembersHandler == null ) {
			schemaDefHPlusPgSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjMembers( this );
		}
		return( schemaDefHPlusPgSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjImpl getSchemaDefHPlusPgSqlSchemaObjImplHandler() {
		if( schemaDefHPlusPgSqlSchemaObjImplHandler == null ) {
			schemaDefHPlusPgSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjImpl( this );
		}
		return( schemaDefHPlusPgSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjInclude getSchemaDefHPlusPgSqlSchemaObjIncludeHandler() {
		if( schemaDefHPlusPgSqlSchemaObjIncludeHandler == null ) {
			schemaDefHPlusPgSqlSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusPgSqlSchemaObjInclude( this );
		}
		return( schemaDefHPlusPgSqlSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjMembers getSchemaDefHPlusRamSchemaObjMembersHandler() {
		if( schemaDefHPlusRamSchemaObjMembersHandler == null ) {
			schemaDefHPlusRamSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjMembers( this );
		}
		return( schemaDefHPlusRamSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjImpl getSchemaDefHPlusRamSchemaObjImplHandler() {
		if( schemaDefHPlusRamSchemaObjImplHandler == null ) {
			schemaDefHPlusRamSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjImpl( this );
		}
		return( schemaDefHPlusRamSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjInclude getSchemaDefHPlusRamSchemaObjIncludeHandler() {
		if( schemaDefHPlusRamSchemaObjIncludeHandler == null ) {
			schemaDefHPlusRamSchemaObjIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusRamSchemaObjInclude( this );
		}
		return( schemaDefHPlusRamSchemaObjIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgSchemaInclude getSchemaDefHPlusXMsgSchemaIncludeHandler() {
		if( schemaDefHPlusXMsgSchemaIncludeHandler == null ) {
			schemaDefHPlusXMsgSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgSchemaInclude( this );
		}
		return( schemaDefHPlusXMsgSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgSchemaFormatters getSchemaDefHPlusXMsgSchemaFormattersHandler() {
		if( schemaDefHPlusXMsgSchemaFormattersHandler == null ) {
			schemaDefHPlusXMsgSchemaFormattersHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgSchemaFormatters( this );
		}
		return( schemaDefHPlusXMsgSchemaFormattersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgClientSchemaInclude getSchemaDefHPlusXMsgClientSchemaIncludeHandler() {
		if( schemaDefHPlusXMsgClientSchemaIncludeHandler == null ) {
			schemaDefHPlusXMsgClientSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgClientSchemaInclude( this );
		}
		return( schemaDefHPlusXMsgClientSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgClientSchemaBody getSchemaDefHPlusXMsgClientSchemaBodyHandler() {
		if( schemaDefHPlusXMsgClientSchemaBodyHandler == null ) {
			schemaDefHPlusXMsgClientSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgClientSchemaBody( this );
		}
		return( schemaDefHPlusXMsgClientSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaBody getSchemaDefHPlusXMsgRqstSchemaBodyHandler() {
		if( schemaDefHPlusXMsgRqstSchemaBodyHandler == null ) {
			schemaDefHPlusXMsgRqstSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaBody( this );
		}
		return( schemaDefHPlusXMsgRqstSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaInclude getSchemaDefHPlusXMsgRqstSchemaIncludeHandler() {
		if( schemaDefHPlusXMsgRqstSchemaIncludeHandler == null ) {
			schemaDefHPlusXMsgRqstSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaInclude( this );
		}
		return( schemaDefHPlusXMsgRqstSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaWireParsers getSchemaDefHPlusXMsgRqstSchemaWireParsersHandler() {
		if( schemaDefHPlusXMsgRqstSchemaWireParsersHandler == null ) {
			schemaDefHPlusXMsgRqstSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaWireParsers( this );
		}
		return( schemaDefHPlusXMsgRqstSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaXsdSpec getSchemaDefHPlusXMsgRqstSchemaXsdSpecHandler() {
		if( schemaDefHPlusXMsgRqstSchemaXsdSpecHandler == null ) {
			schemaDefHPlusXMsgRqstSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaXsdSpec( this );
		}
		return( schemaDefHPlusXMsgRqstSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaXsdElementList getSchemaDefHPlusXMsgRqstSchemaXsdElementListHandler() {
		if( schemaDefHPlusXMsgRqstSchemaXsdElementListHandler == null ) {
			schemaDefHPlusXMsgRqstSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRqstSchemaXsdElementList( this );
		}
		return( schemaDefHPlusXMsgRqstSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaBody getSchemaDefHPlusXMsgRspnSchemaBodyHandler() {
		if( schemaDefHPlusXMsgRspnSchemaBodyHandler == null ) {
			schemaDefHPlusXMsgRspnSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaBody( this );
		}
		return( schemaDefHPlusXMsgRspnSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaInclude getSchemaDefHPlusXMsgRspnSchemaIncludeHandler() {
		if( schemaDefHPlusXMsgRspnSchemaIncludeHandler == null ) {
			schemaDefHPlusXMsgRspnSchemaIncludeHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaInclude( this );
		}
		return( schemaDefHPlusXMsgRspnSchemaIncludeHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaWireParsers getSchemaDefHPlusXMsgRspnSchemaWireParsersHandler() {
		if( schemaDefHPlusXMsgRspnSchemaWireParsersHandler == null ) {
			schemaDefHPlusXMsgRspnSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaWireParsers( this );
		}
		return( schemaDefHPlusXMsgRspnSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaXsdElementList getSchemaDefHPlusXMsgRspnSchemaXsdElementListHandler() {
		if( schemaDefHPlusXMsgRspnSchemaXsdElementListHandler == null ) {
			schemaDefHPlusXMsgRspnSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaXsdElementList( this );
		}
		return( schemaDefHPlusXMsgRspnSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaXsdSpec getSchemaDefHPlusXMsgRspnSchemaXsdSpecHandler() {
		if( schemaDefHPlusXMsgRspnSchemaXsdSpecHandler == null ) {
			schemaDefHPlusXMsgRspnSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefHPlusXMsgRspnSchemaXsdSpec( this );
		}
		return( schemaDefHPlusXMsgRspnSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpSchemaObjUsing getSchemaDefCSharpSchemaObjUsingHandler() {
		if( schemaDefCSharpSchemaObjUsingHandler == null ) {
			schemaDefCSharpSchemaObjUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpSchemaObjUsing( this );
		}
		return( schemaDefCSharpSchemaObjUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpSchemaObjInterface getSchemaDefCSharpSchemaObjInterfaceHandler() {
		if( schemaDefCSharpSchemaObjInterfaceHandler == null ) {
			schemaDefCSharpSchemaObjInterfaceHandler = new YCFBamSaxLoaderSchemaDefCSharpSchemaObjInterface( this );
		}
		return( schemaDefCSharpSchemaObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpSchemaObjMembers getSchemaDefCSharpSchemaObjMembersHandler() {
		if( schemaDefCSharpSchemaObjMembersHandler == null ) {
			schemaDefCSharpSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCSharpSchemaObjMembers( this );
		}
		return( schemaDefCSharpSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpSchemaObjImplementation getSchemaDefCSharpSchemaObjImplementationHandler() {
		if( schemaDefCSharpSchemaObjImplementationHandler == null ) {
			schemaDefCSharpSchemaObjImplementationHandler = new YCFBamSaxLoaderSchemaDefCSharpSchemaObjImplementation( this );
		}
		return( schemaDefCSharpSchemaObjImplementationHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjMembers getSchemaDefCSharpDb2LUWSchemaObjMembersHandler() {
		if( schemaDefCSharpDb2LUWSchemaObjMembersHandler == null ) {
			schemaDefCSharpDb2LUWSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjMembers( this );
		}
		return( schemaDefCSharpDb2LUWSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjImpl getSchemaDefCSharpDb2LUWSchemaObjImplHandler() {
		if( schemaDefCSharpDb2LUWSchemaObjImplHandler == null ) {
			schemaDefCSharpDb2LUWSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjImpl( this );
		}
		return( schemaDefCSharpDb2LUWSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjUsing getSchemaDefCSharpDb2LUWSchemaObjUsingHandler() {
		if( schemaDefCSharpDb2LUWSchemaObjUsingHandler == null ) {
			schemaDefCSharpDb2LUWSchemaObjUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpDb2LUWSchemaObjUsing( this );
		}
		return( schemaDefCSharpDb2LUWSchemaObjUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjMembers getSchemaDefCSharpMSSqlSchemaObjMembersHandler() {
		if( schemaDefCSharpMSSqlSchemaObjMembersHandler == null ) {
			schemaDefCSharpMSSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjMembers( this );
		}
		return( schemaDefCSharpMSSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjImpl getSchemaDefCSharpMSSqlSchemaObjImplHandler() {
		if( schemaDefCSharpMSSqlSchemaObjImplHandler == null ) {
			schemaDefCSharpMSSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjImpl( this );
		}
		return( schemaDefCSharpMSSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjUsing getSchemaDefCSharpMSSqlSchemaObjUsingHandler() {
		if( schemaDefCSharpMSSqlSchemaObjUsingHandler == null ) {
			schemaDefCSharpMSSqlSchemaObjUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpMSSqlSchemaObjUsing( this );
		}
		return( schemaDefCSharpMSSqlSchemaObjUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjMembers getSchemaDefCSharpMySqlSchemaObjMembersHandler() {
		if( schemaDefCSharpMySqlSchemaObjMembersHandler == null ) {
			schemaDefCSharpMySqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjMembers( this );
		}
		return( schemaDefCSharpMySqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjImpl getSchemaDefCSharpMySqlSchemaObjImplHandler() {
		if( schemaDefCSharpMySqlSchemaObjImplHandler == null ) {
			schemaDefCSharpMySqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjImpl( this );
		}
		return( schemaDefCSharpMySqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjUsing getSchemaDefCSharpMySqlSchemaObjUsingHandler() {
		if( schemaDefCSharpMySqlSchemaObjUsingHandler == null ) {
			schemaDefCSharpMySqlSchemaObjUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpMySqlSchemaObjUsing( this );
		}
		return( schemaDefCSharpMySqlSchemaObjUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjMembers getSchemaDefCSharpOracleSchemaObjMembersHandler() {
		if( schemaDefCSharpOracleSchemaObjMembersHandler == null ) {
			schemaDefCSharpOracleSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjMembers( this );
		}
		return( schemaDefCSharpOracleSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjImpl getSchemaDefCSharpOracleSchemaObjImplHandler() {
		if( schemaDefCSharpOracleSchemaObjImplHandler == null ) {
			schemaDefCSharpOracleSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjImpl( this );
		}
		return( schemaDefCSharpOracleSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjUsing getSchemaDefCSharpOracleSchemaObjUsingHandler() {
		if( schemaDefCSharpOracleSchemaObjUsingHandler == null ) {
			schemaDefCSharpOracleSchemaObjUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpOracleSchemaObjUsing( this );
		}
		return( schemaDefCSharpOracleSchemaObjUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjMembers getSchemaDefCSharpPgSqlSchemaObjMembersHandler() {
		if( schemaDefCSharpPgSqlSchemaObjMembersHandler == null ) {
			schemaDefCSharpPgSqlSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjMembers( this );
		}
		return( schemaDefCSharpPgSqlSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjImpl getSchemaDefCSharpPgSqlSchemaObjImplHandler() {
		if( schemaDefCSharpPgSqlSchemaObjImplHandler == null ) {
			schemaDefCSharpPgSqlSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjImpl( this );
		}
		return( schemaDefCSharpPgSqlSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjUsing getSchemaDefCSharpPgSqlSchemaObjUsingHandler() {
		if( schemaDefCSharpPgSqlSchemaObjUsingHandler == null ) {
			schemaDefCSharpPgSqlSchemaObjUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpPgSqlSchemaObjUsing( this );
		}
		return( schemaDefCSharpPgSqlSchemaObjUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjMembers getSchemaDefCSharpRamSchemaObjMembersHandler() {
		if( schemaDefCSharpRamSchemaObjMembersHandler == null ) {
			schemaDefCSharpRamSchemaObjMembersHandler = new YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjMembers( this );
		}
		return( schemaDefCSharpRamSchemaObjMembersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjImpl getSchemaDefCSharpRamSchemaObjImplHandler() {
		if( schemaDefCSharpRamSchemaObjImplHandler == null ) {
			schemaDefCSharpRamSchemaObjImplHandler = new YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjImpl( this );
		}
		return( schemaDefCSharpRamSchemaObjImplHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjUsing getSchemaDefCSharpRamSchemaObjUsingHandler() {
		if( schemaDefCSharpRamSchemaObjUsingHandler == null ) {
			schemaDefCSharpRamSchemaObjUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpRamSchemaObjUsing( this );
		}
		return( schemaDefCSharpRamSchemaObjUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgSchemaUsing getSchemaDefCSharpXMsgSchemaUsingHandler() {
		if( schemaDefCSharpXMsgSchemaUsingHandler == null ) {
			schemaDefCSharpXMsgSchemaUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgSchemaUsing( this );
		}
		return( schemaDefCSharpXMsgSchemaUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgSchemaFormatters getSchemaDefCSharpXMsgSchemaFormattersHandler() {
		if( schemaDefCSharpXMsgSchemaFormattersHandler == null ) {
			schemaDefCSharpXMsgSchemaFormattersHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgSchemaFormatters( this );
		}
		return( schemaDefCSharpXMsgSchemaFormattersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgClientSchemaUsing getSchemaDefCSharpXMsgClientSchemaUsingHandler() {
		if( schemaDefCSharpXMsgClientSchemaUsingHandler == null ) {
			schemaDefCSharpXMsgClientSchemaUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgClientSchemaUsing( this );
		}
		return( schemaDefCSharpXMsgClientSchemaUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgClientSchemaBody getSchemaDefCSharpXMsgClientSchemaBodyHandler() {
		if( schemaDefCSharpXMsgClientSchemaBodyHandler == null ) {
			schemaDefCSharpXMsgClientSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgClientSchemaBody( this );
		}
		return( schemaDefCSharpXMsgClientSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaBody getSchemaDefCSharpXMsgRqstSchemaBodyHandler() {
		if( schemaDefCSharpXMsgRqstSchemaBodyHandler == null ) {
			schemaDefCSharpXMsgRqstSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaBody( this );
		}
		return( schemaDefCSharpXMsgRqstSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaUsing getSchemaDefCSharpXMsgRqstSchemaUsingHandler() {
		if( schemaDefCSharpXMsgRqstSchemaUsingHandler == null ) {
			schemaDefCSharpXMsgRqstSchemaUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaUsing( this );
		}
		return( schemaDefCSharpXMsgRqstSchemaUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaWireParsers getSchemaDefCSharpXMsgRqstSchemaWireParsersHandler() {
		if( schemaDefCSharpXMsgRqstSchemaWireParsersHandler == null ) {
			schemaDefCSharpXMsgRqstSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaWireParsers( this );
		}
		return( schemaDefCSharpXMsgRqstSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaXsdSpec getSchemaDefCSharpXMsgRqstSchemaXsdSpecHandler() {
		if( schemaDefCSharpXMsgRqstSchemaXsdSpecHandler == null ) {
			schemaDefCSharpXMsgRqstSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaXsdSpec( this );
		}
		return( schemaDefCSharpXMsgRqstSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaXsdElementList getSchemaDefCSharpXMsgRqstSchemaXsdElementListHandler() {
		if( schemaDefCSharpXMsgRqstSchemaXsdElementListHandler == null ) {
			schemaDefCSharpXMsgRqstSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRqstSchemaXsdElementList( this );
		}
		return( schemaDefCSharpXMsgRqstSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaBody getSchemaDefCSharpXMsgRspnSchemaBodyHandler() {
		if( schemaDefCSharpXMsgRspnSchemaBodyHandler == null ) {
			schemaDefCSharpXMsgRspnSchemaBodyHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaBody( this );
		}
		return( schemaDefCSharpXMsgRspnSchemaBodyHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaUsing getSchemaDefCSharpXMsgRspnSchemaUsingHandler() {
		if( schemaDefCSharpXMsgRspnSchemaUsingHandler == null ) {
			schemaDefCSharpXMsgRspnSchemaUsingHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaUsing( this );
		}
		return( schemaDefCSharpXMsgRspnSchemaUsingHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaWireParsers getSchemaDefCSharpXMsgRspnSchemaWireParsersHandler() {
		if( schemaDefCSharpXMsgRspnSchemaWireParsersHandler == null ) {
			schemaDefCSharpXMsgRspnSchemaWireParsersHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaWireParsers( this );
		}
		return( schemaDefCSharpXMsgRspnSchemaWireParsersHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaXsdElementList getSchemaDefCSharpXMsgRspnSchemaXsdElementListHandler() {
		if( schemaDefCSharpXMsgRspnSchemaXsdElementListHandler == null ) {
			schemaDefCSharpXMsgRspnSchemaXsdElementListHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaXsdElementList( this );
		}
		return( schemaDefCSharpXMsgRspnSchemaXsdElementListHandler );
	}
	protected YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaXsdSpec getSchemaDefCSharpXMsgRspnSchemaXsdSpecHandler() {
		if( schemaDefCSharpXMsgRspnSchemaXsdSpecHandler == null ) {
			schemaDefCSharpXMsgRspnSchemaXsdSpecHandler = new YCFBamSaxLoaderSchemaDefCSharpXMsgRspnSchemaXsdSpec( this );
		}
		return( schemaDefCSharpXMsgRspnSchemaXsdSpecHandler );
	}
	protected YCFBamSaxLoaderSchemaRef getSchemaRefHandler() {
		if( schemaRefHandler == null ) {
			schemaRefHandler = new YCFBamSaxLoaderSchemaRef( this );
		}
		return( schemaRefHandler );
	}
	protected YCFBamSaxLoaderSchemaRole getSchemaRoleHandler() {
		if( schemaRoleHandler == null ) {
			schemaRoleHandler = new YCFBamSaxLoaderSchemaRole( this );
		}
		return( schemaRoleHandler );
	}
	protected YCFBamSaxLoaderSchemaTweak getSchemaTweakHandler() {
		if( schemaTweakHandler == null ) {
			schemaTweakHandler = new YCFBamSaxLoaderSchemaTweak( this );
		}
		return( schemaTweakHandler );
	}
	protected YCFBamSaxLoaderScope getScopeHandler() {
		if( scopeHandler == null ) {
			scopeHandler = new YCFBamSaxLoaderScope( this );
		}
		return( scopeHandler );
	}
	protected YCFBamSaxLoaderSecApp getSecAppHandler() {
		if( secAppHandler == null ) {
			secAppHandler = new YCFBamSaxLoaderSecApp( this );
			secAppHandler.addElementHandler( "SecForm", getSecFormHandler() );
		}
		return( secAppHandler );
	}
	protected YCFBamSaxLoaderSecDevice getSecDeviceHandler() {
		if( secDeviceHandler == null ) {
			secDeviceHandler = new YCFBamSaxLoaderSecDevice( this );
		}
		return( secDeviceHandler );
	}
	protected YCFBamSaxLoaderSecForm getSecFormHandler() {
		if( secFormHandler == null ) {
			secFormHandler = new YCFBamSaxLoaderSecForm( this );
		}
		return( secFormHandler );
	}
	protected YCFBamSaxLoaderSecGroup getSecGroupHandler() {
		if( secGroupHandler == null ) {
			secGroupHandler = new YCFBamSaxLoaderSecGroup( this );
			secGroupHandler.addElementHandler( "SecGrpInc", getSecGrpIncHandler() );
			secGroupHandler.addElementHandler( "SecGrpMemb", getSecGrpMembHandler() );
			secGroupHandler.addElementHandler( "SecGroupForm", getSecGroupFormHandler() );
		}
		return( secGroupHandler );
	}
	protected YCFBamSaxLoaderSecGroupForm getSecGroupFormHandler() {
		if( secGroupFormHandler == null ) {
			secGroupFormHandler = new YCFBamSaxLoaderSecGroupForm( this );
		}
		return( secGroupFormHandler );
	}
	protected YCFBamSaxLoaderSecGrpInc getSecGrpIncHandler() {
		if( secGrpIncHandler == null ) {
			secGrpIncHandler = new YCFBamSaxLoaderSecGrpInc( this );
		}
		return( secGrpIncHandler );
	}
	protected YCFBamSaxLoaderSecGrpMemb getSecGrpMembHandler() {
		if( secGrpMembHandler == null ) {
			secGrpMembHandler = new YCFBamSaxLoaderSecGrpMemb( this );
		}
		return( secGrpMembHandler );
	}
	protected YCFBamSaxLoaderSecSession getSecSessionHandler() {
		if( secSessionHandler == null ) {
			secSessionHandler = new YCFBamSaxLoaderSecSession( this );
		}
		return( secSessionHandler );
	}
	protected YCFBamSaxLoaderSecUser getSecUserHandler() {
		if( secUserHandler == null ) {
			secUserHandler = new YCFBamSaxLoaderSecUser( this );
			secUserHandler.addElementHandler( "SecDevice", getSecDeviceHandler() );
			secUserHandler.addElementHandler( "SecSession", getSecSessionHandler() );
		}
		return( secUserHandler );
	}
	protected YCFBamSaxLoaderServerListFunc getServerListFuncHandler() {
		if( serverListFuncHandler == null ) {
			serverListFuncHandler = new YCFBamSaxLoaderServerListFunc( this );
			serverListFuncHandler.addElementHandler( "Param", getParamHandler() );
		}
		return( serverListFuncHandler );
	}
	protected YCFBamSaxLoaderServerMethod getServerMethodHandler() {
		if( serverMethodHandler == null ) {
			serverMethodHandler = new YCFBamSaxLoaderServerMethod( this );
			serverMethodHandler.addElementHandler( "Param", getParamHandler() );
		}
		return( serverMethodHandler );
	}
	protected YCFBamSaxLoaderServerObjFunc getServerObjFuncHandler() {
		if( serverObjFuncHandler == null ) {
			serverObjFuncHandler = new YCFBamSaxLoaderServerObjFunc( this );
			serverObjFuncHandler.addElementHandler( "Param", getParamHandler() );
		}
		return( serverObjFuncHandler );
	}
	protected YCFBamSaxLoaderServerProc getServerProcHandler() {
		if( serverProcHandler == null ) {
			serverProcHandler = new YCFBamSaxLoaderServerProc( this );
			serverProcHandler.addElementHandler( "Param", getParamHandler() );
		}
		return( serverProcHandler );
	}
	protected YCFBamSaxLoaderService getServiceHandler() {
		if( serviceHandler == null ) {
			serviceHandler = new YCFBamSaxLoaderService( this );
		}
		return( serviceHandler );
	}
	protected YCFBamSaxLoaderServiceType getServiceTypeHandler() {
		if( serviceTypeHandler == null ) {
			serviceTypeHandler = new YCFBamSaxLoaderServiceType( this );
		}
		return( serviceTypeHandler );
	}
	protected YCFBamSaxLoaderStringCol getStringColHandler() {
		if( stringColHandler == null ) {
			stringColHandler = new YCFBamSaxLoaderStringCol( this );
		}
		return( stringColHandler );
	}
	protected YCFBamSaxLoaderStringDef getStringDefHandler() {
		if( stringDefHandler == null ) {
			stringDefHandler = new YCFBamSaxLoaderStringDef( this );
		}
		return( stringDefHandler );
	}
	protected YCFBamSaxLoaderStringType getStringTypeHandler() {
		if( stringTypeHandler == null ) {
			stringTypeHandler = new YCFBamSaxLoaderStringType( this );
		}
		return( stringTypeHandler );
	}
	protected YCFBamSaxLoaderSubProject getSubProjectHandler() {
		if( subProjectHandler == null ) {
			subProjectHandler = new YCFBamSaxLoaderSubProject( this );
			subProjectHandler.addElementHandler( "MajorVersion", getMajorVersionHandler() );
		}
		return( subProjectHandler );
	}
	protected YCFBamSaxLoaderSysCluster getSysClusterHandler() {
		if( sysClusterHandler == null ) {
			sysClusterHandler = new YCFBamSaxLoaderSysCluster( this );
		}
		return( sysClusterHandler );
	}
	protected YCFBamSaxLoaderTSecGroup getTSecGroupHandler() {
		if( tSecGroupHandler == null ) {
			tSecGroupHandler = new YCFBamSaxLoaderTSecGroup( this );
			tSecGroupHandler.addElementHandler( "TSecGrpInc", getTSecGrpIncHandler() );
			tSecGroupHandler.addElementHandler( "TSecGrpMemb", getTSecGrpMembHandler() );
		}
		return( tSecGroupHandler );
	}
	protected YCFBamSaxLoaderTSecGrpInc getTSecGrpIncHandler() {
		if( tSecGrpIncHandler == null ) {
			tSecGrpIncHandler = new YCFBamSaxLoaderTSecGrpInc( this );
		}
		return( tSecGrpIncHandler );
	}
	protected YCFBamSaxLoaderTSecGrpMemb getTSecGrpMembHandler() {
		if( tSecGrpMembHandler == null ) {
			tSecGrpMembHandler = new YCFBamSaxLoaderTSecGrpMemb( this );
		}
		return( tSecGrpMembHandler );
	}
	protected YCFBamSaxLoaderTZDateCol getTZDateColHandler() {
		if( tZDateColHandler == null ) {
			tZDateColHandler = new YCFBamSaxLoaderTZDateCol( this );
		}
		return( tZDateColHandler );
	}
	protected YCFBamSaxLoaderTZDateDef getTZDateDefHandler() {
		if( tZDateDefHandler == null ) {
			tZDateDefHandler = new YCFBamSaxLoaderTZDateDef( this );
		}
		return( tZDateDefHandler );
	}
	protected YCFBamSaxLoaderTZDateType getTZDateTypeHandler() {
		if( tZDateTypeHandler == null ) {
			tZDateTypeHandler = new YCFBamSaxLoaderTZDateType( this );
		}
		return( tZDateTypeHandler );
	}
	protected YCFBamSaxLoaderTZTimeCol getTZTimeColHandler() {
		if( tZTimeColHandler == null ) {
			tZTimeColHandler = new YCFBamSaxLoaderTZTimeCol( this );
		}
		return( tZTimeColHandler );
	}
	protected YCFBamSaxLoaderTZTimeDef getTZTimeDefHandler() {
		if( tZTimeDefHandler == null ) {
			tZTimeDefHandler = new YCFBamSaxLoaderTZTimeDef( this );
		}
		return( tZTimeDefHandler );
	}
	protected YCFBamSaxLoaderTZTimeType getTZTimeTypeHandler() {
		if( tZTimeTypeHandler == null ) {
			tZTimeTypeHandler = new YCFBamSaxLoaderTZTimeType( this );
		}
		return( tZTimeTypeHandler );
	}
	protected YCFBamSaxLoaderTZTimestampCol getTZTimestampColHandler() {
		if( tZTimestampColHandler == null ) {
			tZTimestampColHandler = new YCFBamSaxLoaderTZTimestampCol( this );
		}
		return( tZTimestampColHandler );
	}
	protected YCFBamSaxLoaderTZTimestampDef getTZTimestampDefHandler() {
		if( tZTimestampDefHandler == null ) {
			tZTimestampDefHandler = new YCFBamSaxLoaderTZTimestampDef( this );
		}
		return( tZTimestampDefHandler );
	}
	protected YCFBamSaxLoaderTZTimestampType getTZTimestampTypeHandler() {
		if( tZTimestampTypeHandler == null ) {
			tZTimestampTypeHandler = new YCFBamSaxLoaderTZTimestampType( this );
		}
		return( tZTimestampTypeHandler );
	}
	protected YCFBamSaxLoaderTable getTableHandler() {
		if( tableHandler == null ) {
			tableHandler = new YCFBamSaxLoaderTable( this );
			tableHandler.addElementHandler( "Relation", getRelationHandler() );
			tableHandler.addElementHandler( "Index", getIndexHandler() );
			tableHandler.addElementHandler( "BlobCol", getBlobColHandler() );
			tableHandler.addElementHandler( "BoolCol", getBoolColHandler() );
			tableHandler.addElementHandler( "DateCol", getDateColHandler() );
			tableHandler.addElementHandler( "DoubleCol", getDoubleColHandler() );
			tableHandler.addElementHandler( "FloatCol", getFloatColHandler() );
			tableHandler.addElementHandler( "Int16Col", getInt16ColHandler() );
			tableHandler.addElementHandler( "Int32Col", getInt32ColHandler() );
			tableHandler.addElementHandler( "Int64Col", getInt64ColHandler() );
			tableHandler.addElementHandler( "NmTokenCol", getNmTokenColHandler() );
			tableHandler.addElementHandler( "NmTokensCol", getNmTokensColHandler() );
			tableHandler.addElementHandler( "NumberCol", getNumberColHandler() );
			tableHandler.addElementHandler( "DbKeyHash128Col", getDbKeyHash128ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash160Col", getDbKeyHash160ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash224Col", getDbKeyHash224ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash256Col", getDbKeyHash256ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash384Col", getDbKeyHash384ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash512Col", getDbKeyHash512ColHandler() );
			tableHandler.addElementHandler( "StringCol", getStringColHandler() );
			tableHandler.addElementHandler( "TZDateCol", getTZDateColHandler() );
			tableHandler.addElementHandler( "TZTimeCol", getTZTimeColHandler() );
			tableHandler.addElementHandler( "TZTimestampCol", getTZTimestampColHandler() );
			tableHandler.addElementHandler( "TextCol", getTextColHandler() );
			tableHandler.addElementHandler( "TimeCol", getTimeColHandler() );
			tableHandler.addElementHandler( "TimestampCol", getTimestampColHandler() );
			tableHandler.addElementHandler( "TokenCol", getTokenColHandler() );
			tableHandler.addElementHandler( "UInt16Col", getUInt16ColHandler() );
			tableHandler.addElementHandler( "UInt32Col", getUInt32ColHandler() );
			tableHandler.addElementHandler( "UInt64Col", getUInt64ColHandler() );
			tableHandler.addElementHandler( "UuidCol", getUuidColHandler() );
			tableHandler.addElementHandler( "Uuid6Col", getUuid6ColHandler() );
			tableHandler.addElementHandler( "TableCol", getTableColHandler() );
			tableHandler.addElementHandler( "Chain", getChainHandler() );
			tableHandler.addElementHandler( "DelTopDep", getDelTopDepHandler() );
			tableHandler.addElementHandler( "ClearTopDep", getClearTopDepHandler() );
			tableHandler.addElementHandler( "ServerMethod", getServerMethodHandler() );
			tableHandler.addElementHandler( "ServerObjFunc", getServerObjFuncHandler() );
			tableHandler.addElementHandler( "ServerProc", getServerProcHandler() );
			tableHandler.addElementHandler( "ServerListFunc", getServerListFuncHandler() );
			tableHandler.addElementHandler( "TableTweak", getTableTweakHandler() );
			tableHandler.addElementHandler( "CafeObjMembers", getTableCafeObjMembersHandler() );
			tableHandler.addElementHandler( "CafeObjInterface", getTableCafeObjInterfaceHandler() );
			tableHandler.addElementHandler( "CafeObjImport", getTableCafeObjImportHandler() );
			tableHandler.addElementHandler( "CafeObjImplementation", getTableCafeObjImplementationHandler() );
			tableHandler.addElementHandler( "CafeEditObjMembers", getTableCafeEditObjMembersHandler() );
			tableHandler.addElementHandler( "CafeEditObjInterface", getTableCafeEditObjInterfaceHandler() );
			tableHandler.addElementHandler( "CafeEditObjImport", getTableCafeEditObjImportHandler() );
			tableHandler.addElementHandler( "CafeEditObjImplementation", getTableCafeEditObjImplementationHandler() );
			tableHandler.addElementHandler( "CafeTableImport", getTableCafeTableImportHandler() );
			tableHandler.addElementHandler( "CafeTableMembers", getTableCafeTableMembersHandler() );
			tableHandler.addElementHandler( "CafeTableInterface", getTableCafeTableInterfaceHandler() );
			tableHandler.addElementHandler( "CafeTableImplementation", getTableCafeTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeTableObjImport", getTableCafeTableObjImportHandler() );
			tableHandler.addElementHandler( "CafeTableObjMembers", getTableCafeTableObjMembersHandler() );
			tableHandler.addElementHandler( "CafeTableObjInterface", getTableCafeTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "CafeTableObjImplementation", getTableCafeTableObjImplementationHandler() );
			tableHandler.addElementHandler( "CafeDb2LUWTableImport", getTableCafeDb2LUWTableImportHandler() );
			tableHandler.addElementHandler( "CafeDb2LUWTableMembers", getTableCafeDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "CafeDb2LUWTableImplementation", getTableCafeDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeMSSqlTableImport", getTableCafeMSSqlTableImportHandler() );
			tableHandler.addElementHandler( "CafeMSSqlTableMembers", getTableCafeMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CafeMSSqlTableImplementation", getTableCafeMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeMySqlTableImport", getTableCafeMySqlTableImportHandler() );
			tableHandler.addElementHandler( "CafeMySqlTableMembers", getTableCafeMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "CafeMySqlTableImplementation", getTableCafeMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeOracleTableImport", getTableCafeOracleTableImportHandler() );
			tableHandler.addElementHandler( "CafeOracleTableMembers", getTableCafeOracleTableMembersHandler() );
			tableHandler.addElementHandler( "CafeOracleTableImplementation", getTableCafeOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "CafePgSqlTableImport", getTableCafePgSqlTableImportHandler() );
			tableHandler.addElementHandler( "CafePgSqlTableMembers", getTableCafePgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CafePgSqlTableImplementation", getTableCafePgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeRamTableImport", getTableCafeRamTableImportHandler() );
			tableHandler.addElementHandler( "CafeRamTableMembers", getTableCafeRamTableMembersHandler() );
			tableHandler.addElementHandler( "CafeRamTableImplementation", getTableCafeRamTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeSaxLoaderImport", getTableCafeSaxLoaderImportHandler() );
			tableHandler.addElementHandler( "CafeSaxLoaderStartElement", getTableCafeSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "CafeSaxLoaderEndElement", getTableCafeSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "CafeXMsgTableImport", getTableCafeXMsgTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgTableformatters", getTableCafeXMsgTableformattersHandler() );
			tableHandler.addElementHandler( "CafeXMsgRqstTableImport", getTableCafeXMsgRqstTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgRspnTableImport", getTableCafeXMsgRspnTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgClientTableImport", getTableCafeXMsgClientTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgRqstTableBody", getTableCafeXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "CafeXMsgRspnTableBody", getTableCafeXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "CafeXMsgClientTableBody", getTableCafeXMsgClientTableBodyHandler() );
			tableHandler.addElementHandler( "CPlusObjMembers", getTableCPlusObjMembersHandler() );
			tableHandler.addElementHandler( "CPlusObjInterface", getTableCPlusObjInterfaceHandler() );
			tableHandler.addElementHandler( "CPlusObjInclude", getTableCPlusObjIncludeHandler() );
			tableHandler.addElementHandler( "CPlusObjImplementation", getTableCPlusObjImplementationHandler() );
			tableHandler.addElementHandler( "CPlusEditObjMembers", getTableCPlusEditObjMembersHandler() );
			tableHandler.addElementHandler( "CPlusEditObjInterace", getTableCPlusEditObjInteraceHandler() );
			tableHandler.addElementHandler( "CPlusEditObjInclude", getTableCPlusEditObjIncludeHandler() );
			tableHandler.addElementHandler( "CPlusEditObjImplementation", getTableCPlusEditObjImplementationHandler() );
			tableHandler.addElementHandler( "CPlusTableInclude", getTableCPlusTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusTableMembers", getTableCPlusTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusTableInterface", getTableCPlusTableInterfaceHandler() );
			tableHandler.addElementHandler( "CPlusTableImplementation", getTableCPlusTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusTableObjInclude", getTableCPlusTableObjIncludeHandler() );
			tableHandler.addElementHandler( "CPlusTableObjMembers", getTableCPlusTableObjMembersHandler() );
			tableHandler.addElementHandler( "CPlusTableObjInterface", getTableCPlusTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "CPlusTableObjImplementation", getTableCPlusTableObjImplementationHandler() );
			tableHandler.addElementHandler( "CPlusDb2LUWTableInclude", getTableCPlusDb2LUWTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusDb2LUWTableMembers", getTableCPlusDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusDb2LUWTableImplementation", getTableCPlusDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusMSSqlTableInclude", getTableCPlusMSSqlTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusMSSqlTableMembers", getTableCPlusMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusMSSqlTableImplementation", getTableCPlusMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusMySqlTableInclude", getTableCPlusMySqlTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusMySqlTableMembers", getTableCPlusMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusMySqlTableImplementation", getTableCPlusMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusOracleTableInclude", getTableCPlusOracleTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusOracleTableMembers", getTableCPlusOracleTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusOracleTableImplementation", getTableCPlusOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusPgSqlTableMembers", getTableCPlusPgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusPgSqlTableImplementation", getTableCPlusPgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusRamTableInclude", getTableCPlusRamTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusRamTableMembers", getTableCPlusRamTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusRamTableImplementation", getTableCPlusRamTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusSaxLoaderInclude", getTableCPlusSaxLoaderIncludeHandler() );
			tableHandler.addElementHandler( "CPlusSaxLoaderStartElement", getTableCPlusSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "CPlusSaxLoaderEndElement", getTableCPlusSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "CPlusXMsgTableInclude", getTableCPlusXMsgTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgTableFormatters", getTableCPlusXMsgTableFormattersHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRqstTableInclude", getTableCPlusXMsgRqstTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRspnTableInclude", getTableCPlusXMsgRspnTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgClientTableInclude", getTableCPlusXMsgClientTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRqstTableBody", getTableCPlusXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRspnTableBody", getTableCPlusXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "CPlusXMsgClientTableBody", getTableCPlusXMsgClientTableBodyHandler() );
			tableHandler.addElementHandler( "HPlusObjMembers", getTableHPlusObjMembersHandler() );
			tableHandler.addElementHandler( "HPlusObjInterface", getTableHPlusObjInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusObjInclude", getTableHPlusObjIncludeHandler() );
			tableHandler.addElementHandler( "HPlusObjImplemntation", getTableHPlusObjImplemntationHandler() );
			tableHandler.addElementHandler( "HPlusEditObjMembers", getTableHPlusEditObjMembersHandler() );
			tableHandler.addElementHandler( "HPlusEditObjInterface", getTableHPlusEditObjInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusEditObjInclude", getTableHPlusEditObjIncludeHandler() );
			tableHandler.addElementHandler( "HPlusEditObjImplementation", getTableHPlusEditObjImplementationHandler() );
			tableHandler.addElementHandler( "HPlusTableInclude", getTableHPlusTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusTableMembers", getTableHPlusTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusTableInterface", getTableHPlusTableInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusTableImplementation", getTableHPlusTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusTableObjInclude", getTableHPlusTableObjIncludeHandler() );
			tableHandler.addElementHandler( "HPlusTableObjMembers", getTableHPlusTableObjMembersHandler() );
			tableHandler.addElementHandler( "HPlusTableObjInterface", getTableHPlusTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusTableObjImplementation", getTableHPlusTableObjImplementationHandler() );
			tableHandler.addElementHandler( "HPlusDb2LUWTableInclude", getTableHPlusDb2LUWTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusDb2LUWTableMembers", getTableHPlusDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusDb2LUWTableImplementation", getTableHPlusDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusMSSqlTableInclude", getTableHPlusMSSqlTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusMSSqlTableMembers", getTableHPlusMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusMSSqlTableImplementation", getTableHPlusMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusMySqlTableInclude", getTableHPlusMySqlTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusMySqlTableMembers", getTableHPlusMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusMySqlTableImplementation", getTableHPlusMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusOracleTableInclude", getTableHPlusOracleTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusOracleTableMembers", getTableHPlusOracleTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusOracleTableImplementation", getTableHPlusOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusPgSqlTableInclude", getTableHPlusPgSqlTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusPgSqlTableMembers", getTableHPlusPgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusPgSqlTableImplementation", getTableHPlusPgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusRamTableInclude", getTableHPlusRamTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusRamTableMembers", getTableHPlusRamTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusRamTableImplementation", getTableHPlusRamTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusSaxLoaderInclude", getTableHPlusSaxLoaderIncludeHandler() );
			tableHandler.addElementHandler( "HPlusSaxLoaderStartElement", getTableHPlusSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "HPlusSaxLoaderEndElement", getTableHPlusSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "HPlusXMsgTableInclude", getTableHPlusXMsgTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgTableFormatters", getTableHPlusXMsgTableFormattersHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRqstTableInclude", getTableHPlusXMsgRqstTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRspnTableInclude", getTableHPlusXMsgRspnTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgClientTableInclude", getTableHPlusXMsgClientTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRqstTableBody", getTableHPlusXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRspnTableBody", getTableHPlusXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "HPlusXMsgClientTableBody", getTableHPlusXMsgClientTableBodyHandler() );
			tableHandler.addElementHandler( "CSharpObjMembers", getTableCSharpObjMembersHandler() );
			tableHandler.addElementHandler( "CSharpObjInterface", getTableCSharpObjInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpObjUsing", getTableCSharpObjUsingHandler() );
			tableHandler.addElementHandler( "CSharpObjImplementation", getTableCSharpObjImplementationHandler() );
			tableHandler.addElementHandler( "CSharpEditObjMembers", getTableCSharpEditObjMembersHandler() );
			tableHandler.addElementHandler( "CSharpEditObjInterface", getTableCSharpEditObjInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpEditObjUsing", getTableCSharpEditObjUsingHandler() );
			tableHandler.addElementHandler( "CSharpEditObjImplementation", getTableCSharpEditObjImplementationHandler() );
			tableHandler.addElementHandler( "CSharpTableUsing", getTableCSharpTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpTableMembers", getTableCSharpTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpTableInterface", getTableCSharpTableInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpTableImplementation", getTableCSharpTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpTableObjUsing", getTableCSharpTableObjUsingHandler() );
			tableHandler.addElementHandler( "CSharpTableObjMembers", getTableCSharpTableObjMembersHandler() );
			tableHandler.addElementHandler( "CSharpTableObjInterface", getTableCSharpTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpTableObjImplementation", getTableCSharpTableObjImplementationHandler() );
			tableHandler.addElementHandler( "CSharpDb2LUWTableUsing", getTableCSharpDb2LUWTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpDb2LUWTableMembers", getTableCSharpDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpDb2LUWTableImplementation", getTableCSharpDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpMSSqlTableUsing", getTableCSharpMSSqlTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpMSSqlTableMembers", getTableCSharpMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpMSSqlTableImplementation", getTableCSharpMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpMySqlTableUsing", getTableCSharpMySqlTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpMySqlTableMembers", getTableCSharpMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpMySqlTableImplementation", getTableCSharpMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpOracleTableUsing", getTableCSharpOracleTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpOracleTableMembers", getTableCSharpOracleTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpOracleTableImplementation", getTableCSharpOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpPgSqlTableUsing", getTableCSharpPgSqlTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpPgSqlTableMembers", getTableCSharpPgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpPgSqlTableImplementation", getTableCSharpPgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpRamTableUsing", getTableCSharpRamTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpRamTableMembers", getTableCSharpRamTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpRamTableImplementation", getTableCSharpRamTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpSaxLoaderUsing", getTableCSharpSaxLoaderUsingHandler() );
			tableHandler.addElementHandler( "CSharpSaxLoaderStartElement", getTableCSharpSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "CSharpSaxLoaderEndElement", getTableCSharpSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "CSharpXMsgTableUsing", getTableCSharpXMsgTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgTableFormatters", getTableCSharpXMsgTableFormattersHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRqstTableUsing", getTableCSharpXMsgRqstTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRspnTableUsing", getTableCSharpXMsgRspnTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgClientTableUsing", getTableCSharpXMsgClientTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRqstTableBody", getTableCSharpXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRspnTableBody", getTableCSharpXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "CSharpXMsgClientTableBody", getTableCSharpXMsgClientTableBodyHandler() );
		}
		return( tableHandler );
	}
	protected YCFBamSaxLoaderTableCafeObjMembers getTableCafeObjMembersHandler() {
		if( tableCafeObjMembersHandler == null ) {
			tableCafeObjMembersHandler = new YCFBamSaxLoaderTableCafeObjMembers( this );
		}
		return( tableCafeObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeObjInterface getTableCafeObjInterfaceHandler() {
		if( tableCafeObjInterfaceHandler == null ) {
			tableCafeObjInterfaceHandler = new YCFBamSaxLoaderTableCafeObjInterface( this );
		}
		return( tableCafeObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCafeObjImport getTableCafeObjImportHandler() {
		if( tableCafeObjImportHandler == null ) {
			tableCafeObjImportHandler = new YCFBamSaxLoaderTableCafeObjImport( this );
		}
		return( tableCafeObjImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeObjImplementation getTableCafeObjImplementationHandler() {
		if( tableCafeObjImplementationHandler == null ) {
			tableCafeObjImplementationHandler = new YCFBamSaxLoaderTableCafeObjImplementation( this );
		}
		return( tableCafeObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeEditObjMembers getTableCafeEditObjMembersHandler() {
		if( tableCafeEditObjMembersHandler == null ) {
			tableCafeEditObjMembersHandler = new YCFBamSaxLoaderTableCafeEditObjMembers( this );
		}
		return( tableCafeEditObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeEditObjInterface getTableCafeEditObjInterfaceHandler() {
		if( tableCafeEditObjInterfaceHandler == null ) {
			tableCafeEditObjInterfaceHandler = new YCFBamSaxLoaderTableCafeEditObjInterface( this );
		}
		return( tableCafeEditObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCafeEditObjImport getTableCafeEditObjImportHandler() {
		if( tableCafeEditObjImportHandler == null ) {
			tableCafeEditObjImportHandler = new YCFBamSaxLoaderTableCafeEditObjImport( this );
		}
		return( tableCafeEditObjImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeEditObjImplementation getTableCafeEditObjImplementationHandler() {
		if( tableCafeEditObjImplementationHandler == null ) {
			tableCafeEditObjImplementationHandler = new YCFBamSaxLoaderTableCafeEditObjImplementation( this );
		}
		return( tableCafeEditObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableImport getTableCafeTableImportHandler() {
		if( tableCafeTableImportHandler == null ) {
			tableCafeTableImportHandler = new YCFBamSaxLoaderTableCafeTableImport( this );
		}
		return( tableCafeTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableMembers getTableCafeTableMembersHandler() {
		if( tableCafeTableMembersHandler == null ) {
			tableCafeTableMembersHandler = new YCFBamSaxLoaderTableCafeTableMembers( this );
		}
		return( tableCafeTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableInterface getTableCafeTableInterfaceHandler() {
		if( tableCafeTableInterfaceHandler == null ) {
			tableCafeTableInterfaceHandler = new YCFBamSaxLoaderTableCafeTableInterface( this );
		}
		return( tableCafeTableInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableImplementation getTableCafeTableImplementationHandler() {
		if( tableCafeTableImplementationHandler == null ) {
			tableCafeTableImplementationHandler = new YCFBamSaxLoaderTableCafeTableImplementation( this );
		}
		return( tableCafeTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableObjImport getTableCafeTableObjImportHandler() {
		if( tableCafeTableObjImportHandler == null ) {
			tableCafeTableObjImportHandler = new YCFBamSaxLoaderTableCafeTableObjImport( this );
		}
		return( tableCafeTableObjImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableObjMembers getTableCafeTableObjMembersHandler() {
		if( tableCafeTableObjMembersHandler == null ) {
			tableCafeTableObjMembersHandler = new YCFBamSaxLoaderTableCafeTableObjMembers( this );
		}
		return( tableCafeTableObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableObjInterface getTableCafeTableObjInterfaceHandler() {
		if( tableCafeTableObjInterfaceHandler == null ) {
			tableCafeTableObjInterfaceHandler = new YCFBamSaxLoaderTableCafeTableObjInterface( this );
		}
		return( tableCafeTableObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCafeTableObjImplementation getTableCafeTableObjImplementationHandler() {
		if( tableCafeTableObjImplementationHandler == null ) {
			tableCafeTableObjImplementationHandler = new YCFBamSaxLoaderTableCafeTableObjImplementation( this );
		}
		return( tableCafeTableObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeDb2LUWTableImport getTableCafeDb2LUWTableImportHandler() {
		if( tableCafeDb2LUWTableImportHandler == null ) {
			tableCafeDb2LUWTableImportHandler = new YCFBamSaxLoaderTableCafeDb2LUWTableImport( this );
		}
		return( tableCafeDb2LUWTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeDb2LUWTableMembers getTableCafeDb2LUWTableMembersHandler() {
		if( tableCafeDb2LUWTableMembersHandler == null ) {
			tableCafeDb2LUWTableMembersHandler = new YCFBamSaxLoaderTableCafeDb2LUWTableMembers( this );
		}
		return( tableCafeDb2LUWTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeDb2LUWTableImplementation getTableCafeDb2LUWTableImplementationHandler() {
		if( tableCafeDb2LUWTableImplementationHandler == null ) {
			tableCafeDb2LUWTableImplementationHandler = new YCFBamSaxLoaderTableCafeDb2LUWTableImplementation( this );
		}
		return( tableCafeDb2LUWTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeMSSqlTableImport getTableCafeMSSqlTableImportHandler() {
		if( tableCafeMSSqlTableImportHandler == null ) {
			tableCafeMSSqlTableImportHandler = new YCFBamSaxLoaderTableCafeMSSqlTableImport( this );
		}
		return( tableCafeMSSqlTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeMSSqlTableMembers getTableCafeMSSqlTableMembersHandler() {
		if( tableCafeMSSqlTableMembersHandler == null ) {
			tableCafeMSSqlTableMembersHandler = new YCFBamSaxLoaderTableCafeMSSqlTableMembers( this );
		}
		return( tableCafeMSSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeMSSqlTableImplementation getTableCafeMSSqlTableImplementationHandler() {
		if( tableCafeMSSqlTableImplementationHandler == null ) {
			tableCafeMSSqlTableImplementationHandler = new YCFBamSaxLoaderTableCafeMSSqlTableImplementation( this );
		}
		return( tableCafeMSSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeMySqlTableImport getTableCafeMySqlTableImportHandler() {
		if( tableCafeMySqlTableImportHandler == null ) {
			tableCafeMySqlTableImportHandler = new YCFBamSaxLoaderTableCafeMySqlTableImport( this );
		}
		return( tableCafeMySqlTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeMySqlTableMembers getTableCafeMySqlTableMembersHandler() {
		if( tableCafeMySqlTableMembersHandler == null ) {
			tableCafeMySqlTableMembersHandler = new YCFBamSaxLoaderTableCafeMySqlTableMembers( this );
		}
		return( tableCafeMySqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeMySqlTableImplementation getTableCafeMySqlTableImplementationHandler() {
		if( tableCafeMySqlTableImplementationHandler == null ) {
			tableCafeMySqlTableImplementationHandler = new YCFBamSaxLoaderTableCafeMySqlTableImplementation( this );
		}
		return( tableCafeMySqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeOracleTableImport getTableCafeOracleTableImportHandler() {
		if( tableCafeOracleTableImportHandler == null ) {
			tableCafeOracleTableImportHandler = new YCFBamSaxLoaderTableCafeOracleTableImport( this );
		}
		return( tableCafeOracleTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeOracleTableMembers getTableCafeOracleTableMembersHandler() {
		if( tableCafeOracleTableMembersHandler == null ) {
			tableCafeOracleTableMembersHandler = new YCFBamSaxLoaderTableCafeOracleTableMembers( this );
		}
		return( tableCafeOracleTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeOracleTableImplementation getTableCafeOracleTableImplementationHandler() {
		if( tableCafeOracleTableImplementationHandler == null ) {
			tableCafeOracleTableImplementationHandler = new YCFBamSaxLoaderTableCafeOracleTableImplementation( this );
		}
		return( tableCafeOracleTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafePgSqlTableImport getTableCafePgSqlTableImportHandler() {
		if( tableCafePgSqlTableImportHandler == null ) {
			tableCafePgSqlTableImportHandler = new YCFBamSaxLoaderTableCafePgSqlTableImport( this );
		}
		return( tableCafePgSqlTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafePgSqlTableMembers getTableCafePgSqlTableMembersHandler() {
		if( tableCafePgSqlTableMembersHandler == null ) {
			tableCafePgSqlTableMembersHandler = new YCFBamSaxLoaderTableCafePgSqlTableMembers( this );
		}
		return( tableCafePgSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafePgSqlTableImplementation getTableCafePgSqlTableImplementationHandler() {
		if( tableCafePgSqlTableImplementationHandler == null ) {
			tableCafePgSqlTableImplementationHandler = new YCFBamSaxLoaderTableCafePgSqlTableImplementation( this );
		}
		return( tableCafePgSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeRamTableImport getTableCafeRamTableImportHandler() {
		if( tableCafeRamTableImportHandler == null ) {
			tableCafeRamTableImportHandler = new YCFBamSaxLoaderTableCafeRamTableImport( this );
		}
		return( tableCafeRamTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeRamTableMembers getTableCafeRamTableMembersHandler() {
		if( tableCafeRamTableMembersHandler == null ) {
			tableCafeRamTableMembersHandler = new YCFBamSaxLoaderTableCafeRamTableMembers( this );
		}
		return( tableCafeRamTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCafeRamTableImplementation getTableCafeRamTableImplementationHandler() {
		if( tableCafeRamTableImplementationHandler == null ) {
			tableCafeRamTableImplementationHandler = new YCFBamSaxLoaderTableCafeRamTableImplementation( this );
		}
		return( tableCafeRamTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCafeSaxLoaderImport getTableCafeSaxLoaderImportHandler() {
		if( tableCafeSaxLoaderImportHandler == null ) {
			tableCafeSaxLoaderImportHandler = new YCFBamSaxLoaderTableCafeSaxLoaderImport( this );
		}
		return( tableCafeSaxLoaderImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeSaxLoaderStartElement getTableCafeSaxLoaderStartElementHandler() {
		if( tableCafeSaxLoaderStartElementHandler == null ) {
			tableCafeSaxLoaderStartElementHandler = new YCFBamSaxLoaderTableCafeSaxLoaderStartElement( this );
		}
		return( tableCafeSaxLoaderStartElementHandler );
	}
	protected YCFBamSaxLoaderTableCafeSaxLoaderEndElement getTableCafeSaxLoaderEndElementHandler() {
		if( tableCafeSaxLoaderEndElementHandler == null ) {
			tableCafeSaxLoaderEndElementHandler = new YCFBamSaxLoaderTableCafeSaxLoaderEndElement( this );
		}
		return( tableCafeSaxLoaderEndElementHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgTableImport getTableCafeXMsgTableImportHandler() {
		if( tableCafeXMsgTableImportHandler == null ) {
			tableCafeXMsgTableImportHandler = new YCFBamSaxLoaderTableCafeXMsgTableImport( this );
		}
		return( tableCafeXMsgTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgTableformatters getTableCafeXMsgTableformattersHandler() {
		if( tableCafeXMsgTableformattersHandler == null ) {
			tableCafeXMsgTableformattersHandler = new YCFBamSaxLoaderTableCafeXMsgTableformatters( this );
		}
		return( tableCafeXMsgTableformattersHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgRqstTableImport getTableCafeXMsgRqstTableImportHandler() {
		if( tableCafeXMsgRqstTableImportHandler == null ) {
			tableCafeXMsgRqstTableImportHandler = new YCFBamSaxLoaderTableCafeXMsgRqstTableImport( this );
		}
		return( tableCafeXMsgRqstTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgRspnTableImport getTableCafeXMsgRspnTableImportHandler() {
		if( tableCafeXMsgRspnTableImportHandler == null ) {
			tableCafeXMsgRspnTableImportHandler = new YCFBamSaxLoaderTableCafeXMsgRspnTableImport( this );
		}
		return( tableCafeXMsgRspnTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgClientTableImport getTableCafeXMsgClientTableImportHandler() {
		if( tableCafeXMsgClientTableImportHandler == null ) {
			tableCafeXMsgClientTableImportHandler = new YCFBamSaxLoaderTableCafeXMsgClientTableImport( this );
		}
		return( tableCafeXMsgClientTableImportHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgRqstTableBody getTableCafeXMsgRqstTableBodyHandler() {
		if( tableCafeXMsgRqstTableBodyHandler == null ) {
			tableCafeXMsgRqstTableBodyHandler = new YCFBamSaxLoaderTableCafeXMsgRqstTableBody( this );
		}
		return( tableCafeXMsgRqstTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgRspnTableBody getTableCafeXMsgRspnTableBodyHandler() {
		if( tableCafeXMsgRspnTableBodyHandler == null ) {
			tableCafeXMsgRspnTableBodyHandler = new YCFBamSaxLoaderTableCafeXMsgRspnTableBody( this );
		}
		return( tableCafeXMsgRspnTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCafeXMsgClientTableBody getTableCafeXMsgClientTableBodyHandler() {
		if( tableCafeXMsgClientTableBodyHandler == null ) {
			tableCafeXMsgClientTableBodyHandler = new YCFBamSaxLoaderTableCafeXMsgClientTableBody( this );
		}
		return( tableCafeXMsgClientTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCPlusObjMembers getTableCPlusObjMembersHandler() {
		if( tableCPlusObjMembersHandler == null ) {
			tableCPlusObjMembersHandler = new YCFBamSaxLoaderTableCPlusObjMembers( this );
		}
		return( tableCPlusObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusObjInterface getTableCPlusObjInterfaceHandler() {
		if( tableCPlusObjInterfaceHandler == null ) {
			tableCPlusObjInterfaceHandler = new YCFBamSaxLoaderTableCPlusObjInterface( this );
		}
		return( tableCPlusObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCPlusObjInclude getTableCPlusObjIncludeHandler() {
		if( tableCPlusObjIncludeHandler == null ) {
			tableCPlusObjIncludeHandler = new YCFBamSaxLoaderTableCPlusObjInclude( this );
		}
		return( tableCPlusObjIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusObjImplementation getTableCPlusObjImplementationHandler() {
		if( tableCPlusObjImplementationHandler == null ) {
			tableCPlusObjImplementationHandler = new YCFBamSaxLoaderTableCPlusObjImplementation( this );
		}
		return( tableCPlusObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusEditObjMembers getTableCPlusEditObjMembersHandler() {
		if( tableCPlusEditObjMembersHandler == null ) {
			tableCPlusEditObjMembersHandler = new YCFBamSaxLoaderTableCPlusEditObjMembers( this );
		}
		return( tableCPlusEditObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusEditObjInterace getTableCPlusEditObjInteraceHandler() {
		if( tableCPlusEditObjInteraceHandler == null ) {
			tableCPlusEditObjInteraceHandler = new YCFBamSaxLoaderTableCPlusEditObjInterace( this );
		}
		return( tableCPlusEditObjInteraceHandler );
	}
	protected YCFBamSaxLoaderTableCPlusEditObjInclude getTableCPlusEditObjIncludeHandler() {
		if( tableCPlusEditObjIncludeHandler == null ) {
			tableCPlusEditObjIncludeHandler = new YCFBamSaxLoaderTableCPlusEditObjInclude( this );
		}
		return( tableCPlusEditObjIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusEditObjImplementation getTableCPlusEditObjImplementationHandler() {
		if( tableCPlusEditObjImplementationHandler == null ) {
			tableCPlusEditObjImplementationHandler = new YCFBamSaxLoaderTableCPlusEditObjImplementation( this );
		}
		return( tableCPlusEditObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableInclude getTableCPlusTableIncludeHandler() {
		if( tableCPlusTableIncludeHandler == null ) {
			tableCPlusTableIncludeHandler = new YCFBamSaxLoaderTableCPlusTableInclude( this );
		}
		return( tableCPlusTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableMembers getTableCPlusTableMembersHandler() {
		if( tableCPlusTableMembersHandler == null ) {
			tableCPlusTableMembersHandler = new YCFBamSaxLoaderTableCPlusTableMembers( this );
		}
		return( tableCPlusTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableInterface getTableCPlusTableInterfaceHandler() {
		if( tableCPlusTableInterfaceHandler == null ) {
			tableCPlusTableInterfaceHandler = new YCFBamSaxLoaderTableCPlusTableInterface( this );
		}
		return( tableCPlusTableInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableImplementation getTableCPlusTableImplementationHandler() {
		if( tableCPlusTableImplementationHandler == null ) {
			tableCPlusTableImplementationHandler = new YCFBamSaxLoaderTableCPlusTableImplementation( this );
		}
		return( tableCPlusTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableObjInclude getTableCPlusTableObjIncludeHandler() {
		if( tableCPlusTableObjIncludeHandler == null ) {
			tableCPlusTableObjIncludeHandler = new YCFBamSaxLoaderTableCPlusTableObjInclude( this );
		}
		return( tableCPlusTableObjIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableObjMembers getTableCPlusTableObjMembersHandler() {
		if( tableCPlusTableObjMembersHandler == null ) {
			tableCPlusTableObjMembersHandler = new YCFBamSaxLoaderTableCPlusTableObjMembers( this );
		}
		return( tableCPlusTableObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableObjInterface getTableCPlusTableObjInterfaceHandler() {
		if( tableCPlusTableObjInterfaceHandler == null ) {
			tableCPlusTableObjInterfaceHandler = new YCFBamSaxLoaderTableCPlusTableObjInterface( this );
		}
		return( tableCPlusTableObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCPlusTableObjImplementation getTableCPlusTableObjImplementationHandler() {
		if( tableCPlusTableObjImplementationHandler == null ) {
			tableCPlusTableObjImplementationHandler = new YCFBamSaxLoaderTableCPlusTableObjImplementation( this );
		}
		return( tableCPlusTableObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusDb2LUWTableInclude getTableCPlusDb2LUWTableIncludeHandler() {
		if( tableCPlusDb2LUWTableIncludeHandler == null ) {
			tableCPlusDb2LUWTableIncludeHandler = new YCFBamSaxLoaderTableCPlusDb2LUWTableInclude( this );
		}
		return( tableCPlusDb2LUWTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusDb2LUWTableMembers getTableCPlusDb2LUWTableMembersHandler() {
		if( tableCPlusDb2LUWTableMembersHandler == null ) {
			tableCPlusDb2LUWTableMembersHandler = new YCFBamSaxLoaderTableCPlusDb2LUWTableMembers( this );
		}
		return( tableCPlusDb2LUWTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusDb2LUWTableImplementation getTableCPlusDb2LUWTableImplementationHandler() {
		if( tableCPlusDb2LUWTableImplementationHandler == null ) {
			tableCPlusDb2LUWTableImplementationHandler = new YCFBamSaxLoaderTableCPlusDb2LUWTableImplementation( this );
		}
		return( tableCPlusDb2LUWTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusMSSqlTableInclude getTableCPlusMSSqlTableIncludeHandler() {
		if( tableCPlusMSSqlTableIncludeHandler == null ) {
			tableCPlusMSSqlTableIncludeHandler = new YCFBamSaxLoaderTableCPlusMSSqlTableInclude( this );
		}
		return( tableCPlusMSSqlTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusMSSqlTableMembers getTableCPlusMSSqlTableMembersHandler() {
		if( tableCPlusMSSqlTableMembersHandler == null ) {
			tableCPlusMSSqlTableMembersHandler = new YCFBamSaxLoaderTableCPlusMSSqlTableMembers( this );
		}
		return( tableCPlusMSSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusMSSqlTableImplementation getTableCPlusMSSqlTableImplementationHandler() {
		if( tableCPlusMSSqlTableImplementationHandler == null ) {
			tableCPlusMSSqlTableImplementationHandler = new YCFBamSaxLoaderTableCPlusMSSqlTableImplementation( this );
		}
		return( tableCPlusMSSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusMySqlTableInclude getTableCPlusMySqlTableIncludeHandler() {
		if( tableCPlusMySqlTableIncludeHandler == null ) {
			tableCPlusMySqlTableIncludeHandler = new YCFBamSaxLoaderTableCPlusMySqlTableInclude( this );
		}
		return( tableCPlusMySqlTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusMySqlTableMembers getTableCPlusMySqlTableMembersHandler() {
		if( tableCPlusMySqlTableMembersHandler == null ) {
			tableCPlusMySqlTableMembersHandler = new YCFBamSaxLoaderTableCPlusMySqlTableMembers( this );
		}
		return( tableCPlusMySqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusMySqlTableImplementation getTableCPlusMySqlTableImplementationHandler() {
		if( tableCPlusMySqlTableImplementationHandler == null ) {
			tableCPlusMySqlTableImplementationHandler = new YCFBamSaxLoaderTableCPlusMySqlTableImplementation( this );
		}
		return( tableCPlusMySqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusOracleTableInclude getTableCPlusOracleTableIncludeHandler() {
		if( tableCPlusOracleTableIncludeHandler == null ) {
			tableCPlusOracleTableIncludeHandler = new YCFBamSaxLoaderTableCPlusOracleTableInclude( this );
		}
		return( tableCPlusOracleTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusOracleTableMembers getTableCPlusOracleTableMembersHandler() {
		if( tableCPlusOracleTableMembersHandler == null ) {
			tableCPlusOracleTableMembersHandler = new YCFBamSaxLoaderTableCPlusOracleTableMembers( this );
		}
		return( tableCPlusOracleTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusOracleTableImplementation getTableCPlusOracleTableImplementationHandler() {
		if( tableCPlusOracleTableImplementationHandler == null ) {
			tableCPlusOracleTableImplementationHandler = new YCFBamSaxLoaderTableCPlusOracleTableImplementation( this );
		}
		return( tableCPlusOracleTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusPgSqlTableMembers getTableCPlusPgSqlTableMembersHandler() {
		if( tableCPlusPgSqlTableMembersHandler == null ) {
			tableCPlusPgSqlTableMembersHandler = new YCFBamSaxLoaderTableCPlusPgSqlTableMembers( this );
		}
		return( tableCPlusPgSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusPgSqlTableImplementation getTableCPlusPgSqlTableImplementationHandler() {
		if( tableCPlusPgSqlTableImplementationHandler == null ) {
			tableCPlusPgSqlTableImplementationHandler = new YCFBamSaxLoaderTableCPlusPgSqlTableImplementation( this );
		}
		return( tableCPlusPgSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusRamTableInclude getTableCPlusRamTableIncludeHandler() {
		if( tableCPlusRamTableIncludeHandler == null ) {
			tableCPlusRamTableIncludeHandler = new YCFBamSaxLoaderTableCPlusRamTableInclude( this );
		}
		return( tableCPlusRamTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusRamTableMembers getTableCPlusRamTableMembersHandler() {
		if( tableCPlusRamTableMembersHandler == null ) {
			tableCPlusRamTableMembersHandler = new YCFBamSaxLoaderTableCPlusRamTableMembers( this );
		}
		return( tableCPlusRamTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusRamTableImplementation getTableCPlusRamTableImplementationHandler() {
		if( tableCPlusRamTableImplementationHandler == null ) {
			tableCPlusRamTableImplementationHandler = new YCFBamSaxLoaderTableCPlusRamTableImplementation( this );
		}
		return( tableCPlusRamTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCPlusSaxLoaderInclude getTableCPlusSaxLoaderIncludeHandler() {
		if( tableCPlusSaxLoaderIncludeHandler == null ) {
			tableCPlusSaxLoaderIncludeHandler = new YCFBamSaxLoaderTableCPlusSaxLoaderInclude( this );
		}
		return( tableCPlusSaxLoaderIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusSaxLoaderStartElement getTableCPlusSaxLoaderStartElementHandler() {
		if( tableCPlusSaxLoaderStartElementHandler == null ) {
			tableCPlusSaxLoaderStartElementHandler = new YCFBamSaxLoaderTableCPlusSaxLoaderStartElement( this );
		}
		return( tableCPlusSaxLoaderStartElementHandler );
	}
	protected YCFBamSaxLoaderTableCPlusSaxLoaderEndElement getTableCPlusSaxLoaderEndElementHandler() {
		if( tableCPlusSaxLoaderEndElementHandler == null ) {
			tableCPlusSaxLoaderEndElementHandler = new YCFBamSaxLoaderTableCPlusSaxLoaderEndElement( this );
		}
		return( tableCPlusSaxLoaderEndElementHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgTableInclude getTableCPlusXMsgTableIncludeHandler() {
		if( tableCPlusXMsgTableIncludeHandler == null ) {
			tableCPlusXMsgTableIncludeHandler = new YCFBamSaxLoaderTableCPlusXMsgTableInclude( this );
		}
		return( tableCPlusXMsgTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgTableFormatters getTableCPlusXMsgTableFormattersHandler() {
		if( tableCPlusXMsgTableFormattersHandler == null ) {
			tableCPlusXMsgTableFormattersHandler = new YCFBamSaxLoaderTableCPlusXMsgTableFormatters( this );
		}
		return( tableCPlusXMsgTableFormattersHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgRqstTableInclude getTableCPlusXMsgRqstTableIncludeHandler() {
		if( tableCPlusXMsgRqstTableIncludeHandler == null ) {
			tableCPlusXMsgRqstTableIncludeHandler = new YCFBamSaxLoaderTableCPlusXMsgRqstTableInclude( this );
		}
		return( tableCPlusXMsgRqstTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgRspnTableInclude getTableCPlusXMsgRspnTableIncludeHandler() {
		if( tableCPlusXMsgRspnTableIncludeHandler == null ) {
			tableCPlusXMsgRspnTableIncludeHandler = new YCFBamSaxLoaderTableCPlusXMsgRspnTableInclude( this );
		}
		return( tableCPlusXMsgRspnTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgClientTableInclude getTableCPlusXMsgClientTableIncludeHandler() {
		if( tableCPlusXMsgClientTableIncludeHandler == null ) {
			tableCPlusXMsgClientTableIncludeHandler = new YCFBamSaxLoaderTableCPlusXMsgClientTableInclude( this );
		}
		return( tableCPlusXMsgClientTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgRqstTableBody getTableCPlusXMsgRqstTableBodyHandler() {
		if( tableCPlusXMsgRqstTableBodyHandler == null ) {
			tableCPlusXMsgRqstTableBodyHandler = new YCFBamSaxLoaderTableCPlusXMsgRqstTableBody( this );
		}
		return( tableCPlusXMsgRqstTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgRspnTableBody getTableCPlusXMsgRspnTableBodyHandler() {
		if( tableCPlusXMsgRspnTableBodyHandler == null ) {
			tableCPlusXMsgRspnTableBodyHandler = new YCFBamSaxLoaderTableCPlusXMsgRspnTableBody( this );
		}
		return( tableCPlusXMsgRspnTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCPlusXMsgClientTableBody getTableCPlusXMsgClientTableBodyHandler() {
		if( tableCPlusXMsgClientTableBodyHandler == null ) {
			tableCPlusXMsgClientTableBodyHandler = new YCFBamSaxLoaderTableCPlusXMsgClientTableBody( this );
		}
		return( tableCPlusXMsgClientTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableHPlusObjMembers getTableHPlusObjMembersHandler() {
		if( tableHPlusObjMembersHandler == null ) {
			tableHPlusObjMembersHandler = new YCFBamSaxLoaderTableHPlusObjMembers( this );
		}
		return( tableHPlusObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusObjInterface getTableHPlusObjInterfaceHandler() {
		if( tableHPlusObjInterfaceHandler == null ) {
			tableHPlusObjInterfaceHandler = new YCFBamSaxLoaderTableHPlusObjInterface( this );
		}
		return( tableHPlusObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableHPlusObjInclude getTableHPlusObjIncludeHandler() {
		if( tableHPlusObjIncludeHandler == null ) {
			tableHPlusObjIncludeHandler = new YCFBamSaxLoaderTableHPlusObjInclude( this );
		}
		return( tableHPlusObjIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusObjImplemntation getTableHPlusObjImplemntationHandler() {
		if( tableHPlusObjImplemntationHandler == null ) {
			tableHPlusObjImplemntationHandler = new YCFBamSaxLoaderTableHPlusObjImplemntation( this );
		}
		return( tableHPlusObjImplemntationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusEditObjMembers getTableHPlusEditObjMembersHandler() {
		if( tableHPlusEditObjMembersHandler == null ) {
			tableHPlusEditObjMembersHandler = new YCFBamSaxLoaderTableHPlusEditObjMembers( this );
		}
		return( tableHPlusEditObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusEditObjInterface getTableHPlusEditObjInterfaceHandler() {
		if( tableHPlusEditObjInterfaceHandler == null ) {
			tableHPlusEditObjInterfaceHandler = new YCFBamSaxLoaderTableHPlusEditObjInterface( this );
		}
		return( tableHPlusEditObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableHPlusEditObjInclude getTableHPlusEditObjIncludeHandler() {
		if( tableHPlusEditObjIncludeHandler == null ) {
			tableHPlusEditObjIncludeHandler = new YCFBamSaxLoaderTableHPlusEditObjInclude( this );
		}
		return( tableHPlusEditObjIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusEditObjImplementation getTableHPlusEditObjImplementationHandler() {
		if( tableHPlusEditObjImplementationHandler == null ) {
			tableHPlusEditObjImplementationHandler = new YCFBamSaxLoaderTableHPlusEditObjImplementation( this );
		}
		return( tableHPlusEditObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableInclude getTableHPlusTableIncludeHandler() {
		if( tableHPlusTableIncludeHandler == null ) {
			tableHPlusTableIncludeHandler = new YCFBamSaxLoaderTableHPlusTableInclude( this );
		}
		return( tableHPlusTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableMembers getTableHPlusTableMembersHandler() {
		if( tableHPlusTableMembersHandler == null ) {
			tableHPlusTableMembersHandler = new YCFBamSaxLoaderTableHPlusTableMembers( this );
		}
		return( tableHPlusTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableInterface getTableHPlusTableInterfaceHandler() {
		if( tableHPlusTableInterfaceHandler == null ) {
			tableHPlusTableInterfaceHandler = new YCFBamSaxLoaderTableHPlusTableInterface( this );
		}
		return( tableHPlusTableInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableImplementation getTableHPlusTableImplementationHandler() {
		if( tableHPlusTableImplementationHandler == null ) {
			tableHPlusTableImplementationHandler = new YCFBamSaxLoaderTableHPlusTableImplementation( this );
		}
		return( tableHPlusTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableObjInclude getTableHPlusTableObjIncludeHandler() {
		if( tableHPlusTableObjIncludeHandler == null ) {
			tableHPlusTableObjIncludeHandler = new YCFBamSaxLoaderTableHPlusTableObjInclude( this );
		}
		return( tableHPlusTableObjIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableObjMembers getTableHPlusTableObjMembersHandler() {
		if( tableHPlusTableObjMembersHandler == null ) {
			tableHPlusTableObjMembersHandler = new YCFBamSaxLoaderTableHPlusTableObjMembers( this );
		}
		return( tableHPlusTableObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableObjInterface getTableHPlusTableObjInterfaceHandler() {
		if( tableHPlusTableObjInterfaceHandler == null ) {
			tableHPlusTableObjInterfaceHandler = new YCFBamSaxLoaderTableHPlusTableObjInterface( this );
		}
		return( tableHPlusTableObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableHPlusTableObjImplementation getTableHPlusTableObjImplementationHandler() {
		if( tableHPlusTableObjImplementationHandler == null ) {
			tableHPlusTableObjImplementationHandler = new YCFBamSaxLoaderTableHPlusTableObjImplementation( this );
		}
		return( tableHPlusTableObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusDb2LUWTableInclude getTableHPlusDb2LUWTableIncludeHandler() {
		if( tableHPlusDb2LUWTableIncludeHandler == null ) {
			tableHPlusDb2LUWTableIncludeHandler = new YCFBamSaxLoaderTableHPlusDb2LUWTableInclude( this );
		}
		return( tableHPlusDb2LUWTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusDb2LUWTableMembers getTableHPlusDb2LUWTableMembersHandler() {
		if( tableHPlusDb2LUWTableMembersHandler == null ) {
			tableHPlusDb2LUWTableMembersHandler = new YCFBamSaxLoaderTableHPlusDb2LUWTableMembers( this );
		}
		return( tableHPlusDb2LUWTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusDb2LUWTableImplementation getTableHPlusDb2LUWTableImplementationHandler() {
		if( tableHPlusDb2LUWTableImplementationHandler == null ) {
			tableHPlusDb2LUWTableImplementationHandler = new YCFBamSaxLoaderTableHPlusDb2LUWTableImplementation( this );
		}
		return( tableHPlusDb2LUWTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusMSSqlTableInclude getTableHPlusMSSqlTableIncludeHandler() {
		if( tableHPlusMSSqlTableIncludeHandler == null ) {
			tableHPlusMSSqlTableIncludeHandler = new YCFBamSaxLoaderTableHPlusMSSqlTableInclude( this );
		}
		return( tableHPlusMSSqlTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusMSSqlTableMembers getTableHPlusMSSqlTableMembersHandler() {
		if( tableHPlusMSSqlTableMembersHandler == null ) {
			tableHPlusMSSqlTableMembersHandler = new YCFBamSaxLoaderTableHPlusMSSqlTableMembers( this );
		}
		return( tableHPlusMSSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusMSSqlTableImplementation getTableHPlusMSSqlTableImplementationHandler() {
		if( tableHPlusMSSqlTableImplementationHandler == null ) {
			tableHPlusMSSqlTableImplementationHandler = new YCFBamSaxLoaderTableHPlusMSSqlTableImplementation( this );
		}
		return( tableHPlusMSSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusMySqlTableInclude getTableHPlusMySqlTableIncludeHandler() {
		if( tableHPlusMySqlTableIncludeHandler == null ) {
			tableHPlusMySqlTableIncludeHandler = new YCFBamSaxLoaderTableHPlusMySqlTableInclude( this );
		}
		return( tableHPlusMySqlTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusMySqlTableMembers getTableHPlusMySqlTableMembersHandler() {
		if( tableHPlusMySqlTableMembersHandler == null ) {
			tableHPlusMySqlTableMembersHandler = new YCFBamSaxLoaderTableHPlusMySqlTableMembers( this );
		}
		return( tableHPlusMySqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusMySqlTableImplementation getTableHPlusMySqlTableImplementationHandler() {
		if( tableHPlusMySqlTableImplementationHandler == null ) {
			tableHPlusMySqlTableImplementationHandler = new YCFBamSaxLoaderTableHPlusMySqlTableImplementation( this );
		}
		return( tableHPlusMySqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusOracleTableInclude getTableHPlusOracleTableIncludeHandler() {
		if( tableHPlusOracleTableIncludeHandler == null ) {
			tableHPlusOracleTableIncludeHandler = new YCFBamSaxLoaderTableHPlusOracleTableInclude( this );
		}
		return( tableHPlusOracleTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusOracleTableMembers getTableHPlusOracleTableMembersHandler() {
		if( tableHPlusOracleTableMembersHandler == null ) {
			tableHPlusOracleTableMembersHandler = new YCFBamSaxLoaderTableHPlusOracleTableMembers( this );
		}
		return( tableHPlusOracleTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusOracleTableImplementation getTableHPlusOracleTableImplementationHandler() {
		if( tableHPlusOracleTableImplementationHandler == null ) {
			tableHPlusOracleTableImplementationHandler = new YCFBamSaxLoaderTableHPlusOracleTableImplementation( this );
		}
		return( tableHPlusOracleTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusPgSqlTableInclude getTableHPlusPgSqlTableIncludeHandler() {
		if( tableHPlusPgSqlTableIncludeHandler == null ) {
			tableHPlusPgSqlTableIncludeHandler = new YCFBamSaxLoaderTableHPlusPgSqlTableInclude( this );
		}
		return( tableHPlusPgSqlTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusPgSqlTableMembers getTableHPlusPgSqlTableMembersHandler() {
		if( tableHPlusPgSqlTableMembersHandler == null ) {
			tableHPlusPgSqlTableMembersHandler = new YCFBamSaxLoaderTableHPlusPgSqlTableMembers( this );
		}
		return( tableHPlusPgSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusPgSqlTableImplementation getTableHPlusPgSqlTableImplementationHandler() {
		if( tableHPlusPgSqlTableImplementationHandler == null ) {
			tableHPlusPgSqlTableImplementationHandler = new YCFBamSaxLoaderTableHPlusPgSqlTableImplementation( this );
		}
		return( tableHPlusPgSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusRamTableInclude getTableHPlusRamTableIncludeHandler() {
		if( tableHPlusRamTableIncludeHandler == null ) {
			tableHPlusRamTableIncludeHandler = new YCFBamSaxLoaderTableHPlusRamTableInclude( this );
		}
		return( tableHPlusRamTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusRamTableMembers getTableHPlusRamTableMembersHandler() {
		if( tableHPlusRamTableMembersHandler == null ) {
			tableHPlusRamTableMembersHandler = new YCFBamSaxLoaderTableHPlusRamTableMembers( this );
		}
		return( tableHPlusRamTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusRamTableImplementation getTableHPlusRamTableImplementationHandler() {
		if( tableHPlusRamTableImplementationHandler == null ) {
			tableHPlusRamTableImplementationHandler = new YCFBamSaxLoaderTableHPlusRamTableImplementation( this );
		}
		return( tableHPlusRamTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableHPlusSaxLoaderInclude getTableHPlusSaxLoaderIncludeHandler() {
		if( tableHPlusSaxLoaderIncludeHandler == null ) {
			tableHPlusSaxLoaderIncludeHandler = new YCFBamSaxLoaderTableHPlusSaxLoaderInclude( this );
		}
		return( tableHPlusSaxLoaderIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusSaxLoaderStartElement getTableHPlusSaxLoaderStartElementHandler() {
		if( tableHPlusSaxLoaderStartElementHandler == null ) {
			tableHPlusSaxLoaderStartElementHandler = new YCFBamSaxLoaderTableHPlusSaxLoaderStartElement( this );
		}
		return( tableHPlusSaxLoaderStartElementHandler );
	}
	protected YCFBamSaxLoaderTableHPlusSaxLoaderEndElement getTableHPlusSaxLoaderEndElementHandler() {
		if( tableHPlusSaxLoaderEndElementHandler == null ) {
			tableHPlusSaxLoaderEndElementHandler = new YCFBamSaxLoaderTableHPlusSaxLoaderEndElement( this );
		}
		return( tableHPlusSaxLoaderEndElementHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgTableInclude getTableHPlusXMsgTableIncludeHandler() {
		if( tableHPlusXMsgTableIncludeHandler == null ) {
			tableHPlusXMsgTableIncludeHandler = new YCFBamSaxLoaderTableHPlusXMsgTableInclude( this );
		}
		return( tableHPlusXMsgTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgTableFormatters getTableHPlusXMsgTableFormattersHandler() {
		if( tableHPlusXMsgTableFormattersHandler == null ) {
			tableHPlusXMsgTableFormattersHandler = new YCFBamSaxLoaderTableHPlusXMsgTableFormatters( this );
		}
		return( tableHPlusXMsgTableFormattersHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgRqstTableInclude getTableHPlusXMsgRqstTableIncludeHandler() {
		if( tableHPlusXMsgRqstTableIncludeHandler == null ) {
			tableHPlusXMsgRqstTableIncludeHandler = new YCFBamSaxLoaderTableHPlusXMsgRqstTableInclude( this );
		}
		return( tableHPlusXMsgRqstTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgRspnTableInclude getTableHPlusXMsgRspnTableIncludeHandler() {
		if( tableHPlusXMsgRspnTableIncludeHandler == null ) {
			tableHPlusXMsgRspnTableIncludeHandler = new YCFBamSaxLoaderTableHPlusXMsgRspnTableInclude( this );
		}
		return( tableHPlusXMsgRspnTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgClientTableInclude getTableHPlusXMsgClientTableIncludeHandler() {
		if( tableHPlusXMsgClientTableIncludeHandler == null ) {
			tableHPlusXMsgClientTableIncludeHandler = new YCFBamSaxLoaderTableHPlusXMsgClientTableInclude( this );
		}
		return( tableHPlusXMsgClientTableIncludeHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgRqstTableBody getTableHPlusXMsgRqstTableBodyHandler() {
		if( tableHPlusXMsgRqstTableBodyHandler == null ) {
			tableHPlusXMsgRqstTableBodyHandler = new YCFBamSaxLoaderTableHPlusXMsgRqstTableBody( this );
		}
		return( tableHPlusXMsgRqstTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgRspnTableBody getTableHPlusXMsgRspnTableBodyHandler() {
		if( tableHPlusXMsgRspnTableBodyHandler == null ) {
			tableHPlusXMsgRspnTableBodyHandler = new YCFBamSaxLoaderTableHPlusXMsgRspnTableBody( this );
		}
		return( tableHPlusXMsgRspnTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableHPlusXMsgClientTableBody getTableHPlusXMsgClientTableBodyHandler() {
		if( tableHPlusXMsgClientTableBodyHandler == null ) {
			tableHPlusXMsgClientTableBodyHandler = new YCFBamSaxLoaderTableHPlusXMsgClientTableBody( this );
		}
		return( tableHPlusXMsgClientTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCSharpObjMembers getTableCSharpObjMembersHandler() {
		if( tableCSharpObjMembersHandler == null ) {
			tableCSharpObjMembersHandler = new YCFBamSaxLoaderTableCSharpObjMembers( this );
		}
		return( tableCSharpObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpObjInterface getTableCSharpObjInterfaceHandler() {
		if( tableCSharpObjInterfaceHandler == null ) {
			tableCSharpObjInterfaceHandler = new YCFBamSaxLoaderTableCSharpObjInterface( this );
		}
		return( tableCSharpObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCSharpObjUsing getTableCSharpObjUsingHandler() {
		if( tableCSharpObjUsingHandler == null ) {
			tableCSharpObjUsingHandler = new YCFBamSaxLoaderTableCSharpObjUsing( this );
		}
		return( tableCSharpObjUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpObjImplementation getTableCSharpObjImplementationHandler() {
		if( tableCSharpObjImplementationHandler == null ) {
			tableCSharpObjImplementationHandler = new YCFBamSaxLoaderTableCSharpObjImplementation( this );
		}
		return( tableCSharpObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpEditObjMembers getTableCSharpEditObjMembersHandler() {
		if( tableCSharpEditObjMembersHandler == null ) {
			tableCSharpEditObjMembersHandler = new YCFBamSaxLoaderTableCSharpEditObjMembers( this );
		}
		return( tableCSharpEditObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpEditObjInterface getTableCSharpEditObjInterfaceHandler() {
		if( tableCSharpEditObjInterfaceHandler == null ) {
			tableCSharpEditObjInterfaceHandler = new YCFBamSaxLoaderTableCSharpEditObjInterface( this );
		}
		return( tableCSharpEditObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCSharpEditObjUsing getTableCSharpEditObjUsingHandler() {
		if( tableCSharpEditObjUsingHandler == null ) {
			tableCSharpEditObjUsingHandler = new YCFBamSaxLoaderTableCSharpEditObjUsing( this );
		}
		return( tableCSharpEditObjUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpEditObjImplementation getTableCSharpEditObjImplementationHandler() {
		if( tableCSharpEditObjImplementationHandler == null ) {
			tableCSharpEditObjImplementationHandler = new YCFBamSaxLoaderTableCSharpEditObjImplementation( this );
		}
		return( tableCSharpEditObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableUsing getTableCSharpTableUsingHandler() {
		if( tableCSharpTableUsingHandler == null ) {
			tableCSharpTableUsingHandler = new YCFBamSaxLoaderTableCSharpTableUsing( this );
		}
		return( tableCSharpTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableMembers getTableCSharpTableMembersHandler() {
		if( tableCSharpTableMembersHandler == null ) {
			tableCSharpTableMembersHandler = new YCFBamSaxLoaderTableCSharpTableMembers( this );
		}
		return( tableCSharpTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableInterface getTableCSharpTableInterfaceHandler() {
		if( tableCSharpTableInterfaceHandler == null ) {
			tableCSharpTableInterfaceHandler = new YCFBamSaxLoaderTableCSharpTableInterface( this );
		}
		return( tableCSharpTableInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableImplementation getTableCSharpTableImplementationHandler() {
		if( tableCSharpTableImplementationHandler == null ) {
			tableCSharpTableImplementationHandler = new YCFBamSaxLoaderTableCSharpTableImplementation( this );
		}
		return( tableCSharpTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableObjUsing getTableCSharpTableObjUsingHandler() {
		if( tableCSharpTableObjUsingHandler == null ) {
			tableCSharpTableObjUsingHandler = new YCFBamSaxLoaderTableCSharpTableObjUsing( this );
		}
		return( tableCSharpTableObjUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableObjMembers getTableCSharpTableObjMembersHandler() {
		if( tableCSharpTableObjMembersHandler == null ) {
			tableCSharpTableObjMembersHandler = new YCFBamSaxLoaderTableCSharpTableObjMembers( this );
		}
		return( tableCSharpTableObjMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableObjInterface getTableCSharpTableObjInterfaceHandler() {
		if( tableCSharpTableObjInterfaceHandler == null ) {
			tableCSharpTableObjInterfaceHandler = new YCFBamSaxLoaderTableCSharpTableObjInterface( this );
		}
		return( tableCSharpTableObjInterfaceHandler );
	}
	protected YCFBamSaxLoaderTableCSharpTableObjImplementation getTableCSharpTableObjImplementationHandler() {
		if( tableCSharpTableObjImplementationHandler == null ) {
			tableCSharpTableObjImplementationHandler = new YCFBamSaxLoaderTableCSharpTableObjImplementation( this );
		}
		return( tableCSharpTableObjImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpDb2LUWTableUsing getTableCSharpDb2LUWTableUsingHandler() {
		if( tableCSharpDb2LUWTableUsingHandler == null ) {
			tableCSharpDb2LUWTableUsingHandler = new YCFBamSaxLoaderTableCSharpDb2LUWTableUsing( this );
		}
		return( tableCSharpDb2LUWTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpDb2LUWTableMembers getTableCSharpDb2LUWTableMembersHandler() {
		if( tableCSharpDb2LUWTableMembersHandler == null ) {
			tableCSharpDb2LUWTableMembersHandler = new YCFBamSaxLoaderTableCSharpDb2LUWTableMembers( this );
		}
		return( tableCSharpDb2LUWTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpDb2LUWTableImplementation getTableCSharpDb2LUWTableImplementationHandler() {
		if( tableCSharpDb2LUWTableImplementationHandler == null ) {
			tableCSharpDb2LUWTableImplementationHandler = new YCFBamSaxLoaderTableCSharpDb2LUWTableImplementation( this );
		}
		return( tableCSharpDb2LUWTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpMSSqlTableUsing getTableCSharpMSSqlTableUsingHandler() {
		if( tableCSharpMSSqlTableUsingHandler == null ) {
			tableCSharpMSSqlTableUsingHandler = new YCFBamSaxLoaderTableCSharpMSSqlTableUsing( this );
		}
		return( tableCSharpMSSqlTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpMSSqlTableMembers getTableCSharpMSSqlTableMembersHandler() {
		if( tableCSharpMSSqlTableMembersHandler == null ) {
			tableCSharpMSSqlTableMembersHandler = new YCFBamSaxLoaderTableCSharpMSSqlTableMembers( this );
		}
		return( tableCSharpMSSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpMSSqlTableImplementation getTableCSharpMSSqlTableImplementationHandler() {
		if( tableCSharpMSSqlTableImplementationHandler == null ) {
			tableCSharpMSSqlTableImplementationHandler = new YCFBamSaxLoaderTableCSharpMSSqlTableImplementation( this );
		}
		return( tableCSharpMSSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpMySqlTableUsing getTableCSharpMySqlTableUsingHandler() {
		if( tableCSharpMySqlTableUsingHandler == null ) {
			tableCSharpMySqlTableUsingHandler = new YCFBamSaxLoaderTableCSharpMySqlTableUsing( this );
		}
		return( tableCSharpMySqlTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpMySqlTableMembers getTableCSharpMySqlTableMembersHandler() {
		if( tableCSharpMySqlTableMembersHandler == null ) {
			tableCSharpMySqlTableMembersHandler = new YCFBamSaxLoaderTableCSharpMySqlTableMembers( this );
		}
		return( tableCSharpMySqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpMySqlTableImplementation getTableCSharpMySqlTableImplementationHandler() {
		if( tableCSharpMySqlTableImplementationHandler == null ) {
			tableCSharpMySqlTableImplementationHandler = new YCFBamSaxLoaderTableCSharpMySqlTableImplementation( this );
		}
		return( tableCSharpMySqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpOracleTableUsing getTableCSharpOracleTableUsingHandler() {
		if( tableCSharpOracleTableUsingHandler == null ) {
			tableCSharpOracleTableUsingHandler = new YCFBamSaxLoaderTableCSharpOracleTableUsing( this );
		}
		return( tableCSharpOracleTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpOracleTableMembers getTableCSharpOracleTableMembersHandler() {
		if( tableCSharpOracleTableMembersHandler == null ) {
			tableCSharpOracleTableMembersHandler = new YCFBamSaxLoaderTableCSharpOracleTableMembers( this );
		}
		return( tableCSharpOracleTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpOracleTableImplementation getTableCSharpOracleTableImplementationHandler() {
		if( tableCSharpOracleTableImplementationHandler == null ) {
			tableCSharpOracleTableImplementationHandler = new YCFBamSaxLoaderTableCSharpOracleTableImplementation( this );
		}
		return( tableCSharpOracleTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpPgSqlTableUsing getTableCSharpPgSqlTableUsingHandler() {
		if( tableCSharpPgSqlTableUsingHandler == null ) {
			tableCSharpPgSqlTableUsingHandler = new YCFBamSaxLoaderTableCSharpPgSqlTableUsing( this );
		}
		return( tableCSharpPgSqlTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpPgSqlTableMembers getTableCSharpPgSqlTableMembersHandler() {
		if( tableCSharpPgSqlTableMembersHandler == null ) {
			tableCSharpPgSqlTableMembersHandler = new YCFBamSaxLoaderTableCSharpPgSqlTableMembers( this );
		}
		return( tableCSharpPgSqlTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpPgSqlTableImplementation getTableCSharpPgSqlTableImplementationHandler() {
		if( tableCSharpPgSqlTableImplementationHandler == null ) {
			tableCSharpPgSqlTableImplementationHandler = new YCFBamSaxLoaderTableCSharpPgSqlTableImplementation( this );
		}
		return( tableCSharpPgSqlTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpRamTableUsing getTableCSharpRamTableUsingHandler() {
		if( tableCSharpRamTableUsingHandler == null ) {
			tableCSharpRamTableUsingHandler = new YCFBamSaxLoaderTableCSharpRamTableUsing( this );
		}
		return( tableCSharpRamTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpRamTableMembers getTableCSharpRamTableMembersHandler() {
		if( tableCSharpRamTableMembersHandler == null ) {
			tableCSharpRamTableMembersHandler = new YCFBamSaxLoaderTableCSharpRamTableMembers( this );
		}
		return( tableCSharpRamTableMembersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpRamTableImplementation getTableCSharpRamTableImplementationHandler() {
		if( tableCSharpRamTableImplementationHandler == null ) {
			tableCSharpRamTableImplementationHandler = new YCFBamSaxLoaderTableCSharpRamTableImplementation( this );
		}
		return( tableCSharpRamTableImplementationHandler );
	}
	protected YCFBamSaxLoaderTableCSharpSaxLoaderUsing getTableCSharpSaxLoaderUsingHandler() {
		if( tableCSharpSaxLoaderUsingHandler == null ) {
			tableCSharpSaxLoaderUsingHandler = new YCFBamSaxLoaderTableCSharpSaxLoaderUsing( this );
		}
		return( tableCSharpSaxLoaderUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpSaxLoaderStartElement getTableCSharpSaxLoaderStartElementHandler() {
		if( tableCSharpSaxLoaderStartElementHandler == null ) {
			tableCSharpSaxLoaderStartElementHandler = new YCFBamSaxLoaderTableCSharpSaxLoaderStartElement( this );
		}
		return( tableCSharpSaxLoaderStartElementHandler );
	}
	protected YCFBamSaxLoaderTableCSharpSaxLoaderEndElement getTableCSharpSaxLoaderEndElementHandler() {
		if( tableCSharpSaxLoaderEndElementHandler == null ) {
			tableCSharpSaxLoaderEndElementHandler = new YCFBamSaxLoaderTableCSharpSaxLoaderEndElement( this );
		}
		return( tableCSharpSaxLoaderEndElementHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgTableUsing getTableCSharpXMsgTableUsingHandler() {
		if( tableCSharpXMsgTableUsingHandler == null ) {
			tableCSharpXMsgTableUsingHandler = new YCFBamSaxLoaderTableCSharpXMsgTableUsing( this );
		}
		return( tableCSharpXMsgTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgTableFormatters getTableCSharpXMsgTableFormattersHandler() {
		if( tableCSharpXMsgTableFormattersHandler == null ) {
			tableCSharpXMsgTableFormattersHandler = new YCFBamSaxLoaderTableCSharpXMsgTableFormatters( this );
		}
		return( tableCSharpXMsgTableFormattersHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgRqstTableUsing getTableCSharpXMsgRqstTableUsingHandler() {
		if( tableCSharpXMsgRqstTableUsingHandler == null ) {
			tableCSharpXMsgRqstTableUsingHandler = new YCFBamSaxLoaderTableCSharpXMsgRqstTableUsing( this );
		}
		return( tableCSharpXMsgRqstTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgRspnTableUsing getTableCSharpXMsgRspnTableUsingHandler() {
		if( tableCSharpXMsgRspnTableUsingHandler == null ) {
			tableCSharpXMsgRspnTableUsingHandler = new YCFBamSaxLoaderTableCSharpXMsgRspnTableUsing( this );
		}
		return( tableCSharpXMsgRspnTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgClientTableUsing getTableCSharpXMsgClientTableUsingHandler() {
		if( tableCSharpXMsgClientTableUsingHandler == null ) {
			tableCSharpXMsgClientTableUsingHandler = new YCFBamSaxLoaderTableCSharpXMsgClientTableUsing( this );
		}
		return( tableCSharpXMsgClientTableUsingHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgRqstTableBody getTableCSharpXMsgRqstTableBodyHandler() {
		if( tableCSharpXMsgRqstTableBodyHandler == null ) {
			tableCSharpXMsgRqstTableBodyHandler = new YCFBamSaxLoaderTableCSharpXMsgRqstTableBody( this );
		}
		return( tableCSharpXMsgRqstTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgRspnTableBody getTableCSharpXMsgRspnTableBodyHandler() {
		if( tableCSharpXMsgRspnTableBodyHandler == null ) {
			tableCSharpXMsgRspnTableBodyHandler = new YCFBamSaxLoaderTableCSharpXMsgRspnTableBody( this );
		}
		return( tableCSharpXMsgRspnTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCSharpXMsgClientTableBody getTableCSharpXMsgClientTableBodyHandler() {
		if( tableCSharpXMsgClientTableBodyHandler == null ) {
			tableCSharpXMsgClientTableBodyHandler = new YCFBamSaxLoaderTableCSharpXMsgClientTableBody( this );
		}
		return( tableCSharpXMsgClientTableBodyHandler );
	}
	protected YCFBamSaxLoaderTableCol getTableColHandler() {
		if( tableColHandler == null ) {
			tableColHandler = new YCFBamSaxLoaderTableCol( this );
		}
		return( tableColHandler );
	}
	protected YCFBamSaxLoaderTableTweak getTableTweakHandler() {
		if( tableTweakHandler == null ) {
			tableTweakHandler = new YCFBamSaxLoaderTableTweak( this );
		}
		return( tableTweakHandler );
	}
	protected YCFBamSaxLoaderTenant getTenantHandler() {
		if( tenantHandler == null ) {
			tenantHandler = new YCFBamSaxLoaderTenant( this );
			tenantHandler.addElementHandler( "TSecGroup", getTSecGroupHandler() );
			tenantHandler.addElementHandler( "Tld", getTldHandler() );
		}
		return( tenantHandler );
	}
	protected YCFBamSaxLoaderTextCol getTextColHandler() {
		if( textColHandler == null ) {
			textColHandler = new YCFBamSaxLoaderTextCol( this );
		}
		return( textColHandler );
	}
	protected YCFBamSaxLoaderTextDef getTextDefHandler() {
		if( textDefHandler == null ) {
			textDefHandler = new YCFBamSaxLoaderTextDef( this );
		}
		return( textDefHandler );
	}
	protected YCFBamSaxLoaderTextType getTextTypeHandler() {
		if( textTypeHandler == null ) {
			textTypeHandler = new YCFBamSaxLoaderTextType( this );
		}
		return( textTypeHandler );
	}
	protected YCFBamSaxLoaderTimeCol getTimeColHandler() {
		if( timeColHandler == null ) {
			timeColHandler = new YCFBamSaxLoaderTimeCol( this );
		}
		return( timeColHandler );
	}
	protected YCFBamSaxLoaderTimeDef getTimeDefHandler() {
		if( timeDefHandler == null ) {
			timeDefHandler = new YCFBamSaxLoaderTimeDef( this );
		}
		return( timeDefHandler );
	}
	protected YCFBamSaxLoaderTimeType getTimeTypeHandler() {
		if( timeTypeHandler == null ) {
			timeTypeHandler = new YCFBamSaxLoaderTimeType( this );
		}
		return( timeTypeHandler );
	}
	protected YCFBamSaxLoaderTimestampCol getTimestampColHandler() {
		if( timestampColHandler == null ) {
			timestampColHandler = new YCFBamSaxLoaderTimestampCol( this );
		}
		return( timestampColHandler );
	}
	protected YCFBamSaxLoaderTimestampDef getTimestampDefHandler() {
		if( timestampDefHandler == null ) {
			timestampDefHandler = new YCFBamSaxLoaderTimestampDef( this );
		}
		return( timestampDefHandler );
	}
	protected YCFBamSaxLoaderTimestampType getTimestampTypeHandler() {
		if( timestampTypeHandler == null ) {
			timestampTypeHandler = new YCFBamSaxLoaderTimestampType( this );
		}
		return( timestampTypeHandler );
	}
	protected YCFBamSaxLoaderTld getTldHandler() {
		if( tldHandler == null ) {
			tldHandler = new YCFBamSaxLoaderTld( this );
			tldHandler.addElementHandler( "TopDomain", getTopDomainHandler() );
		}
		return( tldHandler );
	}
	protected YCFBamSaxLoaderTokenCol getTokenColHandler() {
		if( tokenColHandler == null ) {
			tokenColHandler = new YCFBamSaxLoaderTokenCol( this );
		}
		return( tokenColHandler );
	}
	protected YCFBamSaxLoaderTokenDef getTokenDefHandler() {
		if( tokenDefHandler == null ) {
			tokenDefHandler = new YCFBamSaxLoaderTokenDef( this );
		}
		return( tokenDefHandler );
	}
	protected YCFBamSaxLoaderTokenType getTokenTypeHandler() {
		if( tokenTypeHandler == null ) {
			tokenTypeHandler = new YCFBamSaxLoaderTokenType( this );
		}
		return( tokenTypeHandler );
	}
	protected YCFBamSaxLoaderTopDomain getTopDomainHandler() {
		if( topDomainHandler == null ) {
			topDomainHandler = new YCFBamSaxLoaderTopDomain( this );
			topDomainHandler.addElementHandler( "License", getLicenseHandler() );
			topDomainHandler.addElementHandler( "TopProject", getTopProjectHandler() );
		}
		return( topDomainHandler );
	}
	protected YCFBamSaxLoaderTopProject getTopProjectHandler() {
		if( topProjectHandler == null ) {
			topProjectHandler = new YCFBamSaxLoaderTopProject( this );
			topProjectHandler.addElementHandler( "SubProject", getSubProjectHandler() );
		}
		return( topProjectHandler );
	}
	protected YCFBamSaxLoaderTweak getTweakHandler() {
		if( tweakHandler == null ) {
			tweakHandler = new YCFBamSaxLoaderTweak( this );
		}
		return( tweakHandler );
	}
	protected YCFBamSaxLoaderUInt16Col getUInt16ColHandler() {
		if( uInt16ColHandler == null ) {
			uInt16ColHandler = new YCFBamSaxLoaderUInt16Col( this );
		}
		return( uInt16ColHandler );
	}
	protected YCFBamSaxLoaderUInt16Def getUInt16DefHandler() {
		if( uInt16DefHandler == null ) {
			uInt16DefHandler = new YCFBamSaxLoaderUInt16Def( this );
		}
		return( uInt16DefHandler );
	}
	protected YCFBamSaxLoaderUInt16Type getUInt16TypeHandler() {
		if( uInt16TypeHandler == null ) {
			uInt16TypeHandler = new YCFBamSaxLoaderUInt16Type( this );
		}
		return( uInt16TypeHandler );
	}
	protected YCFBamSaxLoaderUInt32Col getUInt32ColHandler() {
		if( uInt32ColHandler == null ) {
			uInt32ColHandler = new YCFBamSaxLoaderUInt32Col( this );
		}
		return( uInt32ColHandler );
	}
	protected YCFBamSaxLoaderUInt32Def getUInt32DefHandler() {
		if( uInt32DefHandler == null ) {
			uInt32DefHandler = new YCFBamSaxLoaderUInt32Def( this );
		}
		return( uInt32DefHandler );
	}
	protected YCFBamSaxLoaderUInt32Type getUInt32TypeHandler() {
		if( uInt32TypeHandler == null ) {
			uInt32TypeHandler = new YCFBamSaxLoaderUInt32Type( this );
		}
		return( uInt32TypeHandler );
	}
	protected YCFBamSaxLoaderUInt64Col getUInt64ColHandler() {
		if( uInt64ColHandler == null ) {
			uInt64ColHandler = new YCFBamSaxLoaderUInt64Col( this );
		}
		return( uInt64ColHandler );
	}
	protected YCFBamSaxLoaderUInt64Def getUInt64DefHandler() {
		if( uInt64DefHandler == null ) {
			uInt64DefHandler = new YCFBamSaxLoaderUInt64Def( this );
		}
		return( uInt64DefHandler );
	}
	protected YCFBamSaxLoaderUInt64Type getUInt64TypeHandler() {
		if( uInt64TypeHandler == null ) {
			uInt64TypeHandler = new YCFBamSaxLoaderUInt64Type( this );
		}
		return( uInt64TypeHandler );
	}
	protected YCFBamSaxLoaderURLProtocol getURLProtocolHandler() {
		if( uRLProtocolHandler == null ) {
			uRLProtocolHandler = new YCFBamSaxLoaderURLProtocol( this );
		}
		return( uRLProtocolHandler );
	}
	protected YCFBamSaxLoaderUuid6Col getUuid6ColHandler() {
		if( uuid6ColHandler == null ) {
			uuid6ColHandler = new YCFBamSaxLoaderUuid6Col( this );
		}
		return( uuid6ColHandler );
	}
	protected YCFBamSaxLoaderUuid6Def getUuid6DefHandler() {
		if( uuid6DefHandler == null ) {
			uuid6DefHandler = new YCFBamSaxLoaderUuid6Def( this );
		}
		return( uuid6DefHandler );
	}
	protected YCFBamSaxLoaderUuid6Gen getUuid6GenHandler() {
		if( uuid6GenHandler == null ) {
			uuid6GenHandler = new YCFBamSaxLoaderUuid6Gen( this );
		}
		return( uuid6GenHandler );
	}
	protected YCFBamSaxLoaderUuid6Type getUuid6TypeHandler() {
		if( uuid6TypeHandler == null ) {
			uuid6TypeHandler = new YCFBamSaxLoaderUuid6Type( this );
		}
		return( uuid6TypeHandler );
	}
	protected YCFBamSaxLoaderUuidCol getUuidColHandler() {
		if( uuidColHandler == null ) {
			uuidColHandler = new YCFBamSaxLoaderUuidCol( this );
		}
		return( uuidColHandler );
	}
	protected YCFBamSaxLoaderUuidDef getUuidDefHandler() {
		if( uuidDefHandler == null ) {
			uuidDefHandler = new YCFBamSaxLoaderUuidDef( this );
		}
		return( uuidDefHandler );
	}
	protected YCFBamSaxLoaderUuidGen getUuidGenHandler() {
		if( uuidGenHandler == null ) {
			uuidGenHandler = new YCFBamSaxLoaderUuidGen( this );
		}
		return( uuidGenHandler );
	}
	protected YCFBamSaxLoaderUuidType getUuidTypeHandler() {
		if( uuidTypeHandler == null ) {
			uuidTypeHandler = new YCFBamSaxLoaderUuidType( this );
		}
		return( uuidTypeHandler );
	}
	protected YCFBamSaxLoaderValue getValueHandler() {
		if( valueHandler == null ) {
			valueHandler = new YCFBamSaxLoaderValue( this );
		}
		return( valueHandler );
	}
	// Root Element Handler Resolver Factory

	protected YCFBamSaxRootHandler getSaxRootHandler() {
		if( saxRootHandler == null ) {
			saxRootHandler = new YCFBamSaxRootHandler( this );
			saxRootHandler.addElementHandler( "YCFBam", getSaxDocHandler() );
			saxRootHandler.addElementHandler( "YCFSec", getSaxDocHandler() );
			saxRootHandler.addElementHandler( "YCFInt", getSaxDocHandler() );
		}
		return( saxRootHandler );
	}

	// Root Element Handler

	/*
	 *	YCFBamSaxRootHandler XML SAX Root Element Handler implementation
	 */
	public class YCFBamSaxRootHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFBamSaxRootHandler( YCFBamSaxLoader saxLoader ) {
			super( saxLoader );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	// Document Element Handler Resolver Factory

	protected YCFBamSaxDocHandler getSaxDocHandler() {
		if( saxDocHandler == null ) {
			saxDocHandler = new YCFBamSaxDocHandler( this );
			saxDocHandler.addElementHandler( "Cluster", getClusterHandler() );
			saxDocHandler.addElementHandler( "ISOCcy", getISOCcyHandler() );
			saxDocHandler.addElementHandler( "ISOCtry", getISOCtryHandler() );
			saxDocHandler.addElementHandler( "ISOLang", getISOLangHandler() );
			saxDocHandler.addElementHandler( "ISOTZone", getISOTZoneHandler() );
			saxDocHandler.addElementHandler( "MimeType", getMimeTypeHandler() );
			saxDocHandler.addElementHandler( "SecUser", getSecUserHandler() );
			saxDocHandler.addElementHandler( "ServiceType", getServiceTypeHandler() );
			saxDocHandler.addElementHandler( "URLProtocol", getURLProtocolHandler() );
		}
		return( saxDocHandler );
	}

	// Document Element Handler

	/*
	 *	YCFBamSaxDocHandler XML SAX Doc Element Handler implementation
	 */
	public class YCFBamSaxDocHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFBamSaxDocHandler( YCFBamSaxLoader saxLoader ) {
			super( saxLoader );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	// Loader behaviour configuration accessors

	public LoaderBehaviourEnum getAtomLoaderBehaviour() {
		return( atomLoaderBehaviour );
	}

	public void setAtomLoaderBehaviour( LoaderBehaviourEnum value ) {
		atomLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getBlobColLoaderBehaviour() {
		return( blobColLoaderBehaviour );
	}

	public void setBlobColLoaderBehaviour( LoaderBehaviourEnum value ) {
		blobColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getBlobDefLoaderBehaviour() {
		return( blobDefLoaderBehaviour );
	}

	public void setBlobDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		blobDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getBlobTypeLoaderBehaviour() {
		return( blobTypeLoaderBehaviour );
	}

	public void setBlobTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		blobTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getBoolColLoaderBehaviour() {
		return( boolColLoaderBehaviour );
	}

	public void setBoolColLoaderBehaviour( LoaderBehaviourEnum value ) {
		boolColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getBoolDefLoaderBehaviour() {
		return( boolDefLoaderBehaviour );
	}

	public void setBoolDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		boolDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getBoolTypeLoaderBehaviour() {
		return( boolTypeLoaderBehaviour );
	}

	public void setBoolTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		boolTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getChainLoaderBehaviour() {
		return( chainLoaderBehaviour );
	}

	public void setChainLoaderBehaviour( LoaderBehaviourEnum value ) {
		chainLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getClearDepLoaderBehaviour() {
		return( clearDepLoaderBehaviour );
	}

	public void setClearDepLoaderBehaviour( LoaderBehaviourEnum value ) {
		clearDepLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getClearSubDep1LoaderBehaviour() {
		return( clearSubDep1LoaderBehaviour );
	}

	public void setClearSubDep1LoaderBehaviour( LoaderBehaviourEnum value ) {
		clearSubDep1LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getClearSubDep2LoaderBehaviour() {
		return( clearSubDep2LoaderBehaviour );
	}

	public void setClearSubDep2LoaderBehaviour( LoaderBehaviourEnum value ) {
		clearSubDep2LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getClearSubDep3LoaderBehaviour() {
		return( clearSubDep3LoaderBehaviour );
	}

	public void setClearSubDep3LoaderBehaviour( LoaderBehaviourEnum value ) {
		clearSubDep3LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getClearTopDepLoaderBehaviour() {
		return( clearTopDepLoaderBehaviour );
	}

	public void setClearTopDepLoaderBehaviour( LoaderBehaviourEnum value ) {
		clearTopDepLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getClusterLoaderBehaviour() {
		return( clusterLoaderBehaviour );
	}

	public void setClusterLoaderBehaviour( LoaderBehaviourEnum value ) {
		clusterLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDateColLoaderBehaviour() {
		return( dateColLoaderBehaviour );
	}

	public void setDateColLoaderBehaviour( LoaderBehaviourEnum value ) {
		dateColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDateDefLoaderBehaviour() {
		return( dateDefLoaderBehaviour );
	}

	public void setDateDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		dateDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDateTypeLoaderBehaviour() {
		return( dateTypeLoaderBehaviour );
	}

	public void setDateTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		dateTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash128ColLoaderBehaviour() {
		return( dbKeyHash128ColLoaderBehaviour );
	}

	public void setDbKeyHash128ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash128ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash128DefLoaderBehaviour() {
		return( dbKeyHash128DefLoaderBehaviour );
	}

	public void setDbKeyHash128DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash128DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash128GenLoaderBehaviour() {
		return( dbKeyHash128GenLoaderBehaviour );
	}

	public void setDbKeyHash128GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash128GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash128TypeLoaderBehaviour() {
		return( dbKeyHash128TypeLoaderBehaviour );
	}

	public void setDbKeyHash128TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash128TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash160ColLoaderBehaviour() {
		return( dbKeyHash160ColLoaderBehaviour );
	}

	public void setDbKeyHash160ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash160ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash160DefLoaderBehaviour() {
		return( dbKeyHash160DefLoaderBehaviour );
	}

	public void setDbKeyHash160DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash160DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash160GenLoaderBehaviour() {
		return( dbKeyHash160GenLoaderBehaviour );
	}

	public void setDbKeyHash160GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash160GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash160TypeLoaderBehaviour() {
		return( dbKeyHash160TypeLoaderBehaviour );
	}

	public void setDbKeyHash160TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash160TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash224ColLoaderBehaviour() {
		return( dbKeyHash224ColLoaderBehaviour );
	}

	public void setDbKeyHash224ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash224ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash224DefLoaderBehaviour() {
		return( dbKeyHash224DefLoaderBehaviour );
	}

	public void setDbKeyHash224DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash224DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash224GenLoaderBehaviour() {
		return( dbKeyHash224GenLoaderBehaviour );
	}

	public void setDbKeyHash224GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash224GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash224TypeLoaderBehaviour() {
		return( dbKeyHash224TypeLoaderBehaviour );
	}

	public void setDbKeyHash224TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash224TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash256ColLoaderBehaviour() {
		return( dbKeyHash256ColLoaderBehaviour );
	}

	public void setDbKeyHash256ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash256ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash256DefLoaderBehaviour() {
		return( dbKeyHash256DefLoaderBehaviour );
	}

	public void setDbKeyHash256DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash256DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash256GenLoaderBehaviour() {
		return( dbKeyHash256GenLoaderBehaviour );
	}

	public void setDbKeyHash256GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash256GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash256TypeLoaderBehaviour() {
		return( dbKeyHash256TypeLoaderBehaviour );
	}

	public void setDbKeyHash256TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash256TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash384ColLoaderBehaviour() {
		return( dbKeyHash384ColLoaderBehaviour );
	}

	public void setDbKeyHash384ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash384ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash384DefLoaderBehaviour() {
		return( dbKeyHash384DefLoaderBehaviour );
	}

	public void setDbKeyHash384DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash384DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash384GenLoaderBehaviour() {
		return( dbKeyHash384GenLoaderBehaviour );
	}

	public void setDbKeyHash384GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash384GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash384TypeLoaderBehaviour() {
		return( dbKeyHash384TypeLoaderBehaviour );
	}

	public void setDbKeyHash384TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash384TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash512ColLoaderBehaviour() {
		return( dbKeyHash512ColLoaderBehaviour );
	}

	public void setDbKeyHash512ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash512ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash512DefLoaderBehaviour() {
		return( dbKeyHash512DefLoaderBehaviour );
	}

	public void setDbKeyHash512DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash512DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash512GenLoaderBehaviour() {
		return( dbKeyHash512GenLoaderBehaviour );
	}

	public void setDbKeyHash512GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash512GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDbKeyHash512TypeLoaderBehaviour() {
		return( dbKeyHash512TypeLoaderBehaviour );
	}

	public void setDbKeyHash512TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		dbKeyHash512TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDelDepLoaderBehaviour() {
		return( delDepLoaderBehaviour );
	}

	public void setDelDepLoaderBehaviour( LoaderBehaviourEnum value ) {
		delDepLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDelSubDep1LoaderBehaviour() {
		return( delSubDep1LoaderBehaviour );
	}

	public void setDelSubDep1LoaderBehaviour( LoaderBehaviourEnum value ) {
		delSubDep1LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDelSubDep2LoaderBehaviour() {
		return( delSubDep2LoaderBehaviour );
	}

	public void setDelSubDep2LoaderBehaviour( LoaderBehaviourEnum value ) {
		delSubDep2LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDelSubDep3LoaderBehaviour() {
		return( delSubDep3LoaderBehaviour );
	}

	public void setDelSubDep3LoaderBehaviour( LoaderBehaviourEnum value ) {
		delSubDep3LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDelTopDepLoaderBehaviour() {
		return( delTopDepLoaderBehaviour );
	}

	public void setDelTopDepLoaderBehaviour( LoaderBehaviourEnum value ) {
		delTopDepLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDoubleColLoaderBehaviour() {
		return( doubleColLoaderBehaviour );
	}

	public void setDoubleColLoaderBehaviour( LoaderBehaviourEnum value ) {
		doubleColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDoubleDefLoaderBehaviour() {
		return( doubleDefLoaderBehaviour );
	}

	public void setDoubleDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		doubleDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getDoubleTypeLoaderBehaviour() {
		return( doubleTypeLoaderBehaviour );
	}

	public void setDoubleTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		doubleTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getEnumDefLoaderBehaviour() {
		return( enumDefLoaderBehaviour );
	}

	public void setEnumDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		enumDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getEnumTagLoaderBehaviour() {
		return( enumTagLoaderBehaviour );
	}

	public void setEnumTagLoaderBehaviour( LoaderBehaviourEnum value ) {
		enumTagLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getEnumTypeLoaderBehaviour() {
		return( enumTypeLoaderBehaviour );
	}

	public void setEnumTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		enumTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getFloatColLoaderBehaviour() {
		return( floatColLoaderBehaviour );
	}

	public void setFloatColLoaderBehaviour( LoaderBehaviourEnum value ) {
		floatColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getFloatDefLoaderBehaviour() {
		return( floatDefLoaderBehaviour );
	}

	public void setFloatDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		floatDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getFloatTypeLoaderBehaviour() {
		return( floatTypeLoaderBehaviour );
	}

	public void setFloatTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		floatTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getHostNodeLoaderBehaviour() {
		return( hostNodeLoaderBehaviour );
	}

	public void setHostNodeLoaderBehaviour( LoaderBehaviourEnum value ) {
		hostNodeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCcyLoaderBehaviour() {
		return( iSOCcyLoaderBehaviour );
	}

	public void setISOCcyLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCcyLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCtryLoaderBehaviour() {
		return( iSOCtryLoaderBehaviour );
	}

	public void setISOCtryLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCtryLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCtryCcyLoaderBehaviour() {
		return( iSOCtryCcyLoaderBehaviour );
	}

	public void setISOCtryCcyLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCtryCcyLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOCtryLangLoaderBehaviour() {
		return( iSOCtryLangLoaderBehaviour );
	}

	public void setISOCtryLangLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOCtryLangLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOLangLoaderBehaviour() {
		return( iSOLangLoaderBehaviour );
	}

	public void setISOLangLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOLangLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getISOTZoneLoaderBehaviour() {
		return( iSOTZoneLoaderBehaviour );
	}

	public void setISOTZoneLoaderBehaviour( LoaderBehaviourEnum value ) {
		iSOTZoneLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getId16GenLoaderBehaviour() {
		return( id16GenLoaderBehaviour );
	}

	public void setId16GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		id16GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getId32GenLoaderBehaviour() {
		return( id32GenLoaderBehaviour );
	}

	public void setId32GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		id32GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getId64GenLoaderBehaviour() {
		return( id64GenLoaderBehaviour );
	}

	public void setId64GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		id64GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getIndexLoaderBehaviour() {
		return( indexLoaderBehaviour );
	}

	public void setIndexLoaderBehaviour( LoaderBehaviourEnum value ) {
		indexLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getIndexColLoaderBehaviour() {
		return( indexColLoaderBehaviour );
	}

	public void setIndexColLoaderBehaviour( LoaderBehaviourEnum value ) {
		indexColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getIndexTweakLoaderBehaviour() {
		return( indexTweakLoaderBehaviour );
	}

	public void setIndexTweakLoaderBehaviour( LoaderBehaviourEnum value ) {
		indexTweakLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt16ColLoaderBehaviour() {
		return( int16ColLoaderBehaviour );
	}

	public void setInt16ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		int16ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt16DefLoaderBehaviour() {
		return( int16DefLoaderBehaviour );
	}

	public void setInt16DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		int16DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt16TypeLoaderBehaviour() {
		return( int16TypeLoaderBehaviour );
	}

	public void setInt16TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		int16TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt32ColLoaderBehaviour() {
		return( int32ColLoaderBehaviour );
	}

	public void setInt32ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		int32ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt32DefLoaderBehaviour() {
		return( int32DefLoaderBehaviour );
	}

	public void setInt32DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		int32DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt32TypeLoaderBehaviour() {
		return( int32TypeLoaderBehaviour );
	}

	public void setInt32TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		int32TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt64ColLoaderBehaviour() {
		return( int64ColLoaderBehaviour );
	}

	public void setInt64ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		int64ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt64DefLoaderBehaviour() {
		return( int64DefLoaderBehaviour );
	}

	public void setInt64DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		int64DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getInt64TypeLoaderBehaviour() {
		return( int64TypeLoaderBehaviour );
	}

	public void setInt64TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		int64TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getLicenseLoaderBehaviour() {
		return( licenseLoaderBehaviour );
	}

	public void setLicenseLoaderBehaviour( LoaderBehaviourEnum value ) {
		licenseLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getMajorVersionLoaderBehaviour() {
		return( majorVersionLoaderBehaviour );
	}

	public void setMajorVersionLoaderBehaviour( LoaderBehaviourEnum value ) {
		majorVersionLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getMimeTypeLoaderBehaviour() {
		return( mimeTypeLoaderBehaviour );
	}

	public void setMimeTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		mimeTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getMinorVersionLoaderBehaviour() {
		return( minorVersionLoaderBehaviour );
	}

	public void setMinorVersionLoaderBehaviour( LoaderBehaviourEnum value ) {
		minorVersionLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNmTokenColLoaderBehaviour() {
		return( nmTokenColLoaderBehaviour );
	}

	public void setNmTokenColLoaderBehaviour( LoaderBehaviourEnum value ) {
		nmTokenColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNmTokenDefLoaderBehaviour() {
		return( nmTokenDefLoaderBehaviour );
	}

	public void setNmTokenDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		nmTokenDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNmTokenTypeLoaderBehaviour() {
		return( nmTokenTypeLoaderBehaviour );
	}

	public void setNmTokenTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		nmTokenTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNmTokensColLoaderBehaviour() {
		return( nmTokensColLoaderBehaviour );
	}

	public void setNmTokensColLoaderBehaviour( LoaderBehaviourEnum value ) {
		nmTokensColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNmTokensDefLoaderBehaviour() {
		return( nmTokensDefLoaderBehaviour );
	}

	public void setNmTokensDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		nmTokensDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNmTokensTypeLoaderBehaviour() {
		return( nmTokensTypeLoaderBehaviour );
	}

	public void setNmTokensTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		nmTokensTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNumberColLoaderBehaviour() {
		return( numberColLoaderBehaviour );
	}

	public void setNumberColLoaderBehaviour( LoaderBehaviourEnum value ) {
		numberColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNumberDefLoaderBehaviour() {
		return( numberDefLoaderBehaviour );
	}

	public void setNumberDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		numberDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getNumberTypeLoaderBehaviour() {
		return( numberTypeLoaderBehaviour );
	}

	public void setNumberTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		numberTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getParamLoaderBehaviour() {
		return( paramLoaderBehaviour );
	}

	public void setParamLoaderBehaviour( LoaderBehaviourEnum value ) {
		paramLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getPopDepLoaderBehaviour() {
		return( popDepLoaderBehaviour );
	}

	public void setPopDepLoaderBehaviour( LoaderBehaviourEnum value ) {
		popDepLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getPopSubDep1LoaderBehaviour() {
		return( popSubDep1LoaderBehaviour );
	}

	public void setPopSubDep1LoaderBehaviour( LoaderBehaviourEnum value ) {
		popSubDep1LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getPopSubDep2LoaderBehaviour() {
		return( popSubDep2LoaderBehaviour );
	}

	public void setPopSubDep2LoaderBehaviour( LoaderBehaviourEnum value ) {
		popSubDep2LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getPopSubDep3LoaderBehaviour() {
		return( popSubDep3LoaderBehaviour );
	}

	public void setPopSubDep3LoaderBehaviour( LoaderBehaviourEnum value ) {
		popSubDep3LoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getPopTopDepLoaderBehaviour() {
		return( popTopDepLoaderBehaviour );
	}

	public void setPopTopDepLoaderBehaviour( LoaderBehaviourEnum value ) {
		popTopDepLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getRelationLoaderBehaviour() {
		return( relationLoaderBehaviour );
	}

	public void setRelationLoaderBehaviour( LoaderBehaviourEnum value ) {
		relationLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getRelationColLoaderBehaviour() {
		return( relationColLoaderBehaviour );
	}

	public void setRelationColLoaderBehaviour( LoaderBehaviourEnum value ) {
		relationColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getRoleDefLoaderBehaviour() {
		return( roleDefLoaderBehaviour );
	}

	public void setRoleDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		roleDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSchemaDefLoaderBehaviour() {
		return( schemaDefLoaderBehaviour );
	}

	public void setSchemaDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		schemaDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSchemaRefLoaderBehaviour() {
		return( schemaRefLoaderBehaviour );
	}

	public void setSchemaRefLoaderBehaviour( LoaderBehaviourEnum value ) {
		schemaRefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSchemaRoleLoaderBehaviour() {
		return( schemaRoleLoaderBehaviour );
	}

	public void setSchemaRoleLoaderBehaviour( LoaderBehaviourEnum value ) {
		schemaRoleLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSchemaTweakLoaderBehaviour() {
		return( schemaTweakLoaderBehaviour );
	}

	public void setSchemaTweakLoaderBehaviour( LoaderBehaviourEnum value ) {
		schemaTweakLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getScopeLoaderBehaviour() {
		return( scopeLoaderBehaviour );
	}

	public void setScopeLoaderBehaviour( LoaderBehaviourEnum value ) {
		scopeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecAppLoaderBehaviour() {
		return( secAppLoaderBehaviour );
	}

	public void setSecAppLoaderBehaviour( LoaderBehaviourEnum value ) {
		secAppLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecDeviceLoaderBehaviour() {
		return( secDeviceLoaderBehaviour );
	}

	public void setSecDeviceLoaderBehaviour( LoaderBehaviourEnum value ) {
		secDeviceLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecFormLoaderBehaviour() {
		return( secFormLoaderBehaviour );
	}

	public void setSecFormLoaderBehaviour( LoaderBehaviourEnum value ) {
		secFormLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGroupLoaderBehaviour() {
		return( secGroupLoaderBehaviour );
	}

	public void setSecGroupLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGroupLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGroupFormLoaderBehaviour() {
		return( secGroupFormLoaderBehaviour );
	}

	public void setSecGroupFormLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGroupFormLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGrpIncLoaderBehaviour() {
		return( secGrpIncLoaderBehaviour );
	}

	public void setSecGrpIncLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGrpIncLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecGrpMembLoaderBehaviour() {
		return( secGrpMembLoaderBehaviour );
	}

	public void setSecGrpMembLoaderBehaviour( LoaderBehaviourEnum value ) {
		secGrpMembLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecSessionLoaderBehaviour() {
		return( secSessionLoaderBehaviour );
	}

	public void setSecSessionLoaderBehaviour( LoaderBehaviourEnum value ) {
		secSessionLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSecUserLoaderBehaviour() {
		return( secUserLoaderBehaviour );
	}

	public void setSecUserLoaderBehaviour( LoaderBehaviourEnum value ) {
		secUserLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServerListFuncLoaderBehaviour() {
		return( serverListFuncLoaderBehaviour );
	}

	public void setServerListFuncLoaderBehaviour( LoaderBehaviourEnum value ) {
		serverListFuncLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServerMethodLoaderBehaviour() {
		return( serverMethodLoaderBehaviour );
	}

	public void setServerMethodLoaderBehaviour( LoaderBehaviourEnum value ) {
		serverMethodLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServerObjFuncLoaderBehaviour() {
		return( serverObjFuncLoaderBehaviour );
	}

	public void setServerObjFuncLoaderBehaviour( LoaderBehaviourEnum value ) {
		serverObjFuncLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServerProcLoaderBehaviour() {
		return( serverProcLoaderBehaviour );
	}

	public void setServerProcLoaderBehaviour( LoaderBehaviourEnum value ) {
		serverProcLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServiceLoaderBehaviour() {
		return( serviceLoaderBehaviour );
	}

	public void setServiceLoaderBehaviour( LoaderBehaviourEnum value ) {
		serviceLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getServiceTypeLoaderBehaviour() {
		return( serviceTypeLoaderBehaviour );
	}

	public void setServiceTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		serviceTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getStringColLoaderBehaviour() {
		return( stringColLoaderBehaviour );
	}

	public void setStringColLoaderBehaviour( LoaderBehaviourEnum value ) {
		stringColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getStringDefLoaderBehaviour() {
		return( stringDefLoaderBehaviour );
	}

	public void setStringDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		stringDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getStringTypeLoaderBehaviour() {
		return( stringTypeLoaderBehaviour );
	}

	public void setStringTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		stringTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSubProjectLoaderBehaviour() {
		return( subProjectLoaderBehaviour );
	}

	public void setSubProjectLoaderBehaviour( LoaderBehaviourEnum value ) {
		subProjectLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getSysClusterLoaderBehaviour() {
		return( sysClusterLoaderBehaviour );
	}

	public void setSysClusterLoaderBehaviour( LoaderBehaviourEnum value ) {
		sysClusterLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTSecGroupLoaderBehaviour() {
		return( tSecGroupLoaderBehaviour );
	}

	public void setTSecGroupLoaderBehaviour( LoaderBehaviourEnum value ) {
		tSecGroupLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTSecGrpIncLoaderBehaviour() {
		return( tSecGrpIncLoaderBehaviour );
	}

	public void setTSecGrpIncLoaderBehaviour( LoaderBehaviourEnum value ) {
		tSecGrpIncLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTSecGrpMembLoaderBehaviour() {
		return( tSecGrpMembLoaderBehaviour );
	}

	public void setTSecGrpMembLoaderBehaviour( LoaderBehaviourEnum value ) {
		tSecGrpMembLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZDateColLoaderBehaviour() {
		return( tZDateColLoaderBehaviour );
	}

	public void setTZDateColLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZDateColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZDateDefLoaderBehaviour() {
		return( tZDateDefLoaderBehaviour );
	}

	public void setTZDateDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZDateDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZDateTypeLoaderBehaviour() {
		return( tZDateTypeLoaderBehaviour );
	}

	public void setTZDateTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZDateTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZTimeColLoaderBehaviour() {
		return( tZTimeColLoaderBehaviour );
	}

	public void setTZTimeColLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZTimeColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZTimeDefLoaderBehaviour() {
		return( tZTimeDefLoaderBehaviour );
	}

	public void setTZTimeDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZTimeDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZTimeTypeLoaderBehaviour() {
		return( tZTimeTypeLoaderBehaviour );
	}

	public void setTZTimeTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZTimeTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZTimestampColLoaderBehaviour() {
		return( tZTimestampColLoaderBehaviour );
	}

	public void setTZTimestampColLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZTimestampColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZTimestampDefLoaderBehaviour() {
		return( tZTimestampDefLoaderBehaviour );
	}

	public void setTZTimestampDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZTimestampDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTZTimestampTypeLoaderBehaviour() {
		return( tZTimestampTypeLoaderBehaviour );
	}

	public void setTZTimestampTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		tZTimestampTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTableLoaderBehaviour() {
		return( tableLoaderBehaviour );
	}

	public void setTableLoaderBehaviour( LoaderBehaviourEnum value ) {
		tableLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTableColLoaderBehaviour() {
		return( tableColLoaderBehaviour );
	}

	public void setTableColLoaderBehaviour( LoaderBehaviourEnum value ) {
		tableColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTableTweakLoaderBehaviour() {
		return( tableTweakLoaderBehaviour );
	}

	public void setTableTweakLoaderBehaviour( LoaderBehaviourEnum value ) {
		tableTweakLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTenantLoaderBehaviour() {
		return( tenantLoaderBehaviour );
	}

	public void setTenantLoaderBehaviour( LoaderBehaviourEnum value ) {
		tenantLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTextColLoaderBehaviour() {
		return( textColLoaderBehaviour );
	}

	public void setTextColLoaderBehaviour( LoaderBehaviourEnum value ) {
		textColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTextDefLoaderBehaviour() {
		return( textDefLoaderBehaviour );
	}

	public void setTextDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		textDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTextTypeLoaderBehaviour() {
		return( textTypeLoaderBehaviour );
	}

	public void setTextTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		textTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTimeColLoaderBehaviour() {
		return( timeColLoaderBehaviour );
	}

	public void setTimeColLoaderBehaviour( LoaderBehaviourEnum value ) {
		timeColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTimeDefLoaderBehaviour() {
		return( timeDefLoaderBehaviour );
	}

	public void setTimeDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		timeDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTimeTypeLoaderBehaviour() {
		return( timeTypeLoaderBehaviour );
	}

	public void setTimeTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		timeTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTimestampColLoaderBehaviour() {
		return( timestampColLoaderBehaviour );
	}

	public void setTimestampColLoaderBehaviour( LoaderBehaviourEnum value ) {
		timestampColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTimestampDefLoaderBehaviour() {
		return( timestampDefLoaderBehaviour );
	}

	public void setTimestampDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		timestampDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTimestampTypeLoaderBehaviour() {
		return( timestampTypeLoaderBehaviour );
	}

	public void setTimestampTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		timestampTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTldLoaderBehaviour() {
		return( tldLoaderBehaviour );
	}

	public void setTldLoaderBehaviour( LoaderBehaviourEnum value ) {
		tldLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTokenColLoaderBehaviour() {
		return( tokenColLoaderBehaviour );
	}

	public void setTokenColLoaderBehaviour( LoaderBehaviourEnum value ) {
		tokenColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTokenDefLoaderBehaviour() {
		return( tokenDefLoaderBehaviour );
	}

	public void setTokenDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		tokenDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTokenTypeLoaderBehaviour() {
		return( tokenTypeLoaderBehaviour );
	}

	public void setTokenTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		tokenTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTopDomainLoaderBehaviour() {
		return( topDomainLoaderBehaviour );
	}

	public void setTopDomainLoaderBehaviour( LoaderBehaviourEnum value ) {
		topDomainLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTopProjectLoaderBehaviour() {
		return( topProjectLoaderBehaviour );
	}

	public void setTopProjectLoaderBehaviour( LoaderBehaviourEnum value ) {
		topProjectLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getTweakLoaderBehaviour() {
		return( tweakLoaderBehaviour );
	}

	public void setTweakLoaderBehaviour( LoaderBehaviourEnum value ) {
		tweakLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt16ColLoaderBehaviour() {
		return( uInt16ColLoaderBehaviour );
	}

	public void setUInt16ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt16ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt16DefLoaderBehaviour() {
		return( uInt16DefLoaderBehaviour );
	}

	public void setUInt16DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt16DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt16TypeLoaderBehaviour() {
		return( uInt16TypeLoaderBehaviour );
	}

	public void setUInt16TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt16TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt32ColLoaderBehaviour() {
		return( uInt32ColLoaderBehaviour );
	}

	public void setUInt32ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt32ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt32DefLoaderBehaviour() {
		return( uInt32DefLoaderBehaviour );
	}

	public void setUInt32DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt32DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt32TypeLoaderBehaviour() {
		return( uInt32TypeLoaderBehaviour );
	}

	public void setUInt32TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt32TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt64ColLoaderBehaviour() {
		return( uInt64ColLoaderBehaviour );
	}

	public void setUInt64ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt64ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt64DefLoaderBehaviour() {
		return( uInt64DefLoaderBehaviour );
	}

	public void setUInt64DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt64DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUInt64TypeLoaderBehaviour() {
		return( uInt64TypeLoaderBehaviour );
	}

	public void setUInt64TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		uInt64TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getURLProtocolLoaderBehaviour() {
		return( uRLProtocolLoaderBehaviour );
	}

	public void setURLProtocolLoaderBehaviour( LoaderBehaviourEnum value ) {
		uRLProtocolLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuid6ColLoaderBehaviour() {
		return( uuid6ColLoaderBehaviour );
	}

	public void setUuid6ColLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuid6ColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuid6DefLoaderBehaviour() {
		return( uuid6DefLoaderBehaviour );
	}

	public void setUuid6DefLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuid6DefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuid6GenLoaderBehaviour() {
		return( uuid6GenLoaderBehaviour );
	}

	public void setUuid6GenLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuid6GenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuid6TypeLoaderBehaviour() {
		return( uuid6TypeLoaderBehaviour );
	}

	public void setUuid6TypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuid6TypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuidColLoaderBehaviour() {
		return( uuidColLoaderBehaviour );
	}

	public void setUuidColLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuidColLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuidDefLoaderBehaviour() {
		return( uuidDefLoaderBehaviour );
	}

	public void setUuidDefLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuidDefLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuidGenLoaderBehaviour() {
		return( uuidGenLoaderBehaviour );
	}

	public void setUuidGenLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuidGenLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getUuidTypeLoaderBehaviour() {
		return( uuidTypeLoaderBehaviour );
	}

	public void setUuidTypeLoaderBehaviour( LoaderBehaviourEnum value ) {
		uuidTypeLoaderBehaviour = value;
	}

	public LoaderBehaviourEnum getValueLoaderBehaviour() {
		return( valueLoaderBehaviour );
	}

	public void setValueLoaderBehaviour( LoaderBehaviourEnum value ) {
		valueLoaderBehaviour = value;
	}

	// Parse a file

	public void parseFile( String url ) {
		parse( url );
	}
}
