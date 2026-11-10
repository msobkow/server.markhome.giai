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

public class YCFGenKbTSecGroupTableObj
	implements IYCFGenKbTSecGroupTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> members;
	private Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> allTSecGroup;
	private Map< YCFGenKbTSecGroupByTenantIdxKey,
		Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > > indexByTenantIdx;
	private Map< YCFGenKbTSecGroupByTenantVisIdxKey,
		Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > > indexByTenantVisIdx;
	private Map< YCFGenKbTSecGroupByUNameIdxKey,
		IYCFGenKbTSecGroupObj > indexByUNameIdx;
	public static String TABLE_NAME = "TSecGroup";
	public static String TABLE_DBNAME = "tsecgrp";

	public YCFGenKbTSecGroupTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj>();
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
		indexByUNameIdx = null;
	}

	public YCFGenKbTSecGroupTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj>();
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
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
		allTSecGroup = null;
		indexByTenantIdx = null;
		indexByTenantVisIdx = null;
		indexByUNameIdx = null;
		List<IYCFGenKbTSecGroupObj> toForget = new LinkedList<IYCFGenKbTSecGroupObj>();
		IYCFGenKbTSecGroupObj cur = null;
		Iterator<IYCFGenKbTSecGroupObj> iter = members.values().iterator();
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
	 *	YCFGenKbTSecGroupObj.
	 */
	public IYCFGenKbTSecGroupObj newInstance() {
		IYCFGenKbTSecGroupObj inst = new YCFGenKbTSecGroupObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbTSecGroupObj.
	 */
	public IYCFGenKbTSecGroupEditObj newEditInstance( IYCFGenKbTSecGroupObj orig ) {
		IYCFGenKbTSecGroupEditObj edit = new YCFGenKbTSecGroupEditObj( orig );
		return( edit );
	}

	public IYCFGenKbTSecGroupObj realiseTSecGroup( IYCFGenKbTSecGroupObj Obj ) {
		IYCFGenKbTSecGroupObj obj = Obj;
		YCFGenKbTSecGroupPKey pkey = obj.getPKey();
		IYCFGenKbTSecGroupObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbTSecGroupObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbTSecGroupByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByTenantVisIdx != null ) {
				YCFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.remove( keepObj.getPKey() );
					if( mapTenantVisIdx.size() <= 0 ) {
						indexByTenantVisIdx.remove( keyTenantVisIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbTSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbTSecGroupByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTenantVisIdx != null ) {
				YCFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbTSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
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
				YCFGenKbTSecGroupByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTenantVisIdx != null ) {
				YCFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
				keyTenantVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTenantVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > mapTenantVisIdx = indexByTenantVisIdx.get( keyTenantVisIdx );
				if( mapTenantVisIdx != null ) {
					mapTenantVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbTSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbTSecGroupObj createTSecGroup( IYCFGenKbTSecGroupObj Obj ) {
		IYCFGenKbTSecGroupObj obj = Obj;
		YCFGenKbTSecGroupBuff buff = obj.getTSecGroupBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().createTSecGroup(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbTSecGroupObj readTSecGroup( YCFGenKbTSecGroupPKey pkey ) {
		return( readTSecGroup( pkey, false ) );
	}

	public IYCFGenKbTSecGroupObj readTSecGroup( YCFGenKbTSecGroupPKey pkey, boolean forceRead ) {
		IYCFGenKbTSecGroupObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbTSecGroupBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGroupId() );
			if( readBuff != null ) {
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbTSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTSecGroupObj readCachedTSecGroup( YCFGenKbTSecGroupPKey pkey ) {
		IYCFGenKbTSecGroupObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGroup( IYCFGenKbTSecGroupObj obj )
	{
		final String S_ProcName = "YCFGenKbTSecGroupTableObj.reallyDeepDisposeTSecGroup() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbTSecGroupPKey pkey = obj.getPKey();
		IYCFGenKbTSecGroupObj existing = readCachedTSecGroup( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbTSecGroupByTenantIdxKey keyTenantIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		keyTenantVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTenantVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFGenKbTSecGroupByUNameIdxKey keyUNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
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
	public void deepDisposeTSecGroup( YCFGenKbTSecGroupPKey pkey ) {
		IYCFGenKbTSecGroupObj obj = readCachedTSecGroup( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbTSecGroupObj lockTSecGroup( YCFGenKbTSecGroupPKey pkey ) {
		IYCFGenKbTSecGroupObj locked = null;
		YCFGenKbTSecGroupBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGroupTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbTSecGroupObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTSecGroup", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbTSecGroupObj> readAllTSecGroup() {
		return( readAllTSecGroup( false ) );
	}

	public List<IYCFGenKbTSecGroupObj> readAllTSecGroup( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGroup";
		if( ( allTSecGroup == null ) || forceRead ) {
			Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> map = new HashMap<YCFGenKbTSecGroupPKey,IYCFGenKbTSecGroupObj>();
			allTSecGroup = map;
			YCFGenKbTSecGroupBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readAllDerived( schema.getAuthorization() );
			YCFGenKbTSecGroupBuff buff;
			IYCFGenKbTSecGroupObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGroupObj realised = (IYCFGenKbTSecGroupObj)obj.realise();
			}
		}
		int len = allTSecGroup.size();
		IYCFGenKbTSecGroupObj arr[] = new IYCFGenKbTSecGroupObj[len];
		Iterator<IYCFGenKbTSecGroupObj> valIter = allTSecGroup.values().iterator();
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
		ArrayList<IYCFGenKbTSecGroupObj> arrayList = new ArrayList<IYCFGenKbTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGroupObj> cmp = new Comparator<IYCFGenKbTSecGroupObj>() {
			public int compare( IYCFGenKbTSecGroupObj lhs, IYCFGenKbTSecGroupObj rhs ) {
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
					YCFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGroupObj> readCachedAllTSecGroup() {
		final String S_ProcName = "readCachedAllTSecGroup";
		ArrayList<IYCFGenKbTSecGroupObj> arrayList = new ArrayList<IYCFGenKbTSecGroupObj>();
		if( allTSecGroup != null ) {
			int len = allTSecGroup.size();
			IYCFGenKbTSecGroupObj arr[] = new IYCFGenKbTSecGroupObj[len];
			Iterator<IYCFGenKbTSecGroupObj> valIter = allTSecGroup.values().iterator();
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
		Comparator<IYCFGenKbTSecGroupObj> cmp = new Comparator<IYCFGenKbTSecGroupObj>() {
			public int compare( IYCFGenKbTSecGroupObj lhs, IYCFGenKbTSecGroupObj rhs ) {
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
					YCFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGroupByIdIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public IYCFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId, boolean forceRead )
	{
		YCFGenKbTSecGroupPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		IYCFGenKbTSecGroupObj obj = readTSecGroup( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId )
	{
		return( readTSecGroupByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGroupByTenantIdx";
		YCFGenKbTSecGroupByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbTSecGroupByTenantIdxKey,
				Map< YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj>();
			IYCFGenKbTSecGroupObj obj;
			YCFGenKbTSecGroupBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbTSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGroupObj realised = (IYCFGenKbTSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGroupObj arr[] = new IYCFGenKbTSecGroupObj[len];
		Iterator<IYCFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGroupObj> arrayList = new ArrayList<IYCFGenKbTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGroupObj> cmp = new Comparator<IYCFGenKbTSecGroupObj>() {
			public int compare( IYCFGenKbTSecGroupObj lhs, IYCFGenKbTSecGroupObj rhs ) {
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
					YCFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		return( readTSecGroupByTenantVisIdx( TenantId,
			IsVisible,
			false ) );
	}

	public List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGroupByTenantVisIdx";
		YCFGenKbTSecGroupByTenantVisIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> dict;
		if( indexByTenantVisIdx == null ) {
			indexByTenantVisIdx = new HashMap< YCFGenKbTSecGroupByTenantVisIdxKey,
				Map< YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByTenantVisIdx.containsKey( key ) ) {
			dict = indexByTenantVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj>();
			IYCFGenKbTSecGroupObj obj;
			YCFGenKbTSecGroupBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
			YCFGenKbTSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbTSecGroupObj realised = (IYCFGenKbTSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbTSecGroupObj arr[] = new IYCFGenKbTSecGroupObj[len];
		Iterator<IYCFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbTSecGroupObj> arrayList = new ArrayList<IYCFGenKbTSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbTSecGroupObj> cmp = new Comparator<IYCFGenKbTSecGroupObj>() {
			public int compare( IYCFGenKbTSecGroupObj lhs, IYCFGenKbTSecGroupObj rhs ) {
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
					YCFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbTSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbTSecGroupObj readTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		return( readTSecGroupByUNameIdx( TenantId,
			Name,
			false ) );
	}

	public IYCFGenKbTSecGroupObj readTSecGroupByUNameIdx( long TenantId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFGenKbTSecGroupByUNameIdxKey,
				IYCFGenKbTSecGroupObj >();
		}
		YCFGenKbTSecGroupByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFGenKbTSecGroupObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFGenKbTSecGroupBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			if( buff != null ) {
				obj = schema.getTSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbTSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbTSecGroupObj readCachedTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		IYCFGenKbTSecGroupObj obj = null;
		YCFGenKbTSecGroupPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		obj = readCachedTSecGroup( pkey );
		return( obj );
	}

	public List<IYCFGenKbTSecGroupObj> readCachedTSecGroupByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGroupByTenantIdx";
		YCFGenKbTSecGroupByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbTSecGroupObj> arrayList = new ArrayList<IYCFGenKbTSecGroupObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGroupObj arr[] = new IYCFGenKbTSecGroupObj[len];
				Iterator<IYCFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGroupObj obj;
			Iterator<IYCFGenKbTSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGroupObj> cmp = new Comparator<IYCFGenKbTSecGroupObj>() {
			public int compare( IYCFGenKbTSecGroupObj lhs, IYCFGenKbTSecGroupObj rhs ) {
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
					YCFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbTSecGroupObj> readCachedTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "readCachedTSecGroupByTenantVisIdx";
		YCFGenKbTSecGroupByTenantVisIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		ArrayList<IYCFGenKbTSecGroupObj> arrayList = new ArrayList<IYCFGenKbTSecGroupObj>();
		if( indexByTenantVisIdx != null ) {
			Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> dict;
			if( indexByTenantVisIdx.containsKey( key ) ) {
				dict = indexByTenantVisIdx.get( key );
				int len = dict.size();
				IYCFGenKbTSecGroupObj arr[] = new IYCFGenKbTSecGroupObj[len];
				Iterator<IYCFGenKbTSecGroupObj> valIter = dict.values().iterator();
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
			IYCFGenKbTSecGroupObj obj;
			Iterator<IYCFGenKbTSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbTSecGroupObj> cmp = new Comparator<IYCFGenKbTSecGroupObj>() {
			public int compare( IYCFGenKbTSecGroupObj lhs, IYCFGenKbTSecGroupObj rhs ) {
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
					YCFGenKbTSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbTSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbTSecGroupObj readCachedTSecGroupByUNameIdx( long TenantId,
		String Name )
	{
		IYCFGenKbTSecGroupObj obj = null;
		YCFGenKbTSecGroupByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbTSecGroupObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbTSecGroupObj> valIter = members.values().iterator();
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
		IYCFGenKbTSecGroupObj obj = readCachedTSecGroupByIdIdx( TenantId,
				TSecGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGroupByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGroupByTenantIdx";
		IYCFGenKbTSecGroupObj obj;
		List<IYCFGenKbTSecGroupObj> arrayList = readCachedTSecGroupByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGroupObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbTSecGroupObj obj;
		List<IYCFGenKbTSecGroupObj> arrayList = readCachedTSecGroupByTenantVisIdx( TenantId,
				IsVisible );
		if( arrayList != null )  {
			Iterator<IYCFGenKbTSecGroupObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbTSecGroupObj obj = readCachedTSecGroupByUNameIdx( TenantId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbTSecGroupObj updateTSecGroup( IYCFGenKbTSecGroupObj Obj ) {
		IYCFGenKbTSecGroupObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().updateTSecGroup( schema.getAuthorization(),
			Obj.getTSecGroupBuff() );
		obj = (IYCFGenKbTSecGroupObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGroup( IYCFGenKbTSecGroupObj Obj ) {
		IYCFGenKbTSecGroupObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroup( schema.getAuthorization(),
			obj.getTSecGroupBuff() );
		Obj.forget();
	}

	public void deleteTSecGroupByIdIdx( long TenantId,
		int TSecGroupId )
	{
		YCFGenKbTSecGroupPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGroupId( TSecGroupId );
		IYCFGenKbTSecGroupObj obj = readTSecGroup( pkey );
		if( obj != null ) {
			IYCFGenKbTSecGroupEditObj editObj = (IYCFGenKbTSecGroupEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbTSecGroupEditObj)obj.beginEdit();
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
		YCFGenKbTSecGroupByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbTSecGroupByTenantIdxKey,
				Map< YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbTSecGroupObj> iter = dict.values().iterator();
			IYCFGenKbTSecGroupObj obj;
			List<IYCFGenKbTSecGroupObj> toForget = new LinkedList<IYCFGenKbTSecGroupObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGroupByTenantIdx( TenantId );
	}

	public void deleteTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible )
	{
		YCFGenKbTSecGroupByTenantVisIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );
		if( indexByTenantVisIdx == null ) {
			indexByTenantVisIdx = new HashMap< YCFGenKbTSecGroupByTenantVisIdxKey,
				Map< YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj > >();
		}
		if( indexByTenantVisIdx.containsKey( key ) ) {
			Map<YCFGenKbTSecGroupPKey, IYCFGenKbTSecGroupObj> dict = indexByTenantVisIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantVisIdx( schema.getAuthorization(),
				TenantId,
				IsVisible );
			Iterator<IYCFGenKbTSecGroupObj> iter = dict.values().iterator();
			IYCFGenKbTSecGroupObj obj;
			List<IYCFGenKbTSecGroupObj> toForget = new LinkedList<IYCFGenKbTSecGroupObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByTenantVisIdx( schema.getAuthorization(),
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
			indexByUNameIdx = new HashMap< YCFGenKbTSecGroupByUNameIdxKey,
				IYCFGenKbTSecGroupObj >();
		}
		YCFGenKbTSecGroupByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFGenKbTSecGroupObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTSecGroup().deleteTSecGroupByUNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
		}
		deepDisposeTSecGroupByUNameIdx( TenantId,
				Name );
	}
}
