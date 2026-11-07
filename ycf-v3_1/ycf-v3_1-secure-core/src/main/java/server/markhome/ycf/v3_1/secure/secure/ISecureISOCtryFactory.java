
// Description: Java JPA Factory interface for ISOCtry.

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
 *	ISecureISOCtryFactory interface for ISOCtry
 */
public interface ISecureISOCtryFactory extends ISecureProtISOCtryFactory
{

	/**
	 *	Allocate a primary history key for ISOCtry instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureISOCtryHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for ISOCtry instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOCtryHPKey asProtected(ISecureISOCtryHPKey src);

	/**
	 *	Allocate a public primary history key for ISOCtry instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOCtryHPKey asPublic(ISecureISOCtryHPKey src);

	/**
	 *	Allocate a ISOCodeIdx key over ISOCtry instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryByISOCodeIdxKey newByISOCodeIdxKey();

	/**
	 *	Allocate a protected ISOCodeIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryByISOCodeIdxKey asProtected(ISecureISOCtryByISOCodeIdxKey src);

	/**
	 *	Allocate a public ISOCodeIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryByISOCodeIdxKey asPublic(ISecureISOCtryByISOCodeIdxKey src);

	/**
	 *	Allocate a NameIdx key over ISOCtry instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryByNameIdxKey asProtected(ISecureISOCtryByNameIdxKey src);

	/**
	 *	Allocate a public NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryByNameIdxKey asPublic(ISecureISOCtryByNameIdxKey src);

	/**
	 *	Allocate a ISOCtry interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtry newRec();

	/**
	 *	Allocate a protected ISOCtry interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtry asProtected(ISecureISOCtry src);

	/**
	 *	Allocate a public ISOCtry interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtry asPublic(ISecureISOCtry src);

	/**
	 *	Allocate a ISOCtry history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryH newHRec();

	/**
	 *	Allocate a protected ISOCtry history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryH asProtected(ISecureISOCtryH src);

	/**
	 *	Allocate a public ISOCtry history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryH asPublic(ISecureISOCtryH src);

}
