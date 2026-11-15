// Description: Java 25 JavaFX Element TabPane implementation for SecSysRole.

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
import server.markhome.ycf.v3_1.secure.secureobj.*;

/**
 *	SecureJavaFXSecSysRoleEltTabPane JavaFX Element TabPane implementation
 *	for SecSysRole.
 */
public class SecureJavaFXSecSysRoleEltTabPane
extends CFTabPane
implements ISecureJavaFXSecSysRolePaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsEnabledByRoleList = "Optional Components Enabled by Role";
	protected CFTab tabComponentsEnabledByRole = null;
	public final String LABEL_TabChildrenMembByRoleList = "Optional Children Members of System Role";
	protected CFTab tabChildrenMembByRole = null;
	protected CFBorderPane tabViewComponentsEnabledByRoleListPane = null;
	protected CFBorderPane tabViewChildrenMembByRoleListPane = null;

	public SecureJavaFXSecSysRoleEltTabPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureSecSysRoleObj argFocus ) {
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
		setJavaFXFocusAsSecSysRole( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsEnabledByRole = new CFTab();
		tabComponentsEnabledByRole.setText( LABEL_TabComponentsEnabledByRoleList );
		tabComponentsEnabledByRole.setContent( getTabViewComponentsEnabledByRoleListPane() );
		getTabs().add( tabComponentsEnabledByRole );
		tabChildrenMembByRole = new CFTab();
		tabChildrenMembByRole.setText( LABEL_TabChildrenMembByRoleList );
		tabChildrenMembByRole.setContent( getTabViewChildrenMembByRoleListPane() );
		getTabs().add( tabChildrenMembByRole );
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

	public ISecureJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ISecureSecSysRoleObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecSysRoleObj" );
		}
	}

	public void setJavaFXFocusAsSecSysRole( ISecureSecSysRoleObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureSecSysRoleObj getJavaFXFocusAsSecSysRole() {
		return( (ISecureSecSysRoleObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsEnabledByRoleList
	implements ICFRefreshCallback
	{
		public RefreshComponentsEnabledByRoleList() {
		}

		public void refreshMe() {
			Collection<ISecureSecSysRoleEnablesObj> dataCollection;
			ISecureSecSysRoleObj focus = (ISecureSecSysRoleObj)getJavaFXFocusAsSecSysRole();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsEnabledByRole( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsEnabledByRoleListPane();
			ISecureJavaFXSecSysRoleEnablesPaneList jpList = (ISecureJavaFXSecSysRoleEnablesPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsEnabledByRoleListPane() {
		if( tabViewComponentsEnabledByRoleListPane == null ) {
			ISecureSecSysRoleObj focus = (ISecureSecSysRoleObj)getJavaFXFocusAsSecSysRole();
			ISecureSecSysRoleObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecSysRoleObj ) ) {
				javafxContainer = (ISecureSecSysRoleObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsEnabledByRoleListPane = javafxSchema.getSecSysRoleEnablesFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsEnabledByRoleList(), false );
		}
		return( tabViewComponentsEnabledByRoleListPane );
	}

	protected class RefreshChildrenMembByRoleList
	implements ICFRefreshCallback
	{
		public RefreshChildrenMembByRoleList() {
		}

		public void refreshMe() {
			Collection<ISecureSecSysRoleMembObj> dataCollection;
			ISecureSecSysRoleObj focus = (ISecureSecSysRoleObj)getJavaFXFocusAsSecSysRole();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenMembByRole( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenMembByRoleListPane();
			ISecureJavaFXSecSysRoleMembPaneList jpList = (ISecureJavaFXSecSysRoleMembPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenMembByRoleListPane() {
		if( tabViewChildrenMembByRoleListPane == null ) {
			ISecureSecSysRoleObj focus = (ISecureSecSysRoleObj)getJavaFXFocusAsSecSysRole();
			ISecureSecSysRoleObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecSysRoleObj ) ) {
				javafxContainer = (ISecureSecSysRoleObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenMembByRoleListPane = javafxSchema.getSecSysRoleMembFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenMembByRoleList(), false );
		}
		return( tabViewChildrenMembByRoleListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsEnabledByRoleListPane != null ) {
			((ISecureJavaFXSecSysRoleEnablesPaneCommon)tabViewComponentsEnabledByRoleListPane).setPaneMode( value );
		}
		if( tabViewChildrenMembByRoleListPane != null ) {
			((ISecureJavaFXSecSysRoleMembPaneCommon)tabViewChildrenMembByRoleListPane).setPaneMode( value );
		}
	}
}
