// Description: Java 25 JavaFX Element TabPane implementation for ISOCtry.

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
 *	SecureJavaFXISOCtryEltTabPane JavaFX Element TabPane implementation
 *	for ISOCtry.
 */
public class SecureJavaFXISOCtryEltTabPane
extends CFTabPane
implements ISecureJavaFXISOCtryPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsCcyList = "Optional Components Ccy";
	protected CFTab tabComponentsCcy = null;
	public final String LABEL_TabComponentsLangList = "Optional Components Lang";
	protected CFTab tabComponentsLang = null;
	protected CFBorderPane tabViewComponentsCcyListPane = null;
	protected CFBorderPane tabViewComponentsLangListPane = null;

	public SecureJavaFXISOCtryEltTabPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureISOCtryObj argFocus ) {
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
		setJavaFXFocusAsISOCtry( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsCcy = new CFTab();
		tabComponentsCcy.setText( LABEL_TabComponentsCcyList );
		tabComponentsCcy.setContent( getTabViewComponentsCcyListPane() );
		getTabs().add( tabComponentsCcy );
		tabComponentsLang = new CFTab();
		tabComponentsLang.setText( LABEL_TabComponentsLangList );
		tabComponentsLang.setContent( getTabViewComponentsLangListPane() );
		getTabs().add( tabComponentsLang );
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
		if( ( value == null ) || ( value instanceof ISecureISOCtryObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureISOCtryObj" );
		}
	}

	public void setJavaFXFocusAsISOCtry( ISecureISOCtryObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureISOCtryObj getJavaFXFocusAsISOCtry() {
		return( (ISecureISOCtryObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsCcyList
	implements ICFRefreshCallback
	{
		public RefreshComponentsCcyList() {
		}

		public void refreshMe() {
			Collection<ISecureISOCtryCcyObj> dataCollection;
			ISecureISOCtryObj focus = (ISecureISOCtryObj)getJavaFXFocusAsISOCtry();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsCcy( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsCcyListPane();
			ISecureJavaFXISOCtryCcyPaneList jpList = (ISecureJavaFXISOCtryCcyPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsCcyListPane() {
		if( tabViewComponentsCcyListPane == null ) {
			ISecureISOCtryObj focus = (ISecureISOCtryObj)getJavaFXFocusAsISOCtry();
			ISecureISOCtryObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureISOCtryObj ) ) {
				javafxContainer = (ISecureISOCtryObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsCcyListPane = javafxSchema.getISOCtryCcyFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsCcyList(), false );
		}
		return( tabViewComponentsCcyListPane );
	}

	protected class RefreshComponentsLangList
	implements ICFRefreshCallback
	{
		public RefreshComponentsLangList() {
		}

		public void refreshMe() {
			Collection<ISecureISOCtryLangObj> dataCollection;
			ISecureISOCtryObj focus = (ISecureISOCtryObj)getJavaFXFocusAsISOCtry();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsLang( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsLangListPane();
			ISecureJavaFXISOCtryLangPaneList jpList = (ISecureJavaFXISOCtryLangPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsLangListPane() {
		if( tabViewComponentsLangListPane == null ) {
			ISecureISOCtryObj focus = (ISecureISOCtryObj)getJavaFXFocusAsISOCtry();
			ISecureISOCtryObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureISOCtryObj ) ) {
				javafxContainer = (ISecureISOCtryObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsLangListPane = javafxSchema.getISOCtryLangFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsLangList(), false );
		}
		return( tabViewComponentsLangListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsCcyListPane != null ) {
			((ISecureJavaFXISOCtryCcyPaneCommon)tabViewComponentsCcyListPane).setPaneMode( value );
		}
		if( tabViewComponentsLangListPane != null ) {
			((ISecureJavaFXISOCtryLangPaneCommon)tabViewComponentsLangListPane).setPaneMode( value );
		}
	}
}
