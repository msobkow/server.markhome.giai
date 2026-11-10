
// Description: Java 11 in-memory RAM DbIO implementation for GenIterator.

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
 *	YCFGenKbRamGenIteratorTable in-memory RAM DbIO implementation
 *	for GenIterator.
 */
public class YCFGenKbRamGenIteratorTable
	implements IYCFGenKbGenIteratorTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGenItemPKey,
				YCFGenKbGenIteratorBuff > dictByPKey
		= new HashMap< YCFGenKbGenItemPKey,
				YCFGenKbGenIteratorBuff >();

	public YCFGenKbRamGenIteratorTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGenIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGenIteratorBuff Buff )
	{
		final String S_ProcName = "createGenIterator";
		schema.getTableGenItem().createGenItem( Authorization,
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

	}

	public YCFGenKbGenIteratorBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenIterator.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenIteratorBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenIteratorBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenIterator.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenIteratorBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenIteratorBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGenIterator.readAllDerived";
		YCFGenKbGenIteratorBuff[] retList = new YCFGenKbGenIteratorBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGenIteratorBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
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
		else if( buff instanceof YCFGenKbGenIteratorBuff ) {
			return( (YCFGenKbGenIteratorBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGenIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGenIteratorBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByItemIdIdx() ";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		key.setRequiredItemId( ItemId );

		YCFGenKbGenIteratorBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenIteratorBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenIterator.readBuff";
		YCFGenKbGenIteratorBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a921" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenIteratorBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGenIteratorBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a921" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenIteratorBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGenIterator.readAllBuff";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a921" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByItemIdIdx() ";
		YCFGenKbGenIteratorBuff buff = readDerivedByItemIdIdx( Authorization,
			TenantId,
			CartridgeId,
			ItemId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenIteratorBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenIteratorBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByTenantIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByCartIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByRuleTypeIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByToolSetIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByScopeIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGenDefIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByGenDefIdx( Authorization,
			GenDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByAltIdx() ";
		YCFGenKbGenIteratorBuff buff = readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenIteratorBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenIteratorBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGelExecIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public YCFGenKbGenIteratorBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByProbeIdx() ";
		YCFGenKbGenIteratorBuff buff;
		ArrayList<YCFGenKbGenIteratorBuff> filteredList = new ArrayList<YCFGenKbGenIteratorBuff>();
		YCFGenKbGenIteratorBuff[] buffList = readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenIteratorBuff[0] ) );
	}

	public void updateGenIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGenIteratorBuff Buff )
	{
		schema.getTableGenItem().updateGenItem( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenIteratorBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGenIterator",
				"Existing record not found",
				"GenIterator",
				pkey );
		}
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
						"updateGenIterator",
						"Superclass",
						"SuperClass",
						"GenItem",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGenItemPKey, YCFGenKbGenIteratorBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

	}

	public void deleteGenIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGenIteratorBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGenIteratorTable.deleteGenIterator() ";
		String classCode;
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenIteratorBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGenIterator",
				pkey );
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
		Map< YCFGenKbGenItemPKey, YCFGenKbGenIteratorBuff > subdict;

		dictByPKey.remove( pkey );

		schema.getTableGenItem().deleteGenItem( Authorization,
			Buff );
	}
	public void deleteGenIteratorByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId )
	{
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		key.setRequiredItemId( argItemId );
		deleteGenIteratorByItemIdIdx( Authorization, key );
	}

	public void deleteGenIteratorByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGenIteratorBuff cur;
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGenIteratorByTenantIdx( Authorization, key );
	}

	public void deleteGenIteratorByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		deleteGenIteratorByCartIdx( Authorization, key );
	}

	public void deleteGenIteratorByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( argRuleTypeId );
		deleteGenIteratorByRuleTypeIdx( Authorization, key );
	}

	public void deleteGenIteratorByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( argToolSetId );
		deleteGenIteratorByToolSetIdx( Authorization, key );
	}

	public void deleteGenIteratorByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( argScopeDefId );
		deleteGenIteratorByScopeIdx( Authorization, key );
	}

	public void deleteGenIteratorByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( argGenDefId );
		deleteGenIteratorByGenDefIdx( Authorization, key );
	}

	public void deleteGenIteratorByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByAltIdx( YCFGenKbAuthorization Authorization,
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
		deleteGenIteratorByAltIdx( Authorization, key );
	}

	public void deleteGenIteratorByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
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
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( argGelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( argGelExecutableGelCacheId );
		key.setOptionalGelExecutableId( argGelExecutableId );
		deleteGenIteratorByGelExecIdx( Authorization, key );
	}

	public void deleteGenIteratorByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
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
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void deleteGenIteratorByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( argProbeTenantId );
		key.setOptionalProbeCartridgeId( argProbeCartridgeId );
		key.setOptionalProbeGenItemId( argProbeGenItemId );
		deleteGenIteratorByProbeIdx( Authorization, key );
	}

	public void deleteGenIteratorByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey )
	{
		YCFGenKbGenIteratorBuff cur;
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
		LinkedList<YCFGenKbGenIteratorBuff> matchSet = new LinkedList<YCFGenKbGenIteratorBuff>();
		Iterator<YCFGenKbGenIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenIterator().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenIterator( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
