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

public class YCFGenKbSecGrpIncTableObj
	implements IYCFGenKbSecGrpIncTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> members;
	private Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> allSecGrpInc;
	private Map< YCFGenKbSecGrpIncByClusterIdxKey,
		Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > > indexByClusterIdx;
	private Map< YCFGenKbSecGrpIncByGroupIdxKey,
		Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > > indexByGroupIdx;
	private Map< YCFGenKbSecGrpIncByIncludeIdxKey,
		Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > > indexByIncludeIdx;
	private Map< YCFGenKbSecGrpIncByUIncludeIdxKey,
		IYCFGenKbSecGrpIncObj > indexByUIncludeIdx;
	public static String TABLE_NAME = "SecGrpInc";
	public static String TABLE_DBNAME = "secinc";

	public YCFGenKbSecGrpIncTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj>();
		allSecGrpInc = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
	}

	public YCFGenKbSecGrpIncTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj>();
		allSecGrpInc = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
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
		allSecGrpInc = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
		List<IYCFGenKbSecGrpIncObj> toForget = new LinkedList<IYCFGenKbSecGrpIncObj>();
		IYCFGenKbSecGrpIncObj cur = null;
		Iterator<IYCFGenKbSecGrpIncObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecGrpIncObj.
	 */
	public IYCFGenKbSecGrpIncObj newInstance() {
		IYCFGenKbSecGrpIncObj inst = new YCFGenKbSecGrpIncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecGrpIncObj.
	 */
	public IYCFGenKbSecGrpIncEditObj newEditInstance( IYCFGenKbSecGrpIncObj orig ) {
		IYCFGenKbSecGrpIncEditObj edit = new YCFGenKbSecGrpIncEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecGrpIncObj realiseSecGrpInc( IYCFGenKbSecGrpIncObj Obj ) {
		IYCFGenKbSecGrpIncObj obj = Obj;
		YCFGenKbSecGrpIncPKey pkey = obj.getPKey();
		IYCFGenKbSecGrpIncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecGrpIncObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGrpIncByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFGenKbSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.remove( keepObj.getPKey() );
					if( mapIncludeIdx.size() <= 0 ) {
						indexByIncludeIdx.remove( keyIncludeIdx );
					}
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFGenKbSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUIncludeIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.remove( keyUIncludeIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGrpIncByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFGenKbSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFGenKbSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
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
				YCFGenKbSecGrpIncByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFGenKbSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFGenKbSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUIncludeIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecGrpIncObj createSecGrpInc( IYCFGenKbSecGrpIncObj Obj ) {
		IYCFGenKbSecGrpIncObj obj = Obj;
		YCFGenKbSecGrpIncBuff buff = obj.getSecGrpIncBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().createSecGrpInc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecGrpIncObj readSecGrpInc( YCFGenKbSecGrpIncPKey pkey ) {
		return( readSecGrpInc( pkey, false ) );
	}

	public IYCFGenKbSecGrpIncObj readSecGrpInc( YCFGenKbSecGrpIncPKey pkey, boolean forceRead ) {
		IYCFGenKbSecGrpIncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecGrpIncBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGrpIncId() );
			if( readBuff != null ) {
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGrpIncObj readCachedSecGrpInc( YCFGenKbSecGrpIncPKey pkey ) {
		IYCFGenKbSecGrpIncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGrpInc( IYCFGenKbSecGrpIncObj obj )
	{
		final String S_ProcName = "YCFGenKbSecGrpIncTableObj.reallyDeepDisposeSecGrpInc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecGrpIncPKey pkey = obj.getPKey();
		IYCFGenKbSecGrpIncObj existing = readCachedSecGrpInc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecGrpIncByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGrpIncByGroupIdxKey keyGroupIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGrpIncByIncludeIdxKey keyIncludeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbSecGrpIncByUIncludeIdxKey keyUIncludeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
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
	public void deepDisposeSecGrpInc( YCFGenKbSecGrpIncPKey pkey ) {
		IYCFGenKbSecGrpIncObj obj = readCachedSecGrpInc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecGrpIncObj lockSecGrpInc( YCFGenKbSecGrpIncPKey pkey ) {
		IYCFGenKbSecGrpIncObj locked = null;
		YCFGenKbSecGrpIncBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGrpIncTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecGrpIncObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGrpInc", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecGrpIncObj> readAllSecGrpInc() {
		return( readAllSecGrpInc( false ) );
	}

	public List<IYCFGenKbSecGrpIncObj> readAllSecGrpInc( boolean forceRead ) {
		final String S_ProcName = "readAllSecGrpInc";
		if( ( allSecGrpInc == null ) || forceRead ) {
			Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> map = new HashMap<YCFGenKbSecGrpIncPKey,IYCFGenKbSecGrpIncObj>();
			allSecGrpInc = map;
			YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecGrpIncBuff buff;
			IYCFGenKbSecGrpIncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpIncObj realised = (IYCFGenKbSecGrpIncObj)obj.realise();
			}
		}
		int len = allSecGrpInc.size();
		IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
		Iterator<IYCFGenKbSecGrpIncObj> valIter = allSecGrpInc.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGrpIncObj> readCachedAllSecGrpInc() {
		final String S_ProcName = "readCachedAllSecGrpInc";
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>();
		if( allSecGrpInc != null ) {
			int len = allSecGrpInc.size();
			IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
			Iterator<IYCFGenKbSecGrpIncObj> valIter = allSecGrpInc.values().iterator();
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
		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecGrpIncObj> pageAllSecGrpInc(Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageAllSecGrpInc";
		Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> map = new HashMap<YCFGenKbSecGrpIncPKey,IYCFGenKbSecGrpIncObj>();
		YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecGrpIncId );
		YCFGenKbSecGrpIncBuff buff;
		IYCFGenKbSecGrpIncObj obj;
		IYCFGenKbSecGrpIncObj realised;
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecGrpIncObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId )
	{
		return( readSecGrpIncByIdIdx( ClusterId,
			SecGrpIncId,
			false ) );
	}

	public IYCFGenKbSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId, boolean forceRead )
	{
		YCFGenKbSecGrpIncPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpIncId( SecGrpIncId );
		IYCFGenKbSecGrpIncObj obj = readSecGrpInc( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId )
	{
		return( readSecGrpIncByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpIncByClusterIdx";
		YCFGenKbSecGrpIncByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGrpIncByClusterIdxKey,
				Map< YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj>();
			IYCFGenKbSecGrpIncObj obj;
			YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpIncObj realised = (IYCFGenKbSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
		Iterator<IYCFGenKbSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGrpIncByGroupIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public List<IYCFGenKbSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpIncByGroupIdx";
		YCFGenKbSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbSecGrpIncByGroupIdxKey,
				Map< YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj>();
			IYCFGenKbSecGrpIncObj obj;
			YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			YCFGenKbSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpIncObj realised = (IYCFGenKbSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
		Iterator<IYCFGenKbSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId )
	{
		return( readSecGrpIncByIncludeIdx( ClusterId,
			IncludeGroupId,
			false ) );
	}

	public List<IYCFGenKbSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpIncByIncludeIdx";
		YCFGenKbSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict;
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFGenKbSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByIncludeIdx.containsKey( key ) ) {
			dict = indexByIncludeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj>();
			IYCFGenKbSecGrpIncObj obj;
			YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByIncludeIdx( schema.getAuthorization(),
				ClusterId,
				IncludeGroupId );
			YCFGenKbSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGrpIncObj realised = (IYCFGenKbSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIncludeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
		Iterator<IYCFGenKbSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecGrpIncObj readSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		return( readSecGrpIncByUIncludeIdx( ClusterId,
			SecGroupId,
			IncludeGroupId,
			false ) );
	}

	public IYCFGenKbSecGrpIncObj readSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId, boolean forceRead )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< YCFGenKbSecGrpIncByUIncludeIdxKey,
				IYCFGenKbSecGrpIncObj >();
		}
		YCFGenKbSecGrpIncByUIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFGenKbSecGrpIncObj obj = null;
		if( ( ! forceRead ) && indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
		}
		else {
			YCFGenKbSecGrpIncBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByUIncludeIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				IncludeGroupId );
			if( buff != null ) {
				obj = schema.getSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGrpIncObj readCachedSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId )
	{
		IYCFGenKbSecGrpIncObj obj = null;
		YCFGenKbSecGrpIncPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpIncId( SecGrpIncId );
		obj = readCachedSecGrpInc( pkey );
		return( obj );
	}

	public List<IYCFGenKbSecGrpIncObj> readCachedSecGrpIncByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGrpIncByClusterIdx";
		YCFGenKbSecGrpIncByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
				Iterator<IYCFGenKbSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGrpIncObj obj;
			Iterator<IYCFGenKbSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGrpIncObj> readCachedSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "readCachedSecGrpIncByGroupIdx";
		YCFGenKbSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
				Iterator<IYCFGenKbSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGrpIncObj obj;
			Iterator<IYCFGenKbSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGrpIncObj> readCachedSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId )
	{
		final String S_ProcName = "readCachedSecGrpIncByIncludeIdx";
		YCFGenKbSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		ArrayList<IYCFGenKbSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbSecGrpIncObj>();
		if( indexByIncludeIdx != null ) {
			Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict;
			if( indexByIncludeIdx.containsKey( key ) ) {
				dict = indexByIncludeIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGrpIncObj arr[] = new IYCFGenKbSecGrpIncObj[len];
				Iterator<IYCFGenKbSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGrpIncObj obj;
			Iterator<IYCFGenKbSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGrpIncObj> cmp = new Comparator<IYCFGenKbSecGrpIncObj>() {
			public int compare( IYCFGenKbSecGrpIncObj lhs, IYCFGenKbSecGrpIncObj rhs ) {
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
					YCFGenKbSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecGrpIncObj readCachedSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		IYCFGenKbSecGrpIncObj obj = null;
		YCFGenKbSecGrpIncByUIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByUIncludeIdx != null ) {
			if( indexByUIncludeIdx.containsKey( key ) ) {
				obj = indexByUIncludeIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecGrpIncObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecGrpIncObj> valIter = members.values().iterator();
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
		IYCFGenKbSecGrpIncObj obj = readCachedSecGrpIncByIdIdx( ClusterId,
				SecGrpIncId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGrpIncByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGrpIncByClusterIdx";
		IYCFGenKbSecGrpIncObj obj;
		List<IYCFGenKbSecGrpIncObj> arrayList = readCachedSecGrpIncByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGrpIncObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGrpIncObj obj;
		List<IYCFGenKbSecGrpIncObj> arrayList = readCachedSecGrpIncByGroupIdx( ClusterId,
				SecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGrpIncObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGrpIncObj obj;
		List<IYCFGenKbSecGrpIncObj> arrayList = readCachedSecGrpIncByIncludeIdx( ClusterId,
				IncludeGroupId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGrpIncObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGrpIncObj obj = readCachedSecGrpIncByUIncludeIdx( ClusterId,
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
	public List<IYCFGenKbSecGrpIncObj> pageSecGrpIncByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageSecGrpIncByClusterIdx";
		YCFGenKbSecGrpIncByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFGenKbSecGrpIncObj> retList = new LinkedList<IYCFGenKbSecGrpIncObj>();
		IYCFGenKbSecGrpIncObj obj;
		YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecGrpIncId );
		YCFGenKbSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGrpIncObj realised = (IYCFGenKbSecGrpIncObj)obj.realise();
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
	public List<IYCFGenKbSecGrpIncObj> pageSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageSecGrpIncByGroupIdx";
		YCFGenKbSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		List<IYCFGenKbSecGrpIncObj> retList = new LinkedList<IYCFGenKbSecGrpIncObj>();
		IYCFGenKbSecGrpIncObj obj;
		YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().pageBuffByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
			priorClusterId,
			priorSecGrpIncId );
		YCFGenKbSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGrpIncObj realised = (IYCFGenKbSecGrpIncObj)obj.realise();
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
	public List<IYCFGenKbSecGrpIncObj> pageSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageSecGrpIncByIncludeIdx";
		YCFGenKbSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		List<IYCFGenKbSecGrpIncObj> retList = new LinkedList<IYCFGenKbSecGrpIncObj>();
		IYCFGenKbSecGrpIncObj obj;
		YCFGenKbSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().pageBuffByIncludeIdx( schema.getAuthorization(),
				ClusterId,
				IncludeGroupId,
			priorClusterId,
			priorSecGrpIncId );
		YCFGenKbSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGrpIncObj realised = (IYCFGenKbSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecGrpIncObj updateSecGrpInc( IYCFGenKbSecGrpIncObj Obj ) {
		IYCFGenKbSecGrpIncObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().updateSecGrpInc( schema.getAuthorization(),
			Obj.getSecGrpIncBuff() );
		obj = (IYCFGenKbSecGrpIncObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGrpInc( IYCFGenKbSecGrpIncObj Obj ) {
		IYCFGenKbSecGrpIncObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpInc( schema.getAuthorization(),
			obj.getSecGrpIncBuff() );
		Obj.forget();
	}

	public void deleteSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId )
	{
		YCFGenKbSecGrpIncPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpIncId( SecGrpIncId );
		IYCFGenKbSecGrpIncObj obj = readSecGrpInc( pkey );
		if( obj != null ) {
			IYCFGenKbSecGrpIncEditObj editObj = (IYCFGenKbSecGrpIncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecGrpIncEditObj)obj.beginEdit();
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
		YCFGenKbSecGrpIncByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGrpIncByClusterIdxKey,
				Map< YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbSecGrpIncObj> iter = dict.values().iterator();
			IYCFGenKbSecGrpIncObj obj;
			List<IYCFGenKbSecGrpIncObj> toForget = new LinkedList<IYCFGenKbSecGrpIncObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGrpIncByClusterIdx( ClusterId );
	}

	public void deleteSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		YCFGenKbSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbSecGrpIncByGroupIdxKey,
				Map< YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict = indexByGroupIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			Iterator<IYCFGenKbSecGrpIncObj> iter = dict.values().iterator();
			IYCFGenKbSecGrpIncObj obj;
			List<IYCFGenKbSecGrpIncObj> toForget = new LinkedList<IYCFGenKbSecGrpIncObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
		}
		deepDisposeSecGrpIncByGroupIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId )
	{
		YCFGenKbSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFGenKbSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj > >();
		}
		if( indexByIncludeIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGrpIncPKey, IYCFGenKbSecGrpIncObj> dict = indexByIncludeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( schema.getAuthorization(),
				ClusterId,
				IncludeGroupId );
			Iterator<IYCFGenKbSecGrpIncObj> iter = dict.values().iterator();
			IYCFGenKbSecGrpIncObj obj;
			List<IYCFGenKbSecGrpIncObj> toForget = new LinkedList<IYCFGenKbSecGrpIncObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( schema.getAuthorization(),
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
			indexByUIncludeIdx = new HashMap< YCFGenKbSecGrpIncByUIncludeIdxKey,
				IYCFGenKbSecGrpIncObj >();
		}
		YCFGenKbSecGrpIncByUIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFGenKbSecGrpIncObj obj = null;
		if( indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				IncludeGroupId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGrpInc().deleteSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				IncludeGroupId );
		}
		deepDisposeSecGrpIncByUIncludeIdx( ClusterId,
				SecGroupId,
				IncludeGroupId );
	}
}
