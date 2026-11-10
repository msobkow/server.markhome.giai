// Description: Java 11 base object instance implementation for YCFGenKb GelModifier.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public class YCFGenKbGelModifierObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelModifierObj
{
	public final static String CLASS_CODE = "a930";
	protected IYCFGenKbGelInstructionObj optionalLookupRemainder;

	public YCFGenKbGelModifierObj() {
		super();
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelModifierObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelModifier" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelInstId();
		objName = Long.toString( val );
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public IYCFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		IYCFLibAnyObj subObj = null;
		IYCFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFGenKbTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public IYCFGenKbGelInstructionObj realise() {
		IYCFGenKbGelModifierObj retobj = ((IYCFGenKbSchemaObj)schema).getGelModifierTableObj().realiseGelModifier(
			(IYCFGenKbGelModifierObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelModifierTableObj().reallyDeepDisposeGelModifier( (IYCFGenKbGelModifierObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelModifierObj retobj = ((IYCFGenKbSchemaObj)schema).getGelModifierTableObj().readGelModifierByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelModifierObj retobj = ((IYCFGenKbSchemaObj)schema).getGelModifierTableObj().readGelModifierByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelModifierTableObj getGelModifierTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelModifierTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId(),
						getPKey().getRequiredGelInstId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelModifierBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelModifierBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelModifierBuff getGelModifierBuff() {
		return( (YCFGenKbGelModifierBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelModifierObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelModifierObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelModifierTableObj().lockGelModifier( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelModifierTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelModifierEditObj getEditAsGelModifier() {
		return( (IYCFGenKbGelModifierEditObj)edit );
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelModifierBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelModifierBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelModifierBuff().getOptionalRemainderInstId() );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( ( optionalLookupRemainder == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelModifierBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelModifierBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupRemainder = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelModifierBuff().getOptionalRemainderTenantId(),
					getGelModifierBuff().getRequiredRemainderGelCacheId(),
					getGelModifierBuff().getOptionalRemainderInstId(), forceRead );
			}
		}
		return( optionalLookupRemainder );
	}

	public String expand( MssYCFGenContext genContext ) {
		throw new RuntimeException( "YCFGenKbGelModifierObj.expand() Must be overloaded by specializing instruction implementation" );
	}
}
