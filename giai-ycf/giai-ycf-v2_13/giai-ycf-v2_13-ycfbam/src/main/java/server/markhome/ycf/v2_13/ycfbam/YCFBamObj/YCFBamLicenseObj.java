// Description: Java 11 base object instance implementation for YCFBam License.

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

public class YCFBamLicenseObj
	implements IYCFBamLicenseObj
{
	public final static String CLASS_CODE = "a101";
	protected boolean isNew;
	protected IYCFIntLicenseEditObj edit;
	protected IYCFIntSchemaObj schema;
	protected YCFIntLicensePKey pKey;
	protected YCFIntLicenseBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntTopDomainObj requiredContainerTopDomain;

	public YCFBamLicenseObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerTopDomain = null;
	}

	public YCFBamLicenseObj( IYCFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerTopDomain = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "License" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntTopDomainObj scope = getRequiredContainerTopDomain();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntTopDomainObj scope = getRequiredContainerTopDomain();
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

	public IYCFIntLicenseObj realise() {
		IYCFIntLicenseObj retobj = ((IYCFBamSchemaObj)schema).getLicenseTableObj().realiseLicense(
			(IYCFIntLicenseObj)this );
		return( (IYCFIntLicenseObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getLicenseTableObj().reallyDeepDisposeLicense( (IYCFIntLicenseObj)this );
	}

	public IYCFIntLicenseObj read() {
		IYCFIntLicenseObj retobj = ((IYCFBamSchemaObj)schema).getLicenseTableObj().readLicenseByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFIntLicenseObj)retobj );
	}

	public IYCFIntLicenseObj read( boolean forceRead ) {
		IYCFIntLicenseObj retobj = ((IYCFBamSchemaObj)schema).getLicenseTableObj().readLicenseByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFIntLicenseObj)retobj );
	}

	public IYCFIntLicenseTableObj getLicenseTable() {
		return( ((IYCFBamSchemaObj)schema).getLicenseTableObj() );
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = value;
	}

	public YCFIntLicenseBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryLicense().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableLicense().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFIntLicenseBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFIntLicenseBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFIntLicenseBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerTopDomain = null;
	}

	public YCFIntLicenseBuff getLicenseBuff() {
		return( (YCFIntLicenseBuff)getBuff() );
	}

	public YCFIntLicensePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryLicense().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFIntLicensePKey value ) {
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

	public IYCFIntLicenseEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFIntLicenseObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFIntLicenseObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getLicenseTableObj().lockLicense( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getLicenseTableObj().newEditInstance( lockobj );
		return( (IYCFIntLicenseEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFIntLicenseEditObj getEdit() {
		return( edit );
	}

	public IYCFIntLicenseEditObj getEditAsLicense() {
		return( (IYCFIntLicenseEditObj)edit );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public long getRequiredTopDomainId() {
		return( getLicenseBuff().getRequiredTopDomainId() );
	}

	public String getRequiredName() {
		return( getLicenseBuff().getRequiredName() );
	}

	public String getOptionalDescription() {
		return( getLicenseBuff().getOptionalDescription() );
	}

	public String getOptionalEmbeddedText() {
		return( getLicenseBuff().getOptionalEmbeddedText() );
	}

	public String getOptionalFullText() {
		return( getLicenseBuff().getOptionalFullText() );
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

	public IYCFIntTopDomainObj getRequiredContainerTopDomain() {
		return( getRequiredContainerTopDomain( false ) );
	}

	public IYCFIntTopDomainObj getRequiredContainerTopDomain( boolean forceRead ) {
		if( ( requiredContainerTopDomain == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerTopDomain = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
					getLicenseBuff().getRequiredTopDomainId(), forceRead );
			}
		}
		return( requiredContainerTopDomain );
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
