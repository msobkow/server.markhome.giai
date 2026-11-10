// Description: Java 11 edit object instance implementation for YCFGenKb GelSwitchLimb.

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

public class YCFGenKbGelSwitchLimbEditObj
	implements IYCFGenKbGelSwitchLimbEditObj
{
	protected IYCFGenKbGelSwitchLimbObj orig;
	protected YCFGenKbGelSwitchLimbBuff buff;
	protected IYCFGenKbGelSwitchObj requiredParentSwitch;
	protected IYCFGenKbTenantObj requiredOwnerTenant;

	public YCFGenKbGelSwitchLimbEditObj( IYCFGenKbGelSwitchLimbObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbGelSwitchLimbBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredParentSwitch = null;
		requiredOwnerTenant = null;
	}

	public String getClassCode() {
		return( YCFGenKbGelSwitchLimbObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSwitchLimb" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredLimbName();
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

	public IYCFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		IYCFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		IYCFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
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

	public String getObjFullName() {
		String fullName = getObjName();
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
				fullName = containerName + "." + fullName;
				container = container.getObjScope();
			}
		}
		return( fullName );
	}

	public IYCFGenKbGelSwitchLimbObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbGelSwitchLimbObj retobj = getSchema().getGelSwitchLimbTableObj().realiseGelSwitchLimb( (IYCFGenKbGelSwitchLimbObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelSwitchLimb().forget();
	}

	public IYCFGenKbGelSwitchLimbObj read() {
		IYCFGenKbGelSwitchLimbObj retval = getOrigAsGelSwitchLimb().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGelSwitchLimbObj read( boolean forceRead ) {
		IYCFGenKbGelSwitchLimbObj retval = getOrigAsGelSwitchLimb().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGelSwitchLimbObj create() {
		copyBuffToOrig();
		IYCFGenKbGelSwitchLimbObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelSwitchLimb().getSchema()).getGelSwitchLimbTableObj().createGelSwitchLimb( getOrigAsGelSwitchLimb() );
		if( retobj == getOrigAsGelSwitchLimb() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelSwitchLimbEditObj update() {
		getSchema().getGelSwitchLimbTableObj().updateGelSwitchLimb( (IYCFGenKbGelSwitchLimbObj)this );
		return( null );
	}

	public YCFGenKbGelSwitchLimbEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelSwitchLimbTableObj().deleteGelSwitchLimb( getOrigAsGelSwitchLimb() );
		return( null );
	}

	public IYCFGenKbGelSwitchLimbTableObj getGelSwitchLimbTable() {
		return( orig.getSchema().getGelSwitchLimbTableObj() );
	}

	public IYCFGenKbGelSwitchLimbEditObj getEdit() {
		return( (IYCFGenKbGelSwitchLimbEditObj)this );
	}

	public IYCFGenKbGelSwitchLimbEditObj getEditAsGelSwitchLimb() {
		return( (IYCFGenKbGelSwitchLimbEditObj)this );
	}

	public IYCFGenKbGelSwitchLimbEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbGelSwitchLimbObj getOrig() {
		return( orig );
	}

	public IYCFGenKbGelSwitchLimbObj getOrigAsGelSwitchLimb() {
		return( (IYCFGenKbGelSwitchLimbObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbGelSwitchLimbBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelSwitchLimb().getSchema().getBackingStore()).getFactoryGelSwitchLimb().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelSwitchLimbBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredParentSwitch = null;
			requiredOwnerTenant = null;
		}
	}

	public YCFGenKbGelSwitchLimbBuff getGelSwitchLimbBuff() {
		return( (YCFGenKbGelSwitchLimbBuff)getBuff() );
	}

	public YCFGenKbGelSwitchLimbPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbGelSwitchLimbPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredGelCacheId() {
		return( getPKey().getRequiredGelCacheId() );
	}

	public long getRequiredGelInstId() {
		return( getPKey().getRequiredGelInstId() );
	}

	public String getRequiredLimbName() {
		return( getPKey().getRequiredLimbName() );
	}

	public void setRequiredLimbName( String value ) {
		if( getPKey().getRequiredLimbName() != value ) {
			getPKey().setRequiredLimbName( value );
		}
		if( getGelSwitchLimbBuff().getRequiredLimbName() != value ) {
			getGelSwitchLimbBuff().setRequiredLimbName( value );
		}
	}

	public String getRequiredLimbExpansion() {
		return( getGelSwitchLimbBuff().getRequiredLimbExpansion() );
	}

	public void setRequiredLimbExpansion( String value ) {
		if( getGelSwitchLimbBuff().getRequiredLimbExpansion() != value ) {
			getGelSwitchLimbBuff().setRequiredLimbExpansion( value );
		}
	}

	public IYCFGenKbGelSwitchObj getRequiredParentSwitch() {
		return( getRequiredParentSwitch( false ) );
	}

	public IYCFGenKbGelSwitchObj getRequiredParentSwitch( boolean forceRead ) {
		if( forceRead || ( requiredParentSwitch == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbGelSwitchObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelSwitchLimb().getSchema()).getGelSwitchTableObj().readGelSwitchByPIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId() );
				requiredParentSwitch = obj;
			}
		}
		return( requiredParentSwitch );
	}

	public void setRequiredParentSwitch( IYCFGenKbGelSwitchObj value ) {
			if( buff == null ) {
				getGelSwitchLimbBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getGelSwitchLimbBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getPKey().setRequiredGelCacheId( value.getRequiredGelCacheId() );
				getGelSwitchLimbBuff().setRequiredGelCacheId( value.getRequiredGelCacheId() );
				getPKey().setRequiredGelInstId( value.getRequiredGelInstId() );
				getGelSwitchLimbBuff().setRequiredGelInstId( value.getRequiredGelInstId() );
			}
			else {
			}
			requiredParentSwitch = value;
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTenantObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelSwitchLimb().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFGenKbTenantObj value ) {
			if( buff == null ) {
				getGelSwitchLimbBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getGelSwitchLimbBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
		buff.setRequiredGelInstId( getPKey().getRequiredGelInstId() );
		buff.setRequiredLimbName( getPKey().getRequiredLimbName() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
		getPKey().setRequiredGelInstId( buff.getRequiredGelInstId() );
		getPKey().setRequiredLimbName( buff.getRequiredLimbName() );
	}

	public void copyBuffToOrig() {
		YCFGenKbGelSwitchLimbBuff origBuff = getOrigAsGelSwitchLimb().getGelSwitchLimbBuff();
		YCFGenKbGelSwitchLimbBuff myBuff = getGelSwitchLimbBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelSwitchLimbBuff origBuff = getOrigAsGelSwitchLimb().getGelSwitchLimbBuff();
		YCFGenKbGelSwitchLimbBuff myBuff = getGelSwitchLimbBuff();
		myBuff.set( origBuff );
	}
}
