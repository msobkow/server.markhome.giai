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

public class YCFSecTSecGrpMembTableObj
	implements IYCFSecTSecGrpMembTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> members;
	private Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> allTSecGrpMemb;
	private Map< YCFSecTSecGrpMembByTenantIdxKey,
		Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > > indexByTenantIdx;
	private Map< YCFSecTSecGrpMembByGroupIdxKey,
		Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > > indexByGroupIdx;
	private Map< YCFSecTSecGrpMembByUserIdxKey,
		Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > > indexByUserIdx;
	private Map< YCFSecTSecGrpMembByUUserIdxKey,
		IYCFSecTSecGrpMembObj > indexByUUserIdx;
	public static String TABLE_NAME = "TSecGrpMemb";
	public static String TABLE_DBNAME = "tsecmemb";

	public YCFSecTSecGrpMembTableObj() {
		schema = null;
		members = new HashMap<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj>();
		allTSecGrpMemb = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public YCFSecTSecGrpMembTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj>();
		allTSecGrpMemb = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
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
		allTSecGrpMemb = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
		List<IYCFSecTSecGrpMembObj> toForget = new LinkedList<IYCFSecTSecGrpMembObj>();
		IYCFSecTSecGrpMembObj cur = null;
		Iterator<IYCFSecTSecGrpMembObj> iter = members.values().iterator();
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
	 *	YCFSecTSecGrpMembObj.
	 */
	public IYCFSecTSecGrpMembObj newInstance() {
		IYCFSecTSecGrpMembObj inst = new YCFSecTSecGrpMembObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecTSecGrpMembObj.
	 */
	public IYCFSecTSecGrpMembEditObj newEditInstance( IYCFSecTSecGrpMembObj orig ) {
		IYCFSecTSecGrpMembEditObj edit = new YCFSecTSecGrpMembEditObj( orig );
		return( edit );
	}

	public IYCFSecTSecGrpMembObj realiseTSecGrpMemb( IYCFSecTSecGrpMembObj Obj ) {
		IYCFSecTSecGrpMembObj obj = Obj;
		YCFSecTSecGrpMembPKey pkey = obj.getPKey();
		IYCFSecTSecGrpMembObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecTSecGrpMembObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFSecTSecGrpMembByTenantIdxKey keyTenantIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecTSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByUserIdx != null ) {
				YCFSecTSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			if( indexByUUserIdx != null ) {
				YCFSecTSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUUserIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.remove( keyUUserIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFSecTSecGrpMembByTenantIdxKey keyTenantIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecTSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFSecTSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFSecTSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUUserIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.put( keyUUserIdx, keepObj );
			}

			if( allTSecGrpMemb != null ) {
				allTSecGrpMemb.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTSecGrpMemb != null ) {
				allTSecGrpMemb.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFSecTSecGrpMembByTenantIdxKey keyTenantIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecTSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFSecTSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFSecTSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUUserIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.put( keyUUserIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecTSecGrpMembObj createTSecGrpMemb( IYCFSecTSecGrpMembObj Obj ) {
		IYCFSecTSecGrpMembObj obj = Obj;
		YCFSecTSecGrpMembBuff buff = obj.getTSecGrpMembBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().createTSecGrpMemb(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecTSecGrpMembObj readTSecGrpMemb( YCFSecTSecGrpMembPKey pkey ) {
		return( readTSecGrpMemb( pkey, false ) );
	}

	public IYCFSecTSecGrpMembObj readTSecGrpMemb( YCFSecTSecGrpMembPKey pkey, boolean forceRead ) {
		IYCFSecTSecGrpMembObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecTSecGrpMembBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGrpMembId() );
			if( readBuff != null ) {
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecTSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTSecGrpMembObj readCachedTSecGrpMemb( YCFSecTSecGrpMembPKey pkey ) {
		IYCFSecTSecGrpMembObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGrpMemb( IYCFSecTSecGrpMembObj obj )
	{
		final String S_ProcName = "YCFSecTSecGrpMembTableObj.reallyDeepDisposeTSecGrpMemb() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecTSecGrpMembPKey pkey = obj.getPKey();
		IYCFSecTSecGrpMembObj existing = readCachedTSecGrpMemb( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecTSecGrpMembByTenantIdxKey keyTenantIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGrpMembByGroupIdxKey keyGroupIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFSecTSecGrpMembByUserIdxKey keyUserIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecTSecGrpMembByUUserIdxKey keyUUserIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUUserIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByGroupIdx != null ) {
			if( indexByGroupIdx.containsKey( keyGroupIdx ) ) {
				indexByGroupIdx.get( keyGroupIdx ).remove( pkey );
				if( indexByGroupIdx.get( keyGroupIdx ).size() <= 0 ) {
					indexByGroupIdx.remove( keyGroupIdx );
				}
			}
		}

		if( indexByUserIdx != null ) {
			if( indexByUserIdx.containsKey( keyUserIdx ) ) {
				indexByUserIdx.get( keyUserIdx ).remove( pkey );
				if( indexByUserIdx.get( keyUserIdx ).size() <= 0 ) {
					indexByUserIdx.remove( keyUserIdx );
				}
			}
		}

		if( indexByUUserIdx != null ) {
			indexByUUserIdx.remove( keyUUserIdx );
		}


	}
	public void deepDisposeTSecGrpMemb( YCFSecTSecGrpMembPKey pkey ) {
		IYCFSecTSecGrpMembObj obj = readCachedTSecGrpMemb( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecTSecGrpMembObj lockTSecGrpMemb( YCFSecTSecGrpMembPKey pkey ) {
		IYCFSecTSecGrpMembObj locked = null;
		YCFSecTSecGrpMembBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGrpMembTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecTSecGrpMembObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTSecGrpMemb", pkey );
		}
		return( locked );
	}

	public List<IYCFSecTSecGrpMembObj> readAllTSecGrpMemb() {
		return( readAllTSecGrpMemb( false ) );
	}

	public List<IYCFSecTSecGrpMembObj> readAllTSecGrpMemb( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGrpMemb";
		if( ( allTSecGrpMemb == null ) || forceRead ) {
			Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> map = new HashMap<YCFSecTSecGrpMembPKey,IYCFSecTSecGrpMembObj>();
			allTSecGrpMemb = map;
			YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().readAllDerived( schema.getAuthorization() );
			YCFSecTSecGrpMembBuff buff;
			IYCFSecTSecGrpMembObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpMembObj realised = (IYCFSecTSecGrpMembObj)obj.realise();
			}
		}
		int len = allTSecGrpMemb.size();
		IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
		Iterator<IYCFSecTSecGrpMembObj> valIter = allTSecGrpMemb.values().iterator();
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
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGrpMembObj> readCachedAllTSecGrpMemb() {
		final String S_ProcName = "readCachedAllTSecGrpMemb";
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>();
		if( allTSecGrpMemb != null ) {
			int len = allTSecGrpMemb.size();
			IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
			Iterator<IYCFSecTSecGrpMembObj> valIter = allTSecGrpMemb.values().iterator();
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
		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the TSecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecTSecGrpMembObj> pageAllTSecGrpMemb(Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageAllTSecGrpMemb";
		Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> map = new HashMap<YCFSecTSecGrpMembPKey,IYCFSecTSecGrpMembObj>();
		YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageAllBuff( schema.getAuthorization(),
			priorTenantId,
			priorTSecGrpMembId );
		YCFSecTSecGrpMembBuff buff;
		IYCFSecTSecGrpMembObj obj;
		IYCFSecTSecGrpMembObj realised;
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecTSecGrpMembObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId )
	{
		return( readTSecGrpMembByIdIdx( TenantId,
			TSecGrpMembId,
			false ) );
	}

	public IYCFSecTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId, boolean forceRead )
	{
		YCFSecTSecGrpMembPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpMembId( TSecGrpMembId );
		IYCFSecTSecGrpMembObj obj = readTSecGrpMemb( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId )
	{
		return( readTSecGrpMembByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFSecTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpMembByTenantIdx";
		YCFSecTSecGrpMembByTenantIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFSecTSecGrpMembByTenantIdxKey,
				Map< YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj>();
			IYCFSecTSecGrpMembObj obj;
			YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFSecTSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpMembObj realised = (IYCFSecTSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
		Iterator<IYCFSecTSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGrpMembByGroupIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public List<IYCFSecTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpMembByGroupIdx";
		YCFSecTSecGrpMembByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecTSecGrpMembByGroupIdxKey,
				Map< YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj>();
			IYCFSecTSecGrpMembObj obj;
			YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			YCFSecTSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpMembObj realised = (IYCFSecTSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
		Iterator<IYCFSecTSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId )
	{
		return( readTSecGrpMembByUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFSecTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpMembByUserIdx";
		YCFSecTSecGrpMembByUserIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFSecTSecGrpMembByUserIdxKey,
				Map< YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj>();
			IYCFSecTSecGrpMembObj obj;
			YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFSecTSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpMembObj realised = (IYCFSecTSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
		Iterator<IYCFSecTSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecTSecGrpMembObj readTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		return( readTSecGrpMembByUUserIdx( TenantId,
			TSecGroupId,
			SecUserId,
			false ) );
	}

	public IYCFSecTSecGrpMembObj readTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId, boolean forceRead )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFSecTSecGrpMembByUUserIdxKey,
				IYCFSecTSecGrpMembObj >();
		}
		YCFSecTSecGrpMembByUUserIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFSecTSecGrpMembObj obj = null;
		if( ( ! forceRead ) && indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
		}
		else {
			YCFSecTSecGrpMembBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByUUserIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				SecUserId );
			if( buff != null ) {
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecTSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTSecGrpMembObj readCachedTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId )
	{
		IYCFSecTSecGrpMembObj obj = null;
		YCFSecTSecGrpMembPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpMembId( TSecGrpMembId );
		obj = readCachedTSecGrpMemb( pkey );
		return( obj );
	}

	public List<IYCFSecTSecGrpMembObj> readCachedTSecGrpMembByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGrpMembByTenantIdx";
		YCFSecTSecGrpMembByTenantIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
				Iterator<IYCFSecTSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGrpMembObj obj;
			Iterator<IYCFSecTSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecTSecGrpMembObj> readCachedTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpMembByGroupIdx";
		YCFSecTSecGrpMembByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
				Iterator<IYCFSecTSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGrpMembObj obj;
			Iterator<IYCFSecTSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecTSecGrpMembObj> readCachedTSecGrpMembByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedTSecGrpMembByUserIdx";
		YCFSecTSecGrpMembByUserIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFSecTSecGrpMembObj> arrayList = new ArrayList<IYCFSecTSecGrpMembObj>();
		if( indexByUserIdx != null ) {
			Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGrpMembObj arr[] = new IYCFSecTSecGrpMembObj[len];
				Iterator<IYCFSecTSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGrpMembObj obj;
			Iterator<IYCFSecTSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGrpMembObj> cmp = new Comparator<IYCFSecTSecGrpMembObj>() {
			public int compare( IYCFSecTSecGrpMembObj lhs, IYCFSecTSecGrpMembObj rhs ) {
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
					YCFSecTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecTSecGrpMembObj readCachedTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		IYCFSecTSecGrpMembObj obj = null;
		YCFSecTSecGrpMembByUUserIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );
		if( indexByUUserIdx != null ) {
			if( indexByUUserIdx.containsKey( key ) ) {
				obj = indexByUUserIdx.get( key );
			}
			else {
				Iterator<IYCFSecTSecGrpMembObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecTSecGrpMembObj> valIter = members.values().iterator();
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

	public void deepDisposeTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId )
	{
		IYCFSecTSecGrpMembObj obj = readCachedTSecGrpMembByIdIdx( TenantId,
				TSecGrpMembId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGrpMembByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGrpMembByTenantIdx";
		IYCFSecTSecGrpMembObj obj;
		List<IYCFSecTSecGrpMembObj> arrayList = readCachedTSecGrpMembByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGrpMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "deepDisposeTSecGrpMembByGroupIdx";
		IYCFSecTSecGrpMembObj obj;
		List<IYCFSecTSecGrpMembObj> arrayList = readCachedTSecGrpMembByGroupIdx( TenantId,
				TSecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGrpMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpMembByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeTSecGrpMembByUserIdx";
		IYCFSecTSecGrpMembObj obj;
		List<IYCFSecTSecGrpMembObj> arrayList = readCachedTSecGrpMembByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGrpMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		IYCFSecTSecGrpMembObj obj = readCachedTSecGrpMembByUUserIdx( TenantId,
				TSecGroupId,
				SecUserId );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TenantIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecTSecGrpMembObj> pageTSecGrpMembByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageTSecGrpMembByTenantIdx";
		YCFSecTSecGrpMembByTenantIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		List<IYCFSecTSecGrpMembObj> retList = new LinkedList<IYCFSecTSecGrpMembObj>();
		IYCFSecTSecGrpMembObj obj;
		YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageBuffByTenantIdx( schema.getAuthorization(),
				TenantId,
			priorTenantId,
			priorTSecGrpMembId );
		YCFSecTSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFSecTSecGrpMembObj realised = (IYCFSecTSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecTSecGrpMembObj> pageTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageTSecGrpMembByGroupIdx";
		YCFSecTSecGrpMembByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		List<IYCFSecTSecGrpMembObj> retList = new LinkedList<IYCFSecTSecGrpMembObj>();
		IYCFSecTSecGrpMembObj obj;
		YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageBuffByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
			priorTenantId,
			priorTSecGrpMembId );
		YCFSecTSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFSecTSecGrpMembObj realised = (IYCFSecTSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecTSecGrpMembObj> pageTSecGrpMembByUserIdx( UUID SecUserId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageTSecGrpMembByUserIdx";
		YCFSecTSecGrpMembByUserIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFSecTSecGrpMembObj> retList = new LinkedList<IYCFSecTSecGrpMembObj>();
		IYCFSecTSecGrpMembObj obj;
		YCFSecTSecGrpMembBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorTenantId,
			priorTSecGrpMembId );
		YCFSecTSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFSecTSecGrpMembObj realised = (IYCFSecTSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecTSecGrpMembObj updateTSecGrpMemb( IYCFSecTSecGrpMembObj Obj ) {
		IYCFSecTSecGrpMembObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().updateTSecGrpMemb( schema.getAuthorization(),
			Obj.getTSecGrpMembBuff() );
		obj = (IYCFSecTSecGrpMembObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGrpMemb( IYCFSecTSecGrpMembObj Obj ) {
		IYCFSecTSecGrpMembObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMemb( schema.getAuthorization(),
			obj.getTSecGrpMembBuff() );
		Obj.forget();
	}

	public void deleteTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId )
	{
		YCFSecTSecGrpMembPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpMembId( TSecGrpMembId );
		IYCFSecTSecGrpMembObj obj = readTSecGrpMemb( pkey );
		if( obj != null ) {
			IYCFSecTSecGrpMembEditObj editObj = (IYCFSecTSecGrpMembEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecTSecGrpMembEditObj)obj.beginEdit();
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
		deepDisposeTSecGrpMembByIdIdx( TenantId,
				TSecGrpMembId );
	}

	public void deleteTSecGrpMembByTenantIdx( long TenantId )
	{
		YCFSecTSecGrpMembByTenantIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFSecTSecGrpMembByTenantIdxKey,
				Map< YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict = indexByTenantIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFSecTSecGrpMembObj> iter = dict.values().iterator();
			IYCFSecTSecGrpMembObj obj;
			List<IYCFSecTSecGrpMembObj> toForget = new LinkedList<IYCFSecTSecGrpMembObj>();
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
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGrpMembByTenantIdx( TenantId );
	}

	public void deleteTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		YCFSecTSecGrpMembByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecTSecGrpMembByGroupIdxKey,
				Map< YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict = indexByGroupIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			Iterator<IYCFSecTSecGrpMembObj> iter = dict.values().iterator();
			IYCFSecTSecGrpMembObj obj;
			List<IYCFSecTSecGrpMembObj> toForget = new LinkedList<IYCFSecTSecGrpMembObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGroupIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
		}
		deepDisposeTSecGrpMembByGroupIdx( TenantId,
				TSecGroupId );
	}

	public void deleteTSecGrpMembByUserIdx( UUID SecUserId )
	{
		YCFSecTSecGrpMembByUserIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFSecTSecGrpMembByUserIdxKey,
				Map< YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<YCFSecTSecGrpMembPKey, IYCFSecTSecGrpMembObj> dict = indexByUserIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFSecTSecGrpMembObj> iter = dict.values().iterator();
			IYCFSecTSecGrpMembObj obj;
			List<IYCFSecTSecGrpMembObj> toForget = new LinkedList<IYCFSecTSecGrpMembObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByUserIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeTSecGrpMembByUserIdx( SecUserId );
	}

	public void deleteTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFSecTSecGrpMembByUUserIdxKey,
				IYCFSecTSecGrpMembObj >();
		}
		YCFSecTSecGrpMembByUUserIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFSecTSecGrpMembObj obj = null;
		if( indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUUserIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				SecUserId );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUUserIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				SecUserId );
		}
		deepDisposeTSecGrpMembByUUserIdx( TenantId,
				TSecGroupId,
				SecUserId );
	}
}
