// Description: Java 11 base object instance implementation for YCFGenKb SecGrpInc.

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

public class YCFGenKbSecGrpIncObj
	implements IYCFGenKbSecGrpIncObj
{
	public final static String CLASS_CODE = "a90b";
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFGenKbSecGrpIncEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbSecGrpIncPKey pKey;
	protected YCFGenKbSecGrpIncBuff buff;
	protected IYCFGenKbClusterObj requiredOwnerCluster;
	protected IYCFGenKbSecGroupObj requiredContainerGroup;
	protected IYCFGenKbSecGroupObj requiredParentSubGroup;

	public YCFGenKbSecGrpIncObj() {
		isNew = true;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public YCFGenKbSecGrpIncObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGrpInc" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredSecGrpIncId();
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

	public IYCFGenKbSecGrpIncObj realise() {
		IYCFGenKbSecGrpIncObj retobj = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().realiseSecGrpInc(
			(IYCFGenKbSecGrpIncObj)this );
		return( (IYCFGenKbSecGrpIncObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().reallyDeepDisposeSecGrpInc( (IYCFGenKbSecGrpIncObj)this );
	}

	public IYCFGenKbSecGrpIncObj read() {
		IYCFGenKbSecGrpIncObj retobj = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGrpIncId(), false );
		return( (IYCFGenKbSecGrpIncObj)retobj );
	}

	public IYCFGenKbSecGrpIncObj read( boolean forceRead ) {
		IYCFGenKbSecGrpIncObj retobj = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGrpIncId(), forceRead );
		return( (IYCFGenKbSecGrpIncObj)retobj );
	}

	public IYCFGenKbSecGrpIncTableObj getSecGrpIncTable() {
		return( ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbSecGrpIncBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecGrpIncId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecGrpIncBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbSecGrpIncBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbSecGrpIncBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public YCFGenKbSecGrpIncBuff getSecGrpIncBuff() {
		return( (YCFGenKbSecGrpIncBuff)getBuff() );
	}

	public YCFGenKbSecGrpIncPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbSecGrpIncPKey value ) {
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

	public IYCFGenKbSecGrpIncEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbSecGrpIncObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbSecGrpIncObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().lockSecGrpInc( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbSecGrpIncEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbSecGrpIncEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbSecGrpIncEditObj getEditAsSecGrpInc() {
		return( (IYCFGenKbSecGrpIncEditObj)edit );
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecGrpIncBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecGrpIncBuff buff = getBuff();
			updatedBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredClusterId() {
		return( getPKey().getRequiredClusterId() );
	}

	public long getRequiredSecGrpIncId() {
		return( getPKey().getRequiredSecGrpIncId() );
	}

	public int getRequiredSecGroupId() {
		return( getSecGrpIncBuff().getRequiredSecGroupId() );
	}

	public int getRequiredIncludeGroupId() {
		return( getSecGrpIncBuff().getRequiredIncludeGroupId() );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( ( requiredOwnerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerCluster = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredOwnerCluster );
	}

	public IYCFGenKbSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFGenKbSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( ( requiredContainerGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerGroup = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredSecGroupId(), forceRead );
			}
		}
		return( requiredContainerGroup );
	}

	public IYCFGenKbSecGroupObj getRequiredParentSubGroup() {
		return( getRequiredParentSubGroup( false ) );
	}

	public IYCFGenKbSecGroupObj getRequiredParentSubGroup( boolean forceRead ) {
		if( ( requiredParentSubGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentSubGroup = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredIncludeGroupId(), forceRead );
			}
		}
		return( requiredParentSubGroup );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecGrpIncId( getPKey().getRequiredSecGrpIncId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGrpIncId( buff.getRequiredSecGrpIncId() );
	}
}
