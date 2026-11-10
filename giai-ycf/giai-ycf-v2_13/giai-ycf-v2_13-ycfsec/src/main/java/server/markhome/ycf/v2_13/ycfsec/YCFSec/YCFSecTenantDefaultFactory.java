
// Description: Java 11 Default Factory implementation for Tenant.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

	/*
	 *	YCFSecTenantFactory implementation for Tenant
	 */
public class YCFSecTenantDefaultFactory
	implements IYCFSecTenantFactory
{
	public YCFSecTenantDefaultFactory() {
	}

	public YCFSecTenantPKey newPKey() {
		YCFSecTenantPKey pkey =
			new YCFSecTenantPKey();
		return( pkey );
	}

	public YCFSecTenantHPKey newHPKey() {
		YCFSecTenantHPKey hpkey =
			new YCFSecTenantHPKey();
		return( hpkey );
	}

	public YCFSecTenantByClusterIdxKey newClusterIdxKey() {
		YCFSecTenantByClusterIdxKey key =
			new YCFSecTenantByClusterIdxKey();
		return( key );
	}

	public YCFSecTenantByUNameIdxKey newUNameIdxKey() {
		YCFSecTenantByUNameIdxKey key =
			new YCFSecTenantByUNameIdxKey();
		return( key );
	}

	public YCFSecTenantBuff newBuff() {
		YCFSecTenantBuff buff =
			new YCFSecTenantBuff();
		return( buff );
	}

	public YCFSecTenantHBuff newHBuff() {
		YCFSecTenantHBuff hbuff =
			new YCFSecTenantHBuff();
		return( hbuff );
	}
}
