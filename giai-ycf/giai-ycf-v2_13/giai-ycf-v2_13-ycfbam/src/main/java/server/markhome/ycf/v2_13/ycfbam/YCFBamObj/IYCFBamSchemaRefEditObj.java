// Description: Java 11 Instance Edit Object interface for CFBam SchemaRef.

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

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamSchemaRefEditObj
	extends ICFBamSchemaRefObj,
		ICFBamScopeEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamSchemaRefObj.
	 */
	ICFBamSchemaRefObj getOrigAsSchemaRef();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

	/**
	 *	Get the required String attribute RefModelName.
	 *
	 *	@return	The String value of the attribute RefModelName.
	 */
	String getRequiredRefModelName();

	/**
	 *	Set the required String attribute RefModelName.
	 *
	 *	@param	value	the String value of the attribute RefModelName.
	 */
	void setRequiredRefModelName( String value );

	/**
	 *	Get the required String attribute IncludeRoot.
	 *
	 *	@return	The String value of the attribute IncludeRoot.
	 */
	String getRequiredIncludeRoot();

	/**
	 *	Set the required String attribute IncludeRoot.
	 *
	 *	@param	value	the String value of the attribute IncludeRoot.
	 */
	void setRequiredIncludeRoot( String value );

	/**
	 *	Get the ICFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The ICFBamSchemaDefObj instance referenced by the Schema key.
	 */
	ICFBamSchemaDefObj getRequiredContainerSchema();

	/**
	 *	Set the ICFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@param	value	the ICFBamSchemaDefObj instance to be referenced by the Schema key.
	 */
	void setRequiredContainerSchema( ICFBamSchemaDefObj value );

	/**
	 *	Get the ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupRefSchema();

	/**
	 *	Set the ICFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@param	value	the ICFBamSchemaDefObj instance to be referenced by the RefSchema key.
	 */
	void setOptionalLookupRefSchema( ICFBamSchemaDefObj value );

	/**
	 *	Get the ICFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The ICFBamSchemaRefObj instance referenced by the Prev key.
	 */
	ICFBamSchemaRefObj getOptionalLookupPrev();

	/**
	 *	Set the ICFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@param	value	the ICFBamSchemaRefObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( ICFBamSchemaRefObj value );

	/**
	 *	Get the ICFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The ICFBamSchemaRefObj instance referenced by the Next key.
	 */
	ICFBamSchemaRefObj getOptionalLookupNext();

	/**
	 *	Set the ICFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@param	value	the ICFBamSchemaRefObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( ICFBamSchemaRefObj value );
}
