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

public class YCFGenKbTSecGrpMembTableObj
	implements IYCFGenKbTSecGrpMembTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> members;
	private Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> allTSecGrpMemb;
	private Map< YCFGenKbTSecGrpMembByTenantIdxKey,
		Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > > indexByTenantIdx;
	private Map< YCFGenKbTSecGrpMembByGroupIdxKey,
		Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > > indexByGroupIdx;
	private Map< YCFGenKbTSecGrpMembByUserIdxKey,
		Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > > indexByUserIdx;
	private Map< YCFGenKbTSecGrpMembByUUserIdxKey,
		IYCFGenKbTSecGrpMembObj > indexByUUserIdx;
	public static String TABLE_NAME = "TSecGrpMemb";
	public static String TABLE_DBNAME = "tsecmemb";

	public YCFGenKbTSecGrpMembTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj>();
		allTSecGrpMemb = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
	}

	public YCFGenKbTSecGrpMembTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj>();
		allTSecGrpMemb = null;
		indexByTenantIdx = null;
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
		allTSecGrpMemb = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByUserIdx = null;
		indexByUUserIdx = null;
		List<IYCFGenKbTSecGrpMembObj> toForget = new LinkedList<IYCFGenKbTSecGrpMembObj>();
		IYCFGenKbTSecGrpMembObj cur = null;
		Iterator<IYCFGenKbTSecGrpMembObj> iter = members.values().iterator();
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
	 *	YCFGenKbTSecGrpMembObj.
	 */
	public IYCFGenKbTSecGrpMembObj newInstance() {
		IYCFGenKbTSecGrpMembObj inst = new YCFGenKbTSecGrpMembObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbTSecGrpMembObj.
	 */
	public IYCFGenKbTSecGrpMembEditObj newEditInstance( IYCFGenKbTSecGrpMembObj orig ) {
		IYCFGenKbTSecGrpMembEditObj edit = new YCFGenKbTSecGrpMembEditObj( orig );
		return( edit );
	}

	public IYCFGenKbTSecGrpMembObj realiseTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj ) {
		IYCFGenKbTSecGrpMembObj obj = Obj;
		YCFGenKbTSecGrpMembPKey pkey = obj.getPKey();
		IYCFGenKbTSecGrpMembObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbTSecGrpMembObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbTSecGrpMembByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbTSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByUserIdx != null ) {
				YCFGenKbTSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			if( indexByUUserIdx != null ) {
				YCFGenKbTSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUUserIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.remove( keyUUserIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbTSecGrpMembByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbTSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFGenKbTSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFGenKbTSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
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
				YCFGenKbTSecGrpMembByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbTSecGrpMembByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				YCFGenKbTSecGrpMembByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUUserIdx != null ) {
				YCFGenKbTSecGrpMembByUUserIdxKey keyUUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
				keyUUserIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUUserIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				indexByUUserIdx.put( keyUUserIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbTSecGrpMembObj createTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj ) {
		IYCFGenKbTSecGrpMembObj obj = Obj;
		YCFGenKbTSecGrpMembBuff buff = obj.getTSecGrpMembBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().createTSecGrpMemb(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbTSecGrpMembObj readTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey ) {
		return( readTSecGrpMemb( pkey, false ) );
	}

	public IYCFGenKbTSecGrpMembObj readTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey, boolean forceRead ) {
		IYCFGenKbTSecGrpMembObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbTSecGrpMembBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGrpMembId() );
			if( readBuff != null ) {
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbTSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTSecGrpMembObj readCachedTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey ) {
		IYCFGenKbTSecGrpMembObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGrpMemb( IYCFGenKbTSecGrpMembObj obj )
	{
		final String S_ProcName = "YCFGenKbTSecGrpMembTableObj.reallyDeepDisposeTSecGrpMemb() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbTSecGrpMembPKey pkey = obj.getPKey();
		IYCFGenKbTSecGrpMembObj existing = readCachedTSecGrpMemb( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbTSecGrpMembByTenantIdxKey keyTenantIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGrpMembByGroupIdxKey keyGroupIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpMembByUserIdxKey keyUserIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbTSecGrpMembByUUserIdxKey keyUUserIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
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
	public void deepDisposeTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey ) {
		IYCFGenKbTSecGrpMembObj obj = readCachedTSecGrpMemb( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbTSecGrpMembObj lockTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey ) {
		IYCFGenKbTSecGrpMembObj locked = null;
		YCFGenKbTSecGrpMembBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGrpMembTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbTSecGrpMembObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTSecGrpMemb", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbTSecGrpMembObj> readAllTSecGrpMemb() {
		return( readAllTSecGrpMemb( false ) );
	}

	public List<IYCFGenKbTSecGrpMembObj> readAllTSecGrpMemb( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGrpMemb";
		if( ( allTSecGrpMemb == null ) || forceRead ) {
			Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> map = new HashMap<YCFGenKbTSecGrpMembPKey,IYCFGenKbTSecGrpMembObj>();
			allTSecGrpMemb = map;
			YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().readAllDerived( schema.getAuthorization() );
			YCFGenKbTSecGrpMembBuff buff;
			IYCFGenKbTSecGrpMembObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpMembObj realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
			}
		}
		int len = allTSecGrpMemb.size();
		IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
		Iterator<IYCFGenKbTSecGrpMembObj> valIter = allTSecGrpMemb.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGrpMembObj> readCachedAllTSecGrpMemb() {
		final String S_ProcName = "readCachedAllTSecGrpMemb";
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>();
		if( allTSecGrpMemb != null ) {
			int len = allTSecGrpMemb.size();
			IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
			Iterator<IYCFGenKbTSecGrpMembObj> valIter = allTSecGrpMemb.values().iterator();
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
		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbTSecGrpMembObj> pageAllTSecGrpMemb(Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageAllTSecGrpMemb";
		Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> map = new HashMap<YCFGenKbTSecGrpMembPKey,IYCFGenKbTSecGrpMembObj>();
		YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageAllBuff( schema.getAuthorization(),
			priorTenantId,
			priorTSecGrpMembId );
		YCFGenKbTSecGrpMembBuff buff;
		IYCFGenKbTSecGrpMembObj obj;
		IYCFGenKbTSecGrpMembObj realised;
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId )
	{
		return( readTSecGrpMembByIdIdx( TenantId,
			TSecGrpMembId,
			false ) );
	}

	public IYCFGenKbTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId, boolean forceRead )
	{
		YCFGenKbTSecGrpMembPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpMembId( TSecGrpMembId );
		IYCFGenKbTSecGrpMembObj obj = readTSecGrpMemb( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId )
	{
		return( readTSecGrpMembByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpMembByTenantIdx";
		YCFGenKbTSecGrpMembByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbTSecGrpMembByTenantIdxKey,
				Map< YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj>();
			IYCFGenKbTSecGrpMembObj obj;
			YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbTSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpMembObj realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
		Iterator<IYCFGenKbTSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGrpMembByGroupIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpMembByGroupIdx";
		YCFGenKbTSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbTSecGrpMembByGroupIdxKey,
				Map< YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj>();
			IYCFGenKbTSecGrpMembObj obj;
			YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			YCFGenKbTSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpMembObj realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
		Iterator<IYCFGenKbTSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId )
	{
		return( readTSecGrpMembByUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpMembByUserIdx";
		YCFGenKbTSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFGenKbTSecGrpMembByUserIdxKey,
				Map< YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj>();
			IYCFGenKbTSecGrpMembObj obj;
			YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFGenKbTSecGrpMembBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpMembObj realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
		Iterator<IYCFGenKbTSecGrpMembObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpMembObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbTSecGrpMembObj readTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		return( readTSecGrpMembByUUserIdx( TenantId,
			TSecGroupId,
			SecUserId,
			false ) );
	}

	public IYCFGenKbTSecGrpMembObj readTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId, boolean forceRead )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFGenKbTSecGrpMembByUUserIdxKey,
				IYCFGenKbTSecGrpMembObj >();
		}
		YCFGenKbTSecGrpMembByUUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFGenKbTSecGrpMembObj obj = null;
		if( ( ! forceRead ) && indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
		}
		else {
			YCFGenKbTSecGrpMembBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().readDerivedByUUserIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				SecUserId );
			if( buff != null ) {
				obj = schema.getTSecGrpMembTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbTSecGrpMembObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTSecGrpMembObj readCachedTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId )
	{
		IYCFGenKbTSecGrpMembObj obj = null;
		YCFGenKbTSecGrpMembPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpMembId( TSecGrpMembId );
		obj = readCachedTSecGrpMemb( pkey );
		return( obj );
	}

	public List<IYCFGenKbTSecGrpMembObj> readCachedTSecGrpMembByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGrpMembByTenantIdx";
		YCFGenKbTSecGrpMembByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
				Iterator<IYCFGenKbTSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGrpMembObj obj;
			Iterator<IYCFGenKbTSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbTSecGrpMembObj> readCachedTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpMembByGroupIdx";
		YCFGenKbTSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
				Iterator<IYCFGenKbTSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGrpMembObj obj;
			Iterator<IYCFGenKbTSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbTSecGrpMembObj> readCachedTSecGrpMembByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedTSecGrpMembByUserIdx";
		YCFGenKbTSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFGenKbTSecGrpMembObj> arrayList = new ArrayList<IYCFGenKbTSecGrpMembObj>();
		if( indexByUserIdx != null ) {
			Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGrpMembObj arr[] = new IYCFGenKbTSecGrpMembObj[len];
				Iterator<IYCFGenKbTSecGrpMembObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGrpMembObj obj;
			Iterator<IYCFGenKbTSecGrpMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGrpMembObj> cmp = new Comparator<IYCFGenKbTSecGrpMembObj>() {
			public int compare( IYCFGenKbTSecGrpMembObj lhs, IYCFGenKbTSecGrpMembObj rhs ) {
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
					YCFGenKbTSecGrpMembPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbTSecGrpMembObj readCachedTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		IYCFGenKbTSecGrpMembObj obj = null;
		YCFGenKbTSecGrpMembByUUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );
		if( indexByUUserIdx != null ) {
			if( indexByUUserIdx.containsKey( key ) ) {
				obj = indexByUUserIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbTSecGrpMembObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbTSecGrpMembObj> valIter = members.values().iterator();
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
		IYCFGenKbTSecGrpMembObj obj = readCachedTSecGrpMembByIdIdx( TenantId,
				TSecGrpMembId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGrpMembByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGrpMembByTenantIdx";
		IYCFGenKbTSecGrpMembObj obj;
		List<IYCFGenKbTSecGrpMembObj> arrayList = readCachedTSecGrpMembByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGrpMembObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbTSecGrpMembObj obj;
		List<IYCFGenKbTSecGrpMembObj> arrayList = readCachedTSecGrpMembByGroupIdx( TenantId,
				TSecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGrpMembObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbTSecGrpMembObj obj;
		List<IYCFGenKbTSecGrpMembObj> arrayList = readCachedTSecGrpMembByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGrpMembObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbTSecGrpMembObj obj = readCachedTSecGrpMembByUUserIdx( TenantId,
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
	public List<IYCFGenKbTSecGrpMembObj> pageTSecGrpMembByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageTSecGrpMembByTenantIdx";
		YCFGenKbTSecGrpMembByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		List<IYCFGenKbTSecGrpMembObj> retList = new LinkedList<IYCFGenKbTSecGrpMembObj>();
		IYCFGenKbTSecGrpMembObj obj;
		YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageBuffByTenantIdx( schema.getAuthorization(),
				TenantId,
			priorTenantId,
			priorTSecGrpMembId );
		YCFGenKbTSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbTSecGrpMembObj realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
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
	public List<IYCFGenKbTSecGrpMembObj> pageTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageTSecGrpMembByGroupIdx";
		YCFGenKbTSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		List<IYCFGenKbTSecGrpMembObj> retList = new LinkedList<IYCFGenKbTSecGrpMembObj>();
		IYCFGenKbTSecGrpMembObj obj;
		YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageBuffByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
			priorTenantId,
			priorTSecGrpMembId );
		YCFGenKbTSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbTSecGrpMembObj realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
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
	public List<IYCFGenKbTSecGrpMembObj> pageTSecGrpMembByUserIdx( UUID SecUserId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageTSecGrpMembByUserIdx";
		YCFGenKbTSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFGenKbTSecGrpMembObj> retList = new LinkedList<IYCFGenKbTSecGrpMembObj>();
		IYCFGenKbTSecGrpMembObj obj;
		YCFGenKbTSecGrpMembBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorTenantId,
			priorTSecGrpMembId );
		YCFGenKbTSecGrpMembBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpMembTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbTSecGrpMembObj realised = (IYCFGenKbTSecGrpMembObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbTSecGrpMembObj updateTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj ) {
		IYCFGenKbTSecGrpMembObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().updateTSecGrpMemb( schema.getAuthorization(),
			Obj.getTSecGrpMembBuff() );
		obj = (IYCFGenKbTSecGrpMembObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj ) {
		IYCFGenKbTSecGrpMembObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMemb( schema.getAuthorization(),
			obj.getTSecGrpMembBuff() );
		Obj.forget();
	}

	public void deleteTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId )
	{
		YCFGenKbTSecGrpMembPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpMembId( TSecGrpMembId );
		IYCFGenKbTSecGrpMembObj obj = readTSecGrpMemb( pkey );
		if( obj != null ) {
			IYCFGenKbTSecGrpMembEditObj editObj = (IYCFGenKbTSecGrpMembEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbTSecGrpMembEditObj)obj.beginEdit();
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
		YCFGenKbTSecGrpMembByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbTSecGrpMembByTenantIdxKey,
				Map< YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbTSecGrpMembObj> iter = dict.values().iterator();
			IYCFGenKbTSecGrpMembObj obj;
			List<IYCFGenKbTSecGrpMembObj> toForget = new LinkedList<IYCFGenKbTSecGrpMembObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGrpMembByTenantIdx( TenantId );
	}

	public void deleteTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		YCFGenKbTSecGrpMembByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbTSecGrpMembByGroupIdxKey,
				Map< YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict = indexByGroupIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			Iterator<IYCFGenKbTSecGrpMembObj> iter = dict.values().iterator();
			IYCFGenKbTSecGrpMembObj obj;
			List<IYCFGenKbTSecGrpMembObj> toForget = new LinkedList<IYCFGenKbTSecGrpMembObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
		}
		deepDisposeTSecGrpMembByGroupIdx( TenantId,
				TSecGroupId );
	}

	public void deleteTSecGrpMembByUserIdx( UUID SecUserId )
	{
		YCFGenKbTSecGrpMembByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFGenKbTSecGrpMembByUserIdxKey,
				Map< YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGrpMembPKey, IYCFGenKbTSecGrpMembObj> dict = indexByUserIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFGenKbTSecGrpMembObj> iter = dict.values().iterator();
			IYCFGenKbTSecGrpMembObj obj;
			List<IYCFGenKbTSecGrpMembObj> toForget = new LinkedList<IYCFGenKbTSecGrpMembObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeTSecGrpMembByUserIdx( SecUserId );
	}

	public void deleteTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		if( indexByUUserIdx == null ) {
			indexByUUserIdx = new HashMap< YCFGenKbTSecGrpMembByUUserIdxKey,
				IYCFGenKbTSecGrpMembObj >();
		}
		YCFGenKbTSecGrpMembByUUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );
		IYCFGenKbTSecGrpMembObj obj = null;
		if( indexByUUserIdx.containsKey( key ) ) {
			obj = indexByUUserIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUUserIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				SecUserId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpMemb().deleteTSecGrpMembByUUserIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				SecUserId );
		}
		deepDisposeTSecGrpMembByUUserIdx( TenantId,
				TSecGroupId,
				SecUserId );
	}
}
