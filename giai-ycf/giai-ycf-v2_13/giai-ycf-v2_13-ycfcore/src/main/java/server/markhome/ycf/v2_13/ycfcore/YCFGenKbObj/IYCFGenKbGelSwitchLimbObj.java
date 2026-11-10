// Description: Java 11 Object interface for YCFGenKb GelSwitchLimb.

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

public interface IYCFGenKbGelSwitchLimbObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a GelSwitchLimb.
	 *
	 *	@return	YCFGenKbGelSwitchLimbObj instance which should be subsequently referenced.
	 */
	IYCFGenKbGelSwitchLimbObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGelSwitchLimbObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGelSwitchLimbObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGelSwitchLimbObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGelSwitchLimbObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this GelSwitchLimb instance.
	 *
	 *	@return	The newly locked IYCFGenKbGelSwitchLimbEditObj edition of this instance.
	 */
	IYCFGenKbGelSwitchLimbEditObj beginEdit();

	/**
	 *	End this edition of this GelSwitchLimb instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this GelSwitchLimb instance.
	 *
	 *	@return	The IYCFGenKbGelSwitchLimbEditObj edition of this instance.
	 */
	IYCFGenKbGelSwitchLimbEditObj getEdit();

	/**
	 *	Get the current edition of this GelSwitchLimb instance as a IYCFGenKbGelSwitchLimbEditObj.
	 *
	 *	@return	The IYCFGenKbGelSwitchLimbEditObj edition of this instance.
	 */
	IYCFGenKbGelSwitchLimbEditObj getEditAsGelSwitchLimb();

	/**
	 *	Get the IYCFGenKbGelSwitchLimbTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelSwitchLimbTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelSwitchLimbTableObj getGelSwitchLimbTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbGelSwitchLimbBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelSwitchLimbBuff instance which currently backs this object.
	 */
	YCFGenKbGelSwitchLimbBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbGelSwitchLimbBuff value );

	/**
	 *	Get the YCFGenKbGelSwitchLimbBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelSwitchLimbBuff instance which currently backs this object.
	 */
	YCFGenKbGelSwitchLimbBuff getGelSwitchLimbBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbGelSwitchLimbPKey primary key for this instance.
	 */
	YCFGenKbGelSwitchLimbPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbGelSwitchLimbPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbGelSwitchLimbPKey value );

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
	 *	Get the required long attribute GelCacheId.
	 *
	 *	@return	The required long attribute GelCacheId.
	 */
	long getRequiredGelCacheId();

	/**
	 *	Get the required long attribute GelInstId.
	 *
	 *	@return	The required long attribute GelInstId.
	 */
	long getRequiredGelInstId();

	/**
	 *	Get the required String attribute LimbName.
	 *
	 *	@return	The required String attribute LimbName.
	 */
	String getRequiredLimbName();

	/**
	 *	Get the required String attribute LimbExpansion.
	 *
	 *	@return	The required String attribute LimbExpansion.
	 */
	String getRequiredLimbExpansion();

	/**
	 *	Get the required IYCFGenKbGelSwitchObj instance referenced by the Switch key.
	 *
	 *	@return	The required IYCFGenKbGelSwitchObj instance referenced by the Switch key.
	 */
	IYCFGenKbGelSwitchObj getRequiredParentSwitch();

	/**
	 *	Get the required IYCFGenKbGelSwitchObj instance referenced by the Switch key.
	 *
	 *	@return	The required IYCFGenKbGelSwitchObj instance referenced by the Switch key.
	 */
	IYCFGenKbGelSwitchObj getRequiredParentSwitch( boolean forceRead );

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
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
