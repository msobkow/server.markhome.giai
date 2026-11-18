
// Description: Java Protected Factory interface for ISOCtryCcy.

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
 *	ISecureProtISOCtryCcyFactory protected interface for ISOCtryCcy
 */
public interface ISecureProtISOCtryCcyFactory extends ISecurePubISOCtryCcyFactory
{

	/**
	 *	Allocate a primary key for ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyPKey newProtPKey();

	/**
	 *	Allocate a public key for ISOCtryCcy instances from a protected key.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyPKey asPublic(ISecureProtISOCtryCcyPKey src);

	/**
	 *	Allocate a protected primary history key for ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOCtryCcyHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for ISOCtryCcy instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOCtryCcyHPKey asPublic(ISecureProtISOCtryCcyHPKey src);

	/**
	 *	Allocate a protected CtryIdx key over protected ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyByCtryIdxKey newProtByCtryIdxKey();

	/**
	 *	Allocate a public CtryIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyByCtryIdxKey asPublic(ISecureProtISOCtryCcyByCtryIdxKey src);

	/**
	 *	Allocate a protected CcyIdx key over protected ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyByCcyIdxKey newProtByCcyIdxKey();

	/**
	 *	Allocate a public CcyIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyByCcyIdxKey asPublic(ISecureProtISOCtryCcyByCcyIdxKey src);

	/**
	 *	Allocate a protected ISOCtryCcy interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcy newProtRec();

	/**
	 *	Allocate a public ISOCtryCcy interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcy asPublic(ISecureProtISOCtryCcy src);

	/**
	 *	Allocate a protected ISOCtryCcy history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyH newProtHRec();

	/**
	 *	Allocate a public ISOCtryCcy history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyH asPublic(ISecureProtISOCtryCcyH src);

}
