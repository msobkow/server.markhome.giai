// Description: Java 11 Object interface for YCFBam Tweak.

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
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamTweakObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The IYCFSecSecUserObj instance who created this instance.
	 */
	IYCFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The IYCFSecSecUserObj instance who updated this instance.
	 */
	IYCFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a Tweak.
	 *
	 *	@return	YCFBamTweakObj instance which should be subsequently referenced.
	 */
	IYCFBamTweakObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFBamTweakObj the reference to the cached or read (realised) instance.
	 */
	IYCFBamTweakObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFBamTweakObj the reference to the cached or read (realised) instance.
	 */
	IYCFBamTweakObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Tweak instance.
	 *
	 *	@return	The newly locked IYCFBamTweakEditObj edition of this instance.
	 */
	IYCFBamTweakEditObj beginEdit();

	/**
	 *	End this edition of this Tweak instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Tweak instance.
	 *
	 *	@return	The IYCFBamTweakEditObj edition of this instance.
	 */
	IYCFBamTweakEditObj getEdit();

	/**
	 *	Get the current edition of this Tweak instance as a IYCFBamTweakEditObj.
	 *
	 *	@return	The IYCFBamTweakEditObj edition of this instance.
	 */
	IYCFBamTweakEditObj getEditAsTweak();

	/**
	 *	Get the IYCFBamTweakTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamTweakTableObj table cache which manages this instance.
	 */
	IYCFBamTweakTableObj getTweakTable();

	/**
	 *	Get the IYCFBamSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFBamSchemaObj schema cache which manages this instance.
	 */
	IYCFBamSchemaObj getSchema();

	/**
	 *	Get the YCFBamTweakBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamTweakBuff instance which currently backs this object.
	 */
	YCFBamTweakBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFBamTweakBuff value );

	/**
	 *	Get the YCFBamTweakBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamTweakBuff instance which currently backs this object.
	 */
	YCFBamTweakBuff getTweakBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFBamTweakPKey primary key for this instance.
	 */
	YCFBamTweakPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFBamTweakPKey primary key value for this instance.
	 */
	void setPKey( YCFBamTweakPKey value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required long attribute TenantId.
	 *
	 *	@return	The required long attribute TenantId.
	 */
	long getRequiredTenantId();

	/**
	 *	Get the required long attribute ScopeId.
	 *
	 *	@return	The required long attribute ScopeId.
	 */
	long getRequiredScopeId();

	/**
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the optional Long attribute DefSchemaTenantId.
	 *
	 *	@return	The optional Long attribute DefSchemaTenantId.
	 */
	Long getOptionalDefSchemaTenantId();

	/**
	 *	Get the optional Long attribute DefSchemaId.
	 *
	 *	@return	The optional Long attribute DefSchemaId.
	 */
	Long getOptionalDefSchemaId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required boolean attribute ReplacesInherited.
	 *
	 *	@return	The required boolean attribute ReplacesInherited.
	 */
	boolean getRequiredReplacesInherited();

	/**
	 *	Get the required String attribute TweakGelText.
	 *
	 *	@return	The required String attribute TweakGelText.
	 */
	String getRequiredTweakGelText();

	/**
	 *	Get the required IYCFBamTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFBamTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IYCFBamScopeObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The required IYCFBamScopeObj instance referenced by the ScopeDef key.
	 */
	IYCFBamScopeObj getRequiredContainerScopeDef();

	/**
	 *	Get the required IYCFBamScopeObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The required IYCFBamScopeObj instance referenced by the ScopeDef key.
	 */
	IYCFBamScopeObj getRequiredContainerScopeDef( boolean forceRead );

	/**
	 *	Get the optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Get the optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
