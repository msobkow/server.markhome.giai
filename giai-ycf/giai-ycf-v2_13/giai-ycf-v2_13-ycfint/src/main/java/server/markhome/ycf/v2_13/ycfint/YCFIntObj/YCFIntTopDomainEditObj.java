// Description: Java 11 edit object instance implementation for YCFInt TopDomain.

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

public class YCFIntTopDomainEditObj
	implements IYCFIntTopDomainEditObj
{
	protected IYCFIntTopDomainObj orig;
	protected YCFIntTopDomainBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntTldObj requiredContainerParentTld;

	public YCFIntTopDomainEditObj( IYCFIntTopDomainObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntTopDomainBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntTopDomainBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntTopDomainBuff buff = getBuff();
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
		return( YCFIntTopDomainObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TopDomain" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntTldObj scope = getRequiredContainerParentTld();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntTldObj scope = getRequiredContainerParentTld();
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
			subObj = ((IYCFIntSchemaObj)getSchema()).getLicenseTableObj().readLicenseByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getTopProjectTableObj().readTopProjectByNameIdx( getRequiredTenantId(),
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

	public IYCFIntTopDomainObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntTopDomainObj retobj = getSchema().getTopDomainTableObj().realiseTopDomain( (IYCFIntTopDomainObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTopDomain().forget();
	}

	public IYCFIntTopDomainObj read() {
		IYCFIntTopDomainObj retval = getOrigAsTopDomain().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntTopDomainObj read( boolean forceRead ) {
		IYCFIntTopDomainObj retval = getOrigAsTopDomain().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntTopDomainObj create() {
		copyBuffToOrig();
		IYCFIntTopDomainObj retobj = ((IYCFIntSchemaObj)getOrigAsTopDomain().getSchema()).getTopDomainTableObj().createTopDomain( getOrigAsTopDomain() );
		if( retobj == getOrigAsTopDomain() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntTopDomainEditObj update() {
		getSchema().getTopDomainTableObj().updateTopDomain( (IYCFIntTopDomainObj)this );
		return( null );
	}

	public YCFIntTopDomainEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTopDomainTableObj().deleteTopDomain( getOrigAsTopDomain() );
		return( null );
	}

	public IYCFIntTopDomainTableObj getTopDomainTable() {
		return( orig.getSchema().getTopDomainTableObj() );
	}

	public IYCFIntTopDomainEditObj getEdit() {
		return( (IYCFIntTopDomainEditObj)this );
	}

	public IYCFIntTopDomainEditObj getEditAsTopDomain() {
		return( (IYCFIntTopDomainEditObj)this );
	}

	public IYCFIntTopDomainEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntTopDomainObj getOrig() {
		return( orig );
	}

	public IYCFIntTopDomainObj getOrigAsTopDomain() {
		return( (IYCFIntTopDomainObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntTopDomainBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsTopDomain().getSchema().getBackingStore()).getFactoryTopDomain().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntTopDomainBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentTld = null;
		}
	}

	public YCFIntTopDomainBuff getTopDomainBuff() {
		return( (YCFIntTopDomainBuff)getBuff() );
	}

	public YCFIntTopDomainPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntTopDomainPKey value ) {
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

	public long getRequiredTldId() {
		return( getTopDomainBuff().getRequiredTldId() );
	}

	public String getRequiredName() {
		return( getTopDomainBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getTopDomainBuff().getRequiredName() != value ) {
			getTopDomainBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getTopDomainBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getTopDomainBuff().getOptionalDescription() != value ) {
			getTopDomainBuff().setOptionalDescription( value );
		}
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFIntSchemaObj)getOrigAsTopDomain().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getTopDomainBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTopDomainBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFIntTldObj getRequiredContainerParentTld() {
		return( getRequiredContainerParentTld( false ) );
	}

	public IYCFIntTldObj getRequiredContainerParentTld( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentTld == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFIntTldObj obj = ((IYCFIntSchemaObj)getOrigAsTopDomain().getSchema()).getTldTableObj().readTldByIdIdx( getPKey().getRequiredTenantId(),
					getTopDomainBuff().getRequiredTldId() );
				requiredContainerParentTld = obj;
				if( obj != null ) {
					getTopDomainBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTopDomainBuff().setRequiredTldId( obj.getRequiredId() );
					requiredContainerParentTld = obj;
				}
			}
		}
		return( requiredContainerParentTld );
	}

	public void setRequiredContainerParentTld( IYCFIntTldObj value ) {
			if( buff == null ) {
				getTopDomainBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTopDomainBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTopDomainBuff().setRequiredTldId( value.getRequiredId() );
			}
			requiredContainerParentTld = value;
	}

	public List<IYCFIntLicenseObj> getOptionalComponentsLicense() {
		List<IYCFIntLicenseObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsTopDomain().getSchema()).getLicenseTableObj().readLicenseByDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntLicenseObj> getOptionalComponentsLicense( boolean forceRead ) {
		List<IYCFIntLicenseObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsTopDomain().getSchema()).getLicenseTableObj().readLicenseByDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFIntTopProjectObj> getOptionalComponentsTopProject() {
		List<IYCFIntTopProjectObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsTopDomain().getSchema()).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntTopProjectObj> getOptionalComponentsTopProject( boolean forceRead ) {
		List<IYCFIntTopProjectObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsTopDomain().getSchema()).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
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
		YCFIntTopDomainBuff origBuff = getOrigAsTopDomain().getTopDomainBuff();
		YCFIntTopDomainBuff myBuff = getTopDomainBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntTopDomainBuff origBuff = getOrigAsTopDomain().getTopDomainBuff();
		YCFIntTopDomainBuff myBuff = getTopDomainBuff();
		myBuff.set( origBuff );
	}
}
