// Description: Java 25 JavaFX Display Element Factory for SubProject.

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
 *	IntNetJavaFXSubProjectFactory JavaFX Display Element Factory
 *	for SubProject.
 */
public class IntNetJavaFXSubProjectFactory
implements IIntNetJavaFXSubProjectFactory
{
	protected IIntNetJavaFXSchema javafxSchema = null;

	public IntNetJavaFXSubProjectFactory( IIntNetJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetSubProjectObj argFocus ) {
		IntNetJavaFXSubProjectAttrPane retnew = new IntNetJavaFXSubProjectAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IIntNetTopProjectObj argContainer,
		IIntNetSubProjectObj argFocus,
		Collection<IIntNetSubProjectObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		IntNetJavaFXSubProjectListPane retnew = new IntNetJavaFXSubProjectListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetSubProjectObj argFocus,
		IIntNetTopProjectObj argContainer,
		Collection<IIntNetSubProjectObj> argDataCollection,
		IIntNetJavaFXSubProjectChosen whenChosen )
	{
		IntNetJavaFXSubProjectPickerPane retnew = new IntNetJavaFXSubProjectPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IIntNetSubProjectObj argFocus ) {
		IntNetJavaFXSubProjectEltTabPane retnew = new IntNetJavaFXSubProjectEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IIntNetSubProjectObj argFocus ) {
		IntNetJavaFXSubProjectAddPane retnew = new IntNetJavaFXSubProjectAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IIntNetSubProjectObj argFocus ) {
		IntNetJavaFXSubProjectViewEditPane retnew = new IntNetJavaFXSubProjectViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetSubProjectObj argFocus, ICFDeleteCallback callback ) {
		IntNetJavaFXSubProjectAskDeleteForm retnew = new IntNetJavaFXSubProjectAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetSubProjectObj argFocus,
		IIntNetTopProjectObj argContainer,
		Collection<IIntNetSubProjectObj> argDataCollection,
		IIntNetJavaFXSubProjectChosen whenChosen )
	{
		IntNetJavaFXSubProjectPickerForm retnew = new IntNetJavaFXSubProjectPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetSubProjectObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		IntNetJavaFXSubProjectAddForm retnew = new IntNetJavaFXSubProjectAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetSubProjectObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		IntNetJavaFXSubProjectViewEditForm retnew = new IntNetJavaFXSubProjectViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
