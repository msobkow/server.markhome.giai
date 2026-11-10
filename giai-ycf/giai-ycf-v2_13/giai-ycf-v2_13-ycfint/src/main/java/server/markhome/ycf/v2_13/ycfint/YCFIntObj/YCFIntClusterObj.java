// Description: Java 11 base object instance implementation for YCFInt Cluster.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntClusterObj
	implements IYCFIntClusterObj
{
	public final static String CLASS_CODE = "a001";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecClusterEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecClusterPKey pKey;
	protected YCFSecClusterBuff buff;

	public YCFIntClusterObj() {
		isNew = true;
	}

	public YCFIntClusterObj( IYCFSecSchemaObj argSchema ) {
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
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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
			subObj = ((IYCFIntSchemaObj)getSchema()).getHostNodeTableObj().readHostNodeByHostNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getTenantTableObj().readTenantByUNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getSecAppTableObj().readSecAppByUJEEMountIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getSecGroupTableObj().readSecGroupByUNameIdx( getRequiredId(),
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
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
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
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
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

	public IYCFSecClusterObj realise() {
		IYCFSecClusterObj retobj = ((IYCFIntSchemaObj)schema).getClusterTableObj().realiseCluster(
			(IYCFSecClusterObj)this );
		return( (IYCFSecClusterObj)retobj );
	}

	public void forget() {
		((IYCFIntSchemaObj)schema).getClusterTableObj().reallyDeepDisposeCluster( (IYCFSecClusterObj)this );
	}

	public IYCFSecClusterObj read() {
		IYCFSecClusterObj retobj = ((IYCFIntSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredId(), false );
		return( (IYCFSecClusterObj)retobj );
	}

	public IYCFSecClusterObj read( boolean forceRead ) {
		IYCFSecClusterObj retobj = ((IYCFIntSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (IYCFSecClusterObj)retobj );
	}

	public IYCFSecClusterTableObj getClusterTable() {
		return( ((IYCFIntSchemaObj)schema).getClusterTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecClusterBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFIntSchema)schema.getBackingStore()).getFactoryCluster().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFIntSchema)schema.getBackingStore()).getTableCluster().readDerivedByIdIdx( ((IYCFIntSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecClusterBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecClusterBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecClusterBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFSecClusterBuff getClusterBuff() {
		return( (YCFSecClusterBuff)getBuff() );
	}

	public YCFSecClusterPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecClusterPKey value ) {
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

	public IYCFSecClusterEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecClusterObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecClusterObj)this;
		}
		else {
			lockobj = ((IYCFIntSchemaObj)schema).getClusterTableObj().lockCluster( getPKey() );
		}
		edit = ((IYCFIntSchemaObj)schema).getClusterTableObj().newEditInstance( lockobj );
		return( (IYCFSecClusterEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecClusterEditObj getEdit() {
		return( edit );
	}

	public IYCFSecClusterEditObj getEditAsCluster() {
		return( (IYCFSecClusterEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecClusterBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecClusterBuff buff = getBuff();
			updatedBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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

	public List<IYCFSecHostNodeObj> getOptionalComponentsHostNode() {
		List<IYCFSecHostNodeObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecHostNodeObj> getOptionalComponentsHostNode( boolean forceRead ) {
		List<IYCFSecHostNodeObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecTenantObj> getOptionalComponentsTenant() {
		List<IYCFSecTenantObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecTenantObj> getOptionalComponentsTenant( boolean forceRead ) {
		List<IYCFSecTenantObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecAppObj> getOptionalComponentsSecApp() {
		List<IYCFSecSecAppObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecAppObj> getOptionalComponentsSecApp( boolean forceRead ) {
		List<IYCFSecSecAppObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGroupObj> getOptionalComponentsSecGroup() {
		List<IYCFSecSecGroupObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGroupObj> getOptionalComponentsSecGroup( boolean forceRead ) {
		List<IYCFSecSecGroupObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSysClusterObj> getOptionalComponentsSysCluster() {
		List<IYCFSecSysClusterObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecSysClusterObj> getOptionalComponentsSysCluster( boolean forceRead ) {
		List<IYCFSecSysClusterObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
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
