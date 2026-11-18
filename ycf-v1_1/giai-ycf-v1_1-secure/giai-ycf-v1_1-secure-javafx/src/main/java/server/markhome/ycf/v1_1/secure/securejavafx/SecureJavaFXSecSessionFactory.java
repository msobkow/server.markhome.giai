// Description: Java 25 JavaFX Display Element Factory for SecSession.

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
 *	SecureJavaFXSecSessionFactory JavaFX Display Element Factory
 *	for SecSession.
 */
public class SecureJavaFXSecSessionFactory
implements ISecureJavaFXSecSessionFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecSessionFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecSessionObj argFocus ) {
		SecureJavaFXSecSessionAttrPane retnew = new SecureJavaFXSecSessionAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecUserObj argContainer,
		ISecureSecSessionObj argFocus,
		Collection<ISecureSecSessionObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecSessionListPane retnew = new SecureJavaFXSecSessionListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecSessionObj argFocus,
		ISecureSecUserObj argContainer,
		Collection<ISecureSecSessionObj> argDataCollection,
		ISecureJavaFXSecSessionChosen whenChosen )
	{
		SecureJavaFXSecSessionPickerPane retnew = new SecureJavaFXSecSessionPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecSessionObj argFocus ) {
		SecureJavaFXSecSessionEltTabPane retnew = new SecureJavaFXSecSessionEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecSessionObj argFocus ) {
		SecureJavaFXSecSessionAddPane retnew = new SecureJavaFXSecSessionAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecSessionObj argFocus ) {
		SecureJavaFXSecSessionViewEditPane retnew = new SecureJavaFXSecSessionViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecSessionObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecSessionAskDeleteForm retnew = new SecureJavaFXSecSessionAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecSessionObj argFocus,
		ISecureSecUserObj argContainer,
		Collection<ISecureSecSessionObj> argDataCollection,
		ISecureJavaFXSecSessionChosen whenChosen )
	{
		SecureJavaFXSecSessionPickerForm retnew = new SecureJavaFXSecSessionPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecSessionObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecSessionAddForm retnew = new SecureJavaFXSecSessionAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecSessionObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecSessionViewEditForm retnew = new SecureJavaFXSecSessionViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
