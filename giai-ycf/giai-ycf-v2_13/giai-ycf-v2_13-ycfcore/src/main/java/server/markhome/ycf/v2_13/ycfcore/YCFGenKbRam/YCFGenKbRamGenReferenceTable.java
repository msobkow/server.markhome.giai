
// Description: Java 11 in-memory RAM DbIO implementation for GenReference.

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
 *	YCFGenKbRamGenReferenceTable in-memory RAM DbIO implementation
 *	for GenReference.
 */
public class YCFGenKbRamGenReferenceTable
	implements IYCFGenKbGenReferenceTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGenItemPKey,
				YCFGenKbGenReferenceBuff > dictByPKey
		= new HashMap< YCFGenKbGenItemPKey,
				YCFGenKbGenReferenceBuff >();

	public YCFGenKbRamGenReferenceTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGenReference( YCFGenKbAuthorization Authorization,
		YCFGenKbGenReferenceBuff Buff )
	{
		final String S_ProcName = "createGenReference";
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

	public YCFGenKbGenReferenceBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenReference.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenReferenceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenReferenceBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenReference.readDerived";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredCartridgeId( PKey.getRequiredCartridgeId() );
		key.setRequiredItemId( PKey.getRequiredItemId() );
		YCFGenKbGenReferenceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenReferenceBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGenReference.readAllDerived";
		YCFGenKbGenReferenceBuff[] retList = new YCFGenKbGenReferenceBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGenReferenceBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
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
		else if( buff instanceof YCFGenKbGenReferenceBuff ) {
			return( (YCFGenKbGenReferenceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGenReferenceBuff ) ) {
					filteredList.add( (YCFGenKbGenReferenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
		}
	}

	public YCFGenKbGenReferenceBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readDerivedByItemIdIdx() ";
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		key.setRequiredItemId( ItemId );

		YCFGenKbGenReferenceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenReferenceBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGenReference.readBuff";
		YCFGenKbGenReferenceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a922" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenReferenceBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGenReferenceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a922" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGenReferenceBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGenReference.readAllBuff";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a922" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByItemIdIdx() ";
		YCFGenKbGenReferenceBuff buff = readDerivedByItemIdIdx( Authorization,
			TenantId,
			CartridgeId,
			ItemId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenReferenceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenReferenceBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByTenantIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByCartIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByCartIdx( Authorization,
			TenantId,
			CartridgeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByRuleTypeIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByRuleTypeIdx( Authorization,
			RuleTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByToolSetIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByToolSetIdx( Authorization,
			ToolSetId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByScopeIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByScopeIdx( Authorization,
			ScopeDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGenDefIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByGenDefIdx( Authorization,
			GenDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByAltIdx() ";
		YCFGenKbGenReferenceBuff buff = readDerivedByAltIdx( Authorization,
			Name,
			ToolSetId,
			ScopeDefId,
			GenDefId );
		if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
			return( (YCFGenKbGenReferenceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGenReferenceBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByGelExecIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByGelExecIdx( Authorization,
			GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public YCFGenKbGenReferenceBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "YCFGenKbRamGenItem.readBuffByProbeIdx() ";
		YCFGenKbGenReferenceBuff buff;
		ArrayList<YCFGenKbGenReferenceBuff> filteredList = new ArrayList<YCFGenKbGenReferenceBuff>();
		YCFGenKbGenReferenceBuff[] buffList = readDerivedByProbeIdx( Authorization,
			ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a920" ) ) {
				filteredList.add( (YCFGenKbGenReferenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGenReferenceBuff[0] ) );
	}

	public void updateGenReference( YCFGenKbAuthorization Authorization,
		YCFGenKbGenReferenceBuff Buff )
	{
		schema.getTableGenItem().updateGenItem( Authorization,
			Buff );
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenReferenceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGenReference",
				"Existing record not found",
				"GenReference",
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
						"updateGenReference",
						"Superclass",
						"SuperClass",
						"GenItem",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGenItemPKey, YCFGenKbGenReferenceBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

	}

	public void deleteGenReference( YCFGenKbAuthorization Authorization,
		YCFGenKbGenReferenceBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGenReferenceTable.deleteGenReference() ";
		String classCode;
		YCFGenKbGenItemPKey pkey = schema.getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredCartridgeId( Buff.getRequiredCartridgeId() );
		pkey.setRequiredItemId( Buff.getRequiredItemId() );
		YCFGenKbGenReferenceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGenReference",
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
		Map< YCFGenKbGenItemPKey, YCFGenKbGenReferenceBuff > subdict;

		dictByPKey.remove( pkey );

		schema.getTableGenItem().deleteGenItem( Authorization,
			Buff );
	}
	public void deleteGenReferenceByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId )
	{
		YCFGenKbGenItemPKey key = schema.getFactoryGenItem().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		key.setRequiredItemId( argItemId );
		deleteGenReferenceByItemIdIdx( Authorization, key );
	}

	public void deleteGenReferenceByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGenReferenceBuff cur;
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = schema.getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGenReferenceByTenantIdx( Authorization, key );
	}

	public void deleteGenReferenceByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = schema.getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCartridgeId( argCartridgeId );
		deleteGenReferenceByCartIdx( Authorization, key );
	}

	public void deleteGenReferenceByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = schema.getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( argRuleTypeId );
		deleteGenReferenceByRuleTypeIdx( Authorization, key );
	}

	public void deleteGenReferenceByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = schema.getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( argToolSetId );
		deleteGenReferenceByToolSetIdx( Authorization, key );
	}

	public void deleteGenReferenceByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = schema.getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( argScopeDefId );
		deleteGenReferenceByScopeIdx( Authorization, key );
	}

	public void deleteGenReferenceByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalScopeDefId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = schema.getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( argGenDefId );
		deleteGenReferenceByGenDefIdx( Authorization, key );
	}

	public void deleteGenReferenceByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByAltIdx( YCFGenKbAuthorization Authorization,
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
		deleteGenReferenceByAltIdx( Authorization, key );
	}

	public void deleteGenReferenceByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
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
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = schema.getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( argGelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( argGelExecutableGelCacheId );
		key.setOptionalGelExecutableId( argGelExecutableId );
		deleteGenReferenceByGelExecIdx( Authorization, key );
	}

	public void deleteGenReferenceByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
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
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void deleteGenReferenceByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = schema.getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( argProbeTenantId );
		key.setOptionalProbeCartridgeId( argProbeCartridgeId );
		key.setOptionalProbeGenItemId( argProbeGenItemId );
		deleteGenReferenceByProbeIdx( Authorization, key );
	}

	public void deleteGenReferenceByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey )
	{
		YCFGenKbGenReferenceBuff cur;
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
		LinkedList<YCFGenKbGenReferenceBuff> matchSet = new LinkedList<YCFGenKbGenReferenceBuff>();
		Iterator<YCFGenKbGenReferenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGenReferenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGenReference().readDerivedByItemIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredCartridgeId(),
				cur.getRequiredItemId() );
			deleteGenReference( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
