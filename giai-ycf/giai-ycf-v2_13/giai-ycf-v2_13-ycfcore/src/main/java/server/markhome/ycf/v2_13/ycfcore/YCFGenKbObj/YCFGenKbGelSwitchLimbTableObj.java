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

public class YCFGenKbGelSwitchLimbTableObj
	implements IYCFGenKbGelSwitchLimbTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> members;
	private Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> allGelSwitchLimb;
	private Map< YCFGenKbGelSwitchLimbByTenantIdxKey,
		Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > > indexByTenantIdx;
	private Map< YCFGenKbGelSwitchLimbBySwitchIdxKey,
		Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > > indexBySwitchIdx;
	public static String TABLE_NAME = "GelSwitchLimb";
	public static String TABLE_DBNAME = "gellimb";

	public YCFGenKbGelSwitchLimbTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj>();
		allGelSwitchLimb = null;
		indexByTenantIdx = null;
		indexBySwitchIdx = null;
	}

	public YCFGenKbGelSwitchLimbTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj>();
		allGelSwitchLimb = null;
		indexByTenantIdx = null;
		indexBySwitchIdx = null;
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
		allGelSwitchLimb = null;
		indexByTenantIdx = null;
		indexBySwitchIdx = null;
		List<IYCFGenKbGelSwitchLimbObj> toForget = new LinkedList<IYCFGenKbGelSwitchLimbObj>();
		IYCFGenKbGelSwitchLimbObj cur = null;
		Iterator<IYCFGenKbGelSwitchLimbObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelSwitchLimbObj.
	 */
	public IYCFGenKbGelSwitchLimbObj newInstance() {
		IYCFGenKbGelSwitchLimbObj inst = new YCFGenKbGelSwitchLimbObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelSwitchLimbObj.
	 */
	public IYCFGenKbGelSwitchLimbEditObj newEditInstance( IYCFGenKbGelSwitchLimbObj orig ) {
		IYCFGenKbGelSwitchLimbEditObj edit = new YCFGenKbGelSwitchLimbEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelSwitchLimbObj realiseGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj ) {
		IYCFGenKbGelSwitchLimbObj obj = Obj;
		YCFGenKbGelSwitchLimbPKey pkey = obj.getPKey();
		IYCFGenKbGelSwitchLimbObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelSwitchLimbObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbGelSwitchLimbByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexBySwitchIdx != null ) {
				YCFGenKbGelSwitchLimbBySwitchIdxKey keySwitchIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newSwitchIdxKey();
				keySwitchIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySwitchIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				keySwitchIdx.setRequiredGelInstId( keepObj.getRequiredGelInstId() );
				Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > mapSwitchIdx = indexBySwitchIdx.get( keySwitchIdx );
				if( mapSwitchIdx != null ) {
					mapSwitchIdx.remove( keepObj.getPKey() );
					if( mapSwitchIdx.size() <= 0 ) {
						indexBySwitchIdx.remove( keySwitchIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelSwitchLimbByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySwitchIdx != null ) {
				YCFGenKbGelSwitchLimbBySwitchIdxKey keySwitchIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newSwitchIdxKey();
				keySwitchIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySwitchIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				keySwitchIdx.setRequiredGelInstId( keepObj.getRequiredGelInstId() );
				Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > mapSwitchIdx = indexBySwitchIdx.get( keySwitchIdx );
				if( mapSwitchIdx != null ) {
					mapSwitchIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelSwitchLimb != null ) {
				allGelSwitchLimb.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelSwitchLimb != null ) {
				allGelSwitchLimb.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelSwitchLimbByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySwitchIdx != null ) {
				YCFGenKbGelSwitchLimbBySwitchIdxKey keySwitchIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newSwitchIdxKey();
				keySwitchIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySwitchIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				keySwitchIdx.setRequiredGelInstId( keepObj.getRequiredGelInstId() );
				Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > mapSwitchIdx = indexBySwitchIdx.get( keySwitchIdx );
				if( mapSwitchIdx != null ) {
					mapSwitchIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelSwitchLimbObj createGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj ) {
		IYCFGenKbGelSwitchLimbObj obj = Obj;
		YCFGenKbGelSwitchLimbBuff buff = obj.getGelSwitchLimbBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().createGelSwitchLimb(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelSwitchLimbObj readGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey ) {
		return( readGelSwitchLimb( pkey, false ) );
	}

	public IYCFGenKbGelSwitchLimbObj readGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey, boolean forceRead ) {
		IYCFGenKbGelSwitchLimbObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelSwitchLimbBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId(),
				pkey.getRequiredLimbName() );
			if( readBuff != null ) {
				obj = schema.getGelSwitchLimbTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelSwitchLimbObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelSwitchLimbObj readCachedGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey ) {
		IYCFGenKbGelSwitchLimbObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelSwitchLimb( IYCFGenKbGelSwitchLimbObj obj )
	{
		final String S_ProcName = "YCFGenKbGelSwitchLimbTableObj.reallyDeepDisposeGelSwitchLimb() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelSwitchLimbPKey pkey = obj.getPKey();
		IYCFGenKbGelSwitchLimbObj existing = readCachedGelSwitchLimb( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelSwitchLimbByTenantIdxKey keyTenantIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelSwitchLimbBySwitchIdxKey keySwitchIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newSwitchIdxKey();
		keySwitchIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySwitchIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );
		keySwitchIdx.setRequiredGelInstId( existing.getRequiredGelInstId() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexBySwitchIdx != null ) {
			if( indexBySwitchIdx.containsKey( keySwitchIdx ) ) {
				indexBySwitchIdx.get( keySwitchIdx ).remove( pkey );
				if( indexBySwitchIdx.get( keySwitchIdx ).size() <= 0 ) {
					indexBySwitchIdx.remove( keySwitchIdx );
				}
			}
		}


	}
	public void deepDisposeGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey ) {
		IYCFGenKbGelSwitchLimbObj obj = readCachedGelSwitchLimb( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelSwitchLimbObj lockGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey ) {
		IYCFGenKbGelSwitchLimbObj locked = null;
		YCFGenKbGelSwitchLimbBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getGelSwitchLimbTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelSwitchLimbObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelSwitchLimb", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readAllGelSwitchLimb() {
		return( readAllGelSwitchLimb( false ) );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readAllGelSwitchLimb( boolean forceRead ) {
		final String S_ProcName = "readAllGelSwitchLimb";
		if( ( allGelSwitchLimb == null ) || forceRead ) {
			Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> map = new HashMap<YCFGenKbGelSwitchLimbPKey,IYCFGenKbGelSwitchLimbObj>();
			allGelSwitchLimb = map;
			YCFGenKbGelSwitchLimbBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelSwitchLimbBuff buff;
			IYCFGenKbGelSwitchLimbObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSwitchLimbObj realised = (IYCFGenKbGelSwitchLimbObj)obj.realise();
			}
		}
		int len = allGelSwitchLimb.size();
		IYCFGenKbGelSwitchLimbObj arr[] = new IYCFGenKbGelSwitchLimbObj[len];
		Iterator<IYCFGenKbGelSwitchLimbObj> valIter = allGelSwitchLimb.values().iterator();
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
		ArrayList<IYCFGenKbGelSwitchLimbObj> arrayList = new ArrayList<IYCFGenKbGelSwitchLimbObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSwitchLimbObj> cmp = new Comparator<IYCFGenKbGelSwitchLimbObj>() {
			public int compare( IYCFGenKbGelSwitchLimbObj lhs, IYCFGenKbGelSwitchLimbObj rhs ) {
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
					YCFGenKbGelSwitchLimbPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelSwitchLimbPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelSwitchLimbObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readCachedAllGelSwitchLimb() {
		final String S_ProcName = "readCachedAllGelSwitchLimb";
		ArrayList<IYCFGenKbGelSwitchLimbObj> arrayList = new ArrayList<IYCFGenKbGelSwitchLimbObj>();
		if( allGelSwitchLimb != null ) {
			int len = allGelSwitchLimb.size();
			IYCFGenKbGelSwitchLimbObj arr[] = new IYCFGenKbGelSwitchLimbObj[len];
			Iterator<IYCFGenKbGelSwitchLimbObj> valIter = allGelSwitchLimb.values().iterator();
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
		Comparator<IYCFGenKbGelSwitchLimbObj> cmp = new Comparator<IYCFGenKbGelSwitchLimbObj>() {
			public int compare( IYCFGenKbGelSwitchLimbObj lhs, IYCFGenKbGelSwitchLimbObj rhs ) {
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
					YCFGenKbGelSwitchLimbPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelSwitchLimbPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbGelSwitchLimbObj readGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName )
	{
		return( readGelSwitchLimbByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			LimbName,
			false ) );
	}

	public IYCFGenKbGelSwitchLimbObj readGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName, boolean forceRead )
	{
		YCFGenKbGelSwitchLimbPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		pkey.setRequiredLimbName( LimbName );
		IYCFGenKbGelSwitchLimbObj obj = readGelSwitchLimb( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbByTenantIdx( long TenantId )
	{
		return( readGelSwitchLimbByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSwitchLimbByTenantIdx";
		YCFGenKbGelSwitchLimbByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelSwitchLimbByTenantIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj>();
			IYCFGenKbGelSwitchLimbObj obj;
			YCFGenKbGelSwitchLimbBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelSwitchLimbBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getGelSwitchLimbTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSwitchLimbObj realised = (IYCFGenKbGelSwitchLimbObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSwitchLimbObj arr[] = new IYCFGenKbGelSwitchLimbObj[len];
		Iterator<IYCFGenKbGelSwitchLimbObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSwitchLimbObj> arrayList = new ArrayList<IYCFGenKbGelSwitchLimbObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSwitchLimbObj> cmp = new Comparator<IYCFGenKbGelSwitchLimbObj>() {
			public int compare( IYCFGenKbGelSwitchLimbObj lhs, IYCFGenKbGelSwitchLimbObj rhs ) {
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
					YCFGenKbGelSwitchLimbPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelSwitchLimbPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelSwitchLimbObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelSwitchLimbBySwitchIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSwitchLimbBySwitchIdx";
		YCFGenKbGelSwitchLimbBySwitchIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newSwitchIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );
		Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> dict;
		if( indexBySwitchIdx == null ) {
			indexBySwitchIdx = new HashMap< YCFGenKbGelSwitchLimbBySwitchIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > >();
		}
		if( ( ! forceRead ) && indexBySwitchIdx.containsKey( key ) ) {
			dict = indexBySwitchIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj>();
			IYCFGenKbGelSwitchLimbObj obj;
			YCFGenKbGelSwitchLimbBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().readDerivedBySwitchIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId,
				GelInstId );
			YCFGenKbGelSwitchLimbBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getGelSwitchLimbTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSwitchLimbObj realised = (IYCFGenKbGelSwitchLimbObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySwitchIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSwitchLimbObj arr[] = new IYCFGenKbGelSwitchLimbObj[len];
		Iterator<IYCFGenKbGelSwitchLimbObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSwitchLimbObj> arrayList = new ArrayList<IYCFGenKbGelSwitchLimbObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSwitchLimbObj> cmp = new Comparator<IYCFGenKbGelSwitchLimbObj>() {
			public int compare( IYCFGenKbGelSwitchLimbObj lhs, IYCFGenKbGelSwitchLimbObj rhs ) {
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
					YCFGenKbGelSwitchLimbPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelSwitchLimbPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelSwitchLimbObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelSwitchLimbObj readCachedGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName )
	{
		IYCFGenKbGelSwitchLimbObj obj = null;
		YCFGenKbGelSwitchLimbPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		pkey.setRequiredLimbName( LimbName );
		obj = readCachedGelSwitchLimb( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readCachedGelSwitchLimbByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelSwitchLimbByTenantIdx";
		YCFGenKbGelSwitchLimbByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelSwitchLimbObj> arrayList = new ArrayList<IYCFGenKbGelSwitchLimbObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSwitchLimbObj arr[] = new IYCFGenKbGelSwitchLimbObj[len];
				Iterator<IYCFGenKbGelSwitchLimbObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSwitchLimbObj obj;
			Iterator<IYCFGenKbGelSwitchLimbObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSwitchLimbObj> cmp = new Comparator<IYCFGenKbGelSwitchLimbObj>() {
			public int compare( IYCFGenKbGelSwitchLimbObj lhs, IYCFGenKbGelSwitchLimbObj rhs ) {
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
					YCFGenKbGelSwitchLimbPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelSwitchLimbPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGelSwitchLimbObj> readCachedGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "readCachedGelSwitchLimbBySwitchIdx";
		YCFGenKbGelSwitchLimbBySwitchIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newSwitchIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );
		ArrayList<IYCFGenKbGelSwitchLimbObj> arrayList = new ArrayList<IYCFGenKbGelSwitchLimbObj>();
		if( indexBySwitchIdx != null ) {
			Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> dict;
			if( indexBySwitchIdx.containsKey( key ) ) {
				dict = indexBySwitchIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSwitchLimbObj arr[] = new IYCFGenKbGelSwitchLimbObj[len];
				Iterator<IYCFGenKbGelSwitchLimbObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSwitchLimbObj obj;
			Iterator<IYCFGenKbGelSwitchLimbObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSwitchLimbObj> cmp = new Comparator<IYCFGenKbGelSwitchLimbObj>() {
			public int compare( IYCFGenKbGelSwitchLimbObj lhs, IYCFGenKbGelSwitchLimbObj rhs ) {
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
					YCFGenKbGelSwitchLimbPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelSwitchLimbPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName )
	{
		IYCFGenKbGelSwitchLimbObj obj = readCachedGelSwitchLimbByPIdx( TenantId,
				GelCacheId,
				GelInstId,
				LimbName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelSwitchLimbByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelSwitchLimbByTenantIdx";
		IYCFGenKbGelSwitchLimbObj obj;
		List<IYCFGenKbGelSwitchLimbObj> arrayList = readCachedGelSwitchLimbByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSwitchLimbObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "deepDisposeGelSwitchLimbBySwitchIdx";
		IYCFGenKbGelSwitchLimbObj obj;
		List<IYCFGenKbGelSwitchLimbObj> arrayList = readCachedGelSwitchLimbBySwitchIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSwitchLimbObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelSwitchLimbObj updateGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj ) {
		IYCFGenKbGelSwitchLimbObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().updateGelSwitchLimb( schema.getAuthorization(),
			Obj.getGelSwitchLimbBuff() );
		obj = (IYCFGenKbGelSwitchLimbObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj ) {
		IYCFGenKbGelSwitchLimbObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().deleteGelSwitchLimb( schema.getAuthorization(),
			obj.getGelSwitchLimbBuff() );
		Obj.forget();
	}

	public void deleteGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName )
	{
		YCFGenKbGelSwitchLimbPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		pkey.setRequiredLimbName( LimbName );
		IYCFGenKbGelSwitchLimbObj obj = readGelSwitchLimb( pkey );
		if( obj != null ) {
			IYCFGenKbGelSwitchLimbEditObj editObj = (IYCFGenKbGelSwitchLimbEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelSwitchLimbEditObj)obj.beginEdit();
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
		deepDisposeGelSwitchLimbByPIdx( TenantId,
				GelCacheId,
				GelInstId,
				LimbName );
	}

	public void deleteGelSwitchLimbByTenantIdx( long TenantId )
	{
		YCFGenKbGelSwitchLimbByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelSwitchLimbByTenantIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().deleteGelSwitchLimbByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelSwitchLimbObj> iter = dict.values().iterator();
			IYCFGenKbGelSwitchLimbObj obj;
			List<IYCFGenKbGelSwitchLimbObj> toForget = new LinkedList<IYCFGenKbGelSwitchLimbObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().deleteGelSwitchLimbByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelSwitchLimbByTenantIdx( TenantId );
	}

	public void deleteGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelSwitchLimbBySwitchIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newSwitchIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );
		if( indexBySwitchIdx == null ) {
			indexBySwitchIdx = new HashMap< YCFGenKbGelSwitchLimbBySwitchIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj > >();
		}
		if( indexBySwitchIdx.containsKey( key ) ) {
			Map<YCFGenKbGelSwitchLimbPKey, IYCFGenKbGelSwitchLimbObj> dict = indexBySwitchIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().deleteGelSwitchLimbBySwitchIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId,
				GelInstId );
			Iterator<IYCFGenKbGelSwitchLimbObj> iter = dict.values().iterator();
			IYCFGenKbGelSwitchLimbObj obj;
			List<IYCFGenKbGelSwitchLimbObj> toForget = new LinkedList<IYCFGenKbGelSwitchLimbObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySwitchIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().deleteGelSwitchLimbBySwitchIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId,
				GelInstId );
		}
		deepDisposeGelSwitchLimbBySwitchIdx( TenantId,
				GelCacheId,
				GelInstId );
	}
}
