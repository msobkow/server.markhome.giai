// Description: Java 25 JavaFX List of Obj Pane implementation for URLProtocol.

/*
 *	server.markhome.ycf.IntNet
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal 3.1 IntNet - Internet Essentials
 *	
 *	This file is part of Yorkton Code Fractal IntNet.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *	
 */

package server.markhome.ycf.v3_1.intnet.intnetjavafx;

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
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.secure.securejavafx.*;

/**
 *	IntNetJavaFXURLProtocolListPane JavaFX List of Obj Pane implementation
 *	for URLProtocol.
 */
public class IntNetJavaFXURLProtocolListPane
extends CFBorderPane
implements IIntNetJavaFXURLProtocolPaneList
{
	public static String S_FormName = "List URL Protocol";
	protected IIntNetJavaFXSchema javafxSchema = null;
	protected Collection<IIntNetURLProtocolObj> javafxDataCollection = null;
	protected ObservableList<IIntNetURLProtocolObj> observableListOfURLProtocol = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddURLProtocol = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IIntNetURLProtocolObj> dataTable = null;
	protected TableColumn<IIntNetURLProtocolObj, Integer> tableColumnURLProtocolId = null;
	protected TableColumn<IIntNetURLProtocolObj, String> tableColumnName = null;
	protected TableColumn<IIntNetURLProtocolObj, String> tableColumnDescription = null;
	protected TableColumn<IIntNetURLProtocolObj, Boolean> tableColumnIsSecure = null;

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


	public IntNetJavaFXURLProtocolListPane( ICFFormManager formManager,
		IIntNetJavaFXSchema argSchema,
		ICFLibAnyObj argContainer,
		IIntNetURLProtocolObj argFocus,
		Collection<IIntNetURLProtocolObj> argDataCollection,
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
		dataTable = new TableView<IIntNetURLProtocolObj>();
		tableColumnURLProtocolId = new TableColumn<IIntNetURLProtocolObj,Integer>( "URL Protocol Id" );
		tableColumnURLProtocolId.setCellValueFactory( new Callback<CellDataFeatures<IIntNetURLProtocolObj,Integer>,ObservableValue<Integer> >() {
			public ObservableValue<Integer> call( CellDataFeatures<IIntNetURLProtocolObj, Integer> p ) {
				IIntNetURLProtocolObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					int value = obj.getRequiredURLProtocolId();
					Integer wrapped = Integer.valueOf( value );
					ReadOnlyObjectWrapper<Integer> observable = new ReadOnlyObjectWrapper<Integer>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnURLProtocolId.setCellFactory( new Callback<TableColumn<IIntNetURLProtocolObj,Integer>,TableCell<IIntNetURLProtocolObj,Integer>>() {
			@Override public TableCell<IIntNetURLProtocolObj,Integer> call(
				TableColumn<IIntNetURLProtocolObj,Integer> arg)
			{
				return new CFInt32TableCell<IIntNetURLProtocolObj>();
			}
		});
		dataTable.getColumns().add( tableColumnURLProtocolId );
		tableColumnName = new TableColumn<IIntNetURLProtocolObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IIntNetURLProtocolObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetURLProtocolObj, String> p ) {
				IIntNetURLProtocolObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IIntNetURLProtocolObj,String>,TableCell<IIntNetURLProtocolObj,String>>() {
			@Override public TableCell<IIntNetURLProtocolObj,String> call(
				TableColumn<IIntNetURLProtocolObj,String> arg)
			{
				return new CFStringTableCell<IIntNetURLProtocolObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnDescription = new TableColumn<IIntNetURLProtocolObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IIntNetURLProtocolObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetURLProtocolObj, String> p ) {
				IIntNetURLProtocolObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredDescription();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IIntNetURLProtocolObj,String>,TableCell<IIntNetURLProtocolObj,String>>() {
			@Override public TableCell<IIntNetURLProtocolObj,String> call(
				TableColumn<IIntNetURLProtocolObj,String> arg)
			{
				return new CFStringTableCell<IIntNetURLProtocolObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnIsSecure = new TableColumn<IIntNetURLProtocolObj,Boolean>( "IsSecure" );
		tableColumnIsSecure.setCellValueFactory( new Callback<CellDataFeatures<IIntNetURLProtocolObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IIntNetURLProtocolObj, Boolean> p ) {
				IIntNetURLProtocolObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsSecure();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsSecure.setCellFactory( new Callback<TableColumn<IIntNetURLProtocolObj,Boolean>,TableCell<IIntNetURLProtocolObj,Boolean>>() {
			@Override public TableCell<IIntNetURLProtocolObj,Boolean> call(
				TableColumn<IIntNetURLProtocolObj,Boolean> arg)
			{
				return new CFBoolTableCell<IIntNetURLProtocolObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsSecure );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IIntNetURLProtocolObj>() {
				@Override public void changed( ObservableValue<? extends IIntNetURLProtocolObj> observable,
					IIntNetURLProtocolObj oldValue,
					IIntNetURLProtocolObj newValue )
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
		if( observableListOfURLProtocol != null ) {
			dataTable.setItems( observableListOfURLProtocol );
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

	public IIntNetJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IIntNetURLProtocolObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IIntNetURLProtocolObj" );
		}
		adjustListButtons();
	}

	public IIntNetURLProtocolObj getJavaFXFocusAsURLProtocol() {
		return( (IIntNetURLProtocolObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsURLProtocol( IIntNetURLProtocolObj value ) {
		setJavaFXFocus( value );
	}

	public class URLProtocolByQualNameComparator
	implements Comparator<IIntNetURLProtocolObj>
	{
		public URLProtocolByQualNameComparator() {
		}

		public int compare( IIntNetURLProtocolObj lhs, IIntNetURLProtocolObj rhs ) {
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

	protected URLProtocolByQualNameComparator compareURLProtocolByQualName = new URLProtocolByQualNameComparator();

	public Collection<IIntNetURLProtocolObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IIntNetURLProtocolObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfURLProtocol = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IIntNetURLProtocolObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfURLProtocol.add( iter.next() );
				}
				observableListOfURLProtocol.sort( compareURLProtocolByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfURLProtocol );
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
			buttonAddURLProtocol = new CFButton();
			buttonAddURLProtocol.setMinWidth( 200 );
			buttonAddURLProtocol.setText( "Add URL Protocol" );
			buttonAddURLProtocol.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
						IIntNetURLProtocolObj obj = (IIntNetURLProtocolObj)schemaObj.getURLProtocolTableObj().newInstance();
						IIntNetURLProtocolEditObj edit = (IIntNetURLProtocolEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
						CFBorderPane frame = javafxSchema.getURLProtocolFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IIntNetJavaFXURLProtocolPaneCommon jpanelCommon = (IIntNetJavaFXURLProtocolPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddURLProtocol );
			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IIntNetURLProtocolObj selectedInstance = getJavaFXFocusAsURLProtocol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IIntNetSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("IntNet") && backingClassCode == IIntNetURLProtocol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getURLProtocolFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IIntNetJavaFXURLProtocolPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IIntNetURLProtocolObj" );
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
						IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IIntNetURLProtocolObj selectedInstance = getJavaFXFocusAsURLProtocol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IIntNetSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("IntNet") && backingClassCode == IIntNetURLProtocol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getURLProtocolFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IIntNetJavaFXURLProtocolPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IIntNetURLProtocolObj" );
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
						IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IIntNetURLProtocolObj selectedInstance = getJavaFXFocusAsURLProtocol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IIntNetSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("IntNet") && backingClassCode == IIntNetURLProtocol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getURLProtocolFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IIntNetJavaFXURLProtocolPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IIntNetURLProtocolObj" );
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
		IIntNetURLProtocolObj selectedObj = getJavaFXFocusAsURLProtocol();
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
		if( buttonAddURLProtocol != null ) {
			buttonAddURLProtocol.setDisable( ! allowAdds );
		}

	}
}
