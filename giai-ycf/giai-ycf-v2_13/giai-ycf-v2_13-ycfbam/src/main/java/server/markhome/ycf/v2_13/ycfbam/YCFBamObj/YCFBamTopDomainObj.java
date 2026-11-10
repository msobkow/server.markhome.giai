// Description: Java 11 base object instance implementation for YCFBam TopDomain.

/*
 *	org.mssycf.mssycf.YCFBam
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

public class YCFBamTopDomainObj
	implements IYCFBamTopDomainObj
{
	public final static String CLASS_CODE = "a107";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFIntTopDomainEditObj edit;
	protected IYCFIntSchemaObj schema;
	protected YCFIntTopDomainPKey pKey;
	protected YCFIntTopDomainBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntTldObj requiredContainerParentTld;

	public YCFBamTopDomainObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
	}

	public YCFBamTopDomainObj( IYCFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getLicenseTableObj().readLicenseByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTopProjectTableObj().readTopProjectByNameIdx( getRequiredTenantId(),
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
		IYCFIntTopDomainObj retobj = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().realiseTopDomain(
			(IYCFIntTopDomainObj)this );
		return( (IYCFIntTopDomainObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getTopDomainTableObj().reallyDeepDisposeTopDomain( (IYCFIntTopDomainObj)this );
	}

	public IYCFIntTopDomainObj read() {
		IYCFIntTopDomainObj retobj = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFIntTopDomainObj)retobj );
	}

	public IYCFIntTopDomainObj read( boolean forceRead ) {
		IYCFIntTopDomainObj retobj = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFIntTopDomainObj)retobj );
	}

	public IYCFIntTopDomainTableObj getTopDomainTable() {
		return( ((IYCFBamSchemaObj)schema).getTopDomainTableObj() );
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = value;
	}

	public YCFIntTopDomainBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTopDomain().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTopDomain().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFIntTopDomainBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFIntTopDomainBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFIntTopDomainBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
	}

	public YCFIntTopDomainBuff getTopDomainBuff() {
		return( (YCFIntTopDomainBuff)getBuff() );
	}

	public YCFIntTopDomainPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFIntTopDomainPKey value ) {
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

	public IYCFIntTopDomainEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFIntTopDomainObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFIntTopDomainObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().lockTopDomain( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().newEditInstance( lockobj );
		return( (IYCFIntTopDomainEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFIntTopDomainEditObj getEdit() {
		return( edit );
	}

	public IYCFIntTopDomainEditObj getEditAsTopDomain() {
		return( (IYCFIntTopDomainEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntTopDomainBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntTopDomainBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
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

	public String getOptionalDescription() {
		return( getTopDomainBuff().getOptionalDescription() );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((IYCFBamSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public IYCFIntTldObj getRequiredContainerParentTld() {
		return( getRequiredContainerParentTld( false ) );
	}

	public IYCFIntTldObj getRequiredContainerParentTld( boolean forceRead ) {
		if( ( requiredContainerParentTld == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerParentTld = ((IYCFBamSchemaObj)schema).getTldTableObj().readTldByIdIdx( getPKey().getRequiredTenantId(),
					getTopDomainBuff().getRequiredTldId(), forceRead );
			}
		}
		return( requiredContainerParentTld );
	}

	public List<IYCFIntLicenseObj> getOptionalComponentsLicense() {
		List<IYCFIntLicenseObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getLicenseTableObj().readLicenseByDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntLicenseObj> getOptionalComponentsLicense( boolean forceRead ) {
		List<IYCFIntLicenseObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getLicenseTableObj().readLicenseByDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFIntTopProjectObj> getOptionalComponentsTopProject() {
		List<IYCFIntTopProjectObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntTopProjectObj> getOptionalComponentsTopProject( boolean forceRead ) {
		List<IYCFIntTopProjectObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}
