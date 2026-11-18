// Description: Java 25 JavaFX Element TabPane implementation for Cluster.

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
 *	SecureJavaFXClusterEltTabPane JavaFX Element TabPane implementation
 *	for Cluster.
 */
public class SecureJavaFXClusterEltTabPane
extends CFTabPane
implements ISecureJavaFXClusterPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsTenantList = "Optional Components Tenant";
	protected CFTab tabComponentsTenant = null;
	public final String LABEL_TabComponentsSecGroupList = "Optional Components Security Group";
	protected CFTab tabComponentsSecGroup = null;
	public final String LABEL_TabComponentsSecRoleList = "Optional Components Security Role";
	protected CFTab tabComponentsSecRole = null;
	public final String LABEL_TabComponentsSysClusterList = "Optional Components System Cluster";
	protected CFTab tabComponentsSysCluster = null;
	protected CFBorderPane tabViewComponentsTenantListPane = null;
	protected CFBorderPane tabViewComponentsSecGroupListPane = null;
	protected CFBorderPane tabViewComponentsSecRoleListPane = null;
	protected CFBorderPane tabViewComponentsSysClusterListPane = null;

	public SecureJavaFXClusterEltTabPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureClusterObj argFocus ) {
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
		setJavaFXFocusAsCluster( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsTenant = new CFTab();
		tabComponentsTenant.setText( LABEL_TabComponentsTenantList );
		tabComponentsTenant.setContent( getTabViewComponentsTenantListPane() );
		getTabs().add( tabComponentsTenant );
		tabComponentsSecGroup = new CFTab();
		tabComponentsSecGroup.setText( LABEL_TabComponentsSecGroupList );
		tabComponentsSecGroup.setContent( getTabViewComponentsSecGroupListPane() );
		getTabs().add( tabComponentsSecGroup );
		tabComponentsSecRole = new CFTab();
		tabComponentsSecRole.setText( LABEL_TabComponentsSecRoleList );
		tabComponentsSecRole.setContent( getTabViewComponentsSecRoleListPane() );
		getTabs().add( tabComponentsSecRole );
		tabComponentsSysCluster = new CFTab();
		tabComponentsSysCluster.setText( LABEL_TabComponentsSysClusterList );
		tabComponentsSysCluster.setContent( getTabViewComponentsSysClusterListPane() );
		getTabs().add( tabComponentsSysCluster );
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
		if( ( value == null ) || ( value instanceof ISecureClusterObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureClusterObj" );
		}
	}

	public void setJavaFXFocusAsCluster( ISecureClusterObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureClusterObj getJavaFXFocusAsCluster() {
		return( (ISecureClusterObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsTenantList
	implements ICFRefreshCallback
	{
		public RefreshComponentsTenantList() {
		}

		public void refreshMe() {
			Collection<ISecureTenantObj> dataCollection;
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTenant( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsTenantListPane();
			ISecureJavaFXTenantPaneList jpList = (ISecureJavaFXTenantPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsTenantListPane() {
		if( tabViewComponentsTenantListPane == null ) {
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			ISecureClusterObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureClusterObj ) ) {
				javafxContainer = (ISecureClusterObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsTenantListPane = javafxSchema.getTenantFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsTenantList(), false );
		}
		return( tabViewComponentsTenantListPane );
	}

	protected class RefreshComponentsSecGroupList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSecGroupList() {
		}

		public void refreshMe() {
			Collection<ISecureSecClusGrpObj> dataCollection;
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSecGroup( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSecGroupListPane();
			ISecureJavaFXSecClusGrpPaneList jpList = (ISecureJavaFXSecClusGrpPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSecGroupListPane() {
		if( tabViewComponentsSecGroupListPane == null ) {
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			ISecureSecSysGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecSysGrpObj ) ) {
				javafxContainer = (ISecureSecSysGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSecGroupListPane = javafxSchema.getSecClusGrpFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSecGroupList(), false );
		}
		return( tabViewComponentsSecGroupListPane );
	}

	protected class RefreshComponentsSecRoleList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSecRoleList() {
		}

		public void refreshMe() {
			Collection<ISecureSecClusRoleObj> dataCollection;
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSecRole( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSecRoleListPane();
			ISecureJavaFXSecClusRolePaneList jpList = (ISecureJavaFXSecClusRolePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSecRoleListPane() {
		if( tabViewComponentsSecRoleListPane == null ) {
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			ISecureSecSysGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecSysGrpObj ) ) {
				javafxContainer = (ISecureSecSysGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSecRoleListPane = javafxSchema.getSecClusRoleFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSecRoleList(), false );
		}
		return( tabViewComponentsSecRoleListPane );
	}

	protected class RefreshComponentsSysClusterList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSysClusterList() {
		}

		public void refreshMe() {
			Collection<ISecureSysClusterObj> dataCollection;
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSysCluster( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSysClusterListPane();
			ISecureJavaFXSysClusterPaneList jpList = (ISecureJavaFXSysClusterPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSysClusterListPane() {
		if( tabViewComponentsSysClusterListPane == null ) {
			ISecureClusterObj focus = (ISecureClusterObj)getJavaFXFocusAsCluster();
			ISecureClusterObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureClusterObj ) ) {
				javafxContainer = (ISecureClusterObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSysClusterListPane = javafxSchema.getSysClusterFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSysClusterList(), false );
		}
		return( tabViewComponentsSysClusterListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsTenantListPane != null ) {
			((ISecureJavaFXTenantPaneCommon)tabViewComponentsTenantListPane).setPaneMode( value );
		}
		if( tabViewComponentsSecGroupListPane != null ) {
			((ISecureJavaFXSecClusGrpPaneCommon)tabViewComponentsSecGroupListPane).setPaneMode( value );
		}
		if( tabViewComponentsSecRoleListPane != null ) {
			((ISecureJavaFXSecClusRolePaneCommon)tabViewComponentsSecRoleListPane).setPaneMode( value );
		}
		if( tabViewComponentsSysClusterListPane != null ) {
			((ISecureJavaFXSysClusterPaneCommon)tabViewComponentsSysClusterListPane).setPaneMode( value );
		}
	}
}
