// Description: Java 11 base object instance implementation for YCFBam Value.

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

public class YCFBamValueObj
	implements IYCFBamValueObj
{
	public final static String CLASS_CODE = "a80c";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFBamValueEditObj edit;
	protected IYCFBamSchemaObj schema;
	protected YCFBamValuePKey pKey;
	protected YCFBamValueBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamScopeObj requiredContainerScope;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamValueObj optionalLookupPrev;
	protected IYCFBamValueObj optionalLookupNext;

	public YCFBamValueObj() {
		getPKey().setClassCode( getClassCode() );
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerScope = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public YCFBamValueObj( IYCFBamSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		getPKey().setClassCode( getClassCode() );
		requiredOwnerTenant = null;
		requiredContainerScope = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFBamValueObj retobj = ((IYCFBamSchemaObj)schema).getValueTableObj().realiseValue(
			(IYCFBamValueObj)this );
		return( (IYCFBamValueObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getValueTableObj().reallyDeepDisposeValue( (IYCFBamValueObj)this );
	}

	public IYCFBamValueObj read() {
		IYCFBamValueObj retobj = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj read( boolean forceRead ) {
		IYCFBamValueObj retobj = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveUp() {
		IYCFBamValueObj retobj = ((IYCFBamSchemaObj)schema).getValueTableObj().moveUpValue( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveDown() {
		IYCFBamValueObj retobj = ((IYCFBamSchemaObj)schema).getValueTableObj().moveDownValue( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueTableObj getValueTable() {
		return( ((IYCFBamSchemaObj)schema).getValueTableObj() );
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = value;
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamValueBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamValueBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamValueBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerScope = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public YCFBamValueBuff getValueBuff() {
		return( (YCFBamValueBuff)getBuff() );
	}

	public YCFBamValuePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFBamValuePKey value ) {
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

	public IYCFBamValueEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamValueObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamValueObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getValueTableObj().lockValue( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getValueTableObj().newEditInstance( lockobj );
		return( (IYCFBamValueEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFBamValueEditObj getEdit() {
		return( edit );
	}

	public IYCFBamValueEditObj getEditAsValue() {
		return( (IYCFBamValueEditObj)edit );
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

	public String getOptionalShortName() {
		return( getValueBuff().getOptionalShortName() );
	}

	public String getOptionalLabel() {
		return( getValueBuff().getOptionalLabel() );
	}

	public String getOptionalShortDescription() {
		return( getValueBuff().getOptionalShortDescription() );
	}

	public String getOptionalDescription() {
		return( getValueBuff().getOptionalDescription() );
	}

	public String getOptionalDefaultXmlValue() {
		return( getValueBuff().getOptionalDefaultXmlValue() );
	}

	public boolean getRequiredIsNullable() {
		return( getValueBuff().getRequiredIsNullable() );
	}

	public Boolean getOptionalGenerateId() {
		return( getValueBuff().getOptionalGenerateId() );
	}

	public boolean getRequiredImplementsPolymorph() {
		return( getValueBuff().getRequiredImplementsPolymorph() );
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

	public IYCFBamScopeObj getRequiredContainerScope() {
		return( getRequiredContainerScope( false ) );
	}

	public IYCFBamScopeObj getRequiredContainerScope( boolean forceRead ) {
		if( ( requiredContainerScope == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerScope = ((IYCFBamSchemaObj)schema).getScopeTableObj().readScopeByIdIdx( getPKey().getRequiredTenantId(),
					getValueBuff().getRequiredScopeId(), forceRead );
			}
		}
		return( requiredContainerScope );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getValueBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getValueBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getValueBuff().getOptionalDefSchemaTenantId(),
					getValueBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public List<IYCFBamTableColObj> getOptionalChildrenRefTableCol() {
		List<IYCFBamTableColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTableColTableObj().readTableColByDataIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamTableColObj> getOptionalChildrenRefTableCol( boolean forceRead ) {
		List<IYCFBamTableColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getTableColTableObj().readTableColByDataIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamIndexColObj> getOptionalChildrenRefIndexCol() {
		List<IYCFBamIndexColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamIndexColObj> getOptionalChildrenRefIndexCol( boolean forceRead ) {
		List<IYCFBamIndexColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamValueObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamValueObj getOptionalLookupPrev( boolean forceRead ) {
		if( ( optionalLookupPrev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getValueBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getValueBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrev = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByIdIdx( getValueBuff().getOptionalPrevTenantId(),
					getValueBuff().getOptionalPrevId(), forceRead );
			}
		}
		return( optionalLookupPrev );
	}

	public IYCFBamValueObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamValueObj getOptionalLookupNext( boolean forceRead ) {
		if( ( optionalLookupNext == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getValueBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getValueBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNext = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByIdIdx( getValueBuff().getOptionalNextTenantId(),
					getValueBuff().getOptionalNextId(), forceRead );
			}
		}
		return( optionalLookupNext );
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
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
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
