// Description: Java 25 JavaFX List of Obj Pane implementation for Value.

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
 *	BusModelJavaFXValueListPane JavaFX List of Obj Pane implementation
 *	for Value.
 */
public class BusModelJavaFXValueListPane
extends CFBorderPane
implements IBusModelJavaFXValuePaneList
{
	public static String S_FormName = "List Value";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelValueObj> javafxDataCollection = null;
	protected ObservableList<IBusModelValueObj> observableListOfValue = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddBlobType = null;
	protected CFButton buttonAddBlobCol = null;
	protected CFButton buttonAddBoolType = null;
	protected CFButton buttonAddBoolCol = null;
	protected CFButton buttonAddDateType = null;
	protected CFButton buttonAddDateCol = null;
	protected CFButton buttonAddDoubleType = null;
	protected CFButton buttonAddDoubleCol = null;
	protected CFButton buttonAddFloatType = null;
	protected CFButton buttonAddFloatCol = null;
	protected CFButton buttonAddInt16Type = null;
	protected CFButton buttonAddId16Gen = null;
	protected CFButton buttonAddEnumType = null;
	protected CFButton buttonAddInt16Col = null;
	protected CFButton buttonAddInt32Type = null;
	protected CFButton buttonAddId32Gen = null;
	protected CFButton buttonAddInt32Col = null;
	protected CFButton buttonAddInt64Type = null;
	protected CFButton buttonAddId64Gen = null;
	protected CFButton buttonAddInt64Col = null;
	protected CFButton buttonAddNmTokenType = null;
	protected CFButton buttonAddNmTokenCol = null;
	protected CFButton buttonAddNmTokensType = null;
	protected CFButton buttonAddNmTokensCol = null;
	protected CFButton buttonAddNumberType = null;
	protected CFButton buttonAddNumberCol = null;
	protected CFButton buttonAddDbKeyHash128Col = null;
	protected CFButton buttonAddDbKeyHash128Type = null;
	protected CFButton buttonAddDbKeyHash128Gen = null;
	protected CFButton buttonAddDbKeyHash160Col = null;
	protected CFButton buttonAddDbKeyHash160Type = null;
	protected CFButton buttonAddDbKeyHash160Gen = null;
	protected CFButton buttonAddDbKeyHash224Col = null;
	protected CFButton buttonAddDbKeyHash224Type = null;
	protected CFButton buttonAddDbKeyHash224Gen = null;
	protected CFButton buttonAddDbKeyHash256Col = null;
	protected CFButton buttonAddDbKeyHash256Type = null;
	protected CFButton buttonAddDbKeyHash256Gen = null;
	protected CFButton buttonAddDbKeyHash384Col = null;
	protected CFButton buttonAddDbKeyHash384Type = null;
	protected CFButton buttonAddDbKeyHash384Gen = null;
	protected CFButton buttonAddDbKeyHash512Col = null;
	protected CFButton buttonAddDbKeyHash512Type = null;
	protected CFButton buttonAddDbKeyHash512Gen = null;
	protected CFButton buttonAddStringType = null;
	protected CFButton buttonAddStringCol = null;
	protected CFButton buttonAddTZDateType = null;
	protected CFButton buttonAddTZDateCol = null;
	protected CFButton buttonAddTZTimeType = null;
	protected CFButton buttonAddTZTimeCol = null;
	protected CFButton buttonAddTZTimestampType = null;
	protected CFButton buttonAddTZTimestampCol = null;
	protected CFButton buttonAddTextType = null;
	protected CFButton buttonAddTextCol = null;
	protected CFButton buttonAddTimeType = null;
	protected CFButton buttonAddTimeCol = null;
	protected CFButton buttonAddTimestampType = null;
	protected CFButton buttonAddTimestampCol = null;
	protected CFButton buttonAddTokenType = null;
	protected CFButton buttonAddTokenCol = null;
	protected CFButton buttonAddUInt16Type = null;
	protected CFButton buttonAddUInt16Col = null;
	protected CFButton buttonAddUInt32Type = null;
	protected CFButton buttonAddUInt32Col = null;
	protected CFButton buttonAddUInt64Type = null;
	protected CFButton buttonAddUInt64Col = null;
	protected CFButton buttonAddUuidType = null;
	protected CFButton buttonAddUuidGen = null;
	protected CFButton buttonAddUuidCol = null;
	protected CFButton buttonAddUuid6Type = null;
	protected CFButton buttonAddUuid6Gen = null;
	protected CFButton buttonAddUuid6Col = null;
	protected CFButton buttonAddTableCol = null;
	protected CFButton buttonMoveUpSelected = null;
	protected CFButton buttonMoveDownSelected = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelValueObj> dataTable = null;
	protected TableColumn<IBusModelValueObj,String> tableColumnObjKind = null;
	protected TableColumn<IBusModelValueObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelValueObj, String> tableColumnName = null;
	protected TableColumn<IBusModelValueObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelValueObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelValueObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelValueObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelValueObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<IBusModelValueObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<IBusModelValueObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<IBusModelValueObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<IBusModelValueObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected IBusModelScopeObj javafxContainer = null;
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


	public BusModelJavaFXValueListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelScopeObj argContainer,
		IBusModelValueObj argFocus,
		Collection<IBusModelValueObj> argDataCollection,
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
		dataTable = new TableView<IBusModelValueObj>();
		tableColumnObjKind = new TableColumn<IBusModelValueObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<IBusModelValueObj, String> p ) {
				IBusModelValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					int classCode = obj.getClassCode();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( Integer.toString(classCode) );
					return( observable );
				}
			}
		});
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<IBusModelValueObj,String>,TableCell<IBusModelValueObj,String>>() {
			@Override public TableCell<IBusModelValueObj,String> call(
				TableColumn<IBusModelValueObj,String> arg)
			{
				return new CFStringTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<IBusModelValueObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelValueObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelValueObj,ICFKeyHash256>,TableCell<IBusModelValueObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelValueObj,ICFKeyHash256> call(
				TableColumn<IBusModelValueObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelValueObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelValueObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelValueObj,String>,TableCell<IBusModelValueObj,String>>() {
			@Override public TableCell<IBusModelValueObj,String> call(
				TableColumn<IBusModelValueObj,String> arg)
			{
				return new CFStringTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelValueObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelValueObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelValueObj,String>,TableCell<IBusModelValueObj,String>>() {
			@Override public TableCell<IBusModelValueObj,String> call(
				TableColumn<IBusModelValueObj,String> arg)
			{
				return new CFStringTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelValueObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelValueObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelValueObj,String>,TableCell<IBusModelValueObj,String>>() {
			@Override public TableCell<IBusModelValueObj,String> call(
				TableColumn<IBusModelValueObj,String> arg)
			{
				return new CFStringTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelValueObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelValueObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelValueObj,String>,TableCell<IBusModelValueObj,String>>() {
			@Override public TableCell<IBusModelValueObj,String> call(
				TableColumn<IBusModelValueObj,String> arg)
			{
				return new CFStringTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelValueObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelValueObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelValueObj,String>,TableCell<IBusModelValueObj,String>>() {
			@Override public TableCell<IBusModelValueObj,String> call(
				TableColumn<IBusModelValueObj,String> arg)
			{
				return new CFStringTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<IBusModelValueObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelValueObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<IBusModelValueObj,String>,TableCell<IBusModelValueObj,String>>() {
			@Override public TableCell<IBusModelValueObj,String> call(
				TableColumn<IBusModelValueObj,String> arg)
			{
				return new CFStringTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<IBusModelValueObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelValueObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<IBusModelValueObj,Boolean>,TableCell<IBusModelValueObj,Boolean>>() {
			@Override public TableCell<IBusModelValueObj,Boolean> call(
				TableColumn<IBusModelValueObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<IBusModelValueObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelValueObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<IBusModelValueObj,Boolean>,TableCell<IBusModelValueObj,Boolean>>() {
			@Override public TableCell<IBusModelValueObj,Boolean> call(
				TableColumn<IBusModelValueObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<IBusModelValueObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelValueObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<IBusModelValueObj,Boolean>,TableCell<IBusModelValueObj,Boolean>>() {
			@Override public TableCell<IBusModelValueObj,Boolean> call(
				TableColumn<IBusModelValueObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnLookupDefSchema = new TableColumn<IBusModelValueObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelValueObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelValueObj, IBusModelSchemaDefObj> p ) {
				IBusModelValueObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelValueObj,IBusModelSchemaDefObj>,TableCell<IBusModelValueObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelValueObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelValueObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelValueObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelValueObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelValueObj> observable,
					IBusModelValueObj oldValue,
					IBusModelValueObj newValue )
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
		if( observableListOfValue != null ) {
			dataTable.setItems( observableListOfValue );
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
		if( ( value == null ) || ( value instanceof IBusModelValueObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelValueObj" );
		}
		adjustListButtons();
	}

	public IBusModelValueObj getJavaFXFocusAsValue() {
		return( (IBusModelValueObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsValue( IBusModelValueObj value ) {
		setJavaFXFocus( value );
	}

	public class ValueByQualNameComparator
	implements Comparator<IBusModelValueObj>
	{
		public ValueByQualNameComparator() {
		}

		public int compare( IBusModelValueObj lhs, IBusModelValueObj rhs ) {
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

	protected ValueByQualNameComparator compareValueByQualName = new ValueByQualNameComparator();

	public Collection<IBusModelValueObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelValueObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfValue = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
			if( javafxSortByChain ) {
				Iterator<IBusModelValueObj> iter = javafxDataCollection.iterator();
				IBusModelValueObj head = null;
				while( ( head == null ) && iter.hasNext() ) {
					head = iter.next();
					if( null != head.getOptionalLookupPrev() ) {
						head = null;
					}
				}
				if( ( head == null ) && ( javafxDataCollection.size() > 0 ) ) {
					throw IYCFRuntimeException.getService().getInstance( getClass(),
						S_ProcName,
						Inz.x("cflibjavafx.common.CouldNotLocateHeadOfChain"),
						Inz.s("cflibjavafx.common.CouldNotLocateHeadOfChain") );
				}
				IBusModelValueObj cur = head;
				while( cur != null ) {
					observableListOfValue.add( cur );
					cur = cur.getOptionalLookupNext();
				}
			}
			else {
				Iterator<IBusModelValueObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfValue.add( iter.next() );
				}
				observableListOfValue.sort( compareValueByQualName );
			}
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfValue );
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
				LinkedList<CFButton> list = new LinkedList<CFButton>();

				vboxMenuAdd = new CFVBox( 10 );
					buttonAddBlobType = new CFButton();
					buttonAddBlobType.setMinWidth( 200 );
					buttonAddBlobType.setText( "Add BlobType" );
					buttonAddBlobType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelBlobTypeObj obj = (IBusModelBlobTypeObj)schemaObj.getBlobTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getBlobTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelBlobTypeEditObj edit = (IBusModelBlobTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXBlobTypePaneCommon jpanelCommon = (IBusModelJavaFXBlobTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddBlobType );
					}
					buttonAddBlobCol = new CFButton();
					buttonAddBlobCol.setMinWidth( 200 );
					buttonAddBlobCol.setText( "Add BlobCol" );
					buttonAddBlobCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelBlobColObj obj = (IBusModelBlobColObj)schemaObj.getBlobColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getBlobColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelBlobColEditObj edit = (IBusModelBlobColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXBlobColPaneCommon jpanelCommon = (IBusModelJavaFXBlobColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddBlobCol );
					}
					buttonAddBoolType = new CFButton();
					buttonAddBoolType.setMinWidth( 200 );
					buttonAddBoolType.setText( "Add BoolType" );
					buttonAddBoolType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelBoolTypeObj obj = (IBusModelBoolTypeObj)schemaObj.getBoolTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelBoolTypeEditObj edit = (IBusModelBoolTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXBoolTypePaneCommon jpanelCommon = (IBusModelJavaFXBoolTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddBoolType );
					}
					buttonAddBoolCol = new CFButton();
					buttonAddBoolCol.setMinWidth( 200 );
					buttonAddBoolCol.setText( "Add BoolCol" );
					buttonAddBoolCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelBoolColObj obj = (IBusModelBoolColObj)schemaObj.getBoolColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getBoolColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelBoolColEditObj edit = (IBusModelBoolColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXBoolColPaneCommon jpanelCommon = (IBusModelJavaFXBoolColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddBoolCol );
					}
					buttonAddDateType = new CFButton();
					buttonAddDateType.setMinWidth( 200 );
					buttonAddDateType.setText( "Add DateType" );
					buttonAddDateType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDateTypeObj obj = (IBusModelDateTypeObj)schemaObj.getDateTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDateTypeEditObj edit = (IBusModelDateTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDateTypePaneCommon jpanelCommon = (IBusModelJavaFXDateTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDateType );
					}
					buttonAddDateCol = new CFButton();
					buttonAddDateCol.setMinWidth( 200 );
					buttonAddDateCol.setText( "Add DateCol" );
					buttonAddDateCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDateColObj obj = (IBusModelDateColObj)schemaObj.getDateColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDateColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDateColEditObj edit = (IBusModelDateColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDateColPaneCommon jpanelCommon = (IBusModelJavaFXDateColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDateCol );
					}
					buttonAddDoubleType = new CFButton();
					buttonAddDoubleType.setMinWidth( 200 );
					buttonAddDoubleType.setText( "Add DoubleType" );
					buttonAddDoubleType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDoubleTypeObj obj = (IBusModelDoubleTypeObj)schemaObj.getDoubleTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDoubleTypeEditObj edit = (IBusModelDoubleTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDoubleTypePaneCommon jpanelCommon = (IBusModelJavaFXDoubleTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDoubleType );
					}
					buttonAddDoubleCol = new CFButton();
					buttonAddDoubleCol.setMinWidth( 200 );
					buttonAddDoubleCol.setText( "Add DoubleCol" );
					buttonAddDoubleCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDoubleColObj obj = (IBusModelDoubleColObj)schemaObj.getDoubleColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDoubleColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDoubleColEditObj edit = (IBusModelDoubleColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDoubleColPaneCommon jpanelCommon = (IBusModelJavaFXDoubleColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDoubleCol );
					}
					buttonAddFloatType = new CFButton();
					buttonAddFloatType.setMinWidth( 200 );
					buttonAddFloatType.setText( "Add FloatType" );
					buttonAddFloatType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)schemaObj.getFloatTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelFloatTypeEditObj edit = (IBusModelFloatTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXFloatTypePaneCommon jpanelCommon = (IBusModelJavaFXFloatTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddFloatType );
					}
					buttonAddFloatCol = new CFButton();
					buttonAddFloatCol.setMinWidth( 200 );
					buttonAddFloatCol.setText( "Add FloatCol" );
					buttonAddFloatCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelFloatColObj obj = (IBusModelFloatColObj)schemaObj.getFloatColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getFloatColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
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
								IBusModelJavaFXFloatColPaneCommon jpanelCommon = (IBusModelJavaFXFloatColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddFloatCol );
					}
					buttonAddInt16Type = new CFButton();
					buttonAddInt16Type.setMinWidth( 200 );
					buttonAddInt16Type.setText( "Add Int16Type" );
					buttonAddInt16Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelInt16TypeObj obj = (IBusModelInt16TypeObj)schemaObj.getInt16TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getInt16TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelInt16TypeEditObj edit = (IBusModelInt16TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXInt16TypePaneCommon jpanelCommon = (IBusModelJavaFXInt16TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddInt16Type );
					}
					buttonAddId16Gen = new CFButton();
					buttonAddId16Gen.setMinWidth( 200 );
					buttonAddId16Gen.setText( "Add Id16Gen" );
					buttonAddId16Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelId16GenObj obj = (IBusModelId16GenObj)schemaObj.getId16GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getId16GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelId16GenEditObj edit = (IBusModelId16GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXId16GenPaneCommon jpanelCommon = (IBusModelJavaFXId16GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddId16Gen );
					}
					buttonAddEnumType = new CFButton();
					buttonAddEnumType.setMinWidth( 200 );
					buttonAddEnumType.setText( "Add EnumType" );
					buttonAddEnumType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelEnumTypeObj obj = (IBusModelEnumTypeObj)schemaObj.getEnumTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getEnumTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelEnumTypeEditObj edit = (IBusModelEnumTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXEnumTypePaneCommon jpanelCommon = (IBusModelJavaFXEnumTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddEnumType );
					}
					buttonAddInt16Col = new CFButton();
					buttonAddInt16Col.setMinWidth( 200 );
					buttonAddInt16Col.setText( "Add Int16Col" );
					buttonAddInt16Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelInt16ColObj obj = (IBusModelInt16ColObj)schemaObj.getInt16ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getInt16ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelInt16ColEditObj edit = (IBusModelInt16ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXInt16ColPaneCommon jpanelCommon = (IBusModelJavaFXInt16ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddInt16Col );
					}
					buttonAddInt32Type = new CFButton();
					buttonAddInt32Type.setMinWidth( 200 );
					buttonAddInt32Type.setText( "Add Int32Type" );
					buttonAddInt32Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelInt32TypeObj obj = (IBusModelInt32TypeObj)schemaObj.getInt32TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getInt32TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelInt32TypeEditObj edit = (IBusModelInt32TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXInt32TypePaneCommon jpanelCommon = (IBusModelJavaFXInt32TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddInt32Type );
					}
					buttonAddId32Gen = new CFButton();
					buttonAddId32Gen.setMinWidth( 200 );
					buttonAddId32Gen.setText( "Add Id32Gen" );
					buttonAddId32Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelId32GenObj obj = (IBusModelId32GenObj)schemaObj.getId32GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getId32GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelId32GenEditObj edit = (IBusModelId32GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXId32GenPaneCommon jpanelCommon = (IBusModelJavaFXId32GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddId32Gen );
					}
					buttonAddInt32Col = new CFButton();
					buttonAddInt32Col.setMinWidth( 200 );
					buttonAddInt32Col.setText( "Add Int32Col" );
					buttonAddInt32Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelInt32ColObj obj = (IBusModelInt32ColObj)schemaObj.getInt32ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getInt32ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelInt32ColEditObj edit = (IBusModelInt32ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXInt32ColPaneCommon jpanelCommon = (IBusModelJavaFXInt32ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddInt32Col );
					}
					buttonAddInt64Type = new CFButton();
					buttonAddInt64Type.setMinWidth( 200 );
					buttonAddInt64Type.setText( "Add Int64Type" );
					buttonAddInt64Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelInt64TypeObj obj = (IBusModelInt64TypeObj)schemaObj.getInt64TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelInt64TypeEditObj edit = (IBusModelInt64TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXInt64TypePaneCommon jpanelCommon = (IBusModelJavaFXInt64TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddInt64Type );
					}
					buttonAddId64Gen = new CFButton();
					buttonAddId64Gen.setMinWidth( 200 );
					buttonAddId64Gen.setText( "Add Id64Gen" );
					buttonAddId64Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelId64GenObj obj = (IBusModelId64GenObj)schemaObj.getId64GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getId64GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelId64GenEditObj edit = (IBusModelId64GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXId64GenPaneCommon jpanelCommon = (IBusModelJavaFXId64GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddId64Gen );
					}
					buttonAddInt64Col = new CFButton();
					buttonAddInt64Col.setMinWidth( 200 );
					buttonAddInt64Col.setText( "Add Int64Col" );
					buttonAddInt64Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelInt64ColObj obj = (IBusModelInt64ColObj)schemaObj.getInt64ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getInt64ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelInt64ColEditObj edit = (IBusModelInt64ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXInt64ColPaneCommon jpanelCommon = (IBusModelJavaFXInt64ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddInt64Col );
					}
					buttonAddNmTokenType = new CFButton();
					buttonAddNmTokenType.setMinWidth( 200 );
					buttonAddNmTokenType.setText( "Add NmTokenType" );
					buttonAddNmTokenType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelNmTokenTypeObj obj = (IBusModelNmTokenTypeObj)schemaObj.getNmTokenTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
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
								IBusModelJavaFXNmTokenTypePaneCommon jpanelCommon = (IBusModelJavaFXNmTokenTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddNmTokenType );
					}
					buttonAddNmTokenCol = new CFButton();
					buttonAddNmTokenCol.setMinWidth( 200 );
					buttonAddNmTokenCol.setText( "Add NmTokenCol" );
					buttonAddNmTokenCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelNmTokenColObj obj = (IBusModelNmTokenColObj)schemaObj.getNmTokenColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getNmTokenColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelNmTokenColEditObj edit = (IBusModelNmTokenColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXNmTokenColPaneCommon jpanelCommon = (IBusModelJavaFXNmTokenColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddNmTokenCol );
					}
					buttonAddNmTokensType = new CFButton();
					buttonAddNmTokensType.setMinWidth( 200 );
					buttonAddNmTokensType.setText( "Add NmTokensType" );
					buttonAddNmTokensType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelNmTokensTypeObj obj = (IBusModelNmTokensTypeObj)schemaObj.getNmTokensTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getNmTokensTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelNmTokensTypeEditObj edit = (IBusModelNmTokensTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXNmTokensTypePaneCommon jpanelCommon = (IBusModelJavaFXNmTokensTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddNmTokensType );
					}
					buttonAddNmTokensCol = new CFButton();
					buttonAddNmTokensCol.setMinWidth( 200 );
					buttonAddNmTokensCol.setText( "Add NmTokensCol" );
					buttonAddNmTokensCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelNmTokensColObj obj = (IBusModelNmTokensColObj)schemaObj.getNmTokensColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getNmTokensColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelNmTokensColEditObj edit = (IBusModelNmTokensColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXNmTokensColPaneCommon jpanelCommon = (IBusModelJavaFXNmTokensColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddNmTokensCol );
					}
					buttonAddNumberType = new CFButton();
					buttonAddNumberType.setMinWidth( 200 );
					buttonAddNumberType.setText( "Add NumberType" );
					buttonAddNumberType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelNumberTypeObj obj = (IBusModelNumberTypeObj)schemaObj.getNumberTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getNumberTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelNumberTypeEditObj edit = (IBusModelNumberTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXNumberTypePaneCommon jpanelCommon = (IBusModelJavaFXNumberTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddNumberType );
					}
					buttonAddNumberCol = new CFButton();
					buttonAddNumberCol.setMinWidth( 200 );
					buttonAddNumberCol.setText( "Add NumberCol" );
					buttonAddNumberCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelNumberColObj obj = (IBusModelNumberColObj)schemaObj.getNumberColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getNumberColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelNumberColEditObj edit = (IBusModelNumberColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXNumberColPaneCommon jpanelCommon = (IBusModelJavaFXNumberColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddNumberCol );
					}
					buttonAddDbKeyHash128Col = new CFButton();
					buttonAddDbKeyHash128Col.setMinWidth( 200 );
					buttonAddDbKeyHash128Col.setText( "Add DbKeyHash128Col" );
					buttonAddDbKeyHash128Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash128ColObj obj = (IBusModelDbKeyHash128ColObj)schemaObj.getDbKeyHash128ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash128ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash128ColEditObj edit = (IBusModelDbKeyHash128ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash128ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash128ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDbKeyHash128Col );
					}
					buttonAddDbKeyHash128Type = new CFButton();
					buttonAddDbKeyHash128Type.setMinWidth( 200 );
					buttonAddDbKeyHash128Type.setText( "Add DbKeyHash128Type" );
					buttonAddDbKeyHash128Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash128TypeObj obj = (IBusModelDbKeyHash128TypeObj)schemaObj.getDbKeyHash128TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash128TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash128TypeEditObj edit = (IBusModelDbKeyHash128TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash128TypePaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash128TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash128Type );
					}
					buttonAddDbKeyHash128Gen = new CFButton();
					buttonAddDbKeyHash128Gen.setMinWidth( 200 );
					buttonAddDbKeyHash128Gen.setText( "Add DbKeyHash128Gen" );
					buttonAddDbKeyHash128Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash128GenObj obj = (IBusModelDbKeyHash128GenObj)schemaObj.getDbKeyHash128GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash128GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash128GenEditObj edit = (IBusModelDbKeyHash128GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash128GenPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash128GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash128Gen );
					}
					buttonAddDbKeyHash160Col = new CFButton();
					buttonAddDbKeyHash160Col.setMinWidth( 200 );
					buttonAddDbKeyHash160Col.setText( "Add DbKeyHash160Col" );
					buttonAddDbKeyHash160Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash160ColObj obj = (IBusModelDbKeyHash160ColObj)schemaObj.getDbKeyHash160ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash160ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash160ColEditObj edit = (IBusModelDbKeyHash160ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash160ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash160ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDbKeyHash160Col );
					}
					buttonAddDbKeyHash160Type = new CFButton();
					buttonAddDbKeyHash160Type.setMinWidth( 200 );
					buttonAddDbKeyHash160Type.setText( "Add DbKeyHash160Type" );
					buttonAddDbKeyHash160Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash160TypeObj obj = (IBusModelDbKeyHash160TypeObj)schemaObj.getDbKeyHash160TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash160TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash160TypeEditObj edit = (IBusModelDbKeyHash160TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash160TypePaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash160TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash160Type );
					}
					buttonAddDbKeyHash160Gen = new CFButton();
					buttonAddDbKeyHash160Gen.setMinWidth( 200 );
					buttonAddDbKeyHash160Gen.setText( "Add DbKeyHash160Gen" );
					buttonAddDbKeyHash160Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash160GenObj obj = (IBusModelDbKeyHash160GenObj)schemaObj.getDbKeyHash160GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash160GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash160GenEditObj edit = (IBusModelDbKeyHash160GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash160GenPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash160GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash160Gen );
					}
					buttonAddDbKeyHash224Col = new CFButton();
					buttonAddDbKeyHash224Col.setMinWidth( 200 );
					buttonAddDbKeyHash224Col.setText( "Add DbKeyHash224Col" );
					buttonAddDbKeyHash224Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash224ColObj obj = (IBusModelDbKeyHash224ColObj)schemaObj.getDbKeyHash224ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash224ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash224ColEditObj edit = (IBusModelDbKeyHash224ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash224ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash224ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDbKeyHash224Col );
					}
					buttonAddDbKeyHash224Type = new CFButton();
					buttonAddDbKeyHash224Type.setMinWidth( 200 );
					buttonAddDbKeyHash224Type.setText( "Add DbKeyHash224Type" );
					buttonAddDbKeyHash224Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash224TypeObj obj = (IBusModelDbKeyHash224TypeObj)schemaObj.getDbKeyHash224TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash224TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash224TypeEditObj edit = (IBusModelDbKeyHash224TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash224TypePaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash224TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash224Type );
					}
					buttonAddDbKeyHash224Gen = new CFButton();
					buttonAddDbKeyHash224Gen.setMinWidth( 200 );
					buttonAddDbKeyHash224Gen.setText( "Add DbKeyHash224Gen" );
					buttonAddDbKeyHash224Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash224GenObj obj = (IBusModelDbKeyHash224GenObj)schemaObj.getDbKeyHash224GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash224GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash224GenEditObj edit = (IBusModelDbKeyHash224GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash224GenPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash224GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash224Gen );
					}
					buttonAddDbKeyHash256Col = new CFButton();
					buttonAddDbKeyHash256Col.setMinWidth( 200 );
					buttonAddDbKeyHash256Col.setText( "Add DbKeyHash256Col" );
					buttonAddDbKeyHash256Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash256ColObj obj = (IBusModelDbKeyHash256ColObj)schemaObj.getDbKeyHash256ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash256ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash256ColEditObj edit = (IBusModelDbKeyHash256ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash256ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash256ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDbKeyHash256Col );
					}
					buttonAddDbKeyHash256Type = new CFButton();
					buttonAddDbKeyHash256Type.setMinWidth( 200 );
					buttonAddDbKeyHash256Type.setText( "Add DbKeyHash256Type" );
					buttonAddDbKeyHash256Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash256TypeObj obj = (IBusModelDbKeyHash256TypeObj)schemaObj.getDbKeyHash256TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash256TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash256TypeEditObj edit = (IBusModelDbKeyHash256TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash256TypePaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash256TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash256Type );
					}
					buttonAddDbKeyHash256Gen = new CFButton();
					buttonAddDbKeyHash256Gen.setMinWidth( 200 );
					buttonAddDbKeyHash256Gen.setText( "Add DbKeyHash256Gen" );
					buttonAddDbKeyHash256Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash256GenObj obj = (IBusModelDbKeyHash256GenObj)schemaObj.getDbKeyHash256GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash256GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash256GenEditObj edit = (IBusModelDbKeyHash256GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash256GenPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash256GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash256Gen );
					}
					buttonAddDbKeyHash384Col = new CFButton();
					buttonAddDbKeyHash384Col.setMinWidth( 200 );
					buttonAddDbKeyHash384Col.setText( "Add DbKeyHash384Col" );
					buttonAddDbKeyHash384Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)schemaObj.getDbKeyHash384ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash384ColEditObj edit = (IBusModelDbKeyHash384ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash384ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash384ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDbKeyHash384Col );
					}
					buttonAddDbKeyHash384Type = new CFButton();
					buttonAddDbKeyHash384Type.setMinWidth( 200 );
					buttonAddDbKeyHash384Type.setText( "Add DbKeyHash384Type" );
					buttonAddDbKeyHash384Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)schemaObj.getDbKeyHash384TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash384TypeEditObj edit = (IBusModelDbKeyHash384TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash384TypePaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash384TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash384Type );
					}
					buttonAddDbKeyHash384Gen = new CFButton();
					buttonAddDbKeyHash384Gen.setMinWidth( 200 );
					buttonAddDbKeyHash384Gen.setText( "Add DbKeyHash384Gen" );
					buttonAddDbKeyHash384Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)schemaObj.getDbKeyHash384GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash384GenEditObj edit = (IBusModelDbKeyHash384GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash384GenPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash384GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash384Gen );
					}
					buttonAddDbKeyHash512Col = new CFButton();
					buttonAddDbKeyHash512Col.setMinWidth( 200 );
					buttonAddDbKeyHash512Col.setText( "Add DbKeyHash512Col" );
					buttonAddDbKeyHash512Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash512ColObj obj = (IBusModelDbKeyHash512ColObj)schemaObj.getDbKeyHash512ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash512ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash512ColEditObj edit = (IBusModelDbKeyHash512ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash512ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash512ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddDbKeyHash512Col );
					}
					buttonAddDbKeyHash512Type = new CFButton();
					buttonAddDbKeyHash512Type.setMinWidth( 200 );
					buttonAddDbKeyHash512Type.setText( "Add DbKeyHash512Type" );
					buttonAddDbKeyHash512Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash512TypeObj obj = (IBusModelDbKeyHash512TypeObj)schemaObj.getDbKeyHash512TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash512TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash512TypeEditObj edit = (IBusModelDbKeyHash512TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash512TypePaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash512TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash512Type );
					}
					buttonAddDbKeyHash512Gen = new CFButton();
					buttonAddDbKeyHash512Gen.setMinWidth( 200 );
					buttonAddDbKeyHash512Gen.setText( "Add DbKeyHash512Gen" );
					buttonAddDbKeyHash512Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelDbKeyHash512GenObj obj = (IBusModelDbKeyHash512GenObj)schemaObj.getDbKeyHash512GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDbKeyHash512GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelDbKeyHash512GenEditObj edit = (IBusModelDbKeyHash512GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXDbKeyHash512GenPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash512GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddDbKeyHash512Gen );
					}
					buttonAddStringType = new CFButton();
					buttonAddStringType.setMinWidth( 200 );
					buttonAddStringType.setText( "Add StringType" );
					buttonAddStringType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelStringTypeObj obj = (IBusModelStringTypeObj)schemaObj.getStringTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getStringTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelStringTypeEditObj edit = (IBusModelStringTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXStringTypePaneCommon jpanelCommon = (IBusModelJavaFXStringTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddStringType );
					}
					buttonAddStringCol = new CFButton();
					buttonAddStringCol.setMinWidth( 200 );
					buttonAddStringCol.setText( "Add StringCol" );
					buttonAddStringCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelStringColObj obj = (IBusModelStringColObj)schemaObj.getStringColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getStringColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelStringColEditObj edit = (IBusModelStringColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXStringColPaneCommon jpanelCommon = (IBusModelJavaFXStringColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddStringCol );
					}
					buttonAddTZDateType = new CFButton();
					buttonAddTZDateType.setMinWidth( 200 );
					buttonAddTZDateType.setText( "Add TZDateType" );
					buttonAddTZDateType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTZDateTypeObj obj = (IBusModelTZDateTypeObj)schemaObj.getTZDateTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTZDateTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTZDateTypeEditObj edit = (IBusModelTZDateTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTZDateTypePaneCommon jpanelCommon = (IBusModelJavaFXTZDateTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddTZDateType );
					}
					buttonAddTZDateCol = new CFButton();
					buttonAddTZDateCol.setMinWidth( 200 );
					buttonAddTZDateCol.setText( "Add TZDateCol" );
					buttonAddTZDateCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTZDateColObj obj = (IBusModelTZDateColObj)schemaObj.getTZDateColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTZDateColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTZDateColEditObj edit = (IBusModelTZDateColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTZDateColPaneCommon jpanelCommon = (IBusModelJavaFXTZDateColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTZDateCol );
					}
					buttonAddTZTimeType = new CFButton();
					buttonAddTZTimeType.setMinWidth( 200 );
					buttonAddTZTimeType.setText( "Add TZTimeType" );
					buttonAddTZTimeType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTZTimeTypeObj obj = (IBusModelTZTimeTypeObj)schemaObj.getTZTimeTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTZTimeTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTZTimeTypeEditObj edit = (IBusModelTZTimeTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTZTimeTypePaneCommon jpanelCommon = (IBusModelJavaFXTZTimeTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddTZTimeType );
					}
					buttonAddTZTimeCol = new CFButton();
					buttonAddTZTimeCol.setMinWidth( 200 );
					buttonAddTZTimeCol.setText( "Add TZTimeCol" );
					buttonAddTZTimeCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTZTimeColObj obj = (IBusModelTZTimeColObj)schemaObj.getTZTimeColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTZTimeColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTZTimeColEditObj edit = (IBusModelTZTimeColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTZTimeColPaneCommon jpanelCommon = (IBusModelJavaFXTZTimeColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTZTimeCol );
					}
					buttonAddTZTimestampType = new CFButton();
					buttonAddTZTimestampType.setMinWidth( 200 );
					buttonAddTZTimestampType.setText( "Add TZTimestampType" );
					buttonAddTZTimestampType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTZTimestampTypeObj obj = (IBusModelTZTimestampTypeObj)schemaObj.getTZTimestampTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTZTimestampTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTZTimestampTypeEditObj edit = (IBusModelTZTimestampTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTZTimestampTypePaneCommon jpanelCommon = (IBusModelJavaFXTZTimestampTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddTZTimestampType );
					}
					buttonAddTZTimestampCol = new CFButton();
					buttonAddTZTimestampCol.setMinWidth( 200 );
					buttonAddTZTimestampCol.setText( "Add TZTimestampCol" );
					buttonAddTZTimestampCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTZTimestampColObj obj = (IBusModelTZTimestampColObj)schemaObj.getTZTimestampColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTZTimestampColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTZTimestampColEditObj edit = (IBusModelTZTimestampColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTZTimestampColPaneCommon jpanelCommon = (IBusModelJavaFXTZTimestampColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTZTimestampCol );
					}
					buttonAddTextType = new CFButton();
					buttonAddTextType.setMinWidth( 200 );
					buttonAddTextType.setText( "Add TextType" );
					buttonAddTextType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTextTypeObj obj = (IBusModelTextTypeObj)schemaObj.getTextTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTextTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTextTypeEditObj edit = (IBusModelTextTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTextTypePaneCommon jpanelCommon = (IBusModelJavaFXTextTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddTextType );
					}
					buttonAddTextCol = new CFButton();
					buttonAddTextCol.setMinWidth( 200 );
					buttonAddTextCol.setText( "Add TextCol" );
					buttonAddTextCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTextColObj obj = (IBusModelTextColObj)schemaObj.getTextColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTextColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTextColEditObj edit = (IBusModelTextColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTextColPaneCommon jpanelCommon = (IBusModelJavaFXTextColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTextCol );
					}
					buttonAddTimeType = new CFButton();
					buttonAddTimeType.setMinWidth( 200 );
					buttonAddTimeType.setText( "Add TimeType" );
					buttonAddTimeType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTimeTypeObj obj = (IBusModelTimeTypeObj)schemaObj.getTimeTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTimeTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTimeTypeEditObj edit = (IBusModelTimeTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTimeTypePaneCommon jpanelCommon = (IBusModelJavaFXTimeTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddTimeType );
					}
					buttonAddTimeCol = new CFButton();
					buttonAddTimeCol.setMinWidth( 200 );
					buttonAddTimeCol.setText( "Add TimeCol" );
					buttonAddTimeCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTimeColObj obj = (IBusModelTimeColObj)schemaObj.getTimeColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTimeColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTimeColEditObj edit = (IBusModelTimeColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTimeColPaneCommon jpanelCommon = (IBusModelJavaFXTimeColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTimeCol );
					}
					buttonAddTimestampType = new CFButton();
					buttonAddTimestampType.setMinWidth( 200 );
					buttonAddTimestampType.setText( "Add TimestampType" );
					buttonAddTimestampType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTimestampTypeObj obj = (IBusModelTimestampTypeObj)schemaObj.getTimestampTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTimestampTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTimestampTypeEditObj edit = (IBusModelTimestampTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTimestampTypePaneCommon jpanelCommon = (IBusModelJavaFXTimestampTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddTimestampType );
					}
					buttonAddTimestampCol = new CFButton();
					buttonAddTimestampCol.setMinWidth( 200 );
					buttonAddTimestampCol.setText( "Add TimestampCol" );
					buttonAddTimestampCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTimestampColObj obj = (IBusModelTimestampColObj)schemaObj.getTimestampColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTimestampColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTimestampColEditObj edit = (IBusModelTimestampColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTimestampColPaneCommon jpanelCommon = (IBusModelJavaFXTimestampColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTimestampCol );
					}
					buttonAddTokenType = new CFButton();
					buttonAddTokenType.setMinWidth( 200 );
					buttonAddTokenType.setText( "Add TokenType" );
					buttonAddTokenType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTokenTypeObj obj = (IBusModelTokenTypeObj)schemaObj.getTokenTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTokenTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTokenTypeEditObj edit = (IBusModelTokenTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTokenTypePaneCommon jpanelCommon = (IBusModelJavaFXTokenTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddTokenType );
					}
					buttonAddTokenCol = new CFButton();
					buttonAddTokenCol.setMinWidth( 200 );
					buttonAddTokenCol.setText( "Add TokenCol" );
					buttonAddTokenCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTokenColObj obj = (IBusModelTokenColObj)schemaObj.getTokenColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTokenColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTokenColEditObj edit = (IBusModelTokenColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTokenColPaneCommon jpanelCommon = (IBusModelJavaFXTokenColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTokenCol );
					}
					buttonAddUInt16Type = new CFButton();
					buttonAddUInt16Type.setMinWidth( 200 );
					buttonAddUInt16Type.setText( "Add UInt16Type" );
					buttonAddUInt16Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUInt16TypeObj obj = (IBusModelUInt16TypeObj)schemaObj.getUInt16TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt16TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUInt16TypeEditObj edit = (IBusModelUInt16TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUInt16TypePaneCommon jpanelCommon = (IBusModelJavaFXUInt16TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddUInt16Type );
					}
					buttonAddUInt16Col = new CFButton();
					buttonAddUInt16Col.setMinWidth( 200 );
					buttonAddUInt16Col.setText( "Add UInt16Col" );
					buttonAddUInt16Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUInt16ColObj obj = (IBusModelUInt16ColObj)schemaObj.getUInt16ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt16ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUInt16ColEditObj edit = (IBusModelUInt16ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUInt16ColPaneCommon jpanelCommon = (IBusModelJavaFXUInt16ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddUInt16Col );
					}
					buttonAddUInt32Type = new CFButton();
					buttonAddUInt32Type.setMinWidth( 200 );
					buttonAddUInt32Type.setText( "Add UInt32Type" );
					buttonAddUInt32Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUInt32TypeObj obj = (IBusModelUInt32TypeObj)schemaObj.getUInt32TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt32TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUInt32TypeEditObj edit = (IBusModelUInt32TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUInt32TypePaneCommon jpanelCommon = (IBusModelJavaFXUInt32TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddUInt32Type );
					}
					buttonAddUInt32Col = new CFButton();
					buttonAddUInt32Col.setMinWidth( 200 );
					buttonAddUInt32Col.setText( "Add UInt32Col" );
					buttonAddUInt32Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUInt32ColObj obj = (IBusModelUInt32ColObj)schemaObj.getUInt32ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt32ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUInt32ColEditObj edit = (IBusModelUInt32ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUInt32ColPaneCommon jpanelCommon = (IBusModelJavaFXUInt32ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddUInt32Col );
					}
					buttonAddUInt64Type = new CFButton();
					buttonAddUInt64Type.setMinWidth( 200 );
					buttonAddUInt64Type.setText( "Add UInt64Type" );
					buttonAddUInt64Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUInt64TypeObj obj = (IBusModelUInt64TypeObj)schemaObj.getUInt64TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUInt64TypeEditObj edit = (IBusModelUInt64TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUInt64TypePaneCommon jpanelCommon = (IBusModelJavaFXUInt64TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddUInt64Type );
					}
					buttonAddUInt64Col = new CFButton();
					buttonAddUInt64Col.setMinWidth( 200 );
					buttonAddUInt64Col.setText( "Add UInt64Col" );
					buttonAddUInt64Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUInt64ColObj obj = (IBusModelUInt64ColObj)schemaObj.getUInt64ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUInt64ColEditObj edit = (IBusModelUInt64ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUInt64ColPaneCommon jpanelCommon = (IBusModelJavaFXUInt64ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddUInt64Col );
					}
					buttonAddUuidType = new CFButton();
					buttonAddUuidType.setMinWidth( 200 );
					buttonAddUuidType.setText( "Add UuidType" );
					buttonAddUuidType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUuidTypeObj obj = (IBusModelUuidTypeObj)schemaObj.getUuidTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUuidTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUuidTypeEditObj edit = (IBusModelUuidTypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUuidTypePaneCommon jpanelCommon = (IBusModelJavaFXUuidTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddUuidType );
					}
					buttonAddUuidGen = new CFButton();
					buttonAddUuidGen.setMinWidth( 200 );
					buttonAddUuidGen.setText( "Add UuidGen" );
					buttonAddUuidGen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUuidGenObj obj = (IBusModelUuidGenObj)schemaObj.getUuidGenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUuidGenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUuidGenEditObj edit = (IBusModelUuidGenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUuidGenPaneCommon jpanelCommon = (IBusModelJavaFXUuidGenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddUuidGen );
					}
					buttonAddUuidCol = new CFButton();
					buttonAddUuidCol.setMinWidth( 200 );
					buttonAddUuidCol.setText( "Add UuidCol" );
					buttonAddUuidCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUuidColObj obj = (IBusModelUuidColObj)schemaObj.getUuidColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUuidColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUuidColEditObj edit = (IBusModelUuidColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUuidColPaneCommon jpanelCommon = (IBusModelJavaFXUuidColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddUuidCol );
					}
					buttonAddUuid6Type = new CFButton();
					buttonAddUuid6Type.setMinWidth( 200 );
					buttonAddUuid6Type.setText( "Add Uuid6Type" );
					buttonAddUuid6Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUuid6TypeObj obj = (IBusModelUuid6TypeObj)schemaObj.getUuid6TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUuid6TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUuid6TypeEditObj edit = (IBusModelUuid6TypeEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUuid6TypePaneCommon jpanelCommon = (IBusModelJavaFXUuid6TypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddUuid6Type );
					}
					buttonAddUuid6Gen = new CFButton();
					buttonAddUuid6Gen.setMinWidth( 200 );
					buttonAddUuid6Gen.setText( "Add Uuid6Gen" );
					buttonAddUuid6Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUuid6GenObj obj = (IBusModelUuid6GenObj)schemaObj.getUuid6GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUuid6GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUuid6GenEditObj edit = (IBusModelUuid6GenEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUuid6GenPaneCommon jpanelCommon = (IBusModelJavaFXUuid6GenPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelSchemaDefObj ) {
						list.add( buttonAddUuid6Gen );
					}
					buttonAddUuid6Col = new CFButton();
					buttonAddUuid6Col.setMinWidth( 200 );
					buttonAddUuid6Col.setText( "Add Uuid6Col" );
					buttonAddUuid6Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelUuid6ColObj obj = (IBusModelUuid6ColObj)schemaObj.getUuid6ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUuid6ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelUuid6ColEditObj edit = (IBusModelUuid6ColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXUuid6ColPaneCommon jpanelCommon = (IBusModelJavaFXUuid6ColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddUuid6Col );
					}
					buttonAddTableCol = new CFButton();
					buttonAddTableCol.setMinWidth( 200 );
					buttonAddTableCol.setText( "Add TableCol" );
					buttonAddTableCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
								IBusModelTableColObj obj = (IBusModelTableColObj)schemaObj.getTableColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTableColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								IBusModelTableColEditObj edit = (IBusModelTableColEditObj)( obj.beginEdit() );
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
								IBusModelJavaFXTableColPaneCommon jpanelCommon = (IBusModelJavaFXTableColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof IBusModelTableObj ) {
						list.add( buttonAddTableCol );
					}

				int len = list.size();
				CFButton arr[] = new CFButton[len];
				Iterator<CFButton> iter = list.iterator();
				int idx = 0;
				while( iter.hasNext() ) {
					arr[idx++] = iter.next();
				}
				Arrays.sort( arr, new CompareCFButtonByText() );
				for( idx = 0; idx < len; idx ++ ) {
					vboxMenuAdd.getChildren().add( arr[idx] );
				}

				buttonCancelAdd = new CFButton();
				buttonCancelAdd.setMinWidth( 200 );
				buttonCancelAdd.setText( "Cancel Add..." );
				buttonCancelAdd.setOnAction( new EventHandler<ActionEvent>() {
					@Override public void handle( ActionEvent e ) {
						final String S_ProcName = "handle";
						try {
							setLeft( null );
							adjustListButtons();
						}
						catch( Throwable t ) {
							CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
						}
					}
				});
				vboxMenuAdd.getChildren().add( buttonCancelAdd );

				scrollMenuAdd = new ScrollPane();
				scrollMenuAdd.setMinWidth( 240 );
				scrollMenuAdd.setMaxWidth( 240 );
				scrollMenuAdd.setFitToWidth( true );
				scrollMenuAdd.setHbarPolicy( ScrollBarPolicy.NEVER );
				scrollMenuAdd.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
				scrollMenuAdd.setContent( vboxMenuAdd );

			buttonAdd = new CFButton();
			buttonAdd.setMinWidth( 200 );
			buttonAdd.setText( "Add..." );
			buttonAdd.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						setLeft( scrollMenuAdd );
						adjustListButtons();
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAdd );

			buttonMoveUpSelected = new CFButton();
			buttonMoveUpSelected.setMinWidth( 200 );
			buttonMoveUpSelected.setText( "Move Up Selected" );
			buttonMoveUpSelected.setOnAction( new EventHandler<ActionEvent>() {
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
						IBusModelValueObj selectedInstance = getJavaFXFocusAsValue();
						if( selectedInstance != null ) {
							if( null != selectedInstance.getOptionalLookupPrev() ) {
								selectedInstance.moveUp();
								refreshMe();
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonMoveUpSelected );

			buttonMoveDownSelected = new CFButton();
			buttonMoveDownSelected.setMinWidth( 200 );
			buttonMoveDownSelected.setText( "Move Down Selected" );
			buttonMoveDownSelected.setOnAction( new EventHandler<ActionEvent>() {
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
						IBusModelValueObj selectedInstance = getJavaFXFocusAsValue();
						if( selectedInstance != null ) {
							if( null != selectedInstance.getOptionalLookupNext() ) {
								selectedInstance.moveDown();
								refreshMe();
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonMoveDownSelected );

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
						IBusModelValueObj selectedInstance = getJavaFXFocusAsValue();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelValue.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getValueFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXValuePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelAtom.CLASS_CODE ) {
								IBusModelAtomObj obj = (IBusModelAtomObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getAtomFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXAtomPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobDef.CLASS_CODE ) {
								IBusModelBlobDefObj obj = (IBusModelBlobDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBlobDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobType.CLASS_CODE ) {
								IBusModelBlobTypeObj obj = (IBusModelBlobTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBlobTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobCol.CLASS_CODE ) {
								IBusModelBlobColObj obj = (IBusModelBlobColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBlobColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolDef.CLASS_CODE ) {
								IBusModelBoolDefObj obj = (IBusModelBoolDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBoolDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolType.CLASS_CODE ) {
								IBusModelBoolTypeObj obj = (IBusModelBoolTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBoolTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolCol.CLASS_CODE ) {
								IBusModelBoolColObj obj = (IBusModelBoolColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBoolColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateDef.CLASS_CODE ) {
								IBusModelDateDefObj obj = (IBusModelDateDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateType.CLASS_CODE ) {
								IBusModelDateTypeObj obj = (IBusModelDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateCol.CLASS_CODE ) {
								IBusModelDateColObj obj = (IBusModelDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleDef.CLASS_CODE ) {
								IBusModelDoubleDefObj obj = (IBusModelDoubleDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDoubleDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleType.CLASS_CODE ) {
								IBusModelDoubleTypeObj obj = (IBusModelDoubleTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDoubleTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleCol.CLASS_CODE ) {
								IBusModelDoubleColObj obj = (IBusModelDoubleColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDoubleColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatDef.CLASS_CODE ) {
								IBusModelFloatDefObj obj = (IBusModelFloatDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatType.CLASS_CODE ) {
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								IBusModelFloatColObj obj = (IBusModelFloatColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Def.CLASS_CODE ) {
								IBusModelInt16DefObj obj = (IBusModelInt16DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt16DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Type.CLASS_CODE ) {
								IBusModelInt16TypeObj obj = (IBusModelInt16TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt16TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId16Gen.CLASS_CODE ) {
								IBusModelId16GenObj obj = (IBusModelId16GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId16GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXId16GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumDef.CLASS_CODE ) {
								IBusModelEnumDefObj obj = (IBusModelEnumDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getEnumDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXEnumDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumType.CLASS_CODE ) {
								IBusModelEnumTypeObj obj = (IBusModelEnumTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getEnumTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXEnumTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Col.CLASS_CODE ) {
								IBusModelInt16ColObj obj = (IBusModelInt16ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt16ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Def.CLASS_CODE ) {
								IBusModelInt32DefObj obj = (IBusModelInt32DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt32DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Type.CLASS_CODE ) {
								IBusModelInt32TypeObj obj = (IBusModelInt32TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt32TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId32Gen.CLASS_CODE ) {
								IBusModelId32GenObj obj = (IBusModelId32GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId32GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXId32GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Col.CLASS_CODE ) {
								IBusModelInt32ColObj obj = (IBusModelInt32ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt32ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Def.CLASS_CODE ) {
								IBusModelInt64DefObj obj = (IBusModelInt64DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Type.CLASS_CODE ) {
								IBusModelInt64TypeObj obj = (IBusModelInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId64Gen.CLASS_CODE ) {
								IBusModelId64GenObj obj = (IBusModelId64GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId64GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXId64GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Col.CLASS_CODE ) {
								IBusModelInt64ColObj obj = (IBusModelInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenDef.CLASS_CODE ) {
								IBusModelNmTokenDefObj obj = (IBusModelNmTokenDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenType.CLASS_CODE ) {
								IBusModelNmTokenTypeObj obj = (IBusModelNmTokenTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenCol.CLASS_CODE ) {
								IBusModelNmTokenColObj obj = (IBusModelNmTokenColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensDef.CLASS_CODE ) {
								IBusModelNmTokensDefObj obj = (IBusModelNmTokensDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokensDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensType.CLASS_CODE ) {
								IBusModelNmTokensTypeObj obj = (IBusModelNmTokensTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokensTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensCol.CLASS_CODE ) {
								IBusModelNmTokensColObj obj = (IBusModelNmTokensColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokensColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberDef.CLASS_CODE ) {
								IBusModelNumberDefObj obj = (IBusModelNumberDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNumberDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberType.CLASS_CODE ) {
								IBusModelNumberTypeObj obj = (IBusModelNumberTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNumberTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberCol.CLASS_CODE ) {
								IBusModelNumberColObj obj = (IBusModelNumberColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNumberColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Def.CLASS_CODE ) {
								IBusModelDbKeyHash128DefObj obj = (IBusModelDbKeyHash128DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Col.CLASS_CODE ) {
								IBusModelDbKeyHash128ColObj obj = (IBusModelDbKeyHash128ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Type.CLASS_CODE ) {
								IBusModelDbKeyHash128TypeObj obj = (IBusModelDbKeyHash128TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Gen.CLASS_CODE ) {
								IBusModelDbKeyHash128GenObj obj = (IBusModelDbKeyHash128GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Def.CLASS_CODE ) {
								IBusModelDbKeyHash160DefObj obj = (IBusModelDbKeyHash160DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Col.CLASS_CODE ) {
								IBusModelDbKeyHash160ColObj obj = (IBusModelDbKeyHash160ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Type.CLASS_CODE ) {
								IBusModelDbKeyHash160TypeObj obj = (IBusModelDbKeyHash160TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Gen.CLASS_CODE ) {
								IBusModelDbKeyHash160GenObj obj = (IBusModelDbKeyHash160GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Def.CLASS_CODE ) {
								IBusModelDbKeyHash224DefObj obj = (IBusModelDbKeyHash224DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Col.CLASS_CODE ) {
								IBusModelDbKeyHash224ColObj obj = (IBusModelDbKeyHash224ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Type.CLASS_CODE ) {
								IBusModelDbKeyHash224TypeObj obj = (IBusModelDbKeyHash224TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Gen.CLASS_CODE ) {
								IBusModelDbKeyHash224GenObj obj = (IBusModelDbKeyHash224GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Def.CLASS_CODE ) {
								IBusModelDbKeyHash256DefObj obj = (IBusModelDbKeyHash256DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Col.CLASS_CODE ) {
								IBusModelDbKeyHash256ColObj obj = (IBusModelDbKeyHash256ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Type.CLASS_CODE ) {
								IBusModelDbKeyHash256TypeObj obj = (IBusModelDbKeyHash256TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Gen.CLASS_CODE ) {
								IBusModelDbKeyHash256GenObj obj = (IBusModelDbKeyHash256GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Def.CLASS_CODE ) {
								IBusModelDbKeyHash384DefObj obj = (IBusModelDbKeyHash384DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Col.CLASS_CODE ) {
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Type.CLASS_CODE ) {
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Gen.CLASS_CODE ) {
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Def.CLASS_CODE ) {
								IBusModelDbKeyHash512DefObj obj = (IBusModelDbKeyHash512DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Col.CLASS_CODE ) {
								IBusModelDbKeyHash512ColObj obj = (IBusModelDbKeyHash512ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Type.CLASS_CODE ) {
								IBusModelDbKeyHash512TypeObj obj = (IBusModelDbKeyHash512TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Gen.CLASS_CODE ) {
								IBusModelDbKeyHash512GenObj obj = (IBusModelDbKeyHash512GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringDef.CLASS_CODE ) {
								IBusModelStringDefObj obj = (IBusModelStringDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXStringDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringType.CLASS_CODE ) {
								IBusModelStringTypeObj obj = (IBusModelStringTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXStringTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringCol.CLASS_CODE ) {
								IBusModelStringColObj obj = (IBusModelStringColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXStringColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateDef.CLASS_CODE ) {
								IBusModelTZDateDefObj obj = (IBusModelTZDateDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateType.CLASS_CODE ) {
								IBusModelTZDateTypeObj obj = (IBusModelTZDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateCol.CLASS_CODE ) {
								IBusModelTZDateColObj obj = (IBusModelTZDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeDef.CLASS_CODE ) {
								IBusModelTZTimeDefObj obj = (IBusModelTZTimeDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimeDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeType.CLASS_CODE ) {
								IBusModelTZTimeTypeObj obj = (IBusModelTZTimeTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimeTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeCol.CLASS_CODE ) {
								IBusModelTZTimeColObj obj = (IBusModelTZTimeColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimeColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampDef.CLASS_CODE ) {
								IBusModelTZTimestampDefObj obj = (IBusModelTZTimestampDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimestampDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampType.CLASS_CODE ) {
								IBusModelTZTimestampTypeObj obj = (IBusModelTZTimestampTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimestampTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampCol.CLASS_CODE ) {
								IBusModelTZTimestampColObj obj = (IBusModelTZTimestampColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimestampColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextDef.CLASS_CODE ) {
								IBusModelTextDefObj obj = (IBusModelTextDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTextDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextType.CLASS_CODE ) {
								IBusModelTextTypeObj obj = (IBusModelTextTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTextTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextCol.CLASS_CODE ) {
								IBusModelTextColObj obj = (IBusModelTextColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTextColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeDef.CLASS_CODE ) {
								IBusModelTimeDefObj obj = (IBusModelTimeDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimeDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeType.CLASS_CODE ) {
								IBusModelTimeTypeObj obj = (IBusModelTimeTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimeTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeCol.CLASS_CODE ) {
								IBusModelTimeColObj obj = (IBusModelTimeColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimeColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampDef.CLASS_CODE ) {
								IBusModelTimestampDefObj obj = (IBusModelTimestampDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimestampDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampType.CLASS_CODE ) {
								IBusModelTimestampTypeObj obj = (IBusModelTimestampTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimestampTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampCol.CLASS_CODE ) {
								IBusModelTimestampColObj obj = (IBusModelTimestampColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimestampColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenDef.CLASS_CODE ) {
								IBusModelTokenDefObj obj = (IBusModelTokenDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTokenDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenType.CLASS_CODE ) {
								IBusModelTokenTypeObj obj = (IBusModelTokenTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenCol.CLASS_CODE ) {
								IBusModelTokenColObj obj = (IBusModelTokenColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTokenColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Def.CLASS_CODE ) {
								IBusModelUInt16DefObj obj = (IBusModelUInt16DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt16DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Type.CLASS_CODE ) {
								IBusModelUInt16TypeObj obj = (IBusModelUInt16TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt16TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Col.CLASS_CODE ) {
								IBusModelUInt16ColObj obj = (IBusModelUInt16ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt16ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Def.CLASS_CODE ) {
								IBusModelUInt32DefObj obj = (IBusModelUInt32DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt32DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Type.CLASS_CODE ) {
								IBusModelUInt32TypeObj obj = (IBusModelUInt32TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt32TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Col.CLASS_CODE ) {
								IBusModelUInt32ColObj obj = (IBusModelUInt32ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt32ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Def.CLASS_CODE ) {
								IBusModelUInt64DefObj obj = (IBusModelUInt64DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Type.CLASS_CODE ) {
								IBusModelUInt64TypeObj obj = (IBusModelUInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Col.CLASS_CODE ) {
								IBusModelUInt64ColObj obj = (IBusModelUInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidDef.CLASS_CODE ) {
								IBusModelUuidDefObj obj = (IBusModelUuidDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidType.CLASS_CODE ) {
								IBusModelUuidTypeObj obj = (IBusModelUuidTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidGen.CLASS_CODE ) {
								IBusModelUuidGenObj obj = (IBusModelUuidGenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidGenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidGenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidCol.CLASS_CODE ) {
								IBusModelUuidColObj obj = (IBusModelUuidColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Def.CLASS_CODE ) {
								IBusModelUuid6DefObj obj = (IBusModelUuid6DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Type.CLASS_CODE ) {
								IBusModelUuid6TypeObj obj = (IBusModelUuid6TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Gen.CLASS_CODE ) {
								IBusModelUuid6GenObj obj = (IBusModelUuid6GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Col.CLASS_CODE ) {
								IBusModelUuid6ColObj obj = (IBusModelUuid6ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTableCol.CLASS_CODE ) {
								IBusModelTableColObj obj = (IBusModelTableColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTableColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelValueObj, IBusModelAtomObj, IBusModelBlobDefObj, IBusModelBlobTypeObj, IBusModelBlobColObj, IBusModelBoolDefObj, IBusModelBoolTypeObj, IBusModelBoolColObj, IBusModelDateDefObj, IBusModelDateTypeObj, IBusModelDateColObj, IBusModelDoubleDefObj, IBusModelDoubleTypeObj, IBusModelDoubleColObj, IBusModelFloatDefObj, IBusModelFloatTypeObj, IBusModelFloatColObj, IBusModelInt16DefObj, IBusModelInt16TypeObj, IBusModelId16GenObj, IBusModelEnumDefObj, IBusModelEnumTypeObj, IBusModelInt16ColObj, IBusModelInt32DefObj, IBusModelInt32TypeObj, IBusModelId32GenObj, IBusModelInt32ColObj, IBusModelInt64DefObj, IBusModelInt64TypeObj, IBusModelId64GenObj, IBusModelInt64ColObj, IBusModelNmTokenDefObj, IBusModelNmTokenTypeObj, IBusModelNmTokenColObj, IBusModelNmTokensDefObj, IBusModelNmTokensTypeObj, IBusModelNmTokensColObj, IBusModelNumberDefObj, IBusModelNumberTypeObj, IBusModelNumberColObj, IBusModelDbKeyHash128DefObj, IBusModelDbKeyHash128ColObj, IBusModelDbKeyHash128TypeObj, IBusModelDbKeyHash128GenObj, IBusModelDbKeyHash160DefObj, IBusModelDbKeyHash160ColObj, IBusModelDbKeyHash160TypeObj, IBusModelDbKeyHash160GenObj, IBusModelDbKeyHash224DefObj, IBusModelDbKeyHash224ColObj, IBusModelDbKeyHash224TypeObj, IBusModelDbKeyHash224GenObj, IBusModelDbKeyHash256DefObj, IBusModelDbKeyHash256ColObj, IBusModelDbKeyHash256TypeObj, IBusModelDbKeyHash256GenObj, IBusModelDbKeyHash384DefObj, IBusModelDbKeyHash384ColObj, IBusModelDbKeyHash384TypeObj, IBusModelDbKeyHash384GenObj, IBusModelDbKeyHash512DefObj, IBusModelDbKeyHash512ColObj, IBusModelDbKeyHash512TypeObj, IBusModelDbKeyHash512GenObj, IBusModelStringDefObj, IBusModelStringTypeObj, IBusModelStringColObj, IBusModelTZDateDefObj, IBusModelTZDateTypeObj, IBusModelTZDateColObj, IBusModelTZTimeDefObj, IBusModelTZTimeTypeObj, IBusModelTZTimeColObj, IBusModelTZTimestampDefObj, IBusModelTZTimestampTypeObj, IBusModelTZTimestampColObj, IBusModelTextDefObj, IBusModelTextTypeObj, IBusModelTextColObj, IBusModelTimeDefObj, IBusModelTimeTypeObj, IBusModelTimeColObj, IBusModelTimestampDefObj, IBusModelTimestampTypeObj, IBusModelTimestampColObj, IBusModelTokenDefObj, IBusModelTokenTypeObj, IBusModelTokenColObj, IBusModelUInt16DefObj, IBusModelUInt16TypeObj, IBusModelUInt16ColObj, IBusModelUInt32DefObj, IBusModelUInt32TypeObj, IBusModelUInt32ColObj, IBusModelUInt64DefObj, IBusModelUInt64TypeObj, IBusModelUInt64ColObj, IBusModelUuidDefObj, IBusModelUuidTypeObj, IBusModelUuidGenObj, IBusModelUuidColObj, IBusModelUuid6DefObj, IBusModelUuid6TypeObj, IBusModelUuid6GenObj, IBusModelUuid6ColObj, IBusModelTableColObj" );
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
						IBusModelValueObj selectedInstance = getJavaFXFocusAsValue();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelValue.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getValueFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXValuePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelAtom.CLASS_CODE ) {
								IBusModelAtomObj obj = (IBusModelAtomObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getAtomFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXAtomPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobDef.CLASS_CODE ) {
								IBusModelBlobDefObj obj = (IBusModelBlobDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBlobDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobType.CLASS_CODE ) {
								IBusModelBlobTypeObj obj = (IBusModelBlobTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBlobTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobCol.CLASS_CODE ) {
								IBusModelBlobColObj obj = (IBusModelBlobColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBlobColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolDef.CLASS_CODE ) {
								IBusModelBoolDefObj obj = (IBusModelBoolDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBoolDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolType.CLASS_CODE ) {
								IBusModelBoolTypeObj obj = (IBusModelBoolTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBoolTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolCol.CLASS_CODE ) {
								IBusModelBoolColObj obj = (IBusModelBoolColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXBoolColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateDef.CLASS_CODE ) {
								IBusModelDateDefObj obj = (IBusModelDateDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateType.CLASS_CODE ) {
								IBusModelDateTypeObj obj = (IBusModelDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateCol.CLASS_CODE ) {
								IBusModelDateColObj obj = (IBusModelDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleDef.CLASS_CODE ) {
								IBusModelDoubleDefObj obj = (IBusModelDoubleDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDoubleDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleType.CLASS_CODE ) {
								IBusModelDoubleTypeObj obj = (IBusModelDoubleTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDoubleTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleCol.CLASS_CODE ) {
								IBusModelDoubleColObj obj = (IBusModelDoubleColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDoubleColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatDef.CLASS_CODE ) {
								IBusModelFloatDefObj obj = (IBusModelFloatDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatType.CLASS_CODE ) {
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								IBusModelFloatColObj obj = (IBusModelFloatColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Def.CLASS_CODE ) {
								IBusModelInt16DefObj obj = (IBusModelInt16DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt16DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Type.CLASS_CODE ) {
								IBusModelInt16TypeObj obj = (IBusModelInt16TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt16TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId16Gen.CLASS_CODE ) {
								IBusModelId16GenObj obj = (IBusModelId16GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId16GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXId16GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumDef.CLASS_CODE ) {
								IBusModelEnumDefObj obj = (IBusModelEnumDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getEnumDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXEnumDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumType.CLASS_CODE ) {
								IBusModelEnumTypeObj obj = (IBusModelEnumTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getEnumTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXEnumTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Col.CLASS_CODE ) {
								IBusModelInt16ColObj obj = (IBusModelInt16ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt16ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Def.CLASS_CODE ) {
								IBusModelInt32DefObj obj = (IBusModelInt32DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt32DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Type.CLASS_CODE ) {
								IBusModelInt32TypeObj obj = (IBusModelInt32TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt32TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId32Gen.CLASS_CODE ) {
								IBusModelId32GenObj obj = (IBusModelId32GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId32GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXId32GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Col.CLASS_CODE ) {
								IBusModelInt32ColObj obj = (IBusModelInt32ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt32ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Def.CLASS_CODE ) {
								IBusModelInt64DefObj obj = (IBusModelInt64DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Type.CLASS_CODE ) {
								IBusModelInt64TypeObj obj = (IBusModelInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId64Gen.CLASS_CODE ) {
								IBusModelId64GenObj obj = (IBusModelId64GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId64GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXId64GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Col.CLASS_CODE ) {
								IBusModelInt64ColObj obj = (IBusModelInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenDef.CLASS_CODE ) {
								IBusModelNmTokenDefObj obj = (IBusModelNmTokenDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenType.CLASS_CODE ) {
								IBusModelNmTokenTypeObj obj = (IBusModelNmTokenTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenCol.CLASS_CODE ) {
								IBusModelNmTokenColObj obj = (IBusModelNmTokenColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokenColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensDef.CLASS_CODE ) {
								IBusModelNmTokensDefObj obj = (IBusModelNmTokensDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokensDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensType.CLASS_CODE ) {
								IBusModelNmTokensTypeObj obj = (IBusModelNmTokensTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokensTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensCol.CLASS_CODE ) {
								IBusModelNmTokensColObj obj = (IBusModelNmTokensColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNmTokensColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberDef.CLASS_CODE ) {
								IBusModelNumberDefObj obj = (IBusModelNumberDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNumberDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberType.CLASS_CODE ) {
								IBusModelNumberTypeObj obj = (IBusModelNumberTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNumberTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberCol.CLASS_CODE ) {
								IBusModelNumberColObj obj = (IBusModelNumberColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXNumberColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Def.CLASS_CODE ) {
								IBusModelDbKeyHash128DefObj obj = (IBusModelDbKeyHash128DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Col.CLASS_CODE ) {
								IBusModelDbKeyHash128ColObj obj = (IBusModelDbKeyHash128ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Type.CLASS_CODE ) {
								IBusModelDbKeyHash128TypeObj obj = (IBusModelDbKeyHash128TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Gen.CLASS_CODE ) {
								IBusModelDbKeyHash128GenObj obj = (IBusModelDbKeyHash128GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash128GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Def.CLASS_CODE ) {
								IBusModelDbKeyHash160DefObj obj = (IBusModelDbKeyHash160DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Col.CLASS_CODE ) {
								IBusModelDbKeyHash160ColObj obj = (IBusModelDbKeyHash160ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Type.CLASS_CODE ) {
								IBusModelDbKeyHash160TypeObj obj = (IBusModelDbKeyHash160TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Gen.CLASS_CODE ) {
								IBusModelDbKeyHash160GenObj obj = (IBusModelDbKeyHash160GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash160GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Def.CLASS_CODE ) {
								IBusModelDbKeyHash224DefObj obj = (IBusModelDbKeyHash224DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Col.CLASS_CODE ) {
								IBusModelDbKeyHash224ColObj obj = (IBusModelDbKeyHash224ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Type.CLASS_CODE ) {
								IBusModelDbKeyHash224TypeObj obj = (IBusModelDbKeyHash224TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Gen.CLASS_CODE ) {
								IBusModelDbKeyHash224GenObj obj = (IBusModelDbKeyHash224GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash224GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Def.CLASS_CODE ) {
								IBusModelDbKeyHash256DefObj obj = (IBusModelDbKeyHash256DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Col.CLASS_CODE ) {
								IBusModelDbKeyHash256ColObj obj = (IBusModelDbKeyHash256ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Type.CLASS_CODE ) {
								IBusModelDbKeyHash256TypeObj obj = (IBusModelDbKeyHash256TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Gen.CLASS_CODE ) {
								IBusModelDbKeyHash256GenObj obj = (IBusModelDbKeyHash256GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash256GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Def.CLASS_CODE ) {
								IBusModelDbKeyHash384DefObj obj = (IBusModelDbKeyHash384DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Col.CLASS_CODE ) {
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Type.CLASS_CODE ) {
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Gen.CLASS_CODE ) {
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash384GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Def.CLASS_CODE ) {
								IBusModelDbKeyHash512DefObj obj = (IBusModelDbKeyHash512DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Col.CLASS_CODE ) {
								IBusModelDbKeyHash512ColObj obj = (IBusModelDbKeyHash512ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Type.CLASS_CODE ) {
								IBusModelDbKeyHash512TypeObj obj = (IBusModelDbKeyHash512TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Gen.CLASS_CODE ) {
								IBusModelDbKeyHash512GenObj obj = (IBusModelDbKeyHash512GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXDbKeyHash512GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringDef.CLASS_CODE ) {
								IBusModelStringDefObj obj = (IBusModelStringDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXStringDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringType.CLASS_CODE ) {
								IBusModelStringTypeObj obj = (IBusModelStringTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXStringTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringCol.CLASS_CODE ) {
								IBusModelStringColObj obj = (IBusModelStringColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXStringColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateDef.CLASS_CODE ) {
								IBusModelTZDateDefObj obj = (IBusModelTZDateDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateType.CLASS_CODE ) {
								IBusModelTZDateTypeObj obj = (IBusModelTZDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateCol.CLASS_CODE ) {
								IBusModelTZDateColObj obj = (IBusModelTZDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeDef.CLASS_CODE ) {
								IBusModelTZTimeDefObj obj = (IBusModelTZTimeDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimeDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeType.CLASS_CODE ) {
								IBusModelTZTimeTypeObj obj = (IBusModelTZTimeTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimeTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeCol.CLASS_CODE ) {
								IBusModelTZTimeColObj obj = (IBusModelTZTimeColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimeColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampDef.CLASS_CODE ) {
								IBusModelTZTimestampDefObj obj = (IBusModelTZTimestampDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimestampDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampType.CLASS_CODE ) {
								IBusModelTZTimestampTypeObj obj = (IBusModelTZTimestampTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimestampTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampCol.CLASS_CODE ) {
								IBusModelTZTimestampColObj obj = (IBusModelTZTimestampColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTZTimestampColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextDef.CLASS_CODE ) {
								IBusModelTextDefObj obj = (IBusModelTextDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTextDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextType.CLASS_CODE ) {
								IBusModelTextTypeObj obj = (IBusModelTextTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTextTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextCol.CLASS_CODE ) {
								IBusModelTextColObj obj = (IBusModelTextColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTextColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeDef.CLASS_CODE ) {
								IBusModelTimeDefObj obj = (IBusModelTimeDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimeDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeType.CLASS_CODE ) {
								IBusModelTimeTypeObj obj = (IBusModelTimeTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimeTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeCol.CLASS_CODE ) {
								IBusModelTimeColObj obj = (IBusModelTimeColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimeColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampDef.CLASS_CODE ) {
								IBusModelTimestampDefObj obj = (IBusModelTimestampDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimestampDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampType.CLASS_CODE ) {
								IBusModelTimestampTypeObj obj = (IBusModelTimestampTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimestampTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampCol.CLASS_CODE ) {
								IBusModelTimestampColObj obj = (IBusModelTimestampColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTimestampColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenDef.CLASS_CODE ) {
								IBusModelTokenDefObj obj = (IBusModelTokenDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTokenDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenType.CLASS_CODE ) {
								IBusModelTokenTypeObj obj = (IBusModelTokenTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenCol.CLASS_CODE ) {
								IBusModelTokenColObj obj = (IBusModelTokenColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTokenColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Def.CLASS_CODE ) {
								IBusModelUInt16DefObj obj = (IBusModelUInt16DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt16DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Type.CLASS_CODE ) {
								IBusModelUInt16TypeObj obj = (IBusModelUInt16TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt16TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Col.CLASS_CODE ) {
								IBusModelUInt16ColObj obj = (IBusModelUInt16ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt16ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Def.CLASS_CODE ) {
								IBusModelUInt32DefObj obj = (IBusModelUInt32DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt32DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Type.CLASS_CODE ) {
								IBusModelUInt32TypeObj obj = (IBusModelUInt32TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt32TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Col.CLASS_CODE ) {
								IBusModelUInt32ColObj obj = (IBusModelUInt32ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt32ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Def.CLASS_CODE ) {
								IBusModelUInt64DefObj obj = (IBusModelUInt64DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Type.CLASS_CODE ) {
								IBusModelUInt64TypeObj obj = (IBusModelUInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Col.CLASS_CODE ) {
								IBusModelUInt64ColObj obj = (IBusModelUInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidDef.CLASS_CODE ) {
								IBusModelUuidDefObj obj = (IBusModelUuidDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidType.CLASS_CODE ) {
								IBusModelUuidTypeObj obj = (IBusModelUuidTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidGen.CLASS_CODE ) {
								IBusModelUuidGenObj obj = (IBusModelUuidGenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidGenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidGenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidCol.CLASS_CODE ) {
								IBusModelUuidColObj obj = (IBusModelUuidColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuidColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Def.CLASS_CODE ) {
								IBusModelUuid6DefObj obj = (IBusModelUuid6DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6DefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Type.CLASS_CODE ) {
								IBusModelUuid6TypeObj obj = (IBusModelUuid6TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Gen.CLASS_CODE ) {
								IBusModelUuid6GenObj obj = (IBusModelUuid6GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Col.CLASS_CODE ) {
								IBusModelUuid6ColObj obj = (IBusModelUuid6ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXUuid6ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTableCol.CLASS_CODE ) {
								IBusModelTableColObj obj = (IBusModelTableColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTableColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelValueObj, IBusModelAtomObj, IBusModelBlobDefObj, IBusModelBlobTypeObj, IBusModelBlobColObj, IBusModelBoolDefObj, IBusModelBoolTypeObj, IBusModelBoolColObj, IBusModelDateDefObj, IBusModelDateTypeObj, IBusModelDateColObj, IBusModelDoubleDefObj, IBusModelDoubleTypeObj, IBusModelDoubleColObj, IBusModelFloatDefObj, IBusModelFloatTypeObj, IBusModelFloatColObj, IBusModelInt16DefObj, IBusModelInt16TypeObj, IBusModelId16GenObj, IBusModelEnumDefObj, IBusModelEnumTypeObj, IBusModelInt16ColObj, IBusModelInt32DefObj, IBusModelInt32TypeObj, IBusModelId32GenObj, IBusModelInt32ColObj, IBusModelInt64DefObj, IBusModelInt64TypeObj, IBusModelId64GenObj, IBusModelInt64ColObj, IBusModelNmTokenDefObj, IBusModelNmTokenTypeObj, IBusModelNmTokenColObj, IBusModelNmTokensDefObj, IBusModelNmTokensTypeObj, IBusModelNmTokensColObj, IBusModelNumberDefObj, IBusModelNumberTypeObj, IBusModelNumberColObj, IBusModelDbKeyHash128DefObj, IBusModelDbKeyHash128ColObj, IBusModelDbKeyHash128TypeObj, IBusModelDbKeyHash128GenObj, IBusModelDbKeyHash160DefObj, IBusModelDbKeyHash160ColObj, IBusModelDbKeyHash160TypeObj, IBusModelDbKeyHash160GenObj, IBusModelDbKeyHash224DefObj, IBusModelDbKeyHash224ColObj, IBusModelDbKeyHash224TypeObj, IBusModelDbKeyHash224GenObj, IBusModelDbKeyHash256DefObj, IBusModelDbKeyHash256ColObj, IBusModelDbKeyHash256TypeObj, IBusModelDbKeyHash256GenObj, IBusModelDbKeyHash384DefObj, IBusModelDbKeyHash384ColObj, IBusModelDbKeyHash384TypeObj, IBusModelDbKeyHash384GenObj, IBusModelDbKeyHash512DefObj, IBusModelDbKeyHash512ColObj, IBusModelDbKeyHash512TypeObj, IBusModelDbKeyHash512GenObj, IBusModelStringDefObj, IBusModelStringTypeObj, IBusModelStringColObj, IBusModelTZDateDefObj, IBusModelTZDateTypeObj, IBusModelTZDateColObj, IBusModelTZTimeDefObj, IBusModelTZTimeTypeObj, IBusModelTZTimeColObj, IBusModelTZTimestampDefObj, IBusModelTZTimestampTypeObj, IBusModelTZTimestampColObj, IBusModelTextDefObj, IBusModelTextTypeObj, IBusModelTextColObj, IBusModelTimeDefObj, IBusModelTimeTypeObj, IBusModelTimeColObj, IBusModelTimestampDefObj, IBusModelTimestampTypeObj, IBusModelTimestampColObj, IBusModelTokenDefObj, IBusModelTokenTypeObj, IBusModelTokenColObj, IBusModelUInt16DefObj, IBusModelUInt16TypeObj, IBusModelUInt16ColObj, IBusModelUInt32DefObj, IBusModelUInt32TypeObj, IBusModelUInt32ColObj, IBusModelUInt64DefObj, IBusModelUInt64TypeObj, IBusModelUInt64ColObj, IBusModelUuidDefObj, IBusModelUuidTypeObj, IBusModelUuidGenObj, IBusModelUuidColObj, IBusModelUuid6DefObj, IBusModelUuid6TypeObj, IBusModelUuid6GenObj, IBusModelUuid6ColObj, IBusModelTableColObj" );
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
						IBusModelValueObj selectedInstance = getJavaFXFocusAsValue();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelValue.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getValueFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXValuePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelAtom.CLASS_CODE ) {
								IBusModelAtomObj obj = (IBusModelAtomObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getAtomFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXAtomPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobDef.CLASS_CODE ) {
								IBusModelBlobDefObj obj = (IBusModelBlobDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXBlobDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobType.CLASS_CODE ) {
								IBusModelBlobTypeObj obj = (IBusModelBlobTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXBlobTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobCol.CLASS_CODE ) {
								IBusModelBlobColObj obj = (IBusModelBlobColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBlobColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXBlobColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolDef.CLASS_CODE ) {
								IBusModelBoolDefObj obj = (IBusModelBoolDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXBoolDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolType.CLASS_CODE ) {
								IBusModelBoolTypeObj obj = (IBusModelBoolTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXBoolTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolCol.CLASS_CODE ) {
								IBusModelBoolColObj obj = (IBusModelBoolColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXBoolColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateDef.CLASS_CODE ) {
								IBusModelDateDefObj obj = (IBusModelDateDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateType.CLASS_CODE ) {
								IBusModelDateTypeObj obj = (IBusModelDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateCol.CLASS_CODE ) {
								IBusModelDateColObj obj = (IBusModelDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleDef.CLASS_CODE ) {
								IBusModelDoubleDefObj obj = (IBusModelDoubleDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDoubleDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleType.CLASS_CODE ) {
								IBusModelDoubleTypeObj obj = (IBusModelDoubleTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDoubleTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleCol.CLASS_CODE ) {
								IBusModelDoubleColObj obj = (IBusModelDoubleColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDoubleColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDoubleColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatDef.CLASS_CODE ) {
								IBusModelFloatDefObj obj = (IBusModelFloatDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXFloatDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatType.CLASS_CODE ) {
								IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXFloatTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
								IBusModelFloatColObj obj = (IBusModelFloatColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getFloatColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXFloatColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Def.CLASS_CODE ) {
								IBusModelInt16DefObj obj = (IBusModelInt16DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt16DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Type.CLASS_CODE ) {
								IBusModelInt16TypeObj obj = (IBusModelInt16TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt16TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId16Gen.CLASS_CODE ) {
								IBusModelId16GenObj obj = (IBusModelId16GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId16GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXId16GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumDef.CLASS_CODE ) {
								IBusModelEnumDefObj obj = (IBusModelEnumDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getEnumDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXEnumDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumType.CLASS_CODE ) {
								IBusModelEnumTypeObj obj = (IBusModelEnumTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getEnumTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXEnumTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Col.CLASS_CODE ) {
								IBusModelInt16ColObj obj = (IBusModelInt16ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt16ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt16ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Def.CLASS_CODE ) {
								IBusModelInt32DefObj obj = (IBusModelInt32DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt32DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Type.CLASS_CODE ) {
								IBusModelInt32TypeObj obj = (IBusModelInt32TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt32TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId32Gen.CLASS_CODE ) {
								IBusModelId32GenObj obj = (IBusModelId32GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId32GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXId32GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Col.CLASS_CODE ) {
								IBusModelInt32ColObj obj = (IBusModelInt32ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt32ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt32ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Def.CLASS_CODE ) {
								IBusModelInt64DefObj obj = (IBusModelInt64DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Type.CLASS_CODE ) {
								IBusModelInt64TypeObj obj = (IBusModelInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId64Gen.CLASS_CODE ) {
								IBusModelId64GenObj obj = (IBusModelId64GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId64GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXId64GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Col.CLASS_CODE ) {
								IBusModelInt64ColObj obj = (IBusModelInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getInt64ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenDef.CLASS_CODE ) {
								IBusModelNmTokenDefObj obj = (IBusModelNmTokenDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNmTokenDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenType.CLASS_CODE ) {
								IBusModelNmTokenTypeObj obj = (IBusModelNmTokenTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNmTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenCol.CLASS_CODE ) {
								IBusModelNmTokenColObj obj = (IBusModelNmTokenColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokenColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNmTokenColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensDef.CLASS_CODE ) {
								IBusModelNmTokensDefObj obj = (IBusModelNmTokensDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNmTokensDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensType.CLASS_CODE ) {
								IBusModelNmTokensTypeObj obj = (IBusModelNmTokensTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNmTokensTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensCol.CLASS_CODE ) {
								IBusModelNmTokensColObj obj = (IBusModelNmTokensColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNmTokensColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNmTokensColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberDef.CLASS_CODE ) {
								IBusModelNumberDefObj obj = (IBusModelNumberDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNumberDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberType.CLASS_CODE ) {
								IBusModelNumberTypeObj obj = (IBusModelNumberTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNumberTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberCol.CLASS_CODE ) {
								IBusModelNumberColObj obj = (IBusModelNumberColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getNumberColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXNumberColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Def.CLASS_CODE ) {
								IBusModelDbKeyHash128DefObj obj = (IBusModelDbKeyHash128DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash128DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Col.CLASS_CODE ) {
								IBusModelDbKeyHash128ColObj obj = (IBusModelDbKeyHash128ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash128ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Type.CLASS_CODE ) {
								IBusModelDbKeyHash128TypeObj obj = (IBusModelDbKeyHash128TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash128TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Gen.CLASS_CODE ) {
								IBusModelDbKeyHash128GenObj obj = (IBusModelDbKeyHash128GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash128GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash128GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Def.CLASS_CODE ) {
								IBusModelDbKeyHash160DefObj obj = (IBusModelDbKeyHash160DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash160DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Col.CLASS_CODE ) {
								IBusModelDbKeyHash160ColObj obj = (IBusModelDbKeyHash160ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash160ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Type.CLASS_CODE ) {
								IBusModelDbKeyHash160TypeObj obj = (IBusModelDbKeyHash160TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash160TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Gen.CLASS_CODE ) {
								IBusModelDbKeyHash160GenObj obj = (IBusModelDbKeyHash160GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash160GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash160GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Def.CLASS_CODE ) {
								IBusModelDbKeyHash224DefObj obj = (IBusModelDbKeyHash224DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash224DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Col.CLASS_CODE ) {
								IBusModelDbKeyHash224ColObj obj = (IBusModelDbKeyHash224ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash224ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Type.CLASS_CODE ) {
								IBusModelDbKeyHash224TypeObj obj = (IBusModelDbKeyHash224TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash224TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Gen.CLASS_CODE ) {
								IBusModelDbKeyHash224GenObj obj = (IBusModelDbKeyHash224GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash224GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash224GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Def.CLASS_CODE ) {
								IBusModelDbKeyHash256DefObj obj = (IBusModelDbKeyHash256DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash256DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Col.CLASS_CODE ) {
								IBusModelDbKeyHash256ColObj obj = (IBusModelDbKeyHash256ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash256ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Type.CLASS_CODE ) {
								IBusModelDbKeyHash256TypeObj obj = (IBusModelDbKeyHash256TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash256TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Gen.CLASS_CODE ) {
								IBusModelDbKeyHash256GenObj obj = (IBusModelDbKeyHash256GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash256GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash256GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Def.CLASS_CODE ) {
								IBusModelDbKeyHash384DefObj obj = (IBusModelDbKeyHash384DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Col.CLASS_CODE ) {
								IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Type.CLASS_CODE ) {
								IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Gen.CLASS_CODE ) {
								IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash384GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash384GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Def.CLASS_CODE ) {
								IBusModelDbKeyHash512DefObj obj = (IBusModelDbKeyHash512DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash512DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Col.CLASS_CODE ) {
								IBusModelDbKeyHash512ColObj obj = (IBusModelDbKeyHash512ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash512ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Type.CLASS_CODE ) {
								IBusModelDbKeyHash512TypeObj obj = (IBusModelDbKeyHash512TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash512TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Gen.CLASS_CODE ) {
								IBusModelDbKeyHash512GenObj obj = (IBusModelDbKeyHash512GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDbKeyHash512GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXDbKeyHash512GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringDef.CLASS_CODE ) {
								IBusModelStringDefObj obj = (IBusModelStringDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXStringDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringType.CLASS_CODE ) {
								IBusModelStringTypeObj obj = (IBusModelStringTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXStringTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringCol.CLASS_CODE ) {
								IBusModelStringColObj obj = (IBusModelStringColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getStringColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXStringColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateDef.CLASS_CODE ) {
								IBusModelTZDateDefObj obj = (IBusModelTZDateDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateType.CLASS_CODE ) {
								IBusModelTZDateTypeObj obj = (IBusModelTZDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateCol.CLASS_CODE ) {
								IBusModelTZDateColObj obj = (IBusModelTZDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZDateColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeDef.CLASS_CODE ) {
								IBusModelTZTimeDefObj obj = (IBusModelTZTimeDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZTimeDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeType.CLASS_CODE ) {
								IBusModelTZTimeTypeObj obj = (IBusModelTZTimeTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZTimeTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeCol.CLASS_CODE ) {
								IBusModelTZTimeColObj obj = (IBusModelTZTimeColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimeColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZTimeColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampDef.CLASS_CODE ) {
								IBusModelTZTimestampDefObj obj = (IBusModelTZTimestampDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZTimestampDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampType.CLASS_CODE ) {
								IBusModelTZTimestampTypeObj obj = (IBusModelTZTimestampTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZTimestampTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampCol.CLASS_CODE ) {
								IBusModelTZTimestampColObj obj = (IBusModelTZTimestampColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTZTimestampColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTZTimestampColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextDef.CLASS_CODE ) {
								IBusModelTextDefObj obj = (IBusModelTextDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTextDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextType.CLASS_CODE ) {
								IBusModelTextTypeObj obj = (IBusModelTextTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTextTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextCol.CLASS_CODE ) {
								IBusModelTextColObj obj = (IBusModelTextColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTextColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTextColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeDef.CLASS_CODE ) {
								IBusModelTimeDefObj obj = (IBusModelTimeDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTimeDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeType.CLASS_CODE ) {
								IBusModelTimeTypeObj obj = (IBusModelTimeTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTimeTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeCol.CLASS_CODE ) {
								IBusModelTimeColObj obj = (IBusModelTimeColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimeColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTimeColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampDef.CLASS_CODE ) {
								IBusModelTimestampDefObj obj = (IBusModelTimestampDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTimestampDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampType.CLASS_CODE ) {
								IBusModelTimestampTypeObj obj = (IBusModelTimestampTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTimestampTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampCol.CLASS_CODE ) {
								IBusModelTimestampColObj obj = (IBusModelTimestampColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTimestampColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTimestampColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenDef.CLASS_CODE ) {
								IBusModelTokenDefObj obj = (IBusModelTokenDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTokenDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenType.CLASS_CODE ) {
								IBusModelTokenTypeObj obj = (IBusModelTokenTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTokenTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenCol.CLASS_CODE ) {
								IBusModelTokenColObj obj = (IBusModelTokenColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTokenColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTokenColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Def.CLASS_CODE ) {
								IBusModelUInt16DefObj obj = (IBusModelUInt16DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt16DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Type.CLASS_CODE ) {
								IBusModelUInt16TypeObj obj = (IBusModelUInt16TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt16TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Col.CLASS_CODE ) {
								IBusModelUInt16ColObj obj = (IBusModelUInt16ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt16ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt16ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Def.CLASS_CODE ) {
								IBusModelUInt32DefObj obj = (IBusModelUInt32DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt32DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Type.CLASS_CODE ) {
								IBusModelUInt32TypeObj obj = (IBusModelUInt32TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt32TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Col.CLASS_CODE ) {
								IBusModelUInt32ColObj obj = (IBusModelUInt32ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt32ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt32ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Def.CLASS_CODE ) {
								IBusModelUInt64DefObj obj = (IBusModelUInt64DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Type.CLASS_CODE ) {
								IBusModelUInt64TypeObj obj = (IBusModelUInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Col.CLASS_CODE ) {
								IBusModelUInt64ColObj obj = (IBusModelUInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidDef.CLASS_CODE ) {
								IBusModelUuidDefObj obj = (IBusModelUuidDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuidDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidType.CLASS_CODE ) {
								IBusModelUuidTypeObj obj = (IBusModelUuidTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuidTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidGen.CLASS_CODE ) {
								IBusModelUuidGenObj obj = (IBusModelUuidGenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidGenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuidGenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidCol.CLASS_CODE ) {
								IBusModelUuidColObj obj = (IBusModelUuidColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuidColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuidColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Def.CLASS_CODE ) {
								IBusModelUuid6DefObj obj = (IBusModelUuid6DefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6DefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuid6DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Type.CLASS_CODE ) {
								IBusModelUuid6TypeObj obj = (IBusModelUuid6TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuid6TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Gen.CLASS_CODE ) {
								IBusModelUuid6GenObj obj = (IBusModelUuid6GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuid6GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Col.CLASS_CODE ) {
								IBusModelUuid6ColObj obj = (IBusModelUuid6ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUuid6ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXUuid6ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTableCol.CLASS_CODE ) {
								IBusModelTableColObj obj = (IBusModelTableColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((IBusModelJavaFXTableColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelValueObj, IBusModelAtomObj, IBusModelBlobDefObj, IBusModelBlobTypeObj, IBusModelBlobColObj, IBusModelBoolDefObj, IBusModelBoolTypeObj, IBusModelBoolColObj, IBusModelDateDefObj, IBusModelDateTypeObj, IBusModelDateColObj, IBusModelDoubleDefObj, IBusModelDoubleTypeObj, IBusModelDoubleColObj, IBusModelFloatDefObj, IBusModelFloatTypeObj, IBusModelFloatColObj, IBusModelInt16DefObj, IBusModelInt16TypeObj, IBusModelId16GenObj, IBusModelEnumDefObj, IBusModelEnumTypeObj, IBusModelInt16ColObj, IBusModelInt32DefObj, IBusModelInt32TypeObj, IBusModelId32GenObj, IBusModelInt32ColObj, IBusModelInt64DefObj, IBusModelInt64TypeObj, IBusModelId64GenObj, IBusModelInt64ColObj, IBusModelNmTokenDefObj, IBusModelNmTokenTypeObj, IBusModelNmTokenColObj, IBusModelNmTokensDefObj, IBusModelNmTokensTypeObj, IBusModelNmTokensColObj, IBusModelNumberDefObj, IBusModelNumberTypeObj, IBusModelNumberColObj, IBusModelDbKeyHash128DefObj, IBusModelDbKeyHash128ColObj, IBusModelDbKeyHash128TypeObj, IBusModelDbKeyHash128GenObj, IBusModelDbKeyHash160DefObj, IBusModelDbKeyHash160ColObj, IBusModelDbKeyHash160TypeObj, IBusModelDbKeyHash160GenObj, IBusModelDbKeyHash224DefObj, IBusModelDbKeyHash224ColObj, IBusModelDbKeyHash224TypeObj, IBusModelDbKeyHash224GenObj, IBusModelDbKeyHash256DefObj, IBusModelDbKeyHash256ColObj, IBusModelDbKeyHash256TypeObj, IBusModelDbKeyHash256GenObj, IBusModelDbKeyHash384DefObj, IBusModelDbKeyHash384ColObj, IBusModelDbKeyHash384TypeObj, IBusModelDbKeyHash384GenObj, IBusModelDbKeyHash512DefObj, IBusModelDbKeyHash512ColObj, IBusModelDbKeyHash512TypeObj, IBusModelDbKeyHash512GenObj, IBusModelStringDefObj, IBusModelStringTypeObj, IBusModelStringColObj, IBusModelTZDateDefObj, IBusModelTZDateTypeObj, IBusModelTZDateColObj, IBusModelTZTimeDefObj, IBusModelTZTimeTypeObj, IBusModelTZTimeColObj, IBusModelTZTimestampDefObj, IBusModelTZTimestampTypeObj, IBusModelTZTimestampColObj, IBusModelTextDefObj, IBusModelTextTypeObj, IBusModelTextColObj, IBusModelTimeDefObj, IBusModelTimeTypeObj, IBusModelTimeColObj, IBusModelTimestampDefObj, IBusModelTimestampTypeObj, IBusModelTimestampColObj, IBusModelTokenDefObj, IBusModelTokenTypeObj, IBusModelTokenColObj, IBusModelUInt16DefObj, IBusModelUInt16TypeObj, IBusModelUInt16ColObj, IBusModelUInt32DefObj, IBusModelUInt32TypeObj, IBusModelUInt32ColObj, IBusModelUInt64DefObj, IBusModelUInt64TypeObj, IBusModelUInt64ColObj, IBusModelUuidDefObj, IBusModelUuidTypeObj, IBusModelUuidGenObj, IBusModelUuidColObj, IBusModelUuid6DefObj, IBusModelUuid6TypeObj, IBusModelUuid6GenObj, IBusModelUuid6ColObj, IBusModelTableColObj" );
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

	public IBusModelScopeObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IBusModelScopeObj value ) {
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
		IBusModelValueObj selectedObj = getJavaFXFocusAsValue();
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

		boolean enableMoveUp = ( ! inEditState )
			&& ( ! inAddMode )
			&& ( selectedObj != null )
			&& ( null != selectedObj.getOptionalLookupPrev() );
		boolean enableMoveDown = ( ! inEditState )
			&& ( ! inAddMode )
			&& ( selectedObj != null )
			&& ( null != selectedObj.getOptionalLookupNext() );
		if( buttonMoveUpSelected != null ) {
			buttonMoveUpSelected.setDisable( ! enableMoveUp );
		}
		if( buttonMoveDownSelected != null ) {
			buttonMoveDownSelected.setDisable( ! enableMoveDown );
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

		if( buttonAdd != null ) {
			buttonAdd.setDisable( ! allowAdds );
		}
	}
}
