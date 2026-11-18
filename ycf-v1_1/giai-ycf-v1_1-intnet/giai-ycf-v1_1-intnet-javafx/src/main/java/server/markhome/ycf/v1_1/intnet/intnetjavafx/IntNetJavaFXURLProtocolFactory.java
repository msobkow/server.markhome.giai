// Description: Java 25 JavaFX Display Element Factory for URLProtocol.

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
 *	IntNetJavaFXURLProtocolFactory JavaFX Display Element Factory
 *	for URLProtocol.
 */
public class IntNetJavaFXURLProtocolFactory
implements IIntNetJavaFXURLProtocolFactory
{
	protected IIntNetJavaFXSchema javafxSchema = null;

	public IntNetJavaFXURLProtocolFactory( IIntNetJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetURLProtocolObj argFocus ) {
		IntNetJavaFXURLProtocolAttrPane retnew = new IntNetJavaFXURLProtocolAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		IIntNetURLProtocolObj argFocus,
		Collection<IIntNetURLProtocolObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		IntNetJavaFXURLProtocolListPane retnew = new IntNetJavaFXURLProtocolListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetURLProtocolObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<IIntNetURLProtocolObj> argDataCollection,
		IIntNetJavaFXURLProtocolChosen whenChosen )
	{
		IntNetJavaFXURLProtocolPickerPane retnew = new IntNetJavaFXURLProtocolPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IIntNetURLProtocolObj argFocus ) {
		IntNetJavaFXURLProtocolEltTabPane retnew = new IntNetJavaFXURLProtocolEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IIntNetURLProtocolObj argFocus ) {
		IntNetJavaFXURLProtocolAddPane retnew = new IntNetJavaFXURLProtocolAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IIntNetURLProtocolObj argFocus ) {
		IntNetJavaFXURLProtocolViewEditPane retnew = new IntNetJavaFXURLProtocolViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetURLProtocolObj argFocus, ICFDeleteCallback callback ) {
		IntNetJavaFXURLProtocolAskDeleteForm retnew = new IntNetJavaFXURLProtocolAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		IntNetJavaFXURLProtocolFinderForm retnew = new IntNetJavaFXURLProtocolFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetURLProtocolObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<IIntNetURLProtocolObj> argDataCollection,
		IIntNetJavaFXURLProtocolChosen whenChosen )
	{
		IntNetJavaFXURLProtocolPickerForm retnew = new IntNetJavaFXURLProtocolPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetURLProtocolObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		IntNetJavaFXURLProtocolAddForm retnew = new IntNetJavaFXURLProtocolAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetURLProtocolObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		IntNetJavaFXURLProtocolViewEditForm retnew = new IntNetJavaFXURLProtocolViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
