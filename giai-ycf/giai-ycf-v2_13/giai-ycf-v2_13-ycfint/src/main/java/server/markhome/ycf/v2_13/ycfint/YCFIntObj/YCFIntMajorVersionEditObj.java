// Description: Java 11 edit object instance implementation for YCFInt MajorVersion.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

public class YCFIntMajorVersionEditObj
	implements IYCFIntMajorVersionEditObj
{
	protected IYCFIntMajorVersionObj orig;
	protected YCFIntMajorVersionBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntSubProjectObj requiredContainerParentSPrj;

	public YCFIntMajorVersionEditObj( IYCFIntMajorVersionObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntMajorVersionBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntMajorVersionBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntMajorVersionBuff buff = getBuff();
			updatedBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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
		return( YCFIntMajorVersionObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "MajorVersion" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntSubProjectObj scope = getRequiredContainerParentSPrj();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntSubProjectObj scope = getRequiredContainerParentSPrj();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
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
			subObj = ((IYCFIntSchemaObj)getSchema()).getMinorVersionTableObj().readMinorVersionByNameIdx( getRequiredTenantId(),
				getRequiredId(),
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
			else if( container instanceof IYCFIntTenantObj ) {
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

	public IYCFIntMajorVersionObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntMajorVersionObj retobj = getSchema().getMajorVersionTableObj().realiseMajorVersion( (IYCFIntMajorVersionObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsMajorVersion().forget();
	}

	public IYCFIntMajorVersionObj read() {
		IYCFIntMajorVersionObj retval = getOrigAsMajorVersion().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntMajorVersionObj read( boolean forceRead ) {
		IYCFIntMajorVersionObj retval = getOrigAsMajorVersion().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntMajorVersionObj create() {
		copyBuffToOrig();
		IYCFIntMajorVersionObj retobj = ((IYCFIntSchemaObj)getOrigAsMajorVersion().getSchema()).getMajorVersionTableObj().createMajorVersion( getOrigAsMajorVersion() );
		if( retobj == getOrigAsMajorVersion() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntMajorVersionEditObj update() {
		getSchema().getMajorVersionTableObj().updateMajorVersion( (IYCFIntMajorVersionObj)this );
		return( null );
	}

	public YCFIntMajorVersionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getMajorVersionTableObj().deleteMajorVersion( getOrigAsMajorVersion() );
		return( null );
	}

	public IYCFIntMajorVersionTableObj getMajorVersionTable() {
		return( orig.getSchema().getMajorVersionTableObj() );
	}

	public IYCFIntMajorVersionEditObj getEdit() {
		return( (IYCFIntMajorVersionEditObj)this );
	}

	public IYCFIntMajorVersionEditObj getEditAsMajorVersion() {
		return( (IYCFIntMajorVersionEditObj)this );
	}

	public IYCFIntMajorVersionEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntMajorVersionObj getOrig() {
		return( orig );
	}

	public IYCFIntMajorVersionObj getOrigAsMajorVersion() {
		return( (IYCFIntMajorVersionObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntMajorVersionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsMajorVersion().getSchema().getBackingStore()).getFactoryMajorVersion().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntMajorVersionBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentSPrj = null;
		}
	}

	public YCFIntMajorVersionBuff getMajorVersionBuff() {
		return( (YCFIntMajorVersionBuff)getBuff() );
	}

	public YCFIntMajorVersionPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntMajorVersionPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public long getRequiredSubProjectId() {
		return( getMajorVersionBuff().getRequiredSubProjectId() );
	}

	public String getRequiredName() {
		return( getMajorVersionBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getMajorVersionBuff().getRequiredName() != value ) {
			getMajorVersionBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getMajorVersionBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getMajorVersionBuff().getOptionalDescription() != value ) {
			getMajorVersionBuff().setOptionalDescription( value );
		}
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFIntSchemaObj)getOrigAsMajorVersion().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getMajorVersionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getMajorVersionBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFIntSubProjectObj getRequiredContainerParentSPrj() {
		return( getRequiredContainerParentSPrj( false ) );
	}

	public IYCFIntSubProjectObj getRequiredContainerParentSPrj( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentSPrj == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFIntSubProjectObj obj = ((IYCFIntSchemaObj)getOrigAsMajorVersion().getSchema()).getSubProjectTableObj().readSubProjectByIdIdx( getPKey().getRequiredTenantId(),
					getMajorVersionBuff().getRequiredSubProjectId() );
				requiredContainerParentSPrj = obj;
				if( obj != null ) {
					getMajorVersionBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getMajorVersionBuff().setRequiredSubProjectId( obj.getRequiredId() );
					requiredContainerParentSPrj = obj;
				}
			}
		}
		return( requiredContainerParentSPrj );
	}

	public void setRequiredContainerParentSPrj( IYCFIntSubProjectObj value ) {
			if( buff == null ) {
				getMajorVersionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getMajorVersionBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getMajorVersionBuff().setRequiredSubProjectId( value.getRequiredId() );
			}
			requiredContainerParentSPrj = value;
	}

	public List<IYCFIntMinorVersionObj> getOptionalComponentsMinorVer() {
		List<IYCFIntMinorVersionObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsMajorVersion().getSchema()).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntMinorVersionObj> getOptionalComponentsMinorVer( boolean forceRead ) {
		List<IYCFIntMinorVersionObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsMajorVersion().getSchema()).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFIntMajorVersionBuff origBuff = getOrigAsMajorVersion().getMajorVersionBuff();
		YCFIntMajorVersionBuff myBuff = getMajorVersionBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntMajorVersionBuff origBuff = getOrigAsMajorVersion().getMajorVersionBuff();
		YCFIntMajorVersionBuff myBuff = getMajorVersionBuff();
		myBuff.set( origBuff );
	}
}
