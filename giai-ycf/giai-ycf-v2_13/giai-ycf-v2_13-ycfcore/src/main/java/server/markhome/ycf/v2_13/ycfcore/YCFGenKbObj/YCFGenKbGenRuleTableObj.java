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

public class YCFGenKbGenRuleTableObj
	implements IYCFGenKbGenRuleTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> members;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> allGenRule;
	private Map< YCFGenKbGenItemByTenantIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByTenantIdx;
	private Map< YCFGenKbGenItemByCartIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByCartIdx;
	private Map< YCFGenKbGenItemByRuleTypeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByRuleTypeIdx;
	private Map< YCFGenKbGenItemByToolSetIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByToolSetIdx;
	private Map< YCFGenKbGenItemByScopeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByScopeIdx;
	private Map< YCFGenKbGenItemByGenDefIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByGenDefIdx;
	private Map< YCFGenKbGenItemByAltIdxKey,
		IYCFGenKbGenRuleObj > indexByAltIdx;
	private Map< YCFGenKbGenItemByGelExecIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByGelExecIdx;
	private Map< YCFGenKbGenItemByProbeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByProbeIdx;
	private Map< YCFGenKbGenRuleByBodyIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > > indexByBodyIdx;
	public static String TABLE_NAME = "GenRule";
	public static String TABLE_DBNAME = "kbgenrule";

	public YCFGenKbGenRuleTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
		allGenRule = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
		indexByBodyIdx = null;
	}

	public YCFGenKbGenRuleTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
		allGenRule = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
		indexByBodyIdx = null;
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
		allGenRule = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
		indexByBodyIdx = null;
		List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
		IYCFGenKbGenRuleObj cur = null;
		Iterator<IYCFGenKbGenRuleObj> iter = members.values().iterator();
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
	 *	YCFGenKbGenRuleObj.
	 */
	public IYCFGenKbGenRuleObj newInstance() {
		IYCFGenKbGenRuleObj inst = new YCFGenKbGenRuleObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGenRuleObj.
	 */
	public IYCFGenKbGenRuleEditObj newEditInstance( IYCFGenKbGenRuleObj orig ) {
		IYCFGenKbGenRuleEditObj edit = new YCFGenKbGenRuleEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGenRuleObj realiseGenRule( IYCFGenKbGenRuleObj Obj ) {
		IYCFGenKbGenRuleObj obj = Obj;
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenRuleObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGenRuleObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					indexByCartIdx.remove( keyCartIdx );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					indexByRuleTypeIdx.remove( keyRuleTypeIdx );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					indexByToolSetIdx.remove( keyToolSetIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
				if( mapGenDefIdx != null ) {
					indexByGenDefIdx.remove( keyGenDefIdx );
				}
			}

			if( indexByAltIdx != null ) {
				YCFGenKbGenItemByAltIdxKey keyAltIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
				keyAltIdx.setRequiredName( keepObj.getRequiredName() );
				keyAltIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				keyAltIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				keyAltIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				indexByAltIdx.remove( keyAltIdx );
			}

			if( indexByGelExecIdx != null ) {
				YCFGenKbGenItemByGelExecIdxKey keyGelExecIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
				keyGelExecIdx.setOptionalGelExecutableTenantId( keepObj.getOptionalGelExecutableTenantId() );
				keyGelExecIdx.setOptionalGelExecutableGelCacheId( keepObj.getOptionalGelExecutableGelCacheId() );
				keyGelExecIdx.setOptionalGelExecutableId( keepObj.getOptionalGelExecutableId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
				if( mapGelExecIdx != null ) {
					indexByGelExecIdx.remove( keyGelExecIdx );
				}
			}

			if( indexByProbeIdx != null ) {
				YCFGenKbGenItemByProbeIdxKey keyProbeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
				keyProbeIdx.setOptionalProbeTenantId( keepObj.getOptionalProbeTenantId() );
				keyProbeIdx.setOptionalProbeCartridgeId( keepObj.getOptionalProbeCartridgeId() );
				keyProbeIdx.setOptionalProbeGenItemId( keepObj.getOptionalProbeGenItemId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					indexByProbeIdx.remove( keyProbeIdx );
				}
			}

			if( indexByBodyIdx != null ) {
				YCFGenKbGenRuleByBodyIdxKey keyBodyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
				keyBodyIdx.setOptionalBodyTenantId( keepObj.getOptionalBodyTenantId() );
				keyBodyIdx.setOptionalBodyGelCacheId( keepObj.getOptionalBodyGelCacheId() );
				keyBodyIdx.setOptionalBodyGelId( keepObj.getOptionalBodyGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					mapBodyIdx.remove( keepObj.getPKey() );
					if( mapBodyIdx.size() <= 0 ) {
						indexByBodyIdx.remove( keyBodyIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().realiseGenItem( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
				if( mapGenDefIdx != null ) {
					mapGenDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				YCFGenKbGenItemByAltIdxKey keyAltIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
				keyAltIdx.setRequiredName( keepObj.getRequiredName() );
				keyAltIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				keyAltIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				keyAltIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

			if( indexByGelExecIdx != null ) {
				YCFGenKbGenItemByGelExecIdxKey keyGelExecIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
				keyGelExecIdx.setOptionalGelExecutableTenantId( keepObj.getOptionalGelExecutableTenantId() );
				keyGelExecIdx.setOptionalGelExecutableGelCacheId( keepObj.getOptionalGelExecutableGelCacheId() );
				keyGelExecIdx.setOptionalGelExecutableId( keepObj.getOptionalGelExecutableId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
				if( mapGelExecIdx != null ) {
					mapGelExecIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProbeIdx != null ) {
				YCFGenKbGenItemByProbeIdxKey keyProbeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
				keyProbeIdx.setOptionalProbeTenantId( keepObj.getOptionalProbeTenantId() );
				keyProbeIdx.setOptionalProbeCartridgeId( keepObj.getOptionalProbeCartridgeId() );
				keyProbeIdx.setOptionalProbeGenItemId( keepObj.getOptionalProbeGenItemId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBodyIdx != null ) {
				YCFGenKbGenRuleByBodyIdxKey keyBodyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
				keyBodyIdx.setOptionalBodyTenantId( keepObj.getOptionalBodyTenantId() );
				keyBodyIdx.setOptionalBodyGelCacheId( keepObj.getOptionalBodyGelCacheId() );
				keyBodyIdx.setOptionalBodyGelId( keepObj.getOptionalBodyGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					mapBodyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGenRule != null ) {
				allGenRule.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().realiseGenItem( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGenRule != null ) {
				allGenRule.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
				if( mapGenDefIdx != null ) {
					mapGenDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				YCFGenKbGenItemByAltIdxKey keyAltIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
				keyAltIdx.setRequiredName( keepObj.getRequiredName() );
				keyAltIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				keyAltIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				keyAltIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

			if( indexByGelExecIdx != null ) {
				YCFGenKbGenItemByGelExecIdxKey keyGelExecIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
				keyGelExecIdx.setOptionalGelExecutableTenantId( keepObj.getOptionalGelExecutableTenantId() );
				keyGelExecIdx.setOptionalGelExecutableGelCacheId( keepObj.getOptionalGelExecutableGelCacheId() );
				keyGelExecIdx.setOptionalGelExecutableId( keepObj.getOptionalGelExecutableId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
				if( mapGelExecIdx != null ) {
					mapGelExecIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProbeIdx != null ) {
				YCFGenKbGenItemByProbeIdxKey keyProbeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
				keyProbeIdx.setOptionalProbeTenantId( keepObj.getOptionalProbeTenantId() );
				keyProbeIdx.setOptionalProbeCartridgeId( keepObj.getOptionalProbeCartridgeId() );
				keyProbeIdx.setOptionalProbeGenItemId( keepObj.getOptionalProbeGenItemId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBodyIdx != null ) {
				YCFGenKbGenRuleByBodyIdxKey keyBodyIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
				keyBodyIdx.setOptionalBodyTenantId( keepObj.getOptionalBodyTenantId() );
				keyBodyIdx.setOptionalBodyGelCacheId( keepObj.getOptionalBodyGelCacheId() );
				keyBodyIdx.setOptionalBodyGelId( keepObj.getOptionalBodyGelId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > mapBodyIdx = indexByBodyIdx.get( keyBodyIdx );
				if( mapBodyIdx != null ) {
					mapBodyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGenRuleObj createGenRule( IYCFGenKbGenRuleObj Obj ) {
		IYCFGenKbGenRuleObj obj = Obj;
		YCFGenKbGenRuleBuff buff = obj.getGenRuleBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().createGenRule(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a923" ) ) {
			obj = (IYCFGenKbGenRuleObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGenRuleObj readGenRule( YCFGenKbGenItemPKey pkey ) {
		return( readGenRule( pkey, false ) );
	}

	public IYCFGenKbGenRuleObj readGenRule( YCFGenKbGenItemPKey pkey, boolean forceRead ) {
		IYCFGenKbGenRuleObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGenRuleBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().readDerivedByItemIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredCartridgeId(),
				pkey.getRequiredItemId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGenRuleObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGenRuleObj readCachedGenRule( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenRuleObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGenRule( IYCFGenKbGenRuleObj obj )
	{
		final String S_ProcName = "YCFGenKbGenRuleTableObj.reallyDeepDisposeGenRule() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenRuleObj existing = readCachedGenRule( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGenRuleByBodyIdxKey keyBodyIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		keyBodyIdx.setOptionalBodyTenantId( existing.getOptionalBodyTenantId() );
		keyBodyIdx.setOptionalBodyGelCacheId( existing.getOptionalBodyGelCacheId() );
		keyBodyIdx.setOptionalBodyGelId( existing.getOptionalBodyGelId() );


		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalBodyTenantId(),
						existing.getOptionalBodyGelCacheId(),
						existing.getOptionalBodyGelId() );
		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );

		if( indexByBodyIdx != null ) {
			if( indexByBodyIdx.containsKey( keyBodyIdx ) ) {
				indexByBodyIdx.get( keyBodyIdx ).remove( pkey );
				if( indexByBodyIdx.get( keyBodyIdx ).size() <= 0 ) {
					indexByBodyIdx.remove( keyBodyIdx );
				}
			}
		}


		schema.getGenItemTableObj().reallyDeepDisposeGenItem( obj );
	}
	public void deepDisposeGenRule( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenRuleObj obj = readCachedGenRule( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGenRuleObj lockGenRule( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenRuleObj locked = null;
		YCFGenKbGenRuleBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGenRuleObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGenRule", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGenRuleObj> readAllGenRule() {
		return( readAllGenRule( false ) );
	}

	public List<IYCFGenKbGenRuleObj> readAllGenRule( boolean forceRead ) {
		final String S_ProcName = "readAllGenRule";
		if( ( allGenRule == null ) || forceRead ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> map = new HashMap<YCFGenKbGenItemPKey,IYCFGenKbGenRuleObj>();
			allGenRule = map;
			YCFGenKbGenRuleBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().readAllDerived( schema.getAuthorization() );
			YCFGenKbGenRuleBuff buff;
			IYCFGenKbGenRuleObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
			}
		}
		int len = allGenRule.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = allGenRule.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedAllGenRule() {
		final String S_ProcName = "readCachedAllGenRule";
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( allGenRule != null ) {
			int len = allGenRule.size();
			IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
			Iterator<IYCFGenKbGenRuleObj> valIter = allGenRule.values().iterator();
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
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbGenRuleObj readGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		return( readGenRuleByItemIdIdx( TenantId,
			CartridgeId,
			ItemId,
			false ) );
	}

	public IYCFGenKbGenRuleObj readGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId, boolean forceRead )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenRuleObj obj = readGenRule( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByTenantIdx( long TenantId )
	{
		return( readGenRuleByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByCartIdx( long TenantId,
		long CartridgeId )
	{
		return( readGenRuleByCartIdx( TenantId,
			CartridgeId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByCartIdx.containsKey( key ) ) {
			dict = indexByCartIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCartIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByRuleTypeIdx( short RuleTypeId )
	{
		return( readGenRuleByRuleTypeIdx( RuleTypeId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByRuleTypeIdx( short RuleTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByRuleTypeIdx.containsKey( key ) ) {
			dict = indexByRuleTypeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRuleTypeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByToolSetIdx( short ToolSetId )
	{
		return( readGenRuleByToolSetIdx( ToolSetId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByToolSetIdx( short ToolSetId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByToolSetIdx.containsKey( key ) ) {
			dict = indexByToolSetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToolSetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByScopeIdx( Short ScopeDefId )
	{
		return( readGenRuleByScopeIdx( ScopeDefId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByScopeIdx( Short ScopeDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByGenDefIdx( short GenDefId )
	{
		return( readGenRuleByGenDefIdx( GenDefId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByGenDefIdx( short GenDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByGenDefIdx.containsKey( key ) ) {
			dict = indexByGenDefIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenDefIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenRuleObj readGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		return( readGenRuleByAltIdx( Name,
			ToolSetId,
			ScopeDefId,
			GenDefId,
			false ) );
	}

	public IYCFGenKbGenRuleObj readGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenRuleObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenRuleObj obj = null;
		if( ( ! forceRead ) && indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
		}
		else {
			YCFGenKbGenItemBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			if( buff != null ) {
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbGenRuleObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		return( readGenRuleByGelExecIdx( GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByGelExecIdx.containsKey( key ) ) {
			dict = indexByGelExecIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelExecIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		return( readGenRuleByProbeIdx( ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByProbeIdx.containsKey( key ) ) {
			dict = indexByProbeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProbeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		return( readGenRuleByBodyIdx( BodyTenantId,
			BodyGelCacheId,
			BodyGelId,
			false ) );
	}

	public List<IYCFGenKbGenRuleObj> readGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenRuleByBodyIdx";
		YCFGenKbGenRuleByBodyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
		if( indexByBodyIdx == null ) {
			indexByBodyIdx = new HashMap< YCFGenKbGenRuleByBodyIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( ( ! forceRead ) && indexByBodyIdx.containsKey( key ) ) {
			dict = indexByBodyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj>();
			IYCFGenKbGenRuleObj obj;
			YCFGenKbGenRuleBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().readDerivedByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
			YCFGenKbGenRuleBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenRuleObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenRuleObj realised = (IYCFGenKbGenRuleObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBodyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
		Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGenRuleObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenRuleObj readCachedGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenRuleObj obj = null;
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		obj = readCachedGenRule( pkey );
		return( obj );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGenRuleByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "readCachedGenRuleByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByCartIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByCartIdx.containsKey( key ) ) {
				dict = indexByCartIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "readCachedGenRuleByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByRuleTypeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByRuleTypeIdx.containsKey( key ) ) {
				dict = indexByRuleTypeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "readCachedGenRuleByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByToolSetIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByToolSetIdx.containsKey( key ) ) {
				dict = indexByToolSetIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "readCachedGenRuleByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "readCachedGenRuleByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByGenDefIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByGenDefIdx.containsKey( key ) ) {
				dict = indexByGenDefIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbGenRuleObj readCachedGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenRuleObj obj = null;
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		if( indexByAltIdx != null ) {
			if( indexByAltIdx.containsKey( key ) ) {
				obj = indexByAltIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "readCachedGenRuleByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByGelExecIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByGelExecIdx.containsKey( key ) ) {
				dict = indexByGelExecIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "readCachedGenRuleByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByProbeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByProbeIdx.containsKey( key ) ) {
				dict = indexByProbeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbGenRuleObj> readCachedGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "readCachedGenRuleByBodyIdx";
		YCFGenKbGenRuleByBodyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		ArrayList<IYCFGenKbGenRuleObj> arrayList = new ArrayList<IYCFGenKbGenRuleObj>();
		if( indexByBodyIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict;
			if( indexByBodyIdx.containsKey( key ) ) {
				dict = indexByBodyIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenRuleObj arr[] = new IYCFGenKbGenRuleObj[len];
				Iterator<IYCFGenKbGenRuleObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenRuleObj obj;
			Iterator<IYCFGenKbGenRuleObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenRuleObj> cmp = new Comparator<IYCFGenKbGenRuleObj>() {
			public int compare( IYCFGenKbGenRuleObj lhs, IYCFGenKbGenRuleObj rhs ) {
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
					YCFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					YCFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenRuleObj obj = readCachedGenRuleByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenRuleByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGenRuleByTenantIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "deepDisposeGenRuleByCartIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByCartIdx( TenantId,
				CartridgeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "deepDisposeGenRuleByRuleTypeIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByRuleTypeIdx( RuleTypeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "deepDisposeGenRuleByToolSetIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByToolSetIdx( ToolSetId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "deepDisposeGenRuleByScopeIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByScopeIdx( ScopeDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "deepDisposeGenRuleByGenDefIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByGenDefIdx( GenDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenRuleObj obj = readCachedGenRuleByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "deepDisposeGenRuleByGelExecIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "deepDisposeGenRuleByProbeIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		final String S_ProcName = "deepDisposeGenRuleByBodyIdx";
		IYCFGenKbGenRuleObj obj;
		List<IYCFGenKbGenRuleObj> arrayList = readCachedGenRuleByBodyIdx( BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenRuleObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGenRuleObj updateGenRule( IYCFGenKbGenRuleObj Obj ) {
		IYCFGenKbGenRuleObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().updateGenRule( schema.getAuthorization(),
			Obj.getGenRuleBuff() );
		if( Obj.getClassCode().equals( "a923" ) ) {
			obj = (IYCFGenKbGenRuleObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGenRule( IYCFGenKbGenRuleObj Obj ) {
		IYCFGenKbGenRuleObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRule( schema.getAuthorization(),
			obj.getGenRuleBuff() );
		Obj.forget();
	}

	public void deleteGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenRuleObj obj = readGenRule( pkey );
		if( obj != null ) {
			IYCFGenKbGenRuleEditObj editObj = (IYCFGenKbGenRuleEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGenRuleEditObj)obj.beginEdit();
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
		deepDisposeGenRuleByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
	}

	public void deleteGenRuleByTenantIdx( long TenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGenRuleByTenantIdx( TenantId );
	}

	public void deleteGenRuleByCartIdx( long TenantId,
		long CartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByCartIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByCartIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCartIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
		}
		deepDisposeGenRuleByCartIdx( TenantId,
				CartridgeId );
	}

	public void deleteGenRuleByRuleTypeIdx( short RuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByRuleTypeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByRuleTypeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRuleTypeIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
		}
		deepDisposeGenRuleByRuleTypeIdx( RuleTypeId );
	}

	public void deleteGenRuleByToolSetIdx( short ToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByToolSetIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByToolSetIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByToolSetIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
		}
		deepDisposeGenRuleByToolSetIdx( ToolSetId );
	}

	public void deleteGenRuleByScopeIdx( Short ScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByScopeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByScopeIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
		}
		deepDisposeGenRuleByScopeIdx( ScopeDefId );
	}

	public void deleteGenRuleByGenDefIdx( short GenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByGenDefIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByGenDefIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGenDefIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByGenDefIdx( schema.getAuthorization(),
				GenDefId );
		}
		deepDisposeGenRuleByGenDefIdx( GenDefId );
	}

	public void deleteGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenRuleObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenRuleObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		}
		deepDisposeGenRuleByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
	}

	public void deleteGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByGelExecIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByGelExecIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGelExecIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		}
		deepDisposeGenRuleByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
	}

	public void deleteGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByProbeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByProbeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByProbeIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		}
		deepDisposeGenRuleByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
	}

	public void deleteGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId )
	{
		YCFGenKbGenRuleByBodyIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBodyIdxKey();
		key.setOptionalBodyTenantId( BodyTenantId );
		key.setOptionalBodyGelCacheId( BodyGelCacheId );
		key.setOptionalBodyGelId( BodyGelId );
		if( indexByBodyIdx == null ) {
			indexByBodyIdx = new HashMap< YCFGenKbGenRuleByBodyIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj > >();
		}
		if( indexByBodyIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenRuleObj> dict = indexByBodyIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
			Iterator<IYCFGenKbGenRuleObj> iter = dict.values().iterator();
			IYCFGenKbGenRuleObj obj;
			List<IYCFGenKbGenRuleObj> toForget = new LinkedList<IYCFGenKbGenRuleObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByBodyIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().deleteGenRuleByBodyIdx( schema.getAuthorization(),
				BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
		}
		deepDisposeGenRuleByBodyIdx( BodyTenantId,
				BodyGelCacheId,
				BodyGelId );
	}
}
