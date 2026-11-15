// Description: Java 25 implementation of an in-memory RAM IntNet schema.

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

package server.markhome.ycf.v3_1.intnet.intnetram;

import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.secure.secure.buff.*;
import server.markhome.ycf.v3_1.intnet.intnet.buff.*;
import server.markhome.ycf.v3_1.intnet.intnetsaxloader.*;

import server.markhome.ycf.v3_1.secure.secure.buff.SecureBuffSchema;
import server.markhome.ycf.v3_1.secure.secure.buff.SecureBuffFactoryService;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffSchema;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffFactoryService;
//import server.markhome.ycf.v3_1.intnet.intnetpub.buff.IntNetPubBuffFactoryService;

public class IntNetRamSchema
	extends IntNetBuffSchema
	implements IIntNetSchema
{
	protected int nextMimeTypeIdGenValue = 1;
	protected int nextURLProtocolIdGenValue = 1;


	public IntNetRamSchema() {
		super();
		tableLicense = new IntNetRamLicenseTable( this );
		tableMajorVersion = new IntNetRamMajorVersionTable( this );
		tableMimeType = new IntNetRamMimeTypeTable( this );
		tableMinorVersion = new IntNetRamMinorVersionTable( this );
		tableSubProject = new IntNetRamSubProjectTable( this );
		tableTld = new IntNetRamTldTable( this );
		tableTopDomain = new IntNetRamTopDomainTable( this );
		tableTopProject = new IntNetRamTopProjectTable( this );
		tableURLProtocol = new IntNetRamURLProtocolTable( this );
	}

	@Override
	public IIntNetSchema newSchema() {
		throw new CFMustOverrideException( getClass(), "newSchema" );
	}

	@Override
	public int nextMimeTypeIdGen() {
		int next = nextMimeTypeIdGenValue++;
		return( next );
	}

	@Override
	public int nextURLProtocolIdGen() {
		int next = nextURLProtocolIdGenValue++;
		return( next );
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

	public String fileImport( SecureAuthorization Authorization,
		String fileName,
		String fileContent )
	{
		final String S_ProcName = "fileImport";
		if( ( fileName == null ) || ( fileName.length() <= 0 ) ) {
			throw new CFNullArgumentException( getClass(),
				S_ProcName,
				1,
				"fileName" );
		}
		if( ( fileContent == null ) || ( fileContent.length() <= 0 ) ) {
			throw new CFNullArgumentException( getClass(),
				S_ProcName,
				2,
				"fileContent" );
		}

		IntNetSaxLoader saxLoader = new IntNetSaxLoader();
		IIntNetSchemaObj schemaObj = new IntNetSchemaObj();
		schemaObj.setIntNetBackingStore( this );
		saxLoader.setSchemaObj( schemaObj );
		ISecureClusterObj useCluster = schemaObj.getClusterTableObj().readClusterByIdIdx( Authorization.getSecClusterId() );
		ISecureTenantObj useTenant = schemaObj.getTenantTableObj().readTenantByIdIdx( Authorization.getSecTenantId() );
		CFCachedMessageLog runlog = new CFCachedMessageLog();
		saxLoader.setLog( runlog );
		saxLoader.setUseCluster( useCluster );
		saxLoader.setUseTenant( useTenant );
		saxLoader.parseStringContents( fileContent );
		String logFileContent = runlog.getCacheContents();
		if( logFileContent == null ) {
			logFileContent = "";
		}

		return( logFileContent );
	}

		
	@Override
	public void wireTableTableInstances() {
		if (tableLicense == null || !(tableLicense instanceof IntNetRamLicenseTable)) {
			tableLicense = new IntNetRamLicenseTable(this);
		}
		if (tableMajorVersion == null || !(tableMajorVersion instanceof IntNetRamMajorVersionTable)) {
			tableMajorVersion = new IntNetRamMajorVersionTable(this);
		}
		if (tableMimeType == null || !(tableMimeType instanceof IntNetRamMimeTypeTable)) {
			tableMimeType = new IntNetRamMimeTypeTable(this);
		}
		if (tableMinorVersion == null || !(tableMinorVersion instanceof IntNetRamMinorVersionTable)) {
			tableMinorVersion = new IntNetRamMinorVersionTable(this);
		}
		if (tableSubProject == null || !(tableSubProject instanceof IntNetRamSubProjectTable)) {
			tableSubProject = new IntNetRamSubProjectTable(this);
		}
		if (tableTld == null || !(tableTld instanceof IntNetRamTldTable)) {
			tableTld = new IntNetRamTldTable(this);
		}
		if (tableTopDomain == null || !(tableTopDomain instanceof IntNetRamTopDomainTable)) {
			tableTopDomain = new IntNetRamTopDomainTable(this);
		}
		if (tableTopProject == null || !(tableTopProject instanceof IntNetRamTopProjectTable)) {
			tableTopProject = new IntNetRamTopProjectTable(this);
		}
		if (tableURLProtocol == null || !(tableURLProtocol instanceof IntNetRamURLProtocolTable)) {
			tableURLProtocol = new IntNetRamURLProtocolTable(this);
		}
	}
}
