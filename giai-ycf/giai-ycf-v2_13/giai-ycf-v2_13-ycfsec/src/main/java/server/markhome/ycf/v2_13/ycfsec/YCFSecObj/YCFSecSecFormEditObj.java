// Description: Java 11 edit object instance implementation for YCFSec SecForm.

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

public class YCFSecSecFormEditObj
	implements IYCFSecSecFormEditObj
{
	protected IYCFSecSecFormObj orig;
	protected YCFSecSecFormBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecAppObj requiredContainerApplication;

	public YCFSecSecFormEditObj( IYCFSecSecFormObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecFormBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerApplication = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecFormBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecFormBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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
		return( YCFSecSecFormObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecForm" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecSecAppObj scope = getRequiredContainerApplication();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecSecAppObj scope = getRequiredContainerApplication();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredJEEServletMapName();
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

	public IYCFSecSecFormObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecFormObj retobj = getSchema().getSecFormTableObj().realiseSecForm( (IYCFSecSecFormObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecForm().forget();
	}

	public IYCFSecSecFormObj read() {
		IYCFSecSecFormObj retval = getOrigAsSecForm().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecFormObj read( boolean forceRead ) {
		IYCFSecSecFormObj retval = getOrigAsSecForm().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecFormObj create() {
		copyBuffToOrig();
		IYCFSecSecFormObj retobj = ((IYCFSecSchemaObj)getOrigAsSecForm().getSchema()).getSecFormTableObj().createSecForm( getOrigAsSecForm() );
		if( retobj == getOrigAsSecForm() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecFormEditObj update() {
		getSchema().getSecFormTableObj().updateSecForm( (IYCFSecSecFormObj)this );
		return( null );
	}

	public YCFSecSecFormEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecFormTableObj().deleteSecForm( getOrigAsSecForm() );
		return( null );
	}

	public IYCFSecSecFormTableObj getSecFormTable() {
		return( orig.getSchema().getSecFormTableObj() );
	}

	public IYCFSecSecFormEditObj getEdit() {
		return( (IYCFSecSecFormEditObj)this );
	}

	public IYCFSecSecFormEditObj getEditAsSecForm() {
		return( (IYCFSecSecFormEditObj)this );
	}

	public IYCFSecSecFormEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecFormObj getOrig() {
		return( orig );
	}

	public IYCFSecSecFormObj getOrigAsSecForm() {
		return( (IYCFSecSecFormObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecFormBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsSecForm().getSchema().getBackingStore()).getFactorySecForm().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecFormBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerApplication = null;
		}
	}

	public YCFSecSecFormBuff getSecFormBuff() {
		return( (YCFSecSecFormBuff)getBuff() );
	}

	public YCFSecSecFormPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecFormPKey value ) {
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

	public int getRequiredSecFormId() {
		return( getPKey().getRequiredSecFormId() );
	}

	public int getRequiredSecAppId() {
		return( getSecFormBuff().getRequiredSecAppId() );
	}

	public String getRequiredJEEServletMapName() {
		return( getSecFormBuff().getRequiredJEEServletMapName() );
	}

	public void setRequiredJEEServletMapName( String value ) {
		if( getSecFormBuff().getRequiredJEEServletMapName() != value ) {
			getSecFormBuff().setRequiredJEEServletMapName( value );
		}
	}

	public IYCFSecClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFSecSchemaObj)getOrigAsSecForm().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getSecFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecFormBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredOwnerCluster = value;
	}

	public IYCFSecSecAppObj getRequiredContainerApplication() {
		return( getRequiredContainerApplication( false ) );
	}

	public IYCFSecSecAppObj getRequiredContainerApplication( boolean forceRead ) {
		if( forceRead || ( requiredContainerApplication == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecAppObj obj = ((IYCFSecSchemaObj)getOrigAsSecForm().getSchema()).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
					getSecFormBuff().getRequiredSecAppId() );
				requiredContainerApplication = obj;
				if( obj != null ) {
					getSecFormBuff().setRequiredClusterId( obj.getRequiredClusterId() );
					getSecFormBuff().setRequiredSecAppId( obj.getRequiredSecAppId() );
					requiredContainerApplication = obj;
				}
			}
		}
		return( requiredContainerApplication );
	}

	public void setRequiredContainerApplication( IYCFSecSecAppObj value ) {
			if( buff == null ) {
				getSecFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecFormBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecFormBuff().setRequiredSecAppId( value.getRequiredSecAppId() );
			}
			requiredContainerApplication = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecFormId( getPKey().getRequiredSecFormId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecFormId( buff.getRequiredSecFormId() );
	}

	public void copyBuffToOrig() {
		YCFSecSecFormBuff origBuff = getOrigAsSecForm().getSecFormBuff();
		YCFSecSecFormBuff myBuff = getSecFormBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecFormBuff origBuff = getOrigAsSecForm().getSecFormBuff();
		YCFSecSecFormBuff myBuff = getSecFormBuff();
		myBuff.set( origBuff );
	}
}
