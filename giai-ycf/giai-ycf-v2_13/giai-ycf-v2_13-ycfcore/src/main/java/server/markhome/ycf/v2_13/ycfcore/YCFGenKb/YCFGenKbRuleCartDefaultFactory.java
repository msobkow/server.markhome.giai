
// Description: Java 11 Default Factory implementation for RuleCart.

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
	 *	CFGenKbRuleCartFactory implementation for RuleCart
	 */
public class CFGenKbRuleCartDefaultFactory
	implements ICFGenKbRuleCartFactory
{
	public CFGenKbRuleCartDefaultFactory() {
	}

	public CFGenKbRuleCartPKey newPKey() {
		CFGenKbRuleCartPKey pkey =
			new CFGenKbRuleCartPKey();
		return( pkey );
	}

	public CFGenKbRuleCartByTenantIdxKey newTenantIdxKey() {
		CFGenKbRuleCartByTenantIdxKey key =
			new CFGenKbRuleCartByTenantIdxKey();
		return( key );
	}

	public CFGenKbRuleCartByNameIdxKey newNameIdxKey() {
		CFGenKbRuleCartByNameIdxKey key =
			new CFGenKbRuleCartByNameIdxKey();
		return( key );
	}

	public CFGenKbRuleCartBuff newBuff() {
		CFGenKbRuleCartBuff buff =
			new CFGenKbRuleCartBuff();
		return( buff );
	}
}
