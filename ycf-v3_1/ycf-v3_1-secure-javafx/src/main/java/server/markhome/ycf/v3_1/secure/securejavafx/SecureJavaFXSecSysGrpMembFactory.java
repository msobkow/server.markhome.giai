// Description: Java 25 JavaFX Display Element Factory for SecSysGrpMemb.

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
 *	SecureJavaFXSecSysGrpMembFactory JavaFX Display Element Factory
 *	for SecSysGrpMemb.
 */
public class SecureJavaFXSecSysGrpMembFactory
implements ISecureJavaFXSecSysGrpMembFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecSysGrpMembFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecSysGrpMembObj argFocus ) {
		SecureJavaFXSecSysGrpMembAttrPane retnew = new SecureJavaFXSecSysGrpMembAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecSysGrpObj argContainer,
		ISecureSecSysGrpMembObj argFocus,
		Collection<ISecureSecSysGrpMembObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecSysGrpMembListPane retnew = new SecureJavaFXSecSysGrpMembListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecSysGrpMembObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecSysGrpMembObj> argDataCollection,
		ISecureJavaFXSecSysGrpMembChosen whenChosen )
	{
		SecureJavaFXSecSysGrpMembPickerPane retnew = new SecureJavaFXSecSysGrpMembPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecSysGrpMembObj argFocus ) {
		SecureJavaFXSecSysGrpMembEltTabPane retnew = new SecureJavaFXSecSysGrpMembEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecSysGrpMembObj argFocus ) {
		SecureJavaFXSecSysGrpMembAddPane retnew = new SecureJavaFXSecSysGrpMembAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecSysGrpMembObj argFocus ) {
		SecureJavaFXSecSysGrpMembViewEditPane retnew = new SecureJavaFXSecSysGrpMembViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecSysGrpMembObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecSysGrpMembAskDeleteForm retnew = new SecureJavaFXSecSysGrpMembAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecSysGrpMembObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecSysGrpMembObj> argDataCollection,
		ISecureJavaFXSecSysGrpMembChosen whenChosen )
	{
		SecureJavaFXSecSysGrpMembPickerForm retnew = new SecureJavaFXSecSysGrpMembPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecSysGrpMembObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecSysGrpMembAddForm retnew = new SecureJavaFXSecSysGrpMembAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecSysGrpMembObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecSysGrpMembViewEditForm retnew = new SecureJavaFXSecSysGrpMembViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
