// Description: Java 11 edit object instance implementation for YCFSec SysCluster.

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

public class YCFSecSysClusterEditObj
	implements IYCFSecSysClusterEditObj
{
	protected IYCFSecSysClusterObj orig;
	protected YCFSecSysClusterBuff buff;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFSecSysClusterEditObj( IYCFSecSysClusterObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSysClusterBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( YCFSecSysClusterObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSysClusterObj retobj = getSchema().getSysClusterTableObj().realiseSysCluster( (IYCFSecSysClusterObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSysCluster().forget();
	}

	public IYCFSecSysClusterObj read() {
		IYCFSecSysClusterObj retval = getOrigAsSysCluster().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSysClusterObj read( boolean forceRead ) {
		IYCFSecSysClusterObj retval = getOrigAsSysCluster().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSysClusterObj create() {
		copyBuffToOrig();
		IYCFSecSysClusterObj retobj = ((IYCFSecSchemaObj)getOrigAsSysCluster().getSchema()).getSysClusterTableObj().createSysCluster( getOrigAsSysCluster() );
		if( retobj == getOrigAsSysCluster() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSysClusterEditObj update() {
		getSchema().getSysClusterTableObj().updateSysCluster( (IYCFSecSysClusterObj)this );
		return( null );
	}

	public YCFSecSysClusterEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSysClusterTableObj().deleteSysCluster( getOrigAsSysCluster() );
		return( null );
	}

	public IYCFSecSysClusterTableObj getSysClusterTable() {
		return( orig.getSchema().getSysClusterTableObj() );
	}

	public IYCFSecSysClusterEditObj getEdit() {
		return( (IYCFSecSysClusterEditObj)this );
	}

	public IYCFSecSysClusterEditObj getEditAsSysCluster() {
		return( (IYCFSecSysClusterEditObj)this );
	}

	public IYCFSecSysClusterEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSysClusterObj getOrig() {
		return( orig );
	}

	public IYCFSecSysClusterObj getOrigAsSysCluster() {
		return( (IYCFSecSysClusterObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSysClusterBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsSysCluster().getSchema().getBackingStore()).getFactorySysCluster().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSysClusterBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFSecSysClusterBuff getSysClusterBuff() {
		return( (YCFSecSysClusterBuff)getBuff() );
	}

	public YCFSecSysClusterPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSysClusterPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public int getRequiredSingletonId() {
		return( getPKey().getRequiredSingletonId() );
	}

	public void setRequiredSingletonId( int value ) {
		if( getPKey().getRequiredSingletonId() != value ) {
			getPKey().setRequiredSingletonId( value );
		}
		if( getSysClusterBuff().getRequiredSingletonId() != value ) {
			getSysClusterBuff().setRequiredSingletonId( value );
		}
	}

	public long getRequiredClusterId() {
		return( getSysClusterBuff().getRequiredClusterId() );
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFSecSchemaObj)getOrigAsSysCluster().getSchema()).getClusterTableObj().readClusterByIdIdx( getSysClusterBuff().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getSysClusterBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getSysClusterBuff();
			}
			if( value != null ) {
				getSysClusterBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredSingletonId( getPKey().getRequiredSingletonId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSingletonId( buff.getRequiredSingletonId() );
	}

	public void copyBuffToOrig() {
		YCFSecSysClusterBuff origBuff = getOrigAsSysCluster().getSysClusterBuff();
		YCFSecSysClusterBuff myBuff = getSysClusterBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSysClusterBuff origBuff = getOrigAsSysCluster().getSysClusterBuff();
		YCFSecSysClusterBuff myBuff = getSysClusterBuff();
		myBuff.set( origBuff );
	}
}
