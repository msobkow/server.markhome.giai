// Description: Java 25 JavaFX Display Element Factory for Tld.

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
 *	IntNetJavaFXTldFactory JavaFX Display Element Factory
 *	for Tld.
 */
public class IntNetJavaFXTldFactory
implements IIntNetJavaFXTldFactory
{
	protected IIntNetJavaFXSchema javafxSchema = null;

	public IntNetJavaFXTldFactory( IIntNetJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetTldObj argFocus ) {
		IntNetJavaFXTldAttrPane retnew = new IntNetJavaFXTldAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureTenantObj argContainer,
		IIntNetTldObj argFocus,
		Collection<IIntNetTldObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		IntNetJavaFXTldListPane retnew = new IntNetJavaFXTldListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetTldObj argFocus,
		ISecureTenantObj argContainer,
		Collection<IIntNetTldObj> argDataCollection,
		IIntNetJavaFXTldChosen whenChosen )
	{
		IntNetJavaFXTldPickerPane retnew = new IntNetJavaFXTldPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IIntNetTldObj argFocus ) {
		IntNetJavaFXTldEltTabPane retnew = new IntNetJavaFXTldEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IIntNetTldObj argFocus ) {
		IntNetJavaFXTldAddPane retnew = new IntNetJavaFXTldAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IIntNetTldObj argFocus ) {
		IntNetJavaFXTldViewEditPane retnew = new IntNetJavaFXTldViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetTldObj argFocus, ICFDeleteCallback callback ) {
		IntNetJavaFXTldAskDeleteForm retnew = new IntNetJavaFXTldAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		IntNetJavaFXTldFinderForm retnew = new IntNetJavaFXTldFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetTldObj argFocus,
		ISecureTenantObj argContainer,
		Collection<IIntNetTldObj> argDataCollection,
		IIntNetJavaFXTldChosen whenChosen )
	{
		IntNetJavaFXTldPickerForm retnew = new IntNetJavaFXTldPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetTldObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		IntNetJavaFXTldAddForm retnew = new IntNetJavaFXTldAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetTldObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		IntNetJavaFXTldViewEditForm retnew = new IntNetJavaFXTldViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
