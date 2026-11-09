// Description: Java 11 edit object instance implementation for CFGenKb GelPushContext.

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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public class CFGenKbGelPushContextEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelPushContextEditObj
{
	protected ICFGenKbGelInstructionObj optionalLookupRemainder;

	public CFGenKbGelPushContextEditObj( ICFGenKbGelPushContextObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CFGenKbGelPushContextObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelPushContext" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelInstId();
		objName = Long.toString( val );
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof ICFGenKbTenantObj ) {
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
				if( container instanceof ICFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof ICFGenKbTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
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
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFGenKbTenantObj ) {
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

	public ICFGenKbGelInstructionObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbGelPushContextObj retobj = getSchema().getGelPushContextTableObj().realiseGelPushContext((ICFGenKbGelPushContextObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelPushContext().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelPushContextObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelPushContext().getSchema()).getGelPushContextTableObj().createGelPushContext( getOrigAsGelPushContext() );
		if( retobj == getOrigAsGelPushContext() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelPushContextTableObj().updateGelPushContext( (ICFGenKbGelPushContextObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelPushContextTableObj().deleteGelPushContext( getOrigAsGelPushContext() );
		return( null );
	}

	public ICFGenKbGelPushContextTableObj getGelPushContextTable() {
		return( orig.getSchema().getGelPushContextTableObj() );
	}

	public ICFGenKbGelPushContextEditObj getEditAsGelPushContext() {
		return( (ICFGenKbGelPushContextEditObj)this );
	}

	public ICFGenKbGelPushContextObj getOrigAsGelPushContext() {
		return( (ICFGenKbGelPushContextObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelPushContext().getSchema().getBackingStore()).getFactoryGelPushContext().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupRemainder = null;
		}
	}

	public CFGenKbGelPushContextBuff getGelPushContextBuff() {
		return( (CFGenKbGelPushContextBuff)getBuff() );
	}

	public String getRequiredGoalTypeName() {
		return( getGelPushContextBuff().getRequiredGoalTypeName() );
	}

	public void setRequiredGoalTypeName( String value ) {
		if( getGelPushContextBuff().getRequiredGoalTypeName() != value ) {
			getGelPushContextBuff().setRequiredGoalTypeName( value );
		}
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelPushContextBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelPushContextBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelPushContextBuff().getOptionalRemainderInstId() );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelPushContextBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelPushContextBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelInstructionObj obj = ((ICFGenKbSchemaObj)getOrigAsGelPushContext().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelPushContextBuff().getOptionalRemainderTenantId(),
					getGelPushContextBuff().getRequiredRemainderGelCacheId(),
					getGelPushContextBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( ICFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelPushContextBuff();
			}
			if( value != null ) {
				getGelPushContextBuff().setOptionalRemainderTenantId( value.getRequiredTenantId() );
				getGelPushContextBuff().setRequiredRemainderGelCacheId( value.getRequiredGelCacheId() );
				getGelPushContextBuff().setOptionalRemainderInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelPushContextBuff().setOptionalRemainderTenantId( null );
				getGelPushContextBuff().setOptionalRemainderInstId( null );
			}
			optionalLookupRemainder = value;
	}

	public void copyBuffToOrig() {
		CFGenKbGelPushContextBuff origBuff = getOrigAsGelPushContext().getGelPushContextBuff();
		CFGenKbGelPushContextBuff myBuff = getGelPushContextBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelPushContextBuff origBuff = getOrigAsGelPushContext().getGelPushContextBuff();
		CFGenKbGelPushContextBuff myBuff = getGelPushContextBuff();
		myBuff.set( origBuff );
	}
}
