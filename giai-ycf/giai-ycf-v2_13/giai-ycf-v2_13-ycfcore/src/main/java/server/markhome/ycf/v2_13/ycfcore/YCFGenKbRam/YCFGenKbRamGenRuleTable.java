
// Description: Java 11 in-memory RAM DbIO implementation for GenRule.

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
 *	YCFGenKbRamGenRuleTable in-memory RAM DbIO implementation
 *	for GenRule.
 */
public class YCFGenKbRamGenRuleTable
	implements IYCFGenKbGenRuleTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGenItemPKey,
				YCFGenKbGenRuleBuff > dictByPKey
		= new HashMap< YCFGenKbGenItemPKey,
				YCFGenKbGenRuleBuff >();
	private Map< YCFGenKbGenRuleByBodyIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenRuleBuff >> dictByBodyIdx
		= new HashMap< YCFGenKbGenRuleByBodyIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenRuleBuff >>();

	public YCFGenKbRamGenRuleTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGenRule( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleBuff Buff )
	{
		final String S_ProcName = "createGenRule";
		schema.getTableGenItem().createGenItem( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenRuleByBodyIdxKey keyBodyIdx = schema.getFactoryGenRule().newBodyIdxKey();
		keyBodyIdx.setOptionalBodyTenantId( Buff.getOptionalBodyTenantId() );
		keyBodyIdx.setOptionalBodyGelCacheId( Buff.getOptionalBodyGelCacheId() );
		keyBodyIdx.setOptionalBodyGelId( Buff.getOptionalBodyGelId() );

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
				if( null == schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId(),
						Buff.getRequiredItemId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"GenItem",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff > subdictBodyIdx;
		if( dictByBodyIdx.containsKey( keyBodyIdx ) ) {
			subdictBodyIdx = dictByBodyIdx.get( keyBodyIdx );
		}
		else {
			subdictBodyIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff >();
			dictByBodyIdx.put( keyBodyIdx, subdictBodyIdx );
		}
		subdictBodyIdx.put( pkey, Buff );

	}

	public YCFGenKbGenRuleBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenRuleBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenRuleBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenRuleBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenRuleBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGenRule.readAllDerived";
		YCFGenKbGenRuleBuff[] retList = new YCFGenKbGenRuleBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGenRuleBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGenRuleBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
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
		else if( buff instanceof YCFGenKbGenRuleBuff ) {
			return( (YCFGenKbGenRuleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenRuleBuff ) ) {
					filteredList.add( (YCFGenKbGenRuleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
		}
	}

	public YCFGenKbGenRuleBuff[] readDerivedByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readDerivedByBodyIdx";
		YCFGenKbGenRuleByBodyIdxKey key = schema.getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );

		YCFGenKbGenRuleBuff[] recArray;
		if( dictByBodyIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff > subdictBodyIdx
				= dictByBodyIdx.get( key );
			recArray = new YCFGenKbGenRuleBuff[ subdictBodyIdx.size() ];
			Iterator< YCFGenKbGenRuleBuff > iter = subdictBodyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff > subdictBodyIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff >();
			dictByBodyIdx.put( key, subdictBodyIdx );
			recArray = new YCFGenKbGenRuleBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenRuleBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByItemIdIdx() ";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		key.setRequiredItemId( ItemId );

		YCFGenKbGenRuleBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenRuleBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readBuff";
		YCFGenKbGenRuleBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a923" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenRuleBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGenRuleBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a923" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenRuleBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readAllBuff";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a923" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByItemIdIdx() ";
		YCFGenKbGenRuleBuff buff = readDerivedByItemIdIdx( Authorization,
			TenantId,
			CartridgeId,
			ItemId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenRuleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenRuleBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByTenantIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByCartIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByRuleTypeIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByToolSetIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByScopeIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGenDefIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByGenDefIdx( Authorization,
			GenDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByAltIdx() ";
		YCFGenKbGenRuleBuff buff = readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenRuleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenRuleBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGelExecIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByProbeIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	public YCFGenKbGenRuleBuff[] readBuffByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "YCFGenKbRamGenRule.readBuffByBodyIdx() ";
		YCFGenKbGenRuleBuff buff;
		ArrayList<YCFGenKbGenRuleBuff> filteredList = new ArrayList<YCFGenKbGenRuleBuff>();
		YCFGenKbGenRuleBuff[] buffList = readDerivedByBodyIdx( Authorization,
			BodyTenantId,
			BodyGelCacheId,
			BodyGelId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a923" ) ) {
				filteredList.add( (YCFGenKbGenRuleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenRuleBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GenRule buffer instances identified by the duplicate key BodyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGenRuleBuff[] pageBuffByBodyIdx( YCFGenKbAuthorization Authorization,
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

	public void updateGenRule( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleBuff Buff )
	{
		schema.getTableGenItem().updateGenItem( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenRuleBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGenRule",
				"Existing record not found",
				"GenRule",
				pkey );
		}
		YCFGenKbGenRuleByBodyIdxKey existingKeyBodyIdx = schema.getFactoryGenRule().newBodyIdxKey();
		existingKeyBodyIdx.setOptionalBodyTenantId( existing.getOptionalBodyTenantId() );
		existingKeyBodyIdx.setOptionalBodyGelCacheId( existing.getOptionalBodyGelCacheId() );
		existingKeyBodyIdx.setOptionalBodyGelId( existing.getOptionalBodyGelId() );

		YCFGenKbGenRuleByBodyIdxKey newKeyBodyIdx = schema.getFactoryGenRule().newBodyIdxKey();
		newKeyBodyIdx.setOptionalBodyTenantId( Buff.getOptionalBodyTenantId() );
		newKeyBodyIdx.setOptionalBodyGelCacheId( Buff.getOptionalBodyGelCacheId() );
		newKeyBodyIdx.setOptionalBodyGelId( Buff.getOptionalBodyGelId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId(),
						Buff.getRequiredItemId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenRule",
						"Superclass",
						"SuperClass",
						"GenItem",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByBodyIdx.get( existingKeyBodyIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByBodyIdx.containsKey( newKeyBodyIdx ) ) {
			subdict = dictByBodyIdx.get( newKeyBodyIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff >();
			dictByBodyIdx.put( newKeyBodyIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGenRule( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGenRuleTable.deleteGenRule() ";
		String classCode;
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenRuleBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGenRule",
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
		YCFGenKbGenRuleByBodyIdxKey keyBodyIdx = schema.getFactoryGenRule().newBodyIdxKey();
		keyBodyIdx.setOptionalBodyTenantId( existing.getOptionalBodyTenantId() );
		keyBodyIdx.setOptionalBodyGelCacheId( existing.getOptionalBodyGelCacheId() );
		keyBodyIdx.setOptionalBodyGelId( existing.getOptionalBodyGelId() );

		// Validate reverse foreign keys

		if( schema.getTableGenTrunc().readDerivedByItemIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredCartridgeId(),
					existing.getRequiredItemId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGenRule",
				"Superclass",
				"SuperClass",
				"GenTrunc",
				pkey );
		}

		if( schema.getTableGenFile().readDerivedByItemIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredCartridgeId(),
					existing.getRequiredItemId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGenRule",
				"Superclass",
				"SuperClass",
				"GenFile",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbGenItemPKey, YCFGenKbGenRuleBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByBodyIdx.get( keyBodyIdx );
		subdict.remove( pkey );

		schema.getTableGenItem().deleteGenItem( Authorization,
			Buff );
	}
	public void deleteGenRuleByBodyIdx( YCFGenKbAuthorization Authorization,
		Long argBodyTenantId,
		Long argBodyGelCacheId,
		Long argBodyGelId )
	{
		YCFGenKbGenRuleByBodyIdxKey key = schema.getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( argBodyTenantId );
		key.setOptionalBodyGelCacheId( argBodyGelCacheId );
		key.setOptionalBodyGelId( argBodyGelId );
		deleteGenRuleByBodyIdx( Authorization, key );
	}

	public void deleteGenRuleByBodyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleByBodyIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByBodyIdx";
		YCFGenKbGenRuleBuff cur;
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
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId )
	{
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		key.setRequiredItemId( argItemId );
		deleteGenRuleByItemIdIdx( Authorization, key );
	}

	public void deleteGenRuleByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByItemIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGenRuleBuff cur;
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGenRuleByTenantIdx( Authorization, key );
	}

	public void deleteGenRuleByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByTenantIdx";
		YCFGenKbGenRuleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		deleteGenRuleByCartIdx( Authorization, key );
	}

	public void deleteGenRuleByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByCartIdx";
		YCFGenKbGenRuleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( argRuleTypeId );
		deleteGenRuleByRuleTypeIdx( Authorization, key );
	}

	public void deleteGenRuleByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByRuleTypeIdx";
		YCFGenKbGenRuleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( argToolSetId );
		deleteGenRuleByToolSetIdx( Authorization, key );
	}

	public void deleteGenRuleByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByToolSetIdx";
		YCFGenKbGenRuleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( argScopeDefId );
		deleteGenRuleByScopeIdx( Authorization, key );
	}

	public void deleteGenRuleByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByScopeIdx";
		YCFGenKbGenRuleBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( argGenDefId );
		deleteGenRuleByGenDefIdx( Authorization, key );
	}

	public void deleteGenRuleByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByGenDefIdx";
		YCFGenKbGenRuleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByAltIdx( YCFGenKbAuthorization Authorization,
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
		deleteGenRuleByAltIdx( Authorization, key );
	}

	public void deleteGenRuleByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByAltIdx";
		YCFGenKbGenRuleBuff cur;
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
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( argGelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( argGelExecutableGelCacheId );
		key.setOptionalGelExecutableId( argGelExecutableId );
		deleteGenRuleByGelExecIdx( Authorization, key );
	}

	public void deleteGenRuleByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByGelExecIdx";
		YCFGenKbGenRuleBuff cur;
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
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenRuleByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( argProbeTenantId );
		key.setOptionalProbeCartridgeId( argProbeCartridgeId );
		key.setOptionalProbeGenItemId( argProbeGenItemId );
		deleteGenRuleByProbeIdx( Authorization, key );
	}

	public void deleteGenRuleByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey )
	{
		final String S_ProcName = "deleteGenRuleByProbeIdx";
		YCFGenKbGenRuleBuff cur;
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
		LinkedList<YCFGenKbGenRuleBuff> matchSet = new LinkedList<YCFGenKbGenRuleBuff>();
		Iterator<YCFGenKbGenRuleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenRuleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenRule must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
