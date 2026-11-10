// Description: Java 11 Object interface for YCFGenKb GenRule.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGelCompiler;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public interface IYCFGenKbGenRuleObj
	extends IYCFGenKbGenItemObj
{
	/**
	 *	Get the current edition of this GenRule instance as a IYCFGenKbGenRuleEditObj.
	 *
	 *	@return	The IYCFGenKbGenRuleEditObj edition of this instance.
	 */
	IYCFGenKbGenRuleEditObj getEditAsGenRule();

	/**
	 *	Get the IYCFGenKbGenRuleTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGenRuleTableObj table cache which manages this instance.
	 */
	IYCFGenKbGenRuleTableObj getGenRuleTable();

	/**
	 *	Get the YCFGenKbGenRuleBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGenRuleBuff instance which currently backs this object.
	 */
	YCFGenKbGenRuleBuff getGenRuleBuff();

	/**
	 *	Get the required String attribute DefinedNear.
	 *
	 *	@return	The required String attribute DefinedNear.
	 */
	String getRequiredDefinedNear();

	/**
	 *	Get the required String attribute Body.
	 *
	 *	@return	The required String attribute Body.
	 */
	String getRequiredBody();

	/**
	 *	Get the optional Long attribute BodyTenantId.
	 *
	 *	@return	The optional Long attribute BodyTenantId.
	 */
	Long getOptionalBodyTenantId();

	/**
	 *	Get the optional Long attribute BodyGelCacheId.
	 *
	 *	@return	The optional Long attribute BodyGelCacheId.
	 */
	Long getOptionalBodyGelCacheId();

	/**
	 *	Get the optional Long attribute BodyGelId.
	 *
	 *	@return	The optional Long attribute BodyGelId.
	 */
	Long getOptionalBodyGelId();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsBodyGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsBodyGel( boolean forceRead );

}
