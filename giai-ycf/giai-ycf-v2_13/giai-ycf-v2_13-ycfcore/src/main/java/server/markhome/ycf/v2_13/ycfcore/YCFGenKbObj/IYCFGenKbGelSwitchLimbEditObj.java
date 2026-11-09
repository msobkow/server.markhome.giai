// Description: Java 11 Instance Edit Object interface for CFGenKb GelSwitchLimb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbGelSwitchLimbEditObj
	extends ICFGenKbGelSwitchLimbObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbGelSwitchLimbObj.
	 */
	ICFGenKbGelSwitchLimbObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelSwitchLimbObj.
	 */
	ICFGenKbGelSwitchLimbObj getOrigAsGelSwitchLimb();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbGelSwitchLimbObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbGelSwitchLimbEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbGelSwitchLimbEditObj deleteInstance();

	/**
	 *	Get the required String attribute LimbName.
	 *
	 *	@return	The String value of the attribute LimbName.
	 */
	String getRequiredLimbName();

	/**
	 *	Set the required String attribute LimbName.
	 *
	 *	@param	value	the String value of the attribute LimbName.
	 */
	void setRequiredLimbName( String value );

	/**
	 *	Get the required String attribute LimbExpansion.
	 *
	 *	@return	The String value of the attribute LimbExpansion.
	 */
	String getRequiredLimbExpansion();

	/**
	 *	Set the required String attribute LimbExpansion.
	 *
	 *	@param	value	the String value of the attribute LimbExpansion.
	 */
	void setRequiredLimbExpansion( String value );

	/**
	 *	Get the ICFGenKbGelSwitchObj instance referenced by the Switch key.
	 *
	 *	@return	The ICFGenKbGelSwitchObj instance referenced by the Switch key.
	 */
	ICFGenKbGelSwitchObj getRequiredParentSwitch();

	/**
	 *	Set the ICFGenKbGelSwitchObj instance referenced by the Switch key.
	 *
	 *	@param	value	the ICFGenKbGelSwitchObj instance to be referenced by the Switch key.
	 */
	void setRequiredParentSwitch( ICFGenKbGelSwitchObj value );

	/**
	 *	Get the ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFGenKbTenantObj instance referenced by the Tenant key.
	 */
	ICFGenKbTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFGenKbTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ICFGenKbTenantObj value );
}
