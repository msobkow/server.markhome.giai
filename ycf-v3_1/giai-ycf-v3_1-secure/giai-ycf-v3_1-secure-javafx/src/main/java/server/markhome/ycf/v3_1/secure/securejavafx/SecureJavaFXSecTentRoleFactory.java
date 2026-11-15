// Description: Java 25 JavaFX Display Element Factory for SecTentRole.

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
 *	SecureJavaFXSecTentRoleFactory JavaFX Display Element Factory
 *	for SecTentRole.
 */
public class SecureJavaFXSecTentRoleFactory
implements ISecureJavaFXSecTentRoleFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecTentRoleFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecTentRoleObj argFocus ) {
		SecureJavaFXSecTentRoleAttrPane retnew = new SecureJavaFXSecTentRoleAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecSysGrpObj argContainer,
		ISecureSecTentRoleObj argFocus,
		Collection<ISecureSecTentRoleObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecTentRoleListPane retnew = new SecureJavaFXSecTentRoleListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecTentRoleObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecTentRoleObj> argDataCollection,
		ISecureJavaFXSecTentRoleChosen whenChosen )
	{
		SecureJavaFXSecTentRolePickerPane retnew = new SecureJavaFXSecTentRolePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecTentRoleObj argFocus ) {
		SecureJavaFXSecTentRoleEltTabPane retnew = new SecureJavaFXSecTentRoleEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecTentRoleObj argFocus ) {
		SecureJavaFXSecTentRoleAddPane retnew = new SecureJavaFXSecTentRoleAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecTentRoleObj argFocus ) {
		SecureJavaFXSecTentRoleViewEditPane retnew = new SecureJavaFXSecTentRoleViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecTentRoleObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecTentRoleAskDeleteForm retnew = new SecureJavaFXSecTentRoleAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecTentRoleObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecTentRoleObj> argDataCollection,
		ISecureJavaFXSecTentRoleChosen whenChosen )
	{
		SecureJavaFXSecTentRolePickerForm retnew = new SecureJavaFXSecTentRolePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecTentRoleObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecTentRoleAddForm retnew = new SecureJavaFXSecTentRoleAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecTentRoleObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecTentRoleViewEditForm retnew = new SecureJavaFXSecTentRoleViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
