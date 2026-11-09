
// Description: Java 11 Factory interface for ServiceType.

/*
 *	org.msscf.msscf.CFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFSec.
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

package org.msscf.msscf.v2_13.cfsec.CFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;

/*
 *	CFSecServiceTypeFactory interface for ServiceType
 */
public interface ICFSecServiceTypeFactory
{

	/**
	 *	Allocate a primary key for ServiceType instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypePKey newPKey();

	/**
	 *	Allocate a primary history key for ServiceType instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeHPKey newHPKey();

	/**
	 *	Allocate a UDescrIdx key over ServiceType instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeByUDescrIdxKey newUDescrIdxKey();

	/**
	 *	Allocate a ServiceType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeBuff newBuff();

	/**
	 *	Allocate a ServiceType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeHBuff newHBuff();

}
