// Description: Java 25 JavaFX List of Obj Pane implementation for DbKeyHash384Def.

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
 *	BusModelJavaFXDbKeyHash384DefListPane JavaFX List of Obj Pane implementation
 *	for DbKeyHash384Def.
 */
public class BusModelJavaFXDbKeyHash384DefListPane
extends CFBorderPane
implements IBusModelJavaFXDbKeyHash384DefPaneList
{
	public static String S_FormName = "List DbKeyHash384Def";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelDbKeyHash384DefObj> javafxDataCollection = null;
	protected ObservableList<IBusModelDbKeyHash384DefObj> observableListOfDbKeyHash384Def = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddDbKeyHash384Col = null;
	protected CFButton buttonAddDbKeyHash384Type = null;
	protected CFButton buttonAddDbKeyHash384Gen = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelDbKeyHash384DefObj> dataTable = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj,String> tableColumnObjKind = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnName = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, String> tableColumnInitValue = null;
	protected TableColumn<IBusModelDbKeyHash384DefObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public BusModelJavaFXDbKeyHash384DefListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelScopeObj argContainer,
		IBusModelDbKeyHash384DefObj argFocus,
		Collection<IBusModelDbKeyHash384DefObj> argDataCollection,
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
		dataTable = new TableView<IBusModelDbKeyHash384DefObj>();
		tableColumnObjKind = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
				IBusModelDbKeyHash384DefObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<IBusModelDbKeyHash384DefObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,ICFKeyHash256>,TableCell<IBusModelDbKeyHash384DefObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,ICFKeyHash256> call(
				TableColumn<IBusModelDbKeyHash384DefObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<IBusModelDbKeyHash384DefObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,Boolean>,TableCell<IBusModelDbKeyHash384DefObj,Boolean>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,Boolean> call(
				TableColumn<IBusModelDbKeyHash384DefObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<IBusModelDbKeyHash384DefObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,Boolean>,TableCell<IBusModelDbKeyHash384DefObj,Boolean>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,Boolean> call(
				TableColumn<IBusModelDbKeyHash384DefObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<IBusModelDbKeyHash384DefObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,Boolean>,TableCell<IBusModelDbKeyHash384DefObj,Boolean>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,Boolean> call(
				TableColumn<IBusModelDbKeyHash384DefObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<IBusModelDbKeyHash384DefObj,String>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, String> p ) {
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
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,String>,TableCell<IBusModelDbKeyHash384DefObj,String>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,String> call(
				TableColumn<IBusModelDbKeyHash384DefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelDbKeyHash384DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnLookupDefSchema = new TableColumn<IBusModelDbKeyHash384DefObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelDbKeyHash384DefObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelDbKeyHash384DefObj, IBusModelSchemaDefObj> p ) {
				IBusModelDbKeyHash384DefObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelDbKeyHash384DefObj,IBusModelSchemaDefObj>,TableCell<IBusModelDbKeyHash384DefObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelDbKeyHash384DefObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelDbKeyHash384DefObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelDbKeyHash384DefObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelDbKeyHash384DefObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelDbKeyHash384DefObj> observable,
					IBusModelDbKeyHash384DefObj oldValue,
					IBusModelDbKeyHash384DefObj newValue )
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
		if( observableListOfDbKeyHash384Def != null ) {
			dataTable.setItems( observableListOfDbKeyHash384Def );
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
		if( ( value == null ) || ( value instanceof IBusModelDbKeyHash384DefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelDbKeyHash384DefObj" );
		}
		adjustListButtons();
	}

	public IBusModelDbKeyHash384DefObj getJavaFXFocusAsDbKeyHash384Def() {
		return( (IBusModelDbKeyHash384DefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDbKeyHash384Def( IBusModelDbKeyHash384DefObj value ) {
		setJavaFXFocus( value );
	}

	public class DbKeyHash384DefByQualNameComparator
	implements Comparator<IBusModelDbKeyHash384DefObj>
	{
		public DbKeyHash384DefByQualNameComparator() {
		}

		public int compare( IBusModelDbKeyHash384DefObj lhs, IBusModelDbKeyHash384DefObj rhs ) {
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

	protected DbKeyHash384DefByQualNameComparator compareDbKeyHash384DefByQualName = new DbKeyHash384DefByQualNameComparator();

	public Collection<IBusModelDbKeyHash384DefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelDbKeyHash384DefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfDbKeyHash384Def = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelDbKeyHash384DefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfDbKeyHash384Def.add( iter.next() );
				}
				observableListOfDbKeyHash384Def.sort( compareDbKeyHash384DefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfDbKeyHash384Def );
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
					buttonAddDbKeyHash384Col = new CFButton();
					buttonAddDbKeyHash384Col.setMinWidth( 200 );
					buttonAddDbKeyHash384Col.setText( "Add DbKeyHash384Col" );
					buttonAddDbKeyHash384Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)schemaObj.getDbKeyHash384ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash384ColEditObj edit = (IBusModelDbKeyHash384ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash384ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash384ColPaneCommon)frame;
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
						list.add( buttonAddDbKeyHash384Col );
					}
					buttonAddDbKeyHash384Type = new CFButton();
					buttonAddDbKeyHash384Type.setMinWidth( 200 );
					buttonAddDbKeyHash384Type.setText( "Add DbKeyHash384Type" );
					buttonAddDbKeyHash384Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)schemaObj.getDbKeyHash384TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash384TypeEditObj edit = (IBusModelDbKeyHash384TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash384TypePaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash384TypePaneCommon)frame;
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
						list.add( buttonAddDbKeyHash384Type );
					}
					buttonAddDbKeyHash384Gen = new CFButton();
					buttonAddDbKeyHash384Gen.setMinWidth( 200 );
					buttonAddDbKeyHash384Gen.setText( "Add DbKeyHash384Gen" );
					buttonAddDbKeyHash384Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)schemaObj.getDbKeyHash384GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash384GenEditObj edit = (IBusModelDbKeyHash384GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash384GenPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash384GenPaneCommon)frame;
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
						list.add( buttonAddDbKeyHash384Gen );
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
						IBusModelDbKeyHash384DefObj selectedInstance = getJavaFXFocusAsDbKeyHash384Def();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Def.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getDbKeyHash384DefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Col.CLASS_CODE ) {
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Type.CLASS_CODE ) {
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Gen.CLASS_CODE ) {
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelDbKeyHash384DefObj, IBusModelDbKeyHash384ColObj, IBusModelDbKeyHash384TypeObj, IBusModelDbKeyHash384GenObj" );
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
						IBusModelDbKeyHash384DefObj selectedInstance = getJavaFXFocusAsDbKeyHash384Def();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Def.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getDbKeyHash384DefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Col.CLASS_CODE ) {
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Type.CLASS_CODE ) {
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Gen.CLASS_CODE ) {
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelDbKeyHash384DefObj, IBusModelDbKeyHash384ColObj, IBusModelDbKeyHash384TypeObj, IBusModelDbKeyHash384GenObj" );
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
						IBusModelDbKeyHash384DefObj selectedInstance = getJavaFXFocusAsDbKeyHash384Def();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Def.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getDbKeyHash384DefFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Col.CLASS_CODE ) {
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Type.CLASS_CODE ) {
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Gen.CLASS_CODE ) {
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelDbKeyHash384DefObj, IBusModelDbKeyHash384ColObj, IBusModelDbKeyHash384TypeObj, IBusModelDbKeyHash384GenObj" );
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
		IBusModelDbKeyHash384DefObj selectedObj = getJavaFXFocusAsDbKeyHash384Def();
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
