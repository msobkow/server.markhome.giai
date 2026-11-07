// Description: Java 25 JavaFX Display Element Factory for Int64Col.

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
 *	BusModelJavaFXInt64ColFactory JavaFX Display Element Factory
 *	for Int64Col.
 */
public class BusModelJavaFXInt64ColFactory
implements IBusModelJavaFXInt64ColFactory
{
	protected IBusModelJavaFXSchema javafxSchema = null;

	public BusModelJavaFXInt64ColFactory( IBusModelJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelInt64ColObj argFocus ) {
		BusModelJavaFXInt64ColAttrPane retnew = new BusModelJavaFXInt64ColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelTableObj argContainer,
		IBusModelInt64ColObj argFocus,
		Collection<IBusModelInt64ColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		BusModelJavaFXInt64ColListPane retnew = new BusModelJavaFXInt64ColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelInt64ColObj argFocus,
		IBusModelTableObj argContainer,
		Collection<IBusModelInt64ColObj> argDataCollection,
		IBusModelJavaFXInt64ColChosen whenChosen )
	{
		BusModelJavaFXInt64ColPickerPane retnew = new BusModelJavaFXInt64ColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IBusModelInt64ColObj argFocus ) {
		BusModelJavaFXInt64ColEltTabPane retnew = new BusModelJavaFXInt64ColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IBusModelInt64ColObj argFocus ) {
		BusModelJavaFXInt64ColAddPane retnew = new BusModelJavaFXInt64ColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IBusModelInt64ColObj argFocus ) {
		BusModelJavaFXInt64ColViewEditPane retnew = new BusModelJavaFXInt64ColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelInt64ColObj argFocus, ICFDeleteCallback callback ) {
		BusModelJavaFXInt64ColAskDeleteForm retnew = new BusModelJavaFXInt64ColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelInt64ColObj argFocus,
		IBusModelTableObj argContainer,
		Collection<IBusModelInt64ColObj> argDataCollection,
		IBusModelJavaFXInt64ColChosen whenChosen )
	{
		BusModelJavaFXInt64ColPickerForm retnew = new BusModelJavaFXInt64ColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelInt64ColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		BusModelJavaFXInt64ColAddForm retnew = new BusModelJavaFXInt64ColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelInt64ColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		BusModelJavaFXInt64ColViewEditForm retnew = new BusModelJavaFXInt64ColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
