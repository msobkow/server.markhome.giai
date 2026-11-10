// Description: Java 11 Object interface for YCFInt ISOCtryCcy.

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

public interface IYCFIntISOCtryCcyObj
	extends IYCFSecISOCtryCcyObj
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
	 *	Realise this instance of a ISOCtryCcy.
	 *
	 *	@return	YCFSecISOCtryCcyObj instance which should be subsequently referenced.
	 */
	IYCFSecISOCtryCcyObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOCtryCcyObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOCtryCcyObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOCtryCcyObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOCtryCcyObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOCtryCcy instance.
	 *
	 *	@return	The newly locked IYCFSecISOCtryCcyEditObj edition of this instance.
	 */
	IYCFSecISOCtryCcyEditObj beginEdit();

	/**
	 *	End this edition of this ISOCtryCcy instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOCtryCcy instance.
	 *
	 *	@return	The IYCFSecISOCtryCcyEditObj edition of this instance.
	 */
	IYCFSecISOCtryCcyEditObj getEdit();

	/**
	 *	Get the current edition of this ISOCtryCcy instance as a IYCFSecISOCtryCcyEditObj.
	 *
	 *	@return	The IYCFSecISOCtryCcyEditObj edition of this instance.
	 */
	IYCFSecISOCtryCcyEditObj getEditAsISOCtryCcy();

	/**
	 *	Get the IYCFSecISOCtryCcyTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecISOCtryCcyTableObj table cache which manages this instance.
	 */
	IYCFSecISOCtryCcyTableObj getISOCtryCcyTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecISOCtryCcyBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOCtryCcyBuff instance which currently backs this object.
	 */
	YCFSecISOCtryCcyBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecISOCtryCcyBuff value );

	/**
	 *	Get the YCFSecISOCtryCcyBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOCtryCcyBuff instance which currently backs this object.
	 */
	YCFSecISOCtryCcyBuff getISOCtryCcyBuff();

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
	 *	Get the required short attribute ISOCtryId.
	 *
	 *	@return	The required short attribute ISOCtryId.
	 */
	short getRequiredISOCtryId();

	/**
	 *	Get the required short attribute ISOCcyId.
	 *
	 *	@return	The required short attribute ISOCcyId.
	 */
	short getRequiredISOCcyId();

	/**
	 *	Get the required IYCFIntISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The required IYCFIntISOCtryObj instance referenced by the Ctry key.
	 */
	IYCFSecISOCtryObj getRequiredContainerCtry();

	/**
	 *	Get the required IYCFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The required IYCFSecISOCtryObj instance referenced by the Ctry key.
	 */
	IYCFSecISOCtryObj getRequiredContainerCtry( boolean forceRead );

	/**
	 *	Get the required IYCFIntISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@return	The required IYCFIntISOCcyObj instance referenced by the Ccy key.
	 */
	IYCFSecISOCcyObj getRequiredParentCcy();

	/**
	 *	Get the required IYCFSecISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@return	The required IYCFSecISOCcyObj instance referenced by the Ccy key.
	 */
	IYCFSecISOCcyObj getRequiredParentCcy( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
