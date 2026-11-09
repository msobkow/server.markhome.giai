// Description: Java 11 Object interface for CFBam ClearSubDep1.

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

public interface ICFBamClearSubDep1Obj
	extends ICFBamClearDepObj
{
	/**
	 *	Get the current edition of this ClearSubDep1 instance as a ICFBamClearSubDep1EditObj.
	 *
	 *	@return	The ICFBamClearSubDep1EditObj edition of this instance.
	 */
	ICFBamClearSubDep1EditObj getEditAsClearSubDep1();

	/**
	 *	Get the ICFBamClearSubDep1TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamClearSubDep1TableObj table cache which manages this instance.
	 */
	ICFBamClearSubDep1TableObj getClearSubDep1Table();

	/**
	 *	Get the CFBamClearSubDep1Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamClearSubDep1Buff instance which currently backs this object.
	 */
	CFBamClearSubDep1Buff getClearSubDep1Buff();

	/**
	 *	Get the required long attribute ClearTopDepTenantId.
	 *
	 *	@return	The required long attribute ClearTopDepTenantId.
	 */
	long getRequiredClearTopDepTenantId();

	/**
	 *	Get the required long attribute ClearTopDepId.
	 *
	 *	@return	The required long attribute ClearTopDepId.
	 */
	long getRequiredClearTopDepId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@return	The required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 */
	ICFBamClearTopDepObj getRequiredContainerClearTopDep();

	/**
	 *	Get the required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@return	The required ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 */
	ICFBamClearTopDepObj getRequiredContainerClearTopDep( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamClearSubDep2Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep2Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep();

	/**
	 *	Get the array of optional ICFBamClearSubDep2Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep2Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep( boolean forceRead );

}
