// Description: Java 11 edit object instance implementation for YCFBam Tld.

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

public class YCFBamTldEditObj
	implements IYCFBamTldEditObj
{
	protected IYCFIntTldObj orig;
	protected YCFIntTldBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredContainerTenant;

	public YCFBamTldEditObj( IYCFIntTldObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntTldBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerTenant = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntTldBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntTldBuff buff = getBuff();
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
		return( YCFBamTldObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Tld" );
	}

	public IYCFLibAnyObj getScope() {
		return( getRequiredContainerTenant() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( getRequiredContainerTenant() );
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getTopDomainTableObj().readTopDomainByNameIdx( getRequiredTenantId(),
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

	public IYCFIntTldObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntTldObj retobj = getSchema().getTldTableObj().realiseTld( (IYCFBamTldObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTld().forget();
	}

	public IYCFIntTldObj read() {
		IYCFIntTldObj retval = getOrigAsTld().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntTldObj read( boolean forceRead ) {
		IYCFIntTldObj retval = getOrigAsTld().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntTldObj create() {
		copyBuffToOrig();
		IYCFIntTldObj retobj = ((IYCFBamSchemaObj)getOrigAsTld().getSchema()).getTldTableObj().createTld( getOrigAsTld() );
		if( retobj == getOrigAsTld() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntTldEditObj update() {
		getSchema().getTldTableObj().updateTld( (IYCFIntTldObj)this );
		return( null );
	}

	public YCFIntTldEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTldTableObj().deleteTld( getOrigAsTld() );
		return( null );
	}

	public IYCFIntTldTableObj getTldTable() {
		return( orig.getSchema().getTldTableObj() );
	}

	public IYCFIntTldEditObj getEdit() {
		return( (IYCFIntTldEditObj)this );
	}

	public IYCFIntTldEditObj getEditAsTld() {
		return( (IYCFIntTldEditObj)this );
	}

	public IYCFIntTldEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntTldObj getOrig() {
		return( orig );
	}

	public IYCFIntTldObj getOrigAsTld() {
		return( (IYCFIntTldObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntTldBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsTld().getSchema().getBackingStore()).getFactoryTld().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntTldBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerTenant = null;
		}
	}

	public YCFIntTldBuff getTldBuff() {
		return( (YCFIntTldBuff)getBuff() );
	}

	public YCFIntTldPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntTldPKey value ) {
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

	public String getRequiredName() {
		return( getTldBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getTldBuff().getRequiredName() != value ) {
			getTldBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getTldBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getTldBuff().getOptionalDescription() != value ) {
			getTldBuff().setOptionalDescription( value );
		}
	}

	public IYCFSecTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( forceRead || ( requiredContainerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsTld().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredContainerTenant = obj;
				if( obj != null ) {
					getTldBuff().setRequiredTenantId( obj.getRequiredId() );
					requiredContainerTenant = obj;
				}
			}
		}
		return( requiredContainerTenant );
	}

	public void setRequiredContainerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getTldBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTldBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredContainerTenant = value;
	}

	public List<IYCFIntTopDomainObj> getOptionalComponentsTopDomain() {
		List<IYCFIntTopDomainObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTld().getSchema()).getTopDomainTableObj().readTopDomainByTldIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntTopDomainObj> getOptionalComponentsTopDomain( boolean forceRead ) {
		List<IYCFIntTopDomainObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTld().getSchema()).getTopDomainTableObj().readTopDomainByTldIdx( getPKey().getRequiredTenantId(),
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
		YCFIntTldBuff origBuff = getOrigAsTld().getTldBuff();
		YCFIntTldBuff myBuff = getTldBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntTldBuff origBuff = getOrigAsTld().getTldBuff();
		YCFIntTldBuff myBuff = getTldBuff();
		myBuff.set( origBuff );
	}
}
