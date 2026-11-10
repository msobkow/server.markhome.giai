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

public class YCFGenKbGelBuiltinTableObj
	implements IYCFGenKbGelBuiltinTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> allGelBuiltin;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > > indexByChainIdx;
	public static String TABLE_NAME = "GelBuiltin";
	public static String TABLE_DBNAME = "gelbuiltin";

	public YCFGenKbGelBuiltinTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj>();
		allGelBuiltin = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
	}

	public YCFGenKbGelBuiltinTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj>();
		allGelBuiltin = null;
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
		allGelBuiltin = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		List<IYCFGenKbGelBuiltinObj> toForget = new LinkedList<IYCFGenKbGelBuiltinObj>();
		IYCFGenKbGelBuiltinObj cur = null;
		Iterator<IYCFGenKbGelBuiltinObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelBuiltinObj.
	 */
	public IYCFGenKbGelBuiltinObj newInstance() {
		IYCFGenKbGelBuiltinObj inst = new YCFGenKbGelBuiltinObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelBuiltinObj.
	 */
	public IYCFGenKbGelBuiltinEditObj newEditInstance( IYCFGenKbGelBuiltinObj orig ) {
		IYCFGenKbGelBuiltinEditObj edit = new YCFGenKbGelBuiltinEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelBuiltinObj realiseGelBuiltin( IYCFGenKbGelBuiltinObj Obj ) {
		IYCFGenKbGelBuiltinObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelBuiltinObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelBuiltinObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelBuiltin != null ) {
				allGelBuiltin.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelBuiltin != null ) {
				allGelBuiltin.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelBuiltinObj createGelBuiltin( IYCFGenKbGelBuiltinObj Obj ) {
		IYCFGenKbGelBuiltinObj obj = Obj;
		YCFGenKbGelBuiltinBuff buff = obj.getGelBuiltinBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().createGelBuiltin(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a92b" ) ) {
			obj = (IYCFGenKbGelBuiltinObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelBuiltinObj readGelBuiltin( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelBuiltin( pkey, false ) );
	}

	public IYCFGenKbGelBuiltinObj readGelBuiltin( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelBuiltinObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelBuiltinBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelBuiltinObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelBuiltinObj readCachedGelBuiltin( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelBuiltinObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelBuiltin( IYCFGenKbGelBuiltinObj obj )
	{
		final String S_ProcName = "YCFGenKbGelBuiltinTableObj.reallyDeepDisposeGelBuiltin() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelBuiltinObj existing = readCachedGelBuiltin( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );



		schema.getGelInstructionTableObj().reallyDeepDisposeGelInstruction( obj );
	}
	public void deepDisposeGelBuiltin( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelBuiltinObj obj = readCachedGelBuiltin( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelBuiltinObj lockGelBuiltin( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelBuiltinObj locked = null;
		YCFGenKbGelBuiltinBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelBuiltinObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelBuiltin", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelBuiltinObj> readAllGelBuiltin() {
		return( readAllGelBuiltin( false ) );
	}

	public List<IYCFGenKbGelBuiltinObj> readAllGelBuiltin( boolean forceRead ) {
		final String S_ProcName = "readAllGelBuiltin";
		if( ( allGelBuiltin == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelBuiltinObj>();
			allGelBuiltin = map;
			YCFGenKbGelBuiltinBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelBuiltinBuff buff;
			IYCFGenKbGelBuiltinObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelBuiltinObj realised = (IYCFGenKbGelBuiltinObj)obj.realise();
			}
		}
		int len = allGelBuiltin.size();
		IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
		Iterator<IYCFGenKbGelBuiltinObj> valIter = allGelBuiltin.values().iterator();
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
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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
		List<IYCFGenKbGelBuiltinObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelBuiltinObj> readCachedAllGelBuiltin() {
		final String S_ProcName = "readCachedAllGelBuiltin";
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>();
		if( allGelBuiltin != null ) {
			int len = allGelBuiltin.size();
			IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
			Iterator<IYCFGenKbGelBuiltinObj> valIter = allGelBuiltin.values().iterator();
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
		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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

	public IYCFGenKbGelBuiltinObj readGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelBuiltinByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelBuiltinObj readGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelBuiltinObj obj = readGelBuiltin( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelBuiltinObj> readGelBuiltinByTenantIdx( long TenantId )
	{
		return( readGelBuiltinByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelBuiltinObj> readGelBuiltinByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelBuiltinByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelBuiltinObj realised = (IYCFGenKbGelBuiltinObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
		Iterator<IYCFGenKbGelBuiltinObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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
		List<IYCFGenKbGelBuiltinObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelBuiltinObj> readGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelBuiltinByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelBuiltinObj> readGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelBuiltinByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelBuiltinObj realised = (IYCFGenKbGelBuiltinObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
		Iterator<IYCFGenKbGelBuiltinObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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
		List<IYCFGenKbGelBuiltinObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelBuiltinObj> readGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelBuiltinByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelBuiltinObj> readGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelBuiltinByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelBuiltinObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelBuiltinObj realised = (IYCFGenKbGelBuiltinObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
		Iterator<IYCFGenKbGelBuiltinObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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
		List<IYCFGenKbGelBuiltinObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelBuiltinObj readCachedGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelBuiltinObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelBuiltin( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelBuiltinObj> readCachedGelBuiltinByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelBuiltinByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
				Iterator<IYCFGenKbGelBuiltinObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelBuiltinObj obj;
			Iterator<IYCFGenKbGelBuiltinObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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

	public List<IYCFGenKbGelBuiltinObj> readCachedGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelBuiltinByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
				Iterator<IYCFGenKbGelBuiltinObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelBuiltinObj obj;
			Iterator<IYCFGenKbGelBuiltinObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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

	public List<IYCFGenKbGelBuiltinObj> readCachedGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelBuiltinByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelBuiltinObj> arrayList = new ArrayList<IYCFGenKbGelBuiltinObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelBuiltinObj arr[] = new IYCFGenKbGelBuiltinObj[len];
				Iterator<IYCFGenKbGelBuiltinObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelBuiltinObj obj;
			Iterator<IYCFGenKbGelBuiltinObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelBuiltinObj> cmp = new Comparator<IYCFGenKbGelBuiltinObj>() {
			public int compare( IYCFGenKbGelBuiltinObj lhs, IYCFGenKbGelBuiltinObj rhs ) {
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

	public void deepDisposeGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelBuiltinObj obj = readCachedGelBuiltinByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelBuiltinByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelBuiltinByTenantIdx";
		IYCFGenKbGelBuiltinObj obj;
		List<IYCFGenKbGelBuiltinObj> arrayList = readCachedGelBuiltinByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelBuiltinObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelBuiltinByGelCacheIdx";
		IYCFGenKbGelBuiltinObj obj;
		List<IYCFGenKbGelBuiltinObj> arrayList = readCachedGelBuiltinByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelBuiltinObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelBuiltinByChainIdx";
		IYCFGenKbGelBuiltinObj obj;
		List<IYCFGenKbGelBuiltinObj> arrayList = readCachedGelBuiltinByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelBuiltinObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelBuiltinObj updateGelBuiltin( IYCFGenKbGelBuiltinObj Obj ) {
		IYCFGenKbGelBuiltinObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().updateGelBuiltin( schema.getAuthorization(),
			Obj.getGelBuiltinBuff() );
		if( Obj.getClassCode().equals( "a92b" ) ) {
			obj = (IYCFGenKbGelBuiltinObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelBuiltin( IYCFGenKbGelBuiltinObj Obj ) {
		IYCFGenKbGelBuiltinObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().deleteGelBuiltin( schema.getAuthorization(),
			obj.getGelBuiltinBuff() );
		Obj.forget();
	}

	public void deleteGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelBuiltinObj obj = readGelBuiltin( pkey );
		if( obj != null ) {
			IYCFGenKbGelBuiltinEditObj editObj = (IYCFGenKbGelBuiltinEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelBuiltinEditObj)obj.beginEdit();
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
		deepDisposeGelBuiltinByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelBuiltinByTenantIdx( long TenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().deleteGelBuiltinByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelBuiltinObj> iter = dict.values().iterator();
			IYCFGenKbGelBuiltinObj obj;
			List<IYCFGenKbGelBuiltinObj> toForget = new LinkedList<IYCFGenKbGelBuiltinObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().deleteGelBuiltinByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelBuiltinByTenantIdx( TenantId );
	}

	public void deleteGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().deleteGelBuiltinByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelBuiltinObj> iter = dict.values().iterator();
			IYCFGenKbGelBuiltinObj obj;
			List<IYCFGenKbGelBuiltinObj> toForget = new LinkedList<IYCFGenKbGelBuiltinObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().deleteGelBuiltinByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelBuiltinByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelBuiltinObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().deleteGelBuiltinByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelBuiltinObj> iter = dict.values().iterator();
			IYCFGenKbGelBuiltinObj obj;
			List<IYCFGenKbGelBuiltinObj> toForget = new LinkedList<IYCFGenKbGelBuiltinObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelBuiltin().deleteGelBuiltinByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelBuiltinByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}
}
