
// Description: Java 11 Factory interface for IndexCol.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

/*
 *	CFBamIndexColFactory interface for IndexCol
 */
public interface ICFBamIndexColFactory
{

	/**
	 *	Allocate a primary key for IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColPKey newPKey();

	/**
	 *	Allocate a primary history key for IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColHPKey newHPKey();

	/**
	 *	Allocate a UNameIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a IdxColTenantIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIdxColTenantIdxKey newIdxColTenantIdxKey();

	/**
	 *	Allocate a IndexIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIndexIdxKey newIndexIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a ColIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByColIdxKey newColIdxKey();

	/**
	 *	Allocate a PrevIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a IdxPrevIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIdxPrevIdxKey newIdxPrevIdxKey();

	/**
	 *	Allocate a IdxNextIdx key over IndexCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColByIdxNextIdxKey newIdxNextIdxKey();

	/**
	 *	Allocate a IndexCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColBuff newBuff();

	/**
	 *	Allocate a IndexCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamIndexColHBuff newHBuff();

}
