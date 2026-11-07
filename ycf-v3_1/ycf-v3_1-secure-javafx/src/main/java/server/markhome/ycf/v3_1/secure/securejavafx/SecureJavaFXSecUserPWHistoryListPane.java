// Description: Java 25 JavaFX List of Obj Pane implementation for SecUserPWHistory.

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
 *	SecureJavaFXSecUserPWHistoryListPane JavaFX List of Obj Pane implementation
 *	for SecUserPWHistory.
 */
public class SecureJavaFXSecUserPWHistoryListPane
extends CFBorderPane
implements ISecureJavaFXSecUserPWHistoryPaneList
{
	public static String S_FormName = "List Security User Password History";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecUserPWHistoryObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecUserPWHistoryObj> observableListOfSecUserPWHistory = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddSecUserPWHistory = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ISecureSecUserPWHistoryObj> dataTable = null;
	protected TableColumn<ISecureSecUserPWHistoryObj, ICFKeyHash256> tableColumnSecUserId = null;
	protected TableColumn<ISecureSecUserPWHistoryObj, LocalDateTime> tableColumnPWSetStamp = null;
	protected TableColumn<ISecureSecUserPWHistoryObj, LocalDateTime> tableColumnPWReplacedStamp = null;
	protected TableColumn<ISecureSecUserPWHistoryObj, String> tableColumnPasswordHash = null;

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


	public SecureJavaFXSecUserPWHistoryListPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ICFLibAnyObj argContainer,
		ISecureSecUserPWHistoryObj argFocus,
		Collection<ISecureSecUserPWHistoryObj> argDataCollection,
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
		dataTable = new TableView<ISecureSecUserPWHistoryObj>();
		tableColumnSecUserId = new TableColumn<ISecureSecUserPWHistoryObj,ICFKeyHash256>( "Security User Id" );
		tableColumnSecUserId.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserPWHistoryObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<ISecureSecUserPWHistoryObj, ICFKeyHash256> p ) {
				ISecureSecUserPWHistoryObj obj = p.getValue();
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
		tableColumnSecUserId.setCellFactory( new Callback<TableColumn<ISecureSecUserPWHistoryObj,ICFKeyHash256>,TableCell<ISecureSecUserPWHistoryObj,ICFKeyHash256>>() {
			@Override public TableCell<ISecureSecUserPWHistoryObj,ICFKeyHash256> call(
				TableColumn<ISecureSecUserPWHistoryObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<ISecureSecUserPWHistoryObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSecUserId );
		tableColumnPWSetStamp = new TableColumn<ISecureSecUserPWHistoryObj,LocalDateTime>( "Password set at" );
		tableColumnPWSetStamp.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserPWHistoryObj,LocalDateTime>,ObservableValue<LocalDateTime> >() {
			public ObservableValue<LocalDateTime> call( CellDataFeatures<ISecureSecUserPWHistoryObj, LocalDateTime> p ) {
				ISecureSecUserPWHistoryObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					LocalDateTime value = obj.getRequiredPWSetStamp();
					ReadOnlyObjectWrapper<LocalDateTime> observable = new ReadOnlyObjectWrapper<LocalDateTime>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnPWSetStamp.setCellFactory( new Callback<TableColumn<ISecureSecUserPWHistoryObj,LocalDateTime>,TableCell<ISecureSecUserPWHistoryObj,LocalDateTime>>() {
			@Override public TableCell<ISecureSecUserPWHistoryObj,LocalDateTime> call(
				TableColumn<ISecureSecUserPWHistoryObj,LocalDateTime> arg)
			{
				return new CFTimestampTableCell<ISecureSecUserPWHistoryObj>();
			}
		});
		dataTable.getColumns().add( tableColumnPWSetStamp );
		tableColumnPWReplacedStamp = new TableColumn<ISecureSecUserPWHistoryObj,LocalDateTime>( "Password set at" );
		tableColumnPWReplacedStamp.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserPWHistoryObj,LocalDateTime>,ObservableValue<LocalDateTime> >() {
			public ObservableValue<LocalDateTime> call( CellDataFeatures<ISecureSecUserPWHistoryObj, LocalDateTime> p ) {
				ISecureSecUserPWHistoryObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					LocalDateTime value = obj.getRequiredPWReplacedStamp();
					ReadOnlyObjectWrapper<LocalDateTime> observable = new ReadOnlyObjectWrapper<LocalDateTime>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnPWReplacedStamp.setCellFactory( new Callback<TableColumn<ISecureSecUserPWHistoryObj,LocalDateTime>,TableCell<ISecureSecUserPWHistoryObj,LocalDateTime>>() {
			@Override public TableCell<ISecureSecUserPWHistoryObj,LocalDateTime> call(
				TableColumn<ISecureSecUserPWHistoryObj,LocalDateTime> arg)
			{
				return new CFTimestampTableCell<ISecureSecUserPWHistoryObj>();
			}
		});
		dataTable.getColumns().add( tableColumnPWReplacedStamp );
		tableColumnPasswordHash = new TableColumn<ISecureSecUserPWHistoryObj,String>( "Password Hash" );
		tableColumnPasswordHash.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecUserPWHistoryObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecUserPWHistoryObj, String> p ) {
				ISecureSecUserPWHistoryObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredPasswordHash();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnPasswordHash.setCellFactory( new Callback<TableColumn<ISecureSecUserPWHistoryObj,String>,TableCell<ISecureSecUserPWHistoryObj,String>>() {
			@Override public TableCell<ISecureSecUserPWHistoryObj,String> call(
				TableColumn<ISecureSecUserPWHistoryObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecUserPWHistoryObj>();
			}
		});
		dataTable.getColumns().add( tableColumnPasswordHash );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecUserPWHistoryObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecUserPWHistoryObj> observable,
					ISecureSecUserPWHistoryObj oldValue,
					ISecureSecUserPWHistoryObj newValue )
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
		if( observableListOfSecUserPWHistory != null ) {
			dataTable.setItems( observableListOfSecUserPWHistory );
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
		if( ( value == null ) || ( value instanceof ISecureSecUserPWHistoryObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecUserPWHistoryObj" );
		}
		adjustListButtons();
	}

	public ISecureSecUserPWHistoryObj getJavaFXFocusAsSecUserPWHistory() {
		return( (ISecureSecUserPWHistoryObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecUserPWHistory( ISecureSecUserPWHistoryObj value ) {
		setJavaFXFocus( value );
	}

	public class SecUserPWHistoryByQualNameComparator
	implements Comparator<ISecureSecUserPWHistoryObj>
	{
		public SecUserPWHistoryByQualNameComparator() {
		}

		public int compare( ISecureSecUserPWHistoryObj lhs, ISecureSecUserPWHistoryObj rhs ) {
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

	protected SecUserPWHistoryByQualNameComparator compareSecUserPWHistoryByQualName = new SecUserPWHistoryByQualNameComparator();

	public Collection<ISecureSecUserPWHistoryObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecUserPWHistoryObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecUserPWHistory = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecUserPWHistoryObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecUserPWHistory.add( iter.next() );
				}
				observableListOfSecUserPWHistory.sort( compareSecUserPWHistoryByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecUserPWHistory );
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
			buttonAddSecUserPWHistory = new CFButton();
			buttonAddSecUserPWHistory.setMinWidth( 200 );
			buttonAddSecUserPWHistory.setText( "Add Security User Password History" );
			buttonAddSecUserPWHistory.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
						ISecureSecUserPWHistoryObj obj = (ISecureSecUserPWHistoryObj)schemaObj.getSecUserPWHistoryTableObj().newInstance();
						ISecureSecUserPWHistoryEditObj edit = (ISecureSecUserPWHistoryEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
						CFBorderPane frame = javafxSchema.getSecUserPWHistoryFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ISecureJavaFXSecUserPWHistoryPaneCommon jpanelCommon = (ISecureJavaFXSecUserPWHistoryPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddSecUserPWHistory );
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
						ISecureSecUserPWHistoryObj selectedInstance = getJavaFXFocusAsSecUserPWHistory();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserPWHistory.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserPWHistoryFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserPWHistoryPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserPWHistoryObj" );
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
						ISecureSecUserPWHistoryObj selectedInstance = getJavaFXFocusAsSecUserPWHistory();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserPWHistory.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserPWHistoryFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ISecureJavaFXSecUserPWHistoryPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserPWHistoryObj" );
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
						ISecureSecUserPWHistoryObj selectedInstance = getJavaFXFocusAsSecUserPWHistory();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUserPWHistory.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getSecUserPWHistoryFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ISecureJavaFXSecUserPWHistoryPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ISecureSecUserPWHistoryObj" );
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
		ISecureSecUserPWHistoryObj selectedObj = getJavaFXFocusAsSecUserPWHistory();
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
		if( buttonAddSecUserPWHistory != null ) {
			buttonAddSecUserPWHistory.setDisable( ! allowAdds );
		}

	}
}
