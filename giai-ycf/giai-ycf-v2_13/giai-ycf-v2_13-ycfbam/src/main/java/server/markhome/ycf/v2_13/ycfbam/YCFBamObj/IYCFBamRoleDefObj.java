// Description: Java 11 Object interface for CFBam RoleDef.

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
import org.msscf.msscf.v2_13.cfbam.CFBam.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamRoleDefObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who created this instance.
	 */
	ICFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who updated this instance.
	 */
	ICFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a RoleDef.
	 *
	 *	@return	CFBamRoleDefObj instance which should be subsequently referenced.
	 */
	ICFBamRoleDefObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFBamRoleDefObj the reference to the cached or read (realised) instance.
	 */
	ICFBamRoleDefObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFBamRoleDefObj the reference to the cached or read (realised) instance.
	 */
	ICFBamRoleDefObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this RoleDef instance.
	 *
	 *	@return	The newly locked ICFBamRoleDefEditObj edition of this instance.
	 */
	ICFBamRoleDefEditObj beginEdit();

	/**
	 *	End this edition of this RoleDef instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this RoleDef instance.
	 *
	 *	@return	The ICFBamRoleDefEditObj edition of this instance.
	 */
	ICFBamRoleDefEditObj getEdit();

	/**
	 *	Get the current edition of this RoleDef instance as a ICFBamRoleDefEditObj.
	 *
	 *	@return	The ICFBamRoleDefEditObj edition of this instance.
	 */
	ICFBamRoleDefEditObj getEditAsRoleDef();

	/**
	 *	Get the ICFBamRoleDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamRoleDefTableObj table cache which manages this instance.
	 */
	ICFBamRoleDefTableObj getRoleDefTable();

	/**
	 *	Get the ICFBamSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFBamSchemaObj schema cache which manages this instance.
	 */
	ICFBamSchemaObj getSchema();

	/**
	 *	Get the CFBamRoleDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamRoleDefBuff instance which currently backs this object.
	 */
	CFBamRoleDefBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFBamRoleDefBuff value );

	/**
	 *	Get the CFBamRoleDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamRoleDefBuff instance which currently backs this object.
	 */
	CFBamRoleDefBuff getRoleDefBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFBamRoleDefPKey primary key for this instance.
	 */
	CFBamRoleDefPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFBamRoleDefPKey primary key value for this instance.
	 */
	void setPKey( CFBamRoleDefPKey value );

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
	 *	Get the required String attribute Enables.
	 *
	 *	@return	The required String attribute Enables.
	 */
	String getRequiredEnables();

	/**
	 *	Get the required String attribute Includes.
	 *
	 *	@return	The required String attribute Includes.
	 */
	String getRequiredIncludes();

	/**
	 *	Get the required ICFBamTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFBamTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required ICFBamScopeObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The required ICFBamScopeObj instance referenced by the ScopeDef key.
	 */
	ICFBamScopeObj getRequiredContainerScopeDef();

	/**
	 *	Get the required ICFBamScopeObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The required ICFBamScopeObj instance referenced by the ScopeDef key.
	 */
	ICFBamScopeObj getRequiredContainerScopeDef( boolean forceRead );

	/**
	 *	Get the optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Get the optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional ICFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
