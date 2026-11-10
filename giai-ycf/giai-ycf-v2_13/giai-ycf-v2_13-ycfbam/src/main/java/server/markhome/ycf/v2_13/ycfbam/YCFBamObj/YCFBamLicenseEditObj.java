// Description: Java 11 edit object instance implementation for YCFBam License.

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

public class YCFBamLicenseEditObj
	implements IYCFBamLicenseEditObj
{
	protected IYCFIntLicenseObj orig;
	protected YCFIntLicenseBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntTopDomainObj requiredContainerTopDomain;

	public YCFBamLicenseEditObj( IYCFIntLicenseObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntLicenseBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerTopDomain = null;
	}

	public String getClassCode() {
		return( YCFBamLicenseObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntLicenseObj retobj = getSchema().getLicenseTableObj().realiseLicense( (IYCFBamLicenseObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsLicense().forget();
	}

	public IYCFIntLicenseObj read() {
		IYCFIntLicenseObj retval = getOrigAsLicense().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntLicenseObj read( boolean forceRead ) {
		IYCFIntLicenseObj retval = getOrigAsLicense().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntLicenseObj create() {
		copyBuffToOrig();
		IYCFIntLicenseObj retobj = ((IYCFBamSchemaObj)getOrigAsLicense().getSchema()).getLicenseTableObj().createLicense( getOrigAsLicense() );
		if( retobj == getOrigAsLicense() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntLicenseEditObj update() {
		getSchema().getLicenseTableObj().updateLicense( (IYCFIntLicenseObj)this );
		return( null );
	}

	public YCFIntLicenseEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getLicenseTableObj().deleteLicense( getOrigAsLicense() );
		return( null );
	}

	public IYCFIntLicenseTableObj getLicenseTable() {
		return( orig.getSchema().getLicenseTableObj() );
	}

	public IYCFIntLicenseEditObj getEdit() {
		return( (IYCFIntLicenseEditObj)this );
	}

	public IYCFIntLicenseEditObj getEditAsLicense() {
		return( (IYCFIntLicenseEditObj)this );
	}

	public IYCFIntLicenseEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntLicenseObj getOrig() {
		return( orig );
	}

	public IYCFIntLicenseObj getOrigAsLicense() {
		return( (IYCFIntLicenseObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntLicenseBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsLicense().getSchema().getBackingStore()).getFactoryLicense().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntLicenseBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerTopDomain = null;
		}
	}

	public YCFIntLicenseBuff getLicenseBuff() {
		return( (YCFIntLicenseBuff)getBuff() );
	}

	public YCFIntLicensePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntLicensePKey value ) {
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

	public long getRequiredTopDomainId() {
		return( getLicenseBuff().getRequiredTopDomainId() );
	}

	public String getRequiredName() {
		return( getLicenseBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getLicenseBuff().getRequiredName() != value ) {
			getLicenseBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getLicenseBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getLicenseBuff().getOptionalDescription() != value ) {
			getLicenseBuff().setOptionalDescription( value );
		}
	}

	public String getOptionalEmbeddedText() {
		return( getLicenseBuff().getOptionalEmbeddedText() );
	}

	public void setOptionalEmbeddedText( String value ) {
		if( getLicenseBuff().getOptionalEmbeddedText() != value ) {
			getLicenseBuff().setOptionalEmbeddedText( value );
		}
	}

	public String getOptionalFullText() {
		return( getLicenseBuff().getOptionalFullText() );
	}

	public void setOptionalFullText( String value ) {
		if( getLicenseBuff().getOptionalFullText() != value ) {
			getLicenseBuff().setOptionalFullText( value );
		}
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsLicense().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getLicenseBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getLicenseBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFIntTopDomainObj getRequiredContainerTopDomain() {
		return( getRequiredContainerTopDomain( false ) );
	}

	public IYCFIntTopDomainObj getRequiredContainerTopDomain( boolean forceRead ) {
		if( forceRead || ( requiredContainerTopDomain == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFIntTopDomainObj obj = ((IYCFBamSchemaObj)getOrigAsLicense().getSchema()).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
					getLicenseBuff().getRequiredTopDomainId() );
				requiredContainerTopDomain = obj;
				if( obj != null ) {
					getLicenseBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getLicenseBuff().setRequiredTopDomainId( obj.getRequiredId() );
					requiredContainerTopDomain = obj;
				}
			}
		}
		return( requiredContainerTopDomain );
	}

	public void setRequiredContainerTopDomain( IYCFIntTopDomainObj value ) {
			if( buff == null ) {
				getLicenseBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getLicenseBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getLicenseBuff().setRequiredTopDomainId( value.getRequiredId() );
			}
			requiredContainerTopDomain = value;
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
		YCFIntLicenseBuff origBuff = getOrigAsLicense().getLicenseBuff();
		YCFIntLicenseBuff myBuff = getLicenseBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntLicenseBuff origBuff = getOrigAsLicense().getLicenseBuff();
		YCFIntLicenseBuff myBuff = getLicenseBuff();
		myBuff.set( origBuff );
	}
}
