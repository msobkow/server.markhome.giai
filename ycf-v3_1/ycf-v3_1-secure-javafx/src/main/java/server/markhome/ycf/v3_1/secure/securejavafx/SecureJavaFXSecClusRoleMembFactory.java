// Description: Java 25 JavaFX Display Element Factory for SecClusRoleMemb.

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
 *	SecureJavaFXSecClusRoleMembFactory JavaFX Display Element Factory
 *	for SecClusRoleMemb.
 */
public class SecureJavaFXSecClusRoleMembFactory
implements ISecureJavaFXSecClusRoleMembFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecClusRoleMembFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecClusRoleMembObj argFocus ) {
		SecureJavaFXSecClusRoleMembAttrPane retnew = new SecureJavaFXSecClusRoleMembAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecClusRoleObj argContainer,
		ISecureSecClusRoleMembObj argFocus,
		Collection<ISecureSecClusRoleMembObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecClusRoleMembListPane retnew = new SecureJavaFXSecClusRoleMembListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecClusRoleMembObj argFocus,
		ISecureSecClusRoleObj argContainer,
		Collection<ISecureSecClusRoleMembObj> argDataCollection,
		ISecureJavaFXSecClusRoleMembChosen whenChosen )
	{
		SecureJavaFXSecClusRoleMembPickerPane retnew = new SecureJavaFXSecClusRoleMembPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecClusRoleMembObj argFocus ) {
		SecureJavaFXSecClusRoleMembEltTabPane retnew = new SecureJavaFXSecClusRoleMembEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecClusRoleMembObj argFocus ) {
		SecureJavaFXSecClusRoleMembAddPane retnew = new SecureJavaFXSecClusRoleMembAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecClusRoleMembObj argFocus ) {
		SecureJavaFXSecClusRoleMembViewEditPane retnew = new SecureJavaFXSecClusRoleMembViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecClusRoleMembObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecClusRoleMembAskDeleteForm retnew = new SecureJavaFXSecClusRoleMembAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecClusRoleMembObj argFocus,
		ISecureSecClusRoleObj argContainer,
		Collection<ISecureSecClusRoleMembObj> argDataCollection,
		ISecureJavaFXSecClusRoleMembChosen whenChosen )
	{
		SecureJavaFXSecClusRoleMembPickerForm retnew = new SecureJavaFXSecClusRoleMembPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecClusRoleMembObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecClusRoleMembAddForm retnew = new SecureJavaFXSecClusRoleMembAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecClusRoleMembObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecClusRoleMembViewEditForm retnew = new SecureJavaFXSecClusRoleMembViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
