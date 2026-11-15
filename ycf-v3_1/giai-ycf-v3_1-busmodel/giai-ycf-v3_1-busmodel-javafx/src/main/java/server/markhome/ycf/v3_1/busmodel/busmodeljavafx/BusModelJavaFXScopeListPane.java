// Description: Java 25 JavaFX List of Obj Pane implementation for Scope.

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
 *	BusModelJavaFXScopeListPane JavaFX List of Obj Pane implementation
 *	for Scope.
 */
public class BusModelJavaFXScopeListPane
extends CFBorderPane
implements IBusModelJavaFXScopePaneList
{
	public static String S_FormName = "List Scope";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelScopeObj> javafxDataCollection = null;
	protected ObservableList<IBusModelScopeObj> observableListOfScope = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddSchemaDef = null;
	protected CFButton buttonAddSchemaRef = null;
	protected CFButton buttonAddServerMethod = null;
	protected CFButton buttonAddServerObjFunc = null;
	protected CFButton buttonAddServerProc = null;
	protected CFButton buttonAddServerListFunc = null;
	protected CFButton buttonAddTable = null;
	protected CFButton buttonAddClearSubDep1 = null;
	protected CFButton buttonAddClearSubDep2 = null;
	protected CFButton buttonAddClearSubDep3 = null;
	protected CFButton buttonAddClearTopDep = null;
	protected CFButton buttonAddDelSubDep1 = null;
	protected CFButton buttonAddDelSubDep2 = null;
	protected CFButton buttonAddDelSubDep3 = null;
	protected CFButton buttonAddDelTopDep = null;
	protected CFButton buttonAddIndex = null;
	protected CFButton buttonAddPopSubDep1 = null;
	protected CFButton buttonAddPopSubDep2 = null;
	protected CFButton buttonAddPopSubDep3 = null;
	protected CFButton buttonAddPopTopDep = null;
	protected CFButton buttonAddRelation = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelScopeObj> dataTable = null;
	protected TableColumn<IBusModelScopeObj,String> tableColumnObjKind = null;
	protected TableColumn<IBusModelScopeObj, ICFKeyHash256> tableColumnId = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected ICFLibAnyObj javafxContainer = null;
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


	public BusModelJavaFXScopeListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		ICFLibAnyObj argContainer,
		IBusModelScopeObj argFocus,
		Collection<IBusModelScopeObj> argDataCollection,
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
		dataTable = new TableView<IBusModelScopeObj>();
		tableColumnObjKind = new TableColumn<IBusModelScopeObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<IBusModelScopeObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<IBusModelScopeObj, String> p ) {
				IBusModelScopeObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<IBusModelScopeObj,String>,TableCell<IBusModelScopeObj,String>>() {
			@Override public TableCell<IBusModelScopeObj,String> call(
				TableColumn<IBusModelScopeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelScopeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<IBusModelScopeObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelScopeObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelScopeObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelScopeObj,ICFKeyHash256>,TableCell<IBusModelScopeObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelScopeObj,ICFKeyHash256> call(
				TableColumn<IBusModelScopeObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelScopeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelScopeObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelScopeObj> observable,
					IBusModelScopeObj oldValue,
					IBusModelScopeObj newValue )
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
		if( observableListOfScope != null ) {
			dataTable.setItems( observableListOfScope );
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
		if( ( value == null ) || ( value instanceof IBusModelScopeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelScopeObj" );
		}
		adjustListButtons();
	}

	public IBusModelScopeObj getJavaFXFocusAsScope() {
		return( (IBusModelScopeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsScope( IBusModelScopeObj value ) {
		setJavaFXFocus( value );
	}

	public class ScopeByQualNameComparator
	implements Comparator<IBusModelScopeObj>
	{
		public ScopeByQualNameComparator() {
		}

		public int compare( IBusModelScopeObj lhs, IBusModelScopeObj rhs ) {
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

	protected ScopeByQualNameComparator compareScopeByQualName = new ScopeByQualNameComparator();

	public Collection<IBusModelScopeObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelScopeObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfScope = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelScopeObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfScope.add( iter.next() );
				}
				observableListOfScope.sort( compareScopeByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfScope );
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
					buttonAddSchemaDef = new CFButton();
					buttonAddSchemaDef.setMinWidth( 200 );
					buttonAddSchemaDef.setText( "Add SchemaDef" );
					buttonAddSchemaDef.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelSchemaDefObj obj = (IBusModelSchemaDefObj)schemaObj.getSchemaDefTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelSchemaDefEditObj edit = (IBusModelSchemaDefEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerCTenant( secTenant );
								IBusModelMinorVersionObj container = (IBusModelMinorVersionObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerMinorVersion( container );
								IBusModelJavaFXSchemaDefPaneCommon jpanelCommon = (IBusModelJavaFXSchemaDefPaneCommon)frame;
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
					if( javafxContainer instanceof IIntNetMinorVersionObj ) {
						list.add( buttonAddSchemaDef );
					}
					buttonAddSchemaRef = new CFButton();
					buttonAddSchemaRef.setMinWidth( 200 );
					buttonAddSchemaRef.setText( "Add SchemaRef" );
					buttonAddSchemaRef.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelSchemaRefObj obj = (IBusModelSchemaRefObj)schemaObj.getSchemaRefTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
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
								IBusModelJavaFXSchemaRefPaneCommon jpanelCommon = (IBusModelJavaFXSchemaRefPaneCommon)frame;
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
						list.add( buttonAddSchemaRef );
					}
					buttonAddServerMethod = new CFButton();
					buttonAddServerMethod.setMinWidth( 200 );
					buttonAddServerMethod.setText( "Add ServerMethod" );
					buttonAddServerMethod.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelServerMethodObj obj = (IBusModelServerMethodObj)schemaObj.getServerMethodTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelServerMethodEditObj edit = (IBusModelServerMethodEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								IBusModelJavaFXServerMethodPaneCommon jpanelCommon = (IBusModelJavaFXServerMethodPaneCommon)frame;
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
						list.add( buttonAddServerMethod );
					}
					buttonAddServerObjFunc = new CFButton();
					buttonAddServerObjFunc.setMinWidth( 200 );
					buttonAddServerObjFunc.setText( "Add ServerObjFunc" );
					buttonAddServerObjFunc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelServerObjFuncObj obj = (IBusModelServerObjFuncObj)schemaObj.getServerObjFuncTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelServerObjFuncEditObj edit = (IBusModelServerObjFuncEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								IBusModelJavaFXServerObjFuncPaneCommon jpanelCommon = (IBusModelJavaFXServerObjFuncPaneCommon)frame;
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
						list.add( buttonAddServerObjFunc );
					}
					buttonAddServerProc = new CFButton();
					buttonAddServerProc.setMinWidth( 200 );
					buttonAddServerProc.setText( "Add ServerProc" );
					buttonAddServerProc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelServerProcObj obj = (IBusModelServerProcObj)schemaObj.getServerProcTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerProcFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelServerProcEditObj edit = (IBusModelServerProcEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								IBusModelJavaFXServerProcPaneCommon jpanelCommon = (IBusModelJavaFXServerProcPaneCommon)frame;
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
						list.add( buttonAddServerProc );
					}
					buttonAddServerListFunc = new CFButton();
					buttonAddServerListFunc.setMinWidth( 200 );
					buttonAddServerListFunc.setText( "Add ServerListFunc" );
					buttonAddServerListFunc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelServerListFuncObj obj = (IBusModelServerListFuncObj)schemaObj.getServerListFuncTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelServerListFuncEditObj edit = (IBusModelServerListFuncEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								IBusModelJavaFXServerListFuncPaneCommon jpanelCommon = (IBusModelJavaFXServerListFuncPaneCommon)frame;
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
						list.add( buttonAddServerListFunc );
					}
					buttonAddTable = new CFButton();
					buttonAddTable.setMinWidth( 200 );
					buttonAddTable.setText( "Add Table" );
					buttonAddTable.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTableObj obj = (IBusModelTableObj)schemaObj.getTableTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTableFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTableEditObj edit = (IBusModelTableEditObj)( obj.beginEdit() );
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
								edit.setRequiredContainerSchemaDef( container );
								IBusModelJavaFXTablePaneCommon jpanelCommon = (IBusModelJavaFXTablePaneCommon)frame;
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
						list.add( buttonAddTable );
					}
					buttonAddClearSubDep1 = new CFButton();
					buttonAddClearSubDep1.setMinWidth( 200 );
					buttonAddClearSubDep1.setText( "Add ClearSubDep1" );
					buttonAddClearSubDep1.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelClearSubDep1Obj obj = (IBusModelClearSubDep1Obj)schemaObj.getClearSubDep1TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelClearSubDep1EditObj edit = (IBusModelClearSubDep1EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelClearTopDepObj container = (IBusModelClearTopDepObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerClearTopDep( container );
								IBusModelJavaFXClearSubDep1PaneCommon jpanelCommon = (IBusModelJavaFXClearSubDep1PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelClearTopDepObj ) {
						list.add( buttonAddClearSubDep1 );
					}
					buttonAddClearSubDep2 = new CFButton();
					buttonAddClearSubDep2.setMinWidth( 200 );
					buttonAddClearSubDep2.setText( "Add ClearSubDep2" );
					buttonAddClearSubDep2.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelClearSubDep2Obj obj = (IBusModelClearSubDep2Obj)schemaObj.getClearSubDep2TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelClearSubDep2EditObj edit = (IBusModelClearSubDep2EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelClearSubDep1Obj container = (IBusModelClearSubDep1Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerClearSubDep1( container );
								IBusModelJavaFXClearSubDep2PaneCommon jpanelCommon = (IBusModelJavaFXClearSubDep2PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelClearSubDep1Obj ) {
						list.add( buttonAddClearSubDep2 );
					}
					buttonAddClearSubDep3 = new CFButton();
					buttonAddClearSubDep3.setMinWidth( 200 );
					buttonAddClearSubDep3.setText( "Add ClearSubDep3" );
					buttonAddClearSubDep3.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelClearSubDep3Obj obj = (IBusModelClearSubDep3Obj)schemaObj.getClearSubDep3TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelClearSubDep3EditObj edit = (IBusModelClearSubDep3EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelClearSubDep2Obj container = (IBusModelClearSubDep2Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerClearSubDep2( container );
								IBusModelJavaFXClearSubDep3PaneCommon jpanelCommon = (IBusModelJavaFXClearSubDep3PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelClearSubDep2Obj ) {
						list.add( buttonAddClearSubDep3 );
					}
					buttonAddClearTopDep = new CFButton();
					buttonAddClearTopDep.setMinWidth( 200 );
					buttonAddClearTopDep.setText( "Add ClearTopDep" );
					buttonAddClearTopDep.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelClearTopDepObj obj = (IBusModelClearTopDepObj)schemaObj.getClearTopDepTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelClearTopDepEditObj edit = (IBusModelClearTopDepEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								IBusModelJavaFXClearTopDepPaneCommon jpanelCommon = (IBusModelJavaFXClearTopDepPaneCommon)frame;
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
						list.add( buttonAddClearTopDep );
					}
					buttonAddDelSubDep1 = new CFButton();
					buttonAddDelSubDep1.setMinWidth( 200 );
					buttonAddDelSubDep1.setText( "Add DelSubDep1" );
					buttonAddDelSubDep1.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDelSubDep1Obj obj = (IBusModelDelSubDep1Obj)schemaObj.getDelSubDep1TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDelSubDep1EditObj edit = (IBusModelDelSubDep1EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelDelTopDepObj container = (IBusModelDelTopDepObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerDelTopDep( container );
								IBusModelJavaFXDelSubDep1PaneCommon jpanelCommon = (IBusModelJavaFXDelSubDep1PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelDelTopDepObj ) {
						list.add( buttonAddDelSubDep1 );
					}
					buttonAddDelSubDep2 = new CFButton();
					buttonAddDelSubDep2.setMinWidth( 200 );
					buttonAddDelSubDep2.setText( "Add DelSubDep2" );
					buttonAddDelSubDep2.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDelSubDep2Obj obj = (IBusModelDelSubDep2Obj)schemaObj.getDelSubDep2TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDelSubDep2EditObj edit = (IBusModelDelSubDep2EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelDelSubDep1Obj container = (IBusModelDelSubDep1Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerDelSubDep1( container );
								IBusModelJavaFXDelSubDep2PaneCommon jpanelCommon = (IBusModelJavaFXDelSubDep2PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelDelSubDep1Obj ) {
						list.add( buttonAddDelSubDep2 );
					}
					buttonAddDelSubDep3 = new CFButton();
					buttonAddDelSubDep3.setMinWidth( 200 );
					buttonAddDelSubDep3.setText( "Add DelSubDep3" );
					buttonAddDelSubDep3.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDelSubDep3Obj obj = (IBusModelDelSubDep3Obj)schemaObj.getDelSubDep3TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDelSubDep3EditObj edit = (IBusModelDelSubDep3EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelDelSubDep2Obj container = (IBusModelDelSubDep2Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerDelSubDep2( container );
								IBusModelJavaFXDelSubDep3PaneCommon jpanelCommon = (IBusModelJavaFXDelSubDep3PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelDelSubDep2Obj ) {
						list.add( buttonAddDelSubDep3 );
					}
					buttonAddDelTopDep = new CFButton();
					buttonAddDelTopDep.setMinWidth( 200 );
					buttonAddDelTopDep.setText( "Add DelTopDep" );
					buttonAddDelTopDep.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDelTopDepObj obj = (IBusModelDelTopDepObj)schemaObj.getDelTopDepTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDelTopDepEditObj edit = (IBusModelDelTopDepEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								IBusModelJavaFXDelTopDepPaneCommon jpanelCommon = (IBusModelJavaFXDelTopDepPaneCommon)frame;
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
						list.add( buttonAddDelTopDep );
					}
					buttonAddIndex = new CFButton();
					buttonAddIndex.setMinWidth( 200 );
					buttonAddIndex.setText( "Add Index" );
					buttonAddIndex.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelIndexObj obj = (IBusModelIndexObj)schemaObj.getIndexTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getIndexFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelIndexEditObj edit = (IBusModelIndexEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								IBusModelJavaFXIndexPaneCommon jpanelCommon = (IBusModelJavaFXIndexPaneCommon)frame;
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
						list.add( buttonAddIndex );
					}
					buttonAddPopSubDep1 = new CFButton();
					buttonAddPopSubDep1.setMinWidth( 200 );
					buttonAddPopSubDep1.setText( "Add PopSubDep1" );
					buttonAddPopSubDep1.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelPopSubDep1Obj obj = (IBusModelPopSubDep1Obj)schemaObj.getPopSubDep1TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelPopSubDep1EditObj edit = (IBusModelPopSubDep1EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelPopTopDepObj container = (IBusModelPopTopDepObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerContPopTopDep( container );
								IBusModelJavaFXPopSubDep1PaneCommon jpanelCommon = (IBusModelJavaFXPopSubDep1PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelPopTopDepObj ) {
						list.add( buttonAddPopSubDep1 );
					}
					buttonAddPopSubDep2 = new CFButton();
					buttonAddPopSubDep2.setMinWidth( 200 );
					buttonAddPopSubDep2.setText( "Add PopSubDep2" );
					buttonAddPopSubDep2.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelPopSubDep2Obj obj = (IBusModelPopSubDep2Obj)schemaObj.getPopSubDep2TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelPopSubDep2EditObj edit = (IBusModelPopSubDep2EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelPopSubDep1Obj container = (IBusModelPopSubDep1Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerPopSubDep1( container );
								IBusModelJavaFXPopSubDep2PaneCommon jpanelCommon = (IBusModelJavaFXPopSubDep2PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelPopSubDep1Obj ) {
						list.add( buttonAddPopSubDep2 );
					}
					buttonAddPopSubDep3 = new CFButton();
					buttonAddPopSubDep3.setMinWidth( 200 );
					buttonAddPopSubDep3.setText( "Add PopSubDep3" );
					buttonAddPopSubDep3.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelPopSubDep3Obj obj = (IBusModelPopSubDep3Obj)schemaObj.getPopSubDep3TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelPopSubDep3EditObj edit = (IBusModelPopSubDep3EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelPopSubDep2Obj container = (IBusModelPopSubDep2Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerPopSubDep2( container );
								IBusModelJavaFXPopSubDep3PaneCommon jpanelCommon = (IBusModelJavaFXPopSubDep3PaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelPopSubDep2Obj ) {
						list.add( buttonAddPopSubDep3 );
					}
					buttonAddPopTopDep = new CFButton();
					buttonAddPopTopDep.setMinWidth( 200 );
					buttonAddPopTopDep.setText( "Add PopTopDep" );
					buttonAddPopTopDep.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelPopTopDepObj obj = (IBusModelPopTopDepObj)schemaObj.getPopTopDepTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelPopTopDepEditObj edit = (IBusModelPopTopDepEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelRelationObj container = (IBusModelRelationObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerContRelation( container );
								IBusModelJavaFXPopTopDepPaneCommon jpanelCommon = (IBusModelJavaFXPopTopDepPaneCommon)frame;
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
					if( javafxContainer instanceof IBusModelRelationObj ) {
						list.add( buttonAddPopTopDep );
					}
					buttonAddRelation = new CFButton();
					buttonAddRelation.setMinWidth( 200 );
					buttonAddRelation.setText( "Add Relation" );
					buttonAddRelation.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelRelationObj obj = (IBusModelRelationObj)schemaObj.getRelationTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getRelationFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelRelationEditObj edit = (IBusModelRelationEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerFromTable( container );
								IBusModelJavaFXRelationPaneCommon jpanelCommon = (IBusModelJavaFXRelationPaneCommon)frame;
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
						list.add( buttonAddRelation );
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
						IBusModelScopeObj selectedInstance = getJavaFXFocusAsScope();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelScope.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getScopeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXScopePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaDef.CLASS_CODE ) {
								IBusModelSchemaDefObj obj = (IBusModelSchemaDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaRef.CLASS_CODE ) {
								IBusModelSchemaRefObj obj = (IBusModelSchemaRefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerMethod.CLASS_CODE ) {
								IBusModelServerMethodObj obj = (IBusModelServerMethodObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerObjFunc.CLASS_CODE ) {
								IBusModelServerObjFuncObj obj = (IBusModelServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerProc.CLASS_CODE ) {
								IBusModelServerProcObj obj = (IBusModelServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerListFunc.CLASS_CODE ) {
								IBusModelServerListFuncObj obj = (IBusModelServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTable.CLASS_CODE ) {
								IBusModelTableObj obj = (IBusModelTableObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTablePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearDep.CLASS_CODE ) {
								IBusModelClearDepObj obj = (IBusModelClearDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep1.CLASS_CODE ) {
								IBusModelClearSubDep1Obj obj = (IBusModelClearSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep2.CLASS_CODE ) {
								IBusModelClearSubDep2Obj obj = (IBusModelClearSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep3.CLASS_CODE ) {
								IBusModelClearSubDep3Obj obj = (IBusModelClearSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearTopDep.CLASS_CODE ) {
								IBusModelClearTopDepObj obj = (IBusModelClearTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelDep.CLASS_CODE ) {
								IBusModelDelDepObj obj = (IBusModelDelDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep1.CLASS_CODE ) {
								IBusModelDelSubDep1Obj obj = (IBusModelDelSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep2.CLASS_CODE ) {
								IBusModelDelSubDep2Obj obj = (IBusModelDelSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep3.CLASS_CODE ) {
								IBusModelDelSubDep3Obj obj = (IBusModelDelSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelTopDep.CLASS_CODE ) {
								IBusModelDelTopDepObj obj = (IBusModelDelTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelIndex.CLASS_CODE ) {
								IBusModelIndexObj obj = (IBusModelIndexObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getIndexFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopDep.CLASS_CODE ) {
								IBusModelPopDepObj obj = (IBusModelPopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep1.CLASS_CODE ) {
								IBusModelPopSubDep1Obj obj = (IBusModelPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep2.CLASS_CODE ) {
								IBusModelPopSubDep2Obj obj = (IBusModelPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep3.CLASS_CODE ) {
								IBusModelPopSubDep3Obj obj = (IBusModelPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopTopDep.CLASS_CODE ) {
								IBusModelPopTopDepObj obj = (IBusModelPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelRelation.CLASS_CODE ) {
								IBusModelRelationObj obj = (IBusModelRelationObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getRelationFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelScopeObj, IBusModelSchemaDefObj, IBusModelSchemaRefObj, IBusModelServerMethodObj, IBusModelServerObjFuncObj, IBusModelServerProcObj, IBusModelServerListFuncObj, IBusModelTableObj, IBusModelClearDepObj, IBusModelClearSubDep1Obj, IBusModelClearSubDep2Obj, IBusModelClearSubDep3Obj, IBusModelClearTopDepObj, IBusModelDelDepObj, IBusModelDelSubDep1Obj, IBusModelDelSubDep2Obj, IBusModelDelSubDep3Obj, IBusModelDelTopDepObj, IBusModelIndexObj, IBusModelPopDepObj, IBusModelPopSubDep1Obj, IBusModelPopSubDep2Obj, IBusModelPopSubDep3Obj, IBusModelPopTopDepObj, IBusModelRelationObj" );
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
						IBusModelScopeObj selectedInstance = getJavaFXFocusAsScope();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelScope.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getScopeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXScopePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaDef.CLASS_CODE ) {
								IBusModelSchemaDefObj obj = (IBusModelSchemaDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaRef.CLASS_CODE ) {
								IBusModelSchemaRefObj obj = (IBusModelSchemaRefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerMethod.CLASS_CODE ) {
								IBusModelServerMethodObj obj = (IBusModelServerMethodObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerObjFunc.CLASS_CODE ) {
								IBusModelServerObjFuncObj obj = (IBusModelServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerProc.CLASS_CODE ) {
								IBusModelServerProcObj obj = (IBusModelServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerListFunc.CLASS_CODE ) {
								IBusModelServerListFuncObj obj = (IBusModelServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTable.CLASS_CODE ) {
								IBusModelTableObj obj = (IBusModelTableObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTablePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearDep.CLASS_CODE ) {
								IBusModelClearDepObj obj = (IBusModelClearDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep1.CLASS_CODE ) {
								IBusModelClearSubDep1Obj obj = (IBusModelClearSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep2.CLASS_CODE ) {
								IBusModelClearSubDep2Obj obj = (IBusModelClearSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep3.CLASS_CODE ) {
								IBusModelClearSubDep3Obj obj = (IBusModelClearSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearTopDep.CLASS_CODE ) {
								IBusModelClearTopDepObj obj = (IBusModelClearTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXClearTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelDep.CLASS_CODE ) {
								IBusModelDelDepObj obj = (IBusModelDelDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep1.CLASS_CODE ) {
								IBusModelDelSubDep1Obj obj = (IBusModelDelSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep2.CLASS_CODE ) {
								IBusModelDelSubDep2Obj obj = (IBusModelDelSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep3.CLASS_CODE ) {
								IBusModelDelSubDep3Obj obj = (IBusModelDelSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelTopDep.CLASS_CODE ) {
								IBusModelDelTopDepObj obj = (IBusModelDelTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDelTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelIndex.CLASS_CODE ) {
								IBusModelIndexObj obj = (IBusModelIndexObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getIndexFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopDep.CLASS_CODE ) {
								IBusModelPopDepObj obj = (IBusModelPopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep1.CLASS_CODE ) {
								IBusModelPopSubDep1Obj obj = (IBusModelPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep2.CLASS_CODE ) {
								IBusModelPopSubDep2Obj obj = (IBusModelPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep3.CLASS_CODE ) {
								IBusModelPopSubDep3Obj obj = (IBusModelPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopTopDep.CLASS_CODE ) {
								IBusModelPopTopDepObj obj = (IBusModelPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelRelation.CLASS_CODE ) {
								IBusModelRelationObj obj = (IBusModelRelationObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getRelationFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelScopeObj, IBusModelSchemaDefObj, IBusModelSchemaRefObj, IBusModelServerMethodObj, IBusModelServerObjFuncObj, IBusModelServerProcObj, IBusModelServerListFuncObj, IBusModelTableObj, IBusModelClearDepObj, IBusModelClearSubDep1Obj, IBusModelClearSubDep2Obj, IBusModelClearSubDep3Obj, IBusModelClearTopDepObj, IBusModelDelDepObj, IBusModelDelSubDep1Obj, IBusModelDelSubDep2Obj, IBusModelDelSubDep3Obj, IBusModelDelTopDepObj, IBusModelIndexObj, IBusModelPopDepObj, IBusModelPopSubDep1Obj, IBusModelPopSubDep2Obj, IBusModelPopSubDep3Obj, IBusModelPopTopDepObj, IBusModelRelationObj" );
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
						IBusModelScopeObj selectedInstance = getJavaFXFocusAsScope();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelScope.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getScopeFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXScopePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaDef.CLASS_CODE ) {
								IBusModelSchemaDefObj obj = (IBusModelSchemaDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXSchemaDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaRef.CLASS_CODE ) {
								IBusModelSchemaRefObj obj = (IBusModelSchemaRefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerMethod.CLASS_CODE ) {
								IBusModelServerMethodObj obj = (IBusModelServerMethodObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerObjFunc.CLASS_CODE ) {
								IBusModelServerObjFuncObj obj = (IBusModelServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerProc.CLASS_CODE ) {
								IBusModelServerProcObj obj = (IBusModelServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelServerListFunc.CLASS_CODE ) {
								IBusModelServerListFuncObj obj = (IBusModelServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTable.CLASS_CODE ) {
								IBusModelTableObj obj = (IBusModelTableObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTablePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearDep.CLASS_CODE ) {
								IBusModelClearDepObj obj = (IBusModelClearDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXClearDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep1.CLASS_CODE ) {
								IBusModelClearSubDep1Obj obj = (IBusModelClearSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXClearSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep2.CLASS_CODE ) {
								IBusModelClearSubDep2Obj obj = (IBusModelClearSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXClearSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearSubDep3.CLASS_CODE ) {
								IBusModelClearSubDep3Obj obj = (IBusModelClearSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXClearSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelClearTopDep.CLASS_CODE ) {
								IBusModelClearTopDepObj obj = (IBusModelClearTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXClearTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelDep.CLASS_CODE ) {
								IBusModelDelDepObj obj = (IBusModelDelDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDelDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep1.CLASS_CODE ) {
								IBusModelDelSubDep1Obj obj = (IBusModelDelSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDelSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep2.CLASS_CODE ) {
								IBusModelDelSubDep2Obj obj = (IBusModelDelSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDelSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelSubDep3.CLASS_CODE ) {
								IBusModelDelSubDep3Obj obj = (IBusModelDelSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDelSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDelTopDep.CLASS_CODE ) {
								IBusModelDelTopDepObj obj = (IBusModelDelTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDelTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelIndex.CLASS_CODE ) {
								IBusModelIndexObj obj = (IBusModelIndexObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getIndexFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopDep.CLASS_CODE ) {
								IBusModelPopDepObj obj = (IBusModelPopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep1.CLASS_CODE ) {
								IBusModelPopSubDep1Obj obj = (IBusModelPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep2.CLASS_CODE ) {
								IBusModelPopSubDep2Obj obj = (IBusModelPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep3.CLASS_CODE ) {
								IBusModelPopSubDep3Obj obj = (IBusModelPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopTopDep.CLASS_CODE ) {
								IBusModelPopTopDepObj obj = (IBusModelPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelRelation.CLASS_CODE ) {
								IBusModelRelationObj obj = (IBusModelRelationObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getRelationFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelScopeObj, IBusModelSchemaDefObj, IBusModelSchemaRefObj, IBusModelServerMethodObj, IBusModelServerObjFuncObj, IBusModelServerProcObj, IBusModelServerListFuncObj, IBusModelTableObj, IBusModelClearDepObj, IBusModelClearSubDep1Obj, IBusModelClearSubDep2Obj, IBusModelClearSubDep3Obj, IBusModelClearTopDepObj, IBusModelDelDepObj, IBusModelDelSubDep1Obj, IBusModelDelSubDep2Obj, IBusModelDelSubDep3Obj, IBusModelDelTopDepObj, IBusModelIndexObj, IBusModelPopDepObj, IBusModelPopSubDep1Obj, IBusModelPopSubDep2Obj, IBusModelPopSubDep3Obj, IBusModelPopTopDepObj, IBusModelRelationObj" );
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

	public ICFLibAnyObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFLibAnyObj value ) {
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
		IBusModelScopeObj selectedObj = getJavaFXFocusAsScope();
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
