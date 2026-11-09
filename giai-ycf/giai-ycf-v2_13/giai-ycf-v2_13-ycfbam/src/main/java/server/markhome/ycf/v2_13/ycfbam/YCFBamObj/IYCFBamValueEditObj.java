// Description: Java 11 Instance Edit Object interface for CFBam Value.

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

public interface ICFBamValueEditObj
	extends ICFBamValueObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFBamValueObj.
	 */
	ICFBamValueObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamValueObj.
	 */
	ICFBamValueObj getOrigAsValue();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFBamValueObj create();

	/*
	 *	Update the instance.
	 */
	CFBamValueEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFBamValueEditObj deleteInstance();

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
	 *	Get the optional String attribute DefaultXmlValue.
	 *
	 *	@return	The String value of the attribute DefaultXmlValue.
	 */
	String getOptionalDefaultXmlValue();

	/**
	 *	Set the optional String attribute DefaultXmlValue.
	 *
	 *	@param	value	the String value of the attribute DefaultXmlValue.
	 */
	void setOptionalDefaultXmlValue( String value );

	/**
	 *	Get the required boolean attribute IsNullable.
	 *
	 *	@return	The boolean value of the attribute IsNullable.
	 */
	boolean getRequiredIsNullable();

	/**
	 *	Set the required boolean attribute IsNullable.
	 *
	 *	@param	value	the boolean value of the attribute IsNullable.
	 */
	void setRequiredIsNullable( boolean value );

	/**
	 *	Get the optional Boolean attribute GenerateId.
	 *
	 *	@return	The Boolean value of the attribute GenerateId.
	 */
	Boolean getOptionalGenerateId();

	/**
	 *	Set the optional Boolean attribute GenerateId.
	 *
	 *	@param	value	the Boolean value of the attribute GenerateId.
	 */
	void setOptionalGenerateId( Boolean value );

	/**
	 *	Get the required boolean attribute ImplementsPolymorph.
	 *
	 *	@return	The boolean value of the attribute ImplementsPolymorph.
	 */
	boolean getRequiredImplementsPolymorph();

	/**
	 *	Set the required boolean attribute ImplementsPolymorph.
	 *
	 *	@param	value	the boolean value of the attribute ImplementsPolymorph.
	 */
	void setRequiredImplementsPolymorph( boolean value );

	/**
	 *	Get the required ICFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The ICFBamSchema.CodeVisibilityEnum value of the attribute CodeVis.
	 */
	ICFBamSchema.CodeVisibilityEnum getRequiredCodeVis();

	/**
	 *	Set the required ICFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@param	value	the ICFBamSchema.CodeVisibilityEnum value of the attribute CodeVis.
	 */
	void setRequiredCodeVis( ICFBamSchema.CodeVisibilityEnum value );

	/**
	 *	Get the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFSecTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ICFSecTenantObj value );

	/**
	 *	Get the ICFBamScopeObj instance referenced by the Scope key.
	 *
	 *	@return	The ICFBamScopeObj instance referenced by the Scope key.
	 */
	ICFBamScopeObj getRequiredContainerScope();

	/**
	 *	Set the ICFBamScopeObj instance referenced by the Scope key.
	 *
	 *	@param	value	the ICFBamScopeObj instance to be referenced by the Scope key.
	 */
	void setRequiredContainerScope( ICFBamScopeObj value );

	/**
	 *	Get the ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Set the ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@param	value	the ICFBamSchemaDefObj instance to be referenced by the DefSchema key.
	 */
	void setOptionalLookupDefSchema( ICFBamSchemaDefObj value );

	/**
	 *	Get the ICFBamValueObj instance referenced by the Prev key.
	 *
	 *	@return	The ICFBamValueObj instance referenced by the Prev key.
	 */
	ICFBamValueObj getOptionalLookupPrev();

	/**
	 *	Set the ICFBamValueObj instance referenced by the Prev key.
	 *
	 *	@param	value	the ICFBamValueObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( ICFBamValueObj value );

	/**
	 *	Get the ICFBamValueObj instance referenced by the Next key.
	 *
	 *	@return	The ICFBamValueObj instance referenced by the Next key.
	 */
	ICFBamValueObj getOptionalLookupNext();

	/**
	 *	Set the ICFBamValueObj instance referenced by the Next key.
	 *
	 *	@param	value	the ICFBamValueObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( ICFBamValueObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
