
// Description: Java 11 Default Factory implementation for SecDevice.

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
	 *	YCFIntSecDeviceFactory implementation for SecDevice
	 */
public class YCFIntSecDeviceDefaultFactory
	extends YCFSecSecDeviceDefaultFactory
	implements IYCFIntSecDeviceFactory
{
	public YCFIntSecDeviceDefaultFactory() {
		super();
	}

	public YCFSecSecDevicePKey newPKey() {
		YCFSecSecDevicePKey pkey =
			new YCFSecSecDevicePKey();
		return( pkey );
	}

	public YCFSecSecDeviceHPKey newHPKey() {
		YCFSecSecDeviceHPKey hpkey =
			new YCFSecSecDeviceHPKey();
		return( hpkey );
	}

	public YCFSecSecDeviceByNameIdxKey newNameIdxKey() {
		YCFSecSecDeviceByNameIdxKey key =
			new YCFSecSecDeviceByNameIdxKey();
		return( key );
	}

	public YCFSecSecDeviceByUserIdxKey newUserIdxKey() {
		YCFSecSecDeviceByUserIdxKey key =
			new YCFSecSecDeviceByUserIdxKey();
		return( key );
	}

	public YCFSecSecDeviceBuff newBuff() {
		YCFSecSecDeviceBuff buff =
			new YCFSecSecDeviceBuff();
		return( buff );
	}

	public YCFSecSecDeviceHBuff newHBuff() {
		YCFSecSecDeviceHBuff hbuff =
			new YCFSecSecDeviceHBuff();
		return( hbuff );
	}
}
