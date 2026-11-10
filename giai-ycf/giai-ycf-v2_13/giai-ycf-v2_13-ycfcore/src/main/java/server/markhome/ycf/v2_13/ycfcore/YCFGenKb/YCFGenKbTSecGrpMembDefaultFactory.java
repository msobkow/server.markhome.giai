
// Description: Java 11 Default Factory implementation for TSecGrpMemb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

	/*
	 *	YCFGenKbTSecGrpMembFactory implementation for TSecGrpMemb
	 */
public class YCFGenKbTSecGrpMembDefaultFactory
	implements IYCFGenKbTSecGrpMembFactory
{
	public YCFGenKbTSecGrpMembDefaultFactory() {
	}

	public YCFGenKbTSecGrpMembPKey newPKey() {
		YCFGenKbTSecGrpMembPKey pkey =
			new YCFGenKbTSecGrpMembPKey();
		return( pkey );
	}

	public YCFGenKbTSecGrpMembByTenantIdxKey newTenantIdxKey() {
		YCFGenKbTSecGrpMembByTenantIdxKey key =
			new YCFGenKbTSecGrpMembByTenantIdxKey();
		return( key );
	}

	public YCFGenKbTSecGrpMembByGroupIdxKey newGroupIdxKey() {
		YCFGenKbTSecGrpMembByGroupIdxKey key =
			new YCFGenKbTSecGrpMembByGroupIdxKey();
		return( key );
	}

	public YCFGenKbTSecGrpMembByUserIdxKey newUserIdxKey() {
		YCFGenKbTSecGrpMembByUserIdxKey key =
			new YCFGenKbTSecGrpMembByUserIdxKey();
		return( key );
	}

	public YCFGenKbTSecGrpMembByUUserIdxKey newUUserIdxKey() {
		YCFGenKbTSecGrpMembByUUserIdxKey key =
			new YCFGenKbTSecGrpMembByUUserIdxKey();
		return( key );
	}

	public YCFGenKbTSecGrpMembBuff newBuff() {
		YCFGenKbTSecGrpMembBuff buff =
			new YCFGenKbTSecGrpMembBuff();
		return( buff );
	}
}
