// Description: Java 11 edit object instance implementation for YCFGenKb TSecGroup.

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

public class YCFGenKbTSecGroupEditObj
	implements IYCFGenKbTSecGroupEditObj
{
	protected IYCFGenKbTSecGroupObj orig;
	protected YCFGenKbTSecGroupBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbTenantObj requiredContainerTenant;

	public YCFGenKbTSecGroupEditObj( IYCFGenKbTSecGroupObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbTSecGroupBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerTenant = null;
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

	public void setCreatedBy( IYCFGenKbSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( IYCFGenKbSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( YCFGenKbTSecGroupObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbTSecGroupObj retobj = getSchema().getTSecGroupTableObj().realiseTSecGroup( (IYCFGenKbTSecGroupObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTSecGroup().forget();
	}

	public IYCFGenKbTSecGroupObj read() {
		IYCFGenKbTSecGroupObj retval = getOrigAsTSecGroup().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbTSecGroupObj read( boolean forceRead ) {
		IYCFGenKbTSecGroupObj retval = getOrigAsTSecGroup().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbTSecGroupObj create() {
		copyBuffToOrig();
		IYCFGenKbTSecGroupObj retobj = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGroupTableObj().createTSecGroup( getOrigAsTSecGroup() );
		if( retobj == getOrigAsTSecGroup() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbTSecGroupEditObj update() {
		getSchema().getTSecGroupTableObj().updateTSecGroup( (IYCFGenKbTSecGroupObj)this );
		return( null );
	}

	public YCFGenKbTSecGroupEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTSecGroupTableObj().deleteTSecGroup( getOrigAsTSecGroup() );
		return( null );
	}

	public IYCFGenKbTSecGroupTableObj getTSecGroupTable() {
		return( orig.getSchema().getTSecGroupTableObj() );
	}

	public IYCFGenKbTSecGroupEditObj getEdit() {
		return( (IYCFGenKbTSecGroupEditObj)this );
	}

	public IYCFGenKbTSecGroupEditObj getEditAsTSecGroup() {
		return( (IYCFGenKbTSecGroupEditObj)this );
	}

	public IYCFGenKbTSecGroupEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbTSecGroupObj getOrig() {
		return( orig );
	}

	public IYCFGenKbTSecGroupObj getOrigAsTSecGroup() {
		return( (IYCFGenKbTSecGroupObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbTSecGroupBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsTSecGroup().getSchema().getBackingStore()).getFactoryTSecGroup().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbTSecGroupBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerTenant = null;
		}
	}

	public YCFGenKbTSecGroupBuff getTSecGroupBuff() {
		return( (YCFGenKbTSecGroupBuff)getBuff() );
	}

	public YCFGenKbTSecGroupPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbTSecGroupPKey value ) {
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

	public int getRequiredTSecGroupId() {
		return( getPKey().getRequiredTSecGroupId() );
	}

	public String getRequiredName() {
		return( getTSecGroupBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getTSecGroupBuff().getRequiredName() != value ) {
			getTSecGroupBuff().setRequiredName( value );
		}
	}

	public boolean getRequiredIsVisible() {
		return( getTSecGroupBuff().getRequiredIsVisible() );
	}

	public void setRequiredIsVisible( boolean value ) {
		if( getTSecGroupBuff().getRequiredIsVisible() != value ) {
			getTSecGroupBuff().setRequiredIsVisible( value );
		}
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( forceRead || ( requiredContainerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTenantObj obj = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredContainerTenant = obj;
				if( obj != null ) {
					getTSecGroupBuff().setRequiredTenantId( obj.getRequiredId() );
					requiredContainerTenant = obj;
				}
			}
		}
		return( requiredContainerTenant );
	}

	public void setRequiredContainerTenant( IYCFGenKbTenantObj value ) {
			if( buff == null ) {
				getTSecGroupBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTSecGroupBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredContainerTenant = value;
	}

	public List<IYCFGenKbTSecGrpIncObj> getOptionalComponentsInclude() {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead ) {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalComponentsMember() {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalComponentsMember( boolean forceRead ) {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpIncObj> getRequiredChildrenIncByGroup() {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByIncludeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead ) {
		List<IYCFGenKbTSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByIncludeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredTSecGroupId( getPKey().getRequiredTSecGroupId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredTSecGroupId( buff.getRequiredTSecGroupId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbTSecGroupBuff origBuff = getOrigAsTSecGroup().getTSecGroupBuff();
		YCFGenKbTSecGroupBuff myBuff = getTSecGroupBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbTSecGroupBuff origBuff = getOrigAsTSecGroup().getTSecGroupBuff();
		YCFGenKbTSecGroupBuff myBuff = getTSecGroupBuff();
		myBuff.set( origBuff );
	}
}
