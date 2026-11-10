// Description: Java 11 Table Object implementation for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntTopDomainTableObj
	implements IYCFIntTopDomainTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> members;
	private Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> allTopDomain;
	private Map< YCFIntTopDomainByTenantIdxKey,
		Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > > indexByTenantIdx;
	private Map< YCFIntTopDomainByTldIdxKey,
		Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > > indexByTldIdx;
	private Map< YCFIntTopDomainByNameIdxKey,
		IYCFIntTopDomainObj > indexByNameIdx;
	public static String TABLE_NAME = "TopDomain";
	public static String TABLE_DBNAME = "tdomdef";

	public YCFIntTopDomainTableObj() {
		schema = null;
		members = new HashMap<YCFIntTopDomainPKey, IYCFIntTopDomainObj>();
		allTopDomain = null;
		indexByTenantIdx = null;
		indexByTldIdx = null;
		indexByNameIdx = null;
	}

	public YCFIntTopDomainTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFIntTopDomainPKey, IYCFIntTopDomainObj>();
		allTopDomain = null;
		indexByTenantIdx = null;
		indexByTldIdx = null;
		indexByNameIdx = null;
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = (IYCFIntSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( IYCFIntTenantObj.class );
	}


	public void minimizeMemory() {
		allTopDomain = null;
		indexByTenantIdx = null;
		indexByTldIdx = null;
		indexByNameIdx = null;
		List<IYCFIntTopDomainObj> toForget = new LinkedList<IYCFIntTopDomainObj>();
		IYCFIntTopDomainObj cur = null;
		Iterator<IYCFIntTopDomainObj> iter = members.values().iterator();
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
	 *	YCFIntTopDomainObj.
	 */
	public IYCFIntTopDomainObj newInstance() {
		IYCFIntTopDomainObj inst = new YCFIntTopDomainObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntTopDomainObj.
	 */
	public IYCFIntTopDomainEditObj newEditInstance( IYCFIntTopDomainObj orig ) {
		IYCFIntTopDomainEditObj edit = new YCFIntTopDomainEditObj( orig );
		return( edit );
	}

	public IYCFIntTopDomainObj realiseTopDomain( IYCFIntTopDomainObj Obj ) {
		IYCFIntTopDomainObj obj = Obj;
		YCFIntTopDomainPKey pkey = obj.getPKey();
		IYCFIntTopDomainObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntTopDomainObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFIntTopDomainByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByTldIdx != null ) {
				YCFIntTopDomainByTldIdxKey keyTldIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTldIdxKey();
				keyTldIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTldIdx.setRequiredTldId( keepObj.getRequiredTldId() );
				Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > mapTldIdx = indexByTldIdx.get( keyTldIdx );
				if( mapTldIdx != null ) {
					mapTldIdx.remove( keepObj.getPKey() );
					if( mapTldIdx.size() <= 0 ) {
						indexByTldIdx.remove( keyTldIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTopDomainByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTldId( keepObj.getRequiredTldId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFIntTopDomainByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTldIdx != null ) {
				YCFIntTopDomainByTldIdxKey keyTldIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTldIdxKey();
				keyTldIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTldIdx.setRequiredTldId( keepObj.getRequiredTldId() );
				Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > mapTldIdx = indexByTldIdx.get( keyTldIdx );
				if( mapTldIdx != null ) {
					mapTldIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTopDomainByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTldId( keepObj.getRequiredTldId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allTopDomain != null ) {
				allTopDomain.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTopDomain != null ) {
				allTopDomain.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFIntTopDomainByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTldIdx != null ) {
				YCFIntTopDomainByTldIdxKey keyTldIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTldIdxKey();
				keyTldIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTldIdx.setRequiredTldId( keepObj.getRequiredTldId() );
				Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj > mapTldIdx = indexByTldIdx.get( keyTldIdx );
				if( mapTldIdx != null ) {
					mapTldIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTopDomainByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTldId( keepObj.getRequiredTldId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntTopDomainObj createTopDomain( IYCFIntTopDomainObj Obj ) {
		IYCFIntTopDomainObj obj = Obj;
		YCFIntTopDomainBuff buff = obj.getTopDomainBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().createTopDomain(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntTopDomainObj readTopDomain( YCFIntTopDomainPKey pkey ) {
		return( readTopDomain( pkey, false ) );
	}

	public IYCFIntTopDomainObj readTopDomain( YCFIntTopDomainPKey pkey, boolean forceRead ) {
		IYCFIntTopDomainObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntTopDomainBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getTopDomainTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntTopDomainObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntTopDomainObj readCachedTopDomain( YCFIntTopDomainPKey pkey ) {
		IYCFIntTopDomainObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTopDomain( IYCFIntTopDomainObj obj )
	{
		final String S_ProcName = "YCFIntTopDomainTableObj.reallyDeepDisposeTopDomain() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntTopDomainPKey pkey = obj.getPKey();
		IYCFIntTopDomainObj existing = readCachedTopDomain( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntTopDomainByTenantIdxKey keyTenantIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTopDomainByTldIdxKey keyTldIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTldIdxKey();
		keyTldIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTldIdx.setRequiredTldId( existing.getRequiredTldId() );

		YCFIntTopDomainByNameIdxKey keyNameIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredTldId( existing.getRequiredTldId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getTopProjectTableObj().deepDisposeTopProjectByTopDomainIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getLicenseTableObj().deepDisposeLicenseByDomainIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByTldIdx != null ) {
			if( indexByTldIdx.containsKey( keyTldIdx ) ) {
				indexByTldIdx.get( keyTldIdx ).remove( pkey );
				if( indexByTldIdx.get( keyTldIdx ).size() <= 0 ) {
					indexByTldIdx.remove( keyTldIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeTopDomain( YCFIntTopDomainPKey pkey ) {
		IYCFIntTopDomainObj obj = readCachedTopDomain( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntTopDomainObj lockTopDomain( YCFIntTopDomainPKey pkey ) {
		IYCFIntTopDomainObj locked = null;
		YCFIntTopDomainBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTopDomainTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntTopDomainObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTopDomain", pkey );
		}
		return( locked );
	}

	public List<IYCFIntTopDomainObj> readAllTopDomain() {
		return( readAllTopDomain( false ) );
	}

	public List<IYCFIntTopDomainObj> readAllTopDomain( boolean forceRead ) {
		final String S_ProcName = "readAllTopDomain";
		if( ( allTopDomain == null ) || forceRead ) {
			Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> map = new HashMap<YCFIntTopDomainPKey,IYCFIntTopDomainObj>();
			allTopDomain = map;
			YCFIntTopDomainBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().readAllDerived( schema.getAuthorization() );
			YCFIntTopDomainBuff buff;
			IYCFIntTopDomainObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey() );
				obj.setBuff( buff );
				IYCFIntTopDomainObj realised = (IYCFIntTopDomainObj)obj.realise();
			}
		}
		int len = allTopDomain.size();
		IYCFIntTopDomainObj arr[] = new IYCFIntTopDomainObj[len];
		Iterator<IYCFIntTopDomainObj> valIter = allTopDomain.values().iterator();
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
		ArrayList<IYCFIntTopDomainObj> arrayList = new ArrayList<IYCFIntTopDomainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTopDomainObj> cmp = new Comparator<IYCFIntTopDomainObj>() {
			public int compare( IYCFIntTopDomainObj lhs, IYCFIntTopDomainObj rhs ) {
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
					YCFIntTopDomainPKey lhsPKey = lhs.getPKey();
					YCFIntTopDomainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTopDomainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntTopDomainObj> readCachedAllTopDomain() {
		final String S_ProcName = "readCachedAllTopDomain";
		ArrayList<IYCFIntTopDomainObj> arrayList = new ArrayList<IYCFIntTopDomainObj>();
		if( allTopDomain != null ) {
			int len = allTopDomain.size();
			IYCFIntTopDomainObj arr[] = new IYCFIntTopDomainObj[len];
			Iterator<IYCFIntTopDomainObj> valIter = allTopDomain.values().iterator();
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
		Comparator<IYCFIntTopDomainObj> cmp = new Comparator<IYCFIntTopDomainObj>() {
			public int compare( IYCFIntTopDomainObj lhs, IYCFIntTopDomainObj rhs ) {
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
					YCFIntTopDomainPKey lhsPKey = lhs.getPKey();
					YCFIntTopDomainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntTopDomainObj readTopDomainByIdIdx( long TenantId,
		long Id )
	{
		return( readTopDomainByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFIntTopDomainObj readTopDomainByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFIntTopDomainPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntTopDomainObj obj = readTopDomain( pkey, forceRead );
		return( obj );
	}

	public List<IYCFIntTopDomainObj> readTopDomainByTenantIdx( long TenantId )
	{
		return( readTopDomainByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFIntTopDomainObj> readTopDomainByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTopDomainByTenantIdx";
		YCFIntTopDomainByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntTopDomainByTenantIdxKey,
				Map< YCFIntTopDomainPKey, IYCFIntTopDomainObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntTopDomainPKey, IYCFIntTopDomainObj>();
			IYCFIntTopDomainObj obj;
			YCFIntTopDomainBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFIntTopDomainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTopDomainTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey() );
				obj.setBuff( buff );
				IYCFIntTopDomainObj realised = (IYCFIntTopDomainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntTopDomainObj arr[] = new IYCFIntTopDomainObj[len];
		Iterator<IYCFIntTopDomainObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntTopDomainObj> arrayList = new ArrayList<IYCFIntTopDomainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTopDomainObj> cmp = new Comparator<IYCFIntTopDomainObj>() {
			public int compare( IYCFIntTopDomainObj lhs, IYCFIntTopDomainObj rhs ) {
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
					YCFIntTopDomainPKey lhsPKey = lhs.getPKey();
					YCFIntTopDomainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTopDomainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntTopDomainObj> readTopDomainByTldIdx( long TenantId,
		long TldId )
	{
		return( readTopDomainByTldIdx( TenantId,
			TldId,
			false ) );
	}

	public List<IYCFIntTopDomainObj> readTopDomainByTldIdx( long TenantId,
		long TldId,
		boolean forceRead )
	{
		final String S_ProcName = "readTopDomainByTldIdx";
		YCFIntTopDomainByTldIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTldIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );
		Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> dict;
		if( indexByTldIdx == null ) {
			indexByTldIdx = new HashMap< YCFIntTopDomainByTldIdxKey,
				Map< YCFIntTopDomainPKey, IYCFIntTopDomainObj > >();
		}
		if( ( ! forceRead ) && indexByTldIdx.containsKey( key ) ) {
			dict = indexByTldIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntTopDomainPKey, IYCFIntTopDomainObj>();
			IYCFIntTopDomainObj obj;
			YCFIntTopDomainBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().readDerivedByTldIdx( schema.getAuthorization(),
				TenantId,
				TldId );
			YCFIntTopDomainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTopDomainTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey() );
				obj.setBuff( buff );
				IYCFIntTopDomainObj realised = (IYCFIntTopDomainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTldIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntTopDomainObj arr[] = new IYCFIntTopDomainObj[len];
		Iterator<IYCFIntTopDomainObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntTopDomainObj> arrayList = new ArrayList<IYCFIntTopDomainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTopDomainObj> cmp = new Comparator<IYCFIntTopDomainObj>() {
			public int compare( IYCFIntTopDomainObj lhs, IYCFIntTopDomainObj rhs ) {
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
					YCFIntTopDomainPKey lhsPKey = lhs.getPKey();
					YCFIntTopDomainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTopDomainObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntTopDomainObj readTopDomainByNameIdx( long TenantId,
		long TldId,
		String Name )
	{
		return( readTopDomainByNameIdx( TenantId,
			TldId,
			Name,
			false ) );
	}

	public IYCFIntTopDomainObj readTopDomainByNameIdx( long TenantId,
		long TldId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntTopDomainByNameIdxKey,
				IYCFIntTopDomainObj >();
		}
		YCFIntTopDomainByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );
		key.setRequiredName( Name );
		IYCFIntTopDomainObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFIntTopDomainBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				TldId,
				Name );
			if( buff != null ) {
				obj = schema.getTopDomainTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntTopDomainObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntTopDomainObj readCachedTopDomainByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntTopDomainObj obj = null;
		YCFIntTopDomainPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTopDomain( pkey );
		return( obj );
	}

	public List<IYCFIntTopDomainObj> readCachedTopDomainByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTopDomainByTenantIdx";
		YCFIntTopDomainByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFIntTopDomainObj> arrayList = new ArrayList<IYCFIntTopDomainObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFIntTopDomainObj arr[] = new IYCFIntTopDomainObj[len];
				Iterator<IYCFIntTopDomainObj> valIter = dict.values().iterator();
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
			IYCFIntTopDomainObj obj;
			Iterator<IYCFIntTopDomainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntTopDomainObj> cmp = new Comparator<IYCFIntTopDomainObj>() {
			public int compare( IYCFIntTopDomainObj lhs, IYCFIntTopDomainObj rhs ) {
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
					YCFIntTopDomainPKey lhsPKey = lhs.getPKey();
					YCFIntTopDomainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFIntTopDomainObj> readCachedTopDomainByTldIdx( long TenantId,
		long TldId )
	{
		final String S_ProcName = "readCachedTopDomainByTldIdx";
		YCFIntTopDomainByTldIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTldIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );
		ArrayList<IYCFIntTopDomainObj> arrayList = new ArrayList<IYCFIntTopDomainObj>();
		if( indexByTldIdx != null ) {
			Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> dict;
			if( indexByTldIdx.containsKey( key ) ) {
				dict = indexByTldIdx.get( key );
				int len = dict.size();
				IYCFIntTopDomainObj arr[] = new IYCFIntTopDomainObj[len];
				Iterator<IYCFIntTopDomainObj> valIter = dict.values().iterator();
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
			IYCFIntTopDomainObj obj;
			Iterator<IYCFIntTopDomainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntTopDomainObj> cmp = new Comparator<IYCFIntTopDomainObj>() {
			public int compare( IYCFIntTopDomainObj lhs, IYCFIntTopDomainObj rhs ) {
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
					YCFIntTopDomainPKey lhsPKey = lhs.getPKey();
					YCFIntTopDomainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntTopDomainObj readCachedTopDomainByNameIdx( long TenantId,
		long TldId,
		String Name )
	{
		IYCFIntTopDomainObj obj = null;
		YCFIntTopDomainByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntTopDomainObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntTopDomainObj> valIter = members.values().iterator();
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

	public void deepDisposeTopDomainByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntTopDomainObj obj = readCachedTopDomainByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTopDomainByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTopDomainByTenantIdx";
		IYCFIntTopDomainObj obj;
		List<IYCFIntTopDomainObj> arrayList = readCachedTopDomainByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFIntTopDomainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTopDomainByTldIdx( long TenantId,
		long TldId )
	{
		final String S_ProcName = "deepDisposeTopDomainByTldIdx";
		IYCFIntTopDomainObj obj;
		List<IYCFIntTopDomainObj> arrayList = readCachedTopDomainByTldIdx( TenantId,
				TldId );
		if( arrayList != null )  {
			Iterator<IYCFIntTopDomainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTopDomainByNameIdx( long TenantId,
		long TldId,
		String Name )
	{
		IYCFIntTopDomainObj obj = readCachedTopDomainByNameIdx( TenantId,
				TldId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntTopDomainObj updateTopDomain( IYCFIntTopDomainObj Obj ) {
		IYCFIntTopDomainObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().updateTopDomain( schema.getAuthorization(),
			Obj.getTopDomainBuff() );
		obj = (IYCFIntTopDomainObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTopDomain( IYCFIntTopDomainObj Obj ) {
		IYCFIntTopDomainObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().deleteTopDomain( schema.getAuthorization(),
			obj.getTopDomainBuff() );
		Obj.forget();
	}

	public void deleteTopDomainByIdIdx( long TenantId,
		long Id )
	{
		YCFIntTopDomainPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntTopDomainObj obj = readTopDomain( pkey );
		if( obj != null ) {
			IYCFIntTopDomainEditObj editObj = (IYCFIntTopDomainEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntTopDomainEditObj)obj.beginEdit();
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
		deepDisposeTopDomainByIdIdx( TenantId,
				Id );
	}

	public void deleteTopDomainByTenantIdx( long TenantId )
	{
		YCFIntTopDomainByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntTopDomainByTenantIdxKey,
				Map< YCFIntTopDomainPKey, IYCFIntTopDomainObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> dict = indexByTenantIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().deleteTopDomainByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFIntTopDomainObj> iter = dict.values().iterator();
			IYCFIntTopDomainObj obj;
			List<IYCFIntTopDomainObj> toForget = new LinkedList<IYCFIntTopDomainObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().deleteTopDomainByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTopDomainByTenantIdx( TenantId );
	}

	public void deleteTopDomainByTldIdx( long TenantId,
		long TldId )
	{
		YCFIntTopDomainByTldIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newTldIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );
		if( indexByTldIdx == null ) {
			indexByTldIdx = new HashMap< YCFIntTopDomainByTldIdxKey,
				Map< YCFIntTopDomainPKey, IYCFIntTopDomainObj > >();
		}
		if( indexByTldIdx.containsKey( key ) ) {
			Map<YCFIntTopDomainPKey, IYCFIntTopDomainObj> dict = indexByTldIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().deleteTopDomainByTldIdx( schema.getAuthorization(),
				TenantId,
				TldId );
			Iterator<IYCFIntTopDomainObj> iter = dict.values().iterator();
			IYCFIntTopDomainObj obj;
			List<IYCFIntTopDomainObj> toForget = new LinkedList<IYCFIntTopDomainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTldIdx.remove( key );
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().deleteTopDomainByTldIdx( schema.getAuthorization(),
				TenantId,
				TldId );
		}
		deepDisposeTopDomainByTldIdx( TenantId,
				TldId );
	}

	public void deleteTopDomainByNameIdx( long TenantId,
		long TldId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntTopDomainByNameIdxKey,
				IYCFIntTopDomainObj >();
		}
		YCFIntTopDomainByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopDomain().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );
		key.setRequiredName( Name );
		IYCFIntTopDomainObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().deleteTopDomainByNameIdx( schema.getAuthorization(),
				TenantId,
				TldId,
				Name );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableTopDomain().deleteTopDomainByNameIdx( schema.getAuthorization(),
				TenantId,
				TldId,
				Name );
		}
		deepDisposeTopDomainByNameIdx( TenantId,
				TldId,
				Name );
	}
}
