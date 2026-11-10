// Description: Java 11 base object instance implementation for YCFBam MajorVersion.

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

public class YCFBamMajorVersionObj
	implements IYCFBamMajorVersionObj
{
	public final static String CLASS_CODE = "a102";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFIntMajorVersionEditObj edit;
	protected IYCFIntSchemaObj schema;
	protected YCFIntMajorVersionPKey pKey;
	protected YCFIntMajorVersionBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntSubProjectObj requiredContainerParentSPrj;

	public YCFBamMajorVersionObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
	}

	public YCFBamMajorVersionObj( IYCFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getMinorVersionTableObj().readMinorVersionByNameIdx( getRequiredTenantId(),
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
		IYCFIntMajorVersionObj retobj = ((IYCFBamSchemaObj)schema).getMajorVersionTableObj().realiseMajorVersion(
			(IYCFIntMajorVersionObj)this );
		return( (IYCFIntMajorVersionObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getMajorVersionTableObj().reallyDeepDisposeMajorVersion( (IYCFIntMajorVersionObj)this );
	}

	public IYCFIntMajorVersionObj read() {
		IYCFIntMajorVersionObj retobj = ((IYCFBamSchemaObj)schema).getMajorVersionTableObj().readMajorVersionByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFIntMajorVersionObj)retobj );
	}

	public IYCFIntMajorVersionObj read( boolean forceRead ) {
		IYCFIntMajorVersionObj retobj = ((IYCFBamSchemaObj)schema).getMajorVersionTableObj().readMajorVersionByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFIntMajorVersionObj)retobj );
	}

	public IYCFIntMajorVersionTableObj getMajorVersionTable() {
		return( ((IYCFBamSchemaObj)schema).getMajorVersionTableObj() );
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = value;
	}

	public YCFIntMajorVersionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFIntMajorVersionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFIntMajorVersionBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFIntMajorVersionBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
	}

	public YCFIntMajorVersionBuff getMajorVersionBuff() {
		return( (YCFIntMajorVersionBuff)getBuff() );
	}

	public YCFIntMajorVersionPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFIntMajorVersionPKey value ) {
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

	public IYCFIntMajorVersionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFIntMajorVersionObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFIntMajorVersionObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getMajorVersionTableObj().lockMajorVersion( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getMajorVersionTableObj().newEditInstance( lockobj );
		return( (IYCFIntMajorVersionEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFIntMajorVersionEditObj getEdit() {
		return( edit );
	}

	public IYCFIntMajorVersionEditObj getEditAsMajorVersion() {
		return( (IYCFIntMajorVersionEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntMajorVersionBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntMajorVersionBuff buff = getBuff();
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

	public long getRequiredSubProjectId() {
		return( getMajorVersionBuff().getRequiredSubProjectId() );
	}

	public String getRequiredName() {
		return( getMajorVersionBuff().getRequiredName() );
	}

	public String getOptionalDescription() {
		return( getMajorVersionBuff().getOptionalDescription() );
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

	public IYCFIntSubProjectObj getRequiredContainerParentSPrj() {
		return( getRequiredContainerParentSPrj( false ) );
	}

	public IYCFIntSubProjectObj getRequiredContainerParentSPrj( boolean forceRead ) {
		if( ( requiredContainerParentSPrj == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerParentSPrj = ((IYCFBamSchemaObj)schema).getSubProjectTableObj().readSubProjectByIdIdx( getPKey().getRequiredTenantId(),
					getMajorVersionBuff().getRequiredSubProjectId(), forceRead );
			}
		}
		return( requiredContainerParentSPrj );
	}

	public List<IYCFIntMinorVersionObj> getOptionalComponentsMinorVer() {
		List<IYCFIntMinorVersionObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntMinorVersionObj> getOptionalComponentsMinorVer( boolean forceRead ) {
		List<IYCFIntMinorVersionObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
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
