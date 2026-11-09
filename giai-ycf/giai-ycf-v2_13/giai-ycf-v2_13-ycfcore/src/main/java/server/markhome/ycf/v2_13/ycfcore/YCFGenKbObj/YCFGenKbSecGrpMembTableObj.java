// Description: Java 11 Table Object implementation for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public class CFGenKbSecGrpMembTableObj
	implements ICFGenKbSecGrpMembTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> members;
	private Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> allSecGrpMemb;
	private Map< CFGenKbSecGrpMembByClusterIdxKey,
		Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > > indexByClusterIdx;
	private Map< CFGenKbSecGrpMembByGroupIdxKey,
		Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > > indexByGroupIdx;
	private Map< CFGenKbSecGrpMembByUserIdxKey,
		Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > > indexByUserIdx;
	private Map< CFGenKbSecGrpMembByUUserIdxKey,
		ICFGenKbSecGrpMembObj > indexByUUserIdx;
	public static String TABLE_NAME = "SecGrpMemb";
	public static String TABLE_DBNAME = "secmemb";

	public CFGenKbSecGrpMembTableObj() {
		schema = null;
		members = new HashMap<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj>();
		allSecGrpMemb = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public CFGenKbSecGrpMembTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj>();
		allSecGrpMemb = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = (ICFGenKbSchemaObj)value;
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
		List<ICFGenKbSecGrpMembObj> toForget = new LinkedList<ICFGenKbSecGrpMembObj>();
		ICFGenKbSecGrpMembObj cur = null;
		Iterator<ICFGenKbSecGrpMembObj> iter = members.values().iterator();
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
	 *	CFGenKbSecGrpMembObj.
	 */
	public ICFGenKbSecGrpMembObj newInstance() {
		ICFGenKbSecGrpMembObj inst = new CFGenKbSecGrpMembObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSecGrpMembObj.
	 */
	public ICFGenKbSecGrpMembEditObj newEditInstance( ICFGenKbSecGrpMembObj orig ) {
		ICFGenKbSecGrpMembEditObj edit = new CFGenKbSecGrpMembEditObj( orig );
		return( edit );
	}

	public ICFGenKbSecGrpMembObj realiseSecGrpMemb( ICFGenKbSecGrpMembObj Obj ) {
		ICFGenKbSecGrpMembObj obj = Obj;
		CFGenKbSecGrpMembPKey pkey = obj.getPKey();
		ICFGenKbSecGrpMembObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbSecGrpMembObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				CFGenKbSecGrpMembByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				CFGenKbSecGrpMembByGroupIdxKey keyGroupIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByUserIdx != null ) {
				CFGenKbSecGrpMembByUserIdxKey keyUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			if( indexByUUserIdx != null ) {
				CFGenKbSecGrpMembByUUserIdxKey keyUUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUUserIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.remove( keyUUserIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				CFGenKbSecGrpMembByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				CFGenKbSecGrpMembByGroupIdxKey keyGroupIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				CFGenKbSecGrpMembByUserIdxKey keyUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				CFGenKbSecGrpMembByUUserIdxKey keyUUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
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
				CFGenKbSecGrpMembByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				CFGenKbSecGrpMembByGroupIdxKey keyGroupIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				CFGenKbSecGrpMembByUserIdxKey keyUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				CFGenKbSecGrpMembByUUserIdxKey keyUUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUUserIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.put( keyUUserIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbSecGrpMembObj createSecGrpMemb( ICFGenKbSecGrpMembObj Obj ) {
		ICFGenKbSecGrpMembObj obj = Obj;
		CFGenKbSecGrpMembBuff buff = obj.getSecGrpMembBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().createSecGrpMemb(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbSecGrpMembObj readSecGrpMemb( CFGenKbSecGrpMembPKey pkey ) {
		return( readSecGrpMemb( pkey, false ) );
	}

	public ICFGenKbSecGrpMembObj readSecGrpMemb( CFGenKbSecGrpMembPKey pkey, boolean forceRead ) {
		ICFGenKbSecGrpMembObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbSecGrpMembBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGrpMembId() );
			if( readBuff != null ) {
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecGrpMembObj readCachedSecGrpMemb( CFGenKbSecGrpMembPKey pkey ) {
		ICFGenKbSecGrpMembObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGrpMemb( ICFGenKbSecGrpMembObj obj )
	{
		final String S_ProcName = "CFGenKbSecGrpMembTableObj.reallyDeepDisposeSecGrpMemb() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbSecGrpMembPKey pkey = obj.getPKey();
		ICFGenKbSecGrpMembObj existing = readCachedSecGrpMemb( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbSecGrpMembByClusterIdxKey keyClusterIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		CFGenKbSecGrpMembByGroupIdxKey keyGroupIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		CFGenKbSecGrpMembByUserIdxKey keyUserIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		CFGenKbSecGrpMembByUUserIdxKey keyUUserIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
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
	public void deepDisposeSecGrpMemb( CFGenKbSecGrpMembPKey pkey ) {
		ICFGenKbSecGrpMembObj obj = readCachedSecGrpMemb( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSecGrpMembObj lockSecGrpMemb( CFGenKbSecGrpMembPKey pkey ) {
		ICFGenKbSecGrpMembObj locked = null;
		CFGenKbSecGrpMembBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGrpMembTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbSecGrpMembObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSecGrpMemb", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbSecGrpMembObj> readAllSecGrpMemb() {
		return( readAllSecGrpMemb( false ) );
	}

	public List<ICFGenKbSecGrpMembObj> readAllSecGrpMemb( boolean forceRead ) {
		final String S_ProcName = "readAllSecGrpMemb";
		if( ( allSecGrpMemb == null ) || forceRead ) {
			Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> map = new HashMap<CFGenKbSecGrpMembPKey,ICFGenKbSecGrpMembObj>();
			allSecGrpMemb = map;
			CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readAllDerived( schema.getAuthorization() );
			CFGenKbSecGrpMembBuff buff;
			ICFGenKbSecGrpMembObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecGrpMembObj realised = (ICFGenKbSecGrpMembObj)obj.realise();
			}
		}
		int len = allSecGrpMemb.size();
		ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
		Iterator<ICFGenKbSecGrpMembObj> valIter = allSecGrpMemb.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecGrpMembObj> readCachedAllSecGrpMemb() {
		final String S_ProcName = "readCachedAllSecGrpMemb";
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>();
		if( allSecGrpMemb != null ) {
			int len = allSecGrpMemb.size();
			ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
			Iterator<ICFGenKbSecGrpMembObj> valIter = allSecGrpMemb.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
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
		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of ICFGenKbSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<ICFGenKbSecGrpMembObj> pageAllSecGrpMemb(Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageAllSecGrpMemb";
		Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> map = new HashMap<CFGenKbSecGrpMembPKey,ICFGenKbSecGrpMembObj>();
		CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecGrpMembId );
		CFGenKbSecGrpMembBuff buff;
		ICFGenKbSecGrpMembObj obj;
		ICFGenKbSecGrpMembObj realised;
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			realised = (ICFGenKbSecGrpMembObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public ICFGenKbSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		return( readSecGrpMembByIdIdx( ClusterId,
			SecGrpMembId,
			false ) );
	}

	public ICFGenKbSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId, boolean forceRead )
	{
		CFGenKbSecGrpMembPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		ICFGenKbSecGrpMembObj obj = readSecGrpMemb( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId )
	{
		return( readSecGrpMembByClusterIdx( ClusterId,
			false ) );
	}

	public List<ICFGenKbSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByClusterIdx";
		CFGenKbSecGrpMembByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSecGrpMembByClusterIdxKey,
				Map< CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj>();
			ICFGenKbSecGrpMembObj obj;
			CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			CFGenKbSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecGrpMembObj realised = (ICFGenKbSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
		Iterator<ICFGenKbSecGrpMembObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGrpMembByGroupIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public List<ICFGenKbSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByGroupIdx";
		CFGenKbSecGrpMembByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< CFGenKbSecGrpMembByGroupIdxKey,
				Map< CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj>();
			ICFGenKbSecGrpMembObj obj;
			CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			CFGenKbSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecGrpMembObj realised = (ICFGenKbSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
		Iterator<ICFGenKbSecGrpMembObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId )
	{
		return( readSecGrpMembByUserIdx( SecUserId,
			false ) );
	}

	public List<ICFGenKbSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGrpMembByUserIdx";
		CFGenKbSecGrpMembByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< CFGenKbSecGrpMembByUserIdxKey,
				Map< CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj>();
			ICFGenKbSecGrpMembObj obj;
			CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			CFGenKbSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecGrpMembObj realised = (ICFGenKbSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
		Iterator<ICFGenKbSecGrpMembObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSecGrpMembObj readSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		return( readSecGrpMembByUUserIdx( ClusterId,
			SecGroupId,
			SecUserId,
			false ) );
	}

	public ICFGenKbSecGrpMembObj readSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId, boolean forceRead )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< CFGenKbSecGrpMembByUUserIdxKey,
				ICFGenKbSecGrpMembObj >();
		}
		CFGenKbSecGrpMembByUUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		ICFGenKbSecGrpMembObj obj = null;
		if( ( ! forceRead ) && indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
		}
		else {
			CFGenKbSecGrpMembBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
			if( buff != null ) {
				obj = schema.getSecGrpMembTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecGrpMembObj readCachedSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		ICFGenKbSecGrpMembObj obj = null;
		CFGenKbSecGrpMembPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		obj = readCachedSecGrpMemb( pkey );
		return( obj );
	}

	public List<ICFGenKbSecGrpMembObj> readCachedSecGrpMembByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGrpMembByClusterIdx";
		CFGenKbSecGrpMembByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>();
		if( indexByClusterIdx != null ) {
			Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
				Iterator<ICFGenKbSecGrpMembObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFGenKbSecGrpMembObj obj;
			Iterator<ICFGenKbSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecGrpMembObj> readCachedSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "readCachedSecGrpMembByGroupIdx";
		CFGenKbSecGrpMembByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>();
		if( indexByGroupIdx != null ) {
			Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
				Iterator<ICFGenKbSecGrpMembObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFGenKbSecGrpMembObj obj;
			Iterator<ICFGenKbSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecGrpMembObj> readCachedSecGrpMembByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecGrpMembByUserIdx";
		CFGenKbSecGrpMembByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<ICFGenKbSecGrpMembObj> arrayList = new ArrayList<ICFGenKbSecGrpMembObj>();
		if( indexByUserIdx != null ) {
			Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				ICFGenKbSecGrpMembObj arr[] = new ICFGenKbSecGrpMembObj[len];
				Iterator<ICFGenKbSecGrpMembObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFGenKbSecGrpMembObj obj;
			Iterator<ICFGenKbSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecGrpMembObj> cmp = new Comparator<ICFGenKbSecGrpMembObj>() {
			public int compare( ICFGenKbSecGrpMembObj lhs, ICFGenKbSecGrpMembObj rhs ) {
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
					CFGenKbSecGrpMembPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbSecGrpMembObj readCachedSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		ICFGenKbSecGrpMembObj obj = null;
		CFGenKbSecGrpMembByUUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		if( indexByUUserIdx != null ) {
			if( indexByUUserIdx.containsKey( key ) ) {
				obj = indexByUUserIdx.get( key );
			}
			else {
				Iterator<ICFGenKbSecGrpMembObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbSecGrpMembObj> valIter = members.values().iterator();
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
		ICFGenKbSecGrpMembObj obj = readCachedSecGrpMembByIdIdx( ClusterId,
				SecGrpMembId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGrpMembByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGrpMembByClusterIdx";
		ICFGenKbSecGrpMembObj obj;
		List<ICFGenKbSecGrpMembObj> arrayList = readCachedSecGrpMembByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecGrpMembObj> arrayIter = arrayList.iterator();
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
		ICFGenKbSecGrpMembObj obj;
		List<ICFGenKbSecGrpMembObj> arrayList = readCachedSecGrpMembByGroupIdx( ClusterId,
				SecGroupId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecGrpMembObj> arrayIter = arrayList.iterator();
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
		ICFGenKbSecGrpMembObj obj;
		List<ICFGenKbSecGrpMembObj> arrayList = readCachedSecGrpMembByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecGrpMembObj> arrayIter = arrayList.iterator();
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
		ICFGenKbSecGrpMembObj obj = readCachedSecGrpMembByUUserIdx( ClusterId,
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
	public List<ICFGenKbSecGrpMembObj> pageSecGrpMembByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByClusterIdx";
		CFGenKbSecGrpMembByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<ICFGenKbSecGrpMembObj> retList = new LinkedList<ICFGenKbSecGrpMembObj>();
		ICFGenKbSecGrpMembObj obj;
		CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecGrpMembId );
		CFGenKbSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecGrpMembObj realised = (ICFGenKbSecGrpMembObj)obj.realise();
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
	public List<ICFGenKbSecGrpMembObj> pageSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByGroupIdx";
		CFGenKbSecGrpMembByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		List<ICFGenKbSecGrpMembObj> retList = new LinkedList<ICFGenKbSecGrpMembObj>();
		ICFGenKbSecGrpMembObj obj;
		CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
			priorClusterId,
			priorSecGrpMembId );
		CFGenKbSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecGrpMembObj realised = (ICFGenKbSecGrpMembObj)obj.realise();
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
	public List<ICFGenKbSecGrpMembObj> pageSecGrpMembByUserIdx( UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageSecGrpMembByUserIdx";
		CFGenKbSecGrpMembByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<ICFGenKbSecGrpMembObj> retList = new LinkedList<ICFGenKbSecGrpMembObj>();
		ICFGenKbSecGrpMembObj obj;
		CFGenKbSecGrpMembBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorClusterId,
			priorSecGrpMembId );
		CFGenKbSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGrpMembTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecGrpMembObj realised = (ICFGenKbSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public ICFGenKbSecGrpMembObj updateSecGrpMemb( ICFGenKbSecGrpMembObj Obj ) {
		ICFGenKbSecGrpMembObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().updateSecGrpMemb( schema.getAuthorization(),
			Obj.getSecGrpMembBuff() );
		obj = (ICFGenKbSecGrpMembObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGrpMemb( ICFGenKbSecGrpMembObj Obj ) {
		ICFGenKbSecGrpMembObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMemb( schema.getAuthorization(),
			obj.getSecGrpMembBuff() );
		Obj.forget();
	}

	public void deleteSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId )
	{
		CFGenKbSecGrpMembPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGrpMembId( SecGrpMembId );
		ICFGenKbSecGrpMembObj obj = readSecGrpMemb( pkey );
		if( obj != null ) {
			ICFGenKbSecGrpMembEditObj editObj = (ICFGenKbSecGrpMembEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbSecGrpMembEditObj)obj.beginEdit();
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
		CFGenKbSecGrpMembByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSecGrpMembByClusterIdxKey,
				Map< CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict = indexByClusterIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<ICFGenKbSecGrpMembObj> iter = dict.values().iterator();
			ICFGenKbSecGrpMembObj obj;
			List<ICFGenKbSecGrpMembObj> toForget = new LinkedList<ICFGenKbSecGrpMembObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGrpMembByClusterIdx( ClusterId );
	}

	public void deleteSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		CFGenKbSecGrpMembByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< CFGenKbSecGrpMembByGroupIdxKey,
				Map< CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict = indexByGroupIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			Iterator<ICFGenKbSecGrpMembObj> iter = dict.values().iterator();
			ICFGenKbSecGrpMembObj obj;
			List<ICFGenKbSecGrpMembObj> toForget = new LinkedList<ICFGenKbSecGrpMembObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
		}
		deepDisposeSecGrpMembByGroupIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGrpMembByUserIdx( UUID SecUserId )
	{
		CFGenKbSecGrpMembByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< CFGenKbSecGrpMembByUserIdxKey,
				Map< CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<CFGenKbSecGrpMembPKey, ICFGenKbSecGrpMembObj> dict = indexByUserIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<ICFGenKbSecGrpMembObj> iter = dict.values().iterator();
			ICFGenKbSecGrpMembObj obj;
			List<ICFGenKbSecGrpMembObj> toForget = new LinkedList<ICFGenKbSecGrpMembObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecGrpMembByUserIdx( SecUserId );
	}

	public void deleteSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< CFGenKbSecGrpMembByUUserIdxKey,
				ICFGenKbSecGrpMembObj >();
		}
		CFGenKbSecGrpMembByUUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );
		ICFGenKbSecGrpMembObj obj = null;
		if( indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGrpMemb().deleteSecGrpMembByUUserIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecUserId );
		}
		deepDisposeSecGrpMembByUUserIdx( ClusterId,
				SecGroupId,
				SecUserId );
	}
}