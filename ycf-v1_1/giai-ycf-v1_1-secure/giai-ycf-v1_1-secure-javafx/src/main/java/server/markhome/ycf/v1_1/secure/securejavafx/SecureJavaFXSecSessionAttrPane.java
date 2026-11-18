// Description: Java 25 JavaFX Attribute Pane implementation for SecSession.

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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.Inz;
import server.markhome.cf.javafx.*;
import server.markhome.cf.javafx.CFReferenceEditor.ICFReferenceCallback;
import org.apache.commons.codec.binaryCFCore64;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;

/**
 *	SecureJavaFXSecSessionAttrPane JavaFX Attribute Pane implementation
 *	for SecSession.
 */
public class SecureJavaFXSecSessionAttrPane
extends CFGridPane
implements ISecureJavaFXSecSessionPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	boolean javafxIsInitializing = true;

	protected class SecSessionProxyCFLabel
		extends CFLabel
	{
		public SecSessionProxyCFLabel() {
			super();
			setText(Inz.s("secure.javafx.SecSession.AttrPane.ParentSecProxy.EffLabel"));
		}
	}

	protected class CallbackSecSessionProxyChosen
	implements ISecureJavaFXSecUserChosen
	{
		public CallbackSecSessionProxyChosen() {
		}

		public void choseSecUser( ISecureSecUserObj value ) {
			if( javafxReferenceParentSecProxy != null ) {
				ISecureSecSessionObj cur = getJavaFXFocusAsSecSession();
				if( cur != null ) {
					ISecureSecSessionEditObj editObj = (ISecureSecSessionEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceParentSecProxy.setReferencedObject( value );
							editObj.setRequiredParentSecProxy( value );
						}
					}
				}
			}
		}
	}

	protected class SecSessionProxyReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
			ISecureSecSessionObj focus = getEffJavaFXFocus();
			ISecureSecUserObj referencedObj = (ISecureSecUserObj)javafxReferenceParentSecProxy.getReferencedObject();
			java.util.List<ISecureSecUserObj> listOfSecUser = null;
			listOfSecUser = schemaObj.getSecUserTableObj().readAllSecUser();
			if( listOfSecUser == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"listOfSecUser" );
			}
			Collection<ISecureSecUserObj> cltn = listOfSecUser;
			CFBorderPane form = javafxSchema.getSecUserFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackSecSessionProxyChosen() );
			((ISecureJavaFXSecUserPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ISecureSecSessionObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ISecureSecUserObj referencedObj = (ISecureSecUserObj)javafxReferenceParentSecProxy.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					int classCode = referencedObj.getClassCode();
					ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
					int backingClassCode = entry.getBackingClassCode();
					if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureSecUser.CLASS_CODE ) {
						form = javafxSchema.getSecUserFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ISecureJavaFXSecUserPaneCommon spec = (ISecureJavaFXSecUserPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ISecureSecUserObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class SecSessionProxyCFReferenceEditor
		extends CFReferenceEditor
	{
		public SecSessionProxyCFReferenceEditor() {
			super( new SecSessionProxyReferenceCallback() );
			setFieldNameInzTag( "secure.javafx.SecSession.AttrPane.SecSessionProxy.EffLabel" );
		}
	}

	protected class SecSessionIdCFLabel
		extends CFLabel
	{
		public SecSessionIdCFLabel() {
			super();
			setText(Inz.s("secure.javafx.SecSession.AttrPane.SecSessionId.EffLabel"));
		}
	}

	protected class SecSessionIdEditor
		extends CFDbKeyHash256Editor
	{
		public SecSessionIdEditor() {
			super();
			setFieldNameInzTag( "secure.javafx.SecSession.AttrPane.SecSessionId.EffLabel" );
		}
	}

	protected class StartCFLabel
		extends CFLabel
	{
		public StartCFLabel() {
			super();
			setText(Inz.s("secure.javafx.SecSession.AttrPane.Start.EffLabel"));
		}
	}

	protected class StartEditor
		extends CFTimestampEditor
	{
		public StartEditor() {
			super();
			setFieldNameInzTag( "secure.javafx.SecSession.AttrPane.Start.EffLabel" );
		}
	}

	protected class FinishCFLabel
		extends CFLabel
	{
		public FinishCFLabel() {
			super();
			setText(Inz.s("secure.javafx.SecSession.AttrPane.Finish.EffLabel"));
		}
	}

	protected class FinishEditor
		extends CFTimestampEditor
	{
		public FinishEditor() {
			super();
			setFieldNameInzTag( "secure.javafx.SecSession.AttrPane.Finish.EffLabel" );
		}
	}

	protected ISecureSecUserObj javafxParentSecProxyObj = null;
	protected SecSessionProxyCFLabel javafxLabelParentSecProxy = null;
	protected SecSessionProxyCFReferenceEditor javafxReferenceParentSecProxy = null;
	protected SecSessionIdCFLabel javafxLabelSecSessionId = null;
	protected SecSessionIdEditor javafxEditorSecSessionId = null;
	protected StartCFLabel javafxLabelStart = null;
	protected StartEditor javafxEditorStart = null;
	protected FinishCFLabel javafxLabelFinish = null;
	protected FinishEditor javafxEditorFinish = null;

	public SecureJavaFXSecSessionAttrPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureSecSessionObj argFocus ) {
		super();
		Control ctrl;
		CFLabel label;
		CFReferenceEditor reference;
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
		setJavaFXFocusAsSecSession( argFocus );
		setPadding( new Insets(5) );
		setHgap( 5 );
		setVgap( 5 );
		setAlignment( Pos.CENTER );
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth( 100 );
		getColumnConstraints().addAll( column1 );
		int gridRow = 0;
		label = getJavaFXLabelParentSecProxy();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceParentSecProxy();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelSecSessionId();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorSecSessionId();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelStart();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorStart();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelFinish();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorFinish();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		populateFields();
		adjustComponentEnableStates();
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
		if( ( value == null ) || ( value instanceof ISecureSecSessionObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureSecSessionObj" );
		}
		populateFields();
		adjustComponentEnableStates();
	}

	public ISecureSecSessionObj getJavaFXFocusAsSecSession() {
		return( (ISecureSecSessionObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSecSession( ISecureSecSessionObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureSecSessionObj getEffJavaFXFocus() {
		ISecureSecSessionObj eff = (ISecureSecSessionObj)getJavaFXFocus();
		if( eff != null ) {
			if( null != eff.getEdit() ) {
				eff = (ISecureSecSessionObj)eff.getEdit();
			}
		}
		return( eff );
	}

	public ISecureSecUserObj getJavaFXParentSecProxyObj() {
		return( javafxParentSecProxyObj );
	}

	public void setJavaFXParentSecProxyObj( ISecureSecUserObj value ) {
		javafxParentSecProxyObj = value;
	}

	public CFLabel getJavaFXLabelParentSecProxy() {
		if( javafxLabelParentSecProxy == null ) {
			javafxLabelParentSecProxy = new SecSessionProxyCFLabel();
		}
		return( javafxLabelParentSecProxy );
	}

	public CFReferenceEditor getJavaFXReferenceParentSecProxy() {
		if( javafxReferenceParentSecProxy == null ) {
			javafxReferenceParentSecProxy = new SecSessionProxyCFReferenceEditor();
		}
		return( javafxReferenceParentSecProxy );
	}

	public void setJavaFXReferenceParentSecProxy( SecSessionProxyCFReferenceEditor value ) {
		javafxReferenceParentSecProxy = value;
	}

	public SecSessionIdCFLabel getJavaFXLabelSecSessionId() {
		if( javafxLabelSecSessionId == null ) {
			javafxLabelSecSessionId = new SecSessionIdCFLabel();
		}
		return( javafxLabelSecSessionId );
	}

	public void setJavaFXLabelSecSessionId( SecSessionIdCFLabel value ) {
		javafxLabelSecSessionId = value;
	}

	public SecSessionIdEditor getJavaFXEditorSecSessionId() {
		if( javafxEditorSecSessionId == null ) {
			javafxEditorSecSessionId = new SecSessionIdEditor();
		}
		return( javafxEditorSecSessionId );
	}

	public void setJavaFXEditorSecSessionId( SecSessionIdEditor value ) {
		javafxEditorSecSessionId = value;
	}

	public StartCFLabel getJavaFXLabelStart() {
		if( javafxLabelStart == null ) {
			javafxLabelStart = new StartCFLabel();
		}
		return( javafxLabelStart );
	}

	public void setJavaFXLabelStart( StartCFLabel value ) {
		javafxLabelStart = value;
	}

	public StartEditor getJavaFXEditorStart() {
		if( javafxEditorStart == null ) {
			javafxEditorStart = new StartEditor();
		}
		return( javafxEditorStart );
	}

	public void setJavaFXEditorStart( StartEditor value ) {
		javafxEditorStart = value;
	}

	public FinishCFLabel getJavaFXLabelFinish() {
		if( javafxLabelFinish == null ) {
			javafxLabelFinish = new FinishCFLabel();
		}
		return( javafxLabelFinish );
	}

	public void setJavaFXLabelFinish( FinishCFLabel value ) {
		javafxLabelFinish = value;
	}

	public FinishEditor getJavaFXEditorFinish() {
		if( javafxEditorFinish == null ) {
			javafxEditorFinish = new FinishEditor();
		}
		return( javafxEditorFinish );
	}

	public void setJavaFXEditorFinish( FinishEditor value ) {
		javafxEditorFinish = value;
	}

	public void populateFields()
	{
		ISecureSecSessionObj popObj = getEffJavaFXFocus();
		if( getPaneMode() == CFPane.PaneMode.Unknown ) {
			popObj = null;
		}
		if( popObj == null ) {
			javafxParentSecProxyObj = null;
		}
		else {
			javafxParentSecProxyObj = (ISecureSecUserObj)popObj.getRequiredParentSecProxy( javafxIsInitializing );
		}
		if( javafxReferenceParentSecProxy != null ) {
			javafxReferenceParentSecProxy.setReferencedObject( javafxParentSecProxyObj );
		}

		if( popObj == null ) {
			getJavaFXEditorSecSessionId().setDbKeyHash256Value( null );
		}
		else {
			getJavaFXEditorSecSessionId().setDbKeyHash256Value( popObj.getRequiredSecSessionId() );
		}

		if( popObj == null ) {
			getJavaFXEditorStart().setTimestampValue( null );
		}
		else {
			getJavaFXEditorStart().setTimestampValue( popObj.getRequiredStart() );
		}

		if( popObj == null ) {
			getJavaFXEditorFinish().setTimestampValue( null );
		}
		else {
			getJavaFXEditorFinish().setTimestampValue( popObj.getOptionalFinish() );
		}
	}

	public void postFields()
	{
		final String S_ProcName = "postFields";
		ISecureSecSessionObj focus = getJavaFXFocusAsSecSession();
		ISecureSecSessionEditObj editObj;
		if( focus != null ) {
			editObj = (ISecureSecSessionEditObj)(focus.getEdit());
		}
		else {
			editObj = null;
		}
		if( editObj == null ) {
			throw new CFLibUsageException( getClass(),
				S_ProcName,
				Inz.s("cflibjavafx.common.PaneIsUnfocusedOrNotEditing"),
				Inz.x("cflibjavafx.common.PaneIsUnfocusedOrNotEditing") );
		}

		javafxParentSecProxyObj = (ISecureSecUserObj)( javafxReferenceParentSecProxy.getReferencedObject() );
		editObj.setRequiredParentSecProxy( javafxParentSecProxyObj );

		editObj.setRequiredStart( getJavaFXEditorStart().getTimestampValue() );

		editObj.setOptionalFinish( getJavaFXEditorFinish().getTimestampValue() );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		ISecureSecSessionObj focus = getJavaFXFocusAsSecSession();
		if( ( value != CFPane.PaneMode.Unknown ) && ( value != CFPane.PaneMode.View ) ) {
			if( focus == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"javaFXFocus" );
			}
		}
		ISecureSecSessionEditObj editObj;
		if( focus != null ) {
			editObj  = (ISecureSecSessionEditObj)focus.getEdit();
		}
		else {
			editObj = null;
		}
		switch( value ) {
			case Unknown:
				switch( oldValue ) {
					case Unknown:
						break;
					default:
						if( editObj != null ) {
							editObj.endEdit();
							editObj = null;
						}
						break;
				}
				break;
			case Add:
				switch( oldValue ) {
					case Unknown:
					case Add:
					case View:
						if( editObj == null ) {
							if( focus != null ) {
								if( ! focus.getIsNew() ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										Inz.x("cflibjavafx.common.MustBeNew"),
										Inz.s("cflibjavafx.common.MustBeNew") );
								}
								editObj = (ISecureSecSessionEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
										Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
								}
							}
							else {
								throw new CFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"focus" );
							}
						}
						break;
					case Edit:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							Inz.x("cflibjavafx.common.CannotTransitionEditToAdd"),
							Inz.s("cflibjavafx.common.CannotTransitionEditToAdd") );
					case Update:
						if( ( editObj == null ) || ( ! editObj.getIsNew() ) ) {
							throw new CFLibUsageException( getClass(),
								S_ProcName,
								Inz.x("cflibjavafx.common.CannotTransitionUpdateToAdd"),
								Inz.s("cflibjavafx.common.CannotTransitionUpdateToAdd") );
						}
						break;
					case Delete:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							Inz.x("cflibjavafx.common.CannotTransitionDeleteToAdd"),
							Inz.s("cflibjavafx.common.CannotTransitionDeleteToAdd") );
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							Inz.x("cflibjavafx.common.CannotTransitionDefaultToAdd"),
							Inz.s("cflibjavafx.common.CannotTransitionDefaultToAdd") );
				}
				break;
			case View:
				switch( oldValue ) {
					case Unknown:
						break;
					case View:
						break;
					case Edit:
						break;
					case Update:
						break;
					case Delete:
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToView"), oldValue),
							String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToView"), oldValue) );
				}
				if( editObj != null ) {
					editObj.endEdit();
					editObj = null;
				}
				break;
			case Edit:
				switch( oldValue ) {
					case Unknown:
						if( editObj == null ) {
							editObj = (ISecureSecSessionEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					case View:
						if( editObj == null ) {
							editObj = (ISecureSecSessionEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					case Edit:
						if( editObj == null ) {
							editObj = (ISecureSecSessionEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					case Update:
						if( editObj == null ) {
							throw new CFLibUsageException( getClass(),
								S_ProcName,
								String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue),
								String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue) );
						}
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue),
							String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue) );
				}
				break;
			case Update:
				if( ( oldValue != CFPane.PaneMode.Edit ) && ( oldValue != CFPane.PaneMode.Add ) ) {
					throw new CFLibUsageException( getClass(),
						S_ProcName,
						String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToUpdate"), oldValue),
						String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToUpdate"), oldValue) );
				}
				super.setPaneMode( value );
				if( editObj != null ) {
					postFields();
					if( editObj.getIsNew() ) {
						focus = (ISecureSecSessionObj)editObj.create();
						setJavaFXFocus( focus );
					}
					else {
						editObj.update();
					}
					editObj = null;
				}
				setPaneMode( CFPane.PaneMode.View );
				break;
			case Delete:
				switch( oldValue ) {
					case View:
						if( focus != null ) {
							if( editObj == null ) {
								editObj = (ISecureSecSessionEditObj)focus.beginEdit();
								if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
								}
							}
						}
						break;
					case Edit:
						if( focus != null ) {
							if( editObj == null ) {
								editObj = (ISecureSecSessionEditObj)focus.beginEdit();
								if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
								}
							}
						}
						break;
					case Update:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToDelete"), oldValue),
							String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToDelete"), oldValue) );
					case Delete:
						if( editObj == null ) {
							editObj = (ISecureSecSessionEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToDelete"), oldValue),
							String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToDelete"), oldValue) );
				}
				editObj.deleteInstance();
				editObj = null;
				setJavaFXFocus( null );
				setPaneMode( CFPane.PaneMode.Unknown );
				break;
			default:
				switch( oldValue ) {
					case Unknown:
						break;
					default:
						if( editObj != null ) {
							editObj.endEdit();
							editObj = null;
						}
						break;
				}
				break;
		}
		super.setPaneMode( value );
		populateFields();
		adjustComponentEnableStates();
	}

	public void adjustComponentEnableStates() {
		CFPane.PaneMode mode = getPaneMode();
		boolean isEditing;
		switch( mode ) {
			case Unknown:
			case View:
			case Delete:
				isEditing = false;
				break;
			case Add:
			case Edit:
			case Update:
				isEditing = true;
				break;
			default:
				isEditing = false;
				break;
		}
		if( isEditing ) {
			ISecureSecSessionObj focus = getJavaFXFocusAsSecSession();
			if( focus == null ) {
				isEditing = false;
			}
			else if( null == focus.getEdit() ) {
				isEditing = false;
			}
		}
		if( javafxReferenceParentSecProxy != null ) {
			javafxReferenceParentSecProxy.setCustomDisable( ! isEditing );
		}
		if( javafxEditorSecSessionId != null ) {
			javafxEditorSecSessionId.setDisable( true );
		}
		if( javafxEditorStart != null ) {
			javafxEditorStart.setDisable( ! isEditing );
		}
		if( javafxEditorFinish != null ) {
			javafxEditorFinish.setDisable( ! isEditing );
		}
	}
}
