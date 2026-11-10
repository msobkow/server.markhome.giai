
// Description: Java 11 in-memory RAM DbIO implementation for GenTrunc.

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

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

/*
 *	YCFGenKbRamGenTruncTable in-memory RAM DbIO implementation
 *	for GenTrunc.
 */
public class YCFGenKbRamGenTruncTable
	implements IYCFGenKbGenTruncTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGenItemPKey,
				YCFGenKbGenTruncBuff > dictByPKey
		= new HashMap< YCFGenKbGenItemPKey,
				YCFGenKbGenTruncBuff >();

	public YCFGenKbRamGenTruncTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGenTrunc( YCFGenKbAuthorization Authorization,
		YCFGenKbGenTruncBuff Buff )
	{
		final String S_ProcName = "createGenTrunc";
		schema.getTableGenRule().createGenRule( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId(),
						Buff.getRequiredItemId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"GenRule",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

	}

	public YCFGenKbGenTruncBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenTrunc.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenTruncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenTruncBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenTrunc.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenTruncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenTruncBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGenTrunc.readAllDerived";
		YCFGenKbGenTruncBuff[] retList = new YCFGenKbGenTruncBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGenTruncBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGenTruncBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByTenantIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByTenantIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByCartIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByRuleTypeIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByToolSetIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByScopeIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByGenDefIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByGenDefIdx( Authorization,
			GenDefId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByAltIdx";
		YCFGenKbGenItemBuff buff = schema.getTableGenItem().readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFGenKbGenTruncBuff ) {
			return( (YCFGenKbGenTruncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByGelExecIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByProbeIdx";
		YCFGenKbGenItemBuff buffList[] = schema.getTableGenItem().readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenItemBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff[] readDerivedByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readDerivedByBodyIdx";
		YCFGenKbGenRuleBuff buffList[] = schema.getTableGenRule().readDerivedByBodyIdx( Authorization,
			BodyTenantId,
			BodyGelCacheId,
			BodyGelId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGenRuleBuff buff;
			ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenTruncBuff ) ) {
					filteredList.add( (YCFGenKbGenTruncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
		}
	}

	public YCFGenKbGenTruncBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByItemIdIdx() ";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		key.setRequiredItemId( ItemId );

		YCFGenKbGenTruncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenTruncBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenTrunc.readBuff";
		YCFGenKbGenTruncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a924" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenTruncBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGenTruncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a924" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenTruncBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGenTrunc.readAllBuff";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a924" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByItemIdIdx() ";
		YCFGenKbGenTruncBuff buff = readDerivedByItemIdIdx( Authorization,
			TenantId,
			CartridgeId,
			ItemId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenTruncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenTruncBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByTenantIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByCartIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByRuleTypeIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByToolSetIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByScopeIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGenDefIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByGenDefIdx( Authorization,
			GenDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByAltIdx() ";
		YCFGenKbGenTruncBuff buff = readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenTruncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenTruncBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGelExecIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByProbeIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	public YCFGenKbGenTruncBuff[] readBuffByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readBuffByBodyIdx() ";
		YCFGenKbGenTruncBuff buff;
		ArrayList<YCFGenKbGenTruncBuff> filteredList = new ArrayList<YCFGenKbGenTruncBuff>();
		YCFGenKbGenTruncBuff[] buffList = readDerivedByBodyIdx( Authorization,
			BodyTenantId,
			BodyGelCacheId,
			BodyGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a923" ) ) {
				filteredList.add( (YCFGenKbGenTruncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenTruncBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GenTrunc buffer instances identified by the duplicate key BodyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBodyTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenTruncBuff[] pageBuffByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		Long priorTenantId,
		Long priorCartridgeId,
		Long priorItemId )
	{
		final String S_ProcName = "pageBuffByBodyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGenTrunc( YCFGenKbAuthorization Authorization,
		YCFGenKbGenTruncBuff Buff )
	{
		schema.getTableGenRule().updateGenRule( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenTruncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGenTrunc",
				"Existing record not found",
				"GenTrunc",
				pkey );
		}
		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId(),
						Buff.getRequiredItemId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenTrunc",
						"Superclass",
						"SuperClass",
						"GenRule",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGenItemPKey, YCFGenKbGenTruncBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

	}

	public void deleteGenTrunc( YCFGenKbAuthorization Authorization,
		YCFGenKbGenTruncBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGenTruncTable.deleteGenTrunc() ";
		String classCode;
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenTruncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGenTrunc",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalBodyTenantId(),
						existing.getOptionalBodyGelCacheId(),
						existing.getOptionalBodyGelId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalBodyTenantId(),
						existing.getOptionalBodyGelCacheId(),
						existing.getOptionalBodyGelId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		if( null != schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
						existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() ) ) {
			schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );
		}
		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGenItemPKey, YCFGenKbGenTruncBuff > subdict;

		dictByPKey.remove( pkey );

		schema.getTableGenRule().deleteGenRule( Authorization,
			Buff );
	}
	public void deleteGenTruncByBodyIdx( YCFGenKbAuthorization Authorization,
		Long argBodyTenantId,
		Long argBodyGelCacheId,
		Long argBodyGelId )
	{
		YCFGenKbGenRuleByBodyIdxKey key = schema.getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( argBodyTenantId );
		key.setOptionalBodyGelCacheId( argBodyGelCacheId );
		key.setOptionalBodyGelId( argBodyGelId );
		deleteGenTruncByBodyIdx( Authorization, key );
	}

	public void deleteGenTruncByBodyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleByBodyIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalBodyTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalBodyGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalBodyGelId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId )
	{
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		key.setRequiredItemId( argItemId );
		deleteGenTruncByItemIdIdx( Authorization, key );
	}

	public void deleteGenTruncByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGenTruncBuff cur;
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGenTruncByTenantIdx( Authorization, key );
	}

	public void deleteGenTruncByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		deleteGenTruncByCartIdx( Authorization, key );
	}

	public void deleteGenTruncByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( argRuleTypeId );
		deleteGenTruncByRuleTypeIdx( Authorization, key );
	}

	public void deleteGenTruncByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( argToolSetId );
		deleteGenTruncByToolSetIdx( Authorization, key );
	}

	public void deleteGenTruncByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( argScopeDefId );
		deleteGenTruncByScopeIdx( Authorization, key );
	}

	public void deleteGenTruncByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( argGenDefId );
		deleteGenTruncByGenDefIdx( Authorization, key );
	}

	public void deleteGenTruncByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByAltIdx( YCFGenKbAuthorization Authorization,
		String argName,
		short argToolSetId,
		Short argScopeDefId,
		short argGenDefId )
	{
		YCFGenKbGenItemByAltIdxKey key = schema.getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( argName );
		key.setRequiredToolSetId( argToolSetId );
		key.setOptionalScopeDefId( argScopeDefId );
		key.setRequiredGenDefId( argGenDefId );
		deleteGenTruncByAltIdx( Authorization, key );
	}

	public void deleteGenTruncByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( argGelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( argGelExecutableGelCacheId );
		key.setOptionalGelExecutableId( argGelExecutableId );
		deleteGenTruncByGelExecIdx( Authorization, key );
	}

	public void deleteGenTruncByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalGelExecutableTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalGelExecutableGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalGelExecutableId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void deleteGenTruncByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( argProbeTenantId );
		key.setOptionalProbeCartridgeId( argProbeCartridgeId );
		key.setOptionalProbeGenItemId( argProbeGenItemId );
		deleteGenTruncByProbeIdx( Authorization, key );
	}

	public void deleteGenTruncByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey )
	{
		YCFGenKbGenTruncBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalProbeTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalProbeCartridgeId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalProbeGenItemId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenTruncBuff> matchSet = new LinkedList<YCFGenKbGenTruncBuff>();
		Iterator<YCFGenKbGenTruncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenTruncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenTrunc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
