// Description: Java 25 JavaFX Display Element Factory for SecSysRoleMemb.

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
 *	SecureJavaFXSecSysRoleMembFactory JavaFX Display Element Factory
 *	for SecSysRoleMemb.
 */
public class SecureJavaFXSecSysRoleMembFactory
implements ISecureJavaFXSecSysRoleMembFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecSysRoleMembFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecSysRoleMembObj argFocus ) {
		SecureJavaFXSecSysRoleMembAttrPane retnew = new SecureJavaFXSecSysRoleMembAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecSysRoleObj argContainer,
		ISecureSecSysRoleMembObj argFocus,
		Collection<ISecureSecSysRoleMembObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecSysRoleMembListPane retnew = new SecureJavaFXSecSysRoleMembListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecSysRoleMembObj argFocus,
		ISecureSecSysRoleObj argContainer,
		Collection<ISecureSecSysRoleMembObj> argDataCollection,
		ISecureJavaFXSecSysRoleMembChosen whenChosen )
	{
		SecureJavaFXSecSysRoleMembPickerPane retnew = new SecureJavaFXSecSysRoleMembPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecSysRoleMembObj argFocus ) {
		SecureJavaFXSecSysRoleMembEltTabPane retnew = new SecureJavaFXSecSysRoleMembEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecSysRoleMembObj argFocus ) {
		SecureJavaFXSecSysRoleMembAddPane retnew = new SecureJavaFXSecSysRoleMembAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecSysRoleMembObj argFocus ) {
		SecureJavaFXSecSysRoleMembViewEditPane retnew = new SecureJavaFXSecSysRoleMembViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecSysRoleMembObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecSysRoleMembAskDeleteForm retnew = new SecureJavaFXSecSysRoleMembAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecSysRoleMembObj argFocus,
		ISecureSecSysRoleObj argContainer,
		Collection<ISecureSecSysRoleMembObj> argDataCollection,
		ISecureJavaFXSecSysRoleMembChosen whenChosen )
	{
		SecureJavaFXSecSysRoleMembPickerForm retnew = new SecureJavaFXSecSysRoleMembPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecSysRoleMembObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecSysRoleMembAddForm retnew = new SecureJavaFXSecSysRoleMembAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecSysRoleMembObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecSysRoleMembViewEditForm retnew = new SecureJavaFXSecSysRoleMembViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
