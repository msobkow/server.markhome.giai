// Description: Java 25 JavaFX Display Element Factory Interface for SecSysGrp.

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
 *	ISecureJavaFXSecSysGrpFactory JavaFX Display Element Factory Interface
 *	for SecSysGrp.
 */
public interface ISecureJavaFXSecSysGrpFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecSysGrpObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ISecureSecSysGrpObj argFocus,
		Collection<ISecureSecSysGrpObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecSysGrpObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureSecSysGrpObj> argDataCollection,
		ISecureJavaFXSecSysGrpChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ISecureSecSysGrpObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecSysGrpObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ISecureSecSysGrpObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ISecureSecSysGrpObj javaFXFocus );

	public CFBorderPane newFinderForm( ICFFormManager formManager );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecSysGrpObj javaFXFocus,
		ICFLibAnyObj argContainer,
		Collection<ISecureSecSysGrpObj> argDataCollection,
		ISecureJavaFXSecSysGrpChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecSysGrpObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecSysGrpObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
