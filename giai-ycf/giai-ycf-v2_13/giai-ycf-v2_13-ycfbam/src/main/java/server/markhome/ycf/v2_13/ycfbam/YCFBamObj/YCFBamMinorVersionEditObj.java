// Description: Java 11 edit object instance implementation for YCFBam MinorVersion.

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

public class YCFBamMinorVersionEditObj
	implements IYCFBamMinorVersionEditObj
{
	protected IYCFIntMinorVersionObj orig;
	protected YCFIntMinorVersionBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFIntMajorVersionObj requiredContainerParentMajVer;

	public YCFBamMinorVersionEditObj( IYCFIntMinorVersionObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntMinorVersionBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentMajVer = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntMinorVersionBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntMinorVersionBuff buff = getBuff();
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
		return( YCFBamMinorVersionObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "MinorVersion" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntMajorVersionObj scope = getRequiredContainerParentMajVer();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntMajorVersionObj scope = getRequiredContainerParentMajVer();
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
			subObj = ((IYCFBamSchemaObj)getSchema()).getSchemaDefTableObj().readSchemaDefByUNameIdx( getRequiredTenantId(),
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

	public IYCFIntMinorVersionObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntMinorVersionObj retobj = getSchema().getMinorVersionTableObj().realiseMinorVersion( (IYCFBamMinorVersionObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsMinorVersion().forget();
	}

	public IYCFIntMinorVersionObj read() {
		IYCFIntMinorVersionObj retval = getOrigAsMinorVersion().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntMinorVersionObj read( boolean forceRead ) {
		IYCFIntMinorVersionObj retval = getOrigAsMinorVersion().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntMinorVersionObj create() {
		copyBuffToOrig();
		IYCFIntMinorVersionObj retobj = ((IYCFBamSchemaObj)getOrigAsMinorVersion().getSchema()).getMinorVersionTableObj().createMinorVersion( getOrigAsMinorVersion() );
		if( retobj == getOrigAsMinorVersion() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntMinorVersionEditObj update() {
		getSchema().getMinorVersionTableObj().updateMinorVersion( (IYCFIntMinorVersionObj)this );
		return( null );
	}

	public YCFIntMinorVersionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getMinorVersionTableObj().deleteMinorVersion( getOrigAsMinorVersion() );
		return( null );
	}

	public IYCFIntMinorVersionTableObj getMinorVersionTable() {
		return( orig.getSchema().getMinorVersionTableObj() );
	}

	public IYCFIntMinorVersionEditObj getEdit() {
		return( (IYCFIntMinorVersionEditObj)this );
	}

	public IYCFIntMinorVersionEditObj getEditAsMinorVersion() {
		return( (IYCFIntMinorVersionEditObj)this );
	}

	public IYCFIntMinorVersionEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntMinorVersionObj getOrig() {
		return( orig );
	}

	public IYCFIntMinorVersionObj getOrigAsMinorVersion() {
		return( (IYCFIntMinorVersionObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntMinorVersionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsMinorVersion().getSchema().getBackingStore()).getFactoryMinorVersion().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntMinorVersionBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentMajVer = null;
		}
	}

	public YCFIntMinorVersionBuff getMinorVersionBuff() {
		return( (YCFIntMinorVersionBuff)getBuff() );
	}

	public YCFIntMinorVersionPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntMinorVersionPKey value ) {
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

	public long getRequiredMajorVersionId() {
		return( getMinorVersionBuff().getRequiredMajorVersionId() );
	}

	public String getRequiredName() {
		return( getMinorVersionBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getMinorVersionBuff().getRequiredName() != value ) {
			getMinorVersionBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getMinorVersionBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getMinorVersionBuff().getOptionalDescription() != value ) {
			getMinorVersionBuff().setOptionalDescription( value );
		}
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsMinorVersion().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getMinorVersionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getMinorVersionBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFIntMajorVersionObj getRequiredContainerParentMajVer() {
		return( getRequiredContainerParentMajVer( false ) );
	}

	public IYCFIntMajorVersionObj getRequiredContainerParentMajVer( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentMajVer == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFIntMajorVersionObj obj = ((IYCFBamSchemaObj)getOrigAsMinorVersion().getSchema()).getMajorVersionTableObj().readMajorVersionByIdIdx( getPKey().getRequiredTenantId(),
					getMinorVersionBuff().getRequiredMajorVersionId() );
				requiredContainerParentMajVer = obj;
				if( obj != null ) {
					getMinorVersionBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getMinorVersionBuff().setRequiredMajorVersionId( obj.getRequiredId() );
					requiredContainerParentMajVer = obj;
				}
			}
		}
		return( requiredContainerParentMajVer );
	}

	public void setRequiredContainerParentMajVer( IYCFIntMajorVersionObj value ) {
			if( buff == null ) {
				getMinorVersionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getMinorVersionBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getMinorVersionBuff().setRequiredMajorVersionId( value.getRequiredId() );
			}
			requiredContainerParentMajVer = value;
	}

	public List<IYCFBamSchemaDefObj> getOptionalComponentsSchemaDef() {
		List<IYCFBamSchemaDefObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsMinorVersion().getSchema()).getSchemaDefTableObj().readSchemaDefByMinorVersionIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamSchemaDefObj> getOptionalComponentsSchemaDef( boolean forceRead ) {
		List<IYCFBamSchemaDefObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsMinorVersion().getSchema()).getSchemaDefTableObj().readSchemaDefByMinorVersionIdx( getPKey().getRequiredTenantId(),
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
		YCFIntMinorVersionBuff origBuff = getOrigAsMinorVersion().getMinorVersionBuff();
		YCFIntMinorVersionBuff myBuff = getMinorVersionBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntMinorVersionBuff origBuff = getOrigAsMinorVersion().getMinorVersionBuff();
		YCFIntMinorVersionBuff myBuff = getMinorVersionBuff();
		myBuff.set( origBuff );
	}
}
