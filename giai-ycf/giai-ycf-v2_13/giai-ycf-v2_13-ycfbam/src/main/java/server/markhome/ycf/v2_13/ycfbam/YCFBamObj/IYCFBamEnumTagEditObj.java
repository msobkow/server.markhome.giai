// Description: Java 11 Instance Edit Object interface for YCFBam EnumTag.

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

public interface IYCFBamEnumTagEditObj
	extends IYCFBamEnumTagObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFBamEnumTagObj.
	 */
	IYCFBamEnumTagObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFBamEnumTagObj.
	 */
	IYCFBamEnumTagObj getOrigAsEnumTag();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFBamEnumTagObj create();

	/*
	 *	Update the instance.
	 */
	YCFBamEnumTagEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFBamEnumTagEditObj deleteInstance();

	/**
	 *	Get the optional Short attribute EnumCode.
	 *
	 *	@return	The Short value of the attribute EnumCode.
	 */
	Short getOptionalEnumCode();

	/**
	 *	Set the optional Short attribute EnumCode.
	 *
	 *	@param	value	the Short value of the attribute EnumCode.
	 */
	void setOptionalEnumCode( Short value );

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
	 *	Get the IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the IYCFSecTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( IYCFSecTenantObj value );

	/**
	 *	Get the IYCFBamEnumDefObj instance referenced by the EnumDef key.
	 *
	 *	@return	The IYCFBamEnumDefObj instance referenced by the EnumDef key.
	 */
	IYCFBamEnumDefObj getRequiredContainerEnumDef();

	/**
	 *	Set the IYCFBamEnumDefObj instance referenced by the EnumDef key.
	 *
	 *	@param	value	the IYCFBamEnumDefObj instance to be referenced by the EnumDef key.
	 */
	void setRequiredContainerEnumDef( IYCFBamEnumDefObj value );

	/**
	 *	Get the IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Set the IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@param	value	the IYCFBamSchemaDefObj instance to be referenced by the DefSchema key.
	 */
	void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value );

	/**
	 *	Get the IYCFBamEnumTagObj instance referenced by the Prev key.
	 *
	 *	@return	The IYCFBamEnumTagObj instance referenced by the Prev key.
	 */
	IYCFBamEnumTagObj getOptionalLookupPrev();

	/**
	 *	Set the IYCFBamEnumTagObj instance referenced by the Prev key.
	 *
	 *	@param	value	the IYCFBamEnumTagObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( IYCFBamEnumTagObj value );

	/**
	 *	Get the IYCFBamEnumTagObj instance referenced by the Next key.
	 *
	 *	@return	The IYCFBamEnumTagObj instance referenced by the Next key.
	 */
	IYCFBamEnumTagObj getOptionalLookupNext();

	/**
	 *	Set the IYCFBamEnumTagObj instance referenced by the Next key.
	 *
	 *	@param	value	the IYCFBamEnumTagObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( IYCFBamEnumTagObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The IYCFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( IYCFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The IYCFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( IYCFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
