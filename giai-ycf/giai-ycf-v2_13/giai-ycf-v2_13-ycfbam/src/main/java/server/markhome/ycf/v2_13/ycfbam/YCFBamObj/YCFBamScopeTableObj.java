// Description: Java 11 Table Object implementation for YCFBam.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamScopeTableObj
	implements IYCFBamScopeTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamScopeObj> members;
	private Map<YCFBamScopePKey, IYCFBamScopeObj> allScope;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamScopeObj > > indexByTenantIdx;
	public static String TABLE_NAME = "Scope";
	public static String TABLE_DBNAME = "scopedef";

	public YCFBamScopeTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamScopeObj>();
		allScope = null;
		indexByTenantIdx = null;
	}

	public YCFBamScopeTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamScopeObj>();
		allScope = null;
		indexByTenantIdx = null;
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
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
		List<IYCFBamScopeObj> toForget = new LinkedList<IYCFBamScopeObj>();
		IYCFBamScopeObj cur = null;
		Iterator<IYCFBamScopeObj> iter = members.values().iterator();
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
	 *	YCFBamScopeObj.
	 */
	public IYCFBamScopeObj newInstance() {
		IYCFBamScopeObj inst = new YCFBamScopeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamScopeObj.
	 */
	public IYCFBamScopeEditObj newEditInstance( IYCFBamScopeObj orig ) {
		IYCFBamScopeEditObj edit = new YCFBamScopeEditObj( orig );
		return( edit );
	}

	public IYCFBamScopeObj constructByClassCode( String argClassCode ) {
		IYCFBamScopeObj obj = null;
		if( argClassCode.equals( "a801" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getScopeTableObj().newInstance();
		}
		else if( argClassCode.equals( "a802" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().newInstance();
		}
		else if( argClassCode.equals( "a803" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getSchemaRefTableObj().newInstance();
		}
		else if( argClassCode.equals( "a804" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getServerMethodTableObj().newInstance();
		}
		else if( argClassCode.equals( "a805" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getServerObjFuncTableObj().newInstance();
		}
		else if( argClassCode.equals( "a806" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getServerProcTableObj().newInstance();
		}
		else if( argClassCode.equals( "a83a" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getServerListFuncTableObj().newInstance();
		}
		else if( argClassCode.equals( "a807" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getTableTableObj().newInstance();
		}
		else if( argClassCode.equals( "a813" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getClearDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a814" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getClearSubDep1TableObj().newInstance();
		}
		else if( argClassCode.equals( "a815" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getClearSubDep2TableObj().newInstance();
		}
		else if( argClassCode.equals( "a816" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getClearSubDep3TableObj().newInstance();
		}
		else if( argClassCode.equals( "a817" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a81a" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getDelDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a81b" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getDelSubDep1TableObj().newInstance();
		}
		else if( argClassCode.equals( "a81c" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getDelSubDep2TableObj().newInstance();
		}
		else if( argClassCode.equals( "a81d" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getDelSubDep3TableObj().newInstance();
		}
		else if( argClassCode.equals( "a81e" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getDelTopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a824" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getIndexTableObj().newInstance();
		}
		else if( argClassCode.equals( "a833" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getPopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a834" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getPopSubDep1TableObj().newInstance();
		}
		else if( argClassCode.equals( "a835" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getPopSubDep2TableObj().newInstance();
		}
		else if( argClassCode.equals( "a836" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getPopSubDep3TableObj().newInstance();
		}
		else if( argClassCode.equals( "a837" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getPopTopDepTableObj().newInstance();
		}
		else if( argClassCode.equals( "a838" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getRelationTableObj().newInstance();
		}
		return( obj );
	}

	public IYCFBamScopeObj realiseScope( IYCFBamScopeObj Obj ) {
		IYCFBamScopeObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamScopeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamScopeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamScopeObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamScopeObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamScopeObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamScopeObj createScope( IYCFBamScopeObj Obj ) {
		IYCFBamScopeObj obj = Obj;
		YCFBamScopeBuff buff = obj.getScopeBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableScope().createScope(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a801" ) ) {
			obj = (IYCFBamScopeObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamScopeObj readScope( YCFBamScopePKey pkey ) {
		return( readScope( pkey, false ) );
	}

	public IYCFBamScopeObj readScope( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamScopeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamScopeBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamScopeObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamScopeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamScopeObj readCachedScope( YCFBamScopePKey pkey ) {
		IYCFBamScopeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeScope( IYCFBamScopeObj obj )
	{
		final String S_ProcName = "YCFBamScopeTableObj.reallyDeepDisposeScope() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamScopeObj existing = readCachedScope( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamScopeByTenantIdxKey keyTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
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
	public void deepDisposeScope( YCFBamScopePKey pkey ) {
		IYCFBamScopeObj obj = readCachedScope( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamScopeObj lockScope( YCFBamScopePKey pkey ) {
		IYCFBamScopeObj locked = null;
		YCFBamScopeBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamScopeObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamScopeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockScope", pkey );
		}
		return( locked );
	}

	public List<IYCFBamScopeObj> readAllScope() {
		return( readAllScope( false ) );
	}

	public List<IYCFBamScopeObj> readAllScope( boolean forceRead ) {
		final String S_ProcName = "readAllScope";
		if( ( allScope == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamScopeObj> map = new HashMap<YCFBamScopePKey,IYCFBamScopeObj>();
			allScope = map;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readAllDerived( schema.getAuthorization() );
			YCFBamScopeBuff buff;
			IYCFBamScopeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamScopeObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamScopeObj realised = (IYCFBamScopeObj)obj.realise();
			}
		}
		int len = allScope.size();
		IYCFBamScopeObj arr[] = new IYCFBamScopeObj[len];
		Iterator<IYCFBamScopeObj> valIter = allScope.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamScopeObj> arrayList = new ArrayList<IYCFBamScopeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamScopeObj> cmp = new Comparator<IYCFBamScopeObj>() {
			public int compare( IYCFBamScopeObj lhs, IYCFBamScopeObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamScopeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamScopeObj> readCachedAllScope() {
		final String S_ProcName = "readCachedAllScope";
		ArrayList<IYCFBamScopeObj> arrayList = new ArrayList<IYCFBamScopeObj>();
		if( allScope != null ) {
			int len = allScope.size();
			IYCFBamScopeObj arr[] = new IYCFBamScopeObj[len];
			Iterator<IYCFBamScopeObj> valIter = allScope.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new YCFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new YCFLibArgumentOverflowException( getClass(),
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
		Comparator<IYCFBamScopeObj> cmp = new Comparator<IYCFBamScopeObj>() {
			public int compare( IYCFBamScopeObj lhs, IYCFBamScopeObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id )
	{
		return( readScopeByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamScopeObj obj = readScope( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamScopeObj> readScopeByTenantIdx( long TenantId )
	{
		return( readScopeByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamScopeObj> readScopeByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readScopeByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamScopeObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamScopeObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamScopeObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamScopeObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamScopeObj realised = (IYCFBamScopeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamScopeObj arr[] = new IYCFBamScopeObj[len];
		Iterator<IYCFBamScopeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamScopeObj> arrayList = new ArrayList<IYCFBamScopeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamScopeObj> cmp = new Comparator<IYCFBamScopeObj>() {
			public int compare( IYCFBamScopeObj lhs, IYCFBamScopeObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamScopeObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamScopeObj readCachedScopeByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamScopeObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedScope( pkey );
		return( obj );
	}

	public List<IYCFBamScopeObj> readCachedScopeByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedScopeByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamScopeObj> arrayList = new ArrayList<IYCFBamScopeObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamScopeObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamScopeObj arr[] = new IYCFBamScopeObj[len];
				Iterator<IYCFBamScopeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
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
			IYCFBamScopeObj obj;
			Iterator<IYCFBamScopeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamScopeObj> cmp = new Comparator<IYCFBamScopeObj>() {
			public int compare( IYCFBamScopeObj lhs, IYCFBamScopeObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
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
		IYCFBamScopeObj obj = readCachedScopeByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeScopeByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeScopeByTenantIdx";
		IYCFBamScopeObj obj;
		List<IYCFBamScopeObj> arrayList = readCachedScopeByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamScopeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamScopeObj updateScope( IYCFBamScopeObj Obj ) {
		IYCFBamScopeObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableScope().updateScope( schema.getAuthorization(),
			Obj.getScopeBuff() );
		if( Obj.getClassCode().equals( "a801" ) ) {
			obj = (IYCFBamScopeObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteScope( IYCFBamScopeObj Obj ) {
		IYCFBamScopeObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableScope().deleteScope( schema.getAuthorization(),
			obj.getScopeBuff() );
		Obj.forget();
	}

	public void deleteScopeByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamScopeObj obj = readScope( pkey );
		if( obj != null ) {
			IYCFBamScopeEditObj editObj = (IYCFBamScopeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamScopeEditObj)obj.beginEdit();
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
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamScopeObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamScopeObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableScope().deleteScopeByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamScopeObj> iter = dict.values().iterator();
			IYCFBamScopeObj obj;
			List<IYCFBamScopeObj> toForget = new LinkedList<IYCFBamScopeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableScope().deleteScopeByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeScopeByTenantIdx( TenantId );
	}
}
