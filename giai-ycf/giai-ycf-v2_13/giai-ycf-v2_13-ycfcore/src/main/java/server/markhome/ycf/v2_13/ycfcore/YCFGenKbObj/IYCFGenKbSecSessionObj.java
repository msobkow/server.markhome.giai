// Description: Java 11 Object interface for YCFGenKb SecSession.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbSecSessionObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a SecSession.
	 *
	 *	@return	YCFGenKbSecSessionObj instance which should be subsequently referenced.
	 */
	IYCFGenKbSecSessionObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecSessionObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecSessionObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecSessionObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecSessionObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecSession instance.
	 *
	 *	@return	The newly locked IYCFGenKbSecSessionEditObj edition of this instance.
	 */
	IYCFGenKbSecSessionEditObj beginEdit();

	/**
	 *	End this edition of this SecSession instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecSession instance.
	 *
	 *	@return	The IYCFGenKbSecSessionEditObj edition of this instance.
	 */
	IYCFGenKbSecSessionEditObj getEdit();

	/**
	 *	Get the current edition of this SecSession instance as a IYCFGenKbSecSessionEditObj.
	 *
	 *	@return	The IYCFGenKbSecSessionEditObj edition of this instance.
	 */
	IYCFGenKbSecSessionEditObj getEditAsSecSession();

	/**
	 *	Get the IYCFGenKbSecSessionTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSecSessionTableObj table cache which manages this instance.
	 */
	IYCFGenKbSecSessionTableObj getSecSessionTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbSecSessionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecSessionBuff instance which currently backs this object.
	 */
	YCFGenKbSecSessionBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbSecSessionBuff value );

	/**
	 *	Get the YCFGenKbSecSessionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecSessionBuff instance which currently backs this object.
	 */
	YCFGenKbSecSessionBuff getSecSessionBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbSecSessionPKey primary key for this instance.
	 */
	YCFGenKbSecSessionPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbSecSessionPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbSecSessionPKey value );

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
	 *	Get the required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 */
	IYCFGenKbSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 */
	IYCFGenKbSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required IYCFGenKbSecUserObj instance referenced by the SecProxy key.
	 */
	IYCFGenKbSecUserObj getRequiredParentSecProxy();

	/**
	 *	Get the required IYCFGenKbSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required IYCFGenKbSecUserObj instance referenced by the SecProxy key.
	 */
	IYCFGenKbSecUserObj getRequiredParentSecProxy( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
