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

public class YCFGenKbGenIteratorTableObj
	implements IYCFGenKbGenIteratorTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> members;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> allGenIterator;
	private Map< YCFGenKbGenItemByTenantIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByTenantIdx;
	private Map< YCFGenKbGenItemByCartIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByCartIdx;
	private Map< YCFGenKbGenItemByRuleTypeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByRuleTypeIdx;
	private Map< YCFGenKbGenItemByToolSetIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByToolSetIdx;
	private Map< YCFGenKbGenItemByScopeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByScopeIdx;
	private Map< YCFGenKbGenItemByGenDefIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByGenDefIdx;
	private Map< YCFGenKbGenItemByAltIdxKey,
		IYCFGenKbGenIteratorObj > indexByAltIdx;
	private Map< YCFGenKbGenItemByGelExecIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByGelExecIdx;
	private Map< YCFGenKbGenItemByProbeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > > indexByProbeIdx;
	public static String TABLE_NAME = "GenIterator";
	public static String TABLE_DBNAME = "kbgeniter";

	public YCFGenKbGenIteratorTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
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

	public YCFGenKbGenIteratorTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
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
		List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
		IYCFGenKbGenIteratorObj cur = null;
		Iterator<IYCFGenKbGenIteratorObj> iter = members.values().iterator();
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
	 *	YCFGenKbGenIteratorObj.
	 */
	public IYCFGenKbGenIteratorObj newInstance() {
		IYCFGenKbGenIteratorObj inst = new YCFGenKbGenIteratorObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGenIteratorObj.
	 */
	public IYCFGenKbGenIteratorEditObj newEditInstance( IYCFGenKbGenIteratorObj orig ) {
		IYCFGenKbGenIteratorEditObj edit = new YCFGenKbGenIteratorEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGenIteratorObj realiseGenIterator( IYCFGenKbGenIteratorObj Obj ) {
		IYCFGenKbGenIteratorObj obj = Obj;
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenIteratorObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGenIteratorObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					indexByCartIdx.remove( keyCartIdx );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					indexByRuleTypeIdx.remove( keyRuleTypeIdx );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					indexByToolSetIdx.remove( keyToolSetIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					indexByProbeIdx.remove( keyProbeIdx );
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().realiseGenItem( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
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
			keepObj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().realiseGenItem( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGenIterator != null ) {
				allGenIterator.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGenIteratorObj createGenIterator( IYCFGenKbGenIteratorObj Obj ) {
		IYCFGenKbGenIteratorObj obj = Obj;
		YCFGenKbGenIteratorBuff buff = obj.getGenIteratorBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().createGenIterator(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a921" ) ) {
			obj = (IYCFGenKbGenIteratorObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGenIteratorObj readGenIterator( YCFGenKbGenItemPKey pkey ) {
		return( readGenIterator( pkey, false ) );
	}

	public IYCFGenKbGenIteratorObj readGenIterator( YCFGenKbGenItemPKey pkey, boolean forceRead ) {
		IYCFGenKbGenIteratorObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGenIteratorBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().readDerivedByItemIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredCartridgeId(),
				pkey.getRequiredItemId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGenIteratorObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGenIteratorObj readCachedGenIterator( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenIteratorObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGenIterator( IYCFGenKbGenIteratorObj obj )
	{
		final String S_ProcName = "YCFGenKbGenIteratorTableObj.reallyDeepDisposeGenIterator() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenIteratorObj existing = readCachedGenIterator( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );

		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );


		schema.getGenItemTableObj().reallyDeepDisposeGenItem( obj );
	}
	public void deepDisposeGenIterator( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenIteratorObj obj = readCachedGenIterator( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGenIteratorObj lockGenIterator( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenIteratorObj locked = null;
		YCFGenKbGenIteratorBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGenIteratorObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGenIterator", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGenIteratorObj> readAllGenIterator() {
		return( readAllGenIterator( false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readAllGenIterator( boolean forceRead ) {
		final String S_ProcName = "readAllGenIterator";
		if( ( allGenIterator == null ) || forceRead ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> map = new HashMap<YCFGenKbGenItemPKey,IYCFGenKbGenIteratorObj>();
			allGenIterator = map;
			YCFGenKbGenIteratorBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().readAllDerived( schema.getAuthorization() );
			YCFGenKbGenIteratorBuff buff;
			IYCFGenKbGenIteratorObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
			}
		}
		int len = allGenIterator.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = allGenIterator.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenIteratorObj> readCachedAllGenIterator() {
		final String S_ProcName = "readCachedAllGenIterator";
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( allGenIterator != null ) {
			int len = allGenIterator.size();
			IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
			Iterator<IYCFGenKbGenIteratorObj> valIter = allGenIterator.values().iterator();
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
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public IYCFGenKbGenIteratorObj readGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		return( readGenIteratorByItemIdIdx( TenantId,
			CartridgeId,
			ItemId,
			false ) );
	}

	public IYCFGenKbGenIteratorObj readGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId, boolean forceRead )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenIteratorObj obj = readGenIterator( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByTenantIdx( long TenantId )
	{
		return( readGenIteratorByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByCartIdx( long TenantId,
		long CartridgeId )
	{
		return( readGenIteratorByCartIdx( TenantId,
			CartridgeId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByCartIdx.containsKey( key ) ) {
			dict = indexByCartIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCartIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByRuleTypeIdx( short RuleTypeId )
	{
		return( readGenIteratorByRuleTypeIdx( RuleTypeId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByRuleTypeIdx( short RuleTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByRuleTypeIdx.containsKey( key ) ) {
			dict = indexByRuleTypeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRuleTypeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByToolSetIdx( short ToolSetId )
	{
		return( readGenIteratorByToolSetIdx( ToolSetId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByToolSetIdx( short ToolSetId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByToolSetIdx.containsKey( key ) ) {
			dict = indexByToolSetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToolSetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByScopeIdx( Short ScopeDefId )
	{
		return( readGenIteratorByScopeIdx( ScopeDefId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByScopeIdx( Short ScopeDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByGenDefIdx( short GenDefId )
	{
		return( readGenIteratorByGenDefIdx( GenDefId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByGenDefIdx( short GenDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByGenDefIdx.containsKey( key ) ) {
			dict = indexByGenDefIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenDefIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenIteratorObj readGenIteratorByAltIdx( String Name,
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

	public IYCFGenKbGenIteratorObj readGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenIteratorObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenIteratorObj obj = null;
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
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbGenIteratorObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		return( readGenIteratorByGelExecIdx( GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByGelExecIdx.containsKey( key ) ) {
			dict = indexByGelExecIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelExecIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		return( readGenIteratorByProbeIdx( ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId,
			false ) );
	}

	public List<IYCFGenKbGenIteratorObj> readGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenIteratorByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByProbeIdx.containsKey( key ) ) {
			dict = indexByProbeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenIteratorObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenIteratorObj realised = (IYCFGenKbGenIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProbeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
		Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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
		List<IYCFGenKbGenIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenIteratorObj readCachedGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenIteratorObj obj = null;
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		obj = readCachedGenIterator( pkey );
		return( obj );
	}

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGenIteratorByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "readCachedGenIteratorByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByCartIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByCartIdx.containsKey( key ) ) {
				dict = indexByCartIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "readCachedGenIteratorByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByRuleTypeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByRuleTypeIdx.containsKey( key ) ) {
				dict = indexByRuleTypeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "readCachedGenIteratorByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByToolSetIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByToolSetIdx.containsKey( key ) ) {
				dict = indexByToolSetIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "readCachedGenIteratorByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "readCachedGenIteratorByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByGenDefIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByGenDefIdx.containsKey( key ) ) {
				dict = indexByGenDefIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public IYCFGenKbGenIteratorObj readCachedGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenIteratorObj obj = null;
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
				Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "readCachedGenIteratorByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByGelExecIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByGelExecIdx.containsKey( key ) ) {
				dict = indexByGelExecIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "readCachedGenIteratorByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		ArrayList<IYCFGenKbGenIteratorObj> arrayList = new ArrayList<IYCFGenKbGenIteratorObj>();
		if( indexByProbeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict;
			if( indexByProbeIdx.containsKey( key ) ) {
				dict = indexByProbeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenIteratorObj arr[] = new IYCFGenKbGenIteratorObj[len];
				Iterator<IYCFGenKbGenIteratorObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenIteratorObj obj;
			Iterator<IYCFGenKbGenIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenIteratorObj> cmp = new Comparator<IYCFGenKbGenIteratorObj>() {
			public int compare( IYCFGenKbGenIteratorObj lhs, IYCFGenKbGenIteratorObj rhs ) {
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

	public void deepDisposeGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenIteratorObj obj = readCachedGenIteratorByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGenIteratorByTenantIdx";
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByCartIdx( TenantId,
				CartridgeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByRuleTypeIdx( RuleTypeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByToolSetIdx( ToolSetId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByScopeIdx( ScopeDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByGenDefIdx( GenDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenIteratorObj obj = readCachedGenIteratorByAltIdx( Name,
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
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbGenIteratorObj obj;
		List<IYCFGenKbGenIteratorObj> arrayList = readCachedGenIteratorByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGenIteratorObj updateGenIterator( IYCFGenKbGenIteratorObj Obj ) {
		IYCFGenKbGenIteratorObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().updateGenIterator( schema.getAuthorization(),
			Obj.getGenIteratorBuff() );
		if( Obj.getClassCode().equals( "a921" ) ) {
			obj = (IYCFGenKbGenIteratorObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGenIterator( IYCFGenKbGenIteratorObj Obj ) {
		IYCFGenKbGenIteratorObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIterator( schema.getAuthorization(),
			obj.getGenIteratorBuff() );
		Obj.forget();
	}

	public void deleteGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenIteratorObj obj = readGenIterator( pkey );
		if( obj != null ) {
			IYCFGenKbGenIteratorEditObj editObj = (IYCFGenKbGenIteratorEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGenIteratorEditObj)obj.beginEdit();
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
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGenIteratorByTenantIdx( TenantId );
	}

	public void deleteGenIteratorByCartIdx( long TenantId,
		long CartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByCartIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByCartIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
		}
		deepDisposeGenIteratorByCartIdx( TenantId,
				CartridgeId );
	}

	public void deleteGenIteratorByRuleTypeIdx( short RuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByRuleTypeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByRuleTypeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
		}
		deepDisposeGenIteratorByRuleTypeIdx( RuleTypeId );
	}

	public void deleteGenIteratorByToolSetIdx( short ToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByToolSetIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByToolSetIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
		}
		deepDisposeGenIteratorByToolSetIdx( ToolSetId );
	}

	public void deleteGenIteratorByScopeIdx( Short ScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByScopeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
		}
		deepDisposeGenIteratorByScopeIdx( ScopeDefId );
	}

	public void deleteGenIteratorByGenDefIdx( short GenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByGenDefIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByGenDefIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGenDefIdx( schema.getAuthorization(),
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
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenIteratorObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenIteratorObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByAltIdx( schema.getAuthorization(),
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
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByGelExecIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByGelExecIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByGelExecIdx( schema.getAuthorization(),
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
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj > >();
		}
		if( indexByProbeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenIteratorObj> dict = indexByProbeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			Iterator<IYCFGenKbGenIteratorObj> iter = dict.values().iterator();
			IYCFGenKbGenIteratorObj obj;
			List<IYCFGenKbGenIteratorObj> toForget = new LinkedList<IYCFGenKbGenIteratorObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenIterator().deleteGenIteratorByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		}
		deepDisposeGenIteratorByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
	}
}
