// Description: Java 11 base object instance implementation for YCFGenKb GelSwitchLimb.

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

public class YCFGenKbGelSwitchLimbObj
	implements IYCFGenKbGelSwitchLimbObj
{
	public final static String CLASS_CODE = "a91f";
	protected boolean isNew;
	protected IYCFGenKbGelSwitchLimbEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbGelSwitchLimbPKey pKey;
	protected YCFGenKbGelSwitchLimbBuff buff;
	protected IYCFGenKbGelSwitchObj requiredParentSwitch;
	protected IYCFGenKbTenantObj requiredOwnerTenant;

	public YCFGenKbGelSwitchLimbObj() {
		isNew = true;
		requiredParentSwitch = null;
		requiredOwnerTenant = null;
	}

	public YCFGenKbGelSwitchLimbObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredParentSwitch = null;
		requiredOwnerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFGenKbGelSwitchLimbObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().realiseGelSwitchLimb(
			(IYCFGenKbGelSwitchLimbObj)this );
		return( (IYCFGenKbGelSwitchLimbObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().reallyDeepDisposeGelSwitchLimb( (IYCFGenKbGelSwitchLimbObj)this );
	}

	public IYCFGenKbGelSwitchLimbObj read() {
		IYCFGenKbGelSwitchLimbObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().readGelSwitchLimbByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(),
			getPKey().getRequiredLimbName(), false );
		return( (IYCFGenKbGelSwitchLimbObj)retobj );
	}

	public IYCFGenKbGelSwitchLimbObj read( boolean forceRead ) {
		IYCFGenKbGelSwitchLimbObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().readGelSwitchLimbByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(),
			getPKey().getRequiredLimbName(), forceRead );
		return( (IYCFGenKbGelSwitchLimbObj)retobj );
	}

	public IYCFGenKbGelSwitchLimbTableObj getGelSwitchLimbTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbGelSwitchLimbBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId(),
						getPKey().getRequiredGelInstId(),
						getPKey().getRequiredLimbName() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelSwitchLimbBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelSwitchLimbBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelSwitchLimbBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredParentSwitch = null;
		requiredOwnerTenant = null;
	}

	public YCFGenKbGelSwitchLimbBuff getGelSwitchLimbBuff() {
		return( (YCFGenKbGelSwitchLimbBuff)getBuff() );
	}

	public YCFGenKbGelSwitchLimbPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbGelSwitchLimbPKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToBuff();
		}
	}

	public boolean getIsNew() {
		return( isNew );
	}

	public void setIsNew( boolean value ) {
		isNew = value;
	}

	public IYCFGenKbGelSwitchLimbEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelSwitchLimbObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelSwitchLimbObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().lockGelSwitchLimb( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelSwitchLimbEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbGelSwitchLimbEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbGelSwitchLimbEditObj getEditAsGelSwitchLimb() {
		return( (IYCFGenKbGelSwitchLimbEditObj)edit );
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

	public String getRequiredLimbExpansion() {
		return( getGelSwitchLimbBuff().getRequiredLimbExpansion() );
	}

	public IYCFGenKbGelSwitchObj getRequiredParentSwitch() {
		return( getRequiredParentSwitch( false ) );
	}

	public IYCFGenKbGelSwitchObj getRequiredParentSwitch( boolean forceRead ) {
		if( ( requiredParentSwitch == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentSwitch = ((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj().readGelSwitchByPIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(), forceRead );
			}
		}
		return( requiredParentSwitch );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
			buff.setRequiredGelInstId( getPKey().getRequiredGelInstId() );
			buff.setRequiredLimbName( getPKey().getRequiredLimbName() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
		getPKey().setRequiredGelInstId( buff.getRequiredGelInstId() );
		getPKey().setRequiredLimbName( buff.getRequiredLimbName() );
	}
}
