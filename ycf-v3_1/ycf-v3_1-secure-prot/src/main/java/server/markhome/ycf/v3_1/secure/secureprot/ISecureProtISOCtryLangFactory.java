
// Description: Java Protected Factory interface for ISOCtryLang.

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
 *	ISecureProtISOCtryLangFactory protected interface for ISOCtryLang
 */
public interface ISecureProtISOCtryLangFactory extends ISecurePubISOCtryLangFactory
{

	/**
	 *	Allocate a primary key for ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangPKey newProtPKey();

	/**
	 *	Allocate a public key for ISOCtryLang instances from a protected key.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangPKey asPublic(ISecureProtISOCtryLangPKey src);

	/**
	 *	Allocate a protected primary history key for ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtISOCtryLangHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for ISOCtryLang instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubISOCtryLangHPKey asPublic(ISecureProtISOCtryLangHPKey src);

	/**
	 *	Allocate a protected CtryIdx key over protected ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangByCtryIdxKey newProtByCtryIdxKey();

	/**
	 *	Allocate a public CtryIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangByCtryIdxKey asPublic(ISecureProtISOCtryLangByCtryIdxKey src);

	/**
	 *	Allocate a protected LangIdx key over protected ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangByLangIdxKey newProtByLangIdxKey();

	/**
	 *	Allocate a public LangIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangByLangIdxKey asPublic(ISecureProtISOCtryLangByLangIdxKey src);

	/**
	 *	Allocate a protected ISOCtryLang interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLang newProtRec();

	/**
	 *	Allocate a public ISOCtryLang interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLang asPublic(ISecureProtISOCtryLang src);

	/**
	 *	Allocate a protected ISOCtryLang history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtISOCtryLangH newProtHRec();

	/**
	 *	Allocate a public ISOCtryLang history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubISOCtryLangH asPublic(ISecureProtISOCtryLangH src);

}
