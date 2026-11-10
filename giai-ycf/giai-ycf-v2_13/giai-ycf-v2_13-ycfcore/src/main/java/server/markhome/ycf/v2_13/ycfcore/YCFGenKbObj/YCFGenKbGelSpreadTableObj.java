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

public class YCFGenKbGelSpreadTableObj
	implements IYCFGenKbGelSpreadTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> allGelSpread;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByChainIdx;
	private Map< YCFGenKbGelSpreadByBetweenIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByBetweenIdx;
	private Map< YCFGenKbGelSpreadByBeforeIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByBeforeIdx;
	private Map< YCFGenKbGelSpreadByFirstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByFirstIdx;
	private Map< YCFGenKbGelSpreadByEachIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByEachIdx;
	private Map< YCFGenKbGelSpreadByLastIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByLastIdx;
	private Map< YCFGenKbGelSpreadByLoneIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByLoneIdx;
	private Map< YCFGenKbGelSpreadByEmptyIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > > indexByEmptyIdx;
	public static String TABLE_NAME = "GelSpread";
	public static String TABLE_DBNAME = "gelspred";

	public YCFGenKbGelSpreadTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
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

	public YCFGenKbGelSpreadTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
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
		List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
		IYCFGenKbGelSpreadObj cur = null;
		Iterator<IYCFGenKbGelSpreadObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelSpreadObj.
	 */
	public IYCFGenKbGelSpreadObj newInstance() {
		IYCFGenKbGelSpreadObj inst = new YCFGenKbGelSpreadObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelSpreadObj.
	 */
	public IYCFGenKbGelSpreadEditObj newEditInstance( IYCFGenKbGelSpreadObj orig ) {
		IYCFGenKbGelSpreadEditObj edit = new YCFGenKbGelSpreadEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelSpreadObj realiseGelSpread( IYCFGenKbGelSpreadObj Obj ) {
		IYCFGenKbGelSpreadObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelSpreadObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelSpreadObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByBetweenIdx != null ) {
				YCFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
				keyBetweenIdx.setOptionalExpandBetween( keepObj.getOptionalExpandBetween() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapBetweenIdx = indexByBetweenIdx.get( keyBetweenIdx );
				if( mapBetweenIdx != null ) {
					mapBetweenIdx.remove( keepObj.getPKey() );
					if( mapBetweenIdx.size() <= 0 ) {
						indexByBetweenIdx.remove( keyBetweenIdx );
					}
				}
			}

			if( indexByBeforeIdx != null ) {
				YCFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.remove( keepObj.getPKey() );
					if( mapBeforeIdx.size() <= 0 ) {
						indexByBeforeIdx.remove( keyBeforeIdx );
					}
				}
			}

			if( indexByFirstIdx != null ) {
				YCFGenKbGelSpreadByFirstIdxKey keyFirstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.remove( keepObj.getPKey() );
					if( mapFirstIdx.size() <= 0 ) {
						indexByFirstIdx.remove( keyFirstIdx );
					}
				}
			}

			if( indexByEachIdx != null ) {
				YCFGenKbGelSpreadByEachIdxKey keyEachIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.remove( keepObj.getPKey() );
					if( mapEachIdx.size() <= 0 ) {
						indexByEachIdx.remove( keyEachIdx );
					}
				}
			}

			if( indexByLastIdx != null ) {
				YCFGenKbGelSpreadByLastIdxKey keyLastIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.remove( keepObj.getPKey() );
					if( mapLastIdx.size() <= 0 ) {
						indexByLastIdx.remove( keyLastIdx );
					}
				}
			}

			if( indexByLoneIdx != null ) {
				YCFGenKbGelSpreadByLoneIdxKey keyLoneIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.remove( keepObj.getPKey() );
					if( mapLoneIdx.size() <= 0 ) {
						indexByLoneIdx.remove( keyLoneIdx );
					}
				}
			}

			if( indexByEmptyIdx != null ) {
				YCFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
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
			keepObj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBetweenIdx != null ) {
				YCFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
				keyBetweenIdx.setOptionalExpandBetween( keepObj.getOptionalExpandBetween() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapBetweenIdx = indexByBetweenIdx.get( keyBetweenIdx );
				if( mapBetweenIdx != null ) {
					mapBetweenIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				YCFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				YCFGenKbGelSpreadByFirstIdxKey keyFirstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				YCFGenKbGelSpreadByEachIdxKey keyEachIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				YCFGenKbGelSpreadByLastIdxKey keyLastIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				YCFGenKbGelSpreadByLoneIdxKey keyLoneIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				YCFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
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
			keepObj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelSpread != null ) {
				allGelSpread.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBetweenIdx != null ) {
				YCFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
				keyBetweenIdx.setOptionalExpandBetween( keepObj.getOptionalExpandBetween() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapBetweenIdx = indexByBetweenIdx.get( keyBetweenIdx );
				if( mapBetweenIdx != null ) {
					mapBetweenIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				YCFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				YCFGenKbGelSpreadByFirstIdxKey keyFirstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				YCFGenKbGelSpreadByEachIdxKey keyEachIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				YCFGenKbGelSpreadByLastIdxKey keyLastIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				YCFGenKbGelSpreadByLoneIdxKey keyLoneIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				YCFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelSpreadObj createGelSpread( IYCFGenKbGelSpreadObj Obj ) {
		IYCFGenKbGelSpreadObj obj = Obj;
		YCFGenKbGelSpreadBuff buff = obj.getGelSpreadBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().createGelSpread(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a918" ) ) {
			obj = (IYCFGenKbGelSpreadObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelSpreadObj readGelSpread( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelSpread( pkey, false ) );
	}

	public IYCFGenKbGelSpreadObj readGelSpread( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelSpreadObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelSpreadBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelSpreadObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelSpreadObj readCachedGelSpread( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelSpreadObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelSpread( IYCFGenKbGelSpreadObj obj )
	{
		final String S_ProcName = "YCFGenKbGelSpreadTableObj.reallyDeepDisposeGelSpread() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelSpreadObj existing = readCachedGelSpread( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		keyBetweenIdx.setOptionalExpandBetween( existing.getOptionalExpandBetween() );

		YCFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		YCFGenKbGelSpreadByFirstIdxKey keyFirstIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		YCFGenKbGelSpreadByEachIdxKey keyEachIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		YCFGenKbGelSpreadByLastIdxKey keyLastIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		YCFGenKbGelSpreadByLoneIdxKey keyLoneIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		YCFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
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
	public void deepDisposeGelSpread( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelSpreadObj obj = readCachedGelSpread( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelSpreadObj lockGelSpread( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelSpreadObj locked = null;
		YCFGenKbGelSpreadBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelSpreadObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelSpread", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelSpreadObj> readAllGelSpread() {
		return( readAllGelSpread( false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readAllGelSpread( boolean forceRead ) {
		final String S_ProcName = "readAllGelSpread";
		if( ( allGelSpread == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelSpreadObj>();
			allGelSpread = map;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelSpreadBuff buff;
			IYCFGenKbGelSpreadObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
			}
		}
		int len = allGelSpread.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = allGelSpread.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readCachedAllGelSpread() {
		final String S_ProcName = "readCachedAllGelSpread";
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( allGelSpread != null ) {
			int len = allGelSpread.size();
			IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
			Iterator<IYCFGenKbGelSpreadObj> valIter = allGelSpread.values().iterator();
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
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public IYCFGenKbGelSpreadObj readGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelSpreadByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelSpreadObj readGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelSpreadObj obj = readGelSpread( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByTenantIdx( long TenantId )
	{
		return( readGelSpreadByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelSpreadByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelSpreadByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByBetweenIdx( String ExpandBetween )
	{
		return( readGelSpreadByBetweenIdx( ExpandBetween,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByBetweenIdx( String ExpandBetween,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByBetweenIdx";
		YCFGenKbGelSpreadByBetweenIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( ExpandBetween );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByBetweenIdx == null ) {
			indexByBetweenIdx = new HashMap< YCFGenKbGelSpreadByBetweenIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByBetweenIdx.containsKey( key ) ) {
			dict = indexByBetweenIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelSpreadObj obj;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByBetweenIdx( schema.getAuthorization(),
				ExpandBetween );
			YCFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBetweenIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByBeforeIdx( String ExpandBefore )
	{
		return( readGelSpreadByBeforeIdx( ExpandBefore,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByBeforeIdx( String ExpandBefore,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByBeforeIdx";
		YCFGenKbGelSpreadByBeforeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< YCFGenKbGelSpreadByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByBeforeIdx.containsKey( key ) ) {
			dict = indexByBeforeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelSpreadObj obj;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			YCFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBeforeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByFirstIdx( String ExpandFirst )
	{
		return( readGelSpreadByFirstIdx( ExpandFirst,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByFirstIdx( String ExpandFirst,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByFirstIdx";
		YCFGenKbGelSpreadByFirstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< YCFGenKbGelSpreadByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByFirstIdx.containsKey( key ) ) {
			dict = indexByFirstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelSpreadObj obj;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			YCFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFirstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByEachIdx( String ExpandEach )
	{
		return( readGelSpreadByEachIdx( ExpandEach,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByEachIdx( String ExpandEach,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByEachIdx";
		YCFGenKbGelSpreadByEachIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< YCFGenKbGelSpreadByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByEachIdx.containsKey( key ) ) {
			dict = indexByEachIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelSpreadObj obj;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByEachIdx( schema.getAuthorization(),
				ExpandEach );
			YCFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEachIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByLastIdx( String ExpandLast )
	{
		return( readGelSpreadByLastIdx( ExpandLast,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByLastIdx( String ExpandLast,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByLastIdx";
		YCFGenKbGelSpreadByLastIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< YCFGenKbGelSpreadByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByLastIdx.containsKey( key ) ) {
			dict = indexByLastIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelSpreadObj obj;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByLastIdx( schema.getAuthorization(),
				ExpandLast );
			YCFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLastIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByLoneIdx( String ExpandLone )
	{
		return( readGelSpreadByLoneIdx( ExpandLone,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByLoneIdx( String ExpandLone,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByLoneIdx";
		YCFGenKbGelSpreadByLoneIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< YCFGenKbGelSpreadByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByLoneIdx.containsKey( key ) ) {
			dict = indexByLoneIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelSpreadObj obj;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			YCFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLoneIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByEmptyIdx( String ExpandEmpty )
	{
		return( readGelSpreadByEmptyIdx( ExpandEmpty,
			false ) );
	}

	public List<IYCFGenKbGelSpreadObj> readGelSpreadByEmptyIdx( String ExpandEmpty,
		boolean forceRead )
	{
		final String S_ProcName = "readGelSpreadByEmptyIdx";
		YCFGenKbGelSpreadByEmptyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< YCFGenKbGelSpreadByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( ( ! forceRead ) && indexByEmptyIdx.containsKey( key ) ) {
			dict = indexByEmptyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj>();
			IYCFGenKbGelSpreadObj obj;
			YCFGenKbGelSpreadBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			YCFGenKbGelSpreadBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelSpreadObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelSpreadObj realised = (IYCFGenKbGelSpreadObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEmptyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
		Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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
		List<IYCFGenKbGelSpreadObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelSpreadObj readCachedGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelSpreadObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelSpread( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelSpreadByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelSpreadByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelSpreadByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByBetweenIdx( String ExpandBetween )
	{
		final String S_ProcName = "readCachedGelSpreadByBetweenIdx";
		YCFGenKbGelSpreadByBetweenIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( ExpandBetween );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByBetweenIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByBetweenIdx.containsKey( key ) ) {
				dict = indexByBetweenIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByBeforeIdx( String ExpandBefore )
	{
		final String S_ProcName = "readCachedGelSpreadByBeforeIdx";
		YCFGenKbGelSpreadByBeforeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByBeforeIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByBeforeIdx.containsKey( key ) ) {
				dict = indexByBeforeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByFirstIdx( String ExpandFirst )
	{
		final String S_ProcName = "readCachedGelSpreadByFirstIdx";
		YCFGenKbGelSpreadByFirstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByFirstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByFirstIdx.containsKey( key ) ) {
				dict = indexByFirstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByEachIdx( String ExpandEach )
	{
		final String S_ProcName = "readCachedGelSpreadByEachIdx";
		YCFGenKbGelSpreadByEachIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByEachIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByEachIdx.containsKey( key ) ) {
				dict = indexByEachIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByLastIdx( String ExpandLast )
	{
		final String S_ProcName = "readCachedGelSpreadByLastIdx";
		YCFGenKbGelSpreadByLastIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByLastIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByLastIdx.containsKey( key ) ) {
				dict = indexByLastIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByLoneIdx( String ExpandLone )
	{
		final String S_ProcName = "readCachedGelSpreadByLoneIdx";
		YCFGenKbGelSpreadByLoneIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByLoneIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByLoneIdx.containsKey( key ) ) {
				dict = indexByLoneIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByEmptyIdx( String ExpandEmpty )
	{
		final String S_ProcName = "readCachedGelSpreadByEmptyIdx";
		YCFGenKbGelSpreadByEmptyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		ArrayList<IYCFGenKbGelSpreadObj> arrayList = new ArrayList<IYCFGenKbGelSpreadObj>();
		if( indexByEmptyIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict;
			if( indexByEmptyIdx.containsKey( key ) ) {
				dict = indexByEmptyIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelSpreadObj arr[] = new IYCFGenKbGelSpreadObj[len];
				Iterator<IYCFGenKbGelSpreadObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelSpreadObj obj;
			Iterator<IYCFGenKbGelSpreadObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelSpreadObj> cmp = new Comparator<IYCFGenKbGelSpreadObj>() {
			public int compare( IYCFGenKbGelSpreadObj lhs, IYCFGenKbGelSpreadObj rhs ) {
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

	public void deepDisposeGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelSpreadObj obj = readCachedGelSpreadByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelSpreadByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelSpreadByTenantIdx";
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByBetweenIdx( ExpandBetween );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByBeforeIdx( ExpandBefore );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByFirstIdx( ExpandFirst );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByEachIdx( ExpandEach );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByLastIdx( ExpandLast );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByLoneIdx( ExpandLone );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGelSpreadObj obj;
		List<IYCFGenKbGelSpreadObj> arrayList = readCachedGelSpreadByEmptyIdx( ExpandEmpty );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelSpreadObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelSpreadObj updateGelSpread( IYCFGenKbGelSpreadObj Obj ) {
		IYCFGenKbGelSpreadObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().updateGelSpread( schema.getAuthorization(),
			Obj.getGelSpreadBuff() );
		if( Obj.getClassCode().equals( "a918" ) ) {
			obj = (IYCFGenKbGelSpreadObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelSpread( IYCFGenKbGelSpreadObj Obj ) {
		IYCFGenKbGelSpreadObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpread( schema.getAuthorization(),
			obj.getGelSpreadBuff() );
		Obj.forget();
	}

	public void deleteGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelSpreadObj obj = readGelSpread( pkey );
		if( obj != null ) {
			IYCFGenKbGelSpreadEditObj editObj = (IYCFGenKbGelSpreadEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelSpreadEditObj)obj.beginEdit();
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
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelSpreadByTenantIdx( TenantId );
	}

	public void deleteGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByGelCacheIdx( schema.getAuthorization(),
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
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByChainIdx( schema.getAuthorization(),
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
		YCFGenKbGelSpreadByBetweenIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( ExpandBetween );
		if( indexByBetweenIdx == null ) {
			indexByBetweenIdx = new HashMap< YCFGenKbGelSpreadByBetweenIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByBetweenIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByBetweenIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBetweenIdx( schema.getAuthorization(),
				ExpandBetween );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBetweenIdx( schema.getAuthorization(),
				ExpandBetween );
		}
		deepDisposeGelSpreadByBetweenIdx( ExpandBetween );
	}

	public void deleteGelSpreadByBeforeIdx( String ExpandBefore )
	{
		YCFGenKbGelSpreadByBeforeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< YCFGenKbGelSpreadByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByBeforeIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByBeforeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
		}
		deepDisposeGelSpreadByBeforeIdx( ExpandBefore );
	}

	public void deleteGelSpreadByFirstIdx( String ExpandFirst )
	{
		YCFGenKbGelSpreadByFirstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< YCFGenKbGelSpreadByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByFirstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByFirstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
		}
		deepDisposeGelSpreadByFirstIdx( ExpandFirst );
	}

	public void deleteGelSpreadByEachIdx( String ExpandEach )
	{
		YCFGenKbGelSpreadByEachIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< YCFGenKbGelSpreadByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByEachIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByEachIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEachIdx( schema.getAuthorization(),
				ExpandEach );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEachIdx( schema.getAuthorization(),
				ExpandEach );
		}
		deepDisposeGelSpreadByEachIdx( ExpandEach );
	}

	public void deleteGelSpreadByLastIdx( String ExpandLast )
	{
		YCFGenKbGelSpreadByLastIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< YCFGenKbGelSpreadByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByLastIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByLastIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLastIdx( schema.getAuthorization(),
				ExpandLast );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLastIdx( schema.getAuthorization(),
				ExpandLast );
		}
		deepDisposeGelSpreadByLastIdx( ExpandLast );
	}

	public void deleteGelSpreadByLoneIdx( String ExpandLone )
	{
		YCFGenKbGelSpreadByLoneIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< YCFGenKbGelSpreadByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByLoneIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByLoneIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByLoneIdx( schema.getAuthorization(),
				ExpandLone );
		}
		deepDisposeGelSpreadByLoneIdx( ExpandLone );
	}

	public void deleteGelSpreadByEmptyIdx( String ExpandEmpty )
	{
		YCFGenKbGelSpreadByEmptyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< YCFGenKbGelSpreadByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj > >();
		}
		if( indexByEmptyIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelSpreadObj> dict = indexByEmptyIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			Iterator<IYCFGenKbGelSpreadObj> iter = dict.values().iterator();
			IYCFGenKbGelSpreadObj obj;
			List<IYCFGenKbGelSpreadObj> toForget = new LinkedList<IYCFGenKbGelSpreadObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().deleteGelSpreadByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
		}
		deepDisposeGelSpreadByEmptyIdx( ExpandEmpty );
	}
}
