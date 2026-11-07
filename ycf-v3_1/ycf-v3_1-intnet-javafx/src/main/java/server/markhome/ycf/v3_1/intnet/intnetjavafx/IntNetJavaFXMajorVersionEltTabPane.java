// Description: Java 25 JavaFX Element TabPane implementation for MajorVersion.

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;

/**
 *	IntNetJavaFXMajorVersionEltTabPane JavaFX Element TabPane implementation
 *	for MajorVersion.
 */
public class IntNetJavaFXMajorVersionEltTabPane
extends CFTabPane
implements IIntNetJavaFXMajorVersionPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected IIntNetJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsMinorVerList = "Optional Components Minor Version";
	protected CFTab tabComponentsMinorVer = null;
	protected CFBorderPane tabViewComponentsMinorVerListPane = null;

	public IntNetJavaFXMajorVersionEltTabPane( ICFFormManager formManager, IIntNetJavaFXSchema argSchema, IIntNetMajorVersionObj argFocus ) {
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
		setJavaFXFocusAsMajorVersion( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsMinorVer = new CFTab();
		tabComponentsMinorVer.setText( LABEL_TabComponentsMinorVerList );
		tabComponentsMinorVer.setContent( getTabViewComponentsMinorVerListPane() );
		getTabs().add( tabComponentsMinorVer );
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

	public IIntNetJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IIntNetMajorVersionObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IIntNetMajorVersionObj" );
		}
	}

	public void setJavaFXFocusAsMajorVersion( IIntNetMajorVersionObj value ) {
		setJavaFXFocus( value );
	}

	public IIntNetMajorVersionObj getJavaFXFocusAsMajorVersion() {
		return( (IIntNetMajorVersionObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsMinorVerList
	implements ICFRefreshCallback
	{
		public RefreshComponentsMinorVerList() {
		}

		public void refreshMe() {
			Collection<IIntNetMinorVersionObj> dataCollection;
			IIntNetMajorVersionObj focus = (IIntNetMajorVersionObj)getJavaFXFocusAsMajorVersion();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsMinorVer( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsMinorVerListPane();
			IIntNetJavaFXMinorVersionPaneList jpList = (IIntNetJavaFXMinorVersionPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsMinorVerListPane() {
		if( tabViewComponentsMinorVerListPane == null ) {
			IIntNetMajorVersionObj focus = (IIntNetMajorVersionObj)getJavaFXFocusAsMajorVersion();
			IIntNetMajorVersionObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof IIntNetMajorVersionObj ) ) {
				javafxContainer = (IIntNetMajorVersionObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsMinorVerListPane = javafxSchema.getMinorVersionFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsMinorVerList(), false );
		}
		return( tabViewComponentsMinorVerListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsMinorVerListPane != null ) {
			((IIntNetJavaFXMinorVersionPaneCommon)tabViewComponentsMinorVerListPane).setPaneMode( value );
		}
	}
}
