/*
 *	MSS Code Factory YCFBam 2.13 CustMSSBamYCF
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
 */

package org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF;

import java.util.ArrayList;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFGenContext
extends MssYCFGenContext
{
	protected volatile static IYCFBamSchemaDefObj manufacturingSchema = null;

	protected static ArrayList<IYCFBamSchemaDefObj> manufacturingSchemaStack = new ArrayList<>();

	public static IYCFBamSchemaDefObj pushManufacturingSchema(IYCFBamSchemaDefObj value) {
		if (manufacturingSchema != null) {
			manufacturingSchemaStack.add(manufacturingSchema);
		}
		manufacturingSchema = value;
		return(manufacturingSchema);
	}

	public static IYCFBamSchemaDefObj popManufacturingSchema() {
		if (!manufacturingSchemaStack.isEmpty()) {
			manufacturingSchema = manufacturingSchemaStack.getLast();
			manufacturingSchemaStack.removeLast();
		}
		return(manufacturingSchema);
	}

	public static void setManufacturingSchema( IYCFBamSchemaDefObj value ) {
		manufacturingSchema = value;
	}

	public static IYCFBamSchemaDefObj getManufacturingSchema() {
		return( manufacturingSchema );
	}

	/**
	 *	Construct an expansion context for the stack that pushes a sub class and definition.
	 */
	public MSSBamYCFGenContext(
		String				generatingBuild,
		MssYCFGenContext		genContext,
		String				subClassGenDefName,
		IYCFLibAnyObj		subObject )
	{
		super( generatingBuild,
			genContext,
			genContext.getGenEngine().fixGenDefName( subClassGenDefName ),
			subObject );
//		setManufacturingSchema( ((MSSBamYCFGenContext)genContext).getManufacturingSchema() );
		if( subObject instanceof IYCFBamSchemaDefObj ) {
			if( manufacturingSchema == null ) {
				manufacturingSchema = (IYCFBamSchemaDefObj)subObject;
			}
		}
	}

	/**
	 *	Construct an instance.  Only invoked to create binding entries.
	 */
	public MSSBamYCFGenContext(
		String				generatingBuild,
		MssYCFEngine			engine,
		String				argRootGenDir,
		String				toolset,
		String				scopeDefClassName,
		String				genDefClassName,
		String				itemName )
	{
		super( generatingBuild,
				engine,
				argRootGenDir,
				toolset,
				engine.fixGenDefName( scopeDefClassName ),
				engine.fixGenDefName( genDefClassName ),
				itemName );
	}

	/**
	 *	Construct an expansion context for the stack.
	 */
	public MSSBamYCFGenContext(
		String				generatingBuild,
		MssYCFEngine			engine,
		String				argRootGenDir,
		String				toolset,
		String				scopeDefClassName,
		String				genDefClassName,
		String				itemName,
		IYCFLibAnyObj		argGenDef,
		IYCFLibAnyObj		argScopeDef )
	{
		super( generatingBuild,
			engine,
			argRootGenDir,
			toolset,
			engine.fixGenDefName( scopeDefClassName ),
			engine.fixGenDefName( genDefClassName ),
			itemName,
			argGenDef,
			argScopeDef );
		if( argGenDef instanceof IYCFBamSchemaDefObj ) {
			if( manufacturingSchema == null ) {
				manufacturingSchema = (IYCFBamSchemaDefObj)argGenDef;
			}
		}
		else if( argScopeDef instanceof IYCFBamSchemaDefObj ) {
			if( manufacturingSchema == null ) {
				manufacturingSchema = (IYCFBamSchemaDefObj)argScopeDef;
			}
		}
	}

	/**
	 *	Build a reference context
	 */
	public MssYCFGenContext buildRefContext( String generatingBuild, IYCFLibAnyObj genDef ) {
		if( genDef instanceof IYCFBamSchemaDefObj ) {
			if( manufacturingSchema == null ) {
				manufacturingSchema = (IYCFBamSchemaDefObj)genDef;
			}
		}
		return( super.buildRefContext( generatingBuild, genDef ) );
	}
}
