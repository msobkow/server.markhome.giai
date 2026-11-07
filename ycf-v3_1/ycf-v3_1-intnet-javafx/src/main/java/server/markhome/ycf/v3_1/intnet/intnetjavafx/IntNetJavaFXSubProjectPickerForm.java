// Description: Java 25 JavaFX Picker Form implementation for SubProject.

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
import java.text.*;
import java.util.*;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.Inz;
import server.markhome.cf.javafx.*;
import org.apache.commons.codec.binaryCFCore64;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;

/**
 *	IntNetJavaFXSubProjectPickerForm JavaFX Picker Form implementation
 *	for SubProject.
 */
public class IntNetJavaFXSubProjectPickerForm
extends CFBorderPane
implements IIntNetJavaFXSubProjectPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected IIntNetJavaFXSchema javafxSchema = null;
	protected Collection<IIntNetSubProjectObj> javafxDataCollection = null;

	public IntNetJavaFXSubProjectPickerForm( ICFFormManager formManager,
		IIntNetJavaFXSchema argSchema,
		IIntNetSubProjectObj argFocus,
		IIntNetTopProjectObj argContainer,
		Collection<IIntNetSubProjectObj> argDataCollection,
		IIntNetJavaFXSubProjectChosen whenChosen )
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
		javafxPickerPane = argSchema.getSubProjectFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsSubProject( argFocus );
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

	public IIntNetJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IIntNetSubProjectObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IIntNetSubProjectObj" );
		}
		((IIntNetJavaFXSubProjectPaneCommon)javafxPickerPane).setJavaFXFocus( (IIntNetSubProjectObj)value );
	}

	public IIntNetSubProjectObj getJavaFXFocusAsSubProject() {
		return( (IIntNetSubProjectObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSubProject( IIntNetSubProjectObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<IIntNetSubProjectObj> getJavaFXDataCollection() {
		IIntNetJavaFXSubProjectPaneList jplPicker = (IIntNetJavaFXSubProjectPaneList)javafxPickerPane;
		Collection<IIntNetSubProjectObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<IIntNetSubProjectObj> value ) {
		IIntNetJavaFXSubProjectPaneList jplPicker = (IIntNetJavaFXSubProjectPaneList)javafxPickerPane;
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
			IIntNetJavaFXSubProjectPaneCommon jpanelCommon = (IIntNetJavaFXSubProjectPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public IIntNetTopProjectObj getJavaFXContainer() {
		IIntNetJavaFXSubProjectPaneList jplPicker = (IIntNetJavaFXSubProjectPaneList)javafxPickerPane;
		IIntNetTopProjectObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( IIntNetTopProjectObj value ) {
		IIntNetJavaFXSubProjectPaneList jplPicker = (IIntNetJavaFXSubProjectPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
