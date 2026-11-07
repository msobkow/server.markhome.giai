// Description: Java 25 edit object instance implementation for BusModel SecClusGrp.

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public class BusModelSecClusGrpEditObj
	implements IBusModelSecClusGrpEditObj
{
	protected ISecureSecClusGrpObj orig;
	protected ISecureSecClusGrp rec;
	protected ISecureSecUserObj createdBy = null;
	protected ISecureSecUserObj updatedBy = null;
	protected ISecureClusterObj requiredOwnerCluster;
	protected ISecureSecSysGrpObj requiredContainerSysGrp;
	protected List<ISecureSecClusGrpMembObj> optionalChildrenMembByGrp;

	public BusModelSecClusGrpEditObj( ISecureSecClusGrpObj argOrig ) {
		orig = argOrig;
		getRec();
		ISecureSecClusGrp origRec = orig.getRec();
		rec.set( origRec );
		requiredOwnerCluster = null;
		requiredContainerSysGrp = null;
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			ISecureSecClusGrp rec = getRec();
			createdBy = ((IBusModelSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getCreatedByUserId() );
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
			ISecureSecClusGrp rec = getRec();
			updatedBy = ((IBusModelSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
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
		return( ((ISecureSchemaObj)orig.getSchema()).getSecClusGrpTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "SecClusGrp" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		ISecureSecSysGrpObj scope = getRequiredContainerSysGrp();
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
	public ISecureSecClusGrpObj realise() {
		// We realise this so that it's record will get copied to orig during realization
		ISecureSecClusGrpObj retobj = getSchema().getSecClusGrpTableObj().realiseSecClusGrp( (IBusModelSecClusGrpObj)this );
		return( retobj );
	}

	@Override
	public void forget() {
		getOrigAsSecClusGrp().forget();
	}

	@Override
	public ISecureSecClusGrpObj read() {
		ISecureSecClusGrpObj retval = getOrigAsSecClusGrp().read();
		if( retval != orig ) {
			throw new CFStaleCacheDetectedException( getClass(),	"read" );
		}
		copyOrigToRec();
		return( retval );
	}

	@Override
	public ISecureSecClusGrpObj read( boolean forceRead ) {
		ISecureSecClusGrpObj retval = getOrigAsSecClusGrp().read( forceRead );
		if( retval != orig ) {
			throw new CFStaleCacheDetectedException( getClass(),	"read" );
		}
		copyOrigToRec();
		return( retval );
	}

	@Override
	public ISecureSecClusGrpObj create() {
		copyRecToOrig();
		ISecureSecClusGrpObj retobj = ((IBusModelSchemaObj)getOrigAsSecClusGrp().getSchema()).getSecClusGrpTableObj().createSecClusGrp( getOrigAsSecClusGrp() );
		if( retobj == getOrigAsSecClusGrp() ) {
			copyOrigToRec();
		}
		return( retobj );
	}

	@Override
	public SecureSecClusGrpEditObj update() {
		getSchema().getSecClusGrpTableObj().updateSecClusGrp( (ISecureSecClusGrpObj)this );
		return( null );
	}

	@Override
	public SecureSecClusGrpEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFCannotDeleteNewInstanceException( getClass(), "delete" );
		}
		getSchema().getSecClusGrpTableObj().deleteSecClusGrp( getOrigAsSecClusGrp() );
		return( null );
	}

	@Override
	public ISecureSecClusGrpTableObj getSecClusGrpTable() {
		return( orig.getSchema().getSecClusGrpTableObj() );
	}

	@Override
	public ISecureSecClusGrpEditObj getEdit() {
		return( (ISecureSecClusGrpEditObj)this );
	}

	@Override
	public ISecureSecClusGrpEditObj getEditAsSecClusGrp() {
		return( (ISecureSecClusGrpEditObj)this );
	}

	@Override
	public ISecureSecClusGrpEditObj beginEdit() {
		throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
	}

	@Override
	public void endEdit() {
		orig.endEdit();
	}

	@Override
	public ISecureSecClusGrpObj getOrig() {
		return( orig );
	}

	@Override
	public ISecureSecClusGrpObj getOrigAsSecClusGrp() {
		return( (ISecureSecClusGrpObj)orig );
	}

	@Override
	public ISecureSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	@Override
	public void setSchema( ISecureSchemaObj value ) {
		orig.setSchema(value);
	}

	@Override
	public ISecureSecClusGrp getRec() {
		if( rec == null ) {
			rec = getOrigAsSecClusGrp().getSchema().getSecureBackingStore().getSecureFactory().getFactorySecClusGrp().newRec();
			rec.set( orig.getRec() );
		}
		return( rec );
	}

	@Override
	public void setRec( ISecureSecClusGrp value ) {
		if( rec != value ) {
			rec = value;
			requiredOwnerCluster = null;
			requiredContainerSysGrp = null;
		}
	}

	@Override
	public ISecureSecClusGrp getSecClusGrpRec() {
		return( (ISecureSecClusGrp)getRec() );
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
	public ICFKeyHash256 getRequiredSecClusGrpId() {
		return( getPKey() );
	}

	@Override
	public void setRequiredSecClusGrpId(ICFKeyHash256 value) {
		if (getPKey() != value) {
			setPKey(value);
			requiredOwnerCluster = null;
			requiredContainerSysGrp = null;
			optionalChildrenMembByGrp = null;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredClusterId() {
		return( getSecClusGrpRec().getRequiredClusterId() );
	}

	@Override
	public String getRequiredName() {
		return( getSecClusGrpRec().getRequiredName() );
	}

	@Override
	public ISecureClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	@Override
	public ISecureClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ISecureClusterObj obj = ((IBusModelSchemaObj)getOrigAsSecClusGrp().getSchema()).getClusterTableObj().readClusterByIdIdx( getSecClusGrpRec().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	@Override
	public void setRequiredOwnerCluster( ISecureClusterObj value ) {
		if( rec == null ) {
			getSecClusGrpRec();
		}
		if( value != null ) {
			requiredOwnerCluster = value;
			getSecClusGrpRec().setRequiredOwnerCluster(value.getClusterRec());
		}
		requiredOwnerCluster = value;
	}

	@Override
	public ISecureSecSysGrpObj getRequiredContainerSysGrp() {
		return( getRequiredContainerSysGrp( false ) );
	}

	@Override
	public ISecureSecSysGrpObj getRequiredContainerSysGrp( boolean forceRead ) {
		if( forceRead || ( requiredContainerSysGrp == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ISecureSecSysGrpObj obj = ((IBusModelSchemaObj)getOrigAsSecClusGrp().getSchema()).getSecSysGrpTableObj().readSecSysGrpByUNameIdx( getSecClusGrpRec().getRequiredName() );
				requiredContainerSysGrp = obj;
				if( obj != null ) {
					requiredContainerSysGrp = obj;
				}
			}
		}
		return( requiredContainerSysGrp );
	}

	@Override
	public void setRequiredContainerSysGrp( ISecureSecSysGrpObj value ) {
		if( rec == null ) {
			getSecClusGrpRec();
		}
		if( value != null ) {
			requiredContainerSysGrp = value;
			getSecClusGrpRec().setRequiredContainerSysGrp(value.getSecSysGrpRec());
		}
		requiredContainerSysGrp = value;
	}

	@Override
	public List<ISecureSecClusGrpMembObj> getOptionalChildrenMembByGrp() {
		List<ISecureSecClusGrpMembObj> retval;
		retval = ((IBusModelSchemaObj)getSchema()).getSecClusGrpMembTableObj().readSecClusGrpMembByClusGrpIdx( getPKey(),
			false );
		return( retval );
	}

	@Override
	public List<ISecureSecClusGrpMembObj> getOptionalChildrenMembByGrp( boolean forceRead ) {
		List<ISecureSecClusGrpMembObj> retval;
		retval = ((IBusModelSchemaObj)getSchema()).getSecClusGrpMembTableObj().readSecClusGrpMembByClusGrpIdx( getPKey(),
			forceRead );
		return( retval );
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
		ISecureSecClusGrp origRec = getOrigAsSecClusGrp().getSecClusGrpRec();
		ISecureSecClusGrp myRec = getSecClusGrpRec();
		origRec.set( myRec );
	}

	@Override
	public void copyOrigToRec() {
		ISecureSecClusGrp origRec = getOrigAsSecClusGrp().getSecClusGrpRec();
		ISecureSecClusGrp myRec = getSecClusGrpRec();
		myRec.set( origRec );
	}
}
