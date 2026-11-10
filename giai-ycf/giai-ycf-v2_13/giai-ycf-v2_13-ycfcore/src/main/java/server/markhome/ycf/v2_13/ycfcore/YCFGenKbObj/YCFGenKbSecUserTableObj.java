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

public class YCFGenKbSecUserTableObj
	implements IYCFGenKbSecUserTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> members;
	private Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> allSecUser;
	private Map< YCFGenKbSecUserByULoginIdxKey,
		IYCFGenKbSecUserObj > indexByULoginIdx;
	private Map< YCFGenKbSecUserByEMConfIdxKey,
		Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > > indexByEMConfIdx;
	private Map< YCFGenKbSecUserByPwdResetIdxKey,
		Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > > indexByPwdResetIdx;
	private Map< YCFGenKbSecUserByDefDevIdxKey,
		Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > > indexByDefDevIdx;
	public static String TABLE_NAME = "SecUser";
	public static String TABLE_DBNAME = "secuser";

	public YCFGenKbSecUserTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj>();
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
	}

	public YCFGenKbSecUserTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj>();
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
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
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
		List<IYCFGenKbSecUserObj> toForget = new LinkedList<IYCFGenKbSecUserObj>();
		IYCFGenKbSecUserObj cur = null;
		Iterator<IYCFGenKbSecUserObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecUserObj.
	 */
	public IYCFGenKbSecUserObj newInstance() {
		IYCFGenKbSecUserObj inst = new YCFGenKbSecUserObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecUserObj.
	 */
	public IYCFGenKbSecUserEditObj newEditInstance( IYCFGenKbSecUserObj orig ) {
		IYCFGenKbSecUserEditObj edit = new YCFGenKbSecUserEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecUserObj realiseSecUser( IYCFGenKbSecUserObj Obj ) {
		IYCFGenKbSecUserObj obj = Obj;
		YCFGenKbSecUserPKey pkey = obj.getPKey();
		IYCFGenKbSecUserObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecUserObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByULoginIdx != null ) {
				YCFGenKbSecUserByULoginIdxKey keyULoginIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.remove( keyULoginIdx );
			}

			if( indexByEMConfIdx != null ) {
				YCFGenKbSecUserByEMConfIdxKey keyEMConfIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.remove( keepObj.getPKey() );
					if( mapEMConfIdx.size() <= 0 ) {
						indexByEMConfIdx.remove( keyEMConfIdx );
					}
				}
			}

			if( indexByPwdResetIdx != null ) {
				YCFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.remove( keepObj.getPKey() );
					if( mapPwdResetIdx.size() <= 0 ) {
						indexByPwdResetIdx.remove( keyPwdResetIdx );
					}
				}
			}

			if( indexByDefDevIdx != null ) {
				YCFGenKbSecUserByDefDevIdxKey keyDefDevIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
				if( mapDefDevIdx != null ) {
					mapDefDevIdx.remove( keepObj.getPKey() );
					if( mapDefDevIdx.size() <= 0 ) {
						indexByDefDevIdx.remove( keyDefDevIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByULoginIdx != null ) {
				YCFGenKbSecUserByULoginIdxKey keyULoginIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.put( keyULoginIdx, keepObj );
			}

			if( indexByEMConfIdx != null ) {
				YCFGenKbSecUserByEMConfIdxKey keyEMConfIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPwdResetIdx != null ) {
				YCFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefDevIdx != null ) {
				YCFGenKbSecUserByDefDevIdxKey keyDefDevIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
				if( mapDefDevIdx != null ) {
					mapDefDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecUser != null ) {
				allSecUser.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecUser != null ) {
				allSecUser.put( keepObj.getPKey(), keepObj );
			}

			if( indexByULoginIdx != null ) {
				YCFGenKbSecUserByULoginIdxKey keyULoginIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.put( keyULoginIdx, keepObj );
			}

			if( indexByEMConfIdx != null ) {
				YCFGenKbSecUserByEMConfIdxKey keyEMConfIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPwdResetIdx != null ) {
				YCFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefDevIdx != null ) {
				YCFGenKbSecUserByDefDevIdxKey keyDefDevIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
				if( mapDefDevIdx != null ) {
					mapDefDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecUserObj createSecUser( IYCFGenKbSecUserObj Obj ) {
		IYCFGenKbSecUserObj obj = Obj;
		YCFGenKbSecUserBuff buff = obj.getSecUserBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().createSecUser(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecUserObj readSecUser( YCFGenKbSecUserPKey pkey ) {
		return( readSecUser( pkey, false ) );
	}

	public IYCFGenKbSecUserObj readSecUser( YCFGenKbSecUserPKey pkey, boolean forceRead ) {
		IYCFGenKbSecUserObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecUserBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecUserId() );
			if( readBuff != null ) {
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecUserObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecUserObj readCachedSecUser( YCFGenKbSecUserPKey pkey ) {
		IYCFGenKbSecUserObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecUser( IYCFGenKbSecUserObj obj )
	{
		final String S_ProcName = "YCFGenKbSecUserTableObj.reallyDeepDisposeSecUser() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecUserPKey pkey = obj.getPKey();
		IYCFGenKbSecUserObj existing = readCachedSecUser( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecUserByULoginIdxKey keyULoginIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		keyULoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		YCFGenKbSecUserByEMConfIdxKey keyEMConfIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		keyEMConfIdx.setOptionalEMailConfirmUuid( existing.getOptionalEMailConfirmUuid() );

		YCFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		keyPwdResetIdx.setOptionalPasswordResetUuid( existing.getOptionalPasswordResetUuid() );

		YCFGenKbSecUserByDefDevIdxKey keyDefDevIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		keyDefDevIdx.setOptionalDfltDevUserId( existing.getOptionalDfltDevUserId() );
		keyDefDevIdx.setOptionalDfltDevName( existing.getOptionalDfltDevName() );


					schema.getTSecGrpMembTableObj().deepDisposeTSecGrpMembByUserIdx( existing.getRequiredSecUserId() );
					schema.getSecGrpMembTableObj().deepDisposeSecGrpMembByUserIdx( existing.getRequiredSecUserId() );
					schema.getSecSessionTableObj().deepDisposeSecSessionBySecUserIdx( existing.getRequiredSecUserId() );
					schema.getSecSessionTableObj().deepDisposeSecSessionBySecProxyIdx( existing.getRequiredSecUserId() );
					schema.getSecDeviceTableObj().deepDisposeSecDeviceByUserIdx( existing.getRequiredSecUserId() );

		if( indexByULoginIdx != null ) {
			indexByULoginIdx.remove( keyULoginIdx );
		}

		if( indexByEMConfIdx != null ) {
			if( indexByEMConfIdx.containsKey( keyEMConfIdx ) ) {
				indexByEMConfIdx.get( keyEMConfIdx ).remove( pkey );
				if( indexByEMConfIdx.get( keyEMConfIdx ).size() <= 0 ) {
					indexByEMConfIdx.remove( keyEMConfIdx );
				}
			}
		}

		if( indexByPwdResetIdx != null ) {
			if( indexByPwdResetIdx.containsKey( keyPwdResetIdx ) ) {
				indexByPwdResetIdx.get( keyPwdResetIdx ).remove( pkey );
				if( indexByPwdResetIdx.get( keyPwdResetIdx ).size() <= 0 ) {
					indexByPwdResetIdx.remove( keyPwdResetIdx );
				}
			}
		}

		if( indexByDefDevIdx != null ) {
			if( indexByDefDevIdx.containsKey( keyDefDevIdx ) ) {
				indexByDefDevIdx.get( keyDefDevIdx ).remove( pkey );
				if( indexByDefDevIdx.get( keyDefDevIdx ).size() <= 0 ) {
					indexByDefDevIdx.remove( keyDefDevIdx );
				}
			}
		}


	}
	public void deepDisposeSecUser( YCFGenKbSecUserPKey pkey ) {
		IYCFGenKbSecUserObj obj = readCachedSecUser( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecUserObj lockSecUser( YCFGenKbSecUserPKey pkey ) {
		IYCFGenKbSecUserObj locked = null;
		YCFGenKbSecUserBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecUserTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecUserObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecUser", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecUserObj> readAllSecUser() {
		return( readAllSecUser( false ) );
	}

	public List<IYCFGenKbSecUserObj> readAllSecUser( boolean forceRead ) {
		final String S_ProcName = "readAllSecUser";
		if( ( allSecUser == null ) || forceRead ) {
			Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> map = new HashMap<YCFGenKbSecUserPKey,IYCFGenKbSecUserObj>();
			allSecUser = map;
			YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecUserBuff buff;
			IYCFGenKbSecUserObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecUserObj realised = (IYCFGenKbSecUserObj)obj.realise();
			}
		}
		int len = allSecUser.size();
		IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
		Iterator<IYCFGenKbSecUserObj> valIter = allSecUser.values().iterator();
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
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecUserObj> readCachedAllSecUser() {
		final String S_ProcName = "readCachedAllSecUser";
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>();
		if( allSecUser != null ) {
			int len = allSecUser.size();
			IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
			Iterator<IYCFGenKbSecUserObj> valIter = allSecUser.values().iterator();
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
		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecUser-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecUserObj> pageAllSecUser(UUID priorSecUserId )
	{
		final String S_ProcName = "pageAllSecUser";
		Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> map = new HashMap<YCFGenKbSecUserPKey,IYCFGenKbSecUserObj>();
		YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageAllBuff( schema.getAuthorization(),
			priorSecUserId );
		YCFGenKbSecUserBuff buff;
		IYCFGenKbSecUserObj obj;
		IYCFGenKbSecUserObj realised;
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecUserObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId )
	{
		return( readSecUserByIdIdx( SecUserId,
			false ) );
	}

	public IYCFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId, boolean forceRead )
	{
		YCFGenKbSecUserPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		IYCFGenKbSecUserObj obj = readSecUser( pkey, forceRead );
		return( obj );
	}

	public IYCFGenKbSecUserObj readSecUserByULoginIdx( String LoginId )
	{
		return( readSecUserByULoginIdx( LoginId,
			false ) );
	}

	public IYCFGenKbSecUserObj readSecUserByULoginIdx( String LoginId, boolean forceRead )
	{
		if( indexByULoginIdx == null ) {
			indexByULoginIdx = new HashMap< YCFGenKbSecUserByULoginIdxKey,
				IYCFGenKbSecUserObj >();
		}
		YCFGenKbSecUserByULoginIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		IYCFGenKbSecUserObj obj = null;
		if( ( ! forceRead ) && indexByULoginIdx.containsKey( key ) ) {
			obj = indexByULoginIdx.get( key );
		}
		else {
			YCFGenKbSecUserBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByULoginIdx( schema.getAuthorization(),
				LoginId );
			if( buff != null ) {
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecUserObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		return( readSecUserByEMConfIdx( EMailConfirmUuid,
			false ) );
	}

	public List<IYCFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByEMConfIdx";
		YCFGenKbSecUserByEMConfIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict;
		if( indexByEMConfIdx == null ) {
			indexByEMConfIdx = new HashMap< YCFGenKbSecUserByEMConfIdxKey,
				Map< YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByEMConfIdx.containsKey( key ) ) {
			dict = indexByEMConfIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj>();
			IYCFGenKbSecUserObj obj;
			YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
			YCFGenKbSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecUserObj realised = (IYCFGenKbSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEMConfIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
		Iterator<IYCFGenKbSecUserObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		return( readSecUserByPwdResetIdx( PasswordResetUuid,
			false ) );
	}

	public List<IYCFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByPwdResetIdx";
		YCFGenKbSecUserByPwdResetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict;
		if( indexByPwdResetIdx == null ) {
			indexByPwdResetIdx = new HashMap< YCFGenKbSecUserByPwdResetIdxKey,
				Map< YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByPwdResetIdx.containsKey( key ) ) {
			dict = indexByPwdResetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj>();
			IYCFGenKbSecUserObj obj;
			YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
			YCFGenKbSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecUserObj realised = (IYCFGenKbSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPwdResetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
		Iterator<IYCFGenKbSecUserObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		return( readSecUserByDefDevIdx( DfltDevUserId,
			DfltDevName,
			false ) );
	}

	public List<IYCFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByDefDevIdx";
		YCFGenKbSecUserByDefDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict;
		if( indexByDefDevIdx == null ) {
			indexByDefDevIdx = new HashMap< YCFGenKbSecUserByDefDevIdxKey,
				Map< YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByDefDevIdx.containsKey( key ) ) {
			dict = indexByDefDevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj>();
			IYCFGenKbSecUserObj obj;
			YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
			YCFGenKbSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecUserObj realised = (IYCFGenKbSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefDevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
		Iterator<IYCFGenKbSecUserObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecUserObj readCachedSecUserByIdIdx( UUID SecUserId )
	{
		IYCFGenKbSecUserObj obj = null;
		YCFGenKbSecUserPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		obj = readCachedSecUser( pkey );
		return( obj );
	}

	public IYCFGenKbSecUserObj readCachedSecUserByULoginIdx( String LoginId )
	{
		IYCFGenKbSecUserObj obj = null;
		YCFGenKbSecUserByULoginIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		if( indexByULoginIdx != null ) {
			if( indexByULoginIdx.containsKey( key ) ) {
				obj = indexByULoginIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecUserObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecUserObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbSecUserObj> readCachedSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		final String S_ProcName = "readCachedSecUserByEMConfIdx";
		YCFGenKbSecUserByEMConfIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>();
		if( indexByEMConfIdx != null ) {
			Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict;
			if( indexByEMConfIdx.containsKey( key ) ) {
				dict = indexByEMConfIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
				Iterator<IYCFGenKbSecUserObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecUserObj obj;
			Iterator<IYCFGenKbSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecUserObj> readCachedSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		final String S_ProcName = "readCachedSecUserByPwdResetIdx";
		YCFGenKbSecUserByPwdResetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>();
		if( indexByPwdResetIdx != null ) {
			Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict;
			if( indexByPwdResetIdx.containsKey( key ) ) {
				dict = indexByPwdResetIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
				Iterator<IYCFGenKbSecUserObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecUserObj obj;
			Iterator<IYCFGenKbSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecUserObj> readCachedSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "readCachedSecUserByDefDevIdx";
		YCFGenKbSecUserByDefDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		ArrayList<IYCFGenKbSecUserObj> arrayList = new ArrayList<IYCFGenKbSecUserObj>();
		if( indexByDefDevIdx != null ) {
			Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict;
			if( indexByDefDevIdx.containsKey( key ) ) {
				dict = indexByDefDevIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecUserObj arr[] = new IYCFGenKbSecUserObj[len];
				Iterator<IYCFGenKbSecUserObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecUserObj obj;
			Iterator<IYCFGenKbSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecUserObj> cmp = new Comparator<IYCFGenKbSecUserObj>() {
			public int compare( IYCFGenKbSecUserObj lhs, IYCFGenKbSecUserObj rhs ) {
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
					YCFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSecUserByIdIdx( UUID SecUserId )
	{
		IYCFGenKbSecUserObj obj = readCachedSecUserByIdIdx( SecUserId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecUserByULoginIdx( String LoginId )
	{
		IYCFGenKbSecUserObj obj = readCachedSecUserByULoginIdx( LoginId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		final String S_ProcName = "deepDisposeSecUserByEMConfIdx";
		IYCFGenKbSecUserObj obj;
		List<IYCFGenKbSecUserObj> arrayList = readCachedSecUserByEMConfIdx( EMailConfirmUuid );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecUserObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		final String S_ProcName = "deepDisposeSecUserByPwdResetIdx";
		IYCFGenKbSecUserObj obj;
		List<IYCFGenKbSecUserObj> arrayList = readCachedSecUserByPwdResetIdx( PasswordResetUuid );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecUserObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "deepDisposeSecUserByDefDevIdx";
		IYCFGenKbSecUserObj obj;
		List<IYCFGenKbSecUserObj> arrayList = readCachedSecUserByDefDevIdx( DfltDevUserId,
				DfltDevName );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecUserObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate EMConfIdx key attributes.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFGenKbSecUserObj> pageSecUserByEMConfIdx( UUID EMailConfirmUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByEMConfIdx";
		YCFGenKbSecUserByEMConfIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		List<IYCFGenKbSecUserObj> retList = new LinkedList<IYCFGenKbSecUserObj>();
		IYCFGenKbSecUserObj obj;
		YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageBuffByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid,
			priorSecUserId );
		YCFGenKbSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecUserObj realised = (IYCFGenKbSecUserObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate PwdResetIdx key attributes.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFGenKbSecUserObj> pageSecUserByPwdResetIdx( UUID PasswordResetUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByPwdResetIdx";
		YCFGenKbSecUserByPwdResetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		List<IYCFGenKbSecUserObj> retList = new LinkedList<IYCFGenKbSecUserObj>();
		IYCFGenKbSecUserObj obj;
		YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageBuffByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid,
			priorSecUserId );
		YCFGenKbSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecUserObj realised = (IYCFGenKbSecUserObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate DefDevIdx key attributes.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFGenKbSecUserObj> pageSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByDefDevIdx";
		YCFGenKbSecUserByDefDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		List<IYCFGenKbSecUserObj> retList = new LinkedList<IYCFGenKbSecUserObj>();
		IYCFGenKbSecUserObj obj;
		YCFGenKbSecUserBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageBuffByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName,
			priorSecUserId );
		YCFGenKbSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecUserObj realised = (IYCFGenKbSecUserObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecUserObj updateSecUser( IYCFGenKbSecUserObj Obj ) {
		IYCFGenKbSecUserObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().updateSecUser( schema.getAuthorization(),
			Obj.getSecUserBuff() );
		obj = (IYCFGenKbSecUserObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecUser( IYCFGenKbSecUserObj Obj ) {
		IYCFGenKbSecUserObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUser( schema.getAuthorization(),
			obj.getSecUserBuff() );
		Obj.forget();
	}

	public void deleteSecUserByIdIdx( UUID SecUserId )
	{
		YCFGenKbSecUserPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		IYCFGenKbSecUserObj obj = readSecUser( pkey );
		if( obj != null ) {
			IYCFGenKbSecUserEditObj editObj = (IYCFGenKbSecUserEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecUserEditObj)obj.beginEdit();
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
		deepDisposeSecUserByIdIdx( SecUserId );
	}

	public void deleteSecUserByULoginIdx( String LoginId )
	{
		if( indexByULoginIdx == null ) {
			indexByULoginIdx = new HashMap< YCFGenKbSecUserByULoginIdxKey,
				IYCFGenKbSecUserObj >();
		}
		YCFGenKbSecUserByULoginIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		IYCFGenKbSecUserObj obj = null;
		if( indexByULoginIdx.containsKey( key ) ) {
			obj = indexByULoginIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByULoginIdx( schema.getAuthorization(),
				LoginId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByULoginIdx( schema.getAuthorization(),
				LoginId );
		}
		deepDisposeSecUserByULoginIdx( LoginId );
	}

	public void deleteSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		YCFGenKbSecUserByEMConfIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		if( indexByEMConfIdx == null ) {
			indexByEMConfIdx = new HashMap< YCFGenKbSecUserByEMConfIdxKey,
				Map< YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > >();
		}
		if( indexByEMConfIdx.containsKey( key ) ) {
			Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict = indexByEMConfIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
			Iterator<IYCFGenKbSecUserObj> iter = dict.values().iterator();
			IYCFGenKbSecUserObj obj;
			List<IYCFGenKbSecUserObj> toForget = new LinkedList<IYCFGenKbSecUserObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEMConfIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
		}
		deepDisposeSecUserByEMConfIdx( EMailConfirmUuid );
	}

	public void deleteSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		YCFGenKbSecUserByPwdResetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		if( indexByPwdResetIdx == null ) {
			indexByPwdResetIdx = new HashMap< YCFGenKbSecUserByPwdResetIdxKey,
				Map< YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > >();
		}
		if( indexByPwdResetIdx.containsKey( key ) ) {
			Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict = indexByPwdResetIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
			Iterator<IYCFGenKbSecUserObj> iter = dict.values().iterator();
			IYCFGenKbSecUserObj obj;
			List<IYCFGenKbSecUserObj> toForget = new LinkedList<IYCFGenKbSecUserObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPwdResetIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
		}
		deepDisposeSecUserByPwdResetIdx( PasswordResetUuid );
	}

	public void deleteSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		YCFGenKbSecUserByDefDevIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		if( indexByDefDevIdx == null ) {
			indexByDefDevIdx = new HashMap< YCFGenKbSecUserByDefDevIdxKey,
				Map< YCFGenKbSecUserPKey, IYCFGenKbSecUserObj > >();
		}
		if( indexByDefDevIdx.containsKey( key ) ) {
			Map<YCFGenKbSecUserPKey, IYCFGenKbSecUserObj> dict = indexByDefDevIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
			Iterator<IYCFGenKbSecUserObj> iter = dict.values().iterator();
			IYCFGenKbSecUserObj obj;
			List<IYCFGenKbSecUserObj> toForget = new LinkedList<IYCFGenKbSecUserObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefDevIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
		}
		deepDisposeSecUserByDefDevIdx( DfltDevUserId,
				DfltDevName );
	}

	public IYCFGenKbSecUserObj getSystemUser() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFGenKbSecUserObj secUserObj;
		try {
			secUserObj = schema.getSecUserTableObj().readSecUserByULoginIdx( "system" );
			if( secUserObj == null ) {
				secUserObj = newInstance();
				IYCFGenKbSecUserEditObj secUserEdit = secUserObj.beginEdit();
				secUserEdit.setRequiredEMailAddress( "system" );
				secUserObj = secUserEdit.create();
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
		return( secUserObj );
	}
}
