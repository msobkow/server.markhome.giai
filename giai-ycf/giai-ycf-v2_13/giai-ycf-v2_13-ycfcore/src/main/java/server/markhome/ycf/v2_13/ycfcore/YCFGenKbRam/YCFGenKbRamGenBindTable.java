
// Description: Java 11 in-memory RAM DbIO implementation for GenBind.

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
 *	YCFGenKbRamGenBindTable in-memory RAM DbIO implementation
 *	for GenBind.
 */
public class YCFGenKbRamGenBindTable
	implements IYCFGenKbGenBindTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGenItemPKey,
				YCFGenKbGenBindBuff > dictByPKey
		= new HashMap< YCFGenKbGenItemPKey,
				YCFGenKbGenBindBuff >();

	public YCFGenKbRamGenBindTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGenBind( YCFGenKbAuthorization Authorization,
		YCFGenKbGenBindBuff Buff )
	{
		final String S_ProcName = "createGenBind";
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

	public YCFGenKbGenBindBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenBind.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenBindBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenBindBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenBind.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenBindBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenBindBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGenBind.readAllDerived";
		YCFGenKbGenBindBuff[] retList = new YCFGenKbGenBindBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGenBindBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGenBindBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
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
		else if( buff instanceof YCFGenKbGenBindBuff ) {
			return( (YCFGenKbGenBindBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenBindBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenBindBuff ) ) {
					filteredList.add( (YCFGenKbGenBindBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
		}
	}

	public YCFGenKbGenBindBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByItemIdIdx() ";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		key.setRequiredItemId( ItemId );

		YCFGenKbGenBindBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenBindBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenBind.readBuff";
		YCFGenKbGenBindBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a931" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenBindBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGenBindBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a931" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenBindBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGenBind.readAllBuff";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a931" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByItemIdIdx() ";
		YCFGenKbGenBindBuff buff = readDerivedByItemIdIdx( Authorization,
			TenantId,
			CartridgeId,
			ItemId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenBindBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenBindBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByTenantIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByCartIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByRuleTypeIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByToolSetIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByScopeIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGenDefIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByGenDefIdx( Authorization,
			GenDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByAltIdx() ";
		YCFGenKbGenBindBuff buff = readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenBindBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenBindBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGelExecIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public YCFGenKbGenBindBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByProbeIdx() ";
		YCFGenKbGenBindBuff buff;
		ArrayList<YCFGenKbGenBindBuff> filteredList = new ArrayList<YCFGenKbGenBindBuff>();
		YCFGenKbGenBindBuff[] buffList = readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenBindBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenBindBuff[0] ) );
	}

	public void updateGenBind( YCFGenKbAuthorization Authorization,
		YCFGenKbGenBindBuff Buff )
	{
		schema.getTableGenItem().updateGenItem( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenBindBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGenBind",
				"Existing record not found",
				"GenBind",
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
						"updateGenBind",
						"Superclass",
						"SuperClass",
						"GenItem",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGenItemPKey, YCFGenKbGenBindBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

	}

	public void deleteGenBind( YCFGenKbAuthorization Authorization,
		YCFGenKbGenBindBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGenBindTable.deleteGenBind() ";
		String classCode;
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenBindBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGenBind",
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
		Map< YCFGenKbGenItemPKey, YCFGenKbGenBindBuff > subdict;

		dictByPKey.remove( pkey );

		schema.getTableGenItem().deleteGenItem( Authorization,
			Buff );
	}
	public void deleteGenBindByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId )
	{
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		key.setRequiredItemId( argItemId );
		deleteGenBindByItemIdIdx( Authorization, key );
	}

	public void deleteGenBindByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGenBindBuff cur;
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGenBindByTenantIdx( Authorization, key );
	}

	public void deleteGenBindByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		deleteGenBindByCartIdx( Authorization, key );
	}

	public void deleteGenBindByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( argRuleTypeId );
		deleteGenBindByRuleTypeIdx( Authorization, key );
	}

	public void deleteGenBindByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( argToolSetId );
		deleteGenBindByToolSetIdx( Authorization, key );
	}

	public void deleteGenBindByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( argScopeDefId );
		deleteGenBindByScopeIdx( Authorization, key );
	}

	public void deleteGenBindByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( argGenDefId );
		deleteGenBindByGenDefIdx( Authorization, key );
	}

	public void deleteGenBindByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByAltIdx( YCFGenKbAuthorization Authorization,
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
		deleteGenBindByAltIdx( Authorization, key );
	}

	public void deleteGenBindByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
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
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( argGelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( argGelExecutableGelCacheId );
		key.setOptionalGelExecutableId( argGelExecutableId );
		deleteGenBindByGelExecIdx( Authorization, key );
	}

	public void deleteGenBindByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
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
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void deleteGenBindByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( argProbeTenantId );
		key.setOptionalProbeCartridgeId( argProbeCartridgeId );
		key.setOptionalProbeGenItemId( argProbeGenItemId );
		deleteGenBindByProbeIdx( Authorization, key );
	}

	public void deleteGenBindByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey )
	{
		YCFGenKbGenBindBuff cur;
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
		LinkedList<YCFGenKbGenBindBuff> matchSet = new LinkedList<YCFGenKbGenBindBuff>();
		Iterator<YCFGenKbGenBindBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenBindBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenBind().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenBind( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
