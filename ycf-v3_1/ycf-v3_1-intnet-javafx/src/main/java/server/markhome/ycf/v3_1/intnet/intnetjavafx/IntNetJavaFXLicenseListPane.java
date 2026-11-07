// Description: Java 25 JavaFX List of Obj Pane implementation for License.

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
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.secure.securejavafx.*;

/**
 *	IntNetJavaFXLicenseListPane JavaFX List of Obj Pane implementation
 *	for License.
 */
public class IntNetJavaFXLicenseListPane
extends CFBorderPane
implements IIntNetJavaFXLicensePaneList
{
	public static String S_FormName = "List License";
	protected IIntNetJavaFXSchema javafxSchema = null;
	protected Collection<IIntNetLicenseObj> javafxDataCollection = null;
	protected ObservableList<IIntNetLicenseObj> observableListOfLicense = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddLicense = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<IIntNetLicenseObj> dataTable = null;
	protected TableColumn<IIntNetLicenseObj, ICFKeyHash256> tableColumnId = null;
	protected TableColumn<IIntNetLicenseObj, String> tableColumnName = null;
	protected TableColumn<IIntNetLicenseObj, String> tableColumnDescription = null;
	protected TableColumn<IIntNetLicenseObj, String> tableColumnEmbeddedText = null;
	protected TableColumn<IIntNetLicenseObj, String> tableColumnFullText = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected IIntNetTopDomainObj javafxContainer = null;
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


	public IntNetJavaFXLicenseListPane( ICFFormManager formManager,
		IIntNetJavaFXSchema argSchema,
		IIntNetTopDomainObj argContainer,
		IIntNetLicenseObj argFocus,
		Collection<IIntNetLicenseObj> argDataCollection,
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
		dataTable = new TableView<IIntNetLicenseObj>();
		tableColumnId = new TableColumn<IIntNetLicenseObj,ICFKeyHash256>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<IIntNetLicenseObj,ICFKeyHash256>,ObservableValue<ICFKeyHash256> >() {
			public ObservableValue<ICFKeyHash256> call( CellDataFeatures<IIntNetLicenseObj, ICFKeyHash256> p ) {
				IIntNetLicenseObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<IIntNetLicenseObj,ICFKeyHash256>,TableCell<IIntNetLicenseObj,ICFKeyHash256>>() {
			@Override public TableCell<IIntNetLicenseObj,ICFKeyHash256> call(
				TableColumn<IIntNetLicenseObj,ICFKeyHash256> arg)
			{
				return new CFDbKeyHash256TableCell<IIntNetLicenseObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<IIntNetLicenseObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<IIntNetLicenseObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetLicenseObj, String> p ) {
				IIntNetLicenseObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<IIntNetLicenseObj,String>,TableCell<IIntNetLicenseObj,String>>() {
			@Override public TableCell<IIntNetLicenseObj,String> call(
				TableColumn<IIntNetLicenseObj,String> arg)
			{
				return new CFStringTableCell<IIntNetLicenseObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnDescription = new TableColumn<IIntNetLicenseObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<IIntNetLicenseObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetLicenseObj, String> p ) {
				IIntNetLicenseObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<IIntNetLicenseObj,String>,TableCell<IIntNetLicenseObj,String>>() {
			@Override public TableCell<IIntNetLicenseObj,String> call(
				TableColumn<IIntNetLicenseObj,String> arg)
			{
				return new CFStringTableCell<IIntNetLicenseObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnEmbeddedText = new TableColumn<IIntNetLicenseObj,String>( "EmbeddedText" );
		tableColumnEmbeddedText.setCellValueFactory( new Callback<CellDataFeatures<IIntNetLicenseObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetLicenseObj, String> p ) {
				IIntNetLicenseObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalEmbeddedText();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnEmbeddedText.setCellFactory( new Callback<TableColumn<IIntNetLicenseObj,String>,TableCell<IIntNetLicenseObj,String>>() {
			@Override public TableCell<IIntNetLicenseObj,String> call(
				TableColumn<IIntNetLicenseObj,String> arg)
			{
				return new CFTextTableCell<IIntNetLicenseObj>();
			}
		});
		dataTable.getColumns().add( tableColumnEmbeddedText );
		tableColumnFullText = new TableColumn<IIntNetLicenseObj,String>( "FullText" );
		tableColumnFullText.setCellValueFactory( new Callback<CellDataFeatures<IIntNetLicenseObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<IIntNetLicenseObj, String> p ) {
				IIntNetLicenseObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalFullText();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnFullText.setCellFactory( new Callback<TableColumn<IIntNetLicenseObj,String>,TableCell<IIntNetLicenseObj,String>>() {
			@Override public TableCell<IIntNetLicenseObj,String> call(
				TableColumn<IIntNetLicenseObj,String> arg)
			{
				return new CFTextTableCell<IIntNetLicenseObj>();
			}
		});
		dataTable.getColumns().add( tableColumnFullText );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<IIntNetLicenseObj>() {
				@Override public void changed( ObservableValue<? extends IIntNetLicenseObj> observable,
					IIntNetLicenseObj oldValue,
					IIntNetLicenseObj newValue )
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
		if( observableListOfLicense != null ) {
			dataTable.setItems( observableListOfLicense );
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

	public IIntNetJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IIntNetLicenseObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IIntNetLicenseObj" );
		}
		adjustListButtons();
	}

	public IIntNetLicenseObj getJavaFXFocusAsLicense() {
		return( (IIntNetLicenseObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsLicense( IIntNetLicenseObj value ) {
		setJavaFXFocus( value );
	}

	public class LicenseByQualNameComparator
	implements Comparator<IIntNetLicenseObj>
	{
		public LicenseByQualNameComparator() {
		}

		public int compare( IIntNetLicenseObj lhs, IIntNetLicenseObj rhs ) {
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

	protected LicenseByQualNameComparator compareLicenseByQualName = new LicenseByQualNameComparator();

	public Collection<IIntNetLicenseObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<IIntNetLicenseObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfLicense = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<IIntNetLicenseObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfLicense.add( iter.next() );
				}
				observableListOfLicense.sort( compareLicenseByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfLicense );
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
			buttonAddLicense = new CFButton();
			buttonAddLicense.setMinWidth( 200 );
			buttonAddLicense.setText( "Add License" );
			buttonAddLicense.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
						IIntNetLicenseObj obj = (IIntNetLicenseObj)schemaObj.getLicenseTableObj().newInstance();
						IIntNetLicenseEditObj edit = (IIntNetLicenseEditObj)( obj.beginEdit() );
						if( edit == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"edit" );
						}
								ISecureTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								IIntNetTopDomainObj container = (IIntNetTopDomainObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTopDomain( container );
						CFBorderPane frame = javafxSchema.getLicenseFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						IIntNetJavaFXLicensePaneCommon jpanelCommon = (IIntNetJavaFXLicensePaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddLicense );
			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
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
						IIntNetLicenseObj selectedInstance = getJavaFXFocusAsLicense();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IIntNetSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("IntNet") && backingClassCode == IIntNetLicense.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getLicenseFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IIntNetJavaFXLicensePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IIntNetLicenseObj" );
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
						IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IIntNetLicenseObj selectedInstance = getJavaFXFocusAsLicense();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IIntNetSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("IntNet") && backingClassCode == IIntNetLicense.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getLicenseFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((IIntNetJavaFXLicensePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IIntNetLicenseObj" );
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
						IIntNetSchemaObj schemaObj = (IIntNetSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						IIntNetLicenseObj selectedInstance = getJavaFXFocusAsLicense();
						if( selectedInstance != null ) {
							int classCode = selectedInstance.getClassCode();
							ISecureSchema.ClassMapEntry entry = IIntNetSchema.getClassMapByRuntimeClassCode(classCode);
							int backingClassCode = entry.getBackingClassCode();
							if( entry.getSchemaName().equals("IntNet") && backingClassCode == IIntNetLicense.CLASS_CODE ) {
								CFBorderPane frame = javafxSchema.getLicenseFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((IIntNetJavaFXLicensePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"IIntNetLicenseObj" );
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

	public IIntNetTopDomainObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( IIntNetTopDomainObj value ) {
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
		IIntNetLicenseObj selectedObj = getJavaFXFocusAsLicense();
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
		if( buttonAddLicense != null ) {
			buttonAddLicense.setDisable( ! allowAdds );
		}

	}
}
