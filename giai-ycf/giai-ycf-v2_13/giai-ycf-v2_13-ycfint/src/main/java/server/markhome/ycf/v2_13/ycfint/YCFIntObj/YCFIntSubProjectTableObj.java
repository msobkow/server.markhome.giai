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

public class YCFIntSubProjectTableObj
	implements IYCFIntSubProjectTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> members;
	private Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> allSubProject;
	private Map< YCFIntSubProjectByTenantIdxKey,
		Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > > indexByTenantIdx;
	private Map< YCFIntSubProjectByTopProjectIdxKey,
		Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > > indexByTopProjectIdx;
	private Map< YCFIntSubProjectByNameIdxKey,
		IYCFIntSubProjectObj > indexByNameIdx;
	public static String TABLE_NAME = "SubProject";
	public static String TABLE_DBNAME = "sprjdef";

	public YCFIntSubProjectTableObj() {
		schema = null;
		members = new HashMap<YCFIntSubProjectPKey, IYCFIntSubProjectObj>();
		allSubProject = null;
		indexByTenantIdx = null;
		indexByTopProjectIdx = null;
		indexByNameIdx = null;
	}

	public YCFIntSubProjectTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFIntSubProjectPKey, IYCFIntSubProjectObj>();
		allSubProject = null;
		indexByTenantIdx = null;
		indexByTopProjectIdx = null;
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
		allSubProject = null;
		indexByTenantIdx = null;
		indexByTopProjectIdx = null;
		indexByNameIdx = null;
		List<IYCFIntSubProjectObj> toForget = new LinkedList<IYCFIntSubProjectObj>();
		IYCFIntSubProjectObj cur = null;
		Iterator<IYCFIntSubProjectObj> iter = members.values().iterator();
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
	 *	YCFIntSubProjectObj.
	 */
	public IYCFIntSubProjectObj newInstance() {
		IYCFIntSubProjectObj inst = new YCFIntSubProjectObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntSubProjectObj.
	 */
	public IYCFIntSubProjectEditObj newEditInstance( IYCFIntSubProjectObj orig ) {
		IYCFIntSubProjectEditObj edit = new YCFIntSubProjectEditObj( orig );
		return( edit );
	}

	public IYCFIntSubProjectObj realiseSubProject( IYCFIntSubProjectObj Obj ) {
		IYCFIntSubProjectObj obj = Obj;
		YCFIntSubProjectPKey pkey = obj.getPKey();
		IYCFIntSubProjectObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntSubProjectObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFIntSubProjectByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByTopProjectIdx != null ) {
				YCFIntSubProjectByTopProjectIdxKey keyTopProjectIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTopProjectIdxKey();
				keyTopProjectIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopProjectIdx.setRequiredTopProjectId( keepObj.getRequiredTopProjectId() );
				Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > mapTopProjectIdx = indexByTopProjectIdx.get( keyTopProjectIdx );
				if( mapTopProjectIdx != null ) {
					mapTopProjectIdx.remove( keepObj.getPKey() );
					if( mapTopProjectIdx.size() <= 0 ) {
						indexByTopProjectIdx.remove( keyTopProjectIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntSubProjectByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopProjectId( keepObj.getRequiredTopProjectId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFIntSubProjectByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTopProjectIdx != null ) {
				YCFIntSubProjectByTopProjectIdxKey keyTopProjectIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTopProjectIdxKey();
				keyTopProjectIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopProjectIdx.setRequiredTopProjectId( keepObj.getRequiredTopProjectId() );
				Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > mapTopProjectIdx = indexByTopProjectIdx.get( keyTopProjectIdx );
				if( mapTopProjectIdx != null ) {
					mapTopProjectIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntSubProjectByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopProjectId( keepObj.getRequiredTopProjectId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allSubProject != null ) {
				allSubProject.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSubProject != null ) {
				allSubProject.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFIntSubProjectByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTopProjectIdx != null ) {
				YCFIntSubProjectByTopProjectIdxKey keyTopProjectIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTopProjectIdxKey();
				keyTopProjectIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTopProjectIdx.setRequiredTopProjectId( keepObj.getRequiredTopProjectId() );
				Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj > mapTopProjectIdx = indexByTopProjectIdx.get( keyTopProjectIdx );
				if( mapTopProjectIdx != null ) {
					mapTopProjectIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntSubProjectByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredTopProjectId( keepObj.getRequiredTopProjectId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntSubProjectObj createSubProject( IYCFIntSubProjectObj Obj ) {
		IYCFIntSubProjectObj obj = Obj;
		YCFIntSubProjectBuff buff = obj.getSubProjectBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().createSubProject(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntSubProjectObj readSubProject( YCFIntSubProjectPKey pkey ) {
		return( readSubProject( pkey, false ) );
	}

	public IYCFIntSubProjectObj readSubProject( YCFIntSubProjectPKey pkey, boolean forceRead ) {
		IYCFIntSubProjectObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntSubProjectBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getSubProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntSubProjectObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntSubProjectObj readCachedSubProject( YCFIntSubProjectPKey pkey ) {
		IYCFIntSubProjectObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSubProject( IYCFIntSubProjectObj obj )
	{
		final String S_ProcName = "YCFIntSubProjectTableObj.reallyDeepDisposeSubProject() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntSubProjectPKey pkey = obj.getPKey();
		IYCFIntSubProjectObj existing = readCachedSubProject( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntSubProjectByTenantIdxKey keyTenantIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntSubProjectByTopProjectIdxKey keyTopProjectIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTopProjectIdxKey();
		keyTopProjectIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTopProjectIdx.setRequiredTopProjectId( existing.getRequiredTopProjectId() );

		YCFIntSubProjectByNameIdxKey keyNameIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredTopProjectId( existing.getRequiredTopProjectId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getMajorVersionTableObj().deepDisposeMajorVersionBySubProjectIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByTopProjectIdx != null ) {
			if( indexByTopProjectIdx.containsKey( keyTopProjectIdx ) ) {
				indexByTopProjectIdx.get( keyTopProjectIdx ).remove( pkey );
				if( indexByTopProjectIdx.get( keyTopProjectIdx ).size() <= 0 ) {
					indexByTopProjectIdx.remove( keyTopProjectIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeSubProject( YCFIntSubProjectPKey pkey ) {
		IYCFIntSubProjectObj obj = readCachedSubProject( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntSubProjectObj lockSubProject( YCFIntSubProjectPKey pkey ) {
		IYCFIntSubProjectObj locked = null;
		YCFIntSubProjectBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSubProjectTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntSubProjectObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSubProject", pkey );
		}
		return( locked );
	}

	public List<IYCFIntSubProjectObj> readAllSubProject() {
		return( readAllSubProject( false ) );
	}

	public List<IYCFIntSubProjectObj> readAllSubProject( boolean forceRead ) {
		final String S_ProcName = "readAllSubProject";
		if( ( allSubProject == null ) || forceRead ) {
			Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> map = new HashMap<YCFIntSubProjectPKey,IYCFIntSubProjectObj>();
			allSubProject = map;
			YCFIntSubProjectBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().readAllDerived( schema.getAuthorization() );
			YCFIntSubProjectBuff buff;
			IYCFIntSubProjectObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey() );
				obj.setBuff( buff );
				IYCFIntSubProjectObj realised = (IYCFIntSubProjectObj)obj.realise();
			}
		}
		int len = allSubProject.size();
		IYCFIntSubProjectObj arr[] = new IYCFIntSubProjectObj[len];
		Iterator<IYCFIntSubProjectObj> valIter = allSubProject.values().iterator();
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
		ArrayList<IYCFIntSubProjectObj> arrayList = new ArrayList<IYCFIntSubProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntSubProjectObj> cmp = new Comparator<IYCFIntSubProjectObj>() {
			public int compare( IYCFIntSubProjectObj lhs, IYCFIntSubProjectObj rhs ) {
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
					YCFIntSubProjectPKey lhsPKey = lhs.getPKey();
					YCFIntSubProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntSubProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntSubProjectObj> readCachedAllSubProject() {
		final String S_ProcName = "readCachedAllSubProject";
		ArrayList<IYCFIntSubProjectObj> arrayList = new ArrayList<IYCFIntSubProjectObj>();
		if( allSubProject != null ) {
			int len = allSubProject.size();
			IYCFIntSubProjectObj arr[] = new IYCFIntSubProjectObj[len];
			Iterator<IYCFIntSubProjectObj> valIter = allSubProject.values().iterator();
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
		Comparator<IYCFIntSubProjectObj> cmp = new Comparator<IYCFIntSubProjectObj>() {
			public int compare( IYCFIntSubProjectObj lhs, IYCFIntSubProjectObj rhs ) {
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
					YCFIntSubProjectPKey lhsPKey = lhs.getPKey();
					YCFIntSubProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntSubProjectObj readSubProjectByIdIdx( long TenantId,
		long Id )
	{
		return( readSubProjectByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFIntSubProjectObj readSubProjectByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFIntSubProjectPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntSubProjectObj obj = readSubProject( pkey, forceRead );
		return( obj );
	}

	public List<IYCFIntSubProjectObj> readSubProjectByTenantIdx( long TenantId )
	{
		return( readSubProjectByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFIntSubProjectObj> readSubProjectByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSubProjectByTenantIdx";
		YCFIntSubProjectByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntSubProjectByTenantIdxKey,
				Map< YCFIntSubProjectPKey, IYCFIntSubProjectObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntSubProjectPKey, IYCFIntSubProjectObj>();
			IYCFIntSubProjectObj obj;
			YCFIntSubProjectBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFIntSubProjectBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSubProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey() );
				obj.setBuff( buff );
				IYCFIntSubProjectObj realised = (IYCFIntSubProjectObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntSubProjectObj arr[] = new IYCFIntSubProjectObj[len];
		Iterator<IYCFIntSubProjectObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntSubProjectObj> arrayList = new ArrayList<IYCFIntSubProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntSubProjectObj> cmp = new Comparator<IYCFIntSubProjectObj>() {
			public int compare( IYCFIntSubProjectObj lhs, IYCFIntSubProjectObj rhs ) {
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
					YCFIntSubProjectPKey lhsPKey = lhs.getPKey();
					YCFIntSubProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntSubProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntSubProjectObj> readSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId )
	{
		return( readSubProjectByTopProjectIdx( TenantId,
			TopProjectId,
			false ) );
	}

	public List<IYCFIntSubProjectObj> readSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId,
		boolean forceRead )
	{
		final String S_ProcName = "readSubProjectByTopProjectIdx";
		YCFIntSubProjectByTopProjectIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTopProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );
		Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> dict;
		if( indexByTopProjectIdx == null ) {
			indexByTopProjectIdx = new HashMap< YCFIntSubProjectByTopProjectIdxKey,
				Map< YCFIntSubProjectPKey, IYCFIntSubProjectObj > >();
		}
		if( ( ! forceRead ) && indexByTopProjectIdx.containsKey( key ) ) {
			dict = indexByTopProjectIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntSubProjectPKey, IYCFIntSubProjectObj>();
			IYCFIntSubProjectObj obj;
			YCFIntSubProjectBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().readDerivedByTopProjectIdx( schema.getAuthorization(),
				TenantId,
				TopProjectId );
			YCFIntSubProjectBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSubProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey() );
				obj.setBuff( buff );
				IYCFIntSubProjectObj realised = (IYCFIntSubProjectObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTopProjectIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntSubProjectObj arr[] = new IYCFIntSubProjectObj[len];
		Iterator<IYCFIntSubProjectObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntSubProjectObj> arrayList = new ArrayList<IYCFIntSubProjectObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntSubProjectObj> cmp = new Comparator<IYCFIntSubProjectObj>() {
			public int compare( IYCFIntSubProjectObj lhs, IYCFIntSubProjectObj rhs ) {
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
					YCFIntSubProjectPKey lhsPKey = lhs.getPKey();
					YCFIntSubProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntSubProjectObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntSubProjectObj readSubProjectByNameIdx( long TenantId,
		long TopProjectId,
		String Name )
	{
		return( readSubProjectByNameIdx( TenantId,
			TopProjectId,
			Name,
			false ) );
	}

	public IYCFIntSubProjectObj readSubProjectByNameIdx( long TenantId,
		long TopProjectId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntSubProjectByNameIdxKey,
				IYCFIntSubProjectObj >();
		}
		YCFIntSubProjectByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );
		key.setRequiredName( Name );
		IYCFIntSubProjectObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFIntSubProjectBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				TopProjectId,
				Name );
			if( buff != null ) {
				obj = schema.getSubProjectTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntSubProjectObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntSubProjectObj readCachedSubProjectByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntSubProjectObj obj = null;
		YCFIntSubProjectPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSubProject( pkey );
		return( obj );
	}

	public List<IYCFIntSubProjectObj> readCachedSubProjectByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSubProjectByTenantIdx";
		YCFIntSubProjectByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFIntSubProjectObj> arrayList = new ArrayList<IYCFIntSubProjectObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFIntSubProjectObj arr[] = new IYCFIntSubProjectObj[len];
				Iterator<IYCFIntSubProjectObj> valIter = dict.values().iterator();
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
			IYCFIntSubProjectObj obj;
			Iterator<IYCFIntSubProjectObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntSubProjectObj> cmp = new Comparator<IYCFIntSubProjectObj>() {
			public int compare( IYCFIntSubProjectObj lhs, IYCFIntSubProjectObj rhs ) {
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
					YCFIntSubProjectPKey lhsPKey = lhs.getPKey();
					YCFIntSubProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFIntSubProjectObj> readCachedSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId )
	{
		final String S_ProcName = "readCachedSubProjectByTopProjectIdx";
		YCFIntSubProjectByTopProjectIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTopProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );
		ArrayList<IYCFIntSubProjectObj> arrayList = new ArrayList<IYCFIntSubProjectObj>();
		if( indexByTopProjectIdx != null ) {
			Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> dict;
			if( indexByTopProjectIdx.containsKey( key ) ) {
				dict = indexByTopProjectIdx.get( key );
				int len = dict.size();
				IYCFIntSubProjectObj arr[] = new IYCFIntSubProjectObj[len];
				Iterator<IYCFIntSubProjectObj> valIter = dict.values().iterator();
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
			IYCFIntSubProjectObj obj;
			Iterator<IYCFIntSubProjectObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntSubProjectObj> cmp = new Comparator<IYCFIntSubProjectObj>() {
			public int compare( IYCFIntSubProjectObj lhs, IYCFIntSubProjectObj rhs ) {
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
					YCFIntSubProjectPKey lhsPKey = lhs.getPKey();
					YCFIntSubProjectPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntSubProjectObj readCachedSubProjectByNameIdx( long TenantId,
		long TopProjectId,
		String Name )
	{
		IYCFIntSubProjectObj obj = null;
		YCFIntSubProjectByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntSubProjectObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntSubProjectObj> valIter = members.values().iterator();
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

	public void deepDisposeSubProjectByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntSubProjectObj obj = readCachedSubProjectByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSubProjectByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSubProjectByTenantIdx";
		IYCFIntSubProjectObj obj;
		List<IYCFIntSubProjectObj> arrayList = readCachedSubProjectByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFIntSubProjectObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId )
	{
		final String S_ProcName = "deepDisposeSubProjectByTopProjectIdx";
		IYCFIntSubProjectObj obj;
		List<IYCFIntSubProjectObj> arrayList = readCachedSubProjectByTopProjectIdx( TenantId,
				TopProjectId );
		if( arrayList != null )  {
			Iterator<IYCFIntSubProjectObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSubProjectByNameIdx( long TenantId,
		long TopProjectId,
		String Name )
	{
		IYCFIntSubProjectObj obj = readCachedSubProjectByNameIdx( TenantId,
				TopProjectId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntSubProjectObj updateSubProject( IYCFIntSubProjectObj Obj ) {
		IYCFIntSubProjectObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().updateSubProject( schema.getAuthorization(),
			Obj.getSubProjectBuff() );
		obj = (IYCFIntSubProjectObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSubProject( IYCFIntSubProjectObj Obj ) {
		IYCFIntSubProjectObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().deleteSubProject( schema.getAuthorization(),
			obj.getSubProjectBuff() );
		Obj.forget();
	}

	public void deleteSubProjectByIdIdx( long TenantId,
		long Id )
	{
		YCFIntSubProjectPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntSubProjectObj obj = readSubProject( pkey );
		if( obj != null ) {
			IYCFIntSubProjectEditObj editObj = (IYCFIntSubProjectEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntSubProjectEditObj)obj.beginEdit();
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
		deepDisposeSubProjectByIdIdx( TenantId,
				Id );
	}

	public void deleteSubProjectByTenantIdx( long TenantId )
	{
		YCFIntSubProjectByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntSubProjectByTenantIdxKey,
				Map< YCFIntSubProjectPKey, IYCFIntSubProjectObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> dict = indexByTenantIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().deleteSubProjectByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFIntSubProjectObj> iter = dict.values().iterator();
			IYCFIntSubProjectObj obj;
			List<IYCFIntSubProjectObj> toForget = new LinkedList<IYCFIntSubProjectObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().deleteSubProjectByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSubProjectByTenantIdx( TenantId );
	}

	public void deleteSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId )
	{
		YCFIntSubProjectByTopProjectIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newTopProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );
		if( indexByTopProjectIdx == null ) {
			indexByTopProjectIdx = new HashMap< YCFIntSubProjectByTopProjectIdxKey,
				Map< YCFIntSubProjectPKey, IYCFIntSubProjectObj > >();
		}
		if( indexByTopProjectIdx.containsKey( key ) ) {
			Map<YCFIntSubProjectPKey, IYCFIntSubProjectObj> dict = indexByTopProjectIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().deleteSubProjectByTopProjectIdx( schema.getAuthorization(),
				TenantId,
				TopProjectId );
			Iterator<IYCFIntSubProjectObj> iter = dict.values().iterator();
			IYCFIntSubProjectObj obj;
			List<IYCFIntSubProjectObj> toForget = new LinkedList<IYCFIntSubProjectObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTopProjectIdx.remove( key );
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().deleteSubProjectByTopProjectIdx( schema.getAuthorization(),
				TenantId,
				TopProjectId );
		}
		deepDisposeSubProjectByTopProjectIdx( TenantId,
				TopProjectId );
	}

	public void deleteSubProjectByNameIdx( long TenantId,
		long TopProjectId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntSubProjectByNameIdxKey,
				IYCFIntSubProjectObj >();
		}
		YCFIntSubProjectByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySubProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );
		key.setRequiredName( Name );
		IYCFIntSubProjectObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().deleteSubProjectByNameIdx( schema.getAuthorization(),
				TenantId,
				TopProjectId,
				Name );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableSubProject().deleteSubProjectByNameIdx( schema.getAuthorization(),
				TenantId,
				TopProjectId,
				Name );
		}
		deepDisposeSubProjectByNameIdx( TenantId,
				TopProjectId,
				Name );
	}
}
