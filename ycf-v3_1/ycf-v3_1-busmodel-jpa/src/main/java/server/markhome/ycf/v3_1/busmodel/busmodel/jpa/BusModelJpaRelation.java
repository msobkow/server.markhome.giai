// Description: Java 25 JPA implementation of a Relation entity definition object.

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

package server.markhome.ycf.v3_1.busmodel.busmodel.jpa;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

@Entity
@Table(
	name = "reldef", schema = "BusModel31",
	indexes = {
		@Index(name = "RelationIdIdx", columnList = "Id", unique = true),
		@Index(name = "RelationUNameIdx", columnList = "TableId, safe_name", unique = true),
		@Index(name = "RelationTableIdx", columnList = "TableId", unique = false),
		@Index(name = "RelationCodeVisIdx", columnList = "codevis", unique = false),
		@Index(name = "RelationTableCodeVisIdx", columnList = "TableId, codevis", unique = false),
		@Index(name = "RelationDefSchemaDefIdx", columnList = "defschid", unique = false),
		@Index(name = "RelationFromKeyIdx", columnList = "FromIndexId", unique = false),
		@Index(name = "RelationToTblIdx", columnList = "ToTableId", unique = false),
		@Index(name = "RelationToKeyIdx", columnList = "ToIndexId", unique = false),
		@Index(name = "RelationNarrowedIdx", columnList = "NarrowedId", unique = false),
		@Index(name = "RelationDefSchemaDefIdxDefSchema", columnList = "defschidDefSchema", unique = false),
		@Index(name = "RelationTableIdxFromTable", columnList = "TableIdFromTable", unique = false),
		@Index(name = "RelationFromKeyIdxFromIndex", columnList = "FromIndexIdFromIndex", unique = false),
		@Index(name = "RelationToTblIdxToTable", columnList = "ToTableIdToTable", unique = false),
		@Index(name = "RelationToKeyIdxToIndex", columnList = "ToIndexIdToIndex", unique = false),
		@Index(name = "RelationNarrowedIdxNarrowed", columnList = "NarrowedIdNarrowed", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43065")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaRelation extends BusModelJpaScope
	implements IBusModelRelation
{
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="defschidDefSchema", referencedColumnName="Id" )
	protected BusModelJpaSchemaDef optionalLookupDefSchema;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="TableIdFromTable", referencedColumnName="Id" )
	protected BusModelJpaTable requiredContainerFromTable;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="FromIndexIdFromIndex", referencedColumnName="Id" )
	protected BusModelJpaIndex requiredLookupFromIndex;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="ToTableIdToTable", referencedColumnName="Id" )
	protected BusModelJpaTable requiredLookupToTable;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="ToIndexIdToIndex", referencedColumnName="Id" )
	protected BusModelJpaIndex requiredLookupToIndex;
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="NarrowedIdNarrowed", referencedColumnName="Id" )
	protected BusModelJpaRelation optionalLookupNarrowed;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerRelation")
	protected Set<BusModelJpaRelationCol> optionalComponentsColumns;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerContRelation")
	protected Set<BusModelJpaPopTopDep> optionalComponentsPopDep;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="TableId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredTableId;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="defschid", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalDefSchemaId;
	@Column( name="safe_name", nullable=false, length=192 )
	protected String requiredName;
	@Column( name="short_name", nullable=true, length=16 )
	protected String optionalShortName;
	@Column( name="Label", nullable=true, length=64 )
	protected String optionalLabel;
	@Column( name="short_descr", nullable=true, length=128 )
	protected String optionalShortDescription;
	@Column( name="descr", nullable=true, length=1023 )
	protected String optionalDescription;
	@Column( name="RelationType", nullable=false )
	protected IBusModelPubSchema.RelationTypeEnum requiredRelationType;
	@Column( name="DbName", nullable=true, length=32 )
	protected String optionalDbName;
	@Column( name="Suffix", nullable=true, length=16 )
	protected String optionalSuffix;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="FromIndexId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredFromIndexId;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="ToTableId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredToTableId;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="ToIndexId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredToIndexId;
	@Column( name="IsRequired", nullable=false )
	protected boolean requiredIsRequired;
	@Column( name="IsXsdContainer", nullable=false )
	protected boolean requiredIsXsdContainer;
	@Column( name="IsLateResolver", nullable=false )
	protected boolean requiredIsLateResolver;
	@Column( name="AllowAddendum", nullable=false )
	protected boolean requiredAllowAddendum;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="NarrowedId", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalNarrowedId;
	@Column( name="codevis", nullable=false )
	protected IBusModelPubSchema.CodeVisibilityEnum requiredCodeVis;

	public BusModelJpaRelation() {
		super();
		requiredTableId = CFDbKeyHash256.fromHex( IBusModelPubRelation.TABLEID_INIT_VALUE.toString() );
		optionalDefSchemaId = CFDbKeyHash256.nullGet();
		requiredName = IBusModelPubRelation.NAME_INIT_VALUE;
		optionalShortName = null;
		optionalLabel = null;
		optionalShortDescription = null;
		optionalDescription = null;
		requiredRelationType = IBusModelPubRelation.RELATIONTYPE_INIT_VALUE;
		optionalDbName = null;
		optionalSuffix = null;
		requiredFromIndexId = CFDbKeyHash256.fromHex( IBusModelPubRelation.FROMINDEXID_INIT_VALUE.toString() );
		requiredToTableId = CFDbKeyHash256.fromHex( IBusModelPubRelation.TOTABLEID_INIT_VALUE.toString() );
		requiredToIndexId = CFDbKeyHash256.fromHex( IBusModelPubRelation.TOINDEXID_INIT_VALUE.toString() );
		requiredIsRequired = IBusModelPubRelation.ISREQUIRED_INIT_VALUE;
		requiredIsXsdContainer = IBusModelPubRelation.ISXSDCONTAINER_INIT_VALUE;
		requiredIsLateResolver = IBusModelPubRelation.ISLATERESOLVER_INIT_VALUE;
		requiredAllowAddendum = IBusModelPubRelation.ALLOWADDENDUM_INIT_VALUE;
		optionalNarrowedId = CFDbKeyHash256.nullGet();
		requiredCodeVis = IBusModelPubRelation.CODEVIS_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( IBusModelRelation.CLASS_CODE );
	}

	@Override
	public IBusModelSchemaDef getOptionalLookupDefSchema() {
		return(optionalLookupDefSchema);
	}

	@Override
	public void setOptionalLookupDefSchema(IBusModelSchemaDef argObj) {
		if(argObj == null) {
			optionalLookupDefSchema = null;
		}
		else if (argObj instanceof BusModelJpaSchemaDef) {
			optionalLookupDefSchema = (BusModelJpaSchemaDef)argObj;
			if (optionalLookupDefSchema != null) {
				optionalDefSchemaId = optionalLookupDefSchema.getRequiredId();
			}
			else {
				optionalDefSchemaId = null;
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupDefSchema", "argObj", argObj, "BusModelJpaSchemaDef");
		}
	}

	@Override
	public void setOptionalLookupDefSchema(IBusModelProtSchemaDef argObj) {
		setOptionalLookupDefSchema(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj) {
		setOptionalLookupDefSchema(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelSchemaDefTable targetTable = targetBackingSchema.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelSchemaDef targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argDefSchemaId);
		setOptionalLookupDefSchema(targetRec);
	}

	@Override
	public IBusModelTable getRequiredContainerFromTable() {
		return(requiredContainerFromTable);
	}

	@Override
	public void setRequiredContainerFromTable(IBusModelTable argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerFromTable", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaTable) {
			requiredContainerFromTable = (BusModelJpaTable)argObj;
			if (requiredContainerFromTable != null) {
				requiredTableId = requiredContainerFromTable.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerFromTable", "argObj", argObj, "BusModelJpaTable");
		}
	}

	@Override
	public void setRequiredContainerFromTable(IBusModelProtTable argObj) {
		setRequiredContainerFromTable(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerFromTable(IBusModelPubTable argObj) {
		setRequiredContainerFromTable(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerFromTable(ICFKeyHash256 argTableId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerFromTable", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelTableTable targetTable = targetBackingSchema.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerFromTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelTable targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTableId);
		setRequiredContainerFromTable(targetRec);
	}

	@Override
	public IBusModelIndex getRequiredLookupFromIndex() {
		return(requiredLookupFromIndex);
	}

	@Override
	public void setRequiredLookupFromIndex(IBusModelIndex argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setLookupFromIndex", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaIndex) {
			requiredLookupFromIndex = (BusModelJpaIndex)argObj;
			if (requiredLookupFromIndex != null) {
				requiredFromIndexId = requiredLookupFromIndex.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupFromIndex", "argObj", argObj, "BusModelJpaIndex");
		}
	}

	@Override
	public void setRequiredLookupFromIndex(IBusModelProtIndex argObj) {
		setRequiredLookupFromIndex(argObj.getRequiredId());
	}

	@Override
	public void setRequiredLookupFromIndex(IBusModelPubIndex argObj) {
		setRequiredLookupFromIndex(argObj.getRequiredId());
	}

	@Override
	public void setRequiredLookupFromIndex(ICFKeyHash256 argFromIndexId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupFromIndex", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelIndexTable targetTable = targetBackingSchema.getTableIndex();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupFromIndex", 0, "IBusModelSchema.getBackingBusModel().getTableIndex()");
		}
		IBusModelIndex targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argFromIndexId);
		setRequiredLookupFromIndex(targetRec);
	}

	@Override
	public IBusModelTable getRequiredLookupToTable() {
		return(requiredLookupToTable);
	}

	@Override
	public void setRequiredLookupToTable(IBusModelTable argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setLookupToTable", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaTable) {
			requiredLookupToTable = (BusModelJpaTable)argObj;
			if (requiredLookupToTable != null) {
				requiredToTableId = requiredLookupToTable.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupToTable", "argObj", argObj, "BusModelJpaTable");
		}
	}

	@Override
	public void setRequiredLookupToTable(IBusModelProtTable argObj) {
		setRequiredLookupToTable(argObj.getRequiredId());
	}

	@Override
	public void setRequiredLookupToTable(IBusModelPubTable argObj) {
		setRequiredLookupToTable(argObj.getRequiredId());
	}

	@Override
	public void setRequiredLookupToTable(ICFKeyHash256 argToTableId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupToTable", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelTableTable targetTable = targetBackingSchema.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupToTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelTable targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argToTableId);
		setRequiredLookupToTable(targetRec);
	}

	@Override
	public IBusModelIndex getRequiredLookupToIndex() {
		return(requiredLookupToIndex);
	}

	@Override
	public void setRequiredLookupToIndex(IBusModelIndex argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setLookupToIndex", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaIndex) {
			requiredLookupToIndex = (BusModelJpaIndex)argObj;
			if (requiredLookupToIndex != null) {
				requiredToIndexId = requiredLookupToIndex.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupToIndex", "argObj", argObj, "BusModelJpaIndex");
		}
	}

	@Override
	public void setRequiredLookupToIndex(IBusModelProtIndex argObj) {
		setRequiredLookupToIndex(argObj.getRequiredId());
	}

	@Override
	public void setRequiredLookupToIndex(IBusModelPubIndex argObj) {
		setRequiredLookupToIndex(argObj.getRequiredId());
	}

	@Override
	public void setRequiredLookupToIndex(ICFKeyHash256 argToIndexId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupToIndex", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelIndexTable targetTable = targetBackingSchema.getTableIndex();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupToIndex", 0, "IBusModelSchema.getBackingBusModel().getTableIndex()");
		}
		IBusModelIndex targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argToIndexId);
		setRequiredLookupToIndex(targetRec);
	}

	@Override
	public IBusModelRelation getOptionalLookupNarrowed() {
		return(optionalLookupNarrowed);
	}

	@Override
	public void setOptionalLookupNarrowed(IBusModelRelation argObj) {
		if(argObj == null) {
			optionalLookupNarrowed = null;
		}
		else if (argObj instanceof BusModelJpaRelation) {
			optionalLookupNarrowed = (BusModelJpaRelation)argObj;
			if (optionalLookupNarrowed != null) {
				optionalNarrowedId = optionalLookupNarrowed.getRequiredId();
			}
			else {
				optionalNarrowedId = null;
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupNarrowed", "argObj", argObj, "BusModelJpaRelation");
		}
	}

	@Override
	public void setOptionalLookupNarrowed(IBusModelProtRelation argObj) {
		setOptionalLookupNarrowed(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupNarrowed(IBusModelPubRelation argObj) {
		setOptionalLookupNarrowed(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupNarrowed(ICFKeyHash256 argNarrowedId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNarrowed", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelRelationTable targetTable = targetBackingSchema.getTableRelation();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNarrowed", 0, "IBusModelSchema.getBackingBusModel().getTableRelation()");
		}
		IBusModelRelation targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argNarrowedId);
		setOptionalLookupNarrowed(targetRec);
	}

	@Override
	public List<IBusModelRelationCol> getOptionalComponentsColumns() {
		List<IBusModelRelationCol> retlist = (optionalComponentsColumns != null) ? new ArrayList<>(optionalComponentsColumns) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<IBusModelPopTopDep> getOptionalComponentsPopDep() {
		List<IBusModelPopTopDep> retlist = (optionalComponentsPopDep != null) ? new ArrayList<>(optionalComponentsPopDep) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public ICFKeyHash256 getRequiredTableId() {
		return(requiredTableId);
	}

	public void setRequiredTableId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTableId",
				1,
				"value" );
		}
		requiredTableId = value;
	}

	@Override
	public ICFKeyHash256 getOptionalDefSchemaId() {
		return(optionalDefSchemaId);
	}

	public void setOptionalDefSchemaId( ICFKeyHash256 value ) {
		optionalDefSchemaId = value;
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 192 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	@Override
	public String getOptionalShortName() {
		return(optionalShortName);
	}

	public void setOptionalShortName( String value ) {
		if( value != null && value.length() > 16 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalShortName",
				1,
				"value.length()",
				value.length(),
				16 );
		}
		optionalShortName = value;
	}

	@Override
	public String getOptionalLabel() {
		return(optionalLabel);
	}

	public void setOptionalLabel( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalLabel",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalLabel = value;
	}

	@Override
	public String getOptionalShortDescription() {
		return(optionalShortDescription);
	}

	public void setOptionalShortDescription( String value ) {
		if( value != null && value.length() > 128 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalShortDescription",
				1,
				"value.length()",
				value.length(),
				128 );
		}
		optionalShortDescription = value;
	}

	@Override
	public String getOptionalDescription() {
		return(optionalDescription);
	}

	public void setOptionalDescription( String value ) {
		if( value != null && value.length() > 1023 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDescription",
				1,
				"value.length()",
				value.length(),
				1023 );
		}
		optionalDescription = value;
	}

	@Override
	public IBusModelPubSchema.RelationTypeEnum getRequiredRelationType() {
		return(requiredRelationType);
	}

	public void setRequiredRelationType( IBusModelPubSchema.RelationTypeEnum value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredRelationType",
				1,
				"value" );
		}
		requiredRelationType = value;
	}

	@Override
	public String getOptionalDbName() {
		return(optionalDbName);
	}

	public void setOptionalDbName( String value ) {
		if( value != null && value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDbName",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		optionalDbName = value;
	}

	@Override
	public String getOptionalSuffix() {
		return(optionalSuffix);
	}

	public void setOptionalSuffix( String value ) {
		if( value != null && value.length() > 16 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalSuffix",
				1,
				"value.length()",
				value.length(),
				16 );
		}
		optionalSuffix = value;
	}

	@Override
	public ICFKeyHash256 getRequiredFromIndexId() {
		return(requiredFromIndexId);
	}

	public void setRequiredFromIndexId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredFromIndexId",
				1,
				"value" );
		}
		requiredFromIndexId = value;
	}

	@Override
	public ICFKeyHash256 getRequiredToTableId() {
		return(requiredToTableId);
	}

	public void setRequiredToTableId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredToTableId",
				1,
				"value" );
		}
		requiredToTableId = value;
	}

	@Override
	public ICFKeyHash256 getRequiredToIndexId() {
		return(requiredToIndexId);
	}

	public void setRequiredToIndexId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredToIndexId",
				1,
				"value" );
		}
		requiredToIndexId = value;
	}

	@Override
	public boolean getRequiredIsRequired() {
		return(requiredIsRequired);
	}

	public void setRequiredIsRequired( boolean value ) {
		requiredIsRequired = value;
	}

	@Override
	public boolean getRequiredIsXsdContainer() {
		return(requiredIsXsdContainer);
	}

	public void setRequiredIsXsdContainer( boolean value ) {
		requiredIsXsdContainer = value;
	}

	@Override
	public boolean getRequiredIsLateResolver() {
		return(requiredIsLateResolver);
	}

	public void setRequiredIsLateResolver( boolean value ) {
		requiredIsLateResolver = value;
	}

	@Override
	public boolean getRequiredAllowAddendum() {
		return(requiredAllowAddendum);
	}

	public void setRequiredAllowAddendum( boolean value ) {
		requiredAllowAddendum = value;
	}

	@Override
	public ICFKeyHash256 getOptionalNarrowedId() {
		return(optionalNarrowedId);
	}

	public void setOptionalNarrowedId( ICFKeyHash256 value ) {
		optionalNarrowedId = value;
	}

	@Override
	public IBusModelPubSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return(requiredCodeVis);
	}

	public void setRequiredCodeVis( IBusModelPubSchema.CodeVisibilityEnum value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredCodeVis",
				1,
				"value" );
		}
		requiredCodeVis = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelRelation) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelRelation rhs = (IBusModelRelation)obj;
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					if( ! getOptionalShortName().equals( rhs.getOptionalShortName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( false );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					if( ! getOptionalLabel().equals( rhs.getOptionalLabel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( false );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					if( ! getOptionalShortDescription().equals( rhs.getOptionalShortDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationType() != null ) {
				if( rhs.getRequiredRelationType() != null ) {
					if( ! getRequiredRelationType().equals( rhs.getRequiredRelationType() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationType() != null ) {
					return( false );
				}
			}
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					if( ! getOptionalDbName().equals( rhs.getOptionalDbName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuffix() != null ) {
				if( rhs.getOptionalSuffix() != null ) {
					if( ! getOptionalSuffix().equals( rhs.getOptionalSuffix() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuffix() != null ) {
					return( false );
				}
			}
			if( getRequiredFromIndexId() != null ) {
				if( rhs.getRequiredFromIndexId() != null ) {
					if( ! getRequiredFromIndexId().equals( rhs.getRequiredFromIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromIndexId() != null ) {
					return( false );
				}
			}
			if( getRequiredToTableId() != null ) {
				if( rhs.getRequiredToTableId() != null ) {
					if( ! getRequiredToTableId().equals( rhs.getRequiredToTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredToIndexId() != null ) {
				if( rhs.getRequiredToIndexId() != null ) {
					if( ! getRequiredToIndexId().equals( rhs.getRequiredToIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToIndexId() != null ) {
					return( false );
				}
			}
			if( getRequiredIsRequired() != rhs.getRequiredIsRequired() ) {
				return( false );
			}
			if( getRequiredIsXsdContainer() != rhs.getRequiredIsXsdContainer() ) {
				return( false );
			}
			if( getRequiredIsLateResolver() != rhs.getRequiredIsLateResolver() ) {
				return( false );
			}
			if( getRequiredAllowAddendum() != rhs.getRequiredAllowAddendum() ) {
				return( false );
			}
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					if( ! getOptionalNarrowedId().equals( rhs.getOptionalNarrowedId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationH) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelRelationH rhs = (IBusModelRelationH)obj;
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					if( ! getOptionalShortName().equals( rhs.getOptionalShortName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( false );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					if( ! getOptionalLabel().equals( rhs.getOptionalLabel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( false );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					if( ! getOptionalShortDescription().equals( rhs.getOptionalShortDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationType() != null ) {
				if( rhs.getRequiredRelationType() != null ) {
					if( ! getRequiredRelationType().equals( rhs.getRequiredRelationType() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationType() != null ) {
					return( false );
				}
			}
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					if( ! getOptionalDbName().equals( rhs.getOptionalDbName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuffix() != null ) {
				if( rhs.getOptionalSuffix() != null ) {
					if( ! getOptionalSuffix().equals( rhs.getOptionalSuffix() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuffix() != null ) {
					return( false );
				}
			}
			if( getRequiredFromIndexId() != null ) {
				if( rhs.getRequiredFromIndexId() != null ) {
					if( ! getRequiredFromIndexId().equals( rhs.getRequiredFromIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromIndexId() != null ) {
					return( false );
				}
			}
			if( getRequiredToTableId() != null ) {
				if( rhs.getRequiredToTableId() != null ) {
					if( ! getRequiredToTableId().equals( rhs.getRequiredToTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredToIndexId() != null ) {
				if( rhs.getRequiredToIndexId() != null ) {
					if( ! getRequiredToIndexId().equals( rhs.getRequiredToIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToIndexId() != null ) {
					return( false );
				}
			}
			if( getRequiredIsRequired() != rhs.getRequiredIsRequired() ) {
				return( false );
			}
			if( getRequiredIsXsdContainer() != rhs.getRequiredIsXsdContainer() ) {
				return( false );
			}
			if( getRequiredIsLateResolver() != rhs.getRequiredIsLateResolver() ) {
				return( false );
			}
			if( getRequiredAllowAddendum() != rhs.getRequiredAllowAddendum() ) {
				return( false );
			}
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					if( ! getOptionalNarrowedId().equals( rhs.getOptionalNarrowedId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelScopeHPKey) {
			return( super.equals(obj) );
		}
		else if (obj instanceof IBusModelRelationByUNameIdxKey) {
			IBusModelRelationByUNameIdxKey rhs = (IBusModelRelationByUNameIdxKey)obj;
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByRelTableIdxKey) {
			IBusModelRelationByRelTableIdxKey rhs = (IBusModelRelationByRelTableIdxKey)obj;
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByRelCodeVisIdxKey) {
			IBusModelRelationByRelCodeVisIdxKey rhs = (IBusModelRelationByRelCodeVisIdxKey)obj;
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByRelTableCodeVisXKey) {
			IBusModelRelationByRelTableCodeVisXKey rhs = (IBusModelRelationByRelTableCodeVisXKey)obj;
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByDefSchemaIdxKey) {
			IBusModelRelationByDefSchemaIdxKey rhs = (IBusModelRelationByDefSchemaIdxKey)obj;
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByFromKeyIdxKey) {
			IBusModelRelationByFromKeyIdxKey rhs = (IBusModelRelationByFromKeyIdxKey)obj;
			if( getRequiredFromIndexId() != null ) {
				if( rhs.getRequiredFromIndexId() != null ) {
					if( ! getRequiredFromIndexId().equals( rhs.getRequiredFromIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByToTblIdxKey) {
			IBusModelRelationByToTblIdxKey rhs = (IBusModelRelationByToTblIdxKey)obj;
			if( getRequiredToTableId() != null ) {
				if( rhs.getRequiredToTableId() != null ) {
					if( ! getRequiredToTableId().equals( rhs.getRequiredToTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByToKeyIdxKey) {
			IBusModelRelationByToKeyIdxKey rhs = (IBusModelRelationByToKeyIdxKey)obj;
			if( getRequiredToIndexId() != null ) {
				if( rhs.getRequiredToIndexId() != null ) {
					if( ! getRequiredToIndexId().equals( rhs.getRequiredToIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRelationByNarrowedIdxKey) {
			IBusModelRelationByNarrowedIdxKey rhs = (IBusModelRelationByNarrowedIdxKey)obj;
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					if( ! getOptionalNarrowedId().equals( rhs.getOptionalNarrowedId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( super.equals(obj) );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredTableId().hashCode();
		if( getOptionalDefSchemaId() != null ) {
			hashCode = hashCode + getOptionalDefSchemaId().hashCode();
		}
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalShortName() != null ) {
			hashCode = hashCode + getOptionalShortName().hashCode();
		}
		if( getOptionalLabel() != null ) {
			hashCode = hashCode + getOptionalLabel().hashCode();
		}
		if( getOptionalShortDescription() != null ) {
			hashCode = hashCode + getOptionalShortDescription().hashCode();
		}
		if( getOptionalDescription() != null ) {
			hashCode = hashCode + getOptionalDescription().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredRelationType().ordinal();
		if( getOptionalDbName() != null ) {
			hashCode = hashCode + getOptionalDbName().hashCode();
		}
		if( getOptionalSuffix() != null ) {
			hashCode = hashCode + getOptionalSuffix().hashCode();
		}
		hashCode = hashCode + getRequiredFromIndexId().hashCode();
		hashCode = hashCode + getRequiredToTableId().hashCode();
		hashCode = hashCode + getRequiredToIndexId().hashCode();
		if( getRequiredIsRequired() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredIsXsdContainer() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredIsLateResolver() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredAllowAddendum() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getOptionalNarrowedId() != null ) {
			hashCode = hashCode + getOptionalNarrowedId().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredCodeVis().ordinal();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelRelation) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelRelation rhs = (IBusModelRelation)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					cmp = getOptionalShortName().compareTo( rhs.getOptionalShortName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					cmp = getOptionalLabel().compareTo( rhs.getOptionalLabel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( -1 );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					cmp = getOptionalShortDescription().compareTo( rhs.getOptionalShortDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationType() != null) {
				if (rhs.getRequiredRelationType() != null) {
					cmp = getRequiredRelationType().compareTo( rhs.getRequiredRelationType() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationType() != null) {
				return( -1 );
			}
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					cmp = getOptionalDbName().compareTo( rhs.getOptionalDbName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSuffix() != null ) {
				if( rhs.getOptionalSuffix() != null ) {
					cmp = getOptionalSuffix().compareTo( rhs.getOptionalSuffix() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuffix() != null ) {
					return( -1 );
				}
			}
			if (getRequiredFromIndexId() != null) {
				if (rhs.getRequiredFromIndexId() != null) {
					cmp = getRequiredFromIndexId().compareTo( rhs.getRequiredFromIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromIndexId() != null) {
				return( -1 );
			}
			if (getRequiredToTableId() != null) {
				if (rhs.getRequiredToTableId() != null) {
					cmp = getRequiredToTableId().compareTo( rhs.getRequiredToTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToTableId() != null) {
				return( -1 );
			}
			if (getRequiredToIndexId() != null) {
				if (rhs.getRequiredToIndexId() != null) {
					cmp = getRequiredToIndexId().compareTo( rhs.getRequiredToIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToIndexId() != null) {
				return( -1 );
			}
			if( getRequiredIsRequired() ) {
				if( ! rhs.getRequiredIsRequired() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsRequired() ) {
					return( -1 );
				}
			}
			if( getRequiredIsXsdContainer() ) {
				if( ! rhs.getRequiredIsXsdContainer() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsXsdContainer() ) {
					return( -1 );
				}
			}
			if( getRequiredIsLateResolver() ) {
				if( ! rhs.getRequiredIsLateResolver() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsLateResolver() ) {
					return( -1 );
				}
			}
			if( getRequiredAllowAddendum() ) {
				if( ! rhs.getRequiredAllowAddendum() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredAllowAddendum() ) {
					return( -1 );
				}
			}
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					cmp = getOptionalNarrowedId().compareTo( rhs.getOptionalNarrowedId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelRelationH ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelRelationH rhs = (IBusModelRelationH)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					cmp = getOptionalShortName().compareTo( rhs.getOptionalShortName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					cmp = getOptionalLabel().compareTo( rhs.getOptionalLabel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( -1 );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					cmp = getOptionalShortDescription().compareTo( rhs.getOptionalShortDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationType() != null) {
				if (rhs.getRequiredRelationType() != null) {
					cmp = getRequiredRelationType().compareTo( rhs.getRequiredRelationType() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationType() != null) {
				return( -1 );
			}
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					cmp = getOptionalDbName().compareTo( rhs.getOptionalDbName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSuffix() != null ) {
				if( rhs.getOptionalSuffix() != null ) {
					cmp = getOptionalSuffix().compareTo( rhs.getOptionalSuffix() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuffix() != null ) {
					return( -1 );
				}
			}
			if (getRequiredFromIndexId() != null) {
				if (rhs.getRequiredFromIndexId() != null) {
					cmp = getRequiredFromIndexId().compareTo( rhs.getRequiredFromIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromIndexId() != null) {
				return( -1 );
			}
			if (getRequiredToTableId() != null) {
				if (rhs.getRequiredToTableId() != null) {
					cmp = getRequiredToTableId().compareTo( rhs.getRequiredToTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToTableId() != null) {
				return( -1 );
			}
			if (getRequiredToIndexId() != null) {
				if (rhs.getRequiredToIndexId() != null) {
					cmp = getRequiredToIndexId().compareTo( rhs.getRequiredToIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToIndexId() != null) {
				return( -1 );
			}
			if( getRequiredIsRequired() ) {
				if( ! rhs.getRequiredIsRequired() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsRequired() ) {
					return( -1 );
				}
			}
			if( getRequiredIsXsdContainer() ) {
				if( ! rhs.getRequiredIsXsdContainer() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsXsdContainer() ) {
					return( -1 );
				}
			}
			if( getRequiredIsLateResolver() ) {
				if( ! rhs.getRequiredIsLateResolver() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsLateResolver() ) {
					return( -1 );
				}
			}
			if( getRequiredAllowAddendum() ) {
				if( ! rhs.getRequiredAllowAddendum() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredAllowAddendum() ) {
					return( -1 );
				}
			}
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					cmp = getOptionalNarrowedId().compareTo( rhs.getOptionalNarrowedId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByUNameIdxKey) {
			IBusModelRelationByUNameIdxKey rhs = (IBusModelRelationByUNameIdxKey)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByRelTableIdxKey) {
			IBusModelRelationByRelTableIdxKey rhs = (IBusModelRelationByRelTableIdxKey)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByRelCodeVisIdxKey) {
			IBusModelRelationByRelCodeVisIdxKey rhs = (IBusModelRelationByRelCodeVisIdxKey)obj;
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByRelTableCodeVisXKey) {
			IBusModelRelationByRelTableCodeVisXKey rhs = (IBusModelRelationByRelTableCodeVisXKey)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByDefSchemaIdxKey) {
			IBusModelRelationByDefSchemaIdxKey rhs = (IBusModelRelationByDefSchemaIdxKey)obj;
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByFromKeyIdxKey) {
			IBusModelRelationByFromKeyIdxKey rhs = (IBusModelRelationByFromKeyIdxKey)obj;
			if (getRequiredFromIndexId() != null) {
				if (rhs.getRequiredFromIndexId() != null) {
					cmp = getRequiredFromIndexId().compareTo( rhs.getRequiredFromIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromIndexId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByToTblIdxKey) {
			IBusModelRelationByToTblIdxKey rhs = (IBusModelRelationByToTblIdxKey)obj;
			if (getRequiredToTableId() != null) {
				if (rhs.getRequiredToTableId() != null) {
					cmp = getRequiredToTableId().compareTo( rhs.getRequiredToTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToTableId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByToKeyIdxKey) {
			IBusModelRelationByToKeyIdxKey rhs = (IBusModelRelationByToKeyIdxKey)obj;
			if (getRequiredToIndexId() != null) {
				if (rhs.getRequiredToIndexId() != null) {
					cmp = getRequiredToIndexId().compareTo( rhs.getRequiredToIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToIndexId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelRelationByNarrowedIdxKey) {
			IBusModelRelationByNarrowedIdxKey rhs = (IBusModelRelationByNarrowedIdxKey)obj;
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					cmp = getOptionalNarrowedId().compareTo( rhs.getOptionalNarrowedId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			cmp = super.compareTo(obj);
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelScope src ) {
		if( src instanceof IBusModelRelation ) {
			setRelation( (IBusModelRelation)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaRelation" );
		}
	}

	@Override
	public void setRelation( IBusModelRelation src ) {
		super.setScope( src );
		setOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setRequiredContainerFromTable(src.getRequiredContainerFromTable());
		setRequiredLookupFromIndex(src.getRequiredLookupFromIndex());
		setRequiredLookupToTable(src.getRequiredLookupToTable());
		setRequiredLookupToIndex(src.getRequiredLookupToIndex());
		setOptionalLookupNarrowed(src.getOptionalLookupNarrowed());
		setRequiredTableId(src.getRequiredTableId());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredName(src.getRequiredName());
		setOptionalShortName(src.getOptionalShortName());
		setOptionalLabel(src.getOptionalLabel());
		setOptionalShortDescription(src.getOptionalShortDescription());
		setOptionalDescription(src.getOptionalDescription());
		setRequiredRelationType(src.getRequiredRelationType());
		setOptionalDbName(src.getOptionalDbName());
		setOptionalSuffix(src.getOptionalSuffix());
		setRequiredFromIndexId(src.getRequiredFromIndexId());
		setRequiredToTableId(src.getRequiredToTableId());
		setRequiredToIndexId(src.getRequiredToIndexId());
		setRequiredIsRequired(src.getRequiredIsRequired());
		setRequiredIsXsdContainer(src.getRequiredIsXsdContainer());
		setRequiredIsLateResolver(src.getRequiredIsLateResolver());
		setRequiredAllowAddendum(src.getRequiredAllowAddendum());
		setOptionalNarrowedId(src.getOptionalNarrowedId());
		setRequiredCodeVis(src.getRequiredCodeVis());
	}

	@Override
	public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelRelationH ) {
			setRelation( (IBusModelRelationH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelRelationH" );
		}
	}

	@Override
	public void setRelation( IBusModelRelationH src ) {
		super.setScope( src );
		setOptionalLookupDefSchema(src.getOptionalDefSchemaId());
		setRequiredContainerFromTable(src.getRequiredTableId());
		setRequiredLookupFromIndex(src.getRequiredFromIndexId());
		setRequiredLookupToTable(src.getRequiredToTableId());
		setRequiredLookupToIndex(src.getRequiredToIndexId());
		setOptionalLookupNarrowed(src.getOptionalNarrowedId());
		setRequiredTableId(src.getRequiredTableId());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredName(src.getRequiredName());
		setOptionalShortName(src.getOptionalShortName());
		setOptionalLabel(src.getOptionalLabel());
		setOptionalShortDescription(src.getOptionalShortDescription());
		setOptionalDescription(src.getOptionalDescription());
		setRequiredRelationType(src.getRequiredRelationType());
		setOptionalDbName(src.getOptionalDbName());
		setOptionalSuffix(src.getOptionalSuffix());
		setRequiredFromIndexId(src.getRequiredFromIndexId());
		setRequiredToTableId(src.getRequiredToTableId());
		setRequiredToIndexId(src.getRequiredToIndexId());
		setRequiredIsRequired(src.getRequiredIsRequired());
		setRequiredIsXsdContainer(src.getRequiredIsXsdContainer());
		setRequiredIsLateResolver(src.getRequiredIsLateResolver());
		setRequiredAllowAddendum(src.getRequiredAllowAddendum());
		setOptionalNarrowedId(src.getOptionalNarrowedId());
		setRequiredCodeVis(src.getRequiredCodeVis());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredTableId=" + "\"" + getRequiredTableId().toString() + "\""
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " OptionalDefSchemaId=" + ( ( getOptionalDefSchemaId() == null ) ? "null" : "\"" + getOptionalDefSchemaId().toString() + "\"" )
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\""
			+ " OptionalShortName=" + ( ( getOptionalShortName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalShortName() ) + "\"" )
			+ " OptionalLabel=" + ( ( getOptionalLabel() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalLabel() ) + "\"" )
			+ " OptionalShortDescription=" + ( ( getOptionalShortDescription() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalShortDescription() ) + "\"" )
			+ " OptionalDescription=" + ( ( getOptionalDescription() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDescription() ) + "\"" )
			+ " RequiredRelationType=" + "\"" + getRequiredRelationType().toString() + "\""
			+ " OptionalDbName=" + ( ( getOptionalDbName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDbName() ) + "\"" )
			+ " OptionalSuffix=" + ( ( getOptionalSuffix() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalSuffix() ) + "\"" )
			+ " RequiredFromIndexId=" + "\"" + getRequiredFromIndexId().toString() + "\""
			+ " RequiredToTableId=" + "\"" + getRequiredToTableId().toString() + "\""
			+ " RequiredToIndexId=" + "\"" + getRequiredToIndexId().toString() + "\""
			+ " RequiredIsRequired=" + (( getRequiredIsRequired() ) ? "\"true\"" : "\"false\"" )
			+ " RequiredIsXsdContainer=" + (( getRequiredIsXsdContainer() ) ? "\"true\"" : "\"false\"" )
			+ " RequiredIsLateResolver=" + (( getRequiredIsLateResolver() ) ? "\"true\"" : "\"false\"" )
			+ " RequiredAllowAddendum=" + (( getRequiredAllowAddendum() ) ? "\"true\"" : "\"false\"" )
			+ " OptionalNarrowedId=" + ( ( getOptionalNarrowedId() == null ) ? "null" : "\"" + getOptionalNarrowedId().toString() + "\"" )
			+ " RequiredCodeVis=" + "\"" + getRequiredCodeVis().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaRelation" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
