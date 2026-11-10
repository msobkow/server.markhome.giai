// Description: Java 11 YCFBam Table Permissions Interface.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFBamTablePerms
extends IYCFSecTablePerms,
	IYCFIntTablePerms
{
	/**
	 *	Is the session allowed to create Atom instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateAtom( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Atom instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadAtom( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Atom instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateAtom( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Atom instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteAtom( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create BlobCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateBlobCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read BlobCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadBlobCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update BlobCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateBlobCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete BlobCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteBlobCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create BlobDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateBlobDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read BlobDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadBlobDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update BlobDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateBlobDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete BlobDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteBlobDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create BlobType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateBlobType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read BlobType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadBlobType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update BlobType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateBlobType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete BlobType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteBlobType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create BoolCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateBoolCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read BoolCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadBoolCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update BoolCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateBoolCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete BoolCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteBoolCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create BoolDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateBoolDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read BoolDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadBoolDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update BoolDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateBoolDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete BoolDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteBoolDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create BoolType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateBoolType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read BoolType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadBoolType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update BoolType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateBoolType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete BoolType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteBoolType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Chain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateChain( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Chain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadChain( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Chain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateChain( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Chain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteChain( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ClearDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateClearDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ClearDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadClearDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ClearDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateClearDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ClearDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteClearDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ClearSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateClearSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ClearSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadClearSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ClearSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateClearSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ClearSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteClearSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ClearSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateClearSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ClearSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadClearSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ClearSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateClearSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ClearSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteClearSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ClearSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateClearSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ClearSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadClearSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ClearSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateClearSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ClearSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteClearSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ClearTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateClearTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ClearTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadClearTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ClearTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateClearTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ClearTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteClearTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash128Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash128Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash128Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash128Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash128Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash128Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash128Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash128Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash128Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash128Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash128Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash128Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash128Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash128Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash128Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash128Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash128Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash128Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash128Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash128Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash128Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash128Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash128Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash128Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash128Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash128Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash128Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash128Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash128Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash128Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash128Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash128Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash160Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash160Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash160Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash160Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash160Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash160Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash160Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash160Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash160Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash160Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash160Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash160Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash160Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash160Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash160Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash160Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash160Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash160Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash160Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash160Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash160Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash160Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash160Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash160Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash160Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash160Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash160Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash160Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash160Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash160Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash160Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash160Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash224Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash224Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash224Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash224Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash224Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash224Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash224Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash224Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash224Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash224Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash224Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash224Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash224Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash224Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash224Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash224Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash224Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash224Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash224Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash224Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash224Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash224Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash224Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash224Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash224Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash224Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash224Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash224Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash224Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash224Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash224Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash224Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash256Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash256Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash256Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash256Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash256Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash256Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash256Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash256Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash256Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash256Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash256Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash256Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash256Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash256Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash256Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash256Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash256Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash256Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash256Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash256Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash256Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash256Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash256Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash256Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash256Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash256Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash256Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash256Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash256Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash256Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash256Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash256Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash384Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash384Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash384Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash384Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash384Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash384Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash384Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash384Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash384Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash384Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash384Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash384Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash384Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash384Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash384Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash384Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash384Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash384Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash384Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash384Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash384Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash384Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash384Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash384Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash384Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash384Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash384Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash384Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash384Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash384Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash384Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash384Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash512Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash512Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash512Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash512Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash512Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash512Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash512Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash512Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash512Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash512Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash512Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash512Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash512Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash512Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash512Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash512Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash512Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash512Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash512Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash512Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash512Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash512Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash512Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash512Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DbKeyHash512Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDbKeyHash512Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DbKeyHash512Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDbKeyHash512Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DbKeyHash512Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDbKeyHash512Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DbKeyHash512Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDbKeyHash512Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DelDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDelDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DelDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDelDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DelDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDelDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DelDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDelDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DelSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDelSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DelSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDelSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DelSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDelSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DelSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDelSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DelSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDelSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DelSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDelSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DelSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDelSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DelSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDelSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DelSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDelSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DelSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDelSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DelSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDelSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DelSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDelSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DelTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDelTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DelTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDelTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DelTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDelTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DelTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDelTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DoubleCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDoubleCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DoubleCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDoubleCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DoubleCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDoubleCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DoubleCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDoubleCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DoubleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDoubleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DoubleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDoubleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DoubleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDoubleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DoubleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDoubleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create DoubleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDoubleType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read DoubleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDoubleType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update DoubleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDoubleType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DoubleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDoubleType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create EnumDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateEnumDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read EnumDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadEnumDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update EnumDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateEnumDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete EnumDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteEnumDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create EnumTag instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateEnumTag( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read EnumTag instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadEnumTag( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update EnumTag instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateEnumTag( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete EnumTag instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteEnumTag( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create EnumType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateEnumType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read EnumType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadEnumType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update EnumType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateEnumType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete EnumType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteEnumType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create FloatCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateFloatCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read FloatCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadFloatCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update FloatCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateFloatCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete FloatCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteFloatCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create FloatDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateFloatDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read FloatDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadFloatDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update FloatDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateFloatDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete FloatDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteFloatDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create FloatType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateFloatType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read FloatType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadFloatType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update FloatType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateFloatType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete FloatType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteFloatType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Id16Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateId16Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Id16Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadId16Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Id16Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateId16Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Id16Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteId16Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Id32Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateId32Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Id32Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadId32Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Id32Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateId32Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Id32Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteId32Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Id64Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateId64Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Id64Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadId64Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Id64Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateId64Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Id64Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteId64Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Index instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateIndex( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Index instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadIndex( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Index instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateIndex( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Index instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteIndex( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create IndexCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateIndexCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read IndexCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadIndexCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update IndexCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateIndexCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete IndexCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteIndexCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create IndexTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateIndexTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read IndexTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadIndexTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update IndexTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateIndexTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete IndexTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteIndexTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Int64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Int64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Int64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Int64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NmTokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNmTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NmTokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNmTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NmTokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNmTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NmTokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNmTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NmTokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNmTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NmTokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNmTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NmTokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNmTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NmTokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNmTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NmTokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNmTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NmTokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNmTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NmTokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNmTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NmTokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNmTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NmTokensCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNmTokensCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NmTokensCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNmTokensCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NmTokensCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNmTokensCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NmTokensCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNmTokensCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NmTokensDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNmTokensDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NmTokensDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNmTokensDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NmTokensDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNmTokensDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NmTokensDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNmTokensDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NmTokensType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNmTokensType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NmTokensType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNmTokensType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NmTokensType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNmTokensType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NmTokensType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNmTokensType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NumberCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNumberCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NumberCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNumberCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NumberCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNumberCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NumberCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNumberCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NumberDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNumberDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NumberDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNumberDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NumberDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNumberDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NumberDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNumberDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create NumberType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateNumberType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read NumberType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadNumberType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update NumberType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateNumberType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete NumberType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteNumberType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Param instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateParam( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Param instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadParam( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Param instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateParam( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Param instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteParam( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create PopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreatePopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read PopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadPopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update PopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdatePopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete PopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeletePopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create PopSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreatePopSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read PopSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadPopSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update PopSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdatePopSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete PopSubDep1 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeletePopSubDep1( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create PopSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreatePopSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read PopSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadPopSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update PopSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdatePopSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete PopSubDep2 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeletePopSubDep2( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create PopSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreatePopSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read PopSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadPopSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update PopSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdatePopSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete PopSubDep3 instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeletePopSubDep3( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create PopTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreatePopTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read PopTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadPopTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update PopTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdatePopTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete PopTopDep instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeletePopTopDep( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Relation instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateRelation( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Relation instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadRelation( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Relation instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateRelation( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Relation instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteRelation( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create RelationCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateRelationCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read RelationCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadRelationCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update RelationCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateRelationCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete RelationCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteRelationCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create RoleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateRoleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read RoleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadRoleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update RoleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateRoleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete RoleDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteRoleDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SchemaDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSchemaDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SchemaDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSchemaDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SchemaDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSchemaDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SchemaDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSchemaDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SchemaRef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSchemaRef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SchemaRef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSchemaRef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SchemaRef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSchemaRef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SchemaRef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSchemaRef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SchemaRole instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSchemaRole( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SchemaRole instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSchemaRole( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SchemaRole instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSchemaRole( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SchemaRole instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSchemaRole( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SchemaTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSchemaTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SchemaTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSchemaTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SchemaTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSchemaTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SchemaTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSchemaTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Scope instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateScope( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Scope instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadScope( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Scope instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateScope( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Scope instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteScope( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ServerListFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateServerListFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ServerListFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadServerListFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ServerListFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateServerListFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ServerListFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteServerListFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ServerMethod instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateServerMethod( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ServerMethod instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadServerMethod( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ServerMethod instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateServerMethod( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ServerMethod instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteServerMethod( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ServerObjFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateServerObjFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ServerObjFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadServerObjFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ServerObjFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateServerObjFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ServerObjFunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteServerObjFunc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ServerProc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateServerProc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ServerProc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadServerProc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ServerProc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateServerProc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ServerProc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteServerProc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create StringCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateStringCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read StringCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadStringCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update StringCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateStringCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete StringCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteStringCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create StringDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateStringDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read StringDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadStringDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update StringDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateStringDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete StringDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteStringDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create StringType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateStringType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read StringType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadStringType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update StringType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateStringType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete StringType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteStringType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZDateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZDateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZDateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZDateCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZDateCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZDateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZDateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZDateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZDateDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZDateDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZDateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZDateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZDateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZDateType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZDateType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZTimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZTimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZTimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZTimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZTimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZTimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZTimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZTimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZTimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZTimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZTimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZTimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZTimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZTimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZTimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZTimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZTimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZTimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZTimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZTimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TZTimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTZTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TZTimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTZTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TZTimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTZTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TZTimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTZTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Table instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTable( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Table instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTable( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Table instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTable( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Table instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTable( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TableCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTableCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TableCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTableCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TableCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTableCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TableCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTableCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TableTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTableTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TableTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTableTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TableTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTableTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TableTweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTableTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TextCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTextCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TextCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTextCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TextCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTextCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TextCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTextCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TextDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTextDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TextDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTextDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TextDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTextDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TextDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTextDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TextType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTextType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TextType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTextType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TextType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTextType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TextType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTextType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TimeCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTimeCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TimeDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTimeDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTimeType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TimestampCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTimestampCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TimestampDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTimestampDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TimestampType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTimestampType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TokenCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTokenCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TokenDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTokenDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TokenType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTokenType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Tweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Tweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Tweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Tweak instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTweak( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt16Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt16Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt16Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt16Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt16Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt16Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt32Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt32Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt32Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt32Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt32Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt32Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt64Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt64Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt64Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt64Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UInt64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UInt64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UInt64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UInt64Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUInt64Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Uuid6Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuid6Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Uuid6Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuid6Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Uuid6Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuid6Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Uuid6Col instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuid6Col( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Uuid6Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuid6Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Uuid6Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuid6Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Uuid6Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuid6Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Uuid6Def instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuid6Def( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Uuid6Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuid6Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Uuid6Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuid6Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Uuid6Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuid6Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Uuid6Gen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuid6Gen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Uuid6Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuid6Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Uuid6Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuid6Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Uuid6Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuid6Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Uuid6Type instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuid6Type( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UuidCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuidCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UuidCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuidCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UuidCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuidCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UuidCol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuidCol( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UuidDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuidDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UuidDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuidDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UuidDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuidDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UuidDef instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuidDef( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UuidGen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuidGen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UuidGen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuidGen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UuidGen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuidGen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UuidGen instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuidGen( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create UuidType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateUuidType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read UuidType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadUuidType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update UuidType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateUuidType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete UuidType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteUuidType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Value instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateValue( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Value instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadValue( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Value instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateValue( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Value instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteValue( YCFSecAuthorization Authorization );
}
