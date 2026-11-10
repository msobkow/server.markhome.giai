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

public class YCFBamTSecGrpIncTableObj
	implements IYCFBamTSecGrpIncTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> members;
	private Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> allTSecGrpInc;
	private Map< YCFSecTSecGrpIncByTenantIdxKey,
		Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > > indexByTenantIdx;
	private Map< YCFSecTSecGrpIncByGroupIdxKey,
		Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > > indexByGroupIdx;
	private Map< YCFSecTSecGrpIncByIncludeIdxKey,
		Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > > indexByIncludeIdx;
	private Map< YCFSecTSecGrpIncByUIncludeIdxKey,
		IYCFSecTSecGrpIncObj > indexByUIncludeIdx;
	public static String TABLE_NAME = "TSecGrpInc";
	public static String TABLE_DBNAME = "tsecinc";

	public YCFBamTSecGrpIncTableObj() {
		schema = null;
		members = new HashMap<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj>();
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
	}

	public YCFBamTSecGrpIncTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj>();
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
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
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
		List<IYCFSecTSecGrpIncObj> toForget = new LinkedList<IYCFSecTSecGrpIncObj>();
		IYCFSecTSecGrpIncObj cur = null;
		Iterator<IYCFSecTSecGrpIncObj> iter = members.values().iterator();
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
	 *	YCFBamTSecGrpIncObj.
	 */
	public IYCFSecTSecGrpIncObj newInstance() {
		IYCFSecTSecGrpIncObj inst = new YCFBamTSecGrpIncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTSecGrpIncObj.
	 */
	public IYCFSecTSecGrpIncEditObj newEditInstance( IYCFSecTSecGrpIncObj orig ) {
		IYCFSecTSecGrpIncEditObj edit = new YCFBamTSecGrpIncEditObj( orig );
		return( edit );
	}

	public IYCFSecTSecGrpIncObj realiseTSecGrpInc( IYCFSecTSecGrpIncObj Obj ) {
		IYCFSecTSecGrpIncObj obj = Obj;
		YCFSecTSecGrpIncPKey pkey = obj.getPKey();
		IYCFSecTSecGrpIncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecTSecGrpIncObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFSecTSecGrpIncByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecTSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFSecTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.remove( keepObj.getPKey() );
					if( mapIncludeIdx.size() <= 0 ) {
						indexByIncludeIdx.remove( keyIncludeIdx );
					}
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFSecTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.remove( keyUIncludeIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFSecTSecGrpIncByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecTSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFSecTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFSecTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
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
				YCFSecTSecGrpIncByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecTSecGrpIncByGroupIdxKey keyGroupIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				YCFSecTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				YCFSecTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecTSecGrpIncObj createTSecGrpInc( IYCFSecTSecGrpIncObj Obj ) {
		IYCFSecTSecGrpIncObj obj = Obj;
		YCFSecTSecGrpIncBuff buff = obj.getTSecGrpIncBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().createTSecGrpInc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecTSecGrpIncObj readTSecGrpInc( YCFSecTSecGrpIncPKey pkey ) {
		return( readTSecGrpInc( pkey, false ) );
	}

	public IYCFSecTSecGrpIncObj readTSecGrpInc( YCFSecTSecGrpIncPKey pkey, boolean forceRead ) {
		IYCFSecTSecGrpIncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecTSecGrpIncBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGrpIncId() );
			if( readBuff != null ) {
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecTSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTSecGrpIncObj readCachedTSecGrpInc( YCFSecTSecGrpIncPKey pkey ) {
		IYCFSecTSecGrpIncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGrpInc( IYCFSecTSecGrpIncObj obj )
	{
		final String S_ProcName = "YCFBamTSecGrpIncTableObj.reallyDeepDisposeTSecGrpInc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecTSecGrpIncPKey pkey = obj.getPKey();
		IYCFSecTSecGrpIncObj existing = readCachedTSecGrpInc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecTSecGrpIncByTenantIdxKey keyTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGrpIncByGroupIdxKey keyGroupIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFSecTSecGrpIncByIncludeIdxKey keyIncludeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecTSecGrpIncByUIncludeIdxKey keyUIncludeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
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
	public void deepDisposeTSecGrpInc( YCFSecTSecGrpIncPKey pkey ) {
		IYCFSecTSecGrpIncObj obj = readCachedTSecGrpInc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecTSecGrpIncObj lockTSecGrpInc( YCFSecTSecGrpIncPKey pkey ) {
		IYCFSecTSecGrpIncObj locked = null;
		YCFSecTSecGrpIncBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGrpIncTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecTSecGrpIncObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTSecGrpInc", pkey );
		}
		return( locked );
	}

	public List<IYCFSecTSecGrpIncObj> readAllTSecGrpInc() {
		return( readAllTSecGrpInc( false ) );
	}

	public List<IYCFSecTSecGrpIncObj> readAllTSecGrpInc( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGrpInc";
		if( ( allTSecGrpInc == null ) || forceRead ) {
			Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> map = new HashMap<YCFSecTSecGrpIncPKey,IYCFSecTSecGrpIncObj>();
			allTSecGrpInc = map;
			YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().readAllDerived( schema.getAuthorization() );
			YCFSecTSecGrpIncBuff buff;
			IYCFSecTSecGrpIncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpIncObj realised = (IYCFSecTSecGrpIncObj)obj.realise();
			}
		}
		int len = allTSecGrpInc.size();
		IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
		Iterator<IYCFSecTSecGrpIncObj> valIter = allTSecGrpInc.values().iterator();
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
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGrpIncObj> readCachedAllTSecGrpInc() {
		final String S_ProcName = "readCachedAllTSecGrpInc";
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>();
		if( allTSecGrpInc != null ) {
			int len = allTSecGrpInc.size();
			IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
			Iterator<IYCFSecTSecGrpIncObj> valIter = allTSecGrpInc.values().iterator();
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
		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFSecTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecTSecGrpIncObj> pageAllTSecGrpInc(Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageAllTSecGrpInc";
		Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> map = new HashMap<YCFSecTSecGrpIncPKey,IYCFSecTSecGrpIncObj>();
		YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().pageAllBuff( schema.getAuthorization(),
			priorTenantId,
			priorTSecGrpIncId );
		YCFSecTSecGrpIncBuff buff;
		IYCFSecTSecGrpIncObj obj;
		IYCFSecTSecGrpIncObj realised;
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecTSecGrpIncObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		return( readTSecGrpIncByIdIdx( TenantId,
			TSecGrpIncId,
			false ) );
	}

	public IYCFSecTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId, boolean forceRead )
	{
		YCFSecTSecGrpIncPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		IYCFSecTSecGrpIncObj obj = readTSecGrpInc( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId )
	{
		return( readTSecGrpIncByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFSecTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByTenantIdx";
		YCFSecTSecGrpIncByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFSecTSecGrpIncByTenantIdxKey,
				Map< YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj>();
			IYCFSecTSecGrpIncObj obj;
			YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFSecTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpIncObj realised = (IYCFSecTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
		Iterator<IYCFSecTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGrpIncByGroupIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public List<IYCFSecTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByGroupIdx";
		YCFSecTSecGrpIncByGroupIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecTSecGrpIncByGroupIdxKey,
				Map< YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj>();
			IYCFSecTSecGrpIncObj obj;
			YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			YCFSecTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpIncObj realised = (IYCFSecTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
		Iterator<IYCFSecTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		return( readTSecGrpIncByIncludeIdx( TenantId,
			IncludeGroupId,
			false ) );
	}

	public List<IYCFSecTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByIncludeIdx";
		YCFSecTSecGrpIncByIncludeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict;
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFSecTSecGrpIncByIncludeIdxKey,
				Map< YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByIncludeIdx.containsKey( key ) ) {
			dict = indexByIncludeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj>();
			IYCFSecTSecGrpIncObj obj;
			YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
			YCFSecTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				IYCFSecTSecGrpIncObj realised = (IYCFSecTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIncludeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
		Iterator<IYCFSecTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecTSecGrpIncObj readTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		return( readTSecGrpIncByUIncludeIdx( TenantId,
			TSecGroupId,
			IncludeGroupId,
			false ) );
	}

	public IYCFSecTSecGrpIncObj readTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId, boolean forceRead )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< YCFSecTSecGrpIncByUIncludeIdxKey,
				IYCFSecTSecGrpIncObj >();
		}
		YCFSecTSecGrpIncByUIncludeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFSecTSecGrpIncObj obj = null;
		if( ( ! forceRead ) && indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
		}
		else {
			YCFSecTSecGrpIncBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
			if( buff != null ) {
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecTSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTSecGrpIncObj readCachedTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		IYCFSecTSecGrpIncObj obj = null;
		YCFSecTSecGrpIncPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		obj = readCachedTSecGrpInc( pkey );
		return( obj );
	}

	public List<IYCFSecTSecGrpIncObj> readCachedTSecGrpIncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByTenantIdx";
		YCFSecTSecGrpIncByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
				Iterator<IYCFSecTSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGrpIncObj obj;
			Iterator<IYCFSecTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecTSecGrpIncObj> readCachedTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByGroupIdx";
		YCFSecTSecGrpIncByGroupIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
				Iterator<IYCFSecTSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGrpIncObj obj;
			Iterator<IYCFSecTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecTSecGrpIncObj> readCachedTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByIncludeIdx";
		YCFSecTSecGrpIncByIncludeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		ArrayList<IYCFSecTSecGrpIncObj> arrayList = new ArrayList<IYCFSecTSecGrpIncObj>();
		if( indexByIncludeIdx != null ) {
			Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict;
			if( indexByIncludeIdx.containsKey( key ) ) {
				dict = indexByIncludeIdx.get( key );
				int len = dict.size();
				IYCFSecTSecGrpIncObj arr[] = new IYCFSecTSecGrpIncObj[len];
				Iterator<IYCFSecTSecGrpIncObj> valIter = dict.values().iterator();
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
			IYCFSecTSecGrpIncObj obj;
			Iterator<IYCFSecTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTSecGrpIncObj> cmp = new Comparator<IYCFSecTSecGrpIncObj>() {
			public int compare( IYCFSecTSecGrpIncObj lhs, IYCFSecTSecGrpIncObj rhs ) {
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
					YCFSecTSecGrpIncPKey lhsPKey = lhs.getPKey();
					YCFSecTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecTSecGrpIncObj readCachedTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		IYCFSecTSecGrpIncObj obj = null;
		YCFSecTSecGrpIncByUIncludeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByUIncludeIdx != null ) {
			if( indexByUIncludeIdx.containsKey( key ) ) {
				obj = indexByUIncludeIdx.get( key );
			}
			else {
				Iterator<IYCFSecTSecGrpIncObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecTSecGrpIncObj> valIter = members.values().iterator();
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
		IYCFSecTSecGrpIncObj obj = readCachedTSecGrpIncByIdIdx( TenantId,
				TSecGrpIncId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGrpIncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGrpIncByTenantIdx";
		IYCFSecTSecGrpIncObj obj;
		List<IYCFSecTSecGrpIncObj> arrayList = readCachedTSecGrpIncByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGrpIncObj> arrayIter = arrayList.iterator();
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
		IYCFSecTSecGrpIncObj obj;
		List<IYCFSecTSecGrpIncObj> arrayList = readCachedTSecGrpIncByGroupIdx( TenantId,
				TSecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGrpIncObj> arrayIter = arrayList.iterator();
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
		IYCFSecTSecGrpIncObj obj;
		List<IYCFSecTSecGrpIncObj> arrayList = readCachedTSecGrpIncByIncludeIdx( TenantId,
				IncludeGroupId );
		if( arrayList != null )  {
			Iterator<IYCFSecTSecGrpIncObj> arrayIter = arrayList.iterator();
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
		IYCFSecTSecGrpIncObj obj = readCachedTSecGrpIncByUIncludeIdx( TenantId,
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
	public List<IYCFSecTSecGrpIncObj> pageTSecGrpIncByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByTenantIdx";
		YCFSecTSecGrpIncByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		List<IYCFSecTSecGrpIncObj> retList = new LinkedList<IYCFSecTSecGrpIncObj>();
		IYCFSecTSecGrpIncObj obj;
		YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByTenantIdx( schema.getAuthorization(),
				TenantId,
			priorTenantId,
			priorTSecGrpIncId );
		YCFSecTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFSecTSecGrpIncObj realised = (IYCFSecTSecGrpIncObj)obj.realise();
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
	public List<IYCFSecTSecGrpIncObj> pageTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByGroupIdx";
		YCFSecTSecGrpIncByGroupIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		List<IYCFSecTSecGrpIncObj> retList = new LinkedList<IYCFSecTSecGrpIncObj>();
		IYCFSecTSecGrpIncObj obj;
		YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
			priorTenantId,
			priorTSecGrpIncId );
		YCFSecTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFSecTSecGrpIncObj realised = (IYCFSecTSecGrpIncObj)obj.realise();
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
	public List<IYCFSecTSecGrpIncObj> pageTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByIncludeIdx";
		YCFSecTSecGrpIncByIncludeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		List<IYCFSecTSecGrpIncObj> retList = new LinkedList<IYCFSecTSecGrpIncObj>();
		IYCFSecTSecGrpIncObj obj;
		YCFSecTSecGrpIncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId,
			priorTenantId,
			priorTSecGrpIncId );
		YCFSecTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			IYCFSecTSecGrpIncObj realised = (IYCFSecTSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecTSecGrpIncObj updateTSecGrpInc( IYCFSecTSecGrpIncObj Obj ) {
		IYCFSecTSecGrpIncObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().updateTSecGrpInc( schema.getAuthorization(),
			Obj.getTSecGrpIncBuff() );
		obj = (IYCFSecTSecGrpIncObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGrpInc( IYCFSecTSecGrpIncObj Obj ) {
		IYCFSecTSecGrpIncObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpInc( schema.getAuthorization(),
			obj.getTSecGrpIncBuff() );
		Obj.forget();
	}

	public void deleteTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		YCFSecTSecGrpIncPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		IYCFSecTSecGrpIncObj obj = readTSecGrpInc( pkey );
		if( obj != null ) {
			IYCFSecTSecGrpIncEditObj editObj = (IYCFSecTSecGrpIncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecTSecGrpIncEditObj)obj.beginEdit();
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
		YCFSecTSecGrpIncByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFSecTSecGrpIncByTenantIdxKey,
				Map< YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFSecTSecGrpIncObj> iter = dict.values().iterator();
			IYCFSecTSecGrpIncObj obj;
			List<IYCFSecTSecGrpIncObj> toForget = new LinkedList<IYCFSecTSecGrpIncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGrpIncByTenantIdx( TenantId );
	}

	public void deleteTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		YCFSecTSecGrpIncByGroupIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecTSecGrpIncByGroupIdxKey,
				Map< YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict = indexByGroupIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			Iterator<IYCFSecTSecGrpIncObj> iter = dict.values().iterator();
			IYCFSecTSecGrpIncObj obj;
			List<IYCFSecTSecGrpIncObj> toForget = new LinkedList<IYCFSecTSecGrpIncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
		}
		deepDisposeTSecGrpIncByGroupIdx( TenantId,
				TSecGroupId );
	}

	public void deleteTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		YCFSecTSecGrpIncByIncludeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< YCFSecTSecGrpIncByIncludeIdxKey,
				Map< YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj > >();
		}
		if( indexByIncludeIdx.containsKey( key ) ) {
			Map<YCFSecTSecGrpIncPKey, IYCFSecTSecGrpIncObj> dict = indexByIncludeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
			Iterator<IYCFSecTSecGrpIncObj> iter = dict.values().iterator();
			IYCFSecTSecGrpIncObj obj;
			List<IYCFSecTSecGrpIncObj> toForget = new LinkedList<IYCFSecTSecGrpIncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( schema.getAuthorization(),
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
			indexByUIncludeIdx = new HashMap< YCFSecTSecGrpIncByUIncludeIdxKey,
				IYCFSecTSecGrpIncObj >();
		}
		YCFSecTSecGrpIncByUIncludeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		IYCFSecTSecGrpIncObj obj = null;
		if( indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
		}
		deepDisposeTSecGrpIncByUIncludeIdx( TenantId,
				TSecGroupId,
				IncludeGroupId );
	}
}
