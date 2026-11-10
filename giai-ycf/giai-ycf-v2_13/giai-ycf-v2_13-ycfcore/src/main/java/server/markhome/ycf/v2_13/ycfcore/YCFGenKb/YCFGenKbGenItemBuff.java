// Description: Java 11 implementation of a GenItem buffer object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public class YCFGenKbGenItemBuff
{
	public final static String CLASS_CODE = "a920";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long CARTRIDGEID_INIT_VALUE = 0L;
	public static final long ITEMID_INIT_VALUE = 0L;
	public static final short RULETYPEID_INIT_VALUE = (short)0;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final short TOOLSETID_INIT_VALUE = (short)0;
	public static final short SCOPEDEFID_INIT_VALUE = (short)0;
	public static final short GENDEFID_INIT_VALUE = (short)0;
	public static final long GELEXECUTABLETENANTID_INIT_VALUE = 0L;
	public static final long GELEXECUTABLEGELCACHEID_INIT_VALUE = 0L;
	public static final long GELEXECUTABLEID_INIT_VALUE = 0L;
	public static final long PROBETENANTID_INIT_VALUE = 0L;
	public static final long PROBECARTRIDGEID_INIT_VALUE = 0L;
	public static final long PROBEGENITEMID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long CARTRIDGEID_MIN_VALUE = 0L;
	public static final long ITEMID_MIN_VALUE = 0L;
	public static final short RULETYPEID_MIN_VALUE = (short)0;
	public static final short TOOLSETID_MIN_VALUE = (short)0;
	public static final short SCOPEDEFID_MIN_VALUE = (short)0;
	public static final short GENDEFID_MIN_VALUE = (short)0;
	public static final long GELEXECUTABLETENANTID_MIN_VALUE = 0L;
	public static final long GELEXECUTABLEGELCACHEID_MIN_VALUE = 0L;
	public static final long GELEXECUTABLEID_MIN_VALUE = 0L;
	public static final long PROBETENANTID_MIN_VALUE = 0L;
	public static final long PROBECARTRIDGEID_MIN_VALUE = 0L;
	public static final long PROBEGENITEMID_MIN_VALUE = 0L;
	public static final long ITEMID_MAX_VALUE = 2147483647L;
	public static final short RULETYPEID_MAX_VALUE = (short)32767;
	public static final short TOOLSETID_MAX_VALUE = (short)32767;
	public static final short SCOPEDEFID_MAX_VALUE = (short)32767;
	public static final short GENDEFID_MAX_VALUE = (short)32767;
	public static final long PROBEGENITEMID_MAX_VALUE = 2147483647L;
	protected long requiredTenantId;
	protected long requiredCartridgeId;
	protected long requiredItemId;
	protected short requiredRuleTypeId;
	protected String requiredName;
	protected short requiredToolSetId;
	protected Short optionalScopeDefId;
	protected short requiredGenDefId;
	protected Long optionalGelExecutableTenantId;
	protected Long optionalGelExecutableGelCacheId;
	protected Long optionalGelExecutableId;
	protected Long optionalProbeTenantId;
	protected Long optionalProbeCartridgeId;
	protected Long optionalProbeGenItemId;
	protected int requiredRevision;
	public YCFGenKbGenItemBuff() {
		requiredTenantId = YCFGenKbGenItemBuff.TENANTID_INIT_VALUE;
		requiredCartridgeId = YCFGenKbGenItemBuff.CARTRIDGEID_INIT_VALUE;
		requiredItemId = YCFGenKbGenItemBuff.ITEMID_INIT_VALUE;
		requiredRuleTypeId = YCFGenKbGenItemBuff.RULETYPEID_INIT_VALUE;
		requiredName = new String( YCFGenKbGenItemBuff.NAME_INIT_VALUE );
		requiredToolSetId = YCFGenKbGenItemBuff.TOOLSETID_INIT_VALUE;
		optionalScopeDefId = null;
		requiredGenDefId = YCFGenKbGenItemBuff.GENDEFID_INIT_VALUE;
		optionalGelExecutableTenantId = null;
		optionalGelExecutableGelCacheId = null;
		optionalGelExecutableId = null;
		optionalProbeTenantId = null;
		optionalProbeCartridgeId = null;
		optionalProbeGenItemId = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFGenKbGenItemBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredCartridgeId() {
		return( requiredCartridgeId );
	}

	public void setRequiredCartridgeId( long value ) {
		if( value < YCFGenKbGenItemBuff.CARTRIDGEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredCartridgeId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.CARTRIDGEID_MIN_VALUE );
		}
		requiredCartridgeId = value;
	}

	public long getRequiredItemId() {
		return( requiredItemId );
	}

	public void setRequiredItemId( long value ) {
		if( value < YCFGenKbGenItemBuff.ITEMID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredItemId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.ITEMID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.ITEMID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredItemId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.ITEMID_MAX_VALUE );
		}
		requiredItemId = value;
	}

	public short getRequiredRuleTypeId() {
		return( requiredRuleTypeId );
	}

	public void setRequiredRuleTypeId( short value ) {
		if( value < YCFGenKbGenItemBuff.RULETYPEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredRuleTypeId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.RULETYPEID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.RULETYPEID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredRuleTypeId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.RULETYPEID_MAX_VALUE );
		}
		requiredRuleTypeId = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredName = value;
	}

	public short getRequiredToolSetId() {
		return( requiredToolSetId );
	}

	public void setRequiredToolSetId( short value ) {
		if( value < YCFGenKbGenItemBuff.TOOLSETID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredToolSetId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.TOOLSETID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.TOOLSETID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredToolSetId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.TOOLSETID_MAX_VALUE );
		}
		requiredToolSetId = value;
	}

	public Short getOptionalScopeDefId() {
		return( optionalScopeDefId );
	}

	public void setOptionalScopeDefId( Short value ) {
		if( value == null ) {
			optionalScopeDefId = null;
		}
		else if( value < YCFGenKbGenItemBuff.SCOPEDEFID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalScopeDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.SCOPEDEFID_MIN_VALUE );
		}
		else if( value > YCFGenKbGenItemBuff.SCOPEDEFID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalScopeDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.SCOPEDEFID_MAX_VALUE );
		}
		else {
			optionalScopeDefId = value;
		}
	}

	public short getRequiredGenDefId() {
		return( requiredGenDefId );
	}

	public void setRequiredGenDefId( short value ) {
		if( value < YCFGenKbGenItemBuff.GENDEFID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGenDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GENDEFID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.GENDEFID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredGenDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GENDEFID_MAX_VALUE );
		}
		requiredGenDefId = value;
	}

	public Long getOptionalGelExecutableTenantId() {
		return( optionalGelExecutableTenantId );
	}

	public void setOptionalGelExecutableTenantId( Long value ) {
		if( value == null ) {
			optionalGelExecutableTenantId = null;
		}
		else if( value < YCFGenKbGenItemBuff.GELEXECUTABLETENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableTenantId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GELEXECUTABLETENANTID_MIN_VALUE );
		}
		else {
			optionalGelExecutableTenantId = value;
		}
	}

	public Long getOptionalGelExecutableGelCacheId() {
		return( optionalGelExecutableGelCacheId );
	}

	public void setOptionalGelExecutableGelCacheId( Long value ) {
		if( value == null ) {
			optionalGelExecutableGelCacheId = null;
		}
		else if( value < YCFGenKbGenItemBuff.GELEXECUTABLEGELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GELEXECUTABLEGELCACHEID_MIN_VALUE );
		}
		else {
			optionalGelExecutableGelCacheId = value;
		}
	}

	public Long getOptionalGelExecutableId() {
		return( optionalGelExecutableId );
	}

	public void setOptionalGelExecutableId( Long value ) {
		if( value == null ) {
			optionalGelExecutableId = null;
		}
		else if( value < YCFGenKbGenItemBuff.GELEXECUTABLEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GELEXECUTABLEID_MIN_VALUE );
		}
		else {
			optionalGelExecutableId = value;
		}
	}

	public Long getOptionalProbeTenantId() {
		return( optionalProbeTenantId );
	}

	public void setOptionalProbeTenantId( Long value ) {
		if( value == null ) {
			optionalProbeTenantId = null;
		}
		else if( value < YCFGenKbGenItemBuff.PROBETENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalProbeTenantId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.PROBETENANTID_MIN_VALUE );
		}
		else {
			optionalProbeTenantId = value;
		}
	}

	public Long getOptionalProbeCartridgeId() {
		return( optionalProbeCartridgeId );
	}

	public void setOptionalProbeCartridgeId( Long value ) {
		if( value == null ) {
			optionalProbeCartridgeId = null;
		}
		else if( value < YCFGenKbGenItemBuff.PROBECARTRIDGEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalProbeCartridgeId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.PROBECARTRIDGEID_MIN_VALUE );
		}
		else {
			optionalProbeCartridgeId = value;
		}
	}

	public Long getOptionalProbeGenItemId() {
		return( optionalProbeGenItemId );
	}

	public void setOptionalProbeGenItemId( Long value ) {
		if( value == null ) {
			optionalProbeGenItemId = null;
		}
		else if( value < YCFGenKbGenItemBuff.PROBEGENITEMID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalProbeGenItemId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.PROBEGENITEMID_MIN_VALUE );
		}
		else if( value > YCFGenKbGenItemBuff.PROBEGENITEMID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalProbeGenItemId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.PROBEGENITEMID_MAX_VALUE );
		}
		else {
			optionalProbeGenItemId = value;
		}
	}

	public int getRequiredRevision() {
		return( requiredRevision );
	}

	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
				return( false );
			}
			if( getRequiredRuleTypeId() != rhs.getRequiredRuleTypeId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getRequiredToolSetId() != rhs.getRequiredToolSetId() ) {
				return( false );
			}
			if( getOptionalScopeDefId() != null ) {
				if( rhs.getOptionalScopeDefId() != null ) {
					if( ! getOptionalScopeDefId().equals( rhs.getOptionalScopeDefId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( false );
				}
			}
			if( getRequiredGenDefId() != rhs.getRequiredGenDefId() ) {
				return( false );
			}
			if( getOptionalGelExecutableTenantId() != null ) {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					if( ! getOptionalGelExecutableTenantId().equals( rhs.getOptionalGelExecutableTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					if( ! getOptionalGelExecutableGelCacheId().equals( rhs.getOptionalGelExecutableGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				if( rhs.getOptionalGelExecutableId() != null ) {
					if( ! getOptionalGelExecutableId().equals( rhs.getOptionalGelExecutableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeTenantId() != null ) {
				if( rhs.getOptionalProbeTenantId() != null ) {
					if( ! getOptionalProbeTenantId().equals( rhs.getOptionalProbeTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					if( ! getOptionalProbeCartridgeId().equals( rhs.getOptionalProbeCartridgeId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					if( ! getOptionalProbeGenItemId().equals( rhs.getOptionalProbeGenItemId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemPKey ) {
			YCFGenKbGenItemPKey rhs = (YCFGenKbGenItemPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByTenantIdxKey ) {
			YCFGenKbGenItemByTenantIdxKey rhs = (YCFGenKbGenItemByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByCartIdxKey ) {
			YCFGenKbGenItemByCartIdxKey rhs = (YCFGenKbGenItemByCartIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByRuleTypeIdxKey ) {
			YCFGenKbGenItemByRuleTypeIdxKey rhs = (YCFGenKbGenItemByRuleTypeIdxKey)obj;
			if( getRequiredRuleTypeId() != rhs.getRequiredRuleTypeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByToolSetIdxKey ) {
			YCFGenKbGenItemByToolSetIdxKey rhs = (YCFGenKbGenItemByToolSetIdxKey)obj;
			if( getRequiredToolSetId() != rhs.getRequiredToolSetId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByScopeIdxKey ) {
			YCFGenKbGenItemByScopeIdxKey rhs = (YCFGenKbGenItemByScopeIdxKey)obj;
			if( getOptionalScopeDefId() != null ) {
				if( rhs.getOptionalScopeDefId() != null ) {
					if( ! getOptionalScopeDefId().equals( rhs.getOptionalScopeDefId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByGenDefIdxKey ) {
			YCFGenKbGenItemByGenDefIdxKey rhs = (YCFGenKbGenItemByGenDefIdxKey)obj;
			if( getRequiredGenDefId() != rhs.getRequiredGenDefId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByAltIdxKey ) {
			YCFGenKbGenItemByAltIdxKey rhs = (YCFGenKbGenItemByAltIdxKey)obj;
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getRequiredToolSetId() != rhs.getRequiredToolSetId() ) {
				return( false );
			}
			if( getOptionalScopeDefId() != null ) {
				if( rhs.getOptionalScopeDefId() != null ) {
					if( ! getOptionalScopeDefId().equals( rhs.getOptionalScopeDefId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( false );
				}
			}
			if( getRequiredGenDefId() != rhs.getRequiredGenDefId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByGelExecIdxKey ) {
			YCFGenKbGenItemByGelExecIdxKey rhs = (YCFGenKbGenItemByGelExecIdxKey)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					if( ! getOptionalGelExecutableTenantId().equals( rhs.getOptionalGelExecutableTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					if( ! getOptionalGelExecutableGelCacheId().equals( rhs.getOptionalGelExecutableGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				if( rhs.getOptionalGelExecutableId() != null ) {
					if( ! getOptionalGelExecutableId().equals( rhs.getOptionalGelExecutableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemByProbeIdxKey ) {
			YCFGenKbGenItemByProbeIdxKey rhs = (YCFGenKbGenItemByProbeIdxKey)obj;
			if( getOptionalProbeTenantId() != null ) {
				if( rhs.getOptionalProbeTenantId() != null ) {
					if( ! getOptionalProbeTenantId().equals( rhs.getOptionalProbeTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					if( ! getOptionalProbeCartridgeId().equals( rhs.getOptionalProbeCartridgeId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					if( ! getOptionalProbeGenItemId().equals( rhs.getOptionalProbeGenItemId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredCartridgeId() );
		hashCode = hashCode + (int)( getRequiredItemId() );
		hashCode = ( hashCode * 0x10000 ) + getRequiredRuleTypeId();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredToolSetId();
		if( getOptionalScopeDefId() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalScopeDefId();
		}
		else {
			hashCode = (hashCode * 0x10000 );
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredGenDefId();
		if( getOptionalGelExecutableTenantId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableTenantId().hashCode();
		}
		if( getOptionalGelExecutableGelCacheId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableGelCacheId().hashCode();
		}
		if( getOptionalGelExecutableId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableId().hashCode();
		}
		if( getOptionalProbeTenantId() != null ) {
			hashCode = hashCode + getOptionalProbeTenantId().hashCode();
		}
		if( getOptionalProbeCartridgeId() != null ) {
			hashCode = hashCode + getOptionalProbeCartridgeId().hashCode();
		}
		if( getOptionalProbeGenItemId() != null ) {
			hashCode = hashCode + getOptionalProbeGenItemId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			int retval = 0;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredCartridgeId() < rhs.getRequiredCartridgeId() ) {
				return( -1 );
			}
			else if( getRequiredCartridgeId() > rhs.getRequiredCartridgeId() ) {
				return( 1 );
			}
			if( getRequiredItemId() < rhs.getRequiredItemId() ) {
				return( -1 );
			}
			else if( getRequiredItemId() > rhs.getRequiredItemId() ) {
				return( 1 );
			}
			if( getRequiredRuleTypeId() < rhs.getRequiredRuleTypeId() ) {
				return( -1 );
			}
			else if( getRequiredRuleTypeId() > rhs.getRequiredRuleTypeId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredToolSetId() < rhs.getRequiredToolSetId() ) {
				return( -1 );
			}
			else if( getRequiredToolSetId() > rhs.getRequiredToolSetId() ) {
				return( 1 );
			}
			if( getOptionalScopeDefId() != null ) {
				Short lhsScopeDefId = getOptionalScopeDefId();
				if( rhs.getOptionalScopeDefId() != null ) {
					Short rhsScopeDefId = rhs.getOptionalScopeDefId();
					int cmp = lhsScopeDefId.compareTo( rhsScopeDefId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredGenDefId() < rhs.getRequiredGenDefId() ) {
				return( -1 );
			}
			else if( getRequiredGenDefId() > rhs.getRequiredGenDefId() ) {
				return( 1 );
			}
			if( getOptionalGelExecutableTenantId() != null ) {
				Long lhsGelExecutableTenantId = getOptionalGelExecutableTenantId();
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					Long rhsGelExecutableTenantId = rhs.getOptionalGelExecutableTenantId();
					int cmp = lhsGelExecutableTenantId.compareTo( rhsGelExecutableTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				Long lhsGelExecutableGelCacheId = getOptionalGelExecutableGelCacheId();
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					Long rhsGelExecutableGelCacheId = rhs.getOptionalGelExecutableGelCacheId();
					int cmp = lhsGelExecutableGelCacheId.compareTo( rhsGelExecutableGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				Long lhsGelExecutableId = getOptionalGelExecutableId();
				if( rhs.getOptionalGelExecutableId() != null ) {
					Long rhsGelExecutableId = rhs.getOptionalGelExecutableId();
					int cmp = lhsGelExecutableId.compareTo( rhsGelExecutableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeTenantId() != null ) {
				Long lhsProbeTenantId = getOptionalProbeTenantId();
				if( rhs.getOptionalProbeTenantId() != null ) {
					Long rhsProbeTenantId = rhs.getOptionalProbeTenantId();
					int cmp = lhsProbeTenantId.compareTo( rhsProbeTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				Long lhsProbeCartridgeId = getOptionalProbeCartridgeId();
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					Long rhsProbeCartridgeId = rhs.getOptionalProbeCartridgeId();
					int cmp = lhsProbeCartridgeId.compareTo( rhsProbeCartridgeId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				Long lhsProbeGenItemId = getOptionalProbeGenItemId();
				if( rhs.getOptionalProbeGenItemId() != null ) {
					Long rhsProbeGenItemId = rhs.getOptionalProbeGenItemId();
					int cmp = lhsProbeGenItemId.compareTo( rhsProbeGenItemId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemPKey ) {
			YCFGenKbGenItemPKey rhs = (YCFGenKbGenItemPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredCartridgeId() < rhs.getRequiredCartridgeId() ) {
				return( -1 );
			}
			else if( getRequiredCartridgeId() > rhs.getRequiredCartridgeId() ) {
				return( 1 );
			}
			if( getRequiredItemId() < rhs.getRequiredItemId() ) {
				return( -1 );
			}
			else if( getRequiredItemId() > rhs.getRequiredItemId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByTenantIdxKey ) {
			YCFGenKbGenItemByTenantIdxKey rhs = (YCFGenKbGenItemByTenantIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByCartIdxKey ) {
			YCFGenKbGenItemByCartIdxKey rhs = (YCFGenKbGenItemByCartIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredCartridgeId() < rhs.getRequiredCartridgeId() ) {
				return( -1 );
			}
			else if( getRequiredCartridgeId() > rhs.getRequiredCartridgeId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByRuleTypeIdxKey ) {
			YCFGenKbGenItemByRuleTypeIdxKey rhs = (YCFGenKbGenItemByRuleTypeIdxKey)obj;

			if( getRequiredRuleTypeId() < rhs.getRequiredRuleTypeId() ) {
				return( -1 );
			}
			else if( getRequiredRuleTypeId() > rhs.getRequiredRuleTypeId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByToolSetIdxKey ) {
			YCFGenKbGenItemByToolSetIdxKey rhs = (YCFGenKbGenItemByToolSetIdxKey)obj;

			if( getRequiredToolSetId() < rhs.getRequiredToolSetId() ) {
				return( -1 );
			}
			else if( getRequiredToolSetId() > rhs.getRequiredToolSetId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByScopeIdxKey ) {
			YCFGenKbGenItemByScopeIdxKey rhs = (YCFGenKbGenItemByScopeIdxKey)obj;

			if( getOptionalScopeDefId() != null ) {
				Short lhsScopeDefId = getOptionalScopeDefId();
				if( rhs.getOptionalScopeDefId() != null ) {
					Short rhsScopeDefId = rhs.getOptionalScopeDefId();
					int cmp = lhsScopeDefId.compareTo( rhsScopeDefId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByGenDefIdxKey ) {
			YCFGenKbGenItemByGenDefIdxKey rhs = (YCFGenKbGenItemByGenDefIdxKey)obj;

			if( getRequiredGenDefId() < rhs.getRequiredGenDefId() ) {
				return( -1 );
			}
			else if( getRequiredGenDefId() > rhs.getRequiredGenDefId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByAltIdxKey ) {
			YCFGenKbGenItemByAltIdxKey rhs = (YCFGenKbGenItemByAltIdxKey)obj;

			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredToolSetId() < rhs.getRequiredToolSetId() ) {
				return( -1 );
			}
			else if( getRequiredToolSetId() > rhs.getRequiredToolSetId() ) {
				return( 1 );
			}
			if( getOptionalScopeDefId() != null ) {
				Short lhsScopeDefId = getOptionalScopeDefId();
				if( rhs.getOptionalScopeDefId() != null ) {
					Short rhsScopeDefId = rhs.getOptionalScopeDefId();
					int cmp = lhsScopeDefId.compareTo( rhsScopeDefId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredGenDefId() < rhs.getRequiredGenDefId() ) {
				return( -1 );
			}
			else if( getRequiredGenDefId() > rhs.getRequiredGenDefId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByGelExecIdxKey ) {
			YCFGenKbGenItemByGelExecIdxKey rhs = (YCFGenKbGenItemByGelExecIdxKey)obj;

			if( getOptionalGelExecutableTenantId() != null ) {
				Long lhsGelExecutableTenantId = getOptionalGelExecutableTenantId();
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					Long rhsGelExecutableTenantId = rhs.getOptionalGelExecutableTenantId();
					int cmp = lhsGelExecutableTenantId.compareTo( rhsGelExecutableTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				Long lhsGelExecutableGelCacheId = getOptionalGelExecutableGelCacheId();
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					Long rhsGelExecutableGelCacheId = rhs.getOptionalGelExecutableGelCacheId();
					int cmp = lhsGelExecutableGelCacheId.compareTo( rhsGelExecutableGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				Long lhsGelExecutableId = getOptionalGelExecutableId();
				if( rhs.getOptionalGelExecutableId() != null ) {
					Long rhsGelExecutableId = rhs.getOptionalGelExecutableId();
					int cmp = lhsGelExecutableId.compareTo( rhsGelExecutableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemByProbeIdxKey ) {
			YCFGenKbGenItemByProbeIdxKey rhs = (YCFGenKbGenItemByProbeIdxKey)obj;

			if( getOptionalProbeTenantId() != null ) {
				Long lhsProbeTenantId = getOptionalProbeTenantId();
				if( rhs.getOptionalProbeTenantId() != null ) {
					Long rhsProbeTenantId = rhs.getOptionalProbeTenantId();
					int cmp = lhsProbeTenantId.compareTo( rhsProbeTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				Long lhsProbeCartridgeId = getOptionalProbeCartridgeId();
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					Long rhsProbeCartridgeId = rhs.getOptionalProbeCartridgeId();
					int cmp = lhsProbeCartridgeId.compareTo( rhsProbeCartridgeId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				Long lhsProbeGenItemId = getOptionalProbeGenItemId();
				if( rhs.getOptionalProbeGenItemId() != null ) {
					Long rhsProbeGenItemId = rhs.getOptionalProbeGenItemId();
					int cmp = lhsProbeGenItemId.compareTo( rhsProbeGenItemId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public void set( YCFGenKbGenItemBuff src ) {
		setGenItemBuff( src );
	}

	public void setGenItemBuff( YCFGenKbGenItemBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredCartridgeId( src.getRequiredCartridgeId() );
		setRequiredItemId( src.getRequiredItemId() );
		setRequiredRuleTypeId( src.getRequiredRuleTypeId() );
		setRequiredName( src.getRequiredName() );
		setRequiredToolSetId( src.getRequiredToolSetId() );
		setOptionalScopeDefId( src.getOptionalScopeDefId() );
		setRequiredGenDefId( src.getRequiredGenDefId() );
		setOptionalGelExecutableTenantId( src.getOptionalGelExecutableTenantId() );
		setOptionalGelExecutableGelCacheId( src.getOptionalGelExecutableGelCacheId() );
		setOptionalGelExecutableId( src.getOptionalGelExecutableId() );
		setOptionalProbeTenantId( src.getOptionalProbeTenantId() );
		setOptionalProbeCartridgeId( src.getOptionalProbeCartridgeId() );
		setOptionalProbeGenItemId( src.getOptionalProbeGenItemId() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
