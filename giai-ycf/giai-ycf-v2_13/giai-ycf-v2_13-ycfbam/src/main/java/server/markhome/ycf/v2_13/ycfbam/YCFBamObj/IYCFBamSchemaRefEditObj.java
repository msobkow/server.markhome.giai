// Description: Java 11 Instance Edit Object interface for YCFBam SchemaRef.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamSchemaRefEditObj
	extends IYCFBamSchemaRefObj,
		IYCFBamScopeEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFBamSchemaRefObj.
	 */
	IYCFBamSchemaRefObj getOrigAsSchemaRef();

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
	 *	Get the IYCFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The IYCFBamSchemaDefObj instance referenced by the Schema key.
	 */
	IYCFBamSchemaDefObj getRequiredContainerSchema();

	/**
	 *	Set the IYCFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@param	value	the IYCFBamSchemaDefObj instance to be referenced by the Schema key.
	 */
	void setRequiredContainerSchema( IYCFBamSchemaDefObj value );

	/**
	 *	Get the IYCFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The IYCFBamSchemaDefObj instance referenced by the RefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupRefSchema();

	/**
	 *	Set the IYCFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@param	value	the IYCFBamSchemaDefObj instance to be referenced by the RefSchema key.
	 */
	void setOptionalLookupRefSchema( IYCFBamSchemaDefObj value );

	/**
	 *	Get the IYCFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The IYCFBamSchemaRefObj instance referenced by the Prev key.
	 */
	IYCFBamSchemaRefObj getOptionalLookupPrev();

	/**
	 *	Set the IYCFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@param	value	the IYCFBamSchemaRefObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( IYCFBamSchemaRefObj value );

	/**
	 *	Get the IYCFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The IYCFBamSchemaRefObj instance referenced by the Next key.
	 */
	IYCFBamSchemaRefObj getOptionalLookupNext();

	/**
	 *	Set the IYCFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@param	value	the IYCFBamSchemaRefObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( IYCFBamSchemaRefObj value );
}
