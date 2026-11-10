// Description: Java 11 Object interface for YCFBam Relation.

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

public interface IYCFBamRelationObj
	extends IYCFBamScopeObj
{
	/**
	 *	Get the current edition of this Relation instance as a IYCFBamRelationEditObj.
	 *
	 *	@return	The IYCFBamRelationEditObj edition of this instance.
	 */
	IYCFBamRelationEditObj getEditAsRelation();

	/**
	 *	Get the IYCFBamRelationTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamRelationTableObj table cache which manages this instance.
	 */
	IYCFBamRelationTableObj getRelationTable();

	/**
	 *	Get the YCFBamRelationBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamRelationBuff instance which currently backs this object.
	 */
	YCFBamRelationBuff getRelationBuff();

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
	 *	Get the required IYCFBamSchema.RelationTypeEnum attribute RelationType.
	 *
	 *	@return	The required IYCFBamSchema.RelationTypeEnum attribute RelationType.
	 */
	IYCFBamSchema.RelationTypeEnum getRequiredRelationType();

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
	 *	Get the required IYCFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The required IYCFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 */
	IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis();

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
	 *	Get the required IYCFBamTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The required IYCFBamTableObj instance referenced by the FromTable key.
	 */
	IYCFBamTableObj getRequiredContainerFromTable();

	/**
	 *	Get the required IYCFBamTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The required IYCFBamTableObj instance referenced by the FromTable key.
	 */
	IYCFBamTableObj getRequiredContainerFromTable( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional IYCFBamRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<IYCFBamRelationColObj> getOptionalComponentsColumns();

	/**
	 *	Get the array of optional IYCFBamRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional IYCFBamRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<IYCFBamRelationColObj> getOptionalComponentsColumns( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional IYCFBamPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<IYCFBamPopTopDepObj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional IYCFBamPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional IYCFBamPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<IYCFBamPopTopDepObj> getOptionalComponentsPopDep( boolean forceRead );

	/**
	 *	Get the required IYCFBamTenantObj instance referenced by the RelTenant key.
	 *
	 *	@return	The required IYCFBamTenantObj instance referenced by the RelTenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerRelTenant();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the RelTenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the RelTenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerRelTenant( boolean forceRead );

	/**
	 *	Get the required IYCFBamIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The required IYCFBamIndexObj instance referenced by the FromIndex key.
	 */
	IYCFBamIndexObj getRequiredLookupFromIndex();

	/**
	 *	Get the required IYCFBamIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The required IYCFBamIndexObj instance referenced by the FromIndex key.
	 */
	IYCFBamIndexObj getRequiredLookupFromIndex( boolean forceRead );

	/**
	 *	Get the required IYCFBamTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The required IYCFBamTableObj instance referenced by the ToTable key.
	 */
	IYCFBamTableObj getRequiredLookupToTable();

	/**
	 *	Get the required IYCFBamTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The required IYCFBamTableObj instance referenced by the ToTable key.
	 */
	IYCFBamTableObj getRequiredLookupToTable( boolean forceRead );

	/**
	 *	Get the required IYCFBamIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The required IYCFBamIndexObj instance referenced by the ToIndex key.
	 */
	IYCFBamIndexObj getRequiredLookupToIndex();

	/**
	 *	Get the required IYCFBamIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The required IYCFBamIndexObj instance referenced by the ToIndex key.
	 */
	IYCFBamIndexObj getRequiredLookupToIndex( boolean forceRead );

	/**
	 *	Get the optional IYCFBamRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The optional IYCFBamRelationObj instance referenced by the Narrowed key.
	 */
	IYCFBamRelationObj getOptionalLookupNarrowed();

	/**
	 *	Get the optional IYCFBamRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The optional IYCFBamRelationObj instance referenced by the Narrowed key.
	 */
	IYCFBamRelationObj getOptionalLookupNarrowed( boolean forceRead );

	IYCFBamSubProjectObj getProject();
	IYCFBamTopDomainObj getCompany();
	IYCFBamSchemaDefObj getSchemaDef();
	IYCFBamMinorVersionObj getVersion();
	String getVersionString();
	String getPackedVersionString();
	Boolean isColumnInOwnerRelation();

}
