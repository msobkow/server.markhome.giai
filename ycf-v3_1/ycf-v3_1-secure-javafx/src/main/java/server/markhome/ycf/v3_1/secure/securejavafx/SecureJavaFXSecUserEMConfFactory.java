// Description: Java 25 JavaFX Display Element Factory for SecUserEMConf.

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
 *	SecureJavaFXSecUserEMConfFactory JavaFX Display Element Factory
 *	for SecUserEMConf.
 */
public class SecureJavaFXSecUserEMConfFactory
implements ISecureJavaFXSecUserEMConfFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecUserEMConfFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecUserEMConfObj argFocus ) {
		SecureJavaFXSecUserEMConfAttrPane retnew = new SecureJavaFXSecUserEMConfAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecUserObj argContainer,
		ISecureSecUserEMConfObj argFocus,
		Collection<ISecureSecUserEMConfObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecUserEMConfListPane retnew = new SecureJavaFXSecUserEMConfListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecUserEMConfObj argFocus,
		ISecureSecUserObj argContainer,
		Collection<ISecureSecUserEMConfObj> argDataCollection,
		ISecureJavaFXSecUserEMConfChosen whenChosen )
	{
		SecureJavaFXSecUserEMConfPickerPane retnew = new SecureJavaFXSecUserEMConfPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecUserEMConfObj argFocus ) {
		SecureJavaFXSecUserEMConfEltTabPane retnew = new SecureJavaFXSecUserEMConfEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecUserEMConfObj argFocus ) {
		SecureJavaFXSecUserEMConfAddPane retnew = new SecureJavaFXSecUserEMConfAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecUserEMConfObj argFocus ) {
		SecureJavaFXSecUserEMConfViewEditPane retnew = new SecureJavaFXSecUserEMConfViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecUserEMConfObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecUserEMConfAskDeleteForm retnew = new SecureJavaFXSecUserEMConfAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecUserEMConfObj argFocus,
		ISecureSecUserObj argContainer,
		Collection<ISecureSecUserEMConfObj> argDataCollection,
		ISecureJavaFXSecUserEMConfChosen whenChosen )
	{
		SecureJavaFXSecUserEMConfPickerForm retnew = new SecureJavaFXSecUserEMConfPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecUserEMConfObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecUserEMConfAddForm retnew = new SecureJavaFXSecUserEMConfAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecUserEMConfObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecUserEMConfViewEditForm retnew = new SecureJavaFXSecUserEMConfViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
