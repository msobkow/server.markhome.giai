// Description: Java 11 Table Object implementation for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamScopeTableObj
	implements ICFBamScopeTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamScopeObj> members;
	private Map<CFBamScopePKey, ICFBamScopeObj> allScope;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamScopeObj > > indexByTenantIdx;
	public static String TABLE_NAME = "Scope";
	public static String TABLE_DBNAME = "scopedef";

	public CFBamScopeTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamScopeObj>();
		allScope = null;
		indexByTenantIdx = null;
	}

	public CFBamScopeTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamScopeObj>();
		allScope = null;
		indexByTenantIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( null );
	}


	public void minimizeMemory() {
		allScope = null;
		indexByTenantIdx = null;
		List<ICFBamScopeObj> toForget = new LinkedList<ICFBamScopeObj>();
		ICFBamScopeObj cur = null;
		Iterator<ICFBamScopeObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamScopeObj.
	 */
	public ICFBamScopeObj newInstance() {
		ICFBamScopeObj inst = new CFBamScopeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamScopeObj.
	 */
	public ICFBamScopeEditObj newEditInstance( ICFBamScopeObj orig ) {
		ICFBamScopeEditObj edit = new CFBamScopeEditObj( orig );
		return( edit );
	}

	public ICFBamScopeObj constructByClassCode( String argClassCode ) {
		ICFBamScopeObj obj = null;
		if( argClassCode.equals( "a801" ) ) {
			obj = ((ICFBamSchemaObj)schema).getScopeTableObj().newInstance();
		}
		else if( argClassCode.equals( "a802" ) ) {
			obj = ((ICFBamSchemaObj)schema).getSchemaDefTableObj().newInstance();
		}
		else if( argClassCode.equals( "a803" ) ) {
			obj = ((ICFBamSchemaObj)schema).getSchemaRefTableObj().newInstance();
		}
		else if( argClassCode.equals( "a804" ) ) {
			obj = ((ICFBamSchemaObj)schema).getServerMethodTableObj().newInstance();
		}
		else if( argClassCode.equals( "a805" ) ) {
			obj = ((ICFBamSchemaObj)schema).getServerObjFuncTableObj().newInstance();
		}
		else if( argClassCode.equals( "a806" ) ) {
			obj = ((ICFBamSchemaObj)schema).getServerProcTableObj().newInstance();
		}
		else if( argClassCode.equals( "a83a" ) ) {
			obj = ((ICFBamSchemaObj)schema).getServerListFuncTableObj().newInstance();
		}
		else if( argClassCode.equals( "a807" ) ) {
			obj = ((ICFBamSchemaObj)schema).getTableTableObj().newInstance();
		}
		else if( argClassCode.equals( "a813" ) ) {
			obj = ((ICFBamSchemaObj)schema).getClearDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a814" ) ) {
			obj = ((ICFBamSchemaObj)schema).getClearSubDep1TableObj().newInstance();
		}
		else if( argClassCode.equals( "a815" ) ) {
			obj = ((ICFBamSchemaObj)schema).getClearSubDep2TableObj().newInstance();
		}
		else if( argClassCode.equals( "a816" ) ) {
			obj = ((ICFBamSchemaObj)schema).getClearSubDep3TableObj().newInstance();
		}
		else if( argClassCode.equals( "a817" ) ) {
			obj = ((ICFBamSchemaObj)schema).getClearTopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a81a" ) ) {
			obj = ((ICFBamSchemaObj)schema).getDelDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a81b" ) ) {
			obj = ((ICFBamSchemaObj)schema).getDelSubDep1TableObj().newInstance();
		}
		else if( argClassCode.equals( "a81c" ) ) {
			obj = ((ICFBamSchemaObj)schema).getDelSubDep2TableObj().newInstance();
		}
		else if( argClassCode.equals( "a81d" ) ) {
			obj = ((ICFBamSchemaObj)schema).getDelSubDep3TableObj().newInstance();
		}
		else if( argClassCode.equals( "a81e" ) ) {
			obj = ((ICFBamSchemaObj)schema).getDelTopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a824" ) ) {
			obj = ((ICFBamSchemaObj)schema).getIndexTableObj().newInstance();
		}
		else if( argClassCode.equals( "a833" ) ) {
			obj = ((ICFBamSchemaObj)schema).getPopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a834" ) ) {
			obj = ((ICFBamSchemaObj)schema).getPopSubDep1TableObj().newInstance();
		}
		else if( argClassCode.equals( "a835" ) ) {
			obj = ((ICFBamSchemaObj)schema).getPopSubDep2TableObj().newInstance();
		}
		else if( argClassCode.equals( "a836" ) ) {
			obj = ((ICFBamSchemaObj)schema).getPopSubDep3TableObj().newInstance();
		}
		else if( argClassCode.equals( "a837" ) ) {
			obj = ((ICFBamSchemaObj)schema).getPopTopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a838" ) ) {
			obj = ((ICFBamSchemaObj)schema).getRelationTableObj().newInstance();
		}
		return( obj );
	}

	public ICFBamScopeObj realiseScope( ICFBamScopeObj Obj ) {
		ICFBamScopeObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamScopeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamScopeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamScopeObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamScopeObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allScope != null ) {
				allScope.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allScope != null ) {
				allScope.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamScopeObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamScopeObj createScope( ICFBamScopeObj Obj ) {
		ICFBamScopeObj obj = Obj;
		CFBamScopeBuff buff = obj.getScopeBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableScope().createScope(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a801" ) ) {
			obj = (ICFBamScopeObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamScopeObj readScope( CFBamScopePKey pkey ) {
		return( readScope( pkey, false ) );
	}

	public ICFBamScopeObj readScope( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamScopeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamScopeBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamScopeObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamScopeObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamScopeObj readCachedScope( CFBamScopePKey pkey ) {
		ICFBamScopeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeScope( ICFBamScopeObj obj )
	{
		final String S_ProcName = "CFBamScopeTableObj.reallyDeepDisposeScope() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamScopeObj existing = readCachedScope( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamScopeByTenantIdxKey keyTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}


	}
	public void deepDisposeScope( CFBamScopePKey pkey ) {
		ICFBamScopeObj obj = readCachedScope( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamScopeObj lockScope( CFBamScopePKey pkey ) {
		ICFBamScopeObj locked = null;
		CFBamScopeBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableScope().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamScopeObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamScopeObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockScope", pkey );
		}
		return( locked );
	}

	public List<ICFBamScopeObj> readAllScope() {
		return( readAllScope( false ) );
	}

	public List<ICFBamScopeObj> readAllScope( boolean forceRead ) {
		final String S_ProcName = "readAllScope";
		if( ( allScope == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamScopeObj> map = new HashMap<CFBamScopePKey,ICFBamScopeObj>();
			allScope = map;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readAllDerived( schema.getAuthorization() );
			CFBamScopeBuff buff;
			ICFBamScopeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamScopeObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamScopeObj realised = (ICFBamScopeObj)obj.realise();
			}
		}
		int len = allScope.size();
		ICFBamScopeObj arr[] = new ICFBamScopeObj[len];
		Iterator<ICFBamScopeObj> valIter = allScope.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamScopeObj> arrayList = new ArrayList<ICFBamScopeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamScopeObj> cmp = new Comparator<ICFBamScopeObj>() {
			public int compare( ICFBamScopeObj lhs, ICFBamScopeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamScopeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamScopeObj> readCachedAllScope() {
		final String S_ProcName = "readCachedAllScope";
		ArrayList<ICFBamScopeObj> arrayList = new ArrayList<ICFBamScopeObj>();
		if( allScope != null ) {
			int len = allScope.size();
			ICFBamScopeObj arr[] = new ICFBamScopeObj[len];
			Iterator<ICFBamScopeObj> valIter = allScope.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFBamScopeObj> cmp = new Comparator<ICFBamScopeObj>() {
			public int compare( ICFBamScopeObj lhs, ICFBamScopeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id )
	{
		return( readScopeByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamScopeObj obj = readScope( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamScopeObj> readScopeByTenantIdx( long TenantId )
	{
		return( readScopeByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamScopeObj> readScopeByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readScopeByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamScopeObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamScopeObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamScopeObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamScopeObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamScopeObj realised = (ICFBamScopeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamScopeObj arr[] = new ICFBamScopeObj[len];
		Iterator<ICFBamScopeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamScopeObj> arrayList = new ArrayList<ICFBamScopeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamScopeObj> cmp = new Comparator<ICFBamScopeObj>() {
			public int compare( ICFBamScopeObj lhs, ICFBamScopeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamScopeObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamScopeObj readCachedScopeByIdIdx( long TenantId,
		long Id )
	{
		ICFBamScopeObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedScope( pkey );
		return( obj );
	}

	public List<ICFBamScopeObj> readCachedScopeByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedScopeByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamScopeObj> arrayList = new ArrayList<ICFBamScopeObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamScopeObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamScopeObj arr[] = new ICFBamScopeObj[len];
				Iterator<ICFBamScopeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamScopeObj obj;
			Iterator<ICFBamScopeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamScopeObj> cmp = new Comparator<ICFBamScopeObj>() {
			public int compare( ICFBamScopeObj lhs, ICFBamScopeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeScopeByIdIdx( long TenantId,
		long Id )
	{
		ICFBamScopeObj obj = readCachedScopeByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeScopeByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeScopeByTenantIdx";
		ICFBamScopeObj obj;
		List<ICFBamScopeObj> arrayList = readCachedScopeByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamScopeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamScopeObj updateScope( ICFBamScopeObj Obj ) {
		ICFBamScopeObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableScope().updateScope( schema.getAuthorization(),
			Obj.getScopeBuff() );
		if( Obj.getClassCode().equals( "a801" ) ) {
			obj = (ICFBamScopeObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteScope( ICFBamScopeObj Obj ) {
		ICFBamScopeObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableScope().deleteScope( schema.getAuthorization(),
			obj.getScopeBuff() );
		Obj.forget();
	}

	public void deleteScopeByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamScopeObj obj = readScope( pkey );
		if( obj != null ) {
			ICFBamScopeEditObj editObj = (ICFBamScopeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamScopeEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeScopeByIdIdx( TenantId,
				Id );
	}

	public void deleteScopeByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamScopeObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamScopeObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableScope().deleteScopeByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamScopeObj> iter = dict.values().iterator();
			ICFBamScopeObj obj;
			List<ICFBamScopeObj> toForget = new LinkedList<ICFBamScopeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableScope().deleteScopeByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeScopeByTenantIdx( TenantId );
	}
}