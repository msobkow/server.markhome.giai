// Description: Java 11 Object interface for YCFGenKb TSecGrpInc.

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

public interface IYCFGenKbTSecGrpIncObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The IYCFGenKbSecUserObj instance who created this instance.
	 */
	IYCFGenKbSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The IYCFGenKbSecUserObj instance who updated this instance.
	 */
	IYCFGenKbSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a TSecGrpInc.
	 *
	 *	@return	YCFGenKbTSecGrpIncObj instance which should be subsequently referenced.
	 */
	IYCFGenKbTSecGrpIncObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbTSecGrpIncObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbTSecGrpIncObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbTSecGrpIncObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbTSecGrpIncObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TSecGrpInc instance.
	 *
	 *	@return	The newly locked IYCFGenKbTSecGrpIncEditObj edition of this instance.
	 */
	IYCFGenKbTSecGrpIncEditObj beginEdit();

	/**
	 *	End this edition of this TSecGrpInc instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TSecGrpInc instance.
	 *
	 *	@return	The IYCFGenKbTSecGrpIncEditObj edition of this instance.
	 */
	IYCFGenKbTSecGrpIncEditObj getEdit();

	/**
	 *	Get the current edition of this TSecGrpInc instance as a IYCFGenKbTSecGrpIncEditObj.
	 *
	 *	@return	The IYCFGenKbTSecGrpIncEditObj edition of this instance.
	 */
	IYCFGenKbTSecGrpIncEditObj getEditAsTSecGrpInc();

	/**
	 *	Get the IYCFGenKbTSecGrpIncTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbTSecGrpIncTableObj table cache which manages this instance.
	 */
	IYCFGenKbTSecGrpIncTableObj getTSecGrpIncTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbTSecGrpIncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbTSecGrpIncBuff instance which currently backs this object.
	 */
	YCFGenKbTSecGrpIncBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbTSecGrpIncBuff value );

	/**
	 *	Get the YCFGenKbTSecGrpIncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbTSecGrpIncBuff instance which currently backs this object.
	 */
	YCFGenKbTSecGrpIncBuff getTSecGrpIncBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbTSecGrpIncPKey primary key for this instance.
	 */
	YCFGenKbTSecGrpIncPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbTSecGrpIncPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbTSecGrpIncPKey value );

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
	 *	Get the required long attribute TenantId.
	 *
	 *	@return	The required long attribute TenantId.
	 */
	long getRequiredTenantId();

	/**
	 *	Get the required long attribute TSecGrpIncId.
	 *
	 *	@return	The required long attribute TSecGrpIncId.
	 */
	long getRequiredTSecGrpIncId();

	/**
	 *	Get the required int attribute TSecGroupId.
	 *
	 *	@return	The required int attribute TSecGroupId.
	 */
	int getRequiredTSecGroupId();

	/**
	 *	Get the required int attribute IncludeGroupId.
	 *
	 *	@return	The required int attribute IncludeGroupId.
	 */
	int getRequiredIncludeGroupId();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFGenKbTSecGroupObj instance referenced by the Group key.
	 */
	IYCFGenKbTSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required IYCFGenKbTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFGenKbTSecGroupObj instance referenced by the Group key.
	 */
	IYCFGenKbTSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The required IYCFGenKbTSecGroupObj instance referenced by the SubGroup key.
	 */
	IYCFGenKbTSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Get the required IYCFGenKbTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The required IYCFGenKbTSecGroupObj instance referenced by the SubGroup key.
	 */
	IYCFGenKbTSecGroupObj getRequiredParentSubGroup( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
