
// Description: Java 11 Default Factory implementation for Service.

/*
 *	org.mssycf.mssycf.YCFBam
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
	 *	YCFBamServiceFactory implementation for Service
	 */
public class YCFBamServiceDefaultFactory
	extends YCFSecServiceDefaultFactory
	implements IYCFBamServiceFactory
{
	public YCFBamServiceDefaultFactory() {
		super();
	}

	public YCFSecServicePKey newPKey() {
		YCFSecServicePKey pkey =
			new YCFSecServicePKey();
		return( pkey );
	}

	public YCFSecServiceHPKey newHPKey() {
		YCFSecServiceHPKey hpkey =
			new YCFSecServiceHPKey();
		return( hpkey );
	}

	public YCFSecServiceByClusterIdxKey newClusterIdxKey() {
		YCFSecServiceByClusterIdxKey key =
			new YCFSecServiceByClusterIdxKey();
		return( key );
	}

	public YCFSecServiceByHostIdxKey newHostIdxKey() {
		YCFSecServiceByHostIdxKey key =
			new YCFSecServiceByHostIdxKey();
		return( key );
	}

	public YCFSecServiceByTypeIdxKey newTypeIdxKey() {
		YCFSecServiceByTypeIdxKey key =
			new YCFSecServiceByTypeIdxKey();
		return( key );
	}

	public YCFSecServiceByUTypeIdxKey newUTypeIdxKey() {
		YCFSecServiceByUTypeIdxKey key =
			new YCFSecServiceByUTypeIdxKey();
		return( key );
	}

	public YCFSecServiceByUHostPortIdxKey newUHostPortIdxKey() {
		YCFSecServiceByUHostPortIdxKey key =
			new YCFSecServiceByUHostPortIdxKey();
		return( key );
	}

	public YCFSecServiceBuff newBuff() {
		YCFSecServiceBuff buff =
			new YCFSecServiceBuff();
		return( buff );
	}

	public YCFSecServiceHBuff newHBuff() {
		YCFSecServiceHBuff hbuff =
			new YCFSecServiceHBuff();
		return( hbuff );
	}
}
