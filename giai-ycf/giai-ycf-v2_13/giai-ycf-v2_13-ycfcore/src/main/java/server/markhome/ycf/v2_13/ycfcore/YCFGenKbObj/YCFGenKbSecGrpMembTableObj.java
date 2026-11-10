// Description: Java 11 Table Object implementation for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public class YCFGenKbSecGrpMembTableObj
	implements IYCFGenKbSecGrpMembTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> members;
	private Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> allSecGrpMemb;
	private Map< YCFGenKbSecGrpMembByClusterIdxKey,
		Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > > indexByClusterIdx;
	private Map< YCFGenKbSecGrpMembByGroupIdxKey,
		Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > > indexByGroupIdx;
	private Map< YCFGenKbSecGrpMembByUserIdxKey,
		Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > > indexByUserIdx;
	private Map< YCFGenKbSecGrpMembByUUserIdxKey,
		IYCFGenKbSecGrpMembObj > indexByUUserIdx;
	public static String TABLE_NAME = "SecGrpMemb";
	public static String TABLE_DBNAME = "secmemb";

	public YCFGenKbSecGrpMembTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj>();
		allSecGrpMemb = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public YCFGenKbSecGrpMembTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj>();
		allSecGrpMemb = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = (IYCFGenKbSchemaObj)value;
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
		List<IYCFGenKbSecGrpMembObj> toForget = new LinkedList<IYCFGenKbSecGrpMembObj>();
		IYCFGenKbSecGrpMembObj cur = null;
		Iterator<IYCFGenKbSecGrpMembObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecGrpMembObj.
	 */
	public IYCFGenKbSecGrpMembObj newInstance() {
		IYCFGenKbSecGrpMembObj inst = new YCFGenKbSecGrpMembObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecGrpMembObj.
	 */
	public IYCFGenKbSecGrpMembEditObj newEditInstance( IYCFGenKbSecGrpMembObj orig ) {
		IYCFGenKbSecGrpMembEditObj edit = new YCFGenKbSecGrpMembEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecGrpMembObj realiseSecGrpMemb( IYCFGenKbSecGrpMembObj Obj ) {
		IYCFGenKbSecGrpMembObj obj = Obj;
		YCFGenKbSecGrpMembPKey pkey = obj.getPKey();
		IYCFGenKbSecGrpMembObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecGrpMembObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGrpMembByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByUserIdx != null ) {
				YCFGenKbSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			if( indexByUUserIdx != null ) {
				YCFGenKbSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUUserIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.remove( keyUUserIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGrpMembByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFGenKbSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFGenKbSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
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
				YCFGenKbSecGrpMembByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFGenKbSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFGenKbSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUUserIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.put( keyUUserIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecGrpMembObj createSecGrpMemb( IYCFGenKbSecGrpMembObj Obj ) {
		IYCFGenKbSecGrpMembObj obj = Obj;
		YCFGenKbSecGrpMembBuff buff = obj.getSecGrpMembBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().createSecGrpMemb(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecGrpMembObj readSecGrpMemb( YCFGenKbSecGrpMembPKey pkey ) {
		return( readSecGrpMemb( pkey, false ) );
	}

	public IYCFGenKbSecGrpMembObj readSecGrpMemb( YCFGenKbSecGrpMembPKey pkey, boolean forceRead ) {
		IYCFGenKbSecGrpMembObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecGrpMembBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGrpMembId() );
			if( readBuff != null ) {
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGrpMembObj readCachedSecGrpMemb( YCFGenKbSecGrpMembPKey pkey ) {
		IYCFGenKbSecGrpMembObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGrpMemb( IYCFGenKbSecGrpMembObj obj )
	{
		final String S_ProcName = "YCFGenKbSecGrpMembTableObj.reallyDeepDisposeSecGrpMemb() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecGrpMembPKey pkey = obj.getPKey();
		IYCFGenKbSecGrpMembObj existing = readCachedSecGrpMemb( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecGrpMembByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGrpMembByGroupIdxKey keyGroupIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGrpMembByUserIdxKey keyUserIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecGrpMembByUUserIdxKey keyUUserIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
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
	public void deepDisposeSecGrpMemb( YCFGenKbSecGrpMembPKey pkey ) {
		IYCFGenKbSecGrpMembObj obj = readCachedSecGrpMemb( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecGrpMembObj lockSecGrpMemb( YCFGenKbSecGrpMembPKey pkey ) {
		IYCFGenKbSecGrpMembObj locked = null;
		YCFGenKbSecGrpMembBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGrpMembTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecGrpMembObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGrpMemb", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecGrpMembObj> readAllSecGrpMemb() {
		return( readAllSecGrpMemb( false ) );
	}

	public List<IYCFGenKbSecGrpMembObj> readAllSecGrpMemb( boolean forceRead ) {
		final String S_ProcName = "readAllSecGrpMemb";
		if( ( allSecGrpMemb == null ) || forceRead ) {
			Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> map = new HashMap<YCFGenKbSecGrpMembPKey,IYCFGenKbSecGrpMembObj>();
			allSecGrpMemb = map;
			YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecGrpMembBuff buff;
			IYCFGenKbSecGrpMembObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpMembObj realised = (IYCFGenKbSecGrpMembObj)obj.realise();
			}
		}
		int len = allSecGrpMemb.size();
		IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
		Iterator<IYCFGenKbSecGrpMembObj> valIter = allSecGrpMemb.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGrpMembObj> readCachedAllSecGrpMemb() {
		final String S_ProcName = "readCachedAllSecGrpMemb";
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>();
		if( allSecGrpMemb != null ) {
			int len = allSecGrpMemb.size();
			IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
			Iterator<IYCFGenKbSecGrpMembObj> valIter = allSecGrpMemb.values().iterator();
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
		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecGrpMembObj> pageAllSecGrpMemb(Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageAllSecGrpMemb";
		Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> map = new HashMap<YCFGenKbSecGrpMembPKey,IYCFGenKbSecGrpMembObj>();
		YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecGrpMembId );
		YCFGenKbSecGrpMembBuff buff;
		IYCFGenKbSecGrpMembObj obj;
		IYCFGenKbSecGrpMembObj realised;
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecGrpMembObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		return( readSecGrpMembByIdIdx( ClusterId,
			SecGrpMembId,
			false ) );
	}

	public IYCFGenKbSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId, boolean forceRead )
	{
		YCFGenKbSecGrpMembPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		IYCFGenKbSecGrpMembObj obj = readSecGrpMemb( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId )
	{
		return( readSecGrpMembByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByClusterIdx";
		YCFGenKbSecGrpMembByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGrpMembByClusterIdxKey,
				Map< YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj>();
			IYCFGenKbSecGrpMembObj obj;
			YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpMembObj realised = (IYCFGenKbSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
		Iterator<IYCFGenKbSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGrpMembByGroupIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public List<IYCFGenKbSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByGroupIdx";
		YCFGenKbSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbSecGrpMembByGroupIdxKey,
				Map< YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj>();
			IYCFGenKbSecGrpMembObj obj;
			YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			YCFGenKbSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpMembObj realised = (IYCFGenKbSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
		Iterator<IYCFGenKbSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId )
	{
		return( readSecGrpMembByUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFGenKbSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByUserIdx";
		YCFGenKbSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFGenKbSecGrpMembByUserIdxKey,
				Map< YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj>();
			IYCFGenKbSecGrpMembObj obj;
			YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFGenKbSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpMembObj realised = (IYCFGenKbSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
		Iterator<IYCFGenKbSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecGrpMembObj readSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		return( readSecGrpMembByUUserIdx( ClusterId,
			SecGroupId,
			SecUserId,
			false ) );
	}

	public IYCFGenKbSecGrpMembObj readSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId, boolean forceRead )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFGenKbSecGrpMembByUUserIdxKey,
				IYCFGenKbSecGrpMembObj >();
		}
		YCFGenKbSecGrpMembByUUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFGenKbSecGrpMembObj obj = null;
		if( ( ! forceRead ) && indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
		}
		else {
			YCFGenKbSecGrpMembBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
			if( buff != null ) {
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGrpMembObj readCachedSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		IYCFGenKbSecGrpMembObj obj = null;
		YCFGenKbSecGrpMembPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		obj = readCachedSecGrpMemb( pkey );
		return( obj );
	}

	public List<IYCFGenKbSecGrpMembObj> readCachedSecGrpMembByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGrpMembByClusterIdx";
		YCFGenKbSecGrpMembByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
				Iterator<IYCFGenKbSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGrpMembObj obj;
			Iterator<IYCFGenKbSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGrpMembObj> readCachedSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "readCachedSecGrpMembByGroupIdx";
		YCFGenKbSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
				Iterator<IYCFGenKbSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGrpMembObj obj;
			Iterator<IYCFGenKbSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGrpMembObj> readCachedSecGrpMembByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecGrpMembByUserIdx";
		YCFGenKbSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFGenKbSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbSecGrpMembObj>();
		if( indexByUserIdx != null ) {
			Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGrpMembObj arr[] = new IYCFGenKbSecGrpMembObj[len];
				Iterator<IYCFGenKbSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGrpMembObj obj;
			Iterator<IYCFGenKbSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGrpMembObj> cmp = new Comparator<IYCFGenKbSecGrpMembObj>() {
			public int compare( IYCFGenKbSecGrpMembObj lhs, IYCFGenKbSecGrpMembObj rhs ) {
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
					YCFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecGrpMembObj readCachedSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		IYCFGenKbSecGrpMembObj obj = null;
		YCFGenKbSecGrpMembByUUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		if( indexByUUserIdx != null ) {
			if( indexByUUserIdx.containsKey( key ) ) {
				obj = indexByUUserIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecGrpMembObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecGrpMembObj> valIter = members.values().iterator();
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
		IYCFGenKbSecGrpMembObj obj = readCachedSecGrpMembByIdIdx( ClusterId,
				SecGrpMembId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGrpMembByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGrpMembByClusterIdx";
		IYCFGenKbSecGrpMembObj obj;
		List<IYCFGenKbSecGrpMembObj> arrayList = readCachedSecGrpMembByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGrpMembObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGrpMembObj obj;
		List<IYCFGenKbSecGrpMembObj> arrayList = readCachedSecGrpMembByGroupIdx( ClusterId,
				SecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGrpMembObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGrpMembObj obj;
		List<IYCFGenKbSecGrpMembObj> arrayList = readCachedSecGrpMembByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGrpMembObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGrpMembObj obj = readCachedSecGrpMembByUUserIdx( ClusterId,
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
	public List<IYCFGenKbSecGrpMembObj> pageSecGrpMembByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByClusterIdx";
		YCFGenKbSecGrpMembByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFGenKbSecGrpMembObj> retList = new LinkedList<IYCFGenKbSecGrpMembObj>();
		IYCFGenKbSecGrpMembObj obj;
		YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecGrpMembId );
		YCFGenKbSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGrpMembObj realised = (IYCFGenKbSecGrpMembObj)obj.realise();
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
	public List<IYCFGenKbSecGrpMembObj> pageSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByGroupIdx";
		YCFGenKbSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		List<IYCFGenKbSecGrpMembObj> retList = new LinkedList<IYCFGenKbSecGrpMembObj>();
		IYCFGenKbSecGrpMembObj obj;
		YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
			priorClusterId,
			priorSecGrpMembId );
		YCFGenKbSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGrpMembObj realised = (IYCFGenKbSecGrpMembObj)obj.realise();
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
	public List<IYCFGenKbSecGrpMembObj> pageSecGrpMembByUserIdx( UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByUserIdx";
		YCFGenKbSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFGenKbSecGrpMembObj> retList = new LinkedList<IYCFGenKbSecGrpMembObj>();
		IYCFGenKbSecGrpMembObj obj;
		YCFGenKbSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorClusterId,
			priorSecGrpMembId );
		YCFGenKbSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGrpMembObj realised = (IYCFGenKbSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecGrpMembObj updateSecGrpMemb( IYCFGenKbSecGrpMembObj Obj ) {
		IYCFGenKbSecGrpMembObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().updateSecGrpMemb( schema.getAuthorization(),
			Obj.getSecGrpMembBuff() );
		obj = (IYCFGenKbSecGrpMembObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGrpMemb( IYCFGenKbSecGrpMembObj Obj ) {
		IYCFGenKbSecGrpMembObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMemb( schema.getAuthorization(),
			obj.getSecGrpMembBuff() );
		Obj.forget();
	}

	public void deleteSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		YCFGenKbSecGrpMembPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		IYCFGenKbSecGrpMembObj obj = readSecGrpMemb( pkey );
		if( obj != null ) {
			IYCFGenKbSecGrpMembEditObj editObj = (IYCFGenKbSecGrpMembEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecGrpMembEditObj)obj.beginEdit();
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
		YCFGenKbSecGrpMembByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGrpMembByClusterIdxKey,
				Map< YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbSecGrpMembObj> iter = dict.values().iterator();
			IYCFGenKbSecGrpMembObj obj;
			List<IYCFGenKbSecGrpMembObj> toForget = new LinkedList<IYCFGenKbSecGrpMembObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGrpMembByClusterIdx( ClusterId );
	}

	public void deleteSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		YCFGenKbSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbSecGrpMembByGroupIdxKey,
				Map< YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict = indexByGroupIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			Iterator<IYCFGenKbSecGrpMembObj> iter = dict.values().iterator();
			IYCFGenKbSecGrpMembObj obj;
			List<IYCFGenKbSecGrpMembObj> toForget = new LinkedList<IYCFGenKbSecGrpMembObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
		}
		deepDisposeSecGrpMembByGroupIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGrpMembByUserIdx( UUID SecUserId )
	{
		YCFGenKbSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFGenKbSecGrpMembByUserIdxKey,
				Map< YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGrpMembPKey, IYCFGenKbSecGrpMembObj> dict = indexByUserIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFGenKbSecGrpMembObj> iter = dict.values().iterator();
			IYCFGenKbSecGrpMembObj obj;
			List<IYCFGenKbSecGrpMembObj> toForget = new LinkedList<IYCFGenKbSecGrpMembObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecGrpMembByUserIdx( SecUserId );
	}

	public void deleteSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFGenKbSecGrpMembByUUserIdxKey,
				IYCFGenKbSecGrpMembObj >();
		}
		YCFGenKbSecGrpMembByUUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFGenKbSecGrpMembObj obj = null;
		if( indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
		}
		deepDisposeSecGrpMembByUUserIdx( ClusterId,
				SecGroupId,
				SecUserId );
	}
}
