
// Description: Java JPA Factory interface for SecSession.

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
 *	ISecureSecSessionFactory interface for SecSession
 */
public interface ISecureSecSessionFactory extends ISecureProtSecSessionFactory
{

	/**
	 *	Allocate a primary history key for SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSecSessionHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SecSession instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecSessionHPKey asProtected(ISecureSecSessionHPKey src);

	/**
	 *	Allocate a public primary history key for SecSession instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubSecSessionHPKey asPublic(ISecureSecSessionHPKey src);

	/**
	 *	Allocate a SecUserIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSessionBySecUserIdxKey newBySecUserIdxKey();

	/**
	 *	Allocate a protected SecUserIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionBySecUserIdxKey asProtected(ISecureSecSessionBySecUserIdxKey src);

	/**
	 *	Allocate a public SecUserIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionBySecUserIdxKey asPublic(ISecureSecSessionBySecUserIdxKey src);

	/**
	 *	Allocate a StartIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSessionByStartIdxKey newByStartIdxKey();

	/**
	 *	Allocate a protected StartIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionByStartIdxKey asProtected(ISecureSecSessionByStartIdxKey src);

	/**
	 *	Allocate a public StartIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionByStartIdxKey asPublic(ISecureSecSessionByStartIdxKey src);

	/**
	 *	Allocate a FinishIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSessionByFinishIdxKey newByFinishIdxKey();

	/**
	 *	Allocate a protected FinishIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionByFinishIdxKey asProtected(ISecureSecSessionByFinishIdxKey src);

	/**
	 *	Allocate a public FinishIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionByFinishIdxKey asPublic(ISecureSecSessionByFinishIdxKey src);

	/**
	 *	Allocate a SecProxyIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSessionBySecProxyIdxKey newBySecProxyIdxKey();

	/**
	 *	Allocate a protected SecProxyIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionBySecProxyIdxKey asProtected(ISecureSecSessionBySecProxyIdxKey src);

	/**
	 *	Allocate a SecSession interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSession newRec();

	/**
	 *	Allocate a protected SecSession interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSession asProtected(ISecureSecSession src);

	/**
	 *	Allocate a public SecSession interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSession asPublic(ISecureSecSession src);

	/**
	 *	Allocate a SecSession history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSessionH newHRec();

	/**
	 *	Allocate a protected SecSession history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionH asProtected(ISecureSecSessionH src);

	/**
	 *	Allocate a public SecSession history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionH asPublic(ISecureSecSessionH src);

}
