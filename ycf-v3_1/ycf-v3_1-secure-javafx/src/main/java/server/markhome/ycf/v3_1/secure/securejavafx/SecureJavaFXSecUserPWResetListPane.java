// Description: Java 25 JavaFX List of Obj Pane implementation for SecUserPWReset.

/*
 *	server.markhome.ycf.Secure
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal 3.1 Secure - Security Services
 *	
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow mark.sobkow@gmail.com
 *	
 *	These files are part of Yorkton Code Fractal Secure.
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

package server.markhome.ycf.v3_1.secure.securejavafx;

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
import server.markhome.ycf.v3_1.secure.secureobj.*;

/**
 *	SecureJavaFXSecUserPWResetListPane JavaFX List of Obj Pane implementation
 *	for SecUserPWReset.
 */
public class SecureJavaFXSecUserPWResetListPane
extends CFBorderPane
implements ISecureJavaFXSecUserPWResetPaneList
{
	public static String S_FormName = "List Password Reset";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecUserPWResetObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecUserPWResetObj> observableListOfSecUserPWReset = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddSecUserPWReset = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ISecureSecUserPWResetObj> dataTable = null;
	protected TableColumn<ISecureSecUserPWResetObj, String> tableColumnSentToEMailAddr = null;
	protected TableColumn<ISecureSecUserPWResetObj, ICFUuid6> tableColumnPasswordResetUuid6 = null;
	protected TableColumn<ISecureSecUserPWResetObj, Boolean> tableColumnNewAccount = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected ISecureSecUserObj javafxContainer = null;
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


	public SecureJavaFXSecUserPWResetListPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecUserObj argContainer,
		ISecureSecUserPWResetObj argFocus,
		Collection<ISecureSecUserPWResetObj> argDataCollection,
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
		dataTable = new TableView<ISecureSecUserPWResetObj>();
		tableColumnSentToEMailAddr = new TableColumn<ISecureSecUserPWResetObj,String>( "Sent To EMail Address" );
		tableColumnSentToEMailAddr.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserPWResetObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserPWResetObj, String> p ) {
				ISecureSecUserPWResetObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredSentToEMailAddr();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnSentToEMailAddr.setCellFactory( new Callback<TableColumn<ISecureSecUserPWResetObj,String>,TableCell<ISecureSecUserPWResetObj,String>>() {
			@Override public TableCell<ISecureSecUserPWResetObj,String> call(
				TableColumn<ISecureSecUserPWResetObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserPWResetObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSentToEMailAddr );
		tableColumnPasswordResetUuid6 = new TableColumn<ISecureSecUserPWResetObj,ICFUuid6>( "Password Reset UUID6" );
		tableColumnPasswordResetUuid6.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserPWResetObj,ICFUuid6>,ObservableValue<ICFUuid6> >() {
			public ObservableValue<ICFUuid6> call( CellDataFeatures<ISecureSecUserPWResetObj, ICFUuid6> p ) {
				ISecureSecUserPWResetObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFUuid6 value = obj.getRequiredPasswordResetUuid6();
					ReadOnlyObjectWrapper<ICFUuid6> observable = new ReadOnlyObjectWrapper<ICFUuid6>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnPasswordResetUuid6.setCellFactory( new Callback<TableColumn<ISecureSecUserPWResetObj,ICFUuid6>,TableCell<ISecureSecUserPWResetObj,ICFUuid6>>() {
			@Override public TableCell<ISecureSecUserPWResetObj,ICFUuid6> call(
				TableColumn<ISecureSecUserPWResetObj,ICFUuid6> arg)
			{
				return new CFUuid6TableCell<ISecureSecUserPWResetObj>();
			}
		});
		dataTable.getColumns().add( tableColumnPasswordResetUuid6 );
		tableColumnNewAccount = new TableColumn<ISecureSecUserPWResetObj,Boolean>( "Password reset is for new account?" );
		tableColumnNewAccount.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserPWResetObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ISecureSecUserPWResetObj, Boolean> p ) {
				ISecureSecUserPWResetObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredNewAccount();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnNewAccount.setCellFactory( new Callback<TableColumn<ISecureSecUserPWResetObj,Boolean>,TableCell<ISecureSecUserPWResetObj,Boolean>>() {
			@Override public TableCell<ISecureSecUserPWResetObj,Boolean> call(
				TableColumn<ISecureSecUserPWResetObj,Boolean> arg)
			{
				return new CFBoolTableCell<ISecureSecUserPWResetObj>();
			}
		});
		dataTable.getColumns().add( tableColumnNewAccount );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecUserPWResetObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecUserPWResetObj> observable,
					ISecureSecUserPWResetObj oldValue,
					ISecureSecUserPWResetObj newValue )
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
		if( observableListOfSecUserPWReset != null ) {
			dataTable.setItems( observableListOfSecUserPWReset );
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

	public ISecureJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ISecureSecUserPWResetObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecUserPWResetObj" );
		}
		adjustListButtons();
	}

	public ISecureSecUserPWResetObj getJavaFXFocusAsSecUserPWReset() {
		return( (ISecureSecUserPWResetObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecUserPWReset( ISecureSecUserPWResetObj value ) {
		setJavaFXFocus( value );
	}

	public class SecUserPWResetByQualNameComparator
	implements Comparator<ISecureSecUserPWResetObj>
	{
		public SecUserPWResetByQualNameComparator() {
		}

		public int compare( ISecureSecUserPWResetObj lhs, ISecureSecUserPWResetObj rhs ) {
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

	protected SecUserPWResetByQualNameComparator compareSecUserPWResetByQualName = new SecUserPWResetByQualNameComparator();

	public Collection<ISecureSecUserPWResetObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecUserPWResetObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecUserPWReset = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecUserPWResetObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecUserPWReset.add( iter.next() );
				}
				observableListOfSecUserPWReset.sort( compareSecUserPWResetByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecUserPWReset );
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
			buttonAddSecUserPWReset = new CFButton();
			buttonAddSecUserPWReset.setMinWidth( 200 );
			buttonAddSecUserPWReset.setText( "Add Password Reset" );
			buttonAddSecUserPWReset.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
						ISecureSecUserPWResetObj obj = (ISecureSecUserPWResetObj)schemaObj.getSecUserPWResetTableObj().newInstance();
						ISecureSecUserPWResetEditObj edit = (ISecureSecUserPWResetEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
								ISecureSecUserObj container = (ISecureSecUserObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerUser( container );
						CFBorderPane frame = javafxSchema.getSecUserPWResetFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ISecureJavaFXSecUserPWResetPaneCommon jpanelCommon = (ISecureJavaFXSecUserPWResetPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddSecUserPWReset );
			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ISecureSecUserPWResetObj selectedInstance = getJavaFXFocusAsSecUserPWReset();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserPWReset.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserPWResetFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserPWResetPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserPWResetObj" );
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
						ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ISecureSecUserPWResetObj selectedInstance = getJavaFXFocusAsSecUserPWReset();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserPWReset.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserPWResetFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserPWResetPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserPWResetObj" );
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
						ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ISecureSecUserPWResetObj selectedInstance = getJavaFXFocusAsSecUserPWReset();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserPWReset.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserPWResetFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ISecureJavaFXSecUserPWResetPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserPWResetObj" );
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

	public ISecureSecUserObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ISecureSecUserObj value ) {
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
		ISecureSecUserPWResetObj selectedObj = getJavaFXFocusAsSecUserPWReset();
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
		if( buttonAddSecUserPWReset != null ) {
			buttonAddSecUserPWReset.setDisable( ! allowAdds );
		}

	}
}
