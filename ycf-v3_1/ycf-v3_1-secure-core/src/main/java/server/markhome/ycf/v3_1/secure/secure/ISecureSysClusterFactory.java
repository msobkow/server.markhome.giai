
// Description: Java JPA Factory interface for SysCluster.

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
 *	ISecureSysClusterFactory interface for SysCluster
 */
public interface ISecureSysClusterFactory extends ISecureProtSysClusterFactory
{

	/**
	 *	Allocate a primary history key for SysCluster instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSysClusterHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SysCluster instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSysClusterHPKey asProtected(ISecureSysClusterHPKey src);

	/**
	 *	Allocate a public primary history key for SysCluster instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubSysClusterHPKey asPublic(ISecureSysClusterHPKey src);

	/**
	 *	Allocate a ClusterIdx key over SysCluster instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSysClusterByClusterIdxKey newByClusterIdxKey();

	/**
	 *	Allocate a protected ClusterIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSysClusterByClusterIdxKey asProtected(ISecureSysClusterByClusterIdxKey src);

	/**
	 *	Allocate a public ClusterIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSysClusterByClusterIdxKey asPublic(ISecureSysClusterByClusterIdxKey src);

	/**
	 *	Allocate a SysCluster interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSysCluster newRec();

	/**
	 *	Allocate a protected SysCluster interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSysCluster asProtected(ISecureSysCluster src);

	/**
	 *	Allocate a public SysCluster interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSysCluster asPublic(ISecureSysCluster src);

	/**
	 *	Allocate a SysCluster history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSysClusterH newHRec();

	/**
	 *	Allocate a protected SysCluster history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSysClusterH asProtected(ISecureSysClusterH src);

	/**
	 *	Allocate a public SysCluster history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSysClusterH asPublic(ISecureSysClusterH src);

}
