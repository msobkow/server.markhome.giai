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

public class YCFIntLicenseTableObj
	implements IYCFIntLicenseTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFIntLicensePKey, IYCFIntLicenseObj> members;
	private Map<YCFIntLicensePKey, IYCFIntLicenseObj> allLicense;
	private Map< YCFIntLicenseByLicnTenantIdxKey,
		Map<YCFIntLicensePKey, IYCFIntLicenseObj > > indexByLicnTenantIdx;
	private Map< YCFIntLicenseByDomainIdxKey,
		Map<YCFIntLicensePKey, IYCFIntLicenseObj > > indexByDomainIdx;
	private Map< YCFIntLicenseByUNameIdxKey,
		IYCFIntLicenseObj > indexByUNameIdx;
	public static String TABLE_NAME = "License";
	public static String TABLE_DBNAME = "licn";

	public YCFIntLicenseTableObj() {
		schema = null;
		members = new HashMap<YCFIntLicensePKey, IYCFIntLicenseObj>();
		allLicense = null;
		indexByLicnTenantIdx = null;
		indexByDomainIdx = null;
		indexByUNameIdx = null;
	}

	public YCFIntLicenseTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFIntLicensePKey, IYCFIntLicenseObj>();
		allLicense = null;
		indexByLicnTenantIdx = null;
		indexByDomainIdx = null;
		indexByUNameIdx = null;
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
		allLicense = null;
		indexByLicnTenantIdx = null;
		indexByDomainIdx = null;
		indexByUNameIdx = null;
		List<IYCFIntLicenseObj> toForget = new LinkedList<IYCFIntLicenseObj>();
		IYCFIntLicenseObj cur = null;
		Iterator<IYCFIntLicenseObj> iter = members.values().iterator();
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
	 *	YCFIntLicenseObj.
	 */
	public IYCFIntLicenseObj newInstance() {
		IYCFIntLicenseObj inst = new YCFIntLicenseObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntLicenseObj.
	 */
	public IYCFIntLicenseEditObj newEditInstance( IYCFIntLicenseObj orig ) {
		IYCFIntLicenseEditObj edit = new YCFIntLicenseEditObj( orig );
		return( edit );
	}

	public IYCFIntLicenseObj realiseLicense( IYCFIntLicenseObj Obj ) {
		IYCFIntLicenseObj obj = Obj;
		YCFIntLicensePKey pkey = obj.getPKey();
		IYCFIntLicenseObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntLicenseObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByLicnTenantIdx != null ) {
				YCFIntLicenseByLicnTenantIdxKey keyLicnTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newLicnTenantIdxKey();
				keyLicnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntLicensePKey, IYCFIntLicenseObj > mapLicnTenantIdx = indexByLicnTenantIdx.get( keyLicnTenantIdx );
				if( mapLicnTenantIdx != null ) {
					mapLicnTenantIdx.remove( keepObj.getPKey() );
					if( mapLicnTenantIdx.size() <= 0 ) {
						indexByLicnTenantIdx.remove( keyLicnTenantIdx );
					}
				}
			}

			if( indexByDomainIdx != null ) {
				YCFIntLicenseByDomainIdxKey keyDomainIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newDomainIdxKey();
				keyDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<YCFIntLicensePKey, IYCFIntLicenseObj > mapDomainIdx = indexByDomainIdx.get( keyDomainIdx );
				if( mapDomainIdx != null ) {
					mapDomainIdx.remove( keepObj.getPKey() );
					if( mapDomainIdx.size() <= 0 ) {
						indexByDomainIdx.remove( keyDomainIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFIntLicenseByUNameIdxKey keyUNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByLicnTenantIdx != null ) {
				YCFIntLicenseByLicnTenantIdxKey keyLicnTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newLicnTenantIdxKey();
				keyLicnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntLicensePKey, IYCFIntLicenseObj > mapLicnTenantIdx = indexByLicnTenantIdx.get( keyLicnTenantIdx );
				if( mapLicnTenantIdx != null ) {
					mapLicnTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDomainIdx != null ) {
				YCFIntLicenseByDomainIdxKey keyDomainIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newDomainIdxKey();
				keyDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<YCFIntLicensePKey, IYCFIntLicenseObj > mapDomainIdx = indexByDomainIdx.get( keyDomainIdx );
				if( mapDomainIdx != null ) {
					mapDomainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFIntLicenseByUNameIdxKey keyUNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allLicense != null ) {
				allLicense.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allLicense != null ) {
				allLicense.put( keepObj.getPKey(), keepObj );
			}

			if( indexByLicnTenantIdx != null ) {
				YCFIntLicenseByLicnTenantIdxKey keyLicnTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newLicnTenantIdxKey();
				keyLicnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntLicensePKey, IYCFIntLicenseObj > mapLicnTenantIdx = indexByLicnTenantIdx.get( keyLicnTenantIdx );
				if( mapLicnTenantIdx != null ) {
					mapLicnTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDomainIdx != null ) {
				YCFIntLicenseByDomainIdxKey keyDomainIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newDomainIdxKey();
				keyDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<YCFIntLicensePKey, IYCFIntLicenseObj > mapDomainIdx = indexByDomainIdx.get( keyDomainIdx );
				if( mapDomainIdx != null ) {
					mapDomainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFIntLicenseByUNameIdxKey keyUNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntLicenseObj createLicense( IYCFIntLicenseObj Obj ) {
		IYCFIntLicenseObj obj = Obj;
		YCFIntLicenseBuff buff = obj.getLicenseBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableLicense().createLicense(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntLicenseObj readLicense( YCFIntLicensePKey pkey ) {
		return( readLicense( pkey, false ) );
	}

	public IYCFIntLicenseObj readLicense( YCFIntLicensePKey pkey, boolean forceRead ) {
		IYCFIntLicenseObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntLicenseBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableLicense().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getLicenseTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntLicenseObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntLicenseObj readCachedLicense( YCFIntLicensePKey pkey ) {
		IYCFIntLicenseObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeLicense( IYCFIntLicenseObj obj )
	{
		final String S_ProcName = "YCFIntLicenseTableObj.reallyDeepDisposeLicense() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntLicensePKey pkey = obj.getPKey();
		IYCFIntLicenseObj existing = readCachedLicense( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntLicenseByLicnTenantIdxKey keyLicnTenantIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newLicnTenantIdxKey();
		keyLicnTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntLicenseByDomainIdxKey keyDomainIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newDomainIdxKey();
		keyDomainIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyDomainIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );

		YCFIntLicenseByUNameIdxKey keyUNameIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByLicnTenantIdx != null ) {
			if( indexByLicnTenantIdx.containsKey( keyLicnTenantIdx ) ) {
				indexByLicnTenantIdx.get( keyLicnTenantIdx ).remove( pkey );
				if( indexByLicnTenantIdx.get( keyLicnTenantIdx ).size() <= 0 ) {
					indexByLicnTenantIdx.remove( keyLicnTenantIdx );
				}
			}
		}

		if( indexByDomainIdx != null ) {
			if( indexByDomainIdx.containsKey( keyDomainIdx ) ) {
				indexByDomainIdx.get( keyDomainIdx ).remove( pkey );
				if( indexByDomainIdx.get( keyDomainIdx ).size() <= 0 ) {
					indexByDomainIdx.remove( keyDomainIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeLicense( YCFIntLicensePKey pkey ) {
		IYCFIntLicenseObj obj = readCachedLicense( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntLicenseObj lockLicense( YCFIntLicensePKey pkey ) {
		IYCFIntLicenseObj locked = null;
		YCFIntLicenseBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableLicense().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getLicenseTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntLicenseObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockLicense", pkey );
		}
		return( locked );
	}

	public List<IYCFIntLicenseObj> readAllLicense() {
		return( readAllLicense( false ) );
	}

	public List<IYCFIntLicenseObj> readAllLicense( boolean forceRead ) {
		final String S_ProcName = "readAllLicense";
		if( ( allLicense == null ) || forceRead ) {
			Map<YCFIntLicensePKey, IYCFIntLicenseObj> map = new HashMap<YCFIntLicensePKey,IYCFIntLicenseObj>();
			allLicense = map;
			YCFIntLicenseBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableLicense().readAllDerived( schema.getAuthorization() );
			YCFIntLicenseBuff buff;
			IYCFIntLicenseObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey() );
				obj.setBuff( buff );
				IYCFIntLicenseObj realised = (IYCFIntLicenseObj)obj.realise();
			}
		}
		int len = allLicense.size();
		IYCFIntLicenseObj arr[] = new IYCFIntLicenseObj[len];
		Iterator<IYCFIntLicenseObj> valIter = allLicense.values().iterator();
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
		ArrayList<IYCFIntLicenseObj> arrayList = new ArrayList<IYCFIntLicenseObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntLicenseObj> cmp = new Comparator<IYCFIntLicenseObj>() {
			public int compare( IYCFIntLicenseObj lhs, IYCFIntLicenseObj rhs ) {
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
					YCFIntLicensePKey lhsPKey = lhs.getPKey();
					YCFIntLicensePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntLicenseObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntLicenseObj> readCachedAllLicense() {
		final String S_ProcName = "readCachedAllLicense";
		ArrayList<IYCFIntLicenseObj> arrayList = new ArrayList<IYCFIntLicenseObj>();
		if( allLicense != null ) {
			int len = allLicense.size();
			IYCFIntLicenseObj arr[] = new IYCFIntLicenseObj[len];
			Iterator<IYCFIntLicenseObj> valIter = allLicense.values().iterator();
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
		Comparator<IYCFIntLicenseObj> cmp = new Comparator<IYCFIntLicenseObj>() {
			public int compare( IYCFIntLicenseObj lhs, IYCFIntLicenseObj rhs ) {
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
					YCFIntLicensePKey lhsPKey = lhs.getPKey();
					YCFIntLicensePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntLicenseObj readLicenseByIdIdx( long TenantId,
		long Id )
	{
		return( readLicenseByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFIntLicenseObj readLicenseByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFIntLicensePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntLicenseObj obj = readLicense( pkey, forceRead );
		return( obj );
	}

	public List<IYCFIntLicenseObj> readLicenseByLicnTenantIdx( long TenantId )
	{
		return( readLicenseByLicnTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFIntLicenseObj> readLicenseByLicnTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readLicenseByLicnTenantIdx";
		YCFIntLicenseByLicnTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newLicnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFIntLicensePKey, IYCFIntLicenseObj> dict;
		if( indexByLicnTenantIdx == null ) {
			indexByLicnTenantIdx = new HashMap< YCFIntLicenseByLicnTenantIdxKey,
				Map< YCFIntLicensePKey, IYCFIntLicenseObj > >();
		}
		if( ( ! forceRead ) && indexByLicnTenantIdx.containsKey( key ) ) {
			dict = indexByLicnTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntLicensePKey, IYCFIntLicenseObj>();
			IYCFIntLicenseObj obj;
			YCFIntLicenseBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableLicense().readDerivedByLicnTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFIntLicenseBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getLicenseTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey() );
				obj.setBuff( buff );
				IYCFIntLicenseObj realised = (IYCFIntLicenseObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLicnTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntLicenseObj arr[] = new IYCFIntLicenseObj[len];
		Iterator<IYCFIntLicenseObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntLicenseObj> arrayList = new ArrayList<IYCFIntLicenseObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntLicenseObj> cmp = new Comparator<IYCFIntLicenseObj>() {
			public int compare( IYCFIntLicenseObj lhs, IYCFIntLicenseObj rhs ) {
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
					YCFIntLicensePKey lhsPKey = lhs.getPKey();
					YCFIntLicensePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntLicenseObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntLicenseObj> readLicenseByDomainIdx( long TenantId,
		long TopDomainId )
	{
		return( readLicenseByDomainIdx( TenantId,
			TopDomainId,
			false ) );
	}

	public List<IYCFIntLicenseObj> readLicenseByDomainIdx( long TenantId,
		long TopDomainId,
		boolean forceRead )
	{
		final String S_ProcName = "readLicenseByDomainIdx";
		YCFIntLicenseByDomainIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		Map<YCFIntLicensePKey, IYCFIntLicenseObj> dict;
		if( indexByDomainIdx == null ) {
			indexByDomainIdx = new HashMap< YCFIntLicenseByDomainIdxKey,
				Map< YCFIntLicensePKey, IYCFIntLicenseObj > >();
		}
		if( ( ! forceRead ) && indexByDomainIdx.containsKey( key ) ) {
			dict = indexByDomainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntLicensePKey, IYCFIntLicenseObj>();
			IYCFIntLicenseObj obj;
			YCFIntLicenseBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableLicense().readDerivedByDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
			YCFIntLicenseBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getLicenseTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey() );
				obj.setBuff( buff );
				IYCFIntLicenseObj realised = (IYCFIntLicenseObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDomainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntLicenseObj arr[] = new IYCFIntLicenseObj[len];
		Iterator<IYCFIntLicenseObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntLicenseObj> arrayList = new ArrayList<IYCFIntLicenseObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntLicenseObj> cmp = new Comparator<IYCFIntLicenseObj>() {
			public int compare( IYCFIntLicenseObj lhs, IYCFIntLicenseObj rhs ) {
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
					YCFIntLicensePKey lhsPKey = lhs.getPKey();
					YCFIntLicensePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntLicenseObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntLicenseObj readLicenseByUNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		return( readLicenseByUNameIdx( TenantId,
			TopDomainId,
			Name,
			false ) );
	}

	public IYCFIntLicenseObj readLicenseByUNameIdx( long TenantId,
		long TopDomainId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFIntLicenseByUNameIdxKey,
				IYCFIntLicenseObj >();
		}
		YCFIntLicenseByUNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		IYCFIntLicenseObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFIntLicenseBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableLicense().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
			if( buff != null ) {
				obj = schema.getLicenseTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntLicenseObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntLicenseObj readCachedLicenseByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntLicenseObj obj = null;
		YCFIntLicensePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedLicense( pkey );
		return( obj );
	}

	public List<IYCFIntLicenseObj> readCachedLicenseByLicnTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedLicenseByLicnTenantIdx";
		YCFIntLicenseByLicnTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newLicnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFIntLicenseObj> arrayList = new ArrayList<IYCFIntLicenseObj>();
		if( indexByLicnTenantIdx != null ) {
			Map<YCFIntLicensePKey, IYCFIntLicenseObj> dict;
			if( indexByLicnTenantIdx.containsKey( key ) ) {
				dict = indexByLicnTenantIdx.get( key );
				int len = dict.size();
				IYCFIntLicenseObj arr[] = new IYCFIntLicenseObj[len];
				Iterator<IYCFIntLicenseObj> valIter = dict.values().iterator();
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
			IYCFIntLicenseObj obj;
			Iterator<IYCFIntLicenseObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntLicenseObj> cmp = new Comparator<IYCFIntLicenseObj>() {
			public int compare( IYCFIntLicenseObj lhs, IYCFIntLicenseObj rhs ) {
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
					YCFIntLicensePKey lhsPKey = lhs.getPKey();
					YCFIntLicensePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFIntLicenseObj> readCachedLicenseByDomainIdx( long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "readCachedLicenseByDomainIdx";
		YCFIntLicenseByDomainIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		ArrayList<IYCFIntLicenseObj> arrayList = new ArrayList<IYCFIntLicenseObj>();
		if( indexByDomainIdx != null ) {
			Map<YCFIntLicensePKey, IYCFIntLicenseObj> dict;
			if( indexByDomainIdx.containsKey( key ) ) {
				dict = indexByDomainIdx.get( key );
				int len = dict.size();
				IYCFIntLicenseObj arr[] = new IYCFIntLicenseObj[len];
				Iterator<IYCFIntLicenseObj> valIter = dict.values().iterator();
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
			IYCFIntLicenseObj obj;
			Iterator<IYCFIntLicenseObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntLicenseObj> cmp = new Comparator<IYCFIntLicenseObj>() {
			public int compare( IYCFIntLicenseObj lhs, IYCFIntLicenseObj rhs ) {
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
					YCFIntLicensePKey lhsPKey = lhs.getPKey();
					YCFIntLicensePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntLicenseObj readCachedLicenseByUNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		IYCFIntLicenseObj obj = null;
		YCFIntLicenseByUNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntLicenseObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntLicenseObj> valIter = members.values().iterator();
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

	public void deepDisposeLicenseByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntLicenseObj obj = readCachedLicenseByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeLicenseByLicnTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeLicenseByLicnTenantIdx";
		IYCFIntLicenseObj obj;
		List<IYCFIntLicenseObj> arrayList = readCachedLicenseByLicnTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFIntLicenseObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeLicenseByDomainIdx( long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "deepDisposeLicenseByDomainIdx";
		IYCFIntLicenseObj obj;
		List<IYCFIntLicenseObj> arrayList = readCachedLicenseByDomainIdx( TenantId,
				TopDomainId );
		if( arrayList != null )  {
			Iterator<IYCFIntLicenseObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeLicenseByUNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		IYCFIntLicenseObj obj = readCachedLicenseByUNameIdx( TenantId,
				TopDomainId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntLicenseObj updateLicense( IYCFIntLicenseObj Obj ) {
		IYCFIntLicenseObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableLicense().updateLicense( schema.getAuthorization(),
			Obj.getLicenseBuff() );
		obj = (IYCFIntLicenseObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteLicense( IYCFIntLicenseObj Obj ) {
		IYCFIntLicenseObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableLicense().deleteLicense( schema.getAuthorization(),
			obj.getLicenseBuff() );
		Obj.forget();
	}

	public void deleteLicenseByIdIdx( long TenantId,
		long Id )
	{
		YCFIntLicensePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntLicenseObj obj = readLicense( pkey );
		if( obj != null ) {
			IYCFIntLicenseEditObj editObj = (IYCFIntLicenseEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntLicenseEditObj)obj.beginEdit();
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
		deepDisposeLicenseByIdIdx( TenantId,
				Id );
	}

	public void deleteLicenseByLicnTenantIdx( long TenantId )
	{
		YCFIntLicenseByLicnTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newLicnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByLicnTenantIdx == null ) {
			indexByLicnTenantIdx = new HashMap< YCFIntLicenseByLicnTenantIdxKey,
				Map< YCFIntLicensePKey, IYCFIntLicenseObj > >();
		}
		if( indexByLicnTenantIdx.containsKey( key ) ) {
			Map<YCFIntLicensePKey, IYCFIntLicenseObj> dict = indexByLicnTenantIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableLicense().deleteLicenseByLicnTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFIntLicenseObj> iter = dict.values().iterator();
			IYCFIntLicenseObj obj;
			List<IYCFIntLicenseObj> toForget = new LinkedList<IYCFIntLicenseObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLicnTenantIdx.remove( key );
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableLicense().deleteLicenseByLicnTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeLicenseByLicnTenantIdx( TenantId );
	}

	public void deleteLicenseByDomainIdx( long TenantId,
		long TopDomainId )
	{
		YCFIntLicenseByDomainIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		if( indexByDomainIdx == null ) {
			indexByDomainIdx = new HashMap< YCFIntLicenseByDomainIdxKey,
				Map< YCFIntLicensePKey, IYCFIntLicenseObj > >();
		}
		if( indexByDomainIdx.containsKey( key ) ) {
			Map<YCFIntLicensePKey, IYCFIntLicenseObj> dict = indexByDomainIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableLicense().deleteLicenseByDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
			Iterator<IYCFIntLicenseObj> iter = dict.values().iterator();
			IYCFIntLicenseObj obj;
			List<IYCFIntLicenseObj> toForget = new LinkedList<IYCFIntLicenseObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDomainIdx.remove( key );
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableLicense().deleteLicenseByDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
		}
		deepDisposeLicenseByDomainIdx( TenantId,
				TopDomainId );
	}

	public void deleteLicenseByUNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFIntLicenseByUNameIdxKey,
				IYCFIntLicenseObj >();
		}
		YCFIntLicenseByUNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryLicense().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		IYCFIntLicenseObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableLicense().deleteLicenseByUNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableLicense().deleteLicenseByUNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
		}
		deepDisposeLicenseByUNameIdx( TenantId,
				TopDomainId,
				Name );
	}
}
