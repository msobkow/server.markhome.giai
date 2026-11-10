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

public class YCFGenKbSecSessionTableObj
	implements IYCFGenKbSecSessionTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> members;
	private Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> allSecSession;
	private Map< YCFGenKbSecSessionBySecUserIdxKey,
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > > indexBySecUserIdx;
	private Map< YCFGenKbSecSessionBySecDevIdxKey,
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > > indexBySecDevIdx;
	private Map< YCFGenKbSecSessionByStartIdxKey,
		IYCFGenKbSecSessionObj > indexByStartIdx;
	private Map< YCFGenKbSecSessionByFinishIdxKey,
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > > indexByFinishIdx;
	private Map< YCFGenKbSecSessionBySecProxyIdxKey,
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > > indexBySecProxyIdx;
	public static String TABLE_NAME = "SecSession";
	public static String TABLE_DBNAME = "secsess";

	public YCFGenKbSecSessionTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj>();
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
	}

	public YCFGenKbSecSessionTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj>();
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
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
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
		List<IYCFGenKbSecSessionObj> toForget = new LinkedList<IYCFGenKbSecSessionObj>();
		IYCFGenKbSecSessionObj cur = null;
		Iterator<IYCFGenKbSecSessionObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecSessionObj.
	 */
	public IYCFGenKbSecSessionObj newInstance() {
		IYCFGenKbSecSessionObj inst = new YCFGenKbSecSessionObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecSessionObj.
	 */
	public IYCFGenKbSecSessionEditObj newEditInstance( IYCFGenKbSecSessionObj orig ) {
		IYCFGenKbSecSessionEditObj edit = new YCFGenKbSecSessionEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecSessionObj realiseSecSession( IYCFGenKbSecSessionObj Obj ) {
		IYCFGenKbSecSessionObj obj = Obj;
		YCFGenKbSecSessionPKey pkey = obj.getPKey();
		IYCFGenKbSecSessionObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecSessionObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexBySecUserIdx != null ) {
				YCFGenKbSecSessionBySecUserIdxKey keySecUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.remove( keepObj.getPKey() );
					if( mapSecUserIdx.size() <= 0 ) {
						indexBySecUserIdx.remove( keySecUserIdx );
					}
				}
			}

			if( indexBySecDevIdx != null ) {
				YCFGenKbSecSessionBySecDevIdxKey keySecDevIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.remove( keepObj.getPKey() );
					if( mapSecDevIdx.size() <= 0 ) {
						indexBySecDevIdx.remove( keySecDevIdx );
					}
				}
			}

			if( indexByStartIdx != null ) {
				YCFGenKbSecSessionByStartIdxKey keyStartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.remove( keyStartIdx );
			}

			if( indexByFinishIdx != null ) {
				YCFGenKbSecSessionByFinishIdxKey keyFinishIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.remove( keepObj.getPKey() );
					if( mapFinishIdx.size() <= 0 ) {
						indexByFinishIdx.remove( keyFinishIdx );
					}
				}
			}

			if( indexBySecProxyIdx != null ) {
				YCFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
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
				YCFGenKbSecSessionBySecUserIdxKey keySecUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecDevIdx != null ) {
				YCFGenKbSecSessionBySecDevIdxKey keySecDevIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByStartIdx != null ) {
				YCFGenKbSecSessionByStartIdxKey keyStartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.put( keyStartIdx, keepObj );
			}

			if( indexByFinishIdx != null ) {
				YCFGenKbSecSessionByFinishIdxKey keyFinishIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecProxyIdx != null ) {
				YCFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
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
				YCFGenKbSecSessionBySecUserIdxKey keySecUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecDevIdx != null ) {
				YCFGenKbSecSessionBySecDevIdxKey keySecDevIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByStartIdx != null ) {
				YCFGenKbSecSessionByStartIdxKey keyStartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.put( keyStartIdx, keepObj );
			}

			if( indexByFinishIdx != null ) {
				YCFGenKbSecSessionByFinishIdxKey keyFinishIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecProxyIdx != null ) {
				YCFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
				if( mapSecProxyIdx != null ) {
					mapSecProxyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecSessionObj createSecSession( IYCFGenKbSecSessionObj Obj ) {
		IYCFGenKbSecSessionObj obj = Obj;
		YCFGenKbSecSessionBuff buff = obj.getSecSessionBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().createSecSession(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecSessionObj readSecSession( YCFGenKbSecSessionPKey pkey ) {
		return( readSecSession( pkey, false ) );
	}

	public IYCFGenKbSecSessionObj readSecSession( YCFGenKbSecSessionPKey pkey, boolean forceRead ) {
		IYCFGenKbSecSessionObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecSessionBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecSessionId() );
			if( readBuff != null ) {
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecSessionObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecSessionObj readCachedSecSession( YCFGenKbSecSessionPKey pkey ) {
		IYCFGenKbSecSessionObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecSession( IYCFGenKbSecSessionObj obj )
	{
		final String S_ProcName = "YCFGenKbSecSessionTableObj.reallyDeepDisposeSecSession() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecSessionPKey pkey = obj.getPKey();
		IYCFGenKbSecSessionObj existing = readCachedSecSession( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecSessionBySecUserIdxKey keySecUserIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		keySecUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecSessionBySecDevIdxKey keySecDevIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		keySecDevIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keySecDevIdx.setOptionalSecDevName( existing.getOptionalSecDevName() );

		YCFGenKbSecSessionByStartIdxKey keyStartIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		keyStartIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyStartIdx.setRequiredStart( existing.getRequiredStart() );

		YCFGenKbSecSessionByFinishIdxKey keyFinishIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		keyFinishIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyFinishIdx.setOptionalFinish( existing.getOptionalFinish() );

		YCFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
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
	public void deepDisposeSecSession( YCFGenKbSecSessionPKey pkey ) {
		IYCFGenKbSecSessionObj obj = readCachedSecSession( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecSessionObj lockSecSession( YCFGenKbSecSessionPKey pkey ) {
		IYCFGenKbSecSessionObj locked = null;
		YCFGenKbSecSessionBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecSessionTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecSessionObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecSession", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecSessionObj> readAllSecSession() {
		return( readAllSecSession( false ) );
	}

	public List<IYCFGenKbSecSessionObj> readAllSecSession( boolean forceRead ) {
		final String S_ProcName = "readAllSecSession";
		if( ( allSecSession == null ) || forceRead ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> map = new HashMap<YCFGenKbSecSessionPKey,IYCFGenKbSecSessionObj>();
			allSecSession = map;
			YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecSessionBuff buff;
			IYCFGenKbSecSessionObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
			}
		}
		int len = allSecSession.size();
		IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
		Iterator<IYCFGenKbSecSessionObj> valIter = allSecSession.values().iterator();
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
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecSessionObj> readCachedAllSecSession() {
		final String S_ProcName = "readCachedAllSecSession";
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>();
		if( allSecSession != null ) {
			int len = allSecSession.size();
			IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
			Iterator<IYCFGenKbSecSessionObj> valIter = allSecSession.values().iterator();
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
		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecSessionObj> pageAllSecSession(UUID priorSecSessionId )
	{
		final String S_ProcName = "pageAllSecSession";
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> map = new HashMap<YCFGenKbSecSessionPKey,IYCFGenKbSecSessionObj>();
		YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageAllBuff( schema.getAuthorization(),
			priorSecSessionId );
		YCFGenKbSecSessionBuff buff;
		IYCFGenKbSecSessionObj obj;
		IYCFGenKbSecSessionObj realised;
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecSessionObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecSessionObj readSecSessionByIdIdx( UUID SecSessionId )
	{
		return( readSecSessionByIdIdx( SecSessionId,
			false ) );
	}

	public IYCFGenKbSecSessionObj readSecSessionByIdIdx( UUID SecSessionId, boolean forceRead )
	{
		YCFGenKbSecSessionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		IYCFGenKbSecSessionObj obj = readSecSession( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId )
	{
		return( readSecSessionBySecUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecUserIdx";
		YCFGenKbSecSessionBySecUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
		if( indexBySecUserIdx == null ) {
			indexBySecUserIdx = new HashMap< YCFGenKbSecSessionBySecUserIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecUserIdx.containsKey( key ) ) {
			dict = indexBySecUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj>();
			IYCFGenKbSecSessionObj obj;
			YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
		Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		return( readSecSessionBySecDevIdx( SecUserId,
			SecDevName,
			false ) );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecDevIdx";
		YCFGenKbSecSessionBySecDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
		if( indexBySecDevIdx == null ) {
			indexBySecDevIdx = new HashMap< YCFGenKbSecSessionBySecDevIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecDevIdx.containsKey( key ) ) {
			dict = indexBySecDevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj>();
			IYCFGenKbSecSessionObj obj;
			YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
			YCFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecDevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
		Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecSessionObj readSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		return( readSecSessionByStartIdx( SecUserId,
			Start,
			false ) );
	}

	public IYCFGenKbSecSessionObj readSecSessionByStartIdx( UUID SecUserId,
		Calendar Start, boolean forceRead )
	{
		if( indexByStartIdx == null ) {
			indexByStartIdx = new HashMap< YCFGenKbSecSessionByStartIdxKey,
				IYCFGenKbSecSessionObj >();
		}
		YCFGenKbSecSessionByStartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		IYCFGenKbSecSessionObj obj = null;
		if( ( ! forceRead ) && indexByStartIdx.containsKey( key ) ) {
			obj = indexByStartIdx.get( key );
		}
		else {
			YCFGenKbSecSessionBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
			if( buff != null ) {
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecSessionObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		return( readSecSessionByFinishIdx( SecUserId,
			Finish,
			false ) );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionByFinishIdx";
		YCFGenKbSecSessionByFinishIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
		if( indexByFinishIdx == null ) {
			indexByFinishIdx = new HashMap< YCFGenKbSecSessionByFinishIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexByFinishIdx.containsKey( key ) ) {
			dict = indexByFinishIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj>();
			IYCFGenKbSecSessionObj obj;
			YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
			YCFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFinishIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
		Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		return( readSecSessionBySecProxyIdx( SecProxyId,
			false ) );
	}

	public List<IYCFGenKbSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecProxyIdx";
		YCFGenKbSecSessionBySecProxyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
		if( indexBySecProxyIdx == null ) {
			indexBySecProxyIdx = new HashMap< YCFGenKbSecSessionBySecProxyIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecProxyIdx.containsKey( key ) ) {
			dict = indexBySecProxyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj>();
			IYCFGenKbSecSessionObj obj;
			YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
			YCFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecProxyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
		Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecSessionObj readCachedSecSessionByIdIdx( UUID SecSessionId )
	{
		IYCFGenKbSecSessionObj obj = null;
		YCFGenKbSecSessionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		obj = readCachedSecSession( pkey );
		return( obj );
	}

	public List<IYCFGenKbSecSessionObj> readCachedSecSessionBySecUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecSessionBySecUserIdx";
		YCFGenKbSecSessionBySecUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>();
		if( indexBySecUserIdx != null ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
			if( indexBySecUserIdx.containsKey( key ) ) {
				dict = indexBySecUserIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
				Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecSessionObj obj;
			Iterator<IYCFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecSessionObj> readCachedSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "readCachedSecSessionBySecDevIdx";
		YCFGenKbSecSessionBySecDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>();
		if( indexBySecDevIdx != null ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
			if( indexBySecDevIdx.containsKey( key ) ) {
				dict = indexBySecDevIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
				Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecSessionObj obj;
			Iterator<IYCFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecSessionObj readCachedSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		IYCFGenKbSecSessionObj obj = null;
		YCFGenKbSecSessionByStartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		if( indexByStartIdx != null ) {
			if( indexByStartIdx.containsKey( key ) ) {
				obj = indexByStartIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecSessionObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecSessionObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbSecSessionObj> readCachedSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "readCachedSecSessionByFinishIdx";
		YCFGenKbSecSessionByFinishIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>();
		if( indexByFinishIdx != null ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
			if( indexByFinishIdx.containsKey( key ) ) {
				dict = indexByFinishIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
				Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecSessionObj obj;
			Iterator<IYCFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecSessionObj> readCachedSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		final String S_ProcName = "readCachedSecSessionBySecProxyIdx";
		YCFGenKbSecSessionBySecProxyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		ArrayList<IYCFGenKbSecSessionObj> arrayList = new ArrayList<IYCFGenKbSecSessionObj>();
		if( indexBySecProxyIdx != null ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict;
			if( indexBySecProxyIdx.containsKey( key ) ) {
				dict = indexBySecProxyIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecSessionObj arr[] = new IYCFGenKbSecSessionObj[len];
				Iterator<IYCFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecSessionObj obj;
			Iterator<IYCFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecSessionObj> cmp = new Comparator<IYCFGenKbSecSessionObj>() {
			public int compare( IYCFGenKbSecSessionObj lhs, IYCFGenKbSecSessionObj rhs ) {
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
					YCFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
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
		IYCFGenKbSecSessionObj obj = readCachedSecSessionByIdIdx( SecSessionId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecSessionBySecUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeSecSessionBySecUserIdx";
		IYCFGenKbSecSessionObj obj;
		List<IYCFGenKbSecSessionObj> arrayList = readCachedSecSessionBySecUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecSessionObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecSessionObj obj;
		List<IYCFGenKbSecSessionObj> arrayList = readCachedSecSessionBySecDevIdx( SecUserId,
				SecDevName );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecSessionObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecSessionObj obj = readCachedSecSessionByStartIdx( SecUserId,
				Start );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "deepDisposeSecSessionByFinishIdx";
		IYCFGenKbSecSessionObj obj;
		List<IYCFGenKbSecSessionObj> arrayList = readCachedSecSessionByFinishIdx( SecUserId,
				Finish );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecSessionObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecSessionObj obj;
		List<IYCFGenKbSecSessionObj> arrayList = readCachedSecSessionBySecProxyIdx( SecProxyId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecSessionObj> arrayIter = arrayList.iterator();
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
	public List<IYCFGenKbSecSessionObj> pageSecSessionBySecUserIdx( UUID SecUserId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecUserIdx";
		YCFGenKbSecSessionBySecUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFGenKbSecSessionObj> retList = new LinkedList<IYCFGenKbSecSessionObj>();
		IYCFGenKbSecSessionObj obj;
		YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecUserIdx( schema.getAuthorization(),
				SecUserId,
			priorSecSessionId );
		YCFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
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
	public List<IYCFGenKbSecSessionObj> pageSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecDevIdx";
		YCFGenKbSecSessionBySecDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		List<IYCFGenKbSecSessionObj> retList = new LinkedList<IYCFGenKbSecSessionObj>();
		IYCFGenKbSecSessionObj obj;
		YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName,
			priorSecSessionId );
		YCFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
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
	public List<IYCFGenKbSecSessionObj> pageSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionByFinishIdx";
		YCFGenKbSecSessionByFinishIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		List<IYCFGenKbSecSessionObj> retList = new LinkedList<IYCFGenKbSecSessionObj>();
		IYCFGenKbSecSessionObj obj;
		YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish,
			priorSecSessionId );
		YCFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
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
	public List<IYCFGenKbSecSessionObj> pageSecSessionBySecProxyIdx( UUID SecProxyId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecProxyIdx";
		YCFGenKbSecSessionBySecProxyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		List<IYCFGenKbSecSessionObj> retList = new LinkedList<IYCFGenKbSecSessionObj>();
		IYCFGenKbSecSessionObj obj;
		YCFGenKbSecSessionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecProxyIdx( schema.getAuthorization(),
				SecProxyId,
			priorSecSessionId );
		YCFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecSessionObj realised = (IYCFGenKbSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecSessionObj updateSecSession( IYCFGenKbSecSessionObj Obj ) {
		IYCFGenKbSecSessionObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().updateSecSession( schema.getAuthorization(),
			Obj.getSecSessionBuff() );
		obj = (IYCFGenKbSecSessionObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecSession( IYCFGenKbSecSessionObj Obj ) {
		IYCFGenKbSecSessionObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSession( schema.getAuthorization(),
			obj.getSecSessionBuff() );
		Obj.forget();
	}

	public void deleteSecSessionByIdIdx( UUID SecSessionId )
	{
		YCFGenKbSecSessionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		IYCFGenKbSecSessionObj obj = readSecSession( pkey );
		if( obj != null ) {
			IYCFGenKbSecSessionEditObj editObj = (IYCFGenKbSecSessionEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecSessionEditObj)obj.beginEdit();
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
		YCFGenKbSecSessionBySecUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexBySecUserIdx == null ) {
			indexBySecUserIdx = new HashMap< YCFGenKbSecSessionBySecUserIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( indexBySecUserIdx.containsKey( key ) ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict = indexBySecUserIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFGenKbSecSessionObj> iter = dict.values().iterator();
			IYCFGenKbSecSessionObj obj;
			List<IYCFGenKbSecSessionObj> toForget = new LinkedList<IYCFGenKbSecSessionObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecSessionBySecUserIdx( SecUserId );
	}

	public void deleteSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		YCFGenKbSecSessionBySecDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		if( indexBySecDevIdx == null ) {
			indexBySecDevIdx = new HashMap< YCFGenKbSecSessionBySecDevIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( indexBySecDevIdx.containsKey( key ) ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict = indexBySecDevIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
			Iterator<IYCFGenKbSecSessionObj> iter = dict.values().iterator();
			IYCFGenKbSecSessionObj obj;
			List<IYCFGenKbSecSessionObj> toForget = new LinkedList<IYCFGenKbSecSessionObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecDevIdx( schema.getAuthorization(),
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
			indexByStartIdx = new HashMap< YCFGenKbSecSessionByStartIdxKey,
				IYCFGenKbSecSessionObj >();
		}
		YCFGenKbSecSessionByStartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		IYCFGenKbSecSessionObj obj = null;
		if( indexByStartIdx.containsKey( key ) ) {
			obj = indexByStartIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
		}
		deepDisposeSecSessionByStartIdx( SecUserId,
				Start );
	}

	public void deleteSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		YCFGenKbSecSessionByFinishIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		if( indexByFinishIdx == null ) {
			indexByFinishIdx = new HashMap< YCFGenKbSecSessionByFinishIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( indexByFinishIdx.containsKey( key ) ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict = indexByFinishIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
			Iterator<IYCFGenKbSecSessionObj> iter = dict.values().iterator();
			IYCFGenKbSecSessionObj obj;
			List<IYCFGenKbSecSessionObj> toForget = new LinkedList<IYCFGenKbSecSessionObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
		}
		deepDisposeSecSessionByFinishIdx( SecUserId,
				Finish );
	}

	public void deleteSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		YCFGenKbSecSessionBySecProxyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		if( indexBySecProxyIdx == null ) {
			indexBySecProxyIdx = new HashMap< YCFGenKbSecSessionBySecProxyIdxKey,
				Map< YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj > >();
		}
		if( indexBySecProxyIdx.containsKey( key ) ) {
			Map<YCFGenKbSecSessionPKey, IYCFGenKbSecSessionObj> dict = indexBySecProxyIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
			Iterator<IYCFGenKbSecSessionObj> iter = dict.values().iterator();
			IYCFGenKbSecSessionObj obj;
			List<IYCFGenKbSecSessionObj> toForget = new LinkedList<IYCFGenKbSecSessionObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
		}
		deepDisposeSecSessionBySecProxyIdx( SecProxyId );
	}

	public IYCFGenKbSecSessionObj getSystemSession() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFGenKbSecUserObj userObj;
		IYCFGenKbSecSessionObj sessionObj;
		try {
			userObj = schema.getSecUserTableObj().getSystemUser();
			sessionObj = readSecSessionByStartIdx( userObj.getRequiredSecUserId(),
				Calendar.getInstance() );
			if( sessionObj == null ) {
				sessionObj = newInstance();
				IYCFGenKbSecSessionEditObj sessionEdit = sessionObj.beginEdit();
				sessionEdit.setRequiredContainerSecUser( userObj );
				sessionEdit.setRequiredStart( Calendar.getInstance() );
				sessionEdit.setOptionalFinish( null );
				sessionObj = sessionEdit.create();
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
