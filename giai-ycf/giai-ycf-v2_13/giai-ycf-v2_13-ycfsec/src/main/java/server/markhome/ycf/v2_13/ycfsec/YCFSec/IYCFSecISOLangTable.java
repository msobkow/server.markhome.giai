
// Description: Java 11 DbIO interface for ISOLang.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

/*
 *	YCFSecISOLangTable database interface for ISOLang
 */
public interface IYCFSecISOLangTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createISOLang( YCFSecAuthorization Authorization,
		YCFSecISOLangBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateISOLang( YCFSecAuthorization Authorization,
		YCFSecISOLangBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteISOLang( YCFSecAuthorization Authorization,
		YCFSecISOLangBuff Buff );
	/**
	 *	Delete the ISOLang instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByIdIdx( YCFSecAuthorization Authorization,
		short argISOLangId );

	/**
	 *	Delete the ISOLang instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteISOLangByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey argKey );
	/**
	 *	Delete the ISOLang instances identified by the key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode3Idx( YCFSecAuthorization Authorization,
		String argISO6392Code );

	/**
	 *	Delete the ISOLang instances identified by the key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOLangByCode3Idx( YCFSecAuthorization Authorization,
		YCFSecISOLangByCode3IdxKey argKey );
	/**
	 *	Delete the ISOLang instances identified by the key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode2Idx( YCFSecAuthorization Authorization,
		String argISO6391Code );

	/**
	 *	Delete the ISOLang instances identified by the key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOLangByCode2Idx( YCFSecAuthorization Authorization,
		YCFSecISOLangByCode2IdxKey argKey );


	/**
	 *	Read the derived ISOLang buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOLangBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey );

	/**
	 *	Lock the derived ISOLang buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOLangBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey );

	/**
	 *	Read all ISOLang instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecISOLangBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived ISOLang buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOLangBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOLangId );

	/**
	 *	Read the derived ISOLang buffer instance identified by the unique key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOLangBuff readDerivedByCode3Idx( YCFSecAuthorization Authorization,
		String ISO6392Code );

	/**
	 *	Read an array of the derived ISOLang buffer instances identified by the duplicate key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecISOLangBuff[] readDerivedByCode2Idx( YCFSecAuthorization Authorization,
		String ISO6391Code );

	/**
	 *	Read the specific ISOLang buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOLangBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey );

	/**
	 *	Lock the specific ISOLang buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOLangBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey );

	/**
	 *	Read all the specific ISOLang buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOLang instances in the database accessible for the Authorization.
	 */
	YCFSecISOLangBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific ISOLang buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOLangBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOLangId );

	/**
	 *	Read the specific ISOLang buffer instance identified by the unique key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOLangBuff readBuffByCode3Idx( YCFSecAuthorization Authorization,
		String ISO6392Code );

	/**
	 *	Read an array of the specific ISOLang buffer instances identified by the duplicate key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOLangBuff[] readBuffByCode2Idx( YCFSecAuthorization Authorization,
		String ISO6391Code );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
