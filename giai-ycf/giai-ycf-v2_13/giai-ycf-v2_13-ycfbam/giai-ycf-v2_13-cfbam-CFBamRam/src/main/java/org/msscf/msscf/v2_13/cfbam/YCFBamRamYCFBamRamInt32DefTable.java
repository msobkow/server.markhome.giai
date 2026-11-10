
// Description: Java 11 in-memory RAM DbIO implementation for Int32Def.

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
 *	YCFBamRamInt32DefTable in-memory RAM DbIO implementation
 *	for Int32Def.
 */
public class YCFBamRamInt32DefTable
	implements IYCFBamInt32DefTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamValuePKey,
				YCFBamInt32DefBuff > dictByPKey
		= new HashMap< YCFBamValuePKey,
				YCFBamInt32DefBuff >();

	public YCFBamRamInt32DefTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createInt32Def( YCFSecAuthorization Authorization,
		YCFBamInt32DefBuff Buff )
	{
		final String S_ProcName = "createInt32Def";
		schema.getTableAtom().createAtom( Authorization,
			Buff );
		YCFBamValuePKey pkey = schema.getFactoryValue().newPKey();
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
				if( null == schema.getTableAtom().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"Atom",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

	}

	public YCFBamInt32DefBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "YCFBamRamInt32Def.readDerived";
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamInt32DefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamInt32DefBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "YCFBamRamInt32Def.readDerived";
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamInt32DefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamInt32DefBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamInt32Def.readAllDerived";
		YCFBamInt32DefBuff[] retList = new YCFBamInt32DefBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamInt32DefBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamInt32DefBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByUNameIdx";
		YCFBamValueBuff buff = schema.getTableValue().readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamInt32DefBuff ) {
			return( (YCFBamInt32DefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByValTentIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByValTentIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByScopeIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByDefSchemaIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByPrevIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByNextIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByContPrevIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByContPrevIdx( Authorization,
			TenantId,
			ScopeId,
			PrevId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByContNextIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByContNextIdx( Authorization,
			TenantId,
			ScopeId,
			NextId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByCodeVisIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByCodeVisIdx( Authorization,
			CodeVis );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff[] readDerivedByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByScopeCodeVisIdx";
		YCFBamValueBuff buffList[] = schema.getTableValue().readDerivedByScopeCodeVisIdx( Authorization,
			TenantId,
			ScopeId,
			CodeVis );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamValueBuff buff;
			ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamInt32DefBuff ) ) {
					filteredList.add( (YCFBamInt32DefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
		}
	}

	public YCFBamInt32DefBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByIdIdx() ";
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamInt32DefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamInt32DefBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "YCFBamRamInt32Def.readBuff";
		YCFBamInt32DefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a828" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamInt32DefBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamInt32DefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a828" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamInt32DefBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamInt32Def.readAllBuff";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a828" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByIdIdx() ";
		YCFBamInt32DefBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
			return( (YCFBamInt32DefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamInt32DefBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByUNameIdx() ";
		YCFBamInt32DefBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
			return( (YCFBamInt32DefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamInt32DefBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByValTentIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByValTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByScopeIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByDefSchemaIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByPrevIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByNextIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByContPrevIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByContPrevIdx( Authorization,
			TenantId,
			ScopeId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByContNextIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByContNextIdx( Authorization,
			TenantId,
			ScopeId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByCodeVisIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	public YCFBamInt32DefBuff[] readBuffByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByScopeCodeVisIdx() ";
		YCFBamInt32DefBuff buff;
		ArrayList<YCFBamInt32DefBuff> filteredList = new ArrayList<YCFBamInt32DefBuff>();
		YCFBamInt32DefBuff[] buffList = readDerivedByScopeCodeVisIdx( Authorization,
			TenantId,
			ScopeId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamInt32DefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamInt32DefBuff[0] ) );
	}

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamInt32DefBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamValueBuff grandprev = null;
		YCFBamValueBuff prev = null;
		YCFBamValueBuff cur = null;
		YCFBamValueBuff next = null;

		cur = schema.getTableValue().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamInt32DefBuff)cur );
		}

		prev = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableValue().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamValueBuff newInstance;
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamValueBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamValueBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext = newInstance;
			editNext.set( next );
		}

		if( editGrandprev != null ) {
			editGrandprev.setOptionalNextTenantId( cur.getRequiredTenantId() );
			editGrandprev.setOptionalNextId( cur.getRequiredId() );
			editCur.setOptionalPrevTenantId( grandprev.getRequiredTenantId() );
			editCur.setOptionalPrevId( grandprev.getRequiredId() );
		}
		else {
			editCur.setOptionalPrevTenantId( null );
			editCur.setOptionalPrevId( null );
		}

			editPrev.setOptionalPrevTenantId( cur.getRequiredTenantId() );
			editPrev.setOptionalPrevId( cur.getRequiredId() );

			editCur.setOptionalNextTenantId( prev.getRequiredTenantId() );
			editCur.setOptionalNextId( prev.getRequiredId() );

		if( next != null ) {
			editPrev.setOptionalNextTenantId( next.getRequiredTenantId() );
			editPrev.setOptionalNextId( next.getRequiredId() );
			editNext.setOptionalPrevTenantId( prev.getRequiredTenantId() );
			editNext.setOptionalPrevId( prev.getRequiredId() );
		}
		else {
			editPrev.setOptionalNextTenantId( null );
			editPrev.setOptionalNextId( null );
		}

		if( editGrandprev != null ) {
			classCode = editGrandprev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editGrandprev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editGrandprev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editGrandprev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editGrandprev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editGrandprev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editGrandprev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editGrandprev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editGrandprev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editGrandprev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editGrandprev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editGrandprev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editGrandprev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editGrandprev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editGrandprev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editGrandprev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editGrandprev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editGrandprev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editGrandprev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editGrandprev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editGrandprev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editPrev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editPrev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editPrev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editPrev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editPrev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editPrev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editPrev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editPrev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editPrev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editPrev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editPrev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editPrev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editPrev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editPrev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editPrev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editPrev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editPrev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editPrev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editPrev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editPrev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editPrev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editPrev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editPrev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editPrev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editPrev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editPrev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editPrev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editPrev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editPrev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editPrev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editPrev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editPrev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editPrev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editPrev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editPrev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editPrev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editPrev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editPrev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editPrev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editPrev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editPrev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editPrev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editPrev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editPrev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editPrev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editPrev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editPrev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editPrev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editPrev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editPrev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editPrev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editPrev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editPrev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editPrev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editPrev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editPrev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editPrev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editPrev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editCur );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editCur );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editCur );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editCur );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editCur );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editCur );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editCur );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editCur );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editCur );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editCur );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editCur );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editCur );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editCur );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editCur );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editCur );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editCur );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editCur );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editCur );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editCur );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editCur );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editCur );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editCur );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editCur );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editCur );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editCur );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editCur );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editCur );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editCur );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editCur );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editCur );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editCur );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editCur );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editCur );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editCur );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editCur );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editCur );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editCur );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editCur );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editCur );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editCur );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editCur );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editCur );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editCur );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editCur );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editCur );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editCur );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editCur );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editCur );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editCur );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editCur );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editCur );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editCur );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editCur );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editCur );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editCur );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editCur );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editCur );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editCur );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editCur );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editCur );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editCur );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editCur );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editCur );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editCur );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editCur );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editCur );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editCur );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editCur );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editCur );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editCur );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editCur );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editNext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editNext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editNext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editNext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editNext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editNext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editNext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editNext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editNext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editNext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editNext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editNext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editNext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editNext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editNext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editNext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editNext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editNext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editNext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editNext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editNext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editNext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editNext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editNext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editNext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editNext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editNext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editNext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editNext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editNext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editNext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editNext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editNext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editNext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editNext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editNext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editNext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editNext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editNext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editNext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editNext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editNext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editNext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editNext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editNext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editNext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editNext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editNext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editNext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editNext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editNext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editNext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editNext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editNext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editNext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editNext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editNext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editNext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editNext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editNext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editNext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editNext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editNext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editNext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editNext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editNext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editNext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editNext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editNext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editNext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editNext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamInt32DefBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamInt32DefBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamValueBuff prev = null;
		YCFBamValueBuff cur = null;
		YCFBamValueBuff next = null;
		YCFBamValueBuff grandnext = null;

		cur = schema.getTableValue().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamInt32DefBuff)cur );
		}

		next = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableValue().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamValueBuff newInstance;
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editNext = newInstance;
		editNext.set( next );

		YCFBamValueBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamValueBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev = newInstance;
			editPrev.set( prev );
		}

		if( prev != null ) {
			editPrev.setOptionalNextTenantId( next.getRequiredTenantId() );
			editPrev.setOptionalNextId( next.getRequiredId() );
			editNext.setOptionalPrevTenantId( prev.getRequiredTenantId() );
			editNext.setOptionalPrevId( prev.getRequiredId() );
		}
		else {
			editNext.setOptionalPrevTenantId( null );
			editNext.setOptionalPrevId( null );
		}

			editCur.setOptionalPrevTenantId( next.getRequiredTenantId() );
			editCur.setOptionalPrevId( next.getRequiredId() );

			editNext.setOptionalNextTenantId( cur.getRequiredTenantId() );
			editNext.setOptionalNextId( cur.getRequiredId() );

		if( editGrandnext != null ) {
			editCur.setOptionalNextTenantId( grandnext.getRequiredTenantId() );
			editCur.setOptionalNextId( grandnext.getRequiredId() );
			editGrandnext.setOptionalPrevTenantId( cur.getRequiredTenantId() );
			editGrandnext.setOptionalPrevId( cur.getRequiredId() );
		}
		else {
			editCur.setOptionalNextTenantId( null );
			editCur.setOptionalNextId( null );
		}

		if( editPrev != null ) {
			classCode = editPrev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editPrev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editPrev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editPrev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editPrev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editPrev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editPrev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editPrev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editPrev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editPrev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editPrev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editPrev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editPrev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editPrev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editPrev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editPrev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editPrev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editPrev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editPrev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editPrev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editPrev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editPrev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editPrev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editPrev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editPrev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editPrev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editPrev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editPrev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editPrev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editPrev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editPrev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editPrev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editPrev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editPrev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editPrev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editPrev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editPrev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editPrev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editPrev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editPrev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editPrev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editPrev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editPrev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editPrev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editPrev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editPrev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editPrev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editPrev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editPrev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editPrev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editPrev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editPrev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editPrev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editPrev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editPrev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editPrev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editPrev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editPrev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editPrev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editCur );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editCur );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editCur );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editCur );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editCur );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editCur );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editCur );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editCur );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editCur );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editCur );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editCur );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editCur );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editCur );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editCur );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editCur );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editCur );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editCur );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editCur );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editCur );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editCur );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editCur );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editCur );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editCur );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editCur );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editCur );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editCur );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editCur );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editCur );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editCur );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editCur );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editCur );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editCur );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editCur );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editCur );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editCur );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editCur );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editCur );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editCur );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editCur );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editCur );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editCur );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editCur );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editCur );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editCur );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editCur );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editCur );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editCur );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editCur );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editCur );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editCur );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editCur );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editCur );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editCur );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editCur );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editCur );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editCur );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editCur );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editCur );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editCur );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editCur );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editCur );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editCur );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editCur );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editCur );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editCur );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editCur );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editCur );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editCur );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editCur );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editCur );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editCur );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editNext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editNext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editNext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editNext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editNext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editNext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editNext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editNext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editNext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editNext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editNext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editNext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editNext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editNext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editNext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editNext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editNext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editNext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editNext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editNext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editNext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editNext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editNext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editNext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editNext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editNext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editNext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editNext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editNext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editNext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editNext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editNext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editNext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editNext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editNext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editNext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editNext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editNext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editNext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editNext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editNext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editNext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editNext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editNext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editNext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editNext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editNext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editNext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editNext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editNext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editNext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editNext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editNext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editNext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editNext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editNext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editNext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editNext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editNext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editNext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editNext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editNext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editNext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editNext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editNext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editNext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editNext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editNext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editNext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editNext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editNext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editGrandnext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editGrandnext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editGrandnext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editGrandnext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editGrandnext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editGrandnext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editGrandnext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editGrandnext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editGrandnext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editGrandnext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editGrandnext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editGrandnext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editGrandnext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editGrandnext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editGrandnext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editGrandnext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editGrandnext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editGrandnext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editGrandnext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editGrandnext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamInt32DefBuff)editCur );
	}

	public void updateInt32Def( YCFSecAuthorization Authorization,
		YCFBamInt32DefBuff Buff )
	{
		schema.getTableAtom().updateAtom( Authorization,
			Buff );
		YCFBamValuePKey pkey = schema.getFactoryValue().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamInt32DefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateInt32Def",
				"Existing record not found",
				"Int32Def",
				pkey );
		}
		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableAtom().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateInt32Def",
						"Superclass",
						"SuperClass",
						"Atom",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamValuePKey, YCFBamInt32DefBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

	}

	public void deleteInt32Def( YCFSecAuthorization Authorization,
		YCFBamInt32DefBuff Buff )
	{
		final String S_ProcName = "YCFBamRamInt32DefTable.deleteInt32Def() ";
		String classCode;
		YCFBamValuePKey pkey = schema.getFactoryValue().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamInt32DefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteInt32Def",
				pkey );
		}
		long varTenantId = existing.getRequiredTenantId();
		long varScopeId = existing.getRequiredScopeId();
		YCFBamScopeBuff container = schema.getTableScope().readDerivedByIdIdx( Authorization,
			varTenantId,
			varScopeId );
		if( container == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"container" );
		}

		Long prevTenantId = existing.getOptionalPrevTenantId();
		Long prevId = existing.getOptionalPrevId();
		Long nextTenantId = existing.getOptionalNextTenantId();
		Long nextId = existing.getOptionalNextId();

		YCFBamValueBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableValue().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamValueBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				editPrev = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				editPrev = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				editPrev = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				editPrev = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				editPrev = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				editPrev = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				editPrev = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				editPrev = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				editPrev = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				editPrev = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				editPrev = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				editPrev = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				editPrev = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				editPrev = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				editPrev = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				editPrev = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				editPrev = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				editPrev = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				editPrev = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				editPrev = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				editPrev = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				editPrev = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				editPrev = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				editPrev = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				editPrev = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				editPrev = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				editPrev = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				editPrev = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				editPrev = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				editPrev = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				editPrev = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				editPrev = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				editPrev = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				editPrev = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				editPrev = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				editPrev = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				editPrev = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				editPrev = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				editPrev = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				editPrev = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				editPrev = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				editPrev = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				editPrev = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				editPrev = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				editPrev = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				editPrev = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				editPrev = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				editPrev = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				editPrev = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				editPrev = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				editPrev = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				editPrev = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				editPrev = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				editPrev = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				editPrev = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				editPrev = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				editPrev = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				editPrev = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				editPrev = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				editPrev = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				editPrev = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				editPrev = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				editPrev = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				editPrev = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				editPrev = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				editPrev = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				editPrev = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				editPrev = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				editPrev = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				editPrev = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				editPrev = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				editPrev = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				editPrev = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				editPrev = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				editPrev = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				editPrev = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				editPrev = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				editPrev = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				editPrev = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				editPrev = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				editPrev = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				editPrev = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editPrev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editPrev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editPrev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editPrev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editPrev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editPrev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editPrev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editPrev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editPrev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editPrev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editPrev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editPrev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editPrev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editPrev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editPrev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editPrev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editPrev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editPrev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editPrev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editPrev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editPrev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editPrev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editPrev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editPrev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editPrev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editPrev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editPrev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editPrev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editPrev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editPrev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editPrev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editPrev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editPrev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editPrev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editPrev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editPrev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editPrev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editPrev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editPrev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editPrev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editPrev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editPrev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editPrev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editPrev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editPrev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editPrev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editPrev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editPrev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editPrev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editPrev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editPrev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editPrev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editPrev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editPrev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editPrev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editPrev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editPrev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editPrev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamValueBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableValue().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamValueBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				editNext = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				editNext = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				editNext = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				editNext = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				editNext = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				editNext = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				editNext = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				editNext = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				editNext = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				editNext = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				editNext = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				editNext = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				editNext = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				editNext = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				editNext = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				editNext = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				editNext = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				editNext = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				editNext = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				editNext = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				editNext = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				editNext = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				editNext = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				editNext = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				editNext = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				editNext = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				editNext = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				editNext = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				editNext = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				editNext = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				editNext = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				editNext = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				editNext = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				editNext = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				editNext = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				editNext = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				editNext = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				editNext = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				editNext = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				editNext = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				editNext = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				editNext = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				editNext = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				editNext = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				editNext = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				editNext = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				editNext = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				editNext = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				editNext = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				editNext = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				editNext = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				editNext = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				editNext = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				editNext = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				editNext = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				editNext = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				editNext = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				editNext = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				editNext = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				editNext = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				editNext = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				editNext = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				editNext = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				editNext = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				editNext = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				editNext = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				editNext = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				editNext = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				editNext = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				editNext = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				editNext = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				editNext = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				editNext = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				editNext = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				editNext = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				editNext = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				editNext = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				editNext = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				editNext = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				editNext = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				editNext = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				editNext = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				editNext = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				editNext = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				editNext = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				editNext = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				editNext = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				editNext = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				editNext = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				editNext = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				editNext = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				editNext = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				editNext = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				editNext = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				editNext = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				editNext = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				editNext = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				editNext = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				editNext = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				editNext = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				editNext = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				editNext = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				editNext = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				editNext = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				editNext = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				editNext = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editNext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editNext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editNext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editNext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editNext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editNext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editNext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editNext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editNext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editNext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editNext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editNext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editNext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editNext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editNext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editNext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editNext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editNext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editNext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editNext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editNext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editNext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editNext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editNext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editNext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editNext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editNext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editNext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editNext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editNext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editNext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editNext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editNext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editNext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editNext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editNext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editNext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editNext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editNext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editNext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editNext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editNext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editNext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editNext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editNext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editNext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editNext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editNext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editNext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editNext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editNext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editNext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editNext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editNext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editNext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editNext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editNext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editNext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editNext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editNext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editNext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editNext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editNext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editNext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editNext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editNext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editNext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editNext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editNext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editNext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editNext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckReferencingTableCols[] = schema.getTableTableCol().readDerivedByDataIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckReferencingTableCols.length > 0 ) {
			schema.getTableTableCol().deleteTableColByDataIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckReferencingIndexCols[] = schema.getTableIndexCol().readDerivedByColIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckReferencingIndexCols.length > 0 ) {
			schema.getTableIndexCol().deleteIndexColByColIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		// Validate reverse foreign keys

		if( schema.getTableInt32Type().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteInt32Def",
				"Superclass",
				"SuperClass",
				"Int32Type",
				pkey );
		}

		if( schema.getTableInt32Col().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteInt32Def",
				"Superclass",
				"SuperClass",
				"Int32Col",
				pkey );
		}

		// Delete is valid
		Map< YCFBamValuePKey, YCFBamInt32DefBuff > subdict;

		dictByPKey.remove( pkey );

		schema.getTableAtom().deleteAtom( Authorization,
			Buff );
	}
	public void deleteInt32DefByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteInt32DefByIdIdx( Authorization, key );
	}

	public void deleteInt32DefByIdIdx( YCFSecAuthorization Authorization,
		YCFBamValuePKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamInt32DefBuff cur;
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamValueByUNameIdxKey key = schema.getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteInt32DefByUNameIdx( Authorization, key );
	}

	public void deleteInt32DefByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamValueByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByUNameIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamValueByValTentIdxKey key = schema.getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteInt32DefByValTentIdx( Authorization, key );
	}

	public void deleteInt32DefByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamValueByValTentIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByValTentIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamValueByScopeIdxKey key = schema.getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteInt32DefByScopeIdx( Authorization, key );
	}

	public void deleteInt32DefByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByScopeIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamValueByDefSchemaIdxKey key = schema.getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteInt32DefByDefSchemaIdx( Authorization, key );
	}

	public void deleteInt32DefByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamValueByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByDefSchemaIdx";
		YCFBamInt32DefBuff cur;
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
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamValueByPrevIdxKey key = schema.getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteInt32DefByPrevIdx( Authorization, key );
	}

	public void deleteInt32DefByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByPrevIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalPrevTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamValueByNextIdxKey key = schema.getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteInt32DefByNextIdx( Authorization, key );
	}

	public void deleteInt32DefByNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByNextIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByNextIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalNextTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argPrevId )
	{
		YCFBamValueByContPrevIdxKey key = schema.getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setOptionalPrevId( argPrevId );
		deleteInt32DefByContPrevIdx( Authorization, key );
	}

	public void deleteInt32DefByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByContPrevIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argNextId )
	{
		YCFBamValueByContNextIdxKey key = schema.getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setOptionalNextId( argNextId );
		deleteInt32DefByContNextIdx( Authorization, key );
	}

	public void deleteInt32DefByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContNextIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByContNextIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamValueByCodeVisIdxKey key = schema.getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteInt32DefByCodeVisIdx( Authorization, key );
	}

	public void deleteInt32DefByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByCodeVisIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByCodeVisIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteInt32DefByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamValueByScopeCodeVisIdxKey key = schema.getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredCodeVis( argCodeVis );
		deleteInt32DefByScopeCodeVisIdx( Authorization, key );
	}

	public void deleteInt32DefByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeCodeVisIdxKey argKey )
	{
		final String S_ProcName = "deleteInt32DefByScopeCodeVisIdx";
		YCFBamInt32DefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamInt32DefBuff> matchSet = new LinkedList<YCFBamInt32DefBuff>();
		Iterator<YCFBamInt32DefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamInt32DefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableInt32Def().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Int32Def must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
