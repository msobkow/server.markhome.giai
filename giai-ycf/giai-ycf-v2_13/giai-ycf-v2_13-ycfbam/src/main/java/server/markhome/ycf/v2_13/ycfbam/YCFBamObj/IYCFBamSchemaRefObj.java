// Description: Java 11 Object interface for YCFBam SchemaRef.

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

public interface IYCFBamSchemaRefObj
	extends IYCFBamScopeObj
{
	/**
	 *	Move this object up in the chain and refresh the cache.
	 *
	 *	@return	IYCFBamSchemaRefObj the reference to the moved and refreshed instance.
	 */
	IYCFBamSchemaRefObj moveUp();

	/**
	 *	Move this object down in the chain and refresh the cache.
	 *
	 *	@return	IYCFBamSchemaRefObj the reference to the moved and refreshed instance.
	 */
	IYCFBamSchemaRefObj moveDown();

	/**
	 *	Get the current edition of this SchemaRef instance as a IYCFBamSchemaRefEditObj.
	 *
	 *	@return	The IYCFBamSchemaRefEditObj edition of this instance.
	 */
	IYCFBamSchemaRefEditObj getEditAsSchemaRef();

	/**
	 *	Get the IYCFBamSchemaRefTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamSchemaRefTableObj table cache which manages this instance.
	 */
	IYCFBamSchemaRefTableObj getSchemaRefTable();

	/**
	 *	Get the YCFBamSchemaRefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamSchemaRefBuff instance which currently backs this object.
	 */
	YCFBamSchemaRefBuff getSchemaRefBuff();

	/**
	 *	Get the required long attribute SchemaId.
	 *
	 *	@return	The required long attribute SchemaId.
	 */
	long getRequiredSchemaId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required String attribute RefModelName.
	 *
	 *	@return	The required String attribute RefModelName.
	 */
	String getRequiredRefModelName();

	/**
	 *	Get the required String attribute IncludeRoot.
	 *
	 *	@return	The required String attribute IncludeRoot.
	 */
	String getRequiredIncludeRoot();

	/**
	 *	Get the optional Long attribute RefSchemaTenantId.
	 *
	 *	@return	The optional Long attribute RefSchemaTenantId.
	 */
	Long getOptionalRefSchemaTenantId();

	/**
	 *	Get the optional Long attribute RefSchemaId.
	 *
	 *	@return	The optional Long attribute RefSchemaId.
	 */
	Long getOptionalRefSchemaId();

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
	 *	Get the required IYCFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The required IYCFBamSchemaDefObj instance referenced by the Schema key.
	 */
	IYCFBamSchemaDefObj getRequiredContainerSchema();

	/**
	 *	Get the required IYCFBamSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The required IYCFBamSchemaDefObj instance referenced by the Schema key.
	 */
	IYCFBamSchemaDefObj getRequiredContainerSchema( boolean forceRead );

	/**
	 *	Get the optional IYCFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj instance referenced by the RefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupRefSchema();

	/**
	 *	Get the optional IYCFBamSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj instance referenced by the RefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupRefSchema( boolean forceRead );

	/**
	 *	Get the optional IYCFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IYCFBamSchemaRefObj instance referenced by the Prev key.
	 */
	IYCFBamSchemaRefObj getOptionalLookupPrev();

	/**
	 *	Get the optional IYCFBamSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IYCFBamSchemaRefObj instance referenced by the Prev key.
	 */
	IYCFBamSchemaRefObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Get the optional IYCFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The optional IYCFBamSchemaRefObj instance referenced by the Next key.
	 */
	IYCFBamSchemaRefObj getOptionalLookupNext();

	/**
	 *	Get the optional IYCFBamSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The optional IYCFBamSchemaRefObj instance referenced by the Next key.
	 */
	IYCFBamSchemaRefObj getOptionalLookupNext( boolean forceRead );

}
