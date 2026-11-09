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

public class CFGenKbGelSpreadTableObj
	implements ICFGenKbGelSpreadTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> members;
	private Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> allGelSpread;
	private Map< CFGenKbGelInstructionByTenantIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByTenantIdx;
	private Map< CFGenKbGelInstructionByGelCacheIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByGelCacheIdx;
	private Map< CFGenKbGelInstructionByChainIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByChainIdx;
	private Map< CFGenKbGelSpreadByBetweenIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByBetweenIdx;
	private Map< CFGenKbGelSpreadByBeforeIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByBeforeIdx;
	private Map< CFGenKbGelSpreadByFirstIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByFirstIdx;
	private Map< CFGenKbGelSpreadByEachIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByEachIdx;
	private Map< CFGenKbGelSpreadByLastIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByLastIdx;
	private Map< CFGenKbGelSpreadByLoneIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByLoneIdx;
	private Map< CFGenKbGelSpreadByEmptyIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > > indexByEmptyIdx;
	public static String TABLE_NAME = "GelSpread";
	public static String TABLE_DBNAME = "gelspred";

	public CFGenKbGelSpreadTableObj() {
		schema = null;
		members = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
		allGelSpread = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBetweenIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
	}

	public CFGenKbGelSpreadTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
		allGelSpread = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBetweenIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
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
		allGelSpread = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBetweenIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
		List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
		ICFGenKbGelSpreadObj cur = null;
		Iterator<ICFGenKbGelSpreadObj> iter = members.values().iterator();
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
	 *	CFGenKbGelSpreadObj.
	 */
	public ICFGenKbGelSpreadObj newInstance() {
		ICFGenKbGelSpreadObj inst = new CFGenKbGelSpreadObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbGelSpreadObj.
	 */
	public ICFGenKbGelSpreadEditObj newEditInstance( ICFGenKbGelSpreadObj orig ) {
		ICFGenKbGelSpreadEditObj edit = new CFGenKbGelSpreadEditObj( orig );
		return( edit );
	}

	public ICFGenKbGelSpreadObj realiseGelSpread( ICFGenKbGelSpreadObj Obj ) {
		ICFGenKbGelSpreadObj obj = Obj;
		CFGenKbGelInstructionPKey pkey = obj.getPKey();
		ICFGenKbGelSpreadObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbGelSpreadObj existingObj = members.get( pkey );
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
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByBetweenIdx != null ) {
				CFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
				keyBetweenIdx.setOptionalExpandBetween( keepObj.getOptionalExpandBetween() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapBetweenIdx = indexByBetweenIdx.get( keyBetweenIdx );
				if( mapBetweenIdx != null ) {
					mapBetweenIdx.remove( keepObj.getPKey() );
					if( mapBetweenIdx.size() <= 0 ) {
						indexByBetweenIdx.remove( keyBetweenIdx );
					}
				}
			}

			if( indexByBeforeIdx != null ) {
				CFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.remove( keepObj.getPKey() );
					if( mapBeforeIdx.size() <= 0 ) {
						indexByBeforeIdx.remove( keyBeforeIdx );
					}
				}
			}

			if( indexByFirstIdx != null ) {
				CFGenKbGelSpreadByFirstIdxKey keyFirstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.remove( keepObj.getPKey() );
					if( mapFirstIdx.size() <= 0 ) {
						indexByFirstIdx.remove( keyFirstIdx );
					}
				}
			}

			if( indexByEachIdx != null ) {
				CFGenKbGelSpreadByEachIdxKey keyEachIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.remove( keepObj.getPKey() );
					if( mapEachIdx.size() <= 0 ) {
						indexByEachIdx.remove( keyEachIdx );
					}
				}
			}

			if( indexByLastIdx != null ) {
				CFGenKbGelSpreadByLastIdxKey keyLastIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.remove( keepObj.getPKey() );
					if( mapLastIdx.size() <= 0 ) {
						indexByLastIdx.remove( keyLastIdx );
					}
				}
			}

			if( indexByLoneIdx != null ) {
				CFGenKbGelSpreadByLoneIdxKey keyLoneIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.remove( keepObj.getPKey() );
					if( mapLoneIdx.size() <= 0 ) {
						indexByLoneIdx.remove( keyLoneIdx );
					}
				}
			}

			if( indexByEmptyIdx != null ) {
				CFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.remove( keepObj.getPKey() );
					if( mapEmptyIdx.size() <= 0 ) {
						indexByEmptyIdx.remove( keyEmptyIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBetweenIdx != null ) {
				CFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
				keyBetweenIdx.setOptionalExpandBetween( keepObj.getOptionalExpandBetween() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapBetweenIdx = indexByBetweenIdx.get( keyBetweenIdx );
				if( mapBetweenIdx != null ) {
					mapBetweenIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				CFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				CFGenKbGelSpreadByFirstIdxKey keyFirstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				CFGenKbGelSpreadByEachIdxKey keyEachIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				CFGenKbGelSpreadByLastIdxKey keyLastIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				CFGenKbGelSpreadByLoneIdxKey keyLoneIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				CFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelSpread != null ) {
				allGelSpread.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelSpread != null ) {
				allGelSpread.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBetweenIdx != null ) {
				CFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
				keyBetweenIdx.setOptionalExpandBetween( keepObj.getOptionalExpandBetween() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapBetweenIdx = indexByBetweenIdx.get( keyBetweenIdx );
				if( mapBetweenIdx != null ) {
					mapBetweenIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				CFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				CFGenKbGelSpreadByFirstIdxKey keyFirstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				CFGenKbGelSpreadByEachIdxKey keyEachIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				CFGenKbGelSpreadByLastIdxKey keyLastIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				CFGenKbGelSpreadByLoneIdxKey keyLoneIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				CFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbGelSpreadObj createGelSpread( ICFGenKbGelSpreadObj Obj ) {
		ICFGenKbGelSpreadObj obj = Obj;
		CFGenKbGelSpreadBuff buff = obj.getGelSpreadBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().createGelSpread(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a918" ) ) {
			obj = (ICFGenKbGelSpreadObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbGelSpreadObj readGelSpread( CFGenKbGelInstructionPKey pkey ) {
		return( readGelSpread( pkey, false ) );
	}

	public ICFGenKbGelSpreadObj readGelSpread( CFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		ICFGenKbGelSpreadObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbGelSpreadBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbGelSpreadObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbGelSpreadObj readCachedGelSpread( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelSpreadObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelSpread( ICFGenKbGelSpreadObj obj )
	{
		final String S_ProcName = "CFGenKbGelSpreadTableObj.reallyDeepDisposeGelSpread() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbGelInstructionPKey pkey = obj.getPKey();
		ICFGenKbGelSpreadObj existing = readCachedGelSpread( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		keyBetweenIdx.setOptionalExpandBetween( existing.getOptionalExpandBetween() );

		CFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		CFGenKbGelSpreadByFirstIdxKey keyFirstIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		CFGenKbGelSpreadByEachIdxKey keyEachIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		CFGenKbGelSpreadByLastIdxKey keyLastIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		CFGenKbGelSpreadByLoneIdxKey keyLoneIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		CFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
		keyEmptyIdx.setOptionalExpandEmpty( existing.getOptionalExpandEmpty() );



		if( indexByBetweenIdx != null ) {
			if( indexByBetweenIdx.containsKey( keyBetweenIdx ) ) {
				indexByBetweenIdx.get( keyBetweenIdx ).remove( pkey );
				if( indexByBetweenIdx.get( keyBetweenIdx ).size() <= 0 ) {
					indexByBetweenIdx.remove( keyBetweenIdx );
				}
			}
		}

		if( indexByBeforeIdx != null ) {
			if( indexByBeforeIdx.containsKey( keyBeforeIdx ) ) {
				indexByBeforeIdx.get( keyBeforeIdx ).remove( pkey );
				if( indexByBeforeIdx.get( keyBeforeIdx ).size() <= 0 ) {
					indexByBeforeIdx.remove( keyBeforeIdx );
				}
			}
		}

		if( indexByFirstIdx != null ) {
			if( indexByFirstIdx.containsKey( keyFirstIdx ) ) {
				indexByFirstIdx.get( keyFirstIdx ).remove( pkey );
				if( indexByFirstIdx.get( keyFirstIdx ).size() <= 0 ) {
					indexByFirstIdx.remove( keyFirstIdx );
				}
			}
		}

		if( indexByEachIdx != null ) {
			if( indexByEachIdx.containsKey( keyEachIdx ) ) {
				indexByEachIdx.get( keyEachIdx ).remove( pkey );
				if( indexByEachIdx.get( keyEachIdx ).size() <= 0 ) {
					indexByEachIdx.remove( keyEachIdx );
				}
			}
		}

		if( indexByLastIdx != null ) {
			if( indexByLastIdx.containsKey( keyLastIdx ) ) {
				indexByLastIdx.get( keyLastIdx ).remove( pkey );
				if( indexByLastIdx.get( keyLastIdx ).size() <= 0 ) {
					indexByLastIdx.remove( keyLastIdx );
				}
			}
		}

		if( indexByLoneIdx != null ) {
			if( indexByLoneIdx.containsKey( keyLoneIdx ) ) {
				indexByLoneIdx.get( keyLoneIdx ).remove( pkey );
				if( indexByLoneIdx.get( keyLoneIdx ).size() <= 0 ) {
					indexByLoneIdx.remove( keyLoneIdx );
				}
			}
		}

		if( indexByEmptyIdx != null ) {
			if( indexByEmptyIdx.containsKey( keyEmptyIdx ) ) {
				indexByEmptyIdx.get( keyEmptyIdx ).remove( pkey );
				if( indexByEmptyIdx.get( keyEmptyIdx ).size() <= 0 ) {
					indexByEmptyIdx.remove( keyEmptyIdx );
				}
			}
		}


		schema.getGelInstructionTableObj().reallyDeepDisposeGelInstruction( obj );
	}
	public void deepDisposeGelSpread( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelSpreadObj obj = readCachedGelSpread( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbGelSpreadObj lockGelSpread( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelSpreadObj locked = null;
		CFGenKbGelSpreadBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbGelSpreadObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockGelSpread", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbGelSpreadObj> readAllGelSpread() {
		return( readAllGelSpread( false ) );
	}

	public List<ICFGenKbGelSpreadObj> readAllGelSpread( boolean forceRead ) {
		final String S_ProcName = "readAllGelSpread";
		if( ( allGelSpread == null ) || forceRead ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> map = new HashMap<CFGenKbGelInstructionPKey,ICFGenKbGelSpreadObj>();
			allGelSpread = map;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readAllDerived( schema.getAuthorization() );
			CFGenKbGelSpreadBuff buff;
			ICFGenKbGelSpreadObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
			}
		}
		int len = allGelSpread.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = allGelSpread.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readCachedAllGelSpread() {
		final String S_ProcName = "readCachedAllGelSpread";
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( allGelSpread != null ) {
			int len = allGelSpread.size();
			ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
			Iterator<ICFGenKbGelSpreadObj> valIter = allGelSpread.values().iterator();
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
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public ICFGenKbGelSpreadObj readGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelSpreadByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public ICFGenKbGelSpreadObj readGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		ICFGenKbGelSpreadObj obj = readGelSpread( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByTenantIdx( long TenantId )
	{
		return( readGelSpreadByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByTenantIdx";
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelInstructionByTenantIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelSpreadByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByGelCacheIdx";
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< CFGenKbGelInstructionByGelCacheIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelSpreadByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByChainIdx";
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< CFGenKbGelInstructionByChainIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByBetweenIdx( String ExpandBetween )
	{
		return( readGelSpreadByBetweenIdx( ExpandBetween,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByBetweenIdx( String ExpandBetween,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByBetweenIdx";
		CFGenKbGelSpreadByBetweenIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( ExpandBetween );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByBetweenIdx == null ) {
			indexByBetweenIdx = new HashMap< CFGenKbGelSpreadByBetweenIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByBetweenIdx.containsKey( key ) ) {
			dict = indexByBetweenIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelSpreadObj obj;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByBetweenIdx( schema.getAuthorization(),
				ExpandBetween );
			CFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBetweenIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByBeforeIdx( String ExpandBefore )
	{
		return( readGelSpreadByBeforeIdx( ExpandBefore,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByBeforeIdx( String ExpandBefore,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByBeforeIdx";
		CFGenKbGelSpreadByBeforeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< CFGenKbGelSpreadByBeforeIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByBeforeIdx.containsKey( key ) ) {
			dict = indexByBeforeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelSpreadObj obj;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			CFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBeforeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByFirstIdx( String ExpandFirst )
	{
		return( readGelSpreadByFirstIdx( ExpandFirst,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByFirstIdx( String ExpandFirst,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByFirstIdx";
		CFGenKbGelSpreadByFirstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< CFGenKbGelSpreadByFirstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByFirstIdx.containsKey( key ) ) {
			dict = indexByFirstIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelSpreadObj obj;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			CFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFirstIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByEachIdx( String ExpandEach )
	{
		return( readGelSpreadByEachIdx( ExpandEach,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByEachIdx( String ExpandEach,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByEachIdx";
		CFGenKbGelSpreadByEachIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< CFGenKbGelSpreadByEachIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByEachIdx.containsKey( key ) ) {
			dict = indexByEachIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelSpreadObj obj;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByEachIdx( schema.getAuthorization(),
				ExpandEach );
			CFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEachIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByLastIdx( String ExpandLast )
	{
		return( readGelSpreadByLastIdx( ExpandLast,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByLastIdx( String ExpandLast,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByLastIdx";
		CFGenKbGelSpreadByLastIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< CFGenKbGelSpreadByLastIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByLastIdx.containsKey( key ) ) {
			dict = indexByLastIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelSpreadObj obj;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByLastIdx( schema.getAuthorization(),
				ExpandLast );
			CFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLastIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByLoneIdx( String ExpandLone )
	{
		return( readGelSpreadByLoneIdx( ExpandLone,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByLoneIdx( String ExpandLone,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByLoneIdx";
		CFGenKbGelSpreadByLoneIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< CFGenKbGelSpreadByLoneIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByLoneIdx.containsKey( key ) ) {
			dict = indexByLoneIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelSpreadObj obj;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			CFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLoneIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByEmptyIdx( String ExpandEmpty )
	{
		return( readGelSpreadByEmptyIdx( ExpandEmpty,
			false ) );
	}

	public List<ICFGenKbGelSpreadObj> readGelSpreadByEmptyIdx( String ExpandEmpty,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByEmptyIdx";
		CFGenKbGelSpreadByEmptyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< CFGenKbGelSpreadByEmptyIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByEmptyIdx.containsKey( key ) ) {
			dict = indexByEmptyIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj>();
			ICFGenKbGelSpreadObj obj;
			CFGenKbGelSpreadBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			CFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelSpreadObj realised = (ICFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEmptyIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
		Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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
		List<ICFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGelSpreadObj readCachedGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		ICFGenKbGelSpreadObj obj = null;
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelSpread( pkey );
		return( obj );
	}

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelSpreadByTenantIdx";
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelSpreadByGelCacheIdx";
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByGelCacheIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelSpreadByChainIdx";
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByChainIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByBetweenIdx( String ExpandBetween )
	{
		final String S_ProcName = "readCachedGelSpreadByBetweenIdx";
		CFGenKbGelSpreadByBetweenIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( ExpandBetween );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByBetweenIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByBetweenIdx.containsKey( key ) ) {
				dict = indexByBetweenIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByBeforeIdx( String ExpandBefore )
	{
		final String S_ProcName = "readCachedGelSpreadByBeforeIdx";
		CFGenKbGelSpreadByBeforeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByBeforeIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByBeforeIdx.containsKey( key ) ) {
				dict = indexByBeforeIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByFirstIdx( String ExpandFirst )
	{
		final String S_ProcName = "readCachedGelSpreadByFirstIdx";
		CFGenKbGelSpreadByFirstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByFirstIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByFirstIdx.containsKey( key ) ) {
				dict = indexByFirstIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByEachIdx( String ExpandEach )
	{
		final String S_ProcName = "readCachedGelSpreadByEachIdx";
		CFGenKbGelSpreadByEachIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByEachIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByEachIdx.containsKey( key ) ) {
				dict = indexByEachIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByLastIdx( String ExpandLast )
	{
		final String S_ProcName = "readCachedGelSpreadByLastIdx";
		CFGenKbGelSpreadByLastIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByLastIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByLastIdx.containsKey( key ) ) {
				dict = indexByLastIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByLoneIdx( String ExpandLone )
	{
		final String S_ProcName = "readCachedGelSpreadByLoneIdx";
		CFGenKbGelSpreadByLoneIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByLoneIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByLoneIdx.containsKey( key ) ) {
				dict = indexByLoneIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public List<ICFGenKbGelSpreadObj> readCachedGelSpreadByEmptyIdx( String ExpandEmpty )
	{
		final String S_ProcName = "readCachedGelSpreadByEmptyIdx";
		CFGenKbGelSpreadByEmptyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		ArrayList<ICFGenKbGelSpreadObj> arrayList = new ArrayList<ICFGenKbGelSpreadObj>();
		if( indexByEmptyIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict;
			if( indexByEmptyIdx.containsKey( key ) ) {
				dict = indexByEmptyIdx.get( key );
				int len = dict.size();
				ICFGenKbGelSpreadObj arr[] = new ICFGenKbGelSpreadObj[len];
				Iterator<ICFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			ICFGenKbGelSpreadObj obj;
			Iterator<ICFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelSpreadObj> cmp = new Comparator<ICFGenKbGelSpreadObj>() {
			public int compare( ICFGenKbGelSpreadObj lhs, ICFGenKbGelSpreadObj rhs ) {
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

	public void deepDisposeGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		ICFGenKbGelSpreadObj obj = readCachedGelSpreadByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelSpreadByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelSpreadByTenantIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelSpreadByGelCacheIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelSpreadByChainIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByBetweenIdx( String ExpandBetween )
	{
		final String S_ProcName = "deepDisposeGelSpreadByBetweenIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByBetweenIdx( ExpandBetween );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByBeforeIdx( String ExpandBefore )
	{
		final String S_ProcName = "deepDisposeGelSpreadByBeforeIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByBeforeIdx( ExpandBefore );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByFirstIdx( String ExpandFirst )
	{
		final String S_ProcName = "deepDisposeGelSpreadByFirstIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByFirstIdx( ExpandFirst );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByEachIdx( String ExpandEach )
	{
		final String S_ProcName = "deepDisposeGelSpreadByEachIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByEachIdx( ExpandEach );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByLastIdx( String ExpandLast )
	{
		final String S_ProcName = "deepDisposeGelSpreadByLastIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByLastIdx( ExpandLast );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByLoneIdx( String ExpandLone )
	{
		final String S_ProcName = "deepDisposeGelSpreadByLoneIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByLoneIdx( ExpandLone );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelSpreadByEmptyIdx( String ExpandEmpty )
	{
		final String S_ProcName = "deepDisposeGelSpreadByEmptyIdx";
		ICFGenKbGelSpreadObj obj;
		List<ICFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByEmptyIdx( ExpandEmpty );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbGelSpreadObj updateGelSpread( ICFGenKbGelSpreadObj Obj ) {
		ICFGenKbGelSpreadObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().updateGelSpread( schema.getAuthorization(),
			Obj.getGelSpreadBuff() );
		if( Obj.getClassCode().equals( "a918" ) ) {
			obj = (ICFGenKbGelSpreadObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelSpread( ICFGenKbGelSpreadObj Obj ) {
		ICFGenKbGelSpreadObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpread( schema.getAuthorization(),
			obj.getGelSpreadBuff() );
		Obj.forget();
	}

	public void deleteGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		ICFGenKbGelSpreadObj obj = readGelSpread( pkey );
		if( obj != null ) {
			ICFGenKbGelSpreadEditObj editObj = (ICFGenKbGelSpreadEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbGelSpreadEditObj)obj.beginEdit();
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
		deepDisposeGelSpreadByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelSpreadByTenantIdx( long TenantId )
	{
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelInstructionByTenantIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelSpreadByTenantIdx( TenantId );
	}

	public void deleteGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< CFGenKbGelInstructionByGelCacheIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByGelCacheIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelSpreadByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< CFGenKbGelInstructionByChainIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByChainIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelSpreadByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelSpreadByBetweenIdx( String ExpandBetween )
	{
		CFGenKbGelSpreadByBetweenIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( ExpandBetween );
		if( indexByBetweenIdx == null ) {
			indexByBetweenIdx = new HashMap< CFGenKbGelSpreadByBetweenIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByBetweenIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByBetweenIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBetweenIdx( schema.getAuthorization(),
				ExpandBetween );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByBetweenIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBetweenIdx( schema.getAuthorization(),
				ExpandBetween );
		}
		deepDisposeGelSpreadByBetweenIdx( ExpandBetween );
	}

	public void deleteGelSpreadByBeforeIdx( String ExpandBefore )
	{
		CFGenKbGelSpreadByBeforeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< CFGenKbGelSpreadByBeforeIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByBeforeIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByBeforeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByBeforeIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
		}
		deepDisposeGelSpreadByBeforeIdx( ExpandBefore );
	}

	public void deleteGelSpreadByFirstIdx( String ExpandFirst )
	{
		CFGenKbGelSpreadByFirstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< CFGenKbGelSpreadByFirstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByFirstIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByFirstIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFirstIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
		}
		deepDisposeGelSpreadByFirstIdx( ExpandFirst );
	}

	public void deleteGelSpreadByEachIdx( String ExpandEach )
	{
		CFGenKbGelSpreadByEachIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< CFGenKbGelSpreadByEachIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByEachIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByEachIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEachIdx( schema.getAuthorization(),
				ExpandEach );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEachIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEachIdx( schema.getAuthorization(),
				ExpandEach );
		}
		deepDisposeGelSpreadByEachIdx( ExpandEach );
	}

	public void deleteGelSpreadByLastIdx( String ExpandLast )
	{
		CFGenKbGelSpreadByLastIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< CFGenKbGelSpreadByLastIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByLastIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByLastIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLastIdx( schema.getAuthorization(),
				ExpandLast );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLastIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLastIdx( schema.getAuthorization(),
				ExpandLast );
		}
		deepDisposeGelSpreadByLastIdx( ExpandLast );
	}

	public void deleteGelSpreadByLoneIdx( String ExpandLone )
	{
		CFGenKbGelSpreadByLoneIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< CFGenKbGelSpreadByLoneIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByLoneIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByLoneIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLoneIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLoneIdx( schema.getAuthorization(),
				ExpandLone );
		}
		deepDisposeGelSpreadByLoneIdx( ExpandLone );
	}

	public void deleteGelSpreadByEmptyIdx( String ExpandEmpty )
	{
		CFGenKbGelSpreadByEmptyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< CFGenKbGelSpreadByEmptyIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj > >();
		}
		if( indexByEmptyIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelSpreadObj> dict = indexByEmptyIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			Iterator<ICFGenKbGelSpreadObj> iter = dict.values().iterator();
			ICFGenKbGelSpreadObj obj;
			List<ICFGenKbGelSpreadObj> toForget = new LinkedList<ICFGenKbGelSpreadObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEmptyIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
		}
		deepDisposeGelSpreadByEmptyIdx( ExpandEmpty );
	}
}