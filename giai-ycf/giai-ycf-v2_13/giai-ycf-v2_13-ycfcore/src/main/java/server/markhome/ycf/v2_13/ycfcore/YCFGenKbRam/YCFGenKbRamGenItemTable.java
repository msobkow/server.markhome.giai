
// Description: Java 11 in-memory RAM DbIO implementation for GenItem.

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
 *	YCFGenKbRamGenItemTable in-memory RAM DbIO implementation
 *	for GenItem.
 */
public class YCFGenKbRamGenItemTable
	implements IYCFGenKbGenItemTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGenItemPKey,
				YCFGenKbGenItemBuff > dictByPKey
		= new HashMap< YCFGenKbGenItemPKey,
				YCFGenKbGenItemBuff >();
	private Map< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();
	private Map< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByCartIdx
		= new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();
	private Map< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByRuleTypeIdx
		= new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();
	private Map< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByToolSetIdx
		= new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();
	private Map< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByScopeIdx
		= new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();
	private Map< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByGenDefIdx
		= new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();
	private Map< YCFGenKbGenItemByAltIdxKey,
			YCFGenKbGenItemBuff > dictByAltIdx
		= new HashMap< YCFGenKbGenItemByAltIdxKey,
			YCFGenKbGenItemBuff >();
	private Map< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByGelExecIdx
		= new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();
	private Map< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >> dictByProbeIdx
		= new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey,
					YCFGenKbGenItemBuff >>();

	public YCFGenKbRamGenItemTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGenItem( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemBuff Buff )
	{
		final String S_ProcName = "createGenItem";
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( ((YCFGenKbRamTenantTable)schema.getTableTenant()).nextGenItemIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredCartridgeId( pkey.getRequiredCartridgeId() );
		Buff.setRequiredItemId( pkey.getRequiredItemId() );
		YCFGenKbGenItemByTenantIdxKey keyTenantIdx = schema.getFactoryGenItem().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGenItemByCartIdxKey keyCartIdx = schema.getFactoryGenItem().newCartIdxKey();
		keyCartIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyCartIdx.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );

		YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx = schema.getFactoryGenItem().newRuleTypeIdxKey();
		keyRuleTypeIdx.setRequiredRuleTypeId( Buff.getRequiredRuleTypeId() );

		YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx = schema.getFactoryGenItem().newToolSetIdxKey();
		keyToolSetIdx.setRequiredToolSetId( Buff.getRequiredToolSetId() );

		YCFGenKbGenItemByScopeIdxKey keyScopeIdx = schema.getFactoryGenItem().newScopeIdxKey();
		keyScopeIdx.setOptionalScopeDefId( Buff.getOptionalScopeDefId() );

		YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx = schema.getFactoryGenItem().newGenDefIdxKey();
		keyGenDefIdx.setRequiredGenDefId( Buff.getRequiredGenDefId() );

		YCFGenKbGenItemByAltIdxKey keyAltIdx = schema.getFactoryGenItem().newAltIdxKey();
		keyAltIdx.setRequiredName( Buff.getRequiredName() );
		keyAltIdx.setRequiredToolSetId( Buff.getRequiredToolSetId() );
		keyAltIdx.setOptionalScopeDefId( Buff.getOptionalScopeDefId() );
		keyAltIdx.setRequiredGenDefId( Buff.getRequiredGenDefId() );

		YCFGenKbGenItemByGelExecIdxKey keyGelExecIdx = schema.getFactoryGenItem().newGelExecIdxKey();
		keyGelExecIdx.setOptionalGelExecutableTenantId( Buff.getOptionalGelExecutableTenantId() );
		keyGelExecIdx.setOptionalGelExecutableGelCacheId( Buff.getOptionalGelExecutableGelCacheId() );
		keyGelExecIdx.setOptionalGelExecutableId( Buff.getOptionalGelExecutableId() );

		YCFGenKbGenItemByProbeIdxKey keyProbeIdx = schema.getFactoryGenItem().newProbeIdxKey();
		keyProbeIdx.setOptionalProbeTenantId( Buff.getOptionalProbeTenantId() );
		keyProbeIdx.setOptionalProbeCartridgeId( Buff.getOptionalProbeCartridgeId() );
		keyProbeIdx.setOptionalProbeGenItemId( Buff.getOptionalProbeGenItemId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByAltIdx.containsKey( keyAltIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"GenItemAlt",
				keyAltIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableRuleCart().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Cartridge",
						"RuleCart",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableRuleType().readDerivedByIdIdx( Authorization,
						Buff.getRequiredRuleTypeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"RuleType",
						"RuleType",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableToolSet().readDerivedByIdIdx( Authorization,
						Buff.getRequiredToolSetId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"ToolSet",
						"ToolSet",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableDefClass().readDerivedByIdIdx( Authorization,
						Buff.getRequiredGenDefId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"GenDef",
						"DefClass",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictCartIdx;
		if( dictByCartIdx.containsKey( keyCartIdx ) ) {
			subdictCartIdx = dictByCartIdx.get( keyCartIdx );
		}
		else {
			subdictCartIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByCartIdx.put( keyCartIdx, subdictCartIdx );
		}
		subdictCartIdx.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictRuleTypeIdx;
		if( dictByRuleTypeIdx.containsKey( keyRuleTypeIdx ) ) {
			subdictRuleTypeIdx = dictByRuleTypeIdx.get( keyRuleTypeIdx );
		}
		else {
			subdictRuleTypeIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByRuleTypeIdx.put( keyRuleTypeIdx, subdictRuleTypeIdx );
		}
		subdictRuleTypeIdx.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictToolSetIdx;
		if( dictByToolSetIdx.containsKey( keyToolSetIdx ) ) {
			subdictToolSetIdx = dictByToolSetIdx.get( keyToolSetIdx );
		}
		else {
			subdictToolSetIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByToolSetIdx.put( keyToolSetIdx, subdictToolSetIdx );
		}
		subdictToolSetIdx.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictScopeIdx;
		if( dictByScopeIdx.containsKey( keyScopeIdx ) ) {
			subdictScopeIdx = dictByScopeIdx.get( keyScopeIdx );
		}
		else {
			subdictScopeIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByScopeIdx.put( keyScopeIdx, subdictScopeIdx );
		}
		subdictScopeIdx.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictGenDefIdx;
		if( dictByGenDefIdx.containsKey( keyGenDefIdx ) ) {
			subdictGenDefIdx = dictByGenDefIdx.get( keyGenDefIdx );
		}
		else {
			subdictGenDefIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByGenDefIdx.put( keyGenDefIdx, subdictGenDefIdx );
		}
		subdictGenDefIdx.put( pkey, Buff );

		dictByAltIdx.put( keyAltIdx, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictGelExecIdx;
		if( dictByGelExecIdx.containsKey( keyGelExecIdx ) ) {
			subdictGelExecIdx = dictByGelExecIdx.get( keyGelExecIdx );
		}
		else {
			subdictGelExecIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByGelExecIdx.put( keyGelExecIdx, subdictGelExecIdx );
		}
		subdictGelExecIdx.put( pkey, Buff );

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictProbeIdx;
		if( dictByProbeIdx.containsKey( keyProbeIdx ) ) {
			subdictProbeIdx = dictByProbeIdx.get( keyProbeIdx );
		}
		else {
			subdictProbeIdx = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByProbeIdx.put( keyProbeIdx, subdictProbeIdx );
		}
		subdictProbeIdx.put( pkey, Buff );

	}

	public YCFGenKbGenItemBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenItemBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenItemBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenItemBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenItemBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGenItem.readAllDerived";
		YCFGenKbGenItemBuff[] retList = new YCFGenKbGenItemBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGenItemBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGenItemBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictTenantIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByCartIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictCartIdx
				= dictByCartIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictCartIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictCartIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictCartIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByCartIdx.put( key, subdictCartIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByRuleTypeIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictRuleTypeIdx
				= dictByRuleTypeIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictRuleTypeIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictRuleTypeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictRuleTypeIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByRuleTypeIdx.put( key, subdictRuleTypeIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByToolSetIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictToolSetIdx
				= dictByToolSetIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictToolSetIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictToolSetIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictToolSetIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByToolSetIdx.put( key, subdictToolSetIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByScopeIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictScopeIdx
				= dictByScopeIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictScopeIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictScopeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictScopeIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByScopeIdx.put( key, subdictScopeIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByGenDefIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictGenDefIdx
				= dictByGenDefIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictGenDefIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictGenDefIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictGenDefIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByGenDefIdx.put( key, subdictGenDefIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByAltIdx";
		YCFGenKbGenItemByAltIdxKey key = schema.getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );

		YCFGenKbGenItemBuff buff;
		if( dictByAltIdx.containsKey( key ) ) {
			buff = dictByAltIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenItemBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByGelExecIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictGelExecIdx
				= dictByGelExecIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictGelExecIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictGelExecIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictGelExecIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByGelExecIdx.put( key, subdictGelExecIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );

		YCFGenKbGenItemBuff[] recArray;
		if( dictByProbeIdx.containsKey( key ) ) {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictProbeIdx
				= dictByProbeIdx.get( key );
			recArray = new YCFGenKbGenItemBuff[ subdictProbeIdx.size() ];
			Iterator< YCFGenKbGenItemBuff > iter = subdictProbeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdictProbeIdx
				= new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByProbeIdx.put( key, subdictProbeIdx );
			recArray = new YCFGenKbGenItemBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGenItemBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByItemIdIdx() ";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		key.setRequiredItemId( ItemId );

		YCFGenKbGenItemBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenItemBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuff";
		YCFGenKbGenItemBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a920" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenItemBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGenItemBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a920" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenItemBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readAllBuff";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByItemIdIdx() ";
		YCFGenKbGenItemBuff buff = readDerivedByItemIdIdx( Authorization,
			TenantId,
			CartridgeId,
			ItemId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenItemBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenItemBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByTenantIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByCartIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByRuleTypeIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByToolSetIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByScopeIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGenDefIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByGenDefIdx( Authorization,
			GenDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByAltIdx() ";
		YCFGenKbGenItemBuff buff = readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenItemBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenItemBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGelExecIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public YCFGenKbGenItemBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByProbeIdx() ";
		YCFGenKbGenItemBuff buff;
		ArrayList<YCFGenKbGenItemBuff> filteredList = new ArrayList<YCFGenKbGenItemBuff>();
		YCFGenKbGenItemBuff[] buffList = readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenItemBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenItemBuff[0] ) );
	}

	public void updateGenItem( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemBuff Buff )
	{
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenItemBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGenItem",
				"Existing record not found",
				"GenItem",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateGenItem",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbGenItemByTenantIdxKey existingKeyTenantIdx = schema.getFactoryGenItem().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGenItemByTenantIdxKey newKeyTenantIdx = schema.getFactoryGenItem().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGenItemByCartIdxKey existingKeyCartIdx = schema.getFactoryGenItem().newCartIdxKey();
		existingKeyCartIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyCartIdx.setRequiredCartridgeId( existing.getRequiredCartridgeId() );

		YCFGenKbGenItemByCartIdxKey newKeyCartIdx = schema.getFactoryGenItem().newCartIdxKey();
		newKeyCartIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyCartIdx.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );

		YCFGenKbGenItemByRuleTypeIdxKey existingKeyRuleTypeIdx = schema.getFactoryGenItem().newRuleTypeIdxKey();
		existingKeyRuleTypeIdx.setRequiredRuleTypeId( existing.getRequiredRuleTypeId() );

		YCFGenKbGenItemByRuleTypeIdxKey newKeyRuleTypeIdx = schema.getFactoryGenItem().newRuleTypeIdxKey();
		newKeyRuleTypeIdx.setRequiredRuleTypeId( Buff.getRequiredRuleTypeId() );

		YCFGenKbGenItemByToolSetIdxKey existingKeyToolSetIdx = schema.getFactoryGenItem().newToolSetIdxKey();
		existingKeyToolSetIdx.setRequiredToolSetId( existing.getRequiredToolSetId() );

		YCFGenKbGenItemByToolSetIdxKey newKeyToolSetIdx = schema.getFactoryGenItem().newToolSetIdxKey();
		newKeyToolSetIdx.setRequiredToolSetId( Buff.getRequiredToolSetId() );

		YCFGenKbGenItemByScopeIdxKey existingKeyScopeIdx = schema.getFactoryGenItem().newScopeIdxKey();
		existingKeyScopeIdx.setOptionalScopeDefId( existing.getOptionalScopeDefId() );

		YCFGenKbGenItemByScopeIdxKey newKeyScopeIdx = schema.getFactoryGenItem().newScopeIdxKey();
		newKeyScopeIdx.setOptionalScopeDefId( Buff.getOptionalScopeDefId() );

		YCFGenKbGenItemByGenDefIdxKey existingKeyGenDefIdx = schema.getFactoryGenItem().newGenDefIdxKey();
		existingKeyGenDefIdx.setRequiredGenDefId( existing.getRequiredGenDefId() );

		YCFGenKbGenItemByGenDefIdxKey newKeyGenDefIdx = schema.getFactoryGenItem().newGenDefIdxKey();
		newKeyGenDefIdx.setRequiredGenDefId( Buff.getRequiredGenDefId() );

		YCFGenKbGenItemByAltIdxKey existingKeyAltIdx = schema.getFactoryGenItem().newAltIdxKey();
		existingKeyAltIdx.setRequiredName( existing.getRequiredName() );
		existingKeyAltIdx.setRequiredToolSetId( existing.getRequiredToolSetId() );
		existingKeyAltIdx.setOptionalScopeDefId( existing.getOptionalScopeDefId() );
		existingKeyAltIdx.setRequiredGenDefId( existing.getRequiredGenDefId() );

		YCFGenKbGenItemByAltIdxKey newKeyAltIdx = schema.getFactoryGenItem().newAltIdxKey();
		newKeyAltIdx.setRequiredName( Buff.getRequiredName() );
		newKeyAltIdx.setRequiredToolSetId( Buff.getRequiredToolSetId() );
		newKeyAltIdx.setOptionalScopeDefId( Buff.getOptionalScopeDefId() );
		newKeyAltIdx.setRequiredGenDefId( Buff.getRequiredGenDefId() );

		YCFGenKbGenItemByGelExecIdxKey existingKeyGelExecIdx = schema.getFactoryGenItem().newGelExecIdxKey();
		existingKeyGelExecIdx.setOptionalGelExecutableTenantId( existing.getOptionalGelExecutableTenantId() );
		existingKeyGelExecIdx.setOptionalGelExecutableGelCacheId( existing.getOptionalGelExecutableGelCacheId() );
		existingKeyGelExecIdx.setOptionalGelExecutableId( existing.getOptionalGelExecutableId() );

		YCFGenKbGenItemByGelExecIdxKey newKeyGelExecIdx = schema.getFactoryGenItem().newGelExecIdxKey();
		newKeyGelExecIdx.setOptionalGelExecutableTenantId( Buff.getOptionalGelExecutableTenantId() );
		newKeyGelExecIdx.setOptionalGelExecutableGelCacheId( Buff.getOptionalGelExecutableGelCacheId() );
		newKeyGelExecIdx.setOptionalGelExecutableId( Buff.getOptionalGelExecutableId() );

		YCFGenKbGenItemByProbeIdxKey existingKeyProbeIdx = schema.getFactoryGenItem().newProbeIdxKey();
		existingKeyProbeIdx.setOptionalProbeTenantId( existing.getOptionalProbeTenantId() );
		existingKeyProbeIdx.setOptionalProbeCartridgeId( existing.getOptionalProbeCartridgeId() );
		existingKeyProbeIdx.setOptionalProbeGenItemId( existing.getOptionalProbeGenItemId() );

		YCFGenKbGenItemByProbeIdxKey newKeyProbeIdx = schema.getFactoryGenItem().newProbeIdxKey();
		newKeyProbeIdx.setOptionalProbeTenantId( Buff.getOptionalProbeTenantId() );
		newKeyProbeIdx.setOptionalProbeCartridgeId( Buff.getOptionalProbeCartridgeId() );
		newKeyProbeIdx.setOptionalProbeGenItemId( Buff.getOptionalProbeGenItemId() );

		// Check unique indexes

		if( ! existingKeyAltIdx.equals( newKeyAltIdx ) ) {
			if( dictByAltIdx.containsKey( newKeyAltIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateGenItem",
					"GenItemAlt",
					newKeyAltIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenItem",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableRuleCart().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredCartridgeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenItem",
						"Container",
						"Cartridge",
						"RuleCart",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableRuleType().readDerivedByIdIdx( Authorization,
						Buff.getRequiredRuleTypeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenItem",
						"Lookup",
						"RuleType",
						"RuleType",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableToolSet().readDerivedByIdIdx( Authorization,
						Buff.getRequiredToolSetId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenItem",
						"Lookup",
						"ToolSet",
						"ToolSet",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableDefClass().readDerivedByIdIdx( Authorization,
						Buff.getRequiredGenDefId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGenItem",
						"Lookup",
						"GenDef",
						"DefClass",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTenantIdx.get( existingKeyTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantIdx.containsKey( newKeyTenantIdx ) ) {
			subdict = dictByTenantIdx.get( newKeyTenantIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByCartIdx.get( existingKeyCartIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCartIdx.containsKey( newKeyCartIdx ) ) {
			subdict = dictByCartIdx.get( newKeyCartIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByCartIdx.put( newKeyCartIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByRuleTypeIdx.get( existingKeyRuleTypeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRuleTypeIdx.containsKey( newKeyRuleTypeIdx ) ) {
			subdict = dictByRuleTypeIdx.get( newKeyRuleTypeIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByRuleTypeIdx.put( newKeyRuleTypeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByToolSetIdx.get( existingKeyToolSetIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByToolSetIdx.containsKey( newKeyToolSetIdx ) ) {
			subdict = dictByToolSetIdx.get( newKeyToolSetIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByToolSetIdx.put( newKeyToolSetIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByScopeIdx.get( existingKeyScopeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByScopeIdx.containsKey( newKeyScopeIdx ) ) {
			subdict = dictByScopeIdx.get( newKeyScopeIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByScopeIdx.put( newKeyScopeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByGenDefIdx.get( existingKeyGenDefIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByGenDefIdx.containsKey( newKeyGenDefIdx ) ) {
			subdict = dictByGenDefIdx.get( newKeyGenDefIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByGenDefIdx.put( newKeyGenDefIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByAltIdx.remove( existingKeyAltIdx );
		dictByAltIdx.put( newKeyAltIdx, Buff );

		subdict = dictByGelExecIdx.get( existingKeyGelExecIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByGelExecIdx.containsKey( newKeyGelExecIdx ) ) {
			subdict = dictByGelExecIdx.get( newKeyGelExecIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByGelExecIdx.put( newKeyGelExecIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByProbeIdx.get( existingKeyProbeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByProbeIdx.containsKey( newKeyProbeIdx ) ) {
			subdict = dictByProbeIdx.get( newKeyProbeIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff >();
			dictByProbeIdx.put( newKeyProbeIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGenItem( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGenItemTable.deleteGenItem() ";
		String classCode;
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenItemBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGenItem",
				pkey );
		}
					schema.getTableGelExecutable().deleteGelExecutableByPIdx( Authorization,
						existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );
		YCFGenKbGenItemByTenantIdxKey keyTenantIdx = schema.getFactoryGenItem().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGenItemByCartIdxKey keyCartIdx = schema.getFactoryGenItem().newCartIdxKey();
		keyCartIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyCartIdx.setRequiredCartridgeId( existing.getRequiredCartridgeId() );

		YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx = schema.getFactoryGenItem().newRuleTypeIdxKey();
		keyRuleTypeIdx.setRequiredRuleTypeId( existing.getRequiredRuleTypeId() );

		YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx = schema.getFactoryGenItem().newToolSetIdxKey();
		keyToolSetIdx.setRequiredToolSetId( existing.getRequiredToolSetId() );

		YCFGenKbGenItemByScopeIdxKey keyScopeIdx = schema.getFactoryGenItem().newScopeIdxKey();
		keyScopeIdx.setOptionalScopeDefId( existing.getOptionalScopeDefId() );

		YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx = schema.getFactoryGenItem().newGenDefIdxKey();
		keyGenDefIdx.setRequiredGenDefId( existing.getRequiredGenDefId() );

		YCFGenKbGenItemByAltIdxKey keyAltIdx = schema.getFactoryGenItem().newAltIdxKey();
		keyAltIdx.setRequiredName( existing.getRequiredName() );
		keyAltIdx.setRequiredToolSetId( existing.getRequiredToolSetId() );
		keyAltIdx.setOptionalScopeDefId( existing.getOptionalScopeDefId() );
		keyAltIdx.setRequiredGenDefId( existing.getRequiredGenDefId() );

		YCFGenKbGenItemByGelExecIdxKey keyGelExecIdx = schema.getFactoryGenItem().newGelExecIdxKey();
		keyGelExecIdx.setOptionalGelExecutableTenantId( existing.getOptionalGelExecutableTenantId() );
		keyGelExecIdx.setOptionalGelExecutableGelCacheId( existing.getOptionalGelExecutableGelCacheId() );
		keyGelExecIdx.setOptionalGelExecutableId( existing.getOptionalGelExecutableId() );

		YCFGenKbGenItemByProbeIdxKey keyProbeIdx = schema.getFactoryGenItem().newProbeIdxKey();
		keyProbeIdx.setOptionalProbeTenantId( existing.getOptionalProbeTenantId() );
		keyProbeIdx.setOptionalProbeCartridgeId( existing.getOptionalProbeCartridgeId() );
		keyProbeIdx.setOptionalProbeGenItemId( existing.getOptionalProbeGenItemId() );

		// Validate reverse foreign keys

		if( schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredCartridgeId(),
					existing.getRequiredItemId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGenItem",
				"Superclass",
				"SuperClass",
				"GenIterator",
				pkey );
		}

		if( schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredCartridgeId(),
					existing.getRequiredItemId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGenItem",
				"Superclass",
				"SuperClass",
				"GenReference",
				pkey );
		}

		if( schema.getTableGenRule().readDerivedByItemIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredCartridgeId(),
					existing.getRequiredItemId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGenItem",
				"Superclass",
				"SuperClass",
				"GenRule",
				pkey );
		}

		if( schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredCartridgeId(),
					existing.getRequiredItemId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGenItem",
				"Superclass",
				"SuperClass",
				"GenBind",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbGenItemPKey, YCFGenKbGenItemBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByCartIdx.get( keyCartIdx );
		subdict.remove( pkey );

		subdict = dictByRuleTypeIdx.get( keyRuleTypeIdx );
		subdict.remove( pkey );

		subdict = dictByToolSetIdx.get( keyToolSetIdx );
		subdict.remove( pkey );

		subdict = dictByScopeIdx.get( keyScopeIdx );
		subdict.remove( pkey );

		subdict = dictByGenDefIdx.get( keyGenDefIdx );
		subdict.remove( pkey );

		dictByAltIdx.remove( keyAltIdx );

		subdict = dictByGelExecIdx.get( keyGelExecIdx );
		subdict.remove( pkey );

		subdict = dictByProbeIdx.get( keyProbeIdx );
		subdict.remove( pkey );

	}
	public void deleteGenItemByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId )
	{
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		key.setRequiredItemId( argItemId );
		deleteGenItemByItemIdIdx( Authorization, key );
	}

	public void deleteGenItemByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey )
	{
		final String S_ProcName = "deleteGenItemByItemIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGenItemBuff cur;
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGenItemByTenantIdx( Authorization, key );
	}

	public void deleteGenItemByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByTenantIdx";
		YCFGenKbGenItemBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		deleteGenItemByCartIdx( Authorization, key );
	}

	public void deleteGenItemByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByCartIdx";
		YCFGenKbGenItemBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( argRuleTypeId );
		deleteGenItemByRuleTypeIdx( Authorization, key );
	}

	public void deleteGenItemByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByRuleTypeIdx";
		YCFGenKbGenItemBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( argToolSetId );
		deleteGenItemByToolSetIdx( Authorization, key );
	}

	public void deleteGenItemByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByToolSetIdx";
		YCFGenKbGenItemBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( argScopeDefId );
		deleteGenItemByScopeIdx( Authorization, key );
	}

	public void deleteGenItemByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByScopeIdx";
		YCFGenKbGenItemBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( argGenDefId );
		deleteGenItemByGenDefIdx( Authorization, key );
	}

	public void deleteGenItemByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByGenDefIdx";
		YCFGenKbGenItemBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByAltIdx( YCFGenKbAuthorization Authorization,
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
		deleteGenItemByAltIdx( Authorization, key );
	}

	public void deleteGenItemByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByAltIdx";
		YCFGenKbGenItemBuff cur;
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
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( argGelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( argGelExecutableGelCacheId );
		key.setOptionalGelExecutableId( argGelExecutableId );
		deleteGenItemByGelExecIdx( Authorization, key );
	}

	public void deleteGenItemByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByGelExecIdx";
		YCFGenKbGenItemBuff cur;
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
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGenItemByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( argProbeTenantId );
		key.setOptionalProbeCartridgeId( argProbeCartridgeId );
		key.setOptionalProbeGenItemId( argProbeGenItemId );
		deleteGenItemByProbeIdx( Authorization, key );
	}

	public void deleteGenItemByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey )
	{
		final String S_ProcName = "deleteGenItemByProbeIdx";
		YCFGenKbGenItemBuff cur;
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
		LinkedList<YCFGenKbGenItemBuff> matchSet = new LinkedList<YCFGenKbGenItemBuff>();
		Iterator<YCFGenKbGenItemBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenItemBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenItem().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			String subClassCode = cur.getClassCode();
			if( "a920".equals( subClassCode ) ) {
				schema.getTableGenItem().deleteGenItem( Authorization, cur );
			}
			else if( "a921".equals( subClassCode ) ) {
				schema.getTableGenIterator().deleteGenIterator( Authorization, (YCFGenKbGenIteratorBuff)cur );
			}
			else if( "a922".equals( subClassCode ) ) {
				schema.getTableGenReference().deleteGenReference( Authorization, (YCFGenKbGenReferenceBuff)cur );
			}
			else if( "a923".equals( subClassCode ) ) {
				schema.getTableGenRule().deleteGenRule( Authorization, (YCFGenKbGenRuleBuff)cur );
			}
			else if( "a924".equals( subClassCode ) ) {
				schema.getTableGenTrunc().deleteGenTrunc( Authorization, (YCFGenKbGenTruncBuff)cur );
			}
			else if( "a932".equals( subClassCode ) ) {
				schema.getTableGenFile().deleteGenFile( Authorization, (YCFGenKbGenFileBuff)cur );
			}
			else if( "a931".equals( subClassCode ) ) {
				schema.getTableGenBind().deleteGenBind( Authorization, (YCFGenKbGenBindBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GenItem must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
