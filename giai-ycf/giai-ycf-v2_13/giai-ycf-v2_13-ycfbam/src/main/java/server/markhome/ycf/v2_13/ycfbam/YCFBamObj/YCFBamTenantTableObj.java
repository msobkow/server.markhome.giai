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

public class YCFBamTenantTableObj
	implements IYCFBamTenantTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecTenantPKey, IYCFSecTenantObj> members;
	private Map<YCFSecTenantPKey, IYCFSecTenantObj> allTenant;
	private Map< YCFSecTenantByClusterIdxKey,
		Map<YCFSecTenantPKey, IYCFSecTenantObj > > indexByClusterIdx;
	private Map< YCFSecTenantByUNameIdxKey,
		IYCFSecTenantObj > indexByUNameIdx;
	public static String TABLE_NAME = "Tenant";
	public static String TABLE_DBNAME = "tenant";

	public YCFBamTenantTableObj() {
		schema = null;
		members = new HashMap<YCFSecTenantPKey, IYCFSecTenantObj>();
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
	}

	public YCFBamTenantTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecTenantPKey, IYCFSecTenantObj>();
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
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
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
		List<IYCFSecTenantObj> toForget = new LinkedList<IYCFSecTenantObj>();
		IYCFSecTenantObj cur = null;
		Iterator<IYCFSecTenantObj> iter = members.values().iterator();
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
	 *	YCFBamTenantObj.
	 */
	public IYCFSecTenantObj newInstance() {
		IYCFSecTenantObj inst = new YCFBamTenantObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTenantObj.
	 */
	public IYCFSecTenantEditObj newEditInstance( IYCFSecTenantObj orig ) {
		IYCFSecTenantEditObj edit = new YCFBamTenantEditObj( orig );
		return( edit );
	}

	public IYCFSecTenantObj realiseTenant( IYCFSecTenantObj Obj ) {
		IYCFSecTenantObj obj = Obj;
		YCFSecTenantPKey pkey = obj.getPKey();
		IYCFSecTenantObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecTenantObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecTenantByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecTenantPKey, IYCFSecTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecTenantByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecTenantByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecTenantPKey, IYCFSecTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecTenantByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allTenant != null ) {
				allTenant.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTenant != null ) {
				allTenant.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecTenantByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecTenantPKey, IYCFSecTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFSecTenantByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecTenantObj createTenant( IYCFSecTenantObj Obj ) {
		IYCFSecTenantObj obj = Obj;
		YCFSecTenantBuff buff = obj.getTenantBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTenant().createTenant(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecTenantObj readTenant( YCFSecTenantPKey pkey ) {
		return( readTenant( pkey, false ) );
	}

	public IYCFSecTenantObj readTenant( YCFSecTenantPKey pkey, boolean forceRead ) {
		IYCFSecTenantObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecTenantBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTenant().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecTenantObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTenantObj readCachedTenant( YCFSecTenantPKey pkey ) {
		IYCFSecTenantObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTenant( IYCFSecTenantObj obj )
	{
		final String S_ProcName = "YCFBamTenantTableObj.reallyDeepDisposeTenant() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecTenantPKey pkey = obj.getPKey();
		IYCFSecTenantObj existing = readCachedTenant( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecTenantByClusterIdxKey keyClusterIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecTenantByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );


		IYCFBamSchemaDefObj objDelTableChain;
		List<IYCFBamSchemaDefObj> arrDelTableChain = schema.getSchemaDefTableObj().readCachedSchemaDefByCTenantIdx( existing.getRequiredId() );
		Iterator<IYCFBamSchemaDefObj> iterDelTableChain = arrDelTableChain.iterator();
		while( iterDelTableChain.hasNext() ) {
			objDelTableChain = iterDelTableChain.next();
			if( objDelTableChain != null ) {
			IYCFBamTableObj objTables;
			List<IYCFBamTableObj> arrTables = schema.getTableTableObj().readCachedTableBySchemaDefIdx( objDelTableChain.getRequiredTenantId(),
							objDelTableChain.getRequiredId() );
			Iterator<IYCFBamTableObj> iterTables = arrTables.iterator();
			while( iterTables.hasNext() ) {
				objTables = iterTables.next();
					schema.getChainTableObj().deepDisposeChainByChainTableIdx( objTables.getRequiredTenantId(),
							objTables.getRequiredId() );
			}
			}
		}
		IYCFBamSchemaDefObj objDelTableRelationCol;
		List<IYCFBamSchemaDefObj> arrDelTableRelationCol = schema.getSchemaDefTableObj().readCachedSchemaDefByCTenantIdx( existing.getRequiredId() );
		Iterator<IYCFBamSchemaDefObj> iterDelTableRelationCol = arrDelTableRelationCol.iterator();
		while( iterDelTableRelationCol.hasNext() ) {
			objDelTableRelationCol = iterDelTableRelationCol.next();
			if( objDelTableRelationCol != null ) {
			IYCFBamTableObj objTables;
			List<IYCFBamTableObj> arrTables = schema.getTableTableObj().readCachedTableBySchemaDefIdx( objDelTableRelationCol.getRequiredTenantId(),
							objDelTableRelationCol.getRequiredId() );
			Iterator<IYCFBamTableObj> iterTables = arrTables.iterator();
			while( iterTables.hasNext() ) {
				objTables = iterTables.next();
			IYCFBamRelationObj objTableRelation;
			List<IYCFBamRelationObj> arrTableRelation = schema.getRelationTableObj().readCachedRelationByRelTableIdx( objTables.getRequiredTenantId(),
							objTables.getRequiredId() );
			Iterator<IYCFBamRelationObj> iterTableRelation = arrTableRelation.iterator();
			while( iterTableRelation.hasNext() ) {
				objTableRelation = iterTableRelation.next();
					schema.getRelationColTableObj().deepDisposeRelationColByRelationIdx( objTableRelation.getRequiredTenantId(),
							objTableRelation.getRequiredId() );
			}
			}
			}
		}
		IYCFBamSchemaDefObj objDelTableRelation;
		List<IYCFBamSchemaDefObj> arrDelTableRelation = schema.getSchemaDefTableObj().readCachedSchemaDefByCTenantIdx( existing.getRequiredId() );
		Iterator<IYCFBamSchemaDefObj> iterDelTableRelation = arrDelTableRelation.iterator();
		while( iterDelTableRelation.hasNext() ) {
			objDelTableRelation = iterDelTableRelation.next();
			if( objDelTableRelation != null ) {
			IYCFBamTableObj objTables;
			List<IYCFBamTableObj> arrTables = schema.getTableTableObj().readCachedTableBySchemaDefIdx( objDelTableRelation.getRequiredTenantId(),
							objDelTableRelation.getRequiredId() );
			Iterator<IYCFBamTableObj> iterTables = arrTables.iterator();
			while( iterTables.hasNext() ) {
				objTables = iterTables.next();
					schema.getRelationTableObj().deepDisposeRelationByRelTableIdx( objTables.getRequiredTenantId(),
							objTables.getRequiredId() );
			}
			}
		}
		IYCFBamSchemaDefObj objDelTable;
		List<IYCFBamSchemaDefObj> arrDelTable = schema.getSchemaDefTableObj().readCachedSchemaDefByCTenantIdx( existing.getRequiredId() );
		Iterator<IYCFBamSchemaDefObj> iterDelTable = arrDelTable.iterator();
		while( iterDelTable.hasNext() ) {
			objDelTable = iterDelTable.next();
			if( objDelTable != null ) {
						schema.getTableTableObj().deepDisposeTableBySchemaDefIdx( objDelTable.getRequiredTenantId(),
							objDelTable.getRequiredId() );
			}
		}
		IYCFBamSchemaDefObj objDelTypeDef;
		List<IYCFBamSchemaDefObj> arrDelTypeDef = schema.getSchemaDefTableObj().readCachedSchemaDefByCTenantIdx( existing.getRequiredId() );
		Iterator<IYCFBamSchemaDefObj> iterDelTypeDef = arrDelTypeDef.iterator();
		while( iterDelTypeDef.hasNext() ) {
			objDelTypeDef = iterDelTypeDef.next();
			if( objDelTypeDef != null ) {
						schema.getValueTableObj().deepDisposeValueByScopeIdx( objDelTypeDef.getRequiredTenantId(),
							objDelTypeDef.getRequiredId() );
			}
		}
					schema.getSchemaDefTableObj().deepDisposeSchemaDefByCTenantIdx( existing.getRequiredId() );
					schema.getTldTableObj().deepDisposeTldByTenantIdx( existing.getRequiredId() );
		IYCFSecTSecGroupObj objDelIncludedByGroup;
		List<IYCFSecTSecGroupObj> arrDelIncludedByGroup = schema.getTSecGroupTableObj().readCachedTSecGroupByTenantIdx( existing.getRequiredId() );
		Iterator<IYCFSecTSecGroupObj> iterDelIncludedByGroup = arrDelIncludedByGroup.iterator();
		while( iterDelIncludedByGroup.hasNext() ) {
			objDelIncludedByGroup = iterDelIncludedByGroup.next();
			if( objDelIncludedByGroup != null ) {
						schema.getTSecGrpIncTableObj().deepDisposeTSecGrpIncByIncludeIdx( objDelIncludedByGroup.getRequiredTenantId(),
							objDelIncludedByGroup.getRequiredTSecGroupId() );
			}
		}
		IYCFSecTSecGroupObj objDelGrpMembs;
		List<IYCFSecTSecGroupObj> arrDelGrpMembs = schema.getTSecGroupTableObj().readCachedTSecGroupByTenantIdx( existing.getRequiredId() );
		Iterator<IYCFSecTSecGroupObj> iterDelGrpMembs = arrDelGrpMembs.iterator();
		while( iterDelGrpMembs.hasNext() ) {
			objDelGrpMembs = iterDelGrpMembs.next();
			if( objDelGrpMembs != null ) {
						schema.getTSecGrpMembTableObj().deepDisposeTSecGrpMembByGroupIdx( objDelGrpMembs.getRequiredTenantId(),
							objDelGrpMembs.getRequiredTSecGroupId() );
			}
		}
		IYCFSecTSecGroupObj objDelGrpIncs;
		List<IYCFSecTSecGroupObj> arrDelGrpIncs = schema.getTSecGroupTableObj().readCachedTSecGroupByTenantIdx( existing.getRequiredId() );
		Iterator<IYCFSecTSecGroupObj> iterDelGrpIncs = arrDelGrpIncs.iterator();
		while( iterDelGrpIncs.hasNext() ) {
			objDelGrpIncs = iterDelGrpIncs.next();
			if( objDelGrpIncs != null ) {
						schema.getTSecGrpIncTableObj().deepDisposeTSecGrpIncByGroupIdx( objDelGrpIncs.getRequiredTenantId(),
							objDelGrpIncs.getRequiredTSecGroupId() );
			}
		}
					schema.getTSecGroupTableObj().deepDisposeTSecGroupByTenantIdx( existing.getRequiredId() );

		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeTenant( YCFSecTenantPKey pkey ) {
		IYCFSecTenantObj obj = readCachedTenant( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecTenantObj lockTenant( YCFSecTenantPKey pkey ) {
		IYCFSecTenantObj locked = null;
		YCFSecTenantBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTenant().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTenantTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecTenantObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTenant", pkey );
		}
		return( locked );
	}

	public List<IYCFSecTenantObj> readAllTenant() {
		return( readAllTenant( false ) );
	}

	public List<IYCFSecTenantObj> readAllTenant( boolean forceRead ) {
		final String S_ProcName = "readAllTenant";
		if( ( allTenant == null ) || forceRead ) {
			Map<YCFSecTenantPKey, IYCFSecTenantObj> map = new HashMap<YCFSecTenantPKey,IYCFSecTenantObj>();
			allTenant = map;
			YCFSecTenantBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTenant().readAllDerived( schema.getAuthorization() );
			YCFSecTenantBuff buff;
			IYCFSecTenantObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( buff );
				IYCFSecTenantObj realised = (IYCFSecTenantObj)obj.realise();
			}
		}
		int len = allTenant.size();
		IYCFSecTenantObj arr[] = new IYCFSecTenantObj[len];
		Iterator<IYCFSecTenantObj> valIter = allTenant.values().iterator();
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
		ArrayList<IYCFSecTenantObj> arrayList = new ArrayList<IYCFSecTenantObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTenantObj> cmp = new Comparator<IYCFSecTenantObj>() {
			public int compare( IYCFSecTenantObj lhs, IYCFSecTenantObj rhs ) {
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
					YCFSecTenantPKey lhsPKey = lhs.getPKey();
					YCFSecTenantPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTenantObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecTenantObj> readCachedAllTenant() {
		final String S_ProcName = "readCachedAllTenant";
		ArrayList<IYCFSecTenantObj> arrayList = new ArrayList<IYCFSecTenantObj>();
		if( allTenant != null ) {
			int len = allTenant.size();
			IYCFSecTenantObj arr[] = new IYCFSecTenantObj[len];
			Iterator<IYCFSecTenantObj> valIter = allTenant.values().iterator();
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
		Comparator<IYCFSecTenantObj> cmp = new Comparator<IYCFSecTenantObj>() {
			public int compare( IYCFSecTenantObj lhs, IYCFSecTenantObj rhs ) {
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
					YCFSecTenantPKey lhsPKey = lhs.getPKey();
					YCFSecTenantPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the Tenant-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecTenantObj> pageAllTenant(Long priorId )
	{
		final String S_ProcName = "pageAllTenant";
		Map<YCFSecTenantPKey, IYCFSecTenantObj> map = new HashMap<YCFSecTenantPKey,IYCFSecTenantObj>();
		YCFSecTenantBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTenant().pageAllBuff( schema.getAuthorization(),
			priorId );
		YCFSecTenantBuff buff;
		IYCFSecTenantObj obj;
		IYCFSecTenantObj realised;
		ArrayList<IYCFSecTenantObj> arrayList = new ArrayList<IYCFSecTenantObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecTenantObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecTenantObj readTenantByIdIdx( long Id )
	{
		return( readTenantByIdIdx( Id,
			false ) );
	}

	public IYCFSecTenantObj readTenantByIdIdx( long Id, boolean forceRead )
	{
		YCFSecTenantPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		pkey.setRequiredId( Id );
		IYCFSecTenantObj obj = readTenant( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecTenantObj> readTenantByClusterIdx( long ClusterId )
	{
		return( readTenantByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecTenantObj> readTenantByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readTenantByClusterIdx";
		YCFSecTenantByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecTenantPKey, IYCFSecTenantObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecTenantByClusterIdxKey,
				Map< YCFSecTenantPKey, IYCFSecTenantObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecTenantPKey, IYCFSecTenantObj>();
			IYCFSecTenantObj obj;
			YCFSecTenantBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTenant().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecTenantBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( buff );
				IYCFSecTenantObj realised = (IYCFSecTenantObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecTenantObj arr[] = new IYCFSecTenantObj[len];
		Iterator<IYCFSecTenantObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecTenantObj> arrayList = new ArrayList<IYCFSecTenantObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecTenantObj> cmp = new Comparator<IYCFSecTenantObj>() {
			public int compare( IYCFSecTenantObj lhs, IYCFSecTenantObj rhs ) {
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
					YCFSecTenantPKey lhsPKey = lhs.getPKey();
					YCFSecTenantPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecTenantObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecTenantObj readTenantByUNameIdx( long ClusterId,
		String TenantName )
	{
		return( readTenantByUNameIdx( ClusterId,
			TenantName,
			false ) );
	}

	public IYCFSecTenantObj readTenantByUNameIdx( long ClusterId,
		String TenantName, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFSecTenantByUNameIdxKey,
				IYCFSecTenantObj >();
		}
		YCFSecTenantByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		IYCFSecTenantObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFSecTenantBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTenant().readDerivedByUNameIdx( schema.getAuthorization(),
				ClusterId,
				TenantName );
			if( buff != null ) {
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecTenantObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecTenantObj readCachedTenantByIdIdx( long Id )
	{
		IYCFSecTenantObj obj = null;
		YCFSecTenantPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedTenant( pkey );
		return( obj );
	}

	public List<IYCFSecTenantObj> readCachedTenantByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedTenantByClusterIdx";
		YCFSecTenantByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecTenantObj> arrayList = new ArrayList<IYCFSecTenantObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecTenantPKey, IYCFSecTenantObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecTenantObj arr[] = new IYCFSecTenantObj[len];
				Iterator<IYCFSecTenantObj> valIter = dict.values().iterator();
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
			IYCFSecTenantObj obj;
			Iterator<IYCFSecTenantObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecTenantObj> cmp = new Comparator<IYCFSecTenantObj>() {
			public int compare( IYCFSecTenantObj lhs, IYCFSecTenantObj rhs ) {
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
					YCFSecTenantPKey lhsPKey = lhs.getPKey();
					YCFSecTenantPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecTenantObj readCachedTenantByUNameIdx( long ClusterId,
		String TenantName )
	{
		IYCFSecTenantObj obj = null;
		YCFSecTenantByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecTenantObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecTenantObj> valIter = members.values().iterator();
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

	public void deepDisposeTenantByIdIdx( long Id )
	{
		IYCFSecTenantObj obj = readCachedTenantByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTenantByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeTenantByClusterIdx";
		IYCFSecTenantObj obj;
		List<IYCFSecTenantObj> arrayList = readCachedTenantByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecTenantObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTenantByUNameIdx( long ClusterId,
		String TenantName )
	{
		IYCFSecTenantObj obj = readCachedTenantByUNameIdx( ClusterId,
				TenantName );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of Tenant-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	A List of Tenant-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecTenantObj> pageTenantByClusterIdx( long ClusterId,
		Long priorId )
	{
		final String S_ProcName = "pageTenantByClusterIdx";
		YCFSecTenantByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecTenantObj> retList = new LinkedList<IYCFSecTenantObj>();
		IYCFSecTenantObj obj;
		YCFSecTenantBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTenant().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorId );
		YCFSecTenantBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTenantTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
			obj.setBuff( buff );
			IYCFSecTenantObj realised = (IYCFSecTenantObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecTenantObj updateTenant( IYCFSecTenantObj Obj ) {
		IYCFSecTenantObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTenant().updateTenant( schema.getAuthorization(),
			Obj.getTenantBuff() );
		obj = (IYCFSecTenantObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTenant( IYCFSecTenantObj Obj ) {
		IYCFSecTenantObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTenant().deleteTenant( schema.getAuthorization(),
			obj.getTenantBuff() );
		Obj.forget();
	}

	public void deleteTenantByIdIdx( long Id )
	{
		YCFSecTenantPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		pkey.setRequiredId( Id );
		IYCFSecTenantObj obj = readTenant( pkey );
		if( obj != null ) {
			IYCFSecTenantEditObj editObj = (IYCFSecTenantEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecTenantEditObj)obj.beginEdit();
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
		deepDisposeTenantByIdIdx( Id );
	}

	public void deleteTenantByClusterIdx( long ClusterId )
	{
		YCFSecTenantByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecTenantByClusterIdxKey,
				Map< YCFSecTenantPKey, IYCFSecTenantObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecTenantPKey, IYCFSecTenantObj> dict = indexByClusterIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTenant().deleteTenantByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecTenantObj> iter = dict.values().iterator();
			IYCFSecTenantObj obj;
			List<IYCFSecTenantObj> toForget = new LinkedList<IYCFSecTenantObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTenant().deleteTenantByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeTenantByClusterIdx( ClusterId );
	}

	public void deleteTenantByUNameIdx( long ClusterId,
		String TenantName )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFSecTenantByUNameIdxKey,
				IYCFSecTenantObj >();
		}
		YCFSecTenantByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		IYCFSecTenantObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTenant().deleteTenantByUNameIdx( schema.getAuthorization(),
				ClusterId,
				TenantName );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTenant().deleteTenantByUNameIdx( schema.getAuthorization(),
				ClusterId,
				TenantName );
		}
		deepDisposeTenantByUNameIdx( ClusterId,
				TenantName );
	}

	public IYCFSecTenantObj getSystemTenant() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFSecTenantObj tenantObj;
		try {
			IYCFSecClusterObj clusterObj = schema.getClusterTableObj().getSystemCluster();
			tenantObj = readTenantByUNameIdx( clusterObj.getRequiredId(), "system" );
			if( tenantObj == null ) {
				tenantObj = newInstance();
				IYCFSecTenantEditObj tenantEdit = tenantObj.beginEdit();
				tenantEdit.setRequiredContainerCluster( clusterObj );
				tenantEdit.setRequiredTenantName( "system" );
				tenantObj = tenantEdit.create();
				tenantEdit = null;
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
		return( tenantObj );
	}
}
