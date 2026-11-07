// Description: Java 25 JavaFX Display Element Factory for SecSysGrp.

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
 *	SecureJavaFXSecSysGrpFactory JavaFX Display Element Factory
 *	for SecSysGrp.
 */
public class SecureJavaFXSecSysGrpFactory
implements ISecureJavaFXSecSysGrpFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecSysGrpFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecSysGrpObj argFocus ) {
		SecureJavaFXSecSysGrpAttrPane retnew = new SecureJavaFXSecSysGrpAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ISecureSecSysGrpObj argFocus,
		Collection<ISecureSecSysGrpObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecSysGrpListPane retnew = new SecureJavaFXSecSysGrpListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecSysGrpObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureSecSysGrpObj> argDataCollection,
		ISecureJavaFXSecSysGrpChosen whenChosen )
	{
		SecureJavaFXSecSysGrpPickerPane retnew = new SecureJavaFXSecSysGrpPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecSysGrpObj argFocus ) {
		SecureJavaFXSecSysGrpEltTabPane retnew = new SecureJavaFXSecSysGrpEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecSysGrpObj argFocus ) {
		SecureJavaFXSecSysGrpAddPane retnew = new SecureJavaFXSecSysGrpAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecSysGrpObj argFocus ) {
		SecureJavaFXSecSysGrpViewEditPane retnew = new SecureJavaFXSecSysGrpViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecSysGrpObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecSysGrpAskDeleteForm retnew = new SecureJavaFXSecSysGrpAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		SecureJavaFXSecSysGrpFinderForm retnew = new SecureJavaFXSecSysGrpFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecSysGrpObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureSecSysGrpObj> argDataCollection,
		ISecureJavaFXSecSysGrpChosen whenChosen )
	{
		SecureJavaFXSecSysGrpPickerForm retnew = new SecureJavaFXSecSysGrpPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecSysGrpObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecSysGrpAddForm retnew = new SecureJavaFXSecSysGrpAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecSysGrpObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecSysGrpViewEditForm retnew = new SecureJavaFXSecSysGrpViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
