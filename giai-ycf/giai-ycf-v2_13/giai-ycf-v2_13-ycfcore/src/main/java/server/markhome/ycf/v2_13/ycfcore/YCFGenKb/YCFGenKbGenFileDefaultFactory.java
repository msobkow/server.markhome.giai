
// Description: Java 11 Default Factory implementation for GenFile.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;

	/*
	 *	CFGenKbGenFileFactory implementation for GenFile
	 */
public class CFGenKbGenFileDefaultFactory
	implements ICFGenKbGenFileFactory
{
	public CFGenKbGenFileDefaultFactory() {
	}

	public CFGenKbGenFileByXSrcBundleKey newXSrcBundleKey() {
		CFGenKbGenFileByXSrcBundleKey key =
			new CFGenKbGenFileByXSrcBundleKey();
		return( key );
	}

	public CFGenKbGenFileByXModNameKey newXModNameKey() {
		CFGenKbGenFileByXModNameKey key =
			new CFGenKbGenFileByXModNameKey();
		return( key );
	}

	public CFGenKbGenFileByXBasePkgKey newXBasePkgKey() {
		CFGenKbGenFileByXBasePkgKey key =
			new CFGenKbGenFileByXBasePkgKey();
		return( key );
	}

	public CFGenKbGenFileByXSubPkgKey newXSubPkgKey() {
		CFGenKbGenFileByXSubPkgKey key =
			new CFGenKbGenFileByXSubPkgKey();
		return( key );
	}

	public CFGenKbGenFileByXExpClsNameKey newXExpClsNameKey() {
		CFGenKbGenFileByXExpClsNameKey key =
			new CFGenKbGenFileByXExpClsNameKey();
		return( key );
	}

	public CFGenKbGenFileByXExpKeyNameKey newXExpKeyNameKey() {
		CFGenKbGenFileByXExpKeyNameKey key =
			new CFGenKbGenFileByXExpKeyNameKey();
		return( key );
	}

	public CFGenKbGenFileByXExpFileNameKey newXExpFileNameKey() {
		CFGenKbGenFileByXExpFileNameKey key =
			new CFGenKbGenFileByXExpFileNameKey();
		return( key );
	}

	public CFGenKbGenFileBuff newBuff() {
		CFGenKbGenFileBuff buff =
			new CFGenKbGenFileBuff();
		return( buff );
	}
}
