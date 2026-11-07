// Description: Java 25 JavaFX List of Obj Pane implementation for PopDep.

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
 *	BusModelJavaFXPopDepListPane JavaFX List of Obj Pane implementation
 *	for PopDep.
 */
public class BusModelJavaFXPopDepListPane
extends CFBorderPane
implements IBusModelJavaFXPopDepPaneList
{
	public static String S_FormName = "List PopDep";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelPopDepObj> javafxDataCollection = null;
	protected ObservableList<IBusModelPopDepObj> observableListOfPopDep = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddPopSubDep1 = null;
	protected CFButton buttonAddPopSubDep2 = null;
	protected CFButton buttonAddPopSubDep3 = null;
	protected CFButton buttonAddPopTopDep = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelPopDepObj> dataTable = null;
	protected TableColumn<IBusModelPopDepObj,String> tableColumnObjKind = null;
	protected TableColumn<IBusModelPopDepObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelPopDepObj, IBusModelRelationObj> tableColumnLookupRelation = null;
	protected TableColumn<IBusModelPopDepObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public BusModelJavaFXPopDepListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		ICFLibAnyObj argContainer,
		IBusModelPopDepObj argFocus,
		Collection<IBusModelPopDepObj> argDataCollection,
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
		dataTable = new TableView<IBusModelPopDepObj>();
		tableColumnObjKind = new TableColumn<IBusModelPopDepObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<IBusModelPopDepObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<IBusModelPopDepObj, String> p ) {
				IBusModelPopDepObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<IBusModelPopDepObj,String>,TableCell<IBusModelPopDepObj,String>>() {
			@Override public TableCell<IBusModelPopDepObj,String> call(
				TableColumn<IBusModelPopDepObj,String> arg)
			{
				return new CFStringTableCell<IBusModelPopDepObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<IBusModelPopDepObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelPopDepObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelPopDepObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelPopDepObj,ICFKeyHash256>,TableCell<IBusModelPopDepObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelPopDepObj,ICFKeyHash256> call(
				TableColumn<IBusModelPopDepObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelPopDepObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnLookupRelation = new TableColumn<IBusModelPopDepObj, IBusModelRelationObj>( "Relation" );
		tableColumnLookupRelation.setCellValueFactory( new Callback<CellDataFeatures<IBusModelPopDepObj,IBusModelRelationObj>,ObservableValue<IBusModelRelationObj> >() {
			public ObservableValue<IBusModelRelationObj> call( CellDataFeatures<IBusModelPopDepObj, IBusModelRelationObj> p ) {
				IBusModelPopDepObj obj = p.getValue();
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
		tableColumnLookupRelation.setCellFactory( new Callback<TableColumn<IBusModelPopDepObj,IBusModelRelationObj>,TableCell<IBusModelPopDepObj,IBusModelRelationObj>>() {
			@Override public TableCell<IBusModelPopDepObj,IBusModelRelationObj> call(
				TableColumn<IBusModelPopDepObj,IBusModelRelationObj> arg)
			{
				return new CFReferenceTableCell<IBusModelPopDepObj,IBusModelRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRelation );
		tableColumnLookupDefSchema = new TableColumn<IBusModelPopDepObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelPopDepObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelPopDepObj, IBusModelSchemaDefObj> p ) {
				IBusModelPopDepObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelPopDepObj,IBusModelSchemaDefObj>,TableCell<IBusModelPopDepObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelPopDepObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelPopDepObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelPopDepObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelPopDepObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelPopDepObj> observable,
					IBusModelPopDepObj oldValue,
					IBusModelPopDepObj newValue )
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
		if( observableListOfPopDep != null ) {
			dataTable.setItems( observableListOfPopDep );
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
		if( ( value == null ) || ( value instanceof IBusModelPopDepObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelPopDepObj" );
		}
		adjustListButtons();
	}

	public IBusModelPopDepObj getJavaFXFocusAsPopDep() {
		return( (IBusModelPopDepObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsPopDep( IBusModelPopDepObj value ) {
		setJavaFXFocus( value );
	}

	public class PopDepByQualNameComparator
	implements Comparator<IBusModelPopDepObj>
	{
		public PopDepByQualNameComparator() {
		}

		public int compare( IBusModelPopDepObj lhs, IBusModelPopDepObj rhs ) {
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

	protected PopDepByQualNameComparator comparePopDepByQualName = new PopDepByQualNameComparator();

	public Collection<IBusModelPopDepObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelPopDepObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfPopDep = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelPopDepObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfPopDep.add( iter.next() );
				}
				observableListOfPopDep.sort( comparePopDepByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfPopDep );
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
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelPopTopDepObj container = (IBusModelPopTopDepObj)( getJavaFXContainer() );
								if( container == null ) {
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelPopSubDep1Obj container = (IBusModelPopSubDep1Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelPopSubDep2Obj container = (IBusModelPopSubDep2Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IBusModelRelationObj container = (IBusModelRelationObj)( getJavaFXContainer() );
								if( container == null ) {
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelPopDepObj selectedInstance = getJavaFXFocusAsPopDep();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopDep.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
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
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelPopDepObj, IBusModelPopSubDep1Obj, IBusModelPopSubDep2Obj, IBusModelPopSubDep3Obj, IBusModelPopTopDepObj" );
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
						IBusModelPopDepObj selectedInstance = getJavaFXFocusAsPopDep();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopDep.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep1.CLASS_CODE ) {
								IBusModelPopSubDep1Obj obj = (IBusModelPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep2.CLASS_CODE ) {
								IBusModelPopSubDep2Obj obj = (IBusModelPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopSubDep3.CLASS_CODE ) {
								IBusModelPopSubDep3Obj obj = (IBusModelPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopTopDep.CLASS_CODE ) {
								IBusModelPopTopDepObj obj = (IBusModelPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelPopDepObj, IBusModelPopSubDep1Obj, IBusModelPopSubDep2Obj, IBusModelPopSubDep3Obj, IBusModelPopTopDepObj" );
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
						IBusModelPopDepObj selectedInstance = getJavaFXFocusAsPopDep();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelPopDep.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getPopDepFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
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
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelPopDepObj, IBusModelPopSubDep1Obj, IBusModelPopSubDep2Obj, IBusModelPopSubDep3Obj, IBusModelPopTopDepObj" );
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
		IBusModelPopDepObj selectedObj = getJavaFXFocusAsPopDep();
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
