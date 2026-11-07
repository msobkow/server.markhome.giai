// Description: Java 25 edit object instance implementation for IntNet MinorVersion.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.intnet.intnetobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

public class IntNetMinorVersionEditObj
	implements IIntNetMinorVersionEditObj
{
	protected IIntNetMinorVersionObj orig;
	protected IIntNetMinorVersion rec;
	protected ISecureSecUserObj createdBy = null;
	protected ISecureSecUserObj updatedBy = null;
	protected ISecureTenantObj requiredOwnerTenant;
	protected IIntNetMajorVersionObj requiredContainerParentMajVer;

	public IntNetMinorVersionEditObj( IIntNetMinorVersionObj argOrig ) {
		orig = argOrig;
		getRec();
		IIntNetMinorVersion origRec = orig.getRec();
		rec.set( origRec );
		requiredOwnerTenant = null;
		requiredContainerParentMajVer = null;
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			IIntNetMinorVersion rec = getRec();
			createdBy = ((IIntNetSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getCreatedByUserId() );
		}
		return( createdBy );
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( getRec().getCreatedAt() );
	}

	@Override
	public ISecureSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			IIntNetMinorVersion rec = getRec();
			updatedBy = ((IIntNetSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( getRec().getUpdatedAt() );
	}

	@Override
	public void setCreatedBy( ISecureSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getRec().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	@Override
	public void setCreatedAt( LocalDateTime value ) {
		getRec().setCreatedAt( value );
	}

	@Override
	public void setUpdatedBy( ISecureSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getRec().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	@Override
	public void setUpdatedAt( LocalDateTime value ) {
		getRec().setUpdatedAt( value );
	}

	@Override
	public int getClassCode() {
		return( ((IIntNetSchemaObj)orig.getSchema()).getMinorVersionTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "MinorVersion" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		IIntNetMajorVersionObj scope = getRequiredContainerParentMajVer();
		return( scope );
	}

	@Override
	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	@Override
	public ICFAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IIntNetClusterObj ) {
					break;
				}
				else if( container instanceof IIntNetTenantObj ) {
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
				if( container instanceof IIntNetClusterObj ) {
					break;
				}
				else if( container instanceof IIntNetTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	@Override
	public ICFAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
	}

	@Override
	public ICFAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFAnyObj subObj = null;
		ICFAnyObj retObj;
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

	@Override
	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ISecureClusterObj ) {
				container = null;
			}
			else if( container instanceof ISecureTenantObj ) {
				container = null;
			}
			else if( container instanceof IIntNetTenantObj ) {
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

	@Override
	public String getObjFullName() {
		String fullName = getObjName();
		ICFAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ISecureClusterObj ) {
				container = null;
			}
			else if( container instanceof ISecureTenantObj ) {
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

	@Override
	public IIntNetMinorVersionObj realise() {
		// We realise this so that it's record will get copied to orig during realization
		IIntNetMinorVersionObj retobj = getSchema().getMinorVersionTableObj().realiseMinorVersion( (IIntNetMinorVersionObj)this );
		return( retobj );
	}

	@Override
	public void forget() {
		getOrigAsMinorVersion().forget();
	}

	@Override
	public IIntNetMinorVersionObj read() {
		IIntNetMinorVersionObj retval = getOrigAsMinorVersion().read();
		if( retval != orig ) {
			throw new CFStaleCacheDetectedException( getClass(),	"read" );
		}
		copyOrigToRec();
		return( retval );
	}

	@Override
	public IIntNetMinorVersionObj read( boolean forceRead ) {
		IIntNetMinorVersionObj retval = getOrigAsMinorVersion().read( forceRead );
		if( retval != orig ) {
			throw new CFStaleCacheDetectedException( getClass(),	"read" );
		}
		copyOrigToRec();
		return( retval );
	}

	@Override
	public IIntNetMinorVersionObj create() {
		copyRecToOrig();
		IIntNetMinorVersionObj retobj = ((IIntNetSchemaObj)getOrigAsMinorVersion().getSchema()).getMinorVersionTableObj().createMinorVersion( getOrigAsMinorVersion() );
		if( retobj == getOrigAsMinorVersion() ) {
			copyOrigToRec();
		}
		return( retobj );
	}

	@Override
	public IntNetMinorVersionEditObj update() {
		getSchema().getMinorVersionTableObj().updateMinorVersion( (IIntNetMinorVersionObj)this );
		return( null );
	}

	@Override
	public IntNetMinorVersionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFCannotDeleteNewInstanceException( getClass(), "delete" );
		}
		getSchema().getMinorVersionTableObj().deleteMinorVersion( getOrigAsMinorVersion() );
		return( null );
	}

	@Override
	public IIntNetMinorVersionTableObj getMinorVersionTable() {
		return( orig.getSchema().getMinorVersionTableObj() );
	}

	@Override
	public IIntNetMinorVersionEditObj getEdit() {
		return( (IIntNetMinorVersionEditObj)this );
	}

	@Override
	public IIntNetMinorVersionEditObj getEditAsMinorVersion() {
		return( (IIntNetMinorVersionEditObj)this );
	}

	@Override
	public IIntNetMinorVersionEditObj beginEdit() {
		throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
	}

	@Override
	public void endEdit() {
		orig.endEdit();
	}

	@Override
	public IIntNetMinorVersionObj getOrig() {
		return( orig );
	}

	@Override
	public IIntNetMinorVersionObj getOrigAsMinorVersion() {
		return( (IIntNetMinorVersionObj)orig );
	}

	@Override
	public IIntNetSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	@Override
	public void setSchema( IIntNetSchemaObj value ) {
		orig.setSchema(value);
	}

	@Override
	public IIntNetMinorVersion getRec() {
		if( rec == null ) {
			rec = getOrigAsMinorVersion().getSchema().getIntNetBackingStore().getIntNetFactory().getFactoryMinorVersion().newRec();
			rec.set( orig.getRec() );
		}
		return( rec );
	}

	@Override
	public void setRec( IIntNetMinorVersion value ) {
		if( rec != value ) {
			rec = value;
			requiredOwnerTenant = null;
			requiredContainerParentMajVer = null;
		}
	}

	@Override
	public IIntNetMinorVersion getMinorVersionRec() {
		return( (IIntNetMinorVersion)getRec() );
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return( orig.getPKey() );
	}

	@Override
	public void setPKey( $implCommaIJavaOptAtomType$ value ) {
		orig.setPKey( value );
		copyPKeyToRec();
	}

	@Override
	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	@Override
	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	@Override
	public ICFKeyHash256 getRequiredId() {
		return( getPKey() );
	}

	@Override
	public void setRequiredId(ICFKeyHash256 value) {
		if (getPKey() != value) {
			setPKey(value);
		}
	}

	@Override
	public ICFKeyHash256 getRequiredTenantId() {
		return( getMinorVersionRec().getRequiredTenantId() );
	}

	@Override
	public ICFKeyHash256 getRequiredMajorVersionId() {
		return( getMinorVersionRec().getRequiredMajorVersionId() );
	}

	@Override
	public String getRequiredName() {
		return( getMinorVersionRec().getRequiredName() );
	}

	@Override
	public void setRequiredName( String value ) {
		if( getMinorVersionRec().getRequiredName() != value ) {
			getMinorVersionRec().setRequiredName( value );
		}
	}

	@Override
	public String getOptionalDescription() {
		return( getMinorVersionRec().getOptionalDescription() );
	}

	@Override
	public void setOptionalDescription( String value ) {
		if( getMinorVersionRec().getOptionalDescription() != value ) {
			getMinorVersionRec().setOptionalDescription( value );
		}
	}

	@Override
	public ISecureTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	@Override
	public ISecureTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ISecureTenantObj obj = ((IIntNetSchemaObj)getOrigAsMinorVersion().getSchema()).getTenantTableObj().readTenantByIdIdx( getMinorVersionRec().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	@Override
	public void setRequiredOwnerTenant( ISecureTenantObj value ) {
		if( rec == null ) {
			getMinorVersionRec();
		}
		if( value != null ) {
			requiredOwnerTenant = value;
			getMinorVersionRec().setRequiredOwnerTenant(value.getTenantRec());
		}
		requiredOwnerTenant = value;
	}

	@Override
	public IIntNetMajorVersionObj getRequiredContainerParentMajVer() {
		return( getRequiredContainerParentMajVer( false ) );
	}

	@Override
	public IIntNetMajorVersionObj getRequiredContainerParentMajVer( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentMajVer == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IIntNetMajorVersionObj obj = ((IIntNetSchemaObj)getOrigAsMinorVersion().getSchema()).getMajorVersionTableObj().readMajorVersionByIdIdx( getMinorVersionRec().getRequiredMajorVersionId() );
				requiredContainerParentMajVer = obj;
				if( obj != null ) {
					requiredContainerParentMajVer = obj;
				}
			}
		}
		return( requiredContainerParentMajVer );
	}

	@Override
	public void setRequiredContainerParentMajVer( IIntNetMajorVersionObj value ) {
		if( rec == null ) {
			getMinorVersionRec();
		}
		if( value != null ) {
			requiredContainerParentMajVer = value;
			getMinorVersionRec().setRequiredContainerParentMajVer(value.getMajorVersionRec());
		}
		requiredContainerParentMajVer = value;
	}

	@Override
	public void copyPKeyToRec() {
		if( rec != null ) {
			if (getPKey() != rec.getPKey()) {
				rec.setPKey(getPKey());
			}
		}
	}

	@Override
	public void copyRecToPKey() {
		if( rec != null ) {
			if (getPKey() != rec.getPKey()) {
				setPKey(rec.getPKey());
			}
		}
	}

	@Override
	public void copyRecToOrig() {
		IIntNetMinorVersion origRec = getOrigAsMinorVersion().getMinorVersionRec();
		IIntNetMinorVersion myRec = getMinorVersionRec();
		origRec.set( myRec );
	}

	@Override
	public void copyOrigToRec() {
		IIntNetMinorVersion origRec = getOrigAsMinorVersion().getMinorVersionRec();
		IIntNetMinorVersion myRec = getMinorVersionRec();
		myRec.set( origRec );
	}
}
