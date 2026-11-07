// Description: Java 25 JavaFX Picker of Obj Pane implementation for DbKeyHash384Type.

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
import java.text.*;
import java.util.*;
import java.util.List;
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
 *	BusModelJavaFXDbKeyHash384TypePickerPane JavaFX Pick Obj Pane implementation
 *	for DbKeyHash384Type.
 */
public class BusModelJavaFXDbKeyHash384TypePickerPane
extends CFBorderPane
implements IBusModelJavaFXDbKeyHash384TypePaneList
{
	public static String S_FormName = "Choose DbKeyHash384Type";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelDbKeyHash384TypeObj> javafxDataCollection = null;
	protected ObservableList<IBusModelDbKeyHash384TypeObj> observableListOfDbKeyHash384Type = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj,String> tableColumnObjKind = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnName = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, String> tableColumnInitValue = null;
	protected TableColumn<IBusModelDbKeyHash384TypeObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<IBusModelDbKeyHash384TypeObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXDbKeyHash384TypeChosen invokeWhenChosen = null;
	protected IBusModelSchemaDefObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public BusModelJavaFXDbKeyHash384TypePickerPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelDbKeyHash384TypeObj argFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelDbKeyHash384TypeObj> argDataCollection,
		IBusModelJavaFXDbKeyHash384TypeChosen whenChosen )
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
		if( whenChosen == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				6,
				"whenChosen" );
		}
		invokeWhenChosen = whenChosen;
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		javafxContainer = argContainer;
		setJavaFXDataCollection( argDataCollection );
		dataTable = new TableView<IBusModelDbKeyHash384TypeObj>();
		tableColumnObjKind = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
				IBusModelDbKeyHash384TypeObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<IBusModelDbKeyHash384TypeObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,ICFKeyHash256>,TableCell<IBusModelDbKeyHash384TypeObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,ICFKeyHash256> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<IBusModelDbKeyHash384TypeObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,Boolean>,TableCell<IBusModelDbKeyHash384TypeObj,Boolean>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,Boolean> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<IBusModelDbKeyHash384TypeObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,Boolean>,TableCell<IBusModelDbKeyHash384TypeObj,Boolean>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,Boolean> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<IBusModelDbKeyHash384TypeObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,Boolean>,TableCell<IBusModelDbKeyHash384TypeObj,Boolean>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,Boolean> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<IBusModelDbKeyHash384TypeObj,String>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, String> p ) {
				IBusModelDbKeyHash384DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,String>,TableCell<IBusModelDbKeyHash384TypeObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,String> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnLookupDefSchema = new TableColumn<IBusModelDbKeyHash384TypeObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384TypeObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelDbKeyHash384TypeObj, IBusModelSchemaDefObj> p ) {
				IBusModelDbKeyHash384TypeObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384TypeObj,IBusModelSchemaDefObj>,TableCell<IBusModelDbKeyHash384TypeObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelDbKeyHash384TypeObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelDbKeyHash384TypeObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelDbKeyHash384TypeObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelDbKeyHash384TypeObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelDbKeyHash384TypeObj> observable,
					IBusModelDbKeyHash384TypeObj oldValue,
					IBusModelDbKeyHash384TypeObj newValue )
				{
					setJavaFXFocus( newValue );
					if( buttonChooseSelected != null ) {
						if( newValue != null ) {
							buttonChooseSelected.setDisable( false );
						}
						else {
							buttonChooseSelected.setDisable( true );
						}
					}
				}
			});
		hboxMenu = new CFHBox( 10 );
		buttonCancel = new CFButton();
		buttonCancel.setMinWidth( 200 );
		buttonCancel.setText( "Cancel" );
		buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
			@Override public void handle( ActionEvent e ) {
				final String S_ProcName = "handle";
				try {
					cfFormManager.closeCurrentForm();
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		hboxMenu.getChildren().add( buttonCancel );
		buttonChooseNone = new CFButton();
		buttonChooseNone.setMinWidth( 200 );
		buttonChooseNone.setText( "ChooseNone" );
		buttonChooseNone.setOnAction( new EventHandler<ActionEvent>() {
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
					invokeWhenChosen.choseDbKeyHash384Type( null );
					cfFormManager.closeCurrentForm();
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		hboxMenu.getChildren().add( buttonChooseNone );
		buttonChooseSelected = new CFButton();
		buttonChooseSelected.setMinWidth( 200 );
		buttonChooseSelected.setText( "ChooseSelected" );
		buttonChooseSelected.setOnAction( new EventHandler<ActionEvent>() {
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
					IBusModelDbKeyHash384TypeObj selectedInstance = getJavaFXFocusAsDbKeyHash384Type();
					invokeWhenChosen.choseDbKeyHash384Type( selectedInstance );
					cfFormManager.closeCurrentForm();
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		hboxMenu.getChildren().add( buttonChooseSelected );
		if( argFocus != null ) {
			dataTable.getSelectionModel().select( argFocus );
		}

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( hboxMenu );

		setTop( scrollMenu );
		setCenter( dataTable );
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

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelDbKeyHash384TypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelDbKeyHash384TypeObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public IBusModelDbKeyHash384TypeObj getJavaFXFocusAsDbKeyHash384Type() {
		return( (IBusModelDbKeyHash384TypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDbKeyHash384Type( IBusModelDbKeyHash384TypeObj value ) {
		setJavaFXFocus( value );
	}

	public class DbKeyHash384TypeByQualNameComparator
	implements Comparator<IBusModelDbKeyHash384TypeObj>
	{
		public DbKeyHash384TypeByQualNameComparator() {
		}

		public int compare( IBusModelDbKeyHash384TypeObj lhs, IBusModelDbKeyHash384TypeObj rhs ) {
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

	protected DbKeyHash384TypeByQualNameComparator compareDbKeyHash384TypeByQualName = new DbKeyHash384TypeByQualNameComparator();

	public Collection<IBusModelDbKeyHash384TypeObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelDbKeyHash384TypeObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfDbKeyHash384Type = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelDbKeyHash384TypeObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfDbKeyHash384Type.add( iter.next() );
				}
				observableListOfDbKeyHash384Type.sort( compareDbKeyHash384TypeByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfDbKeyHash384Type );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public IBusModelSchemaDefObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelSchemaDefObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		IBusModelDbKeyHash384TypeObj selectedObj = getJavaFXFocusAsDbKeyHash384Type();
		if( selectedObj == null ) {
			enableState = false;
		}
		else {
			enableState = true;
		}

		if( buttonChooseSelected != null ) {
			buttonChooseSelected.setDisable( ! enableState );
		}
		if( buttonChooseNone != null ) {
			buttonChooseNone.setDisable( false );
		}
		if( buttonCancel != null ) {
			buttonCancel.setDisable( false );
		}

	}
}

