
// Description: Java JPA Factory interface for Cluster.

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

package server.markhome.ycf.v3_1.secure.secure;

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

import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	ISecureClusterFactory interface for Cluster
 */
public interface ISecureClusterFactory extends ISecureProtClusterFactory
{

	/**
	 *	Allocate a primary history key for Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureClusterHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for Cluster instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtClusterHPKey asProtected(ISecureClusterHPKey src);

	/**
	 *	Allocate a public primary history key for Cluster instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubClusterHPKey asPublic(ISecureClusterHPKey src);

	/**
	 *	Allocate a UDomNameIdx key over Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureClusterByUDomNameIdxKey newByUDomNameIdxKey();

	/**
	 *	Allocate a protected UDomNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtClusterByUDomNameIdxKey asProtected(ISecureClusterByUDomNameIdxKey src);

	/**
	 *	Allocate a public UDomNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubClusterByUDomNameIdxKey asPublic(ISecureClusterByUDomNameIdxKey src);

	/**
	 *	Allocate a UDescrIdx key over Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureClusterByUDescrIdxKey newByUDescrIdxKey();

	/**
	 *	Allocate a protected UDescrIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtClusterByUDescrIdxKey asProtected(ISecureClusterByUDescrIdxKey src);

	/**
	 *	Allocate a public UDescrIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubClusterByUDescrIdxKey asPublic(ISecureClusterByUDescrIdxKey src);

	/**
	 *	Allocate a Cluster interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureCluster newRec();

	/**
	 *	Allocate a protected Cluster interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtCluster asProtected(ISecureCluster src);

	/**
	 *	Allocate a public Cluster interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubCluster asPublic(ISecureCluster src);

	/**
	 *	Allocate a Cluster history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureClusterH newHRec();

	/**
	 *	Allocate a protected Cluster history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtClusterH asProtected(ISecureClusterH src);

	/**
	 *	Allocate a public Cluster history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubClusterH asPublic(ISecureClusterH src);

}
