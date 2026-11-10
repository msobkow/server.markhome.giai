// Description: Java 11 Object interface for YCFBam Param.

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

public interface IYCFBamParamObj
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
	 *	Realise this instance of a Param.
	 *
	 *	@return	YCFBamParamObj instance which should be subsequently referenced.
	 */
	IYCFBamParamObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFBamParamObj the reference to the cached or read (realised) instance.
	 */
	IYCFBamParamObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFBamParamObj the reference to the cached or read (realised) instance.
	 */
	IYCFBamParamObj read( boolean forceRead );

	/**
	 *	Move this object up in the chain and refresh the cache.
	 *
	 *	@return	IYCFBamParamObj the reference to the moved and refreshed instance.
	 */
	IYCFBamParamObj moveUp();

	/**
	 *	Move this object down in the chain and refresh the cache.
	 *
	 *	@return	IYCFBamParamObj the reference to the moved and refreshed instance.
	 */
	IYCFBamParamObj moveDown();

	/**
	 *	Initialize and return a locked edition of this Param instance.
	 *
	 *	@return	The newly locked IYCFBamParamEditObj edition of this instance.
	 */
	IYCFBamParamEditObj beginEdit();

	/**
	 *	End this edition of this Param instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Param instance.
	 *
	 *	@return	The IYCFBamParamEditObj edition of this instance.
	 */
	IYCFBamParamEditObj getEdit();

	/**
	 *	Get the current edition of this Param instance as a IYCFBamParamEditObj.
	 *
	 *	@return	The IYCFBamParamEditObj edition of this instance.
	 */
	IYCFBamParamEditObj getEditAsParam();

	/**
	 *	Get the IYCFBamParamTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamParamTableObj table cache which manages this instance.
	 */
	IYCFBamParamTableObj getParamTable();

	/**
	 *	Get the IYCFBamSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFBamSchemaObj schema cache which manages this instance.
	 */
	IYCFBamSchemaObj getSchema();

	/**
	 *	Get the YCFBamParamBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamParamBuff instance which currently backs this object.
	 */
	YCFBamParamBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFBamParamBuff value );

	/**
	 *	Get the YCFBamParamBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamParamBuff instance which currently backs this object.
	 */
	YCFBamParamBuff getParamBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFBamParamPKey primary key for this instance.
	 */
	YCFBamParamPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFBamParamPKey primary key value for this instance.
	 */
	void setPKey( YCFBamParamPKey value );

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
	 *	Get the required long attribute ServerMethodId.
	 *
	 *	@return	The required long attribute ServerMethodId.
	 */
	long getRequiredServerMethodId();

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
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The optional String attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the required boolean attribute IsNullable.
	 *
	 *	@return	The required boolean attribute IsNullable.
	 */
	boolean getRequiredIsNullable();

	/**
	 *	Get the optional Long attribute TypeTenantId.
	 *
	 *	@return	The optional Long attribute TypeTenantId.
	 */
	Long getOptionalTypeTenantId();

	/**
	 *	Get the optional Long attribute TypeId.
	 *
	 *	@return	The optional Long attribute TypeId.
	 */
	Long getOptionalTypeId();

	/**
	 *	Get the optional Long attribute PrevTenantId.
	 *
	 *	@return	The optional Long attribute PrevTenantId.
	 */
	Long getOptionalPrevTenantId();

	/**
	 *	Get the optional Long attribute PrevId.
	 *
	 *	@return	The optional Long attribute PrevId.
	 */
	Long getOptionalPrevId();

	/**
	 *	Get the optional Long attribute NextTenantId.
	 *
	 *	@return	The optional Long attribute NextTenantId.
	 */
	Long getOptionalNextTenantId();

	/**
	 *	Get the optional Long attribute NextId.
	 *
	 *	@return	The optional Long attribute NextId.
	 */
	Long getOptionalNextId();

	/**
	 *	Get the required IYCFBamServerMethodObj instance referenced by the ServerMeth key.
	 *
	 *	@return	The required IYCFBamServerMethodObj instance referenced by the ServerMeth key.
	 */
	IYCFBamServerMethodObj getRequiredContainerServerMeth();

	/**
	 *	Get the required IYCFBamServerMethodObj instance referenced by the ServerMeth key.
	 *
	 *	@return	The required IYCFBamServerMethodObj instance referenced by the ServerMeth key.
	 */
	IYCFBamServerMethodObj getRequiredContainerServerMeth( boolean forceRead );

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
	 *	Get the optional IYCFBamParamObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IYCFBamParamObj instance referenced by the Prev key.
	 */
	IYCFBamParamObj getOptionalLookupPrev();

	/**
	 *	Get the optional IYCFBamParamObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IYCFBamParamObj instance referenced by the Prev key.
	 */
	IYCFBamParamObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Get the optional IYCFBamParamObj instance referenced by the Next key.
	 *
	 *	@return	The optional IYCFBamParamObj instance referenced by the Next key.
	 */
	IYCFBamParamObj getOptionalLookupNext();

	/**
	 *	Get the optional IYCFBamParamObj instance referenced by the Next key.
	 *
	 *	@return	The optional IYCFBamParamObj instance referenced by the Next key.
	 */
	IYCFBamParamObj getOptionalLookupNext( boolean forceRead );

	/**
	 *	Get the required IYCFBamValueObj instance referenced by the Type key.
	 *
	 *	@return	The required IYCFBamValueObj instance referenced by the Type key.
	 */
	IYCFBamValueObj getRequiredLookupType();

	/**
	 *	Get the required IYCFBamValueObj instance referenced by the Type key.
	 *
	 *	@return	The required IYCFBamValueObj instance referenced by the Type key.
	 */
	IYCFBamValueObj getRequiredLookupType( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
