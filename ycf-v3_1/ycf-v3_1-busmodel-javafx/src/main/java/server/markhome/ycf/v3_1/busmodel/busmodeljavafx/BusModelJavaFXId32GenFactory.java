// Description: Java 25 JavaFX Display Element Factory for Id32Gen.

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
 *	BusModelJavaFXId32GenFactory JavaFX Display Element Factory
 *	for Id32Gen.
 */
public class BusModelJavaFXId32GenFactory
implements IBusModelJavaFXId32GenFactory
{
	protected IBusModelJavaFXSchema javafxSchema = null;

	public BusModelJavaFXId32GenFactory( IBusModelJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelId32GenObj argFocus ) {
		BusModelJavaFXId32GenAttrPane retnew = new BusModelJavaFXId32GenAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelSchemaDefObj argContainer,
		IBusModelId32GenObj argFocus,
		Collection<IBusModelId32GenObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		BusModelJavaFXId32GenListPane retnew = new BusModelJavaFXId32GenListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelId32GenObj argFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelId32GenObj> argDataCollection,
		IBusModelJavaFXId32GenChosen whenChosen )
	{
		BusModelJavaFXId32GenPickerPane retnew = new BusModelJavaFXId32GenPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IBusModelId32GenObj argFocus ) {
		BusModelJavaFXId32GenEltTabPane retnew = new BusModelJavaFXId32GenEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IBusModelId32GenObj argFocus ) {
		BusModelJavaFXId32GenAddPane retnew = new BusModelJavaFXId32GenAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IBusModelId32GenObj argFocus ) {
		BusModelJavaFXId32GenViewEditPane retnew = new BusModelJavaFXId32GenViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelId32GenObj argFocus, ICFDeleteCallback callback ) {
		BusModelJavaFXId32GenAskDeleteForm retnew = new BusModelJavaFXId32GenAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelId32GenObj argFocus,
		IBusModelSchemaDefObj argContainer,
		Collection<IBusModelId32GenObj> argDataCollection,
		IBusModelJavaFXId32GenChosen whenChosen )
	{
		BusModelJavaFXId32GenPickerForm retnew = new BusModelJavaFXId32GenPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelId32GenObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		BusModelJavaFXId32GenAddForm retnew = new BusModelJavaFXId32GenAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelId32GenObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		BusModelJavaFXId32GenViewEditForm retnew = new BusModelJavaFXId32GenViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
