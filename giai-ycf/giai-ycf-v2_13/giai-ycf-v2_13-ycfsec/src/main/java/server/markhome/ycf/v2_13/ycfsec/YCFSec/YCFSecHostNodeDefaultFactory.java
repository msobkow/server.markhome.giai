
// Description: Java 11 Default Factory implementation for HostNode.

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
	 *	YCFSecHostNodeFactory implementation for HostNode
	 */
public class YCFSecHostNodeDefaultFactory
	implements IYCFSecHostNodeFactory
{
	public YCFSecHostNodeDefaultFactory() {
	}

	public YCFSecHostNodePKey newPKey() {
		YCFSecHostNodePKey pkey =
			new YCFSecHostNodePKey();
		return( pkey );
	}

	public YCFSecHostNodeHPKey newHPKey() {
		YCFSecHostNodeHPKey hpkey =
			new YCFSecHostNodeHPKey();
		return( hpkey );
	}

	public YCFSecHostNodeByClusterIdxKey newClusterIdxKey() {
		YCFSecHostNodeByClusterIdxKey key =
			new YCFSecHostNodeByClusterIdxKey();
		return( key );
	}

	public YCFSecHostNodeByUDescrIdxKey newUDescrIdxKey() {
		YCFSecHostNodeByUDescrIdxKey key =
			new YCFSecHostNodeByUDescrIdxKey();
		return( key );
	}

	public YCFSecHostNodeByHostNameIdxKey newHostNameIdxKey() {
		YCFSecHostNodeByHostNameIdxKey key =
			new YCFSecHostNodeByHostNameIdxKey();
		return( key );
	}

	public YCFSecHostNodeBuff newBuff() {
		YCFSecHostNodeBuff buff =
			new YCFSecHostNodeBuff();
		return( buff );
	}

	public YCFSecHostNodeHBuff newHBuff() {
		YCFSecHostNodeHBuff hbuff =
			new YCFSecHostNodeHBuff();
		return( hbuff );
	}
}
