// Description: Java 11 edit object instance implementation for YCFGenKb GelPop.

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

public class YCFGenKbGelPopEditObj
	extends YCFGenKbGelInstructionEditObj

	implements IYCFGenKbGelPopEditObj
{
	protected IYCFGenKbGelInstructionObj optionalLookupRemainder;

	public YCFGenKbGelPopEditObj( IYCFGenKbGelPopObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( YCFGenKbGelPopObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelPop" );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbGelPopObj retobj = getSchema().getGelPopTableObj().realiseGelPop( (IYCFGenKbGelPopObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelPop().forget();
	}

	public IYCFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		IYCFGenKbGelPopObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelPop().getSchema()).getGelPopTableObj().createGelPop( getOrigAsGelPop() );
		if( retobj == getOrigAsGelPop() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelInstructionEditObj update() {
		getSchema().getGelPopTableObj().updateGelPop( (IYCFGenKbGelPopObj)this );
		return( null );
	}

	public YCFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelPopTableObj().deleteGelPop( getOrigAsGelPop() );
		return( null );
	}

	public IYCFGenKbGelPopTableObj getGelPopTable() {
		return( orig.getSchema().getGelPopTableObj() );
	}

	public IYCFGenKbGelPopEditObj getEditAsGelPop() {
		return( (IYCFGenKbGelPopEditObj)this );
	}

	public IYCFGenKbGelPopObj getOrigAsGelPop() {
		return( (IYCFGenKbGelPopObj)orig );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelPop().getSchema().getBackingStore()).getFactoryGelPop().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupRemainder = null;
		}
	}

	public YCFGenKbGelPopBuff getGelPopBuff() {
		return( (YCFGenKbGelPopBuff)getBuff() );
	}

	public String getRequiredGoalTypeName() {
		return( getGelPopBuff().getRequiredGoalTypeName() );
	}

	public void setRequiredGoalTypeName( String value ) {
		if( getGelPopBuff().getRequiredGoalTypeName() != value ) {
			getGelPopBuff().setRequiredGoalTypeName( value );
		}
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelPopBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelPopBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelPopBuff().getOptionalRemainderInstId() );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelPopBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelPopBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbGelInstructionObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelPop().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelPopBuff().getOptionalRemainderTenantId(),
					getGelPopBuff().getRequiredRemainderGelCacheId(),
					getGelPopBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( IYCFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelPopBuff();
			}
			if( value != null ) {
				getGelPopBuff().setOptionalRemainderTenantId( value.getRequiredTenantId() );
				getGelPopBuff().setRequiredRemainderGelCacheId( value.getRequiredGelCacheId() );
				getGelPopBuff().setOptionalRemainderInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelPopBuff().setOptionalRemainderTenantId( null );
				getGelPopBuff().setOptionalRemainderInstId( null );
			}
			optionalLookupRemainder = value;
	}

	public void copyBuffToOrig() {
		YCFGenKbGelPopBuff origBuff = getOrigAsGelPop().getGelPopBuff();
		YCFGenKbGelPopBuff myBuff = getGelPopBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelPopBuff origBuff = getOrigAsGelPop().getGelPopBuff();
		YCFGenKbGelPopBuff myBuff = getGelPopBuff();
		myBuff.set( origBuff );
	}
}
