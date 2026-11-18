// Description: Java 25 JavaFX Display Element Factory Interface for ClearSubDep2.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.busmodel.busmodeljavafx;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

/**
 *	IBusModelJavaFXClearSubDep2Factory JavaFX Display Element Factory Interface
 *	for ClearSubDep2.
 */
public interface IBusModelJavaFXClearSubDep2Factory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelClearSubDep2Obj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelClearSubDep1Obj argContainer,
		IBusModelClearSubDep2Obj argFocus,
		Collection<IBusModelClearSubDep2Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelClearSubDep2Obj argFocus,
		IBusModelClearSubDep1Obj argContainer,
		Collection<IBusModelClearSubDep2Obj> argDataCollection,
		IBusModelJavaFXClearSubDep2Chosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, IBusModelClearSubDep2Obj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelClearSubDep2Obj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, IBusModelClearSubDep2Obj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, IBusModelClearSubDep2Obj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelClearSubDep2Obj javaFXFocus,
		IBusModelClearSubDep1Obj argContainer,
		Collection<IBusModelClearSubDep2Obj> argDataCollection,
		IBusModelJavaFXClearSubDep2Chosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelClearSubDep2Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelClearSubDep2Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
