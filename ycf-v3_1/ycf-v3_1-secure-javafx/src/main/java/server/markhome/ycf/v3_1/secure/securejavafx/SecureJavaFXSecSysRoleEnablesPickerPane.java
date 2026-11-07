// Description: Java 25 JavaFX Picker of Obj Pane implementation for SecSysRoleEnables.

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
 *	SecureJavaFXSecSysRoleEnablesPickerPane JavaFX Pick Obj Pane implementation
 *	for SecSysRoleEnables.
 */
public class SecureJavaFXSecSysRoleEnablesPickerPane
extends CFBorderPane
implements ISecureJavaFXSecSysRoleEnablesPaneList
{
	public static String S_FormName = "Choose Security System Role Enables Group";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecSysRoleEnablesObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecSysRoleEnablesObj> observableListOfSecSysRoleEnables = null;
	protected TableColumn<ISecureSecSysRoleEnablesObj, ISecureSecSysGrpObj> tableColumnParentEnableGroup = null;
	protected TableView<ISecureSecSysRoleEnablesObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSecSysRoleEnablesChosen invokeWhenChosen = null;
	protected ISecureSecSysRoleObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public SecureJavaFXSecSysRoleEnablesPickerPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecSysRoleEnablesObj argFocus,
		ISecureSecSysRoleObj argContainer,
		Collection<ISecureSecSysRoleEnablesObj> argDataCollection,
		ISecureJavaFXSecSysRoleEnablesChosen whenChosen )
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
		dataTable = new TableView<ISecureSecSysRoleEnablesObj>();
		tableColumnParentEnableGroup = new TableColumn<ISecureSecSysRoleEnablesObj, ISecureSecSysGrpObj>( "Enable Group" );
		tableColumnParentEnableGroup.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecSysRoleEnablesObj,ISecureSecSysGrpObj>,ObservableValue<ISecureSecSysGrpObj> >() {
			public ObservableValue<ISecureSecSysGrpObj> call( CellDataFeatures<ISecureSecSysRoleEnablesObj, ISecureSecSysGrpObj> p ) {
				ISecureSecSysRoleEnablesObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ISecureSecSysGrpObj ref = obj.getRequiredParentEnableGroup();
					ReadOnlyObjectWrapper<ISecureSecSysGrpObj> observable = new ReadOnlyObjectWrapper<ISecureSecSysGrpObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnParentEnableGroup.setCellFactory( new Callback<TableColumn<ISecureSecSysRoleEnablesObj,ISecureSecSysGrpObj>,TableCell<ISecureSecSysRoleEnablesObj,ISecureSecSysGrpObj>>() {
			@Override public TableCell<ISecureSecSysRoleEnablesObj,ISecureSecSysGrpObj> call(
				TableColumn<ISecureSecSysRoleEnablesObj,ISecureSecSysGrpObj> arg)
			{
				return new CFReferenceTableCell<ISecureSecSysRoleEnablesObj,ISecureSecSysGrpObj>();
			}
		});
		dataTable.getColumns().add( tableColumnParentEnableGroup );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecSysRoleEnablesObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecSysRoleEnablesObj> observable,
					ISecureSecSysRoleEnablesObj oldValue,
					ISecureSecSysRoleEnablesObj newValue )
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
					invokeWhenChosen.choseSecSysRoleEnables( null );
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
					ISecureSecSysRoleEnablesObj selectedInstance = getJavaFXFocusAsSecSysRoleEnables();
					invokeWhenChosen.choseSecSysRoleEnables( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ISecureSecSysRoleEnablesObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecSysRoleEnablesObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ISecureSecSysRoleEnablesObj getJavaFXFocusAsSecSysRoleEnables() {
		return( (ISecureSecSysRoleEnablesObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecSysRoleEnables( ISecureSecSysRoleEnablesObj value ) {
		setJavaFXFocus( value );
	}

	public class SecSysRoleEnablesByQualNameComparator
	implements Comparator<ISecureSecSysRoleEnablesObj>
	{
		public SecSysRoleEnablesByQualNameComparator() {
		}

		public int compare( ISecureSecSysRoleEnablesObj lhs, ISecureSecSysRoleEnablesObj rhs ) {
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

	protected SecSysRoleEnablesByQualNameComparator compareSecSysRoleEnablesByQualName = new SecSysRoleEnablesByQualNameComparator();

	public Collection<ISecureSecSysRoleEnablesObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecSysRoleEnablesObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecSysRoleEnables = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecSysRoleEnablesObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecSysRoleEnables.add( iter.next() );
				}
				observableListOfSecSysRoleEnables.sort( compareSecSysRoleEnablesByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecSysRoleEnables );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ISecureSecSysRoleObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ISecureSecSysRoleObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ISecureSecSysRoleEnablesObj selectedObj = getJavaFXFocusAsSecSysRoleEnables();
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

