// Description: Java 25 JavaFX Display Element Factory for SecUserPassword.

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
 *	SecureJavaFXSecUserPasswordFactory JavaFX Display Element Factory
 *	for SecUserPassword.
 */
public class SecureJavaFXSecUserPasswordFactory
implements ISecureJavaFXSecUserPasswordFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecUserPasswordFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecUserPasswordObj argFocus ) {
		SecureJavaFXSecUserPasswordAttrPane retnew = new SecureJavaFXSecUserPasswordAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecUserObj argContainer,
		ISecureSecUserPasswordObj argFocus,
		Collection<ISecureSecUserPasswordObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecUserPasswordListPane retnew = new SecureJavaFXSecUserPasswordListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecUserPasswordObj argFocus,
		ISecureSecUserObj argContainer,
		Collection<ISecureSecUserPasswordObj> argDataCollection,
		ISecureJavaFXSecUserPasswordChosen whenChosen )
	{
		SecureJavaFXSecUserPasswordPickerPane retnew = new SecureJavaFXSecUserPasswordPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecUserPasswordObj argFocus ) {
		SecureJavaFXSecUserPasswordEltTabPane retnew = new SecureJavaFXSecUserPasswordEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecUserPasswordObj argFocus ) {
		SecureJavaFXSecUserPasswordAddPane retnew = new SecureJavaFXSecUserPasswordAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecUserPasswordObj argFocus ) {
		SecureJavaFXSecUserPasswordViewEditPane retnew = new SecureJavaFXSecUserPasswordViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecUserPasswordObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecUserPasswordAskDeleteForm retnew = new SecureJavaFXSecUserPasswordAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecUserPasswordObj argFocus,
		ISecureSecUserObj argContainer,
		Collection<ISecureSecUserPasswordObj> argDataCollection,
		ISecureJavaFXSecUserPasswordChosen whenChosen )
	{
		SecureJavaFXSecUserPasswordPickerForm retnew = new SecureJavaFXSecUserPasswordPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecUserPasswordObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecUserPasswordAddForm retnew = new SecureJavaFXSecUserPasswordAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecUserPasswordObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecUserPasswordViewEditForm retnew = new SecureJavaFXSecUserPasswordViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
