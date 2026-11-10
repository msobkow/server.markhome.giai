// Description: Java 11 Object interface for YCFBam DelTopDep.

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

public interface IYCFBamDelTopDepObj
	extends IYCFBamDelDepObj
{
	/**
	 *	Move this object up in the chain and refresh the cache.
	 *
	 *	@return	IYCFBamDelTopDepObj the reference to the moved and refreshed instance.
	 */
	IYCFBamDelTopDepObj moveUp();

	/**
	 *	Move this object down in the chain and refresh the cache.
	 *
	 *	@return	IYCFBamDelTopDepObj the reference to the moved and refreshed instance.
	 */
	IYCFBamDelTopDepObj moveDown();

	/**
	 *	Get the current edition of this DelTopDep instance as a IYCFBamDelTopDepEditObj.
	 *
	 *	@return	The IYCFBamDelTopDepEditObj edition of this instance.
	 */
	IYCFBamDelTopDepEditObj getEditAsDelTopDep();

	/**
	 *	Get the IYCFBamDelTopDepTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamDelTopDepTableObj table cache which manages this instance.
	 */
	IYCFBamDelTopDepTableObj getDelTopDepTable();

	/**
	 *	Get the YCFBamDelTopDepBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamDelTopDepBuff instance which currently backs this object.
	 */
	YCFBamDelTopDepBuff getDelTopDepBuff();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required long attribute TableTenantId.
	 *
	 *	@return	The required long attribute TableTenantId.
	 */
	long getRequiredTableTenantId();

	/**
	 *	Get the required long attribute TableId.
	 *
	 *	@return	The required long attribute TableId.
	 */
	long getRequiredTableId();

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
	 *	Get the array of optional IYCFBamDelSubDep1Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IYCFBamDelSubDep1Obj[] array of instances referenced by the DelDep key.
	 */
	List<IYCFBamDelSubDep1Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional IYCFBamDelSubDep1Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IYCFBamDelSubDep1Obj[] array of instances referenced by the DelDep key.
	 */
	List<IYCFBamDelSubDep1Obj> getOptionalComponentsDelDep( boolean forceRead );

	/**
	 *	Get the optional IYCFBamDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IYCFBamDelTopDepObj instance referenced by the Prev key.
	 */
	IYCFBamDelTopDepObj getOptionalLookupPrev();

	/**
	 *	Get the optional IYCFBamDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IYCFBamDelTopDepObj instance referenced by the Prev key.
	 */
	IYCFBamDelTopDepObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Get the optional IYCFBamDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional IYCFBamDelTopDepObj instance referenced by the Next key.
	 */
	IYCFBamDelTopDepObj getOptionalLookupNext();

	/**
	 *	Get the optional IYCFBamDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional IYCFBamDelTopDepObj instance referenced by the Next key.
	 */
	IYCFBamDelTopDepObj getOptionalLookupNext( boolean forceRead );

}
