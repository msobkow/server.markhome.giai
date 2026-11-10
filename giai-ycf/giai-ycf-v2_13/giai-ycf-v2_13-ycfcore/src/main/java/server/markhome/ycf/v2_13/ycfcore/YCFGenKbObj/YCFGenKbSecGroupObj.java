// Description: Java 11 base object instance implementation for YCFGenKb SecGroup.

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

public class YCFGenKbSecGroupObj
	implements IYCFGenKbSecGroupObj
{
	public final static String CLASS_CODE = "a909";
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFGenKbSecGroupEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbSecGroupPKey pKey;
	protected YCFGenKbSecGroupBuff buff;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbSecGroupObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public YCFGenKbSecGroupObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGroup" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
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

	public IYCFGenKbSecGroupObj realise() {
		IYCFGenKbSecGroupObj retobj = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().realiseSecGroup(
			(IYCFGenKbSecGroupObj)this );
		return( (IYCFGenKbSecGroupObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().reallyDeepDisposeSecGroup( (IYCFGenKbSecGroupObj)this );
	}

	public IYCFGenKbSecGroupObj read() {
		IYCFGenKbSecGroupObj retobj = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGroupId(), false );
		return( (IYCFGenKbSecGroupObj)retobj );
	}

	public IYCFGenKbSecGroupObj read( boolean forceRead ) {
		IYCFGenKbSecGroupObj retobj = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGroupId(), forceRead );
		return( (IYCFGenKbSecGroupObj)retobj );
	}

	public IYCFGenKbSecGroupTableObj getSecGroupTable() {
		return( ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbSecGroupBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecGroupId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecGroupBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbSecGroupBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbSecGroupBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public YCFGenKbSecGroupBuff getSecGroupBuff() {
		return( (YCFGenKbSecGroupBuff)getBuff() );
	}

	public YCFGenKbSecGroupPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbSecGroupPKey value ) {
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

	public IYCFGenKbSecGroupEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbSecGroupObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbSecGroupObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().lockSecGroup( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbSecGroupEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbSecGroupEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbSecGroupEditObj getEditAsSecGroup() {
		return( (IYCFGenKbSecGroupEditObj)edit );
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecGroupBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecGroupBuff buff = getBuff();
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

	public int getRequiredSecGroupId() {
		return( getPKey().getRequiredSecGroupId() );
	}

	public String getRequiredName() {
		return( getSecGroupBuff().getRequiredName() );
	}

	public boolean getRequiredIsVisible() {
		return( getSecGroupBuff().getRequiredIsVisible() );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public List<IYCFGenKbSecGrpIncObj> getOptionalComponentsInclude() {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead ) {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalComponentsMember() {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalComponentsMember( boolean forceRead ) {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGrpIncObj> getRequiredChildrenIncByGroup() {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead ) {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGroupFormObj> getOptionalComponentsForm() {
		List<IYCFGenKbSecGroupFormObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGroupFormObj> getOptionalComponentsForm( boolean forceRead ) {
		List<IYCFGenKbSecGroupFormObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecGroupId( getPKey().getRequiredSecGroupId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGroupId( buff.getRequiredSecGroupId() );
	}
}
