// Description: Java 11 Object interface for YCFBam Index.

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

public interface IYCFBamIndexObj
	extends IYCFBamScopeObj
{
	/**
	 *	Get the current edition of this Index instance as a IYCFBamIndexEditObj.
	 *
	 *	@return	The IYCFBamIndexEditObj edition of this instance.
	 */
	IYCFBamIndexEditObj getEditAsIndex();

	/**
	 *	Get the IYCFBamIndexTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamIndexTableObj table cache which manages this instance.
	 */
	IYCFBamIndexTableObj getIndexTable();

	/**
	 *	Get the YCFBamIndexBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamIndexBuff instance which currently backs this object.
	 */
	YCFBamIndexBuff getIndexBuff();

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
	 *	Get the required boolean attribute IsUnique.
	 *
	 *	@return	The required boolean attribute IsUnique.
	 */
	boolean getRequiredIsUnique();

	/**
	 *	Get the required boolean attribute IsDbMapped.
	 *
	 *	@return	The required boolean attribute IsDbMapped.
	 */
	boolean getRequiredIsDbMapped();

	/**
	 *	Get the required IYCFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The required IYCFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 */
	IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis();

	/**
	 *	Get the required IYCFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required IYCFBamTableObj instance referenced by the Table key.
	 */
	IYCFBamTableObj getRequiredContainerTable();

	/**
	 *	Get the required IYCFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required IYCFBamTableObj instance referenced by the Table key.
	 */
	IYCFBamTableObj getRequiredContainerTable( boolean forceRead );

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
	 *	Get the array of optional IYCFBamIndexColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional IYCFBamIndexColObj[] array of instances referenced by the Columns key.
	 */
	List<IYCFBamIndexColObj> getOptionalComponentsColumns();

	/**
	 *	Get the array of optional IYCFBamIndexColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional IYCFBamIndexColObj[] array of instances referenced by the Columns key.
	 */
	List<IYCFBamIndexColObj> getOptionalComponentsColumns( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamIndexTweakObj array of instances referenced by the Tweaks key.
	 *
	 *	@return	The optional IYCFBamIndexTweakObj[] array of instances referenced by the Tweaks key.
	 */
	List<IYCFBamIndexTweakObj> getOptionalComponentsTweaks();

	/**
	 *	Get the array of optional IYCFBamIndexTweakObj array of instances referenced by the Tweaks key.
	 *
	 *	@return	The optional IYCFBamIndexTweakObj[] array of instances referenced by the Tweaks key.
	 */
	List<IYCFBamIndexTweakObj> getOptionalComponentsTweaks( boolean forceRead );

	/**
	 *	Get the required IYCFBamTenantObj instance referenced by the IdxTenant key.
	 *
	 *	@return	The required IYCFBamTenantObj instance referenced by the IdxTenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerIdxTenant();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the IdxTenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the IdxTenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerIdxTenant( boolean forceRead );

}
