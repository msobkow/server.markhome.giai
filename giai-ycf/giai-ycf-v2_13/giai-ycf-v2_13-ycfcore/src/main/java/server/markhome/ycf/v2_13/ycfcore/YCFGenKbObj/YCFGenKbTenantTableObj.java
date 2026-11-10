// Description: Java 11 Table Object implementation for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public class YCFGenKbTenantTableObj
	implements IYCFGenKbTenantTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj> members;
	private Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj> allTenant;
	private Map< YCFGenKbTenantByClusterIdxKey,
		Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj > > indexByClusterIdx;
	private Map< YCFGenKbTenantByUNameIdxKey,
		IYCFGenKbTenantObj > indexByUNameIdx;
	public static String TABLE_NAME = "Tenant";
	public static String TABLE_DBNAME = "tenant";

	public YCFGenKbTenantTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbTenantPKey, IYCFGenKbTenantObj>();
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
	}

	public YCFGenKbTenantTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbTenantPKey, IYCFGenKbTenantObj>();
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = (IYCFGenKbSchemaObj)value;
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
		List<IYCFGenKbTenantObj> toForget = new LinkedList<IYCFGenKbTenantObj>();
		IYCFGenKbTenantObj cur = null;
		Iterator<IYCFGenKbTenantObj> iter = members.values().iterator();
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
	 *	YCFGenKbTenantObj.
	 */
	public IYCFGenKbTenantObj newInstance() {
		IYCFGenKbTenantObj inst = new YCFGenKbTenantObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbTenantObj.
	 */
	public IYCFGenKbTenantEditObj newEditInstance( IYCFGenKbTenantObj orig ) {
		IYCFGenKbTenantEditObj edit = new YCFGenKbTenantEditObj( orig );
		return( edit );
	}

	public IYCFGenKbTenantObj realiseTenant( IYCFGenKbTenantObj Obj ) {
		IYCFGenKbTenantObj obj = Obj;
		YCFGenKbTenantPKey pkey = obj.getPKey();
		IYCFGenKbTenantObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbTenantObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbTenantByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbTenantByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbTenantByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbTenantByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
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
				YCFGenKbTenantByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbTenantByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbTenantObj createTenant( IYCFGenKbTenantObj Obj ) {
		IYCFGenKbTenantObj obj = Obj;
		YCFGenKbTenantBuff buff = obj.getTenantBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().createTenant(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbTenantObj readTenant( YCFGenKbTenantPKey pkey ) {
		return( readTenant( pkey, false ) );
	}

	public IYCFGenKbTenantObj readTenant( YCFGenKbTenantPKey pkey, boolean forceRead ) {
		IYCFGenKbTenantObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbTenantBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbTenantObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTenantObj readCachedTenant( YCFGenKbTenantPKey pkey ) {
		IYCFGenKbTenantObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTenant( IYCFGenKbTenantObj obj )
	{
		final String S_ProcName = "YCFGenKbTenantTableObj.reallyDeepDisposeTenant() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbTenantPKey pkey = obj.getPKey();
		IYCFGenKbTenantObj existing = readCachedTenant( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbTenantByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbTenantByUNameIdxKey keyUNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );


					schema.getRuleCartTableObj().deepDisposeRuleCartByTenantIdx( existing.getRequiredId() );
		IYCFGenKbTSecGroupObj objDelIncludedByGroup;
		List<IYCFGenKbTSecGroupObj> arrDelIncludedByGroup = schema.getTSecGroupTableObj().readCachedTSecGroupByTenantIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbTSecGroupObj> iterDelIncludedByGroup = arrDelIncludedByGroup.iterator();
		while( iterDelIncludedByGroup.hasNext() ) {
			objDelIncludedByGroup = iterDelIncludedByGroup.next();
			if( objDelIncludedByGroup != null ) {
						schema.getTSecGrpIncTableObj().deepDisposeTSecGrpIncByIncludeIdx( objDelIncludedByGroup.getRequiredTenantId(),
							objDelIncludedByGroup.getRequiredTSecGroupId() );
			}
		}
		IYCFGenKbTSecGroupObj objDelGrpMembs;
		List<IYCFGenKbTSecGroupObj> arrDelGrpMembs = schema.getTSecGroupTableObj().readCachedTSecGroupByTenantIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbTSecGroupObj> iterDelGrpMembs = arrDelGrpMembs.iterator();
		while( iterDelGrpMembs.hasNext() ) {
			objDelGrpMembs = iterDelGrpMembs.next();
			if( objDelGrpMembs != null ) {
						schema.getTSecGrpMembTableObj().deepDisposeTSecGrpMembByGroupIdx( objDelGrpMembs.getRequiredTenantId(),
							objDelGrpMembs.getRequiredTSecGroupId() );
			}
		}
		IYCFGenKbTSecGroupObj objDelGrpIncs;
		List<IYCFGenKbTSecGroupObj> arrDelGrpIncs = schema.getTSecGroupTableObj().readCachedTSecGroupByTenantIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbTSecGroupObj> iterDelGrpIncs = arrDelGrpIncs.iterator();
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
	public void deepDisposeTenant( YCFGenKbTenantPKey pkey ) {
		IYCFGenKbTenantObj obj = readCachedTenant( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbTenantObj lockTenant( YCFGenKbTenantPKey pkey ) {
		IYCFGenKbTenantObj locked = null;
		YCFGenKbTenantBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTenantTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbTenantObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTenant", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbTenantObj> readAllTenant() {
		return( readAllTenant( false ) );
	}

	public List<IYCFGenKbTenantObj> readAllTenant( boolean forceRead ) {
		final String S_ProcName = "readAllTenant";
		if( ( allTenant == null ) || forceRead ) {
			Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj> map = new HashMap<YCFGenKbTenantPKey,IYCFGenKbTenantObj>();
			allTenant = map;
			YCFGenKbTenantBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().readAllDerived( schema.getAuthorization() );
			YCFGenKbTenantBuff buff;
			IYCFGenKbTenantObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTenantObj realised = (IYCFGenKbTenantObj)obj.realise();
			}
		}
		int len = allTenant.size();
		IYCFGenKbTenantObj arr[] = new IYCFGenKbTenantObj[len];
		Iterator<IYCFGenKbTenantObj> valIter = allTenant.values().iterator();
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
		ArrayList<IYCFGenKbTenantObj> arrayList = new ArrayList<IYCFGenKbTenantObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTenantObj> cmp = new Comparator<IYCFGenKbTenantObj>() {
			public int compare( IYCFGenKbTenantObj lhs, IYCFGenKbTenantObj rhs ) {
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
					YCFGenKbTenantPKey lhsPKey = lhs.getPKey();
					YCFGenKbTenantPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTenantObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTenantObj> readCachedAllTenant() {
		final String S_ProcName = "readCachedAllTenant";
		ArrayList<IYCFGenKbTenantObj> arrayList = new ArrayList<IYCFGenKbTenantObj>();
		if( allTenant != null ) {
			int len = allTenant.size();
			IYCFGenKbTenantObj arr[] = new IYCFGenKbTenantObj[len];
			Iterator<IYCFGenKbTenantObj> valIter = allTenant.values().iterator();
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
		Comparator<IYCFGenKbTenantObj> cmp = new Comparator<IYCFGenKbTenantObj>() {
			public int compare( IYCFGenKbTenantObj lhs, IYCFGenKbTenantObj rhs ) {
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
					YCFGenKbTenantPKey lhsPKey = lhs.getPKey();
					YCFGenKbTenantPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbTenantObj> pageAllTenant(Long priorId )
	{
		final String S_ProcName = "pageAllTenant";
		Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj> map = new HashMap<YCFGenKbTenantPKey,IYCFGenKbTenantObj>();
		YCFGenKbTenantBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().pageAllBuff( schema.getAuthorization(),
			priorId );
		YCFGenKbTenantBuff buff;
		IYCFGenKbTenantObj obj;
		IYCFGenKbTenantObj realised;
		ArrayList<IYCFGenKbTenantObj> arrayList = new ArrayList<IYCFGenKbTenantObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbTenantObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbTenantObj readTenantByIdIdx( long Id )
	{
		return( readTenantByIdIdx( Id,
			false ) );
	}

	public IYCFGenKbTenantObj readTenantByIdIdx( long Id, boolean forceRead )
	{
		YCFGenKbTenantPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbTenantObj obj = readTenant( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbTenantObj> readTenantByClusterIdx( long ClusterId )
	{
		return( readTenantByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbTenantObj> readTenantByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readTenantByClusterIdx";
		YCFGenKbTenantByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbTenantByClusterIdxKey,
				Map< YCFGenKbTenantPKey, IYCFGenKbTenantObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTenantPKey, IYCFGenKbTenantObj>();
			IYCFGenKbTenantObj obj;
			YCFGenKbTenantBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbTenantBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTenantObj realised = (IYCFGenKbTenantObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTenantObj arr[] = new IYCFGenKbTenantObj[len];
		Iterator<IYCFGenKbTenantObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTenantObj> arrayList = new ArrayList<IYCFGenKbTenantObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTenantObj> cmp = new Comparator<IYCFGenKbTenantObj>() {
			public int compare( IYCFGenKbTenantObj lhs, IYCFGenKbTenantObj rhs ) {
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
					YCFGenKbTenantPKey lhsPKey = lhs.getPKey();
					YCFGenKbTenantPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTenantObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbTenantObj readTenantByUNameIdx( long ClusterId,
		String TenantName )
	{
		return( readTenantByUNameIdx( ClusterId,
			TenantName,
			false ) );
	}

	public IYCFGenKbTenantObj readTenantByUNameIdx( long ClusterId,
		String TenantName, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFGenKbTenantByUNameIdxKey,
				IYCFGenKbTenantObj >();
		}
		YCFGenKbTenantByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		IYCFGenKbTenantObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFGenKbTenantBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().readDerivedByUNameIdx( schema.getAuthorization(),
				ClusterId,
				TenantName );
			if( buff != null ) {
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbTenantObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTenantObj readCachedTenantByIdIdx( long Id )
	{
		IYCFGenKbTenantObj obj = null;
		YCFGenKbTenantPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedTenant( pkey );
		return( obj );
	}

	public List<IYCFGenKbTenantObj> readCachedTenantByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedTenantByClusterIdx";
		YCFGenKbTenantByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbTenantObj> arrayList = new ArrayList<IYCFGenKbTenantObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbTenantObj arr[] = new IYCFGenKbTenantObj[len];
				Iterator<IYCFGenKbTenantObj> valIter = dict.values().iterator();
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
			IYCFGenKbTenantObj obj;
			Iterator<IYCFGenKbTenantObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTenantObj> cmp = new Comparator<IYCFGenKbTenantObj>() {
			public int compare( IYCFGenKbTenantObj lhs, IYCFGenKbTenantObj rhs ) {
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
					YCFGenKbTenantPKey lhsPKey = lhs.getPKey();
					YCFGenKbTenantPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbTenantObj readCachedTenantByUNameIdx( long ClusterId,
		String TenantName )
	{
		IYCFGenKbTenantObj obj = null;
		YCFGenKbTenantByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbTenantObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbTenantObj> valIter = members.values().iterator();
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
		IYCFGenKbTenantObj obj = readCachedTenantByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTenantByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeTenantByClusterIdx";
		IYCFGenKbTenantObj obj;
		List<IYCFGenKbTenantObj> arrayList = readCachedTenantByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTenantObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbTenantObj obj = readCachedTenantByUNameIdx( ClusterId,
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
	public List<IYCFGenKbTenantObj> pageTenantByClusterIdx( long ClusterId,
		Long priorId )
	{
		final String S_ProcName = "pageTenantByClusterIdx";
		YCFGenKbTenantByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFGenKbTenantObj> retList = new LinkedList<IYCFGenKbTenantObj>();
		IYCFGenKbTenantObj obj;
		YCFGenKbTenantBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorId );
		YCFGenKbTenantBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTenantTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbTenantObj realised = (IYCFGenKbTenantObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbTenantObj updateTenant( IYCFGenKbTenantObj Obj ) {
		IYCFGenKbTenantObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().updateTenant( schema.getAuthorization(),
			Obj.getTenantBuff() );
		obj = (IYCFGenKbTenantObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTenant( IYCFGenKbTenantObj Obj ) {
		IYCFGenKbTenantObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().deleteTenant( schema.getAuthorization(),
			obj.getTenantBuff() );
		Obj.forget();
	}

	public void deleteTenantByIdIdx( long Id )
	{
		YCFGenKbTenantPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbTenantObj obj = readTenant( pkey );
		if( obj != null ) {
			IYCFGenKbTenantEditObj editObj = (IYCFGenKbTenantEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbTenantEditObj)obj.beginEdit();
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
		YCFGenKbTenantByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbTenantByClusterIdxKey,
				Map< YCFGenKbTenantPKey, IYCFGenKbTenantObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbTenantPKey, IYCFGenKbTenantObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().deleteTenantByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbTenantObj> iter = dict.values().iterator();
			IYCFGenKbTenantObj obj;
			List<IYCFGenKbTenantObj> toForget = new LinkedList<IYCFGenKbTenantObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().deleteTenantByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeTenantByClusterIdx( ClusterId );
	}

	public void deleteTenantByUNameIdx( long ClusterId,
		String TenantName )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFGenKbTenantByUNameIdxKey,
				IYCFGenKbTenantObj >();
		}
		YCFGenKbTenantByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		IYCFGenKbTenantObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().deleteTenantByUNameIdx( schema.getAuthorization(),
				ClusterId,
				TenantName );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTenant().deleteTenantByUNameIdx( schema.getAuthorization(),
				ClusterId,
				TenantName );
		}
		deepDisposeTenantByUNameIdx( ClusterId,
				TenantName );
	}

	public IYCFGenKbTenantObj getSystemTenant() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFGenKbTenantObj tenantObj;
		try {
			IYCFGenKbClusterObj clusterObj = schema.getClusterTableObj().getSystemCluster();
			tenantObj = readTenantByUNameIdx( clusterObj.getRequiredId(), "system" );
			if( tenantObj == null ) {
				tenantObj = newInstance();
				IYCFGenKbTenantEditObj tenantEdit = tenantObj.beginEdit();
				tenantEdit.setRequiredContainerCluster( clusterObj );
				tenantEdit.setRequiredTenantName( "system" );
				tenantObj = tenantEdit.create();
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
