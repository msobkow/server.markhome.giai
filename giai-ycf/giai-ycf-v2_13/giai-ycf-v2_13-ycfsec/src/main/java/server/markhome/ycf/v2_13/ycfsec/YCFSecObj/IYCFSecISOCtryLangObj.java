// Description: Java 11 Object interface for YCFSec ISOCtryLang.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public interface IYCFSecISOCtryLangObj
	extends IYCFLibAnyObj
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
	 *	Realise this instance of a ISOCtryLang.
	 *
	 *	@return	YCFSecISOCtryLangObj instance which should be subsequently referenced.
	 */
	IYCFSecISOCtryLangObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOCtryLangObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOCtryLangObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOCtryLangObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOCtryLangObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOCtryLang instance.
	 *
	 *	@return	The newly locked IYCFSecISOCtryLangEditObj edition of this instance.
	 */
	IYCFSecISOCtryLangEditObj beginEdit();

	/**
	 *	End this edition of this ISOCtryLang instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOCtryLang instance.
	 *
	 *	@return	The IYCFSecISOCtryLangEditObj edition of this instance.
	 */
	IYCFSecISOCtryLangEditObj getEdit();

	/**
	 *	Get the current edition of this ISOCtryLang instance as a IYCFSecISOCtryLangEditObj.
	 *
	 *	@return	The IYCFSecISOCtryLangEditObj edition of this instance.
	 */
	IYCFSecISOCtryLangEditObj getEditAsISOCtryLang();

	/**
	 *	Get the IYCFSecISOCtryLangTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecISOCtryLangTableObj table cache which manages this instance.
	 */
	IYCFSecISOCtryLangTableObj getISOCtryLangTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecISOCtryLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOCtryLangBuff instance which currently backs this object.
	 */
	YCFSecISOCtryLangBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecISOCtryLangBuff value );

	/**
	 *	Get the YCFSecISOCtryLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOCtryLangBuff instance which currently backs this object.
	 */
	YCFSecISOCtryLangBuff getISOCtryLangBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFSecISOCtryLangPKey primary key for this instance.
	 */
	YCFSecISOCtryLangPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFSecISOCtryLangPKey primary key value for this instance.
	 */
	void setPKey( YCFSecISOCtryLangPKey value );

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
	 *	Get the required short attribute ISOLangId.
	 *
	 *	@return	The required short attribute ISOLangId.
	 */
	short getRequiredISOLangId();

	/**
	 *	Get the required IYCFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The required IYCFSecISOCtryObj instance referenced by the Ctry key.
	 */
	IYCFSecISOCtryObj getRequiredContainerCtry();

	/**
	 *	Get the required IYCFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The required IYCFSecISOCtryObj instance referenced by the Ctry key.
	 */
	IYCFSecISOCtryObj getRequiredContainerCtry( boolean forceRead );

	/**
	 *	Get the required IYCFSecISOLangObj instance referenced by the Lang key.
	 *
	 *	@return	The required IYCFSecISOLangObj instance referenced by the Lang key.
	 */
	IYCFSecISOLangObj getRequiredParentLang();

	/**
	 *	Get the required IYCFSecISOLangObj instance referenced by the Lang key.
	 *
	 *	@return	The required IYCFSecISOLangObj instance referenced by the Lang key.
	 */
	IYCFSecISOLangObj getRequiredParentLang( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
