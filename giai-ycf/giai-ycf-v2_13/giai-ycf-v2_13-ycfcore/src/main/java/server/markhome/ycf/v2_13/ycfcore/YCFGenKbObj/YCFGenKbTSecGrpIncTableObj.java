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

public class YCFGenKbTSecGrpIncTableObj
	implements IYCFGenKbTSecGrpIncTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> members;
	private Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> allTSecGrpInc;
	private Map< YCFGenKbTSecGrpIncByTenantIdxKey,
		Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > > indexByTenantIdx;
	private Map< YCFGenKbTSecGrpIncByGroupIdxKey,
		Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > > indexByGroupIdx;
	private Map< YCFGenKbTSecGrpIncByIncludeIdxKey,
		Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > > indexByIncludeIdx;
	private Map< YCFGenKbTSecGrpIncByUIncludeIdxKey,
		IYCFGenKbTSecGrpIncObj > indexByUIncludeIdx;
	public static String TABLE_NAME = "TSecGrpInc";
	public static String TABLE_DBNAME = "tsecinc";

	public YCFGenKbTSecGrpIncTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj>();
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
	}

	public YCFGenKbTSecGrpIncTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj>();
		allTSecGrpInc = null;
		indexByTenantIdx = null;
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
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
		List<IYCFGenKbTSecGrpIncObj> toForget = new LinkedList<IYCFGenKbTSecGrpIncObj>();
		IYCFGenKbTSecGrpIncObj cur = null;
		Iterator<IYCFGenKbTSecGrpIncObj> iter = members.values().iterator();
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
	 *	YCFGenKbTSecGrpIncObj.
	 */
	public IYCFGenKbTSecGrpIncObj newInstance() {
		IYCFGenKbTSecGrpIncObj inst = new YCFGenKbTSecGrpIncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbTSecGrpIncObj.
	 */
	public IYCFGenKbTSecGrpIncEditObj newEditInstance( IYCFGenKbTSecGrpIncObj orig ) {
		IYCFGenKbTSecGrpIncEditObj edit = new YCFGenKbTSecGrpIncEditObj( orig );
		return( edit );
	}

	public IYCFGenKbTSecGrpIncObj realiseTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj ) {
		IYCFGenKbTSecGrpIncObj obj = Obj;
		YCFGenKbTSecGrpIncPKey pkey = obj.getPKey();
		IYCFGenKbTSecGrpIncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbTSecGrpIncObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.remove( keepObj.getPKey() );
					if( mapIncludeIdx.size() <= 0 ) {
						indexByIncludeIdx.remove( keyIncludeIdx );
					}
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.remove( keyUIncludeIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

			if( allTSecGrpInc != null ) {
				allTSecGrpInc.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTSecGrpInc != null ) {
				allTSecGrpInc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbTSecGrpIncObj createTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj ) {
		IYCFGenKbTSecGrpIncObj obj = Obj;
		YCFGenKbTSecGrpIncBuff buff = obj.getTSecGrpIncBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().createTSecGrpInc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbTSecGrpIncObj readTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey ) {
		return( readTSecGrpInc( pkey, false ) );
	}

	public IYCFGenKbTSecGrpIncObj readTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey, boolean forceRead ) {
		IYCFGenKbTSecGrpIncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbTSecGrpIncBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGrpIncId() );
			if( readBuff != null ) {
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbTSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTSecGrpIncObj readCachedTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey ) {
		IYCFGenKbTSecGrpIncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGrpInc( IYCFGenKbTSecGrpIncObj obj )
	{
		final String S_ProcName = "YCFGenKbTSecGrpIncTableObj.reallyDeepDisposeTSecGrpInc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbTSecGrpIncPKey pkey = obj.getPKey();
		IYCFGenKbTSecGrpIncObj existing = readCachedTSecGrpInc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUIncludeIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );



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
	public void deepDisposeTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey ) {
		IYCFGenKbTSecGrpIncObj obj = readCachedTSecGrpInc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbTSecGrpIncObj lockTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey ) {
		IYCFGenKbTSecGrpIncObj locked = null;
		YCFGenKbTSecGrpIncBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGrpIncTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbTSecGrpIncObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTSecGrpInc", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbTSecGrpIncObj> readAllTSecGrpInc() {
		return( readAllTSecGrpInc( false ) );
	}

	public List<IYCFGenKbTSecGrpIncObj> readAllTSecGrpInc( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGrpInc";
		if( ( allTSecGrpInc == null ) || forceRead ) {
			Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> map = new HashMap<YCFGenKbTSecGrpIncPKey,IYCFGenKbTSecGrpIncObj>();
			allTSecGrpInc = map;
			YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readAllDerived( schema.getAuthorization() );
			YCFGenKbTSecGrpIncBuff buff;
			IYCFGenKbTSecGrpIncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpIncObj realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
			}
		}
		int len = allTSecGrpInc.size();
		IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
		Iterator<IYCFGenKbTSecGrpIncObj> valIter = allTSecGrpInc.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGrpIncObj> readCachedAllTSecGrpInc() {
		final String S_ProcName = "readCachedAllTSecGrpInc";
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>();
		if( allTSecGrpInc != null ) {
			int len = allTSecGrpInc.size();
			IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
			Iterator<IYCFGenKbTSecGrpIncObj> valIter = allTSecGrpInc.values().iterator();
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
		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbTSecGrpIncObj> pageAllTSecGrpInc(Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageAllTSecGrpInc";
		Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> map = new HashMap<YCFGenKbTSecGrpIncPKey,IYCFGenKbTSecGrpIncObj>();
		YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageAllBuff( schema.getAuthorization(),
			priorTenantId,
			priorTSecGrpIncId );
		YCFGenKbTSecGrpIncBuff buff;
		IYCFGenKbTSecGrpIncObj obj;
		IYCFGenKbTSecGrpIncObj realised;
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		return( readTSecGrpIncByIdIdx( TenantId,
			TSecGrpIncId,
			false ) );
	}

	public IYCFGenKbTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId, boolean forceRead )
	{
		YCFGenKbTSecGrpIncPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		IYCFGenKbTSecGrpIncObj obj = readTSecGrpInc( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId )
	{
		return( readTSecGrpIncByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByTenantIdx";
		YCFGenKbTSecGrpIncByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbTSecGrpIncByTenantIdxKey,
				Map< YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj>();
			IYCFGenKbTSecGrpIncObj obj;
			YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpIncObj realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
		Iterator<IYCFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGrpIncByGroupIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByGroupIdx";
		YCFGenKbTSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbTSecGrpIncByGroupIdxKey,
				Map< YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj>();
			IYCFGenKbTSecGrpIncObj obj;
			YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			YCFGenKbTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpIncObj realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
		Iterator<IYCFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		return( readTSecGrpIncByIncludeIdx( TenantId,
			IncludeGroupId,
			false ) );
	}

	public List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByIncludeIdx";
		YCFGenKbTSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict;
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFGenKbTSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByIncludeIdx.containsKey( key ) ) {
			dict = indexByIncludeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj>();
			IYCFGenKbTSecGrpIncObj obj;
			YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
			YCFGenKbTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGrpIncObj realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIncludeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
		Iterator<IYCFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbTSecGrpIncObj readTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		return( readTSecGrpIncByUIncludeIdx( TenantId,
			TSecGroupId,
			IncludeGroupId,
			false ) );
	}

	public IYCFGenKbTSecGrpIncObj readTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId, boolean forceRead )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< YCFGenKbTSecGrpIncByUIncludeIdxKey,
				IYCFGenKbTSecGrpIncObj >();
		}
		YCFGenKbTSecGrpIncByUIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFGenKbTSecGrpIncObj obj = null;
		if( ( ! forceRead ) && indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
		}
		else {
			YCFGenKbTSecGrpIncBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
			if( buff != null ) {
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbTSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTSecGrpIncObj readCachedTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		IYCFGenKbTSecGrpIncObj obj = null;
		YCFGenKbTSecGrpIncPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		obj = readCachedTSecGrpInc( pkey );
		return( obj );
	}

	public List<IYCFGenKbTSecGrpIncObj> readCachedTSecGrpIncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByTenantIdx";
		YCFGenKbTSecGrpIncByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
				Iterator<IYCFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGrpIncObj obj;
			Iterator<IYCFGenKbTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbTSecGrpIncObj> readCachedTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByGroupIdx";
		YCFGenKbTSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
				Iterator<IYCFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGrpIncObj obj;
			Iterator<IYCFGenKbTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbTSecGrpIncObj> readCachedTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByIncludeIdx";
		YCFGenKbTSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		ArrayList<IYCFGenKbTSecGrpIncObj> arrayList = new ArrayList<IYCFGenKbTSecGrpIncObj>();
		if( indexByIncludeIdx != null ) {
			Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict;
			if( indexByIncludeIdx.containsKey( key ) ) {
				dict = indexByIncludeIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGrpIncObj arr[] = new IYCFGenKbTSecGrpIncObj[len];
				Iterator<IYCFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGrpIncObj obj;
			Iterator<IYCFGenKbTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGrpIncObj> cmp = new Comparator<IYCFGenKbTSecGrpIncObj>() {
			public int compare( IYCFGenKbTSecGrpIncObj lhs, IYCFGenKbTSecGrpIncObj rhs ) {
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
					YCFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbTSecGrpIncObj readCachedTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		IYCFGenKbTSecGrpIncObj obj = null;
		YCFGenKbTSecGrpIncByUIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByUIncludeIdx != null ) {
			if( indexByUIncludeIdx.containsKey( key ) ) {
				obj = indexByUIncludeIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbTSecGrpIncObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbTSecGrpIncObj> valIter = members.values().iterator();
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

	public void deepDisposeTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		IYCFGenKbTSecGrpIncObj obj = readCachedTSecGrpIncByIdIdx( TenantId,
				TSecGrpIncId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGrpIncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGrpIncByTenantIdx";
		IYCFGenKbTSecGrpIncObj obj;
		List<IYCFGenKbTSecGrpIncObj> arrayList = readCachedTSecGrpIncByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "deepDisposeTSecGrpIncByGroupIdx";
		IYCFGenKbTSecGrpIncObj obj;
		List<IYCFGenKbTSecGrpIncObj> arrayList = readCachedTSecGrpIncByGroupIdx( TenantId,
				TSecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "deepDisposeTSecGrpIncByIncludeIdx";
		IYCFGenKbTSecGrpIncObj obj;
		List<IYCFGenKbTSecGrpIncObj> arrayList = readCachedTSecGrpIncByIncludeIdx( TenantId,
				IncludeGroupId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		IYCFGenKbTSecGrpIncObj obj = readCachedTSecGrpIncByUIncludeIdx( TenantId,
				TSecGroupId,
				IncludeGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TenantIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFGenKbTSecGrpIncObj> pageTSecGrpIncByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByTenantIdx";
		YCFGenKbTSecGrpIncByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		List<IYCFGenKbTSecGrpIncObj> retList = new LinkedList<IYCFGenKbTSecGrpIncObj>();
		IYCFGenKbTSecGrpIncObj obj;
		YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByTenantIdx( schema.getAuthorization(),
				TenantId,
			priorTenantId,
			priorTSecGrpIncId );
		YCFGenKbTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbTSecGrpIncObj realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFGenKbTSecGrpIncObj> pageTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByGroupIdx";
		YCFGenKbTSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		List<IYCFGenKbTSecGrpIncObj> retList = new LinkedList<IYCFGenKbTSecGrpIncObj>();
		IYCFGenKbTSecGrpIncObj obj;
		YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
			priorTenantId,
			priorTSecGrpIncId );
		YCFGenKbTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbTSecGrpIncObj realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate IncludeIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFGenKbTSecGrpIncObj> pageTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByIncludeIdx";
		YCFGenKbTSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		List<IYCFGenKbTSecGrpIncObj> retList = new LinkedList<IYCFGenKbTSecGrpIncObj>();
		IYCFGenKbTSecGrpIncObj obj;
		YCFGenKbTSecGrpIncBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId,
			priorTenantId,
			priorTSecGrpIncId );
		YCFGenKbTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbTSecGrpIncObj realised = (IYCFGenKbTSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbTSecGrpIncObj updateTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj ) {
		IYCFGenKbTSecGrpIncObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().updateTSecGrpInc( schema.getAuthorization(),
			Obj.getTSecGrpIncBuff() );
		obj = (IYCFGenKbTSecGrpIncObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj ) {
		IYCFGenKbTSecGrpIncObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpInc( schema.getAuthorization(),
			obj.getTSecGrpIncBuff() );
		Obj.forget();
	}

	public void deleteTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		YCFGenKbTSecGrpIncPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		IYCFGenKbTSecGrpIncObj obj = readTSecGrpInc( pkey );
		if( obj != null ) {
			IYCFGenKbTSecGrpIncEditObj editObj = (IYCFGenKbTSecGrpIncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbTSecGrpIncEditObj)obj.beginEdit();
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
		deepDisposeTSecGrpIncByIdIdx( TenantId,
				TSecGrpIncId );
	}

	public void deleteTSecGrpIncByTenantIdx( long TenantId )
	{
		YCFGenKbTSecGrpIncByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbTSecGrpIncByTenantIdxKey,
				Map< YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbTSecGrpIncObj> iter = dict.values().iterator();
			IYCFGenKbTSecGrpIncObj obj;
			List<IYCFGenKbTSecGrpIncObj> toForget = new LinkedList<IYCFGenKbTSecGrpIncObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGrpIncByTenantIdx( TenantId );
	}

	public void deleteTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		YCFGenKbTSecGrpIncByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbTSecGrpIncByGroupIdxKey,
				Map< YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict = indexByGroupIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			Iterator<IYCFGenKbTSecGrpIncObj> iter = dict.values().iterator();
			IYCFGenKbTSecGrpIncObj obj;
			List<IYCFGenKbTSecGrpIncObj> toForget = new LinkedList<IYCFGenKbTSecGrpIncObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
		}
		deepDisposeTSecGrpIncByGroupIdx( TenantId,
				TSecGroupId );
	}

	public void deleteTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		YCFGenKbTSecGrpIncByIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFGenKbTSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj > >();
		}
		if( indexByIncludeIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGrpIncPKey, IYCFGenKbTSecGrpIncObj> dict = indexByIncludeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
			Iterator<IYCFGenKbTSecGrpIncObj> iter = dict.values().iterator();
			IYCFGenKbTSecGrpIncObj obj;
			List<IYCFGenKbTSecGrpIncObj> toForget = new LinkedList<IYCFGenKbTSecGrpIncObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
		}
		deepDisposeTSecGrpIncByIncludeIdx( TenantId,
				IncludeGroupId );
	}

	public void deleteTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< YCFGenKbTSecGrpIncByUIncludeIdxKey,
				IYCFGenKbTSecGrpIncObj >();
		}
		YCFGenKbTSecGrpIncByUIncludeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFGenKbTSecGrpIncObj obj = null;
		if( indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
		}
		deepDisposeTSecGrpIncByUIncludeIdx( TenantId,
				TSecGroupId,
				IncludeGroupId );
	}
}
