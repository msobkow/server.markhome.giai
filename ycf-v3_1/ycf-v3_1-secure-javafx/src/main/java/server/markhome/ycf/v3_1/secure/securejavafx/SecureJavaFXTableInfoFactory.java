// Description: Java 25 JavaFX Display Element Factory for TableInfo.

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
 *	SecureJavaFXTableInfoFactory JavaFX Display Element Factory
 *	for TableInfo.
 */
public class SecureJavaFXTableInfoFactory
implements ISecureJavaFXTableInfoFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXTableInfoFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureTableInfoObj argFocus ) {
		SecureJavaFXTableInfoAttrPane retnew = new SecureJavaFXTableInfoAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ISecureTableInfoObj argFocus,
		Collection<ISecureTableInfoObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXTableInfoListPane retnew = new SecureJavaFXTableInfoListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureTableInfoObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureTableInfoObj> argDataCollection,
		ISecureJavaFXTableInfoChosen whenChosen )
	{
		SecureJavaFXTableInfoPickerPane retnew = new SecureJavaFXTableInfoPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureTableInfoObj argFocus ) {
		SecureJavaFXTableInfoEltTabPane retnew = new SecureJavaFXTableInfoEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureTableInfoObj argFocus ) {
		SecureJavaFXTableInfoAddPane retnew = new SecureJavaFXTableInfoAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureTableInfoObj argFocus ) {
		SecureJavaFXTableInfoViewEditPane retnew = new SecureJavaFXTableInfoViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureTableInfoObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXTableInfoAskDeleteForm retnew = new SecureJavaFXTableInfoAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		SecureJavaFXTableInfoFinderForm retnew = new SecureJavaFXTableInfoFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureTableInfoObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureTableInfoObj> argDataCollection,
		ISecureJavaFXTableInfoChosen whenChosen )
	{
		SecureJavaFXTableInfoPickerForm retnew = new SecureJavaFXTableInfoPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureTableInfoObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXTableInfoAddForm retnew = new SecureJavaFXTableInfoAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureTableInfoObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXTableInfoViewEditForm retnew = new SecureJavaFXTableInfoViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
