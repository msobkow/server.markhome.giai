// Description: Java 25 JavaFX Display Element Factory for SecClusGrpMemb.

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
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.Inz;
import server.markhome.cf.javafx.*;
import org.apache.commons.codec.binaryCFCore64;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;

/**
 *	SecureJavaFXSecClusGrpMembFactory JavaFX Display Element Factory
 *	for SecClusGrpMemb.
 */
public class SecureJavaFXSecClusGrpMembFactory
implements ISecureJavaFXSecClusGrpMembFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecClusGrpMembFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecClusGrpMembObj argFocus ) {
		SecureJavaFXSecClusGrpMembAttrPane retnew = new SecureJavaFXSecClusGrpMembAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecClusGrpObj argContainer,
		ISecureSecClusGrpMembObj argFocus,
		Collection<ISecureSecClusGrpMembObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecClusGrpMembListPane retnew = new SecureJavaFXSecClusGrpMembListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecClusGrpMembObj argFocus,
		ISecureSecClusGrpObj argContainer,
		Collection<ISecureSecClusGrpMembObj> argDataCollection,
		ISecureJavaFXSecClusGrpMembChosen whenChosen )
	{
		SecureJavaFXSecClusGrpMembPickerPane retnew = new SecureJavaFXSecClusGrpMembPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecClusGrpMembObj argFocus ) {
		SecureJavaFXSecClusGrpMembEltTabPane retnew = new SecureJavaFXSecClusGrpMembEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecClusGrpMembObj argFocus ) {
		SecureJavaFXSecClusGrpMembAddPane retnew = new SecureJavaFXSecClusGrpMembAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecClusGrpMembObj argFocus ) {
		SecureJavaFXSecClusGrpMembViewEditPane retnew = new SecureJavaFXSecClusGrpMembViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecClusGrpMembObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecClusGrpMembAskDeleteForm retnew = new SecureJavaFXSecClusGrpMembAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecClusGrpMembObj argFocus,
		ISecureSecClusGrpObj argContainer,
		Collection<ISecureSecClusGrpMembObj> argDataCollection,
		ISecureJavaFXSecClusGrpMembChosen whenChosen )
	{
		SecureJavaFXSecClusGrpMembPickerForm retnew = new SecureJavaFXSecClusGrpMembPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecClusGrpMembObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecClusGrpMembAddForm retnew = new SecureJavaFXSecClusGrpMembAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecClusGrpMembObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecClusGrpMembViewEditForm retnew = new SecureJavaFXSecClusGrpMembViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
