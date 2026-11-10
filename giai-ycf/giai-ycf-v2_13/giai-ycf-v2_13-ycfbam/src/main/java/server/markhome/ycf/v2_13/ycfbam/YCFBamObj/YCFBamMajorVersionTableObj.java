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

public class YCFBamMajorVersionTableObj
	implements IYCFBamMajorVersionTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> members;
	private Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> allMajorVersion;
	private Map< YCFIntMajorVersionByTenantIdxKey,
		Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > > indexByTenantIdx;
	private Map< YCFIntMajorVersionBySubProjectIdxKey,
		Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > > indexBySubProjectIdx;
	private Map< YCFIntMajorVersionByNameIdxKey,
		IYCFIntMajorVersionObj > indexByNameIdx;
	public static String TABLE_NAME = "MajorVersion";
	public static String TABLE_DBNAME = "mjvrdef";

	public YCFBamMajorVersionTableObj() {
		schema = null;
		members = new HashMap<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj>();
		allMajorVersion = null;
		indexByTenantIdx = null;
		indexBySubProjectIdx = null;
		indexByNameIdx = null;
	}

	public YCFBamMajorVersionTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj>();
		allMajorVersion = null;
		indexByTenantIdx = null;
		indexBySubProjectIdx = null;
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
		allMajorVersion = null;
		indexByTenantIdx = null;
		indexBySubProjectIdx = null;
		indexByNameIdx = null;
		List<IYCFIntMajorVersionObj> toForget = new LinkedList<IYCFIntMajorVersionObj>();
		IYCFIntMajorVersionObj cur = null;
		Iterator<IYCFIntMajorVersionObj> iter = members.values().iterator();
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
	 *	YCFBamMajorVersionObj.
	 */
	public IYCFIntMajorVersionObj newInstance() {
		IYCFIntMajorVersionObj inst = new YCFBamMajorVersionObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamMajorVersionObj.
	 */
	public IYCFIntMajorVersionEditObj newEditInstance( IYCFIntMajorVersionObj orig ) {
		IYCFIntMajorVersionEditObj edit = new YCFBamMajorVersionEditObj( orig );
		return( edit );
	}

	public IYCFIntMajorVersionObj realiseMajorVersion( IYCFIntMajorVersionObj Obj ) {
		IYCFIntMajorVersionObj obj = Obj;
		YCFIntMajorVersionPKey pkey = obj.getPKey();
		IYCFIntMajorVersionObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntMajorVersionObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFIntMajorVersionByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexBySubProjectIdx != null ) {
				YCFIntMajorVersionBySubProjectIdxKey keySubProjectIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newSubProjectIdxKey();
				keySubProjectIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySubProjectIdx.setRequiredSubProjectId( keepObj.getRequiredSubProjectId() );
				Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > mapSubProjectIdx = indexBySubProjectIdx.get( keySubProjectIdx );
				if( mapSubProjectIdx != null ) {
					mapSubProjectIdx.remove( keepObj.getPKey() );
					if( mapSubProjectIdx.size() <= 0 ) {
						indexBySubProjectIdx.remove( keySubProjectIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntMajorVersionByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredSubProjectId( keepObj.getRequiredSubProjectId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFIntMajorVersionByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySubProjectIdx != null ) {
				YCFIntMajorVersionBySubProjectIdxKey keySubProjectIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newSubProjectIdxKey();
				keySubProjectIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySubProjectIdx.setRequiredSubProjectId( keepObj.getRequiredSubProjectId() );
				Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > mapSubProjectIdx = indexBySubProjectIdx.get( keySubProjectIdx );
				if( mapSubProjectIdx != null ) {
					mapSubProjectIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntMajorVersionByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredSubProjectId( keepObj.getRequiredSubProjectId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allMajorVersion != null ) {
				allMajorVersion.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allMajorVersion != null ) {
				allMajorVersion.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFIntMajorVersionByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySubProjectIdx != null ) {
				YCFIntMajorVersionBySubProjectIdxKey keySubProjectIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newSubProjectIdxKey();
				keySubProjectIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySubProjectIdx.setRequiredSubProjectId( keepObj.getRequiredSubProjectId() );
				Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > mapSubProjectIdx = indexBySubProjectIdx.get( keySubProjectIdx );
				if( mapSubProjectIdx != null ) {
					mapSubProjectIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntMajorVersionByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredSubProjectId( keepObj.getRequiredSubProjectId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntMajorVersionObj createMajorVersion( IYCFIntMajorVersionObj Obj ) {
		IYCFIntMajorVersionObj obj = Obj;
		YCFIntMajorVersionBuff buff = obj.getMajorVersionBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().createMajorVersion(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntMajorVersionObj readMajorVersion( YCFIntMajorVersionPKey pkey ) {
		return( readMajorVersion( pkey, false ) );
	}

	public IYCFIntMajorVersionObj readMajorVersion( YCFIntMajorVersionPKey pkey, boolean forceRead ) {
		IYCFIntMajorVersionObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntMajorVersionBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getMajorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntMajorVersionObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntMajorVersionObj readCachedMajorVersion( YCFIntMajorVersionPKey pkey ) {
		IYCFIntMajorVersionObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeMajorVersion( IYCFIntMajorVersionObj obj )
	{
		final String S_ProcName = "YCFBamMajorVersionTableObj.reallyDeepDisposeMajorVersion() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntMajorVersionPKey pkey = obj.getPKey();
		IYCFIntMajorVersionObj existing = readCachedMajorVersion( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntMajorVersionByTenantIdxKey keyTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntMajorVersionBySubProjectIdxKey keySubProjectIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newSubProjectIdxKey();
		keySubProjectIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySubProjectIdx.setRequiredSubProjectId( existing.getRequiredSubProjectId() );

		YCFIntMajorVersionByNameIdxKey keyNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredSubProjectId( existing.getRequiredSubProjectId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getMinorVersionTableObj().deepDisposeMinorVersionByMajorVerIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexBySubProjectIdx != null ) {
			if( indexBySubProjectIdx.containsKey( keySubProjectIdx ) ) {
				indexBySubProjectIdx.get( keySubProjectIdx ).remove( pkey );
				if( indexBySubProjectIdx.get( keySubProjectIdx ).size() <= 0 ) {
					indexBySubProjectIdx.remove( keySubProjectIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeMajorVersion( YCFIntMajorVersionPKey pkey ) {
		IYCFIntMajorVersionObj obj = readCachedMajorVersion( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntMajorVersionObj lockMajorVersion( YCFIntMajorVersionPKey pkey ) {
		IYCFIntMajorVersionObj locked = null;
		YCFIntMajorVersionBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getMajorVersionTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntMajorVersionObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockMajorVersion", pkey );
		}
		return( locked );
	}

	public List<IYCFIntMajorVersionObj> readAllMajorVersion() {
		return( readAllMajorVersion( false ) );
	}

	public List<IYCFIntMajorVersionObj> readAllMajorVersion( boolean forceRead ) {
		final String S_ProcName = "readAllMajorVersion";
		if( ( allMajorVersion == null ) || forceRead ) {
			Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> map = new HashMap<YCFIntMajorVersionPKey,IYCFIntMajorVersionObj>();
			allMajorVersion = map;
			YCFIntMajorVersionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().readAllDerived( schema.getAuthorization() );
			YCFIntMajorVersionBuff buff;
			IYCFIntMajorVersionObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey() );
				obj.setBuff( buff );
				IYCFIntMajorVersionObj realised = (IYCFIntMajorVersionObj)obj.realise();
			}
		}
		int len = allMajorVersion.size();
		IYCFIntMajorVersionObj arr[] = new IYCFIntMajorVersionObj[len];
		Iterator<IYCFIntMajorVersionObj> valIter = allMajorVersion.values().iterator();
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
		ArrayList<IYCFIntMajorVersionObj> arrayList = new ArrayList<IYCFIntMajorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntMajorVersionObj> cmp = new Comparator<IYCFIntMajorVersionObj>() {
			public int compare( IYCFIntMajorVersionObj lhs, IYCFIntMajorVersionObj rhs ) {
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
					YCFIntMajorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMajorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntMajorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntMajorVersionObj> readCachedAllMajorVersion() {
		final String S_ProcName = "readCachedAllMajorVersion";
		ArrayList<IYCFIntMajorVersionObj> arrayList = new ArrayList<IYCFIntMajorVersionObj>();
		if( allMajorVersion != null ) {
			int len = allMajorVersion.size();
			IYCFIntMajorVersionObj arr[] = new IYCFIntMajorVersionObj[len];
			Iterator<IYCFIntMajorVersionObj> valIter = allMajorVersion.values().iterator();
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
		Comparator<IYCFIntMajorVersionObj> cmp = new Comparator<IYCFIntMajorVersionObj>() {
			public int compare( IYCFIntMajorVersionObj lhs, IYCFIntMajorVersionObj rhs ) {
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
					YCFIntMajorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMajorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntMajorVersionObj readMajorVersionByIdIdx( long TenantId,
		long Id )
	{
		return( readMajorVersionByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFIntMajorVersionObj readMajorVersionByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFIntMajorVersionPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntMajorVersionObj obj = readMajorVersion( pkey, forceRead );
		return( obj );
	}

	public List<IYCFIntMajorVersionObj> readMajorVersionByTenantIdx( long TenantId )
	{
		return( readMajorVersionByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFIntMajorVersionObj> readMajorVersionByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readMajorVersionByTenantIdx";
		YCFIntMajorVersionByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntMajorVersionByTenantIdxKey,
				Map< YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj>();
			IYCFIntMajorVersionObj obj;
			YCFIntMajorVersionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFIntMajorVersionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getMajorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey() );
				obj.setBuff( buff );
				IYCFIntMajorVersionObj realised = (IYCFIntMajorVersionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntMajorVersionObj arr[] = new IYCFIntMajorVersionObj[len];
		Iterator<IYCFIntMajorVersionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntMajorVersionObj> arrayList = new ArrayList<IYCFIntMajorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntMajorVersionObj> cmp = new Comparator<IYCFIntMajorVersionObj>() {
			public int compare( IYCFIntMajorVersionObj lhs, IYCFIntMajorVersionObj rhs ) {
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
					YCFIntMajorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMajorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntMajorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntMajorVersionObj> readMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId )
	{
		return( readMajorVersionBySubProjectIdx( TenantId,
			SubProjectId,
			false ) );
	}

	public List<IYCFIntMajorVersionObj> readMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId,
		boolean forceRead )
	{
		final String S_ProcName = "readMajorVersionBySubProjectIdx";
		YCFIntMajorVersionBySubProjectIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newSubProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );
		Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> dict;
		if( indexBySubProjectIdx == null ) {
			indexBySubProjectIdx = new HashMap< YCFIntMajorVersionBySubProjectIdxKey,
				Map< YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > >();
		}
		if( ( ! forceRead ) && indexBySubProjectIdx.containsKey( key ) ) {
			dict = indexBySubProjectIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj>();
			IYCFIntMajorVersionObj obj;
			YCFIntMajorVersionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().readDerivedBySubProjectIdx( schema.getAuthorization(),
				TenantId,
				SubProjectId );
			YCFIntMajorVersionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getMajorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey() );
				obj.setBuff( buff );
				IYCFIntMajorVersionObj realised = (IYCFIntMajorVersionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySubProjectIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntMajorVersionObj arr[] = new IYCFIntMajorVersionObj[len];
		Iterator<IYCFIntMajorVersionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntMajorVersionObj> arrayList = new ArrayList<IYCFIntMajorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntMajorVersionObj> cmp = new Comparator<IYCFIntMajorVersionObj>() {
			public int compare( IYCFIntMajorVersionObj lhs, IYCFIntMajorVersionObj rhs ) {
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
					YCFIntMajorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMajorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntMajorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntMajorVersionObj readMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name )
	{
		return( readMajorVersionByNameIdx( TenantId,
			SubProjectId,
			Name,
			false ) );
	}

	public IYCFIntMajorVersionObj readMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntMajorVersionByNameIdxKey,
				IYCFIntMajorVersionObj >();
		}
		YCFIntMajorVersionByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );
		key.setRequiredName( Name );
		IYCFIntMajorVersionObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFIntMajorVersionBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				SubProjectId,
				Name );
			if( buff != null ) {
				obj = schema.getMajorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntMajorVersionObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntMajorVersionObj readCachedMajorVersionByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntMajorVersionObj obj = null;
		YCFIntMajorVersionPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedMajorVersion( pkey );
		return( obj );
	}

	public List<IYCFIntMajorVersionObj> readCachedMajorVersionByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedMajorVersionByTenantIdx";
		YCFIntMajorVersionByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFIntMajorVersionObj> arrayList = new ArrayList<IYCFIntMajorVersionObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFIntMajorVersionObj arr[] = new IYCFIntMajorVersionObj[len];
				Iterator<IYCFIntMajorVersionObj> valIter = dict.values().iterator();
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
			IYCFIntMajorVersionObj obj;
			Iterator<IYCFIntMajorVersionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntMajorVersionObj> cmp = new Comparator<IYCFIntMajorVersionObj>() {
			public int compare( IYCFIntMajorVersionObj lhs, IYCFIntMajorVersionObj rhs ) {
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
					YCFIntMajorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMajorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFIntMajorVersionObj> readCachedMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId )
	{
		final String S_ProcName = "readCachedMajorVersionBySubProjectIdx";
		YCFIntMajorVersionBySubProjectIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newSubProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );
		ArrayList<IYCFIntMajorVersionObj> arrayList = new ArrayList<IYCFIntMajorVersionObj>();
		if( indexBySubProjectIdx != null ) {
			Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> dict;
			if( indexBySubProjectIdx.containsKey( key ) ) {
				dict = indexBySubProjectIdx.get( key );
				int len = dict.size();
				IYCFIntMajorVersionObj arr[] = new IYCFIntMajorVersionObj[len];
				Iterator<IYCFIntMajorVersionObj> valIter = dict.values().iterator();
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
			IYCFIntMajorVersionObj obj;
			Iterator<IYCFIntMajorVersionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntMajorVersionObj> cmp = new Comparator<IYCFIntMajorVersionObj>() {
			public int compare( IYCFIntMajorVersionObj lhs, IYCFIntMajorVersionObj rhs ) {
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
					YCFIntMajorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMajorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntMajorVersionObj readCachedMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name )
	{
		IYCFIntMajorVersionObj obj = null;
		YCFIntMajorVersionByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntMajorVersionObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntMajorVersionObj> valIter = members.values().iterator();
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

	public void deepDisposeMajorVersionByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntMajorVersionObj obj = readCachedMajorVersionByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeMajorVersionByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeMajorVersionByTenantIdx";
		IYCFIntMajorVersionObj obj;
		List<IYCFIntMajorVersionObj> arrayList = readCachedMajorVersionByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFIntMajorVersionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId )
	{
		final String S_ProcName = "deepDisposeMajorVersionBySubProjectIdx";
		IYCFIntMajorVersionObj obj;
		List<IYCFIntMajorVersionObj> arrayList = readCachedMajorVersionBySubProjectIdx( TenantId,
				SubProjectId );
		if( arrayList != null )  {
			Iterator<IYCFIntMajorVersionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name )
	{
		IYCFIntMajorVersionObj obj = readCachedMajorVersionByNameIdx( TenantId,
				SubProjectId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntMajorVersionObj updateMajorVersion( IYCFIntMajorVersionObj Obj ) {
		IYCFIntMajorVersionObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().updateMajorVersion( schema.getAuthorization(),
			Obj.getMajorVersionBuff() );
		obj = (IYCFIntMajorVersionObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteMajorVersion( IYCFIntMajorVersionObj Obj ) {
		IYCFIntMajorVersionObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().deleteMajorVersion( schema.getAuthorization(),
			obj.getMajorVersionBuff() );
		Obj.forget();
	}

	public void deleteMajorVersionByIdIdx( long TenantId,
		long Id )
	{
		YCFIntMajorVersionPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntMajorVersionObj obj = readMajorVersion( pkey );
		if( obj != null ) {
			IYCFIntMajorVersionEditObj editObj = (IYCFIntMajorVersionEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntMajorVersionEditObj)obj.beginEdit();
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
		deepDisposeMajorVersionByIdIdx( TenantId,
				Id );
	}

	public void deleteMajorVersionByTenantIdx( long TenantId )
	{
		YCFIntMajorVersionByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntMajorVersionByTenantIdxKey,
				Map< YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().deleteMajorVersionByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFIntMajorVersionObj> iter = dict.values().iterator();
			IYCFIntMajorVersionObj obj;
			List<IYCFIntMajorVersionObj> toForget = new LinkedList<IYCFIntMajorVersionObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().deleteMajorVersionByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeMajorVersionByTenantIdx( TenantId );
	}

	public void deleteMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId )
	{
		YCFIntMajorVersionBySubProjectIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newSubProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );
		if( indexBySubProjectIdx == null ) {
			indexBySubProjectIdx = new HashMap< YCFIntMajorVersionBySubProjectIdxKey,
				Map< YCFIntMajorVersionPKey, IYCFIntMajorVersionObj > >();
		}
		if( indexBySubProjectIdx.containsKey( key ) ) {
			Map<YCFIntMajorVersionPKey, IYCFIntMajorVersionObj> dict = indexBySubProjectIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().deleteMajorVersionBySubProjectIdx( schema.getAuthorization(),
				TenantId,
				SubProjectId );
			Iterator<IYCFIntMajorVersionObj> iter = dict.values().iterator();
			IYCFIntMajorVersionObj obj;
			List<IYCFIntMajorVersionObj> toForget = new LinkedList<IYCFIntMajorVersionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySubProjectIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().deleteMajorVersionBySubProjectIdx( schema.getAuthorization(),
				TenantId,
				SubProjectId );
		}
		deepDisposeMajorVersionBySubProjectIdx( TenantId,
				SubProjectId );
	}

	public void deleteMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntMajorVersionByNameIdxKey,
				IYCFIntMajorVersionObj >();
		}
		YCFIntMajorVersionByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );
		key.setRequiredName( Name );
		IYCFIntMajorVersionObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().deleteMajorVersionByNameIdx( schema.getAuthorization(),
				TenantId,
				SubProjectId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableMajorVersion().deleteMajorVersionByNameIdx( schema.getAuthorization(),
				TenantId,
				SubProjectId,
				Name );
		}
		deepDisposeMajorVersionByNameIdx( TenantId,
				SubProjectId,
				Name );
	}
}
