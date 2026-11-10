// Description: Java 11 Instance Edit Object interface for YCFSec Service.

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

public interface IYCFSecServiceEditObj
	extends IYCFSecServiceObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFSecServiceObj.
	 */
	IYCFSecServiceObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFSecServiceObj.
	 */
	IYCFSecServiceObj getOrigAsService();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFSecServiceObj create();

	/*
	 *	Update the instance.
	 */
	YCFSecServiceEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFSecServiceEditObj deleteInstance();

	/**
	 *	Get the required short attribute HostPort.
	 *
	 *	@return	The short value of the attribute HostPort.
	 */
	short getRequiredHostPort();

	/**
	 *	Set the required short attribute HostPort.
	 *
	 *	@param	value	the short value of the attribute HostPort.
	 */
	void setRequiredHostPort( short value );

	/**
	 *	Get the IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The IYCFSecClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the IYCFSecClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( IYCFSecClusterObj value );

	/**
	 *	Get the IYCFSecHostNodeObj instance referenced by the Host key.
	 *
	 *	@return	The IYCFSecHostNodeObj instance referenced by the Host key.
	 */
	IYCFSecHostNodeObj getOptionalContainerHost();

	/**
	 *	Set the IYCFSecHostNodeObj instance referenced by the Host key.
	 *
	 *	@param	value	the IYCFSecHostNodeObj instance to be referenced by the Host key.
	 */
	void setOptionalContainerHost( IYCFSecHostNodeObj value );

	/**
	 *	Get the IYCFSecServiceTypeObj instance referenced by the ServiceType key.
	 *
	 *	@return	The IYCFSecServiceTypeObj instance referenced by the ServiceType key.
	 */
	IYCFSecServiceTypeObj getOptionalParentServiceType();

	/**
	 *	Set the IYCFSecServiceTypeObj instance referenced by the ServiceType key.
	 *
	 *	@param	value	the IYCFSecServiceTypeObj instance to be referenced by the ServiceType key.
	 */
	void setOptionalParentServiceType( IYCFSecServiceTypeObj value );

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
