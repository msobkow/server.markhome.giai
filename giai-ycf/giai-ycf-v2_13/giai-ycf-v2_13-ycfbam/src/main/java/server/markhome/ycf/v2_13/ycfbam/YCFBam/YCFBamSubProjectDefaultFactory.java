
// Description: Java 11 Default Factory implementation for SubProject.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

	/*
	 *	CFBamSubProjectFactory implementation for SubProject
	 */
public class CFBamSubProjectDefaultFactory
	extends CFIntSubProjectDefaultFactory
	implements ICFBamSubProjectFactory
{
	public CFBamSubProjectDefaultFactory() {
		super();
	}

	public CFIntSubProjectPKey newPKey() {
		CFIntSubProjectPKey pkey =
			new CFIntSubProjectPKey();
		return( pkey );
	}

	public CFIntSubProjectHPKey newHPKey() {
		CFIntSubProjectHPKey hpkey =
			new CFIntSubProjectHPKey();
		return( hpkey );
	}

	public CFIntSubProjectByTenantIdxKey newTenantIdxKey() {
		CFIntSubProjectByTenantIdxKey key =
			new CFIntSubProjectByTenantIdxKey();
		return( key );
	}

	public CFIntSubProjectByTopProjectIdxKey newTopProjectIdxKey() {
		CFIntSubProjectByTopProjectIdxKey key =
			new CFIntSubProjectByTopProjectIdxKey();
		return( key );
	}

	public CFIntSubProjectByNameIdxKey newNameIdxKey() {
		CFIntSubProjectByNameIdxKey key =
			new CFIntSubProjectByNameIdxKey();
		return( key );
	}

	public CFIntSubProjectBuff newBuff() {
		CFIntSubProjectBuff buff =
			new CFIntSubProjectBuff();
		return( buff );
	}

	public CFIntSubProjectHBuff newHBuff() {
		CFIntSubProjectHBuff hbuff =
			new CFIntSubProjectHBuff();
		return( hbuff );
	}
}
