// Description: Java 11 Instance Edit Object interface for YCFSec TSecGrpMemb.

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

public interface IYCFSecTSecGrpMembEditObj
	extends IYCFSecTSecGrpMembObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFSecTSecGrpMembObj.
	 */
	IYCFSecTSecGrpMembObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFSecTSecGrpMembObj.
	 */
	IYCFSecTSecGrpMembObj getOrigAsTSecGrpMemb();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFSecTSecGrpMembObj create();

	/*
	 *	Update the instance.
	 */
	YCFSecTSecGrpMembEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFSecTSecGrpMembEditObj deleteInstance();

	/**
	 *	Get the IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the IYCFSecTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( IYCFSecTenantObj value );

	/**
	 *	Get the IYCFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The IYCFSecTSecGroupObj instance referenced by the Group key.
	 */
	IYCFSecTSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the IYCFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the IYCFSecTSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( IYCFSecTSecGroupObj value );

	/**
	 *	Get the IYCFSecSecUserObj instance referenced by the User key.
	 *
	 *	@return	The IYCFSecSecUserObj instance referenced by the User key.
	 */
	IYCFSecSecUserObj getRequiredParentUser();

	/**
	 *	Set the IYCFSecSecUserObj instance referenced by the User key.
	 *
	 *	@param	value	the IYCFSecSecUserObj instance to be referenced by the User key.
	 */
	void setRequiredParentUser( IYCFSecSecUserObj value );

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
