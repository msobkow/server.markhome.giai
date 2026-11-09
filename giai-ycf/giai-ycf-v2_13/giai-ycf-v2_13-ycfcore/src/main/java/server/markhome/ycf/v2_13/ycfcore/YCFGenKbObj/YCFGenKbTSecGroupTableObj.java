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

public class CFGenKbTSecGroupTableObj
	implements ICFGenKbTSecGroupTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> members;
	private Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> allTSecGroup;
	private Map< CFGenKbTSecGroupByTenantIdxKey,
		Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > > indexByTenantIdx;
	private Map< CFGenKbTSecGroupByTenantVisIdxKey,
		Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > > indexByTenantVisIdx;
	private Map< CFGenKbTSecGroupByUNameIdxKey,
		ICFGenKbTSecGroupObj > indexByUNameIdx;
	public static String TABLE_NAME = "TSecGroup";
	public static String TABLE_DBNAME = "tsecgrp";

	public CFGenKbTSecGroupTableObj() {
		schema = null;
		members = new HashMap<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj>();
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
		indexByUNameIdx = null;
	}

	public CFGenKbTSecGroupTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj>();
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
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
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
		indexByUNameIdx = null;
		List<ICFGenKbTSecGroupObj> toForget = new LinkedList<ICFGenKbTSecGroupObj>();
		ICFGenKbTSecGroupObj cur = null;
		Iterator<ICFGenKbTSecGroupObj> iter = members.values().iterator();
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
	 *	CFGenKbTSecGroupObj.
	 */
	public ICFGenKbTSecGroupObj newInstance() {
		ICFGenKbTSecGroupObj inst = new CFGenKbTSecGroupObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbTSecGroupObj.
	 */
	public ICFGenKbTSecGroupEditObj newEditInstance( ICFGenKbTSecGroupObj orig ) {
		ICFGenKbTSecGroupEditObj edit = new CFGenKbTSecGroupEditObj( orig );
		return( edit );
	}

	public ICFGenKbTSecGroupObj realiseTSecGroup( ICFGenKbTSecGroupObj Obj ) {
		ICFGenKbTSecGroupObj obj = Obj;
		CFGenKbTSecGroupPKey pkey = obj.getPKey();
		ICFGenKbTSecGroupObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbTSecGroupObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFGenKbTSecGroupByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByTenantVisIdx != null ) {
				CFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.remove( keepObj.getPKey() );
					if( mapTenantVisIdx.size() <= 0 ) {
						indexByTenantVisIdx.remove( keyTenantVisIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFGenKbTSecGroupByUNameIdxKey keyUNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbTSecGroupByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTenantVisIdx != null ) {
				CFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFGenKbTSecGroupByUNameIdxKey keyUNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allTSecGroup != null ) {
				allTSecGroup.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTSecGroup != null ) {
				allTSecGroup.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbTSecGroupByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTenantVisIdx != null ) {
				CFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFGenKbTSecGroupByUNameIdxKey keyUNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbTSecGroupObj createTSecGroup( ICFGenKbTSecGroupObj Obj ) {
		ICFGenKbTSecGroupObj obj = Obj;
		CFGenKbTSecGroupBuff buff = obj.getTSecGroupBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().createTSecGroup(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbTSecGroupObj readTSecGroup( CFGenKbTSecGroupPKey pkey ) {
		return( readTSecGroup( pkey, false ) );
	}

	public ICFGenKbTSecGroupObj readTSecGroup( CFGenKbTSecGroupPKey pkey, boolean forceRead ) {
		ICFGenKbTSecGroupObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbTSecGroupBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGroupId() );
			if( readBuff != null ) {
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbTSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbTSecGroupObj readCachedTSecGroup( CFGenKbTSecGroupPKey pkey ) {
		ICFGenKbTSecGroupObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGroup( ICFGenKbTSecGroupObj obj )
	{
		final String S_ProcName = "CFGenKbTSecGroupTableObj.reallyDeepDisposeTSecGroup() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbTSecGroupPKey pkey = obj.getPKey();
		ICFGenKbTSecGroupObj existing = readCachedTSecGroup( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbTSecGroupByTenantIdxKey keyTenantIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		keyTenantVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTenantVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		CFGenKbTSecGroupByUNameIdxKey keyUNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getTSecGrpIncTableObj().deepDisposeTSecGrpIncByIncludeIdx( existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTSecGrpMembTableObj().deepDisposeTSecGrpMembByGroupIdx( existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTSecGrpIncTableObj().deepDisposeTSecGrpIncByGroupIdx( existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByTenantVisIdx != null ) {
			if( indexByTenantVisIdx.containsKey( keyTenantVisIdx ) ) {
				indexByTenantVisIdx.get( keyTenantVisIdx ).remove( pkey );
				if( indexByTenantVisIdx.get( keyTenantVisIdx ).size() <= 0 ) {
					indexByTenantVisIdx.remove( keyTenantVisIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeTSecGroup( CFGenKbTSecGroupPKey pkey ) {
		ICFGenKbTSecGroupObj obj = readCachedTSecGroup( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbTSecGroupObj lockTSecGroup( CFGenKbTSecGroupPKey pkey ) {
		ICFGenKbTSecGroupObj locked = null;
		CFGenKbTSecGroupBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGroupTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbTSecGroupObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockTSecGroup", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbTSecGroupObj> readAllTSecGroup() {
		return( readAllTSecGroup( false ) );
	}

	public List<ICFGenKbTSecGroupObj> readAllTSecGroup( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGroup";
		if( ( allTSecGroup == null ) || forceRead ) {
			Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> map = new HashMap<CFGenKbTSecGroupPKey,ICFGenKbTSecGroupObj>();
			allTSecGroup = map;
			CFGenKbTSecGroupBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readAllDerived( schema.getAuthorization() );
			CFGenKbTSecGroupBuff buff;
			ICFGenKbTSecGroupObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				ICFGenKbTSecGroupObj realised = (ICFGenKbTSecGroupObj)obj.realise();
			}
		}
		int len = allTSecGroup.size();
		ICFGenKbTSecGroupObj arr[] = new ICFGenKbTSecGroupObj[len];
		Iterator<ICFGenKbTSecGroupObj> valIter = allTSecGroup.values().iterator();
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
		ArrayList<ICFGenKbTSecGroupObj> arrayList = new ArrayList<ICFGenKbTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbTSecGroupObj> cmp = new Comparator<ICFGenKbTSecGroupObj>() {
			public int compare( ICFGenKbTSecGroupObj lhs, ICFGenKbTSecGroupObj rhs ) {
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
					CFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbTSecGroupObj> readCachedAllTSecGroup() {
		final String S_ProcName = "readCachedAllTSecGroup";
		ArrayList<ICFGenKbTSecGroupObj> arrayList = new ArrayList<ICFGenKbTSecGroupObj>();
		if( allTSecGroup != null ) {
			int len = allTSecGroup.size();
			ICFGenKbTSecGroupObj arr[] = new ICFGenKbTSecGroupObj[len];
			Iterator<ICFGenKbTSecGroupObj> valIter = allTSecGroup.values().iterator();
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
		Comparator<ICFGenKbTSecGroupObj> cmp = new Comparator<ICFGenKbTSecGroupObj>() {
			public int compare( ICFGenKbTSecGroupObj lhs, ICFGenKbTSecGroupObj rhs ) {
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
					CFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGroupByIdIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public ICFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId, boolean forceRead )
	{
		CFGenKbTSecGroupPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		ICFGenKbTSecGroupObj obj = readTSecGroup( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId )
	{
		return( readTSecGroupByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGroupByTenantIdx";
		CFGenKbTSecGroupByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbTSecGroupByTenantIdxKey,
				Map< CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj>();
			ICFGenKbTSecGroupObj obj;
			CFGenKbTSecGroupBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbTSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				ICFGenKbTSecGroupObj realised = (ICFGenKbTSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbTSecGroupObj arr[] = new ICFGenKbTSecGroupObj[len];
		Iterator<ICFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbTSecGroupObj> arrayList = new ArrayList<ICFGenKbTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbTSecGroupObj> cmp = new Comparator<ICFGenKbTSecGroupObj>() {
			public int compare( ICFGenKbTSecGroupObj lhs, ICFGenKbTSecGroupObj rhs ) {
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
					CFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		return( readTSecGroupByTenantVisIdx( TenantId,
			IsVisible,
			false ) );
	}

	public List<ICFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGroupByTenantVisIdx";
		CFGenKbTSecGroupByTenantVisIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> dict;
		if( indexByTenantVisIdx == null ) {
			indexByTenantVisIdx = new HashMap< CFGenKbTSecGroupByTenantVisIdxKey,
				Map< CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByTenantVisIdx.containsKey( key ) ) {
			dict = indexByTenantVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj>();
			ICFGenKbTSecGroupObj obj;
			CFGenKbTSecGroupBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
			CFGenKbTSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				ICFGenKbTSecGroupObj realised = (ICFGenKbTSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbTSecGroupObj arr[] = new ICFGenKbTSecGroupObj[len];
		Iterator<ICFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbTSecGroupObj> arrayList = new ArrayList<ICFGenKbTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbTSecGroupObj> cmp = new Comparator<ICFGenKbTSecGroupObj>() {
			public int compare( ICFGenKbTSecGroupObj lhs, ICFGenKbTSecGroupObj rhs ) {
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
					CFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbTSecGroupObj readTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		return( readTSecGroupByUNameIdx( TenantId,
			Name,
			false ) );
	}

	public ICFGenKbTSecGroupObj readTSecGroupByUNameIdx( long TenantId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFGenKbTSecGroupByUNameIdxKey,
				ICFGenKbTSecGroupObj >();
		}
		CFGenKbTSecGroupByUNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		ICFGenKbTSecGroupObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFGenKbTSecGroupBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			if( buff != null ) {
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbTSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbTSecGroupObj readCachedTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		ICFGenKbTSecGroupObj obj = null;
		CFGenKbTSecGroupPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		obj = readCachedTSecGroup( pkey );
		return( obj );
	}

	public List<ICFGenKbTSecGroupObj> readCachedTSecGroupByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGroupByTenantIdx";
		CFGenKbTSecGroupByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbTSecGroupObj> arrayList = new ArrayList<ICFGenKbTSecGroupObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbTSecGroupObj arr[] = new ICFGenKbTSecGroupObj[len];
				Iterator<ICFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
			ICFGenKbTSecGroupObj obj;
			Iterator<ICFGenKbTSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbTSecGroupObj> cmp = new Comparator<ICFGenKbTSecGroupObj>() {
			public int compare( ICFGenKbTSecGroupObj lhs, ICFGenKbTSecGroupObj rhs ) {
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
					CFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbTSecGroupObj> readCachedTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "readCachedTSecGroupByTenantVisIdx";
		CFGenKbTSecGroupByTenantVisIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		ArrayList<ICFGenKbTSecGroupObj> arrayList = new ArrayList<ICFGenKbTSecGroupObj>();
		if( indexByTenantVisIdx != null ) {
			Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> dict;
			if( indexByTenantVisIdx.containsKey( key ) ) {
				dict = indexByTenantVisIdx.get( key );
				int len = dict.size();
				ICFGenKbTSecGroupObj arr[] = new ICFGenKbTSecGroupObj[len];
				Iterator<ICFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
			ICFGenKbTSecGroupObj obj;
			Iterator<ICFGenKbTSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbTSecGroupObj> cmp = new Comparator<ICFGenKbTSecGroupObj>() {
			public int compare( ICFGenKbTSecGroupObj lhs, ICFGenKbTSecGroupObj rhs ) {
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
					CFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbTSecGroupObj readCachedTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		ICFGenKbTSecGroupObj obj = null;
		CFGenKbTSecGroupByUNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbTSecGroupObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbTSecGroupObj> valIter = members.values().iterator();
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

	public void deepDisposeTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		ICFGenKbTSecGroupObj obj = readCachedTSecGroupByIdIdx( TenantId,
				TSecGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGroupByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGroupByTenantIdx";
		ICFGenKbTSecGroupObj obj;
		List<ICFGenKbTSecGroupObj> arrayList = readCachedTSecGroupByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbTSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "deepDisposeTSecGroupByTenantVisIdx";
		ICFGenKbTSecGroupObj obj;
		List<ICFGenKbTSecGroupObj> arrayList = readCachedTSecGroupByTenantVisIdx( TenantId,
				IsVisible );
		if( arrayList != null )  {
			Iterator<ICFGenKbTSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		ICFGenKbTSecGroupObj obj = readCachedTSecGroupByUNameIdx( TenantId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbTSecGroupObj updateTSecGroup( ICFGenKbTSecGroupObj Obj ) {
		ICFGenKbTSecGroupObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().updateTSecGroup( schema.getAuthorization(),
			Obj.getTSecGroupBuff() );
		obj = (ICFGenKbTSecGroupObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGroup( ICFGenKbTSecGroupObj Obj ) {
		ICFGenKbTSecGroupObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroup( schema.getAuthorization(),
			obj.getTSecGroupBuff() );
		Obj.forget();
	}

	public void deleteTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		CFGenKbTSecGroupPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		ICFGenKbTSecGroupObj obj = readTSecGroup( pkey );
		if( obj != null ) {
			ICFGenKbTSecGroupEditObj editObj = (ICFGenKbTSecGroupEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbTSecGroupEditObj)obj.beginEdit();
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
		deepDisposeTSecGroupByIdIdx( TenantId,
				TSecGroupId );
	}

	public void deleteTSecGroupByTenantIdx( long TenantId )
	{
		CFGenKbTSecGroupByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbTSecGroupByTenantIdxKey,
				Map< CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbTSecGroupObj> iter = dict.values().iterator();
			ICFGenKbTSecGroupObj obj;
			List<ICFGenKbTSecGroupObj> toForget = new LinkedList<ICFGenKbTSecGroupObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGroupByTenantIdx( TenantId );
	}

	public void deleteTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		CFGenKbTSecGroupByTenantVisIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		if( indexByTenantVisIdx == null ) {
			indexByTenantVisIdx = new HashMap< CFGenKbTSecGroupByTenantVisIdxKey,
				Map< CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj > >();
		}
		if( indexByTenantVisIdx.containsKey( key ) ) {
			Map<CFGenKbTSecGroupPKey, ICFGenKbTSecGroupObj> dict = indexByTenantVisIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
			Iterator<ICFGenKbTSecGroupObj> iter = dict.values().iterator();
			ICFGenKbTSecGroupObj obj;
			List<ICFGenKbTSecGroupObj> toForget = new LinkedList<ICFGenKbTSecGroupObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantVisIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
		}
		deepDisposeTSecGroupByTenantVisIdx( TenantId,
				IsVisible );
	}

	public void deleteTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFGenKbTSecGroupByUNameIdxKey,
				ICFGenKbTSecGroupObj >();
		}
		CFGenKbTSecGroupByUNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		ICFGenKbTSecGroupObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
		}
		deepDisposeTSecGroupByUNameIdx( TenantId,
				Name );
	}
}