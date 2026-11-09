// Description: Java 11 Instance Edit Object interface for CFGenKb SecGrpInc.

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

public interface ICFGenKbSecGrpIncEditObj
	extends ICFGenKbSecGrpIncObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbSecGrpIncObj.
	 */
	ICFGenKbSecGrpIncObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbSecGrpIncObj.
	 */
	ICFGenKbSecGrpIncObj getOrigAsSecGrpInc();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbSecGrpIncObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbSecGrpIncEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbSecGrpIncEditObj deleteInstance();

	/**
	 *	Get the ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ICFGenKbClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( ICFGenKbClusterObj value );

	/**
	 *	Get the ICFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFGenKbSecGroupObj instance referenced by the Group key.
	 */
	ICFGenKbSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFGenKbSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFGenKbSecGroupObj value );

	/**
	 *	Get the ICFGenKbSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The ICFGenKbSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFGenKbSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Set the ICFGenKbSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@param	value	the ICFGenKbSecGroupObj instance to be referenced by the SubGroup key.
	 */
	void setRequiredParentSubGroup( ICFGenKbSecGroupObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFGenKbSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFGenKbSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
