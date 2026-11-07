// Description: Java 25 JavaFX List of Obj Pane implementation for SecUserEMConf.

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
 *	SecureJavaFXSecUserEMConfListPane JavaFX List of Obj Pane implementation
 *	for SecUserEMConf.
 */
public class SecureJavaFXSecUserEMConfListPane
extends CFBorderPane
implements ISecureJavaFXSecUserEMConfPaneList
{
	public static String S_FormName = "List Email confirmation";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecUserEMConfObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecUserEMConfObj> observableListOfSecUserEMConf = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddSecUserEMConf = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ISecureSecUserEMConfObj> dataTable = null;
	protected TableColumn<ISecureSecUserEMConfObj, String> tableColumnConfirmEMailAddr = null;
	protected TableColumn<ISecureSecUserEMConfObj, LocalDateTime> tableColumnEMailSentStamp = null;
	protected TableColumn<ISecureSecUserEMConfObj, ICFUuid6> tableColumnEMConfirmationUuid6 = null;
	protected TableColumn<ISecureSecUserEMConfObj, Boolean> tableColumnNewAccount = null;

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


	public SecureJavaFXSecUserEMConfListPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecUserObj argContainer,
		ISecureSecUserEMConfObj argFocus,
		Collection<ISecureSecUserEMConfObj> argDataCollection,
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
		dataTable = new TableView<ISecureSecUserEMConfObj>();
		tableColumnConfirmEMailAddr = new TableColumn<ISecureSecUserEMConfObj,String>( "Confirm EMail Address" );
		tableColumnConfirmEMailAddr.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserEMConfObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserEMConfObj, String> p ) {
				ISecureSecUserEMConfObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredConfirmEMailAddr();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnConfirmEMailAddr.setCellFactory( new Callback<TableColumn<ISecureSecUserEMConfObj,String>,TableCell<ISecureSecUserEMConfObj,String>>() {
			@Override public TableCell<ISecureSecUserEMConfObj,String> call(
				TableColumn<ISecureSecUserEMConfObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserEMConfObj>();
			}
		});
		dataTable.getColumns().add( tableColumnConfirmEMailAddr );
		tableColumnEMailSentStamp = new TableColumn<ISecureSecUserEMConfObj,LocalDateTime>( "Confirmation EMail Sent At" );
		tableColumnEMailSentStamp.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserEMConfObj,LocalDateTime>,ObservableValue<LocalDateTime> >() {
			public ObservableValue<LocalDateTime> call( CellDataFeatures<ISecureSecUserEMConfObj, LocalDateTime> p ) {
				ISecureSecUserEMConfObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					LocalDateTime value = obj.getRequiredEMailSentStamp();
					ReadOnlyObjectWrapper<LocalDateTime> observable = new ReadOnlyObjectWrapper<LocalDateTime>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnEMailSentStamp.setCellFactory( new Callback<TableColumn<ISecureSecUserEMConfObj,LocalDateTime>,TableCell<ISecureSecUserEMConfObj,LocalDateTime>>() {
			@Override public TableCell<ISecureSecUserEMConfObj,LocalDateTime> call(
				TableColumn<ISecureSecUserEMConfObj,LocalDateTime> arg)
			{
				return new CFTimestampTableCell<ISecureSecUserEMConfObj>();
			}
		});
		dataTable.getColumns().add( tableColumnEMailSentStamp );
		tableColumnEMConfirmationUuid6 = new TableColumn<ISecureSecUserEMConfObj,ICFUuid6>( "EMail Confirmation UUID6" );
		tableColumnEMConfirmationUuid6.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserEMConfObj,ICFUuid6>,ObservableValue<ICFUuid6> >() {
			public ObservableValue<ICFUuid6> call( CellDataFeatures<ISecureSecUserEMConfObj, ICFUuid6> p ) {
				ISecureSecUserEMConfObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFUuid6 value = obj.getRequiredEMConfirmationUuid6();
					ReadOnlyObjectWrapper<ICFUuid6> observable = new ReadOnlyObjectWrapper<ICFUuid6>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnEMConfirmationUuid6.setCellFactory( new Callback<TableColumn<ISecureSecUserEMConfObj,ICFUuid6>,TableCell<ISecureSecUserEMConfObj,ICFUuid6>>() {
			@Override public TableCell<ISecureSecUserEMConfObj,ICFUuid6> call(
				TableColumn<ISecureSecUserEMConfObj,ICFUuid6> arg)
			{
				return new CFUuid6TableCell<ISecureSecUserEMConfObj>();
			}
		});
		dataTable.getColumns().add( tableColumnEMConfirmationUuid6 );
		tableColumnNewAccount = new TableColumn<ISecureSecUserEMConfObj,Boolean>( "Confirmation email is for new account?" );
		tableColumnNewAccount.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserEMConfObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ISecureSecUserEMConfObj, Boolean> p ) {
				ISecureSecUserEMConfObj obj = p.getValue();
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
		tableColumnNewAccount.setCellFactory( new Callback<TableColumn<ISecureSecUserEMConfObj,Boolean>,TableCell<ISecureSecUserEMConfObj,Boolean>>() {
			@Override public TableCell<ISecureSecUserEMConfObj,Boolean> call(
				TableColumn<ISecureSecUserEMConfObj,Boolean> arg)
			{
				return new CFBoolTableCell<ISecureSecUserEMConfObj>();
			}
		});
		dataTable.getColumns().add( tableColumnNewAccount );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecUserEMConfObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecUserEMConfObj> observable,
					ISecureSecUserEMConfObj oldValue,
					ISecureSecUserEMConfObj newValue )
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
		if( observableListOfSecUserEMConf != null ) {
			dataTable.setItems( observableListOfSecUserEMConf );
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
		if( ( value == null ) || ( value instanceof ISecureSecUserEMConfObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecUserEMConfObj" );
		}
		adjustListButtons();
	}

	public ISecureSecUserEMConfObj getJavaFXFocusAsSecUserEMConf() {
		return( (ISecureSecUserEMConfObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecUserEMConf( ISecureSecUserEMConfObj value ) {
		setJavaFXFocus( value );
	}

	public class SecUserEMConfByQualNameComparator
	implements Comparator<ISecureSecUserEMConfObj>
	{
		public SecUserEMConfByQualNameComparator() {
		}

		public int compare( ISecureSecUserEMConfObj lhs, ISecureSecUserEMConfObj rhs ) {
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

	protected SecUserEMConfByQualNameComparator compareSecUserEMConfByQualName = new SecUserEMConfByQualNameComparator();

	public Collection<ISecureSecUserEMConfObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecUserEMConfObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecUserEMConf = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecUserEMConfObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecUserEMConf.add( iter.next() );
				}
				observableListOfSecUserEMConf.sort( compareSecUserEMConfByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecUserEMConf );
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
			buttonAddSecUserEMConf = new CFButton();
			buttonAddSecUserEMConf.setMinWidth( 200 );
			buttonAddSecUserEMConf.setText( "Add Email confirmation" );
			buttonAddSecUserEMConf.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
						ISecureSecUserEMConfObj obj = (ISecureSecUserEMConfObj)schemaObj.getSecUserEMConfTableObj().newInstance();
						ISecureSecUserEMConfEditObj edit = (ISecureSecUserEMConfEditObj)( obj.beginEdit() );
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
						CFBorderPane frame = javafxSchema.getSecUserEMConfFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ISecureJavaFXSecUserEMConfPaneCommon jpanelCommon = (ISecureJavaFXSecUserEMConfPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddSecUserEMConf );
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
						ISecureSecUserEMConfObj selectedInstance = getJavaFXFocusAsSecUserEMConf();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserEMConf.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserEMConfFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserEMConfPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserEMConfObj" );
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
						ISecureSecUserEMConfObj selectedInstance = getJavaFXFocusAsSecUserEMConf();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserEMConf.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserEMConfFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserEMConfPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserEMConfObj" );
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
						ISecureSecUserEMConfObj selectedInstance = getJavaFXFocusAsSecUserEMConf();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserEMConf.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserEMConfFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ISecureJavaFXSecUserEMConfPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserEMConfObj" );
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
		ISecureSecUserEMConfObj selectedObj = getJavaFXFocusAsSecUserEMConf();
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
		if( buttonAddSecUserEMConf != null ) {
			buttonAddSecUserEMConf.setDisable( ! allowAdds );
		}

	}
}
