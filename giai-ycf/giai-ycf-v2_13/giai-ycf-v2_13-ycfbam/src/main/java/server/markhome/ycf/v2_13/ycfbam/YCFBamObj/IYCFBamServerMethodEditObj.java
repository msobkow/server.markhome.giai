// Description: Java 11 Instance Edit Object interface for CFBam ServerMethod.

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

public interface ICFBamServerMethodEditObj
	extends ICFBamServerMethodObj,
		ICFBamScopeEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamServerMethodObj.
	 */
	ICFBamServerMethodObj getOrigAsServerMethod();

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
	 *	Get the optional String attribute Suffix.
	 *
	 *	@return	The String value of the attribute Suffix.
	 */
	String getOptionalSuffix();

	/**
	 *	Set the optional String attribute Suffix.
	 *
	 *	@param	value	the String value of the attribute Suffix.
	 */
	void setOptionalSuffix( String value );

	/**
	 *	Get the required boolean attribute IsInstanceMethod.
	 *
	 *	@return	The boolean value of the attribute IsInstanceMethod.
	 */
	boolean getRequiredIsInstanceMethod();

	/**
	 *	Set the required boolean attribute IsInstanceMethod.
	 *
	 *	@param	value	the boolean value of the attribute IsInstanceMethod.
	 */
	void setRequiredIsInstanceMethod( boolean value );

	/**
	 *	Get the required boolean attribute IsServerOnly.
	 *
	 *	@return	The boolean value of the attribute IsServerOnly.
	 */
	boolean getRequiredIsServerOnly();

	/**
	 *	Set the required boolean attribute IsServerOnly.
	 *
	 *	@param	value	the boolean value of the attribute IsServerOnly.
	 */
	void setRequiredIsServerOnly( boolean value );

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
	 *	Get the required String attribute JMethodBody.
	 *
	 *	@return	The String value of the attribute JMethodBody.
	 */
	String getRequiredJMethodBody();

	/**
	 *	Set the required String attribute JMethodBody.
	 *
	 *	@param	value	the String value of the attribute JMethodBody.
	 */
	void setRequiredJMethodBody( String value );

	/**
	 *	Get the required String attribute CppMethodBody.
	 *
	 *	@return	The String value of the attribute CppMethodBody.
	 */
	String getRequiredCppMethodBody();

	/**
	 *	Set the required String attribute CppMethodBody.
	 *
	 *	@param	value	the String value of the attribute CppMethodBody.
	 */
	void setRequiredCppMethodBody( String value );

	/**
	 *	Get the required String attribute CsMethodBody.
	 *
	 *	@return	The String value of the attribute CsMethodBody.
	 */
	String getRequiredCsMethodBody();

	/**
	 *	Set the required String attribute CsMethodBody.
	 *
	 *	@param	value	the String value of the attribute CsMethodBody.
	 */
	void setRequiredCsMethodBody( String value );

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
	 *	Get the ICFBamTableObj instance referenced by the ForTable key.
	 *
	 *	@return	The ICFBamTableObj instance referenced by the ForTable key.
	 */
	ICFBamTableObj getRequiredContainerForTable();

	/**
	 *	Set the ICFBamTableObj instance referenced by the ForTable key.
	 *
	 *	@param	value	the ICFBamTableObj instance to be referenced by the ForTable key.
	 */
	void setRequiredContainerForTable( ICFBamTableObj value );
}
