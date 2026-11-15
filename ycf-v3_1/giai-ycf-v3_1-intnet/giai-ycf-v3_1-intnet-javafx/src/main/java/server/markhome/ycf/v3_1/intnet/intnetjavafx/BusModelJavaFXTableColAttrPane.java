// Description: Java 25 JavaFX Attribute Pane implementation for TableCol.

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
 *	BusModelJavaFXTableColAttrPane JavaFX Attribute Pane implementation
 *	for TableCol.
 */
public class BusModelJavaFXTableColAttrPane
extends CFGridPane
implements IBusModelJavaFXTableColPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected IBusModelJavaFXSchema javafxSchema = null;
	boolean javafxIsInitializing = true;

	protected class DataTypeCFLabel
		extends CFLabel
	{
		public DataTypeCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.TableCol.AttrPane.ParentDataType.EffLabel"));
		}
	}

	protected class CallbackDataTypeChosen
	implements IBusModelJavaFXValueChosen
	{
		public CallbackDataTypeChosen() {
		}

		public void choseValue( IBusModelValueObj value ) {
			if( javafxReferenceParentDataType != null ) {
				IBusModelTableColObj cur = getJavaFXFocusAsTableCol();
				if( cur != null ) {
					IBusModelTableColEditObj editObj = (IBusModelTableColEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceParentDataType.setReferencedObject( value );
							editObj.setRequiredParentDataType( value );
						}
					}
				}
			}
		}
	}

	protected class DataTypeReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
			IBusModelTableColObj focus = getEffJavaFXFocus();
			IBusModelValueObj referencedObj = (IBusModelValueObj)javafxReferenceParentDataType.getReferencedObject();
			java.util.List<IBusModelValueObj> listOfValue = null;
			IBusModelTableObj refTable = (IBusModelTableObj)focus.getRequiredContainerTable( javafxIsInitializing );
			if( refTable == null ) {
				CFConsole.message( String.format(Inz.s("cflibjavafx.common.SpecifyRelationBeforeSelectingTarget"), Inz.s("busmodel.javafx.TableCol.AttrPane.ContainerTable.EffLabel"), Inz.s("busmodel.javafx.TableCol.AttrPane.ParentDataType.EffLabel")));
				return;
			}
			IBusModelSchemaDefObj refSchemaDef = refTable.getRequiredContainerSchemaDef( javafxIsInitializing );
			if( refSchemaDef == null ) {
				CFConsole.message( String.format(Inz.s("cflibjavafx.common.SpecifyRelationBeforeSelectingTarget"), Inz.s("busmodel.javafx.Table.AttrPane.ContainerSchemaDef.EffLabel"), Inz.s("busmodel.javafx.TableCol.AttrPane.ParentDataType.EffLabel")));
				return;
			}
			listOfValue = refSchemaDef.getOptionalComponentsTypes( javafxIsInitializing );
			if( listOfValue == null ) {
				throw IYCFNullArgumentException.getService().getInstance( getClass(),
					S_ProcName,
					0,
					"listOfValue" );
			}
			Collection<IBusModelValueObj> cltn = listOfValue;
			CFBorderPane form = javafxSchema.getValueFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackDataTypeChosen() );
			((IBusModelJavaFXValuePaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			IBusModelTableColObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				IBusModelValueObj referencedObj = (IBusModelValueObj)javafxReferenceParentDataType.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					int classCode = referencedObj.getClassCode();
					ISecureSchema.ClassMapEntry entry = IBusModelSchema.getClassMapByRuntimeClassCode(classCode);
					int backingClassCode = entry.getBackingClassCode();
					if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelValue.CLASS_CODE ) {
						form = javafxSchema.getValueFactory().newAddForm( cfFormManager, referencedObj, null, true );
						IBusModelJavaFXValuePaneCommon spec = (IBusModelJavaFXValuePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelAtom.CLASS_CODE ) {
						IBusModelAtomObj obj = (IBusModelAtomObj)referencedObj;
						form = javafxSchema.getAtomFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXAtomPaneCommon spec = (IBusModelJavaFXAtomPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobDef.CLASS_CODE ) {
						IBusModelBlobDefObj obj = (IBusModelBlobDefObj)referencedObj;
						form = javafxSchema.getBlobDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXBlobDefPaneCommon spec = (IBusModelJavaFXBlobDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobType.CLASS_CODE ) {
						IBusModelBlobTypeObj obj = (IBusModelBlobTypeObj)referencedObj;
						form = javafxSchema.getBlobTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXBlobTypePaneCommon spec = (IBusModelJavaFXBlobTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBlobCol.CLASS_CODE ) {
						IBusModelBlobColObj obj = (IBusModelBlobColObj)referencedObj;
						form = javafxSchema.getBlobColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXBlobColPaneCommon spec = (IBusModelJavaFXBlobColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolDef.CLASS_CODE ) {
						IBusModelBoolDefObj obj = (IBusModelBoolDefObj)referencedObj;
						form = javafxSchema.getBoolDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXBoolDefPaneCommon spec = (IBusModelJavaFXBoolDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolType.CLASS_CODE ) {
						IBusModelBoolTypeObj obj = (IBusModelBoolTypeObj)referencedObj;
						form = javafxSchema.getBoolTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXBoolTypePaneCommon spec = (IBusModelJavaFXBoolTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelBoolCol.CLASS_CODE ) {
						IBusModelBoolColObj obj = (IBusModelBoolColObj)referencedObj;
						form = javafxSchema.getBoolColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXBoolColPaneCommon spec = (IBusModelJavaFXBoolColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateDef.CLASS_CODE ) {
						IBusModelDateDefObj obj = (IBusModelDateDefObj)referencedObj;
						form = javafxSchema.getDateDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDateDefPaneCommon spec = (IBusModelJavaFXDateDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateType.CLASS_CODE ) {
						IBusModelDateTypeObj obj = (IBusModelDateTypeObj)referencedObj;
						form = javafxSchema.getDateTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDateTypePaneCommon spec = (IBusModelJavaFXDateTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDateCol.CLASS_CODE ) {
						IBusModelDateColObj obj = (IBusModelDateColObj)referencedObj;
						form = javafxSchema.getDateColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDateColPaneCommon spec = (IBusModelJavaFXDateColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleDef.CLASS_CODE ) {
						IBusModelDoubleDefObj obj = (IBusModelDoubleDefObj)referencedObj;
						form = javafxSchema.getDoubleDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDoubleDefPaneCommon spec = (IBusModelJavaFXDoubleDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleType.CLASS_CODE ) {
						IBusModelDoubleTypeObj obj = (IBusModelDoubleTypeObj)referencedObj;
						form = javafxSchema.getDoubleTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDoubleTypePaneCommon spec = (IBusModelJavaFXDoubleTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDoubleCol.CLASS_CODE ) {
						IBusModelDoubleColObj obj = (IBusModelDoubleColObj)referencedObj;
						form = javafxSchema.getDoubleColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDoubleColPaneCommon spec = (IBusModelJavaFXDoubleColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatDef.CLASS_CODE ) {
						IBusModelFloatDefObj obj = (IBusModelFloatDefObj)referencedObj;
						form = javafxSchema.getFloatDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXFloatDefPaneCommon spec = (IBusModelJavaFXFloatDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatType.CLASS_CODE ) {
						IBusModelFloatTypeObj obj = (IBusModelFloatTypeObj)referencedObj;
						form = javafxSchema.getFloatTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXFloatTypePaneCommon spec = (IBusModelJavaFXFloatTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelFloatCol.CLASS_CODE ) {
						IBusModelFloatColObj obj = (IBusModelFloatColObj)referencedObj;
						form = javafxSchema.getFloatColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXFloatColPaneCommon spec = (IBusModelJavaFXFloatColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Def.CLASS_CODE ) {
						IBusModelInt16DefObj obj = (IBusModelInt16DefObj)referencedObj;
						form = javafxSchema.getInt16DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt16DefPaneCommon spec = (IBusModelJavaFXInt16DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Type.CLASS_CODE ) {
						IBusModelInt16TypeObj obj = (IBusModelInt16TypeObj)referencedObj;
						form = javafxSchema.getInt16TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt16TypePaneCommon spec = (IBusModelJavaFXInt16TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId16Gen.CLASS_CODE ) {
						IBusModelId16GenObj obj = (IBusModelId16GenObj)referencedObj;
						form = javafxSchema.getId16GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXId16GenPaneCommon spec = (IBusModelJavaFXId16GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumDef.CLASS_CODE ) {
						IBusModelEnumDefObj obj = (IBusModelEnumDefObj)referencedObj;
						form = javafxSchema.getEnumDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXEnumDefPaneCommon spec = (IBusModelJavaFXEnumDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelEnumType.CLASS_CODE ) {
						IBusModelEnumTypeObj obj = (IBusModelEnumTypeObj)referencedObj;
						form = javafxSchema.getEnumTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXEnumTypePaneCommon spec = (IBusModelJavaFXEnumTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt16Col.CLASS_CODE ) {
						IBusModelInt16ColObj obj = (IBusModelInt16ColObj)referencedObj;
						form = javafxSchema.getInt16ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt16ColPaneCommon spec = (IBusModelJavaFXInt16ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Def.CLASS_CODE ) {
						IBusModelInt32DefObj obj = (IBusModelInt32DefObj)referencedObj;
						form = javafxSchema.getInt32DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt32DefPaneCommon spec = (IBusModelJavaFXInt32DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Type.CLASS_CODE ) {
						IBusModelInt32TypeObj obj = (IBusModelInt32TypeObj)referencedObj;
						form = javafxSchema.getInt32TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt32TypePaneCommon spec = (IBusModelJavaFXInt32TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId32Gen.CLASS_CODE ) {
						IBusModelId32GenObj obj = (IBusModelId32GenObj)referencedObj;
						form = javafxSchema.getId32GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXId32GenPaneCommon spec = (IBusModelJavaFXId32GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt32Col.CLASS_CODE ) {
						IBusModelInt32ColObj obj = (IBusModelInt32ColObj)referencedObj;
						form = javafxSchema.getInt32ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt32ColPaneCommon spec = (IBusModelJavaFXInt32ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Def.CLASS_CODE ) {
						IBusModelInt64DefObj obj = (IBusModelInt64DefObj)referencedObj;
						form = javafxSchema.getInt64DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt64DefPaneCommon spec = (IBusModelJavaFXInt64DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Type.CLASS_CODE ) {
						IBusModelInt64TypeObj obj = (IBusModelInt64TypeObj)referencedObj;
						form = javafxSchema.getInt64TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt64TypePaneCommon spec = (IBusModelJavaFXInt64TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelId64Gen.CLASS_CODE ) {
						IBusModelId64GenObj obj = (IBusModelId64GenObj)referencedObj;
						form = javafxSchema.getId64GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXId64GenPaneCommon spec = (IBusModelJavaFXId64GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelInt64Col.CLASS_CODE ) {
						IBusModelInt64ColObj obj = (IBusModelInt64ColObj)referencedObj;
						form = javafxSchema.getInt64ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXInt64ColPaneCommon spec = (IBusModelJavaFXInt64ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenDef.CLASS_CODE ) {
						IBusModelNmTokenDefObj obj = (IBusModelNmTokenDefObj)referencedObj;
						form = javafxSchema.getNmTokenDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNmTokenDefPaneCommon spec = (IBusModelJavaFXNmTokenDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenType.CLASS_CODE ) {
						IBusModelNmTokenTypeObj obj = (IBusModelNmTokenTypeObj)referencedObj;
						form = javafxSchema.getNmTokenTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNmTokenTypePaneCommon spec = (IBusModelJavaFXNmTokenTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokenCol.CLASS_CODE ) {
						IBusModelNmTokenColObj obj = (IBusModelNmTokenColObj)referencedObj;
						form = javafxSchema.getNmTokenColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNmTokenColPaneCommon spec = (IBusModelJavaFXNmTokenColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensDef.CLASS_CODE ) {
						IBusModelNmTokensDefObj obj = (IBusModelNmTokensDefObj)referencedObj;
						form = javafxSchema.getNmTokensDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNmTokensDefPaneCommon spec = (IBusModelJavaFXNmTokensDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensType.CLASS_CODE ) {
						IBusModelNmTokensTypeObj obj = (IBusModelNmTokensTypeObj)referencedObj;
						form = javafxSchema.getNmTokensTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNmTokensTypePaneCommon spec = (IBusModelJavaFXNmTokensTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNmTokensCol.CLASS_CODE ) {
						IBusModelNmTokensColObj obj = (IBusModelNmTokensColObj)referencedObj;
						form = javafxSchema.getNmTokensColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNmTokensColPaneCommon spec = (IBusModelJavaFXNmTokensColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberDef.CLASS_CODE ) {
						IBusModelNumberDefObj obj = (IBusModelNumberDefObj)referencedObj;
						form = javafxSchema.getNumberDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNumberDefPaneCommon spec = (IBusModelJavaFXNumberDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberType.CLASS_CODE ) {
						IBusModelNumberTypeObj obj = (IBusModelNumberTypeObj)referencedObj;
						form = javafxSchema.getNumberTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNumberTypePaneCommon spec = (IBusModelJavaFXNumberTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelNumberCol.CLASS_CODE ) {
						IBusModelNumberColObj obj = (IBusModelNumberColObj)referencedObj;
						form = javafxSchema.getNumberColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXNumberColPaneCommon spec = (IBusModelJavaFXNumberColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Def.CLASS_CODE ) {
						IBusModelDbKeyHash128DefObj obj = (IBusModelDbKeyHash128DefObj)referencedObj;
						form = javafxSchema.getDbKeyHash128DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash128DefPaneCommon spec = (IBusModelJavaFXDbKeyHash128DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Col.CLASS_CODE ) {
						IBusModelDbKeyHash128ColObj obj = (IBusModelDbKeyHash128ColObj)referencedObj;
						form = javafxSchema.getDbKeyHash128ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash128ColPaneCommon spec = (IBusModelJavaFXDbKeyHash128ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Type.CLASS_CODE ) {
						IBusModelDbKeyHash128TypeObj obj = (IBusModelDbKeyHash128TypeObj)referencedObj;
						form = javafxSchema.getDbKeyHash128TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash128TypePaneCommon spec = (IBusModelJavaFXDbKeyHash128TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash128Gen.CLASS_CODE ) {
						IBusModelDbKeyHash128GenObj obj = (IBusModelDbKeyHash128GenObj)referencedObj;
						form = javafxSchema.getDbKeyHash128GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash128GenPaneCommon spec = (IBusModelJavaFXDbKeyHash128GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Def.CLASS_CODE ) {
						IBusModelDbKeyHash160DefObj obj = (IBusModelDbKeyHash160DefObj)referencedObj;
						form = javafxSchema.getDbKeyHash160DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash160DefPaneCommon spec = (IBusModelJavaFXDbKeyHash160DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Col.CLASS_CODE ) {
						IBusModelDbKeyHash160ColObj obj = (IBusModelDbKeyHash160ColObj)referencedObj;
						form = javafxSchema.getDbKeyHash160ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash160ColPaneCommon spec = (IBusModelJavaFXDbKeyHash160ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Type.CLASS_CODE ) {
						IBusModelDbKeyHash160TypeObj obj = (IBusModelDbKeyHash160TypeObj)referencedObj;
						form = javafxSchema.getDbKeyHash160TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash160TypePaneCommon spec = (IBusModelJavaFXDbKeyHash160TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash160Gen.CLASS_CODE ) {
						IBusModelDbKeyHash160GenObj obj = (IBusModelDbKeyHash160GenObj)referencedObj;
						form = javafxSchema.getDbKeyHash160GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash160GenPaneCommon spec = (IBusModelJavaFXDbKeyHash160GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Def.CLASS_CODE ) {
						IBusModelDbKeyHash224DefObj obj = (IBusModelDbKeyHash224DefObj)referencedObj;
						form = javafxSchema.getDbKeyHash224DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash224DefPaneCommon spec = (IBusModelJavaFXDbKeyHash224DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Col.CLASS_CODE ) {
						IBusModelDbKeyHash224ColObj obj = (IBusModelDbKeyHash224ColObj)referencedObj;
						form = javafxSchema.getDbKeyHash224ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash224ColPaneCommon spec = (IBusModelJavaFXDbKeyHash224ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Type.CLASS_CODE ) {
						IBusModelDbKeyHash224TypeObj obj = (IBusModelDbKeyHash224TypeObj)referencedObj;
						form = javafxSchema.getDbKeyHash224TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash224TypePaneCommon spec = (IBusModelJavaFXDbKeyHash224TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash224Gen.CLASS_CODE ) {
						IBusModelDbKeyHash224GenObj obj = (IBusModelDbKeyHash224GenObj)referencedObj;
						form = javafxSchema.getDbKeyHash224GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash224GenPaneCommon spec = (IBusModelJavaFXDbKeyHash224GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Def.CLASS_CODE ) {
						IBusModelDbKeyHash256DefObj obj = (IBusModelDbKeyHash256DefObj)referencedObj;
						form = javafxSchema.getDbKeyHash256DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash256DefPaneCommon spec = (IBusModelJavaFXDbKeyHash256DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Col.CLASS_CODE ) {
						IBusModelDbKeyHash256ColObj obj = (IBusModelDbKeyHash256ColObj)referencedObj;
						form = javafxSchema.getDbKeyHash256ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash256ColPaneCommon spec = (IBusModelJavaFXDbKeyHash256ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Type.CLASS_CODE ) {
						IBusModelDbKeyHash256TypeObj obj = (IBusModelDbKeyHash256TypeObj)referencedObj;
						form = javafxSchema.getDbKeyHash256TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash256TypePaneCommon spec = (IBusModelJavaFXDbKeyHash256TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash256Gen.CLASS_CODE ) {
						IBusModelDbKeyHash256GenObj obj = (IBusModelDbKeyHash256GenObj)referencedObj;
						form = javafxSchema.getDbKeyHash256GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash256GenPaneCommon spec = (IBusModelJavaFXDbKeyHash256GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Def.CLASS_CODE ) {
						IBusModelDbKeyHash384DefObj obj = (IBusModelDbKeyHash384DefObj)referencedObj;
						form = javafxSchema.getDbKeyHash384DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash384DefPaneCommon spec = (IBusModelJavaFXDbKeyHash384DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Col.CLASS_CODE ) {
						IBusModelDbKeyHash384ColObj obj = (IBusModelDbKeyHash384ColObj)referencedObj;
						form = javafxSchema.getDbKeyHash384ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash384ColPaneCommon spec = (IBusModelJavaFXDbKeyHash384ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Type.CLASS_CODE ) {
						IBusModelDbKeyHash384TypeObj obj = (IBusModelDbKeyHash384TypeObj)referencedObj;
						form = javafxSchema.getDbKeyHash384TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash384TypePaneCommon spec = (IBusModelJavaFXDbKeyHash384TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash384Gen.CLASS_CODE ) {
						IBusModelDbKeyHash384GenObj obj = (IBusModelDbKeyHash384GenObj)referencedObj;
						form = javafxSchema.getDbKeyHash384GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash384GenPaneCommon spec = (IBusModelJavaFXDbKeyHash384GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Def.CLASS_CODE ) {
						IBusModelDbKeyHash512DefObj obj = (IBusModelDbKeyHash512DefObj)referencedObj;
						form = javafxSchema.getDbKeyHash512DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash512DefPaneCommon spec = (IBusModelJavaFXDbKeyHash512DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Col.CLASS_CODE ) {
						IBusModelDbKeyHash512ColObj obj = (IBusModelDbKeyHash512ColObj)referencedObj;
						form = javafxSchema.getDbKeyHash512ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash512ColPaneCommon spec = (IBusModelJavaFXDbKeyHash512ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Type.CLASS_CODE ) {
						IBusModelDbKeyHash512TypeObj obj = (IBusModelDbKeyHash512TypeObj)referencedObj;
						form = javafxSchema.getDbKeyHash512TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash512TypePaneCommon spec = (IBusModelJavaFXDbKeyHash512TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelDbKeyHash512Gen.CLASS_CODE ) {
						IBusModelDbKeyHash512GenObj obj = (IBusModelDbKeyHash512GenObj)referencedObj;
						form = javafxSchema.getDbKeyHash512GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXDbKeyHash512GenPaneCommon spec = (IBusModelJavaFXDbKeyHash512GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringDef.CLASS_CODE ) {
						IBusModelStringDefObj obj = (IBusModelStringDefObj)referencedObj;
						form = javafxSchema.getStringDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXStringDefPaneCommon spec = (IBusModelJavaFXStringDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringType.CLASS_CODE ) {
						IBusModelStringTypeObj obj = (IBusModelStringTypeObj)referencedObj;
						form = javafxSchema.getStringTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXStringTypePaneCommon spec = (IBusModelJavaFXStringTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelStringCol.CLASS_CODE ) {
						IBusModelStringColObj obj = (IBusModelStringColObj)referencedObj;
						form = javafxSchema.getStringColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXStringColPaneCommon spec = (IBusModelJavaFXStringColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateDef.CLASS_CODE ) {
						IBusModelTZDateDefObj obj = (IBusModelTZDateDefObj)referencedObj;
						form = javafxSchema.getTZDateDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZDateDefPaneCommon spec = (IBusModelJavaFXTZDateDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateType.CLASS_CODE ) {
						IBusModelTZDateTypeObj obj = (IBusModelTZDateTypeObj)referencedObj;
						form = javafxSchema.getTZDateTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZDateTypePaneCommon spec = (IBusModelJavaFXTZDateTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZDateCol.CLASS_CODE ) {
						IBusModelTZDateColObj obj = (IBusModelTZDateColObj)referencedObj;
						form = javafxSchema.getTZDateColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZDateColPaneCommon spec = (IBusModelJavaFXTZDateColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeDef.CLASS_CODE ) {
						IBusModelTZTimeDefObj obj = (IBusModelTZTimeDefObj)referencedObj;
						form = javafxSchema.getTZTimeDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZTimeDefPaneCommon spec = (IBusModelJavaFXTZTimeDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeType.CLASS_CODE ) {
						IBusModelTZTimeTypeObj obj = (IBusModelTZTimeTypeObj)referencedObj;
						form = javafxSchema.getTZTimeTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZTimeTypePaneCommon spec = (IBusModelJavaFXTZTimeTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimeCol.CLASS_CODE ) {
						IBusModelTZTimeColObj obj = (IBusModelTZTimeColObj)referencedObj;
						form = javafxSchema.getTZTimeColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZTimeColPaneCommon spec = (IBusModelJavaFXTZTimeColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampDef.CLASS_CODE ) {
						IBusModelTZTimestampDefObj obj = (IBusModelTZTimestampDefObj)referencedObj;
						form = javafxSchema.getTZTimestampDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZTimestampDefPaneCommon spec = (IBusModelJavaFXTZTimestampDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampType.CLASS_CODE ) {
						IBusModelTZTimestampTypeObj obj = (IBusModelTZTimestampTypeObj)referencedObj;
						form = javafxSchema.getTZTimestampTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZTimestampTypePaneCommon spec = (IBusModelJavaFXTZTimestampTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTZTimestampCol.CLASS_CODE ) {
						IBusModelTZTimestampColObj obj = (IBusModelTZTimestampColObj)referencedObj;
						form = javafxSchema.getTZTimestampColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTZTimestampColPaneCommon spec = (IBusModelJavaFXTZTimestampColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextDef.CLASS_CODE ) {
						IBusModelTextDefObj obj = (IBusModelTextDefObj)referencedObj;
						form = javafxSchema.getTextDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTextDefPaneCommon spec = (IBusModelJavaFXTextDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextType.CLASS_CODE ) {
						IBusModelTextTypeObj obj = (IBusModelTextTypeObj)referencedObj;
						form = javafxSchema.getTextTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTextTypePaneCommon spec = (IBusModelJavaFXTextTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTextCol.CLASS_CODE ) {
						IBusModelTextColObj obj = (IBusModelTextColObj)referencedObj;
						form = javafxSchema.getTextColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTextColPaneCommon spec = (IBusModelJavaFXTextColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeDef.CLASS_CODE ) {
						IBusModelTimeDefObj obj = (IBusModelTimeDefObj)referencedObj;
						form = javafxSchema.getTimeDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTimeDefPaneCommon spec = (IBusModelJavaFXTimeDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeType.CLASS_CODE ) {
						IBusModelTimeTypeObj obj = (IBusModelTimeTypeObj)referencedObj;
						form = javafxSchema.getTimeTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTimeTypePaneCommon spec = (IBusModelJavaFXTimeTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimeCol.CLASS_CODE ) {
						IBusModelTimeColObj obj = (IBusModelTimeColObj)referencedObj;
						form = javafxSchema.getTimeColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTimeColPaneCommon spec = (IBusModelJavaFXTimeColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampDef.CLASS_CODE ) {
						IBusModelTimestampDefObj obj = (IBusModelTimestampDefObj)referencedObj;
						form = javafxSchema.getTimestampDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTimestampDefPaneCommon spec = (IBusModelJavaFXTimestampDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampType.CLASS_CODE ) {
						IBusModelTimestampTypeObj obj = (IBusModelTimestampTypeObj)referencedObj;
						form = javafxSchema.getTimestampTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTimestampTypePaneCommon spec = (IBusModelJavaFXTimestampTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTimestampCol.CLASS_CODE ) {
						IBusModelTimestampColObj obj = (IBusModelTimestampColObj)referencedObj;
						form = javafxSchema.getTimestampColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTimestampColPaneCommon spec = (IBusModelJavaFXTimestampColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenDef.CLASS_CODE ) {
						IBusModelTokenDefObj obj = (IBusModelTokenDefObj)referencedObj;
						form = javafxSchema.getTokenDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTokenDefPaneCommon spec = (IBusModelJavaFXTokenDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenType.CLASS_CODE ) {
						IBusModelTokenTypeObj obj = (IBusModelTokenTypeObj)referencedObj;
						form = javafxSchema.getTokenTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTokenTypePaneCommon spec = (IBusModelJavaFXTokenTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTokenCol.CLASS_CODE ) {
						IBusModelTokenColObj obj = (IBusModelTokenColObj)referencedObj;
						form = javafxSchema.getTokenColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTokenColPaneCommon spec = (IBusModelJavaFXTokenColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Def.CLASS_CODE ) {
						IBusModelUInt16DefObj obj = (IBusModelUInt16DefObj)referencedObj;
						form = javafxSchema.getUInt16DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt16DefPaneCommon spec = (IBusModelJavaFXUInt16DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Type.CLASS_CODE ) {
						IBusModelUInt16TypeObj obj = (IBusModelUInt16TypeObj)referencedObj;
						form = javafxSchema.getUInt16TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt16TypePaneCommon spec = (IBusModelJavaFXUInt16TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt16Col.CLASS_CODE ) {
						IBusModelUInt16ColObj obj = (IBusModelUInt16ColObj)referencedObj;
						form = javafxSchema.getUInt16ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt16ColPaneCommon spec = (IBusModelJavaFXUInt16ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Def.CLASS_CODE ) {
						IBusModelUInt32DefObj obj = (IBusModelUInt32DefObj)referencedObj;
						form = javafxSchema.getUInt32DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt32DefPaneCommon spec = (IBusModelJavaFXUInt32DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Type.CLASS_CODE ) {
						IBusModelUInt32TypeObj obj = (IBusModelUInt32TypeObj)referencedObj;
						form = javafxSchema.getUInt32TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt32TypePaneCommon spec = (IBusModelJavaFXUInt32TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt32Col.CLASS_CODE ) {
						IBusModelUInt32ColObj obj = (IBusModelUInt32ColObj)referencedObj;
						form = javafxSchema.getUInt32ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt32ColPaneCommon spec = (IBusModelJavaFXUInt32ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Def.CLASS_CODE ) {
						IBusModelUInt64DefObj obj = (IBusModelUInt64DefObj)referencedObj;
						form = javafxSchema.getUInt64DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt64DefPaneCommon spec = (IBusModelJavaFXUInt64DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Type.CLASS_CODE ) {
						IBusModelUInt64TypeObj obj = (IBusModelUInt64TypeObj)referencedObj;
						form = javafxSchema.getUInt64TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt64TypePaneCommon spec = (IBusModelJavaFXUInt64TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUInt64Col.CLASS_CODE ) {
						IBusModelUInt64ColObj obj = (IBusModelUInt64ColObj)referencedObj;
						form = javafxSchema.getUInt64ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUInt64ColPaneCommon spec = (IBusModelJavaFXUInt64ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidDef.CLASS_CODE ) {
						IBusModelUuidDefObj obj = (IBusModelUuidDefObj)referencedObj;
						form = javafxSchema.getUuidDefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuidDefPaneCommon spec = (IBusModelJavaFXUuidDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidType.CLASS_CODE ) {
						IBusModelUuidTypeObj obj = (IBusModelUuidTypeObj)referencedObj;
						form = javafxSchema.getUuidTypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuidTypePaneCommon spec = (IBusModelJavaFXUuidTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidGen.CLASS_CODE ) {
						IBusModelUuidGenObj obj = (IBusModelUuidGenObj)referencedObj;
						form = javafxSchema.getUuidGenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuidGenPaneCommon spec = (IBusModelJavaFXUuidGenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuidCol.CLASS_CODE ) {
						IBusModelUuidColObj obj = (IBusModelUuidColObj)referencedObj;
						form = javafxSchema.getUuidColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuidColPaneCommon spec = (IBusModelJavaFXUuidColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Def.CLASS_CODE ) {
						IBusModelUuid6DefObj obj = (IBusModelUuid6DefObj)referencedObj;
						form = javafxSchema.getUuid6DefFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuid6DefPaneCommon spec = (IBusModelJavaFXUuid6DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Type.CLASS_CODE ) {
						IBusModelUuid6TypeObj obj = (IBusModelUuid6TypeObj)referencedObj;
						form = javafxSchema.getUuid6TypeFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuid6TypePaneCommon spec = (IBusModelJavaFXUuid6TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Gen.CLASS_CODE ) {
						IBusModelUuid6GenObj obj = (IBusModelUuid6GenObj)referencedObj;
						form = javafxSchema.getUuid6GenFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuid6GenPaneCommon spec = (IBusModelJavaFXUuid6GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelUuid6Col.CLASS_CODE ) {
						IBusModelUuid6ColObj obj = (IBusModelUuid6ColObj)referencedObj;
						form = javafxSchema.getUuid6ColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXUuid6ColPaneCommon spec = (IBusModelJavaFXUuid6ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( entry.getSchemaName().equals("BusModel") && backingClassCode == IBusModelTableCol.CLASS_CODE ) {
						IBusModelTableColObj obj = (IBusModelTableColObj)referencedObj;
						form = javafxSchema.getTableColFactory().newAddForm( cfFormManager, obj, null, true );
						IBusModelJavaFXTableColPaneCommon spec = (IBusModelJavaFXTableColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"IBusModelValueObj, IBusModelAtomObj, IBusModelBlobDefObj, IBusModelBlobTypeObj, IBusModelBlobColObj, IBusModelBoolDefObj, IBusModelBoolTypeObj, IBusModelBoolColObj, IBusModelDateDefObj, IBusModelDateTypeObj, IBusModelDateColObj, IBusModelDoubleDefObj, IBusModelDoubleTypeObj, IBusModelDoubleColObj, IBusModelFloatDefObj, IBusModelFloatTypeObj, IBusModelFloatColObj, IBusModelInt16DefObj, IBusModelInt16TypeObj, IBusModelId16GenObj, IBusModelEnumDefObj, IBusModelEnumTypeObj, IBusModelInt16ColObj, IBusModelInt32DefObj, IBusModelInt32TypeObj, IBusModelId32GenObj, IBusModelInt32ColObj, IBusModelInt64DefObj, IBusModelInt64TypeObj, IBusModelId64GenObj, IBusModelInt64ColObj, IBusModelNmTokenDefObj, IBusModelNmTokenTypeObj, IBusModelNmTokenColObj, IBusModelNmTokensDefObj, IBusModelNmTokensTypeObj, IBusModelNmTokensColObj, IBusModelNumberDefObj, IBusModelNumberTypeObj, IBusModelNumberColObj, IBusModelDbKeyHash128DefObj, IBusModelDbKeyHash128ColObj, IBusModelDbKeyHash128TypeObj, IBusModelDbKeyHash128GenObj, IBusModelDbKeyHash160DefObj, IBusModelDbKeyHash160ColObj, IBusModelDbKeyHash160TypeObj, IBusModelDbKeyHash160GenObj, IBusModelDbKeyHash224DefObj, IBusModelDbKeyHash224ColObj, IBusModelDbKeyHash224TypeObj, IBusModelDbKeyHash224GenObj, IBusModelDbKeyHash256DefObj, IBusModelDbKeyHash256ColObj, IBusModelDbKeyHash256TypeObj, IBusModelDbKeyHash256GenObj, IBusModelDbKeyHash384DefObj, IBusModelDbKeyHash384ColObj, IBusModelDbKeyHash384TypeObj, IBusModelDbKeyHash384GenObj, IBusModelDbKeyHash512DefObj, IBusModelDbKeyHash512ColObj, IBusModelDbKeyHash512TypeObj, IBusModelDbKeyHash512GenObj, IBusModelStringDefObj, IBusModelStringTypeObj, IBusModelStringColObj, IBusModelTZDateDefObj, IBusModelTZDateTypeObj, IBusModelTZDateColObj, IBusModelTZTimeDefObj, IBusModelTZTimeTypeObj, IBusModelTZTimeColObj, IBusModelTZTimestampDefObj, IBusModelTZTimestampTypeObj, IBusModelTZTimestampColObj, IBusModelTextDefObj, IBusModelTextTypeObj, IBusModelTextColObj, IBusModelTimeDefObj, IBusModelTimeTypeObj, IBusModelTimeColObj, IBusModelTimestampDefObj, IBusModelTimestampTypeObj, IBusModelTimestampColObj, IBusModelTokenDefObj, IBusModelTokenTypeObj, IBusModelTokenColObj, IBusModelUInt16DefObj, IBusModelUInt16TypeObj, IBusModelUInt16ColObj, IBusModelUInt32DefObj, IBusModelUInt32TypeObj, IBusModelUInt32ColObj, IBusModelUInt64DefObj, IBusModelUInt64TypeObj, IBusModelUInt64ColObj, IBusModelUuidDefObj, IBusModelUuidTypeObj, IBusModelUuidGenObj, IBusModelUuidColObj, IBusModelUuid6DefObj, IBusModelUuid6TypeObj, IBusModelUuid6GenObj, IBusModelUuid6ColObj, IBusModelTableColObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class DataTypeCFReferenceEditor
		extends CFReferenceEditor
	{
		public DataTypeCFReferenceEditor() {
			super( new DataTypeReferenceCallback() );
			setFieldNameInzTag( "busmodel.javafx.TableCol.AttrPane.DataType.EffLabel" );
		}
	}

	protected class DefSchemaCFLabel
		extends CFLabel
	{
		public DefSchemaCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.LookupDefSchema.EffLabel"));
		}
	}

	protected class CallbackDefSchemaChosen
	implements IBusModelJavaFXSchemaDefChosen
	{
		public CallbackDefSchemaChosen() {
		}

		public void choseSchemaDef( IBusModelSchemaDefObj value ) {
			if( javafxReferenceLookupDefSchema != null ) {
				IBusModelTableColObj cur = getJavaFXFocusAsTableCol();
				if( cur != null ) {
					IBusModelTableColEditObj editObj = (IBusModelTableColEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupDefSchema.setReferencedObject( value );
							editObj.setOptionalLookupDefSchema( value );
						}
					}
				}
			}
		}
	}

	protected class DefSchemaReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			IBusModelSchemaObj schemaObj = (IBusModelSchemaObj)javafxSchema.getSchema();
			IBusModelTableColObj focus = getEffJavaFXFocus();
			IBusModelSchemaDefObj referencedObj = (IBusModelSchemaDefObj)javafxReferenceLookupDefSchema.getReferencedObject();
			java.util.List<IBusModelSchemaDefObj> listOfSchemaDef = null;
			Collection<IBusModelSchemaDefObj> cltn = null;
			CFBorderPane form = javafxSchema.getSchemaDefFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackDefSchemaChosen() );
			((IBusModelJavaFXSchemaDefPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			IBusModelTableColObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				IBusModelSchemaDefObj referencedObj = (IBusModelSchemaDefObj)javafxReferenceLookupDefSchema.getReferencedObject();
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
						throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
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

	protected class DefSchemaCFReferenceEditor
		extends CFReferenceEditor
	{
		public DefSchemaCFReferenceEditor() {
			super( new DefSchemaReferenceCallback() );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.DefSchema.EffLabel" );
		}
	}

	protected class IdCFLabel
		extends CFLabel
	{
		public IdCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.Id.EffLabel"));
		}
	}

	protected class IdEditor
		extends CFDbKeyHash256Editor
	{
		public IdEditor() {
			super();
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.Id.EffLabel" );
		}
	}

	protected class NameCFLabel
		extends CFLabel
	{
		public NameCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.Name.EffLabel"));
		}
	}

	protected class NameEditor
		extends CFStringEditor
	{
		public NameEditor() {
			super();
			setMaxLen( 192 );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.Name.EffLabel" );
		}
	}

	protected class ShortNameCFLabel
		extends CFLabel
	{
		public ShortNameCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.ShortName.EffLabel"));
		}
	}

	protected class ShortNameEditor
		extends CFStringEditor
	{
		public ShortNameEditor() {
			super();
			setMaxLen( 16 );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.ShortName.EffLabel" );
		}
	}

	protected class LabelCFLabel
		extends CFLabel
	{
		public LabelCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.Label.EffLabel"));
		}
	}

	protected class LabelEditor
		extends CFStringEditor
	{
		public LabelEditor() {
			super();
			setMaxLen( 64 );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.Label.EffLabel" );
		}
	}

	protected class ShortDescriptionCFLabel
		extends CFLabel
	{
		public ShortDescriptionCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.ShortDescription.EffLabel"));
		}
	}

	protected class ShortDescriptionEditor
		extends CFStringEditor
	{
		public ShortDescriptionEditor() {
			super();
			setMaxLen( 128 );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.ShortDescription.EffLabel" );
		}
	}

	protected class DescriptionCFLabel
		extends CFLabel
	{
		public DescriptionCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.Description.EffLabel"));
		}
	}

	protected class DescriptionEditor
		extends CFStringEditor
	{
		public DescriptionEditor() {
			super();
			setMaxLen( 1023 );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.Description.EffLabel" );
		}
	}

	protected class DefaultXmlValueCFLabel
		extends CFLabel
	{
		public DefaultXmlValueCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.DefaultXmlValue.EffLabel"));
		}
	}

	protected class DefaultXmlValueEditor
		extends CFStringEditor
	{
		public DefaultXmlValueEditor() {
			super();
			setMaxLen( 1023 );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.DefaultXmlValue.EffLabel" );
		}
	}

	protected class IsNullableCFLabel
		extends CFLabel
	{
		public IsNullableCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.IsNullable.EffLabel"));
		}
	}

	protected class IsNullableEditor
		extends CFBoolEditor
	{
		public IsNullableEditor() {
			super();
			setIsNullable( false );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.IsNullable.EffLabel" );
		}
	}

	protected class GenerateIdCFLabel
		extends CFLabel
	{
		public GenerateIdCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.GenerateId.EffLabel"));
		}
	}

	protected class GenerateIdEditor
		extends CFBoolEditor
	{
		public GenerateIdEditor() {
			super();
			setIsNullable( true );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.GenerateId.EffLabel" );
		}
	}

	protected class ImplementsPolymorphCFLabel
		extends CFLabel
	{
		public ImplementsPolymorphCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.Value.AttrPane.ImplementsPolymorph.EffLabel"));
		}
	}

	protected class ImplementsPolymorphEditor
		extends CFBoolEditor
	{
		public ImplementsPolymorphEditor() {
			super();
			setIsNullable( false );
			setFieldNameInzTag( "busmodel.javafx.Value.AttrPane.ImplementsPolymorph.EffLabel" );
		}
	}

	protected class DbNameCFLabel
		extends CFLabel
	{
		public DbNameCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.TableCol.AttrPane.DbName.EffLabel"));
		}
	}

	protected class DbNameEditor
		extends CFStringEditor
	{
		public DbNameEditor() {
			super();
			setMaxLen( 32 );
			setFieldNameInzTag( "busmodel.javafx.TableCol.AttrPane.DbName.EffLabel" );
		}
	}

	protected class XmlElementNameCFLabel
		extends CFLabel
	{
		public XmlElementNameCFLabel() {
			super();
			setText(Inz.s("busmodel.javafx.TableCol.AttrPane.XmlElementName.EffLabel"));
		}
	}

	protected class XmlElementNameEditor
		extends CFStringEditor
	{
		public XmlElementNameEditor() {
			super();
			setMaxLen( 192 );
			setFieldNameInzTag( "busmodel.javafx.TableCol.AttrPane.XmlElementName.EffLabel" );
		}
	}

	protected IBusModelValueObj javafxParentDataTypeObj = null;
	protected DataTypeCFLabel javafxLabelParentDataType = null;
	protected DataTypeCFReferenceEditor javafxReferenceParentDataType = null;
	protected IBusModelSchemaDefObj javafxLookupDefSchemaObj = null;
	protected DefSchemaCFLabel javafxLabelLookupDefSchema = null;
	protected DefSchemaCFReferenceEditor javafxReferenceLookupDefSchema = null;
	protected IdCFLabel javafxLabelId = null;
	protected IdEditor javafxEditorId = null;
	protected NameCFLabel javafxLabelName = null;
	protected NameEditor javafxEditorName = null;
	protected ShortNameCFLabel javafxLabelShortName = null;
	protected ShortNameEditor javafxEditorShortName = null;
	protected LabelCFLabel javafxLabelLabel = null;
	protected LabelEditor javafxEditorLabel = null;
	protected ShortDescriptionCFLabel javafxLabelShortDescription = null;
	protected ShortDescriptionEditor javafxEditorShortDescription = null;
	protected DescriptionCFLabel javafxLabelDescription = null;
	protected DescriptionEditor javafxEditorDescription = null;
	protected DefaultXmlValueCFLabel javafxLabelDefaultXmlValue = null;
	protected DefaultXmlValueEditor javafxEditorDefaultXmlValue = null;
	protected IsNullableCFLabel javafxLabelIsNullable = null;
	protected IsNullableEditor javafxEditorIsNullable = null;
	protected GenerateIdCFLabel javafxLabelGenerateId = null;
	protected GenerateIdEditor javafxEditorGenerateId = null;
	protected ImplementsPolymorphCFLabel javafxLabelImplementsPolymorph = null;
	protected ImplementsPolymorphEditor javafxEditorImplementsPolymorph = null;
	protected DbNameCFLabel javafxLabelDbName = null;
	protected DbNameEditor javafxEditorDbName = null;
	protected XmlElementNameCFLabel javafxLabelXmlElementName = null;
	protected XmlElementNameEditor javafxEditorXmlElementName = null;

	public BusModelJavaFXTableColAttrPane( ICFFormManager formManager, IBusModelJavaFXSchema argSchema, IBusModelTableColObj argFocus ) {
		super();
		Control ctrl;
		CFLabel label;
		CFReferenceEditor reference;
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		setJavaFXFocusAsTableCol( argFocus );
		setPadding( new Insets(5) );
		setHgap( 5 );
		setVgap( 5 );
		setAlignment( Pos.CENTER );
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth( 100 );
		getColumnConstraints().addAll( column1 );
		int gridRow = 0;
		label = getJavaFXLabelParentDataType();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceParentDataType();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLookupDefSchema();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupDefSchema();
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

		label = getJavaFXLabelShortName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorShortName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLabel();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorLabel();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelShortDescription();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorShortDescription();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelDescription();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorDescription();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelDefaultXmlValue();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorDefaultXmlValue();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelIsNullable();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorIsNullable();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelGenerateId();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorGenerateId();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelImplementsPolymorph();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorImplementsPolymorph();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelDbName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorDbName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelXmlElementName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorXmlElementName();
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
			throw IYCFNullArgumentException.getService().getInstance( getClass(),
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
		if( ( value == null ) || ( value instanceof IBusModelTableColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw IYCFUnsupportedClassException.getService().getInstance( getClass(),
				S_ProcName,
				"value",
				value,
				"IBusModelTableColObj" );
		}
		populateFields();
		adjustComponentEnableStates();
	}

	public IBusModelTableColObj getJavaFXFocusAsTableCol() {
		return( (IBusModelTableColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsTableCol( IBusModelTableColObj value ) {
		setJavaFXFocus( value );
	}

	public IBusModelTableColObj getEffJavaFXFocus() {
		IBusModelTableColObj eff = (IBusModelTableColObj)getJavaFXFocus();
		if( eff != null ) {
			if( null != eff.getEdit() ) {
				eff = (IBusModelTableColObj)eff.getEdit();
			}
		}
		return( eff );
	}

	public IBusModelValueObj getJavaFXParentDataTypeObj() {
		return( javafxParentDataTypeObj );
	}

	public void setJavaFXParentDataTypeObj( IBusModelValueObj value ) {
		javafxParentDataTypeObj = value;
	}

	public CFLabel getJavaFXLabelParentDataType() {
		if( javafxLabelParentDataType == null ) {
			javafxLabelParentDataType = new DataTypeCFLabel();
		}
		return( javafxLabelParentDataType );
	}

	public CFReferenceEditor getJavaFXReferenceParentDataType() {
		if( javafxReferenceParentDataType == null ) {
			javafxReferenceParentDataType = new DataTypeCFReferenceEditor();
		}
		return( javafxReferenceParentDataType );
	}

	public void setJavaFXReferenceParentDataType( DataTypeCFReferenceEditor value ) {
		javafxReferenceParentDataType = value;
	}

	public IBusModelSchemaDefObj getJavaFXLookupDefSchemaObj() {
		return( javafxLookupDefSchemaObj );
	}

	public void setJavaFXLookupDefSchemaObj( IBusModelSchemaDefObj value ) {
		javafxLookupDefSchemaObj = value;
	}

	public CFLabel getJavaFXLabelLookupDefSchema() {
		if( javafxLabelLookupDefSchema == null ) {
			javafxLabelLookupDefSchema = new DefSchemaCFLabel();
		}
		return( javafxLabelLookupDefSchema );
	}

	public CFReferenceEditor getJavaFXReferenceLookupDefSchema() {
		if( javafxReferenceLookupDefSchema == null ) {
			javafxReferenceLookupDefSchema = new DefSchemaCFReferenceEditor();
		}
		return( javafxReferenceLookupDefSchema );
	}

	public void setJavaFXReferenceLookupDefSchema( DefSchemaCFReferenceEditor value ) {
		javafxReferenceLookupDefSchema = value;
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

	public ShortNameCFLabel getJavaFXLabelShortName() {
		if( javafxLabelShortName == null ) {
			javafxLabelShortName = new ShortNameCFLabel();
		}
		return( javafxLabelShortName );
	}

	public void setJavaFXLabelShortName( ShortNameCFLabel value ) {
		javafxLabelShortName = value;
	}

	public ShortNameEditor getJavaFXEditorShortName() {
		if( javafxEditorShortName == null ) {
			javafxEditorShortName = new ShortNameEditor();
		}
		return( javafxEditorShortName );
	}

	public void setJavaFXEditorShortName( ShortNameEditor value ) {
		javafxEditorShortName = value;
	}

	public LabelCFLabel getJavaFXLabelLabel() {
		if( javafxLabelLabel == null ) {
			javafxLabelLabel = new LabelCFLabel();
		}
		return( javafxLabelLabel );
	}

	public void setJavaFXLabelLabel( LabelCFLabel value ) {
		javafxLabelLabel = value;
	}

	public LabelEditor getJavaFXEditorLabel() {
		if( javafxEditorLabel == null ) {
			javafxEditorLabel = new LabelEditor();
		}
		return( javafxEditorLabel );
	}

	public void setJavaFXEditorLabel( LabelEditor value ) {
		javafxEditorLabel = value;
	}

	public ShortDescriptionCFLabel getJavaFXLabelShortDescription() {
		if( javafxLabelShortDescription == null ) {
			javafxLabelShortDescription = new ShortDescriptionCFLabel();
		}
		return( javafxLabelShortDescription );
	}

	public void setJavaFXLabelShortDescription( ShortDescriptionCFLabel value ) {
		javafxLabelShortDescription = value;
	}

	public ShortDescriptionEditor getJavaFXEditorShortDescription() {
		if( javafxEditorShortDescription == null ) {
			javafxEditorShortDescription = new ShortDescriptionEditor();
		}
		return( javafxEditorShortDescription );
	}

	public void setJavaFXEditorShortDescription( ShortDescriptionEditor value ) {
		javafxEditorShortDescription = value;
	}

	public DescriptionCFLabel getJavaFXLabelDescription() {
		if( javafxLabelDescription == null ) {
			javafxLabelDescription = new DescriptionCFLabel();
		}
		return( javafxLabelDescription );
	}

	public void setJavaFXLabelDescription( DescriptionCFLabel value ) {
		javafxLabelDescription = value;
	}

	public DescriptionEditor getJavaFXEditorDescription() {
		if( javafxEditorDescription == null ) {
			javafxEditorDescription = new DescriptionEditor();
		}
		return( javafxEditorDescription );
	}

	public void setJavaFXEditorDescription( DescriptionEditor value ) {
		javafxEditorDescription = value;
	}

	public DefaultXmlValueCFLabel getJavaFXLabelDefaultXmlValue() {
		if( javafxLabelDefaultXmlValue == null ) {
			javafxLabelDefaultXmlValue = new DefaultXmlValueCFLabel();
		}
		return( javafxLabelDefaultXmlValue );
	}

	public void setJavaFXLabelDefaultXmlValue( DefaultXmlValueCFLabel value ) {
		javafxLabelDefaultXmlValue = value;
	}

	public DefaultXmlValueEditor getJavaFXEditorDefaultXmlValue() {
		if( javafxEditorDefaultXmlValue == null ) {
			javafxEditorDefaultXmlValue = new DefaultXmlValueEditor();
		}
		return( javafxEditorDefaultXmlValue );
	}

	public void setJavaFXEditorDefaultXmlValue( DefaultXmlValueEditor value ) {
		javafxEditorDefaultXmlValue = value;
	}

	public IsNullableCFLabel getJavaFXLabelIsNullable() {
		if( javafxLabelIsNullable == null ) {
			javafxLabelIsNullable = new IsNullableCFLabel();
		}
		return( javafxLabelIsNullable );
	}

	public void setJavaFXLabelIsNullable( IsNullableCFLabel value ) {
		javafxLabelIsNullable = value;
	}

	public IsNullableEditor getJavaFXEditorIsNullable() {
		if( javafxEditorIsNullable == null ) {
			javafxEditorIsNullable = new IsNullableEditor();
		}
		return( javafxEditorIsNullable );
	}

	public void setJavaFXEditorIsNullable( IsNullableEditor value ) {
		javafxEditorIsNullable = value;
	}

	public GenerateIdCFLabel getJavaFXLabelGenerateId() {
		if( javafxLabelGenerateId == null ) {
			javafxLabelGenerateId = new GenerateIdCFLabel();
		}
		return( javafxLabelGenerateId );
	}

	public void setJavaFXLabelGenerateId( GenerateIdCFLabel value ) {
		javafxLabelGenerateId = value;
	}

	public GenerateIdEditor getJavaFXEditorGenerateId() {
		if( javafxEditorGenerateId == null ) {
			javafxEditorGenerateId = new GenerateIdEditor();
		}
		return( javafxEditorGenerateId );
	}

	public void setJavaFXEditorGenerateId( GenerateIdEditor value ) {
		javafxEditorGenerateId = value;
	}

	public ImplementsPolymorphCFLabel getJavaFXLabelImplementsPolymorph() {
		if( javafxLabelImplementsPolymorph == null ) {
			javafxLabelImplementsPolymorph = new ImplementsPolymorphCFLabel();
		}
		return( javafxLabelImplementsPolymorph );
	}

	public void setJavaFXLabelImplementsPolymorph( ImplementsPolymorphCFLabel value ) {
		javafxLabelImplementsPolymorph = value;
	}

	public ImplementsPolymorphEditor getJavaFXEditorImplementsPolymorph() {
		if( javafxEditorImplementsPolymorph == null ) {
			javafxEditorImplementsPolymorph = new ImplementsPolymorphEditor();
		}
		return( javafxEditorImplementsPolymorph );
	}

	public void setJavaFXEditorImplementsPolymorph( ImplementsPolymorphEditor value ) {
		javafxEditorImplementsPolymorph = value;
	}

	public DbNameCFLabel getJavaFXLabelDbName() {
		if( javafxLabelDbName == null ) {
			javafxLabelDbName = new DbNameCFLabel();
		}
		return( javafxLabelDbName );
	}

	public void setJavaFXLabelDbName( DbNameCFLabel value ) {
		javafxLabelDbName = value;
	}

	public DbNameEditor getJavaFXEditorDbName() {
		if( javafxEditorDbName == null ) {
			javafxEditorDbName = new DbNameEditor();
		}
		return( javafxEditorDbName );
	}

	public void setJavaFXEditorDbName( DbNameEditor value ) {
		javafxEditorDbName = value;
	}

	public XmlElementNameCFLabel getJavaFXLabelXmlElementName() {
		if( javafxLabelXmlElementName == null ) {
			javafxLabelXmlElementName = new XmlElementNameCFLabel();
		}
		return( javafxLabelXmlElementName );
	}

	public void setJavaFXLabelXmlElementName( XmlElementNameCFLabel value ) {
		javafxLabelXmlElementName = value;
	}

	public XmlElementNameEditor getJavaFXEditorXmlElementName() {
		if( javafxEditorXmlElementName == null ) {
			javafxEditorXmlElementName = new XmlElementNameEditor();
		}
		return( javafxEditorXmlElementName );
	}

	public void setJavaFXEditorXmlElementName( XmlElementNameEditor value ) {
		javafxEditorXmlElementName = value;
	}

	public void populateFields()
	{
		IBusModelTableColObj popObj = getEffJavaFXFocus();
		if( getPaneMode() == CFPane.PaneMode.Unknown ) {
			popObj = null;
		}
		if( popObj == null ) {
			javafxParentDataTypeObj = null;
		}
		else {
			javafxParentDataTypeObj = (IBusModelValueObj)popObj.getRequiredParentDataType( javafxIsInitializing );
		}
		if( javafxReferenceParentDataType != null ) {
			javafxReferenceParentDataType.setReferencedObject( javafxParentDataTypeObj );
		}

		if( popObj == null ) {
			javafxLookupDefSchemaObj = null;
		}
		else {
			javafxLookupDefSchemaObj = (IBusModelSchemaDefObj)popObj.getOptionalLookupDefSchema( javafxIsInitializing );
		}
		if( javafxReferenceLookupDefSchema != null ) {
			javafxReferenceLookupDefSchema.setReferencedObject( javafxLookupDefSchemaObj );
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
			getJavaFXEditorShortName().setStringValue( null );
		}
		else {
			getJavaFXEditorShortName().setStringValue( popObj.getOptionalShortName() );
		}

		if( popObj == null ) {
			getJavaFXEditorLabel().setStringValue( null );
		}
		else {
			getJavaFXEditorLabel().setStringValue( popObj.getOptionalLabel() );
		}

		if( popObj == null ) {
			getJavaFXEditorShortDescription().setStringValue( null );
		}
		else {
			getJavaFXEditorShortDescription().setStringValue( popObj.getOptionalShortDescription() );
		}

		if( popObj == null ) {
			getJavaFXEditorDescription().setStringValue( null );
		}
		else {
			getJavaFXEditorDescription().setStringValue( popObj.getOptionalDescription() );
		}

		if( popObj == null ) {
			getJavaFXEditorDefaultXmlValue().setStringValue( null );
		}
		else {
			getJavaFXEditorDefaultXmlValue().setStringValue( popObj.getOptionalDefaultXmlValue() );
		}

		if( popObj == null ) {
			getJavaFXEditorIsNullable().setBooleanValue( null );
		}
		else {
			getJavaFXEditorIsNullable().setBooleanValue( popObj.getRequiredIsNullable() );
		}

		if( popObj == null ) {
			getJavaFXEditorGenerateId().setBooleanValue( null );
		}
		else {
			getJavaFXEditorGenerateId().setBooleanValue( popObj.getOptionalGenerateId() );
		}

		if( popObj == null ) {
			getJavaFXEditorImplementsPolymorph().setBooleanValue( null );
		}
		else {
			getJavaFXEditorImplementsPolymorph().setBooleanValue( popObj.getRequiredImplementsPolymorph() );
		}

		if( popObj == null ) {
			getJavaFXEditorDbName().setStringValue( null );
		}
		else {
			getJavaFXEditorDbName().setStringValue( popObj.getOptionalDbName() );
		}

		if( popObj == null ) {
			getJavaFXEditorXmlElementName().setStringValue( null );
		}
		else {
			getJavaFXEditorXmlElementName().setStringValue( popObj.getOptionalXmlElementName() );
		}
	}

	public void postFields()
	{
		final String S_ProcName = "postFields";
		IBusModelTableColObj focus = getJavaFXFocusAsTableCol();
		IBusModelTableColEditObj editObj;
		if( focus != null ) {
			editObj = (IBusModelTableColEditObj)(focus.getEdit());
		}
		else {
			editObj = null;
		}
		if( editObj == null ) {
			throw IYCFUsageException.getService().getInstance( getClass(),
				S_ProcName,
				Inz.s("cflibjavafx.common.PaneIsUnfocusedOrNotEditing"),
				Inz.x("cflibjavafx.common.PaneIsUnfocusedOrNotEditing") );
		}

		javafxParentDataTypeObj = (IBusModelValueObj)( javafxReferenceParentDataType.getReferencedObject() );
		editObj.setRequiredParentDataType( javafxParentDataTypeObj );

		javafxLookupDefSchemaObj = (IBusModelSchemaDefObj)( javafxReferenceLookupDefSchema.getReferencedObject() );
		editObj.setOptionalLookupDefSchema( javafxLookupDefSchemaObj );

		if( getJavaFXEditorName().getStringValue() == null ) {
			editObj.setRequiredName( "" );
		}
		else {
			editObj.setRequiredName( getJavaFXEditorName().getStringValue() );
		}

		if( ( getJavaFXEditorShortName().getStringValue() != null ) && ( getJavaFXEditorShortName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalShortName( null );
		}
		else {
			editObj.setOptionalShortName( getJavaFXEditorShortName().getStringValue() );
		}

		if( ( getJavaFXEditorLabel().getStringValue() != null ) && ( getJavaFXEditorLabel().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalLabel( null );
		}
		else {
			editObj.setOptionalLabel( getJavaFXEditorLabel().getStringValue() );
		}

		if( ( getJavaFXEditorShortDescription().getStringValue() != null ) && ( getJavaFXEditorShortDescription().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalShortDescription( null );
		}
		else {
			editObj.setOptionalShortDescription( getJavaFXEditorShortDescription().getStringValue() );
		}

		if( ( getJavaFXEditorDescription().getStringValue() != null ) && ( getJavaFXEditorDescription().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalDescription( null );
		}
		else {
			editObj.setOptionalDescription( getJavaFXEditorDescription().getStringValue() );
		}

		if( ( getJavaFXEditorDefaultXmlValue().getStringValue() != null ) && ( getJavaFXEditorDefaultXmlValue().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalDefaultXmlValue( null );
		}
		else {
			editObj.setOptionalDefaultXmlValue( getJavaFXEditorDefaultXmlValue().getStringValue() );
		}

		editObj.setRequiredIsNullable( getJavaFXEditorIsNullable().getBooleanValue() );

		editObj.setOptionalGenerateId( getJavaFXEditorGenerateId().getBooleanValue() );

		editObj.setRequiredImplementsPolymorph( getJavaFXEditorImplementsPolymorph().getBooleanValue() );

		if( ( getJavaFXEditorDbName().getStringValue() != null ) && ( getJavaFXEditorDbName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalDbName( null );
		}
		else {
			editObj.setOptionalDbName( getJavaFXEditorDbName().getStringValue() );
		}

		if( ( getJavaFXEditorXmlElementName().getStringValue() != null ) && ( getJavaFXEditorXmlElementName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalXmlElementName( null );
		}
		else {
			editObj.setOptionalXmlElementName( getJavaFXEditorXmlElementName().getStringValue() );
		}
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		IBusModelTableColObj focus = getJavaFXFocusAsTableCol();
		if( ( value != CFPane.PaneMode.Unknown ) && ( value != CFPane.PaneMode.View ) ) {
			if( focus == null ) {
				throw IYCFNullArgumentException.getService().getInstance( getClass(),
					S_ProcName,
					0,
					"javaFXFocus" );
			}
		}
		IBusModelTableColEditObj editObj;
		if( focus != null ) {
			editObj  = (IBusModelTableColEditObj)focus.getEdit();
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
									throw IYCFUsageException.getService().getInstance( getClass(),
										S_ProcName,
										Inz.x("cflibjavafx.common.MustBeNew"),
										Inz.s("cflibjavafx.common.MustBeNew") );
								}
								editObj = (IBusModelTableColEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw IYCFUsageException.getService().getInstance( getClass(),
										S_ProcName,
										Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
										Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
								}
							}
							else {
								throw IYCFNullArgumentException.getService().getInstance( getClass(),
									S_ProcName,
									0,
									"focus" );
							}
						}
						break;
					case Edit:
						throw IYCFUsageException.getService().getInstance( getClass(),
							S_ProcName,
							Inz.x("cflibjavafx.common.CannotTransitionEditToAdd"),
							Inz.s("cflibjavafx.common.CannotTransitionEditToAdd") );
					case Update:
						if( ( editObj == null ) || ( ! editObj.getIsNew() ) ) {
							throw IYCFUsageException.getService().getInstance( getClass(),
								S_ProcName,
								Inz.x("cflibjavafx.common.CannotTransitionUpdateToAdd"),
								Inz.s("cflibjavafx.common.CannotTransitionUpdateToAdd") );
						}
						break;
					case Delete:
						throw IYCFUsageException.getService().getInstance( getClass(),
							S_ProcName,
							Inz.x("cflibjavafx.common.CannotTransitionDeleteToAdd"),
							Inz.s("cflibjavafx.common.CannotTransitionDeleteToAdd") );
					default:
						throw IYCFUsageException.getService().getInstance( getClass(),
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
						throw IYCFUsageException.getService().getInstance( getClass(),
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
							editObj = (IBusModelTableColEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw IYCFUsageException.getService().getInstance( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					case View:
						if( editObj == null ) {
							editObj = (IBusModelTableColEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw IYCFUsageException.getService().getInstance( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					case Edit:
						if( editObj == null ) {
							editObj = (IBusModelTableColEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw IYCFUsageException.getService().getInstance( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					case Update:
						if( editObj == null ) {
							throw IYCFUsageException.getService().getInstance( getClass(),
								S_ProcName,
								String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue),
								String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue) );
						}
						break;
					default:
						throw IYCFUsageException.getService().getInstance( getClass(),
							S_ProcName,
							String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue),
							String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToEdit"), oldValue) );
				}
				break;
			case Update:
				if( ( oldValue != CFPane.PaneMode.Edit ) && ( oldValue != CFPane.PaneMode.Add ) ) {
					throw IYCFUsageException.getService().getInstance( getClass(),
						S_ProcName,
						String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToUpdate"), oldValue),
						String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToUpdate"), oldValue) );
				}
				super.setPaneMode( value );
				if( editObj != null ) {
					postFields();
					if( editObj.getIsNew() ) {
						focus = (IBusModelTableColObj)editObj.create();
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
								editObj = (IBusModelTableColEditObj)focus.beginEdit();
								if( editObj == null ) {
								throw IYCFUsageException.getService().getInstance( getClass(),
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
								editObj = (IBusModelTableColEditObj)focus.beginEdit();
								if( editObj == null ) {
								throw IYCFUsageException.getService().getInstance( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
								}
							}
						}
						break;
					case Update:
						throw IYCFUsageException.getService().getInstance( getClass(),
							S_ProcName,
							String.format(Inz.x("cflibjavafx.common.CannotTransitionOldValueToDelete"), oldValue),
							String.format(Inz.s("cflibjavafx.common.CannotTransitionOldValueToDelete"), oldValue) );
					case Delete:
						if( editObj == null ) {
							editObj = (IBusModelTableColEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw IYCFUsageException.getService().getInstance( getClass(),
									S_ProcName,
									Inz.x("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition"),
									Inz.s("cflibjavafx.common.ExpectedBeginEditToReturnNewEdition") );
							}
						}
						break;
					default:
						throw IYCFUsageException.getService().getInstance( getClass(),
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
			IBusModelTableColObj focus = getJavaFXFocusAsTableCol();
			if( focus == null ) {
				isEditing = false;
			}
			else if( null == focus.getEdit() ) {
				isEditing = false;
			}
		}
		if( javafxReferenceParentDataType != null ) {
			javafxReferenceParentDataType.setCustomDisable( ! isEditing );
		}
		if( javafxReferenceLookupDefSchema != null ) {
			javafxReferenceLookupDefSchema.setCustomDisable( ! isEditing );
		}
		if( javafxEditorId != null ) {
			javafxEditorId.setDisable( true );
		}
		if( javafxEditorName != null ) {
			javafxEditorName.setDisable( ! isEditing );
		}
		if( javafxEditorShortName != null ) {
			javafxEditorShortName.setDisable( ! isEditing );
		}
		if( javafxEditorLabel != null ) {
			javafxEditorLabel.setDisable( ! isEditing );
		}
		if( javafxEditorShortDescription != null ) {
			javafxEditorShortDescription.setDisable( ! isEditing );
		}
		if( javafxEditorDescription != null ) {
			javafxEditorDescription.setDisable( ! isEditing );
		}
		if( javafxEditorDefaultXmlValue != null ) {
			javafxEditorDefaultXmlValue.setDisable( ! isEditing );
		}
		if( javafxEditorIsNullable != null ) {
			javafxEditorIsNullable.setDisable( ! isEditing );
		}
		if( javafxEditorGenerateId != null ) {
			javafxEditorGenerateId.setDisable( ! isEditing );
		}
		if( javafxEditorImplementsPolymorph != null ) {
			javafxEditorImplementsPolymorph.setDisable( ! isEditing );
		}
		if( javafxEditorDbName != null ) {
			javafxEditorDbName.setDisable( ! isEditing );
		}
		if( javafxEditorXmlElementName != null ) {
			javafxEditorXmlElementName.setDisable( ! isEditing );
		}
	}
}
