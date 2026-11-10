// Description: Java 11 base object instance implementation for YCFGenKb TSecGroup.

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

public class YCFGenKbTSecGroupObj
	implements IYCFGenKbTSecGroupObj
{
	public final static String CLASS_CODE = "a911";
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFGenKbTSecGroupEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbTSecGroupPKey pKey;
	protected YCFGenKbTSecGroupBuff buff;
	protected IYCFGenKbTenantObj requiredContainerTenant;

	public YCFGenKbTSecGroupObj() {
		isNew = true;
		requiredContainerTenant = null;
	}

	public YCFGenKbTSecGroupObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TSecGroup" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbTenantObj scope = getRequiredContainerTenant();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbTenantObj scope = getRequiredContainerTenant();
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

	public IYCFGenKbTSecGroupObj realise() {
		IYCFGenKbTSecGroupObj retobj = ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().realiseTSecGroup(
			(IYCFGenKbTSecGroupObj)this );
		return( (IYCFGenKbTSecGroupObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().reallyDeepDisposeTSecGroup( (IYCFGenKbTSecGroupObj)this );
	}

	public IYCFGenKbTSecGroupObj read() {
		IYCFGenKbTSecGroupObj retobj = ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().readTSecGroupByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredTSecGroupId(), false );
		return( (IYCFGenKbTSecGroupObj)retobj );
	}

	public IYCFGenKbTSecGroupObj read( boolean forceRead ) {
		IYCFGenKbTSecGroupObj retobj = ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().readTSecGroupByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredTSecGroupId(), forceRead );
		return( (IYCFGenKbTSecGroupObj)retobj );
	}

	public IYCFGenKbTSecGroupTableObj getTSecGroupTable() {
		return( ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbTSecGroupBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredTSecGroupId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbTSecGroupBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbTSecGroupBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbTSecGroupBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerTenant = null;
	}

	public YCFGenKbTSecGroupBuff getTSecGroupBuff() {
		return( (YCFGenKbTSecGroupBuff)getBuff() );
	}

	public YCFGenKbTSecGroupPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbTSecGroupPKey value ) {
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

	public IYCFGenKbTSecGroupEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbTSecGroupObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbTSecGroupObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().lockTSecGroup( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbTSecGroupEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbTSecGroupEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbTSecGroupEditObj getEditAsTSecGroup() {
		return( (IYCFGenKbTSecGroupEditObj)edit );
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbTSecGroupBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbTSecGroupBuff buff = getBuff();
			updatedBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public int getRequiredTSecGroupId() {
		return( getPKey().getRequiredTSecGroupId() );
	}

	public String getRequiredName() {
		return( getTSecGroupBuff().getRequiredName() );
	}

	public boolean getRequiredIsVisible() {
		return( getTSecGroupBuff().getRequiredIsVisible() );
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( ( requiredContainerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerTenant = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredContainerTenant );
	}

	public List<IYCFGenKbTSecGrpIncObj> getOptionalComponentsInclude() {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpIncTableObj().readTSecGrpIncByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead ) {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpIncTableObj().readTSecGrpIncByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalComponentsMember() {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpMembTableObj().readTSecGrpMembByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalComponentsMember( boolean forceRead ) {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpMembTableObj().readTSecGrpMembByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpIncObj> getRequiredChildrenIncByGroup() {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpIncTableObj().readTSecGrpIncByIncludeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead ) {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpIncTableObj().readTSecGrpIncByIncludeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredTSecGroupId( getPKey().getRequiredTSecGroupId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredTSecGroupId( buff.getRequiredTSecGroupId() );
	}
}
