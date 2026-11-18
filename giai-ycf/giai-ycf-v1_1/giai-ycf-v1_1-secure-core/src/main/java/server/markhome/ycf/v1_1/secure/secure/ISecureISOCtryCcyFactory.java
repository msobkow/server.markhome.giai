
// Description: Java JPA Factory interface for ISOCtryCcy.

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
 *	ISecureISOCtryCcyFactory interface for ISOCtryCcy
 */
public interface ISecureISOCtryCcyFactory extends ISecureProtISOCtryCcyFactory
{

	/**
	 *	Allocate a primary key for ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryCcyPKey newPKey();

	/**
	 *	Allocate a protected key for ISOCtryCcy instances from a private key.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyPKey asProtected(ISecureISOCtryCcyPKey src);

	/**
	 *	Allocate a public key for ISOCtryCcy instances from a private key.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyPKey asPublic(ISecureISOCtryCcyPKey src);

	/**
	 *	Allocate a primary history key for ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureISOCtryCcyHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for ISOCtryCcy instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOCtryCcyHPKey asProtected(ISecureISOCtryCcyHPKey src);

	/**
	 *	Allocate a public primary history key for ISOCtryCcy instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOCtryCcyHPKey asPublic(ISecureISOCtryCcyHPKey src);

	/**
	 *	Allocate a CtryIdx key over ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryCcyByCtryIdxKey newByCtryIdxKey();

	/**
	 *	Allocate a protected CtryIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyByCtryIdxKey asProtected(ISecureISOCtryCcyByCtryIdxKey src);

	/**
	 *	Allocate a public CtryIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyByCtryIdxKey asPublic(ISecureISOCtryCcyByCtryIdxKey src);

	/**
	 *	Allocate a CcyIdx key over ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryCcyByCcyIdxKey newByCcyIdxKey();

	/**
	 *	Allocate a protected CcyIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyByCcyIdxKey asProtected(ISecureISOCtryCcyByCcyIdxKey src);

	/**
	 *	Allocate a public CcyIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyByCcyIdxKey asPublic(ISecureISOCtryCcyByCcyIdxKey src);

	/**
	 *	Allocate a ISOCtryCcy interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryCcy newRec();

	/**
	 *	Allocate a protected ISOCtryCcy interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcy asProtected(ISecureISOCtryCcy src);

	/**
	 *	Allocate a public ISOCtryCcy interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcy asPublic(ISecureISOCtryCcy src);

	/**
	 *	Allocate a ISOCtryCcy history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryCcyH newHRec();

	/**
	 *	Allocate a protected ISOCtryCcy history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryCcyH asProtected(ISecureISOCtryCcyH src);

	/**
	 *	Allocate a public ISOCtryCcy history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryCcyH asPublic(ISecureISOCtryCcyH src);

}
