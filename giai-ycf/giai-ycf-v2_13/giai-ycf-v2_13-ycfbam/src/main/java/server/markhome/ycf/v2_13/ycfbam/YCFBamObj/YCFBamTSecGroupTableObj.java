// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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

public class YCFBamTSecGroupTableObj
	implements IYCFBamTSecGroupTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> members;
	private Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> allTSecGroup;
	private Map< YCFSecTSecGroupByTenantIdxKey,
		Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > > indexByTenantIdx;
	private Map< YCFSecTSecGroupByTenantVisIdxKey,
		Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > > indexByTenantVisIdx;
	private Map< YCFSecTSecGroupByUNameIdxKey,
		IYCFSecTSecGroupObj > indexByUNameIdx;
	public static String TABLE_NAME = "TSecGroup";
	public static String TABLE_DBNAME = "tsecgrp";

	public YCFBamTSecGroupTableObj() {
		schema = null;
		members = new HashMap<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj>();
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
		indexByUNameIdx = null;
	}

	public YCFBamTSecGroupTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj>();
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
		indexByUNameIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
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
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
		indexByUNameIdx = null;
		List<IYCFSecTSecGroupObj> toForget = new LinkedList<IYCFSecTSecGroupObj>();
		IYCFSecTSecGroupObj cur = null;
		Iterator<IYCFSecTSecGroupObj> iter = members.values().iterator();
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
	 *	YCFBamTSecGroupObj.
	 */
	public IYCFSecTSecGroupObj newInstance() {
		IYCFSecTSecGroupObj inst = new YCFBamTSecGroupObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTSecGroupObj.
	 */
	public IYCFSecTSecGroupEditObj newEditInstance( IYCFSecTSecGroupObj orig ) {
		IYCFSecTSecGroupEditObj edit = new YCFBamTSecGroupEditObj( orig );
		return( edit );
	}

	public IYCFSecTSecGroupObj realiseTSecGroup( IYCFSecTSecGroupObj Obj ) {
		IYCFSecTSecGroupObj obj = Obj;
		YCFSecTSecGroupPKey pkey = obj.getPKey();
		IYCFSecTSecGroupObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecTSecGroupObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFSecTSecGroupByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByTenantVisIdx != null ) {
				YCFSecTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.remove( keepObj.getPKey() );
					if( mapTenantVisIdx.size() <= 0 ) {
						indexByTenantVisIdx.remove( keyTenantVisIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecTSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFSecTSecGroupByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTenantVisIdx != null ) {
				YCFSecTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecTSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allTSecGroup != null ) {
				allTSecGroup.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTSecGroup != null ) {
				allTSecGroup.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFSecTSecGroupByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTenantVisIdx != null ) {
				YCFSecTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecTSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecTSecGroupObj createTSecGroup( IYCFSecTSecGroupObj Obj ) {
		IYCFSecTSecGroupObj obj = Obj;
		YCFSecTSecGroupBuff buff = obj.getTSecGroupBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().createTSecGroup(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecTSecGroupObj readTSecGroup( YCFSecTSecGroupPKey pkey ) {
		return( readTSecGroup( pkey, false ) );
	}

	public IYCFSecTSecGroupObj readTSecGroup( YCFSecTSecGroupPKey pkey, boolean forceRead ) {
		IYCFSecTSecGroupObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecTSecGroupBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGroupId() );
			if( readBuff != null ) {
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecTSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTSecGroupObj readCachedTSecGroup( YCFSecTSecGroupPKey pkey ) {
		IYCFSecTSecGroupObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGroup( IYCFSecTSecGroupObj obj )
	{
		final String S_ProcName = "YCFBamTSecGroupTableObj.reallyDeepDisposeTSecGroup() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecTSecGroupPKey pkey = obj.getPKey();
		IYCFSecTSecGroupObj existing = readCachedTSecGroup( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecTSecGroupByTenantIdxKey keyTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGroupByTenantVisIdxKey keyTenantVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		keyTenantVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTenantVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFSecTSecGroupByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getTSecGrpIncTableObj().deepDisposeTSecGrpIncByIncludeIdx( existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTSecGrpMembTableObj().deepDisposeTSecGrpMembByGroupIdx( existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTSecGrpIncTableObj().deepDisposeTSecGrpIncByGroupIdx( existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByTenantVisIdx != null ) {
			if( indexByTenantVisIdx.containsKey( keyTenantVisIdx ) ) {
				indexByTenantVisIdx.get( keyTenantVisIdx ).remove( pkey );
				if( indexByTenantVisIdx.get( keyTenantVisIdx ).size() <= 0 ) {
					indexByTenantVisIdx.remove( keyTenantVisIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeTSecGroup( YCFSecTSecGroupPKey pkey ) {
		IYCFSecTSecGroupObj obj = readCachedTSecGroup( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecTSecGroupObj lockTSecGroup( YCFSecTSecGroupPKey pkey ) {
		IYCFSecTSecGroupObj locked = null;
		YCFSecTSecGroupBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGroupTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecTSecGroupObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTSecGroup", pkey );
		}
		return( locked );
	}

	public List<IYCFSecTSecGroupObj> readAllTSecGroup() {
		return( readAllTSecGroup( false ) );
	}

	public List<IYCFSecTSecGroupObj> readAllTSecGroup( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGroup";
		if( ( allTSecGroup == null ) || forceRead ) {
			Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> map = new HashMap<YCFSecTSecGroupPKey,IYCFSecTSecGroupObj>();
			allTSecGroup = map;
			YCFSecTSecGroupBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().readAllDerived( schema.getAuthorization() );
			YCFSecTSecGroupBuff buff;
			IYCFSecTSecGroupObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGroupObj realised = (IYCFSecTSecGroupObj)obj.realise();
			}
		}
		int len = allTSecGroup.size();
		IYCFSecTSecGroupObj arr[] = new IYCFSecTSecGroupObj[len];
		Iterator<IYCFSecTSecGroupObj> valIter = allTSecGroup.values().iterator();
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
		ArrayList<IYCFSecTSecGroupObj> arrayList = new ArrayList<IYCFSecTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGroupObj> cmp = new Comparator<IYCFSecTSecGroupObj>() {
			public int compare( IYCFSecTSecGroupObj lhs, IYCFSecTSecGroupObj rhs ) {
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
					YCFSecTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGroupObj> readCachedAllTSecGroup() {
		final String S_ProcName = "readCachedAllTSecGroup";
		ArrayList<IYCFSecTSecGroupObj> arrayList = new ArrayList<IYCFSecTSecGroupObj>();
		if( allTSecGroup != null ) {
			int len = allTSecGroup.size();
			IYCFSecTSecGroupObj arr[] = new IYCFSecTSecGroupObj[len];
			Iterator<IYCFSecTSecGroupObj> valIter = allTSecGroup.values().iterator();
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
		Comparator<IYCFSecTSecGroupObj> cmp = new Comparator<IYCFSecTSecGroupObj>() {
			public int compare( IYCFSecTSecGroupObj lhs, IYCFSecTSecGroupObj rhs ) {
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
					YCFSecTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGroupByIdIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public IYCFSecTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId, boolean forceRead )
	{
		YCFSecTSecGroupPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		IYCFSecTSecGroupObj obj = readTSecGroup( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecTSecGroupObj> readTSecGroupByTenantIdx( long TenantId )
	{
		return( readTSecGroupByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFSecTSecGroupObj> readTSecGroupByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGroupByTenantIdx";
		YCFSecTSecGroupByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFSecTSecGroupByTenantIdxKey,
				Map< YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj>();
			IYCFSecTSecGroupObj obj;
			YCFSecTSecGroupBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFSecTSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGroupObj realised = (IYCFSecTSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGroupObj arr[] = new IYCFSecTSecGroupObj[len];
		Iterator<IYCFSecTSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGroupObj> arrayList = new ArrayList<IYCFSecTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGroupObj> cmp = new Comparator<IYCFSecTSecGroupObj>() {
			public int compare( IYCFSecTSecGroupObj lhs, IYCFSecTSecGroupObj rhs ) {
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
					YCFSecTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		return( readTSecGroupByTenantVisIdx( TenantId,
			IsVisible,
			false ) );
	}

	public List<IYCFSecTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGroupByTenantVisIdx";
		YCFSecTSecGroupByTenantVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> dict;
		if( indexByTenantVisIdx == null ) {
			indexByTenantVisIdx = new HashMap< YCFSecTSecGroupByTenantVisIdxKey,
				Map< YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByTenantVisIdx.containsKey( key ) ) {
			dict = indexByTenantVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj>();
			IYCFSecTSecGroupObj obj;
			YCFSecTSecGroupBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
			YCFSecTSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGroupObj realised = (IYCFSecTSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGroupObj arr[] = new IYCFSecTSecGroupObj[len];
		Iterator<IYCFSecTSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGroupObj> arrayList = new ArrayList<IYCFSecTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGroupObj> cmp = new Comparator<IYCFSecTSecGroupObj>() {
			public int compare( IYCFSecTSecGroupObj lhs, IYCFSecTSecGroupObj rhs ) {
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
					YCFSecTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecTSecGroupObj readTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		return( readTSecGroupByUNameIdx( TenantId,
			Name,
			false ) );
	}

	public IYCFSecTSecGroupObj readTSecGroupByUNameIdx( long TenantId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFSecTSecGroupByUNameIdxKey,
				IYCFSecTSecGroupObj >();
		}
		YCFSecTSecGroupByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFSecTSecGroupObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFSecTSecGroupBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			if( buff != null ) {
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecTSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTSecGroupObj readCachedTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		IYCFSecTSecGroupObj obj = null;
		YCFSecTSecGroupPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		obj = readCachedTSecGroup( pkey );
		return( obj );
	}

	public List<IYCFSecTSecGroupObj> readCachedTSecGroupByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGroupByTenantIdx";
		YCFSecTSecGroupByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFSecTSecGroupObj> arrayList = new ArrayList<IYCFSecTSecGroupObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGroupObj arr[] = new IYCFSecTSecGroupObj[len];
				Iterator<IYCFSecTSecGroupObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGroupObj obj;
			Iterator<IYCFSecTSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGroupObj> cmp = new Comparator<IYCFSecTSecGroupObj>() {
			public int compare( IYCFSecTSecGroupObj lhs, IYCFSecTSecGroupObj rhs ) {
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
					YCFSecTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecTSecGroupObj> readCachedTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "readCachedTSecGroupByTenantVisIdx";
		YCFSecTSecGroupByTenantVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		ArrayList<IYCFSecTSecGroupObj> arrayList = new ArrayList<IYCFSecTSecGroupObj>();
		if( indexByTenantVisIdx != null ) {
			Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> dict;
			if( indexByTenantVisIdx.containsKey( key ) ) {
				dict = indexByTenantVisIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGroupObj arr[] = new IYCFSecTSecGroupObj[len];
				Iterator<IYCFSecTSecGroupObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGroupObj obj;
			Iterator<IYCFSecTSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGroupObj> cmp = new Comparator<IYCFSecTSecGroupObj>() {
			public int compare( IYCFSecTSecGroupObj lhs, IYCFSecTSecGroupObj rhs ) {
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
					YCFSecTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecTSecGroupObj readCachedTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		IYCFSecTSecGroupObj obj = null;
		YCFSecTSecGroupByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecTSecGroupObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecTSecGroupObj> valIter = members.values().iterator();
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

	public void deepDisposeTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		IYCFSecTSecGroupObj obj = readCachedTSecGroupByIdIdx( TenantId,
				TSecGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGroupByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGroupByTenantIdx";
		IYCFSecTSecGroupObj obj;
		List<IYCFSecTSecGroupObj> arrayList = readCachedTSecGroupByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "deepDisposeTSecGroupByTenantVisIdx";
		IYCFSecTSecGroupObj obj;
		List<IYCFSecTSecGroupObj> arrayList = readCachedTSecGroupByTenantVisIdx( TenantId,
				IsVisible );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		IYCFSecTSecGroupObj obj = readCachedTSecGroupByUNameIdx( TenantId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecTSecGroupObj updateTSecGroup( IYCFSecTSecGroupObj Obj ) {
		IYCFSecTSecGroupObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().updateTSecGroup( schema.getAuthorization(),
			Obj.getTSecGroupBuff() );
		obj = (IYCFSecTSecGroupObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGroup( IYCFSecTSecGroupObj Obj ) {
		IYCFSecTSecGroupObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroup( schema.getAuthorization(),
			obj.getTSecGroupBuff() );
		Obj.forget();
	}

	public void deleteTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		YCFSecTSecGroupPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		IYCFSecTSecGroupObj obj = readTSecGroup( pkey );
		if( obj != null ) {
			IYCFSecTSecGroupEditObj editObj = (IYCFSecTSecGroupEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecTSecGroupEditObj)obj.beginEdit();
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
		deepDisposeTSecGroupByIdIdx( TenantId,
				TSecGroupId );
	}

	public void deleteTSecGroupByTenantIdx( long TenantId )
	{
		YCFSecTSecGroupByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFSecTSecGroupByTenantIdxKey,
				Map< YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFSecTSecGroupObj> iter = dict.values().iterator();
			IYCFSecTSecGroupObj obj;
			List<IYCFSecTSecGroupObj> toForget = new LinkedList<IYCFSecTSecGroupObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGroupByTenantIdx( TenantId );
	}

	public void deleteTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		YCFSecTSecGroupByTenantVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		if( indexByTenantVisIdx == null ) {
			indexByTenantVisIdx = new HashMap< YCFSecTSecGroupByTenantVisIdxKey,
				Map< YCFSecTSecGroupPKey, IYCFSecTSecGroupObj > >();
		}
		if( indexByTenantVisIdx.containsKey( key ) ) {
			Map<YCFSecTSecGroupPKey, IYCFSecTSecGroupObj> dict = indexByTenantVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
			Iterator<IYCFSecTSecGroupObj> iter = dict.values().iterator();
			IYCFSecTSecGroupObj obj;
			List<IYCFSecTSecGroupObj> toForget = new LinkedList<IYCFSecTSecGroupObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantVisIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
		}
		deepDisposeTSecGroupByTenantVisIdx( TenantId,
				IsVisible );
	}

	public void deleteTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFSecTSecGroupByUNameIdxKey,
				IYCFSecTSecGroupObj >();
		}
		YCFSecTSecGroupByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFSecTSecGroupObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
		}
		deepDisposeTSecGroupByUNameIdx( TenantId,
				Name );
	}
}
