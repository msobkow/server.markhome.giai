// Description: Java 25 JavaFX Display Element Factory for SysCluster.

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
 *	SecureJavaFXSysClusterFactory JavaFX Display Element Factory
 *	for SysCluster.
 */
public class SecureJavaFXSysClusterFactory
implements ISecureJavaFXSysClusterFactory
{
	protected ISecureJavaFXSchema javafxSchema = null;

	public SecureJavaFXSysClusterFactory( ISecureJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSysClusterObj argFocus ) {
		SecureJavaFXSysClusterAttrPane retnew = new SecureJavaFXSysClusterAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureClusterObj argContainer,
		ISecureSysClusterObj argFocus,
		Collection<ISecureSysClusterObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		SecureJavaFXSysClusterListPane retnew = new SecureJavaFXSysClusterListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSysClusterObj argFocus,
		ISecureClusterObj argContainer,
		Collection<ISecureSysClusterObj> argDataCollection,
		ISecureJavaFXSysClusterChosen whenChosen )
	{
		SecureJavaFXSysClusterPickerPane retnew = new SecureJavaFXSysClusterPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ISecureSysClusterObj argFocus ) {
		SecureJavaFXSysClusterEltTabPane retnew = new SecureJavaFXSysClusterEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ISecureSysClusterObj argFocus ) {
		SecureJavaFXSysClusterAddPane retnew = new SecureJavaFXSysClusterAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ISecureSysClusterObj argFocus ) {
		SecureJavaFXSysClusterViewEditPane retnew = new SecureJavaFXSysClusterViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSysClusterObj argFocus, ICFDeleteCallback callback ) {
		SecureJavaFXSysClusterAskDeleteForm retnew = new SecureJavaFXSysClusterAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newFinderForm( ICFFormManager formManager ) {
		SecureJavaFXSysClusterFinderForm retnew = new SecureJavaFXSysClusterFinderForm( formManager, javafxSchema );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSysClusterObj argFocus,
		ISecureClusterObj argContainer,
		Collection<ISecureSysClusterObj> argDataCollection,
		ISecureJavaFXSysClusterChosen whenChosen )
	{
		SecureJavaFXSysClusterPickerForm retnew = new SecureJavaFXSysClusterPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSysClusterObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		SecureJavaFXSysClusterAddForm retnew = new SecureJavaFXSysClusterAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSysClusterObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		SecureJavaFXSysClusterViewEditForm retnew = new SecureJavaFXSysClusterViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
