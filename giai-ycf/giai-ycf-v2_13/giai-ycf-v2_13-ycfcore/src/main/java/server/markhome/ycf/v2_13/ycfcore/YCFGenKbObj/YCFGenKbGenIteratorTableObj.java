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

public class CFGenKbGenIteratorTableObj
	implements ICFGenKbGenIteratorTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> members;
	private Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> allGenIterator;
	private Map< CFGenKbGenItemByTenantIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByTenantIdx;
	private Map< CFGenKbGenItemByCartIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByCartIdx;
	private Map< CFGenKbGenItemByRuleTypeIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByRuleTypeIdx;
	private Map< CFGenKbGenItemByToolSetIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByToolSetIdx;
	private Map< CFGenKbGenItemByScopeIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByScopeIdx;
	private Map< CFGenKbGenItemByGenDefIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByGenDefIdx;
	private Map< CFGenKbGenItemByAltIdxKey,
		ICFGenKbGenIteratorObj > indexByAltIdx;
	private Map< CFGenKbGenItemByGelExecIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByGelExecIdx;
	private Map< CFGenKbGenItemByProbeIdxKey,
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > > indexByProbeIdx;
	public static String TABLE_NAME = "GenIterator";
	public static String TABLE_DBNAME = "kbgeniter";

	public CFGenKbGenIteratorTableObj() {
		schema = null;
		members = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
		allGenIterator = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
	}

	public CFGenKbGenIteratorTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
		allGenIterator = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
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
		allGenIterator = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
		List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
		ICFGenKbGenIteratorObj cur = null;
		Iterator<ICFGenKbGenIteratorObj> iter = members.values().iterator();
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
	 *	CFGenKbGenIteratorObj.
	 */
	public ICFGenKbGenIteratorObj newInstance() {
		ICFGenKbGenIteratorObj inst = new CFGenKbGenIteratorObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbGenIteratorObj.
	 */
	public ICFGenKbGenIteratorEditObj newEditInstance( ICFGenKbGenIteratorObj orig ) {
		ICFGenKbGenIteratorEditObj edit = new CFGenKbGenIteratorEditObj( orig );
		return( edit );
	}

	public ICFGenKbGenIteratorObj realiseGenIterator( ICFGenKbGenIteratorObj Obj ) {
		ICFGenKbGenIteratorObj obj = Obj;
		CFGenKbGenItemPKey pkey = obj.getPKey();
		ICFGenKbGenIteratorObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbGenIteratorObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCartIdx != null ) {
				CFGenKbGenItemByCartIdxKey keyCartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					indexByCartIdx.remove( keyCartIdx );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				CFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					indexByRuleTypeIdx.remove( keyRuleTypeIdx );
				}
			}

			if( indexByToolSetIdx != null ) {
				CFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					indexByToolSetIdx.remove( keyToolSetIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				CFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByGenDefIdx != null ) {
				CFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
				if( mapGenDefIdx != null ) {
					indexByGenDefIdx.remove( keyGenDefIdx );
				}
			}

			if( indexByAltIdx != null ) {
				CFGenKbGenItemByAltIdxKey keyAltIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
				keyAltIdx.setRequiredName( keepObj.getRequiredName() );
				keyAltIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				keyAltIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				keyAltIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				indexByAltIdx.remove( keyAltIdx );
			}

			if( indexByGelExecIdx != null ) {
				CFGenKbGenItemByGelExecIdxKey keyGelExecIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
				keyGelExecIdx.setOptionalGelExecutableTenantId( keepObj.getOptionalGelExecutableTenantId() );
				keyGelExecIdx.setOptionalGelExecutableGelCacheId( keepObj.getOptionalGelExecutableGelCacheId() );
				keyGelExecIdx.setOptionalGelExecutableId( keepObj.getOptionalGelExecutableId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
				if( mapGelExecIdx != null ) {
					indexByGelExecIdx.remove( keyGelExecIdx );
				}
			}

			if( indexByProbeIdx != null ) {
				CFGenKbGenItemByProbeIdxKey keyProbeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
				keyProbeIdx.setOptionalProbeTenantId( keepObj.getOptionalProbeTenantId() );
				keyProbeIdx.setOptionalProbeCartridgeId( keepObj.getOptionalProbeCartridgeId() );
				keyProbeIdx.setOptionalProbeGenItemId( keepObj.getOptionalProbeGenItemId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					indexByProbeIdx.remove( keyProbeIdx );
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().realiseGenItem( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				CFGenKbGenItemByCartIdxKey keyCartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				CFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				CFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				CFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
				if( mapGenDefIdx != null ) {
					mapGenDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				CFGenKbGenItemByAltIdxKey keyAltIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
				keyAltIdx.setRequiredName( keepObj.getRequiredName() );
				keyAltIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				keyAltIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				keyAltIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

			if( indexByGelExecIdx != null ) {
				CFGenKbGenItemByGelExecIdxKey keyGelExecIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
				keyGelExecIdx.setOptionalGelExecutableTenantId( keepObj.getOptionalGelExecutableTenantId() );
				keyGelExecIdx.setOptionalGelExecutableGelCacheId( keepObj.getOptionalGelExecutableGelCacheId() );
				keyGelExecIdx.setOptionalGelExecutableId( keepObj.getOptionalGelExecutableId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
				if( mapGelExecIdx != null ) {
					mapGelExecIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProbeIdx != null ) {
				CFGenKbGenItemByProbeIdxKey keyProbeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
				keyProbeIdx.setOptionalProbeTenantId( keepObj.getOptionalProbeTenantId() );
				keyProbeIdx.setOptionalProbeCartridgeId( keepObj.getOptionalProbeCartridgeId() );
				keyProbeIdx.setOptionalProbeGenItemId( keepObj.getOptionalProbeGenItemId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGenIterator != null ) {
				allGenIterator.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().realiseGenItem( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGenIterator != null ) {
				allGenIterator.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				CFGenKbGenItemByCartIdxKey keyCartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				CFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				CFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				CFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
				if( mapGenDefIdx != null ) {
					mapGenDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				CFGenKbGenItemByAltIdxKey keyAltIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
				keyAltIdx.setRequiredName( keepObj.getRequiredName() );
				keyAltIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				keyAltIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				keyAltIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

			if( indexByGelExecIdx != null ) {
				CFGenKbGenItemByGelExecIdxKey keyGelExecIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
				keyGelExecIdx.setOptionalGelExecutableTenantId( keepObj.getOptionalGelExecutableTenantId() );
				keyGelExecIdx.setOptionalGelExecutableGelCacheId( keepObj.getOptionalGelExecutableGelCacheId() );
				keyGelExecIdx.setOptionalGelExecutableId( keepObj.getOptionalGelExecutableId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
				if( mapGelExecIdx != null ) {
					mapGelExecIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByProbeIdx != null ) {
				CFGenKbGenItemByProbeIdxKey keyProbeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
				keyProbeIdx.setOptionalProbeTenantId( keepObj.getOptionalProbeTenantId() );
				keyProbeIdx.setOptionalProbeCartridgeId( keepObj.getOptionalProbeCartridgeId() );
				keyProbeIdx.setOptionalProbeGenItemId( keepObj.getOptionalProbeGenItemId() );
				Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbGenIteratorObj createGenIterator( ICFGenKbGenIteratorObj Obj ) {
		ICFGenKbGenIteratorObj obj = Obj;
		CFGenKbGenIteratorBuff buff = obj.getGenIteratorBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().createGenIterator(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a921" ) ) {
			obj = (ICFGenKbGenIteratorObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbGenIteratorObj readGenIterator( CFGenKbGenItemPKey pkey ) {
		return( readGenIterator( pkey, false ) );
	}

	public ICFGenKbGenIteratorObj readGenIterator( CFGenKbGenItemPKey pkey, boolean forceRead ) {
		ICFGenKbGenIteratorObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbGenIteratorBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().readDerivedByItemIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredCartridgeId(),
				pkey.getRequiredItemId() );
			if( readBuff != null ) {
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbGenIteratorObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbGenIteratorObj readCachedGenIterator( CFGenKbGenItemPKey pkey ) {
		ICFGenKbGenIteratorObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGenIterator( ICFGenKbGenIteratorObj obj )
	{
		final String S_ProcName = "CFGenKbGenIteratorTableObj.reallyDeepDisposeGenIterator() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbGenItemPKey pkey = obj.getPKey();
		ICFGenKbGenIteratorObj existing = readCachedGenIterator( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );

		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );


		schema.getGenItemTableObj().reallyDeepDisposeGenItem( obj );
	}
	public void deepDisposeGenIterator( CFGenKbGenItemPKey pkey ) {
		ICFGenKbGenIteratorObj obj = readCachedGenIterator( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbGenIteratorObj lockGenIterator( CFGenKbGenItemPKey pkey ) {
		ICFGenKbGenIteratorObj locked = null;
		CFGenKbGenIteratorBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbGenIteratorObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockGenIterator", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbGenIteratorObj> readAllGenIterator() {
		return( readAllGenIterator( false ) );
	}

	public List<ICFGenKbGenIteratorObj> readAllGenIterator( boolean forceRead ) {
		final String S_ProcName = "readAllGenIterator";
		if( ( allGenIterator == null ) || forceRead ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> map = new HashMap<CFGenKbGenItemPKey,ICFGenKbGenIteratorObj>();
			allGenIterator = map;
			CFGenKbGenIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().readAllDerived( schema.getAuthorization() );
			CFGenKbGenIteratorBuff buff;
			ICFGenKbGenIteratorObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
			}
		}
		int len = allGenIterator.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = allGenIterator.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenIteratorObj> readCachedAllGenIterator() {
		final String S_ProcName = "readCachedAllGenIterator";
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( allGenIterator != null ) {
			int len = allGenIterator.size();
			ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
			Iterator<ICFGenKbGenIteratorObj> valIter = allGenIterator.values().iterator();
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
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbGenIteratorObj readGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		return( readGenIteratorByItemIdIdx( TenantId,
			CartridgeId,
			ItemId,
			false ) );
	}

	public ICFGenKbGenIteratorObj readGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId, boolean forceRead )
	{
		CFGenKbGenItemPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		ICFGenKbGenIteratorObj obj = readGenIterator( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByTenantIdx( long TenantId )
	{
		return( readGenIteratorByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByTenantIdx";
		CFGenKbGenItemByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGenItemByTenantIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByCartIdx( long TenantId,
		long CartridgeId )
	{
		return( readGenIteratorByCartIdx( TenantId,
			CartridgeId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByCartIdx";
		CFGenKbGenItemByCartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< CFGenKbGenItemByCartIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByCartIdx.containsKey( key ) ) {
			dict = indexByCartIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCartIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByRuleTypeIdx( short RuleTypeId )
	{
		return( readGenIteratorByRuleTypeIdx( RuleTypeId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByRuleTypeIdx( short RuleTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByRuleTypeIdx";
		CFGenKbGenItemByRuleTypeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< CFGenKbGenItemByRuleTypeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByRuleTypeIdx.containsKey( key ) ) {
			dict = indexByRuleTypeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRuleTypeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByToolSetIdx( short ToolSetId )
	{
		return( readGenIteratorByToolSetIdx( ToolSetId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByToolSetIdx( short ToolSetId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByToolSetIdx";
		CFGenKbGenItemByToolSetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< CFGenKbGenItemByToolSetIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByToolSetIdx.containsKey( key ) ) {
			dict = indexByToolSetIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToolSetIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByScopeIdx( Short ScopeDefId )
	{
		return( readGenIteratorByScopeIdx( ScopeDefId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByScopeIdx( Short ScopeDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByScopeIdx";
		CFGenKbGenItemByScopeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFGenKbGenItemByScopeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByGenDefIdx( short GenDefId )
	{
		return( readGenIteratorByGenDefIdx( GenDefId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByGenDefIdx( short GenDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByGenDefIdx";
		CFGenKbGenItemByGenDefIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< CFGenKbGenItemByGenDefIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByGenDefIdx.containsKey( key ) ) {
			dict = indexByGenDefIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenDefIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGenIteratorObj readGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		return( readGenIteratorByAltIdx( Name,
			ToolSetId,
			ScopeDefId,
			GenDefId,
			false ) );
	}

	public ICFGenKbGenIteratorObj readGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< CFGenKbGenItemByAltIdxKey,
				ICFGenKbGenIteratorObj >();
		}
		CFGenKbGenItemByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		ICFGenKbGenIteratorObj obj = null;
		if( ( ! forceRead ) && indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
		}
		else {
			CFGenKbGenItemBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			if( buff != null ) {
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbGenIteratorObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		return( readGenIteratorByGelExecIdx( GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByGelExecIdx";
		CFGenKbGenItemByGelExecIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< CFGenKbGenItemByGelExecIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByGelExecIdx.containsKey( key ) ) {
			dict = indexByGelExecIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelExecIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		return( readGenIteratorByProbeIdx( ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId,
			false ) );
	}

	public List<ICFGenKbGenIteratorObj> readGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByProbeIdx";
		CFGenKbGenItemByProbeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< CFGenKbGenItemByProbeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByProbeIdx.containsKey( key ) ) {
			dict = indexByProbeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj>();
			ICFGenKbGenItemObj obj;
			CFGenKbGenItemBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			CFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGenIteratorObj realised = (ICFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProbeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
		Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGenIteratorObj readCachedGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		ICFGenKbGenIteratorObj obj = null;
		CFGenKbGenItemPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		obj = readCachedGenIterator( pkey );
		return( obj );
	}

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGenIteratorByTenantIdx";
		CFGenKbGenItemByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "readCachedGenIteratorByCartIdx";
		CFGenKbGenItemByCartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByCartIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByCartIdx.containsKey( key ) ) {
				dict = indexByCartIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "readCachedGenIteratorByRuleTypeIdx";
		CFGenKbGenItemByRuleTypeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByRuleTypeIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByRuleTypeIdx.containsKey( key ) ) {
				dict = indexByRuleTypeIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "readCachedGenIteratorByToolSetIdx";
		CFGenKbGenItemByToolSetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByToolSetIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByToolSetIdx.containsKey( key ) ) {
				dict = indexByToolSetIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "readCachedGenIteratorByScopeIdx";
		CFGenKbGenItemByScopeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByScopeIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "readCachedGenIteratorByGenDefIdx";
		CFGenKbGenItemByGenDefIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByGenDefIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByGenDefIdx.containsKey( key ) ) {
				dict = indexByGenDefIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbGenIteratorObj readCachedGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		ICFGenKbGenIteratorObj obj = null;
		CFGenKbGenItemByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		if( indexByAltIdx != null ) {
			if( indexByAltIdx.containsKey( key ) ) {
				obj = indexByAltIdx.get( key );
			}
			else {
				Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
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

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "readCachedGenIteratorByGelExecIdx";
		CFGenKbGenItemByGelExecIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByGelExecIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByGelExecIdx.containsKey( key ) ) {
				dict = indexByGelExecIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGenIteratorObj> readCachedGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "readCachedGenIteratorByProbeIdx";
		CFGenKbGenItemByProbeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		ArrayList<ICFGenKbGenIteratorObj> arrayList = new ArrayList<ICFGenKbGenIteratorObj>();
		if( indexByProbeIdx != null ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict;
			if( indexByProbeIdx.containsKey( key ) ) {
				dict = indexByProbeIdx.get( key );
				int len = dict.size();
				ICFGenKbGenIteratorObj arr[] = new ICFGenKbGenIteratorObj[len];
				Iterator<ICFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGenIteratorObj obj;
			Iterator<ICFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGenIteratorObj> cmp = new Comparator<ICFGenKbGenIteratorObj>() {
			public int compare( ICFGenKbGenIteratorObj lhs, ICFGenKbGenIteratorObj rhs ) {
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
					CFGenKbGenItemPKey lhsPKey = lhs.getPKey();
					CFGenKbGenItemPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		ICFGenKbGenIteratorObj obj = readCachedGenIteratorByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByTenantIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenIteratorByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByCartIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByCartIdx( TenantId,
				CartridgeId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenIteratorByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByRuleTypeIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByRuleTypeIdx( RuleTypeId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenIteratorByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByToolSetIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByToolSetIdx( ToolSetId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenIteratorByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByScopeIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByScopeIdx( ScopeDefId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenIteratorByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByGenDefIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByGenDefIdx( GenDefId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		ICFGenKbGenIteratorObj obj = readCachedGenIteratorByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByGelExecIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByProbeIdx";
		ICFGenKbGenIteratorObj obj;
		List<ICFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbGenIteratorObj updateGenIterator( ICFGenKbGenIteratorObj Obj ) {
		ICFGenKbGenIteratorObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().updateGenIterator( schema.getAuthorization(),
			Obj.getGenIteratorBuff() );
		if( Obj.getClassCode().equals( "a921" ) ) {
			obj = (ICFGenKbGenIteratorObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGenIterator( ICFGenKbGenIteratorObj Obj ) {
		ICFGenKbGenIteratorObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIterator( schema.getAuthorization(),
			obj.getGenIteratorBuff() );
		Obj.forget();
	}

	public void deleteGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		CFGenKbGenItemPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		ICFGenKbGenIteratorObj obj = readGenIterator( pkey );
		if( obj != null ) {
			ICFGenKbGenIteratorEditObj editObj = (ICFGenKbGenIteratorEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbGenIteratorEditObj)obj.beginEdit();
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
		deepDisposeGenIteratorByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
	}

	public void deleteGenIteratorByTenantIdx( long TenantId )
	{
		CFGenKbGenItemByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGenItemByTenantIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGenIteratorByTenantIdx( TenantId );
	}

	public void deleteGenIteratorByCartIdx( long TenantId,
		long CartridgeId )
	{
		CFGenKbGenItemByCartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< CFGenKbGenItemByCartIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByCartIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByCartIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
		}
		deepDisposeGenIteratorByCartIdx( TenantId,
				CartridgeId );
	}

	public void deleteGenIteratorByRuleTypeIdx( short RuleTypeId )
	{
		CFGenKbGenItemByRuleTypeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< CFGenKbGenItemByRuleTypeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByRuleTypeIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByRuleTypeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
		}
		deepDisposeGenIteratorByRuleTypeIdx( RuleTypeId );
	}

	public void deleteGenIteratorByToolSetIdx( short ToolSetId )
	{
		CFGenKbGenItemByToolSetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< CFGenKbGenItemByToolSetIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByToolSetIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByToolSetIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
		}
		deepDisposeGenIteratorByToolSetIdx( ToolSetId );
	}

	public void deleteGenIteratorByScopeIdx( Short ScopeDefId )
	{
		CFGenKbGenItemByScopeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFGenKbGenItemByScopeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByScopeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
		}
		deepDisposeGenIteratorByScopeIdx( ScopeDefId );
	}

	public void deleteGenIteratorByGenDefIdx( short GenDefId )
	{
		CFGenKbGenItemByGenDefIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< CFGenKbGenItemByGenDefIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByGenDefIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByGenDefIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGenDefIdx( schema.getAuthorization(),
				GenDefId );
		}
		deepDisposeGenIteratorByGenDefIdx( GenDefId );
	}

	public void deleteGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< CFGenKbGenItemByAltIdxKey,
				ICFGenKbGenIteratorObj >();
		}
		CFGenKbGenItemByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		ICFGenKbGenIteratorObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		}
		deepDisposeGenIteratorByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
	}

	public void deleteGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		CFGenKbGenItemByGelExecIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< CFGenKbGenItemByGelExecIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByGelExecIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByGelExecIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		}
		deepDisposeGenIteratorByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
	}

	public void deleteGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		CFGenKbGenItemByProbeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< CFGenKbGenItemByProbeIdxKey,
				Map< CFGenKbGenItemPKey, ICFGenKbGenIteratorObj > >();
		}
		if( indexByProbeIdx.containsKey( key ) ) {
			Map<CFGenKbGenItemPKey, ICFGenKbGenIteratorObj> dict = indexByProbeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			Iterator<ICFGenKbGenIteratorObj> iter = dict.values().iterator();
			ICFGenKbGenIteratorObj obj;
			List<ICFGenKbGenIteratorObj> toForget = new LinkedList<ICFGenKbGenIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		}
		deepDisposeGenIteratorByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
	}
}