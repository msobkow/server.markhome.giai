// Description: Java 11 base object instance implementation for YCFBam Tld.

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

public class YCFBamTldObj
	implements IYCFBamTldObj
{
	public final static String CLASS_CODE = "a106";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFIntTldEditObj edit;
	protected IYCFIntSchemaObj schema;
	protected YCFIntTldPKey pKey;
	protected YCFIntTldBuff buff;
	protected IYCFSecTenantObj requiredContainerTenant;

	public YCFBamTldObj() {
		isNew = true;
		requiredContainerTenant = null;
	}

	public YCFBamTldObj( IYCFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFIntTldObj retobj = ((IYCFBamSchemaObj)schema).getTldTableObj().realiseTld(
			(IYCFIntTldObj)this );
		return( (IYCFIntTldObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getTldTableObj().reallyDeepDisposeTld( (IYCFIntTldObj)this );
	}

	public IYCFIntTldObj read() {
		IYCFIntTldObj retobj = ((IYCFBamSchemaObj)schema).getTldTableObj().readTldByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFIntTldObj)retobj );
	}

	public IYCFIntTldObj read( boolean forceRead ) {
		IYCFIntTldObj retobj = ((IYCFBamSchemaObj)schema).getTldTableObj().readTldByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFIntTldObj)retobj );
	}

	public IYCFIntTldTableObj getTldTable() {
		return( ((IYCFBamSchemaObj)schema).getTldTableObj() );
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = value;
	}

	public YCFIntTldBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTld().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFIntTldBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFIntTldBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFIntTldBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerTenant = null;
	}

	public YCFIntTldBuff getTldBuff() {
		return( (YCFIntTldBuff)getBuff() );
	}

	public YCFIntTldPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFIntTldPKey value ) {
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

	public IYCFIntTldEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFIntTldObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFIntTldObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getTldTableObj().lockTld( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getTldTableObj().newEditInstance( lockobj );
		return( (IYCFIntTldEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFIntTldEditObj getEdit() {
		return( edit );
	}

	public IYCFIntTldEditObj getEditAsTld() {
		return( (IYCFIntTldEditObj)edit );
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

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getTldBuff().getRequiredName() );
	}

	public String getOptionalDescription() {
		return( getTldBuff().getOptionalDescription() );
	}

	public IYCFSecTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( ( requiredContainerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerTenant = ((IYCFBamSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredContainerTenant );
	}

	public List<IYCFIntTopDomainObj> getOptionalComponentsTopDomain() {
		List<IYCFIntTopDomainObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByTldIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntTopDomainObj> getOptionalComponentsTopDomain( boolean forceRead ) {
		List<IYCFIntTopDomainObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByTldIdx( getPKey().getRequiredTenantId(),
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
