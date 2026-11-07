// Description: Java 25 JavaFX Display Element Factory for MinorVersion.

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
 *	IntNetJavaFXMinorVersionFactory JavaFX Display Element Factory
 *	for MinorVersion.
 */
public class IntNetJavaFXMinorVersionFactory
implements IIntNetJavaFXMinorVersionFactory
{
	protected IIntNetJavaFXSchema javafxSchema = null;

	public IntNetJavaFXMinorVersionFactory( IIntNetJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetMinorVersionObj argFocus ) {
		IntNetJavaFXMinorVersionAttrPane retnew = new IntNetJavaFXMinorVersionAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IIntNetMajorVersionObj argContainer,
		IIntNetMinorVersionObj argFocus,
		Collection<IIntNetMinorVersionObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		IntNetJavaFXMinorVersionListPane retnew = new IntNetJavaFXMinorVersionListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetMinorVersionObj argFocus,
		IIntNetMajorVersionObj argContainer,
		Collection<IIntNetMinorVersionObj> argDataCollection,
		IIntNetJavaFXMinorVersionChosen whenChosen )
	{
		IntNetJavaFXMinorVersionPickerPane retnew = new IntNetJavaFXMinorVersionPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IIntNetMinorVersionObj argFocus ) {
		IntNetJavaFXMinorVersionEltTabPane retnew = new IntNetJavaFXMinorVersionEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IIntNetMinorVersionObj argFocus ) {
		IntNetJavaFXMinorVersionAddPane retnew = new IntNetJavaFXMinorVersionAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IIntNetMinorVersionObj argFocus ) {
		IntNetJavaFXMinorVersionViewEditPane retnew = new IntNetJavaFXMinorVersionViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetMinorVersionObj argFocus, ICFDeleteCallback callback ) {
		IntNetJavaFXMinorVersionAskDeleteForm retnew = new IntNetJavaFXMinorVersionAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetMinorVersionObj argFocus,
		IIntNetMajorVersionObj argContainer,
		Collection<IIntNetMinorVersionObj> argDataCollection,
		IIntNetJavaFXMinorVersionChosen whenChosen )
	{
		IntNetJavaFXMinorVersionPickerForm retnew = new IntNetJavaFXMinorVersionPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetMinorVersionObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		IntNetJavaFXMinorVersionAddForm retnew = new IntNetJavaFXMinorVersionAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetMinorVersionObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		IntNetJavaFXMinorVersionViewEditForm retnew = new IntNetJavaFXMinorVersionViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
