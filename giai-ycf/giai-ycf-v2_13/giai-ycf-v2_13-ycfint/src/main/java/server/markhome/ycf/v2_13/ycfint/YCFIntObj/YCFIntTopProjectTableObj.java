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

public class YCFIntTopProjectTableObj
	implements IYCFIntTopProjectTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> members;
	private Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> allTopProject;
	private Map< YCFIntTopProjectByTenantIdxKey,
		Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > > indexByTenantIdx;
	private Map< YCFIntTopProjectByTopDomainIdxKey,
		Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > > indexByTopDomainIdx;
	private Map< YCFIntTopProjectByNameIdxKey,
		IYCFIntTopProjectObj > indexByNameIdx;
	public static String TABLE_NAME = "TopProject";
	public static String TABLE_DBNAME = "tprjdef";

	public YCFIntTopProjectTableObj() {
		schema = null;
		members = new HashMap<YCFIntTopProjectPKey, IYCFIntTopProjectObj>();
		allTopProject = null;
		indexByTenantIdx = null;
		indexByTopDomainIdx = null;
		indexByNameIdx = null;
	}

	public YCFIntTopProjectTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFIntTopProjectPKey, IYCFIntTopProjectObj>();
		allTopProject = null;
		indexByTenantIdx = null;
		indexByTopDomainIdx = null;
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
		allTopProject = null;
		indexByTenantIdx = null;
		indexByTopDomainIdx = null;
		indexByNameIdx = null;
		List<IYCFIntTopProjectObj> toForget = new LinkedList<IYCFIntTopProjectObj>();
		IYCFIntTopProjectObj cur = null;
		Iterator<IYCFIntTopProjectObj> iter = members.values().iterator();
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
	 *	YCFIntTopProjectObj.
	 */
	public IYCFIntTopProjectObj newInstance() {
		IYCFIntTopProjectObj inst = new YCFIntTopProjectObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntTopProjectObj.
	 */
	public IYCFIntTopProjectEditObj newEditInstance( IYCFIntTopProjectObj orig ) {
		IYCFIntTopProjectEditObj edit = new YCFIntTopProjectEditObj( orig );
		return( edit );
	}

	public IYCFIntTopProjectObj realiseTopProject( IYCFIntTopProjectObj Obj ) {
		IYCFIntTopProjectObj obj = Obj;
		YCFIntTopProjectPKey pkey = obj.getPKey();
		IYCFIntTopProjectObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntTopProjectObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFIntTopProjectByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByTopDomainIdx != null ) {
				YCFIntTopProjectByTopDomainIdxKey keyTopDomainIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
				keyTopDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > mapTopDomainIdx = indexByTopDomainIdx.get( keyTopDomainIdx );
				if( mapTopDomainIdx != null ) {
					mapTopDomainIdx.remove( keepObj.getPKey() );
					if( mapTopDomainIdx.size() <= 0 ) {
						indexByTopDomainIdx.remove( keyTopDomainIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTopProjectByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFIntTopProjectByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTopDomainIdx != null ) {
				YCFIntTopProjectByTopDomainIdxKey keyTopDomainIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
				keyTopDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > mapTopDomainIdx = indexByTopDomainIdx.get( keyTopDomainIdx );
				if( mapTopDomainIdx != null ) {
					mapTopDomainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTopProjectByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allTopProject != null ) {
				allTopProject.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTopProject != null ) {
				allTopProject.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFIntTopProjectByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTopDomainIdx != null ) {
				YCFIntTopProjectByTopDomainIdxKey keyTopDomainIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
				keyTopDomainIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopDomainIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj > mapTopDomainIdx = indexByTopDomainIdx.get( keyTopDomainIdx );
				if( mapTopDomainIdx != null ) {
					mapTopDomainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntTopProjectByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopDomainId( keepObj.getRequiredTopDomainId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntTopProjectObj createTopProject( IYCFIntTopProjectObj Obj ) {
		IYCFIntTopProjectObj obj = Obj;
		YCFIntTopProjectBuff buff = obj.getTopProjectBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().createTopProject(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntTopProjectObj readTopProject( YCFIntTopProjectPKey pkey ) {
		return( readTopProject( pkey, false ) );
	}

	public IYCFIntTopProjectObj readTopProject( YCFIntTopProjectPKey pkey, boolean forceRead ) {
		IYCFIntTopProjectObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntTopProjectBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntTopProjectObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntTopProjectObj readCachedTopProject( YCFIntTopProjectPKey pkey ) {
		IYCFIntTopProjectObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTopProject( IYCFIntTopProjectObj obj )
	{
		final String S_ProcName = "YCFIntTopProjectTableObj.reallyDeepDisposeTopProject() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntTopProjectPKey pkey = obj.getPKey();
		IYCFIntTopProjectObj existing = readCachedTopProject( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntTopProjectByTenantIdxKey keyTenantIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTopProjectByTopDomainIdxKey keyTopDomainIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		keyTopDomainIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTopDomainIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );

		YCFIntTopProjectByNameIdxKey keyNameIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getSubProjectTableObj().deepDisposeSubProjectByTopProjectIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByTopDomainIdx != null ) {
			if( indexByTopDomainIdx.containsKey( keyTopDomainIdx ) ) {
				indexByTopDomainIdx.get( keyTopDomainIdx ).remove( pkey );
				if( indexByTopDomainIdx.get( keyTopDomainIdx ).size() <= 0 ) {
					indexByTopDomainIdx.remove( keyTopDomainIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeTopProject( YCFIntTopProjectPKey pkey ) {
		IYCFIntTopProjectObj obj = readCachedTopProject( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntTopProjectObj lockTopProject( YCFIntTopProjectPKey pkey ) {
		IYCFIntTopProjectObj locked = null;
		YCFIntTopProjectBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTopProjectTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntTopProjectObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTopProject", pkey );
		}
		return( locked );
	}

	public List<IYCFIntTopProjectObj> readAllTopProject() {
		return( readAllTopProject( false ) );
	}

	public List<IYCFIntTopProjectObj> readAllTopProject( boolean forceRead ) {
		final String S_ProcName = "readAllTopProject";
		if( ( allTopProject == null ) || forceRead ) {
			Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> map = new HashMap<YCFIntTopProjectPKey,IYCFIntTopProjectObj>();
			allTopProject = map;
			YCFIntTopProjectBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().readAllDerived( schema.getAuthorization() );
			YCFIntTopProjectBuff buff;
			IYCFIntTopProjectObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				IYCFIntTopProjectObj realised = (IYCFIntTopProjectObj)obj.realise();
			}
		}
		int len = allTopProject.size();
		IYCFIntTopProjectObj arr[] = new IYCFIntTopProjectObj[len];
		Iterator<IYCFIntTopProjectObj> valIter = allTopProject.values().iterator();
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
		ArrayList<IYCFIntTopProjectObj> arrayList = new ArrayList<IYCFIntTopProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTopProjectObj> cmp = new Comparator<IYCFIntTopProjectObj>() {
			public int compare( IYCFIntTopProjectObj lhs, IYCFIntTopProjectObj rhs ) {
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
					YCFIntTopProjectPKey lhsPKey = lhs.getPKey();
					YCFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTopProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntTopProjectObj> readCachedAllTopProject() {
		final String S_ProcName = "readCachedAllTopProject";
		ArrayList<IYCFIntTopProjectObj> arrayList = new ArrayList<IYCFIntTopProjectObj>();
		if( allTopProject != null ) {
			int len = allTopProject.size();
			IYCFIntTopProjectObj arr[] = new IYCFIntTopProjectObj[len];
			Iterator<IYCFIntTopProjectObj> valIter = allTopProject.values().iterator();
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
		Comparator<IYCFIntTopProjectObj> cmp = new Comparator<IYCFIntTopProjectObj>() {
			public int compare( IYCFIntTopProjectObj lhs, IYCFIntTopProjectObj rhs ) {
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
					YCFIntTopProjectPKey lhsPKey = lhs.getPKey();
					YCFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntTopProjectObj readTopProjectByIdIdx( long TenantId,
		long Id )
	{
		return( readTopProjectByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFIntTopProjectObj readTopProjectByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFIntTopProjectPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntTopProjectObj obj = readTopProject( pkey, forceRead );
		return( obj );
	}

	public List<IYCFIntTopProjectObj> readTopProjectByTenantIdx( long TenantId )
	{
		return( readTopProjectByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFIntTopProjectObj> readTopProjectByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTopProjectByTenantIdx";
		YCFIntTopProjectByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntTopProjectByTenantIdxKey,
				Map< YCFIntTopProjectPKey, IYCFIntTopProjectObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntTopProjectPKey, IYCFIntTopProjectObj>();
			IYCFIntTopProjectObj obj;
			YCFIntTopProjectBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFIntTopProjectBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				IYCFIntTopProjectObj realised = (IYCFIntTopProjectObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntTopProjectObj arr[] = new IYCFIntTopProjectObj[len];
		Iterator<IYCFIntTopProjectObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntTopProjectObj> arrayList = new ArrayList<IYCFIntTopProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTopProjectObj> cmp = new Comparator<IYCFIntTopProjectObj>() {
			public int compare( IYCFIntTopProjectObj lhs, IYCFIntTopProjectObj rhs ) {
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
					YCFIntTopProjectPKey lhsPKey = lhs.getPKey();
					YCFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTopProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntTopProjectObj> readTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		return( readTopProjectByTopDomainIdx( TenantId,
			TopDomainId,
			false ) );
	}

	public List<IYCFIntTopProjectObj> readTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId,
		boolean forceRead )
	{
		final String S_ProcName = "readTopProjectByTopDomainIdx";
		YCFIntTopProjectByTopDomainIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> dict;
		if( indexByTopDomainIdx == null ) {
			indexByTopDomainIdx = new HashMap< YCFIntTopProjectByTopDomainIdxKey,
				Map< YCFIntTopProjectPKey, IYCFIntTopProjectObj > >();
		}
		if( ( ! forceRead ) && indexByTopDomainIdx.containsKey( key ) ) {
			dict = indexByTopDomainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntTopProjectPKey, IYCFIntTopProjectObj>();
			IYCFIntTopProjectObj obj;
			YCFIntTopProjectBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().readDerivedByTopDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
			YCFIntTopProjectBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				IYCFIntTopProjectObj realised = (IYCFIntTopProjectObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTopDomainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntTopProjectObj arr[] = new IYCFIntTopProjectObj[len];
		Iterator<IYCFIntTopProjectObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntTopProjectObj> arrayList = new ArrayList<IYCFIntTopProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntTopProjectObj> cmp = new Comparator<IYCFIntTopProjectObj>() {
			public int compare( IYCFIntTopProjectObj lhs, IYCFIntTopProjectObj rhs ) {
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
					YCFIntTopProjectPKey lhsPKey = lhs.getPKey();
					YCFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntTopProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntTopProjectObj readTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		return( readTopProjectByNameIdx( TenantId,
			TopDomainId,
			Name,
			false ) );
	}

	public IYCFIntTopProjectObj readTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntTopProjectByNameIdxKey,
				IYCFIntTopProjectObj >();
		}
		YCFIntTopProjectByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		IYCFIntTopProjectObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFIntTopProjectBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
			if( buff != null ) {
				obj = schema.getTopProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntTopProjectObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntTopProjectObj readCachedTopProjectByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntTopProjectObj obj = null;
		YCFIntTopProjectPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTopProject( pkey );
		return( obj );
	}

	public List<IYCFIntTopProjectObj> readCachedTopProjectByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTopProjectByTenantIdx";
		YCFIntTopProjectByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFIntTopProjectObj> arrayList = new ArrayList<IYCFIntTopProjectObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFIntTopProjectObj arr[] = new IYCFIntTopProjectObj[len];
				Iterator<IYCFIntTopProjectObj> valIter = dict.values().iterator();
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
			IYCFIntTopProjectObj obj;
			Iterator<IYCFIntTopProjectObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntTopProjectObj> cmp = new Comparator<IYCFIntTopProjectObj>() {
			public int compare( IYCFIntTopProjectObj lhs, IYCFIntTopProjectObj rhs ) {
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
					YCFIntTopProjectPKey lhsPKey = lhs.getPKey();
					YCFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFIntTopProjectObj> readCachedTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "readCachedTopProjectByTopDomainIdx";
		YCFIntTopProjectByTopDomainIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		ArrayList<IYCFIntTopProjectObj> arrayList = new ArrayList<IYCFIntTopProjectObj>();
		if( indexByTopDomainIdx != null ) {
			Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> dict;
			if( indexByTopDomainIdx.containsKey( key ) ) {
				dict = indexByTopDomainIdx.get( key );
				int len = dict.size();
				IYCFIntTopProjectObj arr[] = new IYCFIntTopProjectObj[len];
				Iterator<IYCFIntTopProjectObj> valIter = dict.values().iterator();
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
			IYCFIntTopProjectObj obj;
			Iterator<IYCFIntTopProjectObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntTopProjectObj> cmp = new Comparator<IYCFIntTopProjectObj>() {
			public int compare( IYCFIntTopProjectObj lhs, IYCFIntTopProjectObj rhs ) {
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
					YCFIntTopProjectPKey lhsPKey = lhs.getPKey();
					YCFIntTopProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntTopProjectObj readCachedTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		IYCFIntTopProjectObj obj = null;
		YCFIntTopProjectByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntTopProjectObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntTopProjectObj> valIter = members.values().iterator();
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

	public void deepDisposeTopProjectByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntTopProjectObj obj = readCachedTopProjectByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTopProjectByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTopProjectByTenantIdx";
		IYCFIntTopProjectObj obj;
		List<IYCFIntTopProjectObj> arrayList = readCachedTopProjectByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFIntTopProjectObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "deepDisposeTopProjectByTopDomainIdx";
		IYCFIntTopProjectObj obj;
		List<IYCFIntTopProjectObj> arrayList = readCachedTopProjectByTopDomainIdx( TenantId,
				TopDomainId );
		if( arrayList != null )  {
			Iterator<IYCFIntTopProjectObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		IYCFIntTopProjectObj obj = readCachedTopProjectByNameIdx( TenantId,
				TopDomainId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntTopProjectObj updateTopProject( IYCFIntTopProjectObj Obj ) {
		IYCFIntTopProjectObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().updateTopProject( schema.getAuthorization(),
			Obj.getTopProjectBuff() );
		obj = (IYCFIntTopProjectObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTopProject( IYCFIntTopProjectObj Obj ) {
		IYCFIntTopProjectObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().deleteTopProject( schema.getAuthorization(),
			obj.getTopProjectBuff() );
		Obj.forget();
	}

	public void deleteTopProjectByIdIdx( long TenantId,
		long Id )
	{
		YCFIntTopProjectPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntTopProjectObj obj = readTopProject( pkey );
		if( obj != null ) {
			IYCFIntTopProjectEditObj editObj = (IYCFIntTopProjectEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntTopProjectEditObj)obj.beginEdit();
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
		deepDisposeTopProjectByIdIdx( TenantId,
				Id );
	}

	public void deleteTopProjectByTenantIdx( long TenantId )
	{
		YCFIntTopProjectByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntTopProjectByTenantIdxKey,
				Map< YCFIntTopProjectPKey, IYCFIntTopProjectObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> dict = indexByTenantIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFIntTopProjectObj> iter = dict.values().iterator();
			IYCFIntTopProjectObj obj;
			List<IYCFIntTopProjectObj> toForget = new LinkedList<IYCFIntTopProjectObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTopProjectByTenantIdx( TenantId );
	}

	public void deleteTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId )
	{
		YCFIntTopProjectByTopDomainIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		if( indexByTopDomainIdx == null ) {
			indexByTopDomainIdx = new HashMap< YCFIntTopProjectByTopDomainIdxKey,
				Map< YCFIntTopProjectPKey, IYCFIntTopProjectObj > >();
		}
		if( indexByTopDomainIdx.containsKey( key ) ) {
			Map<YCFIntTopProjectPKey, IYCFIntTopProjectObj> dict = indexByTopDomainIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTopDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
			Iterator<IYCFIntTopProjectObj> iter = dict.values().iterator();
			IYCFIntTopProjectObj obj;
			List<IYCFIntTopProjectObj> toForget = new LinkedList<IYCFIntTopProjectObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTopDomainIdx.remove( key );
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByTopDomainIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId );
		}
		deepDisposeTopProjectByTopDomainIdx( TenantId,
				TopDomainId );
	}

	public void deleteTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntTopProjectByNameIdxKey,
				IYCFIntTopProjectObj >();
		}
		YCFIntTopProjectByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );
		IYCFIntTopProjectObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableTopProject().deleteTopProjectByNameIdx( schema.getAuthorization(),
				TenantId,
				TopDomainId,
				Name );
		}
		deepDisposeTopProjectByNameIdx( TenantId,
				TopDomainId,
				Name );
	}
}
