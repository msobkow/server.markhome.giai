
// Description: Java 11 Default Factory implementation for HostNode.

/*
 *	org.msscf.msscf.CFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFSec.
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

package org.msscf.msscf.v2_13.cfsec.CFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;

	/*
	 *	CFSecHostNodeFactory implementation for HostNode
	 */
public class CFSecHostNodeDefaultFactory
	implements ICFSecHostNodeFactory
{
	public CFSecHostNodeDefaultFactory() {
	}

	public CFSecHostNodePKey newPKey() {
		CFSecHostNodePKey pkey =
			new CFSecHostNodePKey();
		return( pkey );
	}

	public CFSecHostNodeHPKey newHPKey() {
		CFSecHostNodeHPKey hpkey =
			new CFSecHostNodeHPKey();
		return( hpkey );
	}

	public CFSecHostNodeByClusterIdxKey newClusterIdxKey() {
		CFSecHostNodeByClusterIdxKey key =
			new CFSecHostNodeByClusterIdxKey();
		return( key );
	}

	public CFSecHostNodeByUDescrIdxKey newUDescrIdxKey() {
		CFSecHostNodeByUDescrIdxKey key =
			new CFSecHostNodeByUDescrIdxKey();
		return( key );
	}

	public CFSecHostNodeByHostNameIdxKey newHostNameIdxKey() {
		CFSecHostNodeByHostNameIdxKey key =
			new CFSecHostNodeByHostNameIdxKey();
		return( key );
	}

	public CFSecHostNodeBuff newBuff() {
		CFSecHostNodeBuff buff =
			new CFSecHostNodeBuff();
		return( buff );
	}

	public CFSecHostNodeHBuff newHBuff() {
		CFSecHostNodeHBuff hbuff =
			new CFSecHostNodeHBuff();
		return( hbuff );
	}
}
