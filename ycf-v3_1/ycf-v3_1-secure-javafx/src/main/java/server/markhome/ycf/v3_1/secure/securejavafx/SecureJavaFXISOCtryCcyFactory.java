// Description: Java 25 JavaFX Display Element Factory for ISOCtryCcy.

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
 *	SecureJavaFXISOCtryCcyFactory JavaFX Display Element Factory
 *	for ISOCtryCcy.
 */
public class SecureJavaFXISOCtryCcyFactory
implements ISecureJavaFXISOCtryCcyFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXISOCtryCcyFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureISOCtryCcyObj argFocus ) {
		SecureJavaFXISOCtryCcyAttrPane retnew = new SecureJavaFXISOCtryCcyAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureISOCtryObj argContainer,
		ISecureISOCtryCcyObj argFocus,
		Collection<ISecureISOCtryCcyObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXISOCtryCcyListPane retnew = new SecureJavaFXISOCtryCcyListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureISOCtryCcyObj argFocus,
		ISecureISOCtryObj argContainer,
		Collection<ISecureISOCtryCcyObj> argDataCollection,
		ISecureJavaFXISOCtryCcyChosen whenChosen )
	{
		SecureJavaFXISOCtryCcyPickerPane retnew = new SecureJavaFXISOCtryCcyPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureISOCtryCcyObj argFocus ) {
		SecureJavaFXISOCtryCcyEltTabPane retnew = new SecureJavaFXISOCtryCcyEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureISOCtryCcyObj argFocus ) {
		SecureJavaFXISOCtryCcyAddPane retnew = new SecureJavaFXISOCtryCcyAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureISOCtryCcyObj argFocus ) {
		SecureJavaFXISOCtryCcyViewEditPane retnew = new SecureJavaFXISOCtryCcyViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureISOCtryCcyObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXISOCtryCcyAskDeleteForm retnew = new SecureJavaFXISOCtryCcyAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureISOCtryCcyObj argFocus,
		ISecureISOCtryObj argContainer,
		Collection<ISecureISOCtryCcyObj> argDataCollection,
		ISecureJavaFXISOCtryCcyChosen whenChosen )
	{
		SecureJavaFXISOCtryCcyPickerForm retnew = new SecureJavaFXISOCtryCcyPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureISOCtryCcyObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXISOCtryCcyAddForm retnew = new SecureJavaFXISOCtryCcyAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureISOCtryCcyObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXISOCtryCcyViewEditForm retnew = new SecureJavaFXISOCtryCcyViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
