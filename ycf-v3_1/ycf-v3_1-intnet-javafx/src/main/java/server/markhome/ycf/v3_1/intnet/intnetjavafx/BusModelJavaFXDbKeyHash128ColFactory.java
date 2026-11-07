// Description: Java 25 JavaFX Display Element Factory for DbKeyHash128Col.

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
 *	BusModelJavaFXDbKeyHash128ColFactory JavaFX Display Element Factory
 *	for DbKeyHash128Col.
 */
public class BusModelJavaFXDbKeyHash128ColFactory
implements IBusModelJavaFXDbKeyHash128ColFactory
{
	protected IBusModelJavaFXSchema javafxSchema = null;

	public BusModelJavaFXDbKeyHash128ColFactory( IBusModelJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw IYCFNullArgumentException.getService().getInstance( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelDbKeyHash128ColObj argFocus ) {
		BusModelJavaFXDbKeyHash128ColAttrPane retnew = new BusModelJavaFXDbKeyHash128ColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelTableObj argContainer,
		IBusModelDbKeyHash128ColObj argFocus,
		Collection<IBusModelDbKeyHash128ColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		BusModelJavaFXDbKeyHash128ColListPane retnew = new BusModelJavaFXDbKeyHash128ColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelDbKeyHash128ColObj argFocus,
		IBusModelTableObj argContainer,
		Collection<IBusModelDbKeyHash128ColObj> argDataCollection,
		IBusModelJavaFXDbKeyHash128ColChosen whenChosen )
	{
		BusModelJavaFXDbKeyHash128ColPickerPane retnew = new BusModelJavaFXDbKeyHash128ColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IBusModelDbKeyHash128ColObj argFocus ) {
		BusModelJavaFXDbKeyHash128ColEltTabPane retnew = new BusModelJavaFXDbKeyHash128ColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IBusModelDbKeyHash128ColObj argFocus ) {
		BusModelJavaFXDbKeyHash128ColAddPane retnew = new BusModelJavaFXDbKeyHash128ColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IBusModelDbKeyHash128ColObj argFocus ) {
		BusModelJavaFXDbKeyHash128ColViewEditPane retnew = new BusModelJavaFXDbKeyHash128ColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelDbKeyHash128ColObj argFocus, ICFDeleteCallback callback ) {
		BusModelJavaFXDbKeyHash128ColAskDeleteForm retnew = new BusModelJavaFXDbKeyHash128ColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelDbKeyHash128ColObj argFocus,
		IBusModelTableObj argContainer,
		Collection<IBusModelDbKeyHash128ColObj> argDataCollection,
		IBusModelJavaFXDbKeyHash128ColChosen whenChosen )
	{
		BusModelJavaFXDbKeyHash128ColPickerForm retnew = new BusModelJavaFXDbKeyHash128ColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelDbKeyHash128ColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		BusModelJavaFXDbKeyHash128ColAddForm retnew = new BusModelJavaFXDbKeyHash128ColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelDbKeyHash128ColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		BusModelJavaFXDbKeyHash128ColViewEditForm retnew = new BusModelJavaFXDbKeyHash128ColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
