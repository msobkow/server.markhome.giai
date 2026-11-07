// Description: Java 25 JavaFX Display Element Factory Interface for StringType.

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
 *	IBusModelJavaFXStringTypeFactory JavaFX Display Element Factory Interface
 *	for StringType.
 */
public interface IBusModelJavaFXStringTypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelStringTypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelSchemaDefObj argContainer,
		IBusModelStringTypeObj argFocus,
		Collection<IBusModelStringTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelStringTypeObj argFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelStringTypeObj> argDataCollection,
		IBusModelJavaFXStringTypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, IBusModelStringTypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelStringTypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, IBusModelStringTypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, IBusModelStringTypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelStringTypeObj javaFXFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelStringTypeObj> argDataCollection,
		IBusModelJavaFXStringTypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelStringTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelStringTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
