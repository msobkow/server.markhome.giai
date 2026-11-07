// Description: Java 25 JavaFX Element TabPane implementation for SchemaDef.

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
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
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

/**
 *	BusModelJavaFXSchemaDefEltTabPane JavaFX Element TabPane implementation
 *	for SchemaDef.
 */
public class BusModelJavaFXSchemaDefEltTabPane
extends CFTabPane
implements IBusModelJavaFXSchemaDefPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsTablesList = "Optional Components Table Definitions";
	protected CFTab tabComponentsTables = null;
	public final String LABEL_TabComponentsTypesList = "Optional Components Type Definitions";
	protected CFTab tabComponentsTypes = null;
	public final String LABEL_TabComponentsSchemaRefsList = "Optional Components Schema References";
	protected CFTab tabComponentsSchemaRefs = null;
	public final String LABEL_TabComponentsTweaksList = "Optional Components Schema Tweaks";
	protected CFTab tabComponentsTweaks = null;
	public final String LABEL_TabComponentsRolesList = "Optional Components Schema Roles";
	protected CFTab tabComponentsRoles = null;
	protected CFBorderPane tabViewComponentsTablesListPane = null;
	protected CFBorderPane tabViewComponentsTypesListPane = null;
	protected CFBorderPane tabViewComponentsSchemaRefsListPane = null;
	protected CFBorderPane tabViewComponentsTweaksListPane = null;
	protected CFBorderPane tabViewComponentsRolesListPane = null;

	public BusModelJavaFXSchemaDefEltTabPane( ICFFormManager formManager, IBusModelJavaFXSchema argSchema, IBusModelSchemaDefObj argFocus ) {
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
		setJavaFXFocusAsSchemaDef( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsTables = new CFTab();
		tabComponentsTables.setText( LABEL_TabComponentsTablesList );
		tabComponentsTables.setContent( getTabViewComponentsTablesListPane() );
		getTabs().add( tabComponentsTables );
		tabComponentsTypes = new CFTab();
		tabComponentsTypes.setText( LABEL_TabComponentsTypesList );
		tabComponentsTypes.setContent( getTabViewComponentsTypesListPane() );
		getTabs().add( tabComponentsTypes );
		tabComponentsSchemaRefs = new CFTab();
		tabComponentsSchemaRefs.setText( LABEL_TabComponentsSchemaRefsList );
		tabComponentsSchemaRefs.setContent( getTabViewComponentsSchemaRefsListPane() );
		getTabs().add( tabComponentsSchemaRefs );
		tabComponentsTweaks = new CFTab();
		tabComponentsTweaks.setText( LABEL_TabComponentsTweaksList );
		tabComponentsTweaks.setContent( getTabViewComponentsTweaksListPane() );
		getTabs().add( tabComponentsTweaks );
		tabComponentsRoles = new CFTab();
		tabComponentsRoles.setText( LABEL_TabComponentsRolesList );
		tabComponentsRoles.setContent( getTabViewComponentsRolesListPane() );
		getTabs().add( tabComponentsRoles );
		javafxIsInitializing = false;
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

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelSchemaDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelSchemaDefObj" );
		}
	}

	public void setJavaFXFocusAsSchemaDef( IBusModelSchemaDefObj value ) {
		setJavaFXFocus( value );
	}

	public IBusModelSchemaDefObj getJavaFXFocusAsSchemaDef() {
		return( (IBusModelSchemaDefObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsTablesList
	implements ICFRefreshCallback
	{
		public RefreshComponentsTablesList() {
		}

		public void refreshMe() {
			Collection<IBusModelTableObj> dataCollection;
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTables( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsTablesListPane();
			IBusModelJavaFXTablePaneList jpList = (IBusModelJavaFXTablePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsTablesListPane() {
		if( tabViewComponentsTablesListPane == null ) {
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			IBusModelSchemaDefObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelSchemaDefObj ) ) {
				javafxContainer = (IBusModelSchemaDefObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsTablesListPane = javafxSchema.getTableFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsTablesList(), false );
		}
		return( tabViewComponentsTablesListPane );
	}

	protected class RefreshComponentsTypesList
	implements ICFRefreshCallback
	{
		public RefreshComponentsTypesList() {
		}

		public void refreshMe() {
			Collection<IBusModelValueObj> dataCollection;
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTypes( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsTypesListPane();
			IBusModelJavaFXValuePaneList jpList = (IBusModelJavaFXValuePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsTypesListPane() {
		if( tabViewComponentsTypesListPane == null ) {
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			IBusModelScopeObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelScopeObj ) ) {
				javafxContainer = (IBusModelScopeObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsTypesListPane = javafxSchema.getValueFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsTypesList(), true );
		}
		return( tabViewComponentsTypesListPane );
	}

	protected class RefreshComponentsSchemaRefsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSchemaRefsList() {
		}

		public void refreshMe() {
			Collection<IBusModelSchemaRefObj> dataCollection;
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSchemaRefs( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSchemaRefsListPane();
			IBusModelJavaFXSchemaRefPaneList jpList = (IBusModelJavaFXSchemaRefPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSchemaRefsListPane() {
		if( tabViewComponentsSchemaRefsListPane == null ) {
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			IBusModelSchemaDefObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelSchemaDefObj ) ) {
				javafxContainer = (IBusModelSchemaDefObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSchemaRefsListPane = javafxSchema.getSchemaRefFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSchemaRefsList(), true );
		}
		return( tabViewComponentsSchemaRefsListPane );
	}

	protected class RefreshComponentsTweaksList
	implements ICFRefreshCallback
	{
		public RefreshComponentsTweaksList() {
		}

		public void refreshMe() {
			Collection<IBusModelTweakObj> dataCollection;
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTweaks( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsTweaksListPane();
			IBusModelJavaFXTweakPaneList jpList = (IBusModelJavaFXTweakPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsTweaksListPane() {
		if( tabViewComponentsTweaksListPane == null ) {
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			IBusModelScopeObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelScopeObj ) ) {
				javafxContainer = (IBusModelScopeObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsTweaksListPane = javafxSchema.getTweakFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsTweaksList(), false );
		}
		return( tabViewComponentsTweaksListPane );
	}

	protected class RefreshComponentsRolesList
	implements ICFRefreshCallback
	{
		public RefreshComponentsRolesList() {
		}

		public void refreshMe() {
			Collection<IBusModelSchemaRoleObj> dataCollection;
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsRoles( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsRolesListPane();
			IBusModelJavaFXSchemaRolePaneList jpList = (IBusModelJavaFXSchemaRolePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsRolesListPane() {
		if( tabViewComponentsRolesListPane == null ) {
			IBusModelSchemaDefObj focus = (IBusModelSchemaDefObj)getJavaFXFocusAsSchemaDef();
			IBusModelSchemaDefObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelSchemaDefObj ) ) {
				javafxContainer = (IBusModelSchemaDefObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsRolesListPane = javafxSchema.getSchemaRoleFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsRolesList(), false );
		}
		return( tabViewComponentsRolesListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsTablesListPane != null ) {
			((IBusModelJavaFXTablePaneCommon)tabViewComponentsTablesListPane).setPaneMode( value );
		}
		if( tabViewComponentsTypesListPane != null ) {
			((IBusModelJavaFXValuePaneCommon)tabViewComponentsTypesListPane).setPaneMode( value );
		}
		if( tabViewComponentsSchemaRefsListPane != null ) {
			((IBusModelJavaFXSchemaRefPaneCommon)tabViewComponentsSchemaRefsListPane).setPaneMode( value );
		}
		if( tabViewComponentsTweaksListPane != null ) {
			((IBusModelJavaFXTweakPaneCommon)tabViewComponentsTweaksListPane).setPaneMode( value );
		}
		if( tabViewComponentsRolesListPane != null ) {
			((IBusModelJavaFXSchemaRolePaneCommon)tabViewComponentsRolesListPane).setPaneMode( value );
		}
	}
}
