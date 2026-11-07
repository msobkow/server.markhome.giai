// Description: Java 25 JavaFX List of Obj Pane implementation for SchemaTweak.

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
 *	BusModelJavaFXSchemaTweakListPane JavaFX List of Obj Pane implementation
 *	for SchemaTweak.
 */
public class BusModelJavaFXSchemaTweakListPane
extends CFBorderPane
implements IBusModelJavaFXSchemaTweakPaneList
{
	public static String S_FormName = "List SchemaTweak";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelSchemaTweakObj> javafxDataCollection = null;
	protected ObservableList<IBusModelSchemaTweakObj> observableListOfSchemaTweak = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddSchemaTweak = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelSchemaTweakObj> dataTable = null;
	protected TableColumn<IBusModelSchemaTweakObj, ICFKeyHash256> tableColumnTenantId = null;
	protected TableColumn<IBusModelSchemaTweakObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelSchemaTweakObj, ICFKeyHash256> tableColumnDefSchemaTenantId = null;
	protected TableColumn<IBusModelSchemaTweakObj, String> tableColumnName = null;
	protected TableColumn<IBusModelSchemaTweakObj, Boolean> tableColumnReplacesInherited = null;
	protected TableColumn<IBusModelSchemaTweakObj, String> tableColumnTweakGelText = null;
	protected TableColumn<IBusModelSchemaTweakObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected IBusModelSchemaDefObj javafxContainer = null;
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


	public BusModelJavaFXSchemaTweakListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelSchemaDefObj argContainer,
		IBusModelSchemaTweakObj argFocus,
		Collection<IBusModelSchemaTweakObj> argDataCollection,
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
		dataTable = new TableView<IBusModelSchemaTweakObj>();
		tableColumnTenantId = new TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256>( "Tenant Id" );
		tableColumnTenantId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaTweakObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelSchemaTweakObj, ICFKeyHash256> p ) {
				IBusModelTweakObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFKeyHash256 value = obj.getRequiredTenantId();
					ReadOnlyObjectWrapper<ICFKeyHash256> observable = new ReadOnlyObjectWrapper<ICFKeyHash256>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnTenantId.setCellFactory( new Callback<TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256>,TableCell<IBusModelSchemaTweakObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelSchemaTweakObj,ICFKeyHash256> call(
				TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelSchemaTweakObj>();
			}
		});
		dataTable.getColumns().add( tableColumnTenantId );
		tableColumnId = new TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaTweakObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelSchemaTweakObj, ICFKeyHash256> p ) {
				IBusModelTweakObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256>,TableCell<IBusModelSchemaTweakObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelSchemaTweakObj,ICFKeyHash256> call(
				TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelSchemaTweakObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnDefSchemaTenantId = new TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256>( "Defining Schema Tenant Id" );
		tableColumnDefSchemaTenantId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaTweakObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelSchemaTweakObj, ICFKeyHash256> p ) {
				IBusModelTweakObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFKeyHash256 value = obj.getOptionalDefSchemaTenantId();
					ReadOnlyObjectWrapper<ICFKeyHash256> observable = new ReadOnlyObjectWrapper<ICFKeyHash256>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDefSchemaTenantId.setCellFactory( new Callback<TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256>,TableCell<IBusModelSchemaTweakObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelSchemaTweakObj,ICFKeyHash256> call(
				TableColumn<IBusModelSchemaTweakObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelSchemaTweakObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefSchemaTenantId );
		tableColumnName = new TableColumn<IBusModelSchemaTweakObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaTweakObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaTweakObj, String> p ) {
				IBusModelTweakObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelSchemaTweakObj,String>,TableCell<IBusModelSchemaTweakObj,String>>() {
			@Override public TableCell<IBusModelSchemaTweakObj,String> call(
				TableColumn<IBusModelSchemaTweakObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaTweakObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnReplacesInherited = new TableColumn<IBusModelSchemaTweakObj,Boolean>( "Replaces Inherited" );
		tableColumnReplacesInherited.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaTweakObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelSchemaTweakObj, Boolean> p ) {
				IBusModelTweakObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredReplacesInherited();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnReplacesInherited.setCellFactory( new Callback<TableColumn<IBusModelSchemaTweakObj,Boolean>,TableCell<IBusModelSchemaTweakObj,Boolean>>() {
			@Override public TableCell<IBusModelSchemaTweakObj,Boolean> call(
				TableColumn<IBusModelSchemaTweakObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelSchemaTweakObj>();
			}
		});
		dataTable.getColumns().add( tableColumnReplacesInherited );
		tableColumnTweakGelText = new TableColumn<IBusModelSchemaTweakObj,String>( "GEL Text" );
		tableColumnTweakGelText.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaTweakObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaTweakObj, String> p ) {
				IBusModelTweakObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredTweakGelText();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnTweakGelText.setCellFactory( new Callback<TableColumn<IBusModelSchemaTweakObj,String>,TableCell<IBusModelSchemaTweakObj,String>>() {
			@Override public TableCell<IBusModelSchemaTweakObj,String> call(
				TableColumn<IBusModelSchemaTweakObj,String> arg)
			{
				return new CFTextTableCell<IBusModelSchemaTweakObj>();
			}
		});
		dataTable.getColumns().add( tableColumnTweakGelText );
		tableColumnLookupDefSchema = new TableColumn<IBusModelSchemaTweakObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaTweakObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelSchemaTweakObj, IBusModelSchemaDefObj> p ) {
				IBusModelSchemaTweakObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelSchemaTweakObj,IBusModelSchemaDefObj>,TableCell<IBusModelSchemaTweakObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelSchemaTweakObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelSchemaTweakObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelSchemaTweakObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelSchemaTweakObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelSchemaTweakObj> observable,
					IBusModelSchemaTweakObj oldValue,
					IBusModelSchemaTweakObj newValue )
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
		if( observableListOfSchemaTweak != null ) {
			dataTable.setItems( observableListOfSchemaTweak );
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
		if( ( value == null ) || ( value instanceof IBusModelSchemaTweakObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelSchemaTweakObj" );
		}
		adjustListButtons();
	}

	public IBusModelSchemaTweakObj getJavaFXFocusAsSchemaTweak() {
		return( (IBusModelSchemaTweakObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSchemaTweak( IBusModelSchemaTweakObj value ) {
		setJavaFXFocus( value );
	}

	public class SchemaTweakByQualNameComparator
	implements Comparator<IBusModelSchemaTweakObj>
	{
		public SchemaTweakByQualNameComparator() {
		}

		public int compare( IBusModelSchemaTweakObj lhs, IBusModelSchemaTweakObj rhs ) {
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

	protected SchemaTweakByQualNameComparator compareSchemaTweakByQualName = new SchemaTweakByQualNameComparator();

	public Collection<IBusModelSchemaTweakObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelSchemaTweakObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSchemaTweak = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelSchemaTweakObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSchemaTweak.add( iter.next() );
				}
				observableListOfSchemaTweak.sort( compareSchemaTweakByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSchemaTweak );
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
			buttonAddSchemaTweak = new CFButton();
			buttonAddSchemaTweak.setMinWidth( 200 );
			buttonAddSchemaTweak.setText( "Add SchemaTweak" );
			buttonAddSchemaTweak.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelSchemaTweakObj obj = (IBusModelSchemaTweakObj)schemaObj.getSchemaTweakTableObj().newInstance();
						IBusModelSchemaTweakEditObj edit = (IBusModelSchemaTweakEditObj)( obj.beginEdit() );
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
						CFBorderPane frame = javafxSchema.getSchemaTweakFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXSchemaTweakPaneCommon jpanelCommon = (IBusModelJavaFXSchemaTweakPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddSchemaTweak );
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
						IBusModelSchemaTweakObj selectedInstance = getJavaFXFocusAsSchemaTweak();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaTweak.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSchemaTweakFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaTweakPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelSchemaTweakObj" );
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
						IBusModelSchemaTweakObj selectedInstance = getJavaFXFocusAsSchemaTweak();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaTweak.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSchemaTweakFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaTweakPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelSchemaTweakObj" );
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
						IBusModelSchemaTweakObj selectedInstance = getJavaFXFocusAsSchemaTweak();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaTweak.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSchemaTweakFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXSchemaTweakPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelSchemaTweakObj" );
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

	public IBusModelSchemaDefObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelSchemaDefObj value ) {
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
		IBusModelSchemaTweakObj selectedObj = getJavaFXFocusAsSchemaTweak();
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
		if( buttonAddSchemaTweak != null ) {
			buttonAddSchemaTweak.setDisable( ! allowAdds );
		}

	}
}
