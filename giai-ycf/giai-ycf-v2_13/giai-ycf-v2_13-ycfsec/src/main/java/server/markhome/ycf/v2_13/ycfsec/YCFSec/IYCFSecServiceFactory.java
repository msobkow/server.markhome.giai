
// Description: Java 11 Factory interface for Service.

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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

/*
 *	YCFSecServiceFactory interface for Service
 */
public interface IYCFSecServiceFactory
{

	/**
	 *	Allocate a primary key for Service instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServicePKey newPKey();

	/**
	 *	Allocate a primary history key for Service instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a HostIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceByHostIdxKey newHostIdxKey();

	/**
	 *	Allocate a TypeIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceByTypeIdxKey newTypeIdxKey();

	/**
	 *	Allocate a UTypeIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceByUTypeIdxKey newUTypeIdxKey();

	/**
	 *	Allocate a UHostPortIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceByUHostPortIdxKey newUHostPortIdxKey();

	/**
	 *	Allocate a Service instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceBuff newBuff();

	/**
	 *	Allocate a Service history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecServiceHBuff newHBuff();

}
