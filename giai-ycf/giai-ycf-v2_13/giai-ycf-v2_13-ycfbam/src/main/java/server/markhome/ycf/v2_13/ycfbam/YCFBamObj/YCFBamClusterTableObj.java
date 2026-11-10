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

public class YCFBamClusterTableObj
	implements IYCFBamClusterTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecClusterPKey, IYCFSecClusterObj> members;
	private Map<YCFSecClusterPKey, IYCFSecClusterObj> allCluster;
	private Map< YCFSecClusterByUDomNameIdxKey,
		IYCFSecClusterObj > indexByUDomNameIdx;
	private Map< YCFSecClusterByUDescrIdxKey,
		IYCFSecClusterObj > indexByUDescrIdx;
	public static String TABLE_NAME = "Cluster";
	public static String TABLE_DBNAME = "clus";

	public YCFBamClusterTableObj() {
		schema = null;
		members = new HashMap<YCFSecClusterPKey, IYCFSecClusterObj>();
		allCluster = null;
		indexByUDomNameIdx = null;
		indexByUDescrIdx = null;
	}

	public YCFBamClusterTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecClusterPKey, IYCFSecClusterObj>();
		allCluster = null;
		indexByUDomNameIdx = null;
		indexByUDescrIdx = null;
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
		allCluster = null;
		indexByUDomNameIdx = null;
		indexByUDescrIdx = null;
		List<IYCFSecClusterObj> toForget = new LinkedList<IYCFSecClusterObj>();
		IYCFSecClusterObj cur = null;
		Iterator<IYCFSecClusterObj> iter = members.values().iterator();
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
	 *	YCFBamClusterObj.
	 */
	public IYCFSecClusterObj newInstance() {
		IYCFSecClusterObj inst = new YCFBamClusterObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamClusterObj.
	 */
	public IYCFSecClusterEditObj newEditInstance( IYCFSecClusterObj orig ) {
		IYCFSecClusterEditObj edit = new YCFBamClusterEditObj( orig );
		return( edit );
	}

	public IYCFSecClusterObj realiseCluster( IYCFSecClusterObj Obj ) {
		IYCFSecClusterObj obj = Obj;
		YCFSecClusterPKey pkey = obj.getPKey();
		IYCFSecClusterObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecClusterObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUDomNameIdx != null ) {
				YCFSecClusterByUDomNameIdxKey keyUDomNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
				keyUDomNameIdx.setRequiredFullDomName( keepObj.getRequiredFullDomName() );
				indexByUDomNameIdx.remove( keyUDomNameIdx );
			}

			if( indexByUDescrIdx != null ) {
				YCFSecClusterByUDescrIdxKey keyUDescrIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.remove( keyUDescrIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUDomNameIdx != null ) {
				YCFSecClusterByUDomNameIdxKey keyUDomNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
				keyUDomNameIdx.setRequiredFullDomName( keepObj.getRequiredFullDomName() );
				indexByUDomNameIdx.put( keyUDomNameIdx, keepObj );
			}

			if( indexByUDescrIdx != null ) {
				YCFSecClusterByUDescrIdxKey keyUDescrIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( allCluster != null ) {
				allCluster.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allCluster != null ) {
				allCluster.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUDomNameIdx != null ) {
				YCFSecClusterByUDomNameIdxKey keyUDomNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
				keyUDomNameIdx.setRequiredFullDomName( keepObj.getRequiredFullDomName() );
				indexByUDomNameIdx.put( keyUDomNameIdx, keepObj );
			}

			if( indexByUDescrIdx != null ) {
				YCFSecClusterByUDescrIdxKey keyUDescrIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecClusterObj createCluster( IYCFSecClusterObj Obj ) {
		IYCFSecClusterObj obj = Obj;
		YCFSecClusterBuff buff = obj.getClusterBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableCluster().createCluster(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecClusterObj readCluster( YCFSecClusterPKey pkey ) {
		return( readCluster( pkey, false ) );
	}

	public IYCFSecClusterObj readCluster( YCFSecClusterPKey pkey, boolean forceRead ) {
		IYCFSecClusterObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecClusterBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableCluster().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getClusterTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecClusterObj readCachedCluster( YCFSecClusterPKey pkey ) {
		IYCFSecClusterObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeCluster( IYCFSecClusterObj obj )
	{
		final String S_ProcName = "YCFBamClusterTableObj.reallyDeepDisposeCluster() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecClusterPKey pkey = obj.getPKey();
		IYCFSecClusterObj existing = readCachedCluster( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecClusterByUDomNameIdxKey keyUDomNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		YCFSecClusterByUDescrIdxKey keyUDescrIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );


		IYCFSecSecGroupObj objDelSecGroupForms;
		List<IYCFSecSecGroupObj> arrDelSecGroupForms = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFSecSecGroupObj> iterDelSecGroupForms = arrDelSecGroupForms.iterator();
		while( iterDelSecGroupForms.hasNext() ) {
			objDelSecGroupForms = iterDelSecGroupForms.next();
			if( objDelSecGroupForms != null ) {
						schema.getSecGroupFormTableObj().deepDisposeSecGroupFormByGroupIdx( objDelSecGroupForms.getRequiredClusterId(),
							objDelSecGroupForms.getRequiredSecGroupId() );
			}
		}
		IYCFSecSecGroupObj objDelSecGrpIncByGroup;
		List<IYCFSecSecGroupObj> arrDelSecGrpIncByGroup = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFSecSecGroupObj> iterDelSecGrpIncByGroup = arrDelSecGrpIncByGroup.iterator();
		while( iterDelSecGrpIncByGroup.hasNext() ) {
			objDelSecGrpIncByGroup = iterDelSecGrpIncByGroup.next();
			if( objDelSecGrpIncByGroup != null ) {
						schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByIncludeIdx( objDelSecGrpIncByGroup.getRequiredClusterId(),
							objDelSecGrpIncByGroup.getRequiredSecGroupId() );
			}
		}
		IYCFSecSecGroupObj objDelSecGrpMembs;
		List<IYCFSecSecGroupObj> arrDelSecGrpMembs = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFSecSecGroupObj> iterDelSecGrpMembs = arrDelSecGrpMembs.iterator();
		while( iterDelSecGrpMembs.hasNext() ) {
			objDelSecGrpMembs = iterDelSecGrpMembs.next();
			if( objDelSecGrpMembs != null ) {
						schema.getSecGrpMembTableObj().deepDisposeSecGrpMembByGroupIdx( objDelSecGrpMembs.getRequiredClusterId(),
							objDelSecGrpMembs.getRequiredSecGroupId() );
			}
		}
		IYCFSecSecGroupObj objDelSecGrpIncs;
		List<IYCFSecSecGroupObj> arrDelSecGrpIncs = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFSecSecGroupObj> iterDelSecGrpIncs = arrDelSecGrpIncs.iterator();
		while( iterDelSecGrpIncs.hasNext() ) {
			objDelSecGrpIncs = iterDelSecGrpIncs.next();
			if( objDelSecGrpIncs != null ) {
						schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByGroupIdx( objDelSecGrpIncs.getRequiredClusterId(),
							objDelSecGrpIncs.getRequiredSecGroupId() );
			}
		}
					schema.getSecGroupTableObj().deepDisposeSecGroupByClusterIdx( existing.getRequiredId() );
		IYCFSecSecAppObj objDelSecAppForms;
		List<IYCFSecSecAppObj> arrDelSecAppForms = schema.getSecAppTableObj().readCachedSecAppByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFSecSecAppObj> iterDelSecAppForms = arrDelSecAppForms.iterator();
		while( iterDelSecAppForms.hasNext() ) {
			objDelSecAppForms = iterDelSecAppForms.next();
			if( objDelSecAppForms != null ) {
						schema.getSecFormTableObj().deepDisposeSecFormBySecAppIdx( objDelSecAppForms.getRequiredClusterId(),
							objDelSecAppForms.getRequiredSecAppId() );
			}
		}
					schema.getSecAppTableObj().deepDisposeSecAppByClusterIdx( existing.getRequiredId() );
					schema.getTenantTableObj().deepDisposeTenantByClusterIdx( existing.getRequiredId() );
					schema.getHostNodeTableObj().deepDisposeHostNodeByClusterIdx( existing.getRequiredId() );

		if( indexByUDomNameIdx != null ) {
			indexByUDomNameIdx.remove( keyUDomNameIdx );
		}

		if( indexByUDescrIdx != null ) {
			indexByUDescrIdx.remove( keyUDescrIdx );
		}


	}
	public void deepDisposeCluster( YCFSecClusterPKey pkey ) {
		IYCFSecClusterObj obj = readCachedCluster( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecClusterObj lockCluster( YCFSecClusterPKey pkey ) {
		IYCFSecClusterObj locked = null;
		YCFSecClusterBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableCluster().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getClusterTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecClusterObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockCluster", pkey );
		}
		return( locked );
	}

	public List<IYCFSecClusterObj> readAllCluster() {
		return( readAllCluster( false ) );
	}

	public List<IYCFSecClusterObj> readAllCluster( boolean forceRead ) {
		final String S_ProcName = "readAllCluster";
		if( ( allCluster == null ) || forceRead ) {
			Map<YCFSecClusterPKey, IYCFSecClusterObj> map = new HashMap<YCFSecClusterPKey,IYCFSecClusterObj>();
			allCluster = map;
			YCFSecClusterBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableCluster().readAllDerived( schema.getAuthorization() );
			YCFSecClusterBuff buff;
			IYCFSecClusterObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( buff );
				IYCFSecClusterObj realised = (IYCFSecClusterObj)obj.realise();
			}
		}
		int len = allCluster.size();
		IYCFSecClusterObj arr[] = new IYCFSecClusterObj[len];
		Iterator<IYCFSecClusterObj> valIter = allCluster.values().iterator();
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
		ArrayList<IYCFSecClusterObj> arrayList = new ArrayList<IYCFSecClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecClusterObj> cmp = new Comparator<IYCFSecClusterObj>() {
			public int compare( IYCFSecClusterObj lhs, IYCFSecClusterObj rhs ) {
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
					YCFSecClusterPKey lhsPKey = lhs.getPKey();
					YCFSecClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecClusterObj> readCachedAllCluster() {
		final String S_ProcName = "readCachedAllCluster";
		ArrayList<IYCFSecClusterObj> arrayList = new ArrayList<IYCFSecClusterObj>();
		if( allCluster != null ) {
			int len = allCluster.size();
			IYCFSecClusterObj arr[] = new IYCFSecClusterObj[len];
			Iterator<IYCFSecClusterObj> valIter = allCluster.values().iterator();
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
		Comparator<IYCFSecClusterObj> cmp = new Comparator<IYCFSecClusterObj>() {
			public int compare( IYCFSecClusterObj lhs, IYCFSecClusterObj rhs ) {
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
					YCFSecClusterPKey lhsPKey = lhs.getPKey();
					YCFSecClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the Cluster-derived instances in the database.
	 *
	 *	@return	List of IYCFSecClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecClusterObj> pageAllCluster(Long priorId )
	{
		final String S_ProcName = "pageAllCluster";
		Map<YCFSecClusterPKey, IYCFSecClusterObj> map = new HashMap<YCFSecClusterPKey,IYCFSecClusterObj>();
		YCFSecClusterBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableCluster().pageAllBuff( schema.getAuthorization(),
			priorId );
		YCFSecClusterBuff buff;
		IYCFSecClusterObj obj;
		IYCFSecClusterObj realised;
		ArrayList<IYCFSecClusterObj> arrayList = new ArrayList<IYCFSecClusterObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecClusterObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecClusterObj readClusterByIdIdx( long Id )
	{
		return( readClusterByIdIdx( Id,
			false ) );
	}

	public IYCFSecClusterObj readClusterByIdIdx( long Id, boolean forceRead )
	{
		YCFSecClusterPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		pkey.setRequiredId( Id );
		IYCFSecClusterObj obj = readCluster( pkey, forceRead );
		return( obj );
	}

	public IYCFSecClusterObj readClusterByUDomNameIdx( String FullDomName )
	{
		return( readClusterByUDomNameIdx( FullDomName,
			false ) );
	}

	public IYCFSecClusterObj readClusterByUDomNameIdx( String FullDomName, boolean forceRead )
	{
		if( indexByUDomNameIdx == null ) {
			indexByUDomNameIdx = new HashMap< YCFSecClusterByUDomNameIdxKey,
				IYCFSecClusterObj >();
		}
		YCFSecClusterByUDomNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );
		IYCFSecClusterObj obj = null;
		if( ( ! forceRead ) && indexByUDomNameIdx.containsKey( key ) ) {
			obj = indexByUDomNameIdx.get( key );
		}
		else {
			YCFSecClusterBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableCluster().readDerivedByUDomNameIdx( schema.getAuthorization(),
				FullDomName );
			if( buff != null ) {
				obj = schema.getClusterTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecClusterObj readClusterByUDescrIdx( String Description )
	{
		return( readClusterByUDescrIdx( Description,
			false ) );
	}

	public IYCFSecClusterObj readClusterByUDescrIdx( String Description, boolean forceRead )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFSecClusterByUDescrIdxKey,
				IYCFSecClusterObj >();
		}
		YCFSecClusterByUDescrIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		IYCFSecClusterObj obj = null;
		if( ( ! forceRead ) && indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
		}
		else {
			YCFSecClusterBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableCluster().readDerivedByUDescrIdx( schema.getAuthorization(),
				Description );
			if( buff != null ) {
				obj = schema.getClusterTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecClusterObj readCachedClusterByIdIdx( long Id )
	{
		IYCFSecClusterObj obj = null;
		YCFSecClusterPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedCluster( pkey );
		return( obj );
	}

	public IYCFSecClusterObj readCachedClusterByUDomNameIdx( String FullDomName )
	{
		IYCFSecClusterObj obj = null;
		YCFSecClusterByUDomNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );
		if( indexByUDomNameIdx != null ) {
			if( indexByUDomNameIdx.containsKey( key ) ) {
				obj = indexByUDomNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecClusterObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecClusterObj> valIter = members.values().iterator();
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

	public IYCFSecClusterObj readCachedClusterByUDescrIdx( String Description )
	{
		IYCFSecClusterObj obj = null;
		YCFSecClusterByUDescrIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		if( indexByUDescrIdx != null ) {
			if( indexByUDescrIdx.containsKey( key ) ) {
				obj = indexByUDescrIdx.get( key );
			}
			else {
				Iterator<IYCFSecClusterObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecClusterObj> valIter = members.values().iterator();
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

	public void deepDisposeClusterByIdIdx( long Id )
	{
		IYCFSecClusterObj obj = readCachedClusterByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClusterByUDomNameIdx( String FullDomName )
	{
		IYCFSecClusterObj obj = readCachedClusterByUDomNameIdx( FullDomName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClusterByUDescrIdx( String Description )
	{
		IYCFSecClusterObj obj = readCachedClusterByUDescrIdx( Description );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecClusterObj updateCluster( IYCFSecClusterObj Obj ) {
		IYCFSecClusterObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableCluster().updateCluster( schema.getAuthorization(),
			Obj.getClusterBuff() );
		obj = (IYCFSecClusterObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteCluster( IYCFSecClusterObj Obj ) {
		IYCFSecClusterObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableCluster().deleteCluster( schema.getAuthorization(),
			obj.getClusterBuff() );
		Obj.forget();
	}

	public void deleteClusterByIdIdx( long Id )
	{
		YCFSecClusterPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		pkey.setRequiredId( Id );
		IYCFSecClusterObj obj = readCluster( pkey );
		if( obj != null ) {
			IYCFSecClusterEditObj editObj = (IYCFSecClusterEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecClusterEditObj)obj.beginEdit();
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
		deepDisposeClusterByIdIdx( Id );
	}

	public void deleteClusterByUDomNameIdx( String FullDomName )
	{
		if( indexByUDomNameIdx == null ) {
			indexByUDomNameIdx = new HashMap< YCFSecClusterByUDomNameIdxKey,
				IYCFSecClusterObj >();
		}
		YCFSecClusterByUDomNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );
		IYCFSecClusterObj obj = null;
		if( indexByUDomNameIdx.containsKey( key ) ) {
			obj = indexByUDomNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDomNameIdx( schema.getAuthorization(),
				FullDomName );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDomNameIdx( schema.getAuthorization(),
				FullDomName );
		}
		deepDisposeClusterByUDomNameIdx( FullDomName );
	}

	public void deleteClusterByUDescrIdx( String Description )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFSecClusterByUDescrIdxKey,
				IYCFSecClusterObj >();
		}
		YCFSecClusterByUDescrIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		IYCFSecClusterObj obj = null;
		if( indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDescrIdx( schema.getAuthorization(),
				Description );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDescrIdx( schema.getAuthorization(),
				Description );
		}
		deepDisposeClusterByUDescrIdx( Description );
	}

	public IYCFSecClusterObj getSystemCluster() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFSecClusterObj clusterObj;
		try {
			clusterObj = readClusterByUDomNameIdx( "system" );
			if( clusterObj == null ) {
				clusterObj = newInstance();
				IYCFSecClusterEditObj clusterEdit = clusterObj.beginEdit();
				clusterEdit.setRequiredFullDomName( "system" );
				clusterObj = clusterEdit.create();
				clusterEdit = null;
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
		return( clusterObj );
	}
}
