// Description: Java 11 Object interface for CFBam Relation.

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

public interface ICFBamRelationObj
	extends ICFBamScopeObj
{
	/**
	 *	Get the current edition of this Relation instance as a ICFBamRelationEditObj.
	 *
	 *	@return	The ICFBamRelationEditObj edition of this instance.
	 */
	ICFBamRelationEditObj getEditAsRelation();

	/**
	 *	Get the ICFBamRelationTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamRelationTableObj table cache which manages this instance.
	 */
	ICFBamRelationTableObj getRelationTable();

	/**
	 *	Get the CFBamRelationBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamRelationBuff instance which currently backs this object.
	 */
	CFBamRelationBuff getRelationBuff();

	/**
	 *	Get the required long attribute TableId.
	 *
	 *	@return	The required long attribute TableId.
	 */
	long getRequiredTableId();

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
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The optional String attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The optional String attribute Label.
	 */
	String getOptionalLabel();

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
	 *	Get the required ICFBamSchema.RelationTypeEnum attribute RelationType.
	 *
	 *	@return	The required ICFBamSchema.RelationTypeEnum attribute RelationType.
	 */
	ICFBamSchema.RelationTypeEnum getRequiredRelationType();

	/**
	 *	Get the optional String attribute DbName.
	 *
	 *	@return	The optional String attribute DbName.
	 */
	String getOptionalDbName();

	/**
	 *	Get the optional String attribute Suffix.
	 *
	 *	@return	The optional String attribute Suffix.
	 */
	String getOptionalSuffix();

	/**
	 *	Get the required long attribute FromIndexId.
	 *
	 *	@return	The required long attribute FromIndexId.
	 */
	long getRequiredFromIndexId();

	/**
	 *	Get the required long attribute ToTableId.
	 *
	 *	@return	The required long attribute ToTableId.
	 */
	long getRequiredToTableId();

	/**
	 *	Get the required long attribute ToIndexId.
	 *
	 *	@return	The required long attribute ToIndexId.
	 */
	long getRequiredToIndexId();

	/**
	 *	Get the required boolean attribute IsRequired.
	 *
	 *	@return	The required boolean attribute IsRequired.
	 */
	boolean getRequiredIsRequired();

	/**
	 *	Get the required boolean attribute IsXsdContainer.
	 *
	 *	@return	The required boolean attribute IsXsdContainer.
	 */
	boolean getRequiredIsXsdContainer();

	/**
	 *	Get the required boolean attribute IsLateResolver.
	 *
	 *	@return	The required boolean attribute IsLateResolver.
	 */
	boolean getRequiredIsLateResolver();

	/**
	 *	Get the required boolean attribute AllowAddendum.
	 *
	 *	@return	The required boolean attribute AllowAddendum.
	 */
	boolean getRequiredAllowAddendum();

	/**
	 *	Get the optional Long attribute NarrowedTenantId.
	 *
	 *	@return	The optional Long attribute NarrowedTenantId.
	 */
	Long getOptionalNarrowedTenantId();

	/**
	 *	Get the optional Long attribute NarrowedId.
	 *
	 *	@return	The optional Long attribute NarrowedId.
	 */
	Long getOptionalNarrowedId();

	/**
	 *	Get the required ICFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The required ICFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 */
	ICFBamSchema.CodeVisibilityEnum getRequiredCodeVis();

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
	 *	Get the required ICFBamTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the FromTable key.
	 */
	ICFBamTableObj getRequiredContainerFromTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the FromTable key.
	 */
	ICFBamTableObj getRequiredContainerFromTable( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional ICFBamRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamRelationColObj> getOptionalComponentsColumns();

	/**
	 *	Get the array of optional ICFBamRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional ICFBamRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamRelationColObj> getOptionalComponentsColumns( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopTopDepObj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional ICFBamPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopTopDepObj> getOptionalComponentsPopDep( boolean forceRead );

	/**
	 *	Get the required ICFBamTenantObj instance referenced by the RelTenant key.
	 *
	 *	@return	The required ICFBamTenantObj instance referenced by the RelTenant key.
	 */
	ICFSecTenantObj getRequiredOwnerRelTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the RelTenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the RelTenant key.
	 */
	ICFSecTenantObj getRequiredOwnerRelTenant( boolean forceRead );

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the FromIndex key.
	 */
	ICFBamIndexObj getRequiredLookupFromIndex();

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the FromIndex key.
	 */
	ICFBamIndexObj getRequiredLookupFromIndex( boolean forceRead );

	/**
	 *	Get the required ICFBamTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the ToTable key.
	 */
	ICFBamTableObj getRequiredLookupToTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the ToTable key.
	 */
	ICFBamTableObj getRequiredLookupToTable( boolean forceRead );

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the ToIndex key.
	 */
	ICFBamIndexObj getRequiredLookupToIndex();

	/**
	 *	Get the required ICFBamIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The required ICFBamIndexObj instance referenced by the ToIndex key.
	 */
	ICFBamIndexObj getRequiredLookupToIndex( boolean forceRead );

	/**
	 *	Get the optional ICFBamRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The optional ICFBamRelationObj instance referenced by the Narrowed key.
	 */
	ICFBamRelationObj getOptionalLookupNarrowed();

	/**
	 *	Get the optional ICFBamRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The optional ICFBamRelationObj instance referenced by the Narrowed key.
	 */
	ICFBamRelationObj getOptionalLookupNarrowed( boolean forceRead );

	ICFBamSubProjectObj getProject();
	ICFBamTopDomainObj getCompany();
	ICFBamSchemaDefObj getSchemaDef();
	ICFBamMinorVersionObj getVersion();
	String getVersionString();
	String getPackedVersionString();
	Boolean isColumnInOwnerRelation();

}
