// Description: Java 11 edit object instance implementation for YCFGenKb SecApp.

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

public class YCFGenKbSecAppEditObj
	implements IYCFGenKbSecAppEditObj
{
	protected IYCFGenKbSecAppObj orig;
	protected YCFGenKbSecAppBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbSecAppEditObj( IYCFGenKbSecAppObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecAppBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecAppBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecAppBuff buff = getBuff();
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
		return( YCFGenKbSecAppObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecApp" );
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
		objName = getRequiredJEEMountName();
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
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getSecFormTableObj().readSecFormByUJEEServletIdx( getRequiredClusterId(),
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

	public IYCFGenKbSecAppObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecAppObj retobj = getSchema().getSecAppTableObj().realiseSecApp( (IYCFGenKbSecAppObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecApp().forget();
	}

	public IYCFGenKbSecAppObj read() {
		IYCFGenKbSecAppObj retval = getOrigAsSecApp().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecAppObj read( boolean forceRead ) {
		IYCFGenKbSecAppObj retval = getOrigAsSecApp().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecAppObj create() {
		copyBuffToOrig();
		IYCFGenKbSecAppObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecApp().getSchema()).getSecAppTableObj().createSecApp( getOrigAsSecApp() );
		if( retobj == getOrigAsSecApp() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecAppEditObj update() {
		getSchema().getSecAppTableObj().updateSecApp( (IYCFGenKbSecAppObj)this );
		return( null );
	}

	public YCFGenKbSecAppEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecAppTableObj().deleteSecApp( getOrigAsSecApp() );
		return( null );
	}

	public IYCFGenKbSecAppTableObj getSecAppTable() {
		return( orig.getSchema().getSecAppTableObj() );
	}

	public IYCFGenKbSecAppEditObj getEdit() {
		return( (IYCFGenKbSecAppEditObj)this );
	}

	public IYCFGenKbSecAppEditObj getEditAsSecApp() {
		return( (IYCFGenKbSecAppEditObj)this );
	}

	public IYCFGenKbSecAppEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecAppObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecAppObj getOrigAsSecApp() {
		return( (IYCFGenKbSecAppObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecAppBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecApp().getSchema().getBackingStore()).getFactorySecApp().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecAppBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFGenKbSecAppBuff getSecAppBuff() {
		return( (YCFGenKbSecAppBuff)getBuff() );
	}

	public YCFGenKbSecAppPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecAppPKey value ) {
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

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecApp().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getSecAppBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getSecAppBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecAppBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public List<IYCFGenKbSecFormObj> getOptionalComponentsForm() {
		List<IYCFGenKbSecFormObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecApp().getSchema()).getSecFormTableObj().readSecFormBySecAppIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecAppId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecFormObj> getOptionalComponentsForm( boolean forceRead ) {
		List<IYCFGenKbSecFormObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecApp().getSchema()).getSecFormTableObj().readSecFormBySecAppIdx( getPKey().getRequiredClusterId(),
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
		YCFGenKbSecAppBuff origBuff = getOrigAsSecApp().getSecAppBuff();
		YCFGenKbSecAppBuff myBuff = getSecAppBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecAppBuff origBuff = getOrigAsSecApp().getSecAppBuff();
		YCFGenKbSecAppBuff myBuff = getSecAppBuff();
		myBuff.set( origBuff );
	}
}
