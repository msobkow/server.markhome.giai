// Description: Java 25 JavaFX Picker of Obj Pane implementation for SchemaDef.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.busmodel.busmodeljavafx;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;
import server.markhome.ycf.v3_1.secure.securejavafx.*;
import server.markhome.ycf.v3_1.intnet.intnetjavafx.*;

/**
 *	BusModelJavaFXSchemaDefPickerPane JavaFX Pick Obj Pane implementation
 *	for SchemaDef.
 */
public class BusModelJavaFXSchemaDefPickerPane
extends CFBorderPane
implements IBusModelJavaFXSchemaDefPaneList
{
	public static String S_FormName = "Choose SchemaDef";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelSchemaDefObj> javafxDataCollection = null;
	protected ObservableList<IBusModelSchemaDefObj> observableListOfSchemaDef = null;
	protected TableColumn<IBusModelSchemaDefObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnName = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnCopyrightPeriod = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnCopyrightHolder = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnAuthorEMail = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnProjectURL = null;
	protected TableColumn<IBusModelSchemaDefObj, String> tableColumnPublishURI = null;
	protected TableView<IBusModelSchemaDefObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchemaDefChosen invokeWhenChosen = null;
	protected IIntNetMinorVersionObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public BusModelJavaFXSchemaDefPickerPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelSchemaDefObj argFocus,
		IIntNetMinorVersionObj argContainer,
		Collection<IBusModelSchemaDefObj> argDataCollection,
		IBusModelJavaFXSchemaDefChosen whenChosen )
	{
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		if( whenChosen == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
		dataTable = new TableView<IBusModelSchemaDefObj>();
		tableColumnId = new TableColumn<IBusModelSchemaDefObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelSchemaDefObj, ICFKeyHash256> p ) {
				IBusModelScopeObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,ICFKeyHash256>,TableCell<IBusModelSchemaDefObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelSchemaDefObj,ICFKeyHash256> call(
				TableColumn<IBusModelSchemaDefObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelSchemaDefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnDbName = new TableColumn<IBusModelSchemaDefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDbName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnShortName = new TableColumn<IBusModelSchemaDefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalShortName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelSchemaDefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalLabel();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelSchemaDefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalShortDescription();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelSchemaDefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnCopyrightPeriod = new TableColumn<IBusModelSchemaDefObj,String>( "Copyright Period" );
		tableColumnCopyrightPeriod.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredCopyrightPeriod();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnCopyrightPeriod.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCopyrightPeriod );
		tableColumnCopyrightHolder = new TableColumn<IBusModelSchemaDefObj,String>( "Copyright Holder" );
		tableColumnCopyrightHolder.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredCopyrightHolder();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnCopyrightHolder.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCopyrightHolder );
		tableColumnAuthorEMail = new TableColumn<IBusModelSchemaDefObj,String>( "Author EMail" );
		tableColumnAuthorEMail.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredAuthorEMail();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnAuthorEMail.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnAuthorEMail );
		tableColumnProjectURL = new TableColumn<IBusModelSchemaDefObj,String>( "Project URL" );
		tableColumnProjectURL.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredProjectURL();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnProjectURL.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnProjectURL );
		tableColumnPublishURI = new TableColumn<IBusModelSchemaDefObj,String>( "Publish URI" );
		tableColumnPublishURI.setCellValueFactory( new Callback<CellDataFeatures<IBusModelSchemaDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelSchemaDefObj, String> p ) {
				IBusModelSchemaDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredPublishURI();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnPublishURI.setCellFactory( new Callback<TableColumn<IBusModelSchemaDefObj,String>,TableCell<IBusModelSchemaDefObj,String>>() {
			@Override public TableCell<IBusModelSchemaDefObj,String> call(
				TableColumn<IBusModelSchemaDefObj,String> arg)
			{
				return new CFStringTableCell<IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnPublishURI );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelSchemaDefObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelSchemaDefObj> observable,
					IBusModelSchemaDefObj oldValue,
					IBusModelSchemaDefObj newValue )
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
					IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
					if( schemaObj == null ) {
						throw IYCFNullArgumentException.getService().getInstance( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					invokeWhenChosen.choseSchemaDef( null );
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
					IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
					if( schemaObj == null ) {
						throw IYCFNullArgumentException.getService().getInstance( getClass(),
							S_ProcName,
							0,
							"schemaObj" );
					}
					IBusModelSchemaDefObj selectedInstance = getJavaFXFocusAsSchemaDef();
					invokeWhenChosen.choseSchemaDef( selectedInstance );
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
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public IBusModelJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelSchemaDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelSchemaDefObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public IBusModelSchemaDefObj getJavaFXFocusAsSchemaDef() {
		return( (IBusModelSchemaDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSchemaDef( IBusModelSchemaDefObj value ) {
		setJavaFXFocus( value );
	}

	public class SchemaDefByQualNameComparator
	implements Comparator<IBusModelSchemaDefObj>
	{
		public SchemaDefByQualNameComparator() {
		}

		public int compare( IBusModelSchemaDefObj lhs, IBusModelSchemaDefObj rhs ) {
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

	protected SchemaDefByQualNameComparator compareSchemaDefByQualName = new SchemaDefByQualNameComparator();

	public Collection<IBusModelSchemaDefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelSchemaDefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSchemaDef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelSchemaDefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSchemaDef.add( iter.next() );
				}
				observableListOfSchemaDef.sort( compareSchemaDefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSchemaDef );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public IIntNetMinorVersionObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IIntNetMinorVersionObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		IBusModelSchemaDefObj selectedObj = getJavaFXFocusAsSchemaDef();
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

