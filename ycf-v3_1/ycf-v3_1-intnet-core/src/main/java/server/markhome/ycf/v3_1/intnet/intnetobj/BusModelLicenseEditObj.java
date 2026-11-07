// Description: Java 25 edit object instance implementation for BusModel License.

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public class BusModelLicenseEditObj
	implements IBusModelLicenseEditObj
{
	protected IIntNetLicenseObj orig;
	protected IIntNetLicense rec;
	protected ISecureTenantObj requiredOwnerTenant;
	protected IIntNetTopDomainObj requiredContainerTopDomain;

	public BusModelLicenseEditObj( IIntNetLicenseObj argOrig ) {
		orig = argOrig;
		getRec();
		IIntNetLicense origRec = orig.getRec();
		rec.set( origRec );
		requiredOwnerTenant = null;
		requiredContainerTopDomain = null;
	}

	@Override
	public int getClassCode() {
		return( ((IIntNetSchemaObj)orig.getSchema()).getLicenseTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "License" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		IIntNetTopDomainObj scope = getRequiredContainerTopDomain();
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
				if( container instanceof IBusModelClusterObj ) {
					break;
				}
				else if( container instanceof IBusModelTenantObj ) {
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
				if( container instanceof IBusModelClusterObj ) {
					break;
				}
				else if( container instanceof IBusModelTenantObj ) {
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
	public IIntNetLicenseObj realise() {
		// We realise this so that it's record will get copied to orig during realization
		IIntNetLicenseObj retobj = getSchema().getLicenseTableObj().realiseLicense( (IBusModelLicenseObj)this );
		return( retobj );
	}

	@Override
	public void forget() {
		getOrigAsLicense().forget();
	}

	@Override
	public IIntNetLicenseObj read() {
		IIntNetLicenseObj retval = getOrigAsLicense().read();
		if( retval != orig ) {
			throw new CFStaleCacheDetectedException( getClass(),	"read" );
		}
		copyOrigToRec();
		return( retval );
	}

	@Override
	public IIntNetLicenseObj read( boolean forceRead ) {
		IIntNetLicenseObj retval = getOrigAsLicense().read( forceRead );
		if( retval != orig ) {
			throw new CFStaleCacheDetectedException( getClass(),	"read" );
		}
		copyOrigToRec();
		return( retval );
	}

	@Override
	public IIntNetLicenseObj create() {
		copyRecToOrig();
		IIntNetLicenseObj retobj = ((IBusModelSchemaObj)getOrigAsLicense().getSchema()).getLicenseTableObj().createLicense( getOrigAsLicense() );
		if( retobj == getOrigAsLicense() ) {
			copyOrigToRec();
		}
		return( retobj );
	}

	@Override
	public IntNetLicenseEditObj update() {
		getSchema().getLicenseTableObj().updateLicense( (IIntNetLicenseObj)this );
		return( null );
	}

	@Override
	public IntNetLicenseEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFCannotDeleteNewInstanceException( getClass(), "delete" );
		}
		getSchema().getLicenseTableObj().deleteLicense( getOrigAsLicense() );
		return( null );
	}

	@Override
	public IIntNetLicenseTableObj getLicenseTable() {
		return( orig.getSchema().getLicenseTableObj() );
	}

	@Override
	public IIntNetLicenseEditObj getEdit() {
		return( (IIntNetLicenseEditObj)this );
	}

	@Override
	public IIntNetLicenseEditObj getEditAsLicense() {
		return( (IIntNetLicenseEditObj)this );
	}

	@Override
	public IIntNetLicenseEditObj beginEdit() {
		throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
	}

	@Override
	public void endEdit() {
		orig.endEdit();
	}

	@Override
	public IIntNetLicenseObj getOrig() {
		return( orig );
	}

	@Override
	public IIntNetLicenseObj getOrigAsLicense() {
		return( (IIntNetLicenseObj)orig );
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
	public IIntNetLicense getRec() {
		if( rec == null ) {
			rec = getOrigAsLicense().getSchema().getIntNetBackingStore().getIntNetFactory().getFactoryLicense().newRec();
			rec.set( orig.getRec() );
		}
		return( rec );
	}

	@Override
	public void setRec( IIntNetLicense value ) {
		if( rec != value ) {
			rec = value;
			requiredOwnerTenant = null;
			requiredContainerTopDomain = null;
		}
	}

	@Override
	public IIntNetLicense getLicenseRec() {
		return( (IIntNetLicense)getRec() );
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
		return( getLicenseRec().getRequiredTenantId() );
	}

	@Override
	public ICFKeyHash256 getRequiredTopDomainId() {
		return( getLicenseRec().getRequiredTopDomainId() );
	}

	@Override
	public String getRequiredName() {
		return( getLicenseRec().getRequiredName() );
	}

	@Override
	public void setRequiredName( String value ) {
		if( getLicenseRec().getRequiredName() != value ) {
			getLicenseRec().setRequiredName( value );
		}
	}

	@Override
	public String getOptionalDescription() {
		return( getLicenseRec().getOptionalDescription() );
	}

	@Override
	public void setOptionalDescription( String value ) {
		if( getLicenseRec().getOptionalDescription() != value ) {
			getLicenseRec().setOptionalDescription( value );
		}
	}

	@Override
	public String getOptionalEmbeddedText() {
		return( getLicenseRec().getOptionalEmbeddedText() );
	}

	@Override
	public void setOptionalEmbeddedText( String value ) {
		if( getLicenseRec().getOptionalEmbeddedText() != value ) {
			getLicenseRec().setOptionalEmbeddedText( value );
		}
	}

	@Override
	public String getOptionalFullText() {
		return( getLicenseRec().getOptionalFullText() );
	}

	@Override
	public void setOptionalFullText( String value ) {
		if( getLicenseRec().getOptionalFullText() != value ) {
			getLicenseRec().setOptionalFullText( value );
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
				ISecureTenantObj obj = ((IBusModelSchemaObj)getOrigAsLicense().getSchema()).getTenantTableObj().readTenantByIdIdx( getLicenseRec().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	@Override
	public void setRequiredOwnerTenant( ISecureTenantObj value ) {
		if( rec == null ) {
			getLicenseRec();
		}
		if( value != null ) {
			requiredOwnerTenant = value;
			getLicenseRec().setRequiredOwnerTenant(value.getTenantRec());
		}
		requiredOwnerTenant = value;
	}

	@Override
	public IIntNetTopDomainObj getRequiredContainerTopDomain() {
		return( getRequiredContainerTopDomain( false ) );
	}

	@Override
	public IIntNetTopDomainObj getRequiredContainerTopDomain( boolean forceRead ) {
		if( forceRead || ( requiredContainerTopDomain == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IIntNetTopDomainObj obj = ((IBusModelSchemaObj)getOrigAsLicense().getSchema()).getTopDomainTableObj().readTopDomainByIdIdx( getLicenseRec().getRequiredTopDomainId() );
				requiredContainerTopDomain = obj;
				if( obj != null ) {
					requiredContainerTopDomain = obj;
				}
			}
		}
		return( requiredContainerTopDomain );
	}

	@Override
	public void setRequiredContainerTopDomain( IIntNetTopDomainObj value ) {
		if( rec == null ) {
			getLicenseRec();
		}
		if( value != null ) {
			requiredContainerTopDomain = value;
			getLicenseRec().setRequiredContainerTopDomain(value.getTopDomainRec());
		}
		requiredContainerTopDomain = value;
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
		IIntNetLicense origRec = getOrigAsLicense().getLicenseRec();
		IIntNetLicense myRec = getLicenseRec();
		origRec.set( myRec );
	}

	@Override
	public void copyOrigToRec() {
		IIntNetLicense origRec = getOrigAsLicense().getLicenseRec();
		IIntNetLicense myRec = getLicenseRec();
		myRec.set( origRec );
	}
}
