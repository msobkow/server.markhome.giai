// Description: Java 11 Table Object implementation for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFSecSecGroupTableObj
	implements IYCFSecSecGroupTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> members;
	private Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> allSecGroup;
	private Map< YCFSecSecGroupByClusterIdxKey,
		Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > > indexByClusterIdx;
	private Map< YCFSecSecGroupByClusterVisIdxKey,
		Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > > indexByClusterVisIdx;
	private Map< YCFSecSecGroupByUNameIdxKey,
		IYCFSecSecGroupObj > indexByUNameIdx;
	public static String TABLE_NAME = "SecGroup";
	public static String TABLE_DBNAME = "secgrp";

	public YCFSecSecGroupTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecGroupPKey, IYCFSecSecGroupObj>();
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
	}

	public YCFSecSecGroupTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecSecGroupPKey, IYCFSecSecGroupObj>();
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFSecSchemaObj)value;
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
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
		List<IYCFSecSecGroupObj> toForget = new LinkedList<IYCFSecSecGroupObj>();
		IYCFSecSecGroupObj cur = null;
		Iterator<IYCFSecSecGroupObj> iter = members.values().iterator();
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
	 *	YCFSecSecGroupObj.
	 */
	public IYCFSecSecGroupObj newInstance() {
		IYCFSecSecGroupObj inst = new YCFSecSecGroupObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecSecGroupObj.
	 */
	public IYCFSecSecGroupEditObj newEditInstance( IYCFSecSecGroupObj orig ) {
		IYCFSecSecGroupEditObj edit = new YCFSecSecGroupEditObj( orig );
		return( edit );
	}

	public IYCFSecSecGroupObj realiseSecGroup( IYCFSecSecGroupObj Obj ) {
		IYCFSecSecGroupObj obj = Obj;
		YCFSecSecGroupPKey pkey = obj.getPKey();
		IYCFSecSecGroupObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecGroupObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecSecGroupByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByClusterVisIdx != null ) {
				YCFSecSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.remove( keepObj.getPKey() );
					if( mapClusterVisIdx.size() <= 0 ) {
						indexByClusterVisIdx.remove( keyClusterVisIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecSecGroupByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClusterVisIdx != null ) {
				YCFSecSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allSecGroup != null ) {
				allSecGroup.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecGroup != null ) {
				allSecGroup.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecSecGroupByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClusterVisIdx != null ) {
				YCFSecSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecSecGroupObj createSecGroup( IYCFSecSecGroupObj Obj ) {
		IYCFSecSecGroupObj obj = Obj;
		YCFSecSecGroupBuff buff = obj.getSecGroupBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().createSecGroup(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecGroupObj readSecGroup( YCFSecSecGroupPKey pkey ) {
		return( readSecGroup( pkey, false ) );
	}

	public IYCFSecSecGroupObj readSecGroup( YCFSecSecGroupPKey pkey, boolean forceRead ) {
		IYCFSecSecGroupObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecGroupBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGroupId() );
			if( readBuff != null ) {
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGroupObj readCachedSecGroup( YCFSecSecGroupPKey pkey ) {
		IYCFSecSecGroupObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGroup( IYCFSecSecGroupObj obj )
	{
		final String S_ProcName = "YCFSecSecGroupTableObj.reallyDeepDisposeSecGroup() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecGroupPKey pkey = obj.getPKey();
		IYCFSecSecGroupObj existing = readCachedSecGroup( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecGroupByClusterIdxKey keyClusterIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGroupByClusterVisIdxKey keyClusterVisIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		keyClusterVisIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyClusterVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFSecSecGroupByUNameIdxKey keyUNameIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getSecGroupFormTableObj().deepDisposeSecGroupFormByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByIncludeIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpMembTableObj().deepDisposeSecGrpMembByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );

		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByClusterVisIdx != null ) {
			if( indexByClusterVisIdx.containsKey( keyClusterVisIdx ) ) {
				indexByClusterVisIdx.get( keyClusterVisIdx ).remove( pkey );
				if( indexByClusterVisIdx.get( keyClusterVisIdx ).size() <= 0 ) {
					indexByClusterVisIdx.remove( keyClusterVisIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeSecGroup( YCFSecSecGroupPKey pkey ) {
		IYCFSecSecGroupObj obj = readCachedSecGroup( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecGroupObj lockSecGroup( YCFSecSecGroupPKey pkey ) {
		IYCFSecSecGroupObj locked = null;
		YCFSecSecGroupBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGroupTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecGroupObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGroup", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecGroupObj> readAllSecGroup() {
		return( readAllSecGroup( false ) );
	}

	public List<IYCFSecSecGroupObj> readAllSecGroup( boolean forceRead ) {
		final String S_ProcName = "readAllSecGroup";
		if( ( allSecGroup == null ) || forceRead ) {
			Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> map = new HashMap<YCFSecSecGroupPKey,IYCFSecSecGroupObj>();
			allSecGroup = map;
			YCFSecSecGroupBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().readAllDerived( schema.getAuthorization() );
			YCFSecSecGroupBuff buff;
			IYCFSecSecGroupObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupObj realised = (IYCFSecSecGroupObj)obj.realise();
			}
		}
		int len = allSecGroup.size();
		IYCFSecSecGroupObj arr[] = new IYCFSecSecGroupObj[len];
		Iterator<IYCFSecSecGroupObj> valIter = allSecGroup.values().iterator();
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
		ArrayList<IYCFSecSecGroupObj> arrayList = new ArrayList<IYCFSecSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupObj> cmp = new Comparator<IYCFSecSecGroupObj>() {
			public int compare( IYCFSecSecGroupObj lhs, IYCFSecSecGroupObj rhs ) {
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
					YCFSecSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGroupObj> readCachedAllSecGroup() {
		final String S_ProcName = "readCachedAllSecGroup";
		ArrayList<IYCFSecSecGroupObj> arrayList = new ArrayList<IYCFSecSecGroupObj>();
		if( allSecGroup != null ) {
			int len = allSecGroup.size();
			IYCFSecSecGroupObj arr[] = new IYCFSecSecGroupObj[len];
			Iterator<IYCFSecSecGroupObj> valIter = allSecGroup.values().iterator();
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
		Comparator<IYCFSecSecGroupObj> cmp = new Comparator<IYCFSecSecGroupObj>() {
			public int compare( IYCFSecSecGroupObj lhs, IYCFSecSecGroupObj rhs ) {
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
					YCFSecSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGroupByIdIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public IYCFSecSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId, boolean forceRead )
	{
		YCFSecSecGroupPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		IYCFSecSecGroupObj obj = readSecGroup( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSecGroupObj> readSecGroupByClusterIdx( long ClusterId )
	{
		return( readSecGroupByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecSecGroupObj> readSecGroupByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupByClusterIdx";
		YCFSecSecGroupByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGroupByClusterIdxKey,
				Map< YCFSecSecGroupPKey, IYCFSecSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGroupPKey, IYCFSecSecGroupObj>();
			IYCFSecSecGroupObj obj;
			YCFSecSecGroupBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupObj realised = (IYCFSecSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGroupObj arr[] = new IYCFSecSecGroupObj[len];
		Iterator<IYCFSecSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGroupObj> arrayList = new ArrayList<IYCFSecSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupObj> cmp = new Comparator<IYCFSecSecGroupObj>() {
			public int compare( IYCFSecSecGroupObj lhs, IYCFSecSecGroupObj rhs ) {
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
					YCFSecSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		return( readSecGroupByClusterVisIdx( ClusterId,
			IsVisible,
			false ) );
	}

	public List<IYCFSecSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupByClusterVisIdx";
		YCFSecSecGroupByClusterVisIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> dict;
		if( indexByClusterVisIdx == null ) {
			indexByClusterVisIdx = new HashMap< YCFSecSecGroupByClusterVisIdxKey,
				Map< YCFSecSecGroupPKey, IYCFSecSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByClusterVisIdx.containsKey( key ) ) {
			dict = indexByClusterVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGroupPKey, IYCFSecSecGroupObj>();
			IYCFSecSecGroupObj obj;
			YCFSecSecGroupBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
			YCFSecSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupObj realised = (IYCFSecSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGroupObj arr[] = new IYCFSecSecGroupObj[len];
		Iterator<IYCFSecSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGroupObj> arrayList = new ArrayList<IYCFSecSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupObj> cmp = new Comparator<IYCFSecSecGroupObj>() {
			public int compare( IYCFSecSecGroupObj lhs, IYCFSecSecGroupObj rhs ) {
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
					YCFSecSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecGroupObj readSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		return( readSecGroupByUNameIdx( ClusterId,
			Name,
			false ) );
	}

	public IYCFSecSecGroupObj readSecGroupByUNameIdx( long ClusterId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFSecSecGroupByUNameIdxKey,
				IYCFSecSecGroupObj >();
		}
		YCFSecSecGroupByUNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		IYCFSecSecGroupObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFSecSecGroupBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
			if( buff != null ) {
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGroupObj readCachedSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		IYCFSecSecGroupObj obj = null;
		YCFSecSecGroupPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		obj = readCachedSecGroup( pkey );
		return( obj );
	}

	public List<IYCFSecSecGroupObj> readCachedSecGroupByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGroupByClusterIdx";
		YCFSecSecGroupByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecSecGroupObj> arrayList = new ArrayList<IYCFSecSecGroupObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecSecGroupObj arr[] = new IYCFSecSecGroupObj[len];
				Iterator<IYCFSecSecGroupObj> valIter = dict.values().iterator();
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
			IYCFSecSecGroupObj obj;
			Iterator<IYCFSecSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGroupObj> cmp = new Comparator<IYCFSecSecGroupObj>() {
			public int compare( IYCFSecSecGroupObj lhs, IYCFSecSecGroupObj rhs ) {
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
					YCFSecSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGroupObj> readCachedSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "readCachedSecGroupByClusterVisIdx";
		YCFSecSecGroupByClusterVisIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		ArrayList<IYCFSecSecGroupObj> arrayList = new ArrayList<IYCFSecSecGroupObj>();
		if( indexByClusterVisIdx != null ) {
			Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> dict;
			if( indexByClusterVisIdx.containsKey( key ) ) {
				dict = indexByClusterVisIdx.get( key );
				int len = dict.size();
				IYCFSecSecGroupObj arr[] = new IYCFSecSecGroupObj[len];
				Iterator<IYCFSecSecGroupObj> valIter = dict.values().iterator();
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
			IYCFSecSecGroupObj obj;
			Iterator<IYCFSecSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGroupObj> cmp = new Comparator<IYCFSecSecGroupObj>() {
			public int compare( IYCFSecSecGroupObj lhs, IYCFSecSecGroupObj rhs ) {
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
					YCFSecSecGroupPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecGroupObj readCachedSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		IYCFSecSecGroupObj obj = null;
		YCFSecSecGroupByUNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecGroupObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecGroupObj> valIter = members.values().iterator();
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

	public void deepDisposeSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		IYCFSecSecGroupObj obj = readCachedSecGroupByIdIdx( ClusterId,
				SecGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGroupByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGroupByClusterIdx";
		IYCFSecSecGroupObj obj;
		List<IYCFSecSecGroupObj> arrayList = readCachedSecGroupByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "deepDisposeSecGroupByClusterVisIdx";
		IYCFSecSecGroupObj obj;
		List<IYCFSecSecGroupObj> arrayList = readCachedSecGroupByClusterVisIdx( ClusterId,
				IsVisible );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		IYCFSecSecGroupObj obj = readCachedSecGroupByUNameIdx( ClusterId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecGroupObj updateSecGroup( IYCFSecSecGroupObj Obj ) {
		IYCFSecSecGroupObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().updateSecGroup( schema.getAuthorization(),
			Obj.getSecGroupBuff() );
		obj = (IYCFSecSecGroupObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGroup( IYCFSecSecGroupObj Obj ) {
		IYCFSecSecGroupObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroup( schema.getAuthorization(),
			obj.getSecGroupBuff() );
		Obj.forget();
	}

	public void deleteSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		YCFSecSecGroupPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		IYCFSecSecGroupObj obj = readSecGroup( pkey );
		if( obj != null ) {
			IYCFSecSecGroupEditObj editObj = (IYCFSecSecGroupEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecGroupEditObj)obj.beginEdit();
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
		deepDisposeSecGroupByIdIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGroupByClusterIdx( long ClusterId )
	{
		YCFSecSecGroupByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGroupByClusterIdxKey,
				Map< YCFSecSecGroupPKey, IYCFSecSecGroupObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> dict = indexByClusterIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecSecGroupObj> iter = dict.values().iterator();
			IYCFSecSecGroupObj obj;
			List<IYCFSecSecGroupObj> toForget = new LinkedList<IYCFSecSecGroupObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGroupByClusterIdx( ClusterId );
	}

	public void deleteSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		YCFSecSecGroupByClusterVisIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		if( indexByClusterVisIdx == null ) {
			indexByClusterVisIdx = new HashMap< YCFSecSecGroupByClusterVisIdxKey,
				Map< YCFSecSecGroupPKey, IYCFSecSecGroupObj > >();
		}
		if( indexByClusterVisIdx.containsKey( key ) ) {
			Map<YCFSecSecGroupPKey, IYCFSecSecGroupObj> dict = indexByClusterVisIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
			Iterator<IYCFSecSecGroupObj> iter = dict.values().iterator();
			IYCFSecSecGroupObj obj;
			List<IYCFSecSecGroupObj> toForget = new LinkedList<IYCFSecSecGroupObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterVisIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
		}
		deepDisposeSecGroupByClusterVisIdx( ClusterId,
				IsVisible );
	}

	public void deleteSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFSecSecGroupByUNameIdxKey,
				IYCFSecSecGroupObj >();
		}
		YCFSecSecGroupByUNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		IYCFSecSecGroupObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
		}
		deepDisposeSecGroupByUNameIdx( ClusterId,
				Name );
	}
}
