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

public class CFGenKbGelExecutableTableObj
	implements ICFGenKbGelExecutableTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> members;
	private Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> allGelExecutable;
	private Map< CFGenKbGelInstructionByTenantIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > > indexByTenantIdx;
	private Map< CFGenKbGelInstructionByGelCacheIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > > indexByGelCacheIdx;
	private Map< CFGenKbGelInstructionByChainIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > > indexByChainIdx;
	private Map< CFGenKbGelSequenceByFirstInstIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > > indexByFirstInstIdx;
	private Map< CFGenKbGelSequenceByLastInstIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > > indexByLastInstIdx;
	private Map< CFGenKbGelExecutableByGenItemIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > > indexByGenItemIdx;
	public static String TABLE_NAME = "GelExecutable";
	public static String TABLE_DBNAME = "gelexec";

	public CFGenKbGelExecutableTableObj() {
		schema = null;
		members = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
		allGelExecutable = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
		indexByGenItemIdx = null;
	}

	public CFGenKbGelExecutableTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
		allGelExecutable = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
		indexByGenItemIdx = null;
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
		allGelExecutable = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
		indexByGenItemIdx = null;
		List<ICFGenKbGelExecutableObj> toForget = new LinkedList<ICFGenKbGelExecutableObj>();
		ICFGenKbGelExecutableObj cur = null;
		Iterator<ICFGenKbGelExecutableObj> iter = members.values().iterator();
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
	 *	CFGenKbGelExecutableObj.
	 */
	public ICFGenKbGelExecutableObj newInstance() {
		ICFGenKbGelExecutableObj inst = new CFGenKbGelExecutableObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbGelExecutableObj.
	 */
	public ICFGenKbGelExecutableEditObj newEditInstance( ICFGenKbGelExecutableObj orig ) {
		ICFGenKbGelExecutableEditObj edit = new CFGenKbGelExecutableEditObj( orig );
		return( edit );
	}

	public ICFGenKbGelExecutableObj realiseGelExecutable( ICFGenKbGelExecutableObj Obj ) {
		ICFGenKbGelExecutableObj obj = Obj;
		CFGenKbGelInstructionPKey pkey = obj.getPKey();
		ICFGenKbGelExecutableObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbGelExecutableObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					indexByGelCacheIdx.remove( keyGelCacheIdx );
				}
			}

			if( indexByChainIdx != null ) {
				CFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByFirstInstIdx != null ) {
				CFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
				keyFirstInstIdx.setOptionalFirstInstTenantId( keepObj.getOptionalFirstInstTenantId() );
				keyFirstInstIdx.setOptionalFirstInstGelCacheId( keepObj.getOptionalFirstInstGelCacheId() );
				keyFirstInstIdx.setOptionalFirstInstId( keepObj.getOptionalFirstInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
				if( mapFirstInstIdx != null ) {
					indexByFirstInstIdx.remove( keyFirstInstIdx );
				}
			}

			if( indexByLastInstIdx != null ) {
				CFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
				keyLastInstIdx.setOptionalLastInstTenantId( keepObj.getOptionalLastInstTenantId() );
				keyLastInstIdx.setOptionalLastInstGelCacheId( keepObj.getOptionalLastInstGelCacheId() );
				keyLastInstIdx.setOptionalLastInstId( keepObj.getOptionalLastInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					indexByLastInstIdx.remove( keyLastInstIdx );
				}
			}

			if( indexByGenItemIdx != null ) {
				CFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
				keyGenItemIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGenItemIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapGenItemIdx = indexByGenItemIdx.get( keyGenItemIdx );
				if( mapGenItemIdx != null ) {
					mapGenItemIdx.remove( keepObj.getPKey() );
					if( mapGenItemIdx.size() <= 0 ) {
						indexByGenItemIdx.remove( keyGenItemIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFGenKbGelExecutableObj)schema.getGelSequenceTableObj().realiseGelSequence( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					mapGelCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainIdx != null ) {
				CFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstInstIdx != null ) {
				CFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
				keyFirstInstIdx.setOptionalFirstInstTenantId( keepObj.getOptionalFirstInstTenantId() );
				keyFirstInstIdx.setOptionalFirstInstGelCacheId( keepObj.getOptionalFirstInstGelCacheId() );
				keyFirstInstIdx.setOptionalFirstInstId( keepObj.getOptionalFirstInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
				if( mapFirstInstIdx != null ) {
					mapFirstInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastInstIdx != null ) {
				CFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
				keyLastInstIdx.setOptionalLastInstTenantId( keepObj.getOptionalLastInstTenantId() );
				keyLastInstIdx.setOptionalLastInstGelCacheId( keepObj.getOptionalLastInstGelCacheId() );
				keyLastInstIdx.setOptionalLastInstId( keepObj.getOptionalLastInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					mapLastInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenItemIdx != null ) {
				CFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
				keyGenItemIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGenItemIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapGenItemIdx = indexByGenItemIdx.get( keyGenItemIdx );
				if( mapGenItemIdx != null ) {
					mapGenItemIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelExecutable != null ) {
				allGelExecutable.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFGenKbGelExecutableObj)schema.getGelSequenceTableObj().realiseGelSequence( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelExecutable != null ) {
				allGelExecutable.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					mapGelCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainIdx != null ) {
				CFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstInstIdx != null ) {
				CFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
				keyFirstInstIdx.setOptionalFirstInstTenantId( keepObj.getOptionalFirstInstTenantId() );
				keyFirstInstIdx.setOptionalFirstInstGelCacheId( keepObj.getOptionalFirstInstGelCacheId() );
				keyFirstInstIdx.setOptionalFirstInstId( keepObj.getOptionalFirstInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
				if( mapFirstInstIdx != null ) {
					mapFirstInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastInstIdx != null ) {
				CFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
				keyLastInstIdx.setOptionalLastInstTenantId( keepObj.getOptionalLastInstTenantId() );
				keyLastInstIdx.setOptionalLastInstGelCacheId( keepObj.getOptionalLastInstGelCacheId() );
				keyLastInstIdx.setOptionalLastInstId( keepObj.getOptionalLastInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					mapLastInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenItemIdx != null ) {
				CFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
				keyGenItemIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGenItemIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > mapGenItemIdx = indexByGenItemIdx.get( keyGenItemIdx );
				if( mapGenItemIdx != null ) {
					mapGenItemIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbGelExecutableObj createGelExecutable( ICFGenKbGelExecutableObj Obj ) {
		ICFGenKbGelExecutableObj obj = Obj;
		CFGenKbGelExecutableBuff buff = obj.getGelExecutableBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().createGelExecutable(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a92e" ) ) {
			obj = (ICFGenKbGelExecutableObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbGelExecutableObj readGelExecutable( CFGenKbGelInstructionPKey pkey ) {
		return( readGelExecutable( pkey, false ) );
	}

	public ICFGenKbGelExecutableObj readGelExecutable( CFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		ICFGenKbGelExecutableObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbGelExecutableBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbGelExecutableObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbGelExecutableObj readCachedGelExecutable( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelExecutableObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelExecutable( ICFGenKbGelExecutableObj obj )
	{
		final String S_ProcName = "CFGenKbGelExecutableTableObj.reallyDeepDisposeGelExecutable() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbGelInstructionPKey pkey = obj.getPKey();
		ICFGenKbGelExecutableObj existing = readCachedGelExecutable( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
		keyGenItemIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGenItemIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );


		schema.getGelCallTableObj().deepDisposeGelCallBySeqIdx( existing.getRequiredTenantId(),
						existing.getRequiredGelCacheId(),
						existing.getRequiredGelInstId() );

		if( indexByGenItemIdx != null ) {
			if( indexByGenItemIdx.containsKey( keyGenItemIdx ) ) {
				indexByGenItemIdx.get( keyGenItemIdx ).remove( pkey );
				if( indexByGenItemIdx.get( keyGenItemIdx ).size() <= 0 ) {
					indexByGenItemIdx.remove( keyGenItemIdx );
				}
			}
		}


		schema.getGelSequenceTableObj().reallyDeepDisposeGelSequence( obj );
	}
	public void deepDisposeGelExecutable( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelExecutableObj obj = readCachedGelExecutable( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbGelExecutableObj lockGelExecutable( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelExecutableObj locked = null;
		CFGenKbGelExecutableBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbGelExecutableObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockGelExecutable", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbGelExecutableObj> readAllGelExecutable() {
		return( readAllGelExecutable( false ) );
	}

	public List<ICFGenKbGelExecutableObj> readAllGelExecutable( boolean forceRead ) {
		final String S_ProcName = "readAllGelExecutable";
		if( ( allGelExecutable == null ) || forceRead ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> map = new HashMap<CFGenKbGelInstructionPKey,ICFGenKbGelExecutableObj>();
			allGelExecutable = map;
			CFGenKbGelExecutableBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readAllDerived( schema.getAuthorization() );
			CFGenKbGelExecutableBuff buff;
			ICFGenKbGelExecutableObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelExecutableObj realised = (ICFGenKbGelExecutableObj)obj.realise();
			}
		}
		int len = allGelExecutable.size();
		ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
		Iterator<ICFGenKbGelExecutableObj> valIter = allGelExecutable.values().iterator();
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
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelExecutableObj> readCachedAllGelExecutable() {
		final String S_ProcName = "readCachedAllGelExecutable";
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>();
		if( allGelExecutable != null ) {
			int len = allGelExecutable.size();
			ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
			Iterator<ICFGenKbGelExecutableObj> valIter = allGelExecutable.values().iterator();
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
		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbGelExecutableObj readGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelExecutableByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public ICFGenKbGelExecutableObj readGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		ICFGenKbGelExecutableObj obj = readGelExecutable( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByTenantIdx( long TenantId )
	{
		return( readGelExecutableByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByTenantIdx";
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelInstructionByTenantIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelExecutableObj realised = (ICFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
		Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelExecutableByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByGelCacheIdx";
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< CFGenKbGelInstructionByGelCacheIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelExecutableObj realised = (ICFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
		Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelExecutableByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByChainIdx";
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< CFGenKbGelInstructionByChainIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelExecutableObj realised = (ICFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
		Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		return( readGelExecutableByFirstInstIdx( FirstInstTenantId,
			FirstInstGelCacheId,
			FirstInstId,
			false ) );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByFirstInstIdx";
		CFGenKbGelSequenceByFirstInstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
		if( indexByFirstInstIdx == null ) {
			indexByFirstInstIdx = new HashMap< CFGenKbGelSequenceByFirstInstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByFirstInstIdx.containsKey( key ) ) {
			dict = indexByFirstInstIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
			ICFGenKbGelSequenceObj obj;
			CFGenKbGelSequenceBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
			CFGenKbGelSequenceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelExecutableObj realised = (ICFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFirstInstIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
		Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		return( readGelExecutableByLastInstIdx( LastInstTenantId,
			LastInstGelCacheId,
			LastInstId,
			false ) );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByLastInstIdx";
		CFGenKbGelSequenceByLastInstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
		if( indexByLastInstIdx == null ) {
			indexByLastInstIdx = new HashMap< CFGenKbGelSequenceByLastInstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByLastInstIdx.containsKey( key ) ) {
			dict = indexByLastInstIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
			ICFGenKbGelSequenceObj obj;
			CFGenKbGelSequenceBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
			CFGenKbGelSequenceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelExecutableObj realised = (ICFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLastInstIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
		Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelExecutableByGenItemIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<ICFGenKbGelExecutableObj> readGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByGenItemIdx";
		CFGenKbGelExecutableByGenItemIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
		if( indexByGenItemIdx == null ) {
			indexByGenItemIdx = new HashMap< CFGenKbGelExecutableByGenItemIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByGenItemIdx.containsKey( key ) ) {
			dict = indexByGenItemIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj>();
			ICFGenKbGelExecutableObj obj;
			CFGenKbGelExecutableBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readDerivedByGenItemIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			CFGenKbGelExecutableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelExecutableObj realised = (ICFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenItemIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
		Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGelExecutableObj readCachedGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		ICFGenKbGelExecutableObj obj = null;
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelExecutable( pkey );
		return( obj );
	}

	public List<ICFGenKbGelExecutableObj> readCachedGelExecutableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelExecutableByTenantIdx";
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
				Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			ICFGenKbGelExecutableObj obj;
			Iterator<ICFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelExecutableObj> readCachedGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelExecutableByGelCacheIdx";
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>();
		if( indexByGelCacheIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
				Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			ICFGenKbGelExecutableObj obj;
			Iterator<ICFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelExecutableObj> readCachedGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelExecutableByChainIdx";
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>();
		if( indexByChainIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
				Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			ICFGenKbGelExecutableObj obj;
			Iterator<ICFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelExecutableObj> readCachedGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "readCachedGelExecutableByFirstInstIdx";
		CFGenKbGelSequenceByFirstInstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>();
		if( indexByFirstInstIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
			if( indexByFirstInstIdx.containsKey( key ) ) {
				dict = indexByFirstInstIdx.get( key );
				int len = dict.size();
				ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
				Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			ICFGenKbGelExecutableObj obj;
			Iterator<ICFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelExecutableObj> readCachedGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "readCachedGelExecutableByLastInstIdx";
		CFGenKbGelSequenceByLastInstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>();
		if( indexByLastInstIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
			if( indexByLastInstIdx.containsKey( key ) ) {
				dict = indexByLastInstIdx.get( key );
				int len = dict.size();
				ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
				Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			ICFGenKbGelExecutableObj obj;
			Iterator<ICFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelExecutableObj> readCachedGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelExecutableByGenItemIdx";
		CFGenKbGelExecutableByGenItemIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<ICFGenKbGelExecutableObj> arrayList = new ArrayList<ICFGenKbGelExecutableObj>();
		if( indexByGenItemIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict;
			if( indexByGenItemIdx.containsKey( key ) ) {
				dict = indexByGenItemIdx.get( key );
				int len = dict.size();
				ICFGenKbGelExecutableObj arr[] = new ICFGenKbGelExecutableObj[len];
				Iterator<ICFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			ICFGenKbGelExecutableObj obj;
			Iterator<ICFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelExecutableObj> cmp = new Comparator<ICFGenKbGelExecutableObj>() {
			public int compare( ICFGenKbGelExecutableObj lhs, ICFGenKbGelExecutableObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		ICFGenKbGelExecutableObj obj = readCachedGelExecutableByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelExecutableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelExecutableByTenantIdx";
		ICFGenKbGelExecutableObj obj;
		List<ICFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelExecutableByGelCacheIdx";
		ICFGenKbGelExecutableObj obj;
		List<ICFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelExecutableByChainIdx";
		ICFGenKbGelExecutableObj obj;
		List<ICFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "deepDisposeGelExecutableByFirstInstIdx";
		ICFGenKbGelExecutableObj obj;
		List<ICFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByFirstInstIdx( FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "deepDisposeGelExecutableByLastInstIdx";
		ICFGenKbGelExecutableObj obj;
		List<ICFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByLastInstIdx( LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelExecutableByGenItemIdx";
		ICFGenKbGelExecutableObj obj;
		List<ICFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByGenItemIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbGelExecutableObj updateGelExecutable( ICFGenKbGelExecutableObj Obj ) {
		ICFGenKbGelExecutableObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().updateGelExecutable( schema.getAuthorization(),
			Obj.getGelExecutableBuff() );
		if( Obj.getClassCode().equals( "a92e" ) ) {
			obj = (ICFGenKbGelExecutableObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelExecutable( ICFGenKbGelExecutableObj Obj ) {
		ICFGenKbGelExecutableObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutable( schema.getAuthorization(),
			obj.getGelExecutableBuff() );
		Obj.forget();
	}

	public void deleteGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		ICFGenKbGelExecutableObj obj = readGelExecutable( pkey );
		if( obj != null ) {
			ICFGenKbGelExecutableEditObj editObj = (ICFGenKbGelExecutableEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbGelExecutableEditObj)obj.beginEdit();
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
		deepDisposeGelExecutableByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelExecutableByTenantIdx( long TenantId )
	{
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelInstructionByTenantIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbGelExecutableObj> iter = dict.values().iterator();
			ICFGenKbGelExecutableObj obj;
			List<ICFGenKbGelExecutableObj> toForget = new LinkedList<ICFGenKbGelExecutableObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelExecutableByTenantIdx( TenantId );
	}

	public void deleteGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< CFGenKbGelInstructionByGelCacheIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict = indexByGelCacheIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<ICFGenKbGelExecutableObj> iter = dict.values().iterator();
			ICFGenKbGelExecutableObj obj;
			List<ICFGenKbGelExecutableObj> toForget = new LinkedList<ICFGenKbGelExecutableObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelExecutableByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< CFGenKbGelInstructionByChainIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict = indexByChainIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<ICFGenKbGelExecutableObj> iter = dict.values().iterator();
			ICFGenKbGelExecutableObj obj;
			List<ICFGenKbGelExecutableObj> toForget = new LinkedList<ICFGenKbGelExecutableObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelExecutableByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		CFGenKbGelSequenceByFirstInstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		if( indexByFirstInstIdx == null ) {
			indexByFirstInstIdx = new HashMap< CFGenKbGelSequenceByFirstInstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( indexByFirstInstIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict = indexByFirstInstIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
			Iterator<ICFGenKbGelExecutableObj> iter = dict.values().iterator();
			ICFGenKbGelExecutableObj obj;
			List<ICFGenKbGelExecutableObj> toForget = new LinkedList<ICFGenKbGelExecutableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFirstInstIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
		}
		deepDisposeGelExecutableByFirstInstIdx( FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
	}

	public void deleteGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		CFGenKbGelSequenceByLastInstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		if( indexByLastInstIdx == null ) {
			indexByLastInstIdx = new HashMap< CFGenKbGelSequenceByLastInstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( indexByLastInstIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict = indexByLastInstIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
			Iterator<ICFGenKbGelExecutableObj> iter = dict.values().iterator();
			ICFGenKbGelExecutableObj obj;
			List<ICFGenKbGelExecutableObj> toForget = new LinkedList<ICFGenKbGelExecutableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLastInstIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
		}
		deepDisposeGelExecutableByLastInstIdx( LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
	}

	public void deleteGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId )
	{
		CFGenKbGelExecutableByGenItemIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGenItemIdx == null ) {
			indexByGenItemIdx = new HashMap< CFGenKbGelExecutableByGenItemIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj > >();
		}
		if( indexByGenItemIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelExecutableObj> dict = indexByGenItemIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGenItemIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<ICFGenKbGelExecutableObj> iter = dict.values().iterator();
			ICFGenKbGelExecutableObj obj;
			List<ICFGenKbGelExecutableObj> toForget = new LinkedList<ICFGenKbGelExecutableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGenItemIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGenItemIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelExecutableByGenItemIdx( TenantId,
				GelCacheId );
	}
}