// Description: Java 11 Table Object implementation for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntSecGrpMembTableObj
	implements IYCFIntSecGrpMembTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> members;
	private Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> allSecGrpMemb;
	private Map< YCFSecSecGrpMembByClusterIdxKey,
		Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > > indexByClusterIdx;
	private Map< YCFSecSecGrpMembByGroupIdxKey,
		Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > > indexByGroupIdx;
	private Map< YCFSecSecGrpMembByUserIdxKey,
		Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > > indexByUserIdx;
	private Map< YCFSecSecGrpMembByUUserIdxKey,
		IYCFSecSecGrpMembObj > indexByUUserIdx;
	public static String TABLE_NAME = "SecGrpMemb";
	public static String TABLE_DBNAME = "secmemb";

	public YCFIntSecGrpMembTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj>();
		allSecGrpMemb = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public YCFIntSecGrpMembTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj>();
		allSecGrpMemb = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFIntSchemaObj)value;
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
		allSecGrpMemb = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
		List<IYCFSecSecGrpMembObj> toForget = new LinkedList<IYCFSecSecGrpMembObj>();
		IYCFSecSecGrpMembObj cur = null;
		Iterator<IYCFSecSecGrpMembObj> iter = members.values().iterator();
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
	 *	YCFIntSecGrpMembObj.
	 */
	public IYCFSecSecGrpMembObj newInstance() {
		IYCFSecSecGrpMembObj inst = new YCFIntSecGrpMembObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntSecGrpMembObj.
	 */
	public IYCFSecSecGrpMembEditObj newEditInstance( IYCFSecSecGrpMembObj orig ) {
		IYCFSecSecGrpMembEditObj edit = new YCFIntSecGrpMembEditObj( orig );
		return( edit );
	}

	public IYCFSecSecGrpMembObj realiseSecGrpMemb( IYCFSecSecGrpMembObj Obj ) {
		IYCFSecSecGrpMembObj obj = Obj;
		YCFSecSecGrpMembPKey pkey = obj.getPKey();
		IYCFSecSecGrpMembObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecGrpMembObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecSecGrpMembByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByUserIdx != null ) {
				YCFSecSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			if( indexByUUserIdx != null ) {
				YCFSecSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUUserIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.remove( keyUUserIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecSecGrpMembByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFSecSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFSecSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUUserIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.put( keyUUserIdx, keepObj );
			}

			if( allSecGrpMemb != null ) {
				allSecGrpMemb.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecGrpMemb != null ) {
				allSecGrpMemb.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecSecGrpMembByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFSecSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFSecSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUUserIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.put( keyUUserIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecSecGrpMembObj createSecGrpMemb( IYCFSecSecGrpMembObj Obj ) {
		IYCFSecSecGrpMembObj obj = Obj;
		YCFSecSecGrpMembBuff buff = obj.getSecGrpMembBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().createSecGrpMemb(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecGrpMembObj readSecGrpMemb( YCFSecSecGrpMembPKey pkey ) {
		return( readSecGrpMemb( pkey, false ) );
	}

	public IYCFSecSecGrpMembObj readSecGrpMemb( YCFSecSecGrpMembPKey pkey, boolean forceRead ) {
		IYCFSecSecGrpMembObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecGrpMembBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGrpMembId() );
			if( readBuff != null ) {
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGrpMembObj readCachedSecGrpMemb( YCFSecSecGrpMembPKey pkey ) {
		IYCFSecSecGrpMembObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGrpMemb( IYCFSecSecGrpMembObj obj )
	{
		final String S_ProcName = "YCFIntSecGrpMembTableObj.reallyDeepDisposeSecGrpMemb() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecGrpMembPKey pkey = obj.getPKey();
		IYCFSecSecGrpMembObj existing = readCachedSecGrpMemb( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecGrpMembByClusterIdxKey keyClusterIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGrpMembByGroupIdxKey keyGroupIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGrpMembByUserIdxKey keyUserIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecGrpMembByUUserIdxKey keyUUserIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUUserIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );



		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
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
	public void deepDisposeSecGrpMemb( YCFSecSecGrpMembPKey pkey ) {
		IYCFSecSecGrpMembObj obj = readCachedSecGrpMemb( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecGrpMembObj lockSecGrpMemb( YCFSecSecGrpMembPKey pkey ) {
		IYCFSecSecGrpMembObj locked = null;
		YCFSecSecGrpMembBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGrpMembTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecGrpMembObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGrpMemb", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecGrpMembObj> readAllSecGrpMemb() {
		return( readAllSecGrpMemb( false ) );
	}

	public List<IYCFSecSecGrpMembObj> readAllSecGrpMemb( boolean forceRead ) {
		final String S_ProcName = "readAllSecGrpMemb";
		if( ( allSecGrpMemb == null ) || forceRead ) {
			Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> map = new HashMap<YCFSecSecGrpMembPKey,IYCFSecSecGrpMembObj>();
			allSecGrpMemb = map;
			YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().readAllDerived( schema.getAuthorization() );
			YCFSecSecGrpMembBuff buff;
			IYCFSecSecGrpMembObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpMembObj realised = (IYCFSecSecGrpMembObj)obj.realise();
			}
		}
		int len = allSecGrpMemb.size();
		IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
		Iterator<IYCFSecSecGrpMembObj> valIter = allSecGrpMemb.values().iterator();
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
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGrpMembObj> readCachedAllSecGrpMemb() {
		final String S_ProcName = "readCachedAllSecGrpMemb";
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>();
		if( allSecGrpMemb != null ) {
			int len = allSecGrpMemb.size();
			IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
			Iterator<IYCFSecSecGrpMembObj> valIter = allSecGrpMemb.values().iterator();
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
		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecGrpMembObj> pageAllSecGrpMemb(Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageAllSecGrpMemb";
		Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> map = new HashMap<YCFSecSecGrpMembPKey,IYCFSecSecGrpMembObj>();
		YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecGrpMembId );
		YCFSecSecGrpMembBuff buff;
		IYCFSecSecGrpMembObj obj;
		IYCFSecSecGrpMembObj realised;
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecGrpMembObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		return( readSecGrpMembByIdIdx( ClusterId,
			SecGrpMembId,
			false ) );
	}

	public IYCFSecSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId, boolean forceRead )
	{
		YCFSecSecGrpMembPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		IYCFSecSecGrpMembObj obj = readSecGrpMemb( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId )
	{
		return( readSecGrpMembByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByClusterIdx";
		YCFSecSecGrpMembByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGrpMembByClusterIdxKey,
				Map< YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj>();
			IYCFSecSecGrpMembObj obj;
			YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpMembObj realised = (IYCFSecSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
		Iterator<IYCFSecSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGrpMembByGroupIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public List<IYCFSecSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByGroupIdx";
		YCFSecSecGrpMembByGroupIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecSecGrpMembByGroupIdxKey,
				Map< YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj>();
			IYCFSecSecGrpMembObj obj;
			YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			YCFSecSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpMembObj realised = (IYCFSecSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
		Iterator<IYCFSecSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId )
	{
		return( readSecGrpMembByUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFSecSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByUserIdx";
		YCFSecSecGrpMembByUserIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFSecSecGrpMembByUserIdxKey,
				Map< YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj>();
			IYCFSecSecGrpMembObj obj;
			YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFSecSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpMembObj realised = (IYCFSecSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
		Iterator<IYCFSecSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecGrpMembObj readSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		return( readSecGrpMembByUUserIdx( ClusterId,
			SecGroupId,
			SecUserId,
			false ) );
	}

	public IYCFSecSecGrpMembObj readSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId, boolean forceRead )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFSecSecGrpMembByUUserIdxKey,
				IYCFSecSecGrpMembObj >();
		}
		YCFSecSecGrpMembByUUserIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFSecSecGrpMembObj obj = null;
		if( ( ! forceRead ) && indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
		}
		else {
			YCFSecSecGrpMembBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
			if( buff != null ) {
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGrpMembObj readCachedSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		IYCFSecSecGrpMembObj obj = null;
		YCFSecSecGrpMembPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		obj = readCachedSecGrpMemb( pkey );
		return( obj );
	}

	public List<IYCFSecSecGrpMembObj> readCachedSecGrpMembByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGrpMembByClusterIdx";
		YCFSecSecGrpMembByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
				Iterator<IYCFSecSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFSecSecGrpMembObj obj;
			Iterator<IYCFSecSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGrpMembObj> readCachedSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "readCachedSecGrpMembByGroupIdx";
		YCFSecSecGrpMembByGroupIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
				Iterator<IYCFSecSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFSecSecGrpMembObj obj;
			Iterator<IYCFSecSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGrpMembObj> readCachedSecGrpMembByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecGrpMembByUserIdx";
		YCFSecSecGrpMembByUserIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFSecSecGrpMembObj> arrayList = new ArrayList<IYCFSecSecGrpMembObj>();
		if( indexByUserIdx != null ) {
			Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				IYCFSecSecGrpMembObj arr[] = new IYCFSecSecGrpMembObj[len];
				Iterator<IYCFSecSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFSecSecGrpMembObj obj;
			Iterator<IYCFSecSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGrpMembObj> cmp = new Comparator<IYCFSecSecGrpMembObj>() {
			public int compare( IYCFSecSecGrpMembObj lhs, IYCFSecSecGrpMembObj rhs ) {
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
					YCFSecSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecGrpMembObj readCachedSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		IYCFSecSecGrpMembObj obj = null;
		YCFSecSecGrpMembByUUserIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		if( indexByUUserIdx != null ) {
			if( indexByUUserIdx.containsKey( key ) ) {
				obj = indexByUUserIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecGrpMembObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecGrpMembObj> valIter = members.values().iterator();
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

	public void deepDisposeSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		IYCFSecSecGrpMembObj obj = readCachedSecGrpMembByIdIdx( ClusterId,
				SecGrpMembId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGrpMembByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGrpMembByClusterIdx";
		IYCFSecSecGrpMembObj obj;
		List<IYCFSecSecGrpMembObj> arrayList = readCachedSecGrpMembByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGrpMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "deepDisposeSecGrpMembByGroupIdx";
		IYCFSecSecGrpMembObj obj;
		List<IYCFSecSecGrpMembObj> arrayList = readCachedSecGrpMembByGroupIdx( ClusterId,
				SecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGrpMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGrpMembByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeSecGrpMembByUserIdx";
		IYCFSecSecGrpMembObj obj;
		List<IYCFSecSecGrpMembObj> arrayList = readCachedSecGrpMembByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGrpMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		IYCFSecSecGrpMembObj obj = readCachedSecGrpMembByUUserIdx( ClusterId,
				SecGroupId,
				SecUserId );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of SecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGrpMembObj> pageSecGrpMembByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByClusterIdx";
		YCFSecSecGrpMembByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecSecGrpMembObj> retList = new LinkedList<IYCFSecSecGrpMembObj>();
		IYCFSecSecGrpMembObj obj;
		YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecGrpMembId );
		YCFSecSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGrpMembObj realised = (IYCFSecSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGrpMembObj> pageSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByGroupIdx";
		YCFSecSecGrpMembByGroupIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		List<IYCFSecSecGrpMembObj> retList = new LinkedList<IYCFSecSecGrpMembObj>();
		IYCFSecSecGrpMembObj obj;
		YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
			priorClusterId,
			priorSecGrpMembId );
		YCFSecSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGrpMembObj realised = (IYCFSecSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGrpMembObj> pageSecGrpMembByUserIdx( UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByUserIdx";
		YCFSecSecGrpMembByUserIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFSecSecGrpMembObj> retList = new LinkedList<IYCFSecSecGrpMembObj>();
		IYCFSecSecGrpMembObj obj;
		YCFSecSecGrpMembBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorClusterId,
			priorSecGrpMembId );
		YCFSecSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGrpMembObj realised = (IYCFSecSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecGrpMembObj updateSecGrpMemb( IYCFSecSecGrpMembObj Obj ) {
		IYCFSecSecGrpMembObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().updateSecGrpMemb( schema.getAuthorization(),
			Obj.getSecGrpMembBuff() );
		obj = (IYCFSecSecGrpMembObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGrpMemb( IYCFSecSecGrpMembObj Obj ) {
		IYCFSecSecGrpMembObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMemb( schema.getAuthorization(),
			obj.getSecGrpMembBuff() );
		Obj.forget();
	}

	public void deleteSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		YCFSecSecGrpMembPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		IYCFSecSecGrpMembObj obj = readSecGrpMemb( pkey );
		if( obj != null ) {
			IYCFSecSecGrpMembEditObj editObj = (IYCFSecSecGrpMembEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecGrpMembEditObj)obj.beginEdit();
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
		deepDisposeSecGrpMembByIdIdx( ClusterId,
				SecGrpMembId );
	}

	public void deleteSecGrpMembByClusterIdx( long ClusterId )
	{
		YCFSecSecGrpMembByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGrpMembByClusterIdxKey,
				Map< YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict = indexByClusterIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecSecGrpMembObj> iter = dict.values().iterator();
			IYCFSecSecGrpMembObj obj;
			List<IYCFSecSecGrpMembObj> toForget = new LinkedList<IYCFSecSecGrpMembObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGrpMembByClusterIdx( ClusterId );
	}

	public void deleteSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		YCFSecSecGrpMembByGroupIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecSecGrpMembByGroupIdxKey,
				Map< YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict = indexByGroupIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			Iterator<IYCFSecSecGrpMembObj> iter = dict.values().iterator();
			IYCFSecSecGrpMembObj obj;
			List<IYCFSecSecGrpMembObj> toForget = new LinkedList<IYCFSecSecGrpMembObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
		}
		deepDisposeSecGrpMembByGroupIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGrpMembByUserIdx( UUID SecUserId )
	{
		YCFSecSecGrpMembByUserIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFSecSecGrpMembByUserIdxKey,
				Map< YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<YCFSecSecGrpMembPKey, IYCFSecSecGrpMembObj> dict = indexByUserIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFSecSecGrpMembObj> iter = dict.values().iterator();
			IYCFSecSecGrpMembObj obj;
			List<IYCFSecSecGrpMembObj> toForget = new LinkedList<IYCFSecSecGrpMembObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecGrpMembByUserIdx( SecUserId );
	}

	public void deleteSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFSecSecGrpMembByUUserIdxKey,
				IYCFSecSecGrpMembObj >();
		}
		YCFSecSecGrpMembByUUserIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFSecSecGrpMembObj obj = null;
		if( indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
		}
		deepDisposeSecGrpMembByUUserIdx( ClusterId,
				SecGroupId,
				SecUserId );
	}
}
