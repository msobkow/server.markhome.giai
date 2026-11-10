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

public class YCFGenKbGelCounterTableObj
	implements IYCFGenKbGelCounterTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> allGelCounter;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > > indexByChainIdx;
	public static String TABLE_NAME = "GelCounter";
	public static String TABLE_DBNAME = "gelcounter";

	public YCFGenKbGelCounterTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj>();
		allGelCounter = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
	}

	public YCFGenKbGelCounterTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj>();
		allGelCounter = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
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
		allGelCounter = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		List<IYCFGenKbGelCounterObj> toForget = new LinkedList<IYCFGenKbGelCounterObj>();
		IYCFGenKbGelCounterObj cur = null;
		Iterator<IYCFGenKbGelCounterObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelCounterObj.
	 */
	public IYCFGenKbGelCounterObj newInstance() {
		IYCFGenKbGelCounterObj inst = new YCFGenKbGelCounterObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelCounterObj.
	 */
	public IYCFGenKbGelCounterEditObj newEditInstance( IYCFGenKbGelCounterObj orig ) {
		IYCFGenKbGelCounterEditObj edit = new YCFGenKbGelCounterEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelCounterObj realiseGelCounter( IYCFGenKbGelCounterObj Obj ) {
		IYCFGenKbGelCounterObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelCounterObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelCounterObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					indexByGelCacheIdx.remove( keyGelCacheIdx );
				}
			}

			if( indexByChainIdx != null ) {
				YCFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					mapGelCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainIdx != null ) {
				YCFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelCounter != null ) {
				allGelCounter.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelCounter != null ) {
				allGelCounter.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					mapGelCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainIdx != null ) {
				YCFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelCounterObj createGelCounter( IYCFGenKbGelCounterObj Obj ) {
		IYCFGenKbGelCounterObj obj = Obj;
		YCFGenKbGelCounterBuff buff = obj.getGelCounterBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().createGelCounter(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a92d" ) ) {
			obj = (IYCFGenKbGelCounterObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelCounterObj readGelCounter( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelCounter( pkey, false ) );
	}

	public IYCFGenKbGelCounterObj readGelCounter( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelCounterObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelCounterBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelCounterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelCounterObj readCachedGelCounter( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelCounterObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelCounter( IYCFGenKbGelCounterObj obj )
	{
		final String S_ProcName = "YCFGenKbGelCounterTableObj.reallyDeepDisposeGelCounter() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelCounterObj existing = readCachedGelCounter( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );



		schema.getGelInstructionTableObj().reallyDeepDisposeGelInstruction( obj );
	}
	public void deepDisposeGelCounter( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelCounterObj obj = readCachedGelCounter( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelCounterObj lockGelCounter( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelCounterObj locked = null;
		YCFGenKbGelCounterBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelCounterObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelCounter", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelCounterObj> readAllGelCounter() {
		return( readAllGelCounter( false ) );
	}

	public List<IYCFGenKbGelCounterObj> readAllGelCounter( boolean forceRead ) {
		final String S_ProcName = "readAllGelCounter";
		if( ( allGelCounter == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelCounterObj>();
			allGelCounter = map;
			YCFGenKbGelCounterBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelCounterBuff buff;
			IYCFGenKbGelCounterObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCounterObj realised = (IYCFGenKbGelCounterObj)obj.realise();
			}
		}
		int len = allGelCounter.size();
		IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
		Iterator<IYCFGenKbGelCounterObj> valIter = allGelCounter.values().iterator();
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
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelCounterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCounterObj> readCachedAllGelCounter() {
		final String S_ProcName = "readCachedAllGelCounter";
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>();
		if( allGelCounter != null ) {
			int len = allGelCounter.size();
			IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
			Iterator<IYCFGenKbGelCounterObj> valIter = allGelCounter.values().iterator();
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
		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbGelCounterObj readGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelCounterByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelCounterObj readGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelCounterObj obj = readGelCounter( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelCounterObj> readGelCounterByTenantIdx( long TenantId )
	{
		return( readGelCounterByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelCounterObj> readGelCounterByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCounterByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCounterObj realised = (IYCFGenKbGelCounterObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
		Iterator<IYCFGenKbGelCounterObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelCounterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCounterObj> readGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelCounterByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelCounterObj> readGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCounterByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCounterObj realised = (IYCFGenKbGelCounterObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
		Iterator<IYCFGenKbGelCounterObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelCounterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCounterObj> readGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelCounterByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelCounterObj> readGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCounterByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCounterObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCounterObj realised = (IYCFGenKbGelCounterObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
		Iterator<IYCFGenKbGelCounterObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelCounterObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelCounterObj readCachedGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelCounterObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelCounter( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelCounterObj> readCachedGelCounterByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelCounterByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
				Iterator<IYCFGenKbGelCounterObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCounterObj obj;
			Iterator<IYCFGenKbGelCounterObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGelCounterObj> readCachedGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelCounterByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
				Iterator<IYCFGenKbGelCounterObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCounterObj obj;
			Iterator<IYCFGenKbGelCounterObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGelCounterObj> readCachedGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelCounterByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelCounterObj> arrayList = new ArrayList<IYCFGenKbGelCounterObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCounterObj arr[] = new IYCFGenKbGelCounterObj[len];
				Iterator<IYCFGenKbGelCounterObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCounterObj obj;
			Iterator<IYCFGenKbGelCounterObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCounterObj> cmp = new Comparator<IYCFGenKbGelCounterObj>() {
			public int compare( IYCFGenKbGelCounterObj lhs, IYCFGenKbGelCounterObj rhs ) {
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
					YCFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					YCFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelCounterObj obj = readCachedGelCounterByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelCounterByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelCounterByTenantIdx";
		IYCFGenKbGelCounterObj obj;
		List<IYCFGenKbGelCounterObj> arrayList = readCachedGelCounterByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCounterObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelCounterByGelCacheIdx";
		IYCFGenKbGelCounterObj obj;
		List<IYCFGenKbGelCounterObj> arrayList = readCachedGelCounterByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCounterObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelCounterByChainIdx";
		IYCFGenKbGelCounterObj obj;
		List<IYCFGenKbGelCounterObj> arrayList = readCachedGelCounterByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCounterObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelCounterObj updateGelCounter( IYCFGenKbGelCounterObj Obj ) {
		IYCFGenKbGelCounterObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().updateGelCounter( schema.getAuthorization(),
			Obj.getGelCounterBuff() );
		if( Obj.getClassCode().equals( "a92d" ) ) {
			obj = (IYCFGenKbGelCounterObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelCounter( IYCFGenKbGelCounterObj Obj ) {
		IYCFGenKbGelCounterObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().deleteGelCounter( schema.getAuthorization(),
			obj.getGelCounterBuff() );
		Obj.forget();
	}

	public void deleteGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelCounterObj obj = readGelCounter( pkey );
		if( obj != null ) {
			IYCFGenKbGelCounterEditObj editObj = (IYCFGenKbGelCounterEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelCounterEditObj)obj.beginEdit();
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
		deepDisposeGelCounterByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelCounterByTenantIdx( long TenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().deleteGelCounterByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelCounterObj> iter = dict.values().iterator();
			IYCFGenKbGelCounterObj obj;
			List<IYCFGenKbGelCounterObj> toForget = new LinkedList<IYCFGenKbGelCounterObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().deleteGelCounterByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelCounterByTenantIdx( TenantId );
	}

	public void deleteGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().deleteGelCounterByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelCounterObj> iter = dict.values().iterator();
			IYCFGenKbGelCounterObj obj;
			List<IYCFGenKbGelCounterObj> toForget = new LinkedList<IYCFGenKbGelCounterObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGelCacheIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().deleteGelCounterByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelCounterByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCounterObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().deleteGelCounterByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelCounterObj> iter = dict.values().iterator();
			IYCFGenKbGelCounterObj obj;
			List<IYCFGenKbGelCounterObj> toForget = new LinkedList<IYCFGenKbGelCounterObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByChainIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCounter().deleteGelCounterByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelCounterByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}
}
