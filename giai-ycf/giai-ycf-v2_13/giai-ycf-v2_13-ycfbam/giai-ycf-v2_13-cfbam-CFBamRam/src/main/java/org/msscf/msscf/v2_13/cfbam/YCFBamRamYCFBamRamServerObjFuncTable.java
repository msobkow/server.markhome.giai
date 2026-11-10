
// Description: Java 11 in-memory RAM DbIO implementation for ServerObjFunc.

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
 *	YCFBamRamServerObjFuncTable in-memory RAM DbIO implementation
 *	for ServerObjFunc.
 */
public class YCFBamRamServerObjFuncTable
	implements IYCFBamServerObjFuncTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamServerObjFuncBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamServerObjFuncBuff >();
	private Map< YCFBamServerObjFuncByRetTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerObjFuncBuff >> dictByRetTblIdx
		= new HashMap< YCFBamServerObjFuncByRetTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerObjFuncBuff >>();

	public YCFBamRamServerObjFuncTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createServerObjFunc( YCFSecAuthorization Authorization,
		YCFBamServerObjFuncBuff Buff )
	{
		final String S_ProcName = "createServerObjFunc";
		schema.getTableServerMethod().createServerMethod( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerObjFuncByRetTblIdxKey keyRetTblIdx = schema.getFactoryServerObjFunc().newRetTblIdxKey();
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

		Map< YCFBamScopePKey, YCFBamServerObjFuncBuff > subdictRetTblIdx;
		if( dictByRetTblIdx.containsKey( keyRetTblIdx ) ) {
			subdictRetTblIdx = dictByRetTblIdx.get( keyRetTblIdx );
		}
		else {
			subdictRetTblIdx = new HashMap< YCFBamScopePKey, YCFBamServerObjFuncBuff >();
			dictByRetTblIdx.put( keyRetTblIdx, subdictRetTblIdx );
		}
		subdictRetTblIdx.put( pkey, Buff );

	}

	public YCFBamServerObjFuncBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerObjFunc.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerObjFuncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerObjFuncBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerObjFunc.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerObjFuncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerObjFuncBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamServerObjFunc.readAllDerived";
		YCFBamServerObjFuncBuff[] retList = new YCFBamServerObjFuncBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamServerObjFuncBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamServerObjFuncBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerObjFuncBuff ) ) {
					filteredList.add( (YCFBamServerObjFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
		}
	}

	public YCFBamServerObjFuncBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
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
		else if( buff instanceof YCFBamServerObjFuncBuff ) {
			return( (YCFBamServerObjFuncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerObjFuncBuff[] readDerivedByMethTableIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerObjFuncBuff ) ) {
					filteredList.add( (YCFBamServerObjFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
		}
	}

	public YCFBamServerObjFuncBuff[] readDerivedByMethTableVisIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerObjFuncBuff ) ) {
					filteredList.add( (YCFBamServerObjFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
		}
	}

	public YCFBamServerObjFuncBuff[] readDerivedByMethCodeVisIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerObjFuncBuff ) ) {
					filteredList.add( (YCFBamServerObjFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
		}
	}

	public YCFBamServerObjFuncBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerObjFuncBuff ) ) {
					filteredList.add( (YCFBamServerObjFuncBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
		}
	}

	public YCFBamServerObjFuncBuff[] readDerivedByRetTblIdx( YCFSecAuthorization Authorization,
		Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "YCFBamRamServerObjFunc.readDerivedByRetTblIdx";
		YCFBamServerObjFuncByRetTblIdxKey key = schema.getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );

		YCFBamServerObjFuncBuff[] recArray;
		if( dictByRetTblIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamServerObjFuncBuff > subdictRetTblIdx
				= dictByRetTblIdx.get( key );
			recArray = new YCFBamServerObjFuncBuff[ subdictRetTblIdx.size() ];
			Iterator< YCFBamServerObjFuncBuff > iter = subdictRetTblIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamServerObjFuncBuff > subdictRetTblIdx
				= new HashMap< YCFBamScopePKey, YCFBamServerObjFuncBuff >();
			dictByRetTblIdx.put( key, subdictRetTblIdx );
			recArray = new YCFBamServerObjFuncBuff[0];
		}
		return( recArray );
	}

	public YCFBamServerObjFuncBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamServerObjFuncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerObjFuncBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerObjFunc.readBuff";
		YCFBamServerObjFuncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a805" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerObjFuncBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamServerObjFuncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a805" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerObjFuncBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamServerObjFunc.readAllBuff";
		YCFBamServerObjFuncBuff buff;
		ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
		YCFBamServerObjFuncBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a805" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
	}

	public YCFBamServerObjFuncBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamServerObjFuncBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamServerObjFuncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerObjFuncBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamServerObjFuncBuff buff;
		ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
		YCFBamServerObjFuncBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamServerObjFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
	}

	public YCFBamServerObjFuncBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByUNameIdx() ";
		YCFBamServerObjFuncBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
			return( (YCFBamServerObjFuncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerObjFuncBuff[] readBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableIdx() ";
		YCFBamServerObjFuncBuff buff;
		ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
		YCFBamServerObjFuncBuff[] buffList = readDerivedByMethTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerObjFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
	}

	public YCFBamServerObjFuncBuff[] readBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableVisIdx() ";
		YCFBamServerObjFuncBuff buff;
		ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
		YCFBamServerObjFuncBuff[] buffList = readDerivedByMethTableVisIdx( Authorization,
			TenantId,
			TableId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerObjFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
	}

	public YCFBamServerObjFuncBuff[] readBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethCodeVisIdx() ";
		YCFBamServerObjFuncBuff buff;
		ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
		YCFBamServerObjFuncBuff[] buffList = readDerivedByMethCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerObjFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
	}

	public YCFBamServerObjFuncBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByDefSchemaIdx() ";
		YCFBamServerObjFuncBuff buff;
		ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
		YCFBamServerObjFuncBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerObjFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
	}

	public YCFBamServerObjFuncBuff[] readBuffByRetTblIdx( YCFSecAuthorization Authorization,
		Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "YCFBamRamServerObjFunc.readBuffByRetTblIdx() ";
		YCFBamServerObjFuncBuff buff;
		ArrayList<YCFBamServerObjFuncBuff> filteredList = new ArrayList<YCFBamServerObjFuncBuff>();
		YCFBamServerObjFuncBuff[] buffList = readDerivedByRetTblIdx( Authorization,
			RetTenantId,
			RetTableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a805" ) ) {
				filteredList.add( (YCFBamServerObjFuncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerObjFuncBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific ServerObjFunc buffer instances identified by the duplicate key MethTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerObjFuncBuff[] pageBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerObjFunc buffer instances identified by the duplicate key MethTableVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerObjFuncBuff[] pageBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
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
	 *	Read a page array of the specific ServerObjFunc buffer instances identified by the duplicate key MethCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerObjFuncBuff[] pageBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerObjFunc buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerObjFuncBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerObjFunc buffer instances identified by the duplicate key RetTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRetTenantId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	argRetTableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerObjFuncBuff[] pageBuffByRetTblIdx( YCFSecAuthorization Authorization,
		Long RetTenantId,
		Long RetTableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRetTblIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateServerObjFunc( YCFSecAuthorization Authorization,
		YCFBamServerObjFuncBuff Buff )
	{
		schema.getTableServerMethod().updateServerMethod( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerObjFuncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateServerObjFunc",
				"Existing record not found",
				"ServerObjFunc",
				pkey );
		}
		YCFBamServerObjFuncByRetTblIdxKey existingKeyRetTblIdx = schema.getFactoryServerObjFunc().newRetTblIdxKey();
		existingKeyRetTblIdx.setOptionalRetTenantId( existing.getOptionalRetTenantId() );
		existingKeyRetTblIdx.setOptionalRetTableId( existing.getOptionalRetTableId() );

		YCFBamServerObjFuncByRetTblIdxKey newKeyRetTblIdx = schema.getFactoryServerObjFunc().newRetTblIdxKey();
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
						"updateServerObjFunc",
						"Superclass",
						"SuperClass",
						"ServerMethod",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamServerObjFuncBuff > subdict;

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
			subdict = new HashMap< YCFBamScopePKey, YCFBamServerObjFuncBuff >();
			dictByRetTblIdx.put( newKeyRetTblIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteServerObjFunc( YCFSecAuthorization Authorization,
		YCFBamServerObjFuncBuff Buff )
	{
		final String S_ProcName = "YCFBamRamServerObjFuncTable.deleteServerObjFunc() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerObjFuncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteServerObjFunc",
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
		YCFBamServerObjFuncByRetTblIdxKey keyRetTblIdx = schema.getFactoryServerObjFunc().newRetTblIdxKey();
		keyRetTblIdx.setOptionalRetTenantId( existing.getOptionalRetTenantId() );
		keyRetTblIdx.setOptionalRetTableId( existing.getOptionalRetTableId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamServerObjFuncBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByRetTblIdx.get( keyRetTblIdx );
		subdict.remove( pkey );

		schema.getTableServerMethod().deleteServerMethod( Authorization,
			Buff );
	}
	public void deleteServerObjFuncByRetTblIdx( YCFSecAuthorization Authorization,
		Long argRetTenantId,
		Long argRetTableId )
	{
		YCFBamServerObjFuncByRetTblIdxKey key = schema.getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( argRetTenantId );
		key.setOptionalRetTableId( argRetTableId );
		deleteServerObjFuncByRetTblIdx( Authorization, key );
	}

	public void deleteServerObjFuncByRetTblIdx( YCFSecAuthorization Authorization,
		YCFBamServerObjFuncByRetTblIdxKey argKey )
	{
		YCFBamServerObjFuncBuff cur;
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
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void deleteServerObjFuncByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName )
	{
		YCFBamServerMethodByUNameIdxKey key = schema.getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteServerObjFuncByUNameIdx( Authorization, key );
	}

	public void deleteServerObjFuncByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByUNameIdxKey argKey )
	{
		YCFBamServerObjFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void deleteServerObjFuncByMethTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamServerMethodByMethTableIdxKey key = schema.getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteServerObjFuncByMethTableIdx( Authorization, key );
	}

	public void deleteServerObjFuncByMethTableIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableIdxKey argKey )
	{
		YCFBamServerObjFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void deleteServerObjFuncByMethTableVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredCodeVis( argCodeVis );
		deleteServerObjFuncByMethTableVisIdx( Authorization, key );
	}

	public void deleteServerObjFuncByMethTableVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableVisIdxKey argKey )
	{
		YCFBamServerObjFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void deleteServerObjFuncByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteServerObjFuncByMethCodeVisIdx( Authorization, key );
	}

	public void deleteServerObjFuncByMethCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethCodeVisIdxKey argKey )
	{
		YCFBamServerObjFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void deleteServerObjFuncByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteServerObjFuncByDefSchemaIdx( Authorization, key );
	}

	public void deleteServerObjFuncByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByDefSchemaIdxKey argKey )
	{
		YCFBamServerObjFuncBuff cur;
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
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void deleteServerObjFuncByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteServerObjFuncByIdIdx( Authorization, key );
	}

	public void deleteServerObjFuncByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamServerObjFuncBuff cur;
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void deleteServerObjFuncByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteServerObjFuncByTenantIdx( Authorization, key );
	}

	public void deleteServerObjFuncByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamServerObjFuncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerObjFuncBuff> matchSet = new LinkedList<YCFBamServerObjFuncBuff>();
		Iterator<YCFBamServerObjFuncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerObjFuncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerObjFunc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
