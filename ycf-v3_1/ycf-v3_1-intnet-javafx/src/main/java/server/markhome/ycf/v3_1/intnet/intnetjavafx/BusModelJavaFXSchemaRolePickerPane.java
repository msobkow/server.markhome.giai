// Description: Java 25 JavaFX Picker of Obj Pane implementation for SchemaRole.

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
 *	BusModelJavaFXSchemaRolePickerPane JavaFX Pick Obj Pane implementation
 *	for SchemaRole.
 */
public class BusModelJavaFXSchemaRolePickerPane
extends CFBorderPane
implements IBusModelJavaFXSchemaRolePaneList
{
	public static String S_FormName = "Choose SchemaRole";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelSchemaRoleObj> javafxDataCollection = null;
	protected ObservableList<IBusModelSchemaRoleObj> observableListOfSchemaRole = null;
	protected TableColumn<IBusModelSchemaRoleObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelSchemaRoleObj, String> tableColumnName = null;
	protected TableColumn<IBusModelSchemaRoleObj, String> tableColumnEnables = null;
	protected TableColumn<IBusModelSchemaRoleObj, String> tableColumnIncludes = null;
	protected TableColumn<IBusModelSchemaRoleObj, IBusModelPubSchema.RoleScopeEnum> tableColumnRoleScope = null;
	protected TableColumn<IBusModelSchemaRoleObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<IBusModelSchemaRoleObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchemaRoleChosen invokeWhenChosen = null;
	protected IBusModelSchemaDefObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public BusModelJavaFXSchemaRolePickerPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelSchemaRoleObj argFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelSchemaRoleObj> argDataCollection,
		IBusModelJavaFXSchemaRoleChosen whenChosen )
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
		dataTable = new TableView<IBusModelSchemaRoleObj>();
		tableColumnId = new TableColumn<IBusModelSchemaRoleObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRoleObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelSchemaRoleObj, ICFKeyHash256> p ) {
				IBusModelRoleDefObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelSchemaRoleObj,ICFKeyHash256>,TableCell<IBusModelSchemaRoleObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelSchemaRoleObj,ICFKeyHash256> call(
				TableColumn<IBusModelSchemaRoleObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelSchemaRoleObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelSchemaRoleObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRoleObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaRoleObj, String> p ) {
				IBusModelRoleDefObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelSchemaRoleObj,String>,TableCell<IBusModelSchemaRoleObj,String>>() {
			@Override public TableCell<IBusModelSchemaRoleObj,String> call(
				TableColumn<IBusModelSchemaRoleObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaRoleObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnEnables = new TableColumn<IBusModelSchemaRoleObj,String>( "Enables" );
		tableColumnEnables.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRoleObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaRoleObj, String> p ) {
				IBusModelRoleDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredEnables();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnEnables.setCellFactory( new Callback<TableColumn<IBusModelSchemaRoleObj,String>,TableCell<IBusModelSchemaRoleObj,String>>() {
			@Override public TableCell<IBusModelSchemaRoleObj,String> call(
				TableColumn<IBusModelSchemaRoleObj,String> arg)
			{
				return new CFTextTableCell<IBusModelSchemaRoleObj>();
			}
		});
		dataTable.getColumns().add( tableColumnEnables );
		tableColumnIncludes = new TableColumn<IBusModelSchemaRoleObj,String>( "Includes" );
		tableColumnIncludes.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRoleObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaRoleObj, String> p ) {
				IBusModelRoleDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredIncludes();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnIncludes.setCellFactory( new Callback<TableColumn<IBusModelSchemaRoleObj,String>,TableCell<IBusModelSchemaRoleObj,String>>() {
			@Override public TableCell<IBusModelSchemaRoleObj,String> call(
				TableColumn<IBusModelSchemaRoleObj,String> arg)
			{
				return new CFTextTableCell<IBusModelSchemaRoleObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIncludes );
		tableColumnRoleScope = new TableColumn<IBusModelSchemaRoleObj,IBusModelPubSchema.RoleScopeEnum>( "Role Scope" );
		tableColumnRoleScope.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRoleObj,IBusModelPubSchema.RoleScopeEnum>,ObservableValue<IBusModelPubSchema.RoleScopeEnum> >() {
			public ObservableValue<IBusModelPubSchema.RoleScopeEnum> call( CellDataFeatures<IBusModelSchemaRoleObj, IBusModelPubSchema.RoleScopeEnum> p ) {
				IBusModelSchemaRoleObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelPubSchema.RoleScopeEnum value = obj.getRequiredRoleScope();
					ReadOnlyObjectWrapper<IBusModelPubSchema.RoleScopeEnum> observable = new ReadOnlyObjectWrapper<IBusModelPubSchema.RoleScopeEnum>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnRoleScope.setCellFactory( new Callback<TableColumn<IBusModelSchemaRoleObj,IBusModelPubSchema.RoleScopeEnum>,TableCell<IBusModelSchemaRoleObj,IBusModelPubSchema.RoleScopeEnum>>() {
			@Override public TableCell<IBusModelSchemaRoleObj,IBusModelPubSchema.RoleScopeEnum> call(
				TableColumn<IBusModelSchemaRoleObj,IBusModelPubSchema.RoleScopeEnum> arg)
			{
				return new CFEnumTableCell<IBusModelSchemaRoleObj,IBusModelSchema.RoleScopeEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnRoleScope );
		tableColumnLookupDefSchema = new TableColumn<IBusModelSchemaRoleObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRoleObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelSchemaRoleObj, IBusModelSchemaDefObj> p ) {
				IBusModelSchemaRoleObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelSchemaRoleObj,IBusModelSchemaDefObj>,TableCell<IBusModelSchemaRoleObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelSchemaRoleObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelSchemaRoleObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelSchemaRoleObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelSchemaRoleObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelSchemaRoleObj> observable,
					IBusModelSchemaRoleObj oldValue,
					IBusModelSchemaRoleObj newValue )
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
					invokeWhenChosen.choseSchemaRole( null );
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
					IBusModelSchemaRoleObj selectedInstance = getJavaFXFocusAsSchemaRole();
					invokeWhenChosen.choseSchemaRole( selectedInstance );
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
		if( ( value == null ) || ( value instanceof IBusModelSchemaRoleObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelSchemaRoleObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public IBusModelSchemaRoleObj getJavaFXFocusAsSchemaRole() {
		return( (IBusModelSchemaRoleObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSchemaRole( IBusModelSchemaRoleObj value ) {
		setJavaFXFocus( value );
	}

	public class SchemaRoleByQualNameComparator
	implements Comparator<IBusModelSchemaRoleObj>
	{
		public SchemaRoleByQualNameComparator() {
		}

		public int compare( IBusModelSchemaRoleObj lhs, IBusModelSchemaRoleObj rhs ) {
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

	protected SchemaRoleByQualNameComparator compareSchemaRoleByQualName = new SchemaRoleByQualNameComparator();

	public Collection<IBusModelSchemaRoleObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelSchemaRoleObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSchemaRole = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelSchemaRoleObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSchemaRole.add( iter.next() );
				}
				observableListOfSchemaRole.sort( compareSchemaRoleByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSchemaRole );
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
		IBusModelSchemaRoleObj selectedObj = getJavaFXFocusAsSchemaRole();
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

