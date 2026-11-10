// Description: Java 11 Table Object implementation for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFSecISOCcyTableObj
	implements IYCFSecISOCcyTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecISOCcyPKey, IYCFSecISOCcyObj> members;
	private Map<YCFSecISOCcyPKey, IYCFSecISOCcyObj> allISOCcy;
	private Map< YCFSecISOCcyByCcyCdIdxKey,
		IYCFSecISOCcyObj > indexByCcyCdIdx;
	private Map< YCFSecISOCcyByCcyNmIdxKey,
		IYCFSecISOCcyObj > indexByCcyNmIdx;
	public static String TABLE_NAME = "ISOCcy";
	public static String TABLE_DBNAME = "iso_ccy";

	public YCFSecISOCcyTableObj() {
		schema = null;
		members = new HashMap<YCFSecISOCcyPKey, IYCFSecISOCcyObj>();
		allISOCcy = null;
		indexByCcyCdIdx = null;
		indexByCcyNmIdx = null;
	}

	public YCFSecISOCcyTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecISOCcyPKey, IYCFSecISOCcyObj>();
		allISOCcy = null;
		indexByCcyCdIdx = null;
		indexByCcyNmIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFSecSchemaObj)value;
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
		allISOCcy = null;
		indexByCcyCdIdx = null;
		indexByCcyNmIdx = null;
		List<IYCFSecISOCcyObj> toForget = new LinkedList<IYCFSecISOCcyObj>();
		IYCFSecISOCcyObj cur = null;
		Iterator<IYCFSecISOCcyObj> iter = members.values().iterator();
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
	 *	YCFSecISOCcyObj.
	 */
	public IYCFSecISOCcyObj newInstance() {
		IYCFSecISOCcyObj inst = new YCFSecISOCcyObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecISOCcyObj.
	 */
	public IYCFSecISOCcyEditObj newEditInstance( IYCFSecISOCcyObj orig ) {
		IYCFSecISOCcyEditObj edit = new YCFSecISOCcyEditObj( orig );
		return( edit );
	}

	public IYCFSecISOCcyObj realiseISOCcy( IYCFSecISOCcyObj Obj ) {
		IYCFSecISOCcyObj obj = Obj;
		YCFSecISOCcyPKey pkey = obj.getPKey();
		IYCFSecISOCcyObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecISOCcyObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByCcyCdIdx != null ) {
				YCFSecISOCcyByCcyCdIdxKey keyCcyCdIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyCdIdxKey();
				keyCcyCdIdx.setRequiredISOCode( keepObj.getRequiredISOCode() );
				indexByCcyCdIdx.remove( keyCcyCdIdx );
			}

			if( indexByCcyNmIdx != null ) {
				YCFSecISOCcyByCcyNmIdxKey keyCcyNmIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyNmIdxKey();
				keyCcyNmIdx.setRequiredName( keepObj.getRequiredName() );
				indexByCcyNmIdx.remove( keyCcyNmIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByCcyCdIdx != null ) {
				YCFSecISOCcyByCcyCdIdxKey keyCcyCdIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyCdIdxKey();
				keyCcyCdIdx.setRequiredISOCode( keepObj.getRequiredISOCode() );
				indexByCcyCdIdx.put( keyCcyCdIdx, keepObj );
			}

			if( indexByCcyNmIdx != null ) {
				YCFSecISOCcyByCcyNmIdxKey keyCcyNmIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyNmIdxKey();
				keyCcyNmIdx.setRequiredName( keepObj.getRequiredName() );
				indexByCcyNmIdx.put( keyCcyNmIdx, keepObj );
			}

			if( allISOCcy != null ) {
				allISOCcy.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allISOCcy != null ) {
				allISOCcy.put( keepObj.getPKey(), keepObj );
			}

			if( indexByCcyCdIdx != null ) {
				YCFSecISOCcyByCcyCdIdxKey keyCcyCdIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyCdIdxKey();
				keyCcyCdIdx.setRequiredISOCode( keepObj.getRequiredISOCode() );
				indexByCcyCdIdx.put( keyCcyCdIdx, keepObj );
			}

			if( indexByCcyNmIdx != null ) {
				YCFSecISOCcyByCcyNmIdxKey keyCcyNmIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyNmIdxKey();
				keyCcyNmIdx.setRequiredName( keepObj.getRequiredName() );
				indexByCcyNmIdx.put( keyCcyNmIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecISOCcyObj createISOCcy( IYCFSecISOCcyObj Obj ) {
		IYCFSecISOCcyObj obj = Obj;
		YCFSecISOCcyBuff buff = obj.getISOCcyBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().createISOCcy(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecISOCcyObj readISOCcy( YCFSecISOCcyPKey pkey ) {
		return( readISOCcy( pkey, false ) );
	}

	public IYCFSecISOCcyObj readISOCcy( YCFSecISOCcyPKey pkey, boolean forceRead ) {
		IYCFSecISOCcyObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecISOCcyBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredISOCcyId() );
			if( readBuff != null ) {
				obj = schema.getISOCcyTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecISOCcyObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCcyObj readCachedISOCcy( YCFSecISOCcyPKey pkey ) {
		IYCFSecISOCcyObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeISOCcy( IYCFSecISOCcyObj obj )
	{
		final String S_ProcName = "YCFSecISOCcyTableObj.reallyDeepDisposeISOCcy() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecISOCcyPKey pkey = obj.getPKey();
		IYCFSecISOCcyObj existing = readCachedISOCcy( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecISOCcyByCcyCdIdxKey keyCcyCdIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyCdIdxKey();
		keyCcyCdIdx.setRequiredISOCode( existing.getRequiredISOCode() );

		YCFSecISOCcyByCcyNmIdxKey keyCcyNmIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyNmIdxKey();
		keyCcyNmIdx.setRequiredName( existing.getRequiredName() );


		schema.getISOCtryCcyTableObj().deepDisposeISOCtryCcyByCcyIdx( existing.getRequiredISOCcyId() );

		if( indexByCcyCdIdx != null ) {
			indexByCcyCdIdx.remove( keyCcyCdIdx );
		}

		if( indexByCcyNmIdx != null ) {
			indexByCcyNmIdx.remove( keyCcyNmIdx );
		}


	}
	public void deepDisposeISOCcy( YCFSecISOCcyPKey pkey ) {
		IYCFSecISOCcyObj obj = readCachedISOCcy( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOCcyObj lockISOCcy( YCFSecISOCcyPKey pkey ) {
		IYCFSecISOCcyObj locked = null;
		YCFSecISOCcyBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getISOCcyTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecISOCcyObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockISOCcy", pkey );
		}
		return( locked );
	}

	public List<IYCFSecISOCcyObj> readAllISOCcy() {
		return( readAllISOCcy( false ) );
	}

	public List<IYCFSecISOCcyObj> readAllISOCcy( boolean forceRead ) {
		final String S_ProcName = "readAllISOCcy";
		if( ( allISOCcy == null ) || forceRead ) {
			Map<YCFSecISOCcyPKey, IYCFSecISOCcyObj> map = new HashMap<YCFSecISOCcyPKey,IYCFSecISOCcyObj>();
			allISOCcy = map;
			YCFSecISOCcyBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().readAllDerived( schema.getAuthorization() );
			YCFSecISOCcyBuff buff;
			IYCFSecISOCcyObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCcyObj realised = (IYCFSecISOCcyObj)obj.realise();
			}
		}
		int len = allISOCcy.size();
		IYCFSecISOCcyObj arr[] = new IYCFSecISOCcyObj[len];
		Iterator<IYCFSecISOCcyObj> valIter = allISOCcy.values().iterator();
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
		ArrayList<IYCFSecISOCcyObj> arrayList = new ArrayList<IYCFSecISOCcyObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCcyObj> cmp = new Comparator<IYCFSecISOCcyObj>() {
			public int compare( IYCFSecISOCcyObj lhs, IYCFSecISOCcyObj rhs ) {
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
					YCFSecISOCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCcyObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOCcyObj> readCachedAllISOCcy() {
		final String S_ProcName = "readCachedAllISOCcy";
		ArrayList<IYCFSecISOCcyObj> arrayList = new ArrayList<IYCFSecISOCcyObj>();
		if( allISOCcy != null ) {
			int len = allISOCcy.size();
			IYCFSecISOCcyObj arr[] = new IYCFSecISOCcyObj[len];
			Iterator<IYCFSecISOCcyObj> valIter = allISOCcy.values().iterator();
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
		Comparator<IYCFSecISOCcyObj> cmp = new Comparator<IYCFSecISOCcyObj>() {
			public int compare( IYCFSecISOCcyObj lhs, IYCFSecISOCcyObj rhs ) {
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
					YCFSecISOCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecISOCcyObj readISOCcyByIdIdx( short ISOCcyId )
	{
		return( readISOCcyByIdIdx( ISOCcyId,
			false ) );
	}

	public IYCFSecISOCcyObj readISOCcyByIdIdx( short ISOCcyId, boolean forceRead )
	{
		YCFSecISOCcyPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey();
		pkey.setRequiredISOCcyId( ISOCcyId );
		IYCFSecISOCcyObj obj = readISOCcy( pkey, forceRead );
		return( obj );
	}

	public IYCFSecISOCcyObj readISOCcyByCcyCdIdx( String ISOCode )
	{
		return( readISOCcyByCcyCdIdx( ISOCode,
			false ) );
	}

	public IYCFSecISOCcyObj readISOCcyByCcyCdIdx( String ISOCode, boolean forceRead )
	{
		if( indexByCcyCdIdx == null ) {
			indexByCcyCdIdx = new HashMap< YCFSecISOCcyByCcyCdIdxKey,
				IYCFSecISOCcyObj >();
		}
		YCFSecISOCcyByCcyCdIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyCdIdxKey();
		key.setRequiredISOCode( ISOCode );
		IYCFSecISOCcyObj obj = null;
		if( ( ! forceRead ) && indexByCcyCdIdx.containsKey( key ) ) {
			obj = indexByCcyCdIdx.get( key );
		}
		else {
			YCFSecISOCcyBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().readDerivedByCcyCdIdx( schema.getAuthorization(),
				ISOCode );
			if( buff != null ) {
				obj = schema.getISOCcyTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecISOCcyObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCcyObj readISOCcyByCcyNmIdx( String Name )
	{
		return( readISOCcyByCcyNmIdx( Name,
			false ) );
	}

	public IYCFSecISOCcyObj readISOCcyByCcyNmIdx( String Name, boolean forceRead )
	{
		if( indexByCcyNmIdx == null ) {
			indexByCcyNmIdx = new HashMap< YCFSecISOCcyByCcyNmIdxKey,
				IYCFSecISOCcyObj >();
		}
		YCFSecISOCcyByCcyNmIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyNmIdxKey();
		key.setRequiredName( Name );
		IYCFSecISOCcyObj obj = null;
		if( ( ! forceRead ) && indexByCcyNmIdx.containsKey( key ) ) {
			obj = indexByCcyNmIdx.get( key );
		}
		else {
			YCFSecISOCcyBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().readDerivedByCcyNmIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getISOCcyTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecISOCcyObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCcyObj readCachedISOCcyByIdIdx( short ISOCcyId )
	{
		IYCFSecISOCcyObj obj = null;
		YCFSecISOCcyPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey();
		pkey.setRequiredISOCcyId( ISOCcyId );
		obj = readCachedISOCcy( pkey );
		return( obj );
	}

	public IYCFSecISOCcyObj readCachedISOCcyByCcyCdIdx( String ISOCode )
	{
		IYCFSecISOCcyObj obj = null;
		YCFSecISOCcyByCcyCdIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyCdIdxKey();
		key.setRequiredISOCode( ISOCode );
		if( indexByCcyCdIdx != null ) {
			if( indexByCcyCdIdx.containsKey( key ) ) {
				obj = indexByCcyCdIdx.get( key );
			}
			else {
				Iterator<IYCFSecISOCcyObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecISOCcyObj> valIter = members.values().iterator();
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

	public IYCFSecISOCcyObj readCachedISOCcyByCcyNmIdx( String Name )
	{
		IYCFSecISOCcyObj obj = null;
		YCFSecISOCcyByCcyNmIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyNmIdxKey();
		key.setRequiredName( Name );
		if( indexByCcyNmIdx != null ) {
			if( indexByCcyNmIdx.containsKey( key ) ) {
				obj = indexByCcyNmIdx.get( key );
			}
			else {
				Iterator<IYCFSecISOCcyObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecISOCcyObj> valIter = members.values().iterator();
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

	public void deepDisposeISOCcyByIdIdx( short ISOCcyId )
	{
		IYCFSecISOCcyObj obj = readCachedISOCcyByIdIdx( ISOCcyId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOCcyByCcyCdIdx( String ISOCode )
	{
		IYCFSecISOCcyObj obj = readCachedISOCcyByCcyCdIdx( ISOCode );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOCcyByCcyNmIdx( String Name )
	{
		IYCFSecISOCcyObj obj = readCachedISOCcyByCcyNmIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOCcyObj updateISOCcy( IYCFSecISOCcyObj Obj ) {
		IYCFSecISOCcyObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().updateISOCcy( schema.getAuthorization(),
			Obj.getISOCcyBuff() );
		obj = (IYCFSecISOCcyObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteISOCcy( IYCFSecISOCcyObj Obj ) {
		IYCFSecISOCcyObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().deleteISOCcy( schema.getAuthorization(),
			obj.getISOCcyBuff() );
		Obj.forget();
	}

	public void deleteISOCcyByIdIdx( short ISOCcyId )
	{
		YCFSecISOCcyPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey();
		pkey.setRequiredISOCcyId( ISOCcyId );
		IYCFSecISOCcyObj obj = readISOCcy( pkey );
		if( obj != null ) {
			IYCFSecISOCcyEditObj editObj = (IYCFSecISOCcyEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecISOCcyEditObj)obj.beginEdit();
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
		deepDisposeISOCcyByIdIdx( ISOCcyId );
	}

	public void deleteISOCcyByCcyCdIdx( String ISOCode )
	{
		if( indexByCcyCdIdx == null ) {
			indexByCcyCdIdx = new HashMap< YCFSecISOCcyByCcyCdIdxKey,
				IYCFSecISOCcyObj >();
		}
		YCFSecISOCcyByCcyCdIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyCdIdxKey();
		key.setRequiredISOCode( ISOCode );
		IYCFSecISOCcyObj obj = null;
		if( indexByCcyCdIdx.containsKey( key ) ) {
			obj = indexByCcyCdIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().deleteISOCcyByCcyCdIdx( schema.getAuthorization(),
				ISOCode );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().deleteISOCcyByCcyCdIdx( schema.getAuthorization(),
				ISOCode );
		}
		deepDisposeISOCcyByCcyCdIdx( ISOCode );
	}

	public void deleteISOCcyByCcyNmIdx( String Name )
	{
		if( indexByCcyNmIdx == null ) {
			indexByCcyNmIdx = new HashMap< YCFSecISOCcyByCcyNmIdxKey,
				IYCFSecISOCcyObj >();
		}
		YCFSecISOCcyByCcyNmIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newCcyNmIdxKey();
		key.setRequiredName( Name );
		IYCFSecISOCcyObj obj = null;
		if( indexByCcyNmIdx.containsKey( key ) ) {
			obj = indexByCcyNmIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().deleteISOCcyByCcyNmIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().deleteISOCcyByCcyNmIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeISOCcyByCcyNmIdx( Name );
	}
}
