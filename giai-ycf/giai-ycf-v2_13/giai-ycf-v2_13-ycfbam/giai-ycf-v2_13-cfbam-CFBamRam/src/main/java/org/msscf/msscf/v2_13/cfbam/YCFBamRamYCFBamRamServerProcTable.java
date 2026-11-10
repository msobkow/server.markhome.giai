
// Description: Java 11 in-memory RAM DbIO implementation for ServerProc.

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
 *	YCFBamRamServerProcTable in-memory RAM DbIO implementation
 *	for ServerProc.
 */
public class YCFBamRamServerProcTable
	implements IYCFBamServerProcTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamServerProcBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamServerProcBuff >();

	public YCFBamRamServerProcTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createServerProc( YCFSecAuthorization Authorization,
		YCFBamServerProcBuff Buff )
	{
		final String S_ProcName = "createServerProc";
		schema.getTableServerMethod().createServerMethod( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
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

	}

	public YCFBamServerProcBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerProc.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerProcBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerProcBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerProc.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerProcBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerProcBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamServerProc.readAllDerived";
		YCFBamServerProcBuff[] retList = new YCFBamServerProcBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamServerProcBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamServerProcBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerProcBuff ) ) {
					filteredList.add( (YCFBamServerProcBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
		}
	}

	public YCFBamServerProcBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
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
		else if( buff instanceof YCFBamServerProcBuff ) {
			return( (YCFBamServerProcBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerProcBuff[] readDerivedByMethTableIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerProcBuff ) ) {
					filteredList.add( (YCFBamServerProcBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
		}
	}

	public YCFBamServerProcBuff[] readDerivedByMethTableVisIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerProcBuff ) ) {
					filteredList.add( (YCFBamServerProcBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
		}
	}

	public YCFBamServerProcBuff[] readDerivedByMethCodeVisIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerProcBuff ) ) {
					filteredList.add( (YCFBamServerProcBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
		}
	}

	public YCFBamServerProcBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerProcBuff ) ) {
					filteredList.add( (YCFBamServerProcBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
		}
	}

	public YCFBamServerProcBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamServerProcBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerProcBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerProc.readBuff";
		YCFBamServerProcBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a806" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerProcBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamServerProcBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a806" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerProcBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamServerProc.readAllBuff";
		YCFBamServerProcBuff buff;
		ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
		YCFBamServerProcBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a806" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
	}

	public YCFBamServerProcBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamServerProcBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamServerProcBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerProcBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamServerProcBuff buff;
		ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
		YCFBamServerProcBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamServerProcBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
	}

	public YCFBamServerProcBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByUNameIdx() ";
		YCFBamServerProcBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
			return( (YCFBamServerProcBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerProcBuff[] readBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableIdx() ";
		YCFBamServerProcBuff buff;
		ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
		YCFBamServerProcBuff[] buffList = readDerivedByMethTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerProcBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
	}

	public YCFBamServerProcBuff[] readBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableVisIdx() ";
		YCFBamServerProcBuff buff;
		ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
		YCFBamServerProcBuff[] buffList = readDerivedByMethTableVisIdx( Authorization,
			TenantId,
			TableId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerProcBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
	}

	public YCFBamServerProcBuff[] readBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethCodeVisIdx() ";
		YCFBamServerProcBuff buff;
		ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
		YCFBamServerProcBuff[] buffList = readDerivedByMethCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerProcBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
	}

	public YCFBamServerProcBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByDefSchemaIdx() ";
		YCFBamServerProcBuff buff;
		ArrayList<YCFBamServerProcBuff> filteredList = new ArrayList<YCFBamServerProcBuff>();
		YCFBamServerProcBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerProcBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerProcBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific ServerProc buffer instances identified by the duplicate key MethTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerProcBuff[] pageBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerProc buffer instances identified by the duplicate key MethTableVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerProcBuff[] pageBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
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
	 *	Read a page array of the specific ServerProc buffer instances identified by the duplicate key MethCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerProcBuff[] pageBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerProc buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerProcBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateServerProc( YCFSecAuthorization Authorization,
		YCFBamServerProcBuff Buff )
	{
		schema.getTableServerMethod().updateServerMethod( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerProcBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateServerProc",
				"Existing record not found",
				"ServerProc",
				pkey );
		}
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
						"updateServerProc",
						"Superclass",
						"SuperClass",
						"ServerMethod",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamServerProcBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

	}

	public void deleteServerProc( YCFSecAuthorization Authorization,
		YCFBamServerProcBuff Buff )
	{
		final String S_ProcName = "YCFBamRamServerProcTable.deleteServerProc() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerProcBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteServerProc",
				pkey );
		}
					schema.getTableParam().deleteParamByServerMethodIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamServerProcBuff > subdict;

		dictByPKey.remove( pkey );

		schema.getTableServerMethod().deleteServerMethod( Authorization,
			Buff );
	}
	public void deleteServerProcByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName )
	{
		YCFBamServerMethodByUNameIdxKey key = schema.getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteServerProcByUNameIdx( Authorization, key );
	}

	public void deleteServerProcByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByUNameIdxKey argKey )
	{
		YCFBamServerProcBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerProcBuff> matchSet = new LinkedList<YCFBamServerProcBuff>();
		Iterator<YCFBamServerProcBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerProcBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerProc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerProc( Authorization, cur );
		}
	}

	public void deleteServerProcByMethTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamServerMethodByMethTableIdxKey key = schema.getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteServerProcByMethTableIdx( Authorization, key );
	}

	public void deleteServerProcByMethTableIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableIdxKey argKey )
	{
		YCFBamServerProcBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerProcBuff> matchSet = new LinkedList<YCFBamServerProcBuff>();
		Iterator<YCFBamServerProcBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerProcBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerProc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerProc( Authorization, cur );
		}
	}

	public void deleteServerProcByMethTableVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredCodeVis( argCodeVis );
		deleteServerProcByMethTableVisIdx( Authorization, key );
	}

	public void deleteServerProcByMethTableVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableVisIdxKey argKey )
	{
		YCFBamServerProcBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerProcBuff> matchSet = new LinkedList<YCFBamServerProcBuff>();
		Iterator<YCFBamServerProcBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerProcBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerProc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerProc( Authorization, cur );
		}
	}

	public void deleteServerProcByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteServerProcByMethCodeVisIdx( Authorization, key );
	}

	public void deleteServerProcByMethCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethCodeVisIdxKey argKey )
	{
		YCFBamServerProcBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerProcBuff> matchSet = new LinkedList<YCFBamServerProcBuff>();
		Iterator<YCFBamServerProcBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerProcBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerProc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerProc( Authorization, cur );
		}
	}

	public void deleteServerProcByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteServerProcByDefSchemaIdx( Authorization, key );
	}

	public void deleteServerProcByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByDefSchemaIdxKey argKey )
	{
		YCFBamServerProcBuff cur;
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
		LinkedList<YCFBamServerProcBuff> matchSet = new LinkedList<YCFBamServerProcBuff>();
		Iterator<YCFBamServerProcBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerProcBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerProc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerProc( Authorization, cur );
		}
	}

	public void deleteServerProcByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteServerProcByIdIdx( Authorization, key );
	}

	public void deleteServerProcByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamServerProcBuff cur;
		LinkedList<YCFBamServerProcBuff> matchSet = new LinkedList<YCFBamServerProcBuff>();
		Iterator<YCFBamServerProcBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerProcBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerProc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerProc( Authorization, cur );
		}
	}

	public void deleteServerProcByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteServerProcByTenantIdx( Authorization, key );
	}

	public void deleteServerProcByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamServerProcBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerProcBuff> matchSet = new LinkedList<YCFBamServerProcBuff>();
		Iterator<YCFBamServerProcBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerProcBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerProc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteServerProc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
