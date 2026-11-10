// Description: Java 11 edit object instance implementation for YCFGenKb GelPrefixLine.

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

public class YCFGenKbGelPrefixLineEditObj
	extends YCFGenKbGelInstructionEditObj

	implements IYCFGenKbGelPrefixLineEditObj
{
	protected IYCFGenKbGelInstructionObj optionalLookupRemainder;

	public YCFGenKbGelPrefixLineEditObj( IYCFGenKbGelPrefixLineObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( YCFGenKbGelPrefixLineObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelPrefixLine" );
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
		IYCFGenKbGelPrefixLineObj retobj = getSchema().getGelPrefixLineTableObj().realiseGelPrefixLine( (IYCFGenKbGelPrefixLineObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelPrefixLine().forget();
	}

	public IYCFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		IYCFGenKbGelPrefixLineObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelPrefixLine().getSchema()).getGelPrefixLineTableObj().createGelPrefixLine( getOrigAsGelPrefixLine() );
		if( retobj == getOrigAsGelPrefixLine() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelInstructionEditObj update() {
		getSchema().getGelPrefixLineTableObj().updateGelPrefixLine( (IYCFGenKbGelPrefixLineObj)this );
		return( null );
	}

	public YCFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelPrefixLineTableObj().deleteGelPrefixLine( getOrigAsGelPrefixLine() );
		return( null );
	}

	public IYCFGenKbGelPrefixLineTableObj getGelPrefixLineTable() {
		return( orig.getSchema().getGelPrefixLineTableObj() );
	}

	public IYCFGenKbGelPrefixLineEditObj getEditAsGelPrefixLine() {
		return( (IYCFGenKbGelPrefixLineEditObj)this );
	}

	public IYCFGenKbGelPrefixLineObj getOrigAsGelPrefixLine() {
		return( (IYCFGenKbGelPrefixLineObj)orig );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelPrefixLine().getSchema().getBackingStore()).getFactoryGelPrefixLine().newBuff();
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

	public YCFGenKbGelPrefixLineBuff getGelPrefixLineBuff() {
		return( (YCFGenKbGelPrefixLineBuff)getBuff() );
	}

	public String getRequiredPrefixName() {
		return( getGelPrefixLineBuff().getRequiredPrefixName() );
	}

	public void setRequiredPrefixName( String value ) {
		if( getGelPrefixLineBuff().getRequiredPrefixName() != value ) {
			getGelPrefixLineBuff().setRequiredPrefixName( value );
		}
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelPrefixLineBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelPrefixLineBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelPrefixLineBuff().getOptionalRemainderInstId() );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelPrefixLineBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelPrefixLineBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbGelInstructionObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelPrefixLine().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelPrefixLineBuff().getOptionalRemainderTenantId(),
					getGelPrefixLineBuff().getRequiredRemainderGelCacheId(),
					getGelPrefixLineBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( IYCFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelPrefixLineBuff();
			}
			if( value != null ) {
				getGelPrefixLineBuff().setOptionalRemainderTenantId( value.getRequiredTenantId() );
				getGelPrefixLineBuff().setRequiredRemainderGelCacheId( value.getRequiredGelCacheId() );
				getGelPrefixLineBuff().setOptionalRemainderInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelPrefixLineBuff().setOptionalRemainderTenantId( null );
				getGelPrefixLineBuff().setOptionalRemainderInstId( null );
			}
			optionalLookupRemainder = value;
	}

	public void copyBuffToOrig() {
		YCFGenKbGelPrefixLineBuff origBuff = getOrigAsGelPrefixLine().getGelPrefixLineBuff();
		YCFGenKbGelPrefixLineBuff myBuff = getGelPrefixLineBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelPrefixLineBuff origBuff = getOrigAsGelPrefixLine().getGelPrefixLineBuff();
		YCFGenKbGelPrefixLineBuff myBuff = getGelPrefixLineBuff();
		myBuff.set( origBuff );
	}
}
