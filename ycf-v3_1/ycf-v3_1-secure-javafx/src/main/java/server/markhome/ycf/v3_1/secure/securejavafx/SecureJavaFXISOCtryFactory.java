// Description: Java 25 JavaFX Display Element Factory for ISOCtry.

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
 *	SecureJavaFXISOCtryFactory JavaFX Display Element Factory
 *	for ISOCtry.
 */
public class SecureJavaFXISOCtryFactory
implements ISecureJavaFXISOCtryFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXISOCtryFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureISOCtryObj argFocus ) {
		SecureJavaFXISOCtryAttrPane retnew = new SecureJavaFXISOCtryAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ISecureISOCtryObj argFocus,
		Collection<ISecureISOCtryObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXISOCtryListPane retnew = new SecureJavaFXISOCtryListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureISOCtryObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureISOCtryObj> argDataCollection,
		ISecureJavaFXISOCtryChosen whenChosen )
	{
		SecureJavaFXISOCtryPickerPane retnew = new SecureJavaFXISOCtryPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureISOCtryObj argFocus ) {
		SecureJavaFXISOCtryEltTabPane retnew = new SecureJavaFXISOCtryEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureISOCtryObj argFocus ) {
		SecureJavaFXISOCtryAddPane retnew = new SecureJavaFXISOCtryAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureISOCtryObj argFocus ) {
		SecureJavaFXISOCtryViewEditPane retnew = new SecureJavaFXISOCtryViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureISOCtryObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXISOCtryAskDeleteForm retnew = new SecureJavaFXISOCtryAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		SecureJavaFXISOCtryFinderForm retnew = new SecureJavaFXISOCtryFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureISOCtryObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureISOCtryObj> argDataCollection,
		ISecureJavaFXISOCtryChosen whenChosen )
	{
		SecureJavaFXISOCtryPickerForm retnew = new SecureJavaFXISOCtryPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureISOCtryObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXISOCtryAddForm retnew = new SecureJavaFXISOCtryAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureISOCtryObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXISOCtryViewEditForm retnew = new SecureJavaFXISOCtryViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
