// Description: Java 25 JavaFX Attribute Pane implementation for SchemaRef.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.busmodel.busmodeljavafx;

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;
import server.markhome.ycf.v3_1.secure.securejavafx.*;
import server.markhome.ycf.v3_1.intnet.intnetjavafx.*;

/**
 *	BusModelJavaFXSchemaRefAttrPane JavaFX Attribute Pane implementation
 *	for SchemaRef.
 */
public class BusModelJavaFXSchemaRefAttrPane
extends CFGridPane
implements IBusModelJavaFXSchemaRefPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchema javafxSchema = null;
	boolean javafxIsInitializing = true;

	protected class RefSchemaCFLabel
		extends CFLabel
	{
		public RefSchemaCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.SchemaRef.AttrPane.LookupRefSchema.EffLabel"));
		}
	}

	protected class CallbackRefSchemaChosen
	implements IBusModelJavaFXSchemaDefChosen
	{
		public CallbackRefSchemaChosen() {
		}

		public void choseSchemaDef( IBusModelSchemaDefObj value ) {
			if( javafxReferenceLookupRefSchema != null ) {
				IBusModelSchemaRefObj cur = getJavaFXFocusAsSchemaRef();
				if( cur != null ) {
					IBusModelSchemaRefEditObj editObj = (IBusModelSchemaRefEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupRefSchema.setReferencedObject( value );
							editObj.setOptionalLookupRefSchema( value );
						}
					}
				}
			}
		}
	}

	protected class RefSchemaReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
			IBusModelSchemaRefObj focus = getEffJavaFXFocus();
			IBusModelSchemaDefObj referencedObj = (IBusModelSchemaDefObj)javafxReferenceLookupRefSchema.getReferencedObject();
			java.util.List<IBusModelSchemaDefObj> listOfSchemaDef = null;
			Collection<IBusModelSchemaDefObj> cltn = null;
			CFBorderPane form = javafxSchema.getSchemaDefFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackRefSchemaChosen() );
			((IBusModelJavaFXSchemaDefPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			IBusModelSchemaRefObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				IBusModelSchemaDefObj referencedObj = (IBusModelSchemaDefObj)javafxReferenceLookupRefSchema.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					int classCode = referencedObj.getClassCode();
					ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
					int backingClassCode = entry.getBackingClassCode();
					if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelSchemaDef.CLASS_CODE ) {
						form = javafxSchema.getSchemaDefFactory().newAddForm( cfFormManager, referencedObj, null, true );
						IBusModelJavaFXSchemaDefPaneCommon spec = (IBusModelJavaFXSchemaDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"IBusModelSchemaDefObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class RefSchemaCFReferenceEditor
		extends CFReferenceEditor
	{
		public RefSchemaCFReferenceEditor() {
			super( new RefSchemaReferenceCallback() );
			setFieldNameInzTag( "busmodel.javafx.SchemaRef.AttrPane.RefSchema.EffLabel" );
		}
	}

	protected class IdCFLabel
		extends CFLabel
	{
		public IdCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Scope.AttrPane.Id.EffLabel"));
		}
	}

	protected class IdEditor
		extends CFDbKeyHash256Editor
	{
		public IdEditor() {
			super();
			setFieldNameInzTag( "busmodel.javafx.Scope.AttrPane.Id.EffLabel" );
		}
	}

	protected class NameCFLabel
		extends CFLabel
	{
		public NameCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.SchemaRef.AttrPane.Name.EffLabel"));
		}
	}

	protected class NameEditor
		extends CFStringEditor
	{
		public NameEditor() {
			super();
			setMaxLen( 192 );
			setFieldNameInzTag( "busmodel.javafx.SchemaRef.AttrPane.Name.EffLabel" );
		}
	}

	protected class RefModelNameCFLabel
		extends CFLabel
	{
		public RefModelNameCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.SchemaRef.AttrPane.RefModelName.EffLabel"));
		}
	}

	protected class RefModelNameEditor
		extends CFStringEditor
	{
		public RefModelNameEditor() {
			super();
			setMaxLen( 1024 );
			setFieldNameInzTag( "busmodel.javafx.SchemaRef.AttrPane.RefModelName.EffLabel" );
		}
	}

	protected class IncludeRootCFLabel
		extends CFLabel
	{
		public IncludeRootCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.SchemaRef.AttrPane.IncludeRoot.EffLabel"));
		}
	}

	protected class IncludeRootEditor
		extends CFStringEditor
	{
		public IncludeRootEditor() {
			super();
			setMaxLen( 1024 );
			setFieldNameInzTag( "busmodel.javafx.SchemaRef.AttrPane.IncludeRoot.EffLabel" );
		}
	}

	protected IBusModelSchemaDefObj javafxLookupRefSchemaObj = null;
	protected RefSchemaCFLabel javafxLabelLookupRefSchema = null;
	protected RefSchemaCFReferenceEditor javafxReferenceLookupRefSchema = null;
	protected IdCFLabel javafxLabelId = null;
	protected IdEditor javafxEditorId = null;
	protected NameCFLabel javafxLabelName = null;
	protected NameEditor javafxEditorName = null;
	protected RefModelNameCFLabel javafxLabelRefModelName = null;
	protected RefModelNameEditor javafxEditorRefModelName = null;
	protected IncludeRootCFLabel javafxLabelIncludeRoot = null;
	protected IncludeRootEditor javafxEditorIncludeRoot = null;

	public BusModelJavaFXSchemaRefAttrPane( ICFFormManager formManager, IBusModelJavaFXSchema argSchema, IBusModelSchemaRefObj argFocus ) {
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
		setJavaFXFocusAsSchemaRef( argFocus );
		setPadding( new Insets(5) );
		setHgap( 5 );
		setVgap( 5 );
		setAlignment( Pos.CENTER );
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth( 100 );
		getColumnConstraints().addAll( column1 );
		int gridRow = 0;
		label = getJavaFXLabelLookupRefSchema();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupRefSchema();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelId();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorId();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelRefModelName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorRefModelName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelIncludeRoot();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorIncludeRoot();
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

	public IBusModelJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof IBusModelSchemaRefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelSchemaRefObj" );
		}
		populateFields();
		adjustComponentEnableStates();
	}

	public IBusModelSchemaRefObj getJavaFXFocusAsSchemaRef() {
		return( (IBusModelSchemaRefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSchemaRef( IBusModelSchemaRefObj value ) {
		setJavaFXFocus( value );
	}

	public IBusModelSchemaRefObj getEffJavaFXFocus() {
		IBusModelSchemaRefObj eff = (IBusModelSchemaRefObj)getJavaFXFocus();
		if( eff != null ) {
			if( null != eff.getEdit() ) {
				eff = (IBusModelSchemaRefObj)eff.getEdit();
			}
		}
		return( eff );
	}

	public IBusModelSchemaDefObj getJavaFXLookupRefSchemaObj() {
		return( javafxLookupRefSchemaObj );
	}

	public void setJavaFXLookupRefSchemaObj( IBusModelSchemaDefObj value ) {
		javafxLookupRefSchemaObj = value;
	}

	public CFLabel getJavaFXLabelLookupRefSchema() {
		if( javafxLabelLookupRefSchema == null ) {
			javafxLabelLookupRefSchema = new RefSchemaCFLabel();
		}
		return( javafxLabelLookupRefSchema );
	}

	public CFReferenceEditor getJavaFXReferenceLookupRefSchema() {
		if( javafxReferenceLookupRefSchema == null ) {
			javafxReferenceLookupRefSchema = new RefSchemaCFReferenceEditor();
		}
		return( javafxReferenceLookupRefSchema );
	}

	public void setJavaFXReferenceLookupRefSchema( RefSchemaCFReferenceEditor value ) {
		javafxReferenceLookupRefSchema = value;
	}

	public IdCFLabel getJavaFXLabelId() {
		if( javafxLabelId == null ) {
			javafxLabelId = new IdCFLabel();
		}
		return( javafxLabelId );
	}

	public void setJavaFXLabelId( IdCFLabel value ) {
		javafxLabelId = value;
	}

	public IdEditor getJavaFXEditorId() {
		if( javafxEditorId == null ) {
			javafxEditorId = new IdEditor();
		}
		return( javafxEditorId );
	}

	public void setJavaFXEditorId( IdEditor value ) {
		javafxEditorId = value;
	}

	public NameCFLabel getJavaFXLabelName() {
		if( javafxLabelName == null ) {
			javafxLabelName = new NameCFLabel();
		}
		return( javafxLabelName );
	}

	public void setJavaFXLabelName( NameCFLabel value ) {
		javafxLabelName = value;
	}

	public NameEditor getJavaFXEditorName() {
		if( javafxEditorName == null ) {
			javafxEditorName = new NameEditor();
		}
		return( javafxEditorName );
	}

	public void setJavaFXEditorName( NameEditor value ) {
		javafxEditorName = value;
	}

	public RefModelNameCFLabel getJavaFXLabelRefModelName() {
		if( javafxLabelRefModelName == null ) {
			javafxLabelRefModelName = new RefModelNameCFLabel();
		}
		return( javafxLabelRefModelName );
	}

	public void setJavaFXLabelRefModelName( RefModelNameCFLabel value ) {
		javafxLabelRefModelName = value;
	}

	public RefModelNameEditor getJavaFXEditorRefModelName() {
		if( javafxEditorRefModelName == null ) {
			javafxEditorRefModelName = new RefModelNameEditor();
		}
		return( javafxEditorRefModelName );
	}

	public void setJavaFXEditorRefModelName( RefModelNameEditor value ) {
		javafxEditorRefModelName = value;
	}

	public IncludeRootCFLabel getJavaFXLabelIncludeRoot() {
		if( javafxLabelIncludeRoot == null ) {
			javafxLabelIncludeRoot = new IncludeRootCFLabel();
		}
		return( javafxLabelIncludeRoot );
	}

	public void setJavaFXLabelIncludeRoot( IncludeRootCFLabel value ) {
		javafxLabelIncludeRoot = value;
	}

	public IncludeRootEditor getJavaFXEditorIncludeRoot() {
		if( javafxEditorIncludeRoot == null ) {
			javafxEditorIncludeRoot = new IncludeRootEditor();
		}
		return( javafxEditorIncludeRoot );
	}

	public void setJavaFXEditorIncludeRoot( IncludeRootEditor value ) {
		javafxEditorIncludeRoot = value;
	}

	public void populateFields()
	{
		IBusModelSchemaRefObj popObj = getEffJavaFXFocus();
		if( getPaneMode() == CFPane.PaneMode.Unknown ) {
			popObj = null;
		}
		if( popObj == null ) {
			javafxLookupRefSchemaObj = null;
		}
		else {
			javafxLookupRefSchemaObj = (IBusModelSchemaDefObj)popObj.getOptionalLookupRefSchema( javafxIsInitializing );
		}
		if( javafxReferenceLookupRefSchema != null ) {
			javafxReferenceLookupRefSchema.setReferencedObject( javafxLookupRefSchemaObj );
		}

		if( popObj == null ) {
			getJavaFXEditorId().setDbKeyHash256Value( null );
		}
		else {
			getJavaFXEditorId().setDbKeyHash256Value( popObj.getRequiredId() );
		}

		if( popObj == null ) {
			getJavaFXEditorName().setStringValue( null );
		}
		else {
			getJavaFXEditorName().setStringValue( popObj.getRequiredName() );
		}

		if( popObj == null ) {
			getJavaFXEditorRefModelName().setStringValue( null );
		}
		else {
			getJavaFXEditorRefModelName().setStringValue( popObj.getRequiredRefModelName() );
		}

		if( popObj == null ) {
			getJavaFXEditorIncludeRoot().setStringValue( null );
		}
		else {
			getJavaFXEditorIncludeRoot().setStringValue( popObj.getRequiredIncludeRoot() );
		}
	}

	public void postFields()
	{
		final String S_ProcName = "postFields";
		IBusModelSchemaRefObj focus = getJavaFXFocusAsSchemaRef();
		IBusModelSchemaRefEditObj editObj;
		if( focus != null ) {
			editObj = (IBusModelSchemaRefEditObj)(focus.getEdit());
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

		javafxLookupRefSchemaObj = (IBusModelSchemaDefObj)( javafxReferenceLookupRefSchema.getReferencedObject() );
		editObj.setOptionalLookupRefSchema( javafxLookupRefSchemaObj );

		if( getJavaFXEditorName().getStringValue() == null ) {
			editObj.setRequiredName( "" );
		}
		else {
			editObj.setRequiredName( getJavaFXEditorName().getStringValue() );
		}

		if( getJavaFXEditorRefModelName().getStringValue() == null ) {
			editObj.setRequiredRefModelName( "" );
		}
		else {
			editObj.setRequiredRefModelName( getJavaFXEditorRefModelName().getStringValue() );
		}

		if( getJavaFXEditorIncludeRoot().getStringValue() == null ) {
			editObj.setRequiredIncludeRoot( "" );
		}
		else {
			editObj.setRequiredIncludeRoot( getJavaFXEditorIncludeRoot().getStringValue() );
		}
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		IBusModelSchemaRefObj focus = getJavaFXFocusAsSchemaRef();
		if( ( value != CFPane.PaneMode.Unknown ) && ( value != CFPane.PaneMode.View ) ) {
			if( focus == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"javaFXFocus" );
			}
		}
		IBusModelSchemaRefEditObj editObj;
		if( focus != null ) {
			editObj  = (IBusModelSchemaRefEditObj)focus.getEdit();
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
								editObj = (IBusModelSchemaRefEditObj)focus.beginEdit();
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
							editObj = (IBusModelSchemaRefEditObj)focus.beginEdit();
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
							editObj = (IBusModelSchemaRefEditObj)focus.beginEdit();
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
							editObj = (IBusModelSchemaRefEditObj)focus.beginEdit();
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
						focus = (IBusModelSchemaRefObj)editObj.create();
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
								editObj = (IBusModelSchemaRefEditObj)focus.beginEdit();
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
								editObj = (IBusModelSchemaRefEditObj)focus.beginEdit();
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
							editObj = (IBusModelSchemaRefEditObj)focus.beginEdit();
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
			IBusModelSchemaRefObj focus = getJavaFXFocusAsSchemaRef();
			if( focus == null ) {
				isEditing = false;
			}
			else if( null == focus.getEdit() ) {
				isEditing = false;
			}
		}
		if( javafxReferenceLookupRefSchema != null ) {
			javafxReferenceLookupRefSchema.setCustomDisable( ! isEditing );
		}
		if( javafxEditorId != null ) {
			javafxEditorId.setDisable( true );
		}
		if( javafxEditorName != null ) {
			javafxEditorName.setDisable( ! isEditing );
		}
		if( javafxEditorRefModelName != null ) {
			javafxEditorRefModelName.setDisable( ! isEditing );
		}
		if( javafxEditorIncludeRoot != null ) {
			javafxEditorIncludeRoot.setDisable( ! isEditing );
		}
	}
}
