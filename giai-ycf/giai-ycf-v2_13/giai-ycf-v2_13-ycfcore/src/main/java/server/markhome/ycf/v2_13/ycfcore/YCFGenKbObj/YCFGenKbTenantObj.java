// Description: Java 11 base object instance implementation for YCFGenKb Tenant.

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

public class YCFGenKbTenantObj
	implements IYCFGenKbTenantObj
{
	public final static String CLASS_CODE = "a910";
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFGenKbTenantEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbTenantPKey pKey;
	protected YCFGenKbTenantBuff buff;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbTenantObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public YCFGenKbTenantObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFGenKbTenantObj retobj = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().realiseTenant(
			(IYCFGenKbTenantObj)this );
		return( (IYCFGenKbTenantObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getTenantTableObj().reallyDeepDisposeTenant( (IYCFGenKbTenantObj)this );
	}

	public IYCFGenKbTenantObj read() {
		IYCFGenKbTenantObj retobj = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredId(), false );
		return( (IYCFGenKbTenantObj)retobj );
	}

	public IYCFGenKbTenantObj read( boolean forceRead ) {
		IYCFGenKbTenantObj retobj = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (IYCFGenKbTenantObj)retobj );
	}

	public IYCFGenKbTenantTableObj getTenantTable() {
		return( ((IYCFGenKbSchemaObj)schema).getTenantTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbTenantBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbTenantBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbTenantBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbTenantBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public YCFGenKbTenantBuff getTenantBuff() {
		return( (YCFGenKbTenantBuff)getBuff() );
	}

	public YCFGenKbTenantPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbTenantPKey value ) {
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

	public IYCFGenKbTenantEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbTenantObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbTenantObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().lockTenant( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbTenantEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbTenantEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbTenantEditObj getEditAsTenant() {
		return( (IYCFGenKbTenantEditObj)edit );
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

	public long getRequiredClusterId() {
		return( getTenantBuff().getRequiredClusterId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredTenantName() {
		return( getTenantBuff().getRequiredTenantName() );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getTenantBuff().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public List<IYCFGenKbTSecGroupObj> getOptionalComponentsTSecGroup() {
		List<IYCFGenKbTSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead ) {
		List<IYCFGenKbTSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbRuleCartObj> getOptionalComponentsRuleCart() {
		List<IYCFGenKbRuleCartObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().readRuleCartByTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbRuleCartObj> getOptionalComponentsRuleCart( boolean forceRead ) {
		List<IYCFGenKbRuleCartObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().readRuleCartByTenantIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}
