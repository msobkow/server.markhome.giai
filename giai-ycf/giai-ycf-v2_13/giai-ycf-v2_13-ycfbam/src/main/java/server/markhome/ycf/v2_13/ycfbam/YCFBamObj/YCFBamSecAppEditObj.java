// Description: Java 11 edit object instance implementation for YCFBam SecApp.

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamSecAppEditObj
	implements IYCFBamSecAppEditObj
{
	protected IYCFSecSecAppObj orig;
	protected YCFSecSecAppBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFBamSecAppEditObj( IYCFSecSecAppObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecAppBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecAppBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecAppBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public void setCreatedBy( IYCFSecSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( IYCFSecSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( YCFBamSecAppObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecApp" );
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
		objName = getRequiredJEEMountName();
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
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
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getSecFormTableObj().readSecFormByUJEEServletIdx( getRequiredClusterId(),
				getRequiredSecAppId(),
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

	public IYCFSecSecAppObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecAppObj retobj = getSchema().getSecAppTableObj().realiseSecApp( (IYCFBamSecAppObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecApp().forget();
	}

	public IYCFSecSecAppObj read() {
		IYCFSecSecAppObj retval = getOrigAsSecApp().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecAppObj read( boolean forceRead ) {
		IYCFSecSecAppObj retval = getOrigAsSecApp().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecAppObj create() {
		copyBuffToOrig();
		IYCFSecSecAppObj retobj = ((IYCFBamSchemaObj)getOrigAsSecApp().getSchema()).getSecAppTableObj().createSecApp( getOrigAsSecApp() );
		if( retobj == getOrigAsSecApp() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecAppEditObj update() {
		getSchema().getSecAppTableObj().updateSecApp( (IYCFSecSecAppObj)this );
		return( null );
	}

	public YCFSecSecAppEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecAppTableObj().deleteSecApp( getOrigAsSecApp() );
		return( null );
	}

	public IYCFSecSecAppTableObj getSecAppTable() {
		return( orig.getSchema().getSecAppTableObj() );
	}

	public IYCFSecSecAppEditObj getEdit() {
		return( (IYCFSecSecAppEditObj)this );
	}

	public IYCFSecSecAppEditObj getEditAsSecApp() {
		return( (IYCFSecSecAppEditObj)this );
	}

	public IYCFSecSecAppEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecAppObj getOrig() {
		return( orig );
	}

	public IYCFSecSecAppObj getOrigAsSecApp() {
		return( (IYCFSecSecAppObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecAppBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsSecApp().getSchema().getBackingStore()).getFactorySecApp().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecAppBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFSecSecAppBuff getSecAppBuff() {
		return( (YCFSecSecAppBuff)getBuff() );
	}

	public YCFSecSecAppPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecAppPKey value ) {
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

	public int getRequiredSecAppId() {
		return( getPKey().getRequiredSecAppId() );
	}

	public String getRequiredJEEMountName() {
		return( getSecAppBuff().getRequiredJEEMountName() );
	}

	public void setRequiredJEEMountName( String value ) {
		if( getSecAppBuff().getRequiredJEEMountName() != value ) {
			getSecAppBuff().setRequiredJEEMountName( value );
		}
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFBamSchemaObj)getOrigAsSecApp().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getSecAppBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getSecAppBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecAppBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public List<IYCFSecSecFormObj> getOptionalComponentsForm() {
		List<IYCFSecSecFormObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSecApp().getSchema()).getSecFormTableObj().readSecFormBySecAppIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecAppId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecFormObj> getOptionalComponentsForm( boolean forceRead ) {
		List<IYCFSecSecFormObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSecApp().getSchema()).getSecFormTableObj().readSecFormBySecAppIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecAppId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecAppId( getPKey().getRequiredSecAppId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecAppId( buff.getRequiredSecAppId() );
	}

	public void copyBuffToOrig() {
		YCFSecSecAppBuff origBuff = getOrigAsSecApp().getSecAppBuff();
		YCFSecSecAppBuff myBuff = getSecAppBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecAppBuff origBuff = getOrigAsSecApp().getSecAppBuff();
		YCFSecSecAppBuff myBuff = getSecAppBuff();
		myBuff.set( origBuff );
	}
}
