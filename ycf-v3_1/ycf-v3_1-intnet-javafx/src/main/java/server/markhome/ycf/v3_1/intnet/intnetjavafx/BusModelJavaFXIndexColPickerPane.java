// Description: Java 25 JavaFX Picker of Obj Pane implementation for IndexCol.

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
 *	BusModelJavaFXIndexColPickerPane JavaFX Pick Obj Pane implementation
 *	for IndexCol.
 */
public class BusModelJavaFXIndexColPickerPane
extends CFBorderPane
implements IBusModelJavaFXIndexColPaneList
{
	public static String S_FormName = "Choose IndexCol";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelIndexColObj> javafxDataCollection = null;
	protected ObservableList<IBusModelIndexColObj> observableListOfIndexCol = null;
	protected TableColumn<IBusModelIndexColObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelIndexColObj, String> tableColumnName = null;
	protected TableColumn<IBusModelIndexColObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelIndexColObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelIndexColObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelIndexColObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelIndexColObj, Boolean> tableColumnIsAscending = null;
	protected TableColumn<IBusModelIndexColObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableColumn<IBusModelIndexColObj, IBusModelValueObj> tableColumnLookupColumn = null;
	protected TableView<IBusModelIndexColObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXIndexColChosen invokeWhenChosen = null;
	protected IBusModelIndexObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public BusModelJavaFXIndexColPickerPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelIndexColObj argFocus,
		IBusModelIndexObj argContainer,
		Collection<IBusModelIndexColObj> argDataCollection,
		IBusModelJavaFXIndexColChosen whenChosen )
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
		dataTable = new TableView<IBusModelIndexColObj>();
		tableColumnId = new TableColumn<IBusModelIndexColObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelIndexColObj, ICFKeyHash256> p ) {
				IBusModelIndexColObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,ICFKeyHash256>,TableCell<IBusModelIndexColObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelIndexColObj,ICFKeyHash256> call(
				TableColumn<IBusModelIndexColObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelIndexColObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexColObj, String> p ) {
				IBusModelIndexColObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,String>,TableCell<IBusModelIndexColObj,String>>() {
			@Override public TableCell<IBusModelIndexColObj,String> call(
				TableColumn<IBusModelIndexColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelIndexColObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexColObj, String> p ) {
				IBusModelIndexColObj obj = p.getValue();
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,String>,TableCell<IBusModelIndexColObj,String>>() {
			@Override public TableCell<IBusModelIndexColObj,String> call(
				TableColumn<IBusModelIndexColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelIndexColObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexColObj, String> p ) {
				IBusModelIndexColObj obj = p.getValue();
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,String>,TableCell<IBusModelIndexColObj,String>>() {
			@Override public TableCell<IBusModelIndexColObj,String> call(
				TableColumn<IBusModelIndexColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelIndexColObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexColObj, String> p ) {
				IBusModelIndexColObj obj = p.getValue();
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,String>,TableCell<IBusModelIndexColObj,String>>() {
			@Override public TableCell<IBusModelIndexColObj,String> call(
				TableColumn<IBusModelIndexColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelIndexColObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelIndexColObj, String> p ) {
				IBusModelIndexColObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,String>,TableCell<IBusModelIndexColObj,String>>() {
			@Override public TableCell<IBusModelIndexColObj,String> call(
				TableColumn<IBusModelIndexColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnIsAscending = new TableColumn<IBusModelIndexColObj,Boolean>( "IsAscending" );
		tableColumnIsAscending.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelIndexColObj, Boolean> p ) {
				IBusModelIndexColObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsAscending();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsAscending.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,Boolean>,TableCell<IBusModelIndexColObj,Boolean>>() {
			@Override public TableCell<IBusModelIndexColObj,Boolean> call(
				TableColumn<IBusModelIndexColObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsAscending );
		tableColumnLookupDefSchema = new TableColumn<IBusModelIndexColObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelIndexColObj, IBusModelSchemaDefObj> p ) {
				IBusModelIndexColObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,IBusModelSchemaDefObj>,TableCell<IBusModelIndexColObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelIndexColObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelIndexColObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelIndexColObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		tableColumnLookupColumn = new TableColumn<IBusModelIndexColObj, IBusModelValueObj>( "Column" );
		tableColumnLookupColumn.setCellValueFactory( new Callback<CellDataFeatures<IBusModelIndexColObj,IBusModelValueObj>,ObservableValue<IBusModelValueObj> >() {
			public ObservableValue<IBusModelValueObj> call( CellDataFeatures<IBusModelIndexColObj, IBusModelValueObj> p ) {
				IBusModelIndexColObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelValueObj ref = obj.getRequiredLookupColumn();
					ReadOnlyObjectWrapper<IBusModelValueObj> observable = new ReadOnlyObjectWrapper<IBusModelValueObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupColumn.setCellFactory( new Callback<TableColumn<IBusModelIndexColObj,IBusModelValueObj>,TableCell<IBusModelIndexColObj,IBusModelValueObj>>() {
			@Override public TableCell<IBusModelIndexColObj,IBusModelValueObj> call(
				TableColumn<IBusModelIndexColObj,IBusModelValueObj> arg)
			{
				return new CFReferenceTableCell<IBusModelIndexColObj,IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupColumn );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelIndexColObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelIndexColObj> observable,
					IBusModelIndexColObj oldValue,
					IBusModelIndexColObj newValue )
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
					invokeWhenChosen.choseIndexCol( null );
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
					IBusModelIndexColObj selectedInstance = getJavaFXFocusAsIndexCol();
					invokeWhenChosen.choseIndexCol( selectedInstance );
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
		if( ( value == null ) || ( value instanceof IBusModelIndexColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelIndexColObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public IBusModelIndexColObj getJavaFXFocusAsIndexCol() {
		return( (IBusModelIndexColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsIndexCol( IBusModelIndexColObj value ) {
		setJavaFXFocus( value );
	}

	public class IndexColByQualNameComparator
	implements Comparator<IBusModelIndexColObj>
	{
		public IndexColByQualNameComparator() {
		}

		public int compare( IBusModelIndexColObj lhs, IBusModelIndexColObj rhs ) {
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

	protected IndexColByQualNameComparator compareIndexColByQualName = new IndexColByQualNameComparator();

	public Collection<IBusModelIndexColObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelIndexColObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfIndexCol = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelIndexColObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfIndexCol.add( iter.next() );
				}
				observableListOfIndexCol.sort( compareIndexColByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfIndexCol );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public IBusModelIndexObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelIndexObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		IBusModelIndexColObj selectedObj = getJavaFXFocusAsIndexCol();
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

