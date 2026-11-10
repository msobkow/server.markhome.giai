// Description: Java 11 base object instance implementation for YCFSec SysCluster.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFSecSysClusterObj
	implements IYCFSecSysClusterObj
{
	public final static String CLASS_CODE = "a014";
	protected boolean isNew;
	protected IYCFSecSysClusterEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSysClusterPKey pKey;
	protected YCFSecSysClusterBuff buff;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFSecSysClusterObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public YCFSecSysClusterObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SysCluster" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public String getObjName() {
		String objName;
		int val = getRequiredSingletonId();
		objName = Integer.toString( val );
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFSecClusterObj ) {
					break;
				}
				else if( container instanceof IYCFSecTenantObj ) {
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
				if( container instanceof IYCFSecClusterObj ) {
					break;
				}
				else if( container instanceof IYCFSecTenantObj ) {
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

	public IYCFSecSysClusterObj realise() {
		IYCFSecSysClusterObj retobj = ((IYCFSecSchemaObj)schema).getSysClusterTableObj().realiseSysCluster(
			(IYCFSecSysClusterObj)this );
		return( (IYCFSecSysClusterObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getSysClusterTableObj().reallyDeepDisposeSysCluster( (IYCFSecSysClusterObj)this );
	}

	public IYCFSecSysClusterObj read() {
		IYCFSecSysClusterObj retobj = ((IYCFSecSchemaObj)schema).getSysClusterTableObj().readSysClusterByIdIdx( getPKey().getRequiredSingletonId(), false );
		return( (IYCFSecSysClusterObj)retobj );
	}

	public IYCFSecSysClusterObj read( boolean forceRead ) {
		IYCFSecSysClusterObj retobj = ((IYCFSecSchemaObj)schema).getSysClusterTableObj().readSysClusterByIdIdx( getPKey().getRequiredSingletonId(), forceRead );
		return( (IYCFSecSysClusterObj)retobj );
	}

	public IYCFSecSysClusterTableObj getSysClusterTable() {
		return( ((IYCFSecSchemaObj)schema).getSysClusterTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSysClusterBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSingletonId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSysClusterBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSysClusterBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSysClusterBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public YCFSecSysClusterBuff getSysClusterBuff() {
		return( (YCFSecSysClusterBuff)getBuff() );
	}

	public YCFSecSysClusterPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSysClusterPKey value ) {
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

	public IYCFSecSysClusterEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSysClusterObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSysClusterObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getSysClusterTableObj().lockSysCluster( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getSysClusterTableObj().newEditInstance( lockobj );
		return( (IYCFSecSysClusterEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSysClusterEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSysClusterEditObj getEditAsSysCluster() {
		return( (IYCFSecSysClusterEditObj)edit );
	}

	public int getRequiredSingletonId() {
		return( getPKey().getRequiredSingletonId() );
	}

	public long getRequiredClusterId() {
		return( getSysClusterBuff().getRequiredClusterId() );
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((IYCFSecSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getSysClusterBuff().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredSingletonId( getPKey().getRequiredSingletonId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSingletonId( buff.getRequiredSingletonId() );
	}
}
