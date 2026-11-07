// Description: Java 25 JavaFX Picker of Obj Pane implementation for SecClusRoleMemb.

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
 *	SecureJavaFXSecClusRoleMembPickerPane JavaFX Pick Obj Pane implementation
 *	for SecClusRoleMemb.
 */
public class SecureJavaFXSecClusRoleMembPickerPane
extends CFBorderPane
implements ISecureJavaFXSecClusRoleMembPaneList
{
	public static String S_FormName = "Choose Cluster Security Role Member";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecClusRoleMembObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecClusRoleMembObj> observableListOfSecClusRoleMemb = null;
	protected TableColumn<ISecureSecClusRoleMembObj, ISecureSecUserObj> tableColumnParentUser = null;
	protected TableView<ISecureSecClusRoleMembObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSecClusRoleMembChosen invokeWhenChosen = null;
	protected ISecureSecClusRoleObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public SecureJavaFXSecClusRoleMembPickerPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecClusRoleMembObj argFocus,
		ISecureSecClusRoleObj argContainer,
		Collection<ISecureSecClusRoleMembObj> argDataCollection,
		ISecureJavaFXSecClusRoleMembChosen whenChosen )
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
		dataTable = new TableView<ISecureSecClusRoleMembObj>();
		tableColumnParentUser = new TableColumn<ISecureSecClusRoleMembObj, ISecureSecUserObj>( "User" );
		tableColumnParentUser.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecClusRoleMembObj,ISecureSecUserObj>,ObservableValue<ISecureSecUserObj> >() {
			public ObservableValue<ISecureSecUserObj> call( CellDataFeatures<ISecureSecClusRoleMembObj, ISecureSecUserObj> p ) {
				ISecureSecClusRoleMembObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ISecureSecUserObj ref = obj.getRequiredParentUser();
					ReadOnlyObjectWrapper<ISecureSecUserObj> observable = new ReadOnlyObjectWrapper<ISecureSecUserObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnParentUser.setCellFactory( new Callback<TableColumn<ISecureSecClusRoleMembObj,ISecureSecUserObj>,TableCell<ISecureSecClusRoleMembObj,ISecureSecUserObj>>() {
			@Override public TableCell<ISecureSecClusRoleMembObj,ISecureSecUserObj> call(
				TableColumn<ISecureSecClusRoleMembObj,ISecureSecUserObj> arg)
			{
				return new CFReferenceTableCell<ISecureSecClusRoleMembObj,ISecureSecUserObj>();
			}
		});
		dataTable.getColumns().add( tableColumnParentUser );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecClusRoleMembObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecClusRoleMembObj> observable,
					ISecureSecClusRoleMembObj oldValue,
					ISecureSecClusRoleMembObj newValue )
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
					invokeWhenChosen.choseSecClusRoleMemb( null );
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
					ISecureSecClusRoleMembObj selectedInstance = getJavaFXFocusAsSecClusRoleMemb();
					invokeWhenChosen.choseSecClusRoleMemb( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ISecureSecClusRoleMembObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecClusRoleMembObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ISecureSecClusRoleMembObj getJavaFXFocusAsSecClusRoleMemb() {
		return( (ISecureSecClusRoleMembObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecClusRoleMemb( ISecureSecClusRoleMembObj value ) {
		setJavaFXFocus( value );
	}

	public class SecClusRoleMembByQualNameComparator
	implements Comparator<ISecureSecClusRoleMembObj>
	{
		public SecClusRoleMembByQualNameComparator() {
		}

		public int compare( ISecureSecClusRoleMembObj lhs, ISecureSecClusRoleMembObj rhs ) {
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

	protected SecClusRoleMembByQualNameComparator compareSecClusRoleMembByQualName = new SecClusRoleMembByQualNameComparator();

	public Collection<ISecureSecClusRoleMembObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecClusRoleMembObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecClusRoleMemb = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecClusRoleMembObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecClusRoleMemb.add( iter.next() );
				}
				observableListOfSecClusRoleMemb.sort( compareSecClusRoleMembByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecClusRoleMemb );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ISecureSecClusRoleObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ISecureSecClusRoleObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ISecureSecClusRoleMembObj selectedObj = getJavaFXFocusAsSecClusRoleMemb();
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

