// Description: Java 11 Instance Edit Object interface for YCFInt TSecGrpMemb.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntTSecGrpMembEditObj
	extends IYCFIntTSecGrpMembObj,
		IYCFSecTSecGrpMembEditObj
{
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
}
