// Description: Java 25 JavaFX Picker of Obj Pane implementation for SecTentGrp.

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
 *	SecureJavaFXSecTentGrpPickerPane JavaFX Pick Obj Pane implementation
 *	for SecTentGrp.
 */
public class SecureJavaFXSecTentGrpPickerPane
extends CFBorderPane
implements ISecureJavaFXSecTentGrpPaneList
{
	public static String S_FormName = "Choose Tenant Security Group";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecTentGrpObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecTentGrpObj> observableListOfSecTentGrp = null;
	protected TableColumn<ISecureSecTentGrpObj, ICFKeyHash256> tableColumnSecTentGrpId = null;
	protected TableView<ISecureSecTentGrpObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSecTentGrpChosen invokeWhenChosen = null;
	protected ISecureSecSysGrpObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public SecureJavaFXSecTentGrpPickerPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecTentGrpObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecTentGrpObj> argDataCollection,
		ISecureJavaFXSecTentGrpChosen whenChosen )
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
		dataTable = new TableView<ISecureSecTentGrpObj>();
		tableColumnSecTentGrpId = new TableColumn<ISecureSecTentGrpObj,ICFKeyHash256>( "Tenant Security Group Id" );
		tableColumnSecTentGrpId.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecTentGrpObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<ISecureSecTentGrpObj, ICFKeyHash256> p ) {
				ISecureSecTentGrpObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFKeyHash256 value = obj.getRequiredSecTentGrpId();
					ReadOnlyObjectWrapper<ICFKeyHash256> observable = new ReadOnlyObjectWrapper<ICFKeyHash256>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnSecTentGrpId.setCellFactory( new Callback<TableColumn<ISecureSecTentGrpObj,ICFKeyHash256>,TableCell<ISecureSecTentGrpObj,ICFKeyHash256>>() {
			@Override public TableCell<ISecureSecTentGrpObj,ICFKeyHash256> call(
				TableColumn<ISecureSecTentGrpObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<ISecureSecTentGrpObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSecTentGrpId );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecTentGrpObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecTentGrpObj> observable,
					ISecureSecTentGrpObj oldValue,
					ISecureSecTentGrpObj newValue )
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
					invokeWhenChosen.choseSecTentGrp( null );
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
					ISecureSecTentGrpObj selectedInstance = getJavaFXFocusAsSecTentGrp();
					invokeWhenChosen.choseSecTentGrp( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ISecureSecTentGrpObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecTentGrpObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ISecureSecTentGrpObj getJavaFXFocusAsSecTentGrp() {
		return( (ISecureSecTentGrpObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecTentGrp( ISecureSecTentGrpObj value ) {
		setJavaFXFocus( value );
	}

	public class SecTentGrpByQualNameComparator
	implements Comparator<ISecureSecTentGrpObj>
	{
		public SecTentGrpByQualNameComparator() {
		}

		public int compare( ISecureSecTentGrpObj lhs, ISecureSecTentGrpObj rhs ) {
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

	protected SecTentGrpByQualNameComparator compareSecTentGrpByQualName = new SecTentGrpByQualNameComparator();

	public Collection<ISecureSecTentGrpObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecTentGrpObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecTentGrp = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecTentGrpObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecTentGrp.add( iter.next() );
				}
				observableListOfSecTentGrp.sort( compareSecTentGrpByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecTentGrp );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ISecureSecSysGrpObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ISecureSecSysGrpObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ISecureSecTentGrpObj selectedObj = getJavaFXFocusAsSecTentGrp();
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

