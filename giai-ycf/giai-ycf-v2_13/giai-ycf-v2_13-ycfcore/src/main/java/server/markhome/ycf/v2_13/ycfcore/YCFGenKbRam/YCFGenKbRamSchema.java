// Description: Java 11 implementation of an in-memory RAM YCFGenKb schema.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbRam;

import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

public class YCFGenKbRamSchema
	extends YCFGenKbSchema
	implements IYCFGenKbSchema
{
		protected short nextDefClassIdGenValue = 1;
		protected short nextRuleTypeIdGenValue = 1;
		protected short nextToolIdGenValue = 1;
		protected short nextToolSetIdGenValue = 1;
		protected long nextClusterIdGenValue = 1;
		protected long nextTenantIdGenValue = 1;


	public YCFGenKbRamSchema() {
		super();
		tableCluster = new YCFGenKbRamClusterTable( this );
		tableDefClass = new YCFGenKbRamDefClassTable( this );
		tableGelBoilerplate = new YCFGenKbRamGelBoilerplateTable( this );
		tableGelBuiltin = new YCFGenKbRamGelBuiltinTable( this );
		tableGelCache = new YCFGenKbRamGelCacheTable( this );
		tableGelCall = new YCFGenKbRamGelCallTable( this );
		tableGelConstrain = new YCFGenKbRamGelConstrainTable( this );
		tableGelCounter = new YCFGenKbRamGelCounterTable( this );
		tableGelError = new YCFGenKbRamGelErrorTable( this );
		tableGelExecutable = new YCFGenKbRamGelExecutableTable( this );
		tableGelExpansion = new YCFGenKbRamGelExpansionTable( this );
		tableGelInstruction = new YCFGenKbRamGelInstructionTable( this );
		tableGelIterator = new YCFGenKbRamGelIteratorTable( this );
		tableGelModifier = new YCFGenKbRamGelModifierTable( this );
		tableGelPop = new YCFGenKbRamGelPopTable( this );
		tableGelPushContext = new YCFGenKbRamGelPushContextTable( this );
		tableGelPopContext = new YCFGenKbRamGelPopContextTable( this );
		tableGelPrefixLine = new YCFGenKbRamGelPrefixLineTable( this );
		tableGelReference = new YCFGenKbRamGelReferenceTable( this );
		tableGelSequence = new YCFGenKbRamGelSequenceTable( this );
		tableGelSpread = new YCFGenKbRamGelSpreadTable( this );
		tableGelSwitch = new YCFGenKbRamGelSwitchTable( this );
		tableGelSwitchLimb = new YCFGenKbRamGelSwitchLimbTable( this );
		tableGenBind = new YCFGenKbRamGenBindTable( this );
		tableGenFile = new YCFGenKbRamGenFileTable( this );
		tableGenItem = new YCFGenKbRamGenItemTable( this );
		tableGenIterator = new YCFGenKbRamGenIteratorTable( this );
		tableGenReference = new YCFGenKbRamGenReferenceTable( this );
		tableGenRule = new YCFGenKbRamGenRuleTable( this );
		tableGenTrunc = new YCFGenKbRamGenTruncTable( this );
		tableHostNode = new YCFGenKbRamHostNodeTable( this );
		tableRuleCart = new YCFGenKbRamRuleCartTable( this );
		tableRuleType = new YCFGenKbRamRuleTypeTable( this );
		tableSecApp = new YCFGenKbRamSecAppTable( this );
		tableSecDevice = new YCFGenKbRamSecDeviceTable( this );
		tableSecForm = new YCFGenKbRamSecFormTable( this );
		tableSecGroup = new YCFGenKbRamSecGroupTable( this );
		tableSecGroupForm = new YCFGenKbRamSecGroupFormTable( this );
		tableSecGrpInc = new YCFGenKbRamSecGrpIncTable( this );
		tableSecGrpMemb = new YCFGenKbRamSecGrpMembTable( this );
		tableSecSession = new YCFGenKbRamSecSessionTable( this );
		tableSecUser = new YCFGenKbRamSecUserTable( this );
		tableSysCluster = new YCFGenKbRamSysClusterTable( this );
		tableTSecGroup = new YCFGenKbRamTSecGroupTable( this );
		tableTSecGrpInc = new YCFGenKbRamTSecGrpIncTable( this );
		tableTSecGrpMemb = new YCFGenKbRamTSecGrpMembTable( this );
		tableTenant = new YCFGenKbRamTenantTable( this );
		tableTool = new YCFGenKbRamToolTable( this );
		tableToolSet = new YCFGenKbRamToolSetTable( this );
	}

	protected boolean sessConnected = false;

	public boolean isConnected() {
		return( sessConnected );
	}

	public boolean connect() {
		if( sessConnected ) {
			return( false );
		}
		else {
			sessConnected = true;
			tranOpen = false;
			return( true );
		}
	}

	public boolean connect( String username, String password ) {
		final String S_ProcName = "connect";
		if( ( username == null ) || ( username.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"username" );
		}
		if( password == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"password" );
		}
		if( ! username.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only 'system' is authorized to use a RAM database" );
		}
		if( sessConnected ) {
			return( false );
		}
		else {
			sessConnected = true;
			tranOpen = false;
			return( true );
		}
	}

	public boolean connect( String loginId, String password, String clusterName, String tenantName ) {
		final String S_ProcName = "connect";
		if( ( loginId == null ) || ( loginId.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"loginId" );
		}
		if( password == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"password" );
		}
		if( clusterName == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				3,
				"clusterName" );
		}
		if( tenantName == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				4,
				"tenantName" );
		}
		if( ! loginId.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only 'system' is authorized to use a RAM database" );
		}
		if( ! clusterName.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only the 'system' Cluster is authorized to use a RAM database" );
		}
		if( ! tenantName.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only the 'system' Tenant is authorized to use a RAM database" );
		}
		if( sessConnected ) {
			return( false );
		}
		else {
			sessConnected = true;
			tranOpen = false;
			return( true );
		}
	}

	public void disconnect( boolean doCommit ) {
		tranOpen = false;
		sessConnected = false;
	}

	//	Transactions are not supported, so pretend there is always one open

	protected boolean tranOpen = false;

	public boolean isTransactionOpen() {
		return( tranOpen );
	}

	public boolean beginTransaction() {
		if( tranOpen ) {
			return( false );
		}
		tranOpen = true;
		return( true );
	}

	public void commit() {
		tranOpen = false;
	}

	public void rollback() {
		tranOpen = false;
	}

	public IYCFGenKbSchema newSchema() {
		throw new YCFLibMustOverrideException( getClass(), "newSchema" );
	}

	public short nextDefClassIdGen() {
		short next = nextDefClassIdGenValue++;
		return( next );
	}

	public short nextRuleTypeIdGen() {
		short next = nextRuleTypeIdGenValue++;
		return( next );
	}

	public short nextToolIdGen() {
		short next = nextToolIdGenValue++;
		return( next );
	}

	public short nextToolSetIdGen() {
		short next = nextToolSetIdGenValue++;
		return( next );
	}

	public long nextClusterIdGen() {
		long next = nextClusterIdGenValue++;
		return( next );
	}

	public long nextTenantIdGen() {
		long next = nextTenantIdGenValue++;
		return( next );
	}

	public UUID nextSecSessionIdGen() {
		UUID next = UUID.randomUUID();
		return( next );
	}

	public UUID nextSecUserIdGen() {
		UUID next = UUID.randomUUID();
		return( next );
	}

	public void releasePreparedStatements() {
	}
}
