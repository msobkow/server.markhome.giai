// Description: Java 11 Object interface for YCFBam ISOCcy.

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamISOCcyObj
	extends IYCFSecISOCcyObj,
		IYCFIntISOCcyObj
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
	 *	Realise this instance of a ISOCcy.
	 *
	 *	@return	YCFSecISOCcyObj instance which should be subsequently referenced.
	 */
	IYCFSecISOCcyObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOCcyObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOCcyObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOCcyObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOCcyObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOCcy instance.
	 *
	 *	@return	The newly locked IYCFSecISOCcyEditObj edition of this instance.
	 */
	IYCFSecISOCcyEditObj beginEdit();

	/**
	 *	End this edition of this ISOCcy instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOCcy instance.
	 *
	 *	@return	The IYCFSecISOCcyEditObj edition of this instance.
	 */
	IYCFSecISOCcyEditObj getEdit();

	/**
	 *	Get the current edition of this ISOCcy instance as a IYCFSecISOCcyEditObj.
	 *
	 *	@return	The IYCFSecISOCcyEditObj edition of this instance.
	 */
	IYCFSecISOCcyEditObj getEditAsISOCcy();

	/**
	 *	Get the IYCFSecISOCcyTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecISOCcyTableObj table cache which manages this instance.
	 */
	IYCFSecISOCcyTableObj getISOCcyTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecISOCcyBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOCcyBuff instance which currently backs this object.
	 */
	YCFSecISOCcyBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecISOCcyBuff value );

	/**
	 *	Get the YCFSecISOCcyBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOCcyBuff instance which currently backs this object.
	 */
	YCFSecISOCcyBuff getISOCcyBuff();

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
	 *	Get the required short attribute ISOCcyId.
	 *
	 *	@return	The required short attribute ISOCcyId.
	 */
	short getRequiredISOCcyId();

	/**
	 *	Get the required String attribute ISOCode.
	 *
	 *	@return	The required String attribute ISOCode.
	 */
	String getRequiredISOCode();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute UnitSymbol.
	 *
	 *	@return	The optional String attribute UnitSymbol.
	 */
	String getOptionalUnitSymbol();

	/**
	 *	Get the required short attribute Precis.
	 *
	 *	@return	The required short attribute Precis.
	 */
	short getRequiredPrecis();

	/**
	 *	Get the array of optional IYCFSecISOCtryCcyObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional IYCFSecISOCtryCcyObj[] array of instances referenced by the Ctry key.
	 */
	List<IYCFSecISOCtryCcyObj> getOptionalChildrenCtry();

	/**
	 *	Get the array of optional IYCFSecISOCtryCcyObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional IYCFSecISOCtryCcyObj[] array of instances referenced by the Ctry key.
	 */
	List<IYCFSecISOCtryCcyObj> getOptionalChildrenCtry( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
