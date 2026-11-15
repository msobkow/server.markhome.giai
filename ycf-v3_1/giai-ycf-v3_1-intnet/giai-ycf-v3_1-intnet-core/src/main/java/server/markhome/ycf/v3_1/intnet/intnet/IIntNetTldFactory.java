
// Description: Java JPA Factory interface for Tld.

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
 *	IIntNetTldFactory interface for Tld
 */
public interface IIntNetTldFactory extends IIntNetProtTldFactory
{

	/**
	 *	Allocate a primary history key for Tld instances.
	 *
	 *	@return	The new instance.
	 */
	IIntNetTldHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for Tld instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetProtTldHPKey asProtected(IIntNetTldHPKey src);

	/**
	 *	Allocate a public primary history key for Tld instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetPubTldHPKey asPublic(IIntNetTldHPKey src);

	/**
	 *	Allocate a TenantIdx key over Tld instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetTldByTenantIdxKey newByTenantIdxKey();

	/**
	 *	Allocate a protected TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtTldByTenantIdxKey asProtected(IIntNetTldByTenantIdxKey src);

	/**
	 *	Allocate a public TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubTldByTenantIdxKey asPublic(IIntNetTldByTenantIdxKey src);

	/**
	 *	Allocate a NameIdx key over Tld instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetTldByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtTldByNameIdxKey asProtected(IIntNetTldByNameIdxKey src);

	/**
	 *	Allocate a public NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubTldByNameIdxKey asPublic(IIntNetTldByNameIdxKey src);

	/**
	 *	Allocate a Tld interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetTld newRec();

	/**
	 *	Allocate a protected Tld interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtTld asProtected(IIntNetTld src);

	/**
	 *	Allocate a public Tld interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubTld asPublic(IIntNetTld src);

	/**
	 *	Allocate a Tld history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetTldH newHRec();

	/**
	 *	Allocate a protected Tld history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtTldH asProtected(IIntNetTldH src);

	/**
	 *	Allocate a public Tld history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubTldH asPublic(IIntNetTldH src);

}
