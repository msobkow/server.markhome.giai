// Description: Java 25 JavaFX Display Element Factory for SecClusRole.

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
 *	SecureJavaFXSecClusRoleFactory JavaFX Display Element Factory
 *	for SecClusRole.
 */
public class SecureJavaFXSecClusRoleFactory
implements ISecureJavaFXSecClusRoleFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecClusRoleFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecClusRoleObj argFocus ) {
		SecureJavaFXSecClusRoleAttrPane retnew = new SecureJavaFXSecClusRoleAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecSysGrpObj argContainer,
		ISecureSecClusRoleObj argFocus,
		Collection<ISecureSecClusRoleObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecClusRoleListPane retnew = new SecureJavaFXSecClusRoleListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecClusRoleObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecClusRoleObj> argDataCollection,
		ISecureJavaFXSecClusRoleChosen whenChosen )
	{
		SecureJavaFXSecClusRolePickerPane retnew = new SecureJavaFXSecClusRolePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecClusRoleObj argFocus ) {
		SecureJavaFXSecClusRoleEltTabPane retnew = new SecureJavaFXSecClusRoleEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecClusRoleObj argFocus ) {
		SecureJavaFXSecClusRoleAddPane retnew = new SecureJavaFXSecClusRoleAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecClusRoleObj argFocus ) {
		SecureJavaFXSecClusRoleViewEditPane retnew = new SecureJavaFXSecClusRoleViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecClusRoleObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecClusRoleAskDeleteForm retnew = new SecureJavaFXSecClusRoleAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecClusRoleObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecClusRoleObj> argDataCollection,
		ISecureJavaFXSecClusRoleChosen whenChosen )
	{
		SecureJavaFXSecClusRolePickerForm retnew = new SecureJavaFXSecClusRolePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecClusRoleObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecClusRoleAddForm retnew = new SecureJavaFXSecClusRoleAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecClusRoleObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecClusRoleViewEditForm retnew = new SecureJavaFXSecClusRoleViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
