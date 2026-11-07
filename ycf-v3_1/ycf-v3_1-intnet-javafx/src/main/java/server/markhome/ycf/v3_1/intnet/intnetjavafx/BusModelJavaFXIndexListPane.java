// Description: Java 25 JavaFX List of Obj Pane implementation for Index.

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
 *	BusModelJavaFXIndexListPane JavaFX List of Obj Pane implementation
 *	for Index.
 */
public class BusModelJavaFXIndexListPane
extends CFBorderPane
implements IBusModelJavaFXIndexPaneList
{
	public static String S_FormName = "List Index";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelIndexObj> javafxDataCollection = null;
	protected ObservableList<IBusModelIndexObj> observableListOfIndex = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddIndex = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelIndexObj> dataTable = null;
	protected TableColumn<IBusModelIndexObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelIndexObj, String> tableColumnName = null;
	protected TableColumn<IBusModelIndexObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelIndexObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelIndexObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelIndexObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelIndexObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelIndexObj, String> tableColumnSuffix = null;
	protected TableColumn<IBusModelIndexObj, Boolean> tableColumnIsUnique = null;
	protected TableColumn<IBusModelIndexObj, Boolean> tableColumnIsDbMapped = null;
	protected TableColumn<IBusModelIndexObj, IBusModelPubSchema.CodeVisibilityEnum> tableColumnCodeVis = null;
	protected TableColumn<IBusModelIndexObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public BusModelJavaFXIndexListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelTableObj argContainer,
		IBusModelIndexObj argFocus,
		Collection<IBusModelIndexObj> argDataCollection,
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
		dataTable = new TableView<IBusModelIndexObj>();
		tableColumnId = new TableColumn<IBusModelIndexObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelIndexObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,ICFKeyHash256>,TableCell<IBusModelIndexObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelIndexObj,ICFKeyHash256> call(
				TableColumn<IBusModelIndexObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelIndexObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexObj, String> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,String>,TableCell<IBusModelIndexObj,String>>() {
			@Override public TableCell<IBusModelIndexObj,String> call(
				TableColumn<IBusModelIndexObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelIndexObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexObj, String> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,String>,TableCell<IBusModelIndexObj,String>>() {
			@Override public TableCell<IBusModelIndexObj,String> call(
				TableColumn<IBusModelIndexObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelIndexObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexObj, String> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,String>,TableCell<IBusModelIndexObj,String>>() {
			@Override public TableCell<IBusModelIndexObj,String> call(
				TableColumn<IBusModelIndexObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelIndexObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexObj, String> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,String>,TableCell<IBusModelIndexObj,String>>() {
			@Override public TableCell<IBusModelIndexObj,String> call(
				TableColumn<IBusModelIndexObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelIndexObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexObj, String> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,String>,TableCell<IBusModelIndexObj,String>>() {
			@Override public TableCell<IBusModelIndexObj,String> call(
				TableColumn<IBusModelIndexObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDbName = new TableColumn<IBusModelIndexObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexObj, String> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,String>,TableCell<IBusModelIndexObj,String>>() {
			@Override public TableCell<IBusModelIndexObj,String> call(
				TableColumn<IBusModelIndexObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnSuffix = new TableColumn<IBusModelIndexObj,String>( "Suffix" );
		tableColumnSuffix.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexObj, String> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnSuffix.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,String>,TableCell<IBusModelIndexObj,String>>() {
			@Override public TableCell<IBusModelIndexObj,String> call(
				TableColumn<IBusModelIndexObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSuffix );
		tableColumnIsUnique = new TableColumn<IBusModelIndexObj,Boolean>( "Is Unique" );
		tableColumnIsUnique.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelIndexObj, Boolean> p ) {
				IBusModelIndexObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsUnique();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsUnique.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,Boolean>,TableCell<IBusModelIndexObj,Boolean>>() {
			@Override public TableCell<IBusModelIndexObj,Boolean> call(
				TableColumn<IBusModelIndexObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsUnique );
		tableColumnIsDbMapped = new TableColumn<IBusModelIndexObj,Boolean>( "Is Db Mapped" );
		tableColumnIsDbMapped.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelIndexObj, Boolean> p ) {
				IBusModelIndexObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsDbMapped();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsDbMapped.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,Boolean>,TableCell<IBusModelIndexObj,Boolean>>() {
			@Override public TableCell<IBusModelIndexObj,Boolean> call(
				TableColumn<IBusModelIndexObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelIndexObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsDbMapped );
		tableColumnCodeVis = new TableColumn<IBusModelIndexObj,IBusModelPubSchema.CodeVisibilityEnum>( "Index Code Visibility" );
		tableColumnCodeVis.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,IBusModelPubSchema.CodeVisibilityEnum>,ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> >() {
			public ObservableValue<IBusModelPubSchema.CodeVisibilityEnum> call( CellDataFeatures<IBusModelIndexObj, IBusModelPubSchema.CodeVisibilityEnum> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnCodeVis.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,IBusModelPubSchema.CodeVisibilityEnum>,TableCell<IBusModelIndexObj,IBusModelPubSchema.CodeVisibilityEnum>>() {
			@Override public TableCell<IBusModelIndexObj,IBusModelPubSchema.CodeVisibilityEnum> call(
				TableColumn<IBusModelIndexObj,IBusModelPubSchema.CodeVisibilityEnum> arg)
			{
				return new CFEnumTableCell<IBusModelIndexObj,IBusModelSchema.CodeVisibilityEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnCodeVis );
		tableColumnLookupDefSchema = new TableColumn<IBusModelIndexObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelIndexObj, IBusModelSchemaDefObj> p ) {
				IBusModelIndexObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelIndexObj,IBusModelSchemaDefObj>,TableCell<IBusModelIndexObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelIndexObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelIndexObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelIndexObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelIndexObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelIndexObj> observable,
					IBusModelIndexObj oldValue,
					IBusModelIndexObj newValue )
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
		if( observableListOfIndex != null ) {
			dataTable.setItems( observableListOfIndex );
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
		if( ( value == null ) || ( value instanceof IBusModelIndexObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelIndexObj" );
		}
		adjustListButtons();
	}

	public IBusModelIndexObj getJavaFXFocusAsIndex() {
		return( (IBusModelIndexObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsIndex( IBusModelIndexObj value ) {
		setJavaFXFocus( value );
	}

	public class IndexByQualNameComparator
	implements Comparator<IBusModelIndexObj>
	{
		public IndexByQualNameComparator() {
		}

		public int compare( IBusModelIndexObj lhs, IBusModelIndexObj rhs ) {
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

	protected IndexByQualNameComparator compareIndexByQualName = new IndexByQualNameComparator();

	public Collection<IBusModelIndexObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelIndexObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfIndex = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelIndexObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfIndex.add( iter.next() );
				}
				observableListOfIndex.sort( compareIndexByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfIndex );
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
			buttonAddIndex = new CFButton();
			buttonAddIndex.setMinWidth( 200 );
			buttonAddIndex.setText( "Add Index" );
			buttonAddIndex.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelIndexObj obj = (IBusModelIndexObj)schemaObj.getIndexTableObj().newInstance();
						IBusModelIndexEditObj edit = (IBusModelIndexEditObj)( obj.beginEdit() );
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
								edit.setRequiredContainerTable( container );
						CFBorderPane frame = javafxSchema.getIndexFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXIndexPaneCommon jpanelCommon = (IBusModelJavaFXIndexPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddIndex );
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
						IBusModelIndexObj selectedInstance = getJavaFXFocusAsIndex();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelIndex.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getIndexFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelIndexObj" );
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
						IBusModelIndexObj selectedInstance = getJavaFXFocusAsIndex();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelIndex.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getIndexFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelIndexObj" );
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
						IBusModelIndexObj selectedInstance = getJavaFXFocusAsIndex();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelIndex.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getIndexFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelIndexObj" );
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
		IBusModelIndexObj selectedObj = getJavaFXFocusAsIndex();
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
		if( buttonAddIndex != null ) {
			buttonAddIndex.setDisable( ! allowAdds );
		}

	}
}
