// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

public class YCFBamMimeTypeTableObj
	implements IYCFBamMimeTypeTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFIntMimeTypePKey, IYCFIntMimeTypeObj> members;
	private Map<YCFIntMimeTypePKey, IYCFIntMimeTypeObj> allMimeType;
	private Map< YCFIntMimeTypeByUNameIdxKey,
		IYCFIntMimeTypeObj > indexByUNameIdx;
	public static String TABLE_NAME = "MimeType";
	public static String TABLE_DBNAME = "mimetype";

	public YCFBamMimeTypeTableObj() {
		schema = null;
		members = new HashMap<YCFIntMimeTypePKey, IYCFIntMimeTypeObj>();
		allMimeType = null;
		indexByUNameIdx = null;
	}

	public YCFBamMimeTypeTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFIntMimeTypePKey, IYCFIntMimeTypeObj>();
		allMimeType = null;
		indexByUNameIdx = null;
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
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
		allMimeType = null;
		indexByUNameIdx = null;
		List<IYCFIntMimeTypeObj> toForget = new LinkedList<IYCFIntMimeTypeObj>();
		IYCFIntMimeTypeObj cur = null;
		Iterator<IYCFIntMimeTypeObj> iter = members.values().iterator();
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
	 *	YCFBamMimeTypeObj.
	 */
	public IYCFIntMimeTypeObj newInstance() {
		IYCFIntMimeTypeObj inst = new YCFBamMimeTypeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamMimeTypeObj.
	 */
	public IYCFIntMimeTypeEditObj newEditInstance( IYCFIntMimeTypeObj orig ) {
		IYCFIntMimeTypeEditObj edit = new YCFBamMimeTypeEditObj( orig );
		return( edit );
	}

	public IYCFIntMimeTypeObj realiseMimeType( IYCFIntMimeTypeObj Obj ) {
		IYCFIntMimeTypeObj obj = Obj;
		YCFIntMimeTypePKey pkey = obj.getPKey();
		IYCFIntMimeTypeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntMimeTypeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFIntMimeTypeByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newUNameIdxKey();
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				YCFIntMimeTypeByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newUNameIdxKey();
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allMimeType != null ) {
				allMimeType.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allMimeType != null ) {
				allMimeType.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				YCFIntMimeTypeByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newUNameIdxKey();
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntMimeTypeObj createMimeType( IYCFIntMimeTypeObj Obj ) {
		IYCFIntMimeTypeObj obj = Obj;
		YCFIntMimeTypeBuff buff = obj.getMimeTypeBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().createMimeType(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntMimeTypeObj readMimeType( YCFIntMimeTypePKey pkey ) {
		return( readMimeType( pkey, false ) );
	}

	public IYCFIntMimeTypeObj readMimeType( YCFIntMimeTypePKey pkey, boolean forceRead ) {
		IYCFIntMimeTypeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntMimeTypeBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredMimeTypeId() );
			if( readBuff != null ) {
				obj = schema.getMimeTypeTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntMimeTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntMimeTypeObj readCachedMimeType( YCFIntMimeTypePKey pkey ) {
		IYCFIntMimeTypeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeMimeType( IYCFIntMimeTypeObj obj )
	{
		final String S_ProcName = "YCFBamMimeTypeTableObj.reallyDeepDisposeMimeType() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntMimeTypePKey pkey = obj.getPKey();
		IYCFIntMimeTypeObj existing = readCachedMimeType( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntMimeTypeByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newUNameIdxKey();
		keyUNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeMimeType( YCFIntMimeTypePKey pkey ) {
		IYCFIntMimeTypeObj obj = readCachedMimeType( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntMimeTypeObj lockMimeType( YCFIntMimeTypePKey pkey ) {
		IYCFIntMimeTypeObj locked = null;
		YCFIntMimeTypeBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getMimeTypeTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntMimeTypeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockMimeType", pkey );
		}
		return( locked );
	}

	public List<IYCFIntMimeTypeObj> readAllMimeType() {
		return( readAllMimeType( false ) );
	}

	public List<IYCFIntMimeTypeObj> readAllMimeType( boolean forceRead ) {
		final String S_ProcName = "readAllMimeType";
		if( ( allMimeType == null ) || forceRead ) {
			Map<YCFIntMimeTypePKey, IYCFIntMimeTypeObj> map = new HashMap<YCFIntMimeTypePKey,IYCFIntMimeTypeObj>();
			allMimeType = map;
			YCFIntMimeTypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().readAllDerived( schema.getAuthorization() );
			YCFIntMimeTypeBuff buff;
			IYCFIntMimeTypeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey() );
				obj.setBuff( buff );
				IYCFIntMimeTypeObj realised = (IYCFIntMimeTypeObj)obj.realise();
			}
		}
		int len = allMimeType.size();
		IYCFIntMimeTypeObj arr[] = new IYCFIntMimeTypeObj[len];
		Iterator<IYCFIntMimeTypeObj> valIter = allMimeType.values().iterator();
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
		ArrayList<IYCFIntMimeTypeObj> arrayList = new ArrayList<IYCFIntMimeTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntMimeTypeObj> cmp = new Comparator<IYCFIntMimeTypeObj>() {
			public int compare( IYCFIntMimeTypeObj lhs, IYCFIntMimeTypeObj rhs ) {
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
					YCFIntMimeTypePKey lhsPKey = lhs.getPKey();
					YCFIntMimeTypePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntMimeTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntMimeTypeObj> readCachedAllMimeType() {
		final String S_ProcName = "readCachedAllMimeType";
		ArrayList<IYCFIntMimeTypeObj> arrayList = new ArrayList<IYCFIntMimeTypeObj>();
		if( allMimeType != null ) {
			int len = allMimeType.size();
			IYCFIntMimeTypeObj arr[] = new IYCFIntMimeTypeObj[len];
			Iterator<IYCFIntMimeTypeObj> valIter = allMimeType.values().iterator();
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
		Comparator<IYCFIntMimeTypeObj> cmp = new Comparator<IYCFIntMimeTypeObj>() {
			public int compare( IYCFIntMimeTypeObj lhs, IYCFIntMimeTypeObj rhs ) {
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
					YCFIntMimeTypePKey lhsPKey = lhs.getPKey();
					YCFIntMimeTypePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntMimeTypeObj readMimeTypeByIdIdx( int MimeTypeId )
	{
		return( readMimeTypeByIdIdx( MimeTypeId,
			false ) );
	}

	public IYCFIntMimeTypeObj readMimeTypeByIdIdx( int MimeTypeId, boolean forceRead )
	{
		YCFIntMimeTypePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey();
		pkey.setRequiredMimeTypeId( MimeTypeId );
		IYCFIntMimeTypeObj obj = readMimeType( pkey, forceRead );
		return( obj );
	}

	public IYCFIntMimeTypeObj readMimeTypeByUNameIdx( String Name )
	{
		return( readMimeTypeByUNameIdx( Name,
			false ) );
	}

	public IYCFIntMimeTypeObj readMimeTypeByUNameIdx( String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFIntMimeTypeByUNameIdxKey,
				IYCFIntMimeTypeObj >();
		}
		YCFIntMimeTypeByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newUNameIdxKey();
		key.setRequiredName( Name );
		IYCFIntMimeTypeObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFIntMimeTypeBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().readDerivedByUNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getMimeTypeTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntMimeTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntMimeTypeObj readCachedMimeTypeByIdIdx( int MimeTypeId )
	{
		IYCFIntMimeTypeObj obj = null;
		YCFIntMimeTypePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey();
		pkey.setRequiredMimeTypeId( MimeTypeId );
		obj = readCachedMimeType( pkey );
		return( obj );
	}

	public IYCFIntMimeTypeObj readCachedMimeTypeByUNameIdx( String Name )
	{
		IYCFIntMimeTypeObj obj = null;
		YCFIntMimeTypeByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newUNameIdxKey();
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntMimeTypeObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntMimeTypeObj> valIter = members.values().iterator();
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

	public void deepDisposeMimeTypeByIdIdx( int MimeTypeId )
	{
		IYCFIntMimeTypeObj obj = readCachedMimeTypeByIdIdx( MimeTypeId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeMimeTypeByUNameIdx( String Name )
	{
		IYCFIntMimeTypeObj obj = readCachedMimeTypeByUNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntMimeTypeObj updateMimeType( IYCFIntMimeTypeObj Obj ) {
		IYCFIntMimeTypeObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().updateMimeType( schema.getAuthorization(),
			Obj.getMimeTypeBuff() );
		obj = (IYCFIntMimeTypeObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteMimeType( IYCFIntMimeTypeObj Obj ) {
		IYCFIntMimeTypeObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().deleteMimeType( schema.getAuthorization(),
			obj.getMimeTypeBuff() );
		Obj.forget();
	}

	public void deleteMimeTypeByIdIdx( int MimeTypeId )
	{
		YCFIntMimeTypePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey();
		pkey.setRequiredMimeTypeId( MimeTypeId );
		IYCFIntMimeTypeObj obj = readMimeType( pkey );
		if( obj != null ) {
			IYCFIntMimeTypeEditObj editObj = (IYCFIntMimeTypeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntMimeTypeEditObj)obj.beginEdit();
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
		deepDisposeMimeTypeByIdIdx( MimeTypeId );
	}

	public void deleteMimeTypeByUNameIdx( String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFIntMimeTypeByUNameIdxKey,
				IYCFIntMimeTypeObj >();
		}
		YCFIntMimeTypeByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryMimeType().newUNameIdxKey();
		key.setRequiredName( Name );
		IYCFIntMimeTypeObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().deleteMimeTypeByUNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableMimeType().deleteMimeTypeByUNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeMimeTypeByUNameIdx( Name );
	}
}
