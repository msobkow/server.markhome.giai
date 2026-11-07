// Description: Java 25 JavaFX Element TabPane implementation for SecUser.

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
 *	SecureJavaFXSecUserEltTabPane JavaFX Element TabPane implementation
 *	for SecUser.
 */
public class SecureJavaFXSecUserEltTabPane
extends CFTabPane
implements ISecureJavaFXSecUserPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsPasswordAttr = "Optional Components Password Singleton";
	protected CFTab tabComponentsPassword = null;
	public final String LABEL_TabComponentsEMConfAttr = "Optional Components EMail Confirmation Singleton";
	protected CFTab tabComponentsEMConf = null;
	public final String LABEL_TabComponentsPWResetAttr = "Optional Components Password Reset Singleton";
	protected CFTab tabComponentsPWReset = null;
	public final String LABEL_TabChildrenPWHistoryAttr = "Optional Children Password History Entries";
	protected CFTab tabChildrenPWHistory = null;
	public final String LABEL_TabComponentsSecSessList = "Optional Components Security Session";
	protected CFTab tabComponentsSecSess = null;
	public final String LABEL_TabChildrenSecProxyList = "Optional Children Security Proxy Session";
	protected CFTab tabChildrenSecProxy = null;
	public final String LABEL_TabChildrenSysSecGrpMembList = "Optional Children System Security Group Members";
	protected CFTab tabChildrenSysSecGrpMemb = null;
	public final String LABEL_TabChildrenClusSecGrpMembList = "Optional Children Cluster Security Group Members";
	protected CFTab tabChildrenClusSecGrpMemb = null;
	public final String LABEL_TabChildrenTentSecGrpMembList = "Optional Children Tenant Security Group Members";
	protected CFTab tabChildrenTentSecGrpMemb = null;
	protected ScrollPane tabViewComponentsPasswordAttrScrollPane = null;
	protected CFGridPane tabViewComponentsPasswordAttrPane = null;
	protected ScrollPane tabViewComponentsEMConfAttrScrollPane = null;
	protected CFGridPane tabViewComponentsEMConfAttrPane = null;
	protected ScrollPane tabViewComponentsPWResetAttrScrollPane = null;
	protected CFGridPane tabViewComponentsPWResetAttrPane = null;
	protected ScrollPane tabViewChildrenPWHistoryAttrScrollPane = null;
	protected CFGridPane tabViewChildrenPWHistoryAttrPane = null;
	protected CFBorderPane tabViewComponentsSecSessListPane = null;
	protected CFBorderPane tabViewChildrenSecProxyListPane = null;
	protected CFBorderPane tabViewChildrenSysSecGrpMembListPane = null;
	protected CFBorderPane tabViewChildrenClusSecGrpMembListPane = null;
	protected CFBorderPane tabViewChildrenTentSecGrpMembListPane = null;

	public SecureJavaFXSecUserEltTabPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureSecUserObj argFocus ) {
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
		setJavaFXFocusAsSecUser( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsPassword = new CFTab();
		tabComponentsPassword.setText( LABEL_TabComponentsPasswordAttr );
		tabComponentsPassword.setContent( getTabViewComponentsPasswordAttrScrollPane() );
		getTabs().add( tabComponentsPassword );
		tabComponentsEMConf = new CFTab();
		tabComponentsEMConf.setText( LABEL_TabComponentsEMConfAttr );
		tabComponentsEMConf.setContent( getTabViewComponentsEMConfAttrScrollPane() );
		getTabs().add( tabComponentsEMConf );
		tabComponentsPWReset = new CFTab();
		tabComponentsPWReset.setText( LABEL_TabComponentsPWResetAttr );
		tabComponentsPWReset.setContent( getTabViewComponentsPWResetAttrScrollPane() );
		getTabs().add( tabComponentsPWReset );
		tabChildrenPWHistory = new CFTab();
		tabChildrenPWHistory.setText( LABEL_TabChildrenPWHistoryAttr );
		tabChildrenPWHistory.setContent( getTabViewChildrenPWHistoryAttrScrollPane() );
		getTabs().add( tabChildrenPWHistory );
		tabComponentsSecSess = new CFTab();
		tabComponentsSecSess.setText( LABEL_TabComponentsSecSessList );
		tabComponentsSecSess.setContent( getTabViewComponentsSecSessListPane() );
		getTabs().add( tabComponentsSecSess );
		tabChildrenSecProxy = new CFTab();
		tabChildrenSecProxy.setText( LABEL_TabChildrenSecProxyList );
		tabChildrenSecProxy.setContent( getTabViewChildrenSecProxyListPane() );
		getTabs().add( tabChildrenSecProxy );
		tabChildrenSysSecGrpMemb = new CFTab();
		tabChildrenSysSecGrpMemb.setText( LABEL_TabChildrenSysSecGrpMembList );
		tabChildrenSysSecGrpMemb.setContent( getTabViewChildrenSysSecGrpMembListPane() );
		getTabs().add( tabChildrenSysSecGrpMemb );
		tabChildrenClusSecGrpMemb = new CFTab();
		tabChildrenClusSecGrpMemb.setText( LABEL_TabChildrenClusSecGrpMembList );
		tabChildrenClusSecGrpMemb.setContent( getTabViewChildrenClusSecGrpMembListPane() );
		getTabs().add( tabChildrenClusSecGrpMemb );
		tabChildrenTentSecGrpMemb = new CFTab();
		tabChildrenTentSecGrpMemb.setText( LABEL_TabChildrenTentSecGrpMembList );
		tabChildrenTentSecGrpMemb.setContent( getTabViewChildrenTentSecGrpMembListPane() );
		getTabs().add( tabChildrenTentSecGrpMemb );
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
		if( ( value == null ) || ( value instanceof ISecureSecUserObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecUserObj" );
		}
	}

	public void setJavaFXFocusAsSecUser( ISecureSecUserObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureSecUserObj getJavaFXFocusAsSecUser() {
		return( (ISecureSecUserObj)getJavaFXFocus() );
	}

	public ScrollPane getTabViewComponentsPasswordAttrScrollPane() {
		if( tabViewComponentsPasswordAttrScrollPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecUserPasswordObj refPassword =
				( focus != null )
					? focus.getOptionalComponentsPassword()
					: null;
			tabViewComponentsPasswordAttrPane = javafxSchema.getSecUserPasswordFactory().newAttrPane( cfFormManager, refPassword );
			tabViewComponentsPasswordAttrScrollPane = new ScrollPane();
			tabViewComponentsPasswordAttrScrollPane.setFitToWidth( true );
			tabViewComponentsPasswordAttrScrollPane.setHbarPolicy( ScrollBarPolicy.NEVER );
			tabViewComponentsPasswordAttrScrollPane.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
			tabViewComponentsPasswordAttrScrollPane.setContent( tabViewComponentsPasswordAttrPane );
		}
		return( tabViewComponentsPasswordAttrScrollPane );
	}

	public ScrollPane getTabViewComponentsEMConfAttrScrollPane() {
		if( tabViewComponentsEMConfAttrScrollPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecUserEMConfObj refEMConf =
				( focus != null )
					? focus.getOptionalComponentsEMConf()
					: null;
			tabViewComponentsEMConfAttrPane = javafxSchema.getSecUserEMConfFactory().newAttrPane( cfFormManager, refEMConf );
			tabViewComponentsEMConfAttrScrollPane = new ScrollPane();
			tabViewComponentsEMConfAttrScrollPane.setFitToWidth( true );
			tabViewComponentsEMConfAttrScrollPane.setHbarPolicy( ScrollBarPolicy.NEVER );
			tabViewComponentsEMConfAttrScrollPane.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
			tabViewComponentsEMConfAttrScrollPane.setContent( tabViewComponentsEMConfAttrPane );
		}
		return( tabViewComponentsEMConfAttrScrollPane );
	}

	public ScrollPane getTabViewComponentsPWResetAttrScrollPane() {
		if( tabViewComponentsPWResetAttrScrollPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecUserPWResetObj refPWReset =
				( focus != null )
					? focus.getOptionalComponentsPWReset()
					: null;
			tabViewComponentsPWResetAttrPane = javafxSchema.getSecUserPWResetFactory().newAttrPane( cfFormManager, refPWReset );
			tabViewComponentsPWResetAttrScrollPane = new ScrollPane();
			tabViewComponentsPWResetAttrScrollPane.setFitToWidth( true );
			tabViewComponentsPWResetAttrScrollPane.setHbarPolicy( ScrollBarPolicy.NEVER );
			tabViewComponentsPWResetAttrScrollPane.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
			tabViewComponentsPWResetAttrScrollPane.setContent( tabViewComponentsPWResetAttrPane );
		}
		return( tabViewComponentsPWResetAttrScrollPane );
	}

	public ScrollPane getTabViewChildrenPWHistoryAttrScrollPane() {
		if( tabViewChildrenPWHistoryAttrScrollPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecUserPWHistoryObj refPWHistory =
				( focus != null )
					? focus.getOptionalChildrenPWHistory()
					: null;
			tabViewChildrenPWHistoryAttrPane = javafxSchema.getSecUserPWHistoryFactory().newAttrPane( cfFormManager, refPWHistory );
			tabViewChildrenPWHistoryAttrScrollPane = new ScrollPane();
			tabViewChildrenPWHistoryAttrScrollPane.setFitToWidth( true );
			tabViewChildrenPWHistoryAttrScrollPane.setHbarPolicy( ScrollBarPolicy.NEVER );
			tabViewChildrenPWHistoryAttrScrollPane.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
			tabViewChildrenPWHistoryAttrScrollPane.setContent( tabViewChildrenPWHistoryAttrPane );
		}
		return( tabViewChildrenPWHistoryAttrScrollPane );
	}

	protected class RefreshComponentsSecSessList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSecSessList() {
		}

		public void refreshMe() {
			Collection<ISecureSecSessionObj> dataCollection;
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSecSess( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSecSessListPane();
			ISecureJavaFXSecSessionPaneList jpList = (ISecureJavaFXSecSessionPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSecSessListPane() {
		if( tabViewComponentsSecSessListPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecUserObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecUserObj ) ) {
				javafxContainer = (ISecureSecUserObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSecSessListPane = javafxSchema.getSecSessionFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSecSessList(), false );
		}
		return( tabViewComponentsSecSessListPane );
	}

	protected class RefreshChildrenSecProxyList
	implements ICFRefreshCallback
	{
		public RefreshChildrenSecProxyList() {
		}

		public void refreshMe() {
			Collection<ISecureSecSessionObj> dataCollection;
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenSecProxy( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenSecProxyListPane();
			ISecureJavaFXSecSessionPaneList jpList = (ISecureJavaFXSecSessionPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenSecProxyListPane() {
		if( tabViewChildrenSecProxyListPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecUserObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecUserObj ) ) {
				javafxContainer = (ISecureSecUserObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenSecProxyListPane = javafxSchema.getSecSessionFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenSecProxyList(), false );
		}
		return( tabViewChildrenSecProxyListPane );
	}

	protected class RefreshChildrenSysSecGrpMembList
	implements ICFRefreshCallback
	{
		public RefreshChildrenSysSecGrpMembList() {
		}

		public void refreshMe() {
			Collection<ISecureSecSysGrpMembObj> dataCollection;
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenSysSecGrpMemb( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenSysSecGrpMembListPane();
			ISecureJavaFXSecSysGrpMembPaneList jpList = (ISecureJavaFXSecSysGrpMembPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenSysSecGrpMembListPane() {
		if( tabViewChildrenSysSecGrpMembListPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecSysGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecSysGrpObj ) ) {
				javafxContainer = (ISecureSecSysGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenSysSecGrpMembListPane = javafxSchema.getSecSysGrpMembFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenSysSecGrpMembList(), false );
		}
		return( tabViewChildrenSysSecGrpMembListPane );
	}

	protected class RefreshChildrenClusSecGrpMembList
	implements ICFRefreshCallback
	{
		public RefreshChildrenClusSecGrpMembList() {
		}

		public void refreshMe() {
			Collection<ISecureSecClusGrpMembObj> dataCollection;
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenClusSecGrpMemb( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenClusSecGrpMembListPane();
			ISecureJavaFXSecClusGrpMembPaneList jpList = (ISecureJavaFXSecClusGrpMembPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenClusSecGrpMembListPane() {
		if( tabViewChildrenClusSecGrpMembListPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecClusGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecClusGrpObj ) ) {
				javafxContainer = (ISecureSecClusGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenClusSecGrpMembListPane = javafxSchema.getSecClusGrpMembFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenClusSecGrpMembList(), false );
		}
		return( tabViewChildrenClusSecGrpMembListPane );
	}

	protected class RefreshChildrenTentSecGrpMembList
	implements ICFRefreshCallback
	{
		public RefreshChildrenTentSecGrpMembList() {
		}

		public void refreshMe() {
			Collection<ISecureSecTentGrpMembObj> dataCollection;
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenTentSecGrpMemb( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenTentSecGrpMembListPane();
			ISecureJavaFXSecTentGrpMembPaneList jpList = (ISecureJavaFXSecTentGrpMembPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenTentSecGrpMembListPane() {
		if( tabViewChildrenTentSecGrpMembListPane == null ) {
			ISecureSecUserObj focus = (ISecureSecUserObj)getJavaFXFocusAsSecUser();
			ISecureSecTentGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecTentGrpObj ) ) {
				javafxContainer = (ISecureSecTentGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenTentSecGrpMembListPane = javafxSchema.getSecTentGrpMembFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenTentSecGrpMembList(), false );
		}
		return( tabViewChildrenTentSecGrpMembListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
	if( tabViewComponentsPasswordAttrPane != null ) {
		((ISecureJavaFXSecUserPasswordPaneCommon)tabViewComponentsPasswordAttrPane).setPaneMode( CFPane.PaneMode.View );
	}
	if( tabViewComponentsEMConfAttrPane != null ) {
		((ISecureJavaFXSecUserEMConfPaneCommon)tabViewComponentsEMConfAttrPane).setPaneMode( CFPane.PaneMode.View );
	}
	if( tabViewComponentsPWResetAttrPane != null ) {
		((ISecureJavaFXSecUserPWResetPaneCommon)tabViewComponentsPWResetAttrPane).setPaneMode( CFPane.PaneMode.View );
	}
	if( tabViewChildrenPWHistoryAttrPane != null ) {
		((ISecureJavaFXSecUserPWHistoryPaneCommon)tabViewChildrenPWHistoryAttrPane).setPaneMode( CFPane.PaneMode.View );
	}
		if( tabViewComponentsSecSessListPane != null ) {
			((ISecureJavaFXSecSessionPaneCommon)tabViewComponentsSecSessListPane).setPaneMode( value );
		}
		if( tabViewChildrenSecProxyListPane != null ) {
			((ISecureJavaFXSecSessionPaneCommon)tabViewChildrenSecProxyListPane).setPaneMode( value );
		}
		if( tabViewChildrenSysSecGrpMembListPane != null ) {
			((ISecureJavaFXSecSysGrpMembPaneCommon)tabViewChildrenSysSecGrpMembListPane).setPaneMode( value );
		}
		if( tabViewChildrenClusSecGrpMembListPane != null ) {
			((ISecureJavaFXSecClusGrpMembPaneCommon)tabViewChildrenClusSecGrpMembListPane).setPaneMode( value );
		}
		if( tabViewChildrenTentSecGrpMembListPane != null ) {
			((ISecureJavaFXSecTentGrpMembPaneCommon)tabViewChildrenTentSecGrpMembListPane).setPaneMode( value );
		}
	}
}
