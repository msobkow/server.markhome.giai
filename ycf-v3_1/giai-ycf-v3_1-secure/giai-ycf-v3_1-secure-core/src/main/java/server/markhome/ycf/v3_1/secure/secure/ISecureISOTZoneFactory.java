
// Description: Java JPA Factory interface for ISOTZone.

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
 *	ISecureISOTZoneFactory interface for ISOTZone
 */
public interface ISecureISOTZoneFactory extends ISecureProtISOTZoneFactory
{

	/**
	 *	Allocate a primary history key for ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureISOTZoneHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for ISOTZone instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOTZoneHPKey asProtected(ISecureISOTZoneHPKey src);

	/**
	 *	Allocate a public primary history key for ISOTZone instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOTZoneHPKey asPublic(ISecureISOTZoneHPKey src);

	/**
	 *	Allocate a OffsetIdx key over ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOTZoneByOffsetIdxKey newByOffsetIdxKey();

	/**
	 *	Allocate a protected OffsetIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOTZoneByOffsetIdxKey asProtected(ISecureISOTZoneByOffsetIdxKey src);

	/**
	 *	Allocate a public OffsetIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOTZoneByOffsetIdxKey asPublic(ISecureISOTZoneByOffsetIdxKey src);

	/**
	 *	Allocate a UTZNameIdx key over ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOTZoneByUTZNameIdxKey newByUTZNameIdxKey();

	/**
	 *	Allocate a protected UTZNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOTZoneByUTZNameIdxKey asProtected(ISecureISOTZoneByUTZNameIdxKey src);

	/**
	 *	Allocate a public UTZNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOTZoneByUTZNameIdxKey asPublic(ISecureISOTZoneByUTZNameIdxKey src);

	/**
	 *	Allocate a Iso8601Idx key over ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOTZoneByIso8601IdxKey newByIso8601IdxKey();

	/**
	 *	Allocate a protected Iso8601Idx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOTZoneByIso8601IdxKey asProtected(ISecureISOTZoneByIso8601IdxKey src);

	/**
	 *	Allocate a public Iso8601Idx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOTZoneByIso8601IdxKey asPublic(ISecureISOTZoneByIso8601IdxKey src);

	/**
	 *	Allocate a ISOTZone interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOTZone newRec();

	/**
	 *	Allocate a protected ISOTZone interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOTZone asProtected(ISecureISOTZone src);

	/**
	 *	Allocate a public ISOTZone interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOTZone asPublic(ISecureISOTZone src);

	/**
	 *	Allocate a ISOTZone history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOTZoneH newHRec();

	/**
	 *	Allocate a protected ISOTZone history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOTZoneH asProtected(ISecureISOTZoneH src);

	/**
	 *	Allocate a public ISOTZone history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOTZoneH asPublic(ISecureISOTZoneH src);

}
