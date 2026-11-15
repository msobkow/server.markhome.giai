
// Description: Java JPA Factory interface for SecUserEMConf.

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
 *	ISecureSecUserEMConfFactory interface for SecUserEMConf
 */
public interface ISecureSecUserEMConfFactory extends ISecureProtSecUserEMConfFactory
{

	/**
	 *	Allocate a primary history key for SecUserEMConf instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSecUserEMConfHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SecUserEMConf instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecUserEMConfHPKey asProtected(ISecureSecUserEMConfHPKey src);

	/**
	 *	Allocate a UUuid6Idx key over SecUserEMConf instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecUserEMConfByUUuid6IdxKey newByUUuid6IdxKey();

	/**
	 *	Allocate a protected UUuid6Idx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecUserEMConfByUUuid6IdxKey asProtected(ISecureSecUserEMConfByUUuid6IdxKey src);

	/**
	 *	Allocate a ConfEMAddrIdx key over SecUserEMConf instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecUserEMConfByConfEMAddrIdxKey newByConfEMAddrIdxKey();

	/**
	 *	Allocate a protected ConfEMAddrIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecUserEMConfByConfEMAddrIdxKey asProtected(ISecureSecUserEMConfByConfEMAddrIdxKey src);

	/**
	 *	Allocate a SentStampIdx key over SecUserEMConf instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecUserEMConfBySentStampIdxKey newBySentStampIdxKey();

	/**
	 *	Allocate a protected SentStampIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecUserEMConfBySentStampIdxKey asProtected(ISecureSecUserEMConfBySentStampIdxKey src);

	/**
	 *	Allocate a NewAcctIdx key over SecUserEMConf instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecUserEMConfByNewAcctIdxKey newByNewAcctIdxKey();

	/**
	 *	Allocate a protected NewAcctIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecUserEMConfByNewAcctIdxKey asProtected(ISecureSecUserEMConfByNewAcctIdxKey src);

	/**
	 *	Allocate a SecUserEMConf interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecUserEMConf newRec();

	/**
	 *	Allocate a protected SecUserEMConf interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecUserEMConf asProtected(ISecureSecUserEMConf src);

	/**
	 *	Allocate a SecUserEMConf history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecUserEMConfH newHRec();

	/**
	 *	Allocate a protected SecUserEMConf history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecUserEMConfH asProtected(ISecureSecUserEMConfH src);

}
