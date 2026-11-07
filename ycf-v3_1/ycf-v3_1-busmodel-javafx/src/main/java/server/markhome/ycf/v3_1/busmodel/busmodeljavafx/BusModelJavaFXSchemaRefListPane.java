// Description: Java 25 JavaFX List of Obj Pane implementation for SchemaRef.

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
 *	BusModelJavaFXSchemaRefListPane JavaFX List of Obj Pane implementation
 *	for SchemaRef.
 */
public class BusModelJavaFXSchemaRefListPane
extends CFBorderPane
implements IBusModelJavaFXSchemaRefPaneList
{
	public static String S_FormName = "List SchemaRef";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelSchemaRefObj> javafxDataCollection = null;
	protected ObservableList<IBusModelSchemaRefObj> observableListOfSchemaRef = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddSchemaRef = null;
	protected CFButton buttonMoveUpSelected = null;
	protected CFButton buttonMoveDownSelected = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelSchemaRefObj> dataTable = null;
	protected TableColumn<IBusModelSchemaRefObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelSchemaRefObj, String> tableColumnName = null;
	protected TableColumn<IBusModelSchemaRefObj, String> tableColumnRefModelName = null;
	protected TableColumn<IBusModelSchemaRefObj, String> tableColumnIncludeRoot = null;
	protected TableColumn<IBusModelSchemaRefObj, IBusModelSchemaDefObj> tableColumnLookupRefSchema = null;

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


	public BusModelJavaFXSchemaRefListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelSchemaDefObj argContainer,
		IBusModelSchemaRefObj argFocus,
		Collection<IBusModelSchemaRefObj> argDataCollection,
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
		dataTable = new TableView<IBusModelSchemaRefObj>();
		tableColumnId = new TableColumn<IBusModelSchemaRefObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRefObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelSchemaRefObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelSchemaRefObj,ICFKeyHash256>,TableCell<IBusModelSchemaRefObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelSchemaRefObj,ICFKeyHash256> call(
				TableColumn<IBusModelSchemaRefObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelSchemaRefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaRefObj, String> p ) {
				IBusModelSchemaRefObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelSchemaRefObj,String>,TableCell<IBusModelSchemaRefObj,String>>() {
			@Override public TableCell<IBusModelSchemaRefObj,String> call(
				TableColumn<IBusModelSchemaRefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnRefModelName = new TableColumn<IBusModelSchemaRefObj,String>( "Ref. Model Name" );
		tableColumnRefModelName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaRefObj, String> p ) {
				IBusModelSchemaRefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredRefModelName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnRefModelName.setCellFactory( new Callback<TableColumn<IBusModelSchemaRefObj,String>,TableCell<IBusModelSchemaRefObj,String>>() {
			@Override public TableCell<IBusModelSchemaRefObj,String> call(
				TableColumn<IBusModelSchemaRefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnRefModelName );
		tableColumnIncludeRoot = new TableColumn<IBusModelSchemaRefObj,String>( "Include Root" );
		tableColumnIncludeRoot.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaRefObj, String> p ) {
				IBusModelSchemaRefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredIncludeRoot();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnIncludeRoot.setCellFactory( new Callback<TableColumn<IBusModelSchemaRefObj,String>,TableCell<IBusModelSchemaRefObj,String>>() {
			@Override public TableCell<IBusModelSchemaRefObj,String> call(
				TableColumn<IBusModelSchemaRefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIncludeRoot );
		tableColumnLookupRefSchema = new TableColumn<IBusModelSchemaRefObj, IBusModelSchemaDefObj>( "Referenced Schema" );
		tableColumnLookupRefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaRefObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelSchemaRefObj, IBusModelSchemaDefObj> p ) {
				IBusModelSchemaRefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelSchemaDefObj ref = obj.getOptionalLookupRefSchema();
					ReadOnlyObjectWrapper<IBusModelSchemaDefObj> observable = new ReadOnlyObjectWrapper<IBusModelSchemaDefObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupRefSchema.setCellFactory( new Callback<TableColumn<IBusModelSchemaRefObj,IBusModelSchemaDefObj>,TableCell<IBusModelSchemaRefObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelSchemaRefObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelSchemaRefObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelSchemaRefObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelSchemaRefObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelSchemaRefObj> observable,
					IBusModelSchemaRefObj oldValue,
					IBusModelSchemaRefObj newValue )
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
		if( observableListOfSchemaRef != null ) {
			dataTable.setItems( observableListOfSchemaRef );
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
		if( ( value == null ) || ( value instanceof IBusModelSchemaRefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelSchemaRefObj" );
		}
		adjustListButtons();
	}

	public IBusModelSchemaRefObj getJavaFXFocusAsSchemaRef() {
		return( (IBusModelSchemaRefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSchemaRef( IBusModelSchemaRefObj value ) {
		setJavaFXFocus( value );
	}

	public class SchemaRefByQualNameComparator
	implements Comparator<IBusModelSchemaRefObj>
	{
		public SchemaRefByQualNameComparator() {
		}

		public int compare( IBusModelSchemaRefObj lhs, IBusModelSchemaRefObj rhs ) {
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

	protected SchemaRefByQualNameComparator compareSchemaRefByQualName = new SchemaRefByQualNameComparator();

	public Collection<IBusModelSchemaRefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelSchemaRefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSchemaRef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
			if( javafxSortByChain ) {
				Iterator<IBusModelSchemaRefObj> iter = javafxDataCollection.iterator();
				IBusModelSchemaRefObj head = null;
				while( ( head == null ) && iter.hasNext() ) {
					head = iter.next();
					if( null != head.getOptionalLookupPrev() ) {
						head = null;
					}
				}
				if( ( head == null ) && ( javafxDataCollection.size() > 0 ) ) {
					throw new CFLibRuntimeException( getClass(),
						S_ProcName,
						Inz.x("cflibjavafx.common.CouldNotLocateHeadOfChain"),
						Inz.s("cflibjavafx.common.CouldNotLocateHeadOfChain") );
				}
				IBusModelSchemaRefObj cur = head;
				while( cur != null ) {
					observableListOfSchemaRef.add( cur );
					cur = cur.getOptionalLookupNext();
				}
			}
			else {
				Iterator<IBusModelSchemaRefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSchemaRef.add( iter.next() );
				}
				observableListOfSchemaRef.sort( compareSchemaRefByQualName );
			}
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSchemaRef );
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
			buttonAddSchemaRef = new CFButton();
			buttonAddSchemaRef.setMinWidth( 200 );
			buttonAddSchemaRef.setText( "Add SchemaRef" );
			buttonAddSchemaRef.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelSchemaRefObj obj = (IBusModelSchemaRefObj)schemaObj.getSchemaRefTableObj().newInstance();
						IBusModelSchemaRefEditObj edit = (IBusModelSchemaRefEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelSchemaDefObj container = (IBusModelSchemaDefObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerSchema( container );
						CFBorderPane frame = javafxSchema.getSchemaRefFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXSchemaRefPaneCommon jpanelCommon = (IBusModelJavaFXSchemaRefPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddSchemaRef );
			buttonMoveUpSelected = new CFButton();
			buttonMoveUpSelected.setMinWidth( 200 );
			buttonMoveUpSelected.setText( "Move Up Selected" );
			buttonMoveUpSelected.setOnAction( new EventHandler<ActionEvent>() {
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
						IBusModelSchemaRefObj selectedInstance = getJavaFXFocusAsSchemaRef();
						if( selectedInstance != null ) {
							if( null != selectedInstance.getOptionalLookupPrev() ) {
								selectedInstance.moveUp();
								refreshMe();
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonMoveUpSelected );

			buttonMoveDownSelected = new CFButton();
			buttonMoveDownSelected.setMinWidth( 200 );
			buttonMoveDownSelected.setText( "Move Down Selected" );
			buttonMoveDownSelected.setOnAction( new EventHandler<ActionEvent>() {
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
						IBusModelSchemaRefObj selectedInstance = getJavaFXFocusAsSchemaRef();
						if( selectedInstance != null ) {
							if( null != selectedInstance.getOptionalLookupNext() ) {
								selectedInstance.moveDown();
								refreshMe();
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonMoveDownSelected );

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
						IBusModelSchemaRefObj selectedInstance = getJavaFXFocusAsSchemaRef();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaRef.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelSchemaRefObj" );
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
						IBusModelSchemaRefObj selectedInstance = getJavaFXFocusAsSchemaRef();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaRef.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelSchemaRefObj" );
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
						IBusModelSchemaRefObj selectedInstance = getJavaFXFocusAsSchemaRef();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaRef.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelSchemaRefObj" );
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
		IBusModelSchemaRefObj selectedObj = getJavaFXFocusAsSchemaRef();
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

		boolean enableMoveUp = ( ! inEditState )
			&& ( ! inAddMode )
			&& ( selectedObj != null )
			&& ( null != selectedObj.getOptionalLookupPrev() );
		boolean enableMoveDown = ( ! inEditState )
			&& ( ! inAddMode )
			&& ( selectedObj != null )
			&& ( null != selectedObj.getOptionalLookupNext() );
		if( buttonMoveUpSelected != null ) {
			buttonMoveUpSelected.setDisable( ! enableMoveUp );
		}
		if( buttonMoveDownSelected != null ) {
			buttonMoveDownSelected.setDisable( ! enableMoveDown );
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
		if( buttonAddSchemaRef != null ) {
			buttonAddSchemaRef.setDisable( ! allowAdds );
		}

	}
}
