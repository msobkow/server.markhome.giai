// Description: Java 25 JavaFX Element TabPane implementation for SecClusGrp.

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
 *	SecureJavaFXSecClusGrpEltTabPane JavaFX Element TabPane implementation
 *	for SecClusGrp.
 */
public class SecureJavaFXSecClusGrpEltTabPane
extends CFTabPane
implements ISecureJavaFXSecClusGrpPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabChildrenMembByGrpList = "Optional Children Members of Group";
	protected CFTab tabChildrenMembByGrp = null;
	protected CFBorderPane tabViewChildrenMembByGrpListPane = null;

	public SecureJavaFXSecClusGrpEltTabPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureSecClusGrpObj argFocus ) {
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
		setJavaFXFocusAsSecClusGrp( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabChildrenMembByGrp = new CFTab();
		tabChildrenMembByGrp.setText( LABEL_TabChildrenMembByGrpList );
		tabChildrenMembByGrp.setContent( getTabViewChildrenMembByGrpListPane() );
		getTabs().add( tabChildrenMembByGrp );
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
		if( ( value == null ) || ( value instanceof ISecureSecClusGrpObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecClusGrpObj" );
		}
	}

	public void setJavaFXFocusAsSecClusGrp( ISecureSecClusGrpObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureSecClusGrpObj getJavaFXFocusAsSecClusGrp() {
		return( (ISecureSecClusGrpObj)getJavaFXFocus() );
	}

	protected class RefreshChildrenMembByGrpList
	implements ICFRefreshCallback
	{
		public RefreshChildrenMembByGrpList() {
		}

		public void refreshMe() {
			Collection<ISecureSecClusGrpMembObj> dataCollection;
			ISecureSecClusGrpObj focus = (ISecureSecClusGrpObj)getJavaFXFocusAsSecClusGrp();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenMembByGrp( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenMembByGrpListPane();
			ISecureJavaFXSecClusGrpMembPaneList jpList = (ISecureJavaFXSecClusGrpMembPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenMembByGrpListPane() {
		if( tabViewChildrenMembByGrpListPane == null ) {
			ISecureSecClusGrpObj focus = (ISecureSecClusGrpObj)getJavaFXFocusAsSecClusGrp();
			ISecureSecClusGrpObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ISecureSecClusGrpObj ) ) {
				javafxContainer = (ISecureSecClusGrpObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenMembByGrpListPane = javafxSchema.getSecClusGrpMembFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenMembByGrpList(), false );
		}
		return( tabViewChildrenMembByGrpListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewChildrenMembByGrpListPane != null ) {
			((ISecureJavaFXSecClusGrpMembPaneCommon)tabViewChildrenMembByGrpListPane).setPaneMode( value );
		}
	}
}
