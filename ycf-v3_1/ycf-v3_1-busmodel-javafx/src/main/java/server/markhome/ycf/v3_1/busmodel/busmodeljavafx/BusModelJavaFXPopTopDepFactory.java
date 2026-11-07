// Description: Java 25 JavaFX Display Element Factory for PopTopDep.

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
 *	BusModelJavaFXPopTopDepFactory JavaFX Display Element Factory
 *	for PopTopDep.
 */
public class BusModelJavaFXPopTopDepFactory
implements IBusModelJavaFXPopTopDepFactory
{
	protected IBusModelJavaFXSchema javafxSchema = null;

	public BusModelJavaFXPopTopDepFactory( IBusModelJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelPopTopDepObj argFocus ) {
		BusModelJavaFXPopTopDepAttrPane retnew = new BusModelJavaFXPopTopDepAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelRelationObj argContainer,
		IBusModelPopTopDepObj argFocus,
		Collection<IBusModelPopTopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		BusModelJavaFXPopTopDepListPane retnew = new BusModelJavaFXPopTopDepListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelPopTopDepObj argFocus,
		IBusModelRelationObj argContainer,
		Collection<IBusModelPopTopDepObj> argDataCollection,
		IBusModelJavaFXPopTopDepChosen whenChosen )
	{
		BusModelJavaFXPopTopDepPickerPane retnew = new BusModelJavaFXPopTopDepPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IBusModelPopTopDepObj argFocus ) {
		BusModelJavaFXPopTopDepEltTabPane retnew = new BusModelJavaFXPopTopDepEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IBusModelPopTopDepObj argFocus ) {
		BusModelJavaFXPopTopDepAddPane retnew = new BusModelJavaFXPopTopDepAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IBusModelPopTopDepObj argFocus ) {
		BusModelJavaFXPopTopDepViewEditPane retnew = new BusModelJavaFXPopTopDepViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelPopTopDepObj argFocus, ICFDeleteCallback callback ) {
		BusModelJavaFXPopTopDepAskDeleteForm retnew = new BusModelJavaFXPopTopDepAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelPopTopDepObj argFocus,
		IBusModelRelationObj argContainer,
		Collection<IBusModelPopTopDepObj> argDataCollection,
		IBusModelJavaFXPopTopDepChosen whenChosen )
	{
		BusModelJavaFXPopTopDepPickerForm retnew = new BusModelJavaFXPopTopDepPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelPopTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		BusModelJavaFXPopTopDepAddForm retnew = new BusModelJavaFXPopTopDepAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelPopTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		BusModelJavaFXPopTopDepViewEditForm retnew = new BusModelJavaFXPopTopDepViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
