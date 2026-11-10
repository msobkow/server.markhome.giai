// Description: Java 11 base object instance implementation for YCFGenKb GelConstrain.

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

public class YCFGenKbGelConstrainObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelConstrainObj
{
	public final static String CLASS_CODE = "a92c";
	protected IYCFGenKbGelInstructionObj optionalLookupRemainder;

	public YCFGenKbGelConstrainObj() {
		super();
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelConstrainObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelConstrain" );
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
		IYCFGenKbGelConstrainObj retobj = ((IYCFGenKbSchemaObj)schema).getGelConstrainTableObj().realiseGelConstrain(
			(IYCFGenKbGelConstrainObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelConstrainTableObj().reallyDeepDisposeGelConstrain( (IYCFGenKbGelConstrainObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelConstrainObj retobj = ((IYCFGenKbSchemaObj)schema).getGelConstrainTableObj().readGelConstrainByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelConstrainObj retobj = ((IYCFGenKbSchemaObj)schema).getGelConstrainTableObj().readGelConstrainByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelConstrainTableObj getGelConstrainTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelConstrainTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelConstrain().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelConstrain().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelConstrainBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelConstrainBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelConstrainBuff getGelConstrainBuff() {
		return( (YCFGenKbGelConstrainBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelConstrainObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelConstrainObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelConstrainTableObj().lockGelConstrain( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelConstrainTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelConstrainEditObj getEditAsGelConstrain() {
		return( (IYCFGenKbGelConstrainEditObj)edit );
	}

	public Long getOptionalHardConstraint() {
		return( getGelConstrainBuff().getOptionalHardConstraint() );
	}

	public String getOptionalConstrainingName() {
		return( getGelConstrainBuff().getOptionalConstrainingName() );
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelConstrainBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelConstrainBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelConstrainBuff().getOptionalRemainderInstId() );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( ( optionalLookupRemainder == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelConstrainBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelConstrainBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupRemainder = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelConstrainBuff().getOptionalRemainderTenantId(),
					getGelConstrainBuff().getRequiredRemainderGelCacheId(),
					getGelConstrainBuff().getOptionalRemainderInstId(), forceRead );
			}
		}
		return( optionalLookupRemainder );
	}

	public String expand( MssYCFGenContext genContext ) {
		throw new RuntimeException( "YCFGenKbGelConstrainObj.expand() Implemention must be overriden by constraint specialization");
	}
}
