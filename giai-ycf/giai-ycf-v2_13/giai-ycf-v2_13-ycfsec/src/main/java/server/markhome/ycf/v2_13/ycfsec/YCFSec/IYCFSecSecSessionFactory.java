
// Description: Java 11 Factory interface for SecSession.

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
 *	YCFSecSecSessionFactory interface for SecSession
 */
public interface IYCFSecSecSessionFactory
{

	/**
	 *	Allocate a primary key for SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionPKey newPKey();

	/**
	 *	Allocate a primary history key for SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionHPKey newHPKey();

	/**
	 *	Allocate a SecUserIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionBySecUserIdxKey newSecUserIdxKey();

	/**
	 *	Allocate a SecDevIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionBySecDevIdxKey newSecDevIdxKey();

	/**
	 *	Allocate a StartIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionByStartIdxKey newStartIdxKey();

	/**
	 *	Allocate a FinishIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionByFinishIdxKey newFinishIdxKey();

	/**
	 *	Allocate a SecProxyIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionBySecProxyIdxKey newSecProxyIdxKey();

	/**
	 *	Allocate a SecSession instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionBuff newBuff();

	/**
	 *	Allocate a SecSession history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecSessionHBuff newHBuff();

}
