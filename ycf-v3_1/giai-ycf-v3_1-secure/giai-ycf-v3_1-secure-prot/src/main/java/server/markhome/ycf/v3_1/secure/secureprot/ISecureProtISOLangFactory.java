
// Description: Java Protected Factory interface for ISOLang.

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
 *	ISecureProtISOLangFactory protected interface for ISOLang
 */
public interface ISecureProtISOLangFactory extends ISecurePubISOLangFactory
{

	/**
	 *	Allocate a protected primary history key for ISOLang instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOLangHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for ISOLang instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOLangHPKey asPublic(ISecureProtISOLangHPKey src);

	/**
	 *	Allocate a protected Code3Idx key over protected ISOLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOLangByCode3IdxKey newProtByCode3IdxKey();

	/**
	 *	Allocate a public Code3Idx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOLangByCode3IdxKey asPublic(ISecureProtISOLangByCode3IdxKey src);

	/**
	 *	Allocate a protected Code2Idx key over protected ISOLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOLangByCode2IdxKey newProtByCode2IdxKey();

	/**
	 *	Allocate a public Code2Idx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOLangByCode2IdxKey asPublic(ISecureProtISOLangByCode2IdxKey src);

	/**
	 *	Allocate a protected ISOLang interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOLang newProtRec();

	/**
	 *	Allocate a public ISOLang interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOLang asPublic(ISecureProtISOLang src);

	/**
	 *	Allocate a protected ISOLang history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOLangH newProtHRec();

	/**
	 *	Allocate a public ISOLang history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOLangH asPublic(ISecureProtISOLangH src);

}
