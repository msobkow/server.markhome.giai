// Description: Java 25 JavaFX List of Obj Pane implementation for FloatCol.

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
 *	BusModelJavaFXFloatColListPane JavaFX List of Obj Pane implementation
 *	for FloatCol.
 */
public class BusModelJavaFXFloatColListPane
extends CFBorderPane
implements IBusModelJavaFXFloatColPaneList
{
	public static String S_FormName = "List FloatCol";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelFloatColObj> javafxDataCollection = null;
	protected ObservableList<IBusModelFloatColObj> observableListOfFloatCol = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddFloatCol = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelFloatColObj> dataTable = null;
	protected TableColumn<IBusModelFloatColObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelFloatColObj, String> tableColumnName = null;
	protected TableColumn<IBusModelFloatColObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelFloatColObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelFloatColObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelFloatColObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelFloatColObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<IBusModelFloatColObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<IBusModelFloatColObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<IBusModelFloatColObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<IBusModelFloatColObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelFloatColObj, Float> tableColumnInitValue = null;
	protected TableColumn<IBusModelFloatColObj, Float> tableColumnMinValue = null;
	protected TableColumn<IBusModelFloatColObj, Float> tableColumnMaxValue = null;
	protected TableColumn<IBusModelFloatColObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected IBusModelTableObj javafxContainer = null;
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


	public BusModelJavaFXFloatColListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelTableObj argContainer,
		IBusModelFloatColObj argFocus,
		Collection<IBusModelFloatColObj> argDataCollection,
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
		dataTable = new TableView<IBusModelFloatColObj>();
		tableColumnId = new TableColumn<IBusModelFloatColObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelFloatColObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,ICFKeyHash256>,TableCell<IBusModelFloatColObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelFloatColObj,ICFKeyHash256> call(
				TableColumn<IBusModelFloatColObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelFloatColObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatColObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,String>,TableCell<IBusModelFloatColObj,String>>() {
			@Override public TableCell<IBusModelFloatColObj,String> call(
				TableColumn<IBusModelFloatColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelFloatColObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatColObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,String>,TableCell<IBusModelFloatColObj,String>>() {
			@Override public TableCell<IBusModelFloatColObj,String> call(
				TableColumn<IBusModelFloatColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelFloatColObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatColObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,String>,TableCell<IBusModelFloatColObj,String>>() {
			@Override public TableCell<IBusModelFloatColObj,String> call(
				TableColumn<IBusModelFloatColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelFloatColObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatColObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,String>,TableCell<IBusModelFloatColObj,String>>() {
			@Override public TableCell<IBusModelFloatColObj,String> call(
				TableColumn<IBusModelFloatColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelFloatColObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatColObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,String>,TableCell<IBusModelFloatColObj,String>>() {
			@Override public TableCell<IBusModelFloatColObj,String> call(
				TableColumn<IBusModelFloatColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<IBusModelFloatColObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatColObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,String>,TableCell<IBusModelFloatColObj,String>>() {
			@Override public TableCell<IBusModelFloatColObj,String> call(
				TableColumn<IBusModelFloatColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<IBusModelFloatColObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelFloatColObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,Boolean>,TableCell<IBusModelFloatColObj,Boolean>>() {
			@Override public TableCell<IBusModelFloatColObj,Boolean> call(
				TableColumn<IBusModelFloatColObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<IBusModelFloatColObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelFloatColObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,Boolean>,TableCell<IBusModelFloatColObj,Boolean>>() {
			@Override public TableCell<IBusModelFloatColObj,Boolean> call(
				TableColumn<IBusModelFloatColObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<IBusModelFloatColObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelFloatColObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,Boolean>,TableCell<IBusModelFloatColObj,Boolean>>() {
			@Override public TableCell<IBusModelFloatColObj,Boolean> call(
				TableColumn<IBusModelFloatColObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<IBusModelFloatColObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelFloatColObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,String>,TableCell<IBusModelFloatColObj,String>>() {
			@Override public TableCell<IBusModelFloatColObj,String> call(
				TableColumn<IBusModelFloatColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<IBusModelFloatColObj,Float>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<IBusModelFloatColObj, Float> p ) {
				IBusModelFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,Float>,TableCell<IBusModelFloatColObj,Float>>() {
			@Override public TableCell<IBusModelFloatColObj,Float> call(
				TableColumn<IBusModelFloatColObj,Float> arg)
			{
				return new CFFloatTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<IBusModelFloatColObj,Float>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<IBusModelFloatColObj, Float> p ) {
				IBusModelFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,Float>,TableCell<IBusModelFloatColObj,Float>>() {
			@Override public TableCell<IBusModelFloatColObj,Float> call(
				TableColumn<IBusModelFloatColObj,Float> arg)
			{
				return new CFFloatTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<IBusModelFloatColObj,Float>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<IBusModelFloatColObj, Float> p ) {
				IBusModelFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,Float>,TableCell<IBusModelFloatColObj,Float>>() {
			@Override public TableCell<IBusModelFloatColObj,Float> call(
				TableColumn<IBusModelFloatColObj,Float> arg)
			{
				return new CFFloatTableCell<IBusModelFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<IBusModelFloatColObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelFloatColObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelFloatColObj, IBusModelSchemaDefObj> p ) {
				IBusModelFloatColObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelFloatColObj,IBusModelSchemaDefObj>,TableCell<IBusModelFloatColObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelFloatColObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelFloatColObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelFloatColObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelFloatColObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelFloatColObj> observable,
					IBusModelFloatColObj oldValue,
					IBusModelFloatColObj newValue )
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
		if( observableListOfFloatCol != null ) {
			dataTable.setItems( observableListOfFloatCol );
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
		if( ( value == null ) || ( value instanceof IBusModelFloatColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelFloatColObj" );
		}
		adjustListButtons();
	}

	public IBusModelFloatColObj getJavaFXFocusAsFloatCol() {
		return( (IBusModelFloatColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsFloatCol( IBusModelFloatColObj value ) {
		setJavaFXFocus( value );
	}

	public class FloatColByQualNameComparator
	implements Comparator<IBusModelFloatColObj>
	{
		public FloatColByQualNameComparator() {
		}

		public int compare( IBusModelFloatColObj lhs, IBusModelFloatColObj rhs ) {
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

	protected FloatColByQualNameComparator compareFloatColByQualName = new FloatColByQualNameComparator();

	public Collection<IBusModelFloatColObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelFloatColObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfFloatCol = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelFloatColObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfFloatCol.add( iter.next() );
				}
				observableListOfFloatCol.sort( compareFloatColByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfFloatCol );
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
			buttonAddFloatCol = new CFButton();
			buttonAddFloatCol.setMinWidth( 200 );
			buttonAddFloatCol.setText( "Add FloatCol" );
			buttonAddFloatCol.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelFloatColObj obj = (IBusModelFloatColObj)schemaObj.getFloatColTableObj().newInstance();
						IBusModelFloatColEditObj edit = (IBusModelFloatColEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw IYCFNullArgumentException.getService().getInstance( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw IYCFNullArgumentException.getService().getInstance( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
						CFBorderPane frame = javafxSchema.getFloatColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXFloatColPaneCommon jpanelCommon = (IBusModelJavaFXFloatColPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddFloatCol );
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
						IBusModelFloatColObj selectedInstance = getJavaFXFocusAsFloatCol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getFloatColFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelFloatColObj" );
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
						IBusModelFloatColObj selectedInstance = getJavaFXFocusAsFloatCol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getFloatColFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelFloatColObj" );
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
						IBusModelFloatColObj selectedInstance = getJavaFXFocusAsFloatCol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getFloatColFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelFloatColObj" );
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

	public IBusModelTableObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelTableObj value ) {
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
		IBusModelFloatColObj selectedObj = getJavaFXFocusAsFloatCol();
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
		if( buttonAddFloatCol != null ) {
			buttonAddFloatCol.setDisable( ! allowAdds );
		}

	}
}
