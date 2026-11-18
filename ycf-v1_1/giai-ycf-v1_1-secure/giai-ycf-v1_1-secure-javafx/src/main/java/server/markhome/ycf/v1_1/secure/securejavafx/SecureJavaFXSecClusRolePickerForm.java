// Description: Java 25 JavaFX Picker Form implementation for SecClusRole.

/*
 *	server.markhome.ycf.Secure
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal 3.1 Secure - Security Services
 *	
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow mark.sobkow@gmail.com
 *	
 *	These files are part of Yorkton Code Fractal Secure.
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

package server.markhome.ycf.v3_1.secure.securejavafx;

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
import server.markhome.ycf.v3_1.secure.secureobj.*;

/**
 *	SecureJavaFXSecClusRolePickerForm JavaFX Picker Form implementation
 *	for SecClusRole.
 */
public class SecureJavaFXSecClusRolePickerForm
extends CFBorderPane
implements ISecureJavaFXSecClusRolePaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected Collection<ISecureSecClusRoleObj> javafxDataCollection = null;

	public SecureJavaFXSecClusRolePickerForm( ICFFormManager formManager,
		ISecureJavaFXSchema argSchema,
		ISecureSecClusRoleObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecClusRoleObj> argDataCollection,
		ISecureJavaFXSecClusRoleChosen whenChosen )
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
		javafxPickerPane = argSchema.getSecClusRoleFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsSecClusRole( argFocus );
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

	public ISecureJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ISecureSecClusRoleObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecClusRoleObj" );
		}
		((ISecureJavaFXSecClusRolePaneCommon)javafxPickerPane).setJavaFXFocus( (ISecureSecClusRoleObj)value );
	}

	public ISecureSecClusRoleObj getJavaFXFocusAsSecClusRole() {
		return( (ISecureSecClusRoleObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecClusRole( ISecureSecClusRoleObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ISecureSecClusRoleObj> getJavaFXDataCollection() {
		ISecureJavaFXSecClusRolePaneList jplPicker = (ISecureJavaFXSecClusRolePaneList)javafxPickerPane;
		Collection<ISecureSecClusRoleObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ISecureSecClusRoleObj> value ) {
		ISecureJavaFXSecClusRolePaneList jplPicker = (ISecureJavaFXSecClusRolePaneList)javafxPickerPane;
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
			ISecureJavaFXSecClusRolePaneCommon jpanelCommon = (ISecureJavaFXSecClusRolePaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ISecureSecSysGrpObj getJavaFXContainer() {
		ISecureJavaFXSecClusRolePaneList jplPicker = (ISecureJavaFXSecClusRolePaneList)javafxPickerPane;
		ISecureSecSysGrpObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ISecureSecSysGrpObj value ) {
		ISecureJavaFXSecClusRolePaneList jplPicker = (ISecureJavaFXSecClusRolePaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
