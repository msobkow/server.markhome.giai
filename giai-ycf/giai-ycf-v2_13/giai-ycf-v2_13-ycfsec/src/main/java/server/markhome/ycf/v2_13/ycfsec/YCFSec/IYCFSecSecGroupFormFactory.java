
// Description: Java 11 Factory interface for SecGroupForm.

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
 *	YCFSecSecGroupFormFactory interface for SecGroupForm
 */
public interface IYCFSecSecGroupFormFactory
{

	/**
	 *	Allocate a primary key for SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormPKey newPKey();

	/**
	 *	Allocate a primary history key for SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a GroupIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a AppIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormByAppIdxKey newAppIdxKey();

	/**
	 *	Allocate a FormIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormByFormIdxKey newFormIdxKey();

	/**
	 *	Allocate a UFormIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormByUFormIdxKey newUFormIdxKey();

	/**
	 *	Allocate a SecGroupForm instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormBuff newBuff();

	/**
	 *	Allocate a SecGroupForm history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFSecSecGroupFormHBuff newHBuff();

}
