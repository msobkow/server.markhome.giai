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

public class YCFGenKbSecDeviceTableObj
	implements IYCFGenKbSecDeviceTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj> members;
	private Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj> allSecDevice;
	private Map< YCFGenKbSecDeviceByNameIdxKey,
		IYCFGenKbSecDeviceObj > indexByNameIdx;
	private Map< YCFGenKbSecDeviceByUserIdxKey,
		Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj > > indexByUserIdx;
	public static String TABLE_NAME = "SecDevice";
	public static String TABLE_DBNAME = "secdev";

	public YCFGenKbSecDeviceTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj>();
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
	}

	public YCFGenKbSecDeviceTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj>();
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
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
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
		List<IYCFGenKbSecDeviceObj> toForget = new LinkedList<IYCFGenKbSecDeviceObj>();
		IYCFGenKbSecDeviceObj cur = null;
		Iterator<IYCFGenKbSecDeviceObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecDeviceObj.
	 */
	public IYCFGenKbSecDeviceObj newInstance() {
		IYCFGenKbSecDeviceObj inst = new YCFGenKbSecDeviceObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecDeviceObj.
	 */
	public IYCFGenKbSecDeviceEditObj newEditInstance( IYCFGenKbSecDeviceObj orig ) {
		IYCFGenKbSecDeviceEditObj edit = new YCFGenKbSecDeviceEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecDeviceObj realiseSecDevice( IYCFGenKbSecDeviceObj Obj ) {
		IYCFGenKbSecDeviceObj obj = Obj;
		YCFGenKbSecDevicePKey pkey = obj.getPKey();
		IYCFGenKbSecDeviceObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecDeviceObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				YCFGenKbSecDeviceByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByUserIdx != null ) {
				YCFGenKbSecDeviceByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				YCFGenKbSecDeviceByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByUserIdx != null ) {
				YCFGenKbSecDeviceByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecDevice != null ) {
				allSecDevice.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecDevice != null ) {
				allSecDevice.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFGenKbSecDeviceByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByUserIdx != null ) {
				YCFGenKbSecDeviceByUserIdxKey keyUserIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecDeviceObj createSecDevice( IYCFGenKbSecDeviceObj Obj ) {
		IYCFGenKbSecDeviceObj obj = Obj;
		YCFGenKbSecDeviceBuff buff = obj.getSecDeviceBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().createSecDevice(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecDeviceObj readSecDevice( YCFGenKbSecDevicePKey pkey ) {
		return( readSecDevice( pkey, false ) );
	}

	public IYCFGenKbSecDeviceObj readSecDevice( YCFGenKbSecDevicePKey pkey, boolean forceRead ) {
		IYCFGenKbSecDeviceObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecDeviceBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecUserId(),
				pkey.getRequiredDevName() );
			if( readBuff != null ) {
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecDeviceObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecDeviceObj readCachedSecDevice( YCFGenKbSecDevicePKey pkey ) {
		IYCFGenKbSecDeviceObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecDevice( IYCFGenKbSecDeviceObj obj )
	{
		final String S_ProcName = "YCFGenKbSecDeviceTableObj.reallyDeepDisposeSecDevice() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecDevicePKey pkey = obj.getPKey();
		IYCFGenKbSecDeviceObj existing = readCachedSecDevice( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecDeviceByNameIdxKey keyNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		keyNameIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyNameIdx.setRequiredDevName( existing.getRequiredDevName() );

		YCFGenKbSecDeviceByUserIdxKey keyUserIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}

		if( indexByUserIdx != null ) {
			if( indexByUserIdx.containsKey( keyUserIdx ) ) {
				indexByUserIdx.get( keyUserIdx ).remove( pkey );
				if( indexByUserIdx.get( keyUserIdx ).size() <= 0 ) {
					indexByUserIdx.remove( keyUserIdx );
				}
			}
		}


	}
	public void deepDisposeSecDevice( YCFGenKbSecDevicePKey pkey ) {
		IYCFGenKbSecDeviceObj obj = readCachedSecDevice( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecDeviceObj lockSecDevice( YCFGenKbSecDevicePKey pkey ) {
		IYCFGenKbSecDeviceObj locked = null;
		YCFGenKbSecDeviceBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecDeviceTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecDeviceObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecDevice", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecDeviceObj> readAllSecDevice() {
		return( readAllSecDevice( false ) );
	}

	public List<IYCFGenKbSecDeviceObj> readAllSecDevice( boolean forceRead ) {
		final String S_ProcName = "readAllSecDevice";
		if( ( allSecDevice == null ) || forceRead ) {
			Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj> map = new HashMap<YCFGenKbSecDevicePKey,IYCFGenKbSecDeviceObj>();
			allSecDevice = map;
			YCFGenKbSecDeviceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecDeviceBuff buff;
			IYCFGenKbSecDeviceObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecDeviceObj realised = (IYCFGenKbSecDeviceObj)obj.realise();
			}
		}
		int len = allSecDevice.size();
		IYCFGenKbSecDeviceObj arr[] = new IYCFGenKbSecDeviceObj[len];
		Iterator<IYCFGenKbSecDeviceObj> valIter = allSecDevice.values().iterator();
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
		ArrayList<IYCFGenKbSecDeviceObj> arrayList = new ArrayList<IYCFGenKbSecDeviceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecDeviceObj> cmp = new Comparator<IYCFGenKbSecDeviceObj>() {
			public int compare( IYCFGenKbSecDeviceObj lhs, IYCFGenKbSecDeviceObj rhs ) {
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
					YCFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					YCFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecDeviceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecDeviceObj> readCachedAllSecDevice() {
		final String S_ProcName = "readCachedAllSecDevice";
		ArrayList<IYCFGenKbSecDeviceObj> arrayList = new ArrayList<IYCFGenKbSecDeviceObj>();
		if( allSecDevice != null ) {
			int len = allSecDevice.size();
			IYCFGenKbSecDeviceObj arr[] = new IYCFGenKbSecDeviceObj[len];
			Iterator<IYCFGenKbSecDeviceObj> valIter = allSecDevice.values().iterator();
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
		Comparator<IYCFGenKbSecDeviceObj> cmp = new Comparator<IYCFGenKbSecDeviceObj>() {
			public int compare( IYCFGenKbSecDeviceObj lhs, IYCFGenKbSecDeviceObj rhs ) {
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
					YCFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					YCFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecDeviceObj> pageAllSecDevice(UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageAllSecDevice";
		Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj> map = new HashMap<YCFGenKbSecDevicePKey,IYCFGenKbSecDeviceObj>();
		YCFGenKbSecDeviceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().pageAllBuff( schema.getAuthorization(),
			priorSecUserId,
			priorDevName );
		YCFGenKbSecDeviceBuff buff;
		IYCFGenKbSecDeviceObj obj;
		IYCFGenKbSecDeviceObj realised;
		ArrayList<IYCFGenKbSecDeviceObj> arrayList = new ArrayList<IYCFGenKbSecDeviceObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecDeviceObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		return( readSecDeviceByIdIdx( SecUserId,
			DevName,
			false ) );
	}

	public IYCFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName, boolean forceRead )
	{
		YCFGenKbSecDevicePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		IYCFGenKbSecDeviceObj obj = readSecDevice( pkey, forceRead );
		return( obj );
	}

	public IYCFGenKbSecDeviceObj readSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		return( readSecDeviceByNameIdx( SecUserId,
			DevName,
			false ) );
	}

	public IYCFGenKbSecDeviceObj readSecDeviceByNameIdx( UUID SecUserId,
		String DevName, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbSecDeviceByNameIdxKey,
				IYCFGenKbSecDeviceObj >();
		}
		YCFGenKbSecDeviceByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		IYCFGenKbSecDeviceObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFGenKbSecDeviceBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
			if( buff != null ) {
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecDeviceObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId )
	{
		return( readSecDeviceByUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecDeviceByUserIdx";
		YCFGenKbSecDeviceByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFGenKbSecDeviceByUserIdxKey,
				Map< YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj>();
			IYCFGenKbSecDeviceObj obj;
			YCFGenKbSecDeviceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFGenKbSecDeviceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecDeviceObj realised = (IYCFGenKbSecDeviceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecDeviceObj arr[] = new IYCFGenKbSecDeviceObj[len];
		Iterator<IYCFGenKbSecDeviceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecDeviceObj> arrayList = new ArrayList<IYCFGenKbSecDeviceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecDeviceObj> cmp = new Comparator<IYCFGenKbSecDeviceObj>() {
			public int compare( IYCFGenKbSecDeviceObj lhs, IYCFGenKbSecDeviceObj rhs ) {
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
					YCFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					YCFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecDeviceObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecDeviceObj readCachedSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		IYCFGenKbSecDeviceObj obj = null;
		YCFGenKbSecDevicePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		obj = readCachedSecDevice( pkey );
		return( obj );
	}

	public IYCFGenKbSecDeviceObj readCachedSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		IYCFGenKbSecDeviceObj obj = null;
		YCFGenKbSecDeviceByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecDeviceObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecDeviceObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbSecDeviceObj> readCachedSecDeviceByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecDeviceByUserIdx";
		YCFGenKbSecDeviceByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFGenKbSecDeviceObj> arrayList = new ArrayList<IYCFGenKbSecDeviceObj>();
		if( indexByUserIdx != null ) {
			Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecDeviceObj arr[] = new IYCFGenKbSecDeviceObj[len];
				Iterator<IYCFGenKbSecDeviceObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecDeviceObj obj;
			Iterator<IYCFGenKbSecDeviceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecDeviceObj> cmp = new Comparator<IYCFGenKbSecDeviceObj>() {
			public int compare( IYCFGenKbSecDeviceObj lhs, IYCFGenKbSecDeviceObj rhs ) {
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
					YCFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					YCFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		IYCFGenKbSecDeviceObj obj = readCachedSecDeviceByIdIdx( SecUserId,
				DevName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		IYCFGenKbSecDeviceObj obj = readCachedSecDeviceByNameIdx( SecUserId,
				DevName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecDeviceByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeSecDeviceByUserIdx";
		IYCFGenKbSecDeviceObj obj;
		List<IYCFGenKbSecDeviceObj> arrayList = readCachedSecDeviceByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecDeviceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	/**
	 *	Read a page of data as a List of SecDevice-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecDevice-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFGenKbSecDeviceObj> pageSecDeviceByUserIdx( UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageSecDeviceByUserIdx";
		YCFGenKbSecDeviceByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFGenKbSecDeviceObj> retList = new LinkedList<IYCFGenKbSecDeviceObj>();
		IYCFGenKbSecDeviceObj obj;
		YCFGenKbSecDeviceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorSecUserId,
			priorDevName );
		YCFGenKbSecDeviceBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecDeviceTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecDeviceObj realised = (IYCFGenKbSecDeviceObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecDeviceObj updateSecDevice( IYCFGenKbSecDeviceObj Obj ) {
		IYCFGenKbSecDeviceObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().updateSecDevice( schema.getAuthorization(),
			Obj.getSecDeviceBuff() );
		obj = (IYCFGenKbSecDeviceObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecDevice( IYCFGenKbSecDeviceObj Obj ) {
		IYCFGenKbSecDeviceObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDevice( schema.getAuthorization(),
			obj.getSecDeviceBuff() );
		Obj.forget();
	}

	public void deleteSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		YCFGenKbSecDevicePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		IYCFGenKbSecDeviceObj obj = readSecDevice( pkey );
		if( obj != null ) {
			IYCFGenKbSecDeviceEditObj editObj = (IYCFGenKbSecDeviceEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecDeviceEditObj)obj.beginEdit();
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
		deepDisposeSecDeviceByIdIdx( SecUserId,
				DevName );
	}

	public void deleteSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbSecDeviceByNameIdxKey,
				IYCFGenKbSecDeviceObj >();
		}
		YCFGenKbSecDeviceByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		IYCFGenKbSecDeviceObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
		}
		deepDisposeSecDeviceByNameIdx( SecUserId,
				DevName );
	}

	public void deleteSecDeviceByUserIdx( UUID SecUserId )
	{
		YCFGenKbSecDeviceByUserIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFGenKbSecDeviceByUserIdxKey,
				Map< YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<YCFGenKbSecDevicePKey, IYCFGenKbSecDeviceObj> dict = indexByUserIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFGenKbSecDeviceObj> iter = dict.values().iterator();
			IYCFGenKbSecDeviceObj obj;
			List<IYCFGenKbSecDeviceObj> toForget = new LinkedList<IYCFGenKbSecDeviceObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecDeviceByUserIdx( SecUserId );
	}
}
