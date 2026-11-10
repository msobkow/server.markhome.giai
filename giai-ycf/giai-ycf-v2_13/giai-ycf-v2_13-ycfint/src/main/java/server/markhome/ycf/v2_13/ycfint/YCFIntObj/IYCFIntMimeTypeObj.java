// Description: Java 11 Object interface for YCFInt MimeType.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

public interface IYCFIntMimeTypeObj
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
	 *	Realise this instance of a MimeType.
	 *
	 *	@return	YCFIntMimeTypeObj instance which should be subsequently referenced.
	 */
	IYCFIntMimeTypeObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntMimeTypeObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntMimeTypeObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntMimeTypeObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntMimeTypeObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this MimeType instance.
	 *
	 *	@return	The newly locked IYCFIntMimeTypeEditObj edition of this instance.
	 */
	IYCFIntMimeTypeEditObj beginEdit();

	/**
	 *	End this edition of this MimeType instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this MimeType instance.
	 *
	 *	@return	The IYCFIntMimeTypeEditObj edition of this instance.
	 */
	IYCFIntMimeTypeEditObj getEdit();

	/**
	 *	Get the current edition of this MimeType instance as a IYCFIntMimeTypeEditObj.
	 *
	 *	@return	The IYCFIntMimeTypeEditObj edition of this instance.
	 */
	IYCFIntMimeTypeEditObj getEditAsMimeType();

	/**
	 *	Get the IYCFIntMimeTypeTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFIntMimeTypeTableObj table cache which manages this instance.
	 */
	IYCFIntMimeTypeTableObj getMimeTypeTable();

	/**
	 *	Get the IYCFIntSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFIntSchemaObj schema cache which manages this instance.
	 */
	IYCFIntSchemaObj getSchema();

	/**
	 *	Get the YCFIntMimeTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntMimeTypeBuff instance which currently backs this object.
	 */
	YCFIntMimeTypeBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFIntMimeTypeBuff value );

	/**
	 *	Get the YCFIntMimeTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntMimeTypeBuff instance which currently backs this object.
	 */
	YCFIntMimeTypeBuff getMimeTypeBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFIntMimeTypePKey primary key for this instance.
	 */
	YCFIntMimeTypePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFIntMimeTypePKey primary key value for this instance.
	 */
	void setPKey( YCFIntMimeTypePKey value );

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
	 *	Get the required int attribute MimeTypeId.
	 *
	 *	@return	The required int attribute MimeTypeId.
	 */
	int getRequiredMimeTypeId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute FileTypes.
	 *
	 *	@return	The optional String attribute FileTypes.
	 */
	String getOptionalFileTypes();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
