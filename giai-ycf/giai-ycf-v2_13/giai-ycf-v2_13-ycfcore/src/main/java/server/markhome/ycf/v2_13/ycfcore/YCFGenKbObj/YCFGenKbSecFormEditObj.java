// Description: Java 11 edit object instance implementation for YCFGenKb SecForm.

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

public class YCFGenKbSecFormEditObj
	implements IYCFGenKbSecFormEditObj
{
	protected IYCFGenKbSecFormObj orig;
	protected YCFGenKbSecFormBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredOwnerCluster;
	protected IYCFGenKbSecAppObj requiredContainerApplication;

	public YCFGenKbSecFormEditObj( IYCFGenKbSecFormObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecFormBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerApplication = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecFormBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecFormBuff buff = getBuff();
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
		return( YCFGenKbSecFormObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecForm" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbSecAppObj scope = getRequiredContainerApplication();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbSecAppObj scope = getRequiredContainerApplication();
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

	public IYCFGenKbSecFormObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecFormObj retobj = getSchema().getSecFormTableObj().realiseSecForm( (IYCFGenKbSecFormObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecForm().forget();
	}

	public IYCFGenKbSecFormObj read() {
		IYCFGenKbSecFormObj retval = getOrigAsSecForm().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecFormObj read( boolean forceRead ) {
		IYCFGenKbSecFormObj retval = getOrigAsSecForm().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecFormObj create() {
		copyBuffToOrig();
		IYCFGenKbSecFormObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecForm().getSchema()).getSecFormTableObj().createSecForm( getOrigAsSecForm() );
		if( retobj == getOrigAsSecForm() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecFormEditObj update() {
		getSchema().getSecFormTableObj().updateSecForm( (IYCFGenKbSecFormObj)this );
		return( null );
	}

	public YCFGenKbSecFormEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecFormTableObj().deleteSecForm( getOrigAsSecForm() );
		return( null );
	}

	public IYCFGenKbSecFormTableObj getSecFormTable() {
		return( orig.getSchema().getSecFormTableObj() );
	}

	public IYCFGenKbSecFormEditObj getEdit() {
		return( (IYCFGenKbSecFormEditObj)this );
	}

	public IYCFGenKbSecFormEditObj getEditAsSecForm() {
		return( (IYCFGenKbSecFormEditObj)this );
	}

	public IYCFGenKbSecFormEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecFormObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecFormObj getOrigAsSecForm() {
		return( (IYCFGenKbSecFormObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecFormBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecForm().getSchema().getBackingStore()).getFactorySecForm().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecFormBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerApplication = null;
		}
	}

	public YCFGenKbSecFormBuff getSecFormBuff() {
		return( (YCFGenKbSecFormBuff)getBuff() );
	}

	public YCFGenKbSecFormPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecFormPKey value ) {
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

	public IYCFGenKbClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecForm().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getSecFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecFormBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredOwnerCluster = value;
	}

	public IYCFGenKbSecAppObj getRequiredContainerApplication() {
		return( getRequiredContainerApplication( false ) );
	}

	public IYCFGenKbSecAppObj getRequiredContainerApplication( boolean forceRead ) {
		if( forceRead || ( requiredContainerApplication == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbSecAppObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecForm().getSchema()).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
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

	public void setRequiredContainerApplication( IYCFGenKbSecAppObj value ) {
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
		YCFGenKbSecFormBuff origBuff = getOrigAsSecForm().getSecFormBuff();
		YCFGenKbSecFormBuff myBuff = getSecFormBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecFormBuff origBuff = getOrigAsSecForm().getSecFormBuff();
		YCFGenKbSecFormBuff myBuff = getSecFormBuff();
		myBuff.set( origBuff );
	}
}
