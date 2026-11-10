// Description: Java 11 edit object instance implementation for YCFBam Chain.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
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

public class YCFBamChainEditObj
	implements IYCFBamChainEditObj
{
	protected IYCFBamChainObj orig;
	protected YCFBamChainBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamTableObj requiredContainerTable;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamRelationObj requiredLookupPrevRel;
	protected IYCFBamRelationObj requiredLookupNextRel;

	public YCFBamChainEditObj( IYCFBamChainObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFBamChainBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerTable = null;
		optionalLookupDefSchema = null;
		requiredLookupPrevRel = null;
		requiredLookupNextRel = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamChainBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamChainBuff buff = getBuff();
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
		return( YCFBamChainObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Chain" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamTableObj scope = getRequiredContainerTable();
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
			else if( container instanceof IYCFBamSchemaDefObj ) {
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

	public IYCFBamChainObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamChainObj retobj = getSchema().getChainTableObj().realiseChain( (IYCFBamChainObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsChain().forget();
	}

	public IYCFBamChainObj read() {
		IYCFBamChainObj retval = getOrigAsChain().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamChainObj read( boolean forceRead ) {
		IYCFBamChainObj retval = getOrigAsChain().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamChainObj create() {
		copyBuffToOrig();
		IYCFBamChainObj retobj = ((IYCFBamSchemaObj)getOrigAsChain().getSchema()).getChainTableObj().createChain( getOrigAsChain() );
		if( retobj == getOrigAsChain() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamChainEditObj update() {
		getSchema().getChainTableObj().updateChain( (IYCFBamChainObj)this );
		return( null );
	}

	public YCFBamChainEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getChainTableObj().deleteChain( getOrigAsChain() );
		return( null );
	}

	public IYCFBamChainTableObj getChainTable() {
		return( orig.getSchema().getChainTableObj() );
	}

	public IYCFBamChainEditObj getEdit() {
		return( (IYCFBamChainEditObj)this );
	}

	public IYCFBamChainEditObj getEditAsChain() {
		return( (IYCFBamChainEditObj)this );
	}

	public IYCFBamChainEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFBamChainObj getOrig() {
		return( orig );
	}

	public IYCFBamChainObj getOrigAsChain() {
		return( (IYCFBamChainObj)orig );
	}

	public IYCFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFBamChainBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsChain().getSchema().getBackingStore()).getFactoryChain().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamChainBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerTable = null;
			optionalLookupDefSchema = null;
			requiredLookupPrevRel = null;
			requiredLookupNextRel = null;
		}
	}

	public YCFBamChainBuff getChainBuff() {
		return( (YCFBamChainBuff)getBuff() );
	}

	public YCFBamChainPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFBamChainPKey value ) {
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

	public Long getOptionalDefSchemaTenantId() {
		return( getChainBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getChainBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getChainBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getChainBuff().getRequiredName() != value ) {
			getChainBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortName() {
		return( getChainBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getChainBuff().getOptionalShortName() != value ) {
			getChainBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getChainBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getChainBuff().getOptionalLabel() != value ) {
			getChainBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getChainBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getChainBuff().getOptionalShortDescription() != value ) {
			getChainBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getChainBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getChainBuff().getOptionalDescription() != value ) {
			getChainBuff().setOptionalDescription( value );
		}
	}

	public long getRequiredTableId() {
		return( getChainBuff().getRequiredTableId() );
	}

	public String getOptionalSuffix() {
		return( getChainBuff().getOptionalSuffix() );
	}

	public void setOptionalSuffix( String value ) {
		if( getChainBuff().getOptionalSuffix() != value ) {
			getChainBuff().setOptionalSuffix( value );
		}
	}

	public long getRequiredPrevRelationTenantId() {
		return( getChainBuff().getRequiredPrevRelationTenantId() );
	}

	public long getRequiredPrevRelationId() {
		return( getChainBuff().getRequiredPrevRelationId() );
	}

	public long getRequiredNextRelationTenantId() {
		return( getChainBuff().getRequiredNextRelationTenantId() );
	}

	public long getRequiredNextRelationId() {
		return( getChainBuff().getRequiredNextRelationId() );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsChain().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getChainBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getChainBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsChain().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getChainBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getChainBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getChainBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( IYCFBamTableObj value ) {
			if( buff == null ) {
				getChainBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getChainBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getChainBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getChainBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getChainBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsChain().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getChainBuff().getOptionalDefSchemaTenantId(),
					getChainBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getChainBuff();
			}
			if( value != null ) {
				getChainBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getChainBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getChainBuff().setOptionalDefSchemaTenantId( null );
				getChainBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public IYCFBamRelationObj getRequiredLookupPrevRel() {
		return( getRequiredLookupPrevRel( false ) );
	}

	public IYCFBamRelationObj getRequiredLookupPrevRel( boolean forceRead ) {
		if( forceRead || ( requiredLookupPrevRel == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamRelationObj obj = ((IYCFBamSchemaObj)getOrigAsChain().getSchema()).getRelationTableObj().readRelationByIdIdx( getChainBuff().getRequiredPrevRelationTenantId(),
					getChainBuff().getRequiredPrevRelationId() );
				requiredLookupPrevRel = obj;
			}
		}
		return( requiredLookupPrevRel );
	}

	public void setRequiredLookupPrevRel( IYCFBamRelationObj value ) {
			if( buff == null ) {
				getChainBuff();
			}
			if( value != null ) {
				getChainBuff().setRequiredPrevRelationTenantId( value.getRequiredTenantId() );
				getChainBuff().setRequiredPrevRelationId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupPrevRel = value;
	}

	public IYCFBamRelationObj getRequiredLookupNextRel() {
		return( getRequiredLookupNextRel( false ) );
	}

	public IYCFBamRelationObj getRequiredLookupNextRel( boolean forceRead ) {
		if( forceRead || ( requiredLookupNextRel == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamRelationObj obj = ((IYCFBamSchemaObj)getOrigAsChain().getSchema()).getRelationTableObj().readRelationByIdIdx( getChainBuff().getRequiredNextRelationTenantId(),
					getChainBuff().getRequiredNextRelationId() );
				requiredLookupNextRel = obj;
			}
		}
		return( requiredLookupNextRel );
	}

	public void setRequiredLookupNextRel( IYCFBamRelationObj value ) {
			if( buff == null ) {
				getChainBuff();
			}
			if( value != null ) {
				getChainBuff().setRequiredNextRelationTenantId( value.getRequiredTenantId() );
				getChainBuff().setRequiredNextRelationId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupNextRel = value;
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
		YCFBamChainBuff origBuff = getOrigAsChain().getChainBuff();
		YCFBamChainBuff myBuff = getChainBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamChainBuff origBuff = getOrigAsChain().getChainBuff();
		YCFBamChainBuff myBuff = getChainBuff();
		myBuff.set( origBuff );
	}

	public IYCFBamSubProjectObj getProject() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamSubProjectObj ) {
				return ((IYCFBamSubProjectObj)curDef);
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	public IYCFBamTopDomainObj getCompany() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamTopDomainObj ) {
				return ((IYCFBamTopDomainObj)curDef);
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	public IYCFBamSchemaDefObj getSchemaDef() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamSchemaDefObj ) {
				return ((IYCFBamSchemaDefObj)curDef);
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	public IYCFBamMinorVersionObj getVersion() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamMinorVersionObj ) {
				return ((IYCFBamMinorVersionObj)curDef);
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamSubProjectObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamTopProjectObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamTopDomainObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	protected String getVersionStringForVersion( IYCFLibAnyObj value ) {
		String ret;
		if( value instanceof IYCFBamMinorVersionObj ) {
			ret = ((IYCFBamMinorVersionObj)value).getRequiredName();
		}
		else if( value instanceof IYCFBamMajorVersionObj ) {
			ret = ((IYCFBamMajorVersionObj)value).getRequiredName();
		}
		else {
			ret = null;
		}
		return( ret );
	}

	public String getVersionString() {
		IYCFLibAnyObj scopeDef;
		IYCFLibAnyObj curDef = getVersion();
		List<String> invertedNodeNames = new ArrayList<String>();
		while (curDef != null) {
			if( curDef instanceof IYCFBamMinorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj) curDef ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj) curDef ) );
			}
			scopeDef = curDef.getObjScope();
			if( scopeDef == null) {
				curDef = null;
			}
			else if( scopeDef instanceof IYCFBamMinorVersionObj ) {
				curDef = scopeDef;
			}
			else if( scopeDef instanceof IYCFBamMajorVersionObj ) {
				curDef = scopeDef;
			}
			else {
				curDef = null;
			}
		}
		String ret = "";
		for( int idx = invertedNodeNames.size() - 1; idx >= 0; idx-- )
		{
			if( ret.length() == 0) {
				ret = invertedNodeNames.get(idx);
			}
			else {
				ret = ret + "-" + invertedNodeNames.get(idx);
			}
		}
		return( ret );
	}

	public String getPackedVersionString() {
		IYCFLibAnyObj scopeDef;
		IYCFLibAnyObj curDef = getVersion();
		List<String> invertedNodeNames = new ArrayList<String>();
		while (curDef != null) {
			if( curDef instanceof IYCFBamMinorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj) curDef ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj) curDef ) );
			}
			scopeDef = curDef.getObjScope();
			if( scopeDef == null) {
				curDef = null;
			}
			else if( scopeDef instanceof IYCFBamMinorVersionObj ) {
				curDef = scopeDef;
			}
			else if( scopeDef instanceof IYCFBamMajorVersionObj ) {
				curDef = scopeDef;
			}
			else {
				curDef = null;
			}
		}
		String ret = "";
		for( int idx = invertedNodeNames.size() - 1; idx >= 0; idx-- )
		{
			if( ret.length() == 0) {
				ret = invertedNodeNames.get(idx);
			}
			else {
				ret = ret + invertedNodeNames.get(idx);
			}
		}
		return( ret );
	}

	public Boolean isColumnInOwnerRelation() {

		IYCFLibAnyObj		focusDef;
		IYCFBamTableObj		tableDef;
		final String S_ProcName = "isColumnInOwnerRelation() ";

		if( this instanceof IYCFBamAtomObj ) {
			IYCFBamAtomObj atomDef = (IYCFBamAtomObj)this;
			IYCFLibAnyObj atomScopeDef = atomDef.getObjScope();
			tableDef = (IYCFBamTableObj)atomScopeDef;
			focusDef = this;
		}
		else if( this instanceof IYCFBamTableColObj ) {
			IYCFBamTableColObj tableColDef = (IYCFBamTableColObj)this;
			IYCFLibAnyObj tableColScopeDef = tableColDef.getObjScope();
			tableDef = (IYCFBamTableObj)tableColScopeDef;
			focusDef = this;
		}
		else if( this instanceof IYCFBamIndexColObj ) {
			IYCFBamIndexColObj indexColDef = (IYCFBamIndexColObj)this;
			focusDef = indexColDef.getRequiredLookupColumn();
			if( focusDef instanceof IYCFBamAtomObj ) {
				tableDef = (IYCFBamTableObj)((IYCFBamAtomObj)focusDef).getObjScope();
			}
			else if( focusDef instanceof IYCFBamTableColObj ) {
				tableDef = (IYCFBamTableObj)((IYCFBamTableColObj)focusDef).getObjScope();
			}
			else {
				throw new RuntimeException(
					S_ProcName + "genContext.getGenDef().getColumnDef() for a IYCFBamIndexColObj did not return a IYCFBamAtomObj"
						+	" nor a IYCFBamTableColObj" );
			}
		}
		else if( this instanceof IYCFBamRelationColObj ) {
			IYCFBamRelationColObj relColDef = (IYCFBamRelationColObj)this;
			IYCFLibAnyObj columnDef = relColDef.getRequiredLookupFromCol();
			if( columnDef instanceof IYCFBamAtomObj ) {
				focusDef = columnDef;
				tableDef = (IYCFBamTableObj)columnDef.getObjScope();
			}
			else if( columnDef instanceof IYCFBamTableColObj ) {
				focusDef = columnDef;
				tableDef = (IYCFBamTableObj)columnDef.getObjScope();
			}
			else {
				throw new RuntimeException(
					S_ProcName + "genContext.getGenDef().getFromColumnDef() for a IYCFBamIndexColObj did not return a IYCFBamAtomObj"
						+	" nor a IYCFBamTableColObj" );
			}
		}
		else {
			throw new RuntimeException(
				S_ProcName + "genContext.getGenDef() did not return a IYCFBamAtomObj, IYCFBamTableColObj, nor IYCFBamIndexColObj instance" );
		}

		List<IYCFBamRelationObj> ownerRelations = tableDef.getContainerOwnerRelations();
		if( ( ownerRelations == null )
		 || ( ( ownerRelations != null ) && ( ownerRelations.size() == 0 ) ) )
		{
			return( false );
		}

		ListIterator<IYCFBamRelationObj> ownerEnumerator = ownerRelations.listIterator();

		IYCFBamRelationObj ownerRelation;
		IYCFBamRelationColObj ownerRelationCol;
		Iterator<IYCFBamRelationColObj> ownerRelationCols;

		while( ownerEnumerator.hasNext() ) {

			ownerRelation = ownerEnumerator.next();
			ownerRelationCols = ownerRelation.getOptionalComponentsColumns().iterator();

			while( ownerRelationCols.hasNext() ) {
				ownerRelationCol = ownerRelationCols.next();
				if( ownerRelationCol.getRequiredLookupFromCol() == focusDef ) {
					return( true );
				}
			}
		}

		return( false );
	}
}
