// Description: Java 11 Instance Edit Object interface for YCFBam RelationCol.

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

public interface IYCFBamRelationColEditObj
	extends IYCFBamRelationColObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFBamRelationColObj.
	 */
	IYCFBamRelationColObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFBamRelationColObj.
	 */
	IYCFBamRelationColObj getOrigAsRelationCol();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFBamRelationColObj create();

	/*
	 *	Update the instance.
	 */
	YCFBamRelationColEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFBamRelationColEditObj deleteInstance();

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
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The String value of the attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Set the optional String attribute ShortName.
	 *
	 *	@param	value	the String value of the attribute ShortName.
	 */
	void setOptionalShortName( String value );

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The String value of the attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Set the optional String attribute Label.
	 *
	 *	@param	value	the String value of the attribute Label.
	 */
	void setOptionalLabel( String value );

	/**
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The String value of the attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Set the optional String attribute ShortDescription.
	 *
	 *	@param	value	the String value of the attribute ShortDescription.
	 */
	void setOptionalShortDescription( String value );

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The String value of the attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Set the optional String attribute Description.
	 *
	 *	@param	value	the String value of the attribute Description.
	 */
	void setOptionalDescription( String value );

	/**
	 *	Get the IYCFBamRelationObj instance referenced by the Relation key.
	 *
	 *	@return	The IYCFBamRelationObj instance referenced by the Relation key.
	 */
	IYCFBamRelationObj getRequiredContainerRelation();

	/**
	 *	Set the IYCFBamRelationObj instance referenced by the Relation key.
	 *
	 *	@param	value	the IYCFBamRelationObj instance to be referenced by the Relation key.
	 */
	void setRequiredContainerRelation( IYCFBamRelationObj value );

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
	 *	Get the IYCFBamRelationColObj instance referenced by the Prev key.
	 *
	 *	@return	The IYCFBamRelationColObj instance referenced by the Prev key.
	 */
	IYCFBamRelationColObj getOptionalLookupPrev();

	/**
	 *	Set the IYCFBamRelationColObj instance referenced by the Prev key.
	 *
	 *	@param	value	the IYCFBamRelationColObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( IYCFBamRelationColObj value );

	/**
	 *	Get the IYCFBamRelationColObj instance referenced by the Next key.
	 *
	 *	@return	The IYCFBamRelationColObj instance referenced by the Next key.
	 */
	IYCFBamRelationColObj getOptionalLookupNext();

	/**
	 *	Set the IYCFBamRelationColObj instance referenced by the Next key.
	 *
	 *	@param	value	the IYCFBamRelationColObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( IYCFBamRelationColObj value );

	/**
	 *	Get the IYCFBamIndexColObj instance referenced by the FromCol key.
	 *
	 *	@return	The IYCFBamIndexColObj instance referenced by the FromCol key.
	 */
	IYCFBamIndexColObj getRequiredLookupFromCol();

	/**
	 *	Set the IYCFBamIndexColObj instance referenced by the FromCol key.
	 *
	 *	@param	value	the IYCFBamIndexColObj instance to be referenced by the FromCol key.
	 */
	void setRequiredLookupFromCol( IYCFBamIndexColObj value );

	/**
	 *	Get the IYCFBamIndexColObj instance referenced by the ToCol key.
	 *
	 *	@return	The IYCFBamIndexColObj instance referenced by the ToCol key.
	 */
	IYCFBamIndexColObj getRequiredLookupToCol();

	/**
	 *	Set the IYCFBamIndexColObj instance referenced by the ToCol key.
	 *
	 *	@param	value	the IYCFBamIndexColObj instance to be referenced by the ToCol key.
	 */
	void setRequiredLookupToCol( IYCFBamIndexColObj value );

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
