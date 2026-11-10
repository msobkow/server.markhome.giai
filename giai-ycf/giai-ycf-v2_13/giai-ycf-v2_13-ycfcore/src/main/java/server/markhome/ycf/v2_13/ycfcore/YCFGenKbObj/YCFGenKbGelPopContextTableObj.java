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

public class YCFGenKbGelPopContextTableObj
	implements IYCFGenKbGelPopContextTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> allGelPopContext;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > > indexByChainIdx;
	private Map< YCFGenKbGelPopContextByRemainderIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > > indexByRemainderIdx;
	public static String TABLE_NAME = "GelPopContext";
	public static String TABLE_DBNAME = "gelpush";

	public YCFGenKbGelPopContextTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj>();
		allGelPopContext = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByRemainderIdx = null;
	}

	public YCFGenKbGelPopContextTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj>();
		allGelPopContext = null;
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
		allGelPopContext = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByRemainderIdx = null;
		List<IYCFGenKbGelPopContextObj> toForget = new LinkedList<IYCFGenKbGelPopContextObj>();
		IYCFGenKbGelPopContextObj cur = null;
		Iterator<IYCFGenKbGelPopContextObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelPopContextObj.
	 */
	public IYCFGenKbGelPopContextObj newInstance() {
		IYCFGenKbGelPopContextObj inst = new YCFGenKbGelPopContextObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelPopContextObj.
	 */
	public IYCFGenKbGelPopContextEditObj newEditInstance( IYCFGenKbGelPopContextObj orig ) {
		IYCFGenKbGelPopContextEditObj edit = new YCFGenKbGelPopContextEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelPopContextObj realiseGelPopContext( IYCFGenKbGelPopContextObj Obj ) {
		IYCFGenKbGelPopContextObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelPopContextObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelPopContextObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByRemainderIdx != null ) {
				YCFGenKbGelPopContextByRemainderIdxKey keyRemainderIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPopContext().newRemainderIdxKey();
				keyRemainderIdx.setOptionalRemainderTenantId( keepObj.getOptionalRemainderTenantId() );
				keyRemainderIdx.setRequiredRemainderGelCacheId( keepObj.getRequiredRemainderGelCacheId() );
				keyRemainderIdx.setOptionalRemainderInstId( keepObj.getOptionalRemainderInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapRemainderIdx = indexByRemainderIdx.get( keyRemainderIdx );
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
			keepObj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRemainderIdx != null ) {
				YCFGenKbGelPopContextByRemainderIdxKey keyRemainderIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPopContext().newRemainderIdxKey();
				keyRemainderIdx.setOptionalRemainderTenantId( keepObj.getOptionalRemainderTenantId() );
				keyRemainderIdx.setRequiredRemainderGelCacheId( keepObj.getRequiredRemainderGelCacheId() );
				keyRemainderIdx.setOptionalRemainderInstId( keepObj.getOptionalRemainderInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapRemainderIdx = indexByRemainderIdx.get( keyRemainderIdx );
				if( mapRemainderIdx != null ) {
					mapRemainderIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelPopContext != null ) {
				allGelPopContext.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelPopContext != null ) {
				allGelPopContext.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRemainderIdx != null ) {
				YCFGenKbGelPopContextByRemainderIdxKey keyRemainderIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPopContext().newRemainderIdxKey();
				keyRemainderIdx.setOptionalRemainderTenantId( keepObj.getOptionalRemainderTenantId() );
				keyRemainderIdx.setRequiredRemainderGelCacheId( keepObj.getRequiredRemainderGelCacheId() );
				keyRemainderIdx.setOptionalRemainderInstId( keepObj.getOptionalRemainderInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > mapRemainderIdx = indexByRemainderIdx.get( keyRemainderIdx );
				if( mapRemainderIdx != null ) {
					mapRemainderIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelPopContextObj createGelPopContext( IYCFGenKbGelPopContextObj Obj ) {
		IYCFGenKbGelPopContextObj obj = Obj;
		YCFGenKbGelPopContextBuff buff = obj.getGelPopContextBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().createGelPopContext(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a919" ) ) {
			obj = (IYCFGenKbGelPopContextObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelPopContextObj readGelPopContext( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelPopContext( pkey, false ) );
	}

	public IYCFGenKbGelPopContextObj readGelPopContext( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelPopContextObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelPopContextBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelPopContextObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelPopContextObj readCachedGelPopContext( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelPopContextObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelPopContext( IYCFGenKbGelPopContextObj obj )
	{
		final String S_ProcName = "YCFGenKbGelPopContextTableObj.reallyDeepDisposeGelPopContext() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelPopContextObj existing = readCachedGelPopContext( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelPopContextByRemainderIdxKey keyRemainderIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPopContext().newRemainderIdxKey();
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
	public void deepDisposeGelPopContext( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelPopContextObj obj = readCachedGelPopContext( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelPopContextObj lockGelPopContext( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelPopContextObj locked = null;
		YCFGenKbGelPopContextBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelPopContextObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelPopContext", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelPopContextObj> readAllGelPopContext() {
		return( readAllGelPopContext( false ) );
	}

	public List<IYCFGenKbGelPopContextObj> readAllGelPopContext( boolean forceRead ) {
		final String S_ProcName = "readAllGelPopContext";
		if( ( allGelPopContext == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelPopContextObj>();
			allGelPopContext = map;
			YCFGenKbGelPopContextBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelPopContextBuff buff;
			IYCFGenKbGelPopContextObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelPopContextObj realised = (IYCFGenKbGelPopContextObj)obj.realise();
			}
		}
		int len = allGelPopContext.size();
		IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
		Iterator<IYCFGenKbGelPopContextObj> valIter = allGelPopContext.values().iterator();
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
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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
		List<IYCFGenKbGelPopContextObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelPopContextObj> readCachedAllGelPopContext() {
		final String S_ProcName = "readCachedAllGelPopContext";
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>();
		if( allGelPopContext != null ) {
			int len = allGelPopContext.size();
			IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
			Iterator<IYCFGenKbGelPopContextObj> valIter = allGelPopContext.values().iterator();
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
		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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

	public IYCFGenKbGelPopContextObj readGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelPopContextByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelPopContextObj readGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelPopContextObj obj = readGelPopContext( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByTenantIdx( long TenantId )
	{
		return( readGelPopContextByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelPopContextByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelPopContextObj realised = (IYCFGenKbGelPopContextObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
		Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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
		List<IYCFGenKbGelPopContextObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelPopContextByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelPopContextByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelPopContextObj realised = (IYCFGenKbGelPopContextObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
		Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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
		List<IYCFGenKbGelPopContextObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelPopContextByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelPopContextByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelPopContextObj realised = (IYCFGenKbGelPopContextObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
		Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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
		List<IYCFGenKbGelPopContextObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		return( readGelPopContextByRemainderIdx( RemainderTenantId,
			RemainderGelCacheId,
			RemainderInstId,
			false ) );
	}

	public List<IYCFGenKbGelPopContextObj> readGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelPopContextByRemainderIdx";
		YCFGenKbGelPopContextByRemainderIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPopContext().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
		if( indexByRemainderIdx == null ) {
			indexByRemainderIdx = new HashMap< YCFGenKbGelPopContextByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( ( ! forceRead ) && indexByRemainderIdx.containsKey( key ) ) {
			dict = indexByRemainderIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj>();
			IYCFGenKbGelPopContextObj obj;
			YCFGenKbGelPopContextBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().readDerivedByRemainderIdx( schema.getAuthorization(),
				RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
			YCFGenKbGelPopContextBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelPopContextObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelPopContextObj realised = (IYCFGenKbGelPopContextObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRemainderIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
		Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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
		List<IYCFGenKbGelPopContextObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelPopContextObj readCachedGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelPopContextObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelPopContext( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelPopContextObj> readCachedGelPopContextByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelPopContextByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
				Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelPopContextObj obj;
			Iterator<IYCFGenKbGelPopContextObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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

	public List<IYCFGenKbGelPopContextObj> readCachedGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelPopContextByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
				Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelPopContextObj obj;
			Iterator<IYCFGenKbGelPopContextObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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

	public List<IYCFGenKbGelPopContextObj> readCachedGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelPopContextByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
				Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelPopContextObj obj;
			Iterator<IYCFGenKbGelPopContextObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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

	public List<IYCFGenKbGelPopContextObj> readCachedGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "readCachedGelPopContextByRemainderIdx";
		YCFGenKbGelPopContextByRemainderIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPopContext().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );
		ArrayList<IYCFGenKbGelPopContextObj> arrayList = new ArrayList<IYCFGenKbGelPopContextObj>();
		if( indexByRemainderIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict;
			if( indexByRemainderIdx.containsKey( key ) ) {
				dict = indexByRemainderIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelPopContextObj arr[] = new IYCFGenKbGelPopContextObj[len];
				Iterator<IYCFGenKbGelPopContextObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelPopContextObj obj;
			Iterator<IYCFGenKbGelPopContextObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelPopContextObj> cmp = new Comparator<IYCFGenKbGelPopContextObj>() {
			public int compare( IYCFGenKbGelPopContextObj lhs, IYCFGenKbGelPopContextObj rhs ) {
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

	public void deepDisposeGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelPopContextObj obj = readCachedGelPopContextByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelPopContextByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelPopContextByTenantIdx";
		IYCFGenKbGelPopContextObj obj;
		List<IYCFGenKbGelPopContextObj> arrayList = readCachedGelPopContextByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelPopContextObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelPopContextByGelCacheIdx";
		IYCFGenKbGelPopContextObj obj;
		List<IYCFGenKbGelPopContextObj> arrayList = readCachedGelPopContextByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelPopContextObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelPopContextByChainIdx";
		IYCFGenKbGelPopContextObj obj;
		List<IYCFGenKbGelPopContextObj> arrayList = readCachedGelPopContextByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelPopContextObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "deepDisposeGelPopContextByRemainderIdx";
		IYCFGenKbGelPopContextObj obj;
		List<IYCFGenKbGelPopContextObj> arrayList = readCachedGelPopContextByRemainderIdx( RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelPopContextObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelPopContextObj updateGelPopContext( IYCFGenKbGelPopContextObj Obj ) {
		IYCFGenKbGelPopContextObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().updateGelPopContext( schema.getAuthorization(),
			Obj.getGelPopContextBuff() );
		if( Obj.getClassCode().equals( "a919" ) ) {
			obj = (IYCFGenKbGelPopContextObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelPopContext( IYCFGenKbGelPopContextObj Obj ) {
		IYCFGenKbGelPopContextObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContext( schema.getAuthorization(),
			obj.getGelPopContextBuff() );
		Obj.forget();
	}

	public void deleteGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelPopContextObj obj = readGelPopContext( pkey );
		if( obj != null ) {
			IYCFGenKbGelPopContextEditObj editObj = (IYCFGenKbGelPopContextEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelPopContextEditObj)obj.beginEdit();
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
		deepDisposeGelPopContextByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelPopContextByTenantIdx( long TenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelPopContextObj> iter = dict.values().iterator();
			IYCFGenKbGelPopContextObj obj;
			List<IYCFGenKbGelPopContextObj> toForget = new LinkedList<IYCFGenKbGelPopContextObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelPopContextByTenantIdx( TenantId );
	}

	public void deleteGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelPopContextObj> iter = dict.values().iterator();
			IYCFGenKbGelPopContextObj obj;
			List<IYCFGenKbGelPopContextObj> toForget = new LinkedList<IYCFGenKbGelPopContextObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelPopContextByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelPopContextObj> iter = dict.values().iterator();
			IYCFGenKbGelPopContextObj obj;
			List<IYCFGenKbGelPopContextObj> toForget = new LinkedList<IYCFGenKbGelPopContextObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelPopContextByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		YCFGenKbGelPopContextByRemainderIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPopContext().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );
		if( indexByRemainderIdx == null ) {
			indexByRemainderIdx = new HashMap< YCFGenKbGelPopContextByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj > >();
		}
		if( indexByRemainderIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelPopContextObj> dict = indexByRemainderIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByRemainderIdx( schema.getAuthorization(),
				RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
			Iterator<IYCFGenKbGelPopContextObj> iter = dict.values().iterator();
			IYCFGenKbGelPopContextObj obj;
			List<IYCFGenKbGelPopContextObj> toForget = new LinkedList<IYCFGenKbGelPopContextObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPopContext().deleteGelPopContextByRemainderIdx( schema.getAuthorization(),
				RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
		}
		deepDisposeGelPopContextByRemainderIdx( RemainderTenantId,
				RemainderGelCacheId,
				RemainderInstId );
	}
}
