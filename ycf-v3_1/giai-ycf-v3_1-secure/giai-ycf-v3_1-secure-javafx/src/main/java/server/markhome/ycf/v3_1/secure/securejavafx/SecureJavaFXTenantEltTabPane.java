// Description: Java 25 JavaFX Element TabPane implementation for Tenant.

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
 *	SecureJavaFXTenantEltTabPane JavaFX Element TabPane implementation
 *	for Tenant.
 */
public class SecureJavaFXTenantEltTabPane
extends CFTabPane
implements ISecureJavaFXTenantPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsSecGroupList = "Optional Components Tenant Security Group";
	protected CFTab tabComponentsSecGroup = null;
	public final String LABEL_TabComponentsSecRoleList = "Optional Components Security Role";
	protected CFTab tabComponentsSecRole = null;
	protected CFBorderPane tabViewComponentsSecGroupListPane = null;
	protected CFBorderPane tabViewComponentsSecRoleListPane = null;

	public SecureJavaFXTenantEltTabPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureTenantObj argFocus ) {
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
		setJavaFXFocusAsTenant( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsSecGroup = new CFTab();
		tabComponentsSecGroup.setText( LABEL_TabComponentsSecGroupList );
		tabComponentsSecGroup.setContent( getTabViewComponentsSecGroupListPane() );
		getTabs().add( tabComponentsSecGroup );
		tabComponentsSecRole = new CFTab();
		tabComponentsSecRole.setText( LABEL_TabComponentsSecRoleList );
		tabComponentsSecRole.setContent( getTabViewComponentsSecRoleListPane() );
		getTabs().add( tabComponentsSecRole );
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
		if( ( value == null ) || ( value instanceof ISecureTenantObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureTenantObj" );
		}
	}

	public void setJavaFXFocusAsTenant( ISecureTenantObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureTenantObj getJavaFXFocusAsTenant() {
		return( (ISecureTenantObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsSecGroupList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSecGroupList() {
		}

		public void refreshMe() {
			Collection<ISecureSecTentGrpObj> dataCollection;
			ISecureTenantObj focus = (ISecureTenantObj)getJavaFXFocusAsTenant();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSecGroup( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSecGroupListPane();
			ISecureJavaFXSecTentGrpPaneList jpList = (ISecureJavaFXSecTentGrpPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSecGroupListPane() {
		if( tabViewComponentsSecGroupListPane == null ) {
			ISecureTenantObj focus = (ISecureTenantObj)getJavaFXFocusAsTenant();
			ISecureSecSysGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecSysGrpObj ) ) {
				javafxContainer = (ISecureSecSysGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSecGroupListPane = javafxSchema.getSecTentGrpFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSecGroupList(), false );
		}
		return( tabViewComponentsSecGroupListPane );
	}

	protected class RefreshComponentsSecRoleList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSecRoleList() {
		}

		public void refreshMe() {
			Collection<ISecureSecTentRoleObj> dataCollection;
			ISecureTenantObj focus = (ISecureTenantObj)getJavaFXFocusAsTenant();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSecRole( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSecRoleListPane();
			ISecureJavaFXSecTentRolePaneList jpList = (ISecureJavaFXSecTentRolePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSecRoleListPane() {
		if( tabViewComponentsSecRoleListPane == null ) {
			ISecureTenantObj focus = (ISecureTenantObj)getJavaFXFocusAsTenant();
			ISecureSecSysGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecSysGrpObj ) ) {
				javafxContainer = (ISecureSecSysGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSecRoleListPane = javafxSchema.getSecTentRoleFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSecRoleList(), false );
		}
		return( tabViewComponentsSecRoleListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsSecGroupListPane != null ) {
			((ISecureJavaFXSecTentGrpPaneCommon)tabViewComponentsSecGroupListPane).setPaneMode( value );
		}
		if( tabViewComponentsSecRoleListPane != null ) {
			((ISecureJavaFXSecTentRolePaneCommon)tabViewComponentsSecRoleListPane).setPaneMode( value );
		}
	}
}
