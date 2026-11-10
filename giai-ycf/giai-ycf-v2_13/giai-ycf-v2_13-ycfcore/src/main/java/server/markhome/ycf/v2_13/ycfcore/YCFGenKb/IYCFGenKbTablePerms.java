// Description: Java 11 YCFGenKb Table Permissions Interface.

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

public interface IYCFGenKbTablePerms
{
	/**
	 *	Is the session allowed to create Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create DefClass instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateDefClass( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read DefClass instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadDefClass( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update DefClass instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateDefClass( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete DefClass instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteDefClass( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelBoilerplate instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelBoilerplate( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelBoilerplate instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelBoilerplate( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelBoilerplate instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelBoilerplate( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelBoilerplate instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelBoilerplate( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelBuiltin instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelBuiltin( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelBuiltin instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelBuiltin( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelBuiltin instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelBuiltin( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelBuiltin instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelBuiltin( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelCache instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelCache( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelCache instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelCache( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelCache instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelCache( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelCache instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelCache( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelCall instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelCall( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelCall instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelCall( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelCall instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelCall( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelCall instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelCall( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelConstrain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelConstrain( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelConstrain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelConstrain( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelConstrain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelConstrain( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelConstrain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelConstrain( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelCounter instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelCounter( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelCounter instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelCounter( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelCounter instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelCounter( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelCounter instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelCounter( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelError instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelError( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelError instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelError( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelError instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelError( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelError instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelError( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelExecutable instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelExecutable( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelExecutable instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelExecutable( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelExecutable instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelExecutable( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelExecutable instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelExecutable( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelExpansion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelExpansion( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelExpansion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelExpansion( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelExpansion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelExpansion( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelExpansion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelExpansion( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelInstruction instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelInstruction( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelInstruction instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelInstruction( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelInstruction instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelInstruction( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelInstruction instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelInstruction( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelModifier instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelModifier( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelModifier instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelModifier( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelModifier instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelModifier( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelModifier instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelModifier( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelPop instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelPop( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelPop instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelPop( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelPop instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelPop( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelPop instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelPop( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelPrefixLine instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelPrefixLine( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelPrefixLine instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelPrefixLine( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelPrefixLine instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelPrefixLine( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelPrefixLine instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelPrefixLine( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelSequence instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelSequence( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelSequence instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelSequence( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelSequence instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelSequence( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelSequence instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelSequence( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelSpread instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelSpread( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelSpread instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelSpread( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelSpread instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelSpread( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelSpread instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelSpread( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelSwitch instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelSwitch( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelSwitch instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelSwitch( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelSwitch instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelSwitch( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelSwitch instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelSwitch( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GelSwitchLimb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGelSwitchLimb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GelSwitchLimb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGelSwitchLimb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GelSwitchLimb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGelSwitchLimb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GelSwitchLimb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGelSwitchLimb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GenBind instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGenBind( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GenBind instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGenBind( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GenBind instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGenBind( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GenBind instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGenBind( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GenFile instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGenFile( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GenFile instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGenFile( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GenFile instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGenFile( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GenFile instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGenFile( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GenItem instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGenItem( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GenItem instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGenItem( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GenItem instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGenItem( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GenItem instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGenItem( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GenIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGenIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GenIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGenIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GenIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGenIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GenIterator instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGenIterator( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GenReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGenReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GenReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGenReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GenReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGenReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GenReference instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGenReference( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GenRule instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGenRule( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GenRule instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGenRule( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GenRule instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGenRule( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GenRule instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGenRule( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create GenTrunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateGenTrunc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read GenTrunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadGenTrunc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update GenTrunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateGenTrunc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete GenTrunc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteGenTrunc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateHostNode( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadHostNode( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateHostNode( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteHostNode( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create RuleCart instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateRuleCart( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read RuleCart instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadRuleCart( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update RuleCart instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateRuleCart( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete RuleCart instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteRuleCart( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create RuleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateRuleType( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read RuleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadRuleType( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update RuleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateRuleType( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete RuleType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteRuleType( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecApp( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecApp( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecApp( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecApp( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecDevice( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecDevice( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecDevice( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecDevice( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGroupForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGroupForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGroupForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGroupForm( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecSession( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecSession( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecSession( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecSession( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecUser( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecUser( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecUser( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecUser( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSysCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSysCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSysCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSysCluster( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTSecGroup( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTSecGrpInc( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTSecGrpMemb( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTenant( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTenant( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTenant( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTenant( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create Tool instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTool( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read Tool instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTool( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update Tool instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTool( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Tool instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTool( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to create ToolSet instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateToolSet( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to read ToolSet instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadToolSet( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to update ToolSet instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateToolSet( YCFGenKbAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ToolSet instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteToolSet( YCFGenKbAuthorization Authorization );
}
