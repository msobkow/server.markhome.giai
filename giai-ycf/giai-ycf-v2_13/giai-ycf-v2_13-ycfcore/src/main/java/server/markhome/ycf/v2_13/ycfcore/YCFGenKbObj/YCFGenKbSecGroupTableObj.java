// Description: Java 11 Table Object implementation for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public class CFGenKbSecGroupTableObj
	implements ICFGenKbSecGroupTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> members;
	private Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> allSecGroup;
	private Map< CFGenKbSecGroupByClusterIdxKey,
		Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > > indexByClusterIdx;
	private Map< CFGenKbSecGroupByClusterVisIdxKey,
		Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > > indexByClusterVisIdx;
	private Map< CFGenKbSecGroupByUNameIdxKey,
		ICFGenKbSecGroupObj > indexByUNameIdx;
	public static String TABLE_NAME = "SecGroup";
	public static String TABLE_DBNAME = "secgrp";

	public CFGenKbSecGroupTableObj() {
		schema = null;
		members = new HashMap<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj>();
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
	}

	public CFGenKbSecGroupTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj>();
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = (ICFGenKbSchemaObj)value;
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
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
		List<ICFGenKbSecGroupObj> toForget = new LinkedList<ICFGenKbSecGroupObj>();
		ICFGenKbSecGroupObj cur = null;
		Iterator<ICFGenKbSecGroupObj> iter = members.values().iterator();
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
	 *	CFGenKbSecGroupObj.
	 */
	public ICFGenKbSecGroupObj newInstance() {
		ICFGenKbSecGroupObj inst = new CFGenKbSecGroupObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSecGroupObj.
	 */
	public ICFGenKbSecGroupEditObj newEditInstance( ICFGenKbSecGroupObj orig ) {
		ICFGenKbSecGroupEditObj edit = new CFGenKbSecGroupEditObj( orig );
		return( edit );
	}

	public ICFGenKbSecGroupObj realiseSecGroup( ICFGenKbSecGroupObj Obj ) {
		ICFGenKbSecGroupObj obj = Obj;
		CFGenKbSecGroupPKey pkey = obj.getPKey();
		ICFGenKbSecGroupObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbSecGroupObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				CFGenKbSecGroupByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByClusterVisIdx != null ) {
				CFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.remove( keepObj.getPKey() );
					if( mapClusterVisIdx.size() <= 0 ) {
						indexByClusterVisIdx.remove( keyClusterVisIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFGenKbSecGroupByUNameIdxKey keyUNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				CFGenKbSecGroupByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClusterVisIdx != null ) {
				CFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFGenKbSecGroupByUNameIdxKey keyUNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allSecGroup != null ) {
				allSecGroup.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecGroup != null ) {
				allSecGroup.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				CFGenKbSecGroupByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClusterVisIdx != null ) {
				CFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFGenKbSecGroupByUNameIdxKey keyUNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbSecGroupObj createSecGroup( ICFGenKbSecGroupObj Obj ) {
		ICFGenKbSecGroupObj obj = Obj;
		CFGenKbSecGroupBuff buff = obj.getSecGroupBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().createSecGroup(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbSecGroupObj readSecGroup( CFGenKbSecGroupPKey pkey ) {
		return( readSecGroup( pkey, false ) );
	}

	public ICFGenKbSecGroupObj readSecGroup( CFGenKbSecGroupPKey pkey, boolean forceRead ) {
		ICFGenKbSecGroupObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbSecGroupBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGroupId() );
			if( readBuff != null ) {
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecGroupObj readCachedSecGroup( CFGenKbSecGroupPKey pkey ) {
		ICFGenKbSecGroupObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGroup( ICFGenKbSecGroupObj obj )
	{
		final String S_ProcName = "CFGenKbSecGroupTableObj.reallyDeepDisposeSecGroup() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbSecGroupPKey pkey = obj.getPKey();
		ICFGenKbSecGroupObj existing = readCachedSecGroup( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbSecGroupByClusterIdxKey keyClusterIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		CFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		keyClusterVisIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyClusterVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		CFGenKbSecGroupByUNameIdxKey keyUNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getSecGroupFormTableObj().deepDisposeSecGroupFormByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByIncludeIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpMembTableObj().deepDisposeSecGrpMembByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );

		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByClusterVisIdx != null ) {
			if( indexByClusterVisIdx.containsKey( keyClusterVisIdx ) ) {
				indexByClusterVisIdx.get( keyClusterVisIdx ).remove( pkey );
				if( indexByClusterVisIdx.get( keyClusterVisIdx ).size() <= 0 ) {
					indexByClusterVisIdx.remove( keyClusterVisIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeSecGroup( CFGenKbSecGroupPKey pkey ) {
		ICFGenKbSecGroupObj obj = readCachedSecGroup( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSecGroupObj lockSecGroup( CFGenKbSecGroupPKey pkey ) {
		ICFGenKbSecGroupObj locked = null;
		CFGenKbSecGroupBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGroupTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbSecGroupObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSecGroup", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbSecGroupObj> readAllSecGroup() {
		return( readAllSecGroup( false ) );
	}

	public List<ICFGenKbSecGroupObj> readAllSecGroup( boolean forceRead ) {
		final String S_ProcName = "readAllSecGroup";
		if( ( allSecGroup == null ) || forceRead ) {
			Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> map = new HashMap<CFGenKbSecGroupPKey,ICFGenKbSecGroupObj>();
			allSecGroup = map;
			CFGenKbSecGroupBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readAllDerived( schema.getAuthorization() );
			CFGenKbSecGroupBuff buff;
			ICFGenKbSecGroupObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecGroupObj realised = (ICFGenKbSecGroupObj)obj.realise();
			}
		}
		int len = allSecGroup.size();
		ICFGenKbSecGroupObj arr[] = new ICFGenKbSecGroupObj[len];
		Iterator<ICFGenKbSecGroupObj> valIter = allSecGroup.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecGroupObj> arrayList = new ArrayList<ICFGenKbSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecGroupObj> cmp = new Comparator<ICFGenKbSecGroupObj>() {
			public int compare( ICFGenKbSecGroupObj lhs, ICFGenKbSecGroupObj rhs ) {
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
					CFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecGroupObj> readCachedAllSecGroup() {
		final String S_ProcName = "readCachedAllSecGroup";
		ArrayList<ICFGenKbSecGroupObj> arrayList = new ArrayList<ICFGenKbSecGroupObj>();
		if( allSecGroup != null ) {
			int len = allSecGroup.size();
			ICFGenKbSecGroupObj arr[] = new ICFGenKbSecGroupObj[len];
			Iterator<ICFGenKbSecGroupObj> valIter = allSecGroup.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
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
		Comparator<ICFGenKbSecGroupObj> cmp = new Comparator<ICFGenKbSecGroupObj>() {
			public int compare( ICFGenKbSecGroupObj lhs, ICFGenKbSecGroupObj rhs ) {
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
					CFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGroupByIdIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public ICFGenKbSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId, boolean forceRead )
	{
		CFGenKbSecGroupPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		ICFGenKbSecGroupObj obj = readSecGroup( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbSecGroupObj> readSecGroupByClusterIdx( long ClusterId )
	{
		return( readSecGroupByClusterIdx( ClusterId,
			false ) );
	}

	public List<ICFGenKbSecGroupObj> readSecGroupByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupByClusterIdx";
		CFGenKbSecGroupByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSecGroupByClusterIdxKey,
				Map< CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj>();
			ICFGenKbSecGroupObj obj;
			CFGenKbSecGroupBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			CFGenKbSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecGroupObj realised = (ICFGenKbSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecGroupObj arr[] = new ICFGenKbSecGroupObj[len];
		Iterator<ICFGenKbSecGroupObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecGroupObj> arrayList = new ArrayList<ICFGenKbSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecGroupObj> cmp = new Comparator<ICFGenKbSecGroupObj>() {
			public int compare( ICFGenKbSecGroupObj lhs, ICFGenKbSecGroupObj rhs ) {
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
					CFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		return( readSecGroupByClusterVisIdx( ClusterId,
			IsVisible,
			false ) );
	}

	public List<ICFGenKbSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupByClusterVisIdx";
		CFGenKbSecGroupByClusterVisIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> dict;
		if( indexByClusterVisIdx == null ) {
			indexByClusterVisIdx = new HashMap< CFGenKbSecGroupByClusterVisIdxKey,
				Map< CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByClusterVisIdx.containsKey( key ) ) {
			dict = indexByClusterVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj>();
			ICFGenKbSecGroupObj obj;
			CFGenKbSecGroupBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
			CFGenKbSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecGroupObj realised = (ICFGenKbSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecGroupObj arr[] = new ICFGenKbSecGroupObj[len];
		Iterator<ICFGenKbSecGroupObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecGroupObj> arrayList = new ArrayList<ICFGenKbSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecGroupObj> cmp = new Comparator<ICFGenKbSecGroupObj>() {
			public int compare( ICFGenKbSecGroupObj lhs, ICFGenKbSecGroupObj rhs ) {
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
					CFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSecGroupObj readSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		return( readSecGroupByUNameIdx( ClusterId,
			Name,
			false ) );
	}

	public ICFGenKbSecGroupObj readSecGroupByUNameIdx( long ClusterId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFGenKbSecGroupByUNameIdxKey,
				ICFGenKbSecGroupObj >();
		}
		CFGenKbSecGroupByUNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		ICFGenKbSecGroupObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFGenKbSecGroupBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
			if( buff != null ) {
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecGroupObj readCachedSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		ICFGenKbSecGroupObj obj = null;
		CFGenKbSecGroupPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		obj = readCachedSecGroup( pkey );
		return( obj );
	}

	public List<ICFGenKbSecGroupObj> readCachedSecGroupByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGroupByClusterIdx";
		CFGenKbSecGroupByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<ICFGenKbSecGroupObj> arrayList = new ArrayList<ICFGenKbSecGroupObj>();
		if( indexByClusterIdx != null ) {
			Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				ICFGenKbSecGroupObj arr[] = new ICFGenKbSecGroupObj[len];
				Iterator<ICFGenKbSecGroupObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFGenKbSecGroupObj obj;
			Iterator<ICFGenKbSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecGroupObj> cmp = new Comparator<ICFGenKbSecGroupObj>() {
			public int compare( ICFGenKbSecGroupObj lhs, ICFGenKbSecGroupObj rhs ) {
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
					CFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecGroupObj> readCachedSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "readCachedSecGroupByClusterVisIdx";
		CFGenKbSecGroupByClusterVisIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		ArrayList<ICFGenKbSecGroupObj> arrayList = new ArrayList<ICFGenKbSecGroupObj>();
		if( indexByClusterVisIdx != null ) {
			Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> dict;
			if( indexByClusterVisIdx.containsKey( key ) ) {
				dict = indexByClusterVisIdx.get( key );
				int len = dict.size();
				ICFGenKbSecGroupObj arr[] = new ICFGenKbSecGroupObj[len];
				Iterator<ICFGenKbSecGroupObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFGenKbSecGroupObj obj;
			Iterator<ICFGenKbSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecGroupObj> cmp = new Comparator<ICFGenKbSecGroupObj>() {
			public int compare( ICFGenKbSecGroupObj lhs, ICFGenKbSecGroupObj rhs ) {
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
					CFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbSecGroupObj readCachedSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		ICFGenKbSecGroupObj obj = null;
		CFGenKbSecGroupByUNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbSecGroupObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbSecGroupObj> valIter = members.values().iterator();
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

	public void deepDisposeSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		ICFGenKbSecGroupObj obj = readCachedSecGroupByIdIdx( ClusterId,
				SecGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGroupByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGroupByClusterIdx";
		ICFGenKbSecGroupObj obj;
		List<ICFGenKbSecGroupObj> arrayList = readCachedSecGroupByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "deepDisposeSecGroupByClusterVisIdx";
		ICFGenKbSecGroupObj obj;
		List<ICFGenKbSecGroupObj> arrayList = readCachedSecGroupByClusterVisIdx( ClusterId,
				IsVisible );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		ICFGenKbSecGroupObj obj = readCachedSecGroupByUNameIdx( ClusterId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSecGroupObj updateSecGroup( ICFGenKbSecGroupObj Obj ) {
		ICFGenKbSecGroupObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().updateSecGroup( schema.getAuthorization(),
			Obj.getSecGroupBuff() );
		obj = (ICFGenKbSecGroupObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGroup( ICFGenKbSecGroupObj Obj ) {
		ICFGenKbSecGroupObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroup( schema.getAuthorization(),
			obj.getSecGroupBuff() );
		Obj.forget();
	}

	public void deleteSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		CFGenKbSecGroupPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		ICFGenKbSecGroupObj obj = readSecGroup( pkey );
		if( obj != null ) {
			ICFGenKbSecGroupEditObj editObj = (ICFGenKbSecGroupEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbSecGroupEditObj)obj.beginEdit();
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
		deepDisposeSecGroupByIdIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGroupByClusterIdx( long ClusterId )
	{
		CFGenKbSecGroupByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSecGroupByClusterIdxKey,
				Map< CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> dict = indexByClusterIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<ICFGenKbSecGroupObj> iter = dict.values().iterator();
			ICFGenKbSecGroupObj obj;
			List<ICFGenKbSecGroupObj> toForget = new LinkedList<ICFGenKbSecGroupObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGroupByClusterIdx( ClusterId );
	}

	public void deleteSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		CFGenKbSecGroupByClusterVisIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		if( indexByClusterVisIdx == null ) {
			indexByClusterVisIdx = new HashMap< CFGenKbSecGroupByClusterVisIdxKey,
				Map< CFGenKbSecGroupPKey, ICFGenKbSecGroupObj > >();
		}
		if( indexByClusterVisIdx.containsKey( key ) ) {
			Map<CFGenKbSecGroupPKey, ICFGenKbSecGroupObj> dict = indexByClusterVisIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
			Iterator<ICFGenKbSecGroupObj> iter = dict.values().iterator();
			ICFGenKbSecGroupObj obj;
			List<ICFGenKbSecGroupObj> toForget = new LinkedList<ICFGenKbSecGroupObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterVisIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
		}
		deepDisposeSecGroupByClusterVisIdx( ClusterId,
				IsVisible );
	}

	public void deleteSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFGenKbSecGroupByUNameIdxKey,
				ICFGenKbSecGroupObj >();
		}
		CFGenKbSecGroupByUNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		ICFGenKbSecGroupObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
		}
		deepDisposeSecGroupByUNameIdx( ClusterId,
				Name );
	}
}