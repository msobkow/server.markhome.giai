
// Description: Java 11 Default Factory implementation for SecUser.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFInt;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

	/*
	 *	YCFIntSecUserFactory implementation for SecUser
	 */
public class YCFIntSecUserDefaultFactory
	extends YCFSecSecUserDefaultFactory
	implements IYCFIntSecUserFactory
{
	public YCFIntSecUserDefaultFactory() {
		super();
	}

	public YCFSecSecUserPKey newPKey() {
		YCFSecSecUserPKey pkey =
			new YCFSecSecUserPKey();
		return( pkey );
	}

	public YCFSecSecUserHPKey newHPKey() {
		YCFSecSecUserHPKey hpkey =
			new YCFSecSecUserHPKey();
		return( hpkey );
	}

	public YCFSecSecUserByULoginIdxKey newULoginIdxKey() {
		YCFSecSecUserByULoginIdxKey key =
			new YCFSecSecUserByULoginIdxKey();
		return( key );
	}

	public YCFSecSecUserByEMConfIdxKey newEMConfIdxKey() {
		YCFSecSecUserByEMConfIdxKey key =
			new YCFSecSecUserByEMConfIdxKey();
		return( key );
	}

	public YCFSecSecUserByPwdResetIdxKey newPwdResetIdxKey() {
		YCFSecSecUserByPwdResetIdxKey key =
			new YCFSecSecUserByPwdResetIdxKey();
		return( key );
	}

	public YCFSecSecUserByDefDevIdxKey newDefDevIdxKey() {
		YCFSecSecUserByDefDevIdxKey key =
			new YCFSecSecUserByDefDevIdxKey();
		return( key );
	}

	public YCFSecSecUserBuff newBuff() {
		YCFSecSecUserBuff buff =
			new YCFSecSecUserBuff();
		return( buff );
	}

	public YCFSecSecUserHBuff newHBuff() {
		YCFSecSecUserHBuff hbuff =
			new YCFSecSecUserHBuff();
		return( hbuff );
	}
}
