
// Description: Java JPA Factory interface for SecSysGrp.

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
 *	ISecureSecSysGrpFactory interface for SecSysGrp
 */
public interface ISecureSecSysGrpFactory extends ISecureProtSecSysGrpFactory
{

	/**
	 *	Allocate a primary history key for SecSysGrp instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSecSysGrpHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SecSysGrp instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecSysGrpHPKey asProtected(ISecureSecSysGrpHPKey src);

	/**
	 *	Allocate a public primary history key for SecSysGrp instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubSecSysGrpHPKey asPublic(ISecureSecSysGrpHPKey src);

	/**
	 *	Allocate a UNameIdx key over SecSysGrp instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpByUNameIdxKey asProtected(ISecureSecSysGrpByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSysGrpByUNameIdxKey asPublic(ISecureSecSysGrpByUNameIdxKey src);

	/**
	 *	Allocate a SecLevelIdx key over SecSysGrp instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpBySecLevelIdxKey newBySecLevelIdxKey();

	/**
	 *	Allocate a protected SecLevelIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpBySecLevelIdxKey asProtected(ISecureSecSysGrpBySecLevelIdxKey src);

	/**
	 *	Allocate a public SecLevelIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSysGrpBySecLevelIdxKey asPublic(ISecureSecSysGrpBySecLevelIdxKey src);

	/**
	 *	Allocate a SecSysGrp interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrp newRec();

	/**
	 *	Allocate a protected SecSysGrp interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrp asProtected(ISecureSecSysGrp src);

	/**
	 *	Allocate a public SecSysGrp interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSysGrp asPublic(ISecureSecSysGrp src);

	/**
	 *	Allocate a SecSysGrp history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysGrpH newHRec();

	/**
	 *	Allocate a protected SecSysGrp history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysGrpH asProtected(ISecureSecSysGrpH src);

	/**
	 *	Allocate a public SecSysGrp history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSysGrpH asPublic(ISecureSecSysGrpH src);

}
