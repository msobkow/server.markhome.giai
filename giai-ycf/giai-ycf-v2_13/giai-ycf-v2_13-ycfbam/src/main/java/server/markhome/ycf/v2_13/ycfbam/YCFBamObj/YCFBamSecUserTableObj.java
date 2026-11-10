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

public class YCFBamSecUserTableObj
	implements IYCFBamSecUserTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecSecUserPKey, IYCFSecSecUserObj> members;
	private Map<YCFSecSecUserPKey, IYCFSecSecUserObj> allSecUser;
	private Map< YCFSecSecUserByULoginIdxKey,
		IYCFSecSecUserObj > indexByULoginIdx;
	private Map< YCFSecSecUserByEMConfIdxKey,
		Map<YCFSecSecUserPKey, IYCFSecSecUserObj > > indexByEMConfIdx;
	private Map< YCFSecSecUserByPwdResetIdxKey,
		Map<YCFSecSecUserPKey, IYCFSecSecUserObj > > indexByPwdResetIdx;
	private Map< YCFSecSecUserByDefDevIdxKey,
		Map<YCFSecSecUserPKey, IYCFSecSecUserObj > > indexByDefDevIdx;
	public static String TABLE_NAME = "SecUser";
	public static String TABLE_DBNAME = "secuser";

	public YCFBamSecUserTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecUserPKey, IYCFSecSecUserObj>();
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
	}

	public YCFBamSecUserTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecSecUserPKey, IYCFSecSecUserObj>();
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
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
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
		List<IYCFSecSecUserObj> toForget = new LinkedList<IYCFSecSecUserObj>();
		IYCFSecSecUserObj cur = null;
		Iterator<IYCFSecSecUserObj> iter = members.values().iterator();
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
	 *	YCFBamSecUserObj.
	 */
	public IYCFSecSecUserObj newInstance() {
		IYCFSecSecUserObj inst = new YCFBamSecUserObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSecUserObj.
	 */
	public IYCFSecSecUserEditObj newEditInstance( IYCFSecSecUserObj orig ) {
		IYCFSecSecUserEditObj edit = new YCFBamSecUserEditObj( orig );
		return( edit );
	}

	public IYCFSecSecUserObj realiseSecUser( IYCFSecSecUserObj Obj ) {
		IYCFSecSecUserObj obj = Obj;
		YCFSecSecUserPKey pkey = obj.getPKey();
		IYCFSecSecUserObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecUserObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByULoginIdx != null ) {
				YCFSecSecUserByULoginIdxKey keyULoginIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.remove( keyULoginIdx );
			}

			if( indexByEMConfIdx != null ) {
				YCFSecSecUserByEMConfIdxKey keyEMConfIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.remove( keepObj.getPKey() );
					if( mapEMConfIdx.size() <= 0 ) {
						indexByEMConfIdx.remove( keyEMConfIdx );
					}
				}
			}

			if( indexByPwdResetIdx != null ) {
				YCFSecSecUserByPwdResetIdxKey keyPwdResetIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.remove( keepObj.getPKey() );
					if( mapPwdResetIdx.size() <= 0 ) {
						indexByPwdResetIdx.remove( keyPwdResetIdx );
					}
				}
			}

			if( indexByDefDevIdx != null ) {
				YCFSecSecUserByDefDevIdxKey keyDefDevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
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
				YCFSecSecUserByULoginIdxKey keyULoginIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.put( keyULoginIdx, keepObj );
			}

			if( indexByEMConfIdx != null ) {
				YCFSecSecUserByEMConfIdxKey keyEMConfIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPwdResetIdx != null ) {
				YCFSecSecUserByPwdResetIdxKey keyPwdResetIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefDevIdx != null ) {
				YCFSecSecUserByDefDevIdxKey keyDefDevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
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
				YCFSecSecUserByULoginIdxKey keyULoginIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.put( keyULoginIdx, keepObj );
			}

			if( indexByEMConfIdx != null ) {
				YCFSecSecUserByEMConfIdxKey keyEMConfIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPwdResetIdx != null ) {
				YCFSecSecUserByPwdResetIdxKey keyPwdResetIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefDevIdx != null ) {
				YCFSecSecUserByDefDevIdxKey keyDefDevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<YCFSecSecUserPKey, IYCFSecSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
				if( mapDefDevIdx != null ) {
					mapDefDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecSecUserObj createSecUser( IYCFSecSecUserObj Obj ) {
		IYCFSecSecUserObj obj = Obj;
		YCFSecSecUserBuff buff = obj.getSecUserBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().createSecUser(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecUserObj readSecUser( YCFSecSecUserPKey pkey ) {
		return( readSecUser( pkey, false ) );
	}

	public IYCFSecSecUserObj readSecUser( YCFSecSecUserPKey pkey, boolean forceRead ) {
		IYCFSecSecUserObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecUserBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecUserId() );
			if( readBuff != null ) {
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecUserObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecUserObj readCachedSecUser( YCFSecSecUserPKey pkey ) {
		IYCFSecSecUserObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecUser( IYCFSecSecUserObj obj )
	{
		final String S_ProcName = "YCFBamSecUserTableObj.reallyDeepDisposeSecUser() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecUserPKey pkey = obj.getPKey();
		IYCFSecSecUserObj existing = readCachedSecUser( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecUserByULoginIdxKey keyULoginIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		keyULoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		YCFSecSecUserByEMConfIdxKey keyEMConfIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		keyEMConfIdx.setOptionalEMailConfirmUuid( existing.getOptionalEMailConfirmUuid() );

		YCFSecSecUserByPwdResetIdxKey keyPwdResetIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		keyPwdResetIdx.setOptionalPasswordResetUuid( existing.getOptionalPasswordResetUuid() );

		YCFSecSecUserByDefDevIdxKey keyDefDevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
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
	public void deepDisposeSecUser( YCFSecSecUserPKey pkey ) {
		IYCFSecSecUserObj obj = readCachedSecUser( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecUserObj lockSecUser( YCFSecSecUserPKey pkey ) {
		IYCFSecSecUserObj locked = null;
		YCFSecSecUserBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecUserTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecUserObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecUser", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecUserObj> readAllSecUser() {
		return( readAllSecUser( false ) );
	}

	public List<IYCFSecSecUserObj> readAllSecUser( boolean forceRead ) {
		final String S_ProcName = "readAllSecUser";
		if( ( allSecUser == null ) || forceRead ) {
			Map<YCFSecSecUserPKey, IYCFSecSecUserObj> map = new HashMap<YCFSecSecUserPKey,IYCFSecSecUserObj>();
			allSecUser = map;
			YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().readAllDerived( schema.getAuthorization() );
			YCFSecSecUserBuff buff;
			IYCFSecSecUserObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecUserObj realised = (IYCFSecSecUserObj)obj.realise();
			}
		}
		int len = allSecUser.size();
		IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
		Iterator<IYCFSecSecUserObj> valIter = allSecUser.values().iterator();
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
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecUserObj> readCachedAllSecUser() {
		final String S_ProcName = "readCachedAllSecUser";
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>();
		if( allSecUser != null ) {
			int len = allSecUser.size();
			IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
			Iterator<IYCFSecSecUserObj> valIter = allSecUser.values().iterator();
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
		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFSecSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecUserObj> pageAllSecUser(UUID priorSecUserId )
	{
		final String S_ProcName = "pageAllSecUser";
		Map<YCFSecSecUserPKey, IYCFSecSecUserObj> map = new HashMap<YCFSecSecUserPKey,IYCFSecSecUserObj>();
		YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().pageAllBuff( schema.getAuthorization(),
			priorSecUserId );
		YCFSecSecUserBuff buff;
		IYCFSecSecUserObj obj;
		IYCFSecSecUserObj realised;
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecUserObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecUserObj readSecUserByIdIdx( UUID SecUserId )
	{
		return( readSecUserByIdIdx( SecUserId,
			false ) );
	}

	public IYCFSecSecUserObj readSecUserByIdIdx( UUID SecUserId, boolean forceRead )
	{
		YCFSecSecUserPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		IYCFSecSecUserObj obj = readSecUser( pkey, forceRead );
		return( obj );
	}

	public IYCFSecSecUserObj readSecUserByULoginIdx( String LoginId )
	{
		return( readSecUserByULoginIdx( LoginId,
			false ) );
	}

	public IYCFSecSecUserObj readSecUserByULoginIdx( String LoginId, boolean forceRead )
	{
		if( indexByULoginIdx == null ) {
			indexByULoginIdx = new HashMap< YCFSecSecUserByULoginIdxKey,
				IYCFSecSecUserObj >();
		}
		YCFSecSecUserByULoginIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		IYCFSecSecUserObj obj = null;
		if( ( ! forceRead ) && indexByULoginIdx.containsKey( key ) ) {
			obj = indexByULoginIdx.get( key );
		}
		else {
			YCFSecSecUserBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().readDerivedByULoginIdx( schema.getAuthorization(),
				LoginId );
			if( buff != null ) {
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecUserObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFSecSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		return( readSecUserByEMConfIdx( EMailConfirmUuid,
			false ) );
	}

	public List<IYCFSecSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByEMConfIdx";
		YCFSecSecUserByEMConfIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict;
		if( indexByEMConfIdx == null ) {
			indexByEMConfIdx = new HashMap< YCFSecSecUserByEMConfIdxKey,
				Map< YCFSecSecUserPKey, IYCFSecSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByEMConfIdx.containsKey( key ) ) {
			dict = indexByEMConfIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecUserPKey, IYCFSecSecUserObj>();
			IYCFSecSecUserObj obj;
			YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().readDerivedByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
			YCFSecSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecUserObj realised = (IYCFSecSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEMConfIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
		Iterator<IYCFSecSecUserObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		return( readSecUserByPwdResetIdx( PasswordResetUuid,
			false ) );
	}

	public List<IYCFSecSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByPwdResetIdx";
		YCFSecSecUserByPwdResetIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict;
		if( indexByPwdResetIdx == null ) {
			indexByPwdResetIdx = new HashMap< YCFSecSecUserByPwdResetIdxKey,
				Map< YCFSecSecUserPKey, IYCFSecSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByPwdResetIdx.containsKey( key ) ) {
			dict = indexByPwdResetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecUserPKey, IYCFSecSecUserObj>();
			IYCFSecSecUserObj obj;
			YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().readDerivedByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
			YCFSecSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecUserObj realised = (IYCFSecSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPwdResetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
		Iterator<IYCFSecSecUserObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		return( readSecUserByDefDevIdx( DfltDevUserId,
			DfltDevName,
			false ) );
	}

	public List<IYCFSecSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByDefDevIdx";
		YCFSecSecUserByDefDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict;
		if( indexByDefDevIdx == null ) {
			indexByDefDevIdx = new HashMap< YCFSecSecUserByDefDevIdxKey,
				Map< YCFSecSecUserPKey, IYCFSecSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByDefDevIdx.containsKey( key ) ) {
			dict = indexByDefDevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecUserPKey, IYCFSecSecUserObj>();
			IYCFSecSecUserObj obj;
			YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().readDerivedByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
			YCFSecSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecUserObj realised = (IYCFSecSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefDevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
		Iterator<IYCFSecSecUserObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecUserObj readCachedSecUserByIdIdx( UUID SecUserId )
	{
		IYCFSecSecUserObj obj = null;
		YCFSecSecUserPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		obj = readCachedSecUser( pkey );
		return( obj );
	}

	public IYCFSecSecUserObj readCachedSecUserByULoginIdx( String LoginId )
	{
		IYCFSecSecUserObj obj = null;
		YCFSecSecUserByULoginIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		if( indexByULoginIdx != null ) {
			if( indexByULoginIdx.containsKey( key ) ) {
				obj = indexByULoginIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecUserObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecUserObj> valIter = members.values().iterator();
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

	public List<IYCFSecSecUserObj> readCachedSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		final String S_ProcName = "readCachedSecUserByEMConfIdx";
		YCFSecSecUserByEMConfIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>();
		if( indexByEMConfIdx != null ) {
			Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict;
			if( indexByEMConfIdx.containsKey( key ) ) {
				dict = indexByEMConfIdx.get( key );
				int len = dict.size();
				IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
				Iterator<IYCFSecSecUserObj> valIter = dict.values().iterator();
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
			IYCFSecSecUserObj obj;
			Iterator<IYCFSecSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecUserObj> readCachedSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		final String S_ProcName = "readCachedSecUserByPwdResetIdx";
		YCFSecSecUserByPwdResetIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>();
		if( indexByPwdResetIdx != null ) {
			Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict;
			if( indexByPwdResetIdx.containsKey( key ) ) {
				dict = indexByPwdResetIdx.get( key );
				int len = dict.size();
				IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
				Iterator<IYCFSecSecUserObj> valIter = dict.values().iterator();
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
			IYCFSecSecUserObj obj;
			Iterator<IYCFSecSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecUserObj> readCachedSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "readCachedSecUserByDefDevIdx";
		YCFSecSecUserByDefDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		ArrayList<IYCFSecSecUserObj> arrayList = new ArrayList<IYCFSecSecUserObj>();
		if( indexByDefDevIdx != null ) {
			Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict;
			if( indexByDefDevIdx.containsKey( key ) ) {
				dict = indexByDefDevIdx.get( key );
				int len = dict.size();
				IYCFSecSecUserObj arr[] = new IYCFSecSecUserObj[len];
				Iterator<IYCFSecSecUserObj> valIter = dict.values().iterator();
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
			IYCFSecSecUserObj obj;
			Iterator<IYCFSecSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecUserObj> cmp = new Comparator<IYCFSecSecUserObj>() {
			public int compare( IYCFSecSecUserObj lhs, IYCFSecSecUserObj rhs ) {
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
					YCFSecSecUserPKey lhsPKey = lhs.getPKey();
					YCFSecSecUserPKey rhsPKey = rhs.getPKey();
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
		IYCFSecSecUserObj obj = readCachedSecUserByIdIdx( SecUserId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecUserByULoginIdx( String LoginId )
	{
		IYCFSecSecUserObj obj = readCachedSecUserByULoginIdx( LoginId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		final String S_ProcName = "deepDisposeSecUserByEMConfIdx";
		IYCFSecSecUserObj obj;
		List<IYCFSecSecUserObj> arrayList = readCachedSecUserByEMConfIdx( EMailConfirmUuid );
		if( arrayList != null )  {
			Iterator<IYCFSecSecUserObj> arrayIter = arrayList.iterator();
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
		IYCFSecSecUserObj obj;
		List<IYCFSecSecUserObj> arrayList = readCachedSecUserByPwdResetIdx( PasswordResetUuid );
		if( arrayList != null )  {
			Iterator<IYCFSecSecUserObj> arrayIter = arrayList.iterator();
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
		IYCFSecSecUserObj obj;
		List<IYCFSecSecUserObj> arrayList = readCachedSecUserByDefDevIdx( DfltDevUserId,
				DfltDevName );
		if( arrayList != null )  {
			Iterator<IYCFSecSecUserObj> arrayIter = arrayList.iterator();
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
	public List<IYCFSecSecUserObj> pageSecUserByEMConfIdx( UUID EMailConfirmUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByEMConfIdx";
		YCFSecSecUserByEMConfIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		List<IYCFSecSecUserObj> retList = new LinkedList<IYCFSecSecUserObj>();
		IYCFSecSecUserObj obj;
		YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().pageBuffByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid,
			priorSecUserId );
		YCFSecSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecUserObj realised = (IYCFSecSecUserObj)obj.realise();
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
	public List<IYCFSecSecUserObj> pageSecUserByPwdResetIdx( UUID PasswordResetUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByPwdResetIdx";
		YCFSecSecUserByPwdResetIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		List<IYCFSecSecUserObj> retList = new LinkedList<IYCFSecSecUserObj>();
		IYCFSecSecUserObj obj;
		YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().pageBuffByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid,
			priorSecUserId );
		YCFSecSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecUserObj realised = (IYCFSecSecUserObj)obj.realise();
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
	public List<IYCFSecSecUserObj> pageSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByDefDevIdx";
		YCFSecSecUserByDefDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		List<IYCFSecSecUserObj> retList = new LinkedList<IYCFSecSecUserObj>();
		IYCFSecSecUserObj obj;
		YCFSecSecUserBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().pageBuffByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName,
			priorSecUserId );
		YCFSecSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecUserObj realised = (IYCFSecSecUserObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecUserObj updateSecUser( IYCFSecSecUserObj Obj ) {
		IYCFSecSecUserObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().updateSecUser( schema.getAuthorization(),
			Obj.getSecUserBuff() );
		obj = (IYCFSecSecUserObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecUser( IYCFSecSecUserObj Obj ) {
		IYCFSecSecUserObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUser( schema.getAuthorization(),
			obj.getSecUserBuff() );
		Obj.forget();
	}

	public void deleteSecUserByIdIdx( UUID SecUserId )
	{
		YCFSecSecUserPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		IYCFSecSecUserObj obj = readSecUser( pkey );
		if( obj != null ) {
			IYCFSecSecUserEditObj editObj = (IYCFSecSecUserEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecUserEditObj)obj.beginEdit();
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
			indexByULoginIdx = new HashMap< YCFSecSecUserByULoginIdxKey,
				IYCFSecSecUserObj >();
		}
		YCFSecSecUserByULoginIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		IYCFSecSecUserObj obj = null;
		if( indexByULoginIdx.containsKey( key ) ) {
			obj = indexByULoginIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByULoginIdx( schema.getAuthorization(),
				LoginId );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByULoginIdx( schema.getAuthorization(),
				LoginId );
		}
		deepDisposeSecUserByULoginIdx( LoginId );
	}

	public void deleteSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		YCFSecSecUserByEMConfIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		if( indexByEMConfIdx == null ) {
			indexByEMConfIdx = new HashMap< YCFSecSecUserByEMConfIdxKey,
				Map< YCFSecSecUserPKey, IYCFSecSecUserObj > >();
		}
		if( indexByEMConfIdx.containsKey( key ) ) {
			Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict = indexByEMConfIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
			Iterator<IYCFSecSecUserObj> iter = dict.values().iterator();
			IYCFSecSecUserObj obj;
			List<IYCFSecSecUserObj> toForget = new LinkedList<IYCFSecSecUserObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
		}
		deepDisposeSecUserByEMConfIdx( EMailConfirmUuid );
	}

	public void deleteSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		YCFSecSecUserByPwdResetIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		if( indexByPwdResetIdx == null ) {
			indexByPwdResetIdx = new HashMap< YCFSecSecUserByPwdResetIdxKey,
				Map< YCFSecSecUserPKey, IYCFSecSecUserObj > >();
		}
		if( indexByPwdResetIdx.containsKey( key ) ) {
			Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict = indexByPwdResetIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
			Iterator<IYCFSecSecUserObj> iter = dict.values().iterator();
			IYCFSecSecUserObj obj;
			List<IYCFSecSecUserObj> toForget = new LinkedList<IYCFSecSecUserObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
		}
		deepDisposeSecUserByPwdResetIdx( PasswordResetUuid );
	}

	public void deleteSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		YCFSecSecUserByDefDevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		if( indexByDefDevIdx == null ) {
			indexByDefDevIdx = new HashMap< YCFSecSecUserByDefDevIdxKey,
				Map< YCFSecSecUserPKey, IYCFSecSecUserObj > >();
		}
		if( indexByDefDevIdx.containsKey( key ) ) {
			Map<YCFSecSecUserPKey, IYCFSecSecUserObj> dict = indexByDefDevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
			Iterator<IYCFSecSecUserObj> iter = dict.values().iterator();
			IYCFSecSecUserObj obj;
			List<IYCFSecSecUserObj> toForget = new LinkedList<IYCFSecSecUserObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
		}
		deepDisposeSecUserByDefDevIdx( DfltDevUserId,
				DfltDevName );
	}

	public IYCFSecSecUserObj getSystemUser() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFSecSecUserObj secUserObj;
		try {
			secUserObj = schema.getSecUserTableObj().readSecUserByULoginIdx( "system" );
			if( secUserObj == null ) {
				secUserObj = newInstance();
				IYCFSecSecUserEditObj secUserEdit = secUserObj.beginEdit();
				secUserEdit.setRequiredEMailAddress( "system" );
				secUserObj = secUserEdit.create();
				secUserEdit = null;
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
