// Description: Java 11 implementation of a GenItem by RuleTypeIdx index key object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;

public class CFGenKbGenItemByRuleTypeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected short requiredRuleTypeId;
	public CFGenKbGenItemByRuleTypeIdxKey() {
		requiredRuleTypeId = CFGenKbGenItemBuff.RULETYPEID_INIT_VALUE;
	}

	public short getRequiredRuleTypeId() {
		return( requiredRuleTypeId );
	}

	public void setRequiredRuleTypeId( short value ) {
		if( value < CFGenKbGenItemBuff.RULETYPEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredRuleTypeId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.RULETYPEID_MIN_VALUE );
		}
		if( value > CFGenKbGenItemBuff.RULETYPEID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredRuleTypeId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.RULETYPEID_MAX_VALUE );
		}
		requiredRuleTypeId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenItemByRuleTypeIdxKey ) {
			CFGenKbGenItemByRuleTypeIdxKey rhs = (CFGenKbGenItemByRuleTypeIdxKey)obj;
			if( getRequiredRuleTypeId() != rhs.getRequiredRuleTypeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredRuleTypeId() != rhs.getRequiredRuleTypeId() ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = ( hashCode * 0x10000 ) + getRequiredRuleTypeId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGenItemByRuleTypeIdxKey ) {
			CFGenKbGenItemByRuleTypeIdxKey rhs = (CFGenKbGenItemByRuleTypeIdxKey)obj;
			if( getRequiredRuleTypeId() < rhs.getRequiredRuleTypeId() ) {
				return( -1 );
			}
			else if( getRequiredRuleTypeId() > rhs.getRequiredRuleTypeId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredRuleTypeId() < rhs.getRequiredRuleTypeId() ) {
				return( -1 );
			}
			else if( getRequiredRuleTypeId() > rhs.getRequiredRuleTypeId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFGenKbGenItemByRuleTypeIdx"
			+ " RequiredRuleTypeId=" + "\"" + Short.toString( getRequiredRuleTypeId() ) + "\""
			+ "/>";
		return( ret );
	}
}
