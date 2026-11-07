// Description: Java 25 JavaFX Display Element Factory Interface for TopProject.

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
 *	IIntNetJavaFXTopProjectFactory JavaFX Display Element Factory Interface
 *	for TopProject.
 */
public interface IIntNetJavaFXTopProjectFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, IIntNetTopProjectObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		IIntNetTopDomainObj argContainer,
		IIntNetTopProjectObj argFocus,
		Collection<IIntNetTopProjectObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IIntNetTopProjectObj argFocus,
		IIntNetTopDomainObj argContainer,
		Collection<IIntNetTopProjectObj> argDataCollection,
		IIntNetJavaFXTopProjectChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, IIntNetTopProjectObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IIntNetTopProjectObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, IIntNetTopProjectObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, IIntNetTopProjectObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IIntNetTopProjectObj javaFXFocus,
		IIntNetTopDomainObj argContainer,
		Collection<IIntNetTopProjectObj> argDataCollection,
		IIntNetJavaFXTopProjectChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, IIntNetTopProjectObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IIntNetTopProjectObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
