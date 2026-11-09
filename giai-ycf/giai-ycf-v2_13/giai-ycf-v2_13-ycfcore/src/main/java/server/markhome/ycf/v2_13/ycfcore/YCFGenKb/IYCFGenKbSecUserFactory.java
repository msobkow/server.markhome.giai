
// Description: Java 11 Factory interface for SecUser.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfcore.CFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;

import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

/*
 *	CFGenKbSecUserFactory interface for SecUser
 */
public interface ICFGenKbSecUserFactory
{

	/**
	 *	Allocate a primary key for SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserPKey newPKey();

	/**
	 *	Allocate a ULoginIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByULoginIdxKey newULoginIdxKey();

	/**
	 *	Allocate a EMConfIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByEMConfIdxKey newEMConfIdxKey();

	/**
	 *	Allocate a PwdResetIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByPwdResetIdxKey newPwdResetIdxKey();

	/**
	 *	Allocate a DefDevIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByDefDevIdxKey newDefDevIdxKey();

	/**
	 *	Allocate a SecUser instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserBuff newBuff();

}
