
// Description: Java 11 Factory interface for HostNode.

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
 *	YCFSecHostNodeFactory interface for HostNode
 */
public interface IYCFSecHostNodeFactory
{

	/**
	 *	Allocate a primary key for HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecHostNodePKey newPKey();

	/**
	 *	Allocate a primary history key for HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecHostNodeHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecHostNodeByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a UDescrIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecHostNodeByUDescrIdxKey newUDescrIdxKey();

	/**
	 *	Allocate a HostNameIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecHostNodeByHostNameIdxKey newHostNameIdxKey();

	/**
	 *	Allocate a HostNode instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecHostNodeBuff newBuff();

	/**
	 *	Allocate a HostNode history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecHostNodeHBuff newHBuff();

}
