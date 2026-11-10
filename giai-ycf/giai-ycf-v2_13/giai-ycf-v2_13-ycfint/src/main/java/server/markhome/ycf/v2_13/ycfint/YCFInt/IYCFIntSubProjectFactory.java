
// Description: Java 11 Factory interface for SubProject.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

package org.mssycf.mssycf.v2_13.ycfint.YCFInt;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

/*
 *	YCFIntSubProjectFactory interface for SubProject
 */
public interface IYCFIntSubProjectFactory
{

	/**
	 *	Allocate a primary key for SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntSubProjectPKey newPKey();

	/**
	 *	Allocate a primary history key for SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntSubProjectHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntSubProjectByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a TopProjectIdx key over SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntSubProjectByTopProjectIdxKey newTopProjectIdxKey();

	/**
	 *	Allocate a NameIdx key over SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntSubProjectByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a SubProject instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFIntSubProjectBuff newBuff();

	/**
	 *	Allocate a SubProject history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFIntSubProjectHBuff newHBuff();

}
