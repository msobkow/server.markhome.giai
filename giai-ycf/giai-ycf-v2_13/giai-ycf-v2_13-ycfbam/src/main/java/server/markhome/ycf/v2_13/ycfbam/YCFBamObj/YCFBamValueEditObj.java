// Description: Java 11 edit object instance implementation for YCFBam Value.

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

public class YCFBamValueEditObj
	implements IYCFBamValueEditObj
{
	protected IYCFBamValueObj orig;
	protected YCFBamValueBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamScopeObj requiredContainerScope;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamValueObj optionalLookupPrev;
	protected IYCFBamValueObj optionalLookupNext;

	public YCFBamValueEditObj( IYCFBamValueObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFBamValueBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerScope = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamValueBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamValueBuff buff = getBuff();
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
		return( YCFBamValueObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Value" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamScopeObj scope = getRequiredContainerScope();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamScopeObj scope = getRequiredContainerScope();
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

	public IYCFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamValueObj retobj = getSchema().getValueTableObj().realiseValue( (IYCFBamValueObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsValue().forget();
	}

	public IYCFBamValueObj read() {
		IYCFBamValueObj retval = getOrigAsValue().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamValueObj read( boolean forceRead ) {
		IYCFBamValueObj retval = getOrigAsValue().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamValueObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamValueObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamValueObj create() {
		copyBuffToOrig();
		IYCFBamValueObj retobj = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getValueTableObj().createValue( getOrigAsValue() );
		if( retobj == getOrigAsValue() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamValueEditObj update() {
		getSchema().getValueTableObj().updateValue( (IYCFBamValueObj)this );
		return( null );
	}

	public YCFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getValueTableObj().deleteValue( getOrigAsValue() );
		return( null );
	}

	public IYCFBamValueTableObj getValueTable() {
		return( orig.getSchema().getValueTableObj() );
	}

	public IYCFBamValueEditObj getEdit() {
		return( (IYCFBamValueEditObj)this );
	}

	public IYCFBamValueEditObj getEditAsValue() {
		return( (IYCFBamValueEditObj)this );
	}

	public IYCFBamValueEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFBamValueObj getOrig() {
		return( orig );
	}

	public IYCFBamValueObj getOrigAsValue() {
		return( (IYCFBamValueObj)orig );
	}

	public IYCFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsValue().getSchema().getBackingStore()).getFactoryValue().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamValueBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerScope = null;
			optionalLookupDefSchema = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
		}
	}

	public YCFBamValueBuff getValueBuff() {
		return( (YCFBamValueBuff)getBuff() );
	}

	public YCFBamValuePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFBamValuePKey value ) {
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

	public long getRequiredScopeId() {
		return( getValueBuff().getRequiredScopeId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getValueBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getValueBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getValueBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getValueBuff().getRequiredName() != value ) {
			getValueBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortName() {
		return( getValueBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getValueBuff().getOptionalShortName() != value ) {
			getValueBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getValueBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getValueBuff().getOptionalLabel() != value ) {
			getValueBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getValueBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getValueBuff().getOptionalShortDescription() != value ) {
			getValueBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getValueBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getValueBuff().getOptionalDescription() != value ) {
			getValueBuff().setOptionalDescription( value );
		}
	}

	public String getOptionalDefaultXmlValue() {
		return( getValueBuff().getOptionalDefaultXmlValue() );
	}

	public void setOptionalDefaultXmlValue( String value ) {
		if( getValueBuff().getOptionalDefaultXmlValue() != value ) {
			getValueBuff().setOptionalDefaultXmlValue( value );
		}
	}

	public boolean getRequiredIsNullable() {
		return( getValueBuff().getRequiredIsNullable() );
	}

	public void setRequiredIsNullable( boolean value ) {
		if( getValueBuff().getRequiredIsNullable() != value ) {
			getValueBuff().setRequiredIsNullable( value );
		}
	}

	public Boolean getOptionalGenerateId() {
		return( getValueBuff().getOptionalGenerateId() );
	}

	public void setOptionalGenerateId( Boolean value ) {
		if( getValueBuff().getOptionalGenerateId() != value ) {
			getValueBuff().setOptionalGenerateId( value );
		}
	}

	public boolean getRequiredImplementsPolymorph() {
		return( getValueBuff().getRequiredImplementsPolymorph() );
	}

	public void setRequiredImplementsPolymorph( boolean value ) {
		if( getValueBuff().getRequiredImplementsPolymorph() != value ) {
			getValueBuff().setRequiredImplementsPolymorph( value );
		}
	}

	public Long getOptionalPrevTenantId() {
		return( getValueBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getValueBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getValueBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getValueBuff().getOptionalNextId() );
	}

	public IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return( getValueBuff().getRequiredCodeVis() );
	}

	public void setRequiredCodeVis( IYCFBamSchema.CodeVisibilityEnum value ) {
		if( getValueBuff().getRequiredCodeVis() != value ) {
			getValueBuff().setRequiredCodeVis( value );
		}
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getValueBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getValueBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFBamScopeObj getRequiredContainerScope() {
		return( getRequiredContainerScope( false ) );
	}

	public IYCFBamScopeObj getRequiredContainerScope( boolean forceRead ) {
		if( forceRead || ( requiredContainerScope == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamScopeObj obj = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getScopeTableObj().readScopeByIdIdx( getPKey().getRequiredTenantId(),
					getValueBuff().getRequiredScopeId() );
				requiredContainerScope = obj;
				if( obj != null ) {
					getValueBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getValueBuff().setRequiredScopeId( obj.getRequiredId() );
					requiredContainerScope = obj;
				}
			}
		}
		return( requiredContainerScope );
	}

	public void setRequiredContainerScope( IYCFBamScopeObj value ) {
			if( buff == null ) {
				getValueBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getValueBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getValueBuff().setRequiredScopeId( value.getRequiredId() );
			}
			requiredContainerScope = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getValueBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getValueBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getValueBuff().getOptionalDefSchemaTenantId(),
					getValueBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getValueBuff();
			}
			if( value != null ) {
				getValueBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getValueBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getValueBuff().setOptionalDefSchemaTenantId( null );
				getValueBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public List<IYCFBamTableColObj> getOptionalChildrenRefTableCol() {
		List<IYCFBamTableColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getTableColTableObj().readTableColByDataIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamTableColObj> getOptionalChildrenRefTableCol( boolean forceRead ) {
		List<IYCFBamTableColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getTableColTableObj().readTableColByDataIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamIndexColObj> getOptionalChildrenRefIndexCol() {
		List<IYCFBamIndexColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getIndexColTableObj().readIndexColByColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamIndexColObj> getOptionalChildrenRefIndexCol( boolean forceRead ) {
		List<IYCFBamIndexColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getIndexColTableObj().readIndexColByColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamValueObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamValueObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getValueBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getValueBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamValueObj obj = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getValueTableObj().readValueByIdIdx( getValueBuff().getOptionalPrevTenantId(),
					getValueBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( IYCFBamValueObj value ) {
			if( buff == null ) {
				getValueBuff();
			}
			if( value != null ) {
				getValueBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getValueBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getValueBuff().setOptionalPrevTenantId( null );
				getValueBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public IYCFBamValueObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamValueObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getValueBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getValueBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamValueObj obj = ((IYCFBamSchemaObj)getOrigAsValue().getSchema()).getValueTableObj().readValueByIdIdx( getValueBuff().getOptionalNextTenantId(),
					getValueBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( IYCFBamValueObj value ) {
			if( buff == null ) {
				getValueBuff();
			}
			if( value != null ) {
				getValueBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getValueBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getValueBuff().setOptionalNextTenantId( null );
				getValueBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFBamValueBuff origBuff = getOrigAsValue().getValueBuff();
		YCFBamValueBuff myBuff = getValueBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamValueBuff origBuff = getOrigAsValue().getValueBuff();
		YCFBamValueBuff myBuff = getValueBuff();
		myBuff.set( origBuff );
	}

	public List<IYCFBamIndexObj> getAffectedIndexes() {
		List<IYCFBamIndexObj> list = new LinkedList<IYCFBamIndexObj>();
		IYCFBamScopeObj container = getRequiredContainerScope();
		IYCFBamTableObj tableDef = null;
		if( container == null ) {
			throw new RuntimeException("ValueDefObj.getAffectedIndexes() RequiredContainerScope has no value");
		}
		else if( container instanceof IYCFBamTableObj ) {
			tableDef = (IYCFBamTableObj)container;
		}
		else {
			throw new RuntimeException( "ValueDefObj.getAffectedIndexes() RequiredContainerScope is not an IYCFBamTableObj");
		}
		Iterator<IYCFBamIndexObj> cursorIndexDef = tableDef.getOptionalComponentsIndex().iterator();
		while (cursorIndexDef.hasNext())
		{
			IYCFBamIndexObj indexDef = cursorIndexDef.next();

			Iterator<IYCFBamIndexColObj> cursorIndexColDef = indexDef.getOptionalComponentsColumns().iterator();
			while (cursorIndexColDef.hasNext())
			{
				IYCFBamIndexColObj indexColDef = cursorIndexColDef.next();
				if( indexColDef.getRequiredLookupColumn().equals(this))
				{
					list.add(indexDef);
				}
			}
		}
		return( list );
	}

	public List<IYCFBamRelationObj> getAffectedRelations() {
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		IYCFBamScopeObj container = getRequiredContainerScope();
		IYCFBamTableObj tableDef = null;
		if( container == null ) {
			throw new RuntimeException("ValueDefObj.getAffectedRelations() RequiredContainerScope has no value");
		}
		else if( container instanceof IYCFBamTableObj ) {
			tableDef = (IYCFBamTableObj)container;
		}
		else {
			throw new RuntimeException( "ValueDefObj.getAffectedRelations() RequiredContainerScope is not an IYCFBamTableObj");
		}
		Iterator<IYCFBamRelationObj> cursorRelationDef = tableDef.getOptionalComponentsRelation().iterator();
		while (cursorRelationDef.hasNext())
		{
			IYCFBamRelationObj relationDef = cursorRelationDef.next();
			Iterator<IYCFBamRelationColObj> cursorRelationColDef = relationDef.getOptionalComponentsColumns().iterator();
			while (cursorRelationColDef.hasNext())
			{
				IYCFBamRelationColObj relationColDef = cursorRelationColDef.next();
				if( relationColDef.getRequiredLookupFromCol().equals(this))
				{
					list.add(relationDef);
				}
			}
		}
		return( list );
	}

	public List<IYCFBamIndexObj> getAffectedUniqueIndexes() {
		List<IYCFBamIndexObj> affectedIndexes = getAffectedIndexes();
		List<IYCFBamIndexObj> list = new LinkedList<IYCFBamIndexObj>();
		IYCFBamScopeObj container = getRequiredContainerScope();
		IYCFBamTableObj tableDef = null;
		if( container == null ) {
			throw new RuntimeException("ValueDefObj.getAffectedUniqueIndexes() RequiredContainerScope has no value");
		}
		else if( container instanceof IYCFBamTableObj ) {
			tableDef = (IYCFBamTableObj)container;
		}
		else {
			throw new RuntimeException( "ValueDefObj.getAffectedUniqueIndexes() RequiredContainerScope is not an IYCFBamTableObj");
		}
		Iterator<IYCFBamIndexObj> cursorIndexDef = affectedIndexes.iterator();
		while (cursorIndexDef.hasNext())
		{
			IYCFBamIndexObj indexDef = cursorIndexDef.next();
			if( indexDef.getRequiredIsUnique())
			{
				list.add(indexDef);
			}
		}
		return( list );
	}

	public List<IYCFBamRelationObj> getColumnInMemberRelations() {
		final String S_ProcName = "ValueDefObj.getColumnInMemberRelations() ";

		IYCFBamScopeObj scopeDef = (IYCFBamScopeObj)getObjScope();
		if( scopeDef == null)
		{
			throw new RuntimeException(S_ProcName + "OptionalParentScope is required");
		}
		else if( scopeDef instanceof IYCFBamTableObj)
		{
			List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
			Iterator<IYCFBamRelationObj> relations = ((IYCFBamTableObj)scopeDef).getOptionalComponentsRelation().iterator();
			IYCFBamRelationColObj relationCol;
			Iterator<IYCFBamRelationColObj> relationColumns;
			IYCFBamRelationObj relation;
			IYCFBamSchema.RelationTypeEnum relType;
			while (relations.hasNext())
			{
				relation = relations.next();
				relType = relation.getRequiredRelationType();
				if( ( relType == IYCFBamSchema.RelationTypeEnum.Lookup )
				 || ( relType == IYCFBamSchema.RelationTypeEnum.Container )
				 || ( relType == IYCFBamSchema.RelationTypeEnum.Components )
				 || ( relType == IYCFBamSchema.RelationTypeEnum.Parent )
				 || ( relType == IYCFBamSchema.RelationTypeEnum.Children )
				 || ( relType == IYCFBamSchema.RelationTypeEnum.Owner ) )
				{
					relationColumns = relation.getOptionalComponentsColumns().iterator();
					while (relationColumns.hasNext())
					{
						relationCol = relationColumns.next();
						if( this == relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() )
						{
							list.add(relation);
							break;
						}
					}
				}
			}
			return( list );
		}
		else
		{
			throw new RuntimeException(S_ProcName + "Expected scope definition to be an IYCFBamTableObj");
		}
	}

	public List<IYCFBamRelationObj> getColumnInComponentsRelations() {
		final String S_ProcName = "ValueDefObj.getColumnInComponentsRelations() ";

		IYCFBamScopeObj container = getRequiredContainerScope();
		IYCFBamTableObj tableDef = null;
		if( container == null ) {
			throw new RuntimeException("ValueDefObj.getColumnInComponentsRelations() RequiredContainerScope has no value");
		}
		else if( container instanceof IYCFBamTableObj ) {
			tableDef = (IYCFBamTableObj)container;
		}
		else {
			throw new RuntimeException( "ValueDefObj.getColumnInComponentsRelations() RequiredContainerScope is not an IYCFBamTableObj");
		}

		IYCFBamRelationColObj relationCol;
		IYCFBamRelationObj relation;
		Iterator<IYCFBamRelationColObj> relationColumns;
		List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
		Iterator<IYCFBamRelationObj> relations = tableDef.getOptionalComponentsRelation().iterator();

		while( relations.hasNext() ) {
			relation = relations.next();
			if( relation.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Components ) {
				relationColumns = relation.getOptionalComponentsColumns().iterator();
				while (relationColumns.hasNext()) {
					relationCol = relationColumns.next();
					if( this == relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() ) {
						list.add(relation);
						break;
					}
				}
			}
		}

		return( list );
	}

	public boolean getGenerateId() {
		boolean ret;
		if( getOptionalGenerateId() != null )		 {
			ret = getOptionalGenerateId().booleanValue();
		}
		else {
			ret = false;
		}
		return( ret );
	}
}
