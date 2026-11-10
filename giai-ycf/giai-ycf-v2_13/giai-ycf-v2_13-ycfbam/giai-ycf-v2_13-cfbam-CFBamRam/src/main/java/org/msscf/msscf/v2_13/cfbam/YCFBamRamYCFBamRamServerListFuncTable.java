
// Description: Java 11 in-memory RAM DbIO implementation for ServerListFunc.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamRamServerListFuncTable in-memory RAM DbIO implementation
 *	for ServerListFunc.
 */
public class YCFBamRamServerListFuncTable
	implements IYCFBamServerListFuncTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamServerListFuncBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamServerListFuncBuff >();
	private Map< YCFBamServerListFuncByRetTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerListFuncBuff >> dictByRetTblIdx
		= new HashMap< YCFBamServerListFuncByRetTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerListFuncBuff >>();

	public YCFBamRamServerListFuncTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createServerListFunc( YCFSecAuthorization Authorization,
		YCFBamServerListFuncBuff Buff )
	{
		final String S_ProcName = "createServerListFunc";
		schema.getTableServerMethod().createServerMethod( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerListFuncByRetTblIdxKey keyRetTblIdx = schema.getFactoryServerListFunc().newRetTblIdxKey();
		keyRetTblIdx.setOptionalRetTenantId( Buff.getOptionalRetTenantId() );
		keyRetTblIdx.setOptionalRetTableId( Buff.getOptionalRetTableId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"ServerMethod",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamServerListFuncBuff > subdictRetTblIdx;
		if( dictByRetTblIdx.containsKey( keyRetTblIdx ) ) {
			subdictRetTblIdx = dictByRetTblIdx.get( keyRetTblIdx );
		}
		else {
			subdictRetTblIdx = new HashMap< YCFBamScopePKey, YCFBamServerListFuncBuff >();
			dictByRetTblIdx.put( keyRetTblIdx, subdictRetTblIdx );
		}
		subdictRetTblIdx.put( pkey, Buff );

	}

	public YCFBamServerListFuncBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerListFunc.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerListFuncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerListFuncBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerListFunc.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerListFuncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerListFuncBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamServerListFunc.readAllDerived";
		YCFBamServerListFuncBuff[] retList = new YCFBamServerListFuncBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamServerListFuncBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamServerListFuncBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByTenantIdx";
		YCFBamScopeBuff buffList[] = schema.getTableScope().readDerivedByTenantIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamScopeBuff buff;
			ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerListFuncBuff ) ) {
					filteredList.add( (YCFBamServerListFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
		}
	}

	public YCFBamServerListFuncBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByUNameIdx";
		YCFBamServerMethodBuff buff = schema.getTableServerMethod().readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamServerListFuncBuff ) {
			return( (YCFBamServerListFuncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerListFuncBuff[] readDerivedByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByMethTableIdx";
		YCFBamServerMethodBuff buffList[] = schema.getTableServerMethod().readDerivedByMethTableIdx( Authorization,
			TenantId,
			TableId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamServerMethodBuff buff;
			ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerListFuncBuff ) ) {
					filteredList.add( (YCFBamServerListFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
		}
	}

	public YCFBamServerListFuncBuff[] readDerivedByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByMethTableVisIdx";
		YCFBamServerMethodBuff buffList[] = schema.getTableServerMethod().readDerivedByMethTableVisIdx( Authorization,
			TenantId,
			TableId,
			CodeVis );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamServerMethodBuff buff;
			ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerListFuncBuff ) ) {
					filteredList.add( (YCFBamServerListFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
		}
	}

	public YCFBamServerListFuncBuff[] readDerivedByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByMethCodeVisIdx";
		YCFBamServerMethodBuff buffList[] = schema.getTableServerMethod().readDerivedByMethCodeVisIdx( Authorization,
			CodeVis );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamServerMethodBuff buff;
			ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerListFuncBuff ) ) {
					filteredList.add( (YCFBamServerListFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
		}
	}

	public YCFBamServerListFuncBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByDefSchemaIdx";
		YCFBamServerMethodBuff buffList[] = schema.getTableServerMethod().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamServerMethodBuff buff;
			ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerListFuncBuff ) ) {
					filteredList.add( (YCFBamServerListFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
		}
	}

	public YCFBamServerListFuncBuff[] readDerivedByRetTblIdx( YCFSecAuthorization Authorization,
		Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "YCFBamRamServerListFunc.readDerivedByRetTblIdx";
		YCFBamServerListFuncByRetTblIdxKey key = schema.getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );

		YCFBamServerListFuncBuff[] recArray;
		if( dictByRetTblIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamServerListFuncBuff > subdictRetTblIdx
				= dictByRetTblIdx.get( key );
			recArray = new YCFBamServerListFuncBuff[ subdictRetTblIdx.size() ];
			Iterator< YCFBamServerListFuncBuff > iter = subdictRetTblIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamServerListFuncBuff > subdictRetTblIdx
				= new HashMap< YCFBamScopePKey, YCFBamServerListFuncBuff >();
			dictByRetTblIdx.put( key, subdictRetTblIdx );
			recArray = new YCFBamServerListFuncBuff[0];
		}
		return( recArray );
	}

	public YCFBamServerListFuncBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamServerListFuncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerListFuncBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerListFunc.readBuff";
		YCFBamServerListFuncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a83a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerListFuncBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamServerListFuncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a83a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerListFuncBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamServerListFunc.readAllBuff";
		YCFBamServerListFuncBuff buff;
		ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
		YCFBamServerListFuncBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a83a" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
	}

	public YCFBamServerListFuncBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamServerListFuncBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamServerListFuncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerListFuncBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamServerListFuncBuff buff;
		ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
		YCFBamServerListFuncBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamServerListFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
	}

	public YCFBamServerListFuncBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByUNameIdx() ";
		YCFBamServerListFuncBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
			return( (YCFBamServerListFuncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerListFuncBuff[] readBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableIdx() ";
		YCFBamServerListFuncBuff buff;
		ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
		YCFBamServerListFuncBuff[] buffList = readDerivedByMethTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerListFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
	}

	public YCFBamServerListFuncBuff[] readBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableVisIdx() ";
		YCFBamServerListFuncBuff buff;
		ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
		YCFBamServerListFuncBuff[] buffList = readDerivedByMethTableVisIdx( Authorization,
			TenantId,
			TableId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerListFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
	}

	public YCFBamServerListFuncBuff[] readBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethCodeVisIdx() ";
		YCFBamServerListFuncBuff buff;
		ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
		YCFBamServerListFuncBuff[] buffList = readDerivedByMethCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerListFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
	}

	public YCFBamServerListFuncBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByDefSchemaIdx() ";
		YCFBamServerListFuncBuff buff;
		ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
		YCFBamServerListFuncBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerListFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
	}

	public YCFBamServerListFuncBuff[] readBuffByRetTblIdx( YCFSecAuthorization Authorization,
		Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "YCFBamRamServerListFunc.readBuffByRetTblIdx() ";
		YCFBamServerListFuncBuff buff;
		ArrayList<YCFBamServerListFuncBuff> filteredList = new ArrayList<YCFBamServerListFuncBuff>();
		YCFBamServerListFuncBuff[] buffList = readDerivedByRetTblIdx( Authorization,
			RetTenantId,
			RetTableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a83a" ) ) {
				filteredList.add( (YCFBamServerListFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerListFuncBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific ServerListFunc buffer instances identified by the duplicate key MethTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerListFuncBuff[] pageBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerListFunc buffer instances identified by the duplicate key MethTableVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerListFuncBuff[] pageBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethTableVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerListFunc buffer instances identified by the duplicate key MethCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerListFuncBuff[] pageBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerListFunc buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerListFuncBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerListFunc buffer instances identified by the duplicate key RetTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRetTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argRetTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerListFuncBuff[] pageBuffByRetTblIdx( YCFSecAuthorization Authorization,
		Long RetTenantId,
		Long RetTableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRetTblIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateServerListFunc( YCFSecAuthorization Authorization,
		YCFBamServerListFuncBuff Buff )
	{
		schema.getTableServerMethod().updateServerMethod( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerListFuncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateServerListFunc",
				"Existing record not found",
				"ServerListFunc",
				pkey );
		}
		YCFBamServerListFuncByRetTblIdxKey existingKeyRetTblIdx = schema.getFactoryServerListFunc().newRetTblIdxKey();
		existingKeyRetTblIdx.setOptionalRetTenantId( existing.getOptionalRetTenantId() );
		existingKeyRetTblIdx.setOptionalRetTableId( existing.getOptionalRetTableId() );

		YCFBamServerListFuncByRetTblIdxKey newKeyRetTblIdx = schema.getFactoryServerListFunc().newRetTblIdxKey();
		newKeyRetTblIdx.setOptionalRetTenantId( Buff.getOptionalRetTenantId() );
		newKeyRetTblIdx.setOptionalRetTableId( Buff.getOptionalRetTableId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateServerListFunc",
						"Superclass",
						"SuperClass",
						"ServerMethod",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamServerListFuncBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByRetTblIdx.get( existingKeyRetTblIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRetTblIdx.containsKey( newKeyRetTblIdx ) ) {
			subdict = dictByRetTblIdx.get( newKeyRetTblIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamServerListFuncBuff >();
			dictByRetTblIdx.put( newKeyRetTblIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteServerListFunc( YCFSecAuthorization Authorization,
		YCFBamServerListFuncBuff Buff )
	{
		final String S_ProcName = "YCFBamRamServerListFuncTable.deleteServerListFunc() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerListFuncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteServerListFunc",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckParams[] = schema.getTableParam().readDerivedByServerMethodIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckParams.length > 0 ) {
			schema.getTableParam().deleteParamByServerMethodIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamServerListFuncByRetTblIdxKey keyRetTblIdx = schema.getFactoryServerListFunc().newRetTblIdxKey();
		keyRetTblIdx.setOptionalRetTenantId( existing.getOptionalRetTenantId() );
		keyRetTblIdx.setOptionalRetTableId( existing.getOptionalRetTableId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamServerListFuncBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByRetTblIdx.get( keyRetTblIdx );
		subdict.remove( pkey );

		schema.getTableServerMethod().deleteServerMethod( Authorization,
			Buff );
	}
	public void deleteServerListFuncByRetTblIdx( YCFSecAuthorization Authorization,
		Long argRetTenantId,
		Long argRetTableId )
	{
		YCFBamServerListFuncByRetTblIdxKey key = schema.getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( argRetTenantId );
		key.setOptionalRetTableId( argRetTableId );
		deleteServerListFuncByRetTblIdx( Authorization, key );
	}

	public void deleteServerListFuncByRetTblIdx( YCFSecAuthorization Authorization,
		YCFBamServerListFuncByRetTblIdxKey argKey )
	{
		YCFBamServerListFuncBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalRetTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalRetTableId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void deleteServerListFuncByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName )
	{
		YCFBamServerMethodByUNameIdxKey key = schema.getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteServerListFuncByUNameIdx( Authorization, key );
	}

	public void deleteServerListFuncByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByUNameIdxKey argKey )
	{
		YCFBamServerListFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void deleteServerListFuncByMethTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamServerMethodByMethTableIdxKey key = schema.getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteServerListFuncByMethTableIdx( Authorization, key );
	}

	public void deleteServerListFuncByMethTableIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableIdxKey argKey )
	{
		YCFBamServerListFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void deleteServerListFuncByMethTableVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredCodeVis( argCodeVis );
		deleteServerListFuncByMethTableVisIdx( Authorization, key );
	}

	public void deleteServerListFuncByMethTableVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableVisIdxKey argKey )
	{
		YCFBamServerListFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void deleteServerListFuncByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteServerListFuncByMethCodeVisIdx( Authorization, key );
	}

	public void deleteServerListFuncByMethCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethCodeVisIdxKey argKey )
	{
		YCFBamServerListFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void deleteServerListFuncByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteServerListFuncByDefSchemaIdx( Authorization, key );
	}

	public void deleteServerListFuncByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByDefSchemaIdxKey argKey )
	{
		YCFBamServerListFuncBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalDefSchemaTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalDefSchemaId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void deleteServerListFuncByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteServerListFuncByIdIdx( Authorization, key );
	}

	public void deleteServerListFuncByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamServerListFuncBuff cur;
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void deleteServerListFuncByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteServerListFuncByTenantIdx( Authorization, key );
	}

	public void deleteServerListFuncByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamServerListFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerListFuncBuff> matchSet = new LinkedList<YCFBamServerListFuncBuff>();
		Iterator<YCFBamServerListFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerListFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerListFunc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
