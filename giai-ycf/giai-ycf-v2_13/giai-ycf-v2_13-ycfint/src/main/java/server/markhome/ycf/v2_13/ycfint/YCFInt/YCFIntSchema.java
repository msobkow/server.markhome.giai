// Description: Java 11 implementation of a YCFInt schema.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

package org.mssycf.mssycf.v2_13.ycfint.YCFInt;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.Tip.YCFTipClientHandler;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFIntSchema
	implements IYCFIntSchema,
		IYCFSecSchema
{
	protected YCFSecAuthorization authorization;
	protected IYCFSecTablePerms tablePerms;
	protected YCFSecConfigurationFile configuration;
	protected String jndiName;
	protected String schemaDbName = "YCFINet213";
	protected String lowerDbSchemaName = schemaDbName.toLowerCase();

	protected IYCFSecClusterTable tableCluster;
	protected IYCFSecHostNodeTable tableHostNode;
	protected IYCFSecISOCcyTable tableISOCcy;
	protected IYCFSecISOCtryTable tableISOCtry;
	protected IYCFSecISOCtryCcyTable tableISOCtryCcy;
	protected IYCFSecISOCtryLangTable tableISOCtryLang;
	protected IYCFSecISOLangTable tableISOLang;
	protected IYCFSecISOTZoneTable tableISOTZone;
	protected IYCFIntLicenseTable tableLicense;
	protected IYCFIntMajorVersionTable tableMajorVersion;
	protected IYCFIntMimeTypeTable tableMimeType;
	protected IYCFIntMinorVersionTable tableMinorVersion;
	protected IYCFSecSecAppTable tableSecApp;
	protected IYCFSecSecDeviceTable tableSecDevice;
	protected IYCFSecSecFormTable tableSecForm;
	protected IYCFSecSecGroupTable tableSecGroup;
	protected IYCFSecSecGroupFormTable tableSecGroupForm;
	protected IYCFSecSecGrpIncTable tableSecGrpInc;
	protected IYCFSecSecGrpMembTable tableSecGrpMemb;
	protected IYCFSecSecSessionTable tableSecSession;
	protected IYCFSecSecUserTable tableSecUser;
	protected IYCFSecServiceTable tableService;
	protected IYCFSecServiceTypeTable tableServiceType;
	protected IYCFIntSubProjectTable tableSubProject;
	protected IYCFSecSysClusterTable tableSysCluster;
	protected IYCFSecTSecGroupTable tableTSecGroup;
	protected IYCFSecTSecGrpIncTable tableTSecGrpInc;
	protected IYCFSecTSecGrpMembTable tableTSecGrpMemb;
	protected IYCFSecTenantTable tableTenant;
	protected IYCFIntTldTable tableTld;
	protected IYCFIntTopDomainTable tableTopDomain;
	protected IYCFIntTopProjectTable tableTopProject;
	protected IYCFIntURLProtocolTable tableURLProtocol;

	protected IYCFSecClusterFactory factoryCluster;
	protected IYCFSecHostNodeFactory factoryHostNode;
	protected IYCFSecISOCcyFactory factoryISOCcy;
	protected IYCFSecISOCtryFactory factoryISOCtry;
	protected IYCFSecISOCtryCcyFactory factoryISOCtryCcy;
	protected IYCFSecISOCtryLangFactory factoryISOCtryLang;
	protected IYCFSecISOLangFactory factoryISOLang;
	protected IYCFSecISOTZoneFactory factoryISOTZone;
	protected IYCFIntLicenseFactory factoryLicense;
	protected IYCFIntMajorVersionFactory factoryMajorVersion;
	protected IYCFIntMimeTypeFactory factoryMimeType;
	protected IYCFIntMinorVersionFactory factoryMinorVersion;
	protected IYCFSecSecAppFactory factorySecApp;
	protected IYCFSecSecDeviceFactory factorySecDevice;
	protected IYCFSecSecFormFactory factorySecForm;
	protected IYCFSecSecGroupFactory factorySecGroup;
	protected IYCFSecSecGroupFormFactory factorySecGroupForm;
	protected IYCFSecSecGrpIncFactory factorySecGrpInc;
	protected IYCFSecSecGrpMembFactory factorySecGrpMemb;
	protected IYCFSecSecSessionFactory factorySecSession;
	protected IYCFSecSecUserFactory factorySecUser;
	protected IYCFSecServiceFactory factoryService;
	protected IYCFSecServiceTypeFactory factoryServiceType;
	protected IYCFIntSubProjectFactory factorySubProject;
	protected IYCFSecSysClusterFactory factorySysCluster;
	protected IYCFSecTSecGroupFactory factoryTSecGroup;
	protected IYCFSecTSecGrpIncFactory factoryTSecGrpInc;
	protected IYCFSecTSecGrpMembFactory factoryTSecGrpMemb;
	protected IYCFSecTenantFactory factoryTenant;
	protected IYCFIntTldFactory factoryTld;
	protected IYCFIntTopDomainFactory factoryTopDomain;
	protected IYCFIntTopProjectFactory factoryTopProject;
	protected IYCFIntURLProtocolFactory factoryURLProtocol;


	public YCFIntSchema() {
		configuration = null;
		jndiName = null;

		tableCluster = null;
		tableHostNode = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableService = null;
		tableServiceType = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTenant = null;
		tableTld = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableURLProtocol = null;

		factoryCluster = new YCFIntClusterDefaultFactory();
		factoryHostNode = new YCFIntHostNodeDefaultFactory();
		factoryISOCcy = new YCFIntISOCcyDefaultFactory();
		factoryISOCtry = new YCFIntISOCtryDefaultFactory();
		factoryISOCtryCcy = new YCFIntISOCtryCcyDefaultFactory();
		factoryISOCtryLang = new YCFIntISOCtryLangDefaultFactory();
		factoryISOLang = new YCFIntISOLangDefaultFactory();
		factoryISOTZone = new YCFIntISOTZoneDefaultFactory();
		factoryLicense = new YCFIntLicenseDefaultFactory();
		factoryMajorVersion = new YCFIntMajorVersionDefaultFactory();
		factoryMimeType = new YCFIntMimeTypeDefaultFactory();
		factoryMinorVersion = new YCFIntMinorVersionDefaultFactory();
		factorySecApp = new YCFIntSecAppDefaultFactory();
		factorySecDevice = new YCFIntSecDeviceDefaultFactory();
		factorySecForm = new YCFIntSecFormDefaultFactory();
		factorySecGroup = new YCFIntSecGroupDefaultFactory();
		factorySecGroupForm = new YCFIntSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFIntSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFIntSecGrpMembDefaultFactory();
		factorySecSession = new YCFIntSecSessionDefaultFactory();
		factorySecUser = new YCFIntSecUserDefaultFactory();
		factoryService = new YCFIntServiceDefaultFactory();
		factoryServiceType = new YCFIntServiceTypeDefaultFactory();
		factorySubProject = new YCFIntSubProjectDefaultFactory();
		factorySysCluster = new YCFIntSysClusterDefaultFactory();
		factoryTSecGroup = new YCFIntTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFIntTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFIntTSecGrpMembDefaultFactory();
		factoryTenant = new YCFIntTenantDefaultFactory();
		factoryTld = new YCFIntTldDefaultFactory();
		factoryTopDomain = new YCFIntTopDomainDefaultFactory();
		factoryTopProject = new YCFIntTopProjectDefaultFactory();
		factoryURLProtocol = new YCFIntURLProtocolDefaultFactory();	}

	public YCFIntSchema( YCFSecConfigurationFile conf ) {
		if( conf == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"YCFIntSchema-constructor",
				1,
				"conf" );
		}
		configuration = conf;
		jndiName = null;

		tableCluster = null;
		tableHostNode = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableService = null;
		tableServiceType = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTenant = null;
		tableTld = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableURLProtocol = null;

		factoryCluster = new YCFIntClusterDefaultFactory();
		factoryHostNode = new YCFIntHostNodeDefaultFactory();
		factoryISOCcy = new YCFIntISOCcyDefaultFactory();
		factoryISOCtry = new YCFIntISOCtryDefaultFactory();
		factoryISOCtryCcy = new YCFIntISOCtryCcyDefaultFactory();
		factoryISOCtryLang = new YCFIntISOCtryLangDefaultFactory();
		factoryISOLang = new YCFIntISOLangDefaultFactory();
		factoryISOTZone = new YCFIntISOTZoneDefaultFactory();
		factoryLicense = new YCFIntLicenseDefaultFactory();
		factoryMajorVersion = new YCFIntMajorVersionDefaultFactory();
		factoryMimeType = new YCFIntMimeTypeDefaultFactory();
		factoryMinorVersion = new YCFIntMinorVersionDefaultFactory();
		factorySecApp = new YCFIntSecAppDefaultFactory();
		factorySecDevice = new YCFIntSecDeviceDefaultFactory();
		factorySecForm = new YCFIntSecFormDefaultFactory();
		factorySecGroup = new YCFIntSecGroupDefaultFactory();
		factorySecGroupForm = new YCFIntSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFIntSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFIntSecGrpMembDefaultFactory();
		factorySecSession = new YCFIntSecSessionDefaultFactory();
		factorySecUser = new YCFIntSecUserDefaultFactory();
		factoryService = new YCFIntServiceDefaultFactory();
		factoryServiceType = new YCFIntServiceTypeDefaultFactory();
		factorySubProject = new YCFIntSubProjectDefaultFactory();
		factorySysCluster = new YCFIntSysClusterDefaultFactory();
		factoryTSecGroup = new YCFIntTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFIntTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFIntTSecGrpMembDefaultFactory();
		factoryTenant = new YCFIntTenantDefaultFactory();
		factoryTld = new YCFIntTldDefaultFactory();
		factoryTopDomain = new YCFIntTopDomainDefaultFactory();
		factoryTopProject = new YCFIntTopProjectDefaultFactory();
		factoryURLProtocol = new YCFIntURLProtocolDefaultFactory();	}

	public YCFIntSchema( String argJndiName ) {
		if( ( argJndiName == null ) || ( argJndiName.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(),
				"YCFIntSchema-constructor",
				1,
				"argJndiName" );
		}
		configuration = null;
		jndiName = argJndiName;

		tableCluster = null;
		tableHostNode = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableService = null;
		tableServiceType = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTenant = null;
		tableTld = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableURLProtocol = null;

		factoryCluster = new YCFIntClusterDefaultFactory();
		factoryHostNode = new YCFIntHostNodeDefaultFactory();
		factoryISOCcy = new YCFIntISOCcyDefaultFactory();
		factoryISOCtry = new YCFIntISOCtryDefaultFactory();
		factoryISOCtryCcy = new YCFIntISOCtryCcyDefaultFactory();
		factoryISOCtryLang = new YCFIntISOCtryLangDefaultFactory();
		factoryISOLang = new YCFIntISOLangDefaultFactory();
		factoryISOTZone = new YCFIntISOTZoneDefaultFactory();
		factoryLicense = new YCFIntLicenseDefaultFactory();
		factoryMajorVersion = new YCFIntMajorVersionDefaultFactory();
		factoryMimeType = new YCFIntMimeTypeDefaultFactory();
		factoryMinorVersion = new YCFIntMinorVersionDefaultFactory();
		factorySecApp = new YCFIntSecAppDefaultFactory();
		factorySecDevice = new YCFIntSecDeviceDefaultFactory();
		factorySecForm = new YCFIntSecFormDefaultFactory();
		factorySecGroup = new YCFIntSecGroupDefaultFactory();
		factorySecGroupForm = new YCFIntSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFIntSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFIntSecGrpMembDefaultFactory();
		factorySecSession = new YCFIntSecSessionDefaultFactory();
		factorySecUser = new YCFIntSecUserDefaultFactory();
		factoryService = new YCFIntServiceDefaultFactory();
		factoryServiceType = new YCFIntServiceTypeDefaultFactory();
		factorySubProject = new YCFIntSubProjectDefaultFactory();
		factorySysCluster = new YCFIntSysClusterDefaultFactory();
		factoryTSecGroup = new YCFIntTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFIntTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFIntTSecGrpMembDefaultFactory();
		factoryTenant = new YCFIntTenantDefaultFactory();
		factoryTld = new YCFIntTldDefaultFactory();
		factoryTopDomain = new YCFIntTopDomainDefaultFactory();
		factoryTopProject = new YCFIntTopProjectDefaultFactory();
		factoryURLProtocol = new YCFIntURLProtocolDefaultFactory();	}

	/**
	 *	The majority of cases do not have a YCFTipClientHandler
	 *	associated with it's persistence implementation.
	 *	Only the XMsg client implementations overload this
	 *	to return the actual YCFTipClientHandler associated
	 *	with the connection instance.
	 */
	public YCFTipClientHandler getYCFTipClientHandler() {
		return( null );
	}

	public String getServerURL() {
		return( null );
	}

	public void setServerURL( String value ) {
	}

	public YCFSecConfigurationFile getConfigurationFile() {
		return( configuration );
	}

	public void setConfigurationFile( YCFSecConfigurationFile value ) {
		if( value == null ) {
			configuration = null;
		}
		else {
			configuration = value;
			jndiName = null;
		}
	}

	public YCFSecAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( YCFSecAuthorization value ) {
		authorization = value;
	}

	public String getJndiName() {
		return( jndiName );
	}

	public void setJndiName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			jndiName = null;
		}
		else {
			configuration = null;
			jndiName = value;
		}
	}

	public boolean isConnected() {
		throw new YCFLibMustOverrideException( getClass(), "isConnected" );
	}

	public boolean connect() {
		throw new YCFLibMustOverrideException( getClass(), "connect" );
	}

	public boolean connect( String username, String password ) {
		throw new YCFLibMustOverrideException( getClass(), "connect-userpw" );
	}

	public boolean connect( String loginId, String password, String clusterName, String tenantName ) {
		throw new YCFLibMustOverrideException( getClass(), "connect-full" );
	}

	public void disconnect( boolean doCommit ) {
		throw new YCFLibMustOverrideException( getClass(), "disconnect" );
	}

	public void logout( YCFSecAuthorization auth ) {
		throw new YCFLibMustOverrideException( getClass(), "logout" );
	}

	public IYCFIntSchema newSchema() {
		throw new YCFLibMustOverrideException( getClass(), "newSchema" );
	}

	/**
	 *	Import the contents of the specified file name
	 *	and file contents by applying a SAX Loader parse.
	 */
	public String fileImport( YCFSecAuthorization auth, String fileName, String fileContent ) {
		final String S_ProcName = "fileImport";
		throw new YCFLibNotImplementedYetException( getClass(),
			S_ProcName,
			"You must overload this method to apply a SAX Parser to the file contents" );
	}

	public short nextISOCcyIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOCcyIdGen" );
	}

	public short nextISOCtryIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOCtryIdGen" );
	}

	public short nextISOLangIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOLangIdGen" );
	}

	public short nextISOTZoneIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextISOTZoneIdGen" );
	}

	public int nextServiceTypeIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextServiceTypeIdGen" );
	}

	public int nextMimeTypeIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextMimeTypeIdGen" );
	}

	public int nextURLProtocolIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextURLProtocolIdGen" );
	}

	public long nextClusterIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextClusterIdGen" );
	}

	public long nextTenantIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextTenantIdGen" );
	}

	public UUID nextSecSessionIdGen() {
		UUID retval = UUID.randomUUID();
		return( retval );
	}

	public UUID nextSecUserIdGen() {
		UUID retval = UUID.randomUUID();
		return( retval );
	}

	public IYCFSecClusterTable getTableCluster() {
		return( tableCluster );
	}

	public void setTableCluster( IYCFSecClusterTable value ) {
		tableCluster = value;
	}

	public IYCFSecClusterFactory getFactoryCluster() {
		return( factoryCluster );
	}

	public void setFactoryCluster( IYCFSecClusterFactory value ) {
		factoryCluster = value;
	}

	public IYCFSecHostNodeTable getTableHostNode() {
		return( tableHostNode );
	}

	public void setTableHostNode( IYCFSecHostNodeTable value ) {
		tableHostNode = value;
	}

	public IYCFSecHostNodeFactory getFactoryHostNode() {
		return( factoryHostNode );
	}

	public void setFactoryHostNode( IYCFSecHostNodeFactory value ) {
		factoryHostNode = value;
	}

	public IYCFSecISOCcyTable getTableISOCcy() {
		return( tableISOCcy );
	}

	public void setTableISOCcy( IYCFSecISOCcyTable value ) {
		tableISOCcy = value;
	}

	public IYCFSecISOCcyFactory getFactoryISOCcy() {
		return( factoryISOCcy );
	}

	public void setFactoryISOCcy( IYCFSecISOCcyFactory value ) {
		factoryISOCcy = value;
	}

	public IYCFSecISOCtryTable getTableISOCtry() {
		return( tableISOCtry );
	}

	public void setTableISOCtry( IYCFSecISOCtryTable value ) {
		tableISOCtry = value;
	}

	public IYCFSecISOCtryFactory getFactoryISOCtry() {
		return( factoryISOCtry );
	}

	public void setFactoryISOCtry( IYCFSecISOCtryFactory value ) {
		factoryISOCtry = value;
	}

	public IYCFSecISOCtryCcyTable getTableISOCtryCcy() {
		return( tableISOCtryCcy );
	}

	public void setTableISOCtryCcy( IYCFSecISOCtryCcyTable value ) {
		tableISOCtryCcy = value;
	}

	public IYCFSecISOCtryCcyFactory getFactoryISOCtryCcy() {
		return( factoryISOCtryCcy );
	}

	public void setFactoryISOCtryCcy( IYCFSecISOCtryCcyFactory value ) {
		factoryISOCtryCcy = value;
	}

	public IYCFSecISOCtryLangTable getTableISOCtryLang() {
		return( tableISOCtryLang );
	}

	public void setTableISOCtryLang( IYCFSecISOCtryLangTable value ) {
		tableISOCtryLang = value;
	}

	public IYCFSecISOCtryLangFactory getFactoryISOCtryLang() {
		return( factoryISOCtryLang );
	}

	public void setFactoryISOCtryLang( IYCFSecISOCtryLangFactory value ) {
		factoryISOCtryLang = value;
	}

	public IYCFSecISOLangTable getTableISOLang() {
		return( tableISOLang );
	}

	public void setTableISOLang( IYCFSecISOLangTable value ) {
		tableISOLang = value;
	}

	public IYCFSecISOLangFactory getFactoryISOLang() {
		return( factoryISOLang );
	}

	public void setFactoryISOLang( IYCFSecISOLangFactory value ) {
		factoryISOLang = value;
	}

	public IYCFSecISOTZoneTable getTableISOTZone() {
		return( tableISOTZone );
	}

	public void setTableISOTZone( IYCFSecISOTZoneTable value ) {
		tableISOTZone = value;
	}

	public IYCFSecISOTZoneFactory getFactoryISOTZone() {
		return( factoryISOTZone );
	}

	public void setFactoryISOTZone( IYCFSecISOTZoneFactory value ) {
		factoryISOTZone = value;
	}

	public IYCFIntLicenseTable getTableLicense() {
		return( tableLicense );
	}

	public void setTableLicense( IYCFIntLicenseTable value ) {
		tableLicense = value;
	}

	public IYCFIntLicenseFactory getFactoryLicense() {
		return( factoryLicense );
	}

	public void setFactoryLicense( IYCFIntLicenseFactory value ) {
		factoryLicense = value;
	}

	public IYCFIntMajorVersionTable getTableMajorVersion() {
		return( tableMajorVersion );
	}

	public void setTableMajorVersion( IYCFIntMajorVersionTable value ) {
		tableMajorVersion = value;
	}

	public IYCFIntMajorVersionFactory getFactoryMajorVersion() {
		return( factoryMajorVersion );
	}

	public void setFactoryMajorVersion( IYCFIntMajorVersionFactory value ) {
		factoryMajorVersion = value;
	}

	public IYCFIntMimeTypeTable getTableMimeType() {
		return( tableMimeType );
	}

	public void setTableMimeType( IYCFIntMimeTypeTable value ) {
		tableMimeType = value;
	}

	public IYCFIntMimeTypeFactory getFactoryMimeType() {
		return( factoryMimeType );
	}

	public void setFactoryMimeType( IYCFIntMimeTypeFactory value ) {
		factoryMimeType = value;
	}

	public IYCFIntMinorVersionTable getTableMinorVersion() {
		return( tableMinorVersion );
	}

	public void setTableMinorVersion( IYCFIntMinorVersionTable value ) {
		tableMinorVersion = value;
	}

	public IYCFIntMinorVersionFactory getFactoryMinorVersion() {
		return( factoryMinorVersion );
	}

	public void setFactoryMinorVersion( IYCFIntMinorVersionFactory value ) {
		factoryMinorVersion = value;
	}

	public IYCFSecSecAppTable getTableSecApp() {
		return( tableSecApp );
	}

	public void setTableSecApp( IYCFSecSecAppTable value ) {
		tableSecApp = value;
	}

	public IYCFSecSecAppFactory getFactorySecApp() {
		return( factorySecApp );
	}

	public void setFactorySecApp( IYCFSecSecAppFactory value ) {
		factorySecApp = value;
	}

	public IYCFSecSecDeviceTable getTableSecDevice() {
		return( tableSecDevice );
	}

	public void setTableSecDevice( IYCFSecSecDeviceTable value ) {
		tableSecDevice = value;
	}

	public IYCFSecSecDeviceFactory getFactorySecDevice() {
		return( factorySecDevice );
	}

	public void setFactorySecDevice( IYCFSecSecDeviceFactory value ) {
		factorySecDevice = value;
	}

	public IYCFSecSecFormTable getTableSecForm() {
		return( tableSecForm );
	}

	public void setTableSecForm( IYCFSecSecFormTable value ) {
		tableSecForm = value;
	}

	public IYCFSecSecFormFactory getFactorySecForm() {
		return( factorySecForm );
	}

	public void setFactorySecForm( IYCFSecSecFormFactory value ) {
		factorySecForm = value;
	}

	public IYCFSecSecGroupTable getTableSecGroup() {
		return( tableSecGroup );
	}

	public void setTableSecGroup( IYCFSecSecGroupTable value ) {
		tableSecGroup = value;
	}

	public IYCFSecSecGroupFactory getFactorySecGroup() {
		return( factorySecGroup );
	}

	public void setFactorySecGroup( IYCFSecSecGroupFactory value ) {
		factorySecGroup = value;
	}

	public IYCFSecSecGroupFormTable getTableSecGroupForm() {
		return( tableSecGroupForm );
	}

	public void setTableSecGroupForm( IYCFSecSecGroupFormTable value ) {
		tableSecGroupForm = value;
	}

	public IYCFSecSecGroupFormFactory getFactorySecGroupForm() {
		return( factorySecGroupForm );
	}

	public void setFactorySecGroupForm( IYCFSecSecGroupFormFactory value ) {
		factorySecGroupForm = value;
	}

	public IYCFSecSecGrpIncTable getTableSecGrpInc() {
		return( tableSecGrpInc );
	}

	public void setTableSecGrpInc( IYCFSecSecGrpIncTable value ) {
		tableSecGrpInc = value;
	}

	public IYCFSecSecGrpIncFactory getFactorySecGrpInc() {
		return( factorySecGrpInc );
	}

	public void setFactorySecGrpInc( IYCFSecSecGrpIncFactory value ) {
		factorySecGrpInc = value;
	}

	public IYCFSecSecGrpMembTable getTableSecGrpMemb() {
		return( tableSecGrpMemb );
	}

	public void setTableSecGrpMemb( IYCFSecSecGrpMembTable value ) {
		tableSecGrpMemb = value;
	}

	public IYCFSecSecGrpMembFactory getFactorySecGrpMemb() {
		return( factorySecGrpMemb );
	}

	public void setFactorySecGrpMemb( IYCFSecSecGrpMembFactory value ) {
		factorySecGrpMemb = value;
	}

	public IYCFSecSecSessionTable getTableSecSession() {
		return( tableSecSession );
	}

	public void setTableSecSession( IYCFSecSecSessionTable value ) {
		tableSecSession = value;
	}

	public IYCFSecSecSessionFactory getFactorySecSession() {
		return( factorySecSession );
	}

	public void setFactorySecSession( IYCFSecSecSessionFactory value ) {
		factorySecSession = value;
	}

	public IYCFSecSecUserTable getTableSecUser() {
		return( tableSecUser );
	}

	public void setTableSecUser( IYCFSecSecUserTable value ) {
		tableSecUser = value;
	}

	public IYCFSecSecUserFactory getFactorySecUser() {
		return( factorySecUser );
	}

	public void setFactorySecUser( IYCFSecSecUserFactory value ) {
		factorySecUser = value;
	}

	public IYCFSecServiceTable getTableService() {
		return( tableService );
	}

	public void setTableService( IYCFSecServiceTable value ) {
		tableService = value;
	}

	public IYCFSecServiceFactory getFactoryService() {
		return( factoryService );
	}

	public void setFactoryService( IYCFSecServiceFactory value ) {
		factoryService = value;
	}

	public IYCFSecServiceTypeTable getTableServiceType() {
		return( tableServiceType );
	}

	public void setTableServiceType( IYCFSecServiceTypeTable value ) {
		tableServiceType = value;
	}

	public IYCFSecServiceTypeFactory getFactoryServiceType() {
		return( factoryServiceType );
	}

	public void setFactoryServiceType( IYCFSecServiceTypeFactory value ) {
		factoryServiceType = value;
	}

	public IYCFIntSubProjectTable getTableSubProject() {
		return( tableSubProject );
	}

	public void setTableSubProject( IYCFIntSubProjectTable value ) {
		tableSubProject = value;
	}

	public IYCFIntSubProjectFactory getFactorySubProject() {
		return( factorySubProject );
	}

	public void setFactorySubProject( IYCFIntSubProjectFactory value ) {
		factorySubProject = value;
	}

	public IYCFSecSysClusterTable getTableSysCluster() {
		return( tableSysCluster );
	}

	public void setTableSysCluster( IYCFSecSysClusterTable value ) {
		tableSysCluster = value;
	}

	public IYCFSecSysClusterFactory getFactorySysCluster() {
		return( factorySysCluster );
	}

	public void setFactorySysCluster( IYCFSecSysClusterFactory value ) {
		factorySysCluster = value;
	}

	public IYCFSecTSecGroupTable getTableTSecGroup() {
		return( tableTSecGroup );
	}

	public void setTableTSecGroup( IYCFSecTSecGroupTable value ) {
		tableTSecGroup = value;
	}

	public IYCFSecTSecGroupFactory getFactoryTSecGroup() {
		return( factoryTSecGroup );
	}

	public void setFactoryTSecGroup( IYCFSecTSecGroupFactory value ) {
		factoryTSecGroup = value;
	}

	public IYCFSecTSecGrpIncTable getTableTSecGrpInc() {
		return( tableTSecGrpInc );
	}

	public void setTableTSecGrpInc( IYCFSecTSecGrpIncTable value ) {
		tableTSecGrpInc = value;
	}

	public IYCFSecTSecGrpIncFactory getFactoryTSecGrpInc() {
		return( factoryTSecGrpInc );
	}

	public void setFactoryTSecGrpInc( IYCFSecTSecGrpIncFactory value ) {
		factoryTSecGrpInc = value;
	}

	public IYCFSecTSecGrpMembTable getTableTSecGrpMemb() {
		return( tableTSecGrpMemb );
	}

	public void setTableTSecGrpMemb( IYCFSecTSecGrpMembTable value ) {
		tableTSecGrpMemb = value;
	}

	public IYCFSecTSecGrpMembFactory getFactoryTSecGrpMemb() {
		return( factoryTSecGrpMemb );
	}

	public void setFactoryTSecGrpMemb( IYCFSecTSecGrpMembFactory value ) {
		factoryTSecGrpMemb = value;
	}

	public IYCFSecTenantTable getTableTenant() {
		return( tableTenant );
	}

	public void setTableTenant( IYCFSecTenantTable value ) {
		tableTenant = value;
	}

	public IYCFSecTenantFactory getFactoryTenant() {
		return( factoryTenant );
	}

	public void setFactoryTenant( IYCFSecTenantFactory value ) {
		factoryTenant = value;
	}

	public IYCFIntTldTable getTableTld() {
		return( tableTld );
	}

	public void setTableTld( IYCFIntTldTable value ) {
		tableTld = value;
	}

	public IYCFIntTldFactory getFactoryTld() {
		return( factoryTld );
	}

	public void setFactoryTld( IYCFIntTldFactory value ) {
		factoryTld = value;
	}

	public IYCFIntTopDomainTable getTableTopDomain() {
		return( tableTopDomain );
	}

	public void setTableTopDomain( IYCFIntTopDomainTable value ) {
		tableTopDomain = value;
	}

	public IYCFIntTopDomainFactory getFactoryTopDomain() {
		return( factoryTopDomain );
	}

	public void setFactoryTopDomain( IYCFIntTopDomainFactory value ) {
		factoryTopDomain = value;
	}

	public IYCFIntTopProjectTable getTableTopProject() {
		return( tableTopProject );
	}

	public void setTableTopProject( IYCFIntTopProjectTable value ) {
		tableTopProject = value;
	}

	public IYCFIntTopProjectFactory getFactoryTopProject() {
		return( factoryTopProject );
	}

	public void setFactoryTopProject( IYCFIntTopProjectFactory value ) {
		factoryTopProject = value;
	}

	public IYCFIntURLProtocolTable getTableURLProtocol() {
		return( tableURLProtocol );
	}

	public void setTableURLProtocol( IYCFIntURLProtocolTable value ) {
		tableURLProtocol = value;
	}

	public IYCFIntURLProtocolFactory getFactoryURLProtocol() {
		return( factoryURLProtocol );
	}

	public void setFactoryURLProtocol( IYCFIntURLProtocolFactory value ) {
		factoryURLProtocol = value;
	}

	public boolean isTransactionOpen() {
		throw new YCFLibMustOverrideException( getClass(), "isTransactionOpen" );
	}

	public boolean beginTransaction() {
		throw new YCFLibMustOverrideException( getClass(), "beginTransaction" );
	}

	public void commit() {
		throw new YCFLibMustOverrideException( getClass(), "commit" );
	}

	public void rollback() {
		throw new YCFLibMustOverrideException( getClass(), "rollback" );
	}

	public IYCFSecTablePerms getTablePerms() {
		return( tablePerms );
	}

	public void setTablePerms( IYCFSecTablePerms value ) {
		tablePerms = value;
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

	/**
	 *	Release any prepared statements bound to this database instance, such
	 *	that the value of schemaDbName has to be re-evaluated for all future
	 *	invocations.
	 */
	public void releasePreparedStatements() {
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
		if( ( argDbSchemaName == null ) || ( argDbSchemaName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"argDbSchemaName" );
		}
		schemaDbName = argDbSchemaName;
		lowerDbSchemaName = schemaDbName.toLowerCase();
	}
}
