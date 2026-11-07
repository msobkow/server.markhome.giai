// Description: Java 25 JavaFX Element TabPane implementation for ISOCcy.

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
 *	SecureJavaFXISOCcyEltTabPane JavaFX Element TabPane implementation
 *	for ISOCcy.
 */
public class SecureJavaFXISOCcyEltTabPane
extends CFTabPane
implements ISecureJavaFXISOCcyPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabChildrenCtryList = "Optional Children Ctry";
	protected CFTab tabChildrenCtry = null;
	protected CFBorderPane tabViewChildrenCtryListPane = null;

	public SecureJavaFXISOCcyEltTabPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureISOCcyObj argFocus ) {
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
		setJavaFXFocusAsISOCcy( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabChildrenCtry = new CFTab();
		tabChildrenCtry.setText( LABEL_TabChildrenCtryList );
		tabChildrenCtry.setContent( getTabViewChildrenCtryListPane() );
		getTabs().add( tabChildrenCtry );
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
		if( ( value == null ) || ( value instanceof ISecureISOCcyObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureISOCcyObj" );
		}
	}

	public void setJavaFXFocusAsISOCcy( ISecureISOCcyObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureISOCcyObj getJavaFXFocusAsISOCcy() {
		return( (ISecureISOCcyObj)getJavaFXFocus() );
	}

	protected class RefreshChildrenCtryList
	implements ICFRefreshCallback
	{
		public RefreshChildrenCtryList() {
		}

		public void refreshMe() {
			Collection<ISecureISOCtryCcyObj> dataCollection;
			ISecureISOCcyObj focus = (ISecureISOCcyObj)getJavaFXFocusAsISOCcy();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenCtry( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenCtryListPane();
			ISecureJavaFXISOCtryCcyPaneList jpList = (ISecureJavaFXISOCtryCcyPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenCtryListPane() {
		if( tabViewChildrenCtryListPane == null ) {
			ISecureISOCcyObj focus = (ISecureISOCcyObj)getJavaFXFocusAsISOCcy();
			ISecureISOCtryObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureISOCtryObj ) ) {
				javafxContainer = (ISecureISOCtryObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenCtryListPane = javafxSchema.getISOCtryCcyFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenCtryList(), false );
		}
		return( tabViewChildrenCtryListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewChildrenCtryListPane != null ) {
			((ISecureJavaFXISOCtryCcyPaneCommon)tabViewChildrenCtryListPane).setPaneMode( value );
		}
	}
}
