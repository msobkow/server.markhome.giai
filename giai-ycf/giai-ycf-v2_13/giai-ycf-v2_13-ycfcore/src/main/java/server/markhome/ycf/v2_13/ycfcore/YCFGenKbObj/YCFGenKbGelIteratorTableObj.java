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

public class YCFGenKbGelIteratorTableObj
	implements IYCFGenKbGelIteratorTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> members;
	private Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> allGelIterator;
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByTenantIdx;
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByGelCacheIdx;
	private Map< YCFGenKbGelInstructionByChainIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByChainIdx;
	private Map< YCFGenKbGelIteratorByBeforeIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByBeforeIdx;
	private Map< YCFGenKbGelIteratorByFirstIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByFirstIdx;
	private Map< YCFGenKbGelIteratorByEachIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByEachIdx;
	private Map< YCFGenKbGelIteratorByLastIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByLastIdx;
	private Map< YCFGenKbGelIteratorByLoneIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByLoneIdx;
	private Map< YCFGenKbGelIteratorByEmptyIdxKey,
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > > indexByEmptyIdx;
	public static String TABLE_NAME = "GelIterator";
	public static String TABLE_DBNAME = "geliter";

	public YCFGenKbGelIteratorTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
		allGelIterator = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
	}

	public YCFGenKbGelIteratorTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
		allGelIterator = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
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
		allGelIterator = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
		List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
		IYCFGenKbGelIteratorObj cur = null;
		Iterator<IYCFGenKbGelIteratorObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelIteratorObj.
	 */
	public IYCFGenKbGelIteratorObj newInstance() {
		IYCFGenKbGelIteratorObj inst = new YCFGenKbGelIteratorObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelIteratorObj.
	 */
	public IYCFGenKbGelIteratorEditObj newEditInstance( IYCFGenKbGelIteratorObj orig ) {
		IYCFGenKbGelIteratorEditObj edit = new YCFGenKbGelIteratorEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelIteratorObj realiseGelIterator( IYCFGenKbGelIteratorObj Obj ) {
		IYCFGenKbGelIteratorObj obj = Obj;
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelIteratorObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelIteratorObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByBeforeIdx != null ) {
				YCFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.remove( keepObj.getPKey() );
					if( mapBeforeIdx.size() <= 0 ) {
						indexByBeforeIdx.remove( keyBeforeIdx );
					}
				}
			}

			if( indexByFirstIdx != null ) {
				YCFGenKbGelIteratorByFirstIdxKey keyFirstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.remove( keepObj.getPKey() );
					if( mapFirstIdx.size() <= 0 ) {
						indexByFirstIdx.remove( keyFirstIdx );
					}
				}
			}

			if( indexByEachIdx != null ) {
				YCFGenKbGelIteratorByEachIdxKey keyEachIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.remove( keepObj.getPKey() );
					if( mapEachIdx.size() <= 0 ) {
						indexByEachIdx.remove( keyEachIdx );
					}
				}
			}

			if( indexByLastIdx != null ) {
				YCFGenKbGelIteratorByLastIdxKey keyLastIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.remove( keepObj.getPKey() );
					if( mapLastIdx.size() <= 0 ) {
						indexByLastIdx.remove( keyLastIdx );
					}
				}
			}

			if( indexByLoneIdx != null ) {
				YCFGenKbGelIteratorByLoneIdxKey keyLoneIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.remove( keepObj.getPKey() );
					if( mapLoneIdx.size() <= 0 ) {
						indexByLoneIdx.remove( keyLoneIdx );
					}
				}
			}

			if( indexByEmptyIdx != null ) {
				YCFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
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
			keepObj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				YCFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				YCFGenKbGelIteratorByFirstIdxKey keyFirstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				YCFGenKbGelIteratorByEachIdxKey keyEachIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				YCFGenKbGelIteratorByLastIdxKey keyLastIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				YCFGenKbGelIteratorByLoneIdxKey keyLoneIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				YCFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelIterator != null ) {
				allGelIterator.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelIterator != null ) {
				allGelIterator.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
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
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				YCFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				YCFGenKbGelIteratorByFirstIdxKey keyFirstIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				YCFGenKbGelIteratorByEachIdxKey keyEachIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				YCFGenKbGelIteratorByLastIdxKey keyLastIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				YCFGenKbGelIteratorByLoneIdxKey keyLoneIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				YCFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelIteratorObj createGelIterator( IYCFGenKbGelIteratorObj Obj ) {
		IYCFGenKbGelIteratorObj obj = Obj;
		YCFGenKbGelIteratorBuff buff = obj.getGelIteratorBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().createGelIterator(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a917" ) ) {
			obj = (IYCFGenKbGelIteratorObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelIteratorObj readGelIterator( YCFGenKbGelInstructionPKey pkey ) {
		return( readGelIterator( pkey, false ) );
	}

	public IYCFGenKbGelIteratorObj readGelIterator( YCFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		IYCFGenKbGelIteratorObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelIteratorBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelIteratorObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelIteratorObj readCachedGelIterator( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelIteratorObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelIterator( IYCFGenKbGelIteratorObj obj )
	{
		final String S_ProcName = "YCFGenKbGelIteratorTableObj.reallyDeepDisposeGelIterator() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelInstructionPKey pkey = obj.getPKey();
		IYCFGenKbGelIteratorObj existing = readCachedGelIterator( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		YCFGenKbGelIteratorByFirstIdxKey keyFirstIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		YCFGenKbGelIteratorByEachIdxKey keyEachIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		YCFGenKbGelIteratorByLastIdxKey keyLastIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		YCFGenKbGelIteratorByLoneIdxKey keyLoneIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		YCFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		keyEmptyIdx.setOptionalExpandEmpty( existing.getOptionalExpandEmpty() );



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
	public void deepDisposeGelIterator( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelIteratorObj obj = readCachedGelIterator( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelIteratorObj lockGelIterator( YCFGenKbGelInstructionPKey pkey ) {
		IYCFGenKbGelIteratorObj locked = null;
		YCFGenKbGelIteratorBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelIteratorObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelIterator", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelIteratorObj> readAllGelIterator() {
		return( readAllGelIterator( false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readAllGelIterator( boolean forceRead ) {
		final String S_ProcName = "readAllGelIterator";
		if( ( allGelIterator == null ) || forceRead ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> map = new HashMap<YCFGenKbGelInstructionPKey,IYCFGenKbGelIteratorObj>();
			allGelIterator = map;
			YCFGenKbGelIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelIteratorBuff buff;
			IYCFGenKbGelIteratorObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
			}
		}
		int len = allGelIterator.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = allGelIterator.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readCachedAllGelIterator() {
		final String S_ProcName = "readCachedAllGelIterator";
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( allGelIterator != null ) {
			int len = allGelIterator.size();
			IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
			Iterator<IYCFGenKbGelIteratorObj> valIter = allGelIterator.values().iterator();
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
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public IYCFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelIteratorByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public IYCFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelIteratorObj obj = readGelIterator( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId )
	{
		return( readGelIteratorByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelIteratorByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelIteratorByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelInstructionObj obj;
			YCFGenKbGelInstructionBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			YCFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore )
	{
		return( readGelIteratorByBeforeIdx( ExpandBefore,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByBeforeIdx";
		YCFGenKbGelIteratorByBeforeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< YCFGenKbGelIteratorByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByBeforeIdx.containsKey( key ) ) {
			dict = indexByBeforeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelIteratorObj obj;
			YCFGenKbGelIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			YCFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBeforeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst )
	{
		return( readGelIteratorByFirstIdx( ExpandFirst,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByFirstIdx";
		YCFGenKbGelIteratorByFirstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< YCFGenKbGelIteratorByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByFirstIdx.containsKey( key ) ) {
			dict = indexByFirstIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelIteratorObj obj;
			YCFGenKbGelIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			YCFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFirstIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach )
	{
		return( readGelIteratorByEachIdx( ExpandEach,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByEachIdx";
		YCFGenKbGelIteratorByEachIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< YCFGenKbGelIteratorByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByEachIdx.containsKey( key ) ) {
			dict = indexByEachIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelIteratorObj obj;
			YCFGenKbGelIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByEachIdx( schema.getAuthorization(),
				ExpandEach );
			YCFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEachIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast )
	{
		return( readGelIteratorByLastIdx( ExpandLast,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByLastIdx";
		YCFGenKbGelIteratorByLastIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< YCFGenKbGelIteratorByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByLastIdx.containsKey( key ) ) {
			dict = indexByLastIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelIteratorObj obj;
			YCFGenKbGelIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByLastIdx( schema.getAuthorization(),
				ExpandLast );
			YCFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLastIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone )
	{
		return( readGelIteratorByLoneIdx( ExpandLone,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByLoneIdx";
		YCFGenKbGelIteratorByLoneIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< YCFGenKbGelIteratorByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByLoneIdx.containsKey( key ) ) {
			dict = indexByLoneIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelIteratorObj obj;
			YCFGenKbGelIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			YCFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLoneIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		return( readGelIteratorByEmptyIdx( ExpandEmpty,
			false ) );
	}

	public List<IYCFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByEmptyIdx";
		YCFGenKbGelIteratorByEmptyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< YCFGenKbGelIteratorByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByEmptyIdx.containsKey( key ) ) {
			dict = indexByEmptyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj>();
			IYCFGenKbGelIteratorObj obj;
			YCFGenKbGelIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			YCFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelIteratorObj realised = (IYCFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEmptyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
		Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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
		List<IYCFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelIteratorObj readCachedGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelIteratorObj obj = null;
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelIterator( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelIteratorByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelIteratorByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByGelCacheIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelIteratorByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByChainIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByBeforeIdx( String ExpandBefore )
	{
		final String S_ProcName = "readCachedGelIteratorByBeforeIdx";
		YCFGenKbGelIteratorByBeforeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByBeforeIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByBeforeIdx.containsKey( key ) ) {
				dict = indexByBeforeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByFirstIdx( String ExpandFirst )
	{
		final String S_ProcName = "readCachedGelIteratorByFirstIdx";
		YCFGenKbGelIteratorByFirstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByFirstIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByFirstIdx.containsKey( key ) ) {
				dict = indexByFirstIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByEachIdx( String ExpandEach )
	{
		final String S_ProcName = "readCachedGelIteratorByEachIdx";
		YCFGenKbGelIteratorByEachIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByEachIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByEachIdx.containsKey( key ) ) {
				dict = indexByEachIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByLastIdx( String ExpandLast )
	{
		final String S_ProcName = "readCachedGelIteratorByLastIdx";
		YCFGenKbGelIteratorByLastIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByLastIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByLastIdx.containsKey( key ) ) {
				dict = indexByLastIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByLoneIdx( String ExpandLone )
	{
		final String S_ProcName = "readCachedGelIteratorByLoneIdx";
		YCFGenKbGelIteratorByLoneIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByLoneIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByLoneIdx.containsKey( key ) ) {
				dict = indexByLoneIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		final String S_ProcName = "readCachedGelIteratorByEmptyIdx";
		YCFGenKbGelIteratorByEmptyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		ArrayList<IYCFGenKbGelIteratorObj> arrayList = new ArrayList<IYCFGenKbGelIteratorObj>();
		if( indexByEmptyIdx != null ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict;
			if( indexByEmptyIdx.containsKey( key ) ) {
				dict = indexByEmptyIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelIteratorObj arr[] = new IYCFGenKbGelIteratorObj[len];
				Iterator<IYCFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelIteratorObj obj;
			Iterator<IYCFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelIteratorObj> cmp = new Comparator<IYCFGenKbGelIteratorObj>() {
			public int compare( IYCFGenKbGelIteratorObj lhs, IYCFGenKbGelIteratorObj rhs ) {
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

	public void deepDisposeGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		IYCFGenKbGelIteratorObj obj = readCachedGelIteratorByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelIteratorByTenantIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelIteratorByGelCacheIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelIteratorByChainIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByBeforeIdx( String ExpandBefore )
	{
		final String S_ProcName = "deepDisposeGelIteratorByBeforeIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByBeforeIdx( ExpandBefore );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByFirstIdx( String ExpandFirst )
	{
		final String S_ProcName = "deepDisposeGelIteratorByFirstIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByFirstIdx( ExpandFirst );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByEachIdx( String ExpandEach )
	{
		final String S_ProcName = "deepDisposeGelIteratorByEachIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByEachIdx( ExpandEach );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByLastIdx( String ExpandLast )
	{
		final String S_ProcName = "deepDisposeGelIteratorByLastIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByLastIdx( ExpandLast );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByLoneIdx( String ExpandLone )
	{
		final String S_ProcName = "deepDisposeGelIteratorByLoneIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByLoneIdx( ExpandLone );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		final String S_ProcName = "deepDisposeGelIteratorByEmptyIdx";
		IYCFGenKbGelIteratorObj obj;
		List<IYCFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByEmptyIdx( ExpandEmpty );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGelIteratorObj updateGelIterator( IYCFGenKbGelIteratorObj Obj ) {
		IYCFGenKbGelIteratorObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().updateGelIterator( schema.getAuthorization(),
			Obj.getGelIteratorBuff() );
		if( Obj.getClassCode().equals( "a917" ) ) {
			obj = (IYCFGenKbGelIteratorObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelIterator( IYCFGenKbGelIteratorObj Obj ) {
		IYCFGenKbGelIteratorObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIterator( schema.getAuthorization(),
			obj.getGelIteratorBuff() );
		Obj.forget();
	}

	public void deleteGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		YCFGenKbGelInstructionPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		IYCFGenKbGelIteratorObj obj = readGelIterator( pkey );
		if( obj != null ) {
			IYCFGenKbGelIteratorEditObj editObj = (IYCFGenKbGelIteratorEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelIteratorEditObj)obj.beginEdit();
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
		deepDisposeGelIteratorByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelIteratorByTenantIdx( long TenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelIteratorByTenantIdx( TenantId );
	}

	public void deleteGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByGelCacheIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelIteratorByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByChainIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelIteratorByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelIteratorByBeforeIdx( String ExpandBefore )
	{
		YCFGenKbGelIteratorByBeforeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< YCFGenKbGelIteratorByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByBeforeIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByBeforeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
		}
		deepDisposeGelIteratorByBeforeIdx( ExpandBefore );
	}

	public void deleteGelIteratorByFirstIdx( String ExpandFirst )
	{
		YCFGenKbGelIteratorByFirstIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< YCFGenKbGelIteratorByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByFirstIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByFirstIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
		}
		deepDisposeGelIteratorByFirstIdx( ExpandFirst );
	}

	public void deleteGelIteratorByEachIdx( String ExpandEach )
	{
		YCFGenKbGelIteratorByEachIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< YCFGenKbGelIteratorByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByEachIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByEachIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEachIdx( schema.getAuthorization(),
				ExpandEach );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEachIdx( schema.getAuthorization(),
				ExpandEach );
		}
		deepDisposeGelIteratorByEachIdx( ExpandEach );
	}

	public void deleteGelIteratorByLastIdx( String ExpandLast )
	{
		YCFGenKbGelIteratorByLastIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< YCFGenKbGelIteratorByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByLastIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByLastIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLastIdx( schema.getAuthorization(),
				ExpandLast );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLastIdx( schema.getAuthorization(),
				ExpandLast );
		}
		deepDisposeGelIteratorByLastIdx( ExpandLast );
	}

	public void deleteGelIteratorByLoneIdx( String ExpandLone )
	{
		YCFGenKbGelIteratorByLoneIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< YCFGenKbGelIteratorByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByLoneIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByLoneIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLoneIdx( schema.getAuthorization(),
				ExpandLone );
		}
		deepDisposeGelIteratorByLoneIdx( ExpandLone );
	}

	public void deleteGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		YCFGenKbGelIteratorByEmptyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< YCFGenKbGelIteratorByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj > >();
		}
		if( indexByEmptyIdx.containsKey( key ) ) {
			Map<YCFGenKbGelInstructionPKey, IYCFGenKbGelIteratorObj> dict = indexByEmptyIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			Iterator<IYCFGenKbGelIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGelIteratorObj obj;
			List<IYCFGenKbGelIteratorObj> toForget = new LinkedList<IYCFGenKbGelIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
		}
		deepDisposeGelIteratorByEmptyIdx( ExpandEmpty );
	}
}
