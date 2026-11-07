// Description: Java 25 JavaFX Display Element Factory for DbKeyHash384Gen.

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
 *	BusModelJavaFXDbKeyHash384GenFactory JavaFX Display Element Factory
 *	for DbKeyHash384Gen.
 */
public class BusModelJavaFXDbKeyHash384GenFactory
implements IBusModelJavaFXDbKeyHash384GenFactory
{
	protected IBusModelJavaFXSchema javafxSchema = null;

	public BusModelJavaFXDbKeyHash384GenFactory( IBusModelJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelDbKeyHash384GenObj argFocus ) {
		BusModelJavaFXDbKeyHash384GenAttrPane retnew = new BusModelJavaFXDbKeyHash384GenAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelSchemaDefObj argContainer,
		IBusModelDbKeyHash384GenObj argFocus,
		Collection<IBusModelDbKeyHash384GenObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		BusModelJavaFXDbKeyHash384GenListPane retnew = new BusModelJavaFXDbKeyHash384GenListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelDbKeyHash384GenObj argFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelDbKeyHash384GenObj> argDataCollection,
		IBusModelJavaFXDbKeyHash384GenChosen whenChosen )
	{
		BusModelJavaFXDbKeyHash384GenPickerPane retnew = new BusModelJavaFXDbKeyHash384GenPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IBusModelDbKeyHash384GenObj argFocus ) {
		BusModelJavaFXDbKeyHash384GenEltTabPane retnew = new BusModelJavaFXDbKeyHash384GenEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IBusModelDbKeyHash384GenObj argFocus ) {
		BusModelJavaFXDbKeyHash384GenAddPane retnew = new BusModelJavaFXDbKeyHash384GenAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IBusModelDbKeyHash384GenObj argFocus ) {
		BusModelJavaFXDbKeyHash384GenViewEditPane retnew = new BusModelJavaFXDbKeyHash384GenViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelDbKeyHash384GenObj argFocus, ICFDeleteCallback callback ) {
		BusModelJavaFXDbKeyHash384GenAskDeleteForm retnew = new BusModelJavaFXDbKeyHash384GenAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelDbKeyHash384GenObj argFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelDbKeyHash384GenObj> argDataCollection,
		IBusModelJavaFXDbKeyHash384GenChosen whenChosen )
	{
		BusModelJavaFXDbKeyHash384GenPickerForm retnew = new BusModelJavaFXDbKeyHash384GenPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelDbKeyHash384GenObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		BusModelJavaFXDbKeyHash384GenAddForm retnew = new BusModelJavaFXDbKeyHash384GenAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelDbKeyHash384GenObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		BusModelJavaFXDbKeyHash384GenViewEditForm retnew = new BusModelJavaFXDbKeyHash384GenViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
