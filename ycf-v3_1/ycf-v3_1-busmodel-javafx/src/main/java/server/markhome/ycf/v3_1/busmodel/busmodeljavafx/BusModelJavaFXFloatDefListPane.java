// Description: Java 25 JavaFX List of Obj Pane implementation for FloatDef.

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
 *	BusModelJavaFXFloatDefListPane JavaFX List of Obj Pane implementation
 *	for FloatDef.
 */
public class BusModelJavaFXFloatDefListPane
extends CFBorderPane
implements IBusModelJavaFXFloatDefPaneList
{
	public static String S_FormName = "List FloatDef";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelFloatDefObj> javafxDataCollection = null;
	protected ObservableList<IBusModelFloatDefObj> observableListOfFloatDef = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddFloatType = null;
	protected CFButton buttonAddFloatCol = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelFloatDefObj> dataTable = null;
	protected TableColumn<IBusModelFloatDefObj,String> tableColumnObjKind = null;
	protected TableColumn<IBusModelFloatDefObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelFloatDefObj, String> tableColumnName = null;
	protected TableColumn<IBusModelFloatDefObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelFloatDefObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelFloatDefObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelFloatDefObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelFloatDefObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<IBusModelFloatDefObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<IBusModelFloatDefObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<IBusModelFloatDefObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<IBusModelFloatDefObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelFloatDefObj, Float> tableColumnInitValue = null;
	protected TableColumn<IBusModelFloatDefObj, Float> tableColumnMinValue = null;
	protected TableColumn<IBusModelFloatDefObj, Float> tableColumnMaxValue = null;
	protected TableColumn<IBusModelFloatDefObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected IBusModelScopeObj javafxContainer = null;
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


	public BusModelJavaFXFloatDefListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelScopeObj argContainer,
		IBusModelFloatDefObj argFocus,
		Collection<IBusModelFloatDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( getClass(),
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
		dataTable = new TableView<IBusModelFloatDefObj>();
		tableColumnObjKind = new TableColumn<IBusModelFloatDefObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					int classCode = obj.getClassCode();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( Integer.toString(classCode) );
					return( observable );
				}
			}
		});
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<IBusModelFloatDefObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelFloatDefObj, ICFKeyHash256> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,ICFKeyHash256>,TableCell<IBusModelFloatDefObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelFloatDefObj,ICFKeyHash256> call(
				TableColumn<IBusModelFloatDefObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelFloatDefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelFloatDefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelFloatDefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelFloatDefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelFloatDefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<IBusModelFloatDefObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDefaultXmlValue();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<IBusModelFloatDefObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelFloatDefObj, Boolean> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsNullable();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,Boolean>,TableCell<IBusModelFloatDefObj,Boolean>>() {
			@Override public TableCell<IBusModelFloatDefObj,Boolean> call(
				TableColumn<IBusModelFloatDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<IBusModelFloatDefObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelFloatDefObj, Boolean> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Boolean value = obj.getOptionalGenerateId();
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,Boolean>,TableCell<IBusModelFloatDefObj,Boolean>>() {
			@Override public TableCell<IBusModelFloatDefObj,Boolean> call(
				TableColumn<IBusModelFloatDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<IBusModelFloatDefObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelFloatDefObj, Boolean> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredImplementsPolymorph();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,Boolean>,TableCell<IBusModelFloatDefObj,Boolean>>() {
			@Override public TableCell<IBusModelFloatDefObj,Boolean> call(
				TableColumn<IBusModelFloatDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<IBusModelFloatDefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatDefObj, String> p ) {
				IBusModelAtomObj obj = p.getValue();
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,String>,TableCell<IBusModelFloatDefObj,String>>() {
			@Override public TableCell<IBusModelFloatDefObj,String> call(
				TableColumn<IBusModelFloatDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<IBusModelFloatDefObj,Float>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<IBusModelFloatDefObj, Float> p ) {
				IBusModelFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,Float>,TableCell<IBusModelFloatDefObj,Float>>() {
			@Override public TableCell<IBusModelFloatDefObj,Float> call(
				TableColumn<IBusModelFloatDefObj,Float> arg)
			{
				return new CFFloatTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<IBusModelFloatDefObj,Float>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<IBusModelFloatDefObj, Float> p ) {
				IBusModelFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,Float>,TableCell<IBusModelFloatDefObj,Float>>() {
			@Override public TableCell<IBusModelFloatDefObj,Float> call(
				TableColumn<IBusModelFloatDefObj,Float> arg)
			{
				return new CFFloatTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<IBusModelFloatDefObj,Float>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<IBusModelFloatDefObj, Float> p ) {
				IBusModelFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,Float>,TableCell<IBusModelFloatDefObj,Float>>() {
			@Override public TableCell<IBusModelFloatDefObj,Float> call(
				TableColumn<IBusModelFloatDefObj,Float> arg)
			{
				return new CFFloatTableCell<IBusModelFloatDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<IBusModelFloatDefObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatDefObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelFloatDefObj, IBusModelSchemaDefObj> p ) {
				IBusModelFloatDefObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelFloatDefObj,IBusModelSchemaDefObj>,TableCell<IBusModelFloatDefObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelFloatDefObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelFloatDefObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelFloatDefObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelFloatDefObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelFloatDefObj> observable,
					IBusModelFloatDefObj oldValue,
					IBusModelFloatDefObj newValue )
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
		if( observableListOfFloatDef != null ) {
			dataTable.setItems( observableListOfFloatDef );
		}
		adjustListButtons();
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
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
		if( ( value == null ) || ( value instanceof IBusModelFloatDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelFloatDefObj" );
		}
		adjustListButtons();
	}

	public IBusModelFloatDefObj getJavaFXFocusAsFloatDef() {
		return( (IBusModelFloatDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsFloatDef( IBusModelFloatDefObj value ) {
		setJavaFXFocus( value );
	}

	public class FloatDefByQualNameComparator
	implements Comparator<IBusModelFloatDefObj>
	{
		public FloatDefByQualNameComparator() {
		}

		public int compare( IBusModelFloatDefObj lhs, IBusModelFloatDefObj rhs ) {
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

	protected FloatDefByQualNameComparator compareFloatDefByQualName = new FloatDefByQualNameComparator();

	public Collection<IBusModelFloatDefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelFloatDefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfFloatDef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelFloatDefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfFloatDef.add( iter.next() );
				}
				observableListOfFloatDef.sort( compareFloatDefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfFloatDef );
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
				LinkedList<CFButton> list = new LinkedList<CFButton>();

				vboxMenuAdd = new CFVBox( 10 );
					buttonAddFloatType = new CFButton();
					buttonAddFloatType.setMinWidth( 200 );
					buttonAddFloatType.setText( "Add FloatType" );
					buttonAddFloatType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)schemaObj.getFloatTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelFloatTypeEditObj edit = (IBusModelFloatTypeEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								IBusModelSchemaDefObj container = (IBusModelSchemaDefObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerSchemaDef( container );
								IBusModelJavaFXFloatTypePaneCommon jpanelCommon = (IBusModelJavaFXFloatTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddFloatType );
					}
					buttonAddFloatCol = new CFButton();
					buttonAddFloatCol.setMinWidth( 200 );
					buttonAddFloatCol.setText( "Add FloatCol" );
					buttonAddFloatCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelFloatColObj obj = (IBusModelFloatColObj)schemaObj.getFloatColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getFloatColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelFloatColEditObj edit = (IBusModelFloatColEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								IBusModelJavaFXFloatColPaneCommon jpanelCommon = (IBusModelJavaFXFloatColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddFloatCol );
					}

				int len = list.size();
				CFButton arr[] = new CFButton[len];
				Iterator<CFButton> iter = list.iterator();
				int idx = 0;
				while( iter.hasNext() ) {
					arr[idx++] = iter.next();
				}
				Arrays.sort( arr, new CompareCFButtonByText() );
				for( idx = 0; idx < len; idx ++ ) {
					vboxMenuAdd.getChildren().add( arr[idx] );
				}

				buttonCancelAdd = new CFButton();
				buttonCancelAdd.setMinWidth( 200 );
				buttonCancelAdd.setText( "Cancel Add..." );
				buttonCancelAdd.setOnAction( new EventHandler<ActionEvent>() {
					@Override public void handle( ActionEvent e ) {
						final String S_ProcName = "handle";
						try {
							setLeft( null );
							adjustListButtons();
						}
						catch( Throwable t ) {
							CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
						}
					}
				});
				vboxMenuAdd.getChildren().add( buttonCancelAdd );

				scrollMenuAdd = new ScrollPane();
				scrollMenuAdd.setMinWidth( 240 );
				scrollMenuAdd.setMaxWidth( 240 );
				scrollMenuAdd.setFitToWidth( true );
				scrollMenuAdd.setHbarPolicy( ScrollBarPolicy.NEVER );
				scrollMenuAdd.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
				scrollMenuAdd.setContent( vboxMenuAdd );

			buttonAdd = new CFButton();
			buttonAdd.setMinWidth( 200 );
			buttonAdd.setText( "Add..." );
			buttonAdd.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						setLeft( scrollMenuAdd );
						adjustListButtons();
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAdd );

			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelFloatDefObj selectedInstance = getJavaFXFocusAsFloatDef();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatDef.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getFloatDefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatType.CLASS_CODE ) {
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								IBusModelFloatColObj obj = (IBusModelFloatColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelFloatDefObj, IBusModelFloatTypeObj, IBusModelFloatColObj" );
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
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelFloatDefObj selectedInstance = getJavaFXFocusAsFloatDef();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatDef.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getFloatDefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatType.CLASS_CODE ) {
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								IBusModelFloatColObj obj = (IBusModelFloatColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelFloatDefObj, IBusModelFloatTypeObj, IBusModelFloatColObj" );
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
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelFloatDefObj selectedInstance = getJavaFXFocusAsFloatDef();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatDef.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getFloatDefFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXFloatDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatType.CLASS_CODE ) {
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXFloatTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								IBusModelFloatColObj obj = (IBusModelFloatColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelFloatDefObj, IBusModelFloatTypeObj, IBusModelFloatColObj" );
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

	public IBusModelScopeObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelScopeObj value ) {
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
		IBusModelFloatDefObj selectedObj = getJavaFXFocusAsFloatDef();
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

		if( buttonAdd != null ) {
			buttonAdd.setDisable( ! allowAdds );
		}
	}
}
