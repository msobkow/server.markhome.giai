
// Description: Java 11 Factory interface for Value.

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

/*
 *	YCFBamValueFactory interface for Value
 */
public interface IYCFBamValueFactory
{

	/**
	 *	Allocate a primary key for Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValuePKey newPKey();

	/**
	 *	Allocate a primary history key for Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueHPKey newHPKey();

	/**
	 *	Allocate a UNameIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a ValTentIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByValTentIdxKey newValTentIdxKey();

	/**
	 *	Allocate a ScopeIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByScopeIdxKey newScopeIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a PrevIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a ContPrevIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByContPrevIdxKey newContPrevIdxKey();

	/**
	 *	Allocate a ContNextIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByContNextIdxKey newContNextIdxKey();

	/**
	 *	Allocate a CodeVisIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByCodeVisIdxKey newCodeVisIdxKey();

	/**
	 *	Allocate a ScopeCodeVisIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueByScopeCodeVisIdxKey newScopeCodeVisIdxKey();

	/**
	 *	Allocate a Value instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueBuff newBuff();

	/**
	 *	Allocate a Value history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFBamValueHBuff newHBuff();

}
