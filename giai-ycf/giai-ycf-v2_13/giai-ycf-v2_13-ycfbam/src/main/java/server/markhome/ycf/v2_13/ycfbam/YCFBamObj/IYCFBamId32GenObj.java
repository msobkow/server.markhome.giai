// Description: Java 11 Object interface for YCFBam Id32Gen.

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

public interface IYCFBamId32GenObj
	extends IYCFBamInt32TypeObj
{
	/**
	 *	Get the current edition of this Id32Gen instance as a IYCFBamId32GenEditObj.
	 *
	 *	@return	The IYCFBamId32GenEditObj edition of this instance.
	 */
	IYCFBamId32GenEditObj getEditAsId32Gen();

	/**
	 *	Get the IYCFBamId32GenTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamId32GenTableObj table cache which manages this instance.
	 */
	IYCFBamId32GenTableObj getId32GenTable();

	/**
	 *	Get the YCFBamId32GenBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamId32GenBuff instance which currently backs this object.
	 */
	YCFBamId32GenBuff getId32GenBuff();

	/**
	 *	Get the optional Long attribute DispenserTenantId.
	 *
	 *	@return	The optional Long attribute DispenserTenantId.
	 */
	Long getOptionalDispenserTenantId();

	/**
	 *	Get the optional Long attribute DispenserId.
	 *
	 *	@return	The optional Long attribute DispenserId.
	 */
	Long getOptionalDispenserId();

	/**
	 *	Get the required short attribute Slice.
	 *
	 *	@return	The required short attribute Slice.
	 */
	short getRequiredSlice();

	/**
	 *	Get the required int attribute BlockSize.
	 *
	 *	@return	The required int attribute BlockSize.
	 */
	int getRequiredBlockSize();

	/**
	 *	Get the optional IYCFBamTableObj instance referenced by the Dispenser key.
	 *
	 *	@return	The optional IYCFBamTableObj instance referenced by the Dispenser key.
	 */
	IYCFBamTableObj getOptionalLookupDispenser();

	/**
	 *	Get the optional IYCFBamTableObj instance referenced by the Dispenser key.
	 *
	 *	@return	The optional IYCFBamTableObj instance referenced by the Dispenser key.
	 */
	IYCFBamTableObj getOptionalLookupDispenser( boolean forceRead );

}
