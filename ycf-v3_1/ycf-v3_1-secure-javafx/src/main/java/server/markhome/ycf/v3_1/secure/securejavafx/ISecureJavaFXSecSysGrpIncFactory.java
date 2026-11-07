// Description: Java 25 JavaFX Display Element Factory Interface for SecSysGrpInc.

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
 *	ISecureJavaFXSecSysGrpIncFactory JavaFX Display Element Factory Interface
 *	for SecSysGrpInc.
 */
public interface ISecureJavaFXSecSysGrpIncFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ISecureSecSysGrpIncObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ISecureSecSysGrpObj argContainer,
		ISecureSecSysGrpIncObj argFocus,
		Collection<ISecureSecSysGrpIncObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ISecureSecSysGrpIncObj argFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecSysGrpIncObj> argDataCollection,
		ISecureJavaFXSecSysGrpIncChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ISecureSecSysGrpIncObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ISecureSecSysGrpIncObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ISecureSecSysGrpIncObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ISecureSecSysGrpIncObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ISecureSecSysGrpIncObj javaFXFocus,
		ISecureSecSysGrpObj argContainer,
		Collection<ISecureSecSysGrpIncObj> argDataCollection,
		ISecureJavaFXSecSysGrpIncChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ISecureSecSysGrpIncObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ISecureSecSysGrpIncObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
