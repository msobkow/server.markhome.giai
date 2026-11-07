// Description: Java 25 JavaFX List of Obj Pane implementation for NmTokenType.

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;
import server.markhome.ycf.v3_1.secure.securejavafx.*;
import server.markhome.ycf.v3_1.intnet.intnetjavafx.*;

/**
 *	BusModelJavaFXNmTokenTypeListPane JavaFX List of Obj Pane implementation
 *	for NmTokenType.
 */
public class BusModelJavaFXNmTokenTypeListPane
extends CFBorderPane
implements IBusModelJavaFXNmTokenTypePaneList
{
	public static String S_FormName = "List NmTokenType";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelNmTokenTypeObj> javafxDataCollection = null;
	protected ObservableList<IBusModelNmTokenTypeObj> observableListOfNmTokenType = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddNmTokenType = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelNmTokenTypeObj> dataTable = null;
	protected TableColumn<IBusModelNmTokenTypeObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnName = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<IBusModelNmTokenTypeObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<IBusModelNmTokenTypeObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<IBusModelNmTokenTypeObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelNmTokenTypeObj, Integer> tableColumnMaxLen = null;
	protected TableColumn<IBusModelNmTokenTypeObj, String> tableColumnInitValue = null;
	protected TableColumn<IBusModelNmTokenTypeObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected IBusModelSchemaDefObj javafxContainer = null;
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


	public BusModelJavaFXNmTokenTypeListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelSchemaDefObj argContainer,
		IBusModelNmTokenTypeObj argFocus,
		Collection<IBusModelNmTokenTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
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
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		javafxContainer = argContainer;
		javafxRefreshCallback = refreshCallback;
		javafxSortByChain = sortByChain;
		setJavaFXDataCollection( argDataCollection );
		dataTable = new TableView<IBusModelNmTokenTypeObj>();
		tableColumnId = new TableColumn<IBusModelNmTokenTypeObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelNmTokenTypeObj, ICFKeyHash256> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,ICFKeyHash256>,TableCell<IBusModelNmTokenTypeObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,ICFKeyHash256> call(
				TableColumn<IBusModelNmTokenTypeObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelNmTokenTypeObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelNmTokenTypeObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelNmTokenTypeObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelNmTokenTypeObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelNmTokenTypeObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<IBusModelNmTokenTypeObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDefaultXmlValue();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<IBusModelNmTokenTypeObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelNmTokenTypeObj, Boolean> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsNullable();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,Boolean>,TableCell<IBusModelNmTokenTypeObj,Boolean>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,Boolean> call(
				TableColumn<IBusModelNmTokenTypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<IBusModelNmTokenTypeObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelNmTokenTypeObj, Boolean> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Boolean value = obj.getOptionalGenerateId();
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,Boolean>,TableCell<IBusModelNmTokenTypeObj,Boolean>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,Boolean> call(
				TableColumn<IBusModelNmTokenTypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<IBusModelNmTokenTypeObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelNmTokenTypeObj, Boolean> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredImplementsPolymorph();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,Boolean>,TableCell<IBusModelNmTokenTypeObj,Boolean>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,Boolean> call(
				TableColumn<IBusModelNmTokenTypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<IBusModelNmTokenTypeObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelAtomObj obj = p.getValue();
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFStringTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnMaxLen = new TableColumn<IBusModelNmTokenTypeObj,Integer>( "Max. Length" );
		tableColumnMaxLen.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,Integer>,ObservableValue<Integer> >() {
			public ObservableValue<Integer> call( CellDataFeatures<IBusModelNmTokenTypeObj, Integer> p ) {
				IBusModelNmTokenDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					int value = obj.getRequiredMaxLen();
					Integer wrapped = Integer.valueOf( value );
					ReadOnlyObjectWrapper<Integer> observable = new ReadOnlyObjectWrapper<Integer>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnMaxLen.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,Integer>,TableCell<IBusModelNmTokenTypeObj,Integer>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,Integer> call(
				TableColumn<IBusModelNmTokenTypeObj,Integer> arg)
			{
				return new CFInt32TableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxLen );
		tableColumnInitValue = new TableColumn<IBusModelNmTokenTypeObj,String>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelNmTokenTypeObj, String> p ) {
				IBusModelNmTokenDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,String>,TableCell<IBusModelNmTokenTypeObj,String>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,String> call(
				TableColumn<IBusModelNmTokenTypeObj,String> arg)
			{
				return new CFNmTokenTableCell<IBusModelNmTokenTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnLookupDefSchema = new TableColumn<IBusModelNmTokenTypeObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelNmTokenTypeObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelNmTokenTypeObj, IBusModelSchemaDefObj> p ) {
				IBusModelNmTokenTypeObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelSchemaDefObj ref = obj.getOptionalLookupDefSchema();
					ReadOnlyObjectWrapper<IBusModelSchemaDefObj> observable = new ReadOnlyObjectWrapper<IBusModelSchemaDefObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelNmTokenTypeObj,IBusModelSchemaDefObj>,TableCell<IBusModelNmTokenTypeObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelNmTokenTypeObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelNmTokenTypeObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelNmTokenTypeObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelNmTokenTypeObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelNmTokenTypeObj> observable,
					IBusModelNmTokenTypeObj oldValue,
					IBusModelNmTokenTypeObj newValue )
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
		if( observableListOfNmTokenType != null ) {
			dataTable.setItems( observableListOfNmTokenType );
		}
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

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelNmTokenTypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelNmTokenTypeObj" );
		}
		adjustListButtons();
	}

	public IBusModelNmTokenTypeObj getJavaFXFocusAsNmTokenType() {
		return( (IBusModelNmTokenTypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsNmTokenType( IBusModelNmTokenTypeObj value ) {
		setJavaFXFocus( value );
	}

	public class NmTokenTypeByQualNameComparator
	implements Comparator<IBusModelNmTokenTypeObj>
	{
		public NmTokenTypeByQualNameComparator() {
		}

		public int compare( IBusModelNmTokenTypeObj lhs, IBusModelNmTokenTypeObj rhs ) {
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

	protected NmTokenTypeByQualNameComparator compareNmTokenTypeByQualName = new NmTokenTypeByQualNameComparator();

	public Collection<IBusModelNmTokenTypeObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelNmTokenTypeObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfNmTokenType = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelNmTokenTypeObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfNmTokenType.add( iter.next() );
				}
				observableListOfNmTokenType.sort( compareNmTokenTypeByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfNmTokenType );
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
			buttonAddNmTokenType = new CFButton();
			buttonAddNmTokenType.setMinWidth( 200 );
			buttonAddNmTokenType.setText( "Add NmTokenType" );
			buttonAddNmTokenType.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelNmTokenTypeObj obj = (IBusModelNmTokenTypeObj)schemaObj.getNmTokenTypeTableObj().newInstance();
						IBusModelNmTokenTypeEditObj edit = (IBusModelNmTokenTypeEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
								IBusModelSchemaDefObj container = (IBusModelSchemaDefObj)( getJavaFXContainer() );
								if( container == null ) {
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerSchemaDef( container );
						CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXNmTokenTypePaneCommon jpanelCommon = (IBusModelJavaFXNmTokenTypePaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddNmTokenType );
			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
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
						IBusModelNmTokenTypeObj selectedInstance = getJavaFXFocusAsNmTokenType();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenType.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelNmTokenTypeObj" );
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
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelNmTokenTypeObj selectedInstance = getJavaFXFocusAsNmTokenType();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenType.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelNmTokenTypeObj" );
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
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelNmTokenTypeObj selectedInstance = getJavaFXFocusAsNmTokenType();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenType.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXNmTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelNmTokenTypeObj" );
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

	public IBusModelSchemaDefObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelSchemaDefObj value ) {
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
		IBusModelNmTokenTypeObj selectedObj = getJavaFXFocusAsNmTokenType();
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
		if( buttonAddNmTokenType != null ) {
			buttonAddNmTokenType.setDisable( ! allowAdds );
		}

	}
}
