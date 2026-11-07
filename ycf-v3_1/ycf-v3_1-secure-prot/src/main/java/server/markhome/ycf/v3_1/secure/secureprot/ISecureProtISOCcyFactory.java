
// Description: Java Protected Factory interface for ISOCcy.

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
 *	ISecureProtISOCcyFactory protected interface for ISOCcy
 */
public interface ISecureProtISOCcyFactory extends ISecurePubISOCcyFactory
{

	/**
	 *	Allocate a protected primary history key for ISOCcy instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOCcyHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for ISOCcy instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOCcyHPKey asPublic(ISecureProtISOCcyHPKey src);

	/**
	 *	Allocate a protected CcyCdIdx key over protected ISOCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCcyByCcyCdIdxKey newProtByCcyCdIdxKey();

	/**
	 *	Allocate a public CcyCdIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCcyByCcyCdIdxKey asPublic(ISecureProtISOCcyByCcyCdIdxKey src);

	/**
	 *	Allocate a protected CcyNmIdx key over protected ISOCcy instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCcyByCcyNmIdxKey newProtByCcyNmIdxKey();

	/**
	 *	Allocate a public CcyNmIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCcyByCcyNmIdxKey asPublic(ISecureProtISOCcyByCcyNmIdxKey src);

	/**
	 *	Allocate a protected ISOCcy interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCcy newProtRec();

	/**
	 *	Allocate a public ISOCcy interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCcy asPublic(ISecureProtISOCcy src);

	/**
	 *	Allocate a protected ISOCcy history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCcyH newProtHRec();

	/**
	 *	Allocate a public ISOCcy history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCcyH asPublic(ISecureProtISOCcyH src);

}
