// Description: Java 25 JavaFX List of Obj Pane implementation for SecUser.

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
 *	SecureJavaFXSecUserListPane JavaFX List of Obj Pane implementation
 *	for SecUser.
 */
public class SecureJavaFXSecUserListPane
extends CFBorderPane
implements ISecureJavaFXSecUserPaneList
{
	public static String S_FormName = "List Security User";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecUserObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecUserObj> observableListOfSecUser = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddSecUser = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ISecureSecUserObj> dataTable = null;
	protected TableColumn<ISecureSecUserObj, ICFKeyHash256> tableColumnSecUserId = null;
	protected TableColumn<ISecureSecUserObj, String> tableColumnLoginId = null;
	protected TableColumn<ISecureSecUserObj, ISecurePubSchema.SecAccountStatusEnum> tableColumnAccountStatus = null;
	protected TableColumn<ISecureSecUserObj, String> tableColumnDfltSysGrpName = null;
	protected TableColumn<ISecureSecUserObj, String> tableColumnDfltClusGrpName = null;
	protected TableColumn<ISecureSecUserObj, String> tableColumnDfltTentGrpName = null;
	protected TableColumn<ISecureSecUserObj, String> tableColumnEMailAddress = null;

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


	public SecureJavaFXSecUserListPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ICFLibAnyObj argContainer,
		ISecureSecUserObj argFocus,
		Collection<ISecureSecUserObj> argDataCollection,
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
		dataTable = new TableView<ISecureSecUserObj>();
		tableColumnSecUserId = new TableColumn<ISecureSecUserObj,ICFKeyHash256>( "Security User Id" );
		tableColumnSecUserId.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<ISecureSecUserObj, ICFKeyHash256> p ) {
				ISecureSecUserObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFKeyHash256 value = obj.getRequiredSecUserId();
					ReadOnlyObjectWrapper<ICFKeyHash256> observable = new ReadOnlyObjectWrapper<ICFKeyHash256>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnSecUserId.setCellFactory( new Callback<TableColumn<ISecureSecUserObj,ICFKeyHash256>,TableCell<ISecureSecUserObj,ICFKeyHash256>>() {
			@Override public TableCell<ISecureSecUserObj,ICFKeyHash256> call(
				TableColumn<ISecureSecUserObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<ISecureSecUserObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSecUserId );
		tableColumnLoginId = new TableColumn<ISecureSecUserObj,String>( "Login Id" );
		tableColumnLoginId.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserObj, String> p ) {
				ISecureSecUserObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredLoginId();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnLoginId.setCellFactory( new Callback<TableColumn<ISecureSecUserObj,String>,TableCell<ISecureSecUserObj,String>>() {
			@Override public TableCell<ISecureSecUserObj,String> call(
				TableColumn<ISecureSecUserObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLoginId );
		tableColumnAccountStatus = new TableColumn<ISecureSecUserObj,ISecurePubSchema.SecAccountStatusEnum>( "Account Status" );
		tableColumnAccountStatus.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserObj,ISecurePubSchema.SecAccountStatusEnum>,ObservableValue<ISecurePubSchema.SecAccountStatusEnum> >() {
			public ObservableValue<ISecurePubSchema.SecAccountStatusEnum> call( CellDataFeatures<ISecureSecUserObj, ISecurePubSchema.SecAccountStatusEnum> p ) {
				ISecureSecUserObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ISecurePubSchema.SecAccountStatusEnum value = obj.getRequiredAccountStatus();
					ReadOnlyObjectWrapper<ISecurePubSchema.SecAccountStatusEnum> observable = new ReadOnlyObjectWrapper<ISecurePubSchema.SecAccountStatusEnum>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnAccountStatus.setCellFactory( new Callback<TableColumn<ISecureSecUserObj,ISecurePubSchema.SecAccountStatusEnum>,TableCell<ISecureSecUserObj,ISecurePubSchema.SecAccountStatusEnum>>() {
			@Override public TableCell<ISecureSecUserObj,ISecurePubSchema.SecAccountStatusEnum> call(
				TableColumn<ISecureSecUserObj,ISecurePubSchema.SecAccountStatusEnum> arg)
			{
				return new CFEnumTableCell<ISecureSecUserObj,ISecureSchema.SecAccountStatusEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnAccountStatus );
		tableColumnDfltSysGrpName = new TableColumn<ISecureSecUserObj,String>( "Default System Group Name" );
		tableColumnDfltSysGrpName.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserObj, String> p ) {
				ISecureSecUserObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDfltSysGrpName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDfltSysGrpName.setCellFactory( new Callback<TableColumn<ISecureSecUserObj,String>,TableCell<ISecureSecUserObj,String>>() {
			@Override public TableCell<ISecureSecUserObj,String> call(
				TableColumn<ISecureSecUserObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDfltSysGrpName );
		tableColumnDfltClusGrpName = new TableColumn<ISecureSecUserObj,String>( "Default Cluster Group Name" );
		tableColumnDfltClusGrpName.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserObj, String> p ) {
				ISecureSecUserObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDfltClusGrpName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDfltClusGrpName.setCellFactory( new Callback<TableColumn<ISecureSecUserObj,String>,TableCell<ISecureSecUserObj,String>>() {
			@Override public TableCell<ISecureSecUserObj,String> call(
				TableColumn<ISecureSecUserObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDfltClusGrpName );
		tableColumnDfltTentGrpName = new TableColumn<ISecureSecUserObj,String>( "Default Tenant Group Name" );
		tableColumnDfltTentGrpName.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserObj, String> p ) {
				ISecureSecUserObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDfltTentGrpName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDfltTentGrpName.setCellFactory( new Callback<TableColumn<ISecureSecUserObj,String>,TableCell<ISecureSecUserObj,String>>() {
			@Override public TableCell<ISecureSecUserObj,String> call(
				TableColumn<ISecureSecUserObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDfltTentGrpName );
		tableColumnEMailAddress = new TableColumn<ISecureSecUserObj,String>( "EMail Address" );
		tableColumnEMailAddress.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserObj, String> p ) {
				ISecureSecUserObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredEMailAddress();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnEMailAddress.setCellFactory( new Callback<TableColumn<ISecureSecUserObj,String>,TableCell<ISecureSecUserObj,String>>() {
			@Override public TableCell<ISecureSecUserObj,String> call(
				TableColumn<ISecureSecUserObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserObj>();
			}
		});
		dataTable.getColumns().add( tableColumnEMailAddress );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecUserObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecUserObj> observable,
					ISecureSecUserObj oldValue,
					ISecureSecUserObj newValue )
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
		if( observableListOfSecUser != null ) {
			dataTable.setItems( observableListOfSecUser );
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
		if( ( value == null ) || ( value instanceof ISecureSecUserObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecUserObj" );
		}
		adjustListButtons();
	}

	public ISecureSecUserObj getJavaFXFocusAsSecUser() {
		return( (ISecureSecUserObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecUser( ISecureSecUserObj value ) {
		setJavaFXFocus( value );
	}

	public class SecUserByQualNameComparator
	implements Comparator<ISecureSecUserObj>
	{
		public SecUserByQualNameComparator() {
		}

		public int compare( ISecureSecUserObj lhs, ISecureSecUserObj rhs ) {
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

	protected SecUserByQualNameComparator compareSecUserByQualName = new SecUserByQualNameComparator();

	public Collection<ISecureSecUserObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecUserObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecUser = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecUserObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecUser.add( iter.next() );
				}
				observableListOfSecUser.sort( compareSecUserByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecUser );
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
			buttonAddSecUser = new CFButton();
			buttonAddSecUser.setMinWidth( 200 );
			buttonAddSecUser.setText( "Add Security User" );
			buttonAddSecUser.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
						ISecureSecUserObj obj = (ISecureSecUserObj)schemaObj.getSecUserTableObj().newInstance();
						ISecureSecUserEditObj edit = (ISecureSecUserEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
						CFBorderPane frame = javafxSchema.getSecUserFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ISecureJavaFXSecUserPaneCommon jpanelCommon = (ISecureJavaFXSecUserPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddSecUser );
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
						ISecureSecUserObj selectedInstance = getJavaFXFocusAsSecUser();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUser.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserObj" );
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
						ISecureSecUserObj selectedInstance = getJavaFXFocusAsSecUser();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUser.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserObj" );
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
						ISecureSecUserObj selectedInstance = getJavaFXFocusAsSecUser();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUser.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ISecureJavaFXSecUserPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserObj" );
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
		ISecureSecUserObj selectedObj = getJavaFXFocusAsSecUser();
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
		if( buttonAddSecUser != null ) {
			buttonAddSecUser.setDisable( ! allowAdds );
		}

	}
}
