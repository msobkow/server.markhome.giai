// Description: Java 11 implementation of a YCFGenKb schema.

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
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.Tip.YCFTipClientHandler;

public class YCFGenKbSchema
	implements IYCFGenKbSchema
{
	protected YCFGenKbAuthorization authorization;
	protected IYCFGenKbTablePerms tablePerms;
	protected YCFGenKbConfigurationFile configuration;
	protected String jndiName;
	protected String schemaDbName = "GenKb213";
	protected String lowerDbSchemaName = schemaDbName.toLowerCase();

	static HashMap<String,AuditActionEnum> lookupAuditActionEnum = null;

	public static AuditActionEnum parseAuditActionEnum( String value ) {
		AuditActionEnum retval = parseAuditActionEnum( YCFGenKbSchema.class.getName(), value );
		return( retval );
	}

	public static AuditActionEnum parseAuditActionEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseAuditActionEnum";
		if( lookupAuditActionEnum == null ) {
			HashMap<String,AuditActionEnum> newMap = new HashMap<String,AuditActionEnum>();
			newMap.put( "Create", AuditActionEnum.Create );
			newMap.put( "Update", AuditActionEnum.Update );
			newMap.put( "Delete", AuditActionEnum.Delete );
			lookupAuditActionEnum = newMap;
		}
		AuditActionEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupAuditActionEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Unrecognized enum tag " + value );
			}
		}
		return( retval );
	}

	static HashMap<Integer,AuditActionEnum> lookupOrdinalAuditActionEnum = null;

	public static AuditActionEnum ordinalToAuditActionEnum( String fieldOrClassName, Short value ) {
		AuditActionEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToAuditActionEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static AuditActionEnum ordinalToAuditActionEnum( Short value ) {
		AuditActionEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToAuditActionEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static AuditActionEnum ordinalToAuditActionEnum( Integer value ) {
		AuditActionEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToAuditActionEnum( YCFGenKbSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static AuditActionEnum ordinalToAuditActionEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToAuditActionEnum";
		if( lookupOrdinalAuditActionEnum == null ) {
			HashMap<Integer,AuditActionEnum> newMap = new HashMap<Integer,AuditActionEnum>();
			newMap.put( Integer.valueOf( AuditActionEnum.Create.ordinal() ), AuditActionEnum.Create );
			newMap.put( Integer.valueOf( AuditActionEnum.Update.ordinal() ), AuditActionEnum.Update );
			newMap.put( Integer.valueOf( AuditActionEnum.Delete.ordinal() ), AuditActionEnum.Delete );
			lookupOrdinalAuditActionEnum = newMap;
		}
		AuditActionEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalAuditActionEnum.get( value );
			if( retval == null ) {
				throw new YCFLibInvalidArgumentException( fieldOrClassName,
					S_ProcName,
					1,
					"value",
					"Unrecognized enum ordinal " + value.toString() );
			}
		}
		return( retval );
	}

	protected IYCFGenKbClusterTable tableCluster;
	protected IYCFGenKbDefClassTable tableDefClass;
	protected IYCFGenKbGelBoilerplateTable tableGelBoilerplate;
	protected IYCFGenKbGelBuiltinTable tableGelBuiltin;
	protected IYCFGenKbGelCacheTable tableGelCache;
	protected IYCFGenKbGelCallTable tableGelCall;
	protected IYCFGenKbGelConstrainTable tableGelConstrain;
	protected IYCFGenKbGelCounterTable tableGelCounter;
	protected IYCFGenKbGelErrorTable tableGelError;
	protected IYCFGenKbGelExecutableTable tableGelExecutable;
	protected IYCFGenKbGelExpansionTable tableGelExpansion;
	protected IYCFGenKbGelInstructionTable tableGelInstruction;
	protected IYCFGenKbGelIteratorTable tableGelIterator;
	protected IYCFGenKbGelModifierTable tableGelModifier;
	protected IYCFGenKbGelPopTable tableGelPop;
	protected IYCFGenKbGelPushContextTable tableGelPushContext;
	protected IYCFGenKbGelPopContextTable tableGelPopContext;
	protected IYCFGenKbGelPrefixLineTable tableGelPrefixLine;
	protected IYCFGenKbGelReferenceTable tableGelReference;
	protected IYCFGenKbGelSequenceTable tableGelSequence;
	protected IYCFGenKbGelSpreadTable tableGelSpread;
	protected IYCFGenKbGelSwitchTable tableGelSwitch;
	protected IYCFGenKbGelSwitchLimbTable tableGelSwitchLimb;
	protected IYCFGenKbGenBindTable tableGenBind;
	protected IYCFGenKbGenFileTable tableGenFile;
	protected IYCFGenKbGenItemTable tableGenItem;
	protected IYCFGenKbGenIteratorTable tableGenIterator;
	protected IYCFGenKbGenReferenceTable tableGenReference;
	protected IYCFGenKbGenRuleTable tableGenRule;
	protected IYCFGenKbGenTruncTable tableGenTrunc;
	protected IYCFGenKbHostNodeTable tableHostNode;
	protected IYCFGenKbRuleCartTable tableRuleCart;
	protected IYCFGenKbRuleTypeTable tableRuleType;
	protected IYCFGenKbSecAppTable tableSecApp;
	protected IYCFGenKbSecDeviceTable tableSecDevice;
	protected IYCFGenKbSecFormTable tableSecForm;
	protected IYCFGenKbSecGroupTable tableSecGroup;
	protected IYCFGenKbSecGroupFormTable tableSecGroupForm;
	protected IYCFGenKbSecGrpIncTable tableSecGrpInc;
	protected IYCFGenKbSecGrpMembTable tableSecGrpMemb;
	protected IYCFGenKbSecSessionTable tableSecSession;
	protected IYCFGenKbSecUserTable tableSecUser;
	protected IYCFGenKbSysClusterTable tableSysCluster;
	protected IYCFGenKbTSecGroupTable tableTSecGroup;
	protected IYCFGenKbTSecGrpIncTable tableTSecGrpInc;
	protected IYCFGenKbTSecGrpMembTable tableTSecGrpMemb;
	protected IYCFGenKbTenantTable tableTenant;
	protected IYCFGenKbToolTable tableTool;
	protected IYCFGenKbToolSetTable tableToolSet;

	protected IYCFGenKbClusterFactory factoryCluster;
	protected IYCFGenKbDefClassFactory factoryDefClass;
	protected IYCFGenKbGelBoilerplateFactory factoryGelBoilerplate;
	protected IYCFGenKbGelBuiltinFactory factoryGelBuiltin;
	protected IYCFGenKbGelCacheFactory factoryGelCache;
	protected IYCFGenKbGelCallFactory factoryGelCall;
	protected IYCFGenKbGelConstrainFactory factoryGelConstrain;
	protected IYCFGenKbGelCounterFactory factoryGelCounter;
	protected IYCFGenKbGelErrorFactory factoryGelError;
	protected IYCFGenKbGelExecutableFactory factoryGelExecutable;
	protected IYCFGenKbGelExpansionFactory factoryGelExpansion;
	protected IYCFGenKbGelInstructionFactory factoryGelInstruction;
	protected IYCFGenKbGelIteratorFactory factoryGelIterator;
	protected IYCFGenKbGelModifierFactory factoryGelModifier;
	protected IYCFGenKbGelPopFactory factoryGelPop;
	protected IYCFGenKbGelPushContextFactory factoryGelPushContext;
	protected IYCFGenKbGelPopContextFactory factoryGelPopContext;
	protected IYCFGenKbGelPrefixLineFactory factoryGelPrefixLine;
	protected IYCFGenKbGelReferenceFactory factoryGelReference;
	protected IYCFGenKbGelSequenceFactory factoryGelSequence;
	protected IYCFGenKbGelSpreadFactory factoryGelSpread;
	protected IYCFGenKbGelSwitchFactory factoryGelSwitch;
	protected IYCFGenKbGelSwitchLimbFactory factoryGelSwitchLimb;
	protected IYCFGenKbGenBindFactory factoryGenBind;
	protected IYCFGenKbGenFileFactory factoryGenFile;
	protected IYCFGenKbGenItemFactory factoryGenItem;
	protected IYCFGenKbGenIteratorFactory factoryGenIterator;
	protected IYCFGenKbGenReferenceFactory factoryGenReference;
	protected IYCFGenKbGenRuleFactory factoryGenRule;
	protected IYCFGenKbGenTruncFactory factoryGenTrunc;
	protected IYCFGenKbHostNodeFactory factoryHostNode;
	protected IYCFGenKbRuleCartFactory factoryRuleCart;
	protected IYCFGenKbRuleTypeFactory factoryRuleType;
	protected IYCFGenKbSecAppFactory factorySecApp;
	protected IYCFGenKbSecDeviceFactory factorySecDevice;
	protected IYCFGenKbSecFormFactory factorySecForm;
	protected IYCFGenKbSecGroupFactory factorySecGroup;
	protected IYCFGenKbSecGroupFormFactory factorySecGroupForm;
	protected IYCFGenKbSecGrpIncFactory factorySecGrpInc;
	protected IYCFGenKbSecGrpMembFactory factorySecGrpMemb;
	protected IYCFGenKbSecSessionFactory factorySecSession;
	protected IYCFGenKbSecUserFactory factorySecUser;
	protected IYCFGenKbSysClusterFactory factorySysCluster;
	protected IYCFGenKbTSecGroupFactory factoryTSecGroup;
	protected IYCFGenKbTSecGrpIncFactory factoryTSecGrpInc;
	protected IYCFGenKbTSecGrpMembFactory factoryTSecGrpMemb;
	protected IYCFGenKbTenantFactory factoryTenant;
	protected IYCFGenKbToolFactory factoryTool;
	protected IYCFGenKbToolSetFactory factoryToolSet;


	public YCFGenKbSchema() {
		configuration = null;
		jndiName = null;

		tableCluster = null;
		tableDefClass = null;
		tableGelBoilerplate = null;
		tableGelBuiltin = null;
		tableGelCache = null;
		tableGelCall = null;
		tableGelConstrain = null;
		tableGelCounter = null;
		tableGelError = null;
		tableGelExecutable = null;
		tableGelExpansion = null;
		tableGelInstruction = null;
		tableGelIterator = null;
		tableGelModifier = null;
		tableGelPop = null;
		tableGelPushContext = null;
		tableGelPopContext = null;
		tableGelPrefixLine = null;
		tableGelReference = null;
		tableGelSequence = null;
		tableGelSpread = null;
		tableGelSwitch = null;
		tableGelSwitchLimb = null;
		tableGenBind = null;
		tableGenFile = null;
		tableGenItem = null;
		tableGenIterator = null;
		tableGenReference = null;
		tableGenRule = null;
		tableGenTrunc = null;
		tableHostNode = null;
		tableRuleCart = null;
		tableRuleType = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTenant = null;
		tableTool = null;
		tableToolSet = null;

		factoryCluster = new YCFGenKbClusterDefaultFactory();
		factoryDefClass = new YCFGenKbDefClassDefaultFactory();
		factoryGelBoilerplate = new YCFGenKbGelBoilerplateDefaultFactory();
		factoryGelBuiltin = new YCFGenKbGelBuiltinDefaultFactory();
		factoryGelCache = new YCFGenKbGelCacheDefaultFactory();
		factoryGelCall = new YCFGenKbGelCallDefaultFactory();
		factoryGelConstrain = new YCFGenKbGelConstrainDefaultFactory();
		factoryGelCounter = new YCFGenKbGelCounterDefaultFactory();
		factoryGelError = new YCFGenKbGelErrorDefaultFactory();
		factoryGelExecutable = new YCFGenKbGelExecutableDefaultFactory();
		factoryGelExpansion = new YCFGenKbGelExpansionDefaultFactory();
		factoryGelInstruction = new YCFGenKbGelInstructionDefaultFactory();
		factoryGelIterator = new YCFGenKbGelIteratorDefaultFactory();
		factoryGelModifier = new YCFGenKbGelModifierDefaultFactory();
		factoryGelPop = new YCFGenKbGelPopDefaultFactory();
		factoryGelPushContext = new YCFGenKbGelPushContextDefaultFactory();
		factoryGelPopContext = new YCFGenKbGelPopContextDefaultFactory();
		factoryGelPrefixLine = new YCFGenKbGelPrefixLineDefaultFactory();
		factoryGelReference = new YCFGenKbGelReferenceDefaultFactory();
		factoryGelSequence = new YCFGenKbGelSequenceDefaultFactory();
		factoryGelSpread = new YCFGenKbGelSpreadDefaultFactory();
		factoryGelSwitch = new YCFGenKbGelSwitchDefaultFactory();
		factoryGelSwitchLimb = new YCFGenKbGelSwitchLimbDefaultFactory();
		factoryGenBind = new YCFGenKbGenBindDefaultFactory();
		factoryGenFile = new YCFGenKbGenFileDefaultFactory();
		factoryGenItem = new YCFGenKbGenItemDefaultFactory();
		factoryGenIterator = new YCFGenKbGenIteratorDefaultFactory();
		factoryGenReference = new YCFGenKbGenReferenceDefaultFactory();
		factoryGenRule = new YCFGenKbGenRuleDefaultFactory();
		factoryGenTrunc = new YCFGenKbGenTruncDefaultFactory();
		factoryHostNode = new YCFGenKbHostNodeDefaultFactory();
		factoryRuleCart = new YCFGenKbRuleCartDefaultFactory();
		factoryRuleType = new YCFGenKbRuleTypeDefaultFactory();
		factorySecApp = new YCFGenKbSecAppDefaultFactory();
		factorySecDevice = new YCFGenKbSecDeviceDefaultFactory();
		factorySecForm = new YCFGenKbSecFormDefaultFactory();
		factorySecGroup = new YCFGenKbSecGroupDefaultFactory();
		factorySecGroupForm = new YCFGenKbSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFGenKbSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFGenKbSecGrpMembDefaultFactory();
		factorySecSession = new YCFGenKbSecSessionDefaultFactory();
		factorySecUser = new YCFGenKbSecUserDefaultFactory();
		factorySysCluster = new YCFGenKbSysClusterDefaultFactory();
		factoryTSecGroup = new YCFGenKbTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFGenKbTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFGenKbTSecGrpMembDefaultFactory();
		factoryTenant = new YCFGenKbTenantDefaultFactory();
		factoryTool = new YCFGenKbToolDefaultFactory();
		factoryToolSet = new YCFGenKbToolSetDefaultFactory();	}

	public YCFGenKbSchema( YCFGenKbConfigurationFile conf ) {
		if( conf == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"YCFGenKbSchema-constructor",
				1,
				"conf" );
		}
		configuration = conf;
		jndiName = null;

		tableCluster = null;
		tableDefClass = null;
		tableGelBoilerplate = null;
		tableGelBuiltin = null;
		tableGelCache = null;
		tableGelCall = null;
		tableGelConstrain = null;
		tableGelCounter = null;
		tableGelError = null;
		tableGelExecutable = null;
		tableGelExpansion = null;
		tableGelInstruction = null;
		tableGelIterator = null;
		tableGelModifier = null;
		tableGelPop = null;
		tableGelPushContext = null;
		tableGelPopContext = null;
		tableGelPrefixLine = null;
		tableGelReference = null;
		tableGelSequence = null;
		tableGelSpread = null;
		tableGelSwitch = null;
		tableGelSwitchLimb = null;
		tableGenBind = null;
		tableGenFile = null;
		tableGenItem = null;
		tableGenIterator = null;
		tableGenReference = null;
		tableGenRule = null;
		tableGenTrunc = null;
		tableHostNode = null;
		tableRuleCart = null;
		tableRuleType = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTenant = null;
		tableTool = null;
		tableToolSet = null;

		factoryCluster = new YCFGenKbClusterDefaultFactory();
		factoryDefClass = new YCFGenKbDefClassDefaultFactory();
		factoryGelBoilerplate = new YCFGenKbGelBoilerplateDefaultFactory();
		factoryGelBuiltin = new YCFGenKbGelBuiltinDefaultFactory();
		factoryGelCache = new YCFGenKbGelCacheDefaultFactory();
		factoryGelCall = new YCFGenKbGelCallDefaultFactory();
		factoryGelConstrain = new YCFGenKbGelConstrainDefaultFactory();
		factoryGelCounter = new YCFGenKbGelCounterDefaultFactory();
		factoryGelError = new YCFGenKbGelErrorDefaultFactory();
		factoryGelExecutable = new YCFGenKbGelExecutableDefaultFactory();
		factoryGelExpansion = new YCFGenKbGelExpansionDefaultFactory();
		factoryGelInstruction = new YCFGenKbGelInstructionDefaultFactory();
		factoryGelIterator = new YCFGenKbGelIteratorDefaultFactory();
		factoryGelModifier = new YCFGenKbGelModifierDefaultFactory();
		factoryGelPop = new YCFGenKbGelPopDefaultFactory();
		factoryGelPushContext = new YCFGenKbGelPushContextDefaultFactory();
		factoryGelPopContext = new YCFGenKbGelPopContextDefaultFactory();
		factoryGelPrefixLine = new YCFGenKbGelPrefixLineDefaultFactory();
		factoryGelReference = new YCFGenKbGelReferenceDefaultFactory();
		factoryGelSequence = new YCFGenKbGelSequenceDefaultFactory();
		factoryGelSpread = new YCFGenKbGelSpreadDefaultFactory();
		factoryGelSwitch = new YCFGenKbGelSwitchDefaultFactory();
		factoryGelSwitchLimb = new YCFGenKbGelSwitchLimbDefaultFactory();
		factoryGenBind = new YCFGenKbGenBindDefaultFactory();
		factoryGenFile = new YCFGenKbGenFileDefaultFactory();
		factoryGenItem = new YCFGenKbGenItemDefaultFactory();
		factoryGenIterator = new YCFGenKbGenIteratorDefaultFactory();
		factoryGenReference = new YCFGenKbGenReferenceDefaultFactory();
		factoryGenRule = new YCFGenKbGenRuleDefaultFactory();
		factoryGenTrunc = new YCFGenKbGenTruncDefaultFactory();
		factoryHostNode = new YCFGenKbHostNodeDefaultFactory();
		factoryRuleCart = new YCFGenKbRuleCartDefaultFactory();
		factoryRuleType = new YCFGenKbRuleTypeDefaultFactory();
		factorySecApp = new YCFGenKbSecAppDefaultFactory();
		factorySecDevice = new YCFGenKbSecDeviceDefaultFactory();
		factorySecForm = new YCFGenKbSecFormDefaultFactory();
		factorySecGroup = new YCFGenKbSecGroupDefaultFactory();
		factorySecGroupForm = new YCFGenKbSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFGenKbSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFGenKbSecGrpMembDefaultFactory();
		factorySecSession = new YCFGenKbSecSessionDefaultFactory();
		factorySecUser = new YCFGenKbSecUserDefaultFactory();
		factorySysCluster = new YCFGenKbSysClusterDefaultFactory();
		factoryTSecGroup = new YCFGenKbTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFGenKbTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFGenKbTSecGrpMembDefaultFactory();
		factoryTenant = new YCFGenKbTenantDefaultFactory();
		factoryTool = new YCFGenKbToolDefaultFactory();
		factoryToolSet = new YCFGenKbToolSetDefaultFactory();	}

	public YCFGenKbSchema( String argJndiName ) {
		if( ( argJndiName == null ) || ( argJndiName.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(),
				"YCFGenKbSchema-constructor",
				1,
				"argJndiName" );
		}
		configuration = null;
		jndiName = argJndiName;

		tableCluster = null;
		tableDefClass = null;
		tableGelBoilerplate = null;
		tableGelBuiltin = null;
		tableGelCache = null;
		tableGelCall = null;
		tableGelConstrain = null;
		tableGelCounter = null;
		tableGelError = null;
		tableGelExecutable = null;
		tableGelExpansion = null;
		tableGelInstruction = null;
		tableGelIterator = null;
		tableGelModifier = null;
		tableGelPop = null;
		tableGelPushContext = null;
		tableGelPopContext = null;
		tableGelPrefixLine = null;
		tableGelReference = null;
		tableGelSequence = null;
		tableGelSpread = null;
		tableGelSwitch = null;
		tableGelSwitchLimb = null;
		tableGenBind = null;
		tableGenFile = null;
		tableGenItem = null;
		tableGenIterator = null;
		tableGenReference = null;
		tableGenRule = null;
		tableGenTrunc = null;
		tableHostNode = null;
		tableRuleCart = null;
		tableRuleType = null;
		tableSecApp = null;
		tableSecDevice = null;
		tableSecForm = null;
		tableSecGroup = null;
		tableSecGroupForm = null;
		tableSecGrpInc = null;
		tableSecGrpMemb = null;
		tableSecSession = null;
		tableSecUser = null;
		tableSysCluster = null;
		tableTSecGroup = null;
		tableTSecGrpInc = null;
		tableTSecGrpMemb = null;
		tableTenant = null;
		tableTool = null;
		tableToolSet = null;

		factoryCluster = new YCFGenKbClusterDefaultFactory();
		factoryDefClass = new YCFGenKbDefClassDefaultFactory();
		factoryGelBoilerplate = new YCFGenKbGelBoilerplateDefaultFactory();
		factoryGelBuiltin = new YCFGenKbGelBuiltinDefaultFactory();
		factoryGelCache = new YCFGenKbGelCacheDefaultFactory();
		factoryGelCall = new YCFGenKbGelCallDefaultFactory();
		factoryGelConstrain = new YCFGenKbGelConstrainDefaultFactory();
		factoryGelCounter = new YCFGenKbGelCounterDefaultFactory();
		factoryGelError = new YCFGenKbGelErrorDefaultFactory();
		factoryGelExecutable = new YCFGenKbGelExecutableDefaultFactory();
		factoryGelExpansion = new YCFGenKbGelExpansionDefaultFactory();
		factoryGelInstruction = new YCFGenKbGelInstructionDefaultFactory();
		factoryGelIterator = new YCFGenKbGelIteratorDefaultFactory();
		factoryGelModifier = new YCFGenKbGelModifierDefaultFactory();
		factoryGelPop = new YCFGenKbGelPopDefaultFactory();
		factoryGelPushContext = new YCFGenKbGelPushContextDefaultFactory();
		factoryGelPopContext = new YCFGenKbGelPopContextDefaultFactory();
		factoryGelPrefixLine = new YCFGenKbGelPrefixLineDefaultFactory();
		factoryGelReference = new YCFGenKbGelReferenceDefaultFactory();
		factoryGelSequence = new YCFGenKbGelSequenceDefaultFactory();
		factoryGelSpread = new YCFGenKbGelSpreadDefaultFactory();
		factoryGelSwitch = new YCFGenKbGelSwitchDefaultFactory();
		factoryGelSwitchLimb = new YCFGenKbGelSwitchLimbDefaultFactory();
		factoryGenBind = new YCFGenKbGenBindDefaultFactory();
		factoryGenFile = new YCFGenKbGenFileDefaultFactory();
		factoryGenItem = new YCFGenKbGenItemDefaultFactory();
		factoryGenIterator = new YCFGenKbGenIteratorDefaultFactory();
		factoryGenReference = new YCFGenKbGenReferenceDefaultFactory();
		factoryGenRule = new YCFGenKbGenRuleDefaultFactory();
		factoryGenTrunc = new YCFGenKbGenTruncDefaultFactory();
		factoryHostNode = new YCFGenKbHostNodeDefaultFactory();
		factoryRuleCart = new YCFGenKbRuleCartDefaultFactory();
		factoryRuleType = new YCFGenKbRuleTypeDefaultFactory();
		factorySecApp = new YCFGenKbSecAppDefaultFactory();
		factorySecDevice = new YCFGenKbSecDeviceDefaultFactory();
		factorySecForm = new YCFGenKbSecFormDefaultFactory();
		factorySecGroup = new YCFGenKbSecGroupDefaultFactory();
		factorySecGroupForm = new YCFGenKbSecGroupFormDefaultFactory();
		factorySecGrpInc = new YCFGenKbSecGrpIncDefaultFactory();
		factorySecGrpMemb = new YCFGenKbSecGrpMembDefaultFactory();
		factorySecSession = new YCFGenKbSecSessionDefaultFactory();
		factorySecUser = new YCFGenKbSecUserDefaultFactory();
		factorySysCluster = new YCFGenKbSysClusterDefaultFactory();
		factoryTSecGroup = new YCFGenKbTSecGroupDefaultFactory();
		factoryTSecGrpInc = new YCFGenKbTSecGrpIncDefaultFactory();
		factoryTSecGrpMemb = new YCFGenKbTSecGrpMembDefaultFactory();
		factoryTenant = new YCFGenKbTenantDefaultFactory();
		factoryTool = new YCFGenKbToolDefaultFactory();
		factoryToolSet = new YCFGenKbToolSetDefaultFactory();	}

	/**
	 *	The majority of cases do not have a YCFTipClientHandler
	 *	associated with it's persistence implementation.
	 *	Only the XMsg client implementations overload this
	 *	to return the actual YCFTipClientHandler associated
	 *	with the connection instance.
	 */
	public YCFTipClientHandler getYCFTipClientHandler() {
		return( null );
	}

	public String getServerURL() {
		return( null );
	}

	public void setServerURL( String value ) {
	}

	public YCFGenKbConfigurationFile getConfigurationFile() {
		return( configuration );
	}

	public void setConfigurationFile( YCFGenKbConfigurationFile value ) {
		if( value == null ) {
			configuration = null;
		}
		else {
			configuration = value;
			jndiName = null;
		}
	}

	public YCFGenKbAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( YCFGenKbAuthorization value ) {
		authorization = value;
	}

	public String getJndiName() {
		return( jndiName );
	}

	public void setJndiName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			jndiName = null;
		}
		else {
			configuration = null;
			jndiName = value;
		}
	}

	public boolean isConnected() {
		throw new YCFLibMustOverrideException( getClass(), "isConnected" );
	}

	public boolean connect() {
		throw new YCFLibMustOverrideException( getClass(), "connect" );
	}

	public boolean connect( String username, String password ) {
		throw new YCFLibMustOverrideException( getClass(), "connect-userpw" );
	}

	public boolean connect( String loginId, String password, String clusterName, String tenantName ) {
		throw new YCFLibMustOverrideException( getClass(), "connect-full" );
	}

	public void disconnect( boolean doCommit ) {
		throw new YCFLibMustOverrideException( getClass(), "disconnect" );
	}

	public void logout( YCFGenKbAuthorization auth ) {
		throw new YCFLibMustOverrideException( getClass(), "logout" );
	}

	public IYCFGenKbSchema newSchema() {
		throw new YCFLibMustOverrideException( getClass(), "newSchema" );
	}

	public short nextDefClassIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextDefClassIdGen" );
	}

	public short nextRuleTypeIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextRuleTypeIdGen" );
	}

	public short nextToolIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextToolIdGen" );
	}

	public short nextToolSetIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextToolSetIdGen" );
	}

	public long nextClusterIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextClusterIdGen" );
	}

	public long nextTenantIdGen() {
		throw new YCFLibNotImplementedYetException( getClass(), "nextTenantIdGen" );
	}

	public UUID nextSecSessionIdGen() {
		UUID retval = UUID.randomUUID();
		return( retval );
	}

	public UUID nextSecUserIdGen() {
		UUID retval = UUID.randomUUID();
		return( retval );
	}

	public IYCFGenKbClusterTable getTableCluster() {
		return( tableCluster );
	}

	public void setTableCluster( IYCFGenKbClusterTable value ) {
		tableCluster = value;
	}

	public IYCFGenKbClusterFactory getFactoryCluster() {
		return( factoryCluster );
	}

	public void setFactoryCluster( IYCFGenKbClusterFactory value ) {
		factoryCluster = value;
	}

	public IYCFGenKbDefClassTable getTableDefClass() {
		return( tableDefClass );
	}

	public void setTableDefClass( IYCFGenKbDefClassTable value ) {
		tableDefClass = value;
	}

	public IYCFGenKbDefClassFactory getFactoryDefClass() {
		return( factoryDefClass );
	}

	public void setFactoryDefClass( IYCFGenKbDefClassFactory value ) {
		factoryDefClass = value;
	}

	public IYCFGenKbGelBoilerplateTable getTableGelBoilerplate() {
		return( tableGelBoilerplate );
	}

	public void setTableGelBoilerplate( IYCFGenKbGelBoilerplateTable value ) {
		tableGelBoilerplate = value;
	}

	public IYCFGenKbGelBoilerplateFactory getFactoryGelBoilerplate() {
		return( factoryGelBoilerplate );
	}

	public void setFactoryGelBoilerplate( IYCFGenKbGelBoilerplateFactory value ) {
		factoryGelBoilerplate = value;
	}

	public IYCFGenKbGelBuiltinTable getTableGelBuiltin() {
		return( tableGelBuiltin );
	}

	public void setTableGelBuiltin( IYCFGenKbGelBuiltinTable value ) {
		tableGelBuiltin = value;
	}

	public IYCFGenKbGelBuiltinFactory getFactoryGelBuiltin() {
		return( factoryGelBuiltin );
	}

	public void setFactoryGelBuiltin( IYCFGenKbGelBuiltinFactory value ) {
		factoryGelBuiltin = value;
	}

	public IYCFGenKbGelCacheTable getTableGelCache() {
		return( tableGelCache );
	}

	public void setTableGelCache( IYCFGenKbGelCacheTable value ) {
		tableGelCache = value;
	}

	public IYCFGenKbGelCacheFactory getFactoryGelCache() {
		return( factoryGelCache );
	}

	public void setFactoryGelCache( IYCFGenKbGelCacheFactory value ) {
		factoryGelCache = value;
	}

	public IYCFGenKbGelCallTable getTableGelCall() {
		return( tableGelCall );
	}

	public void setTableGelCall( IYCFGenKbGelCallTable value ) {
		tableGelCall = value;
	}

	public IYCFGenKbGelCallFactory getFactoryGelCall() {
		return( factoryGelCall );
	}

	public void setFactoryGelCall( IYCFGenKbGelCallFactory value ) {
		factoryGelCall = value;
	}

	public IYCFGenKbGelConstrainTable getTableGelConstrain() {
		return( tableGelConstrain );
	}

	public void setTableGelConstrain( IYCFGenKbGelConstrainTable value ) {
		tableGelConstrain = value;
	}

	public IYCFGenKbGelConstrainFactory getFactoryGelConstrain() {
		return( factoryGelConstrain );
	}

	public void setFactoryGelConstrain( IYCFGenKbGelConstrainFactory value ) {
		factoryGelConstrain = value;
	}

	public IYCFGenKbGelCounterTable getTableGelCounter() {
		return( tableGelCounter );
	}

	public void setTableGelCounter( IYCFGenKbGelCounterTable value ) {
		tableGelCounter = value;
	}

	public IYCFGenKbGelCounterFactory getFactoryGelCounter() {
		return( factoryGelCounter );
	}

	public void setFactoryGelCounter( IYCFGenKbGelCounterFactory value ) {
		factoryGelCounter = value;
	}

	public IYCFGenKbGelErrorTable getTableGelError() {
		return( tableGelError );
	}

	public void setTableGelError( IYCFGenKbGelErrorTable value ) {
		tableGelError = value;
	}

	public IYCFGenKbGelErrorFactory getFactoryGelError() {
		return( factoryGelError );
	}

	public void setFactoryGelError( IYCFGenKbGelErrorFactory value ) {
		factoryGelError = value;
	}

	public IYCFGenKbGelExecutableTable getTableGelExecutable() {
		return( tableGelExecutable );
	}

	public void setTableGelExecutable( IYCFGenKbGelExecutableTable value ) {
		tableGelExecutable = value;
	}

	public IYCFGenKbGelExecutableFactory getFactoryGelExecutable() {
		return( factoryGelExecutable );
	}

	public void setFactoryGelExecutable( IYCFGenKbGelExecutableFactory value ) {
		factoryGelExecutable = value;
	}

	public IYCFGenKbGelExpansionTable getTableGelExpansion() {
		return( tableGelExpansion );
	}

	public void setTableGelExpansion( IYCFGenKbGelExpansionTable value ) {
		tableGelExpansion = value;
	}

	public IYCFGenKbGelExpansionFactory getFactoryGelExpansion() {
		return( factoryGelExpansion );
	}

	public void setFactoryGelExpansion( IYCFGenKbGelExpansionFactory value ) {
		factoryGelExpansion = value;
	}

	public IYCFGenKbGelInstructionTable getTableGelInstruction() {
		return( tableGelInstruction );
	}

	public void setTableGelInstruction( IYCFGenKbGelInstructionTable value ) {
		tableGelInstruction = value;
	}

	public IYCFGenKbGelInstructionFactory getFactoryGelInstruction() {
		return( factoryGelInstruction );
	}

	public void setFactoryGelInstruction( IYCFGenKbGelInstructionFactory value ) {
		factoryGelInstruction = value;
	}

	public IYCFGenKbGelIteratorTable getTableGelIterator() {
		return( tableGelIterator );
	}

	public void setTableGelIterator( IYCFGenKbGelIteratorTable value ) {
		tableGelIterator = value;
	}

	public IYCFGenKbGelIteratorFactory getFactoryGelIterator() {
		return( factoryGelIterator );
	}

	public void setFactoryGelIterator( IYCFGenKbGelIteratorFactory value ) {
		factoryGelIterator = value;
	}

	public IYCFGenKbGelModifierTable getTableGelModifier() {
		return( tableGelModifier );
	}

	public void setTableGelModifier( IYCFGenKbGelModifierTable value ) {
		tableGelModifier = value;
	}

	public IYCFGenKbGelModifierFactory getFactoryGelModifier() {
		return( factoryGelModifier );
	}

	public void setFactoryGelModifier( IYCFGenKbGelModifierFactory value ) {
		factoryGelModifier = value;
	}

	public IYCFGenKbGelPopTable getTableGelPop() {
		return( tableGelPop );
	}

	public void setTableGelPop( IYCFGenKbGelPopTable value ) {
		tableGelPop = value;
	}

	public IYCFGenKbGelPopFactory getFactoryGelPop() {
		return( factoryGelPop );
	}

	public void setFactoryGelPop( IYCFGenKbGelPopFactory value ) {
		factoryGelPop = value;
	}

	public IYCFGenKbGelPushContextTable getTableGelPushContext() {
		return( tableGelPushContext );
	}

	public void setTableGelPushContext( IYCFGenKbGelPushContextTable value ) {
		tableGelPushContext = value;
	}

	public IYCFGenKbGelPushContextFactory getFactoryGelPushContext() {
		return( factoryGelPushContext );
	}

	public void setFactoryGelPushContext( IYCFGenKbGelPushContextFactory value ) {
		factoryGelPushContext = value;
	}

	public IYCFGenKbGelPopContextTable getTableGelPopContext() {
		return( tableGelPopContext );
	}

	public void setTableGelPopContext( IYCFGenKbGelPopContextTable value ) {
		tableGelPopContext = value;
	}

	public IYCFGenKbGelPopContextFactory getFactoryGelPopContext() {
		return( factoryGelPopContext );
	}

	public void setFactoryGelPopContext( IYCFGenKbGelPopContextFactory value ) {
		factoryGelPopContext = value;
	}

	public IYCFGenKbGelPrefixLineTable getTableGelPrefixLine() {
		return( tableGelPrefixLine );
	}

	public void setTableGelPrefixLine( IYCFGenKbGelPrefixLineTable value ) {
		tableGelPrefixLine = value;
	}

	public IYCFGenKbGelPrefixLineFactory getFactoryGelPrefixLine() {
		return( factoryGelPrefixLine );
	}

	public void setFactoryGelPrefixLine( IYCFGenKbGelPrefixLineFactory value ) {
		factoryGelPrefixLine = value;
	}

	public IYCFGenKbGelReferenceTable getTableGelReference() {
		return( tableGelReference );
	}

	public void setTableGelReference( IYCFGenKbGelReferenceTable value ) {
		tableGelReference = value;
	}

	public IYCFGenKbGelReferenceFactory getFactoryGelReference() {
		return( factoryGelReference );
	}

	public void setFactoryGelReference( IYCFGenKbGelReferenceFactory value ) {
		factoryGelReference = value;
	}

	public IYCFGenKbGelSequenceTable getTableGelSequence() {
		return( tableGelSequence );
	}

	public void setTableGelSequence( IYCFGenKbGelSequenceTable value ) {
		tableGelSequence = value;
	}

	public IYCFGenKbGelSequenceFactory getFactoryGelSequence() {
		return( factoryGelSequence );
	}

	public void setFactoryGelSequence( IYCFGenKbGelSequenceFactory value ) {
		factoryGelSequence = value;
	}

	public IYCFGenKbGelSpreadTable getTableGelSpread() {
		return( tableGelSpread );
	}

	public void setTableGelSpread( IYCFGenKbGelSpreadTable value ) {
		tableGelSpread = value;
	}

	public IYCFGenKbGelSpreadFactory getFactoryGelSpread() {
		return( factoryGelSpread );
	}

	public void setFactoryGelSpread( IYCFGenKbGelSpreadFactory value ) {
		factoryGelSpread = value;
	}

	public IYCFGenKbGelSwitchTable getTableGelSwitch() {
		return( tableGelSwitch );
	}

	public void setTableGelSwitch( IYCFGenKbGelSwitchTable value ) {
		tableGelSwitch = value;
	}

	public IYCFGenKbGelSwitchFactory getFactoryGelSwitch() {
		return( factoryGelSwitch );
	}

	public void setFactoryGelSwitch( IYCFGenKbGelSwitchFactory value ) {
		factoryGelSwitch = value;
	}

	public IYCFGenKbGelSwitchLimbTable getTableGelSwitchLimb() {
		return( tableGelSwitchLimb );
	}

	public void setTableGelSwitchLimb( IYCFGenKbGelSwitchLimbTable value ) {
		tableGelSwitchLimb = value;
	}

	public IYCFGenKbGelSwitchLimbFactory getFactoryGelSwitchLimb() {
		return( factoryGelSwitchLimb );
	}

	public void setFactoryGelSwitchLimb( IYCFGenKbGelSwitchLimbFactory value ) {
		factoryGelSwitchLimb = value;
	}

	public IYCFGenKbGenBindTable getTableGenBind() {
		return( tableGenBind );
	}

	public void setTableGenBind( IYCFGenKbGenBindTable value ) {
		tableGenBind = value;
	}

	public IYCFGenKbGenBindFactory getFactoryGenBind() {
		return( factoryGenBind );
	}

	public void setFactoryGenBind( IYCFGenKbGenBindFactory value ) {
		factoryGenBind = value;
	}

	public IYCFGenKbGenFileTable getTableGenFile() {
		return( tableGenFile );
	}

	public void setTableGenFile( IYCFGenKbGenFileTable value ) {
		tableGenFile = value;
	}

	public IYCFGenKbGenFileFactory getFactoryGenFile() {
		return( factoryGenFile );
	}

	public void setFactoryGenFile( IYCFGenKbGenFileFactory value ) {
		factoryGenFile = value;
	}

	public IYCFGenKbGenItemTable getTableGenItem() {
		return( tableGenItem );
	}

	public void setTableGenItem( IYCFGenKbGenItemTable value ) {
		tableGenItem = value;
	}

	public IYCFGenKbGenItemFactory getFactoryGenItem() {
		return( factoryGenItem );
	}

	public void setFactoryGenItem( IYCFGenKbGenItemFactory value ) {
		factoryGenItem = value;
	}

	public IYCFGenKbGenIteratorTable getTableGenIterator() {
		return( tableGenIterator );
	}

	public void setTableGenIterator( IYCFGenKbGenIteratorTable value ) {
		tableGenIterator = value;
	}

	public IYCFGenKbGenIteratorFactory getFactoryGenIterator() {
		return( factoryGenIterator );
	}

	public void setFactoryGenIterator( IYCFGenKbGenIteratorFactory value ) {
		factoryGenIterator = value;
	}

	public IYCFGenKbGenReferenceTable getTableGenReference() {
		return( tableGenReference );
	}

	public void setTableGenReference( IYCFGenKbGenReferenceTable value ) {
		tableGenReference = value;
	}

	public IYCFGenKbGenReferenceFactory getFactoryGenReference() {
		return( factoryGenReference );
	}

	public void setFactoryGenReference( IYCFGenKbGenReferenceFactory value ) {
		factoryGenReference = value;
	}

	public IYCFGenKbGenRuleTable getTableGenRule() {
		return( tableGenRule );
	}

	public void setTableGenRule( IYCFGenKbGenRuleTable value ) {
		tableGenRule = value;
	}

	public IYCFGenKbGenRuleFactory getFactoryGenRule() {
		return( factoryGenRule );
	}

	public void setFactoryGenRule( IYCFGenKbGenRuleFactory value ) {
		factoryGenRule = value;
	}

	public IYCFGenKbGenTruncTable getTableGenTrunc() {
		return( tableGenTrunc );
	}

	public void setTableGenTrunc( IYCFGenKbGenTruncTable value ) {
		tableGenTrunc = value;
	}

	public IYCFGenKbGenTruncFactory getFactoryGenTrunc() {
		return( factoryGenTrunc );
	}

	public void setFactoryGenTrunc( IYCFGenKbGenTruncFactory value ) {
		factoryGenTrunc = value;
	}

	public IYCFGenKbHostNodeTable getTableHostNode() {
		return( tableHostNode );
	}

	public void setTableHostNode( IYCFGenKbHostNodeTable value ) {
		tableHostNode = value;
	}

	public IYCFGenKbHostNodeFactory getFactoryHostNode() {
		return( factoryHostNode );
	}

	public void setFactoryHostNode( IYCFGenKbHostNodeFactory value ) {
		factoryHostNode = value;
	}

	public IYCFGenKbRuleCartTable getTableRuleCart() {
		return( tableRuleCart );
	}

	public void setTableRuleCart( IYCFGenKbRuleCartTable value ) {
		tableRuleCart = value;
	}

	public IYCFGenKbRuleCartFactory getFactoryRuleCart() {
		return( factoryRuleCart );
	}

	public void setFactoryRuleCart( IYCFGenKbRuleCartFactory value ) {
		factoryRuleCart = value;
	}

	public IYCFGenKbRuleTypeTable getTableRuleType() {
		return( tableRuleType );
	}

	public void setTableRuleType( IYCFGenKbRuleTypeTable value ) {
		tableRuleType = value;
	}

	public IYCFGenKbRuleTypeFactory getFactoryRuleType() {
		return( factoryRuleType );
	}

	public void setFactoryRuleType( IYCFGenKbRuleTypeFactory value ) {
		factoryRuleType = value;
	}

	public IYCFGenKbSecAppTable getTableSecApp() {
		return( tableSecApp );
	}

	public void setTableSecApp( IYCFGenKbSecAppTable value ) {
		tableSecApp = value;
	}

	public IYCFGenKbSecAppFactory getFactorySecApp() {
		return( factorySecApp );
	}

	public void setFactorySecApp( IYCFGenKbSecAppFactory value ) {
		factorySecApp = value;
	}

	public IYCFGenKbSecDeviceTable getTableSecDevice() {
		return( tableSecDevice );
	}

	public void setTableSecDevice( IYCFGenKbSecDeviceTable value ) {
		tableSecDevice = value;
	}

	public IYCFGenKbSecDeviceFactory getFactorySecDevice() {
		return( factorySecDevice );
	}

	public void setFactorySecDevice( IYCFGenKbSecDeviceFactory value ) {
		factorySecDevice = value;
	}

	public IYCFGenKbSecFormTable getTableSecForm() {
		return( tableSecForm );
	}

	public void setTableSecForm( IYCFGenKbSecFormTable value ) {
		tableSecForm = value;
	}

	public IYCFGenKbSecFormFactory getFactorySecForm() {
		return( factorySecForm );
	}

	public void setFactorySecForm( IYCFGenKbSecFormFactory value ) {
		factorySecForm = value;
	}

	public IYCFGenKbSecGroupTable getTableSecGroup() {
		return( tableSecGroup );
	}

	public void setTableSecGroup( IYCFGenKbSecGroupTable value ) {
		tableSecGroup = value;
	}

	public IYCFGenKbSecGroupFactory getFactorySecGroup() {
		return( factorySecGroup );
	}

	public void setFactorySecGroup( IYCFGenKbSecGroupFactory value ) {
		factorySecGroup = value;
	}

	public IYCFGenKbSecGroupFormTable getTableSecGroupForm() {
		return( tableSecGroupForm );
	}

	public void setTableSecGroupForm( IYCFGenKbSecGroupFormTable value ) {
		tableSecGroupForm = value;
	}

	public IYCFGenKbSecGroupFormFactory getFactorySecGroupForm() {
		return( factorySecGroupForm );
	}

	public void setFactorySecGroupForm( IYCFGenKbSecGroupFormFactory value ) {
		factorySecGroupForm = value;
	}

	public IYCFGenKbSecGrpIncTable getTableSecGrpInc() {
		return( tableSecGrpInc );
	}

	public void setTableSecGrpInc( IYCFGenKbSecGrpIncTable value ) {
		tableSecGrpInc = value;
	}

	public IYCFGenKbSecGrpIncFactory getFactorySecGrpInc() {
		return( factorySecGrpInc );
	}

	public void setFactorySecGrpInc( IYCFGenKbSecGrpIncFactory value ) {
		factorySecGrpInc = value;
	}

	public IYCFGenKbSecGrpMembTable getTableSecGrpMemb() {
		return( tableSecGrpMemb );
	}

	public void setTableSecGrpMemb( IYCFGenKbSecGrpMembTable value ) {
		tableSecGrpMemb = value;
	}

	public IYCFGenKbSecGrpMembFactory getFactorySecGrpMemb() {
		return( factorySecGrpMemb );
	}

	public void setFactorySecGrpMemb( IYCFGenKbSecGrpMembFactory value ) {
		factorySecGrpMemb = value;
	}

	public IYCFGenKbSecSessionTable getTableSecSession() {
		return( tableSecSession );
	}

	public void setTableSecSession( IYCFGenKbSecSessionTable value ) {
		tableSecSession = value;
	}

	public IYCFGenKbSecSessionFactory getFactorySecSession() {
		return( factorySecSession );
	}

	public void setFactorySecSession( IYCFGenKbSecSessionFactory value ) {
		factorySecSession = value;
	}

	public IYCFGenKbSecUserTable getTableSecUser() {
		return( tableSecUser );
	}

	public void setTableSecUser( IYCFGenKbSecUserTable value ) {
		tableSecUser = value;
	}

	public IYCFGenKbSecUserFactory getFactorySecUser() {
		return( factorySecUser );
	}

	public void setFactorySecUser( IYCFGenKbSecUserFactory value ) {
		factorySecUser = value;
	}

	public IYCFGenKbSysClusterTable getTableSysCluster() {
		return( tableSysCluster );
	}

	public void setTableSysCluster( IYCFGenKbSysClusterTable value ) {
		tableSysCluster = value;
	}

	public IYCFGenKbSysClusterFactory getFactorySysCluster() {
		return( factorySysCluster );
	}

	public void setFactorySysCluster( IYCFGenKbSysClusterFactory value ) {
		factorySysCluster = value;
	}

	public IYCFGenKbTSecGroupTable getTableTSecGroup() {
		return( tableTSecGroup );
	}

	public void setTableTSecGroup( IYCFGenKbTSecGroupTable value ) {
		tableTSecGroup = value;
	}

	public IYCFGenKbTSecGroupFactory getFactoryTSecGroup() {
		return( factoryTSecGroup );
	}

	public void setFactoryTSecGroup( IYCFGenKbTSecGroupFactory value ) {
		factoryTSecGroup = value;
	}

	public IYCFGenKbTSecGrpIncTable getTableTSecGrpInc() {
		return( tableTSecGrpInc );
	}

	public void setTableTSecGrpInc( IYCFGenKbTSecGrpIncTable value ) {
		tableTSecGrpInc = value;
	}

	public IYCFGenKbTSecGrpIncFactory getFactoryTSecGrpInc() {
		return( factoryTSecGrpInc );
	}

	public void setFactoryTSecGrpInc( IYCFGenKbTSecGrpIncFactory value ) {
		factoryTSecGrpInc = value;
	}

	public IYCFGenKbTSecGrpMembTable getTableTSecGrpMemb() {
		return( tableTSecGrpMemb );
	}

	public void setTableTSecGrpMemb( IYCFGenKbTSecGrpMembTable value ) {
		tableTSecGrpMemb = value;
	}

	public IYCFGenKbTSecGrpMembFactory getFactoryTSecGrpMemb() {
		return( factoryTSecGrpMemb );
	}

	public void setFactoryTSecGrpMemb( IYCFGenKbTSecGrpMembFactory value ) {
		factoryTSecGrpMemb = value;
	}

	public IYCFGenKbTenantTable getTableTenant() {
		return( tableTenant );
	}

	public void setTableTenant( IYCFGenKbTenantTable value ) {
		tableTenant = value;
	}

	public IYCFGenKbTenantFactory getFactoryTenant() {
		return( factoryTenant );
	}

	public void setFactoryTenant( IYCFGenKbTenantFactory value ) {
		factoryTenant = value;
	}

	public IYCFGenKbToolTable getTableTool() {
		return( tableTool );
	}

	public void setTableTool( IYCFGenKbToolTable value ) {
		tableTool = value;
	}

	public IYCFGenKbToolFactory getFactoryTool() {
		return( factoryTool );
	}

	public void setFactoryTool( IYCFGenKbToolFactory value ) {
		factoryTool = value;
	}

	public IYCFGenKbToolSetTable getTableToolSet() {
		return( tableToolSet );
	}

	public void setTableToolSet( IYCFGenKbToolSetTable value ) {
		tableToolSet = value;
	}

	public IYCFGenKbToolSetFactory getFactoryToolSet() {
		return( factoryToolSet );
	}

	public void setFactoryToolSet( IYCFGenKbToolSetFactory value ) {
		factoryToolSet = value;
	}

	public boolean isTransactionOpen() {
		throw new YCFLibMustOverrideException( getClass(), "isTransactionOpen" );
	}

	public boolean beginTransaction() {
		throw new YCFLibMustOverrideException( getClass(), "beginTransaction" );
	}

	public void commit() {
		throw new YCFLibMustOverrideException( getClass(), "commit" );
	}

	public void rollback() {
		throw new YCFLibMustOverrideException( getClass(), "rollback" );
	}

	public IYCFGenKbTablePerms getTablePerms() {
		return( tablePerms );
	}

	public void setTablePerms( IYCFGenKbTablePerms value ) {
		tablePerms = value;
	}

	public static String xmlEncodeString( String val ) {
		StringBuffer buff = new StringBuffer();
		int len = val.length();
		for( int idx = 0; idx < len; idx ++ ) {
			char c = val.charAt( idx );
			switch( c ) {
				case '&':
					buff.append( "&amp;" );
					break;
				case '<':
					buff.append( "&lt;" );
					break;
				case '>':
					buff.append( "&gt;" );
					break;
				case '"':
					buff.append( "&quot;" );
					break;
				case '\'':
					buff.append( "&apos;" );
					break;
				default:
					buff.append( c );
					break;
			}
		}
		return( buff.toString() );
	}

	/**
	 *	Release any prepared statements bound to this database instance, such
	 *	that the value of schemaDbName has to be re-evaluated for all future
	 *	invocations.
	 */
	public void releasePreparedStatements() {
	}

	/**
	 *	When you first connect to a database, you can opt to specify a database
	 *	schema name to be used by the session.  The implementation code must always
	 *	be dynamically based on the invocation of <tt>String getDbSchemaName()</tt>
	 *	at runtime.
	 *	<p>
	 *	The initial value is defined by the implementing schema model which has inherited
	 *	the expression of the current schema model being expanded.  That is, it is specified
	 *	in the DbSchemaName attribute of a SchemaDef instance.
	 */
	public String getDbSchemaName() {
		return( schemaDbName );
	}

	public String getLowerDbSchemaName() {
		return( lowerDbSchemaName );
	}

	/**
	 *	The database is expected to override this implementation and invoke the
	 *	<tt>super.setDbSchemaName( String argDbSchemaName )</tt> early
	 *	on in the implementation of the cust body.  You should let the exceptions
	 *	which can be thrown by this implementation pass unimpeded.
	 *	<pg>
	 *	When you set the database schema name, the database-specific implementation
	 *	of this method does a "commit; use database"-type sequence to change
	 *	to the target database.  This should be specified globally for all
	 *	database connections in a given cluster, so that all of
	 *	the application implementation clients are using the same database instance
	 *	regardless of what's been provided by the cust client implementation,
	 *	be it as a Java application or a web interface written using JEE.
	 */
	public void setDbSchemaName( String argDbSchemaName ) {
		final String S_ProcName = "setDbSchemaName";
		if( ( argDbSchemaName == null ) || ( argDbSchemaName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"argDbSchemaName" );
		}
		schemaDbName = argDbSchemaName;
		lowerDbSchemaName = schemaDbName.toLowerCase();
	}
}
