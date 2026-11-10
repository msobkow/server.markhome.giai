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

public class YCFBamURLProtocolTableObj
	implements IYCFBamURLProtocolTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj> members;
	private Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj> allURLProtocol;
	private Map< YCFIntURLProtocolByUNameIdxKey,
		IYCFIntURLProtocolObj > indexByUNameIdx;
	private Map< YCFIntURLProtocolByIsSecureIdxKey,
		Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj > > indexByIsSecureIdx;
	public static String TABLE_NAME = "URLProtocol";
	public static String TABLE_DBNAME = "urlproto";

	public YCFBamURLProtocolTableObj() {
		schema = null;
		members = new HashMap<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj>();
		allURLProtocol = null;
		indexByUNameIdx = null;
		indexByIsSecureIdx = null;
	}

	public YCFBamURLProtocolTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj>();
		allURLProtocol = null;
		indexByUNameIdx = null;
		indexByIsSecureIdx = null;
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
		allURLProtocol = null;
		indexByUNameIdx = null;
		indexByIsSecureIdx = null;
		List<IYCFIntURLProtocolObj> toForget = new LinkedList<IYCFIntURLProtocolObj>();
		IYCFIntURLProtocolObj cur = null;
		Iterator<IYCFIntURLProtocolObj> iter = members.values().iterator();
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
	 *	YCFBamURLProtocolObj.
	 */
	public IYCFIntURLProtocolObj newInstance() {
		IYCFIntURLProtocolObj inst = new YCFBamURLProtocolObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamURLProtocolObj.
	 */
	public IYCFIntURLProtocolEditObj newEditInstance( IYCFIntURLProtocolObj orig ) {
		IYCFIntURLProtocolEditObj edit = new YCFBamURLProtocolEditObj( orig );
		return( edit );
	}

	public IYCFIntURLProtocolObj realiseURLProtocol( IYCFIntURLProtocolObj Obj ) {
		IYCFIntURLProtocolObj obj = Obj;
		YCFIntURLProtocolPKey pkey = obj.getPKey();
		IYCFIntURLProtocolObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntURLProtocolObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFIntURLProtocolByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newUNameIdxKey();
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByIsSecureIdx != null ) {
				YCFIntURLProtocolByIsSecureIdxKey keyIsSecureIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newIsSecureIdxKey();
				keyIsSecureIdx.setRequiredIsSecure( keepObj.getRequiredIsSecure() );
				Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj > mapIsSecureIdx = indexByIsSecureIdx.get( keyIsSecureIdx );
				if( mapIsSecureIdx != null ) {
					mapIsSecureIdx.remove( keepObj.getPKey() );
					if( mapIsSecureIdx.size() <= 0 ) {
						indexByIsSecureIdx.remove( keyIsSecureIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				YCFIntURLProtocolByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newUNameIdxKey();
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIsSecureIdx != null ) {
				YCFIntURLProtocolByIsSecureIdxKey keyIsSecureIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newIsSecureIdxKey();
				keyIsSecureIdx.setRequiredIsSecure( keepObj.getRequiredIsSecure() );
				Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj > mapIsSecureIdx = indexByIsSecureIdx.get( keyIsSecureIdx );
				if( mapIsSecureIdx != null ) {
					mapIsSecureIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allURLProtocol != null ) {
				allURLProtocol.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allURLProtocol != null ) {
				allURLProtocol.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				YCFIntURLProtocolByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newUNameIdxKey();
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIsSecureIdx != null ) {
				YCFIntURLProtocolByIsSecureIdxKey keyIsSecureIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newIsSecureIdxKey();
				keyIsSecureIdx.setRequiredIsSecure( keepObj.getRequiredIsSecure() );
				Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj > mapIsSecureIdx = indexByIsSecureIdx.get( keyIsSecureIdx );
				if( mapIsSecureIdx != null ) {
					mapIsSecureIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFIntURLProtocolObj createURLProtocol( IYCFIntURLProtocolObj Obj ) {
		IYCFIntURLProtocolObj obj = Obj;
		YCFIntURLProtocolBuff buff = obj.getURLProtocolBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().createURLProtocol(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntURLProtocolObj readURLProtocol( YCFIntURLProtocolPKey pkey ) {
		return( readURLProtocol( pkey, false ) );
	}

	public IYCFIntURLProtocolObj readURLProtocol( YCFIntURLProtocolPKey pkey, boolean forceRead ) {
		IYCFIntURLProtocolObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntURLProtocolBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredURLProtocolId() );
			if( readBuff != null ) {
				obj = schema.getURLProtocolTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntURLProtocolObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntURLProtocolObj readCachedURLProtocol( YCFIntURLProtocolPKey pkey ) {
		IYCFIntURLProtocolObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeURLProtocol( IYCFIntURLProtocolObj obj )
	{
		final String S_ProcName = "YCFBamURLProtocolTableObj.reallyDeepDisposeURLProtocol() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntURLProtocolPKey pkey = obj.getPKey();
		IYCFIntURLProtocolObj existing = readCachedURLProtocol( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntURLProtocolByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newUNameIdxKey();
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntURLProtocolByIsSecureIdxKey keyIsSecureIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newIsSecureIdxKey();
		keyIsSecureIdx.setRequiredIsSecure( existing.getRequiredIsSecure() );



		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByIsSecureIdx != null ) {
			if( indexByIsSecureIdx.containsKey( keyIsSecureIdx ) ) {
				indexByIsSecureIdx.get( keyIsSecureIdx ).remove( pkey );
				if( indexByIsSecureIdx.get( keyIsSecureIdx ).size() <= 0 ) {
					indexByIsSecureIdx.remove( keyIsSecureIdx );
				}
			}
		}


	}
	public void deepDisposeURLProtocol( YCFIntURLProtocolPKey pkey ) {
		IYCFIntURLProtocolObj obj = readCachedURLProtocol( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntURLProtocolObj lockURLProtocol( YCFIntURLProtocolPKey pkey ) {
		IYCFIntURLProtocolObj locked = null;
		YCFIntURLProtocolBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getURLProtocolTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntURLProtocolObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockURLProtocol", pkey );
		}
		return( locked );
	}

	public List<IYCFIntURLProtocolObj> readAllURLProtocol() {
		return( readAllURLProtocol( false ) );
	}

	public List<IYCFIntURLProtocolObj> readAllURLProtocol( boolean forceRead ) {
		final String S_ProcName = "readAllURLProtocol";
		if( ( allURLProtocol == null ) || forceRead ) {
			Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj> map = new HashMap<YCFIntURLProtocolPKey,IYCFIntURLProtocolObj>();
			allURLProtocol = map;
			YCFIntURLProtocolBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().readAllDerived( schema.getAuthorization() );
			YCFIntURLProtocolBuff buff;
			IYCFIntURLProtocolObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey() );
				obj.setBuff( buff );
				IYCFIntURLProtocolObj realised = (IYCFIntURLProtocolObj)obj.realise();
			}
		}
		int len = allURLProtocol.size();
		IYCFIntURLProtocolObj arr[] = new IYCFIntURLProtocolObj[len];
		Iterator<IYCFIntURLProtocolObj> valIter = allURLProtocol.values().iterator();
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
		ArrayList<IYCFIntURLProtocolObj> arrayList = new ArrayList<IYCFIntURLProtocolObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntURLProtocolObj> cmp = new Comparator<IYCFIntURLProtocolObj>() {
			public int compare( IYCFIntURLProtocolObj lhs, IYCFIntURLProtocolObj rhs ) {
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
					YCFIntURLProtocolPKey lhsPKey = lhs.getPKey();
					YCFIntURLProtocolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntURLProtocolObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntURLProtocolObj> readCachedAllURLProtocol() {
		final String S_ProcName = "readCachedAllURLProtocol";
		ArrayList<IYCFIntURLProtocolObj> arrayList = new ArrayList<IYCFIntURLProtocolObj>();
		if( allURLProtocol != null ) {
			int len = allURLProtocol.size();
			IYCFIntURLProtocolObj arr[] = new IYCFIntURLProtocolObj[len];
			Iterator<IYCFIntURLProtocolObj> valIter = allURLProtocol.values().iterator();
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
		Comparator<IYCFIntURLProtocolObj> cmp = new Comparator<IYCFIntURLProtocolObj>() {
			public int compare( IYCFIntURLProtocolObj lhs, IYCFIntURLProtocolObj rhs ) {
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
					YCFIntURLProtocolPKey lhsPKey = lhs.getPKey();
					YCFIntURLProtocolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId )
	{
		return( readURLProtocolByIdIdx( URLProtocolId,
			false ) );
	}

	public IYCFIntURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId, boolean forceRead )
	{
		YCFIntURLProtocolPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey();
		pkey.setRequiredURLProtocolId( URLProtocolId );
		IYCFIntURLProtocolObj obj = readURLProtocol( pkey, forceRead );
		return( obj );
	}

	public IYCFIntURLProtocolObj readURLProtocolByUNameIdx( String Name )
	{
		return( readURLProtocolByUNameIdx( Name,
			false ) );
	}

	public IYCFIntURLProtocolObj readURLProtocolByUNameIdx( String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFIntURLProtocolByUNameIdxKey,
				IYCFIntURLProtocolObj >();
		}
		YCFIntURLProtocolByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newUNameIdxKey();
		key.setRequiredName( Name );
		IYCFIntURLProtocolObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFIntURLProtocolBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().readDerivedByUNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getURLProtocolTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntURLProtocolObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFIntURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure )
	{
		return( readURLProtocolByIsSecureIdx( IsSecure,
			false ) );
	}

	public List<IYCFIntURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure,
		boolean forceRead )
	{
		final String S_ProcName = "readURLProtocolByIsSecureIdx";
		YCFIntURLProtocolByIsSecureIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newIsSecureIdxKey();
		key.setRequiredIsSecure( IsSecure );
		Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj> dict;
		if( indexByIsSecureIdx == null ) {
			indexByIsSecureIdx = new HashMap< YCFIntURLProtocolByIsSecureIdxKey,
				Map< YCFIntURLProtocolPKey, IYCFIntURLProtocolObj > >();
		}
		if( ( ! forceRead ) && indexByIsSecureIdx.containsKey( key ) ) {
			dict = indexByIsSecureIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj>();
			IYCFIntURLProtocolObj obj;
			YCFIntURLProtocolBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().readDerivedByIsSecureIdx( schema.getAuthorization(),
				IsSecure );
			YCFIntURLProtocolBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getURLProtocolTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey() );
				obj.setBuff( buff );
				IYCFIntURLProtocolObj realised = (IYCFIntURLProtocolObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIsSecureIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntURLProtocolObj arr[] = new IYCFIntURLProtocolObj[len];
		Iterator<IYCFIntURLProtocolObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntURLProtocolObj> arrayList = new ArrayList<IYCFIntURLProtocolObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntURLProtocolObj> cmp = new Comparator<IYCFIntURLProtocolObj>() {
			public int compare( IYCFIntURLProtocolObj lhs, IYCFIntURLProtocolObj rhs ) {
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
					YCFIntURLProtocolPKey lhsPKey = lhs.getPKey();
					YCFIntURLProtocolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntURLProtocolObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntURLProtocolObj readCachedURLProtocolByIdIdx( int URLProtocolId )
	{
		IYCFIntURLProtocolObj obj = null;
		YCFIntURLProtocolPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey();
		pkey.setRequiredURLProtocolId( URLProtocolId );
		obj = readCachedURLProtocol( pkey );
		return( obj );
	}

	public IYCFIntURLProtocolObj readCachedURLProtocolByUNameIdx( String Name )
	{
		IYCFIntURLProtocolObj obj = null;
		YCFIntURLProtocolByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newUNameIdxKey();
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntURLProtocolObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntURLProtocolObj> valIter = members.values().iterator();
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

	public List<IYCFIntURLProtocolObj> readCachedURLProtocolByIsSecureIdx( boolean IsSecure )
	{
		final String S_ProcName = "readCachedURLProtocolByIsSecureIdx";
		YCFIntURLProtocolByIsSecureIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newIsSecureIdxKey();
		key.setRequiredIsSecure( IsSecure );
		ArrayList<IYCFIntURLProtocolObj> arrayList = new ArrayList<IYCFIntURLProtocolObj>();
		if( indexByIsSecureIdx != null ) {
			Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj> dict;
			if( indexByIsSecureIdx.containsKey( key ) ) {
				dict = indexByIsSecureIdx.get( key );
				int len = dict.size();
				IYCFIntURLProtocolObj arr[] = new IYCFIntURLProtocolObj[len];
				Iterator<IYCFIntURLProtocolObj> valIter = dict.values().iterator();
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
			IYCFIntURLProtocolObj obj;
			Iterator<IYCFIntURLProtocolObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntURLProtocolObj> cmp = new Comparator<IYCFIntURLProtocolObj>() {
			public int compare( IYCFIntURLProtocolObj lhs, IYCFIntURLProtocolObj rhs ) {
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
					YCFIntURLProtocolPKey lhsPKey = lhs.getPKey();
					YCFIntURLProtocolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeURLProtocolByIdIdx( int URLProtocolId )
	{
		IYCFIntURLProtocolObj obj = readCachedURLProtocolByIdIdx( URLProtocolId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeURLProtocolByUNameIdx( String Name )
	{
		IYCFIntURLProtocolObj obj = readCachedURLProtocolByUNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeURLProtocolByIsSecureIdx( boolean IsSecure )
	{
		final String S_ProcName = "deepDisposeURLProtocolByIsSecureIdx";
		IYCFIntURLProtocolObj obj;
		List<IYCFIntURLProtocolObj> arrayList = readCachedURLProtocolByIsSecureIdx( IsSecure );
		if( arrayList != null )  {
			Iterator<IYCFIntURLProtocolObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFIntURLProtocolObj updateURLProtocol( IYCFIntURLProtocolObj Obj ) {
		IYCFIntURLProtocolObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().updateURLProtocol( schema.getAuthorization(),
			Obj.getURLProtocolBuff() );
		obj = (IYCFIntURLProtocolObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteURLProtocol( IYCFIntURLProtocolObj Obj ) {
		IYCFIntURLProtocolObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().deleteURLProtocol( schema.getAuthorization(),
			obj.getURLProtocolBuff() );
		Obj.forget();
	}

	public void deleteURLProtocolByIdIdx( int URLProtocolId )
	{
		YCFIntURLProtocolPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey();
		pkey.setRequiredURLProtocolId( URLProtocolId );
		IYCFIntURLProtocolObj obj = readURLProtocol( pkey );
		if( obj != null ) {
			IYCFIntURLProtocolEditObj editObj = (IYCFIntURLProtocolEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntURLProtocolEditObj)obj.beginEdit();
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
		deepDisposeURLProtocolByIdIdx( URLProtocolId );
	}

	public void deleteURLProtocolByUNameIdx( String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFIntURLProtocolByUNameIdxKey,
				IYCFIntURLProtocolObj >();
		}
		YCFIntURLProtocolByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newUNameIdxKey();
		key.setRequiredName( Name );
		IYCFIntURLProtocolObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().deleteURLProtocolByUNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().deleteURLProtocolByUNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeURLProtocolByUNameIdx( Name );
	}

	public void deleteURLProtocolByIsSecureIdx( boolean IsSecure )
	{
		YCFIntURLProtocolByIsSecureIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newIsSecureIdxKey();
		key.setRequiredIsSecure( IsSecure );
		if( indexByIsSecureIdx == null ) {
			indexByIsSecureIdx = new HashMap< YCFIntURLProtocolByIsSecureIdxKey,
				Map< YCFIntURLProtocolPKey, IYCFIntURLProtocolObj > >();
		}
		if( indexByIsSecureIdx.containsKey( key ) ) {
			Map<YCFIntURLProtocolPKey, IYCFIntURLProtocolObj> dict = indexByIsSecureIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().deleteURLProtocolByIsSecureIdx( schema.getAuthorization(),
				IsSecure );
			Iterator<IYCFIntURLProtocolObj> iter = dict.values().iterator();
			IYCFIntURLProtocolObj obj;
			List<IYCFIntURLProtocolObj> toForget = new LinkedList<IYCFIntURLProtocolObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIsSecureIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().deleteURLProtocolByIsSecureIdx( schema.getAuthorization(),
				IsSecure );
		}
		deepDisposeURLProtocolByIsSecureIdx( IsSecure );
	}
}
