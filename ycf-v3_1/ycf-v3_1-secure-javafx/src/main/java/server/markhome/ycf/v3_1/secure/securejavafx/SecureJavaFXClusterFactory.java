// Description: Java 25 JavaFX Display Element Factory for Cluster.

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
 *	SecureJavaFXClusterFactory JavaFX Display Element Factory
 *	for Cluster.
 */
public class SecureJavaFXClusterFactory
implements ISecureJavaFXClusterFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXClusterFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureClusterObj argFocus ) {
		SecureJavaFXClusterAttrPane retnew = new SecureJavaFXClusterAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ISecureClusterObj argFocus,
		Collection<ISecureClusterObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXClusterListPane retnew = new SecureJavaFXClusterListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureClusterObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureClusterObj> argDataCollection,
		ISecureJavaFXClusterChosen whenChosen )
	{
		SecureJavaFXClusterPickerPane retnew = new SecureJavaFXClusterPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureClusterObj argFocus ) {
		SecureJavaFXClusterEltTabPane retnew = new SecureJavaFXClusterEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureClusterObj argFocus ) {
		SecureJavaFXClusterAddPane retnew = new SecureJavaFXClusterAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureClusterObj argFocus ) {
		SecureJavaFXClusterViewEditPane retnew = new SecureJavaFXClusterViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureClusterObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXClusterAskDeleteForm retnew = new SecureJavaFXClusterAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		SecureJavaFXClusterFinderForm retnew = new SecureJavaFXClusterFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureClusterObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureClusterObj> argDataCollection,
		ISecureJavaFXClusterChosen whenChosen )
	{
		SecureJavaFXClusterPickerForm retnew = new SecureJavaFXClusterPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureClusterObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXClusterAddForm retnew = new SecureJavaFXClusterAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureClusterObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXClusterViewEditForm retnew = new SecureJavaFXClusterViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
