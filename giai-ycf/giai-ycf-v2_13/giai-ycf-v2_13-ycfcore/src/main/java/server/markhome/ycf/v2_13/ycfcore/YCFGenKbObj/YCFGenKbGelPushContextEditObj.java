// Description: Java 11 edit object instance implementation for YCFGenKb GelPushContext.

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

public class YCFGenKbGelPushContextEditObj
	extends YCFGenKbGelInstructionEditObj

	implements IYCFGenKbGelPushContextEditObj
{
	protected IYCFGenKbGelInstructionObj optionalLookupRemainder;

	public YCFGenKbGelPushContextEditObj( IYCFGenKbGelPushContextObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( YCFGenKbGelPushContextObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelPushContext" );
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
		IYCFGenKbGelPushContextObj retobj = getSchema().getGelPushContextTableObj().realiseGelPushContext((IYCFGenKbGelPushContextObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelPushContext().forget();
	}

	public IYCFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		IYCFGenKbGelPushContextObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelPushContext().getSchema()).getGelPushContextTableObj().createGelPushContext( getOrigAsGelPushContext() );
		if( retobj == getOrigAsGelPushContext() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelInstructionEditObj update() {
		getSchema().getGelPushContextTableObj().updateGelPushContext( (IYCFGenKbGelPushContextObj)this );
		return( null );
	}

	public YCFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelPushContextTableObj().deleteGelPushContext( getOrigAsGelPushContext() );
		return( null );
	}

	public IYCFGenKbGelPushContextTableObj getGelPushContextTable() {
		return( orig.getSchema().getGelPushContextTableObj() );
	}

	public IYCFGenKbGelPushContextEditObj getEditAsGelPushContext() {
		return( (IYCFGenKbGelPushContextEditObj)this );
	}

	public IYCFGenKbGelPushContextObj getOrigAsGelPushContext() {
		return( (IYCFGenKbGelPushContextObj)orig );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelPushContext().getSchema().getBackingStore()).getFactoryGelPushContext().newBuff();
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

	public YCFGenKbGelPushContextBuff getGelPushContextBuff() {
		return( (YCFGenKbGelPushContextBuff)getBuff() );
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

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelPushContextBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelPushContextBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbGelInstructionObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelPushContext().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelPushContextBuff().getOptionalRemainderTenantId(),
					getGelPushContextBuff().getRequiredRemainderGelCacheId(),
					getGelPushContextBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( IYCFGenKbGelInstructionObj value ) {
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
		YCFGenKbGelPushContextBuff origBuff = getOrigAsGelPushContext().getGelPushContextBuff();
		YCFGenKbGelPushContextBuff myBuff = getGelPushContextBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelPushContextBuff origBuff = getOrigAsGelPushContext().getGelPushContextBuff();
		YCFGenKbGelPushContextBuff myBuff = getGelPushContextBuff();
		myBuff.set( origBuff );
	}
}
