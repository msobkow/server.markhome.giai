// Description: Java 25 JavaFX List of Obj Pane implementation for TableCol.

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
 *	BusModelJavaFXTableColListPane JavaFX List of Obj Pane implementation
 *	for TableCol.
 */
public class BusModelJavaFXTableColListPane
extends CFBorderPane
implements IBusModelJavaFXTableColPaneList
{
	public static String S_FormName = "List TableCol";
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelTableColObj> javafxDataCollection = null;
	protected ObservableList<IBusModelTableColObj> observableListOfTableCol = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddTableCol = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IBusModelTableColObj> dataTable = null;
	protected TableColumn<IBusModelTableColObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnName = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnShortName = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnLabel = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnShortDescription = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnDescription = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<IBusModelTableColObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<IBusModelTableColObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<IBusModelTableColObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnDbName = null;
	protected TableColumn<IBusModelTableColObj, String> tableColumnXmlElementName = null;
	protected TableColumn<IBusModelTableColObj, IBusModelValueObj> tableColumnParentDataType = null;
	protected TableColumn<IBusModelTableColObj, IBusModelSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public BusModelJavaFXTableColListPane( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelTableObj argContainer,
		IBusModelTableColObj argFocus,
		Collection<IBusModelTableColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
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
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		javafxContainer = argContainer;
		javafxRefreshCallback = refreshCallback;
		javafxSortByChain = sortByChain;
		setJavaFXDataCollection( argDataCollection );
		dataTable = new TableView<IBusModelTableColObj>();
		tableColumnId = new TableColumn<IBusModelTableColObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IBusModelTableColObj, ICFKeyHash256> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,ICFKeyHash256>,TableCell<IBusModelTableColObj,ICFKeyHash256>>() {
			@Override public TableCell<IBusModelTableColObj,ICFKeyHash256> call(
				TableColumn<IBusModelTableColObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IBusModelTableColObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<IBusModelTableColObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<IBusModelTableColObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<IBusModelTableColObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<IBusModelTableColObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<IBusModelTableColObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<IBusModelTableColObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelTableColObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,Boolean>,TableCell<IBusModelTableColObj,Boolean>>() {
			@Override public TableCell<IBusModelTableColObj,Boolean> call(
				TableColumn<IBusModelTableColObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<IBusModelTableColObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelTableColObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,Boolean>,TableCell<IBusModelTableColObj,Boolean>>() {
			@Override public TableCell<IBusModelTableColObj,Boolean> call(
				TableColumn<IBusModelTableColObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<IBusModelTableColObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<IBusModelTableColObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,Boolean>,TableCell<IBusModelTableColObj,Boolean>>() {
			@Override public TableCell<IBusModelTableColObj,Boolean> call(
				TableColumn<IBusModelTableColObj,Boolean> arg)
			{
				return new CFBoolTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<IBusModelTableColObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
				IBusModelTableColObj obj = p.getValue();
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnXmlElementName = new TableColumn<IBusModelTableColObj,String>( "XmlElementName" );
		tableColumnXmlElementName.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IBusModelTableColObj, String> p ) {
				IBusModelTableColObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalXmlElementName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnXmlElementName.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,String>,TableCell<IBusModelTableColObj,String>>() {
			@Override public TableCell<IBusModelTableColObj,String> call(
				TableColumn<IBusModelTableColObj,String> arg)
			{
				return new CFStringTableCell<IBusModelTableColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnXmlElementName );
		tableColumnParentDataType = new TableColumn<IBusModelTableColObj, IBusModelValueObj>( "Column Data Type" );
		tableColumnParentDataType.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,IBusModelValueObj>,ObservableValue<IBusModelValueObj> >() {
			public ObservableValue<IBusModelValueObj> call( CellDataFeatures<IBusModelTableColObj, IBusModelValueObj> p ) {
				IBusModelTableColObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					IBusModelValueObj ref = obj.getRequiredParentDataType();
					ReadOnlyObjectWrapper<IBusModelValueObj> observable = new ReadOnlyObjectWrapper<IBusModelValueObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnParentDataType.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,IBusModelValueObj>,TableCell<IBusModelTableColObj,IBusModelValueObj>>() {
			@Override public TableCell<IBusModelTableColObj,IBusModelValueObj> call(
				TableColumn<IBusModelTableColObj,IBusModelValueObj> arg)
			{
				return new CFReferenceTableCell<IBusModelTableColObj,IBusModelValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnParentDataType );
		tableColumnLookupDefSchema = new TableColumn<IBusModelTableColObj, IBusModelSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<IBusModelTableColObj,IBusModelSchemaDefObj>,ObservableValue<IBusModelSchemaDefObj> >() {
			public ObservableValue<IBusModelSchemaDefObj> call( CellDataFeatures<IBusModelTableColObj, IBusModelSchemaDefObj> p ) {
				IBusModelTableColObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<IBusModelTableColObj,IBusModelSchemaDefObj>,TableCell<IBusModelTableColObj,IBusModelSchemaDefObj>>() {
			@Override public TableCell<IBusModelTableColObj,IBusModelSchemaDefObj> call(
				TableColumn<IBusModelTableColObj,IBusModelSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<IBusModelTableColObj,IBusModelSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IBusModelTableColObj>() {
				@Override public void changed( ObservableValue<? extends IBusModelTableColObj> observable,
					IBusModelTableColObj oldValue,
					IBusModelTableColObj newValue )
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
		if( observableListOfTableCol != null ) {
			dataTable.setItems( observableListOfTableCol );
		}
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

	public IBusModelJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelTableColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelTableColObj" );
		}
		adjustListButtons();
	}

	public IBusModelTableColObj getJavaFXFocusAsTableCol() {
		return( (IBusModelTableColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsTableCol( IBusModelTableColObj value ) {
		setJavaFXFocus( value );
	}

	public class TableColByQualNameComparator
	implements Comparator<IBusModelTableColObj>
	{
		public TableColByQualNameComparator() {
		}

		public int compare( IBusModelTableColObj lhs, IBusModelTableColObj rhs ) {
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

	protected TableColByQualNameComparator compareTableColByQualName = new TableColByQualNameComparator();

	public Collection<IBusModelTableColObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IBusModelTableColObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfTableCol = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IBusModelTableColObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfTableCol.add( iter.next() );
				}
				observableListOfTableCol.sort( compareTableColByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfTableCol );
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
			buttonAddTableCol = new CFButton();
			buttonAddTableCol.setMinWidth( 200 );
			buttonAddTableCol.setText( "Add TableCol" );
			buttonAddTableCol.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						IBusModelTableColObj obj = (IBusModelTableColObj)schemaObj.getTableColTableObj().newInstance();
						IBusModelTableColEditObj edit = (IBusModelTableColEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
								IBusModelTableObj container = (IBusModelTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
						CFBorderPane frame = javafxSchema.getTableColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IBusModelJavaFXTableColPaneCommon jpanelCommon = (IBusModelJavaFXTableColPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddTableCol );
			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelTableColObj selectedInstance = getJavaFXFocusAsTableCol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTableCol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getTableColFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTableColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelTableColObj" );
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
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelTableColObj selectedInstance = getJavaFXFocusAsTableCol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTableCol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getTableColFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IBusModelJavaFXTableColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelTableColObj" );
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
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IBusModelTableColObj selectedInstance = getJavaFXFocusAsTableCol();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTableCol.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getTableColFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IBusModelJavaFXTableColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IBusModelTableColObj" );
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
		IBusModelTableColObj selectedObj = getJavaFXFocusAsTableCol();
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
		if( buttonAddTableCol != null ) {
			buttonAddTableCol.setDisable( ! allowAdds );
		}

	}
}
