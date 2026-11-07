// Description: Java 25 JavaFX Picker of Obj Pane implementation for SecSysGrp.

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
 *	SecureJavaFXSecSysGrpPickerPane JavaFX Pick Obj Pane implementation
 *	for SecSysGrp.
 */
public class SecureJavaFXSecSysGrpPickerPane
extends CFBorderPane
implements ISecureJavaFXSecSysGrpPaneList
{
	public static String S_FormName = "Choose System Security Group";
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecSysGrpObj> javafxDataCollection = null;
	protected ObservableList<ISecureSecSysGrpObj> observableListOfSecSysGrp = null;
	protected TableColumn<ISecureSecSysGrpObj, ICFKeyHash256> tableColumnSecSysGrpId = null;
	protected TableColumn<ISecureSecSysGrpObj, String> tableColumnName = null;
	protected TableColumn<ISecureSecSysGrpObj, ISecurePubSchema.SecLevelEnum> tableColumnSecLevel = null;
	protected TableView<ISecureSecSysGrpObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSecSysGrpChosen invokeWhenChosen = null;
	protected ICFLibAnyObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public SecureJavaFXSecSysGrpPickerPane( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecSysGrpObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureSecSysGrpObj> argDataCollection,
		ISecureJavaFXSecSysGrpChosen whenChosen )
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
		dataTable = new TableView<ISecureSecSysGrpObj>();
		tableColumnSecSysGrpId = new TableColumn<ISecureSecSysGrpObj,ICFKeyHash256>( "System Security Group Id" );
		tableColumnSecSysGrpId.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecSysGrpObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<ISecureSecSysGrpObj, ICFKeyHash256> p ) {
				ISecureSecSysGrpObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFKeyHash256 value = obj.getRequiredSecSysGrpId();
					ReadOnlyObjectWrapper<ICFKeyHash256> observable = new ReadOnlyObjectWrapper<ICFKeyHash256>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnSecSysGrpId.setCellFactory( new Callback<TableColumn<ISecureSecSysGrpObj,ICFKeyHash256>,TableCell<ISecureSecSysGrpObj,ICFKeyHash256>>() {
			@Override public TableCell<ISecureSecSysGrpObj,ICFKeyHash256> call(
				TableColumn<ISecureSecSysGrpObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<ISecureSecSysGrpObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSecSysGrpId );
		tableColumnName = new TableColumn<ISecureSecSysGrpObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecSysGrpObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ISecureSecSysGrpObj, String> p ) {
				ISecureSecSysGrpObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ISecureSecSysGrpObj,String>,TableCell<ISecureSecSysGrpObj,String>>() {
			@Override public TableCell<ISecureSecSysGrpObj,String> call(
				TableColumn<ISecureSecSysGrpObj,String> arg)
			{
				return new CFStringTableCell<ISecureSecSysGrpObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnSecLevel = new TableColumn<ISecureSecSysGrpObj,ISecurePubSchema.SecLevelEnum>( "Group Level" );
		tableColumnSecLevel.setCellValueFactory( new Callback<CellDataFeatures<ISecureSecSysGrpObj,ISecurePubSchema.SecLevelEnum>,ObservableValue<ISecurePubSchema.SecLevelEnum> >() {
			public ObservableValue<ISecurePubSchema.SecLevelEnum> call( CellDataFeatures<ISecureSecSysGrpObj, ISecurePubSchema.SecLevelEnum> p ) {
				ISecureSecSysGrpObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ISecurePubSchema.SecLevelEnum value = obj.getRequiredSecLevel();
					ReadOnlyObjectWrapper<ISecurePubSchema.SecLevelEnum> observable = new ReadOnlyObjectWrapper<ISecurePubSchema.SecLevelEnum>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnSecLevel.setCellFactory( new Callback<TableColumn<ISecureSecSysGrpObj,ISecurePubSchema.SecLevelEnum>,TableCell<ISecureSecSysGrpObj,ISecurePubSchema.SecLevelEnum>>() {
			@Override public TableCell<ISecureSecSysGrpObj,ISecurePubSchema.SecLevelEnum> call(
				TableColumn<ISecureSecSysGrpObj,ISecurePubSchema.SecLevelEnum> arg)
			{
				return new CFEnumTableCell<ISecureSecSysGrpObj,ISecureSchema.SecLevelEnum>();
			}
		});
		dataTable.getColumns().add( tableColumnSecLevel );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ISecureSecSysGrpObj>() {
				@Override public void changed( ObservableValue<? extends ISecureSecSysGrpObj> observable,
					ISecureSecSysGrpObj oldValue,
					ISecureSecSysGrpObj newValue )
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
					invokeWhenChosen.choseSecSysGrp( null );
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
					ISecureSecSysGrpObj selectedInstance = getJavaFXFocusAsSecSysGrp();
					invokeWhenChosen.choseSecSysGrp( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ISecureSecSysGrpObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecSysGrpObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ISecureSecSysGrpObj getJavaFXFocusAsSecSysGrp() {
		return( (ISecureSecSysGrpObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecSysGrp( ISecureSecSysGrpObj value ) {
		setJavaFXFocus( value );
	}

	public class SecSysGrpByQualNameComparator
	implements Comparator<ISecureSecSysGrpObj>
	{
		public SecSysGrpByQualNameComparator() {
		}

		public int compare( ISecureSecSysGrpObj lhs, ISecureSecSysGrpObj rhs ) {
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

	protected SecSysGrpByQualNameComparator compareSecSysGrpByQualName = new SecSysGrpByQualNameComparator();

	public Collection<ISecureSecSysGrpObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecSysGrpObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSecSysGrp = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ISecureSecSysGrpObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSecSysGrp.add( iter.next() );
				}
				observableListOfSecSysGrp.sort( compareSecSysGrpByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSecSysGrp );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFLibAnyObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFLibAnyObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ISecureSecSysGrpObj selectedObj = getJavaFXFocusAsSecSysGrp();
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

