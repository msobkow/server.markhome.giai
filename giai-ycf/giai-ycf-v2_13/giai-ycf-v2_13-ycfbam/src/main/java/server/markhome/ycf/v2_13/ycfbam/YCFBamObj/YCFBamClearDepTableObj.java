// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
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

public class YCFBamClearDepTableObj
	implements IYCFBamClearDepTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamClearDepObj> members;
	private Map<YCFBamScopePKey, IYCFBamClearDepObj> allClearDep;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearDepObj > > indexByTenantIdx;
	private Map< YCFBamClearDepByClearDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearDepObj > > indexByClearDepIdx;
	private Map< YCFBamClearDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearDepObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "ClearDep";
	public static String TABLE_DBNAME = "clr_dep";

	public YCFBamClearDepTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearDepObj>();
		allClearDep = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
	}

	public YCFBamClearDepTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearDepObj>();
		allClearDep = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( IYCFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allClearDep = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		List<IYCFBamClearDepObj> toForget = new LinkedList<IYCFBamClearDepObj>();
		IYCFBamClearDepObj cur = null;
		Iterator<IYCFBamClearDepObj> iter = members.values().iterator();
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
	 *	YCFBamClearDepObj.
	 */
	public IYCFBamClearDepObj newInstance() {
		IYCFBamClearDepObj inst = new YCFBamClearDepObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamClearDepObj.
	 */
	public IYCFBamClearDepEditObj newEditInstance( IYCFBamClearDepObj orig ) {
		IYCFBamClearDepEditObj edit = new YCFBamClearDepEditObj( orig );
		return( edit );
	}

	public IYCFBamClearDepObj realiseClearDep( IYCFBamClearDepObj Obj ) {
		IYCFBamClearDepObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearDepObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamClearDepObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.remove( keepObj.getPKey() );
					if( mapClearDepIdx.size() <= 0 ) {
						indexByClearDepIdx.remove( keyClearDepIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamClearDepObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allClearDep != null ) {
				allClearDep.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamClearDepObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allClearDep != null ) {
				allClearDep.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamClearDepObj createClearDep( IYCFBamClearDepObj Obj ) {
		IYCFBamClearDepObj obj = Obj;
		YCFBamClearDepBuff buff = obj.getClearDepBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().createClearDep(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a813" ) ) {
			obj = (IYCFBamClearDepObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamClearDepObj readClearDep( YCFBamScopePKey pkey ) {
		return( readClearDep( pkey, false ) );
	}

	public IYCFBamClearDepObj readClearDep( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamClearDepObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamClearDepBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamClearDepObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamClearDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearDepObj readCachedClearDep( YCFBamScopePKey pkey ) {
		IYCFBamClearDepObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeClearDep( IYCFBamClearDepObj obj )
	{
		final String S_ProcName = "YCFBamClearDepTableObj.reallyDeepDisposeClearDep() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearDepObj existing = readCachedClearDep( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamClearDepByClearDepIdxKey keyClearDepIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		keyClearDepIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyClearDepIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );



		if( indexByClearDepIdx != null ) {
			if( indexByClearDepIdx.containsKey( keyClearDepIdx ) ) {
				indexByClearDepIdx.get( keyClearDepIdx ).remove( pkey );
				if( indexByClearDepIdx.get( keyClearDepIdx ).size() <= 0 ) {
					indexByClearDepIdx.remove( keyClearDepIdx );
				}
			}
		}

		if( indexByDefSchemaIdx != null ) {
			if( indexByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
				indexByDefSchemaIdx.get( keyDefSchemaIdx ).remove( pkey );
				if( indexByDefSchemaIdx.get( keyDefSchemaIdx ).size() <= 0 ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}
		}


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeClearDep( YCFBamScopePKey pkey ) {
		IYCFBamClearDepObj obj = readCachedClearDep( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearDepObj lockClearDep( YCFBamScopePKey pkey ) {
		IYCFBamClearDepObj locked = null;
		YCFBamClearDepBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamClearDepObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamClearDepObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockClearDep", pkey );
		}
		return( locked );
	}

	public List<IYCFBamClearDepObj> readAllClearDep() {
		return( readAllClearDep( false ) );
	}

	public List<IYCFBamClearDepObj> readAllClearDep( boolean forceRead ) {
		final String S_ProcName = "readAllClearDep";
		if( ( allClearDep == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamClearDepObj> map = new HashMap<YCFBamScopePKey,IYCFBamClearDepObj>();
			allClearDep = map;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readAllDerived( schema.getAuthorization() );
			YCFBamClearDepBuff buff;
			IYCFBamClearDepObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearDepObj realised = (IYCFBamClearDepObj)obj.realise();
			}
		}
		int len = allClearDep.size();
		IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
		Iterator<IYCFBamClearDepObj> valIter = allClearDep.values().iterator();
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
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamClearDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearDepObj> readCachedAllClearDep() {
		final String S_ProcName = "readCachedAllClearDep";
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>();
		if( allClearDep != null ) {
			int len = allClearDep.size();
			IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
			Iterator<IYCFBamClearDepObj> valIter = allClearDep.values().iterator();
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
		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamClearDepObj readClearDepByIdIdx( long TenantId,
		long Id )
	{
		return( readClearDepByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamClearDepObj readClearDepByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearDepObj obj = readClearDep( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamClearDepObj> readClearDepByTenantIdx( long TenantId )
	{
		return( readClearDepByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamClearDepObj> readClearDepByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamClearDepObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearDepObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearDepObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearDepObj realised = (IYCFBamClearDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
		Iterator<IYCFBamClearDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamClearDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearDepObj> readClearDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		return( readClearDepByClearDepIdx( TenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamClearDepObj> readClearDepByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearDepByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamClearDepObj> dict;
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearDepObj > >();
		}
		if( ( ! forceRead ) && indexByClearDepIdx.containsKey( key ) ) {
			dict = indexByClearDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearDepObj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearDepObj realised = (IYCFBamClearDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
		Iterator<IYCFBamClearDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamClearDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearDepObj> readClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readClearDepByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamClearDepObj> readClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearDepByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamClearDepObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearDepObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearDepObj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearDepObj realised = (IYCFBamClearDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
		Iterator<IYCFBamClearDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamClearDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamClearDepObj readCachedClearDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearDepObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedClearDep( pkey );
		return( obj );
	}

	public List<IYCFBamClearDepObj> readCachedClearDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedClearDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearDepObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
				Iterator<IYCFBamClearDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearDepObj obj;
			Iterator<IYCFBamClearDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamClearDepObj> readCachedClearDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedClearDepByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>();
		if( indexByClearDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearDepObj> dict;
			if( indexByClearDepIdx.containsKey( key ) ) {
				dict = indexByClearDepIdx.get( key );
				int len = dict.size();
				IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
				Iterator<IYCFBamClearDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearDepObj obj;
			Iterator<IYCFBamClearDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamClearDepObj> readCachedClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedClearDepByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamClearDepObj> arrayList = new ArrayList<IYCFBamClearDepObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearDepObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamClearDepObj arr[] = new IYCFBamClearDepObj[len];
				Iterator<IYCFBamClearDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearDepObj obj;
			Iterator<IYCFBamClearDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearDepObj> cmp = new Comparator<IYCFBamClearDepObj>() {
			public int compare( IYCFBamClearDepObj lhs, IYCFBamClearDepObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeClearDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearDepObj obj = readCachedClearDepByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClearDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeClearDepByTenantIdx";
		IYCFBamClearDepObj obj;
		List<IYCFBamClearDepObj> arrayList = readCachedClearDepByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeClearDepByClearDepIdx";
		IYCFBamClearDepObj obj;
		List<IYCFBamClearDepObj> arrayList = readCachedClearDepByClearDepIdx( TenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeClearDepByDefSchemaIdx";
		IYCFBamClearDepObj obj;
		List<IYCFBamClearDepObj> arrayList = readCachedClearDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamClearDepObj updateClearDep( IYCFBamClearDepObj Obj ) {
		IYCFBamClearDepObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().updateClearDep( schema.getAuthorization(),
			Obj.getClearDepBuff() );
		if( Obj.getClassCode().equals( "a813" ) ) {
			obj = (IYCFBamClearDepObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteClearDep( IYCFBamClearDepObj Obj ) {
		IYCFBamClearDepObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().deleteClearDep( schema.getAuthorization(),
			obj.getClearDepBuff() );
		Obj.forget();
	}

	public void deleteClearDepByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearDepObj obj = readClearDep( pkey );
		if( obj != null ) {
			IYCFBamClearDepEditObj editObj = (IYCFBamClearDepEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamClearDepEditObj)obj.beginEdit();
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
		deepDisposeClearDepByIdIdx( TenantId,
				Id );
	}

	public void deleteClearDepByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearDepObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearDepObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().deleteClearDepByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamClearDepObj> iter = dict.values().iterator();
			IYCFBamClearDepObj obj;
			List<IYCFBamClearDepObj> toForget = new LinkedList<IYCFBamClearDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().deleteClearDepByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeClearDepByTenantIdx( TenantId );
	}

	public void deleteClearDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearDepObj > >();
		}
		if( indexByClearDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearDepObj> dict = indexByClearDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().deleteClearDepByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			Iterator<IYCFBamClearDepObj> iter = dict.values().iterator();
			IYCFBamClearDepObj obj;
			List<IYCFBamClearDepObj> toForget = new LinkedList<IYCFBamClearDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClearDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().deleteClearDepByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
		}
		deepDisposeClearDepByClearDepIdx( TenantId,
				RelationId );
	}

	public void deleteClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearDepObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearDepObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().deleteClearDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamClearDepObj> iter = dict.values().iterator();
			IYCFBamClearDepObj obj;
			List<IYCFBamClearDepObj> toForget = new LinkedList<IYCFBamClearDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().deleteClearDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeClearDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}
