// Description: Java 25 JavaFX Picker of Obj Pane implementation for ClearSubDep2.

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
 *	BusModelJavaFXClearSubDep2PickerPane JavaFX Pick Obj Pane implementation
 *	for ClearSubDep2.
 */
public class BusModelJavaFXClearSubDep2PickerPane
extends CFBorderPane
implements IBusModelJavaFXClearSubDep2PaneList
{
	public static String S_FormName = "Choose ClearSubDep2";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelClearSubDep2Obj> javafxDataCollection = null;
	protected ObservableList<IBusModelClearSubDep2Obj> observableListOfClearSubDep2 = null;
	protected TableColumn<IBusModelClearSubDep2Obj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelClearSubDep2Obj, String> tableColumnName = null;
	protected TableColumn<IBusModelClearSubDep2Obj, IBusModelRelationObj> tableColumnLookupRelation = null;
	protected TableColumn<IBusModelClearSubDep2Obj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<IBusModelClearSubDep2Obj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXClearSubDep2Chosen invokeWhenChosen = null;
	protected IBusModelClearSubDep1Obj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public BusModelJavaFXClearSubDep2PickerPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelClearSubDep2Obj argFocus,
		IBusModelClearSubDep1Obj argContainer,
		Collection<IBusModelClearSubDep2Obj> argDataCollection,
		IBusModelJavaFXClearSubDep2Chosen whenChosen )
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
		if( whenChosen == null ) {
			throw new CFLibNullArgumentException( getClass(),
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
		dataTable = new TableView<IBusModelClearSubDep2Obj>();
		tableColumnId = new TableColumn<IBusModelClearSubDep2Obj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelClearSubDep2Obj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelClearSubDep2Obj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelClearSubDep2Obj,ICFKeyHash256>,TableCell<IBusModelClearSubDep2Obj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelClearSubDep2Obj,ICFKeyHash256> call(
				TableColumn<IBusModelClearSubDep2Obj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelClearSubDep2Obj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelClearSubDep2Obj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelClearSubDep2Obj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelClearSubDep2Obj, String> p ) {
				IBusModelClearSubDep2Obj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelClearSubDep2Obj,String>,TableCell<IBusModelClearSubDep2Obj,String>>() {
			@Override public TableCell<IBusModelClearSubDep2Obj,String> call(
				TableColumn<IBusModelClearSubDep2Obj,String> arg)
			{
				return new CFStringTableCell<IBusModelClearSubDep2Obj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnLookupRelation = new TableColumn<IBusModelClearSubDep2Obj, IBusModelRelationObj>( "Relation" );
		tableColumnLookupRelation.setCellValueFactory( new Callback<CellDataFeatures<IBusModelClearSubDep2Obj,IBusModelRelationObj>,ObservableValue<IBusModelRelationObj> >() {
			public ObservableValue<IBusModelRelationObj> call( CellDataFeatures<IBusModelClearSubDep2Obj, IBusModelRelationObj> p ) {
				IBusModelClearSubDep2Obj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelRelationObj ref = obj.getRequiredLookupRelation();
					ReadOnlyObjectWrapper<IBusModelRelationObj> observable = new ReadOnlyObjectWrapper<IBusModelRelationObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupRelation.setCellFactory( new Callback<TableColumn<IBusModelClearSubDep2Obj,IBusModelRelationObj>,TableCell<IBusModelClearSubDep2Obj,IBusModelRelationObj>>() {
			@Override public TableCell<IBusModelClearSubDep2Obj,IBusModelRelationObj> call(
				TableColumn<IBusModelClearSubDep2Obj,IBusModelRelationObj> arg)
			{
				return new CFReferenceTableCell<IBusModelClearSubDep2Obj,IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRelation );
		tableColumnLookupDefSchema = new TableColumn<IBusModelClearSubDep2Obj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelClearSubDep2Obj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelClearSubDep2Obj, IBusModelSchemaDefObj> p ) {
				IBusModelClearSubDep2Obj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelClearSubDep2Obj,IBusModelSchemaDefObj>,TableCell<IBusModelClearSubDep2Obj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelClearSubDep2Obj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelClearSubDep2Obj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelClearSubDep2Obj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelClearSubDep2Obj>() {
				@Override public void changed( ObservableValue<? extends IBusModelClearSubDep2Obj> observable,
					IBusModelClearSubDep2Obj oldValue,
					IBusModelClearSubDep2Obj newValue )
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
						throw new CFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					invokeWhenChosen.choseClearSubDep2( null );
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
						throw new CFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					IBusModelClearSubDep2Obj selectedInstance = getJavaFXFocusAsClearSubDep2();
					invokeWhenChosen.choseClearSubDep2( selectedInstance );
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

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelClearSubDep2Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelClearSubDep2Obj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public IBusModelClearSubDep2Obj getJavaFXFocusAsClearSubDep2() {
		return( (IBusModelClearSubDep2Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsClearSubDep2( IBusModelClearSubDep2Obj value ) {
		setJavaFXFocus( value );
	}

	public class ClearSubDep2ByQualNameComparator
	implements Comparator<IBusModelClearSubDep2Obj>
	{
		public ClearSubDep2ByQualNameComparator() {
		}

		public int compare( IBusModelClearSubDep2Obj lhs, IBusModelClearSubDep2Obj rhs ) {
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

	protected ClearSubDep2ByQualNameComparator compareClearSubDep2ByQualName = new ClearSubDep2ByQualNameComparator();

	public Collection<IBusModelClearSubDep2Obj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelClearSubDep2Obj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfClearSubDep2 = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelClearSubDep2Obj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfClearSubDep2.add( iter.next() );
				}
				observableListOfClearSubDep2.sort( compareClearSubDep2ByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfClearSubDep2 );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public IBusModelClearSubDep1Obj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelClearSubDep1Obj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		IBusModelClearSubDep2Obj selectedObj = getJavaFXFocusAsClearSubDep2();
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

