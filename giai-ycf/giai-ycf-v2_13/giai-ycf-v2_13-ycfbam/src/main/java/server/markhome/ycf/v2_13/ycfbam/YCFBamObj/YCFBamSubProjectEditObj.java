// Description: Java 11 edit object instance implementation for YCFBam SubProject.

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

public class YCFBamSubProjectEditObj
	implements IYCFBamSubProjectEditObj
{
	protected IYCFIntSubProjectObj orig;
	protected YCFIntSubProjectBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntTopProjectObj requiredContainerParentTPrj;

	public YCFBamSubProjectEditObj( IYCFIntSubProjectObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntSubProjectBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentTPrj = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntSubProjectBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntSubProjectBuff buff = getBuff();
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
		return( YCFBamSubProjectObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SubProject" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntTopProjectObj scope = getRequiredContainerParentTPrj();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntTopProjectObj scope = getRequiredContainerParentTPrj();
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getMajorVersionTableObj().readMajorVersionByNameIdx( getRequiredTenantId(),
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

	public IYCFIntSubProjectObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntSubProjectObj retobj = getSchema().getSubProjectTableObj().realiseSubProject( (IYCFBamSubProjectObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSubProject().forget();
	}

	public IYCFIntSubProjectObj read() {
		IYCFIntSubProjectObj retval = getOrigAsSubProject().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntSubProjectObj read( boolean forceRead ) {
		IYCFIntSubProjectObj retval = getOrigAsSubProject().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntSubProjectObj create() {
		copyBuffToOrig();
		IYCFIntSubProjectObj retobj = ((IYCFBamSchemaObj)getOrigAsSubProject().getSchema()).getSubProjectTableObj().createSubProject( getOrigAsSubProject() );
		if( retobj == getOrigAsSubProject() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntSubProjectEditObj update() {
		getSchema().getSubProjectTableObj().updateSubProject( (IYCFIntSubProjectObj)this );
		return( null );
	}

	public YCFIntSubProjectEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSubProjectTableObj().deleteSubProject( getOrigAsSubProject() );
		return( null );
	}

	public IYCFIntSubProjectTableObj getSubProjectTable() {
		return( orig.getSchema().getSubProjectTableObj() );
	}

	public IYCFIntSubProjectEditObj getEdit() {
		return( (IYCFIntSubProjectEditObj)this );
	}

	public IYCFIntSubProjectEditObj getEditAsSubProject() {
		return( (IYCFIntSubProjectEditObj)this );
	}

	public IYCFIntSubProjectEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntSubProjectObj getOrig() {
		return( orig );
	}

	public IYCFIntSubProjectObj getOrigAsSubProject() {
		return( (IYCFIntSubProjectObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntSubProjectBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsSubProject().getSchema().getBackingStore()).getFactorySubProject().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntSubProjectBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentTPrj = null;
		}
	}

	public YCFIntSubProjectBuff getSubProjectBuff() {
		return( (YCFIntSubProjectBuff)getBuff() );
	}

	public YCFIntSubProjectPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntSubProjectPKey value ) {
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

	public long getRequiredTopProjectId() {
		return( getSubProjectBuff().getRequiredTopProjectId() );
	}

	public String getRequiredName() {
		return( getSubProjectBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getSubProjectBuff().getRequiredName() != value ) {
			getSubProjectBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getSubProjectBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getSubProjectBuff().getOptionalDescription() != value ) {
			getSubProjectBuff().setOptionalDescription( value );
		}
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsSubProject().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getSubProjectBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getSubProjectBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFIntTopProjectObj getRequiredContainerParentTPrj() {
		return( getRequiredContainerParentTPrj( false ) );
	}

	public IYCFIntTopProjectObj getRequiredContainerParentTPrj( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentTPrj == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFIntTopProjectObj obj = ((IYCFBamSchemaObj)getOrigAsSubProject().getSchema()).getTopProjectTableObj().readTopProjectByIdIdx( getPKey().getRequiredTenantId(),
					getSubProjectBuff().getRequiredTopProjectId() );
				requiredContainerParentTPrj = obj;
				if( obj != null ) {
					getSubProjectBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getSubProjectBuff().setRequiredTopProjectId( obj.getRequiredId() );
					requiredContainerParentTPrj = obj;
				}
			}
		}
		return( requiredContainerParentTPrj );
	}

	public void setRequiredContainerParentTPrj( IYCFIntTopProjectObj value ) {
			if( buff == null ) {
				getSubProjectBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getSubProjectBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getSubProjectBuff().setRequiredTopProjectId( value.getRequiredId() );
			}
			requiredContainerParentTPrj = value;
	}

	public List<IYCFIntMajorVersionObj> getOptionalComponentsMajorVer() {
		List<IYCFIntMajorVersionObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSubProject().getSchema()).getMajorVersionTableObj().readMajorVersionBySubProjectIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntMajorVersionObj> getOptionalComponentsMajorVer( boolean forceRead ) {
		List<IYCFIntMajorVersionObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSubProject().getSchema()).getMajorVersionTableObj().readMajorVersionBySubProjectIdx( getPKey().getRequiredTenantId(),
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
		YCFIntSubProjectBuff origBuff = getOrigAsSubProject().getSubProjectBuff();
		YCFIntSubProjectBuff myBuff = getSubProjectBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntSubProjectBuff origBuff = getOrigAsSubProject().getSubProjectBuff();
		YCFIntSubProjectBuff myBuff = getSubProjectBuff();
		myBuff.set( origBuff );
	}
}
