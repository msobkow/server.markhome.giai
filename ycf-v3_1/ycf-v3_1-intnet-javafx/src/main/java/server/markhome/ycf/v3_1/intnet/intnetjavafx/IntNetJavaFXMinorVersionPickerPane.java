// Description: Java 25 JavaFX Picker of Obj Pane implementation for MinorVersion.

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.secure.securejavafx.*;

/**
 *	IntNetJavaFXMinorVersionPickerPane JavaFX Pick Obj Pane implementation
 *	for MinorVersion.
 */
public class IntNetJavaFXMinorVersionPickerPane
extends CFBorderPane
implements IIntNetJavaFXMinorVersionPaneList
{
	public static String S_FormName = "Choose MinorVersion";
	protected IIntNetJavaFXSchema javafxSchema = null;
	protected Collection<IIntNetMinorVersionObj> javafxDataCollection = null;
	protected ObservableList<IIntNetMinorVersionObj> observableListOfMinorVersion = null;
	protected TableColumn<IIntNetMinorVersionObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IIntNetMinorVersionObj, String> tableColumnName = null;
	protected TableColumn<IIntNetMinorVersionObj, String> tableColumnDescription = null;
	protected TableView<IIntNetMinorVersionObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected IIntNetJavaFXMinorVersionChosen invokeWhenChosen = null;
	protected IIntNetMajorVersionObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public IntNetJavaFXMinorVersionPickerPane( ICFFormManager formManager,
		IIntNetJavaFXSchema argSchema,
		IIntNetMinorVersionObj argFocus,
		IIntNetMajorVersionObj argContainer,
		Collection<IIntNetMinorVersionObj> argDataCollection,
		IIntNetJavaFXMinorVersionChosen whenChosen )
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
		dataTable = new TableView<IIntNetMinorVersionObj>();
		tableColumnId = new TableColumn<IIntNetMinorVersionObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IIntNetMinorVersionObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IIntNetMinorVersionObj, ICFKeyHash256> p ) {
				IIntNetMinorVersionObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFKeyHash256 value = obj.getRequiredId();
					ReadOnlyObjectWrapper<ICFKeyHash256> observable = new ReadOnlyObjectWrapper<ICFKeyHash256>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnId.setCellFactory( new Callback<TableColumn<IIntNetMinorVersionObj,ICFKeyHash256>,TableCell<IIntNetMinorVersionObj,ICFKeyHash256>>() {
			@Override public TableCell<IIntNetMinorVersionObj,ICFKeyHash256> call(
				TableColumn<IIntNetMinorVersionObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IIntNetMinorVersionObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IIntNetMinorVersionObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IIntNetMinorVersionObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetMinorVersionObj, String> p ) {
				IIntNetMinorVersionObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IIntNetMinorVersionObj,String>,TableCell<IIntNetMinorVersionObj,String>>() {
			@Override public TableCell<IIntNetMinorVersionObj,String> call(
				TableColumn<IIntNetMinorVersionObj,String> arg)
			{
				return new CFStringTableCell<IIntNetMinorVersionObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnDescription = new TableColumn<IIntNetMinorVersionObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IIntNetMinorVersionObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetMinorVersionObj, String> p ) {
				IIntNetMinorVersionObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDescription();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IIntNetMinorVersionObj,String>,TableCell<IIntNetMinorVersionObj,String>>() {
			@Override public TableCell<IIntNetMinorVersionObj,String> call(
				TableColumn<IIntNetMinorVersionObj,String> arg)
			{
				return new CFStringTableCell<IIntNetMinorVersionObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IIntNetMinorVersionObj>() {
				@Override public void changed( ObservableValue<? extends IIntNetMinorVersionObj> observable,
					IIntNetMinorVersionObj oldValue,
					IIntNetMinorVersionObj newValue )
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
					IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
					if( schemaObj == null ) {
						throw new CFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					invokeWhenChosen.choseMinorVersion( null );
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
					IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
					if( schemaObj == null ) {
						throw new CFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					IIntNetMinorVersionObj selectedInstance = getJavaFXFocusAsMinorVersion();
					invokeWhenChosen.choseMinorVersion( selectedInstance );
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

	public IIntNetJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IIntNetMinorVersionObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IIntNetMinorVersionObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public IIntNetMinorVersionObj getJavaFXFocusAsMinorVersion() {
		return( (IIntNetMinorVersionObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsMinorVersion( IIntNetMinorVersionObj value ) {
		setJavaFXFocus( value );
	}

	public class MinorVersionByQualNameComparator
	implements Comparator<IIntNetMinorVersionObj>
	{
		public MinorVersionByQualNameComparator() {
		}

		public int compare( IIntNetMinorVersionObj lhs, IIntNetMinorVersionObj rhs ) {
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

	protected MinorVersionByQualNameComparator compareMinorVersionByQualName = new MinorVersionByQualNameComparator();

	public Collection<IIntNetMinorVersionObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IIntNetMinorVersionObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfMinorVersion = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IIntNetMinorVersionObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfMinorVersion.add( iter.next() );
				}
				observableListOfMinorVersion.sort( compareMinorVersionByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfMinorVersion );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public IIntNetMajorVersionObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IIntNetMajorVersionObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		IIntNetMinorVersionObj selectedObj = getJavaFXFocusAsMinorVersion();
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

