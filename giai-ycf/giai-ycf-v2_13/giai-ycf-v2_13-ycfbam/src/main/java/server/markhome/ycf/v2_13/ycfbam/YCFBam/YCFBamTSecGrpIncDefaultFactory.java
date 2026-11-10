
// Description: Java 11 Default Factory implementation for TSecGrpInc.

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
	 *	YCFBamTSecGrpIncFactory implementation for TSecGrpInc
	 */
public class YCFBamTSecGrpIncDefaultFactory
	extends YCFSecTSecGrpIncDefaultFactory
	implements IYCFBamTSecGrpIncFactory
{
	public YCFBamTSecGrpIncDefaultFactory() {
		super();
	}

	public YCFSecTSecGrpIncPKey newPKey() {
		YCFSecTSecGrpIncPKey pkey =
			new YCFSecTSecGrpIncPKey();
		return( pkey );
	}

	public YCFSecTSecGrpIncHPKey newHPKey() {
		YCFSecTSecGrpIncHPKey hpkey =
			new YCFSecTSecGrpIncHPKey();
		return( hpkey );
	}

	public YCFSecTSecGrpIncByTenantIdxKey newTenantIdxKey() {
		YCFSecTSecGrpIncByTenantIdxKey key =
			new YCFSecTSecGrpIncByTenantIdxKey();
		return( key );
	}

	public YCFSecTSecGrpIncByGroupIdxKey newGroupIdxKey() {
		YCFSecTSecGrpIncByGroupIdxKey key =
			new YCFSecTSecGrpIncByGroupIdxKey();
		return( key );
	}

	public YCFSecTSecGrpIncByIncludeIdxKey newIncludeIdxKey() {
		YCFSecTSecGrpIncByIncludeIdxKey key =
			new YCFSecTSecGrpIncByIncludeIdxKey();
		return( key );
	}

	public YCFSecTSecGrpIncByUIncludeIdxKey newUIncludeIdxKey() {
		YCFSecTSecGrpIncByUIncludeIdxKey key =
			new YCFSecTSecGrpIncByUIncludeIdxKey();
		return( key );
	}

	public YCFSecTSecGrpIncBuff newBuff() {
		YCFSecTSecGrpIncBuff buff =
			new YCFSecTSecGrpIncBuff();
		return( buff );
	}

	public YCFSecTSecGrpIncHBuff newHBuff() {
		YCFSecTSecGrpIncHBuff hbuff =
			new YCFSecTSecGrpIncHBuff();
		return( hbuff );
	}
}
