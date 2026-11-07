
// Description: Java JPA Factory interface for ISOCtryLang.

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
 *	ISecureISOCtryLangFactory interface for ISOCtryLang
 */
public interface ISecureISOCtryLangFactory extends ISecureProtISOCtryLangFactory
{

	/**
	 *	Allocate a primary key for ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryLangPKey newPKey();

	/**
	 *	Allocate a protected key for ISOCtryLang instances from a private key.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangPKey asProtected(ISecureISOCtryLangPKey src);

	/**
	 *	Allocate a public key for ISOCtryLang instances from a private key.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangPKey asPublic(ISecureISOCtryLangPKey src);

	/**
	 *	Allocate a primary history key for ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureISOCtryLangHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for ISOCtryLang instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOCtryLangHPKey asProtected(ISecureISOCtryLangHPKey src);

	/**
	 *	Allocate a public primary history key for ISOCtryLang instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOCtryLangHPKey asPublic(ISecureISOCtryLangHPKey src);

	/**
	 *	Allocate a CtryIdx key over ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryLangByCtryIdxKey newByCtryIdxKey();

	/**
	 *	Allocate a protected CtryIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangByCtryIdxKey asProtected(ISecureISOCtryLangByCtryIdxKey src);

	/**
	 *	Allocate a public CtryIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangByCtryIdxKey asPublic(ISecureISOCtryLangByCtryIdxKey src);

	/**
	 *	Allocate a LangIdx key over ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryLangByLangIdxKey newByLangIdxKey();

	/**
	 *	Allocate a protected LangIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangByLangIdxKey asProtected(ISecureISOCtryLangByLangIdxKey src);

	/**
	 *	Allocate a public LangIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangByLangIdxKey asPublic(ISecureISOCtryLangByLangIdxKey src);

	/**
	 *	Allocate a ISOCtryLang interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryLang newRec();

	/**
	 *	Allocate a protected ISOCtryLang interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLang asProtected(ISecureISOCtryLang src);

	/**
	 *	Allocate a public ISOCtryLang interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLang asPublic(ISecureISOCtryLang src);

	/**
	 *	Allocate a ISOCtryLang history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureISOCtryLangH newHRec();

	/**
	 *	Allocate a protected ISOCtryLang history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangH asProtected(ISecureISOCtryLangH src);

	/**
	 *	Allocate a public ISOCtryLang history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangH asPublic(ISecureISOCtryLangH src);

}
