// Description: Java 11 base object instance implementation for YCFBam RelationCol.

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

public class YCFBamRelationColObj
	implements IYCFBamRelationColObj
{
	public final static String CLASS_CODE = "a839";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFBamRelationColEditObj edit;
	protected IYCFBamSchemaObj schema;
	protected YCFBamRelationColPKey pKey;
	protected YCFBamRelationColBuff buff;
	protected IYCFBamRelationObj requiredContainerRelation;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamRelationColObj optionalLookupPrev;
	protected IYCFBamRelationColObj optionalLookupNext;
	protected IYCFBamIndexColObj requiredLookupFromCol;
	protected IYCFBamIndexColObj requiredLookupToCol;

	public YCFBamRelationColObj() {
		isNew = true;
		requiredContainerRelation = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupFromCol = null;
		requiredLookupToCol = null;
	}

	public YCFBamRelationColObj( IYCFBamSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerRelation = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupFromCol = null;
		requiredLookupToCol = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RelationCol" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamRelationObj scope = getRequiredContainerRelation();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamRelationObj scope = getRequiredContainerRelation();
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

	public IYCFBamRelationColObj realise() {
		IYCFBamRelationColObj retobj = ((IYCFBamSchemaObj)schema).getRelationColTableObj().realiseRelationCol(
			(IYCFBamRelationColObj)this );
		return( (IYCFBamRelationColObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getRelationColTableObj().reallyDeepDisposeRelationCol( (IYCFBamRelationColObj)this );
	}

	public IYCFBamRelationColObj read() {
		IYCFBamRelationColObj retobj = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamRelationColObj)retobj );
	}

	public IYCFBamRelationColObj read( boolean forceRead ) {
		IYCFBamRelationColObj retobj = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamRelationColObj)retobj );
	}

	public IYCFBamRelationColObj moveUp() {
		IYCFBamRelationColObj retobj = ((IYCFBamSchemaObj)schema).getRelationColTableObj().moveUpRelationCol( this );
		return( (IYCFBamRelationColObj)retobj );
	}

	public IYCFBamRelationColObj moveDown() {
		IYCFBamRelationColObj retobj = ((IYCFBamSchemaObj)schema).getRelationColTableObj().moveDownRelationCol( this );
		return( (IYCFBamRelationColObj)retobj );
	}

	public IYCFBamRelationColTableObj getRelationColTable() {
		return( ((IYCFBamSchemaObj)schema).getRelationColTableObj() );
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = value;
	}

	public YCFBamRelationColBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelationCol().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamRelationColBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamRelationColBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamRelationColBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerRelation = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupFromCol = null;
		requiredLookupToCol = null;
	}

	public YCFBamRelationColBuff getRelationColBuff() {
		return( (YCFBamRelationColBuff)getBuff() );
	}

	public YCFBamRelationColPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelationCol().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFBamRelationColPKey value ) {
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

	public IYCFBamRelationColEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamRelationColObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamRelationColObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getRelationColTableObj().lockRelationCol( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getRelationColTableObj().newEditInstance( lockobj );
		return( (IYCFBamRelationColEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFBamRelationColEditObj getEdit() {
		return( edit );
	}

	public IYCFBamRelationColEditObj getEditAsRelationCol() {
		return( (IYCFBamRelationColEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamRelationColBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamRelationColBuff buff = getBuff();
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

	public long getRequiredRelationId() {
		return( getRelationColBuff().getRequiredRelationId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getRelationColBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getRelationColBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getRelationColBuff().getRequiredName() );
	}

	public String getOptionalShortName() {
		return( getRelationColBuff().getOptionalShortName() );
	}

	public String getOptionalLabel() {
		return( getRelationColBuff().getOptionalLabel() );
	}

	public String getOptionalShortDescription() {
		return( getRelationColBuff().getOptionalShortDescription() );
	}

	public String getOptionalDescription() {
		return( getRelationColBuff().getOptionalDescription() );
	}

	public long getRequiredFromColId() {
		return( getRelationColBuff().getRequiredFromColId() );
	}

	public long getRequiredToColId() {
		return( getRelationColBuff().getRequiredToColId() );
	}

	public Long getOptionalPrevTenantId() {
		return( getRelationColBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getRelationColBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getRelationColBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getRelationColBuff().getOptionalNextId() );
	}

	public IYCFBamRelationObj getRequiredContainerRelation() {
		return( getRequiredContainerRelation( false ) );
	}

	public IYCFBamRelationObj getRequiredContainerRelation( boolean forceRead ) {
		if( ( requiredContainerRelation == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerRelation = ((IYCFBamSchemaObj)schema).getRelationTableObj().readRelationByIdIdx( getPKey().getRequiredTenantId(),
					getRelationColBuff().getRequiredRelationId(), forceRead );
			}
		}
		return( requiredContainerRelation );
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

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getRelationColBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationColBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getRelationColBuff().getOptionalDefSchemaTenantId(),
					getRelationColBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public IYCFBamRelationColObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamRelationColObj getOptionalLookupPrev( boolean forceRead ) {
		if( ( optionalLookupPrev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getRelationColBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationColBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrev = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByIdIdx( getRelationColBuff().getOptionalPrevTenantId(),
					getRelationColBuff().getOptionalPrevId(), forceRead );
			}
		}
		return( optionalLookupPrev );
	}

	public IYCFBamRelationColObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamRelationColObj getOptionalLookupNext( boolean forceRead ) {
		if( ( optionalLookupNext == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getRelationColBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationColBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNext = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByIdIdx( getRelationColBuff().getOptionalNextTenantId(),
					getRelationColBuff().getOptionalNextId(), forceRead );
			}
		}
		return( optionalLookupNext );
	}

	public IYCFBamIndexColObj getRequiredLookupFromCol() {
		return( getRequiredLookupFromCol( false ) );
	}

	public IYCFBamIndexColObj getRequiredLookupFromCol( boolean forceRead ) {
		if( ( requiredLookupFromCol == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredLookupFromCol = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByIdIdx( getPKey().getRequiredTenantId(),
					getRelationColBuff().getRequiredFromColId(), forceRead );
			}
		}
		return( requiredLookupFromCol );
	}

	public IYCFBamIndexColObj getRequiredLookupToCol() {
		return( getRequiredLookupToCol( false ) );
	}

	public IYCFBamIndexColObj getRequiredLookupToCol( boolean forceRead ) {
		if( ( requiredLookupToCol == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredLookupToCol = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByIdIdx( getPKey().getRequiredTenantId(),
					getRelationColBuff().getRequiredToColId(), forceRead );
			}
		}
		return( requiredLookupToCol );
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
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj)( curDef ) ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj)( curDef ) ) );
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
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj)( curDef ) ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj)( curDef ) ) );
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
