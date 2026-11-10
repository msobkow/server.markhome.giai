// Description: Java 11 Instance Edit Object interface for YCFSec ISOCtryCcy.

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
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public interface IYCFSecISOCtryCcyEditObj
	extends IYCFSecISOCtryCcyObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFSecISOCtryCcyObj.
	 */
	IYCFSecISOCtryCcyObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFSecISOCtryCcyObj.
	 */
	IYCFSecISOCtryCcyObj getOrigAsISOCtryCcy();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFSecISOCtryCcyObj create();

	/*
	 *	Update the instance.
	 */
	YCFSecISOCtryCcyEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFSecISOCtryCcyEditObj deleteInstance();

	/**
	 *	Get the IYCFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The IYCFSecISOCtryObj instance referenced by the Ctry key.
	 */
	IYCFSecISOCtryObj getRequiredContainerCtry();

	/**
	 *	Set the IYCFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@param	value	the IYCFSecISOCtryObj instance to be referenced by the Ctry key.
	 */
	void setRequiredContainerCtry( IYCFSecISOCtryObj value );

	/**
	 *	Get the IYCFSecISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@return	The IYCFSecISOCcyObj instance referenced by the Ccy key.
	 */
	IYCFSecISOCcyObj getRequiredParentCcy();

	/**
	 *	Set the IYCFSecISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@param	value	the IYCFSecISOCcyObj instance to be referenced by the Ccy key.
	 */
	void setRequiredParentCcy( IYCFSecISOCcyObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The IYCFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( IYCFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The IYCFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( IYCFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
