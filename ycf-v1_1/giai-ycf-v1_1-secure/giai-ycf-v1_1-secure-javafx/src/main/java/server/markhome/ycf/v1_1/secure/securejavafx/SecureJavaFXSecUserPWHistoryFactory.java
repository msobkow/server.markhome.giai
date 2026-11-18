// Description: Java 25 JavaFX Display Element Factory for SecUserPWHistory.

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
 *	SecureJavaFXSecUserPWHistoryFactory JavaFX Display Element Factory
 *	for SecUserPWHistory.
 */
public class SecureJavaFXSecUserPWHistoryFactory
implements ISecureJavaFXSecUserPWHistoryFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSecUserPWHistoryFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecUserPWHistoryObj argFocus ) {
		SecureJavaFXSecUserPWHistoryAttrPane retnew = new SecureJavaFXSecUserPWHistoryAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ISecureSecUserPWHistoryObj argFocus,
		Collection<ISecureSecUserPWHistoryObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSecUserPWHistoryListPane retnew = new SecureJavaFXSecUserPWHistoryListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecUserPWHistoryObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureSecUserPWHistoryObj> argDataCollection,
		ISecureJavaFXSecUserPWHistoryChosen whenChosen )
	{
		SecureJavaFXSecUserPWHistoryPickerPane retnew = new SecureJavaFXSecUserPWHistoryPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSecUserPWHistoryObj argFocus ) {
		SecureJavaFXSecUserPWHistoryEltTabPane retnew = new SecureJavaFXSecUserPWHistoryEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSecUserPWHistoryObj argFocus ) {
		SecureJavaFXSecUserPWHistoryAddPane retnew = new SecureJavaFXSecUserPWHistoryAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSecUserPWHistoryObj argFocus ) {
		SecureJavaFXSecUserPWHistoryViewEditPane retnew = new SecureJavaFXSecUserPWHistoryViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecUserPWHistoryObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSecUserPWHistoryAskDeleteForm retnew = new SecureJavaFXSecUserPWHistoryAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		SecureJavaFXSecUserPWHistoryFinderForm retnew = new SecureJavaFXSecUserPWHistoryFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecUserPWHistoryObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureSecUserPWHistoryObj> argDataCollection,
		ISecureJavaFXSecUserPWHistoryChosen whenChosen )
	{
		SecureJavaFXSecUserPWHistoryPickerForm retnew = new SecureJavaFXSecUserPWHistoryPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecUserPWHistoryObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSecUserPWHistoryAddForm retnew = new SecureJavaFXSecUserPWHistoryAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecUserPWHistoryObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSecUserPWHistoryViewEditForm retnew = new SecureJavaFXSecUserPWHistoryViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
