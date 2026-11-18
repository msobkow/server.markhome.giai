
// Description: Java JPA Factory interface for SecSysGrpInc.

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
 *	ISecureSecSysGrpIncFactory interface for SecSysGrpInc
 */
public interface ISecureSecSysGrpIncFactory extends ISecureProtSecSysGrpIncFactory
{

	/**
	 *	Allocate a primary key for SecSysGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpIncPKey newPKey();

	/**
	 *	Allocate a protected key for SecSysGrpInc instances from a private key.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpIncPKey asProtected(ISecureSecSysGrpIncPKey src);

	/**
	 *	Allocate a primary history key for SecSysGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSecSysGrpIncHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SecSysGrpInc instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecSysGrpIncHPKey asProtected(ISecureSecSysGrpIncHPKey src);

	/**
	 *	Allocate a SysGrpIdx key over SecSysGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpIncBySysGrpIdxKey newBySysGrpIdxKey();

	/**
	 *	Allocate a protected SysGrpIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpIncBySysGrpIdxKey asProtected(ISecureSecSysGrpIncBySysGrpIdxKey src);

	/**
	 *	Allocate a NameIdx key over SecSysGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpIncByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpIncByNameIdxKey asProtected(ISecureSecSysGrpIncByNameIdxKey src);

	/**
	 *	Allocate a SecSysGrpInc interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpInc newRec();

	/**
	 *	Allocate a protected SecSysGrpInc interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpInc asProtected(ISecureSecSysGrpInc src);

	/**
	 *	Allocate a SecSysGrpInc history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpIncH newHRec();

	/**
	 *	Allocate a protected SecSysGrpInc history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpIncH asProtected(ISecureSecSysGrpIncH src);

}
