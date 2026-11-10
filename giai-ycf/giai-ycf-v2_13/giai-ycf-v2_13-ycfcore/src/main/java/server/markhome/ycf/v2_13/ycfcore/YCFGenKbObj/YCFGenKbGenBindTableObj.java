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

public class YCFGenKbGenBindTableObj
	implements IYCFGenKbGenBindTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> members;
	private Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> allGenBind;
	private Map< YCFGenKbGenItemByTenantIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByTenantIdx;
	private Map< YCFGenKbGenItemByCartIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByCartIdx;
	private Map< YCFGenKbGenItemByRuleTypeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByRuleTypeIdx;
	private Map< YCFGenKbGenItemByToolSetIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByToolSetIdx;
	private Map< YCFGenKbGenItemByScopeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByScopeIdx;
	private Map< YCFGenKbGenItemByGenDefIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByGenDefIdx;
	private Map< YCFGenKbGenItemByAltIdxKey,
		IYCFGenKbGenBindObj > indexByAltIdx;
	private Map< YCFGenKbGenItemByGelExecIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByGelExecIdx;
	private Map< YCFGenKbGenItemByProbeIdxKey,
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > > indexByProbeIdx;
	public static String TABLE_NAME = "GenBind";
	public static String TABLE_DBNAME = "kbgenbind";

	public YCFGenKbGenBindTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
		allGenBind = null;
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

	public YCFGenKbGenBindTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
		allGenBind = null;
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
		allGenBind = null;
		indexByTenantIdx = null;
		indexByCartIdx = null;
		indexByRuleTypeIdx = null;
		indexByToolSetIdx = null;
		indexByScopeIdx = null;
		indexByGenDefIdx = null;
		indexByAltIdx = null;
		indexByGelExecIdx = null;
		indexByProbeIdx = null;
		List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
		IYCFGenKbGenBindObj cur = null;
		Iterator<IYCFGenKbGenBindObj> iter = members.values().iterator();
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
	 *	YCFGenKbGenBindObj.
	 */
	public IYCFGenKbGenBindObj newInstance() {
		IYCFGenKbGenBindObj inst = new YCFGenKbGenBindObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGenBindObj.
	 */
	public IYCFGenKbGenBindEditObj newEditInstance( IYCFGenKbGenBindObj orig ) {
		IYCFGenKbGenBindEditObj edit = new YCFGenKbGenBindEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGenBindObj realiseGenBind( IYCFGenKbGenBindObj Obj ) {
		IYCFGenKbGenBindObj obj = Obj;
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenBindObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGenBindObj existingObj = members.get( pkey );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					indexByCartIdx.remove( keyCartIdx );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					indexByRuleTypeIdx.remove( keyRuleTypeIdx );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					indexByToolSetIdx.remove( keyToolSetIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					indexByProbeIdx.remove( keyProbeIdx );
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().realiseGenItem( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGenBind != null ) {
				allGenBind.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().realiseGenItem( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGenBind != null ) {
				allGenBind.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGenItemByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCartIdx != null ) {
				YCFGenKbGenItemByCartIdxKey keyCartIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
				keyCartIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyCartIdx.setRequiredCartridgeId( keepObj.getRequiredCartridgeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapCartIdx = indexByCartIdx.get( keyCartIdx );
				if( mapCartIdx != null ) {
					mapCartIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRuleTypeIdx != null ) {
				YCFGenKbGenItemByRuleTypeIdxKey keyRuleTypeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
				keyRuleTypeIdx.setRequiredRuleTypeId( keepObj.getRequiredRuleTypeId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapRuleTypeIdx = indexByRuleTypeIdx.get( keyRuleTypeIdx );
				if( mapRuleTypeIdx != null ) {
					mapRuleTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToolSetIdx != null ) {
				YCFGenKbGenItemByToolSetIdxKey keyToolSetIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
				keyToolSetIdx.setRequiredToolSetId( keepObj.getRequiredToolSetId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapToolSetIdx = indexByToolSetIdx.get( keyToolSetIdx );
				if( mapToolSetIdx != null ) {
					mapToolSetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFGenKbGenItemByScopeIdxKey keyScopeIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
				keyScopeIdx.setOptionalScopeDefId( keepObj.getOptionalScopeDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGenDefIdx != null ) {
				YCFGenKbGenItemByGenDefIdxKey keyGenDefIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
				keyGenDefIdx.setRequiredGenDefId( keepObj.getRequiredGenDefId() );
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapGenDefIdx = indexByGenDefIdx.get( keyGenDefIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapGelExecIdx = indexByGelExecIdx.get( keyGelExecIdx );
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
				Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > mapProbeIdx = indexByProbeIdx.get( keyProbeIdx );
				if( mapProbeIdx != null ) {
					mapProbeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGenBindObj createGenBind( IYCFGenKbGenBindObj Obj ) {
		IYCFGenKbGenBindObj obj = Obj;
		YCFGenKbGenBindBuff buff = obj.getGenBindBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().createGenBind(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a931" ) ) {
			obj = (IYCFGenKbGenBindObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGenBindObj readGenBind( YCFGenKbGenItemPKey pkey ) {
		return( readGenBind( pkey, false ) );
	}

	public IYCFGenKbGenBindObj readGenBind( YCFGenKbGenItemPKey pkey, boolean forceRead ) {
		IYCFGenKbGenBindObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGenBindBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().readDerivedByItemIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredCartridgeId(),
				pkey.getRequiredItemId() );
			if( readBuff != null ) {
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGenBindObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGenBindObj readCachedGenBind( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenBindObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGenBind( IYCFGenKbGenBindObj obj )
	{
		final String S_ProcName = "YCFGenKbGenBindTableObj.reallyDeepDisposeGenBind() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGenItemPKey pkey = obj.getPKey();
		IYCFGenKbGenBindObj existing = readCachedGenBind( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );

		schema.getGelExecutableTableObj().deepDisposeGelExecutableByPIdx( existing.getOptionalGelExecutableTenantId(),
						existing.getOptionalGelExecutableGelCacheId(),
						existing.getOptionalGelExecutableId() );


		schema.getGenItemTableObj().reallyDeepDisposeGenItem( obj );
	}
	public void deepDisposeGenBind( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenBindObj obj = readCachedGenBind( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGenBindObj lockGenBind( YCFGenKbGenItemPKey pkey ) {
		IYCFGenKbGenBindObj locked = null;
		YCFGenKbGenBindBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGenBindObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGenBind", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGenBindObj> readAllGenBind() {
		return( readAllGenBind( false ) );
	}

	public List<IYCFGenKbGenBindObj> readAllGenBind( boolean forceRead ) {
		final String S_ProcName = "readAllGenBind";
		if( ( allGenBind == null ) || forceRead ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> map = new HashMap<YCFGenKbGenItemPKey,IYCFGenKbGenBindObj>();
			allGenBind = map;
			YCFGenKbGenBindBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().readAllDerived( schema.getAuthorization() );
			YCFGenKbGenBindBuff buff;
			IYCFGenKbGenBindObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
			}
		}
		int len = allGenBind.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = allGenBind.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenBindObj> readCachedAllGenBind() {
		final String S_ProcName = "readCachedAllGenBind";
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( allGenBind != null ) {
			int len = allGenBind.size();
			IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
			Iterator<IYCFGenKbGenBindObj> valIter = allGenBind.values().iterator();
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
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public IYCFGenKbGenBindObj readGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		return( readGenBindByItemIdIdx( TenantId,
			CartridgeId,
			ItemId,
			false ) );
	}

	public IYCFGenKbGenBindObj readGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId, boolean forceRead )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenBindObj obj = readGenBind( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByTenantIdx( long TenantId )
	{
		return( readGenBindByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByCartIdx( long TenantId,
		long CartridgeId )
	{
		return( readGenBindByCartIdx( TenantId,
			CartridgeId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByCartIdx.containsKey( key ) ) {
			dict = indexByCartIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCartIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByRuleTypeIdx( short RuleTypeId )
	{
		return( readGenBindByRuleTypeIdx( RuleTypeId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByRuleTypeIdx( short RuleTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByRuleTypeIdx.containsKey( key ) ) {
			dict = indexByRuleTypeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRuleTypeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByToolSetIdx( short ToolSetId )
	{
		return( readGenBindByToolSetIdx( ToolSetId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByToolSetIdx( short ToolSetId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByToolSetIdx.containsKey( key ) ) {
			dict = indexByToolSetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToolSetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByScopeIdx( Short ScopeDefId )
	{
		return( readGenBindByScopeIdx( ScopeDefId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByScopeIdx( Short ScopeDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByGenDefIdx( short GenDefId )
	{
		return( readGenBindByGenDefIdx( GenDefId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByGenDefIdx( short GenDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByGenDefIdx.containsKey( key ) ) {
			dict = indexByGenDefIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGenDefIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenBindObj readGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		return( readGenBindByAltIdx( Name,
			ToolSetId,
			ScopeDefId,
			GenDefId,
			false ) );
	}

	public IYCFGenKbGenBindObj readGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenBindObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenBindObj obj = null;
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
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbGenBindObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		return( readGenBindByGelExecIdx( GelExecutableTenantId,
			GelExecutableGelCacheId,
			GelExecutableId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByGelExecIdx.containsKey( key ) ) {
			dict = indexByGelExecIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelExecIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		return( readGenBindByProbeIdx( ProbeTenantId,
			ProbeCartridgeId,
			ProbeGenItemId,
			false ) );
	}

	public List<IYCFGenKbGenBindObj> readGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead )
	{
		final String S_ProcName = "readGenBindByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( ( ! forceRead ) && indexByProbeIdx.containsKey( key ) ) {
			dict = indexByProbeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj>();
			IYCFGenKbGenItemObj obj;
			YCFGenKbGenItemBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			YCFGenKbGenItemBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFGenKbGenBindObj)schema.getGenItemTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGenBindObj realised = (IYCFGenKbGenBindObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByProbeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
		Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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
		List<IYCFGenKbGenBindObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGenBindObj readCachedGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenBindObj obj = null;
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		obj = readCachedGenBind( pkey );
		return( obj );
	}

	public List<IYCFGenKbGenBindObj> readCachedGenBindByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGenBindByTenantIdx";
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public List<IYCFGenKbGenBindObj> readCachedGenBindByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "readCachedGenBindByCartIdx";
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByCartIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByCartIdx.containsKey( key ) ) {
				dict = indexByCartIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public List<IYCFGenKbGenBindObj> readCachedGenBindByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "readCachedGenBindByRuleTypeIdx";
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByRuleTypeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByRuleTypeIdx.containsKey( key ) ) {
				dict = indexByRuleTypeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public List<IYCFGenKbGenBindObj> readCachedGenBindByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "readCachedGenBindByToolSetIdx";
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByToolSetIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByToolSetIdx.containsKey( key ) ) {
				dict = indexByToolSetIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public List<IYCFGenKbGenBindObj> readCachedGenBindByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "readCachedGenBindByScopeIdx";
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public List<IYCFGenKbGenBindObj> readCachedGenBindByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "readCachedGenBindByGenDefIdx";
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByGenDefIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByGenDefIdx.containsKey( key ) ) {
				dict = indexByGenDefIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public IYCFGenKbGenBindObj readCachedGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenBindObj obj = null;
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
				Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbGenBindObj> readCachedGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "readCachedGenBindByGelExecIdx";
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByGelExecIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByGelExecIdx.containsKey( key ) ) {
				dict = indexByGelExecIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public List<IYCFGenKbGenBindObj> readCachedGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "readCachedGenBindByProbeIdx";
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		ArrayList<IYCFGenKbGenBindObj> arrayList = new ArrayList<IYCFGenKbGenBindObj>();
		if( indexByProbeIdx != null ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict;
			if( indexByProbeIdx.containsKey( key ) ) {
				dict = indexByProbeIdx.get( key );
				int len = dict.size();
				IYCFGenKbGenBindObj arr[] = new IYCFGenKbGenBindObj[len];
				Iterator<IYCFGenKbGenBindObj> valIter = dict.values().iterator();
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
			IYCFGenKbGenBindObj obj;
			Iterator<IYCFGenKbGenBindObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGenBindObj> cmp = new Comparator<IYCFGenKbGenBindObj>() {
			public int compare( IYCFGenKbGenBindObj lhs, IYCFGenKbGenBindObj rhs ) {
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

	public void deepDisposeGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		IYCFGenKbGenBindObj obj = readCachedGenBindByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenBindByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGenBindByTenantIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenBindByCartIdx( long TenantId,
		long CartridgeId )
	{
		final String S_ProcName = "deepDisposeGenBindByCartIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByCartIdx( TenantId,
				CartridgeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenBindByRuleTypeIdx( short RuleTypeId )
	{
		final String S_ProcName = "deepDisposeGenBindByRuleTypeIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByRuleTypeIdx( RuleTypeId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenBindByToolSetIdx( short ToolSetId )
	{
		final String S_ProcName = "deepDisposeGenBindByToolSetIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByToolSetIdx( ToolSetId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenBindByScopeIdx( Short ScopeDefId )
	{
		final String S_ProcName = "deepDisposeGenBindByScopeIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByScopeIdx( ScopeDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenBindByGenDefIdx( short GenDefId )
	{
		final String S_ProcName = "deepDisposeGenBindByGenDefIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByGenDefIdx( GenDefId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		IYCFGenKbGenBindObj obj = readCachedGenBindByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		final String S_ProcName = "deepDisposeGenBindByGelExecIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		final String S_ProcName = "deepDisposeGenBindByProbeIdx";
		IYCFGenKbGenBindObj obj;
		List<IYCFGenKbGenBindObj> arrayList = readCachedGenBindByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGenBindObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbGenBindObj updateGenBind( IYCFGenKbGenBindObj Obj ) {
		IYCFGenKbGenBindObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().updateGenBind( schema.getAuthorization(),
			Obj.getGenBindBuff() );
		if( Obj.getClassCode().equals( "a931" ) ) {
			obj = (IYCFGenKbGenBindObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGenBind( IYCFGenKbGenBindObj Obj ) {
		IYCFGenKbGenBindObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBind( schema.getAuthorization(),
			obj.getGenBindBuff() );
		Obj.forget();
	}

	public void deleteGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId )
	{
		YCFGenKbGenItemPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredCartridgeId( CartridgeId );
		pkey.setRequiredItemId( ItemId );
		IYCFGenKbGenBindObj obj = readGenBind( pkey );
		if( obj != null ) {
			IYCFGenKbGenBindEditObj editObj = (IYCFGenKbGenBindEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGenBindEditObj)obj.beginEdit();
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
		deepDisposeGenBindByItemIdIdx( TenantId,
				CartridgeId,
				ItemId );
	}

	public void deleteGenBindByTenantIdx( long TenantId )
	{
		YCFGenKbGenItemByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGenItemByTenantIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGenBindByTenantIdx( TenantId );
	}

	public void deleteGenBindByCartIdx( long TenantId,
		long CartridgeId )
	{
		YCFGenKbGenItemByCartIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newCartIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCartridgeId( CartridgeId );
		if( indexByCartIdx == null ) {
			indexByCartIdx = new HashMap< YCFGenKbGenItemByCartIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByCartIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByCartIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByCartIdx( schema.getAuthorization(),
				TenantId,
				CartridgeId );
		}
		deepDisposeGenBindByCartIdx( TenantId,
				CartridgeId );
	}

	public void deleteGenBindByRuleTypeIdx( short RuleTypeId )
	{
		YCFGenKbGenItemByRuleTypeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newRuleTypeIdxKey();
		key.setRequiredRuleTypeId( RuleTypeId );
		if( indexByRuleTypeIdx == null ) {
			indexByRuleTypeIdx = new HashMap< YCFGenKbGenItemByRuleTypeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByRuleTypeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByRuleTypeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByRuleTypeIdx( schema.getAuthorization(),
				RuleTypeId );
		}
		deepDisposeGenBindByRuleTypeIdx( RuleTypeId );
	}

	public void deleteGenBindByToolSetIdx( short ToolSetId )
	{
		YCFGenKbGenItemByToolSetIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newToolSetIdxKey();
		key.setRequiredToolSetId( ToolSetId );
		if( indexByToolSetIdx == null ) {
			indexByToolSetIdx = new HashMap< YCFGenKbGenItemByToolSetIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByToolSetIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByToolSetIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByToolSetIdx( schema.getAuthorization(),
				ToolSetId );
		}
		deepDisposeGenBindByToolSetIdx( ToolSetId );
	}

	public void deleteGenBindByScopeIdx( Short ScopeDefId )
	{
		YCFGenKbGenItemByScopeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newScopeIdxKey();
		key.setOptionalScopeDefId( ScopeDefId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFGenKbGenItemByScopeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByScopeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByScopeIdx( schema.getAuthorization(),
				ScopeDefId );
		}
		deepDisposeGenBindByScopeIdx( ScopeDefId );
	}

	public void deleteGenBindByGenDefIdx( short GenDefId )
	{
		YCFGenKbGenItemByGenDefIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGenDefIdxKey();
		key.setRequiredGenDefId( GenDefId );
		if( indexByGenDefIdx == null ) {
			indexByGenDefIdx = new HashMap< YCFGenKbGenItemByGenDefIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByGenDefIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByGenDefIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByGenDefIdx( schema.getAuthorization(),
				GenDefId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByGenDefIdx( schema.getAuthorization(),
				GenDefId );
		}
		deepDisposeGenBindByGenDefIdx( GenDefId );
	}

	public void deleteGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGenItemByAltIdxKey,
				IYCFGenKbGenBindObj >();
		}
		YCFGenKbGenItemByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newAltIdxKey();
		key.setRequiredName( Name );
		key.setRequiredToolSetId( ToolSetId );
		key.setOptionalScopeDefId( ScopeDefId );
		key.setRequiredGenDefId( GenDefId );
		IYCFGenKbGenBindObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByAltIdx( schema.getAuthorization(),
				Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
		}
		deepDisposeGenBindByAltIdx( Name,
				ToolSetId,
				ScopeDefId,
				GenDefId );
	}

	public void deleteGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId )
	{
		YCFGenKbGenItemByGelExecIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newGelExecIdxKey();
		key.setOptionalGelExecutableTenantId( GelExecutableTenantId );
		key.setOptionalGelExecutableGelCacheId( GelExecutableGelCacheId );
		key.setOptionalGelExecutableId( GelExecutableId );
		if( indexByGelExecIdx == null ) {
			indexByGelExecIdx = new HashMap< YCFGenKbGenItemByGelExecIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByGelExecIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByGelExecIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByGelExecIdx( schema.getAuthorization(),
				GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
		}
		deepDisposeGenBindByGelExecIdx( GelExecutableTenantId,
				GelExecutableGelCacheId,
				GelExecutableId );
	}

	public void deleteGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId )
	{
		YCFGenKbGenItemByProbeIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newProbeIdxKey();
		key.setOptionalProbeTenantId( ProbeTenantId );
		key.setOptionalProbeCartridgeId( ProbeCartridgeId );
		key.setOptionalProbeGenItemId( ProbeGenItemId );
		if( indexByProbeIdx == null ) {
			indexByProbeIdx = new HashMap< YCFGenKbGenItemByProbeIdxKey,
				Map< YCFGenKbGenItemPKey, IYCFGenKbGenBindObj > >();
		}
		if( indexByProbeIdx.containsKey( key ) ) {
			Map<YCFGenKbGenItemPKey, IYCFGenKbGenBindObj> dict = indexByProbeIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
			Iterator<IYCFGenKbGenBindObj> iter = dict.values().iterator();
			IYCFGenKbGenBindObj obj;
			List<IYCFGenKbGenBindObj> toForget = new LinkedList<IYCFGenKbGenBindObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGenBind().deleteGenBindByProbeIdx( schema.getAuthorization(),
				ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
		}
		deepDisposeGenBindByProbeIdx( ProbeTenantId,
				ProbeCartridgeId,
				ProbeGenItemId );
	}
}
