// Description: Java 25 JavaFX Display Element Factory for PopSubDep3.

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
 *	BusModelJavaFXPopSubDep3Factory JavaFX Display Element Factory
 *	for PopSubDep3.
 */
public class BusModelJavaFXPopSubDep3Factory
implements IBusModelJavaFXPopSubDep3Factory
{
	protected IBusModelJavaFXSchema javafxSchema = null;

	public BusModelJavaFXPopSubDep3Factory( IBusModelJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw IYCFNullArgumentException.getService().getInstance( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelPopSubDep3Obj argFocus ) {
		BusModelJavaFXPopSubDep3AttrPane retnew = new BusModelJavaFXPopSubDep3AttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelPopSubDep2Obj argContainer,
		IBusModelPopSubDep3Obj argFocus,
		Collection<IBusModelPopSubDep3Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		BusModelJavaFXPopSubDep3ListPane retnew = new BusModelJavaFXPopSubDep3ListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelPopSubDep3Obj argFocus,
		IBusModelPopSubDep2Obj argContainer,
		Collection<IBusModelPopSubDep3Obj> argDataCollection,
		IBusModelJavaFXPopSubDep3Chosen whenChosen )
	{
		BusModelJavaFXPopSubDep3PickerPane retnew = new BusModelJavaFXPopSubDep3PickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IBusModelPopSubDep3Obj argFocus ) {
		BusModelJavaFXPopSubDep3EltTabPane retnew = new BusModelJavaFXPopSubDep3EltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IBusModelPopSubDep3Obj argFocus ) {
		BusModelJavaFXPopSubDep3AddPane retnew = new BusModelJavaFXPopSubDep3AddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IBusModelPopSubDep3Obj argFocus ) {
		BusModelJavaFXPopSubDep3ViewEditPane retnew = new BusModelJavaFXPopSubDep3ViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelPopSubDep3Obj argFocus, ICFDeleteCallback callback ) {
		BusModelJavaFXPopSubDep3AskDeleteForm retnew = new BusModelJavaFXPopSubDep3AskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelPopSubDep3Obj argFocus,
		IBusModelPopSubDep2Obj argContainer,
		Collection<IBusModelPopSubDep3Obj> argDataCollection,
		IBusModelJavaFXPopSubDep3Chosen whenChosen )
	{
		BusModelJavaFXPopSubDep3PickerForm retnew = new BusModelJavaFXPopSubDep3PickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelPopSubDep3Obj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		BusModelJavaFXPopSubDep3AddForm retnew = new BusModelJavaFXPopSubDep3AddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelPopSubDep3Obj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		BusModelJavaFXPopSubDep3ViewEditForm retnew = new BusModelJavaFXPopSubDep3ViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
