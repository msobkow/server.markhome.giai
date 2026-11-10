// Description: Java 11 Object interface for YCFSec SecSession.

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

public interface IYCFSecSecSessionObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a SecSession.
	 *
	 *	@return	YCFSecSecSessionObj instance which should be subsequently referenced.
	 */
	IYCFSecSecSessionObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecSessionObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecSessionObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecSessionObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecSessionObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecSession instance.
	 *
	 *	@return	The newly locked IYCFSecSecSessionEditObj edition of this instance.
	 */
	IYCFSecSecSessionEditObj beginEdit();

	/**
	 *	End this edition of this SecSession instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecSession instance.
	 *
	 *	@return	The IYCFSecSecSessionEditObj edition of this instance.
	 */
	IYCFSecSecSessionEditObj getEdit();

	/**
	 *	Get the current edition of this SecSession instance as a IYCFSecSecSessionEditObj.
	 *
	 *	@return	The IYCFSecSecSessionEditObj edition of this instance.
	 */
	IYCFSecSecSessionEditObj getEditAsSecSession();

	/**
	 *	Get the IYCFSecSecSessionTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecSecSessionTableObj table cache which manages this instance.
	 */
	IYCFSecSecSessionTableObj getSecSessionTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecSecSessionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecSessionBuff instance which currently backs this object.
	 */
	YCFSecSecSessionBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecSecSessionBuff value );

	/**
	 *	Get the YCFSecSecSessionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecSessionBuff instance which currently backs this object.
	 */
	YCFSecSecSessionBuff getSecSessionBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFSecSecSessionPKey primary key for this instance.
	 */
	YCFSecSecSessionPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFSecSecSessionPKey primary key value for this instance.
	 */
	void setPKey( YCFSecSecSessionPKey value );

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
	 *	Get the required UUID attribute SecSessionId.
	 *
	 *	@return	The required UUID attribute SecSessionId.
	 */
	UUID getRequiredSecSessionId();

	/**
	 *	Get the required UUID attribute SecUserId.
	 *
	 *	@return	The required UUID attribute SecUserId.
	 */
	UUID getRequiredSecUserId();

	/**
	 *	Get the optional String attribute SecDevName.
	 *
	 *	@return	The optional String attribute SecDevName.
	 */
	String getOptionalSecDevName();

	/**
	 *	Get the required Calendar attribute Start.
	 *
	 *	@return	The required Calendar attribute Start.
	 */
	Calendar getRequiredStart();

	/**
	 *	Get the optional Calendar attribute Finish.
	 *
	 *	@return	The optional Calendar attribute Finish.
	 */
	Calendar getOptionalFinish();

	/**
	 *	Get the optional UUID attribute SecProxyId.
	 *
	 *	@return	The optional UUID attribute SecProxyId.
	 */
	UUID getOptionalSecProxyId();

	/**
	 *	Get the required IYCFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFSecSecUserObj instance referenced by the SecUser key.
	 */
	IYCFSecSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required IYCFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFSecSecUserObj instance referenced by the SecUser key.
	 */
	IYCFSecSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Get the required IYCFSecSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required IYCFSecSecUserObj instance referenced by the SecProxy key.
	 */
	IYCFSecSecUserObj getRequiredParentSecProxy();

	/**
	 *	Get the required IYCFSecSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required IYCFSecSecUserObj instance referenced by the SecProxy key.
	 */
	IYCFSecSecUserObj getRequiredParentSecProxy( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
