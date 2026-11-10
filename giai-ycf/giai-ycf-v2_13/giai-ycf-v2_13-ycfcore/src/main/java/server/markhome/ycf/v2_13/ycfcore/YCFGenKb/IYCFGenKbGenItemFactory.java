
// Description: Java 11 Factory interface for GenItem.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

/*
 *	YCFGenKbGenItemFactory interface for GenItem
 */
public interface IYCFGenKbGenItemFactory
{

	/**
	 *	Allocate a primary key for GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemPKey newPKey();

	/**
	 *	Allocate a TenantIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a CartIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByCartIdxKey newCartIdxKey();

	/**
	 *	Allocate a RuleTypeIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByRuleTypeIdxKey newRuleTypeIdxKey();

	/**
	 *	Allocate a ToolSetIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByToolSetIdxKey newToolSetIdxKey();

	/**
	 *	Allocate a ScopeIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByScopeIdxKey newScopeIdxKey();

	/**
	 *	Allocate a GenDefIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByGenDefIdxKey newGenDefIdxKey();

	/**
	 *	Allocate a AltIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByAltIdxKey newAltIdxKey();

	/**
	 *	Allocate a GelExecIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByGelExecIdxKey newGelExecIdxKey();

	/**
	 *	Allocate a ProbeIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemByProbeIdxKey newProbeIdxKey();

	/**
	 *	Allocate a GenItem instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenItemBuff newBuff();

}
