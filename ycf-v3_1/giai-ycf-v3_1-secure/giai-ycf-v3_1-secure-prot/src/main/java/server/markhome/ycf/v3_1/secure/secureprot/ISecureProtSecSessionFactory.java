
// Description: Java Protected Factory interface for SecSession.

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

package server.markhome.ycf.v3_1.secure.secureprot;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	ISecureProtSecSessionFactory protected interface for SecSession
 */
public interface ISecureProtSecSessionFactory extends ISecurePubSecSessionFactory
{

	/**
	 *	Allocate a protected primary history key for SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecSessionHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for SecSession instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubSecSessionHPKey asPublic(ISecureProtSecSessionHPKey src);

	/**
	 *	Allocate a protected SecUserIdx key over protected SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionBySecUserIdxKey newProtBySecUserIdxKey();

	/**
	 *	Allocate a public SecUserIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionBySecUserIdxKey asPublic(ISecureProtSecSessionBySecUserIdxKey src);

	/**
	 *	Allocate a protected StartIdx key over protected SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionByStartIdxKey newProtByStartIdxKey();

	/**
	 *	Allocate a public StartIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionByStartIdxKey asPublic(ISecureProtSecSessionByStartIdxKey src);

	/**
	 *	Allocate a protected FinishIdx key over protected SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionByFinishIdxKey newProtByFinishIdxKey();

	/**
	 *	Allocate a public FinishIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionByFinishIdxKey asPublic(ISecureProtSecSessionByFinishIdxKey src);

	/**
	 *	Allocate a protected SecProxyIdx key over protected SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionBySecProxyIdxKey newProtBySecProxyIdxKey();

	/**
	 *	Allocate a protected SecSession interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSession newProtRec();

	/**
	 *	Allocate a public SecSession interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSession asPublic(ISecureProtSecSession src);

	/**
	 *	Allocate a protected SecSession history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSessionH newProtHRec();

	/**
	 *	Allocate a public SecSession history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSessionH asPublic(ISecureProtSecSessionH src);

}
