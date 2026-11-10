// Description: Java 11 Object interface for YCFInt ISOTZone.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntISOTZoneObj
	extends IYCFSecISOTZoneObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The IYCFSecSecUserObj instance who created this instance.
	 */
	IYCFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The IYCFSecSecUserObj instance who updated this instance.
	 */
	IYCFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a ISOTZone.
	 *
	 *	@return	YCFSecISOTZoneObj instance which should be subsequently referenced.
	 */
	IYCFSecISOTZoneObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOTZoneObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOTZoneObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOTZoneObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOTZoneObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOTZone instance.
	 *
	 *	@return	The newly locked IYCFSecISOTZoneEditObj edition of this instance.
	 */
	IYCFSecISOTZoneEditObj beginEdit();

	/**
	 *	End this edition of this ISOTZone instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOTZone instance.
	 *
	 *	@return	The IYCFSecISOTZoneEditObj edition of this instance.
	 */
	IYCFSecISOTZoneEditObj getEdit();

	/**
	 *	Get the current edition of this ISOTZone instance as a IYCFSecISOTZoneEditObj.
	 *
	 *	@return	The IYCFSecISOTZoneEditObj edition of this instance.
	 */
	IYCFSecISOTZoneEditObj getEditAsISOTZone();

	/**
	 *	Get the IYCFSecISOTZoneTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecISOTZoneTableObj table cache which manages this instance.
	 */
	IYCFSecISOTZoneTableObj getISOTZoneTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecISOTZoneBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOTZoneBuff instance which currently backs this object.
	 */
	YCFSecISOTZoneBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecISOTZoneBuff value );

	/**
	 *	Get the YCFSecISOTZoneBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOTZoneBuff instance which currently backs this object.
	 */
	YCFSecISOTZoneBuff getISOTZoneBuff();

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required short attribute ISOTZoneId.
	 *
	 *	@return	The required short attribute ISOTZoneId.
	 */
	short getRequiredISOTZoneId();

	/**
	 *	Get the required String attribute Iso8601.
	 *
	 *	@return	The required String attribute Iso8601.
	 */
	String getRequiredIso8601();

	/**
	 *	Get the required String attribute TZName.
	 *
	 *	@return	The required String attribute TZName.
	 */
	String getRequiredTZName();

	/**
	 *	Get the required short attribute TZHourOffset.
	 *
	 *	@return	The required short attribute TZHourOffset.
	 */
	short getRequiredTZHourOffset();

	/**
	 *	Get the required short attribute TZMinOffset.
	 *
	 *	@return	The required short attribute TZMinOffset.
	 */
	short getRequiredTZMinOffset();

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Get the required boolean attribute Visible.
	 *
	 *	@return	The required boolean attribute Visible.
	 */
	boolean getRequiredVisible();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
