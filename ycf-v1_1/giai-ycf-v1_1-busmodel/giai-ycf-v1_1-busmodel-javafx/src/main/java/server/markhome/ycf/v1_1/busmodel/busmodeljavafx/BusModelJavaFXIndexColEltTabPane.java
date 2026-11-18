// Description: Java 25 JavaFX Element TabPane implementation for IndexCol.

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
 *	BusModelJavaFXIndexColEltTabPane JavaFX Element TabPane implementation
 *	for IndexCol.
 */
public class BusModelJavaFXIndexColEltTabPane
extends CFTabPane
implements IBusModelJavaFXIndexColPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabChildrenRefRelFromColList = "Optional Children Referencing Relation From Columns";
	protected CFTab tabChildrenRefRelFromCol = null;
	public final String LABEL_TabChildrenRefRelToColList = "Optional Children Referencing Relation To Columns";
	protected CFTab tabChildrenRefRelToCol = null;
	protected CFBorderPane tabViewChildrenRefRelFromColListPane = null;
	protected CFBorderPane tabViewChildrenRefRelToColListPane = null;

	public BusModelJavaFXIndexColEltTabPane( ICFFormManager formManager, IBusModelJavaFXSchema argSchema, IBusModelIndexColObj argFocus ) {
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
		setJavaFXFocusAsIndexCol( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabChildrenRefRelFromCol = new CFTab();
		tabChildrenRefRelFromCol.setText( LABEL_TabChildrenRefRelFromColList );
		tabChildrenRefRelFromCol.setContent( getTabViewChildrenRefRelFromColListPane() );
		getTabs().add( tabChildrenRefRelFromCol );
		tabChildrenRefRelToCol = new CFTab();
		tabChildrenRefRelToCol.setText( LABEL_TabChildrenRefRelToColList );
		tabChildrenRefRelToCol.setContent( getTabViewChildrenRefRelToColListPane() );
		getTabs().add( tabChildrenRefRelToCol );
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
		if( ( value == null ) || ( value instanceof IBusModelIndexColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelIndexColObj" );
		}
	}

	public void setJavaFXFocusAsIndexCol( IBusModelIndexColObj value ) {
		setJavaFXFocus( value );
	}

	public IBusModelIndexColObj getJavaFXFocusAsIndexCol() {
		return( (IBusModelIndexColObj)getJavaFXFocus() );
	}

	protected class RefreshChildrenRefRelFromColList
	implements ICFRefreshCallback
	{
		public RefreshChildrenRefRelFromColList() {
		}

		public void refreshMe() {
			Collection<IBusModelRelationColObj> dataCollection;
			IBusModelIndexColObj focus = (IBusModelIndexColObj)getJavaFXFocusAsIndexCol();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefRelFromCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenRefRelFromColListPane();
			IBusModelJavaFXRelationColPaneList jpList = (IBusModelJavaFXRelationColPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenRefRelFromColListPane() {
		if( tabViewChildrenRefRelFromColListPane == null ) {
			IBusModelIndexColObj focus = (IBusModelIndexColObj)getJavaFXFocusAsIndexCol();
			IBusModelRelationObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelRelationObj ) ) {
				javafxContainer = (IBusModelRelationObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenRefRelFromColListPane = javafxSchema.getRelationColFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenRefRelFromColList(), false );
		}
		return( tabViewChildrenRefRelFromColListPane );
	}

	protected class RefreshChildrenRefRelToColList
	implements ICFRefreshCallback
	{
		public RefreshChildrenRefRelToColList() {
		}

		public void refreshMe() {
			Collection<IBusModelRelationColObj> dataCollection;
			IBusModelIndexColObj focus = (IBusModelIndexColObj)getJavaFXFocusAsIndexCol();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefRelToCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenRefRelToColListPane();
			IBusModelJavaFXRelationColPaneList jpList = (IBusModelJavaFXRelationColPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenRefRelToColListPane() {
		if( tabViewChildrenRefRelToColListPane == null ) {
			IBusModelIndexColObj focus = (IBusModelIndexColObj)getJavaFXFocusAsIndexCol();
			IBusModelRelationObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IBusModelRelationObj ) ) {
				javafxContainer = (IBusModelRelationObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenRefRelToColListPane = javafxSchema.getRelationColFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenRefRelToColList(), false );
		}
		return( tabViewChildrenRefRelToColListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewChildrenRefRelFromColListPane != null ) {
			((IBusModelJavaFXRelationColPaneCommon)tabViewChildrenRefRelFromColListPane).setPaneMode( value );
		}
		if( tabViewChildrenRefRelToColListPane != null ) {
			((IBusModelJavaFXRelationColPaneCommon)tabViewChildrenRefRelToColListPane).setPaneMode( value );
		}
	}
}
