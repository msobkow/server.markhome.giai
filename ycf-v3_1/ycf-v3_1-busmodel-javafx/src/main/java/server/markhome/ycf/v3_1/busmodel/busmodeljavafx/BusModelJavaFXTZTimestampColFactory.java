// Description: Java 25 JavaFX Display Element Factory for TZTimestampCol.

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
 *	BusModelJavaFXTZTimestampColFactory JavaFX Display Element Factory
 *	for TZTimestampCol.
 */
public class BusModelJavaFXTZTimestampColFactory
implements IBusModelJavaFXTZTimestampColFactory
{
	protected IBusModelJavaFXSchema javafxSchema = null;

	public BusModelJavaFXTZTimestampColFactory( IBusModelJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, IBusModelTZTimestampColObj argFocus ) {
		BusModelJavaFXTZTimestampColAttrPane retnew = new BusModelJavaFXTZTimestampColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		IBusModelTableObj argContainer,
		IBusModelTZTimestampColObj argFocus,
		Collection<IBusModelTZTimestampColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		BusModelJavaFXTZTimestampColListPane retnew = new BusModelJavaFXTZTimestampColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		IBusModelTZTimestampColObj argFocus,
		IBusModelTableObj argContainer,
		Collection<IBusModelTZTimestampColObj> argDataCollection,
		IBusModelJavaFXTZTimestampColChosen whenChosen )
	{
		BusModelJavaFXTZTimestampColPickerPane retnew = new BusModelJavaFXTZTimestampColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, IBusModelTZTimestampColObj argFocus ) {
		BusModelJavaFXTZTimestampColEltTabPane retnew = new BusModelJavaFXTZTimestampColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, IBusModelTZTimestampColObj argFocus ) {
		BusModelJavaFXTZTimestampColAddPane retnew = new BusModelJavaFXTZTimestampColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, IBusModelTZTimestampColObj argFocus ) {
		BusModelJavaFXTZTimestampColViewEditPane retnew = new BusModelJavaFXTZTimestampColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, IBusModelTZTimestampColObj argFocus, ICFDeleteCallback callback ) {
		BusModelJavaFXTZTimestampColAskDeleteForm retnew = new BusModelJavaFXTZTimestampColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		IBusModelTZTimestampColObj argFocus,
		IBusModelTableObj argContainer,
		Collection<IBusModelTZTimestampColObj> argDataCollection,
		IBusModelJavaFXTZTimestampColChosen whenChosen )
	{
		BusModelJavaFXTZTimestampColPickerForm retnew = new BusModelJavaFXTZTimestampColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, IBusModelTZTimestampColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		BusModelJavaFXTZTimestampColAddForm retnew = new BusModelJavaFXTZTimestampColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, IBusModelTZTimestampColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		BusModelJavaFXTZTimestampColViewEditForm retnew = new BusModelJavaFXTZTimestampColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
