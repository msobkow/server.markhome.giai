// Description: Java 11 Table Object interface for YCFInt.

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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntLicenseTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new License instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntLicenseObj newInstance();

	/**
	 *	Instantiate a new License edition of the specified License instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntLicenseEditObj newEditInstance( IYCFIntLicenseObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntLicenseObj realiseLicense( IYCFIntLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntLicenseObj createLicense( IYCFIntLicenseObj Obj );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntLicenseObj readLicense( YCFIntLicensePKey pkey );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntLicenseObj readLicense( YCFIntLicensePKey pkey,
		boolean forceRead );

	IYCFIntLicenseObj readCachedLicense( YCFIntLicensePKey pkey );

	public void reallyDeepDisposeLicense( IYCFIntLicenseObj obj );

	void deepDisposeLicense( YCFIntLicensePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntLicenseObj lockLicense( YCFIntLicensePKey pkey );

	/**
	 *	Return a sorted list of all the License-derived instances in the database.
	 *
	 *	@return	List of IYCFIntLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntLicenseObj> readAllLicense();

	/**
	 *	Return a sorted map of all the License-derived instances in the database.
	 *
	 *	@return	List of IYCFIntLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntLicenseObj> readAllLicense( boolean forceRead );

	List<IYCFIntLicenseObj> readCachedAllLicense();

	/**
	 *	Get the YCFIntLicenseObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argId	The License key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntLicenseObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntLicenseObj readLicenseByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFIntLicenseObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argId	The License key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntLicenseObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntLicenseObj readLicenseByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntLicenseObj> readLicenseByLicnTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFIntLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntLicenseObj> readLicenseByLicnTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntLicenseObj> readLicenseByDomainIdx( long TenantId,
		long TopDomainId );

	/**
	 *	Get the map of YCFIntLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntLicenseObj> readLicenseByDomainIdx( long TenantId,
		long TopDomainId,
		boolean forceRead );

	/**
	 *	Get the YCFIntLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argName	The License key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntLicenseObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntLicenseObj readLicenseByUNameIdx(long TenantId,
		long TopDomainId,
		String Name );

	/**
	 *	Get the YCFIntLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argName	The License key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntLicenseObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntLicenseObj readLicenseByUNameIdx(long TenantId,
		long TopDomainId,
		String Name,
		boolean forceRead );

	IYCFIntLicenseObj readCachedLicenseByIdIdx( long TenantId,
		long Id );

	List<IYCFIntLicenseObj> readCachedLicenseByLicnTenantIdx( long TenantId );

	List<IYCFIntLicenseObj> readCachedLicenseByDomainIdx( long TenantId,
		long TopDomainId );

	IYCFIntLicenseObj readCachedLicenseByUNameIdx( long TenantId,
		long TopDomainId,
		String Name );

	void deepDisposeLicenseByIdIdx( long TenantId,
		long Id );

	void deepDisposeLicenseByLicnTenantIdx( long TenantId );

	void deepDisposeLicenseByDomainIdx( long TenantId,
		long TopDomainId );

	void deepDisposeLicenseByUNameIdx( long TenantId,
		long TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntLicenseObj updateLicense( IYCFIntLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteLicense( IYCFIntLicenseObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByLicnTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByDomainIdx( long TenantId,
		long TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argName	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByUNameIdx(long TenantId,
		long TopDomainId,
		String Name );
}
