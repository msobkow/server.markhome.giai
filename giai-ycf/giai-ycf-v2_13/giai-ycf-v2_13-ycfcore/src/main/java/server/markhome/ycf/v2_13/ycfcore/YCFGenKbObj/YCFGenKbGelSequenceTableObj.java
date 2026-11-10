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

public class YCFGenKbGelSequenceTableObj
	implements IYCFGenKbGelSequenceTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> allGelSequence;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > > indexByChainIdx;
	private Map< YCFGenKbGelSequenceByFirstInstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > > indexByFirstInstIdx;
	private Map< YCFGenKbGelSequenceByLastInstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > > indexByLastInstIdx;
	public static String TABLE_NAME = "GelSequence";
	public static String TABLE_DBNAME = "gelsequence";

	public YCFGenKbGelSequenceTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj>();
		allGelSequence = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
	}

	public YCFGenKbGelSequenceTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj>();
		allGelSequence = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
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
		allGelSequence = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByFirstInstIdx = null;
		indexByLastInstIdx = null;
		List<IYCFGenKbGelSequenceObj> toForget = new LinkedList<IYCFGenKbGelSequenceObj>();
		IYCFGenKbGelSequenceObj cur = null;
		Iterator<IYCFGenKbGelSequenceObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelSequenceObj.
	 */
	public IYCFGenKbGelSequenceObj newInstance() {
		IYCFGenKbGelSequenceObj inst = new YCFGenKbGelSequenceObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelSequenceObj.
	 */
	public IYCFGenKbGelSequenceEditObj newEditInstance( IYCFGenKbGelSequenceObj orig ) {
		IYCFGenKbGelSequenceEditObj edit = new YCFGenKbGelSequenceEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelSequenceObj realiseGelSequence( IYCFGenKbGelSequenceObj Obj ) {
		IYCFGenKbGelSequenceObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelSequenceObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelSequenceObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
				if( mapFirstInstIdx != null ) {
					mapFirstInstIdx.remove( keepObj.getPKey() );
					if( mapFirstInstIdx.size() <= 0 ) {
						indexByFirstInstIdx.remove( keyFirstInstIdx );
					}
				}
			}

			if( indexByLastInstIdx != null ) {
				YCFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
				keyLastInstIdx.setOptionalLastInstTenantId( keepObj.getOptionalLastInstTenantId() );
				keyLastInstIdx.setOptionalLastInstGelCacheId( keepObj.getOptionalLastInstGelCacheId() );
				keyLastInstIdx.setOptionalLastInstId( keepObj.getOptionalLastInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					mapLastInstIdx.remove( keepObj.getPKey() );
					if( mapLastInstIdx.size() <= 0 ) {
						indexByLastInstIdx.remove( keyLastInstIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					mapLastInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelSequence != null ) {
				allGelSequence.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelSequence != null ) {
				allGelSequence.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapFirstInstIdx = indexByFirstInstIdx.get( keyFirstInstIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > mapLastInstIdx = indexByLastInstIdx.get( keyLastInstIdx );
				if( mapLastInstIdx != null ) {
					mapLastInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelSequenceObj createGelSequence( IYCFGenKbGelSequenceObj Obj ) {
		IYCFGenKbGelSequenceObj obj = Obj;
		YCFGenKbGelSequenceBuff buff = obj.getGelSequenceBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().createGelSequence(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a91d" ) ) {
			obj = (IYCFGenKbGelSequenceObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelSequenceObj readGelSequence( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelSequence( pkey, false ) );
	}

	public IYCFGenKbGelSequenceObj readGelSequence( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelSequenceObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelSequenceBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelSequenceObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelSequenceObj readCachedGelSequence( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelSequenceObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelSequence( IYCFGenKbGelSequenceObj obj )
	{
		final String S_ProcName = "YCFGenKbGelSequenceTableObj.reallyDeepDisposeGelSequence() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelSequenceObj existing = readCachedGelSequence( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		keyFirstInstIdx.setOptionalFirstInstTenantId( existing.getOptionalFirstInstTenantId() );
		keyFirstInstIdx.setOptionalFirstInstGelCacheId( existing.getOptionalFirstInstGelCacheId() );
		keyFirstInstIdx.setOptionalFirstInstId( existing.getOptionalFirstInstId() );

		YCFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		keyLastInstIdx.setOptionalLastInstTenantId( existing.getOptionalLastInstTenantId() );
		keyLastInstIdx.setOptionalLastInstGelCacheId( existing.getOptionalLastInstGelCacheId() );
		keyLastInstIdx.setOptionalLastInstId( existing.getOptionalLastInstId() );


					schema.getGelCallTableObj().deepDisposeGelCallBySeqIdx( existing.getRequiredTenantId(),
						existing.getRequiredGelCacheId(),
						existing.getRequiredGelInstId() );

		if( indexByFirstInstIdx != null ) {
			if( indexByFirstInstIdx.containsKey( keyFirstInstIdx ) ) {
				indexByFirstInstIdx.get( keyFirstInstIdx ).remove( pkey );
				if( indexByFirstInstIdx.get( keyFirstInstIdx ).size() <= 0 ) {
					indexByFirstInstIdx.remove( keyFirstInstIdx );
				}
			}
		}

		if( indexByLastInstIdx != null ) {
			if( indexByLastInstIdx.containsKey( keyLastInstIdx ) ) {
				indexByLastInstIdx.get( keyLastInstIdx ).remove( pkey );
				if( indexByLastInstIdx.get( keyLastInstIdx ).size() <= 0 ) {
					indexByLastInstIdx.remove( keyLastInstIdx );
				}
			}
		}


		schema.getGelInstructionTableObj().reallyDeepDisposeGelInstruction( obj );
	}
	public void deepDisposeGelSequence( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelSequenceObj obj = readCachedGelSequence( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelSequenceObj lockGelSequence( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelSequenceObj locked = null;
		YCFGenKbGelSequenceBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelSequenceObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelSequence", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelSequenceObj> readAllGelSequence() {
		return( readAllGelSequence( false ) );
	}

	public List<IYCFGenKbGelSequenceObj> readAllGelSequence( boolean forceRead ) {
		final String S_ProcName = "readAllGelSequence";
		if( ( allGelSequence == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelSequenceObj>();
			allGelSequence = map;
			YCFGenKbGelSequenceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelSequenceBuff buff;
			IYCFGenKbGelSequenceObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSequenceObj realised = (IYCFGenKbGelSequenceObj)obj.realise();
			}
		}
		int len = allGelSequence.size();
		IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
		Iterator<IYCFGenKbGelSequenceObj> valIter = allGelSequence.values().iterator();
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
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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
		List<IYCFGenKbGelSequenceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSequenceObj> readCachedAllGelSequence() {
		final String S_ProcName = "readCachedAllGelSequence";
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>();
		if( allGelSequence != null ) {
			int len = allGelSequence.size();
			IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
			Iterator<IYCFGenKbGelSequenceObj> valIter = allGelSequence.values().iterator();
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
		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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

	public IYCFGenKbGelSequenceObj readGelSequenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelSequenceByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelSequenceObj readGelSequenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelSequenceObj obj = readGelSequence( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByTenantIdx( long TenantId )
	{
		return( readGelSequenceByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSequenceByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSequenceObj realised = (IYCFGenKbGelSequenceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
		Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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
		List<IYCFGenKbGelSequenceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelSequenceByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSequenceByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSequenceObj realised = (IYCFGenKbGelSequenceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
		Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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
		List<IYCFGenKbGelSequenceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelSequenceByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSequenceByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSequenceObj realised = (IYCFGenKbGelSequenceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
		Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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
		List<IYCFGenKbGelSequenceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		return( readGelSequenceByFirstInstIdx( FirstInstTenantId,
			FirstInstGelCacheId,
			FirstInstId,
			false ) );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSequenceByFirstInstIdx";
		YCFGenKbGelSequenceByFirstInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
		if( indexByFirstInstIdx == null ) {
			indexByFirstInstIdx = new HashMap< YCFGenKbGelSequenceByFirstInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( ( ! forceRead ) && indexByFirstInstIdx.containsKey( key ) ) {
			dict = indexByFirstInstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj>();
			IYCFGenKbGelSequenceObj obj;
			YCFGenKbGelSequenceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
			YCFGenKbGelSequenceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSequenceObj realised = (IYCFGenKbGelSequenceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFirstInstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
		Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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
		List<IYCFGenKbGelSequenceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		return( readGelSequenceByLastInstIdx( LastInstTenantId,
			LastInstGelCacheId,
			LastInstId,
			false ) );
	}

	public List<IYCFGenKbGelSequenceObj> readGelSequenceByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSequenceByLastInstIdx";
		YCFGenKbGelSequenceByLastInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
		if( indexByLastInstIdx == null ) {
			indexByLastInstIdx = new HashMap< YCFGenKbGelSequenceByLastInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( ( ! forceRead ) && indexByLastInstIdx.containsKey( key ) ) {
			dict = indexByLastInstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj>();
			IYCFGenKbGelSequenceObj obj;
			YCFGenKbGelSequenceBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
			YCFGenKbGelSequenceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSequenceObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSequenceObj realised = (IYCFGenKbGelSequenceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLastInstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
		Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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
		List<IYCFGenKbGelSequenceObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelSequenceObj readCachedGelSequenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelSequenceObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelSequence( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelSequenceObj> readCachedGelSequenceByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelSequenceByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
				Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSequenceObj obj;
			Iterator<IYCFGenKbGelSequenceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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

	public List<IYCFGenKbGelSequenceObj> readCachedGelSequenceByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelSequenceByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
				Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSequenceObj obj;
			Iterator<IYCFGenKbGelSequenceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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

	public List<IYCFGenKbGelSequenceObj> readCachedGelSequenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelSequenceByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
				Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSequenceObj obj;
			Iterator<IYCFGenKbGelSequenceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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

	public List<IYCFGenKbGelSequenceObj> readCachedGelSequenceByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "readCachedGelSequenceByFirstInstIdx";
		YCFGenKbGelSequenceByFirstInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>();
		if( indexByFirstInstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
			if( indexByFirstInstIdx.containsKey( key ) ) {
				dict = indexByFirstInstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
				Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSequenceObj obj;
			Iterator<IYCFGenKbGelSequenceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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

	public List<IYCFGenKbGelSequenceObj> readCachedGelSequenceByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "readCachedGelSequenceByLastInstIdx";
		YCFGenKbGelSequenceByLastInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		ArrayList<IYCFGenKbGelSequenceObj> arrayList = new ArrayList<IYCFGenKbGelSequenceObj>();
		if( indexByLastInstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict;
			if( indexByLastInstIdx.containsKey( key ) ) {
				dict = indexByLastInstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSequenceObj arr[] = new IYCFGenKbGelSequenceObj[len];
				Iterator<IYCFGenKbGelSequenceObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSequenceObj obj;
			Iterator<IYCFGenKbGelSequenceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSequenceObj> cmp = new Comparator<IYCFGenKbGelSequenceObj>() {
			public int compare( IYCFGenKbGelSequenceObj lhs, IYCFGenKbGelSequenceObj rhs ) {
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

	public void deepDisposeGelSequenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelSequenceObj obj = readCachedGelSequenceByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelSequenceByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelSequenceByTenantIdx";
		IYCFGenKbGelSequenceObj obj;
		List<IYCFGenKbGelSequenceObj> arrayList = readCachedGelSequenceByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSequenceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSequenceByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelSequenceByGelCacheIdx";
		IYCFGenKbGelSequenceObj obj;
		List<IYCFGenKbGelSequenceObj> arrayList = readCachedGelSequenceByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSequenceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSequenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelSequenceByChainIdx";
		IYCFGenKbGelSequenceObj obj;
		List<IYCFGenKbGelSequenceObj> arrayList = readCachedGelSequenceByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSequenceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSequenceByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "deepDisposeGelSequenceByFirstInstIdx";
		IYCFGenKbGelSequenceObj obj;
		List<IYCFGenKbGelSequenceObj> arrayList = readCachedGelSequenceByFirstInstIdx( FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSequenceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSequenceByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "deepDisposeGelSequenceByLastInstIdx";
		IYCFGenKbGelSequenceObj obj;
		List<IYCFGenKbGelSequenceObj> arrayList = readCachedGelSequenceByLastInstIdx( LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSequenceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelSequenceObj updateGelSequence( IYCFGenKbGelSequenceObj Obj ) {
		IYCFGenKbGelSequenceObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().updateGelSequence( schema.getAuthorization(),
			Obj.getGelSequenceBuff() );
		if( Obj.getClassCode().equals( "a91d" ) ) {
			obj = (IYCFGenKbGelSequenceObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelSequence( IYCFGenKbGelSequenceObj Obj ) {
		IYCFGenKbGelSequenceObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequence( schema.getAuthorization(),
			obj.getGelSequenceBuff() );
		Obj.forget();
	}

	public void deleteGelSequenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelSequenceObj obj = readGelSequence( pkey );
		if( obj != null ) {
			IYCFGenKbGelSequenceEditObj editObj = (IYCFGenKbGelSequenceEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelSequenceEditObj)obj.beginEdit();
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
		deepDisposeGelSequenceByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelSequenceByTenantIdx( long TenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelSequenceObj> iter = dict.values().iterator();
			IYCFGenKbGelSequenceObj obj;
			List<IYCFGenKbGelSequenceObj> toForget = new LinkedList<IYCFGenKbGelSequenceObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelSequenceByTenantIdx( TenantId );
	}

	public void deleteGelSequenceByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelSequenceObj> iter = dict.values().iterator();
			IYCFGenKbGelSequenceObj obj;
			List<IYCFGenKbGelSequenceObj> toForget = new LinkedList<IYCFGenKbGelSequenceObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelSequenceByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelSequenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelSequenceObj> iter = dict.values().iterator();
			IYCFGenKbGelSequenceObj obj;
			List<IYCFGenKbGelSequenceObj> toForget = new LinkedList<IYCFGenKbGelSequenceObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelSequenceByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelSequenceByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		YCFGenKbGelSequenceByFirstInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );
		if( indexByFirstInstIdx == null ) {
			indexByFirstInstIdx = new HashMap< YCFGenKbGelSequenceByFirstInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( indexByFirstInstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict = indexByFirstInstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
			Iterator<IYCFGenKbGelSequenceObj> iter = dict.values().iterator();
			IYCFGenKbGelSequenceObj obj;
			List<IYCFGenKbGelSequenceObj> toForget = new LinkedList<IYCFGenKbGelSequenceObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByFirstInstIdx( schema.getAuthorization(),
				FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
		}
		deepDisposeGelSequenceByFirstInstIdx( FirstInstTenantId,
				FirstInstGelCacheId,
				FirstInstId );
	}

	public void deleteGelSequenceByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		YCFGenKbGelSequenceByLastInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );
		if( indexByLastInstIdx == null ) {
			indexByLastInstIdx = new HashMap< YCFGenKbGelSequenceByLastInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj > >();
		}
		if( indexByLastInstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSequenceObj> dict = indexByLastInstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
			Iterator<IYCFGenKbGelSequenceObj> iter = dict.values().iterator();
			IYCFGenKbGelSequenceObj obj;
			List<IYCFGenKbGelSequenceObj> toForget = new LinkedList<IYCFGenKbGelSequenceObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().deleteGelSequenceByLastInstIdx( schema.getAuthorization(),
				LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
		}
		deepDisposeGelSequenceByLastInstIdx( LastInstTenantId,
				LastInstGelCacheId,
				LastInstId );
	}
}
