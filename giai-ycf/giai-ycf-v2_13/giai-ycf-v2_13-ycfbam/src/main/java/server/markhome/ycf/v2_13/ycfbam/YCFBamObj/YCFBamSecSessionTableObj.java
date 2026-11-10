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

public class YCFBamSecSessionTableObj
	implements IYCFBamSecSessionTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> members;
	private Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> allSecSession;
	private Map< YCFSecSecSessionBySecUserIdxKey,
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > > indexBySecUserIdx;
	private Map< YCFSecSecSessionBySecDevIdxKey,
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > > indexBySecDevIdx;
	private Map< YCFSecSecSessionByStartIdxKey,
		IYCFSecSecSessionObj > indexByStartIdx;
	private Map< YCFSecSecSessionByFinishIdxKey,
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > > indexByFinishIdx;
	private Map< YCFSecSecSessionBySecProxyIdxKey,
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > > indexBySecProxyIdx;
	public static String TABLE_NAME = "SecSession";
	public static String TABLE_DBNAME = "secsess";

	public YCFBamSecSessionTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecSessionPKey, IYCFSecSecSessionObj>();
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
	}

	public YCFBamSecSessionTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecSecSessionPKey, IYCFSecSecSessionObj>();
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
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
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
		List<IYCFSecSecSessionObj> toForget = new LinkedList<IYCFSecSecSessionObj>();
		IYCFSecSecSessionObj cur = null;
		Iterator<IYCFSecSecSessionObj> iter = members.values().iterator();
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
	 *	YCFBamSecSessionObj.
	 */
	public IYCFSecSecSessionObj newInstance() {
		IYCFSecSecSessionObj inst = new YCFBamSecSessionObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSecSessionObj.
	 */
	public IYCFSecSecSessionEditObj newEditInstance( IYCFSecSecSessionObj orig ) {
		IYCFSecSecSessionEditObj edit = new YCFBamSecSessionEditObj( orig );
		return( edit );
	}

	public IYCFSecSecSessionObj realiseSecSession( IYCFSecSecSessionObj Obj ) {
		IYCFSecSecSessionObj obj = Obj;
		YCFSecSecSessionPKey pkey = obj.getPKey();
		IYCFSecSecSessionObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecSessionObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexBySecUserIdx != null ) {
				YCFSecSecSessionBySecUserIdxKey keySecUserIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.remove( keepObj.getPKey() );
					if( mapSecUserIdx.size() <= 0 ) {
						indexBySecUserIdx.remove( keySecUserIdx );
					}
				}
			}

			if( indexBySecDevIdx != null ) {
				YCFSecSecSessionBySecDevIdxKey keySecDevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.remove( keepObj.getPKey() );
					if( mapSecDevIdx.size() <= 0 ) {
						indexBySecDevIdx.remove( keySecDevIdx );
					}
				}
			}

			if( indexByStartIdx != null ) {
				YCFSecSecSessionByStartIdxKey keyStartIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.remove( keyStartIdx );
			}

			if( indexByFinishIdx != null ) {
				YCFSecSecSessionByFinishIdxKey keyFinishIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.remove( keepObj.getPKey() );
					if( mapFinishIdx.size() <= 0 ) {
						indexByFinishIdx.remove( keyFinishIdx );
					}
				}
			}

			if( indexBySecProxyIdx != null ) {
				YCFSecSecSessionBySecProxyIdxKey keySecProxyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
				if( mapSecProxyIdx != null ) {
					mapSecProxyIdx.remove( keepObj.getPKey() );
					if( mapSecProxyIdx.size() <= 0 ) {
						indexBySecProxyIdx.remove( keySecProxyIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexBySecUserIdx != null ) {
				YCFSecSecSessionBySecUserIdxKey keySecUserIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecDevIdx != null ) {
				YCFSecSecSessionBySecDevIdxKey keySecDevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByStartIdx != null ) {
				YCFSecSecSessionByStartIdxKey keyStartIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.put( keyStartIdx, keepObj );
			}

			if( indexByFinishIdx != null ) {
				YCFSecSecSessionByFinishIdxKey keyFinishIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecProxyIdx != null ) {
				YCFSecSecSessionBySecProxyIdxKey keySecProxyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
				if( mapSecProxyIdx != null ) {
					mapSecProxyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecSession != null ) {
				allSecSession.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecSession != null ) {
				allSecSession.put( keepObj.getPKey(), keepObj );
			}

			if( indexBySecUserIdx != null ) {
				YCFSecSecSessionBySecUserIdxKey keySecUserIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecDevIdx != null ) {
				YCFSecSecSessionBySecDevIdxKey keySecDevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByStartIdx != null ) {
				YCFSecSecSessionByStartIdxKey keyStartIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.put( keyStartIdx, keepObj );
			}

			if( indexByFinishIdx != null ) {
				YCFSecSecSessionByFinishIdxKey keyFinishIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecProxyIdx != null ) {
				YCFSecSecSessionBySecProxyIdxKey keySecProxyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
				if( mapSecProxyIdx != null ) {
					mapSecProxyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecSecSessionObj createSecSession( IYCFSecSecSessionObj Obj ) {
		IYCFSecSecSessionObj obj = Obj;
		YCFSecSecSessionBuff buff = obj.getSecSessionBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().createSecSession(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecSessionObj readSecSession( YCFSecSecSessionPKey pkey ) {
		return( readSecSession( pkey, false ) );
	}

	public IYCFSecSecSessionObj readSecSession( YCFSecSecSessionPKey pkey, boolean forceRead ) {
		IYCFSecSecSessionObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecSessionBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecSessionId() );
			if( readBuff != null ) {
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecSessionObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecSessionObj readCachedSecSession( YCFSecSecSessionPKey pkey ) {
		IYCFSecSecSessionObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecSession( IYCFSecSecSessionObj obj )
	{
		final String S_ProcName = "YCFBamSecSessionTableObj.reallyDeepDisposeSecSession() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecSessionPKey pkey = obj.getPKey();
		IYCFSecSecSessionObj existing = readCachedSecSession( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecSessionBySecUserIdxKey keySecUserIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		keySecUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecSessionBySecDevIdxKey keySecDevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		keySecDevIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keySecDevIdx.setOptionalSecDevName( existing.getOptionalSecDevName() );

		YCFSecSecSessionByStartIdxKey keyStartIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		keyStartIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyStartIdx.setRequiredStart( existing.getRequiredStart() );

		YCFSecSecSessionByFinishIdxKey keyFinishIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		keyFinishIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyFinishIdx.setOptionalFinish( existing.getOptionalFinish() );

		YCFSecSecSessionBySecProxyIdxKey keySecProxyIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		keySecProxyIdx.setOptionalSecProxyId( existing.getOptionalSecProxyId() );



		if( indexBySecUserIdx != null ) {
			if( indexBySecUserIdx.containsKey( keySecUserIdx ) ) {
				indexBySecUserIdx.get( keySecUserIdx ).remove( pkey );
				if( indexBySecUserIdx.get( keySecUserIdx ).size() <= 0 ) {
					indexBySecUserIdx.remove( keySecUserIdx );
				}
			}
		}

		if( indexBySecDevIdx != null ) {
			if( indexBySecDevIdx.containsKey( keySecDevIdx ) ) {
				indexBySecDevIdx.get( keySecDevIdx ).remove( pkey );
				if( indexBySecDevIdx.get( keySecDevIdx ).size() <= 0 ) {
					indexBySecDevIdx.remove( keySecDevIdx );
				}
			}
		}

		if( indexByStartIdx != null ) {
			indexByStartIdx.remove( keyStartIdx );
		}

		if( indexByFinishIdx != null ) {
			if( indexByFinishIdx.containsKey( keyFinishIdx ) ) {
				indexByFinishIdx.get( keyFinishIdx ).remove( pkey );
				if( indexByFinishIdx.get( keyFinishIdx ).size() <= 0 ) {
					indexByFinishIdx.remove( keyFinishIdx );
				}
			}
		}

		if( indexBySecProxyIdx != null ) {
			if( indexBySecProxyIdx.containsKey( keySecProxyIdx ) ) {
				indexBySecProxyIdx.get( keySecProxyIdx ).remove( pkey );
				if( indexBySecProxyIdx.get( keySecProxyIdx ).size() <= 0 ) {
					indexBySecProxyIdx.remove( keySecProxyIdx );
				}
			}
		}


	}
	public void deepDisposeSecSession( YCFSecSecSessionPKey pkey ) {
		IYCFSecSecSessionObj obj = readCachedSecSession( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecSessionObj lockSecSession( YCFSecSecSessionPKey pkey ) {
		IYCFSecSecSessionObj locked = null;
		YCFSecSecSessionBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecSessionTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecSessionObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecSession", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecSessionObj> readAllSecSession() {
		return( readAllSecSession( false ) );
	}

	public List<IYCFSecSecSessionObj> readAllSecSession( boolean forceRead ) {
		final String S_ProcName = "readAllSecSession";
		if( ( allSecSession == null ) || forceRead ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> map = new HashMap<YCFSecSecSessionPKey,IYCFSecSecSessionObj>();
			allSecSession = map;
			YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readAllDerived( schema.getAuthorization() );
			YCFSecSecSessionBuff buff;
			IYCFSecSecSessionObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
			}
		}
		int len = allSecSession.size();
		IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
		Iterator<IYCFSecSecSessionObj> valIter = allSecSession.values().iterator();
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
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecSessionObj> readCachedAllSecSession() {
		final String S_ProcName = "readCachedAllSecSession";
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>();
		if( allSecSession != null ) {
			int len = allSecSession.size();
			IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
			Iterator<IYCFSecSecSessionObj> valIter = allSecSession.values().iterator();
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
		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecSession-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecSessionObj> pageAllSecSession(UUID priorSecSessionId )
	{
		final String S_ProcName = "pageAllSecSession";
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> map = new HashMap<YCFSecSecSessionPKey,IYCFSecSecSessionObj>();
		YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().pageAllBuff( schema.getAuthorization(),
			priorSecSessionId );
		YCFSecSecSessionBuff buff;
		IYCFSecSecSessionObj obj;
		IYCFSecSecSessionObj realised;
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecSessionObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecSessionObj readSecSessionByIdIdx( UUID SecSessionId )
	{
		return( readSecSessionByIdIdx( SecSessionId,
			false ) );
	}

	public IYCFSecSecSessionObj readSecSessionByIdIdx( UUID SecSessionId, boolean forceRead )
	{
		YCFSecSecSessionPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		IYCFSecSecSessionObj obj = readSecSession( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId )
	{
		return( readSecSessionBySecUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFSecSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecUserIdx";
		YCFSecSecSessionBySecUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
		if( indexBySecUserIdx == null ) {
			indexBySecUserIdx = new HashMap< YCFSecSecSessionBySecUserIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecUserIdx.containsKey( key ) ) {
			dict = indexBySecUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecSessionPKey, IYCFSecSecSessionObj>();
			IYCFSecSecSessionObj obj;
			YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFSecSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
		Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		return( readSecSessionBySecDevIdx( SecUserId,
			SecDevName,
			false ) );
	}

	public List<IYCFSecSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecDevIdx";
		YCFSecSecSessionBySecDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
		if( indexBySecDevIdx == null ) {
			indexBySecDevIdx = new HashMap< YCFSecSecSessionBySecDevIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecDevIdx.containsKey( key ) ) {
			dict = indexBySecDevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecSessionPKey, IYCFSecSecSessionObj>();
			IYCFSecSecSessionObj obj;
			YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
			YCFSecSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecDevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
		Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecSessionObj readSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		return( readSecSessionByStartIdx( SecUserId,
			Start,
			false ) );
	}

	public IYCFSecSecSessionObj readSecSessionByStartIdx( UUID SecUserId,
		Calendar Start, boolean forceRead )
	{
		if( indexByStartIdx == null ) {
			indexByStartIdx = new HashMap< YCFSecSecSessionByStartIdxKey,
				IYCFSecSecSessionObj >();
		}
		YCFSecSecSessionByStartIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		IYCFSecSecSessionObj obj = null;
		if( ( ! forceRead ) && indexByStartIdx.containsKey( key ) ) {
			obj = indexByStartIdx.get( key );
		}
		else {
			YCFSecSecSessionBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readDerivedByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
			if( buff != null ) {
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecSessionObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFSecSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		return( readSecSessionByFinishIdx( SecUserId,
			Finish,
			false ) );
	}

	public List<IYCFSecSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionByFinishIdx";
		YCFSecSecSessionByFinishIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
		if( indexByFinishIdx == null ) {
			indexByFinishIdx = new HashMap< YCFSecSecSessionByFinishIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexByFinishIdx.containsKey( key ) ) {
			dict = indexByFinishIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecSessionPKey, IYCFSecSecSessionObj>();
			IYCFSecSecSessionObj obj;
			YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readDerivedByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
			YCFSecSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFinishIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
		Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		return( readSecSessionBySecProxyIdx( SecProxyId,
			false ) );
	}

	public List<IYCFSecSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecProxyIdx";
		YCFSecSecSessionBySecProxyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
		if( indexBySecProxyIdx == null ) {
			indexBySecProxyIdx = new HashMap< YCFSecSecSessionBySecProxyIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecProxyIdx.containsKey( key ) ) {
			dict = indexBySecProxyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecSessionPKey, IYCFSecSecSessionObj>();
			IYCFSecSecSessionObj obj;
			YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
			YCFSecSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecProxyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
		Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecSessionObj readCachedSecSessionByIdIdx( UUID SecSessionId )
	{
		IYCFSecSecSessionObj obj = null;
		YCFSecSecSessionPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		obj = readCachedSecSession( pkey );
		return( obj );
	}

	public List<IYCFSecSecSessionObj> readCachedSecSessionBySecUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecSessionBySecUserIdx";
		YCFSecSecSessionBySecUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>();
		if( indexBySecUserIdx != null ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
			if( indexBySecUserIdx.containsKey( key ) ) {
				dict = indexBySecUserIdx.get( key );
				int len = dict.size();
				IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
				Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
			IYCFSecSecSessionObj obj;
			Iterator<IYCFSecSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecSessionObj> readCachedSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "readCachedSecSessionBySecDevIdx";
		YCFSecSecSessionBySecDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>();
		if( indexBySecDevIdx != null ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
			if( indexBySecDevIdx.containsKey( key ) ) {
				dict = indexBySecDevIdx.get( key );
				int len = dict.size();
				IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
				Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
			IYCFSecSecSessionObj obj;
			Iterator<IYCFSecSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecSessionObj readCachedSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		IYCFSecSecSessionObj obj = null;
		YCFSecSecSessionByStartIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		if( indexByStartIdx != null ) {
			if( indexByStartIdx.containsKey( key ) ) {
				obj = indexByStartIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecSessionObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecSessionObj> valIter = members.values().iterator();
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

	public List<IYCFSecSecSessionObj> readCachedSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "readCachedSecSessionByFinishIdx";
		YCFSecSecSessionByFinishIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>();
		if( indexByFinishIdx != null ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
			if( indexByFinishIdx.containsKey( key ) ) {
				dict = indexByFinishIdx.get( key );
				int len = dict.size();
				IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
				Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
			IYCFSecSecSessionObj obj;
			Iterator<IYCFSecSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecSessionObj> readCachedSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		final String S_ProcName = "readCachedSecSessionBySecProxyIdx";
		YCFSecSecSessionBySecProxyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		ArrayList<IYCFSecSecSessionObj> arrayList = new ArrayList<IYCFSecSecSessionObj>();
		if( indexBySecProxyIdx != null ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict;
			if( indexBySecProxyIdx.containsKey( key ) ) {
				dict = indexBySecProxyIdx.get( key );
				int len = dict.size();
				IYCFSecSecSessionObj arr[] = new IYCFSecSecSessionObj[len];
				Iterator<IYCFSecSecSessionObj> valIter = dict.values().iterator();
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
			IYCFSecSecSessionObj obj;
			Iterator<IYCFSecSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecSessionObj> cmp = new Comparator<IYCFSecSecSessionObj>() {
			public int compare( IYCFSecSecSessionObj lhs, IYCFSecSecSessionObj rhs ) {
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
					YCFSecSecSessionPKey lhsPKey = lhs.getPKey();
					YCFSecSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSecSessionByIdIdx( UUID SecSessionId )
	{
		IYCFSecSecSessionObj obj = readCachedSecSessionByIdIdx( SecSessionId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecSessionBySecUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeSecSessionBySecUserIdx";
		IYCFSecSecSessionObj obj;
		List<IYCFSecSecSessionObj> arrayList = readCachedSecSessionBySecUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "deepDisposeSecSessionBySecDevIdx";
		IYCFSecSecSessionObj obj;
		List<IYCFSecSecSessionObj> arrayList = readCachedSecSessionBySecDevIdx( SecUserId,
				SecDevName );
		if( arrayList != null )  {
			Iterator<IYCFSecSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		IYCFSecSecSessionObj obj = readCachedSecSessionByStartIdx( SecUserId,
				Start );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "deepDisposeSecSessionByFinishIdx";
		IYCFSecSecSessionObj obj;
		List<IYCFSecSecSessionObj> arrayList = readCachedSecSessionByFinishIdx( SecUserId,
				Finish );
		if( arrayList != null )  {
			Iterator<IYCFSecSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		final String S_ProcName = "deepDisposeSecSessionBySecProxyIdx";
		IYCFSecSecSessionObj obj;
		List<IYCFSecSecSessionObj> arrayList = readCachedSecSessionBySecProxyIdx( SecProxyId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecUserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecSessionObj> pageSecSessionBySecUserIdx( UUID SecUserId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecUserIdx";
		YCFSecSecSessionBySecUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFSecSecSessionObj> retList = new LinkedList<IYCFSecSecSessionObj>();
		IYCFSecSecSessionObj obj;
		YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecUserIdx( schema.getAuthorization(),
				SecUserId,
			priorSecSessionId );
		YCFSecSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecDevIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecSessionObj> pageSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecDevIdx";
		YCFSecSecSessionBySecDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		List<IYCFSecSecSessionObj> retList = new LinkedList<IYCFSecSecSessionObj>();
		IYCFSecSecSessionObj obj;
		YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName,
			priorSecSessionId );
		YCFSecSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate FinishIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecSessionObj> pageSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionByFinishIdx";
		YCFSecSecSessionByFinishIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		List<IYCFSecSecSessionObj> retList = new LinkedList<IYCFSecSecSessionObj>();
		IYCFSecSecSessionObj obj;
		YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().pageBuffByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish,
			priorSecSessionId );
		YCFSecSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecProxyIdx key attributes.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecSessionObj> pageSecSessionBySecProxyIdx( UUID SecProxyId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecProxyIdx";
		YCFSecSecSessionBySecProxyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		List<IYCFSecSecSessionObj> retList = new LinkedList<IYCFSecSecSessionObj>();
		IYCFSecSecSessionObj obj;
		YCFSecSecSessionBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecProxyIdx( schema.getAuthorization(),
				SecProxyId,
			priorSecSessionId );
		YCFSecSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecSessionObj realised = (IYCFSecSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecSessionObj updateSecSession( IYCFSecSecSessionObj Obj ) {
		IYCFSecSecSessionObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().updateSecSession( schema.getAuthorization(),
			Obj.getSecSessionBuff() );
		obj = (IYCFSecSecSessionObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecSession( IYCFSecSecSessionObj Obj ) {
		IYCFSecSecSessionObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSession( schema.getAuthorization(),
			obj.getSecSessionBuff() );
		Obj.forget();
	}

	public void deleteSecSessionByIdIdx( UUID SecSessionId )
	{
		YCFSecSecSessionPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		IYCFSecSecSessionObj obj = readSecSession( pkey );
		if( obj != null ) {
			IYCFSecSecSessionEditObj editObj = (IYCFSecSecSessionEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecSessionEditObj)obj.beginEdit();
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
		deepDisposeSecSessionByIdIdx( SecSessionId );
	}

	public void deleteSecSessionBySecUserIdx( UUID SecUserId )
	{
		YCFSecSecSessionBySecUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexBySecUserIdx == null ) {
			indexBySecUserIdx = new HashMap< YCFSecSecSessionBySecUserIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( indexBySecUserIdx.containsKey( key ) ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict = indexBySecUserIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFSecSecSessionObj> iter = dict.values().iterator();
			IYCFSecSecSessionObj obj;
			List<IYCFSecSecSessionObj> toForget = new LinkedList<IYCFSecSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecUserIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecSessionBySecUserIdx( SecUserId );
	}

	public void deleteSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		YCFSecSecSessionBySecDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		if( indexBySecDevIdx == null ) {
			indexBySecDevIdx = new HashMap< YCFSecSecSessionBySecDevIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( indexBySecDevIdx.containsKey( key ) ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict = indexBySecDevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
			Iterator<IYCFSecSecSessionObj> iter = dict.values().iterator();
			IYCFSecSecSessionObj obj;
			List<IYCFSecSecSessionObj> toForget = new LinkedList<IYCFSecSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecDevIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
		}
		deepDisposeSecSessionBySecDevIdx( SecUserId,
				SecDevName );
	}

	public void deleteSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		if( indexByStartIdx == null ) {
			indexByStartIdx = new HashMap< YCFSecSecSessionByStartIdxKey,
				IYCFSecSecSessionObj >();
		}
		YCFSecSecSessionByStartIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		IYCFSecSecSessionObj obj = null;
		if( indexByStartIdx.containsKey( key ) ) {
			obj = indexByStartIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
		}
		deepDisposeSecSessionByStartIdx( SecUserId,
				Start );
	}

	public void deleteSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		YCFSecSecSessionByFinishIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		if( indexByFinishIdx == null ) {
			indexByFinishIdx = new HashMap< YCFSecSecSessionByFinishIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( indexByFinishIdx.containsKey( key ) ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict = indexByFinishIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
			Iterator<IYCFSecSecSessionObj> iter = dict.values().iterator();
			IYCFSecSecSessionObj obj;
			List<IYCFSecSecSessionObj> toForget = new LinkedList<IYCFSecSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFinishIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
		}
		deepDisposeSecSessionByFinishIdx( SecUserId,
				Finish );
	}

	public void deleteSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		YCFSecSecSessionBySecProxyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		if( indexBySecProxyIdx == null ) {
			indexBySecProxyIdx = new HashMap< YCFSecSecSessionBySecProxyIdxKey,
				Map< YCFSecSecSessionPKey, IYCFSecSecSessionObj > >();
		}
		if( indexBySecProxyIdx.containsKey( key ) ) {
			Map<YCFSecSecSessionPKey, IYCFSecSecSessionObj> dict = indexBySecProxyIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
			Iterator<IYCFSecSecSessionObj> iter = dict.values().iterator();
			IYCFSecSecSessionObj obj;
			List<IYCFSecSecSessionObj> toForget = new LinkedList<IYCFSecSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecProxyIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
		}
		deepDisposeSecSessionBySecProxyIdx( SecProxyId );
	}

	public IYCFSecSecSessionObj getSystemSession() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFSecSecUserObj userObj;
		IYCFSecSecSessionObj sessionObj;
		try {
			userObj = schema.getSecUserTableObj().getSystemUser();
			sessionObj = readSecSessionByStartIdx( userObj.getRequiredSecUserId(),
				Calendar.getInstance() );
			if( sessionObj == null ) {
				sessionObj = newInstance();
				IYCFSecSecSessionEditObj sessionEdit = sessionObj.beginEdit();
				sessionEdit.setRequiredContainerSecUser( userObj );
				sessionEdit.setRequiredStart( Calendar.getInstance() );
				sessionEdit.setOptionalFinish( null );
				sessionObj = sessionEdit.create();
				sessionEdit = null;
			}
			if( transactionStarted ) {
				schema.commit();
			}
		}
		catch( RuntimeException e ) {
			if( transactionStarted ) {
				try {
					schema.rollback();
				}
				catch( Exception e2 ) {
				}
			}
			throw e;
		}
		return( sessionObj );
	}
}
