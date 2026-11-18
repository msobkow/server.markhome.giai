// Description: Java 25 JavaFX List of Obj Pane implementation for ServerObjFunc.

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
 *	BusModelJavaFXServerObjFuncListPane JavaFX List of Obj Pane implementation
 *	for ServerObjFunc.
 */
public class BusModelJavaFXServerObjFuncListPane
extends CFBorderPane
implements IBusModelJavaFXServerObjFuncPaneList
{
	public static String S_FormName = "List ServerObjFunc";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelServerObjFuncObj> javafxDataCollection = null;
	protected ObservableList<IBusModelServerObjFuncObj> observableListOfServerObjFunc = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddServerObjFunc = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelServerObjFuncObj> dataTable = null;
	protected TableColumn<IBusModelServerObjFuncObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnName = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnSuffix = null;
	protected TableColumn<IBusModelServerObjFuncObj, Boolean> tableColumnIsInstanceMethod = null;
	protected TableColumn<IBusModelServerObjFuncObj, Boolean> tableColumnIsServerOnly = null;
	protected TableColumn<IBusModelServerObjFuncObj, IBusModelPubSchema.CodeVisibilityEnum> tableColumnCodeVis = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnJMethodBody = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnCppMethodBody = null;
	protected TableColumn<IBusModelServerObjFuncObj, String> tableColumnCsMethodBody = null;
	protected TableColumn<IBusModelServerObjFuncObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableColumn<IBusModelServerObjFuncObj, IBusModelTableObj> tableColumnLookupRetTable = null;

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


	public BusModelJavaFXServerObjFuncListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelTableObj argContainer,
		IBusModelServerObjFuncObj argFocus,
		Collection<IBusModelServerObjFuncObj> argDataCollection,
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
		dataTable = new TableView<IBusModelServerObjFuncObj>();
		tableColumnId = new TableColumn<IBusModelServerObjFuncObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelServerObjFuncObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,ICFKeyHash256>,TableCell<IBusModelServerObjFuncObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,ICFKeyHash256> call(
				TableColumn<IBusModelServerObjFuncObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelServerObjFuncObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelServerObjFuncObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelServerObjFuncObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelServerObjFuncObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelServerObjFuncObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnSuffix = new TableColumn<IBusModelServerObjFuncObj,String>( "Suffix" );
		tableColumnSuffix.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
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
		tableColumnSuffix.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSuffix );
		tableColumnIsInstanceMethod = new TableColumn<IBusModelServerObjFuncObj,Boolean>( "Is Instance Method" );
		tableColumnIsInstanceMethod.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelServerObjFuncObj, Boolean> p ) {
				IBusModelServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsInstanceMethod();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsInstanceMethod.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,Boolean>,TableCell<IBusModelServerObjFuncObj,Boolean>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,Boolean> call(
				TableColumn<IBusModelServerObjFuncObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsInstanceMethod );
		tableColumnIsServerOnly = new TableColumn<IBusModelServerObjFuncObj,Boolean>( "Is Server Only" );
		tableColumnIsServerOnly.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelServerObjFuncObj, Boolean> p ) {
				IBusModelServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsServerOnly();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsServerOnly.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,Boolean>,TableCell<IBusModelServerObjFuncObj,Boolean>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,Boolean> call(
				TableColumn<IBusModelServerObjFuncObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsServerOnly );
		tableColumnCodeVis = new TableColumn<IBusModelServerObjFuncObj,IBusModelPubSchema.CodeVisibilityEnum>( "Method Code Visibility" );
		tableColumnCodeVis.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,IBusModelPubSchema.CodeVisibilityEnum>,ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> >() {
			public ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> call( CellDataFeatures<IBusModelServerObjFuncObj, IBusModelPubSchema.CodeVisibilityEnum> p ) {
				IBusModelServerMethodObj obj = p.getValue();
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
		tableColumnCodeVis.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,IBusModelPubSchema.CodeVisibilityEnum>,TableCell<IBusModelServerObjFuncObj,IBusModelPubSchema.CodeVisibilityEnum>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,IBusModelPubSchema.CodeVisibilityEnum> call(
				TableColumn<IBusModelServerObjFuncObj,IBusModelPubSchema.CodeVisibilityEnum> arg)
			{
				return new CFEnumTableCell<IBusModelServerObjFuncObj,IBusModelSchema.CodeVisibilityEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnCodeVis );
		tableColumnJMethodBody = new TableColumn<IBusModelServerObjFuncObj,String>( "Java Method Body" );
		tableColumnJMethodBody.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredJMethodBody();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnJMethodBody.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFTextTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnJMethodBody );
		tableColumnCppMethodBody = new TableColumn<IBusModelServerObjFuncObj,String>( "C++ Method Body" );
		tableColumnCppMethodBody.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredCppMethodBody();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnCppMethodBody.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFTextTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCppMethodBody );
		tableColumnCsMethodBody = new TableColumn<IBusModelServerObjFuncObj,String>( "C-Sharp Method Body" );
		tableColumnCsMethodBody.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerObjFuncObj, String> p ) {
				IBusModelServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredCsMethodBody();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnCsMethodBody.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,String>,TableCell<IBusModelServerObjFuncObj,String>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,String> call(
				TableColumn<IBusModelServerObjFuncObj,String> arg)
			{
				return new CFTextTableCell<IBusModelServerObjFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCsMethodBody );
		tableColumnLookupDefSchema = new TableColumn<IBusModelServerObjFuncObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelServerObjFuncObj, IBusModelSchemaDefObj> p ) {
				IBusModelServerObjFuncObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,IBusModelSchemaDefObj>,TableCell<IBusModelServerObjFuncObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelServerObjFuncObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelServerObjFuncObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		tableColumnLookupRetTable = new TableColumn<IBusModelServerObjFuncObj, IBusModelTableObj>( "Ret Table" );
		tableColumnLookupRetTable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerObjFuncObj,IBusModelTableObj>,ObservableValue<IBusModelTableObj> >() {
			public ObservableValue<IBusModelTableObj> call( CellDataFeatures<IBusModelServerObjFuncObj, IBusModelTableObj> p ) {
				IBusModelServerObjFuncObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelTableObj ref = obj.getOptionalLookupRetTable();
					ReadOnlyObjectWrapper<IBusModelTableObj> observable = new ReadOnlyObjectWrapper<IBusModelTableObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupRetTable.setCellFactory( new Callback<TableColumn<IBusModelServerObjFuncObj,IBusModelTableObj>,TableCell<IBusModelServerObjFuncObj,IBusModelTableObj>>() {
			@Override public TableCell<IBusModelServerObjFuncObj,IBusModelTableObj> call(
				TableColumn<IBusModelServerObjFuncObj,IBusModelTableObj> arg)
			{
				return new CFReferenceTableCell<IBusModelServerObjFuncObj,IBusModelTableObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRetTable );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelServerObjFuncObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelServerObjFuncObj> observable,
					IBusModelServerObjFuncObj oldValue,
					IBusModelServerObjFuncObj newValue )
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
		if( observableListOfServerObjFunc != null ) {
			dataTable.setItems( observableListOfServerObjFunc );
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
		if( ( value == null ) || ( value instanceof IBusModelServerObjFuncObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelServerObjFuncObj" );
		}
		adjustListButtons();
	}

	public IBusModelServerObjFuncObj getJavaFXFocusAsServerObjFunc() {
		return( (IBusModelServerObjFuncObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsServerObjFunc( IBusModelServerObjFuncObj value ) {
		setJavaFXFocus( value );
	}

	public class ServerObjFuncByQualNameComparator
	implements Comparator<IBusModelServerObjFuncObj>
	{
		public ServerObjFuncByQualNameComparator() {
		}

		public int compare( IBusModelServerObjFuncObj lhs, IBusModelServerObjFuncObj rhs ) {
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

	protected ServerObjFuncByQualNameComparator compareServerObjFuncByQualName = new ServerObjFuncByQualNameComparator();

	public Collection<IBusModelServerObjFuncObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelServerObjFuncObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfServerObjFunc = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelServerObjFuncObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfServerObjFunc.add( iter.next() );
				}
				observableListOfServerObjFunc.sort( compareServerObjFuncByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfServerObjFunc );
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
			buttonAddServerObjFunc = new CFButton();
			buttonAddServerObjFunc.setMinWidth( 200 );
			buttonAddServerObjFunc.setText( "Add ServerObjFunc" );
			buttonAddServerObjFunc.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelServerObjFuncObj obj = (IBusModelServerObjFuncObj)schemaObj.getServerObjFuncTableObj().newInstance();
						IBusModelServerObjFuncEditObj edit = (IBusModelServerObjFuncEditObj)( obj.beginEdit() );
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
								edit.setRequiredContainerForTable( container );
						CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXServerObjFuncPaneCommon jpanelCommon = (IBusModelJavaFXServerObjFuncPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddServerObjFunc );
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
						IBusModelServerObjFuncObj selectedInstance = getJavaFXFocusAsServerObjFunc();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerObjFunc.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelServerObjFuncObj" );
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
						IBusModelServerObjFuncObj selectedInstance = getJavaFXFocusAsServerObjFunc();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerObjFunc.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelServerObjFuncObj" );
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
						IBusModelServerObjFuncObj selectedInstance = getJavaFXFocusAsServerObjFunc();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerObjFunc.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelServerObjFuncObj" );
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
		IBusModelServerObjFuncObj selectedObj = getJavaFXFocusAsServerObjFunc();
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
		if( buttonAddServerObjFunc != null ) {
			buttonAddServerObjFunc.setDisable( ! allowAdds );
		}

	}
}
