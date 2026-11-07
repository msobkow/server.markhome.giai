// Description: Java 25 JavaFX Display Element Factory Interface for SubProject.

/*
 *	server.markhome.ycf.IntNet
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal 3.1 IntNet - Internet Essentials
 *	
 *	This file is part of Yorkton Code Fractal IntNet.
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

package server.markhome.ycf.v3_1.intnet.intnetjavafx;

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;

/**
 *	IIntNetJavaFXSubProjectFactory JavaFX Display Element Factory Interface
 *	for SubProject.
 */
public interface IIntNetJavaFXSubProjectFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetSubProjectObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		IIntNetTopProjectObj argContainer,
		IIntNetSubProjectObj argFocus,
		Collection<IIntNetSubProjectObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetSubProjectObj argFocus,
		IIntNetTopProjectObj argContainer,
		Collection<IIntNetSubProjectObj> argDataCollection,
		IIntNetJavaFXSubProjectChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, IIntNetSubProjectObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetSubProjectObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, IIntNetSubProjectObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, IIntNetSubProjectObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetSubProjectObj javaFXFocus,
		IIntNetTopProjectObj argContainer,
		Collection<IIntNetSubProjectObj> argDataCollection,
		IIntNetJavaFXSubProjectChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetSubProjectObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetSubProjectObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
