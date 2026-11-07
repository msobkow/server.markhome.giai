// Description: Java 25 JavaFX Picker of Obj Pane implementation for SecUserPWReset.

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
import server.markhome.ycf.v3_1.secure.secureobj.*;

/**
 *	SecureJavaFXSecUserPWResetPickerPane JavaFX Pick Obj Pane implementation
 *	for SecUserPWReset.
 */
public class SecureJavaFXSecUserPWResetPickerPane
extends CFBorderPane
implements ISecureJavaFXSecUserPWResetPaneList
{
	public static String S_FormName = "Choose Password Reset";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecUserPWResetObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecUserPWResetObj> observableListOfSecUserPWReset = null;
	protected TableColumn<ISecureSecUserPWResetObj, String> tableColumnSentToEMailAddr = null;
	protected TableColumn<ISecureSecUserPWResetObj, ICFUuid6> tableColumnPasswordResetUuid6 = null;
	protected TableColumn<ISecureSecUserPWResetObj, Boolean> tableColumnNewAccount = null;
	protected TableView<ISecureSecUserPWResetObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSecUserPWResetChosen invokeWhenChosen = null;
	protected ISecureSecUserObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public SecureJavaFXSecUserPWResetPickerPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecUserPWResetObj argFocus,
		ISecureSecUserObj argContainer,
		Collection<ISecureSecUserPWResetObj> argDataCollection,
		ISecureJavaFXSecUserPWResetChosen whenChosen )
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
					ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
					if( schemaObj == null ) {
						throw new CFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					invokeWhenChosen.choseSecUserPWReset( null );
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
					ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
					if( schemaObj == null ) {
						throw new CFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					ISecureSecUserPWResetObj selectedInstance = getJavaFXFocusAsSecUserPWReset();
					invokeWhenChosen.choseSecUserPWReset( selectedInstance );
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

	public ISecureJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
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
		if( dataTable == null ) {
			return;
		}
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

	public ISecureSecUserObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ISecureSecUserObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ISecureSecUserPWResetObj selectedObj = getJavaFXFocusAsSecUserPWReset();
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

