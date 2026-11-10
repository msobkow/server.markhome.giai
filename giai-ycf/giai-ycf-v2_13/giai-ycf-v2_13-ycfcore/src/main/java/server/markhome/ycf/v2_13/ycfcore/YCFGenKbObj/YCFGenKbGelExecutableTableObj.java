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

public class YCFGenKbGelExecutableTableObj
	implements IYCFGenKbGelExecutableTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> allGelExecutable;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > > indexByChainIdx;
	private Map< YCFGenKbGelSequenceByFirstInstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > > indexByFirstInstIdx;
	private Map< YCFGenKbGelSequenceByLastInstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > > indexByLastInstIdx;
	private Map< YCFGenKbGelExecutableByGenItemIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > > indexByGenItemIdx;
	public static String TABLE_NAME = "GelExecutable";
	public static String TABLE_DBNAME = "gelexec";

	public YCFGenKbGelExecutableTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
		allGelExecutable = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
		indexByGenItemIdx = null;
	}

	public YCFGenKbGelExecutableTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
		allGelExecutable = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
		indexByGenItemIdx = null;
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
		allGelExecutable = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
		indexByGenItemIdx = null;
		List<IYCFGenKbGelExecutableObj> toForget = new LinkedList<IYCFGenKbGelExecutableObj>();
		IYCFGenKbGelExecutableObj cur = null;
		Iterator<IYCFGenKbGelExecutableObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelExecutableObj.
	 */
	public IYCFGenKbGelExecutableObj newInstance() {
		IYCFGenKbGelExecutableObj inst = new YCFGenKbGelExecutableObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelExecutableObj.
	 */
	public IYCFGenKbGelExecutableEditObj newEditInstance( IYCFGenKbGelExecutableObj orig ) {
		IYCFGenKbGelExecutableEditObj edit = new YCFGenKbGelExecutableEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelExecutableObj realiseGelExecutable( IYCFGenKbGelExecutableObj Obj ) {
		IYCFGenKbGelExecutableObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelExecutableObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelExecutableObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByFirstInstIdx != null ) {
				YCFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
				keyFirstInstIdx.setOptionalFirstInstTenantId( keepObj.getOptionalFirstInstTenantId() );
				keyFirstInstIdx.setOptionalFirstInstGelCacheId( keepObj.getOptionalFirstInstGelCacheId() );
				keyFirstInstIdx.setOptionalFirstInstId( keepObj.getOptionalFirstInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
				if( mapFirstInstIdx != null ) {
					indexByFirstInstIdx.remove( keyFirstInstIdx );
				}
			}

			if( indexByLastInstIdx != null ) {
				YCFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
				keyLastInstIdx.setOptionalLastInstTenantId( keepObj.getOptionalLastInstTenantId() );
				keyLastInstIdx.setOptionalLastInstGelCacheId( keepObj.getOptionalLastInstGelCacheId() );
				keyLastInstIdx.setOptionalLastInstId( keepObj.getOptionalLastInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					indexByLastInstIdx.remove( keyLastInstIdx );
				}
			}

			if( indexByGenItemIdx != null ) {
				YCFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
				keyGenItemIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGenItemIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapGenItemIdx = indexByGenItemIdx.get( keyGenItemIdx );
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
			keepObj = (IYCFGenKbGelExecutableObj)schema.getGelSequenceTableObj().realiseGelSequence( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstInstIdx != null ) {
				YCFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
				keyFirstInstIdx.setOptionalFirstInstTenantId( keepObj.getOptionalFirstInstTenantId() );
				keyFirstInstIdx.setOptionalFirstInstGelCacheId( keepObj.getOptionalFirstInstGelCacheId() );
				keyFirstInstIdx.setOptionalFirstInstId( keepObj.getOptionalFirstInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
				if( mapFirstInstIdx != null ) {
					mapFirstInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastInstIdx != null ) {
				YCFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
				keyLastInstIdx.setOptionalLastInstTenantId( keepObj.getOptionalLastInstTenantId() );
				keyLastInstIdx.setOptionalLastInstGelCacheId( keepObj.getOptionalLastInstGelCacheId() );
				keyLastInstIdx.setOptionalLastInstId( keepObj.getOptionalLastInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					mapLastInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenItemIdx != null ) {
				YCFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
				keyGenItemIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGenItemIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapGenItemIdx = indexByGenItemIdx.get( keyGenItemIdx );
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
			keepObj = (IYCFGenKbGelExecutableObj)schema.getGelSequenceTableObj().realiseGelSequence( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelExecutable != null ) {
				allGelExecutable.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstInstIdx != null ) {
				YCFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
				keyFirstInstIdx.setOptionalFirstInstTenantId( keepObj.getOptionalFirstInstTenantId() );
				keyFirstInstIdx.setOptionalFirstInstGelCacheId( keepObj.getOptionalFirstInstGelCacheId() );
				keyFirstInstIdx.setOptionalFirstInstId( keepObj.getOptionalFirstInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
				if( mapFirstInstIdx != null ) {
					mapFirstInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastInstIdx != null ) {
				YCFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
				keyLastInstIdx.setOptionalLastInstTenantId( keepObj.getOptionalLastInstTenantId() );
				keyLastInstIdx.setOptionalLastInstGelCacheId( keepObj.getOptionalLastInstGelCacheId() );
				keyLastInstIdx.setOptionalLastInstId( keepObj.getOptionalLastInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					mapLastInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenItemIdx != null ) {
				YCFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
				keyGenItemIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGenItemIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > mapGenItemIdx = indexByGenItemIdx.get( keyGenItemIdx );
				if( mapGenItemIdx != null ) {
					mapGenItemIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelExecutableObj createGelExecutable( IYCFGenKbGelExecutableObj Obj ) {
		IYCFGenKbGelExecutableObj obj = Obj;
		YCFGenKbGelExecutableBuff buff = obj.getGelExecutableBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().createGelExecutable(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a92e" ) ) {
			obj = (IYCFGenKbGelExecutableObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelExecutableObj readGelExecutable( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelExecutable( pkey, false ) );
	}

	public IYCFGenKbGelExecutableObj readGelExecutable( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelExecutableObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelExecutableBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelExecutableObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelExecutableObj readCachedGelExecutable( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelExecutableObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelExecutable( IYCFGenKbGelExecutableObj obj )
	{
		final String S_ProcName = "YCFGenKbGelExecutableTableObj.reallyDeepDisposeGelExecutable() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelExecutableObj existing = readCachedGelExecutable( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
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
	public void deepDisposeGelExecutable( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelExecutableObj obj = readCachedGelExecutable( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelExecutableObj lockGelExecutable( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelExecutableObj locked = null;
		YCFGenKbGelExecutableBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelExecutableObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelExecutable", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelExecutableObj> readAllGelExecutable() {
		return( readAllGelExecutable( false ) );
	}

	public List<IYCFGenKbGelExecutableObj> readAllGelExecutable( boolean forceRead ) {
		final String S_ProcName = "readAllGelExecutable";
		if( ( allGelExecutable == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelExecutableObj>();
			allGelExecutable = map;
			YCFGenKbGelExecutableBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelExecutableBuff buff;
			IYCFGenKbGelExecutableObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelExecutableObj realised = (IYCFGenKbGelExecutableObj)obj.realise();
			}
		}
		int len = allGelExecutable.size();
		IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
		Iterator<IYCFGenKbGelExecutableObj> valIter = allGelExecutable.values().iterator();
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
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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
		List<IYCFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelExecutableObj> readCachedAllGelExecutable() {
		final String S_ProcName = "readCachedAllGelExecutable";
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>();
		if( allGelExecutable != null ) {
			int len = allGelExecutable.size();
			IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
			Iterator<IYCFGenKbGelExecutableObj> valIter = allGelExecutable.values().iterator();
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
		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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

	public IYCFGenKbGelExecutableObj readGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelExecutableByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelExecutableObj readGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelExecutableObj obj = readGelExecutable( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByTenantIdx( long TenantId )
	{
		return( readGelExecutableByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelExecutableObj realised = (IYCFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
		Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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
		List<IYCFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelExecutableByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelExecutableObj realised = (IYCFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
		Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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
		List<IYCFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelExecutableByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelExecutableObj realised = (IYCFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
		Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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
		List<IYCFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		return( readGelExecutableByFirstInstIdx( FirstInstTenantId,
			FirstInstGelCacheId,
			FirstInstId,
			false ) );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByFirstInstIdx";
		YCFGenKbGelSequenceByFirstInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
		if( indexByFirstInstIdx == null ) {
			indexByFirstInstIdx = new HashMap< YCFGenKbGelSequenceByFirstInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByFirstInstIdx.containsKey( key ) ) {
			dict = indexByFirstInstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
			IYCFGenKbGelSequenceObj obj;
			YCFGenKbGelSequenceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
			YCFGenKbGelSequenceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelExecutableObj realised = (IYCFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFirstInstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
		Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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
		List<IYCFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		return( readGelExecutableByLastInstIdx( LastInstTenantId,
			LastInstGelCacheId,
			LastInstId,
			false ) );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByLastInstIdx";
		YCFGenKbGelSequenceByLastInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
		if( indexByLastInstIdx == null ) {
			indexByLastInstIdx = new HashMap< YCFGenKbGelSequenceByLastInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByLastInstIdx.containsKey( key ) ) {
			dict = indexByLastInstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
			IYCFGenKbGelSequenceObj obj;
			YCFGenKbGelSequenceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
			YCFGenKbGelSequenceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelExecutableObj realised = (IYCFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLastInstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
		Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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
		List<IYCFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelExecutableByGenItemIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelExecutableObj> readGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelExecutableByGenItemIdx";
		YCFGenKbGelExecutableByGenItemIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
		if( indexByGenItemIdx == null ) {
			indexByGenItemIdx = new HashMap< YCFGenKbGelExecutableByGenItemIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( ( ! forceRead ) && indexByGenItemIdx.containsKey( key ) ) {
			dict = indexByGenItemIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj>();
			IYCFGenKbGelExecutableObj obj;
			YCFGenKbGelExecutableBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readDerivedByGenItemIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelExecutableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelExecutableObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelExecutableObj realised = (IYCFGenKbGelExecutableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenItemIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
		Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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
		List<IYCFGenKbGelExecutableObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelExecutableObj readCachedGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelExecutableObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelExecutable( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelExecutableObj> readCachedGelExecutableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelExecutableByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
				Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelExecutableObj obj;
			Iterator<IYCFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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

	public List<IYCFGenKbGelExecutableObj> readCachedGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelExecutableByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
				Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelExecutableObj obj;
			Iterator<IYCFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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

	public List<IYCFGenKbGelExecutableObj> readCachedGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelExecutableByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
				Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelExecutableObj obj;
			Iterator<IYCFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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

	public List<IYCFGenKbGelExecutableObj> readCachedGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "readCachedGelExecutableByFirstInstIdx";
		YCFGenKbGelSequenceByFirstInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>();
		if( indexByFirstInstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
			if( indexByFirstInstIdx.containsKey( key ) ) {
				dict = indexByFirstInstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
				Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelExecutableObj obj;
			Iterator<IYCFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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

	public List<IYCFGenKbGelExecutableObj> readCachedGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "readCachedGelExecutableByLastInstIdx";
		YCFGenKbGelSequenceByLastInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>();
		if( indexByLastInstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
			if( indexByLastInstIdx.containsKey( key ) ) {
				dict = indexByLastInstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
				Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelExecutableObj obj;
			Iterator<IYCFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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

	public List<IYCFGenKbGelExecutableObj> readCachedGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelExecutableByGenItemIdx";
		YCFGenKbGelExecutableByGenItemIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelExecutableObj> arrayList = new ArrayList<IYCFGenKbGelExecutableObj>();
		if( indexByGenItemIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict;
			if( indexByGenItemIdx.containsKey( key ) ) {
				dict = indexByGenItemIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelExecutableObj arr[] = new IYCFGenKbGelExecutableObj[len];
				Iterator<IYCFGenKbGelExecutableObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelExecutableObj obj;
			Iterator<IYCFGenKbGelExecutableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelExecutableObj> cmp = new Comparator<IYCFGenKbGelExecutableObj>() {
			public int compare( IYCFGenKbGelExecutableObj lhs, IYCFGenKbGelExecutableObj rhs ) {
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

	public void deepDisposeGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelExecutableObj obj = readCachedGelExecutableByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelExecutableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelExecutableByTenantIdx";
		IYCFGenKbGelExecutableObj obj;
		List<IYCFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelExecutableObj obj;
		List<IYCFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelExecutableObj obj;
		List<IYCFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelExecutableObj obj;
		List<IYCFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByFirstInstIdx( FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelExecutableObj obj;
		List<IYCFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByLastInstIdx( LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelExecutableObj obj;
		List<IYCFGenKbGelExecutableObj> arrayList = readCachedGelExecutableByGenItemIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelExecutableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelExecutableObj updateGelExecutable( IYCFGenKbGelExecutableObj Obj ) {
		IYCFGenKbGelExecutableObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().updateGelExecutable( schema.getAuthorization(),
			Obj.getGelExecutableBuff() );
		if( Obj.getClassCode().equals( "a92e" ) ) {
			obj = (IYCFGenKbGelExecutableObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelExecutable( IYCFGenKbGelExecutableObj Obj ) {
		IYCFGenKbGelExecutableObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutable( schema.getAuthorization(),
			obj.getGelExecutableBuff() );
		Obj.forget();
	}

	public void deleteGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelExecutableObj obj = readGelExecutable( pkey );
		if( obj != null ) {
			IYCFGenKbGelExecutableEditObj editObj = (IYCFGenKbGelExecutableEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelExecutableEditObj)obj.beginEdit();
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
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelExecutableObj> iter = dict.values().iterator();
			IYCFGenKbGelExecutableObj obj;
			List<IYCFGenKbGelExecutableObj> toForget = new LinkedList<IYCFGenKbGelExecutableObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelExecutableByTenantIdx( TenantId );
	}

	public void deleteGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelExecutableObj> iter = dict.values().iterator();
			IYCFGenKbGelExecutableObj obj;
			List<IYCFGenKbGelExecutableObj> toForget = new LinkedList<IYCFGenKbGelExecutableObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGelCacheIdx( schema.getAuthorization(),
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
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelExecutableObj> iter = dict.values().iterator();
			IYCFGenKbGelExecutableObj obj;
			List<IYCFGenKbGelExecutableObj> toForget = new LinkedList<IYCFGenKbGelExecutableObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByChainIdx( schema.getAuthorization(),
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
		YCFGenKbGelSequenceByFirstInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		if( indexByFirstInstIdx == null ) {
			indexByFirstInstIdx = new HashMap< YCFGenKbGelSequenceByFirstInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( indexByFirstInstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict = indexByFirstInstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
			Iterator<IYCFGenKbGelExecutableObj> iter = dict.values().iterator();
			IYCFGenKbGelExecutableObj obj;
			List<IYCFGenKbGelExecutableObj> toForget = new LinkedList<IYCFGenKbGelExecutableObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByFirstInstIdx( schema.getAuthorization(),
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
		YCFGenKbGelSequenceByLastInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		if( indexByLastInstIdx == null ) {
			indexByLastInstIdx = new HashMap< YCFGenKbGelSequenceByLastInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( indexByLastInstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict = indexByLastInstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
			Iterator<IYCFGenKbGelExecutableObj> iter = dict.values().iterator();
			IYCFGenKbGelExecutableObj obj;
			List<IYCFGenKbGelExecutableObj> toForget = new LinkedList<IYCFGenKbGelExecutableObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByLastInstIdx( schema.getAuthorization(),
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
		YCFGenKbGelExecutableByGenItemIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGenItemIdx == null ) {
			indexByGenItemIdx = new HashMap< YCFGenKbGelExecutableByGenItemIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj > >();
		}
		if( indexByGenItemIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelExecutableObj> dict = indexByGenItemIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGenItemIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelExecutableObj> iter = dict.values().iterator();
			IYCFGenKbGelExecutableObj obj;
			List<IYCFGenKbGelExecutableObj> toForget = new LinkedList<IYCFGenKbGelExecutableObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().deleteGelExecutableByGenItemIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelExecutableByGenItemIdx( TenantId,
				GelCacheId );
	}
}
