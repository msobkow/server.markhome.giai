// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
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

public class YCFBamTldTableObj
	implements IYCFBamTldTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFIntTldPKey, IYCFIntTldObj> members;
	private Map<YCFIntTldPKey, IYCFIntTldObj> allTld;
	private Map< YCFIntTldByTenantIdxKey,
		Map<YCFIntTldPKey, IYCFIntTldObj > > indexByTenantIdx;
	private Map< YCFIntTldByNameIdxKey,
		IYCFIntTldObj > indexByNameIdx;
	public static String TABLE_NAME = "Tld";
	public static String TABLE_DBNAME = "tlddef";

	public YCFBamTldTableObj() {
		schema = null;
		members = new HashMap<YCFIntTldPKey, IYCFIntTldObj>();
		allTld = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
	}

	public YCFBamTldTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFIntTldPKey, IYCFIntTldObj>();
		allTld = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( IYCFBamTenantObj.class );
	}


	public void minimizeMemory() {
		allTld = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
		List<IYCFIntTldObj> toForget = new LinkedList<IYCFIntTldObj>();
		IYCFIntTldObj cur = null;
		Iterator<IYCFIntTldObj> iter = members.values().iterator();
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
	 *	YCFBamTldObj.
	 */
	public IYCFIntTldObj newInstance() {
		IYCFIntTldObj inst = new YCFBamTldObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTldObj.
	 */
	public IYCFIntTldEditObj newEditInstance( IYCFIntTldObj orig ) {
		IYCFIntTldEditObj edit = new YCFBamTldEditObj( orig );
		return( edit );
	}

	public IYCFIntTldObj realiseTld( IYCFIntTldObj Obj ) {
		IYCFIntTldObj obj = Obj;
		YCFIntTldPKey pkey = obj.getPKey();
		IYCFIntTldObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntTldObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFIntTldByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTldPKey, IYCFIntTldObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTldByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFIntTldByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTldPKey, IYCFIntTldObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTldByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allTld != null ) {
				allTld.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTld != null ) {
				allTld.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFIntTldByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTldPKey, IYCFIntTldObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTldByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntTldObj createTld( IYCFIntTldObj Obj ) {
		IYCFIntTldObj obj = Obj;
		YCFIntTldBuff buff = obj.getTldBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTld().createTld(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntTldObj readTld( YCFIntTldPKey pkey ) {
		return( readTld( pkey, false ) );
	}

	public IYCFIntTldObj readTld( YCFIntTldPKey pkey, boolean forceRead ) {
		IYCFIntTldObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntTldBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTld().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getTldTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntTldObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntTldObj readCachedTld( YCFIntTldPKey pkey ) {
		IYCFIntTldObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTld( IYCFIntTldObj obj )
	{
		final String S_ProcName = "YCFBamTldTableObj.reallyDeepDisposeTld() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntTldPKey pkey = obj.getPKey();
		IYCFIntTldObj existing = readCachedTld( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntTldByTenantIdxKey keyTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTldByNameIdxKey keyNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getTopDomainTableObj().deepDisposeTopDomainByTldIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeTld( YCFIntTldPKey pkey ) {
		IYCFIntTldObj obj = readCachedTld( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntTldObj lockTld( YCFIntTldPKey pkey ) {
		IYCFIntTldObj locked = null;
		YCFIntTldBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTld().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTldTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntTldObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTld", pkey );
		}
		return( locked );
	}

	public List<IYCFIntTldObj> readAllTld() {
		return( readAllTld( false ) );
	}

	public List<IYCFIntTldObj> readAllTld( boolean forceRead ) {
		final String S_ProcName = "readAllTld";
		if( ( allTld == null ) || forceRead ) {
			Map<YCFIntTldPKey, IYCFIntTldObj> map = new HashMap<YCFIntTldPKey,IYCFIntTldObj>();
			allTld = map;
			YCFIntTldBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTld().readAllDerived( schema.getAuthorization() );
			YCFIntTldBuff buff;
			IYCFIntTldObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey() );
				obj.setBuff( buff );
				IYCFIntTldObj realised = (IYCFIntTldObj)obj.realise();
			}
		}
		int len = allTld.size();
		IYCFIntTldObj arr[] = new IYCFIntTldObj[len];
		Iterator<IYCFIntTldObj> valIter = allTld.values().iterator();
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
		ArrayList<IYCFIntTldObj> arrayList = new ArrayList<IYCFIntTldObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTldObj> cmp = new Comparator<IYCFIntTldObj>() {
			public int compare( IYCFIntTldObj lhs, IYCFIntTldObj rhs ) {
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
					YCFIntTldPKey lhsPKey = lhs.getPKey();
					YCFIntTldPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTldObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntTldObj> readCachedAllTld() {
		final String S_ProcName = "readCachedAllTld";
		ArrayList<IYCFIntTldObj> arrayList = new ArrayList<IYCFIntTldObj>();
		if( allTld != null ) {
			int len = allTld.size();
			IYCFIntTldObj arr[] = new IYCFIntTldObj[len];
			Iterator<IYCFIntTldObj> valIter = allTld.values().iterator();
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
		Comparator<IYCFIntTldObj> cmp = new Comparator<IYCFIntTldObj>() {
			public int compare( IYCFIntTldObj lhs, IYCFIntTldObj rhs ) {
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
					YCFIntTldPKey lhsPKey = lhs.getPKey();
					YCFIntTldPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntTldObj readTldByIdIdx( long TenantId,
		long Id )
	{
		return( readTldByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFIntTldObj readTldByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFIntTldPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntTldObj obj = readTld( pkey, forceRead );
		return( obj );
	}

	public List<IYCFIntTldObj> readTldByTenantIdx( long TenantId )
	{
		return( readTldByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFIntTldObj> readTldByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTldByTenantIdx";
		YCFIntTldByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFIntTldPKey, IYCFIntTldObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntTldByTenantIdxKey,
				Map< YCFIntTldPKey, IYCFIntTldObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntTldPKey, IYCFIntTldObj>();
			IYCFIntTldObj obj;
			YCFIntTldBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTld().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFIntTldBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTldTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey() );
				obj.setBuff( buff );
				IYCFIntTldObj realised = (IYCFIntTldObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntTldObj arr[] = new IYCFIntTldObj[len];
		Iterator<IYCFIntTldObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntTldObj> arrayList = new ArrayList<IYCFIntTldObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTldObj> cmp = new Comparator<IYCFIntTldObj>() {
			public int compare( IYCFIntTldObj lhs, IYCFIntTldObj rhs ) {
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
					YCFIntTldPKey lhsPKey = lhs.getPKey();
					YCFIntTldPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTldObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntTldObj readTldByNameIdx( long TenantId,
		String Name )
	{
		return( readTldByNameIdx( TenantId,
			Name,
			false ) );
	}

	public IYCFIntTldObj readTldByNameIdx( long TenantId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntTldByNameIdxKey,
				IYCFIntTldObj >();
		}
		YCFIntTldByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFIntTldObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFIntTldBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTld().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			if( buff != null ) {
				obj = schema.getTldTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntTldObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntTldObj readCachedTldByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntTldObj obj = null;
		YCFIntTldPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTld( pkey );
		return( obj );
	}

	public List<IYCFIntTldObj> readCachedTldByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTldByTenantIdx";
		YCFIntTldByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFIntTldObj> arrayList = new ArrayList<IYCFIntTldObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFIntTldPKey, IYCFIntTldObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFIntTldObj arr[] = new IYCFIntTldObj[len];
				Iterator<IYCFIntTldObj> valIter = dict.values().iterator();
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
			IYCFIntTldObj obj;
			Iterator<IYCFIntTldObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntTldObj> cmp = new Comparator<IYCFIntTldObj>() {
			public int compare( IYCFIntTldObj lhs, IYCFIntTldObj rhs ) {
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
					YCFIntTldPKey lhsPKey = lhs.getPKey();
					YCFIntTldPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntTldObj readCachedTldByNameIdx( long TenantId,
		String Name )
	{
		IYCFIntTldObj obj = null;
		YCFIntTldByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntTldObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<IYCFIntTldObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public void deepDisposeTldByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntTldObj obj = readCachedTldByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTldByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTldByTenantIdx";
		IYCFIntTldObj obj;
		List<IYCFIntTldObj> arrayList = readCachedTldByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFIntTldObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTldByNameIdx( long TenantId,
		String Name )
	{
		IYCFIntTldObj obj = readCachedTldByNameIdx( TenantId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntTldObj updateTld( IYCFIntTldObj Obj ) {
		IYCFIntTldObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTld().updateTld( schema.getAuthorization(),
			Obj.getTldBuff() );
		obj = (IYCFIntTldObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTld( IYCFIntTldObj Obj ) {
		IYCFIntTldObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTld().deleteTld( schema.getAuthorization(),
			obj.getTldBuff() );
		Obj.forget();
	}

	public void deleteTldByIdIdx( long TenantId,
		long Id )
	{
		YCFIntTldPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntTldObj obj = readTld( pkey );
		if( obj != null ) {
			IYCFIntTldEditObj editObj = (IYCFIntTldEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntTldEditObj)obj.beginEdit();
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
		deepDisposeTldByIdIdx( TenantId,
				Id );
	}

	public void deleteTldByTenantIdx( long TenantId )
	{
		YCFIntTldByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntTldByTenantIdxKey,
				Map< YCFIntTldPKey, IYCFIntTldObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFIntTldPKey, IYCFIntTldObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTld().deleteTldByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFIntTldObj> iter = dict.values().iterator();
			IYCFIntTldObj obj;
			List<IYCFIntTldObj> toForget = new LinkedList<IYCFIntTldObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTld().deleteTldByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTldByTenantIdx( TenantId );
	}

	public void deleteTldByNameIdx( long TenantId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntTldByNameIdxKey,
				IYCFIntTldObj >();
		}
		YCFIntTldByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTld().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFIntTldObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTld().deleteTldByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTld().deleteTldByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
		}
		deepDisposeTldByNameIdx( TenantId,
				Name );
	}
}
