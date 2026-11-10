
// Description: Java 11 Factory interface for TopProject.

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
 *	YCFIntTopProjectFactory interface for TopProject
 */
public interface IYCFIntTopProjectFactory
{

	/**
	 *	Allocate a primary key for TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntTopProjectPKey newPKey();

	/**
	 *	Allocate a primary history key for TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntTopProjectHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntTopProjectByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a TopDomainIdx key over TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntTopProjectByTopDomainIdxKey newTopDomainIdxKey();

	/**
	 *	Allocate a NameIdx key over TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	YCFIntTopProjectByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a TopProject instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFIntTopProjectBuff newBuff();

	/**
	 *	Allocate a TopProject history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFIntTopProjectHBuff newHBuff();

}
