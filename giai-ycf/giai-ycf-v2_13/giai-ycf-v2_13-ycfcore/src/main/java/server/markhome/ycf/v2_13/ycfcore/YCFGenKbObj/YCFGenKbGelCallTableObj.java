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

public class YCFGenKbGelCallTableObj
	implements IYCFGenKbGelCallTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> allGelCall;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexByChainIdx;
	private Map< YCFGenKbGelCallByCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexByCacheIdx;
	private Map< YCFGenKbGelCallBySeqIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexBySeqIdx;
	private Map< YCFGenKbGelCallByCallInstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexByCallInstIdx;
	private Map< YCFGenKbGelCallByPrevInstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexByPrevInstIdx;
	private Map< YCFGenKbGelCallByNextInstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > > indexByNextInstIdx;
	public static String TABLE_NAME = "GelCall";
	public static String TABLE_DBNAME = "gelcall";

	public YCFGenKbGelCallTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
		allGelCall = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByCacheIdx = null;
		indexBySeqIdx = null;
		indexByCallInstIdx = null;
		indexByPrevInstIdx = null;
		indexByNextInstIdx = null;
	}

	public YCFGenKbGelCallTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
		allGelCall = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByCacheIdx = null;
		indexBySeqIdx = null;
		indexByCallInstIdx = null;
		indexByPrevInstIdx = null;
		indexByNextInstIdx = null;
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
		allGelCall = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByCacheIdx = null;
		indexBySeqIdx = null;
		indexByCallInstIdx = null;
		indexByPrevInstIdx = null;
		indexByNextInstIdx = null;
		List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
		IYCFGenKbGelCallObj cur = null;
		Iterator<IYCFGenKbGelCallObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelCallObj.
	 */
	public IYCFGenKbGelCallObj newInstance() {
		IYCFGenKbGelCallObj inst = new YCFGenKbGelCallObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelCallObj.
	 */
	public IYCFGenKbGelCallEditObj newEditInstance( IYCFGenKbGelCallObj orig ) {
		IYCFGenKbGelCallEditObj edit = new YCFGenKbGelCallEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelCallObj realiseGelCall( IYCFGenKbGelCallObj Obj ) {
		IYCFGenKbGelCallObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelCallObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelCallObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByCacheIdx != null ) {
				YCFGenKbGelCallByCacheIdxKey keyCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCacheIdxKey();
				keyCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapCacheIdx = indexByCacheIdx.get( keyCacheIdx );
				if( mapCacheIdx != null ) {
					mapCacheIdx.remove( keepObj.getPKey() );
					if( mapCacheIdx.size() <= 0 ) {
						indexByCacheIdx.remove( keyCacheIdx );
					}
				}
			}

			if( indexBySeqIdx != null ) {
				YCFGenKbGelCallBySeqIdxKey keySeqIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newSeqIdxKey();
				keySeqIdx.setOptionalSeqInstTenantId( keepObj.getOptionalSeqInstTenantId() );
				keySeqIdx.setOptionalSeqInstGelCacheId( keepObj.getOptionalSeqInstGelCacheId() );
				keySeqIdx.setOptionalSeqInstId( keepObj.getOptionalSeqInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapSeqIdx = indexBySeqIdx.get( keySeqIdx );
				if( mapSeqIdx != null ) {
					mapSeqIdx.remove( keepObj.getPKey() );
					if( mapSeqIdx.size() <= 0 ) {
						indexBySeqIdx.remove( keySeqIdx );
					}
				}
			}

			if( indexByCallInstIdx != null ) {
				YCFGenKbGelCallByCallInstIdxKey keyCallInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCallInstIdxKey();
				keyCallInstIdx.setOptionalCallInstTenantId( keepObj.getOptionalCallInstTenantId() );
				keyCallInstIdx.setOptionalCallInstGelCacheId( keepObj.getOptionalCallInstGelCacheId() );
				keyCallInstIdx.setOptionalCallInstId( keepObj.getOptionalCallInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapCallInstIdx = indexByCallInstIdx.get( keyCallInstIdx );
				if( mapCallInstIdx != null ) {
					mapCallInstIdx.remove( keepObj.getPKey() );
					if( mapCallInstIdx.size() <= 0 ) {
						indexByCallInstIdx.remove( keyCallInstIdx );
					}
				}
			}

			if( indexByPrevInstIdx != null ) {
				YCFGenKbGelCallByPrevInstIdxKey keyPrevInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newPrevInstIdxKey();
				keyPrevInstIdx.setOptionalPrevInstTenantId( keepObj.getOptionalPrevInstTenantId() );
				keyPrevInstIdx.setOptionalPrevInstGelCacheId( keepObj.getOptionalPrevInstGelCacheId() );
				keyPrevInstIdx.setOptionalPrevInstGelInstId( keepObj.getOptionalPrevInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapPrevInstIdx = indexByPrevInstIdx.get( keyPrevInstIdx );
				if( mapPrevInstIdx != null ) {
					mapPrevInstIdx.remove( keepObj.getPKey() );
					if( mapPrevInstIdx.size() <= 0 ) {
						indexByPrevInstIdx.remove( keyPrevInstIdx );
					}
				}
			}

			if( indexByNextInstIdx != null ) {
				YCFGenKbGelCallByNextInstIdxKey keyNextInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newNextInstIdxKey();
				keyNextInstIdx.setOptionalNextInstTenantId( keepObj.getOptionalNextInstTenantId() );
				keyNextInstIdx.setOptionalNextInstGelCacheId( keepObj.getOptionalNextInstGelCacheId() );
				keyNextInstIdx.setOptionalNextInstGelInstId( keepObj.getOptionalNextInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapNextInstIdx = indexByNextInstIdx.get( keyNextInstIdx );
				if( mapNextInstIdx != null ) {
					mapNextInstIdx.remove( keepObj.getPKey() );
					if( mapNextInstIdx.size() <= 0 ) {
						indexByNextInstIdx.remove( keyNextInstIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCacheIdx != null ) {
				YCFGenKbGelCallByCacheIdxKey keyCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCacheIdxKey();
				keyCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapCacheIdx = indexByCacheIdx.get( keyCacheIdx );
				if( mapCacheIdx != null ) {
					mapCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySeqIdx != null ) {
				YCFGenKbGelCallBySeqIdxKey keySeqIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newSeqIdxKey();
				keySeqIdx.setOptionalSeqInstTenantId( keepObj.getOptionalSeqInstTenantId() );
				keySeqIdx.setOptionalSeqInstGelCacheId( keepObj.getOptionalSeqInstGelCacheId() );
				keySeqIdx.setOptionalSeqInstId( keepObj.getOptionalSeqInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapSeqIdx = indexBySeqIdx.get( keySeqIdx );
				if( mapSeqIdx != null ) {
					mapSeqIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCallInstIdx != null ) {
				YCFGenKbGelCallByCallInstIdxKey keyCallInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCallInstIdxKey();
				keyCallInstIdx.setOptionalCallInstTenantId( keepObj.getOptionalCallInstTenantId() );
				keyCallInstIdx.setOptionalCallInstGelCacheId( keepObj.getOptionalCallInstGelCacheId() );
				keyCallInstIdx.setOptionalCallInstId( keepObj.getOptionalCallInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapCallInstIdx = indexByCallInstIdx.get( keyCallInstIdx );
				if( mapCallInstIdx != null ) {
					mapCallInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevInstIdx != null ) {
				YCFGenKbGelCallByPrevInstIdxKey keyPrevInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newPrevInstIdxKey();
				keyPrevInstIdx.setOptionalPrevInstTenantId( keepObj.getOptionalPrevInstTenantId() );
				keyPrevInstIdx.setOptionalPrevInstGelCacheId( keepObj.getOptionalPrevInstGelCacheId() );
				keyPrevInstIdx.setOptionalPrevInstGelInstId( keepObj.getOptionalPrevInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapPrevInstIdx = indexByPrevInstIdx.get( keyPrevInstIdx );
				if( mapPrevInstIdx != null ) {
					mapPrevInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextInstIdx != null ) {
				YCFGenKbGelCallByNextInstIdxKey keyNextInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newNextInstIdxKey();
				keyNextInstIdx.setOptionalNextInstTenantId( keepObj.getOptionalNextInstTenantId() );
				keyNextInstIdx.setOptionalNextInstGelCacheId( keepObj.getOptionalNextInstGelCacheId() );
				keyNextInstIdx.setOptionalNextInstGelInstId( keepObj.getOptionalNextInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapNextInstIdx = indexByNextInstIdx.get( keyNextInstIdx );
				if( mapNextInstIdx != null ) {
					mapNextInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelCall != null ) {
				allGelCall.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelCall != null ) {
				allGelCall.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCacheIdx != null ) {
				YCFGenKbGelCallByCacheIdxKey keyCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCacheIdxKey();
				keyCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapCacheIdx = indexByCacheIdx.get( keyCacheIdx );
				if( mapCacheIdx != null ) {
					mapCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySeqIdx != null ) {
				YCFGenKbGelCallBySeqIdxKey keySeqIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newSeqIdxKey();
				keySeqIdx.setOptionalSeqInstTenantId( keepObj.getOptionalSeqInstTenantId() );
				keySeqIdx.setOptionalSeqInstGelCacheId( keepObj.getOptionalSeqInstGelCacheId() );
				keySeqIdx.setOptionalSeqInstId( keepObj.getOptionalSeqInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapSeqIdx = indexBySeqIdx.get( keySeqIdx );
				if( mapSeqIdx != null ) {
					mapSeqIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCallInstIdx != null ) {
				YCFGenKbGelCallByCallInstIdxKey keyCallInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCallInstIdxKey();
				keyCallInstIdx.setOptionalCallInstTenantId( keepObj.getOptionalCallInstTenantId() );
				keyCallInstIdx.setOptionalCallInstGelCacheId( keepObj.getOptionalCallInstGelCacheId() );
				keyCallInstIdx.setOptionalCallInstId( keepObj.getOptionalCallInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapCallInstIdx = indexByCallInstIdx.get( keyCallInstIdx );
				if( mapCallInstIdx != null ) {
					mapCallInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevInstIdx != null ) {
				YCFGenKbGelCallByPrevInstIdxKey keyPrevInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newPrevInstIdxKey();
				keyPrevInstIdx.setOptionalPrevInstTenantId( keepObj.getOptionalPrevInstTenantId() );
				keyPrevInstIdx.setOptionalPrevInstGelCacheId( keepObj.getOptionalPrevInstGelCacheId() );
				keyPrevInstIdx.setOptionalPrevInstGelInstId( keepObj.getOptionalPrevInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapPrevInstIdx = indexByPrevInstIdx.get( keyPrevInstIdx );
				if( mapPrevInstIdx != null ) {
					mapPrevInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextInstIdx != null ) {
				YCFGenKbGelCallByNextInstIdxKey keyNextInstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newNextInstIdxKey();
				keyNextInstIdx.setOptionalNextInstTenantId( keepObj.getOptionalNextInstTenantId() );
				keyNextInstIdx.setOptionalNextInstGelCacheId( keepObj.getOptionalNextInstGelCacheId() );
				keyNextInstIdx.setOptionalNextInstGelInstId( keepObj.getOptionalNextInstGelInstId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > mapNextInstIdx = indexByNextInstIdx.get( keyNextInstIdx );
				if( mapNextInstIdx != null ) {
					mapNextInstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelCallObj createGelCall( IYCFGenKbGelCallObj Obj ) {
		IYCFGenKbGelCallObj obj = Obj;
		YCFGenKbGelCallBuff buff = obj.getGelCallBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().createGelCall(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a91c" ) ) {
			obj = (IYCFGenKbGelCallObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelCallObj readGelCall( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelCall( pkey, false ) );
	}

	public IYCFGenKbGelCallObj readGelCall( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelCallObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelCallBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelCallObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelCallObj readCachedGelCall( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelCallObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelCall( IYCFGenKbGelCallObj obj )
	{
		final String S_ProcName = "YCFGenKbGelCallTableObj.reallyDeepDisposeGelCall() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelCallObj existing = readCachedGelCall( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelCallByCacheIdxKey keyCacheIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCacheIdxKey();
		keyCacheIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyCacheIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );

		YCFGenKbGelCallBySeqIdxKey keySeqIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newSeqIdxKey();
		keySeqIdx.setOptionalSeqInstTenantId( existing.getOptionalSeqInstTenantId() );
		keySeqIdx.setOptionalSeqInstGelCacheId( existing.getOptionalSeqInstGelCacheId() );
		keySeqIdx.setOptionalSeqInstId( existing.getOptionalSeqInstId() );

		YCFGenKbGelCallByCallInstIdxKey keyCallInstIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCallInstIdxKey();
		keyCallInstIdx.setOptionalCallInstTenantId( existing.getOptionalCallInstTenantId() );
		keyCallInstIdx.setOptionalCallInstGelCacheId( existing.getOptionalCallInstGelCacheId() );
		keyCallInstIdx.setOptionalCallInstId( existing.getOptionalCallInstId() );

		YCFGenKbGelCallByPrevInstIdxKey keyPrevInstIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newPrevInstIdxKey();
		keyPrevInstIdx.setOptionalPrevInstTenantId( existing.getOptionalPrevInstTenantId() );
		keyPrevInstIdx.setOptionalPrevInstGelCacheId( existing.getOptionalPrevInstGelCacheId() );
		keyPrevInstIdx.setOptionalPrevInstGelInstId( existing.getOptionalPrevInstGelInstId() );

		YCFGenKbGelCallByNextInstIdxKey keyNextInstIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newNextInstIdxKey();
		keyNextInstIdx.setOptionalNextInstTenantId( existing.getOptionalNextInstTenantId() );
		keyNextInstIdx.setOptionalNextInstGelCacheId( existing.getOptionalNextInstGelCacheId() );
		keyNextInstIdx.setOptionalNextInstGelInstId( existing.getOptionalNextInstGelInstId() );



		if( indexByCacheIdx != null ) {
			if( indexByCacheIdx.containsKey( keyCacheIdx ) ) {
				indexByCacheIdx.get( keyCacheIdx ).remove( pkey );
				if( indexByCacheIdx.get( keyCacheIdx ).size() <= 0 ) {
					indexByCacheIdx.remove( keyCacheIdx );
				}
			}
		}

		if( indexBySeqIdx != null ) {
			if( indexBySeqIdx.containsKey( keySeqIdx ) ) {
				indexBySeqIdx.get( keySeqIdx ).remove( pkey );
				if( indexBySeqIdx.get( keySeqIdx ).size() <= 0 ) {
					indexBySeqIdx.remove( keySeqIdx );
				}
			}
		}

		if( indexByCallInstIdx != null ) {
			if( indexByCallInstIdx.containsKey( keyCallInstIdx ) ) {
				indexByCallInstIdx.get( keyCallInstIdx ).remove( pkey );
				if( indexByCallInstIdx.get( keyCallInstIdx ).size() <= 0 ) {
					indexByCallInstIdx.remove( keyCallInstIdx );
				}
			}
		}

		if( indexByPrevInstIdx != null ) {
			if( indexByPrevInstIdx.containsKey( keyPrevInstIdx ) ) {
				indexByPrevInstIdx.get( keyPrevInstIdx ).remove( pkey );
				if( indexByPrevInstIdx.get( keyPrevInstIdx ).size() <= 0 ) {
					indexByPrevInstIdx.remove( keyPrevInstIdx );
				}
			}
		}

		if( indexByNextInstIdx != null ) {
			if( indexByNextInstIdx.containsKey( keyNextInstIdx ) ) {
				indexByNextInstIdx.get( keyNextInstIdx ).remove( pkey );
				if( indexByNextInstIdx.get( keyNextInstIdx ).size() <= 0 ) {
					indexByNextInstIdx.remove( keyNextInstIdx );
				}
			}
		}


		schema.getGelInstructionTableObj().reallyDeepDisposeGelInstruction( obj );
	}
	public void deepDisposeGelCall( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelCallObj obj = readCachedGelCall( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelCallObj lockGelCall( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelCallObj locked = null;
		YCFGenKbGelCallBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelCallObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelCall", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelCallObj> readAllGelCall() {
		return( readAllGelCall( false ) );
	}

	public List<IYCFGenKbGelCallObj> readAllGelCall( boolean forceRead ) {
		final String S_ProcName = "readAllGelCall";
		if( ( allGelCall == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelCallObj>();
			allGelCall = map;
			YCFGenKbGelCallBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelCallBuff buff;
			IYCFGenKbGelCallObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
			}
		}
		int len = allGelCall.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = allGelCall.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readCachedAllGelCall() {
		final String S_ProcName = "readCachedAllGelCall";
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( allGelCall != null ) {
			int len = allGelCall.size();
			IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
			Iterator<IYCFGenKbGelCallObj> valIter = allGelCall.values().iterator();
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
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public IYCFGenKbGelCallObj readGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelCallByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelCallObj readGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelCallObj obj = readGelCall( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByTenantIdx( long TenantId )
	{
		return( readGelCallByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelCallByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelCallByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelCallByCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallByCacheIdx";
		YCFGenKbGelCallByCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexByCacheIdx == null ) {
			indexByCacheIdx = new HashMap< YCFGenKbGelCallByCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexByCacheIdx.containsKey( key ) ) {
			dict = indexByCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelCallObj obj;
			YCFGenKbGelCallBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedByCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelCallBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId )
	{
		return( readGelCallBySeqIdx( SeqInstTenantId,
			SeqInstGelCacheId,
			SeqInstId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallBySeqIdx";
		YCFGenKbGelCallBySeqIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newSeqIdxKey();
		key.setOptionalSeqInstTenantId( SeqInstTenantId );
		key.setOptionalSeqInstGelCacheId( SeqInstGelCacheId );
		key.setOptionalSeqInstId( SeqInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexBySeqIdx == null ) {
			indexBySeqIdx = new HashMap< YCFGenKbGelCallBySeqIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexBySeqIdx.containsKey( key ) ) {
			dict = indexBySeqIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelCallObj obj;
			YCFGenKbGelCallBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedBySeqIdx( schema.getAuthorization(),
				SeqInstTenantId,
				SeqInstGelCacheId,
				SeqInstId );
			YCFGenKbGelCallBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySeqIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId )
	{
		return( readGelCallByCallInstIdx( CallInstTenantId,
			CallInstGelCacheId,
			CallInstId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallByCallInstIdx";
		YCFGenKbGelCallByCallInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCallInstIdxKey();
		key.setOptionalCallInstTenantId( CallInstTenantId );
		key.setOptionalCallInstGelCacheId( CallInstGelCacheId );
		key.setOptionalCallInstId( CallInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexByCallInstIdx == null ) {
			indexByCallInstIdx = new HashMap< YCFGenKbGelCallByCallInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexByCallInstIdx.containsKey( key ) ) {
			dict = indexByCallInstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelCallObj obj;
			YCFGenKbGelCallBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedByCallInstIdx( schema.getAuthorization(),
				CallInstTenantId,
				CallInstGelCacheId,
				CallInstId );
			YCFGenKbGelCallBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCallInstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId )
	{
		return( readGelCallByPrevInstIdx( PrevInstTenantId,
			PrevInstGelCacheId,
			PrevInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallByPrevInstIdx";
		YCFGenKbGelCallByPrevInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newPrevInstIdxKey();
		key.setOptionalPrevInstTenantId( PrevInstTenantId );
		key.setOptionalPrevInstGelCacheId( PrevInstGelCacheId );
		key.setOptionalPrevInstGelInstId( PrevInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexByPrevInstIdx == null ) {
			indexByPrevInstIdx = new HashMap< YCFGenKbGelCallByPrevInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexByPrevInstIdx.containsKey( key ) ) {
			dict = indexByPrevInstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelCallObj obj;
			YCFGenKbGelCallBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedByPrevInstIdx( schema.getAuthorization(),
				PrevInstTenantId,
				PrevInstGelCacheId,
				PrevInstGelInstId );
			YCFGenKbGelCallBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevInstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId )
	{
		return( readGelCallByNextInstIdx( NextInstTenantId,
			NextInstGelCacheId,
			NextInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelCallObj> readGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCallByNextInstIdx";
		YCFGenKbGelCallByNextInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newNextInstIdxKey();
		key.setOptionalNextInstTenantId( NextInstTenantId );
		key.setOptionalNextInstGelCacheId( NextInstGelCacheId );
		key.setOptionalNextInstGelInstId( NextInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
		if( indexByNextInstIdx == null ) {
			indexByNextInstIdx = new HashMap< YCFGenKbGelCallByNextInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( ( ! forceRead ) && indexByNextInstIdx.containsKey( key ) ) {
			dict = indexByNextInstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj>();
			IYCFGenKbGelCallObj obj;
			YCFGenKbGelCallBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedByNextInstIdx( schema.getAuthorization(),
				NextInstTenantId,
				NextInstGelCacheId,
				NextInstGelInstId );
			YCFGenKbGelCallBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelCallObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCallObj realised = (IYCFGenKbGelCallObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextInstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
		Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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
		List<IYCFGenKbGelCallObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelCallObj readCachedGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelCallObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelCall( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelCallObj> readCachedGelCallByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelCallByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public List<IYCFGenKbGelCallObj> readCachedGelCallByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelCallByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public List<IYCFGenKbGelCallObj> readCachedGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelCallByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public List<IYCFGenKbGelCallObj> readCachedGelCallByCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelCallByCacheIdx";
		YCFGenKbGelCallByCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexByCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexByCacheIdx.containsKey( key ) ) {
				dict = indexByCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public List<IYCFGenKbGelCallObj> readCachedGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId )
	{
		final String S_ProcName = "readCachedGelCallBySeqIdx";
		YCFGenKbGelCallBySeqIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newSeqIdxKey();
		key.setOptionalSeqInstTenantId( SeqInstTenantId );
		key.setOptionalSeqInstGelCacheId( SeqInstGelCacheId );
		key.setOptionalSeqInstId( SeqInstId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexBySeqIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexBySeqIdx.containsKey( key ) ) {
				dict = indexBySeqIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public List<IYCFGenKbGelCallObj> readCachedGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId )
	{
		final String S_ProcName = "readCachedGelCallByCallInstIdx";
		YCFGenKbGelCallByCallInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCallInstIdxKey();
		key.setOptionalCallInstTenantId( CallInstTenantId );
		key.setOptionalCallInstGelCacheId( CallInstGelCacheId );
		key.setOptionalCallInstId( CallInstId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexByCallInstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexByCallInstIdx.containsKey( key ) ) {
				dict = indexByCallInstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public List<IYCFGenKbGelCallObj> readCachedGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId )
	{
		final String S_ProcName = "readCachedGelCallByPrevInstIdx";
		YCFGenKbGelCallByPrevInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newPrevInstIdxKey();
		key.setOptionalPrevInstTenantId( PrevInstTenantId );
		key.setOptionalPrevInstGelCacheId( PrevInstGelCacheId );
		key.setOptionalPrevInstGelInstId( PrevInstGelInstId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexByPrevInstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexByPrevInstIdx.containsKey( key ) ) {
				dict = indexByPrevInstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public List<IYCFGenKbGelCallObj> readCachedGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId )
	{
		final String S_ProcName = "readCachedGelCallByNextInstIdx";
		YCFGenKbGelCallByNextInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newNextInstIdxKey();
		key.setOptionalNextInstTenantId( NextInstTenantId );
		key.setOptionalNextInstGelCacheId( NextInstGelCacheId );
		key.setOptionalNextInstGelInstId( NextInstGelInstId );
		ArrayList<IYCFGenKbGelCallObj> arrayList = new ArrayList<IYCFGenKbGelCallObj>();
		if( indexByNextInstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict;
			if( indexByNextInstIdx.containsKey( key ) ) {
				dict = indexByNextInstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCallObj arr[] = new IYCFGenKbGelCallObj[len];
				Iterator<IYCFGenKbGelCallObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCallObj obj;
			Iterator<IYCFGenKbGelCallObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCallObj> cmp = new Comparator<IYCFGenKbGelCallObj>() {
			public int compare( IYCFGenKbGelCallObj lhs, IYCFGenKbGelCallObj rhs ) {
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

	public void deepDisposeGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelCallObj obj = readCachedGelCallByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelCallByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelCallByTenantIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCallByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelCallByGelCacheIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelCallByChainIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCallByCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelCallByCacheIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallByCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId )
	{
		final String S_ProcName = "deepDisposeGelCallBySeqIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallBySeqIdx( SeqInstTenantId,
				SeqInstGelCacheId,
				SeqInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId )
	{
		final String S_ProcName = "deepDisposeGelCallByCallInstIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallByCallInstIdx( CallInstTenantId,
				CallInstGelCacheId,
				CallInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelCallByPrevInstIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallByPrevInstIdx( PrevInstTenantId,
				PrevInstGelCacheId,
				PrevInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelCallByNextInstIdx";
		IYCFGenKbGelCallObj obj;
		List<IYCFGenKbGelCallObj> arrayList = readCachedGelCallByNextInstIdx( NextInstTenantId,
				NextInstGelCacheId,
				NextInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCallObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelCallObj updateGelCall( IYCFGenKbGelCallObj Obj ) {
		IYCFGenKbGelCallObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().updateGelCall( schema.getAuthorization(),
			Obj.getGelCallBuff() );
		if( Obj.getClassCode().equals( "a91c" ) ) {
			obj = (IYCFGenKbGelCallObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelCall( IYCFGenKbGelCallObj Obj ) {
		IYCFGenKbGelCallObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCall( schema.getAuthorization(),
			obj.getGelCallBuff() );
		Obj.forget();
	}

	public void deleteGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelCallObj obj = readGelCall( pkey );
		if( obj != null ) {
			IYCFGenKbGelCallEditObj editObj = (IYCFGenKbGelCallEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelCallEditObj)obj.beginEdit();
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
		deepDisposeGelCallByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelCallByTenantIdx( long TenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelCallByTenantIdx( TenantId );
	}

	public void deleteGelCallByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelCallByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelCallByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelCallByCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelCallByCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByCacheIdx == null ) {
			indexByCacheIdx = new HashMap< YCFGenKbGelCallByCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexByCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexByCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCacheIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelCallByCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId )
	{
		YCFGenKbGelCallBySeqIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newSeqIdxKey();
		key.setOptionalSeqInstTenantId( SeqInstTenantId );
		key.setOptionalSeqInstGelCacheId( SeqInstGelCacheId );
		key.setOptionalSeqInstId( SeqInstId );
		if( indexBySeqIdx == null ) {
			indexBySeqIdx = new HashMap< YCFGenKbGelCallBySeqIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexBySeqIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexBySeqIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallBySeqIdx( schema.getAuthorization(),
				SeqInstTenantId,
				SeqInstGelCacheId,
				SeqInstId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySeqIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallBySeqIdx( schema.getAuthorization(),
				SeqInstTenantId,
				SeqInstGelCacheId,
				SeqInstId );
		}
		deepDisposeGelCallBySeqIdx( SeqInstTenantId,
				SeqInstGelCacheId,
				SeqInstId );
	}

	public void deleteGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId )
	{
		YCFGenKbGelCallByCallInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newCallInstIdxKey();
		key.setOptionalCallInstTenantId( CallInstTenantId );
		key.setOptionalCallInstGelCacheId( CallInstGelCacheId );
		key.setOptionalCallInstId( CallInstId );
		if( indexByCallInstIdx == null ) {
			indexByCallInstIdx = new HashMap< YCFGenKbGelCallByCallInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexByCallInstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexByCallInstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByCallInstIdx( schema.getAuthorization(),
				CallInstTenantId,
				CallInstGelCacheId,
				CallInstId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCallInstIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByCallInstIdx( schema.getAuthorization(),
				CallInstTenantId,
				CallInstGelCacheId,
				CallInstId );
		}
		deepDisposeGelCallByCallInstIdx( CallInstTenantId,
				CallInstGelCacheId,
				CallInstId );
	}

	public void deleteGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId )
	{
		YCFGenKbGelCallByPrevInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newPrevInstIdxKey();
		key.setOptionalPrevInstTenantId( PrevInstTenantId );
		key.setOptionalPrevInstGelCacheId( PrevInstGelCacheId );
		key.setOptionalPrevInstGelInstId( PrevInstGelInstId );
		if( indexByPrevInstIdx == null ) {
			indexByPrevInstIdx = new HashMap< YCFGenKbGelCallByPrevInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexByPrevInstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexByPrevInstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByPrevInstIdx( schema.getAuthorization(),
				PrevInstTenantId,
				PrevInstGelCacheId,
				PrevInstGelInstId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPrevInstIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByPrevInstIdx( schema.getAuthorization(),
				PrevInstTenantId,
				PrevInstGelCacheId,
				PrevInstGelInstId );
		}
		deepDisposeGelCallByPrevInstIdx( PrevInstTenantId,
				PrevInstGelCacheId,
				PrevInstGelInstId );
	}

	public void deleteGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId )
	{
		YCFGenKbGelCallByNextInstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newNextInstIdxKey();
		key.setOptionalNextInstTenantId( NextInstTenantId );
		key.setOptionalNextInstGelCacheId( NextInstGelCacheId );
		key.setOptionalNextInstGelInstId( NextInstGelInstId );
		if( indexByNextInstIdx == null ) {
			indexByNextInstIdx = new HashMap< YCFGenKbGelCallByNextInstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj > >();
		}
		if( indexByNextInstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelCallObj> dict = indexByNextInstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByNextInstIdx( schema.getAuthorization(),
				NextInstTenantId,
				NextInstGelCacheId,
				NextInstGelInstId );
			Iterator<IYCFGenKbGelCallObj> iter = dict.values().iterator();
			IYCFGenKbGelCallObj obj;
			List<IYCFGenKbGelCallObj> toForget = new LinkedList<IYCFGenKbGelCallObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNextInstIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().deleteGelCallByNextInstIdx( schema.getAuthorization(),
				NextInstTenantId,
				NextInstGelCacheId,
				NextInstGelInstId );
		}
		deepDisposeGelCallByNextInstIdx( NextInstTenantId,
				NextInstGelCacheId,
				NextInstGelInstId );
	}
}
