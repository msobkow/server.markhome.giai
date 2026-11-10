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

public class YCFGenKbGelModifierTableObj
	implements IYCFGenKbGelModifierTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> allGelModifier;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > > indexByChainIdx;
	private Map< YCFGenKbGelModifierByRemainderIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > > indexByRemainderIdx;
	public static String TABLE_NAME = "GelModifier";
	public static String TABLE_DBNAME = "gelmodifier";

	public YCFGenKbGelModifierTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj>();
		allGelModifier = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByRemainderIdx = null;
	}

	public YCFGenKbGelModifierTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj>();
		allGelModifier = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByRemainderIdx = null;
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
		allGelModifier = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByRemainderIdx = null;
		List<IYCFGenKbGelModifierObj> toForget = new LinkedList<IYCFGenKbGelModifierObj>();
		IYCFGenKbGelModifierObj cur = null;
		Iterator<IYCFGenKbGelModifierObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelModifierObj.
	 */
	public IYCFGenKbGelModifierObj newInstance() {
		IYCFGenKbGelModifierObj inst = new YCFGenKbGelModifierObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelModifierObj.
	 */
	public IYCFGenKbGelModifierEditObj newEditInstance( IYCFGenKbGelModifierObj orig ) {
		IYCFGenKbGelModifierEditObj edit = new YCFGenKbGelModifierEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelModifierObj realiseGelModifier( IYCFGenKbGelModifierObj Obj ) {
		IYCFGenKbGelModifierObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelModifierObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelModifierObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByRemainderIdx != null ) {
				YCFGenKbGelModifierByRemainderIdxKey keyRemainderIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newRemainderIdxKey();
				keyRemainderIdx.setOptionalRemainderTenantId( keepObj.getOptionalRemainderTenantId() );
				keyRemainderIdx.setRequiredRemainderGelCacheId( keepObj.getRequiredRemainderGelCacheId() );
				keyRemainderIdx.setOptionalRemainderInstId( keepObj.getOptionalRemainderInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapRemainderIdx = indexByRemainderIdx.get( keyRemainderIdx );
				if( mapRemainderIdx != null ) {
					mapRemainderIdx.remove( keepObj.getPKey() );
					if( mapRemainderIdx.size() <= 0 ) {
						indexByRemainderIdx.remove( keyRemainderIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRemainderIdx != null ) {
				YCFGenKbGelModifierByRemainderIdxKey keyRemainderIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newRemainderIdxKey();
				keyRemainderIdx.setOptionalRemainderTenantId( keepObj.getOptionalRemainderTenantId() );
				keyRemainderIdx.setRequiredRemainderGelCacheId( keepObj.getRequiredRemainderGelCacheId() );
				keyRemainderIdx.setOptionalRemainderInstId( keepObj.getOptionalRemainderInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapRemainderIdx = indexByRemainderIdx.get( keyRemainderIdx );
				if( mapRemainderIdx != null ) {
					mapRemainderIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelModifier != null ) {
				allGelModifier.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelModifier != null ) {
				allGelModifier.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRemainderIdx != null ) {
				YCFGenKbGelModifierByRemainderIdxKey keyRemainderIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newRemainderIdxKey();
				keyRemainderIdx.setOptionalRemainderTenantId( keepObj.getOptionalRemainderTenantId() );
				keyRemainderIdx.setRequiredRemainderGelCacheId( keepObj.getRequiredRemainderGelCacheId() );
				keyRemainderIdx.setOptionalRemainderInstId( keepObj.getOptionalRemainderInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > mapRemainderIdx = indexByRemainderIdx.get( keyRemainderIdx );
				if( mapRemainderIdx != null ) {
					mapRemainderIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelModifierObj createGelModifier( IYCFGenKbGelModifierObj Obj ) {
		IYCFGenKbGelModifierObj obj = Obj;
		YCFGenKbGelModifierBuff buff = obj.getGelModifierBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().createGelModifier(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a930" ) ) {
			obj = (IYCFGenKbGelModifierObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelModifierObj readGelModifier( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelModifier( pkey, false ) );
	}

	public IYCFGenKbGelModifierObj readGelModifier( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelModifierObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelModifierBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelModifierObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelModifierObj readCachedGelModifier( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelModifierObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelModifier( IYCFGenKbGelModifierObj obj )
	{
		final String S_ProcName = "YCFGenKbGelModifierTableObj.reallyDeepDisposeGelModifier() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelModifierObj existing = readCachedGelModifier( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelModifierByRemainderIdxKey keyRemainderIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newRemainderIdxKey();
		keyRemainderIdx.setOptionalRemainderTenantId( existing.getOptionalRemainderTenantId() );
		keyRemainderIdx.setRequiredRemainderGelCacheId( existing.getRequiredRemainderGelCacheId() );
		keyRemainderIdx.setOptionalRemainderInstId( existing.getOptionalRemainderInstId() );


					schema.getGelInstructionTableObj().deepDisposeGelInstructionByPIdx( existing.getOptionalRemainderTenantId(),
						existing.getRequiredRemainderGelCacheId(),
						existing.getOptionalRemainderInstId() );

		if( indexByRemainderIdx != null ) {
			if( indexByRemainderIdx.containsKey( keyRemainderIdx ) ) {
				indexByRemainderIdx.get( keyRemainderIdx ).remove( pkey );
				if( indexByRemainderIdx.get( keyRemainderIdx ).size() <= 0 ) {
					indexByRemainderIdx.remove( keyRemainderIdx );
				}
			}
		}


		schema.getGelInstructionTableObj().reallyDeepDisposeGelInstruction( obj );
	}
	public void deepDisposeGelModifier( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelModifierObj obj = readCachedGelModifier( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelModifierObj lockGelModifier( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelModifierObj locked = null;
		YCFGenKbGelModifierBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelModifierObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelModifier", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelModifierObj> readAllGelModifier() {
		return( readAllGelModifier( false ) );
	}

	public List<IYCFGenKbGelModifierObj> readAllGelModifier( boolean forceRead ) {
		final String S_ProcName = "readAllGelModifier";
		if( ( allGelModifier == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelModifierObj>();
			allGelModifier = map;
			YCFGenKbGelModifierBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelModifierBuff buff;
			IYCFGenKbGelModifierObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelModifierObj realised = (IYCFGenKbGelModifierObj)obj.realise();
			}
		}
		int len = allGelModifier.size();
		IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
		Iterator<IYCFGenKbGelModifierObj> valIter = allGelModifier.values().iterator();
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
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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
		List<IYCFGenKbGelModifierObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelModifierObj> readCachedAllGelModifier() {
		final String S_ProcName = "readCachedAllGelModifier";
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>();
		if( allGelModifier != null ) {
			int len = allGelModifier.size();
			IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
			Iterator<IYCFGenKbGelModifierObj> valIter = allGelModifier.values().iterator();
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
		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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

	public IYCFGenKbGelModifierObj readGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelModifierByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelModifierObj readGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelModifierObj obj = readGelModifier( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByTenantIdx( long TenantId )
	{
		return( readGelModifierByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelModifierByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelModifierObj realised = (IYCFGenKbGelModifierObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
		Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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
		List<IYCFGenKbGelModifierObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelModifierByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelModifierByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelModifierObj realised = (IYCFGenKbGelModifierObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
		Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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
		List<IYCFGenKbGelModifierObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelModifierByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelModifierByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelModifierObj realised = (IYCFGenKbGelModifierObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
		Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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
		List<IYCFGenKbGelModifierObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		return( readGelModifierByRemainderIdx( RemainderTenantId,
			RemainderGelCacheId,
			RemainderInstId,
			false ) );
	}

	public List<IYCFGenKbGelModifierObj> readGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelModifierByRemainderIdx";
		YCFGenKbGelModifierByRemainderIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
		if( indexByRemainderIdx == null ) {
			indexByRemainderIdx = new HashMap< YCFGenKbGelModifierByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( ( ! forceRead ) && indexByRemainderIdx.containsKey( key ) ) {
			dict = indexByRemainderIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj>();
			IYCFGenKbGelModifierObj obj;
			YCFGenKbGelModifierBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().readDerivedByRemainderIdx( schema.getAuthorization(),
				RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
			YCFGenKbGelModifierBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelModifierObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelModifierObj realised = (IYCFGenKbGelModifierObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRemainderIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
		Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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
		List<IYCFGenKbGelModifierObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelModifierObj readCachedGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelModifierObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelModifier( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelModifierObj> readCachedGelModifierByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelModifierByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
				Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelModifierObj obj;
			Iterator<IYCFGenKbGelModifierObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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

	public List<IYCFGenKbGelModifierObj> readCachedGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelModifierByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
				Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelModifierObj obj;
			Iterator<IYCFGenKbGelModifierObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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

	public List<IYCFGenKbGelModifierObj> readCachedGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelModifierByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
				Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelModifierObj obj;
			Iterator<IYCFGenKbGelModifierObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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

	public List<IYCFGenKbGelModifierObj> readCachedGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "readCachedGelModifierByRemainderIdx";
		YCFGenKbGelModifierByRemainderIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );
		ArrayList<IYCFGenKbGelModifierObj> arrayList = new ArrayList<IYCFGenKbGelModifierObj>();
		if( indexByRemainderIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict;
			if( indexByRemainderIdx.containsKey( key ) ) {
				dict = indexByRemainderIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelModifierObj arr[] = new IYCFGenKbGelModifierObj[len];
				Iterator<IYCFGenKbGelModifierObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelModifierObj obj;
			Iterator<IYCFGenKbGelModifierObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelModifierObj> cmp = new Comparator<IYCFGenKbGelModifierObj>() {
			public int compare( IYCFGenKbGelModifierObj lhs, IYCFGenKbGelModifierObj rhs ) {
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

	public void deepDisposeGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelModifierObj obj = readCachedGelModifierByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelModifierByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelModifierByTenantIdx";
		IYCFGenKbGelModifierObj obj;
		List<IYCFGenKbGelModifierObj> arrayList = readCachedGelModifierByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelModifierObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelModifierByGelCacheIdx";
		IYCFGenKbGelModifierObj obj;
		List<IYCFGenKbGelModifierObj> arrayList = readCachedGelModifierByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelModifierObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelModifierByChainIdx";
		IYCFGenKbGelModifierObj obj;
		List<IYCFGenKbGelModifierObj> arrayList = readCachedGelModifierByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelModifierObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "deepDisposeGelModifierByRemainderIdx";
		IYCFGenKbGelModifierObj obj;
		List<IYCFGenKbGelModifierObj> arrayList = readCachedGelModifierByRemainderIdx( RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelModifierObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelModifierObj updateGelModifier( IYCFGenKbGelModifierObj Obj ) {
		IYCFGenKbGelModifierObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().updateGelModifier( schema.getAuthorization(),
			Obj.getGelModifierBuff() );
		if( Obj.getClassCode().equals( "a930" ) ) {
			obj = (IYCFGenKbGelModifierObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelModifier( IYCFGenKbGelModifierObj Obj ) {
		IYCFGenKbGelModifierObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifier( schema.getAuthorization(),
			obj.getGelModifierBuff() );
		Obj.forget();
	}

	public void deleteGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelModifierObj obj = readGelModifier( pkey );
		if( obj != null ) {
			IYCFGenKbGelModifierEditObj editObj = (IYCFGenKbGelModifierEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelModifierEditObj)obj.beginEdit();
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
		deepDisposeGelModifierByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelModifierByTenantIdx( long TenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelModifierObj> iter = dict.values().iterator();
			IYCFGenKbGelModifierObj obj;
			List<IYCFGenKbGelModifierObj> toForget = new LinkedList<IYCFGenKbGelModifierObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelModifierByTenantIdx( TenantId );
	}

	public void deleteGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelModifierObj> iter = dict.values().iterator();
			IYCFGenKbGelModifierObj obj;
			List<IYCFGenKbGelModifierObj> toForget = new LinkedList<IYCFGenKbGelModifierObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelModifierByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelModifierObj> iter = dict.values().iterator();
			IYCFGenKbGelModifierObj obj;
			List<IYCFGenKbGelModifierObj> toForget = new LinkedList<IYCFGenKbGelModifierObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelModifierByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		YCFGenKbGelModifierByRemainderIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelModifier().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );
		if( indexByRemainderIdx == null ) {
			indexByRemainderIdx = new HashMap< YCFGenKbGelModifierByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj > >();
		}
		if( indexByRemainderIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelModifierObj> dict = indexByRemainderIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByRemainderIdx( schema.getAuthorization(),
				RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
			Iterator<IYCFGenKbGelModifierObj> iter = dict.values().iterator();
			IYCFGenKbGelModifierObj obj;
			List<IYCFGenKbGelModifierObj> toForget = new LinkedList<IYCFGenKbGelModifierObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRemainderIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelModifier().deleteGelModifierByRemainderIdx( schema.getAuthorization(),
				RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
		}
		deepDisposeGelModifierByRemainderIdx( RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
	}
}
