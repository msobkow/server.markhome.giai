// Description: Java 25 JavaFX Display Element Factory for MimeType.

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
 *	IntNetJavaFXMimeTypeFactory JavaFX Display Element Factory
 *	for MimeType.
 */
public class IntNetJavaFXMimeTypeFactory
implements IIntNetJavaFXMimeTypeFactory
{
	protected IIntNetJavaFXSchema javafxSchema = null;

	public IntNetJavaFXMimeTypeFactory( IIntNetJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetMimeTypeObj argFocus ) {
		IntNetJavaFXMimeTypeAttrPane retnew = new IntNetJavaFXMimeTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		IIntNetMimeTypeObj argFocus,
		Collection<IIntNetMimeTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		IntNetJavaFXMimeTypeListPane retnew = new IntNetJavaFXMimeTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetMimeTypeObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<IIntNetMimeTypeObj> argDataCollection,
		IIntNetJavaFXMimeTypeChosen whenChosen )
	{
		IntNetJavaFXMimeTypePickerPane retnew = new IntNetJavaFXMimeTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IIntNetMimeTypeObj argFocus ) {
		IntNetJavaFXMimeTypeEltTabPane retnew = new IntNetJavaFXMimeTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IIntNetMimeTypeObj argFocus ) {
		IntNetJavaFXMimeTypeAddPane retnew = new IntNetJavaFXMimeTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IIntNetMimeTypeObj argFocus ) {
		IntNetJavaFXMimeTypeViewEditPane retnew = new IntNetJavaFXMimeTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetMimeTypeObj argFocus, ICFDeleteCallback callback ) {
		IntNetJavaFXMimeTypeAskDeleteForm retnew = new IntNetJavaFXMimeTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		IntNetJavaFXMimeTypeFinderForm retnew = new IntNetJavaFXMimeTypeFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetMimeTypeObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<IIntNetMimeTypeObj> argDataCollection,
		IIntNetJavaFXMimeTypeChosen whenChosen )
	{
		IntNetJavaFXMimeTypePickerForm retnew = new IntNetJavaFXMimeTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetMimeTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		IntNetJavaFXMimeTypeAddForm retnew = new IntNetJavaFXMimeTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetMimeTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		IntNetJavaFXMimeTypeViewEditForm retnew = new IntNetJavaFXMimeTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
