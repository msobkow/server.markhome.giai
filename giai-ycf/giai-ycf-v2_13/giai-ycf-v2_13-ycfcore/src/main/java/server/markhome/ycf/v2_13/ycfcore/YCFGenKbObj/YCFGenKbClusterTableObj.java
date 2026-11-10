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

public class YCFGenKbClusterTableObj
	implements IYCFGenKbClusterTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbClusterPKey, IYCFGenKbClusterObj> members;
	private Map<YCFGenKbClusterPKey, IYCFGenKbClusterObj> allCluster;
	private Map< YCFGenKbClusterByUDomNameIdxKey,
		IYCFGenKbClusterObj > indexByUDomNameIdx;
	private Map< YCFGenKbClusterByUDescrIdxKey,
		IYCFGenKbClusterObj > indexByUDescrIdx;
	public static String TABLE_NAME = "Cluster";
	public static String TABLE_DBNAME = "clus";

	public YCFGenKbClusterTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbClusterPKey, IYCFGenKbClusterObj>();
		allCluster = null;
		indexByUDomNameIdx = null;
		indexByUDescrIdx = null;
	}

	public YCFGenKbClusterTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbClusterPKey, IYCFGenKbClusterObj>();
		allCluster = null;
		indexByUDomNameIdx = null;
		indexByUDescrIdx = null;
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
		allCluster = null;
		indexByUDomNameIdx = null;
		indexByUDescrIdx = null;
		List<IYCFGenKbClusterObj> toForget = new LinkedList<IYCFGenKbClusterObj>();
		IYCFGenKbClusterObj cur = null;
		Iterator<IYCFGenKbClusterObj> iter = members.values().iterator();
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
	 *	YCFGenKbClusterObj.
	 */
	public IYCFGenKbClusterObj newInstance() {
		IYCFGenKbClusterObj inst = new YCFGenKbClusterObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbClusterObj.
	 */
	public IYCFGenKbClusterEditObj newEditInstance( IYCFGenKbClusterObj orig ) {
		IYCFGenKbClusterEditObj edit = new YCFGenKbClusterEditObj( orig );
		return( edit );
	}

	public IYCFGenKbClusterObj realiseCluster( IYCFGenKbClusterObj Obj ) {
		IYCFGenKbClusterObj obj = Obj;
		YCFGenKbClusterPKey pkey = obj.getPKey();
		IYCFGenKbClusterObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbClusterObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUDomNameIdx != null ) {
				YCFGenKbClusterByUDomNameIdxKey keyUDomNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
				keyUDomNameIdx.setRequiredFullDomName( keepObj.getRequiredFullDomName() );
				indexByUDomNameIdx.remove( keyUDomNameIdx );
			}

			if( indexByUDescrIdx != null ) {
				YCFGenKbClusterByUDescrIdxKey keyUDescrIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.remove( keyUDescrIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUDomNameIdx != null ) {
				YCFGenKbClusterByUDomNameIdxKey keyUDomNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
				keyUDomNameIdx.setRequiredFullDomName( keepObj.getRequiredFullDomName() );
				indexByUDomNameIdx.put( keyUDomNameIdx, keepObj );
			}

			if( indexByUDescrIdx != null ) {
				YCFGenKbClusterByUDescrIdxKey keyUDescrIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
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
				YCFGenKbClusterByUDomNameIdxKey keyUDomNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
				keyUDomNameIdx.setRequiredFullDomName( keepObj.getRequiredFullDomName() );
				indexByUDomNameIdx.put( keyUDomNameIdx, keepObj );
			}

			if( indexByUDescrIdx != null ) {
				YCFGenKbClusterByUDescrIdxKey keyUDescrIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbClusterObj createCluster( IYCFGenKbClusterObj Obj ) {
		IYCFGenKbClusterObj obj = Obj;
		YCFGenKbClusterBuff buff = obj.getClusterBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().createCluster(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbClusterObj readCluster( YCFGenKbClusterPKey pkey ) {
		return( readCluster( pkey, false ) );
	}

	public IYCFGenKbClusterObj readCluster( YCFGenKbClusterPKey pkey, boolean forceRead ) {
		IYCFGenKbClusterObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbClusterBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getClusterTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbClusterObj readCachedCluster( YCFGenKbClusterPKey pkey ) {
		IYCFGenKbClusterObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeCluster( IYCFGenKbClusterObj obj )
	{
		final String S_ProcName = "YCFGenKbClusterTableObj.reallyDeepDisposeCluster() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbClusterPKey pkey = obj.getPKey();
		IYCFGenKbClusterObj existing = readCachedCluster( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbClusterByUDomNameIdxKey keyUDomNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		YCFGenKbClusterByUDescrIdxKey keyUDescrIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );


		IYCFGenKbSecGroupObj objDelSecGroupForms;
		List<IYCFGenKbSecGroupObj> arrDelSecGroupForms = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbSecGroupObj> iterDelSecGroupForms = arrDelSecGroupForms.iterator();
		while( iterDelSecGroupForms.hasNext() ) {
			objDelSecGroupForms = iterDelSecGroupForms.next();
			if( objDelSecGroupForms != null ) {
						schema.getSecGroupFormTableObj().deepDisposeSecGroupFormByGroupIdx( objDelSecGroupForms.getRequiredClusterId(),
							objDelSecGroupForms.getRequiredSecGroupId() );
			}
		}
		IYCFGenKbSecGroupObj objDelSecGrpIncByGroup;
		List<IYCFGenKbSecGroupObj> arrDelSecGrpIncByGroup = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbSecGroupObj> iterDelSecGrpIncByGroup = arrDelSecGrpIncByGroup.iterator();
		while( iterDelSecGrpIncByGroup.hasNext() ) {
			objDelSecGrpIncByGroup = iterDelSecGrpIncByGroup.next();
			if( objDelSecGrpIncByGroup != null ) {
						schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByIncludeIdx( objDelSecGrpIncByGroup.getRequiredClusterId(),
							objDelSecGrpIncByGroup.getRequiredSecGroupId() );
			}
		}
		IYCFGenKbSecGroupObj objDelSecGrpMembs;
		List<IYCFGenKbSecGroupObj> arrDelSecGrpMembs = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbSecGroupObj> iterDelSecGrpMembs = arrDelSecGrpMembs.iterator();
		while( iterDelSecGrpMembs.hasNext() ) {
			objDelSecGrpMembs = iterDelSecGrpMembs.next();
			if( objDelSecGrpMembs != null ) {
						schema.getSecGrpMembTableObj().deepDisposeSecGrpMembByGroupIdx( objDelSecGrpMembs.getRequiredClusterId(),
							objDelSecGrpMembs.getRequiredSecGroupId() );
			}
		}
		IYCFGenKbSecGroupObj objDelSecGrpIncs;
		List<IYCFGenKbSecGroupObj> arrDelSecGrpIncs = schema.getSecGroupTableObj().readCachedSecGroupByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbSecGroupObj> iterDelSecGrpIncs = arrDelSecGrpIncs.iterator();
		while( iterDelSecGrpIncs.hasNext() ) {
			objDelSecGrpIncs = iterDelSecGrpIncs.next();
			if( objDelSecGrpIncs != null ) {
						schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByGroupIdx( objDelSecGrpIncs.getRequiredClusterId(),
							objDelSecGrpIncs.getRequiredSecGroupId() );
			}
		}
					schema.getSecGroupTableObj().deepDisposeSecGroupByClusterIdx( existing.getRequiredId() );
		IYCFGenKbSecAppObj objDelSecAppForms;
		List<IYCFGenKbSecAppObj> arrDelSecAppForms = schema.getSecAppTableObj().readCachedSecAppByClusterIdx( existing.getRequiredId() );
		Iterator<IYCFGenKbSecAppObj> iterDelSecAppForms = arrDelSecAppForms.iterator();
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
	public void deepDisposeCluster( YCFGenKbClusterPKey pkey ) {
		IYCFGenKbClusterObj obj = readCachedCluster( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbClusterObj lockCluster( YCFGenKbClusterPKey pkey ) {
		IYCFGenKbClusterObj locked = null;
		YCFGenKbClusterBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getClusterTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbClusterObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockCluster", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbClusterObj> readAllCluster() {
		return( readAllCluster( false ) );
	}

	public List<IYCFGenKbClusterObj> readAllCluster( boolean forceRead ) {
		final String S_ProcName = "readAllCluster";
		if( ( allCluster == null ) || forceRead ) {
			Map<YCFGenKbClusterPKey, IYCFGenKbClusterObj> map = new HashMap<YCFGenKbClusterPKey,IYCFGenKbClusterObj>();
			allCluster = map;
			YCFGenKbClusterBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().readAllDerived( schema.getAuthorization() );
			YCFGenKbClusterBuff buff;
			IYCFGenKbClusterObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbClusterObj realised = (IYCFGenKbClusterObj)obj.realise();
			}
		}
		int len = allCluster.size();
		IYCFGenKbClusterObj arr[] = new IYCFGenKbClusterObj[len];
		Iterator<IYCFGenKbClusterObj> valIter = allCluster.values().iterator();
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
		ArrayList<IYCFGenKbClusterObj> arrayList = new ArrayList<IYCFGenKbClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbClusterObj> cmp = new Comparator<IYCFGenKbClusterObj>() {
			public int compare( IYCFGenKbClusterObj lhs, IYCFGenKbClusterObj rhs ) {
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
					YCFGenKbClusterPKey lhsPKey = lhs.getPKey();
					YCFGenKbClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbClusterObj> readCachedAllCluster() {
		final String S_ProcName = "readCachedAllCluster";
		ArrayList<IYCFGenKbClusterObj> arrayList = new ArrayList<IYCFGenKbClusterObj>();
		if( allCluster != null ) {
			int len = allCluster.size();
			IYCFGenKbClusterObj arr[] = new IYCFGenKbClusterObj[len];
			Iterator<IYCFGenKbClusterObj> valIter = allCluster.values().iterator();
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
		Comparator<IYCFGenKbClusterObj> cmp = new Comparator<IYCFGenKbClusterObj>() {
			public int compare( IYCFGenKbClusterObj lhs, IYCFGenKbClusterObj rhs ) {
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
					YCFGenKbClusterPKey lhsPKey = lhs.getPKey();
					YCFGenKbClusterPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbClusterObj> pageAllCluster(Long priorId )
	{
		final String S_ProcName = "pageAllCluster";
		Map<YCFGenKbClusterPKey, IYCFGenKbClusterObj> map = new HashMap<YCFGenKbClusterPKey,IYCFGenKbClusterObj>();
		YCFGenKbClusterBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().pageAllBuff( schema.getAuthorization(),
			priorId );
		YCFGenKbClusterBuff buff;
		IYCFGenKbClusterObj obj;
		IYCFGenKbClusterObj realised;
		ArrayList<IYCFGenKbClusterObj> arrayList = new ArrayList<IYCFGenKbClusterObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbClusterObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbClusterObj readClusterByIdIdx( long Id )
	{
		return( readClusterByIdIdx( Id,
			false ) );
	}

	public IYCFGenKbClusterObj readClusterByIdIdx( long Id, boolean forceRead )
	{
		YCFGenKbClusterPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbClusterObj obj = readCluster( pkey, forceRead );
		return( obj );
	}

	public IYCFGenKbClusterObj readClusterByUDomNameIdx( String FullDomName )
	{
		return( readClusterByUDomNameIdx( FullDomName,
			false ) );
	}

	public IYCFGenKbClusterObj readClusterByUDomNameIdx( String FullDomName, boolean forceRead )
	{
		if( indexByUDomNameIdx == null ) {
			indexByUDomNameIdx = new HashMap< YCFGenKbClusterByUDomNameIdxKey,
				IYCFGenKbClusterObj >();
		}
		YCFGenKbClusterByUDomNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );
		IYCFGenKbClusterObj obj = null;
		if( ( ! forceRead ) && indexByUDomNameIdx.containsKey( key ) ) {
			obj = indexByUDomNameIdx.get( key );
		}
		else {
			YCFGenKbClusterBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().readDerivedByUDomNameIdx( schema.getAuthorization(),
				FullDomName );
			if( buff != null ) {
				obj = schema.getClusterTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbClusterObj readClusterByUDescrIdx( String Description )
	{
		return( readClusterByUDescrIdx( Description,
			false ) );
	}

	public IYCFGenKbClusterObj readClusterByUDescrIdx( String Description, boolean forceRead )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFGenKbClusterByUDescrIdxKey,
				IYCFGenKbClusterObj >();
		}
		YCFGenKbClusterByUDescrIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		IYCFGenKbClusterObj obj = null;
		if( ( ! forceRead ) && indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
		}
		else {
			YCFGenKbClusterBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().readDerivedByUDescrIdx( schema.getAuthorization(),
				Description );
			if( buff != null ) {
				obj = schema.getClusterTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbClusterObj readCachedClusterByIdIdx( long Id )
	{
		IYCFGenKbClusterObj obj = null;
		YCFGenKbClusterPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedCluster( pkey );
		return( obj );
	}

	public IYCFGenKbClusterObj readCachedClusterByUDomNameIdx( String FullDomName )
	{
		IYCFGenKbClusterObj obj = null;
		YCFGenKbClusterByUDomNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );
		if( indexByUDomNameIdx != null ) {
			if( indexByUDomNameIdx.containsKey( key ) ) {
				obj = indexByUDomNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbClusterObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbClusterObj> valIter = members.values().iterator();
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

	public IYCFGenKbClusterObj readCachedClusterByUDescrIdx( String Description )
	{
		IYCFGenKbClusterObj obj = null;
		YCFGenKbClusterByUDescrIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		if( indexByUDescrIdx != null ) {
			if( indexByUDescrIdx.containsKey( key ) ) {
				obj = indexByUDescrIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbClusterObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbClusterObj> valIter = members.values().iterator();
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
		IYCFGenKbClusterObj obj = readCachedClusterByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClusterByUDomNameIdx( String FullDomName )
	{
		IYCFGenKbClusterObj obj = readCachedClusterByUDomNameIdx( FullDomName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClusterByUDescrIdx( String Description )
	{
		IYCFGenKbClusterObj obj = readCachedClusterByUDescrIdx( Description );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbClusterObj updateCluster( IYCFGenKbClusterObj Obj ) {
		IYCFGenKbClusterObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().updateCluster( schema.getAuthorization(),
			Obj.getClusterBuff() );
		obj = (IYCFGenKbClusterObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteCluster( IYCFGenKbClusterObj Obj ) {
		IYCFGenKbClusterObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().deleteCluster( schema.getAuthorization(),
			obj.getClusterBuff() );
		Obj.forget();
	}

	public void deleteClusterByIdIdx( long Id )
	{
		YCFGenKbClusterPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbClusterObj obj = readCluster( pkey );
		if( obj != null ) {
			IYCFGenKbClusterEditObj editObj = (IYCFGenKbClusterEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbClusterEditObj)obj.beginEdit();
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
			indexByUDomNameIdx = new HashMap< YCFGenKbClusterByUDomNameIdxKey,
				IYCFGenKbClusterObj >();
		}
		YCFGenKbClusterByUDomNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );
		IYCFGenKbClusterObj obj = null;
		if( indexByUDomNameIdx.containsKey( key ) ) {
			obj = indexByUDomNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDomNameIdx( schema.getAuthorization(),
				FullDomName );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDomNameIdx( schema.getAuthorization(),
				FullDomName );
		}
		deepDisposeClusterByUDomNameIdx( FullDomName );
	}

	public void deleteClusterByUDescrIdx( String Description )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFGenKbClusterByUDescrIdxKey,
				IYCFGenKbClusterObj >();
		}
		YCFGenKbClusterByUDescrIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		IYCFGenKbClusterObj obj = null;
		if( indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDescrIdx( schema.getAuthorization(),
				Description );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableCluster().deleteClusterByUDescrIdx( schema.getAuthorization(),
				Description );
		}
		deepDisposeClusterByUDescrIdx( Description );
	}

	public IYCFGenKbClusterObj getSystemCluster() {
		boolean transactionStarted = schema.beginTransaction();
		IYCFGenKbClusterObj clusterObj;
		try {
			clusterObj = readClusterByUDomNameIdx( "system" );
			if( clusterObj == null ) {
				clusterObj = newInstance();
				IYCFGenKbClusterEditObj clusterEdit = clusterObj.beginEdit();
				clusterEdit.setRequiredFullDomName( "system" );
				clusterObj = clusterEdit.create();
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
