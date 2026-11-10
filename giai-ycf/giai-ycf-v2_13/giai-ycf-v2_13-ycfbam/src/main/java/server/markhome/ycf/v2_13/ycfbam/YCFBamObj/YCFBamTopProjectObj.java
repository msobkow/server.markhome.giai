// Description: Java 11 base object instance implementation for YCFBam TopProject.

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

public class YCFBamTopProjectObj
	implements IYCFBamTopProjectObj
{
	public final static String CLASS_CODE = "a108";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFIntTopProjectEditObj edit;
	protected IYCFIntSchemaObj schema;
	protected YCFIntTopProjectPKey pKey;
	protected YCFIntTopProjectBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntTopDomainObj requiredContainerParentSDom;

	public YCFBamTopProjectObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerParentSDom = null;
	}

	public YCFBamTopProjectObj( IYCFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerParentSDom = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TopProject" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntTopDomainObj scope = getRequiredContainerParentSDom();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntTopDomainObj scope = getRequiredContainerParentSDom();
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getSubProjectTableObj().readSubProjectByNameIdx( getRequiredTenantId(),
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

	public IYCFIntTopProjectObj realise() {
		IYCFIntTopProjectObj retobj = ((IYCFBamSchemaObj)schema).getTopProjectTableObj().realiseTopProject(
			(IYCFIntTopProjectObj)this );
		return( (IYCFIntTopProjectObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getTopProjectTableObj().reallyDeepDisposeTopProject( (IYCFIntTopProjectObj)this );
	}

	public IYCFIntTopProjectObj read() {
		IYCFIntTopProjectObj retobj = ((IYCFBamSchemaObj)schema).getTopProjectTableObj().readTopProjectByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFIntTopProjectObj)retobj );
	}

	public IYCFIntTopProjectObj read( boolean forceRead ) {
		IYCFIntTopProjectObj retobj = ((IYCFBamSchemaObj)schema).getTopProjectTableObj().readTopProjectByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFIntTopProjectObj)retobj );
	}

	public IYCFIntTopProjectTableObj getTopProjectTable() {
		return( ((IYCFBamSchemaObj)schema).getTopProjectTableObj() );
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = value;
	}

	public YCFIntTopProjectBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTopProject().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTopProject().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFIntTopProjectBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFIntTopProjectBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFIntTopProjectBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerParentSDom = null;
	}

	public YCFIntTopProjectBuff getTopProjectBuff() {
		return( (YCFIntTopProjectBuff)getBuff() );
	}

	public YCFIntTopProjectPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTopProject().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFIntTopProjectPKey value ) {
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

	public IYCFIntTopProjectEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFIntTopProjectObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFIntTopProjectObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getTopProjectTableObj().lockTopProject( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getTopProjectTableObj().newEditInstance( lockobj );
		return( (IYCFIntTopProjectEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFIntTopProjectEditObj getEdit() {
		return( edit );
	}

	public IYCFIntTopProjectEditObj getEditAsTopProject() {
		return( (IYCFIntTopProjectEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntTopProjectBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntTopProjectBuff buff = getBuff();
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

	public long getRequiredTopDomainId() {
		return( getTopProjectBuff().getRequiredTopDomainId() );
	}

	public String getRequiredName() {
		return( getTopProjectBuff().getRequiredName() );
	}

	public String getOptionalDescription() {
		return( getTopProjectBuff().getOptionalDescription() );
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

	public IYCFIntTopDomainObj getRequiredContainerParentSDom() {
		return( getRequiredContainerParentSDom( false ) );
	}

	public IYCFIntTopDomainObj getRequiredContainerParentSDom( boolean forceRead ) {
		if( ( requiredContainerParentSDom == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerParentSDom = ((IYCFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
					getTopProjectBuff().getRequiredTopDomainId(), forceRead );
			}
		}
		return( requiredContainerParentSDom );
	}

	public List<IYCFIntSubProjectObj> getOptionalComponentsSubProject() {
		List<IYCFIntSubProjectObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSubProjectTableObj().readSubProjectByTopProjectIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntSubProjectObj> getOptionalComponentsSubProject( boolean forceRead ) {
		List<IYCFIntSubProjectObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSubProjectTableObj().readSubProjectByTopProjectIdx( getPKey().getRequiredTenantId(),
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
