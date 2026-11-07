// Description: Java 25 JavaFX Display Element Factory for TopDomain.

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
 *	IntNetJavaFXTopDomainFactory JavaFX Display Element Factory
 *	for TopDomain.
 */
public class IntNetJavaFXTopDomainFactory
implements IIntNetJavaFXTopDomainFactory
{
	protected IIntNetJavaFXSchema javafxSchema = null;

	public IntNetJavaFXTopDomainFactory( IIntNetJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetTopDomainObj argFocus ) {
		IntNetJavaFXTopDomainAttrPane retnew = new IntNetJavaFXTopDomainAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IIntNetTldObj argContainer,
		IIntNetTopDomainObj argFocus,
		Collection<IIntNetTopDomainObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		IntNetJavaFXTopDomainListPane retnew = new IntNetJavaFXTopDomainListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetTopDomainObj argFocus,
		IIntNetTldObj argContainer,
		Collection<IIntNetTopDomainObj> argDataCollection,
		IIntNetJavaFXTopDomainChosen whenChosen )
	{
		IntNetJavaFXTopDomainPickerPane retnew = new IntNetJavaFXTopDomainPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IIntNetTopDomainObj argFocus ) {
		IntNetJavaFXTopDomainEltTabPane retnew = new IntNetJavaFXTopDomainEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IIntNetTopDomainObj argFocus ) {
		IntNetJavaFXTopDomainAddPane retnew = new IntNetJavaFXTopDomainAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IIntNetTopDomainObj argFocus ) {
		IntNetJavaFXTopDomainViewEditPane retnew = new IntNetJavaFXTopDomainViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetTopDomainObj argFocus, ICFDeleteCallback callback ) {
		IntNetJavaFXTopDomainAskDeleteForm retnew = new IntNetJavaFXTopDomainAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetTopDomainObj argFocus,
		IIntNetTldObj argContainer,
		Collection<IIntNetTopDomainObj> argDataCollection,
		IIntNetJavaFXTopDomainChosen whenChosen )
	{
		IntNetJavaFXTopDomainPickerForm retnew = new IntNetJavaFXTopDomainPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetTopDomainObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		IntNetJavaFXTopDomainAddForm retnew = new IntNetJavaFXTopDomainAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetTopDomainObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		IntNetJavaFXTopDomainViewEditForm retnew = new IntNetJavaFXTopDomainViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
