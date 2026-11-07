// Description: Java 25 JavaFX List of Obj Pane implementation for ServerProc.

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
 *	BusModelJavaFXServerProcListPane JavaFX List of Obj Pane implementation
 *	for ServerProc.
 */
public class BusModelJavaFXServerProcListPane
extends CFBorderPane
implements IBusModelJavaFXServerProcPaneList
{
	public static String S_FormName = "List ServerProc";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelServerProcObj> javafxDataCollection = null;
	protected ObservableList<IBusModelServerProcObj> observableListOfServerProc = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddServerProc = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelServerProcObj> dataTable = null;
	protected TableColumn<IBusModelServerProcObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnName = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnSuffix = null;
	protected TableColumn<IBusModelServerProcObj, Boolean> tableColumnIsInstanceMethod = null;
	protected TableColumn<IBusModelServerProcObj, Boolean> tableColumnIsServerOnly = null;
	protected TableColumn<IBusModelServerProcObj, IBusModelPubSchema.CodeVisibilityEnum> tableColumnCodeVis = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnJMethodBody = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnCppMethodBody = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnCsMethodBody = null;
	protected TableColumn<IBusModelServerProcObj, String> tableColumnDummy = null;
	protected TableColumn<IBusModelServerProcObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public BusModelJavaFXServerProcListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelTableObj argContainer,
		IBusModelServerProcObj argFocus,
		Collection<IBusModelServerProcObj> argDataCollection,
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
		dataTable = new TableView<IBusModelServerProcObj>();
		tableColumnId = new TableColumn<IBusModelServerProcObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelServerProcObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,ICFKeyHash256>,TableCell<IBusModelServerProcObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelServerProcObj,ICFKeyHash256> call(
				TableColumn<IBusModelServerProcObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelServerProcObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelServerProcObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelServerProcObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelServerProcObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelServerProcObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnSuffix = new TableColumn<IBusModelServerProcObj,String>( "Suffix" );
		tableColumnSuffix.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnSuffix.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSuffix );
		tableColumnIsInstanceMethod = new TableColumn<IBusModelServerProcObj,Boolean>( "Is Instance Method" );
		tableColumnIsInstanceMethod.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelServerProcObj, Boolean> p ) {
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
		tableColumnIsInstanceMethod.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,Boolean>,TableCell<IBusModelServerProcObj,Boolean>>() {
			@Override public TableCell<IBusModelServerProcObj,Boolean> call(
				TableColumn<IBusModelServerProcObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsInstanceMethod );
		tableColumnIsServerOnly = new TableColumn<IBusModelServerProcObj,Boolean>( "Is Server Only" );
		tableColumnIsServerOnly.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelServerProcObj, Boolean> p ) {
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
		tableColumnIsServerOnly.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,Boolean>,TableCell<IBusModelServerProcObj,Boolean>>() {
			@Override public TableCell<IBusModelServerProcObj,Boolean> call(
				TableColumn<IBusModelServerProcObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsServerOnly );
		tableColumnCodeVis = new TableColumn<IBusModelServerProcObj,IBusModelPubSchema.CodeVisibilityEnum>( "Method Code Visibility" );
		tableColumnCodeVis.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,IBusModelPubSchema.CodeVisibilityEnum>,ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> >() {
			public ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> call( CellDataFeatures<IBusModelServerProcObj, IBusModelPubSchema.CodeVisibilityEnum> p ) {
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
		tableColumnCodeVis.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,IBusModelPubSchema.CodeVisibilityEnum>,TableCell<IBusModelServerProcObj,IBusModelPubSchema.CodeVisibilityEnum>>() {
			@Override public TableCell<IBusModelServerProcObj,IBusModelPubSchema.CodeVisibilityEnum> call(
				TableColumn<IBusModelServerProcObj,IBusModelPubSchema.CodeVisibilityEnum> arg)
			{
				return new CFEnumTableCell<IBusModelServerProcObj,IBusModelSchema.CodeVisibilityEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnCodeVis );
		tableColumnJMethodBody = new TableColumn<IBusModelServerProcObj,String>( "Java Method Body" );
		tableColumnJMethodBody.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnJMethodBody.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFTextTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnJMethodBody );
		tableColumnCppMethodBody = new TableColumn<IBusModelServerProcObj,String>( "C++ Method Body" );
		tableColumnCppMethodBody.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnCppMethodBody.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFTextTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCppMethodBody );
		tableColumnCsMethodBody = new TableColumn<IBusModelServerProcObj,String>( "C-Sharp Method Body" );
		tableColumnCsMethodBody.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
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
		tableColumnCsMethodBody.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFTextTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCsMethodBody );
		tableColumnDummy = new TableColumn<IBusModelServerProcObj,String>( "Dummy" );
		tableColumnDummy.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelServerProcObj, String> p ) {
				IBusModelServerProcObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDummy();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDummy.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,String>,TableCell<IBusModelServerProcObj,String>>() {
			@Override public TableCell<IBusModelServerProcObj,String> call(
				TableColumn<IBusModelServerProcObj,String> arg)
			{
				return new CFStringTableCell<IBusModelServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDummy );
		tableColumnLookupDefSchema = new TableColumn<IBusModelServerProcObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelServerProcObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelServerProcObj, IBusModelSchemaDefObj> p ) {
				IBusModelServerProcObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelServerProcObj,IBusModelSchemaDefObj>,TableCell<IBusModelServerProcObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelServerProcObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelServerProcObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelServerProcObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelServerProcObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelServerProcObj> observable,
					IBusModelServerProcObj oldValue,
					IBusModelServerProcObj newValue )
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
		if( observableListOfServerProc != null ) {
			dataTable.setItems( observableListOfServerProc );
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
		if( ( value == null ) || ( value instanceof IBusModelServerProcObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelServerProcObj" );
		}
		adjustListButtons();
	}

	public IBusModelServerProcObj getJavaFXFocusAsServerProc() {
		return( (IBusModelServerProcObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsServerProc( IBusModelServerProcObj value ) {
		setJavaFXFocus( value );
	}

	public class ServerProcByQualNameComparator
	implements Comparator<IBusModelServerProcObj>
	{
		public ServerProcByQualNameComparator() {
		}

		public int compare( IBusModelServerProcObj lhs, IBusModelServerProcObj rhs ) {
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

	protected ServerProcByQualNameComparator compareServerProcByQualName = new ServerProcByQualNameComparator();

	public Collection<IBusModelServerProcObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelServerProcObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfServerProc = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelServerProcObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfServerProc.add( iter.next() );
				}
				observableListOfServerProc.sort( compareServerProcByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfServerProc );
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
			buttonAddServerProc = new CFButton();
			buttonAddServerProc.setMinWidth( 200 );
			buttonAddServerProc.setText( "Add ServerProc" );
			buttonAddServerProc.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelServerProcObj obj = (IBusModelServerProcObj)schemaObj.getServerProcTableObj().newInstance();
						IBusModelServerProcEditObj edit = (IBusModelServerProcEditObj)( obj.beginEdit() );
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
						CFBorderPane frame = javafxSchema.getServerProcFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXServerProcPaneCommon jpanelCommon = (IBusModelJavaFXServerProcPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddServerProc );
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
						IBusModelServerProcObj selectedInstance = getJavaFXFocusAsServerProc();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerProc.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelServerProcObj" );
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
						IBusModelServerProcObj selectedInstance = getJavaFXFocusAsServerProc();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerProc.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelServerProcObj" );
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
						IBusModelServerProcObj selectedInstance = getJavaFXFocusAsServerProc();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerProc.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getServerProcFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelServerProcObj" );
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
		IBusModelServerProcObj selectedObj = getJavaFXFocusAsServerProc();
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
		if( buttonAddServerProc != null ) {
			buttonAddServerProc.setDisable( ! allowAdds );
		}

	}
}
