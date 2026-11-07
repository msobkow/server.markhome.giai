// Description: Java 25 JavaFX Picker Form implementation for DbKeyHash128Col.

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
 *	BusModelJavaFXDbKeyHash128ColPickerForm JavaFX Picker Form implementation
 *	for DbKeyHash128Col.
 */
public class BusModelJavaFXDbKeyHash128ColPickerForm
extends CFBorderPane
implements IBusModelJavaFXDbKeyHash128ColPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected IBusModelJavaFXSchema javafxSchema = null;
	protected Collection<IBusModelDbKeyHash128ColObj> javafxDataCollection = null;

	public BusModelJavaFXDbKeyHash128ColPickerForm( ICFFormManager formManager,
		IBusModelJavaFXSchema argSchema,
		IBusModelDbKeyHash128ColObj argFocus,
		IBusModelTableObj argContainer,
		Collection<IBusModelDbKeyHash128ColObj> argDataCollection,
		IBusModelJavaFXDbKeyHash128ColChosen whenChosen )
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
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javafxPickerPane = argSchema.getDbKeyHash128ColFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsDbKeyHash128Col( argFocus );
		setJavaFXDataCollection( argDataCollection );
		setJavaFXContainer( argContainer );
		setCenter( javafxPickerPane );
		setPaneMode( CFPane.PaneMode.View );
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

	public void forceCancelAndClose() {
		if( cfFormManager != null ) {
			if( cfFormManager.getCurrentForm() == this ) {
				cfFormManager.closeCurrentForm();
			}
		}
	}

	public IBusModelJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelDbKeyHash128ColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelDbKeyHash128ColObj" );
		}
		((IBusModelJavaFXDbKeyHash128ColPaneCommon)javafxPickerPane).setJavaFXFocus( (IBusModelDbKeyHash128ColObj)value );
	}

	public IBusModelDbKeyHash128ColObj getJavaFXFocusAsDbKeyHash128Col() {
		return( (IBusModelDbKeyHash128ColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDbKeyHash128Col( IBusModelDbKeyHash128ColObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<IBusModelDbKeyHash128ColObj> getJavaFXDataCollection() {
		IBusModelJavaFXDbKeyHash128ColPaneList jplPicker = (IBusModelJavaFXDbKeyHash128ColPaneList)javafxPickerPane;
		Collection<IBusModelDbKeyHash128ColObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<IBusModelDbKeyHash128ColObj> value ) {
		IBusModelJavaFXDbKeyHash128ColPaneList jplPicker = (IBusModelJavaFXDbKeyHash128ColPaneList)javafxPickerPane;
		jplPicker.setJavaFXDataCollection( value );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		if( value != CFPane.PaneMode.View ) {
			throw new CFLibUsageException( getClass(),
				S_ProcName,
				Inz.x("cflibjavafx.common.PickerFormModes"),
				Inz.s("cflibjavafx.common.PickerFormModes") );
		}
		super.setPaneMode( value );
		if( javafxPickerPane != null ) {
			IBusModelJavaFXDbKeyHash128ColPaneCommon jpanelCommon = (IBusModelJavaFXDbKeyHash128ColPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public IBusModelTableObj getJavaFXContainer() {
		IBusModelJavaFXDbKeyHash128ColPaneList jplPicker = (IBusModelJavaFXDbKeyHash128ColPaneList)javafxPickerPane;
		IBusModelTableObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( IBusModelTableObj value ) {
		IBusModelJavaFXDbKeyHash128ColPaneList jplPicker = (IBusModelJavaFXDbKeyHash128ColPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
