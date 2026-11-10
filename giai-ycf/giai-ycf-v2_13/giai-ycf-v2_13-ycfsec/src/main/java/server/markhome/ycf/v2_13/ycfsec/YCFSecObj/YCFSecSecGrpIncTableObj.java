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

public class YCFSecSecGrpIncTableObj
	implements IYCFSecSecGrpIncTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> members;
	private Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> allSecGrpInc;
	private Map< YCFSecSecGrpIncByClusterIdxKey,
		Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > > indexByClusterIdx;
	private Map< YCFSecSecGrpIncByGroupIdxKey,
		Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > > indexByGroupIdx;
	private Map< YCFSecSecGrpIncByIncludeIdxKey,
		Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > > indexByIncludeIdx;
	private Map< YCFSecSecGrpIncByUIncludeIdxKey,
		IYCFSecSecGrpIncObj > indexByUIncludeIdx;
	public static String TABLE_NAME = "SecGrpInc";
	public static String TABLE_DBNAME = "secinc";

	public YCFSecSecGrpIncTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj>();
		allSecGrpInc = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
	}

	public YCFSecSecGrpIncTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj>();
		allSecGrpInc = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
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
		allSecGrpInc = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
		List<IYCFSecSecGrpIncObj> toForget = new LinkedList<IYCFSecSecGrpIncObj>();
		IYCFSecSecGrpIncObj cur = null;
		Iterator<IYCFSecSecGrpIncObj> iter = members.values().iterator();
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
	 *	YCFSecSecGrpIncObj.
	 */
	public IYCFSecSecGrpIncObj newInstance() {
		IYCFSecSecGrpIncObj inst = new YCFSecSecGrpIncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecSecGrpIncObj.
	 */
	public IYCFSecSecGrpIncEditObj newEditInstance( IYCFSecSecGrpIncObj orig ) {
		IYCFSecSecGrpIncEditObj edit = new YCFSecSecGrpIncEditObj( orig );
		return( edit );
	}

	public IYCFSecSecGrpIncObj realiseSecGrpInc( IYCFSecSecGrpIncObj Obj ) {
		IYCFSecSecGrpIncObj obj = Obj;
		YCFSecSecGrpIncPKey pkey = obj.getPKey();
		IYCFSecSecGrpIncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecGrpIncObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecSecGrpIncByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFSecSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.remove( keepObj.getPKey() );
					if( mapIncludeIdx.size() <= 0 ) {
						indexByIncludeIdx.remove( keyIncludeIdx );
					}
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFSecSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUIncludeIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.remove( keyUIncludeIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecSecGrpIncByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFSecSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFSecSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUIncludeIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

			if( allSecGrpInc != null ) {
				allSecGrpInc.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecGrpInc != null ) {
				allSecGrpInc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecSecGrpIncByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFSecSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFSecSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUIncludeIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecSecGrpIncObj createSecGrpInc( IYCFSecSecGrpIncObj Obj ) {
		IYCFSecSecGrpIncObj obj = Obj;
		YCFSecSecGrpIncBuff buff = obj.getSecGrpIncBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().createSecGrpInc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecGrpIncObj readSecGrpInc( YCFSecSecGrpIncPKey pkey ) {
		return( readSecGrpInc( pkey, false ) );
	}

	public IYCFSecSecGrpIncObj readSecGrpInc( YCFSecSecGrpIncPKey pkey, boolean forceRead ) {
		IYCFSecSecGrpIncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecGrpIncBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGrpIncId() );
			if( readBuff != null ) {
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGrpIncObj readCachedSecGrpInc( YCFSecSecGrpIncPKey pkey ) {
		IYCFSecSecGrpIncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGrpInc( IYCFSecSecGrpIncObj obj )
	{
		final String S_ProcName = "YCFSecSecGrpIncTableObj.reallyDeepDisposeSecGrpInc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecGrpIncPKey pkey = obj.getPKey();
		IYCFSecSecGrpIncObj existing = readCachedSecGrpInc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecGrpIncByClusterIdxKey keyClusterIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGrpIncByGroupIdxKey keyGroupIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGrpIncByIncludeIdxKey keyIncludeIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecSecGrpIncByUIncludeIdxKey keyUIncludeIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUIncludeIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );



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

		if( indexByIncludeIdx != null ) {
			if( indexByIncludeIdx.containsKey( keyIncludeIdx ) ) {
				indexByIncludeIdx.get( keyIncludeIdx ).remove( pkey );
				if( indexByIncludeIdx.get( keyIncludeIdx ).size() <= 0 ) {
					indexByIncludeIdx.remove( keyIncludeIdx );
				}
			}
		}

		if( indexByUIncludeIdx != null ) {
			indexByUIncludeIdx.remove( keyUIncludeIdx );
		}


	}
	public void deepDisposeSecGrpInc( YCFSecSecGrpIncPKey pkey ) {
		IYCFSecSecGrpIncObj obj = readCachedSecGrpInc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecGrpIncObj lockSecGrpInc( YCFSecSecGrpIncPKey pkey ) {
		IYCFSecSecGrpIncObj locked = null;
		YCFSecSecGrpIncBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGrpIncTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecGrpIncObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGrpInc", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecGrpIncObj> readAllSecGrpInc() {
		return( readAllSecGrpInc( false ) );
	}

	public List<IYCFSecSecGrpIncObj> readAllSecGrpInc( boolean forceRead ) {
		final String S_ProcName = "readAllSecGrpInc";
		if( ( allSecGrpInc == null ) || forceRead ) {
			Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> map = new HashMap<YCFSecSecGrpIncPKey,IYCFSecSecGrpIncObj>();
			allSecGrpInc = map;
			YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().readAllDerived( schema.getAuthorization() );
			YCFSecSecGrpIncBuff buff;
			IYCFSecSecGrpIncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpIncObj realised = (IYCFSecSecGrpIncObj)obj.realise();
			}
		}
		int len = allSecGrpInc.size();
		IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
		Iterator<IYCFSecSecGrpIncObj> valIter = allSecGrpInc.values().iterator();
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
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGrpIncObj> readCachedAllSecGrpInc() {
		final String S_ProcName = "readCachedAllSecGrpInc";
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>();
		if( allSecGrpInc != null ) {
			int len = allSecGrpInc.size();
			IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
			Iterator<IYCFSecSecGrpIncObj> valIter = allSecGrpInc.values().iterator();
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
		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecGrpIncObj> pageAllSecGrpInc(Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageAllSecGrpInc";
		Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> map = new HashMap<YCFSecSecGrpIncPKey,IYCFSecSecGrpIncObj>();
		YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecGrpIncId );
		YCFSecSecGrpIncBuff buff;
		IYCFSecSecGrpIncObj obj;
		IYCFSecSecGrpIncObj realised;
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecGrpIncObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId )
	{
		return( readSecGrpIncByIdIdx( ClusterId,
			SecGrpIncId,
			false ) );
	}

	public IYCFSecSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId, boolean forceRead )
	{
		YCFSecSecGrpIncPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpIncId( SecGrpIncId );
		IYCFSecSecGrpIncObj obj = readSecGrpInc( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId )
	{
		return( readSecGrpIncByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpIncByClusterIdx";
		YCFSecSecGrpIncByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGrpIncByClusterIdxKey,
				Map< YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj>();
			IYCFSecSecGrpIncObj obj;
			YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpIncObj realised = (IYCFSecSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
		Iterator<IYCFSecSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGrpIncByGroupIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public List<IYCFSecSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpIncByGroupIdx";
		YCFSecSecGrpIncByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecSecGrpIncByGroupIdxKey,
				Map< YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj>();
			IYCFSecSecGrpIncObj obj;
			YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			YCFSecSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpIncObj realised = (IYCFSecSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
		Iterator<IYCFSecSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId )
	{
		return( readSecGrpIncByIncludeIdx( ClusterId,
			IncludeGroupId,
			false ) );
	}

	public List<IYCFSecSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpIncByIncludeIdx";
		YCFSecSecGrpIncByIncludeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict;
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFSecSecGrpIncByIncludeIdxKey,
				Map< YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByIncludeIdx.containsKey( key ) ) {
			dict = indexByIncludeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj>();
			IYCFSecSecGrpIncObj obj;
			YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByIncludeIdx( schema.getAuthorization(),
				ClusterId,
				IncludeGroupId );
			YCFSecSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGrpIncObj realised = (IYCFSecSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIncludeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
		Iterator<IYCFSecSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecGrpIncObj readSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		return( readSecGrpIncByUIncludeIdx( ClusterId,
			SecGroupId,
			IncludeGroupId,
			false ) );
	}

	public IYCFSecSecGrpIncObj readSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId, boolean forceRead )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< YCFSecSecGrpIncByUIncludeIdxKey,
				IYCFSecSecGrpIncObj >();
		}
		YCFSecSecGrpIncByUIncludeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFSecSecGrpIncObj obj = null;
		if( ( ! forceRead ) && indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
		}
		else {
			YCFSecSecGrpIncBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByUIncludeIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				IncludeGroupId );
			if( buff != null ) {
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGrpIncObj readCachedSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId )
	{
		IYCFSecSecGrpIncObj obj = null;
		YCFSecSecGrpIncPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpIncId( SecGrpIncId );
		obj = readCachedSecGrpInc( pkey );
		return( obj );
	}

	public List<IYCFSecSecGrpIncObj> readCachedSecGrpIncByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGrpIncByClusterIdx";
		YCFSecSecGrpIncByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
				Iterator<IYCFSecSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFSecSecGrpIncObj obj;
			Iterator<IYCFSecSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGrpIncObj> readCachedSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "readCachedSecGrpIncByGroupIdx";
		YCFSecSecGrpIncByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
				Iterator<IYCFSecSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFSecSecGrpIncObj obj;
			Iterator<IYCFSecSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGrpIncObj> readCachedSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId )
	{
		final String S_ProcName = "readCachedSecGrpIncByIncludeIdx";
		YCFSecSecGrpIncByIncludeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		ArrayList<IYCFSecSecGrpIncObj> arrayList = new ArrayList<IYCFSecSecGrpIncObj>();
		if( indexByIncludeIdx != null ) {
			Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict;
			if( indexByIncludeIdx.containsKey( key ) ) {
				dict = indexByIncludeIdx.get( key );
				int len = dict.size();
				IYCFSecSecGrpIncObj arr[] = new IYCFSecSecGrpIncObj[len];
				Iterator<IYCFSecSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFSecSecGrpIncObj obj;
			Iterator<IYCFSecSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGrpIncObj> cmp = new Comparator<IYCFSecSecGrpIncObj>() {
			public int compare( IYCFSecSecGrpIncObj lhs, IYCFSecSecGrpIncObj rhs ) {
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
					YCFSecSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecGrpIncObj readCachedSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		IYCFSecSecGrpIncObj obj = null;
		YCFSecSecGrpIncByUIncludeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByUIncludeIdx != null ) {
			if( indexByUIncludeIdx.containsKey( key ) ) {
				obj = indexByUIncludeIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecGrpIncObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecGrpIncObj> valIter = members.values().iterator();
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

	public void deepDisposeSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId )
	{
		IYCFSecSecGrpIncObj obj = readCachedSecGrpIncByIdIdx( ClusterId,
				SecGrpIncId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGrpIncByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGrpIncByClusterIdx";
		IYCFSecSecGrpIncObj obj;
		List<IYCFSecSecGrpIncObj> arrayList = readCachedSecGrpIncByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "deepDisposeSecGrpIncByGroupIdx";
		IYCFSecSecGrpIncObj obj;
		List<IYCFSecSecGrpIncObj> arrayList = readCachedSecGrpIncByGroupIdx( ClusterId,
				SecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId )
	{
		final String S_ProcName = "deepDisposeSecGrpIncByIncludeIdx";
		IYCFSecSecGrpIncObj obj;
		List<IYCFSecSecGrpIncObj> arrayList = readCachedSecGrpIncByIncludeIdx( ClusterId,
				IncludeGroupId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		IYCFSecSecGrpIncObj obj = readCachedSecGrpIncByUIncludeIdx( ClusterId,
				SecGroupId,
				IncludeGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGrpIncObj> pageSecGrpIncByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageSecGrpIncByClusterIdx";
		YCFSecSecGrpIncByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecSecGrpIncObj> retList = new LinkedList<IYCFSecSecGrpIncObj>();
		IYCFSecSecGrpIncObj obj;
		YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecGrpIncId );
		YCFSecSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGrpIncObj realised = (IYCFSecSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGrpIncObj> pageSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageSecGrpIncByGroupIdx";
		YCFSecSecGrpIncByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		List<IYCFSecSecGrpIncObj> retList = new LinkedList<IYCFSecSecGrpIncObj>();
		IYCFSecSecGrpIncObj obj;
		YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().pageBuffByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
			priorClusterId,
			priorSecGrpIncId );
		YCFSecSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGrpIncObj realised = (IYCFSecSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate IncludeIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGrpIncObj> pageSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageSecGrpIncByIncludeIdx";
		YCFSecSecGrpIncByIncludeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		List<IYCFSecSecGrpIncObj> retList = new LinkedList<IYCFSecSecGrpIncObj>();
		IYCFSecSecGrpIncObj obj;
		YCFSecSecGrpIncBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().pageBuffByIncludeIdx( schema.getAuthorization(),
				ClusterId,
				IncludeGroupId,
			priorClusterId,
			priorSecGrpIncId );
		YCFSecSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGrpIncObj realised = (IYCFSecSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecGrpIncObj updateSecGrpInc( IYCFSecSecGrpIncObj Obj ) {
		IYCFSecSecGrpIncObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().updateSecGrpInc( schema.getAuthorization(),
			Obj.getSecGrpIncBuff() );
		obj = (IYCFSecSecGrpIncObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGrpInc( IYCFSecSecGrpIncObj Obj ) {
		IYCFSecSecGrpIncObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpInc( schema.getAuthorization(),
			obj.getSecGrpIncBuff() );
		Obj.forget();
	}

	public void deleteSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId )
	{
		YCFSecSecGrpIncPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpIncId( SecGrpIncId );
		IYCFSecSecGrpIncObj obj = readSecGrpInc( pkey );
		if( obj != null ) {
			IYCFSecSecGrpIncEditObj editObj = (IYCFSecSecGrpIncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecGrpIncEditObj)obj.beginEdit();
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
		deepDisposeSecGrpIncByIdIdx( ClusterId,
				SecGrpIncId );
	}

	public void deleteSecGrpIncByClusterIdx( long ClusterId )
	{
		YCFSecSecGrpIncByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGrpIncByClusterIdxKey,
				Map< YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict = indexByClusterIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecSecGrpIncObj> iter = dict.values().iterator();
			IYCFSecSecGrpIncObj obj;
			List<IYCFSecSecGrpIncObj> toForget = new LinkedList<IYCFSecSecGrpIncObj>();
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
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGrpIncByClusterIdx( ClusterId );
	}

	public void deleteSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		YCFSecSecGrpIncByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecSecGrpIncByGroupIdxKey,
				Map< YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict = indexByGroupIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			Iterator<IYCFSecSecGrpIncObj> iter = dict.values().iterator();
			IYCFSecSecGrpIncObj obj;
			List<IYCFSecSecGrpIncObj> toForget = new LinkedList<IYCFSecSecGrpIncObj>();
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
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
		}
		deepDisposeSecGrpIncByGroupIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId )
	{
		YCFSecSecGrpIncByIncludeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFSecSecGrpIncByIncludeIdxKey,
				Map< YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj > >();
		}
		if( indexByIncludeIdx.containsKey( key ) ) {
			Map<YCFSecSecGrpIncPKey, IYCFSecSecGrpIncObj> dict = indexByIncludeIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( schema.getAuthorization(),
				ClusterId,
				IncludeGroupId );
			Iterator<IYCFSecSecGrpIncObj> iter = dict.values().iterator();
			IYCFSecSecGrpIncObj obj;
			List<IYCFSecSecGrpIncObj> toForget = new LinkedList<IYCFSecSecGrpIncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIncludeIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( schema.getAuthorization(),
				ClusterId,
				IncludeGroupId );
		}
		deepDisposeSecGrpIncByIncludeIdx( ClusterId,
				IncludeGroupId );
	}

	public void deleteSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< YCFSecSecGrpIncByUIncludeIdxKey,
				IYCFSecSecGrpIncObj >();
		}
		YCFSecSecGrpIncByUIncludeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFSecSecGrpIncObj obj = null;
		if( indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				IncludeGroupId );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				IncludeGroupId );
		}
		deepDisposeSecGrpIncByUIncludeIdx( ClusterId,
				SecGroupId,
				IncludeGroupId );
	}
}
