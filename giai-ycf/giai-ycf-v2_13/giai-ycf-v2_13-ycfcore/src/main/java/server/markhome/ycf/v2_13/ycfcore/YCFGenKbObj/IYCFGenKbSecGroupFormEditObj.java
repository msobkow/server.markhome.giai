// Description: Java 11 Instance Edit Object interface for YCFGenKb SecGroupForm.

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
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbSecGroupFormEditObj
	extends IYCFGenKbSecGroupFormObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFGenKbSecGroupFormObj.
	 */
	IYCFGenKbSecGroupFormObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbSecGroupFormObj.
	 */
	IYCFGenKbSecGroupFormObj getOrigAsSecGroupForm();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFGenKbSecGroupFormObj create();

	/*
	 *	Update the instance.
	 */
	YCFGenKbSecGroupFormEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFGenKbSecGroupFormEditObj deleteInstance();

	/**
	 *	Get the IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the IYCFGenKbClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( IYCFGenKbClusterObj value );

	/**
	 *	Get the IYCFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The IYCFGenKbSecGroupObj instance referenced by the Group key.
	 */
	IYCFGenKbSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the IYCFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the IYCFGenKbSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( IYCFGenKbSecGroupObj value );

	/**
	 *	Get the IYCFGenKbSecAppObj instance referenced by the App key.
	 *
	 *	@return	The IYCFGenKbSecAppObj instance referenced by the App key.
	 */
	IYCFGenKbSecAppObj getRequiredParentApp();

	/**
	 *	Set the IYCFGenKbSecAppObj instance referenced by the App key.
	 *
	 *	@param	value	the IYCFGenKbSecAppObj instance to be referenced by the App key.
	 */
	void setRequiredParentApp( IYCFGenKbSecAppObj value );

	/**
	 *	Get the IYCFGenKbSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The IYCFGenKbSecFormObj instance referenced by the Form key.
	 */
	IYCFGenKbSecFormObj getRequiredParentForm();

	/**
	 *	Set the IYCFGenKbSecFormObj instance referenced by the Form key.
	 *
	 *	@param	value	the IYCFGenKbSecFormObj instance to be referenced by the Form key.
	 */
	void setRequiredParentForm( IYCFGenKbSecFormObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The IYCFGenKbSecUserObj instance who created this instance.
	 */
	void setCreatedBy( IYCFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The IYCFGenKbSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( IYCFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
