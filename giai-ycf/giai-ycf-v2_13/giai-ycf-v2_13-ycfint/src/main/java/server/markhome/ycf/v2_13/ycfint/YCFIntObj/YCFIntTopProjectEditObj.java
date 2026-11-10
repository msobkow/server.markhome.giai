// Description: Java 11 edit object instance implementation for YCFInt TopProject.

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

public class YCFIntTopProjectEditObj
	implements IYCFIntTopProjectEditObj
{
	protected IYCFIntTopProjectObj orig;
	protected YCFIntTopProjectBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntTopDomainObj requiredContainerParentSDom;

	public YCFIntTopProjectEditObj( IYCFIntTopProjectObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntTopProjectBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentSDom = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntTopProjectBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntTopProjectBuff buff = getBuff();
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
		return( YCFIntTopProjectObj.CLASS_CODE );
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
			subObj = ((IYCFIntSchemaObj)getSchema()).getSubProjectTableObj().readSubProjectByNameIdx( getRequiredTenantId(),
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntTopProjectObj retobj = getSchema().getTopProjectTableObj().realiseTopProject( (IYCFIntTopProjectObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTopProject().forget();
	}

	public IYCFIntTopProjectObj read() {
		IYCFIntTopProjectObj retval = getOrigAsTopProject().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntTopProjectObj read( boolean forceRead ) {
		IYCFIntTopProjectObj retval = getOrigAsTopProject().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntTopProjectObj create() {
		copyBuffToOrig();
		IYCFIntTopProjectObj retobj = ((IYCFIntSchemaObj)getOrigAsTopProject().getSchema()).getTopProjectTableObj().createTopProject( getOrigAsTopProject() );
		if( retobj == getOrigAsTopProject() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntTopProjectEditObj update() {
		getSchema().getTopProjectTableObj().updateTopProject( (IYCFIntTopProjectObj)this );
		return( null );
	}

	public YCFIntTopProjectEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTopProjectTableObj().deleteTopProject( getOrigAsTopProject() );
		return( null );
	}

	public IYCFIntTopProjectTableObj getTopProjectTable() {
		return( orig.getSchema().getTopProjectTableObj() );
	}

	public IYCFIntTopProjectEditObj getEdit() {
		return( (IYCFIntTopProjectEditObj)this );
	}

	public IYCFIntTopProjectEditObj getEditAsTopProject() {
		return( (IYCFIntTopProjectEditObj)this );
	}

	public IYCFIntTopProjectEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntTopProjectObj getOrig() {
		return( orig );
	}

	public IYCFIntTopProjectObj getOrigAsTopProject() {
		return( (IYCFIntTopProjectObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntTopProjectBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsTopProject().getSchema().getBackingStore()).getFactoryTopProject().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntTopProjectBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentSDom = null;
		}
	}

	public YCFIntTopProjectBuff getTopProjectBuff() {
		return( (YCFIntTopProjectBuff)getBuff() );
	}

	public YCFIntTopProjectPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntTopProjectPKey value ) {
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
		return( getTopProjectBuff().getRequiredTopDomainId() );
	}

	public String getRequiredName() {
		return( getTopProjectBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getTopProjectBuff().getRequiredName() != value ) {
			getTopProjectBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getTopProjectBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getTopProjectBuff().getOptionalDescription() != value ) {
			getTopProjectBuff().setOptionalDescription( value );
		}
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFIntSchemaObj)getOrigAsTopProject().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getTopProjectBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTopProjectBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFIntTopDomainObj getRequiredContainerParentSDom() {
		return( getRequiredContainerParentSDom( false ) );
	}

	public IYCFIntTopDomainObj getRequiredContainerParentSDom( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentSDom == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFIntTopDomainObj obj = ((IYCFIntSchemaObj)getOrigAsTopProject().getSchema()).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
					getTopProjectBuff().getRequiredTopDomainId() );
				requiredContainerParentSDom = obj;
				if( obj != null ) {
					getTopProjectBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTopProjectBuff().setRequiredTopDomainId( obj.getRequiredId() );
					requiredContainerParentSDom = obj;
				}
			}
		}
		return( requiredContainerParentSDom );
	}

	public void setRequiredContainerParentSDom( IYCFIntTopDomainObj value ) {
			if( buff == null ) {
				getTopProjectBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTopProjectBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTopProjectBuff().setRequiredTopDomainId( value.getRequiredId() );
			}
			requiredContainerParentSDom = value;
	}

	public List<IYCFIntSubProjectObj> getOptionalComponentsSubProject() {
		List<IYCFIntSubProjectObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsTopProject().getSchema()).getSubProjectTableObj().readSubProjectByTopProjectIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntSubProjectObj> getOptionalComponentsSubProject( boolean forceRead ) {
		List<IYCFIntSubProjectObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsTopProject().getSchema()).getSubProjectTableObj().readSubProjectByTopProjectIdx( getPKey().getRequiredTenantId(),
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
		YCFIntTopProjectBuff origBuff = getOrigAsTopProject().getTopProjectBuff();
		YCFIntTopProjectBuff myBuff = getTopProjectBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntTopProjectBuff origBuff = getOrigAsTopProject().getTopProjectBuff();
		YCFIntTopProjectBuff myBuff = getTopProjectBuff();
		myBuff.set( origBuff );
	}
}
