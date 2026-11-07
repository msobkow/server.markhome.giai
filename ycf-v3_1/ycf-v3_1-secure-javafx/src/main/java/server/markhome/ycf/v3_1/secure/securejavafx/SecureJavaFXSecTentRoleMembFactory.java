// Description: Java 25 JavaFX Display Element Factory for SecTentRoleMemb.

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
 *	SecureJavaFXSecTentRoleMembFactory JavaFX Display Element Factory
 *	for SecTentRoleMemb.
 */
public class SecureJavaFXSecTentRoleMembFactory
implements ISecureJavaFXSecTentRoleMembFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecTentRoleMembFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecTentRoleMembObj argFocus ) {
		SecureJavaFXSecTentRoleMembAttrPane retnew = new SecureJavaFXSecTentRoleMembAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecTentRoleObj argContainer,
		ISecureSecTentRoleMembObj argFocus,
		Collection<ISecureSecTentRoleMembObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecTentRoleMembListPane retnew = new SecureJavaFXSecTentRoleMembListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecTentRoleMembObj argFocus,
		ISecureSecTentRoleObj argContainer,
		Collection<ISecureSecTentRoleMembObj> argDataCollection,
		ISecureJavaFXSecTentRoleMembChosen whenChosen )
	{
		SecureJavaFXSecTentRoleMembPickerPane retnew = new SecureJavaFXSecTentRoleMembPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecTentRoleMembObj argFocus ) {
		SecureJavaFXSecTentRoleMembEltTabPane retnew = new SecureJavaFXSecTentRoleMembEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecTentRoleMembObj argFocus ) {
		SecureJavaFXSecTentRoleMembAddPane retnew = new SecureJavaFXSecTentRoleMembAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecTentRoleMembObj argFocus ) {
		SecureJavaFXSecTentRoleMembViewEditPane retnew = new SecureJavaFXSecTentRoleMembViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecTentRoleMembObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecTentRoleMembAskDeleteForm retnew = new SecureJavaFXSecTentRoleMembAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecTentRoleMembObj argFocus,
		ISecureSecTentRoleObj argContainer,
		Collection<ISecureSecTentRoleMembObj> argDataCollection,
		ISecureJavaFXSecTentRoleMembChosen whenChosen )
	{
		SecureJavaFXSecTentRoleMembPickerForm retnew = new SecureJavaFXSecTentRoleMembPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecTentRoleMembObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecTentRoleMembAddForm retnew = new SecureJavaFXSecTentRoleMembAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecTentRoleMembObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecTentRoleMembViewEditForm retnew = new SecureJavaFXSecTentRoleMembViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
