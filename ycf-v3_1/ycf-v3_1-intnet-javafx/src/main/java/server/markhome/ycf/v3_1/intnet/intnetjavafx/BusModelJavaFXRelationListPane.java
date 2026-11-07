// Description: Java 25 JavaFX List of Obj Pane implementation for Relation.

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

package server.markhome.ycf.v3_1.busmodel.busmodeljavafx;

import java.math.*;
import java.time.*;
import java.util.*;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.Inz;
import server.markhome.cf.javafx.*;
import org.apache.commons.codec.binaryCFCore64;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;
import server.markhome.ycf.v3_1.secure.securejavafx.*;
import server.markhome.ycf.v3_1.intnet.intnetjavafx.*;

/**
 *	BusModelJavaFXRelationListPane JavaFX List of Obj Pane implementation
 *	for Relation.
 */
public class BusModelJavaFXRelationListPane
extends CFBorderPane
implements IBusModelJavaFXRelationPaneList
{
	public static String S_FormName = "List Relation";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelRelationObj> javafxDataCollection = null;
	protected ObservableList<IBusModelRelationObj> observableListOfRelation = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddRelation = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelRelationObj> dataTable = null;
	protected TableColumn<IBusModelRelationObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelRelationObj, String> tableColumnName = null;
	protected TableColumn<IBusModelRelationObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelRelationObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelRelationObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelRelationObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelRelationObj, IBusModelPubSchema.RelationTypeEnum> tableColumnRelationType = null;
	protected TableColumn<IBusModelRelationObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelRelationObj, String> tableColumnSuffix = null;
	protected TableColumn<IBusModelRelationObj, Boolean> tableColumnIsRequired = null;
	protected TableColumn<IBusModelRelationObj, Boolean> tableColumnIsXsdContainer = null;
	protected TableColumn<IBusModelRelationObj, Boolean> tableColumnIsLateResolver = null;
	protected TableColumn<IBusModelRelationObj, Boolean> tableColumnAllowAddendum = null;
	protected TableColumn<IBusModelRelationObj, IBusModelPubSchema.CodeVisibilityEnum> tableColumnCodeVis = null;
	protected TableColumn<IBusModelRelationObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableColumn<IBusModelRelationObj, IBusModelIndexObj> tableColumnLookupFromIndex = null;
	protected TableColumn<IBusModelRelationObj, IBusModelTableObj> tableColumnLookupToTable = null;
	protected TableColumn<IBusModelRelationObj, IBusModelIndexObj> tableColumnLookupToIndex = null;
	protected TableColumn<IBusModelRelationObj, IBusModelRelationObj> tableColumnLookupNarrowed = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected IBusModelTableObj javafxContainer = null;
	protected ICFRefreshCallback javafxRefreshCallback = null;
	class ViewEditClosedCallback implements ICFFormClosedCallback {
		public ViewEditClosedCallback() {
		}

		@Override
		public void formClosed( ICFLibAnyObj affectedObject ) {
			if( affectedObject != null ) {
				refreshMe();
			}
		}
	}

	protected ViewEditClosedCallback viewEditClosedCallback = null;

	public ICFFormClosedCallback getViewEditClosedCallback() {
		if( viewEditClosedCallback == null ) {
			viewEditClosedCallback = new ViewEditClosedCallback();
		}
		return( viewEditClosedCallback );
	}

	class DeleteCallback implements ICFDeleteCallback {
		public DeleteCallback() {
		}
		@Override
		public void deleted( ICFLibAnyObj deletedObject ) {
			if( deletedObject != null ) {
				refreshMe();
			}
		}

		@Override
		public void formClosed( ICFLibAnyObj affectedObject ) {
			if( affectedObject != null ) {
				refreshMe();
			}
		}
	}

	protected DeleteCallback deleteCallback = null;

	public ICFDeleteCallback getDeleteCallback() {
		if( deleteCallback == null ) {
			deleteCallback = new DeleteCallback();
		}
		return( deleteCallback );
	}


	public BusModelJavaFXRelationListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelTableObj argContainer,
		IBusModelRelationObj argFocus,
		Collection<IBusModelRelationObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		javafxContainer = argContainer;
		javafxRefreshCallback = refreshCallback;
		javafxSortByChain = sortByChain;
		setJavaFXDataCollection( argDataCollection );
		dataTable = new TableView<IBusModelRelationObj>();
		tableColumnId = new TableColumn<IBusModelRelationObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelRelationObj, ICFKeyHash256> p ) {
				IBusModelScopeObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFKeyHash256 value = obj.getRequiredId();
					ReadOnlyObjectWrapper<ICFKeyHash256> observable = new ReadOnlyObjectWrapper<ICFKeyHash256>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,ICFKeyHash256>,TableCell<IBusModelRelationObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelRelationObj,ICFKeyHash256> call(
				TableColumn<IBusModelRelationObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelRelationObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelRelationObj, String> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,String>,TableCell<IBusModelRelationObj,String>>() {
			@Override public TableCell<IBusModelRelationObj,String> call(
				TableColumn<IBusModelRelationObj,String> arg)
			{
				return new CFStringTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelRelationObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelRelationObj, String> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalShortName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,String>,TableCell<IBusModelRelationObj,String>>() {
			@Override public TableCell<IBusModelRelationObj,String> call(
				TableColumn<IBusModelRelationObj,String> arg)
			{
				return new CFStringTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelRelationObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelRelationObj, String> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalLabel();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,String>,TableCell<IBusModelRelationObj,String>>() {
			@Override public TableCell<IBusModelRelationObj,String> call(
				TableColumn<IBusModelRelationObj,String> arg)
			{
				return new CFStringTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelRelationObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelRelationObj, String> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalShortDescription();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,String>,TableCell<IBusModelRelationObj,String>>() {
			@Override public TableCell<IBusModelRelationObj,String> call(
				TableColumn<IBusModelRelationObj,String> arg)
			{
				return new CFStringTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelRelationObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelRelationObj, String> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDescription();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,String>,TableCell<IBusModelRelationObj,String>>() {
			@Override public TableCell<IBusModelRelationObj,String> call(
				TableColumn<IBusModelRelationObj,String> arg)
			{
				return new CFStringTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnRelationType = new TableColumn<IBusModelRelationObj,IBusModelPubSchema.RelationTypeEnum>( "RelationType" );
		tableColumnRelationType.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,IBusModelPubSchema.RelationTypeEnum>,ObservableValue<IBusModelPubSchema.RelationTypeEnum> >() {
			public ObservableValue<IBusModelPubSchema.RelationTypeEnum> call( CellDataFeatures<IBusModelRelationObj, IBusModelPubSchema.RelationTypeEnum> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelPubSchema.RelationTypeEnum value = obj.getRequiredRelationType();
					ReadOnlyObjectWrapper<IBusModelPubSchema.RelationTypeEnum> observable = new ReadOnlyObjectWrapper<IBusModelPubSchema.RelationTypeEnum>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnRelationType.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,IBusModelPubSchema.RelationTypeEnum>,TableCell<IBusModelRelationObj,IBusModelPubSchema.RelationTypeEnum>>() {
			@Override public TableCell<IBusModelRelationObj,IBusModelPubSchema.RelationTypeEnum> call(
				TableColumn<IBusModelRelationObj,IBusModelPubSchema.RelationTypeEnum> arg)
			{
				return new CFEnumTableCell<IBusModelRelationObj,IBusModelSchema.RelationTypeEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnRelationType );
		tableColumnDbName = new TableColumn<IBusModelRelationObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelRelationObj, String> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDbName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,String>,TableCell<IBusModelRelationObj,String>>() {
			@Override public TableCell<IBusModelRelationObj,String> call(
				TableColumn<IBusModelRelationObj,String> arg)
			{
				return new CFStringTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnSuffix = new TableColumn<IBusModelRelationObj,String>( "Suffix" );
		tableColumnSuffix.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelRelationObj, String> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalSuffix();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnSuffix.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,String>,TableCell<IBusModelRelationObj,String>>() {
			@Override public TableCell<IBusModelRelationObj,String> call(
				TableColumn<IBusModelRelationObj,String> arg)
			{
				return new CFStringTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSuffix );
		tableColumnIsRequired = new TableColumn<IBusModelRelationObj,Boolean>( "Is Required" );
		tableColumnIsRequired.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelRelationObj, Boolean> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsRequired();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsRequired.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,Boolean>,TableCell<IBusModelRelationObj,Boolean>>() {
			@Override public TableCell<IBusModelRelationObj,Boolean> call(
				TableColumn<IBusModelRelationObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsRequired );
		tableColumnIsXsdContainer = new TableColumn<IBusModelRelationObj,Boolean>( "Is XSD Container" );
		tableColumnIsXsdContainer.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelRelationObj, Boolean> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsXsdContainer();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsXsdContainer.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,Boolean>,TableCell<IBusModelRelationObj,Boolean>>() {
			@Override public TableCell<IBusModelRelationObj,Boolean> call(
				TableColumn<IBusModelRelationObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsXsdContainer );
		tableColumnIsLateResolver = new TableColumn<IBusModelRelationObj,Boolean>( "IsLateResolver" );
		tableColumnIsLateResolver.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelRelationObj, Boolean> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsLateResolver();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsLateResolver.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,Boolean>,TableCell<IBusModelRelationObj,Boolean>>() {
			@Override public TableCell<IBusModelRelationObj,Boolean> call(
				TableColumn<IBusModelRelationObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsLateResolver );
		tableColumnAllowAddendum = new TableColumn<IBusModelRelationObj,Boolean>( "AllowAddendum" );
		tableColumnAllowAddendum.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelRelationObj, Boolean> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredAllowAddendum();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnAllowAddendum.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,Boolean>,TableCell<IBusModelRelationObj,Boolean>>() {
			@Override public TableCell<IBusModelRelationObj,Boolean> call(
				TableColumn<IBusModelRelationObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnAllowAddendum );
		tableColumnCodeVis = new TableColumn<IBusModelRelationObj,IBusModelPubSchema.CodeVisibilityEnum>( "Relationship Code Visibility" );
		tableColumnCodeVis.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,IBusModelPubSchema.CodeVisibilityEnum>,ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> >() {
			public ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> call( CellDataFeatures<IBusModelRelationObj, IBusModelPubSchema.CodeVisibilityEnum> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelPubSchema.CodeVisibilityEnum value = obj.getRequiredCodeVis();
					ReadOnlyObjectWrapper<IBusModelPubSchema.CodeVisibilityEnum> observable = new ReadOnlyObjectWrapper<IBusModelPubSchema.CodeVisibilityEnum>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnCodeVis.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,IBusModelPubSchema.CodeVisibilityEnum>,TableCell<IBusModelRelationObj,IBusModelPubSchema.CodeVisibilityEnum>>() {
			@Override public TableCell<IBusModelRelationObj,IBusModelPubSchema.CodeVisibilityEnum> call(
				TableColumn<IBusModelRelationObj,IBusModelPubSchema.CodeVisibilityEnum> arg)
			{
				return new CFEnumTableCell<IBusModelRelationObj,IBusModelSchema.CodeVisibilityEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnCodeVis );
		tableColumnLookupDefSchema = new TableColumn<IBusModelRelationObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelRelationObj, IBusModelSchemaDefObj> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelSchemaDefObj ref = obj.getOptionalLookupDefSchema();
					ReadOnlyObjectWrapper<IBusModelSchemaDefObj> observable = new ReadOnlyObjectWrapper<IBusModelSchemaDefObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,IBusModelSchemaDefObj>,TableCell<IBusModelRelationObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelRelationObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelRelationObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelRelationObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		tableColumnLookupFromIndex = new TableColumn<IBusModelRelationObj, IBusModelIndexObj>( "From Index" );
		tableColumnLookupFromIndex.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,IBusModelIndexObj>,ObservableValue<IBusModelIndexObj> >() {
			public ObservableValue<IBusModelIndexObj> call( CellDataFeatures<IBusModelRelationObj, IBusModelIndexObj> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelIndexObj ref = obj.getRequiredLookupFromIndex();
					ReadOnlyObjectWrapper<IBusModelIndexObj> observable = new ReadOnlyObjectWrapper<IBusModelIndexObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupFromIndex.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,IBusModelIndexObj>,TableCell<IBusModelRelationObj,IBusModelIndexObj>>() {
			@Override public TableCell<IBusModelRelationObj,IBusModelIndexObj> call(
				TableColumn<IBusModelRelationObj,IBusModelIndexObj> arg)
			{
				return new CFReferenceTableCell<IBusModelRelationObj,IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupFromIndex );
		tableColumnLookupToTable = new TableColumn<IBusModelRelationObj, IBusModelTableObj>( "To Table" );
		tableColumnLookupToTable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,IBusModelTableObj>,ObservableValue<IBusModelTableObj> >() {
			public ObservableValue<IBusModelTableObj> call( CellDataFeatures<IBusModelRelationObj, IBusModelTableObj> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelTableObj ref = obj.getRequiredLookupToTable();
					ReadOnlyObjectWrapper<IBusModelTableObj> observable = new ReadOnlyObjectWrapper<IBusModelTableObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupToTable.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,IBusModelTableObj>,TableCell<IBusModelRelationObj,IBusModelTableObj>>() {
			@Override public TableCell<IBusModelRelationObj,IBusModelTableObj> call(
				TableColumn<IBusModelRelationObj,IBusModelTableObj> arg)
			{
				return new CFReferenceTableCell<IBusModelRelationObj,IBusModelTableObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupToTable );
		tableColumnLookupToIndex = new TableColumn<IBusModelRelationObj, IBusModelIndexObj>( "To Index" );
		tableColumnLookupToIndex.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,IBusModelIndexObj>,ObservableValue<IBusModelIndexObj> >() {
			public ObservableValue<IBusModelIndexObj> call( CellDataFeatures<IBusModelRelationObj, IBusModelIndexObj> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelIndexObj ref = obj.getRequiredLookupToIndex();
					ReadOnlyObjectWrapper<IBusModelIndexObj> observable = new ReadOnlyObjectWrapper<IBusModelIndexObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupToIndex.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,IBusModelIndexObj>,TableCell<IBusModelRelationObj,IBusModelIndexObj>>() {
			@Override public TableCell<IBusModelRelationObj,IBusModelIndexObj> call(
				TableColumn<IBusModelRelationObj,IBusModelIndexObj> arg)
			{
				return new CFReferenceTableCell<IBusModelRelationObj,IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupToIndex );
		tableColumnLookupNarrowed = new TableColumn<IBusModelRelationObj, IBusModelRelationObj>( "Narrowed Relation" );
		tableColumnLookupNarrowed.setCellValueFactory( new Callback<CellDataFeatures<IBusModelRelationObj,IBusModelRelationObj>,ObservableValue<IBusModelRelationObj> >() {
			public ObservableValue<IBusModelRelationObj> call( CellDataFeatures<IBusModelRelationObj, IBusModelRelationObj> p ) {
				IBusModelRelationObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelRelationObj ref = obj.getOptionalLookupNarrowed();
					ReadOnlyObjectWrapper<IBusModelRelationObj> observable = new ReadOnlyObjectWrapper<IBusModelRelationObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupNarrowed.setCellFactory( new Callback<TableColumn<IBusModelRelationObj,IBusModelRelationObj>,TableCell<IBusModelRelationObj,IBusModelRelationObj>>() {
			@Override public TableCell<IBusModelRelationObj,IBusModelRelationObj> call(
				TableColumn<IBusModelRelationObj,IBusModelRelationObj> arg)
			{
				return new CFReferenceTableCell<IBusModelRelationObj,IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupNarrowed );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelRelationObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelRelationObj> observable,
					IBusModelRelationObj oldValue,
					IBusModelRelationObj newValue )
				{
					setJavaFXFocus( newValue );
				}
			});

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( getPanelHBoxMenu() );

		setTop( scrollMenu );
		setCenter( dataTable );
		javafxIsInitializing = false;
		if( observableListOfRelation != null ) {
			dataTable.setItems( observableListOfRelation );
		}
		adjustListButtons();
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public IBusModelJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelRelationObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelRelationObj" );
		}
		adjustListButtons();
	}

	public IBusModelRelationObj getJavaFXFocusAsRelation() {
		return( (IBusModelRelationObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsRelation( IBusModelRelationObj value ) {
		setJavaFXFocus( value );
	}

	public class RelationByQualNameComparator
	implements Comparator<IBusModelRelationObj>
	{
		public RelationByQualNameComparator() {
		}

		public int compare( IBusModelRelationObj lhs, IBusModelRelationObj rhs ) {
			if( lhs == null ) {
				if( rhs == null ) {
					return( 0 );
				}
				else {
					return( -1 );
				}
			}
			else if( rhs == null ) {
				return( 1 );
			}
			else {
				String lhsValue = lhs.getObjQualifiedName();
				String rhsValue = rhs.getObjQualifiedName();
				if( lhsValue == null ) {
					if( rhsValue == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhsValue == null ) {
					return( 1 );
				}
				else {
					return( lhsValue.compareTo( rhsValue ) );
				}
			}
		}
	}

	protected RelationByQualNameComparator compareRelationByQualName = new RelationByQualNameComparator();

	public Collection<IBusModelRelationObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelRelationObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfRelation = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelRelationObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfRelation.add( iter.next() );
				}
				observableListOfRelation.sort( compareRelationByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfRelation );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	protected class CompareCFButtonByText
	implements Comparator<CFButton>
	{
		public CompareCFButtonByText() {
		}

		@Override public int compare( CFButton lhs, CFButton rhs ) {
			if( lhs == null ) {
				if( rhs == null ) {
					return( 0 );
				}
				else {
					return( -1 );
				}
			}
			else if( rhs == null ) {
				return( 1 );
			}
			else {
				int retval = lhs.getText().compareTo( rhs.getText() );
				return( retval );
			}
		}
	}

	public CFHBox getPanelHBoxMenu() {
		if( hboxMenu == null ) {
			hboxMenu = new CFHBox( 10 );
			buttonAddRelation = new CFButton();
			buttonAddRelation.setMinWidth( 200 );
			buttonAddRelation.setText( "Add Relation" );
			buttonAddRelation.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelRelationObj obj = (IBusModelRelationObj)schemaObj.getRelationTableObj().newInstance();
						IBusModelRelationEditObj edit = (IBusModelRelationEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerFromTable( container );
						CFBorderPane frame = javafxSchema.getRelationFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXRelationPaneCommon jpanelCommon = (IBusModelJavaFXRelationPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddRelation );
			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelRelationObj selectedInstance = getJavaFXFocusAsRelation();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelRelation.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getRelationFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelRelationObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonViewSelected );

			buttonEditSelected = new CFButton();
			buttonEditSelected.setMinWidth( 200 );
			buttonEditSelected.setText( "Edit Selected" );
			buttonEditSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelRelationObj selectedInstance = getJavaFXFocusAsRelation();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelRelation.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getRelationFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelRelationObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonEditSelected );

			buttonDeleteSelected = new CFButton();
			buttonDeleteSelected.setMinWidth( 200 );
			buttonDeleteSelected.setText( "Delete Selected" );
			buttonDeleteSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelRelationObj selectedInstance = getJavaFXFocusAsRelation();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelRelation.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getRelationFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelRelationObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonDeleteSelected );

		}
		return( hboxMenu );
	}

	public IBusModelTableObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelTableObj value ) {
		javafxContainer = value;
	}

	public void refreshMe() {
		if( javafxRefreshCallback != null ) {
			javafxRefreshCallback.refreshMe();
		}
	}

	public void adjustListButtons() {
		boolean enableState;
		boolean inEditState;
		boolean allowAdds;
		boolean inAddMode = false;
		IBusModelRelationObj selectedObj = getJavaFXFocusAsRelation();
		CFPane.PaneMode mode = getPaneMode();
		if( mode == CFPane.PaneMode.Edit ) {
			inEditState = true;
			allowAdds = false;
		}
		else {
			inEditState = false;
			if( getJavaFXContainer() != null ) {
				if( getLeft() != null ) {
					allowAdds = false;
					inAddMode = true;
				}
				else {
					allowAdds = true;
				}
			}
			else {
				allowAdds = false;
			}
		}
		if( selectedObj == null ) {
			enableState = false;
		}
		else {
			if( ( ! inAddMode ) && ( ! inEditState ) ) {
				enableState = true;
			}
			else {
				enableState = false;
			}
		}

		if( buttonViewSelected != null ) {
			buttonViewSelected.setDisable( ! enableState );
		}
		if( buttonEditSelected != null ) {
			if( inEditState ) {
				buttonEditSelected.setDisable( true );
			}
			else {
				buttonEditSelected.setDisable( ! enableState );
			}
		}
		if( buttonDeleteSelected != null ) {
			buttonDeleteSelected.setDisable( ! enableState );
		}
		if( buttonAddRelation != null ) {
			buttonAddRelation.setDisable( ! allowAdds );
		}

	}
}
