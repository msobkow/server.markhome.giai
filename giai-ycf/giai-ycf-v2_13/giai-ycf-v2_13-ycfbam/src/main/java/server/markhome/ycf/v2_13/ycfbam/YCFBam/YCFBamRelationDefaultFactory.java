
// Description: Java 11 Default Factory implementation for Relation.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

	/*
	 *	YCFBamRelationFactory implementation for Relation
	 */
public class YCFBamRelationDefaultFactory
	implements IYCFBamRelationFactory
{
	public YCFBamRelationDefaultFactory() {
	}

	public YCFBamRelationByUNameIdxKey newUNameIdxKey() {
		YCFBamRelationByUNameIdxKey key =
			new YCFBamRelationByUNameIdxKey();
		return( key );
	}

	public YCFBamRelationByRelnTenantIdxKey newRelnTenantIdxKey() {
		YCFBamRelationByRelnTenantIdxKey key =
			new YCFBamRelationByRelnTenantIdxKey();
		return( key );
	}

	public YCFBamRelationByRelTableIdxKey newRelTableIdxKey() {
		YCFBamRelationByRelTableIdxKey key =
			new YCFBamRelationByRelTableIdxKey();
		return( key );
	}

	public YCFBamRelationByCodeVisIdxKey newCodeVisIdxKey() {
		YCFBamRelationByCodeVisIdxKey key =
			new YCFBamRelationByCodeVisIdxKey();
		return( key );
	}

	public YCFBamRelationByTableCodeVisIdxKey newTableCodeVisIdxKey() {
		YCFBamRelationByTableCodeVisIdxKey key =
			new YCFBamRelationByTableCodeVisIdxKey();
		return( key );
	}

	public YCFBamRelationByDefSchemaIdxKey newDefSchemaIdxKey() {
		YCFBamRelationByDefSchemaIdxKey key =
			new YCFBamRelationByDefSchemaIdxKey();
		return( key );
	}

	public YCFBamRelationByFromKeyIdxKey newFromKeyIdxKey() {
		YCFBamRelationByFromKeyIdxKey key =
			new YCFBamRelationByFromKeyIdxKey();
		return( key );
	}

	public YCFBamRelationByToTblIdxKey newToTblIdxKey() {
		YCFBamRelationByToTblIdxKey key =
			new YCFBamRelationByToTblIdxKey();
		return( key );
	}

	public YCFBamRelationByToKeyIdxKey newToKeyIdxKey() {
		YCFBamRelationByToKeyIdxKey key =
			new YCFBamRelationByToKeyIdxKey();
		return( key );
	}

	public YCFBamRelationByNarrowedIdxKey newNarrowedIdxKey() {
		YCFBamRelationByNarrowedIdxKey key =
			new YCFBamRelationByNarrowedIdxKey();
		return( key );
	}

	public YCFBamRelationBuff newBuff() {
		YCFBamRelationBuff buff =
			new YCFBamRelationBuff();
		return( buff );
	}

	public YCFBamRelationHBuff newHBuff() {
		YCFBamRelationHBuff hbuff =
			new YCFBamRelationHBuff();
		return( hbuff );
	}
}
