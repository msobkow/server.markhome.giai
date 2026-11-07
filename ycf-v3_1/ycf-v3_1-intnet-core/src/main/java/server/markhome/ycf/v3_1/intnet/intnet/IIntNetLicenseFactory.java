
// Description: Java JPA Factory interface for License.

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

package server.markhome.ycf.v3_1.intnet.intnet;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

/*
 *	IIntNetLicenseFactory interface for License
 */
public interface IIntNetLicenseFactory extends IIntNetProtLicenseFactory
{

	/**
	 *	Allocate a primary history key for License instances.
	 *
	 *	@return	The new instance.
	 */
	IIntNetLicenseHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for License instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetProtLicenseHPKey asProtected(IIntNetLicenseHPKey src);

	/**
	 *	Allocate a public primary history key for License instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetPubLicenseHPKey asPublic(IIntNetLicenseHPKey src);

	/**
	 *	Allocate a LicnTenantIdx key over License instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetLicenseByLicnTenantIdxKey newByLicnTenantIdxKey();

	/**
	 *	Allocate a protected LicnTenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtLicenseByLicnTenantIdxKey asProtected(IIntNetLicenseByLicnTenantIdxKey src);

	/**
	 *	Allocate a public LicnTenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubLicenseByLicnTenantIdxKey asPublic(IIntNetLicenseByLicnTenantIdxKey src);

	/**
	 *	Allocate a DomainIdx key over License instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetLicenseByDomainIdxKey newByDomainIdxKey();

	/**
	 *	Allocate a protected DomainIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtLicenseByDomainIdxKey asProtected(IIntNetLicenseByDomainIdxKey src);

	/**
	 *	Allocate a public DomainIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubLicenseByDomainIdxKey asPublic(IIntNetLicenseByDomainIdxKey src);

	/**
	 *	Allocate a UNameIdx key over License instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetLicenseByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtLicenseByUNameIdxKey asProtected(IIntNetLicenseByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubLicenseByUNameIdxKey asPublic(IIntNetLicenseByUNameIdxKey src);

	/**
	 *	Allocate a License interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetLicense newRec();

	/**
	 *	Allocate a protected License interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtLicense asProtected(IIntNetLicense src);

	/**
	 *	Allocate a public License interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubLicense asPublic(IIntNetLicense src);

	/**
	 *	Allocate a License history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetLicenseH newHRec();

	/**
	 *	Allocate a protected License history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtLicenseH asProtected(IIntNetLicenseH src);

	/**
	 *	Allocate a public License history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubLicenseH asPublic(IIntNetLicenseH src);

}
