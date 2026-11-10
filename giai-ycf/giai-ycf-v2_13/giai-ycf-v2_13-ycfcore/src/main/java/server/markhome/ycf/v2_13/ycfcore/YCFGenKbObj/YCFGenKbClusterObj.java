// Description: Java 11 base object instance implementation for YCFGenKb Cluster.

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

public class YCFGenKbClusterObj
	implements IYCFGenKbClusterObj
{
	public final static String CLASS_CODE = "a901";
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFGenKbClusterEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbClusterPKey pKey;
	protected YCFGenKbClusterBuff buff;

	public YCFGenKbClusterObj() {
		isNew = true;
	}

	public YCFGenKbClusterObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Cluster" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredFullDomName();
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
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getHostNodeTableObj().readHostNodeByHostNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getTenantTableObj().readTenantByUNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getSecAppTableObj().readSecAppByUJEEMountIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getSecGroupTableObj().readSecGroupByUNameIdx( getRequiredId(),
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

	public IYCFGenKbClusterObj realise() {
		IYCFGenKbClusterObj retobj = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().realiseCluster(
			(IYCFGenKbClusterObj)this );
		return( (IYCFGenKbClusterObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getClusterTableObj().reallyDeepDisposeCluster( (IYCFGenKbClusterObj)this );
	}

	public IYCFGenKbClusterObj read() {
		IYCFGenKbClusterObj retobj = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredId(), false );
		return( (IYCFGenKbClusterObj)retobj );
	}

	public IYCFGenKbClusterObj read( boolean forceRead ) {
		IYCFGenKbClusterObj retobj = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (IYCFGenKbClusterObj)retobj );
	}

	public IYCFGenKbClusterTableObj getClusterTable() {
		return( ((IYCFGenKbSchemaObj)schema).getClusterTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbClusterBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbClusterBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbClusterBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbClusterBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFGenKbClusterBuff getClusterBuff() {
		return( (YCFGenKbClusterBuff)getBuff() );
	}

	public YCFGenKbClusterPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbClusterPKey value ) {
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

	public IYCFGenKbClusterEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbClusterObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbClusterObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().lockCluster( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbClusterEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbClusterEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbClusterEditObj getEditAsCluster() {
		return( (IYCFGenKbClusterEditObj)edit );
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbClusterBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbClusterBuff buff = getBuff();
			updatedBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredFullDomName() {
		return( getClusterBuff().getRequiredFullDomName() );
	}

	public String getRequiredDescription() {
		return( getClusterBuff().getRequiredDescription() );
	}

	public List<IYCFGenKbHostNodeObj> getOptionalComponentsHostNode() {
		List<IYCFGenKbHostNodeObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbHostNodeObj> getOptionalComponentsHostNode( boolean forceRead ) {
		List<IYCFGenKbHostNodeObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTenantObj> getOptionalComponentsTenant() {
		List<IYCFGenKbTenantObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTenantObj> getOptionalComponentsTenant( boolean forceRead ) {
		List<IYCFGenKbTenantObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecAppObj> getOptionalComponentsSecApp() {
		List<IYCFGenKbSecAppObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecAppObj> getOptionalComponentsSecApp( boolean forceRead ) {
		List<IYCFGenKbSecAppObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGroupObj> getOptionalComponentsSecGroup() {
		List<IYCFGenKbSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGroupObj> getOptionalComponentsSecGroup( boolean forceRead ) {
		List<IYCFGenKbSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSysClusterObj> getOptionalComponentsSysCluster() {
		List<IYCFGenKbSysClusterObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSysClusterObj> getOptionalComponentsSysCluster( boolean forceRead ) {
		List<IYCFGenKbSysClusterObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
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
