// Description: Java 11 edit object instance implementation for YCFGenKb Tenant.

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

public class YCFGenKbTenantEditObj
	implements IYCFGenKbTenantEditObj
{
	protected IYCFGenKbTenantObj orig;
	protected YCFGenKbTenantBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbTenantEditObj( IYCFGenKbTenantObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbTenantBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbTenantBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbTenantBuff buff = getBuff();
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
		return( YCFGenKbTenantObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Tenant" );
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
		objName = getRequiredTenantName();
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
		if( subObj == null ) {
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getTSecGroupTableObj().readTSecGroupByUNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getRuleCartTableObj().readRuleCartByNameIdx( getRequiredId(),
				nextName, false );
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

	public IYCFGenKbTenantObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbTenantObj retobj = getSchema().getTenantTableObj().realiseTenant( (IYCFGenKbTenantObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTenant().forget();
	}

	public IYCFGenKbTenantObj read() {
		IYCFGenKbTenantObj retval = getOrigAsTenant().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbTenantObj read( boolean forceRead ) {
		IYCFGenKbTenantObj retval = getOrigAsTenant().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbTenantObj create() {
		copyBuffToOrig();
		IYCFGenKbTenantObj retobj = ((IYCFGenKbSchemaObj)getOrigAsTenant().getSchema()).getTenantTableObj().createTenant( getOrigAsTenant() );
		if( retobj == getOrigAsTenant() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbTenantEditObj update() {
		getSchema().getTenantTableObj().updateTenant( (IYCFGenKbTenantObj)this );
		return( null );
	}

	public YCFGenKbTenantEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTenantTableObj().deleteTenant( getOrigAsTenant() );
		return( null );
	}

	public IYCFGenKbTenantTableObj getTenantTable() {
		return( orig.getSchema().getTenantTableObj() );
	}

	public IYCFGenKbTenantEditObj getEdit() {
		return( (IYCFGenKbTenantEditObj)this );
	}

	public IYCFGenKbTenantEditObj getEditAsTenant() {
		return( (IYCFGenKbTenantEditObj)this );
	}

	public IYCFGenKbTenantEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbTenantObj getOrig() {
		return( orig );
	}

	public IYCFGenKbTenantObj getOrigAsTenant() {
		return( (IYCFGenKbTenantObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbTenantBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsTenant().getSchema().getBackingStore()).getFactoryTenant().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbTenantBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFGenKbTenantBuff getTenantBuff() {
		return( (YCFGenKbTenantBuff)getBuff() );
	}

	public YCFGenKbTenantPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbTenantPKey value ) {
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
		return( getTenantBuff().getRequiredClusterId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredTenantName() {
		return( getTenantBuff().getRequiredTenantName() );
	}

	public void setRequiredTenantName( String value ) {
		if( getTenantBuff().getRequiredTenantName() != value ) {
			getTenantBuff().setRequiredTenantName( value );
		}
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsTenant().getSchema()).getClusterTableObj().readClusterByIdIdx( getTenantBuff().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getTenantBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getTenantBuff();
			}
			if( value != null ) {
				getTenantBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public List<IYCFGenKbTSecGroupObj> getOptionalComponentsTSecGroup() {
		List<IYCFGenKbTSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTenant().getSchema()).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead ) {
		List<IYCFGenKbTSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTenant().getSchema()).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbRuleCartObj> getOptionalComponentsRuleCart() {
		List<IYCFGenKbRuleCartObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTenant().getSchema()).getRuleCartTableObj().readRuleCartByTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbRuleCartObj> getOptionalComponentsRuleCart( boolean forceRead ) {
		List<IYCFGenKbRuleCartObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsTenant().getSchema()).getRuleCartTableObj().readRuleCartByTenantIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbTenantBuff origBuff = getOrigAsTenant().getTenantBuff();
		YCFGenKbTenantBuff myBuff = getTenantBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbTenantBuff origBuff = getOrigAsTenant().getTenantBuff();
		YCFGenKbTenantBuff myBuff = getTenantBuff();
		myBuff.set( origBuff );
	}
}
