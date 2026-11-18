// Description: Java 25 JavaFX Element TabPane implementation for Table.

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
 *	BusModelJavaFXTableEltTabPane JavaFX Element TabPane implementation
 *	for Table.
 */
public class BusModelJavaFXTableEltTabPane
extends CFTabPane
implements IBusModelJavaFXTablePaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsRelationList = "Optional Components Relation Definitions";
	protected CFTab tabComponentsRelation = null;
	public final String LABEL_TabComponentsIndexList = "Optional Components Index Definitions";
	protected CFTab tabComponentsIndex = null;
	public final String LABEL_TabComponentsColumnsList = "Optional Components Columns";
	protected CFTab tabComponentsColumns = null;
	public final String LABEL_TabChildrenReverseRelationsList = "Optional Children Reverse Relations";
	protected CFTab tabChildrenReverseRelations = null;
	public final String LABEL_TabComponentsChainsList = "Optional Components Chains";
	protected CFTab tabComponentsChains = null;
	public final String LABEL_TabComponentsDelDepList = "Optional Components Deletion Dependency";
	protected CFTab tabComponentsDelDep = null;
	public final String LABEL_TabComponentsClearDepList = "Optional Components Clear Relationships Dependency";
	protected CFTab tabComponentsClearDep = null;
	public final String LABEL_TabComponentsServerMethodsList = "Optional Components Server Methods";
	protected CFTab tabComponentsServerMethods = null;
	public final String LABEL_TabComponentsTweaksList = "Optional Components Table Tweaks";
	protected CFTab tabComponentsTweaks = null;
	protected CFBorderPane tabViewComponentsRelationListPane = null;
	protected CFBorderPane tabViewComponentsIndexListPane = null;
	protected CFBorderPane tabViewComponentsColumnsListPane = null;
	protected CFBorderPane tabViewChildrenReverseRelationsListPane = null;
	protected CFBorderPane tabViewComponentsChainsListPane = null;
	protected CFBorderPane tabViewComponentsDelDepListPane = null;
	protected CFBorderPane tabViewComponentsClearDepListPane = null;
	protected CFBorderPane tabViewComponentsServerMethodsListPane = null;
	protected CFBorderPane tabViewComponentsTweaksListPane = null;

	public BusModelJavaFXTableEltTabPane( ICFFormManager formManager, IBusModelJavaFXSchema argSchema, IBusModelTableObj argFocus ) {
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
		setJavaFXFocusAsTable( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsRelation = new CFTab();
		tabComponentsRelation.setText( LABEL_TabComponentsRelationList );
		tabComponentsRelation.setContent( getTabViewComponentsRelationListPane() );
		getTabs().add( tabComponentsRelation );
		tabComponentsIndex = new CFTab();
		tabComponentsIndex.setText( LABEL_TabComponentsIndexList );
		tabComponentsIndex.setContent( getTabViewComponentsIndexListPane() );
		getTabs().add( tabComponentsIndex );
		tabComponentsColumns = new CFTab();
		tabComponentsColumns.setText( LABEL_TabComponentsColumnsList );
		tabComponentsColumns.setContent( getTabViewComponentsColumnsListPane() );
		getTabs().add( tabComponentsColumns );
		tabChildrenReverseRelations = new CFTab();
		tabChildrenReverseRelations.setText( LABEL_TabChildrenReverseRelationsList );
		tabChildrenReverseRelations.setContent( getTabViewChildrenReverseRelationsListPane() );
		getTabs().add( tabChildrenReverseRelations );
		tabComponentsChains = new CFTab();
		tabComponentsChains.setText( LABEL_TabComponentsChainsList );
		tabComponentsChains.setContent( getTabViewComponentsChainsListPane() );
		getTabs().add( tabComponentsChains );
		tabComponentsDelDep = new CFTab();
		tabComponentsDelDep.setText( LABEL_TabComponentsDelDepList );
		tabComponentsDelDep.setContent( getTabViewComponentsDelDepListPane() );
		getTabs().add( tabComponentsDelDep );
		tabComponentsClearDep = new CFTab();
		tabComponentsClearDep.setText( LABEL_TabComponentsClearDepList );
		tabComponentsClearDep.setContent( getTabViewComponentsClearDepListPane() );
		getTabs().add( tabComponentsClearDep );
		tabComponentsServerMethods = new CFTab();
		tabComponentsServerMethods.setText( LABEL_TabComponentsServerMethodsList );
		tabComponentsServerMethods.setContent( getTabViewComponentsServerMethodsListPane() );
		getTabs().add( tabComponentsServerMethods );
		tabComponentsTweaks = new CFTab();
		tabComponentsTweaks.setText( LABEL_TabComponentsTweaksList );
		tabComponentsTweaks.setContent( getTabViewComponentsTweaksListPane() );
		getTabs().add( tabComponentsTweaks );
		javafxIsInitializing = false;
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
		if( ( value == null ) || ( value instanceof IBusModelTableObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelTableObj" );
		}
	}

	public void setJavaFXFocusAsTable( IBusModelTableObj value ) {
		setJavaFXFocus( value );
	}

	public IBusModelTableObj getJavaFXFocusAsTable() {
		return( (IBusModelTableObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsRelationList
	implements ICFRefreshCallback
	{
		public RefreshComponentsRelationList() {
		}

		public void refreshMe() {
			Collection<IBusModelRelationObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsRelation( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsRelationListPane();
			IBusModelJavaFXRelationPaneList jpList = (IBusModelJavaFXRelationPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsRelationListPane() {
		if( tabViewComponentsRelationListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelTableObj ) ) {
				javafxContainer = (IBusModelTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsRelationListPane = javafxSchema.getRelationFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsRelationList(), false );
		}
		return( tabViewComponentsRelationListPane );
	}

	protected class RefreshComponentsIndexList
	implements ICFRefreshCallback
	{
		public RefreshComponentsIndexList() {
		}

		public void refreshMe() {
			Collection<IBusModelIndexObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsIndex( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsIndexListPane();
			IBusModelJavaFXIndexPaneList jpList = (IBusModelJavaFXIndexPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsIndexListPane() {
		if( tabViewComponentsIndexListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelTableObj ) ) {
				javafxContainer = (IBusModelTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsIndexListPane = javafxSchema.getIndexFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsIndexList(), false );
		}
		return( tabViewComponentsIndexListPane );
	}

	protected class RefreshComponentsColumnsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsColumnsList() {
		}

		public void refreshMe() {
			Collection<IBusModelValueObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsColumns( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsColumnsListPane();
			IBusModelJavaFXValuePaneList jpList = (IBusModelJavaFXValuePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsColumnsListPane() {
		if( tabViewComponentsColumnsListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelScopeObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelScopeObj ) ) {
				javafxContainer = (IBusModelScopeObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsColumnsListPane = javafxSchema.getValueFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsColumnsList(), true );
		}
		return( tabViewComponentsColumnsListPane );
	}

	protected class RefreshChildrenReverseRelationsList
	implements ICFRefreshCallback
	{
		public RefreshChildrenReverseRelationsList() {
		}

		public void refreshMe() {
			Collection<IBusModelRelationObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenReverseRelations( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenReverseRelationsListPane();
			IBusModelJavaFXRelationPaneList jpList = (IBusModelJavaFXRelationPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenReverseRelationsListPane() {
		if( tabViewChildrenReverseRelationsListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelTableObj ) ) {
				javafxContainer = (IBusModelTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenReverseRelationsListPane = javafxSchema.getRelationFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenReverseRelationsList(), false );
		}
		return( tabViewChildrenReverseRelationsListPane );
	}

	protected class RefreshComponentsChainsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsChainsList() {
		}

		public void refreshMe() {
			Collection<IBusModelChainObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsChains( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsChainsListPane();
			IBusModelJavaFXChainPaneList jpList = (IBusModelJavaFXChainPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsChainsListPane() {
		if( tabViewComponentsChainsListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelTableObj ) ) {
				javafxContainer = (IBusModelTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsChainsListPane = javafxSchema.getChainFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsChainsList(), false );
		}
		return( tabViewComponentsChainsListPane );
	}

	protected class RefreshComponentsDelDepList
	implements ICFRefreshCallback
	{
		public RefreshComponentsDelDepList() {
		}

		public void refreshMe() {
			Collection<IBusModelDelTopDepObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsDelDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsDelDepListPane();
			IBusModelJavaFXDelTopDepPaneList jpList = (IBusModelJavaFXDelTopDepPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsDelDepListPane() {
		if( tabViewComponentsDelDepListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelTableObj ) ) {
				javafxContainer = (IBusModelTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsDelDepListPane = javafxSchema.getDelTopDepFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsDelDepList(), true );
		}
		return( tabViewComponentsDelDepListPane );
	}

	protected class RefreshComponentsClearDepList
	implements ICFRefreshCallback
	{
		public RefreshComponentsClearDepList() {
		}

		public void refreshMe() {
			Collection<IBusModelClearTopDepObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsClearDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsClearDepListPane();
			IBusModelJavaFXClearTopDepPaneList jpList = (IBusModelJavaFXClearTopDepPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsClearDepListPane() {
		if( tabViewComponentsClearDepListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelTableObj ) ) {
				javafxContainer = (IBusModelTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsClearDepListPane = javafxSchema.getClearTopDepFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsClearDepList(), true );
		}
		return( tabViewComponentsClearDepListPane );
	}

	protected class RefreshComponentsServerMethodsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsServerMethodsList() {
		}

		public void refreshMe() {
			Collection<IBusModelServerMethodObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsServerMethods( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsServerMethodsListPane();
			IBusModelJavaFXServerMethodPaneList jpList = (IBusModelJavaFXServerMethodPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsServerMethodsListPane() {
		if( tabViewComponentsServerMethodsListPane == null ) {
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
			IBusModelTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelTableObj ) ) {
				javafxContainer = (IBusModelTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsServerMethodsListPane = javafxSchema.getServerMethodFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsServerMethodsList(), false );
		}
		return( tabViewComponentsServerMethodsListPane );
	}

	protected class RefreshComponentsTweaksList
	implements ICFRefreshCallback
	{
		public RefreshComponentsTweaksList() {
		}

		public void refreshMe() {
			Collection<IBusModelTweakObj> dataCollection;
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
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
			IBusModelTableObj focus = (IBusModelTableObj)getJavaFXFocusAsTable();
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

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsRelationListPane != null ) {
			((IBusModelJavaFXRelationPaneCommon)tabViewComponentsRelationListPane).setPaneMode( value );
		}
		if( tabViewComponentsIndexListPane != null ) {
			((IBusModelJavaFXIndexPaneCommon)tabViewComponentsIndexListPane).setPaneMode( value );
		}
		if( tabViewComponentsColumnsListPane != null ) {
			((IBusModelJavaFXValuePaneCommon)tabViewComponentsColumnsListPane).setPaneMode( value );
		}
		if( tabViewChildrenReverseRelationsListPane != null ) {
			((IBusModelJavaFXRelationPaneCommon)tabViewChildrenReverseRelationsListPane).setPaneMode( value );
		}
		if( tabViewComponentsChainsListPane != null ) {
			((IBusModelJavaFXChainPaneCommon)tabViewComponentsChainsListPane).setPaneMode( value );
		}
		if( tabViewComponentsDelDepListPane != null ) {
			((IBusModelJavaFXDelTopDepPaneCommon)tabViewComponentsDelDepListPane).setPaneMode( value );
		}
		if( tabViewComponentsClearDepListPane != null ) {
			((IBusModelJavaFXClearTopDepPaneCommon)tabViewComponentsClearDepListPane).setPaneMode( value );
		}
		if( tabViewComponentsServerMethodsListPane != null ) {
			((IBusModelJavaFXServerMethodPaneCommon)tabViewComponentsServerMethodsListPane).setPaneMode( value );
		}
		if( tabViewComponentsTweaksListPane != null ) {
			((IBusModelJavaFXTweakPaneCommon)tabViewComponentsTweaksListPane).setPaneMode( value );
		}
	}
}
