// Description: Java 11 edit object instance implementation for YCFGenKb SecGroup.

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

public class YCFGenKbSecGroupEditObj
	implements IYCFGenKbSecGroupEditObj
{
	protected IYCFGenKbSecGroupObj orig;
	protected YCFGenKbSecGroupBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbSecGroupEditObj( IYCFGenKbSecGroupObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecGroupBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
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
		return( YCFGenKbSecGroupObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecGroupObj retobj = getSchema().getSecGroupTableObj().realiseSecGroup( (IYCFGenKbSecGroupObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGroup().forget();
	}

	public IYCFGenKbSecGroupObj read() {
		IYCFGenKbSecGroupObj retval = getOrigAsSecGroup().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGroupObj read( boolean forceRead ) {
		IYCFGenKbSecGroupObj retval = getOrigAsSecGroup().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGroupObj create() {
		copyBuffToOrig();
		IYCFGenKbSecGroupObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGroupTableObj().createSecGroup( getOrigAsSecGroup() );
		if( retobj == getOrigAsSecGroup() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecGroupEditObj update() {
		getSchema().getSecGroupTableObj().updateSecGroup( (IYCFGenKbSecGroupObj)this );
		return( null );
	}

	public YCFGenKbSecGroupEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGroupTableObj().deleteSecGroup( getOrigAsSecGroup() );
		return( null );
	}

	public IYCFGenKbSecGroupTableObj getSecGroupTable() {
		return( orig.getSchema().getSecGroupTableObj() );
	}

	public IYCFGenKbSecGroupEditObj getEdit() {
		return( (IYCFGenKbSecGroupEditObj)this );
	}

	public IYCFGenKbSecGroupEditObj getEditAsSecGroup() {
		return( (IYCFGenKbSecGroupEditObj)this );
	}

	public IYCFGenKbSecGroupEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecGroupObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecGroupObj getOrigAsSecGroup() {
		return( (IYCFGenKbSecGroupObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecGroupBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecGroup().getSchema().getBackingStore()).getFactorySecGroup().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecGroupBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFGenKbSecGroupBuff getSecGroupBuff() {
		return( (YCFGenKbSecGroupBuff)getBuff() );
	}

	public YCFGenKbSecGroupPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecGroupPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
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

	public void setRequiredName( String value ) {
		if( getSecGroupBuff().getRequiredName() != value ) {
			getSecGroupBuff().setRequiredName( value );
		}
	}

	public boolean getRequiredIsVisible() {
		return( getSecGroupBuff().getRequiredIsVisible() );
	}

	public void setRequiredIsVisible( boolean value ) {
		if( getSecGroupBuff().getRequiredIsVisible() != value ) {
			getSecGroupBuff().setRequiredIsVisible( value );
		}
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getSecGroupBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getSecGroupBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGroupBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public List<IYCFGenKbSecGrpIncObj> getOptionalComponentsInclude() {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead ) {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalComponentsMember() {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalComponentsMember( boolean forceRead ) {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGrpIncObj> getRequiredChildrenIncByGroup() {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead ) {
		List<IYCFGenKbSecGrpIncObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGroupFormObj> getOptionalComponentsForm() {
		List<IYCFGenKbSecGroupFormObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGroupFormObj> getOptionalComponentsForm( boolean forceRead ) {
		List<IYCFGenKbSecGroupFormObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecGroup().getSchema()).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecGroupId( getPKey().getRequiredSecGroupId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGroupId( buff.getRequiredSecGroupId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbSecGroupBuff origBuff = getOrigAsSecGroup().getSecGroupBuff();
		YCFGenKbSecGroupBuff myBuff = getSecGroupBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecGroupBuff origBuff = getOrigAsSecGroup().getSecGroupBuff();
		YCFGenKbSecGroupBuff myBuff = getSecGroupBuff();
		myBuff.set( origBuff );
	}
}
