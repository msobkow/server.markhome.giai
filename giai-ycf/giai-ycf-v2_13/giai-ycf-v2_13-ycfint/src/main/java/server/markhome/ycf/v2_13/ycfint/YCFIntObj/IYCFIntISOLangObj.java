// Description: Java 11 Object interface for YCFInt ISOLang.

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

public interface IYCFIntISOLangObj
	extends IYCFSecISOLangObj
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
	 *	Realise this instance of a ISOLang.
	 *
	 *	@return	YCFSecISOLangObj instance which should be subsequently referenced.
	 */
	IYCFSecISOLangObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOLangObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOLangObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecISOLangObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecISOLangObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOLang instance.
	 *
	 *	@return	The newly locked IYCFSecISOLangEditObj edition of this instance.
	 */
	IYCFSecISOLangEditObj beginEdit();

	/**
	 *	End this edition of this ISOLang instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOLang instance.
	 *
	 *	@return	The IYCFSecISOLangEditObj edition of this instance.
	 */
	IYCFSecISOLangEditObj getEdit();

	/**
	 *	Get the current edition of this ISOLang instance as a IYCFSecISOLangEditObj.
	 *
	 *	@return	The IYCFSecISOLangEditObj edition of this instance.
	 */
	IYCFSecISOLangEditObj getEditAsISOLang();

	/**
	 *	Get the IYCFSecISOLangTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecISOLangTableObj table cache which manages this instance.
	 */
	IYCFSecISOLangTableObj getISOLangTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecISOLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOLangBuff instance which currently backs this object.
	 */
	YCFSecISOLangBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecISOLangBuff value );

	/**
	 *	Get the YCFSecISOLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecISOLangBuff instance which currently backs this object.
	 */
	YCFSecISOLangBuff getISOLangBuff();

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
	 *	Get the required short attribute ISOLangId.
	 *
	 *	@return	The required short attribute ISOLangId.
	 */
	short getRequiredISOLangId();

	/**
	 *	Get the required String attribute ISO6392Code.
	 *
	 *	@return	The required String attribute ISO6392Code.
	 */
	String getRequiredISO6392Code();

	/**
	 *	Get the optional String attribute ISO6391Code.
	 *
	 *	@return	The optional String attribute ISO6391Code.
	 */
	String getOptionalISO6391Code();

	/**
	 *	Get the required String attribute EnglishName.
	 *
	 *	@return	The required String attribute EnglishName.
	 */
	String getRequiredEnglishName();

	/**
	 *	Get the array of optional IYCFSecISOCtryLangObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional IYCFSecISOCtryLangObj[] array of instances referenced by the Ctry key.
	 */
	List<IYCFSecISOCtryLangObj> getOptionalChildrenCtry();

	/**
	 *	Get the array of optional IYCFSecISOCtryLangObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional IYCFSecISOCtryLangObj[] array of instances referenced by the Ctry key.
	 */
	List<IYCFSecISOCtryLangObj> getOptionalChildrenCtry( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
