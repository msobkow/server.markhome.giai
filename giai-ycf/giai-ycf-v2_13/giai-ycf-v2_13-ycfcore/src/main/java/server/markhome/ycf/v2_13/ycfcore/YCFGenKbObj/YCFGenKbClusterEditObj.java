// Description: Java 11 edit object instance implementation for YCFGenKb Cluster.

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

public class YCFGenKbClusterEditObj
	implements IYCFGenKbClusterEditObj
{
	protected IYCFGenKbClusterObj orig;
	protected YCFGenKbClusterBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;

	public YCFGenKbClusterEditObj( IYCFGenKbClusterObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbClusterBuff origBuff = orig.getBuff();
		buff.set( origBuff );
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
		return( YCFGenKbClusterObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbClusterObj retobj = getSchema().getClusterTableObj().realiseCluster( (IYCFGenKbClusterObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsCluster().forget();
	}

	public IYCFGenKbClusterObj read() {
		IYCFGenKbClusterObj retval = getOrigAsCluster().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbClusterObj read( boolean forceRead ) {
		IYCFGenKbClusterObj retval = getOrigAsCluster().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbClusterObj create() {
		copyBuffToOrig();
		IYCFGenKbClusterObj retobj = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getClusterTableObj().createCluster( getOrigAsCluster() );
		if( retobj == getOrigAsCluster() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbClusterEditObj update() {
		getSchema().getClusterTableObj().updateCluster( (IYCFGenKbClusterObj)this );
		return( null );
	}

	public YCFGenKbClusterEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClusterTableObj().deleteCluster( getOrigAsCluster() );
		return( null );
	}

	public IYCFGenKbClusterTableObj getClusterTable() {
		return( orig.getSchema().getClusterTableObj() );
	}

	public IYCFGenKbClusterEditObj getEdit() {
		return( (IYCFGenKbClusterEditObj)this );
	}

	public IYCFGenKbClusterEditObj getEditAsCluster() {
		return( (IYCFGenKbClusterEditObj)this );
	}

	public IYCFGenKbClusterEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbClusterObj getOrig() {
		return( orig );
	}

	public IYCFGenKbClusterObj getOrigAsCluster() {
		return( (IYCFGenKbClusterObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbClusterBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsCluster().getSchema().getBackingStore()).getFactoryCluster().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbClusterBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFGenKbClusterBuff getClusterBuff() {
		return( (YCFGenKbClusterBuff)getBuff() );
	}

	public YCFGenKbClusterPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbClusterPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredFullDomName() {
		return( getClusterBuff().getRequiredFullDomName() );
	}

	public void setRequiredFullDomName( String value ) {
		if( getClusterBuff().getRequiredFullDomName() != value ) {
			getClusterBuff().setRequiredFullDomName( value );
		}
	}

	public String getRequiredDescription() {
		return( getClusterBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getClusterBuff().getRequiredDescription() != value ) {
			getClusterBuff().setRequiredDescription( value );
		}
	}

	public List<IYCFGenKbHostNodeObj> getOptionalComponentsHostNode() {
		List<IYCFGenKbHostNodeObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbHostNodeObj> getOptionalComponentsHostNode( boolean forceRead ) {
		List<IYCFGenKbHostNodeObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTenantObj> getOptionalComponentsTenant() {
		List<IYCFGenKbTenantObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTenantObj> getOptionalComponentsTenant( boolean forceRead ) {
		List<IYCFGenKbTenantObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecAppObj> getOptionalComponentsSecApp() {
		List<IYCFGenKbSecAppObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecAppObj> getOptionalComponentsSecApp( boolean forceRead ) {
		List<IYCFGenKbSecAppObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGroupObj> getOptionalComponentsSecGroup() {
		List<IYCFGenKbSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGroupObj> getOptionalComponentsSecGroup( boolean forceRead ) {
		List<IYCFGenKbSecGroupObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSysClusterObj> getOptionalComponentsSysCluster() {
		List<IYCFGenKbSysClusterObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSysClusterObj> getOptionalComponentsSysCluster( boolean forceRead ) {
		List<IYCFGenKbSysClusterObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsCluster().getSchema()).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
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
		YCFGenKbClusterBuff origBuff = getOrigAsCluster().getClusterBuff();
		YCFGenKbClusterBuff myBuff = getClusterBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbClusterBuff origBuff = getOrigAsCluster().getClusterBuff();
		YCFGenKbClusterBuff myBuff = getClusterBuff();
		myBuff.set( origBuff );
	}
}
