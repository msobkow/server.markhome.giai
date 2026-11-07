// Description: Java 25 JavaFX Attribute Pane implementation for ISOCtryCcy.

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
 *	SecureJavaFXISOCtryCcyAttrPane JavaFX Attribute Pane implementation
 *	for ISOCtryCcy.
 */
public class SecureJavaFXISOCtryCcyAttrPane
extends CFGridPane
implements ISecureJavaFXISOCtryCcyPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ISecureJavaFXSchema javafxSchema = null;
	boolean javafxIsInitializing = true;

	protected class ISOCtryCcyCcyCFLabel
		extends CFLabel
	{
		public ISOCtryCcyCcyCFLabel() {
			super();
			setText(Inz.s("secure.javafx.ISOCtryCcy.AttrPane.ParentCcy.EffLabel"));
		}
	}

	protected class CallbackISOCtryCcyCcyChosen
	implements ISecureJavaFXISOCcyChosen
	{
		public CallbackISOCtryCcyCcyChosen() {
		}

		public void choseISOCcy( ISecureISOCcyObj value ) {
			if( javafxReferenceParentCcy != null ) {
				ISecureISOCtryCcyObj cur = getJavaFXFocusAsISOCtryCcy();
				if( cur != null ) {
					ISecureISOCtryCcyEditObj editObj = (ISecureISOCtryCcyEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceParentCcy.setReferencedObject( value );
							editObj.setRequiredParentCcy( value );
						}
					}
				}
			}
		}
	}

	protected class ISOCtryCcyCcyReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ISecureSchemaObj schemaObj = (ISecureSchemaObj)javafxSchema.getSchema();
			ISecureISOCtryCcyObj focus = getEffJavaFXFocus();
			ISecureISOCcyObj referencedObj = (ISecureISOCcyObj)javafxReferenceParentCcy.getReferencedObject();
			java.util.List<ISecureISOCcyObj> listOfISOCcy = null;
			listOfISOCcy = schemaObj.getISOCcyTableObj().readAllISOCcy();
			if( listOfISOCcy == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"listOfISOCcy" );
			}
			Collection<ISecureISOCcyObj> cltn = listOfISOCcy;
			CFBorderPane form = javafxSchema.getISOCcyFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackISOCtryCcyCcyChosen() );
			((ISecureJavaFXISOCcyPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ISecureISOCtryCcyObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ISecureISOCcyObj referencedObj = (ISecureISOCcyObj)javafxReferenceParentCcy.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					int classCode = referencedObj.getClassCode();
					ISecureSchema.ClassMapEntry entry = ISecureSchema.getClassMapByRuntimeClassCode(classCode);
					int backingClassCode = entry.getBackingClassCode();
					if( entry.getSchemaName().equals("Secure") && backingClassCode == ISecureISOCcy.CLASS_CODE ) {
						form = javafxSchema.getISOCcyFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ISecureJavaFXISOCcyPaneCommon spec = (ISecureJavaFXISOCcyPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ISecureISOCcyObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class ISOCtryCcyCcyCFReferenceEditor
		extends CFReferenceEditor
	{
		public ISOCtryCcyCcyCFReferenceEditor() {
			super( new ISOCtryCcyCcyReferenceCallback() );
			setFieldNameInzTag( "secure.javafx.ISOCtryCcy.AttrPane.ISOCtryCcyCcy.EffLabel" );
		}
	}

	protected ISecureISOCcyObj javafxParentCcyObj = null;
	protected ISOCtryCcyCcyCFLabel javafxLabelParentCcy = null;
	protected ISOCtryCcyCcyCFReferenceEditor javafxReferenceParentCcy = null;

	public SecureJavaFXISOCtryCcyAttrPane( ICFFormManager formManager, ISecureJavaFXSchema argSchema, ISecureISOCtryCcyObj argFocus ) {
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
		setJavaFXFocusAsISOCtryCcy( argFocus );
		setPadding( new Insets(5) );
		setHgap( 5 );
		setVgap( 5 );
		setAlignment( Pos.CENTER );
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth( 100 );
		getColumnConstraints().addAll( column1 );
		int gridRow = 0;
		label = getJavaFXLabelParentCcy();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceParentCcy();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
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
		if( ( value == null ) || ( value instanceof ISecureISOCtryCcyObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ISecureISOCtryCcyObj" );
		}
		populateFields();
		adjustComponentEnableStates();
	}

	public ISecureISOCtryCcyObj getJavaFXFocusAsISOCtryCcy() {
		return( (ISecureISOCtryCcyObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsISOCtryCcy( ISecureISOCtryCcyObj value ) {
		setJavaFXFocus( value );
	}

	public ISecureISOCtryCcyObj getEffJavaFXFocus() {
		ISecureISOCtryCcyObj eff = (ISecureISOCtryCcyObj)getJavaFXFocus();
		if( eff != null ) {
			if( null != eff.getEdit() ) {
				eff = (ISecureISOCtryCcyObj)eff.getEdit();
			}
		}
		return( eff );
	}

	public ISecureISOCcyObj getJavaFXParentCcyObj() {
		return( javafxParentCcyObj );
	}

	public void setJavaFXParentCcyObj( ISecureISOCcyObj value ) {
		javafxParentCcyObj = value;
	}

	public CFLabel getJavaFXLabelParentCcy() {
		if( javafxLabelParentCcy == null ) {
			javafxLabelParentCcy = new ISOCtryCcyCcyCFLabel();
		}
		return( javafxLabelParentCcy );
	}

	public CFReferenceEditor getJavaFXReferenceParentCcy() {
		if( javafxReferenceParentCcy == null ) {
			javafxReferenceParentCcy = new ISOCtryCcyCcyCFReferenceEditor();
		}
		return( javafxReferenceParentCcy );
	}

	public void setJavaFXReferenceParentCcy( ISOCtryCcyCcyCFReferenceEditor value ) {
		javafxReferenceParentCcy = value;
	}

	public void populateFields()
	{
		ISecureISOCtryCcyObj popObj = getEffJavaFXFocus();
		if( getPaneMode() == CFPane.PaneMode.Unknown ) {
			popObj = null;
		}
		if( popObj == null ) {
			javafxParentCcyObj = null;
		}
		else {
			javafxParentCcyObj = (ISecureISOCcyObj)popObj.getRequiredParentCcy( javafxIsInitializing );
		}
		if( javafxReferenceParentCcy != null ) {
			javafxReferenceParentCcy.setReferencedObject( javafxParentCcyObj );
		}
	}

	public void postFields()
	{
		final String S_ProcName = "postFields";
		ISecureISOCtryCcyObj focus = getJavaFXFocusAsISOCtryCcy();
		ISecureISOCtryCcyEditObj editObj;
		if( focus != null ) {
			editObj = (ISecureISOCtryCcyEditObj)(focus.getEdit());
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

		javafxParentCcyObj = (ISecureISOCcyObj)( javafxReferenceParentCcy.getReferencedObject() );
		editObj.setRequiredParentCcy( javafxParentCcyObj );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		ISecureISOCtryCcyObj focus = getJavaFXFocusAsISOCtryCcy();
		if( ( value != CFPane.PaneMode.Unknown ) && ( value != CFPane.PaneMode.View ) ) {
			if( focus == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"javaFXFocus" );
			}
		}
		ISecureISOCtryCcyEditObj editObj;
		if( focus != null ) {
			editObj  = (ISecureISOCtryCcyEditObj)focus.getEdit();
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
								editObj = (ISecureISOCtryCcyEditObj)focus.beginEdit();
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
							editObj = (ISecureISOCtryCcyEditObj)focus.beginEdit();
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
							editObj = (ISecureISOCtryCcyEditObj)focus.beginEdit();
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
							editObj = (ISecureISOCtryCcyEditObj)focus.beginEdit();
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
						focus = (ISecureISOCtryCcyObj)editObj.create();
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
								editObj = (ISecureISOCtryCcyEditObj)focus.beginEdit();
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
								editObj = (ISecureISOCtryCcyEditObj)focus.beginEdit();
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
							editObj = (ISecureISOCtryCcyEditObj)focus.beginEdit();
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
			ISecureISOCtryCcyObj focus = getJavaFXFocusAsISOCtryCcy();
			if( focus == null ) {
				isEditing = false;
			}
			else if( null == focus.getEdit() ) {
				isEditing = false;
			}
		}
		if( javafxReferenceParentCcy != null ) {
			javafxReferenceParentCcy.setCustomDisable( ! isEditing );
		}
	}
}
